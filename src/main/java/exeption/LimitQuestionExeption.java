package exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;



@ResponseStatus(HttpStatus.BAD_REQUEST)
public class LimitQuestionExeption extends RuntimeException {
    public LimitQuestionExeption() {
    }

    public LimitQuestionExeption(String message) {
        super(message);
    }

    public LimitQuestionExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public LimitQuestionExeption(Throwable cause) {
        super(cause);
    }

    public LimitQuestionExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
