package pessoas;

/*
 * Define essa super classe como abstrata para servir como estrutura para suas sub classes
 * que irão sobrescrever os métodos dessa classe.
 * Possui seus atributos como provados para serem acessados diretamente apenas de dentro da classe.
 */
public abstract class MembroUniversidade {
	private String nomeRemetente;
	private String nomeDestinatario;
	private String assuntoEmail;
	private String mensagemEmail;
	
	/*
	 * Um construtor vazio para criar um objeto sem parâmetros, para instanciar os atributos
	 * através dos setters posteriormente.
	 */
	public MembroUniversidade() {
	}
	
	/*
	 * Método construtor da classe que define os parâmetros necessários para a serem informados
	 * para serem utilizados nos métodos da classe.
	 */
	public MembroUniversidade(String nomeRemetente, String nomeDestinatario, String assuntoEmail, String mensagemEmail) {
		this.nomeRemetente = nomeRemetente;
		this.nomeDestinatario = nomeDestinatario;
		this.assuntoEmail = assuntoEmail;
		this.mensagemEmail = mensagemEmail;
	}
	
	/*
	 * Esse método concreto serve para criar um email, tanto para o remetente quanto para o destinatário.
	 * Além disso ele é definido sem modificador de acesso para ser acessado apenas por classes de dentro 
	 * deste pacote. 
	 * 
	 * Dentro do método é criado um array onde, a cada espaço desse array, é armazenado cada nome do nome
	 * completo, usando o split(" ") para encontrar os espaços do nome.
	 * 
	 * Logo em seguida é criada uma "String" para armazenar o primeiro e o último nome, localizado no primeiro espaço
	 * do array do primeiro nome e o último no último espaço do array que para ser localizado utiliza o
	 * array completo e diz que está armazenado no comprimento do array menos 1.
	 * E ainda utiliza o método "toLowerCase()" para passar todas as letras para minúsculo.
	 * 
	 * Por fim retorna o email seguindo a estrutura da "String" de retorno. 
	 */
    String emailPessoa(String nomeCompleto) {
    	String[] partesNome = nomeCompleto.split(" ");
    	String nome = partesNome[0].toLowerCase();
    	String sobrenome = partesNome[partesNome.length - 1].toLowerCase();
    	return nome + "." + sobrenome + "@dominio.com";
    }
    
    /*
     * Esse método abstrato serve para ser sobrescrito nas sub classes que extende essa super classe.
     * Servindo apenas como estrutura e método que irá ser os dados do email enviado.
     * 
     * Além disso ele é definido sem modificador de acesso para ser acessado apenas por classes de dentro 
	 * deste pacote.
	 * 
     */
    abstract String enviarEmail();
    
    /*
     * Setters que servem para instanciar os valores dos atributos privados desta classe.
     */
    public void setNomeRemetente(String nomeRemetente) {
    	this.nomeRemetente = nomeRemetente;
    }
    
    public void setNomeDestinatario(String nomeDestinatario) {
    	this.nomeDestinatario = nomeDestinatario;
    }
    
    public void setAssuntoEmail(String assuntoEmail) {
    	this.assuntoEmail = assuntoEmail;
    }
    
    public void setMensagemEmail(String mensagemEmail) {
    	this.mensagemEmail = mensagemEmail;
    }
    
    
    /*
     * Getters que retornam os valores de seus respectivos atributos.
     * Vale salientar que os getters, que retornam o email, utilizam o retorno
     * do método que cria o email, passando o nome a ser utilizado de acordo
     * com qual pessoa o getter representa, sendo ou Remetente ou Destinatário.
     */
    String getNomeRemetente() {
    	return nomeRemetente;
    }
    
    String getEmailRemetente() {
    	return emailPessoa(nomeRemetente);
    }
    
    String getNomeDestinatario() {
    	return nomeDestinatario;
    }
    
    String getEmailDestinatario() {
    	return emailPessoa(nomeDestinatario);
    }
    
    String getAssuntoEmail() {
    	return assuntoEmail;
    }
    
    String getMensagemEmail() {
    	return mensagemEmail;
    }
}
