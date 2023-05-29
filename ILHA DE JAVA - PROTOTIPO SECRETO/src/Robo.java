public abstract class Robo implements ElementoDeJogo {

	public String nome;
	public int id;
	public int posicaoX = 1;
	public int posicaoY = 1;
	public int pontos = 0;
	
	public String mostrar() {
		return "@";
	}
	
	public abstract void avancar(int numCelulas);
	
	public abstract void retroceder(int numCelulas);
	
	public void ganharPontos() {
		pontos+=10;
	}
	
	public void perderPontos() {
		pontos-=15;
	}
	
	public int getValor() {
		return 0; //Não retorna pontos se colidir com outro robo
	}
	
	public int getTipo() {
		return 0;
	}

}