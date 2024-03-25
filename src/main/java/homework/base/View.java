package homework.base;

import homework.model.ComplexNum;

import java.util.Scanner;

public class View {
    public static String prompt(String mess) {
        System.out.printf("%s -> ", mess);
        return new Scanner(System.in).next();
    }
    public void printMessage(String mess) {
        System.out.println(mess);
    }
    public void printComplexNum (ComplexNum cn, String mess) {
        System.out.println(mess);
        System.out.println(cn.toString());
    }
}
