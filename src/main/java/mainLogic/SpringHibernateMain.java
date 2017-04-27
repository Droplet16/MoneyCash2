package mainLogic;

import dal.AccumulationDao;
import dal.TargetDao;
import dao.Accumulation;
import dao.Target;
import org.joda.time.LocalDate;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TargetService;

import java.util.List;

/**
 * Created by user on 18.04.2017.
 */
public class SpringHibernateMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");

        TargetDao targetDao = context.getBean(TargetDao.class);
        AccumulationDao accumulationDao = context.getBean(AccumulationDao.class);

        TargetService targetService = context.getBean(TargetService.class);


//        putNewRecordsToDataBase(targetDao, accumulationDao);


        List<Target> allTargets = targetService.findAll();

        for (Target u : allTargets) {
            System.out.println("target = " + u);
        }
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
        accumulationDao.save(newAccumulation1);

        Accumulation newAccumulation2 = new Accumulation();
        newAccumulation2.setAmount(1500l);
        newAccumulation2.setTarget(newTarget1);
        newAccumulation2.setAcDate(LocalDate.parse("2017-03-20"));
        accumulationDao.save(newAccumulation2);

        Accumulation newAccumulation3 = new Accumulation();
        newAccumulation3.setAmount(10000l);
        newAccumulation3.setTarget(newTarget1);
        newAccumulation3.setAcDate(LocalDate.parse("2017-04-01"));
        accumulationDao.save(newAccumulation3);

        //        ---------------

        Target newTarget2 = new Target();
        newTarget2.setTarget("Поездка в Венецию");
        newTarget2.setTargetAmount(200000l);
        newTarget2.setTargetDate(LocalDate.parse("2019-01-01"));
        targetDao.save(newTarget2);

        Accumulation newAccumulation4 = new Accumulation();
        newAccumulation4.setAmount(1000l);
        newAccumulation4.setTarget(newTarget2);
        newAccumulation4.setAcDate(LocalDate.parse("2016-12-19"));
        accumulationDao.save(newAccumulation4);

        Accumulation newAccumulation5 = new Accumulation();
        newAccumulation5.setAmount(500l);
        newAccumulation5.setTarget(newTarget2);
        newAccumulation5.setAcDate(LocalDate.parse("2017-01-20"));
        accumulationDao.save(newAccumulation5);

        Accumulation newAccumulation6 = new Accumulation();
        newAccumulation6.setAmount(5000l);
        newAccumulation6.setTarget(newTarget2);
        newAccumulation6.setAcDate(LocalDate.parse("2017-02-01"));
        accumulationDao.save(newAccumulation6);

        //        ---------------

        Target newTarget3 = new Target();
        newTarget3.setTarget("Машина");
        newTarget3.setTargetAmount(3000000l);
        newTarget3.setTargetDate(LocalDate.parse("2025-01-01"));
        targetDao.save(newTarget3);

        Accumulation newAccumulation7 = new Accumulation();
        newAccumulation7.setAmount(10000l);
        newAccumulation7.setTarget(newTarget3);
        newAccumulation7.setAcDate(LocalDate.parse("2016-09-01"));
        accumulationDao.save(newAccumulation7);

        Accumulation newAccumulation8 = new Accumulation();
        newAccumulation8.setAmount(5000l);
        newAccumulation8.setTarget(newTarget3);
        newAccumulation8.setAcDate(LocalDate.parse("2017-01-25"));
        accumulationDao.save(newAccumulation8);

        //        ---------------

        Target newTarget4 = new Target();
        newTarget4.setTarget("Электронная книга");
        newTarget4.setTargetAmount(10000l);
        newTarget4.setTargetDate(LocalDate.parse("2017-12-01"));
        targetDao.save(newTarget4);

        Accumulation newAccumulation9 = new Accumulation();
        newAccumulation9.setAmount(500l);
        newAccumulation9.setTarget(newTarget4);
        newAccumulation9.setAcDate(LocalDate.parse("2017-04-01"));
        accumulationDao.save(newAccumulation9);

        Accumulation newAccumulation10 = new Accumulation();
        newAccumulation10.setAmount(500l);
        newAccumulation10.setTarget(newTarget4);
        newAccumulation10.setAcDate(LocalDate.parse("2017-04-15"));
        accumulationDao.save(newAccumulation10);


    }
}
