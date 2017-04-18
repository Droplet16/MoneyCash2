package mainLogic;

import dal.AccumulationDao;
import dal.TargetDao;
import dao.Accumulation;
import dao.Target;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 18.04.2017.
 */
public class SpringHibernateMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");

        TargetDao targetDao = context.getBean(TargetDao.class);
        AccumulationDao accumulationDao = context.getBean(AccumulationDao.class);

        context.close();
    }

    private static void putNewRecordsToDataBase(TargetDao targetDao, AccumulationDao accumulationDao) {
        Target newTarget1 = new Target();
        newTarget1.setTarget("iPhone");
        newTarget1.setTargetAmount(100000l);
        newTarget1.setTargetDate(LocalDate.parse("2018-12-01"));
        targetDao.save(newTarget1);

        Accumulation newAccumulation1 = new Accumulation();
        newAccumulation1.setAmount(1000l);
        newAccumulation1.setTarget(newTarget1);
        newAccumulation1.setAcDate(LocalDate.parse("2017-04-19"));
        AccumulationDao.save(newAccumulation1);

    }
}
