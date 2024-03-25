package homework.model.actions;

import homework.model.ComplexNum;
import homework.model.Calculable;

import java.util.ArrayList;
import java.util.List;

public class Addition implements Calculable {
    private static List<String> questions = new ArrayList<>();

    static {
        questions.add("Второе слагаемое - реальная часть");
        questions.add("Второе слагаемое - мнимая часть");
    }

    @Override
    public List<String> getQuestions() {
        return questions;
    }

    @Override
    public ComplexNum calculate(Double[] args) {
        ComplexNum ans = new ComplexNum();
        ans.setReal(args[0] + args[2]);
        ans.setImaginary(args[1] + args[3]);
        return ans;
    }
}
