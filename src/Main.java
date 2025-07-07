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
        //Scanner e bufferedReader tem funções similares, mas o scanner é mais fácil.
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\nCalculadora Simples:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if(opcao >= 1 && opcao <=4){
                System.out.print("Digite o primeiro número: ");
                double a = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                double b = sc.nextDouble();
                double resultado = 0;

                switch (opcao) {
                    case 1:
                        resultado = somar(a, b);
                        break;
                    case 2:
                        resultado = subtrair(a, b);
                        break;
                    case 3:
                        resultado = multiplicar(a, b);
                        break;
                    case 4:
                        resultado = dividir(a, b);
                        break;
                }

                System.out.println("Resultado: " + resultado);
            } else if (opcao != 0) {
                System.out.println("Opção inválida.");
            }

        }while(opcao != 0);

        System.out.println("Encerrando calculadora...");
        sc.close();
    }
}