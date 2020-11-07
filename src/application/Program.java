package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;

import entities.Retangulo;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//classes abstratas n�o podem ser instaciadas, mas garantem que a classes filhas ter�o todos os atributos e m�todos da superclasse
		
		//m�todos abstratos n�o possuem implementa��o, eles aparecem quando a classe � muito gen�rica para ser implementada pelo m�todo em quest�o
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma> forma = new ArrayList<>();
		
		System.out.println("Quantas formas deseja adicionar?");
		int n =sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Qual a cor da  forma? PRETO/AZUL/ROSA");
			Color cor = Color.valueOf(sc.next());
			System.out.println("Sua forma � ret�ngulo ou c�rculo? r/c?");
			char f = sc.next().charAt(0);
			
			if(f=='r') {
				System.out.println("Qual a largura do ret�ngulo?");
				double largura = sc.nextDouble();
				System.out.println("Qual a altura do ret�ngulo");
				double altura = sc.nextDouble();
				
				Forma retangulo = new Retangulo(cor,largura,altura);
		
				
				forma.add(retangulo);
				
				
			}else if(f=='c') {
				
				System.out.println("Qual o raio do circulo?");
				double raio = sc.nextDouble();
				
				
				Forma circulo = new Circulo(cor,raio);
		
				
				forma.add(circulo);
				
			}
			
			
			
		}
		
		
		System.out.println(forma);
		
		
		
		
		
	}

}
