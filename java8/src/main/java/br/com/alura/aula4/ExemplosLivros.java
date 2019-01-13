package br.com.alura.aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExemplosLivros {
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
	    cursos.add(new Curso("Python", 45));
	    cursos.add(new Curso("JavaScript", 150));
	    cursos.add(new Curso("Java 8", 113));
	    cursos.add(new Curso("C", 55));
	    
//	    cursos.sort(Comparator.comparing(Curso::getAlunos));
	    
//	    cursos.forEach(c -> System.out.println(c.getNome()));
	    
	    cursos.stream()
	    	.filter(c -> c.getAlunos() >= 100)
	    	.forEach(c -> System.out.println(c.getNome()));
	    
	    cursos.stream()
    	.filter(c -> c.getAlunos() >= 100)
    	.map(c -> c.getAlunos())
    	.forEach(System.out::println);
	    
	    System.out.println("Soma: " + cursos.stream()
	    		.filter(c -> c.getAlunos() >= 100)
	    		.mapToInt(Curso::getAlunos)
	    		.sum());
	    
	    cursos.stream()
    	.filter(c -> c.getAlunos() >= 1002)
    	.findAny()
    	.ifPresent(c-> System.out.println(c.getNome()));
	    
	    Optional<Curso> opCurso =  cursos.stream()
    	.filter(c -> c.getAlunos() >= 100)
    	.findAny();
	    System.out.println("OPTIONAL: " + opCurso.get().getNome());
	    
	    List<Curso> cursos2 = cursos.stream()
    	.filter(c -> c.getAlunos() >= 10)
    	.collect(Collectors.toList());
	    cursos2.forEach(c -> System.out.println(c.getNome()));
	    
//	    map
	    Map<String, Integer> map = cursos.stream()
	        	.filter(c -> c.getAlunos() >= 100)
	        	.collect(Collectors.toMap(
	        			c -> c.getNome(), c -> c.getAlunos()));
	    System.out.println(map);
	    
//	    roda em paralelo
	    cursos.parallelStream()
	        	.filter(c -> c.getAlunos() >= 100)
	        	.collect(Collectors.toMap(
	        			c -> c.getNome(), c -> c.getAlunos()))
	        	.forEach((nome, aluno) -> System.out.println(nome + " tem " + aluno + " alunos."));
	    
	    
	}
}
