package mainLogic;

import dal.AccumulationDao;
import dal.TargetDao;
import dao.Target;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 18.04.2017.
 */
public class SpringHibernateMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");

        TargetDao userDao = context.getBean(TargetDao.class);
        AccumulationDao postDao = context.getBean(AccumulationDao.class);

        context.close();
    }
}
