package aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = ler.nextLine();
		System.out.println("Seu nome completo �: "+nomeCompleto);
		
		System.out.println("Digite o seu primeiro nome: ");
		String primeiroNome = ler.next();
		System.out.println("Seu primeiro nome �: "+primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = ler.nextInt();
		System.out.println("Sua idade �: "+idade);
		
		System.out.println("Digite a sua altura: ");
		double altura = ler.nextDouble();
		System.out.println("Sua altura �: "+altura);
		
		

	}

}
