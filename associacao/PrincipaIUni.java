package relacao.associacao;

public class PrincipaIUni {

	public static void main(String[] args) {
		
		Universidade universidade =new Universidade("USP");
		Estudante estudante=new Estudante("João",universidade);
		
		System.out.println ("Estudante" +estudante.getNome() + "\n Universidade:" + universidade.getNome());
		

	}

}
