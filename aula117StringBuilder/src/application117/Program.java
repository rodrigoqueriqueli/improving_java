package application117;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities117.Comment;
import entities117.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		// Aula 117 String Builder
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //instanciando um objeto date pra a partir do texto
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("WOW, that´s awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),  //instanciando o post com esses argumentos passados
				"Travelling to the New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		
		Comment c3 = new Comment("Good Night!");
		Comment c4 = new Comment("May the Force be with you!");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),  //instanciando o post com esses argumentos passados
				"Good night guys", 
				"See yout tomorrow!", 
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		


	}

}
