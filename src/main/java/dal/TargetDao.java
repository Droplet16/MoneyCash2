package dal;

import dao.Target;

import java.util.List;

/**
 * Created by user on 18.04.2017.
 */
public interface TargetDao {
    void save(Target entity);

    List<Target> findAll();

    void update(Target entity);

//    Target fandByID(Long targetId);

//    Target findByTarget(String target);
}
