package interfaces;

import Course.Work2.CourseWork2.Question;

import java.util.Set;

public interface QuestionService {
    Question add(String question, String answer);
    Question remove(String question, String answer);

    Set<Question> getAll();

    Question getRandomQuestion();

}
