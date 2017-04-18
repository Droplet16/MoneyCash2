package dal.impl;

import dal.TargetDao;
import dao.Target;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

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
    }
