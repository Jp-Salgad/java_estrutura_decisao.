import java.util.Scanner;

public class decisao5 {
	
private static Scanner leitor; 
	
	public static void main(String[] args) {
		
		leitor = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero e eu te direi se ele � par ou �mpar");
		System.out.println("Digite o n�mero:");
		numero = leitor.nextInt();
		if((numero  % 2) == 0) {
			System.out.println("Esse n�mero � par");
		} else {
			System.out.println("Esse n�mero � impar");
		}
		 
	        
		
		
		
		
		
	}	
	}
	
