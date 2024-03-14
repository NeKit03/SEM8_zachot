package org.example.expressions;

import org.example.CreateCalculate;

public class Division implements Calculation{
    private  Double num1;
    private  Double num2;

    public Division(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Double calculation() {
        if(num2==0){
            System.out.printf("На ноль делить нельзя!Происходит деление на 0 gри деление числа %f на %f \n",num1,num2);
            return null;
        }
        System.out.printf("Результат деления числел %f и %f = %f\n",num1,num2,num1/num2);
        return num1/num2;
    }
}
