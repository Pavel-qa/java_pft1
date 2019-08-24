package ru.stqa.pft.sandbox.step1;

import ru.stqa.pft.sandbox.step1.Step1Square;
import ru.stqa.pft.sandbox.step1.Step1Rectangle;

public class Step1MyFirstProgram {
    public static void main(String[] args) {
        hello("Step1");

        Step1Square s = new Step1Square();
        s.l = 5;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Step1Rectangle r = new Step1Rectangle();
        r.a = 4;
        r.b = 6;
        System.out.println("Площадь треугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody);
    }

    public static double area (Step1Square s) {
        return  s.l * s.l;
    }

    public static double area(Step1Rectangle r){
        return r.a * r.b;
    }
}
