package homework.model.actions;

import homework.model.Calculable;
import homework.model.ComplexNum;

import java.util.ArrayList;
import java.util.List;

public class Multiplication implements Calculable {
    private static List<String> questions = new ArrayList<>();

    static {
        questions.add("Целая часть множителя");
        questions.add("Мнимая часть множителя");
    }

    @Override
    public List<String> getQuestions() {
        return questions;
    }

    @Override
    public ComplexNum calculate(Double[] args) {
        Double real = args[0] * args[2] + args[1] * args[3] * (-1);
        Double imaginary = args[0] * args[3] + args[1] * args[2];
        ComplexNum ans = new ComplexNum(real, imaginary);
        return ans;
    }
}
