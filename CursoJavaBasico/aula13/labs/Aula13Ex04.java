package aula13.labs;
import java.util.Scanner;
public class Aula13Ex04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		String nome = ler.nextLine();
		
		System.out.println("Ola "+nome+" vamos calcular sua media desse ano: ");
		
		System.out.println("\nInsira a 1a nota: ");
		double nota1 = ler.nextDouble();
		
		System.out.println("Insira a 2a nota: ");
		double nota2 = ler.nextDouble();
		
		System.out.println("Insira a 3a nota: ");
		double nota3 = ler.nextDouble();
		
		System.out.println("Insira a 4a nota: ");
		double nota4 = ler.nextDouble();
		
		
		double media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("Sua nota m�dia foi de: \n"+media);
		
		if (media>=7)
		{
			System.out.println("Parabens "+nome+" voc� foi Aprovado");
		}
		else if (media<5)
		{
			System.out.println("Voc� foi Reprovado "+nome);
		}
		else if (media>=5 && media<7)
		{
			System.out.println("Voc� est� de Recuperacao "+nome);
		}
	
	
	}
		
				
		
			
		
}


/*
// Fa�a um programa que pe�a as 4 notas bimestrais e mostre a media.

*/