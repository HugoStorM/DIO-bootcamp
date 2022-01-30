package br.com.dio.singleton;

/**
 * Singleton "apressado".
 * 
 * @author HugoStorM
 *
 */

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstancia() { 
		
		return instancia;
	 }

}

