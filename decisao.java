import java.util.Scanner;

public class decisao {

	private static Scanner leitor; 
	
	public static void main(String[] args) {

     int numero;
		leitor = new Scanner (System.in);
    	  System.out.println("Ol�, digite um n�mero maior que 20");
    	  numero = leitor.nextInt();
    	  if (numero >= 20 ) {
    		  System.out.println("Esse � o n�mero:" +numero);
    	  } else { 
    		  
    		  System.out.println("Erro! N�mero digitado menor que o pedido.");
    		  System.out.println("Digite novamente");
        	  


    	  }
    	  
    		 
    	  
    	  
    		  
      
      
      
      
      
      
      }
}