package homework.model.actions;

import homework.model.Calculable;
import homework.model.ComplexNum;

import java.util.ArrayList;
import java.util.List;

public class Division implements Calculable {
    private static List<String> questions = new ArrayList<>();

    static {
        questions.add("Целая часть делителя");
        questions.add("Мнимая часть делителя");
    }

    @Override
    public List<String> getQuestions() {
        return questions;
    }

    @Override
    public ComplexNum calculate(Double[] args) {
        Double real = (args[0] * args[2] - args[1] * args[3] * (-1))
                / (Math.pow(args[2], 2) - Math.pow(args[3], 2) * (-1));
        Double imaginary = (args[0] * (-1) * args[3] + args[1] * args[2])
                / (Math.pow(args[2], 2) - Math.pow(args[3], 2) * (-1));
        ComplexNum res = new ComplexNum();
        res.setReal(real);
        res.setImaginary(imaginary);
        return res;
    }
}
