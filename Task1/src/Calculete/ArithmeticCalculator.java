package Calculete;

public class ArithmeticCalculator {
    private double x;
    private double y;

    public ArithmeticCalculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void calculate(operation operation) {
        if (operation == Calculete.operation.ADD) {
            System.out.println(x + y);
        } else if (operation == Calculete.operation.MULTIPLY) {
            System.out.println(x * y);
        } else if (operation == Calculete.operation.SUBTRACT) {
            System.out.println(x - y);
        } else {
            System.out.println("неверный ввод данных");
        }


    }
}
