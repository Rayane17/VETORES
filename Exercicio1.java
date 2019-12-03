import java.util.Scanner;


public class Exercicio1 {

	public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);
		
		int i;
		final int TAM = 10;
		int a [];
		float b [];
		
		a = new int [TAM];
		b = new float [TAM];
		
		for(i=0; i<10;i++){
			
			System.out.println("Digite o "+(i+1)+"° valor: ");
			a[i] = ler.nextInt();
			
		}
		
			for(i=0; i<10;i++){
				
				b[i] =  (float) Math.sqrt(a[i]);
			
			System.out.println("O quadrado do "+(i+1)+"° valor é: "+b[i] );
			
			
		}
		
		ler.close();

	}

}
