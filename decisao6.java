import java.util.Scanner;

public class decisao6 {
	
private static Scanner leitor; 
	
	public static void main(String[] args) {
		
		leitor = new Scanner (System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Ol�, eu irei fazer mostrar a sua m�dia, para isso digite suas notas.");
		System.out.println("Digite a nota da sua primeira prova:");
		numero1 = leitor.nextInt();
		System.out.println("Muito bem! Digite a nota da sua segunda prova:");
		numero2 = leitor.nextInt();
		System.out.println("Agora digite a nota da sua terceria e �ltima prova:");
		numero3 = leitor.nextInt();
		
		int soma = numero1+numero2+numero3;
		if (soma >= 7 ) {
			System.out.println("Muito bem! A sua nota foi " +soma+".Ent�o voc� est� na m�dia.");
		} else {
			System.out.println("Que pena! Sua nota foi " +soma+".Ent�o voc� n�o est� na m�dia.");

			
		}
		}
}
