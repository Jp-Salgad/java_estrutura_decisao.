import java.util.Scanner;

public class decisao7 {
private static Scanner leitor; 
	
	public static void main(String[] args) {
		
		leitor = new Scanner (System.in);
		String nome, nome2; 
        int idade, idade2;
		
		System.out.println("Ol�, digite o seu nome.");
		nome = leitor.next();
		System.out.println("Ol�, "+nome+",por favor, digite a sua idade");
		idade = leitor.nextInt();
		
		System.out.println("Agora, ol� segunda pessoa, digite o seu nome.");
		nome2 = leitor.next();
		System.out.println("Ol�, "+nome2+",por favor, digite a sua idade.");
		idade2 = leitor.nextInt();
		
		if (idade > idade2) {
			System.out.println("O "+nome+" � o mais velho, pois tem "+idade+" anos.");
		} else if(idade2 > idade) {
			System.out.println("O "+nome2+" � o mais velho, pois tem "+idade2+" anos.");
			
		}
		
		

		
		
		
		
		
		
		
}
}