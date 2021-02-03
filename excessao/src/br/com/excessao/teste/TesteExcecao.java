package br.com.excessao.teste;


public class TesteExcecao {

	public static void main(String[] args) {
		
		
		/*
		 * excecoes checked(ac) e unchecked(dc)
		 */
		
		try {
			
			int numero = Integer.parseInt("4");
			System.out.println("Numero: " + numero);
			
			if (numero>3) {
				//throw new RuntimeException("eu derrubei");
			}
			String palavra = "";
			System.out.println("Quantidade de Letras: " + palavra.length());
			
			int numeros[] = new int[3];
			numeros[0] = 500;
			numeros[1] = 15;
			numeros[2] = 17;
			
			
		}catch (NullPointerException e) {
			System.out.println("deu ruim, nulo");
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array pequeno");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("deu ruim");
			e.printStackTrace();
		}finally {
			System.out.println("caiu no finnaly");
		}
		

	}

}
