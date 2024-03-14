package org.example.expressions;

import org.example.Calculate;
import org.example.CreateCalculate;

public class Addition implements Calculation {
    private  Double num1;
    private  Double num2;

    public Addition(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Double calculation() {
        System.out.printf("Результат суммы числел %f и %f = %f\n",num1,num2,num1+num2);
        return num1+num2;
    }
}
