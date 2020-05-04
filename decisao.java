import java.util.Scanner;

public class decisao {

	private static Scanner leitor; 
	
	public static void main(String[] args) {

     int numero;
		leitor = new Scanner (System.in);
    	  System.out.println("Olá, digite um número maior que 20");
    	  numero = leitor.nextInt();
    	  if (numero >= 20 ) {
    		  System.out.println("Esse é o número:" +numero);
    	  } else { 
    		  
    		  System.out.println("Erro! Número digitado menor que o pedido.");
    		  System.out.println("Digite novamente");
        	  


    	  }
    	  
    		 
    	  
    	  
    		  
      
      
      
      
      
      
      }
}