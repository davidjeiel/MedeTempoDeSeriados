import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

import java.util.ArrayList;

public class Principal
{
    public static void main(String[] args)
    {
        // Criando um filme
        Filme meuFilme = new Filme("Clube dos 7");
              meuFilme.setAnoDeLancamento(1997);
              meuFilme.setDuracaoEmMinutos(220);
              meuFilme.setIncluidoNoPlano(true);

        System.out.println();
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println();
        System.out.println("Soma de avaliações: "+meuFilme.getSomaAvaliacoes());
        System.out.println("Total de avaliações: "+meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: "+meuFilme.getAvaliacaoMedia());

        // Criando outro filme
        Filme outroFilme = new Filme("Clube da Luta");
        outroFilme.setAnoDeLancamento(1995);
        outroFilme.setDuracaoEmMinutos(120);
        outroFilme.setIncluidoNoPlano(true);

        outroFilme.avalia(8);
        outroFilme.avalia(9);
        outroFilme.avalia(10);

        System.out.println();
        outroFilme.exibeFichaTecnica();

        // Criando série
        Serie minhaSerie = new Serie();
              minhaSerie.setNome("Game Of Thrones");
              minhaSerie.setAnoDeLancamento(2007);
              minhaSerie.setIncluidoNoPlano(false);
              minhaSerie.setTemporada(8);
              minhaSerie.setEpisodiosPorTemporada(8);
              minhaSerie.setMinutosPorTemporada(400);
              minhaSerie.setAtiva(false);
              minhaSerie.setMinutosPorEpisodio(50);

        System.out.println();
        minhaSerie.exibeFichaTecnica();
        System.out.println("Quanto tempo para maratonar? " + minhaSerie.getDuracaoEmMinutos());

        // Exibindo o método de cálculo das avaliações
        System.out.println();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(minhaSerie);
        calculadora.inclui(meuFilme);
        System.out.println("O tempo total é : ");
        System.out.println(calculadora.getTempoTotal());

        // Testando o filtro de recomendações
        System.out.println();
        FiltroRecomendacao status = new FiltroRecomendacao();
        status.filtra(meuFilme);

        // Cadastrando episódios
        System.out.println();
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(5000);
        status.filtra(episodio);

        // Criando e iterando com listas
        System.out.println();
        ArrayList<Titulo> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("O tamanho da lista de filmes é "+listaDeFilmes.size());
        System.out.println("O primeiro filme listado é : "+ listaDeFilmes.get(0).getNome());


    }
}
