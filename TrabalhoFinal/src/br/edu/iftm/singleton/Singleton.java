package br.edu.iftm.singleton;

public final class Singleton {
	private static Singleton INSTANCE;
	public String value;
	
	public static final String Singleton = "Esso eu vejo de fora";
	
	private Singleton(String value) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		this.value = value;
	}
	
	public static Singleton getInstance(String value) {
		if(INSTANCE == null) {
			INSTANCE = new Singleton(value);
		}
		return INSTANCE;
	}
	
	public static void Abrir() {
		
		System.out.println("Abriu a Singleton...");
	}
	
	public static void Fechar() {
		System.out.println("Fechou a Singleton...");
	}
}
