import java.util.Scanner;

public class decisao9 {
	
private static Scanner leitor; 
	
	public static void main(String[] args) {
		
		leitor = new Scanner (System.in);
		
		int produto;
		
		System.out.println("Ol�, eu irei dizer a voc� o valor de venda do seu produto comprado.");
		System.out.println("Por favor, diga o valor de compra do seu produto:");
		produto = leitor.nextInt();
		
		
		if (produto < 20) {
			System.out.println("O lucro do seu produto � de 30%");
		} else {
			System.out.println("O lucro do seu produto � de 45%");
			
		}

		
	
		
		
		
		
		

		
		
		
		
		
		
		
}
}