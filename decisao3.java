import java.util.Scanner;

public class decisao3 {
	
    private static Scanner leitor; 
	
	public static void main(String[] args) {
		
		leitor = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Olá, digite um número inteiro, e eu te direi se ele é postivo ou negativo.");
		numero = leitor.nextInt();
		if (numero > 0) {
			System.out.println("Esse número é positivo.");
		} else if(numero < 0) {	
			System.out.println("Esse número é negativo.");
		} else {
			System.out.println("Esse número é neutro.");
		}
		}


		
		
		
		
		
		
		

}