package ru.stqa.pft.sandbox.Step2;

import ru.stqa.pft.sandbox.Step2.Step2Rectangle;
import ru.stqa.pft.sandbox.Step2.Step2Square;

public class Step2MyFirstProgram {

    public static void main (String[] args) {
        hello("Step2");

        Step2Square s = new Step2Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Step2Rectangle r = new Step2Rectangle(4, 6);
        System.out.println("Площадь треугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody);
    }

    public static double area (Step2Square s) {
        return  s.l * s.l;
    }

    public static double area(Step2Rectangle r){
        return r.a * r.b;
    }
}