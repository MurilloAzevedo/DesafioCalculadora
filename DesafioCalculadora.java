import java.util.Scanner;

public class DesafioCalculadora {
    //Ler numero 1 e 2 que o usuario passar, e utilizar os operadores passados no capitulo 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        double num1 = input.nextDouble();

        System.out.println("Informe o numero: ");
        double num2 = input.nextDouble();

        System.out.println("Informe a operação: ");
        String op = input.next();

        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 - num2 : resultado;
        resultado = "/".equals(op) ? num1 - num2 : resultado;
        resultado = "%".equals(op) ? num1 - num2 : resultado;

        System.out.printf("%.2f %s %.2f= %.2f", num1, op, num2, resultado);
        input.close();
    }
}