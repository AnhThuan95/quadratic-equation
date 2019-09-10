import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }

    public double getDiscriminant() {
        double delta = Math.pow(this.getB(),2) - 4 * this.getA() * this.getC();
        return delta;
    }

    public double getRoot1() {
        double root1 = - (this.getB() + Math.pow(getDiscriminant(), 0.5)) / (2 * this.getA());
        return root1;
    }

    public double getRoot2() {
        double root2 = - (this.getB() - Math.pow(getDiscriminant(), 0.5)) / (2 * this.getA());
        return root2;
    }
}

class SolveQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a program for solving the quadratic equation: \"a.x^2 + b.x + c = 0\" ");
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.printf("The equation has two roots : %f and %f.", quadraticEquation.getRoot1(), quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.printf("The equation has one root: %f.", quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no real root.");
        }
    }
}
