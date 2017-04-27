package dal;

import dao.Accumulation;

/**
 * Created by user on 18.04.2017.
 */
public interface AccumulationDao {
    void save(Accumulation entity);

    void update(Accumulation entity);
}
