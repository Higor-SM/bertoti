package facade;

public class defineForma {
	
	private Define Circulo;
	private Define Quadrado;
	private Define Retangulo;
	
	public defineForma() {
		Circulo = new Circulo();
		Quadrado = new Quadrado();
		Retangulo = new Retangulo();
	}
	
	
	public void escreveCirculo() {
		Circulo.escreve();
	}
	
	public void escreveRetangulo() {
		Retangulo.escreve();
	}
	
	public void escreveQuadrado() {
		Quadrado.escreve();
	}
	
	
}
