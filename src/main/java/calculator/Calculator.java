package calculator;

public class Calculator{

    public static double add(double[]args){
        double sum = args[0] + args[1];
        return sum;
    }

    public static double subtract(double[]args){
        double difference =  args[0] - args[1];
        return difference;
    }

    public static double multiply(double[]args){
        double product = args[0] * args[1];
        return product;
    }

    public static double divide(double[]args){
        if (args[1] == 0){
            System.out.println("Cannot divide by zero");
            return Double.NaN;
            }
        double quotient = args[0] / args[1];
        return quotient;
    }
}