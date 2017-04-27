package service;

import dal.TargetDao;
import dao.Target;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by user on 27.04.2017.
 */
@Service
public class TargetService {

    @Autowired
    private TargetDao targetDao;

    public List<Target> findAll() {
        List<Target> list = targetDao.findAll();
        return list;
    }
//
//    public Target findById(long id) {
//        Target target = targetDao.fandByID();
//        return target;
//
//    }


}