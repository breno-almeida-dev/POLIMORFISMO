package pessoas;

/*
 * Essa sub classe Alunos extende a super classe abstrata MembroUniversidade.
 * 
 * Quando é criado um objeto desta subclasse, o objeto criado representa a mensagem
 * de um professor para um aluno.
 */
public class Professores extends MembroUniversidade {
	
	/*
	 * Um construtor vazio para que seja criado o objeto da classe sem parâmetros.
	 * Deste modo os setters da super classe são utilizados para atribuir os 
	 * valores dos atributos posteriormente. 
	 */
	public Professores() {
	}
	
	/*
	 * Construtor que define os parâmetros vindos da super classe.
	 * utiliza o super() dentro do construtor para passar os parâmetros
	 * para o construtor da super classe.
	 * 
	 * Assim as inicializando e atribuindo os valores através dos Setters.
 	 */
	public Professores(String nomeRemetente, String nomeDestinatario, String assuntoEmail, String mensagemEmail) {
		super(nomeRemetente, nomeDestinatario, assuntoEmail, mensagemEmail);
	}
	
	/*
	 * Esse é o método que cria a String com o modelo de email. Esse método
	 * utiliza o mesmo nome do método criado na super classe, e utiliza
	 * o @Override para sobrescreve-lo, para assim retornar a String.
	 * 
	 * Dentro da String, para retornar os valores, é utilizado os Getters.
	 * Deste modo preserva a segurança e controle de acesso aos valores dos
	 * atributos vindos da super classe.
	 */
	@Override
	public String enviarEmail() {
		return
				"Remetente: " + getNomeRemetente() + "\n" +
				"Email Remetente: " + getEmailRemetente() + "\n" +
				"Destinatário: " + getNomeDestinatario() + "\n" +
				"Email Destinatário: " + getEmailDestinatario() + "\n" +
				"Assunto: " + getAssuntoEmail() + "\n" + 
				"Olá Aluno " + getNomeDestinatario() + "!\n" +
				getMensagemEmail();
	}
}
