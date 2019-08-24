package ru.stqa.pft.sandbox.step3;

public class Step3Rectangle {

    public double a;
    public double b;

    public Step3Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area(){
        return this.a * this.b;
    }
}
