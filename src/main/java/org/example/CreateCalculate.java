package org.example;

import org.example.expressions.*;

import java.util.*;


public class CreateCalculate {
    private String expression;
    private Stack<Double> value = new Stack<>();
    private Stack<Character> znak = new Stack<>();


    public Double createCalculate(String expression) {
        String num = "";
        Double rez=0.0;
        for (Character i:expression.toCharArray()) {

            if((i>='0' && i<='9')||i=='.'){
                num = num+i;

            }else{
                createNum(num);
                while(!znak.isEmpty() && priority(i,znak.peek())){
                    value.push(rezultExpression(znak.pop(),value.pop(),value.pop()));
                }
                znak.push(i);
                num = "";
            }

        }
        createNum(num);
        num = "";
        while(!znak.isEmpty()){
            rez=rezultExpression(znak.pop(),value.pop(),value.pop());
            if(rez != null)
                value.push(rez);
            else
                return 0.0;
        }

        return value.pop();

    }

    public void createNum(String number) {
        value.push(Double.parseDouble(number));
    }
    public boolean priority(Character zn1,Character zn2){
        if ((zn1 =='*' || zn1 =='/') && (zn2 =='+' || zn2 =='-')) {
            return false;
        }else
        return true;

    }

    public Double rezultExpression(Character znak,Double num1, Double num2) {


        Double rezult = 0.0;
        switch(znak){
            case '*':
                return new Multiplication(num2,num1).calculation();
            case '/':
                return new Division(num2,num1).calculation();
            case '+':
                return new Addition(num2,num1).calculation();
            case '-':
                return new Subtraction(num2,num1).calculation();
            default:
                return 0.0;
        }


    }

    public void dellNum(int i,Double rezult){
        value.remove(i+1);
        value.set(i,rezult);

    }



}
