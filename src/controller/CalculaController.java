package controller;

public class CalculaController {

	public CalculaController() {
		super();
	}
	
	public int calc(int numero, int chave){
		
		if(numero == 0) return 0;

		return numero % 10 == chave ? 1 + calc(numero / 10, chave) : 0 + calc(numero / 10, chave);
	}

}
