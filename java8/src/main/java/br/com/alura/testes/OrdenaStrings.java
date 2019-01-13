package br.com.alura.testes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import ch.qos.logback.core.net.SyslogOutputStream;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = Arrays.asList("alura online", "edotora casa do codigo", "caelum");
		Collections.sort(palavras);
		
//		palavras.forEach(s -> System.out.println(s));
//		
//		palavras.sort(( s1, s2) ->	Integer.compare(s1.length(), s2.length()));
		
//		Consumer<String> impressor = s -> System.out.println(s);
//		palavras.forEach(impressor);
//		
		
//		System.out.println(palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length())));
		
		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		Function<String, Integer> funcao = String::length;
		Function<String, Integer> funcao2 = s -> s.length();
		
		Comparator<String> comparator = Comparator.comparing(funcao);
		palavras.sort(comparator);
		
		System.out.println(palavras);
		
		palavras.forEach(System.out::println);
		
	}
	
//class ComparadorPorTamanho implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		
//		if(s1.length() < s2.length()) {
//			return -1;
//		}if(s1.length() > s2.length()) {
//			return 1;
//		}
//		return 0;
//	}
//	
//}	
}
