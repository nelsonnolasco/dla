package notas;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua nota:");
        double nota = sc.nextDouble();

        if (nota < 5){
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota < 6){
            System.out.println("Regular");
        } else if (nota >= 6 && nota < 7.5){
            System.out.println("Bom");
        } else if (nota >= 7.5 && nota <9){
            System.out.println ("Muito bom");
        } else {
            System.out.println ("Excelente");
        }
    sc.close();
     
    }
}