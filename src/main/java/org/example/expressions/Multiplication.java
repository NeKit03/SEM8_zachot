package org.example.expressions;

public class Multiplication implements Calculation{
    private  Double num1;
    private  Double num2;

    public Multiplication(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Double calculation() {
        System.out.printf("Результат умножения числел %f и %f = %f\n",num1,num2,num1*num2);
        return num1*num2;
    }
}
