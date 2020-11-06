package entities;

import entities.enums.Color;

public class Circulo extends Forma{
	
	private double raio;
	
	public Circulo() {
		super();
	}
	
	

	public Circulo(Color cor, double raio) {
		super(cor);
		this.raio = raio;
	}



	public double getRaio() {
		return raio;
	}



	public void setRaio(double raio) {
		this.raio = raio;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*raio*raio;
	}



	@Override
	public String toString() {
		return "Circulo [raio: " + raio +" Cor: "+getCor()+" Área do Círculo:  "+area()+ "]";
	}
	
	

}
