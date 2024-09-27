
public class Carro {

    private final String MARCA;
    private final String MODELO;
    private final int ANO;
    private final String COR;

    /**
     * Construtor da classe Carro.
     *
     * @param marca  A marca do carro.
     * @param modelo O modelo do carro.
     * @param ano    O ano de fabricação do carro.
     * @param cor    A cor do carro.
     */

    public Carro(String marca, String modelo, int ano, String cor) {
        this.MARCA = marca;
        this.MODELO = modelo;
        this.ANO = ano;
        this.COR = cor;
    }

    /**
     * Exibe os detalhes do carro, mostrando suas propriedades.
     * <p>
     * As propriedades exibidas são:
     *
     * <ul>
     *   <li>Marca:     {@link #MARCA}</li>
     *   <li>Modelo:    {@link #MODELO}</li>
     *   <li>Ano:       {@link #ANO}</li>
     *   <li>Cor:       {@link #COR}</li>
     * </ul>
     */

    public void exibirDetalhes() {
        System.out.printf("""
                    Marca:   %s
                    Modelo:  %s
                    Ano:     %d
                    Cor:     %s"""
                ,MARCA, MODELO, ANO, COR);
    }

    /**
     * Método principal para executar o programa e testar a classe Carro.
     *
     * @param args Argumentos da linha de comando.
     */

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Nissan", "Livina", 2013, "Vermelho");
        meuCarro.exibirDetalhes();
    }
}