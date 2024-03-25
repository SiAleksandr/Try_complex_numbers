package homework.model;

public class ComplexNum {
    Double real;
    Double imaginary;

    public ComplexNum(Double real, Double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNum() {
    }

    private double getReal() {
        return this.real;
    }

    private double getImaginary() {
        return this.imaginary;
    }

    public void setReal (double num) {
        this.real = num;
    }
    public void setImaginary (double num) {
        this.imaginary = num;
    }
    @Override
    public String toString() {
        String sign = " + ";
        if (this.imaginary < 0) sign = " - ";
        return this.getReal() + sign + Math.abs(this.getImaginary()) + " i";
    }
}
