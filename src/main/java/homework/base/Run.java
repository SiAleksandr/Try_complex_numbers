package homework.base;

import homework.model.Calculable;
import homework.model.ComplexNum;
import homework.model.actions.Addition;
import homework.model.actions.Division;
import homework.model.actions.Multiplication;
import homework.model.actions.Subtraction;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Run {
    private final static View view = new View();
    private final static Map<String, Calculable> operations = new HashMap<>();

    static {
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("/", new Division());
        operations.put("*", new Multiplication());
    }

    public void buttonClick() {
        List<Double> componentsParts = new ArrayList<>();
        componentsParts.add(Double.parseDouble(view.prompt(
                "Чтобы выполнить действия с комплексными числами, введите \n" +
                        "реальную часть числа")));
        componentsParts.add(Double.parseDouble(view.prompt(
                        "мнимую часть числа")));
        String operator = view.prompt("Введите действие ( + - * / ) \n"); // При добавлении действия
        // нужно добавить сюда его обозначение
        if (operations.containsKey(operator)) {
            // Я заложил возможность принимать разное количество аргументов,
            // в зависимости от того, сколько их нужно классу, совершающему действие.
            // Каждому аргументу предшествует соответственный вопрос из списка, созденного в классе.
            // Соответственно, сколько вопросов в списке из класса, столько и аргументов.
            for (int i = 0; i < operations.get(operator).getQuestions().size(); i++) {
                componentsParts.add(Double.parseDouble(
                        view.prompt(operations.get(operator).getQuestions().get(i))));
            }
            Double[] numParts = componentsParts.toArray(new Double[0]);
            ComplexNum result;
            result = operations.get(operator).calculate(numParts);
            view.printComplexNum(result, "Получилось число:");
        }
        else System.out.println("Действие введено неверно или не поддерживается.");
    }
}
