package media.calcula;

public class CalculaMedia {

	public static void main(String[] args) {
		calculaMedia();
	}

	private static void calculaMedia() {
		
		float nota1 = 5;
		float nota2 = 9;
		float nota3 = 7;
		float nota4 = 6;
		
		float somaNota = nota1 + nota2 + nota3 + nota4;
		float media = somaNota / 4;
		System.out.print(media);
	}

}
