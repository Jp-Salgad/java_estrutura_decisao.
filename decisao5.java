import java.util.Scanner;

public class decisao5 {
	
private static Scanner leitor; 
	
	public static void main(String[] args) {
		
		leitor = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um número e eu te direi se ele é par ou ímpar");
		System.out.println("Digite o número:");
		numero = leitor.nextInt();
		if((numero  % 2) == 0) {
			System.out.println("Esse número é par");
		} else {
			System.out.println("Esse número é impar");
		}
		 
	        
		
		
		
		
		
	}	
	}
	
