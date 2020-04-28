package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Aula99 {

	public static void main(String[] args) throws ParseException {
		// Aula 99 manipulação de datas
		
		/*Classe SimpleDateFormat define formados de conversão entre date e string (deve ser armazenar em UTC)
		Classe Instant função parse
		
		*/
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); //declarando um objeto do tipo SimpleDateFormat, variavel com nome de sdf1 >> iniciando a variavel com o new SimpleDateFormat
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
	
		Date x1 = new Date();//instanciar uma data com instante atual. Criar data com hora atual
		Date x2 = new Date(System.currentTimeMillis()); //pega o instante do sistema converte pra milisegundos e cria data com esse valor
		Date x3 = new Date(0L); //passando como entrada zero milisegundos (Como estamos no BR, tres horas antes do GMT)
		Date x4 = new Date(1000L * 60L * 60L * 5); //5000 milisegundos em relação a meia noite de 1/01/1970
		
		Date y1 = sdf1.parse("25/06/2018"); //criar a variavel y1 pra receber a variavel sdf1.parse (operação parse recebe string respeito uma regra e converte pra data
		Date y2 = sdf2.parse("25/06/2018 15:42:07"); //criou outro objeto do tipo date com os valores passados a frente na inicialização
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		
		System.out.println(y1);
		System.out.println(y2);
		
		
		System.out.println("----------------------");
		System.out.println("x1: "+x1);
		System.out.println("x2: "+x2);
		System.out.println("x3: "+x3);
		System.out.println("x4: "+x4);
		System.out.println("y1: "+y1);
		System.out.println("y2: "+y2);
		System.out.println("y3: "+y3);
		System.out.println("----------------------");
		System.out.println("x1: "+sdf2.format(x1));
		System.out.println("x2: "+sdf2.format(x2));
		System.out.println("x3: "+sdf2.format(x3));
		System.out.println("x4: "+sdf2.format(x4));
		System.out.println("y1: "+sdf2.format(y1));
		System.out.println("y2: "+sdf2.format(y2));
		System.out.println("y3: "+sdf2.format(y3));
		System.out.println("----------------------");
		System.out.println("x1: "+sdf3.format(x1));
		System.out.println("x2: "+sdf3.format(x2));
		System.out.println("x3: "+sdf3.format(x3));
		System.out.println("x4: "+sdf3.format(x4));
		System.out.println("y1: "+sdf3.format(y1));
		System.out.println("y2: "+sdf3.format(y2));
		System.out.println("y3: "+sdf3.format(y3));
		
	}

}
