package entities117;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //Usou o private static pra transformar numa constante e não precisar declarar sempre
 	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	//atributos com associações:
	private List<Comment> comments = new ArrayList<>(); //implementar associação
	
	public Post() {
		
	}
	
	//lista não coloca no construtor
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {  //Método recebendo um comentário como argumento
		comments.add(comment); //adicionando comentário que veio como argumento
	} 
	
	public void removeComment(Comment comment) {  //Método recebendo um comentário como argumento
		comments.remove(comment); //adicionando comentário que veio como argumento
	} 
	
	//quando temos uma coleção (lista) não fazemos o método set
	
	public String toString() {
		StringBuilder sb = new StringBuilder();//tipo do objeto StringBuilder
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n"); //argumento, momento do post
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comment c : comments) { //pra cada item c na lista de comentário do post
			sb.append(c.getText() + "\n");
		}
		return sb.toString(); //aqui converte o StringBuilder para String
		
	}
	
}
