import java.util.Scanner;

public class decisao11 {

    private static String sexo1 = "masculino";
	private static String sexo2 = "feminino";
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Olá, hoje iremos medir o seu peso ideal, então:");
		System.out.println("Digite o seu sexo, por favor (MASCULINO OU FEMININO:");
		String sexo = sc.nextLine();
		
		System.out.println("Digite a sua altura, por favor:");
		Float altura =sc.nextFloat();
		
		float imcmasc = (float) ((72.7 * altura) - 58);
		float imcfem = (float) ((62.1 * altura) - 44.7);
		
		
		if(sexo.equals(sexo1))
		{
		System.out.println("O seu peso ideal então é: " +imcmasc);
		
		}
		
	else 
		
		System.out.println("O seu peso ideal é:" +imcfem);
	}
		

		
		
		
		
		
		
		
	
		


}
	
