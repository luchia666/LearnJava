package ru.lesson.lessons;
import java.util.Scanner;

public class InteractRunner{
    public static  void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
        
            while(!exit.equals("yes")){
                System.out.println("Enter type of operation(+ - * /):");
                String answer = reader.next();
                System.out.println("Enter first arg:");
                String first = reader.next();
                System.out.println("Enter second arg:");
                String second = reader.next();
                double param1 = Double.valueOf(first);
                double param2 = Double.valueOf(second);
                if (answer.equals("+")){

                    try {
                        calc.add(param1, param2);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Oj oj");
                    }


                }
                else if (answer.equals("-")){
                        calc.minus(Double.valueOf(first), Double.valueOf(second));
                    }
                else if (answer.equals("*")){
                    try {
                        calc.multiplication(Double.valueOf(first), Double.valueOf(second));
                    } catch (IllegalStateException e) {
                        System.out.println(e);
                    }
                }
                else if(answer.equals("/")){
                        calc.division(Double.valueOf(first), Double.valueOf(second));
                    }
                else {
                        System.out.println("Error operation");
                    }
                System.out.println("Result " + calc.getResult());
                calc.cleanResult();
                System.err.println("Exit : yes/no");
                exit = reader.next(); 
            }
        }
        finally{
           reader.close();
        }
    }
}