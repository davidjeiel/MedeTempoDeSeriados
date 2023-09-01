package modelos;

public class Titulo
{
    private String nome;
    private  int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private double avaliacaoMedia;

    public void exibeFichaTecnica()
    {
        System.out.println("nome: " + nome);
        System.out.println("ano: " + anoDeLancamento);
        System.out.println("minutos: " + duracaoEmMinutos);
    }

    public void avalia(double nota)
    {
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
        avaliacaoMedia = somaAvaliacoes / totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes()
    {
        return totalDeAvaliacoes;
    }

    public double getSomaAvaliacoes()
    {
        return somaAvaliacoes;
    }

    public double getAvaliacaoMedia()
    {
        return avaliacaoMedia;
    }

    public int getDuracaoEmMinutos()
    {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
}
