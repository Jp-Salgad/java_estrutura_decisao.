import java.util.Scanner;

public class decisao3 {
	
    private static Scanner leitor; 
	
	public static void main(String[] args) {
		
		leitor = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Ol�, digite um n�mero inteiro, e eu te direi se ele � postivo ou negativo.");
		numero = leitor.nextInt();
		if (numero > 0) {
			System.out.println("Esse n�mero � positivo.");
		} else if(numero < 0) {	
			System.out.println("Esse n�mero � negativo.");
		} else {
			System.out.println("Esse n�mero � neutro.");
		}
		}


		
		
		
		
		
		
		

}