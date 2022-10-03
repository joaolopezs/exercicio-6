import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		
		double raio;
		double pi = 3.14;
		double area;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o raio do circulo: ");
		
		raio = sc.nextDouble();
		
        
		sc.close();
		
		area = pi * (Math.pow(raio,2));
		
		
		
		System.out.println("A area do circulo é  : " + area);
		
		

	}

}
