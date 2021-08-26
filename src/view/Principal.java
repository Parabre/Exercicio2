package view;

import controller.CalculaController;

public class Principal {

	public static void main(String[] args) throws Exception {
		CalculaController calculaController = new CalculaController();
		int numero = 495993;
		int chave = 9;
		if(numero < 10 || numero > 999999) {
			throw new Exception("Valor inválido");
		}else {
			int calc = calculaController.calc(numero, chave);
			System.out.println(calc);
		}	
	}

}
