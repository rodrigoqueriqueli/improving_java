package estrutura_topicos;

public class Main_0002 {

	public static void main(String[] args) {
		// Exercicio01 aula 57 - Funções String
		
		String original  = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim(); //retirar os espaços nas laterais
		String s04 = original.substring(2); //pegar strins apartir da posição 2
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');//troca o a pelo x
		String s07 = original.replace("abc", "xy");//troca a subtring abc por xy
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("Original: -"+original+"-");
		System.out.println("toLowerCase: -"+s01+"-");
		System.out.println("toUpperCase: -"+s02+"-");
		System.out.println("trim: -"+s03+"-");
		System.out.println("substring(02): -"+s04+"-");
		System.out.println("substring(02,09): -"+s05+"-");
		System.out.println("substring(a, x): -"+s06+"-");
		System.out.println("substring(abc, xy): -"+s07+"-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		
	}

}
