package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Aula100 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date r = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(r));

		Calendar cal = Calendar.getInstance(); //istanciando o calendar
		cal.setTime(r); //chamar variavel cal, chamar operação settime, passando data que ta com nome de r. Data já está instanciada dentro do cal 
		System.out.println("-----------Obtendo o temp(minutos)----");
		
		int minutes = cal.get(Calendar.MINUTE); //vai imprimir pra mim a quantidade de minutos
		System.out.println("Minutes: " + minutes);
		int month = 1 + cal.get(Calendar.MONTH); //vai imprimir pra mim a quantidade de mês (adiciona o 1 no começo pois pro Java janeiro é mes zero)
		System.out.println("Month: "+ month);
		
		
		System.out.println("---------------------------");
		cal.add(Calendar.HOUR_OF_DAY, 4);

		r = cal.getTime();//atualizar variavel r com a data atualizada
		
		System.out.println(sdf.format(r));
	}

}
