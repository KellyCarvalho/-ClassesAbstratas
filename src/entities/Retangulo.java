package entities;

import entities.enums.Color;

public class Retangulo extends Forma {
	
	private double largura;
	private double altura;

	public Retangulo() {
		super();
	}
	
	public Retangulo(Color cor, double largura, double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}



	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return largura*altura;
	}

	@Override
	public String toString() {
		return "Retangulo [Largura: " + largura + ", Altura: " + altura +"Cor: "+getCor()+ " Área do Retangulo: "+area()+"]";
	}
	



}
