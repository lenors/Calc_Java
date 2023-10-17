import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Coloquei 2 Variaveis para serem utilizadas em diversos meios.
		//Assim utilizando em uma estrutura switch, e assim tendo varios meios de utilizar as variaveis em diferentes aspectos
		int n1 = 0;
		int n2 = 0;
		int option;
		String menu = "1) somar\n" + "2) Subtrair\n" + "3) Multiplicar\n" + "4) Dividir\n";

		System.out.println(menu);
		option = sc.nextInt();
		switch (option) {
		case 1:
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			int soma = n1 + n2;
			System.out.println(soma);
			System.out.println("Fim programa");
			break;
		case 2:
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			double subtrair = n1 - n2;
			System.out.println(subtrair);
			System.out.println("Fim programa");
			break;
		case 3:
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			int multiplicar = n1 * n2;
			System.out.println(multiplicar);
			System.out.println("Fim programa");
			break;
		case 4:
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			if(n1 == 0 || n2 == 0)
				System.out.println("Impossivel dividir");
			else {
				double dividir = n1 / n2;
				System.out.println(dividir);
				System.out.println("Fim programa");
			};
			break;

		}

	}
}
