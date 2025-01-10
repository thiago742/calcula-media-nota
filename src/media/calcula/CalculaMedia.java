package media.calcula;

import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Informe as 4 notas");
		
		Float nota1 = sc.nextFloat();
		
		Float nota2 = sc.nextFloat();
		
		Float nota3 = sc.nextFloat();
		
		Float nota4 = sc.nextFloat();
		
		Float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >= 7) {
			System.out.println("Aprovado!");
		}
		else if (media >= 5) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
		}
		
	}

}
