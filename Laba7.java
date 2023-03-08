package com.company;

import java.util.Scanner;
class Calculator {
    int a;
    int b;
    int x;

    Calculator(int a, int b, int x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }

    int prim1() {
        return 3 * x + 5;
    }

    double prim2() {
        if (a - b != 0) {
            return (a + b) / (a - b);
        }
        else {
            return 0;
        }
    }

    void prim3(){
        if (b != 0){

            int y = 1;
            for (int i = 1; i<= (a*x)/b; i++){
                y = y*i;
            }
            System.out.println(y);
        }
        else{
            System.out.println("Error");
        }
    }
}
public class Laba7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator calc = new Calculator(in.nextInt(),in.nextInt(),in.nextInt());
        int num1 = calc.prim1();
        double num2 = calc.prim2();
        System.out.println(num1);
        System.out.println(num2);
        calc.prim3();
    }
}

