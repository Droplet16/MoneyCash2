package dal.impl;

import dal.TargetDao;
import dal.mapper.TargetRowMapper;
import dao.Target;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by user on 18.04.2017.
 */
@Repository
public class TargetDaoImpl implements TargetDao {

        @Autowired
        private SessionFactory sessionFactory;

        @Autowired
        private DataSource dataSource;


        public void save(Target entity) {
            Session session = this.sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            session.persist(entity);

            tx.commit();
            session.close();
        }

    public List<Target> findAll() {
        Session session = this.sessionFactory.openSession();
        List<Target> targetList = session.createQuery("from Target").list();
        session.close();
        return targetList;
    }

    public void update(Target entity) {
            Session session = this.sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            session.update(entity);

            tx.commit();
            session.close();
        }

//    public Target findById(Long targetId) {
//        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
//
//        String sql = ""
//                + " SELECT * FROM JAVA_MONEY.TARGET "
//                + " WHERE ID = ? ";
//
//        Target target = (Target) jdbc.queryForObject(
//                sql,
//                new Object[] { targetId },
//                new TargetRowMapper(Target.class)
//        );
//
//        return target;
//    }

//    public Target findByTarget(String target) {
//        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
//
//        String sql = ""
//                + " SELECT * FROM JAVA_MONEY.TARGET "
//                + " WHERE TARGET = ? ";
//
//        Target target = (Target) jdbc.queryForObject(
//                sql,
//                new Object[] { target },
//                new TargetRowMapper(Target.class)
//        );
//
//        return target;
//    }
    }
