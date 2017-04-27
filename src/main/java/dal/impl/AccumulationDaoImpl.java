package dal.impl;

import dal.AccumulationDao;
import dao.Accumulation;
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
public class AccumulationDaoImpl implements AccumulationDao {

        @Autowired
        private SessionFactory sessionFactory;

        @Autowired
        private DataSource dataSource;

        public void save(Accumulation entity) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(entity);
        tx.commit();
        session.close();
        }

        public void update (Accumulation entity) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(entity);
        tx.commit();
        session.close();
    }
    }
