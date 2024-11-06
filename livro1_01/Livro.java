
/**
 * Representa um livro que pode ser armazenado
 * em uma prateleira de uma biblioteca.
 * 
 * @author Daniel Conrado 
 * @version 2023
 */
public class Livro
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String titulo;
    private String autores;
    private int ano;

    /**
     * Construtor para objetos da classe Livro.
     * 
     * Informe os autores separados por vírgula, p. ex.:
     *  Cristiane Targa, Daniel Conrado
     */
    public Livro(String tituloDoLivro, String autoresDoLivro, int anoDePublicação)
    {
        // inicializa variáveis de instância
        titulo = tituloDoLivro;
        autores = autoresDoLivro;
        ano = anoDePublicação;
    }

    /**
     * Retorna o título do livro
     */
    public String getTitulo()
    {
        return titulo;
    }
    
    
    /**
     * Muda o título deste objeto Livro.
     */
    public void mudarTitulo(String novoTitulo)
    {
        titulo = novoTitulo;
    }
    
    /**
     * retorna os autores do livro.
     */
    public String getAutores()
    {
        return autores;
    }
    
    /**
     * retorna o ano de publicação do livro.
     */
    public int getAno()
    {
        return ano;
    }
    
    /**
     * Retorna a citação do livro, para usar
     * em textos acadêmicos.
     */
    public String getCitação()
    {
        int índiceÚltimoEspaço = autores.lastIndexOf(' ');
        String sobrenome = autores.substring(índiceÚltimoEspaço + 1);
        return "(" + sobrenome.toUpperCase() + ", " + ano + ")";
    }
    
    public void imprimir()
    {
        System.out.println(titulo);
        System.out.println("\tAutor(es): " + autores);
        System.out.println("\tAno: " + ano);
        System.out.println("\tComo citar: " + getCitação());
    }
}
