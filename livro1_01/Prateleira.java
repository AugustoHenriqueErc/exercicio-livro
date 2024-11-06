import java.util.ArrayList;

/**
 * Representa uma prateleira da biblioteca.
 * 
 * Para facilitar a localização, a posição
 * das prateleiras é registrada em termos
 * de linha e posição na linha.
 * 
 * A biblioteca possui várias linhas e
 * cada linha cabe várias prateleiras.
 * 
 * @author Daniel Conrado 
 * @version 2023
 */
public class Prateleira
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int linha;
    private String posição;
    private String gênero;
    private ArrayList<Livro> livros;
    private int capacidade;

    /**
     * Construtor para objetos da classe Prateleira
     */
    public Prateleira(int quantidadeMaxLivros)
    {
        linha = 0;
        posição = "<não especificado>";
        gênero = "<não especificado>";
        livros = new ArrayList<>();
        capacidade = quantidadeMaxLivros;
    }

    /**
     * Adiciona um livro à prateleira, se couber.
     */
    public void adicionarLivro(Livro livro)
    {
        if (livros.size() == capacidade) {
            System.out.println("Não cabem mais livros nesta prateleira.");
        } else {
            livros.add(livro);
        }
    }
    
    /**
     * Retorna o número de livros atualmente nesta prateleira.
     */
    public int númeroDeLivros()
    {
        return livros.size();
    }
    
    /**
     * Define a linha em que esta prateleira está localizada.
     */
    public void setLinha(int númeroDaLinha)
    {
        linha = númeroDaLinha;
    }
    
    /**
     * Define em que posição na linha está a prateleira.
     */
    public void setPosição(String posiçãoNaLinha)
    {
        posição = posiçãoNaLinha;
    }
    
    /**
     * Define o gênero dos livros desta prateleira
     */
    public void setGenero(String gêneroDaPrateleira)
    {
        gênero = gêneroDaPrateleira;
    }
    
    /**
     * Imprime os detalhes desta prateleira,
     * incluindo a relação de livros.
     */
    public void imprimirRelaçãoDeLivros()
    {
        String sLinha = linha == 0 ? "<não informada>" : ""+linha;
        
        System.out.println("== Prateleira " + sLinha + "-" + posição);
        System.out.println("Gênero: " + gênero);
        System.out.println("Livros:");
        for (Livro livro : livros)
        {
            livro.imprimir();
        }
        System.out.println("Número de livros: " + númeroDeLivros());
    }
}
