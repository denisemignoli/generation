package repeticao;

import java.util.Scanner;

public class Exercicio2For {
	/* ENUNCIADO
	 * 2. Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		float num;
		int numP=0, numI=0;		
				
		for(int x=0;x<10;x++)
		{
			System.out.println("\nInsira um n�mero: ");
			num = leia.nextFloat();
			
			if(num%2==0)
			{
				numP++;
			}
			else
			{
				numI++;
			}
		}
		
		System.out.println("\nO n�mero total de n�meros pares �: "+numP);
		System.out.println("\nO n�mero total de n�meros �mpares �: "+numI);
	}

}
