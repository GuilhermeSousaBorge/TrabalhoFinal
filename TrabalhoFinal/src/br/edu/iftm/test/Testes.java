package br.edu.iftm.test;

import br.edu.iftm.singleton.Singleton;

public class Testes {

	public static void main(String[] args) {
		Singleton sing = Singleton.getInstance("teste1");
		Singleton sing2 = Singleton.getInstance("teste2");

		System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n"
				+ "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" + "RESULT:" + "\n");
		
		System.out.println(sing.value);
		System.out.println(sing2.value);
	}

}
