
public class ParametrosInvalidosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mensagem;

	public ParametrosInvalidosException(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

}
