package aula13;

import java.util.Scanner;

public class curiosidade {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um n�mero: ");
        int num = entrada.nextInt();
        System.out.println("Digite o expoente: ");
        int exp = entrada.nextInt();
        double result = (num ^ exp);
        for (int i = 0; i < 1; i++) {
            System.out.println("O n�mero: " + num + "\n elevado ao expoente: " + exp + "\n � igual �: " + result);
        }
    }
}