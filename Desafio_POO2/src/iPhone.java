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

    // Métodos da interface ReprodutorMusical

    @Override
    public void tocar() {
        // Implementação
    }

    @Override
    public void pausar() {
        // Implementação
    }

    @Override
    public void selecionarMusica() {
        // Implementação
    }

    // Métodos da interface AparelhoTelefonico

    @Override
    public void ligar() {
        // Implementação
    }

    @Override
    public void atender() {
        // Implementação
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação
    }

    // Métodos da interface NavegadorInternet

    @Override
    public void exibirPagina() {
        // Implementação
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação
    }

    @Override
    public void atualizarPagina() {
        // Implementação
    }
}
