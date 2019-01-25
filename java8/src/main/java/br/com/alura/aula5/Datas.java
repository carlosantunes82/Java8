package br.com.alura.aula5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		 LocalDate hoje = LocalDate.now();
	     System.out.println(hoje);
	     
	     LocalDate olimpiadas = LocalDate.of(2020, Month.JUNE, 06);
	     int anos = olimpiadas.getYear() - hoje.getYear();
	     System.out.println(anos);
	     
	     Period periodo = Period.between(hoje, olimpiadas);
	     System.out.println(periodo.getUnits());
	     
	     LocalDate proximasOlimpiadas = olimpiadas.plusYears(4);
	     System.out.println(proximasOlimpiadas);
	     
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     String dataFormatada = proximasOlimpiadas.format(formatter);
	     System.out.println(dataFormatada);
	     
//	     ------------------------
	     
	     DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
	     
	     LocalDateTime agora = LocalDateTime.now();
	     System.out.println(agora.format(formatterTime));
	     
//	     YearMonth mes = 
	     
	     LocalTime intervalo = LocalTime.of(15, 30);
	     System.out.println(intervalo);//bbbb
	     
	     
	}
}
