package repeticao;

import java.util.Scanner;

public class Exercicio1While {
	/*
	 * 3. Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
	 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int idade, idadeP=0, idadeM=0; //idadeP = menos de 21 anos | idadeM = maior de 50 anos
		
		System.out.println("\nInforme sua idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99)
		{
			if(idade>0 && idade<21)
			{
				idadeP++;
			}
			else if(idade>49)
			{
				idadeM++;
			}
			System.out.println("\nInforme sua idade: ");
			idade = leia.nextInt();
		}
		System.out.println("\nO n�mero total de pessoa com menos de 21 anos �: "+idadeP);
		System.out.println("\nO n�mero total de pessoa com mais de 50 anos �: "+idadeM);
	}

}
