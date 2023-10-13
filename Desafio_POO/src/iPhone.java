public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String marca;
    private String modelo;
    private String cor;
    private String numeroSerie;

    // Construtor

    public iPhone(String marca, String modelo, String cor, String numeroSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.numeroSerie = numeroSerie;
    }

    // M�todos da interface ReprodutorMusical

    @Override
    public void tocar() {
        // Implementa��o
    }

    @Override
    public void pausar() {
        // Implementa��o
    }

    @Override
    public void selecionarMusica() {
        // Implementa��o
    }

    // M�todos da interface AparelhoTelefonico

    @Override
    public void ligar() {
        // Implementa��o
    }

    @Override
    public void atender() {
        // Implementa��o
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementa��o
    }

    // M�todos da interface NavegadorInternet

    @Override
    public void exibirPagina() {
        // Implementa��o
    }

    @Override
    public void adicionarNovaAba() {
        // Implementa��o
    }

    @Override
    public void atualizarPagina() {
        // Implementa��o
    }
}
