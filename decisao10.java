import java.util.Scanner;

import javax.swing.Spring;

public class decisao10 {
	
private static Scanner leitor;
 

	public static void main(String[] args)  {
		
		float pesoideal, altura;
		String resultado = "O peso ideal para você é: ", sexo;
		
		System.out.println("Por favor, digite a sua altura");
		altura = leitor.nextFloat();
		System.out.println("Digite seu sexo M ou F");
		sexo = leitor.next();
		
		if (sexo.equalsIgnoreCase ("F")) 
		{
			pesoideal = (float) ((62.1*altura) - 44.7);
			resultado = resultado + pesoideal;
		}
	 else if (sexo.equalsIgnoreCase ("M")) 
		{	
			pesoideal = (float) ((72.7*altura) - 58);
			resultado = resultado + pesoideal;
		}
	  else
		{	
		
			resultado = "O sexo não foi informado";
			
			System.out.println(resultado);
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		}
	
	}
}  