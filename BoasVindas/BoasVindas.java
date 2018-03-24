import java.util.Scanner;

public class BoasVindas {
	
	/*
	*  Classe realiza input do nome do usuário
	* e imprime uma mensagem de boas vindas com o nome dele
	*/

	public static void main(String[] args) {
		
		String nome;

		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Seu nome: ");
		nome = input.next();

		BoasVindasController boasVindasController = new BoasVindasController();
		boasVindasController.imprimir(nome);
	}
}