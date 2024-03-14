package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreateCalculate cal =new CreateCalculate();

        System.out.println(cal.createCalculate("2*3+4*4-10/0"));
    }
}