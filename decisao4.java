import java.util.Scanner;

public class decisao4 {
	
private static Scanner leitor; 
	
	public static void main(String[] args) {
		
		leitor = new Scanner (System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Digite dois n�meros e eu irei colocar eles em ordem decrescente.");
		System.out.println("Digite o primeiro n�mero:");
		numero1 = leitor.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		numero2 = leitor.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("Ordem:"+numero1+"e"+numero2);
		} else {
			System.out.println("Ordem:"+numero2+"e"+numero1);
		}
		
		

		



		
		
}
}