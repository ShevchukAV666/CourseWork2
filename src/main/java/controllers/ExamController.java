package controllers;

import Course.Work2.CourseWork2.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import interfaces.ExaminerService;

import java.util.Set;

@RestController
@RequestMapping
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {

        this.examinerService = examinerService;
    }

    @GetMapping(path = "exam/questions/{amount}")
    public Set<Question> getQuestions(@PathVariable int amount){

        return examinerService.getQuestions(amount);
    }
}

