package aula10;

public class Variaveis { //classe	

	public static void main(String[] args) { // metodo main de entrada do programa
		//convencao
		int idade = 20; //';' os comandos terminam em ';'
		String nome = "Ivan"; //nao � tipo primitivo, � uma classe; pode ser um conjunto de caracteres
		String nomeDoCachorro = "Teleka"; //case sensitive; NomeDoCachoro != nomeDoCachorro
		String ano2020 = "2020";
		
		/* nao � convencao java
		int _idade;
		int $idade;
		String ano2014;
		String nome_do_meu_cachorro; */

		
		System.out.println("Idade: "+idade);
		System.out.println("Nome: "+nome);
		System.out.println("Nome do Cachorro: "+nomeDoCachorro);
		System.out.println(""+ano2020);
		
		/* m� pratica
		 int a = 10;
		 String b = "Ivan";
		 */
		
		
		
	}
		
}