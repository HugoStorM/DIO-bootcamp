package br.com.dio;

import br.com.dio.facade.Facade;
import br.com.dio.singleton.*;
import br.com.dio.strategy.Comportamento;
import br.com.dio.strategy.ComportamentoAgressivo;
import br.com.dio.strategy.ComportamentoDefensivo;
import br.com.dio.strategy.ComportamentoNormal;
import br.com.dio.strategy.Robo;

public class Main {

	public static void main(String[] args) {
		
//		//Testes Singleton
//		
//		SingletonLazy lazy = SingletonLazy.getInstancia();
//		System.out.println(lazy);
//		lazy = SingletonLazy.getInstancia();
//		System.out.println(lazy);
//		
//		SingletonEager eager = SingletonEager.getInstancia();
//		System.out.println(eager);
//		eager = SingletonEager.getInstancia();
//		System.out.println(eager);
//		
//		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
//		System.out.println(lazyHolder);
//		lazyHolder = SingletonLazyHolder.getInstancia();
//		System.out.println(lazyHolder);
		
		//Testes Strategy
		
//		Comportamento normal = new ComportamentoNormal();
//		Comportamento defensivo = new ComportamentoDefensivo();
//		Comportamento agressivo = new ComportamentoAgressivo();
//		
//		Robo robo = new Robo();
//		robo.setComportamento(normal);
//		robo.mover();
//		robo.mover();
//		
//		robo.setComportamento(defensivo);
//		robo.mover();
//		
//		robo.setComportamento(agressivo);
//		robo.mover();
//		robo.mover();
//		robo.mover();
//		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Hugo", "54000000");
	
		

	}

}
