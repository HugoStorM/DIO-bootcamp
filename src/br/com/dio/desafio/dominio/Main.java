package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
	
		Curso curso1 = new Curso();
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Falando mais sobre Java");
		mentoria.setData(LocalDate.now());
		
		
		curso1.setTitulo("Curso de Java");
		curso1.setCargaHoraria(8);
		curso1.setDescricao("Descrição curso de Java");
		
//		System.out.println(curso1);
//		System.out.println(mentoria);
//		
//		Conteudo conteudo = new Curso();
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp para aprender mais sobre Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devHugo = new Dev();
		devHugo.setNome("Hugo");
		devHugo.inscreverBootcamp(bootcamp);
		devHugo.progredir();
		devHugo.progredir();
		
		System.out.println("Conteúdos Inscritos " + devHugo.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos " + devHugo.getConteudosConcluidos());
		System.out.println("XP "+ devHugo.calcularTotalXp());
		
	}

}
