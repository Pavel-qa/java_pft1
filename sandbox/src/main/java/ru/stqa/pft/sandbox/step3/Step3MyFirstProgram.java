package ru.stqa.pft.sandbox.step3;

import ru.stqa.pft.sandbox.step3.Step3Rectangle;
import ru.stqa.pft.sandbox.step3.Step3Square;

public class Step3MyFirstProgram {

    public static void main(String[] args) {
        hello("Step3");

        Step3Square s = new Step3Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Step3Rectangle r = new Step3Rectangle(4, 6);
        System.out.println("Площадь треугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody);
    }

}