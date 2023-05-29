public class Aluno implements ElementoDeJogo {
	
	@Override
	public String mostrar() {
		return "A";
	}

	@Override
	public int getValor() {
		return 10;
	}

	@Override
	public int getTipo() {
		return 1; // representa o Aluno
	}
	
	
}
