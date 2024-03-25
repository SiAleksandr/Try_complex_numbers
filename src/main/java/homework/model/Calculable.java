package homework.model;

import java.util.List;

public interface Calculable {
    List<String> getQuestions();
    ComplexNum calculate (Double ... args);
}
