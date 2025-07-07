import java.util.Scanner;


public class Main {

    public static double somar(double a, double b){
        return a + b;
    }
    public static double subtrair(double a, double b){
        return a - b;
    }
    public static double multiplicar(double a, double b){
        return a * b;
    }
    public static double dividir(double a, double b){
        //cuidado: nao pode dividir por 0
        if(b==0){
            //lançar um erro para a execução do codigo, por isso é melhor usar, NaN.
            //throw new ArithmeticException("Divisão por zero");

            System.out.println("Erro: divisão por zero");
            return  Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}