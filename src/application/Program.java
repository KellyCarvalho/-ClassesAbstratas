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


		//classes abstratas não podem ser instaciadas, mas garantem que a classes filhas terão todos os atributos e métodos da superclasse
		
		//métodos abstratos não possuem implementação, eles aparecem quando a classe é muito genérica para ser implementada pelo método em questão
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma> forma = new ArrayList<>();
		
		System.out.println("Quantas formas deseja adicionar?");
		int n =sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Qual a cor da  forma?");
			Color cor = Color.valueOf(sc.next());
			System.out.println("Sua forma é retângulo ou círculo? r/c?");
			char f = sc.next().charAt(0);
			
			if(f=='r') {
				System.out.println("Qual a largura do retângulo?");
				double largura = sc.nextDouble();
				System.out.println("Qual a altura do retângulo");
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
