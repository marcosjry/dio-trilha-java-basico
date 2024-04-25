import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		terminal.close();
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.err.println(e);
		}

	}


	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
		if(parametroDois < parametroUm) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		}
		int valor = parametroDois - parametroUm;
		for(int contador = 1; contador <= valor; contador++){
			System.out.println("Imprimindo o Número "+ contador);
		}
	}
}
