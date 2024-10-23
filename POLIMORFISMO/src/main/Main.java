package main;

/*
 * Importa o pacote "pessoas" e todas as sua classes.
 */
import pessoas.*;

public class Main {

	public static void main(String[] args) {

		/*
		 * Cria o objeto da classe Alunos, pois quem irá mandar a mensagem é um aluno para um professor.
		 * Utiliza os setters para enviar os valores dos .
		 * Logo em seguida, para mostrar as informações no terminal, no System.out é passado que será
		 * usado o objeto da classe Aluno para acionar o método enviarEmail().
		 */
		Alunos aluno1 = new Alunos();
		aluno1.setNomeRemetente("Stevie Ray Vaughan");
		aluno1.setNomeDestinatario("Eddie Van Halen");
		aluno1.setAssuntoEmail("Polimorfismo.");
		aluno1.setMensagemEmail("Poderia me tirar algumas dúvidas? Estou com dúvidas sobre a aula passada.");
		System.out.println(aluno1.enviarEmail());
		
		/*
		 * Quebra de linhas para melhorar a legibilidade da saída do terminal.
		 */
		System.out.println();
		System.out.println();
		
		/*
		 * Cria o objeto da classe Professores, pois quem irá enviar a mensagem será um professor para um aluno.
		 * Utiliza setters para enviar os valores dos atributos.
		 * Em seguida expecifíca que o objeto criado e seus valores será usado para acionar o método
		 * enviarEmail() para apresentar as informações no terminal.
		 */
		Professores professor1 = new Professores();
		professor1.setNomeRemetente("Jimi Hendrix");
		professor1.setNomeDestinatario("Randy Rhoads");
		professor1.setAssuntoEmail("Herança.");
		professor1.setMensagemEmail("Você está estudando Herança?");
		System.out.println(professor1.enviarEmail());
	}
}