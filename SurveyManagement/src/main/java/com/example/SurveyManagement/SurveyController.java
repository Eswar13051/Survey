package com.example.SurveyManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class SurveyController {


    @Autowired
    private SurveyService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<SurveyDetails> listSurveyDetails = service.listAll();
        model.addAttribute("listSurveyDetails", listSurveyDetails );

        return "index";
    }

    @RequestMapping("/new")
    public String showNewProductPage(Model model) {
        SurveyDetails surveyDetails = new SurveyDetails();
        model.addAttribute("surveyDetails", surveyDetails );

        return "new_surveyDetails";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") SurveyDetails surveyDetails) {
        service.save(surveyDetails);

        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_product");
        SurveyDetails surveyDetails = service.get(id);
        mav.addObject("surveyDetails", surveyDetails);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteSurveyDetails(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}

