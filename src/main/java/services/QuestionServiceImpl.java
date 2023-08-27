package services;

import Course.Work2.CourseWork2.Question;
import interfaces.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuestionServiceImpl implements QuestionService {
    Set<Question> questionSet = new HashSet<>();
    @Override
    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);
        questionSet.add(question1);
        return question1;
    }

    @Override
    public Question remove(String question, String answer) {
        Question question1 = new Question(question, answer);
        questionSet.remove(question1);
        return question1;
    }

    @Override
    public Set<Question> getAll() {
        return questionSet;
    }

    @Override
    public Question getRandomQuestion(){
        Random random = new Random();
        List<Question> quests = new ArrayList<>(questionSet);
        return quests.get(random.nextInt(questionSet.size()));
    }
}