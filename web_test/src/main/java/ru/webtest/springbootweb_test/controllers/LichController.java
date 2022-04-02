package ru.webtest.springbootweb_test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.webtest.springbootweb_test.entitys.Test;
import ru.webtest.springbootweb_test.repositories.TestsRepository;

import java.util.List;

@Controller
public class LichController {
    private TestsRepository testsRepository;

    @GetMapping("/lich_page")
    public String getLichPage(){
        return "lich_page";
    }

    @GetMapping("/tests")
    public String getTests(Model model){
        List<Test> tests =testsRepository.findAll();
        model.addAttribute ("tests",tests);
        return "tests_page";

    }
    @GetMapping("/lich_page_pass")
    public String passedTestsPage(){
        return "tests_pass";
    }

}
