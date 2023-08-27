package services;

import Course.Work2.CourseWork2.Question;
import exeption.LimitQuestionExeption;
import interfaces.ExaminerService;
import interfaces.QuestionService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Set<Question> getQuestions(int amount) {
        Set<Question> questions = new HashSet<>();
        if (questionService.getAll().size() < amount){
            throw new LimitQuestionExeption("Превышен лимит вопросов, задайте меньшее количество вопросов");
        }
        while (questions.size() != amount) {
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }
}
