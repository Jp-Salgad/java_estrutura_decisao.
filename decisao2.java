import java.util.Scanner;

public class decisao2 {

	private static Scanner leitor; 
	
	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		leitor = new Scanner (System.in);
  	  
		System.out.println("Ol�, digite dois n�meros, cuja a soma seja maior que 10.");
		System.out.println("Digite o primeiro n�mero:");
  	  numero1 = leitor.nextInt();
  	  System.out.println("Muito bem! Agora digite outro n�mero:");
  	  numero2 = leitor.nextInt();
  	  
		int soma = numero1+numero2;
		if (soma >= 10 ) {
		System.out.println("Muito bem, o resultado da soma desses dois n�meros �: " +soma);
		} else {
			 System.out.println("Erro! Digite os n�meros novamente.");
		}
		
		
  	  
  	  
  	  


		
		
		
		
		
		
		
		
		
}
}