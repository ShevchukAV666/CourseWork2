package interfaces;

import Course.Work2.CourseWork2.Question;

import java.util.Set;

public interface ExaminerService {
    Set<Question> getQuestions(int amount);
}
