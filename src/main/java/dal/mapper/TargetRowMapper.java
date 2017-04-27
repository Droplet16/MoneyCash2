package dal.mapper;

import dao.Target;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by user on 27.04.2017.
 */
public class TargetRowMapper extends BeanPropertyRowMapper {

    public TargetRowMapper(Class mappedClass) {
        super(mappedClass);
    }

    public Object mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Target target = new Target();

        Long dbValueId = resultSet.getLong("ID");
        target.setId(dbValueId);

        String dbValueTarget = resultSet.getString("TARGET");
        target.setTarget(dbValueTarget);

        Long dbValueTargetAmount = resultSet.getLong("TARGET_AMOUNT");
        target.setTargetAmount(dbValueTargetAmount);

        String stringTargetDate = resultSet.getString("TARGET_DATE");
        DateTimeFormatter formatter = DateTimeFormat.forPattern("YYYY-MM-DD");
        LocalDate dbValueLocalDate = formatter.parseLocalDate(stringTargetDate);
        target.setTargetDate(dbValueLocalDate);

        return target;
    }
}
