package controller;

import dao.Target;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.TargetService;

import java.util.List;

/**
 * Created by user on 27.04.2017.
 */
@Controller
public class TargetController {

    @Autowired
    private TargetService targetService;

    @RequestMapping("/")
    public ModelAndView index() {
        String message = "Message from public class TargetController";
        return new ModelAndView("index", "message", message);
    }


    // show target list
    @RequestMapping(value = "/targetList", method = RequestMethod.GET)
    public String showAllTargets(ModelMap model) {

        List<Target> allTargets = targetService.findAll();
        model.addAttribute("targets", allTargets);

//        for (Target u : allTargets) {
//            System.out.println("target = " + u);
//        }
        return "targets/list";

        }

//    // show target
//    @RequestMapping(value = "/targets/{id}", method = RequestMethod.GET)
//    public String showUser(@PathVariable("id") long id, ModelMap model) {
//
//        Target target = targetService.findById(id);
//        model.addAttribute("target", target);
//
//        return "targets/show";
//
//    }
}
