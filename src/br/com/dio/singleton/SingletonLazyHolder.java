package br.com.dio.singleton;

/**
 * Singleton "Lazy Holder".
 * 
 * @author HugoStorM
 *
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstancia() { 
		
		return InstanceHolder.instancia;
	 }

}

