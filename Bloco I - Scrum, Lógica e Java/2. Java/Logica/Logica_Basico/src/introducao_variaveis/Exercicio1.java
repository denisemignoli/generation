package introducao_variaveis;

import java.util.Scanner;

public class Exercicio1 {
	/* ENUNCIADO
	 * 1. Faca um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa 
	 * apenas em dias. 
	 */

		public static void main(String[] args) {
			
			int anos, meses, dias, totalDias;
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nEntre com a quantidade de anos: ");
			anos = leia.nextInt();
			
			System.out.println("\nEntre com a quantidade de meses: ");
			meses = leia.nextInt();
			
			System.out.println("\nEntre com a quantidade de dias: ");
			dias = leia.nextInt();
			
			totalDias = anos*365 + meses*30 + dias;
			System.out.println("\nTotal de dias vividos: "+totalDias);
		}
}
