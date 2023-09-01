import calculos.CalculadoraDeTempo;
import modelos.Filme;
import modelos.Serie;

public class Principal
{
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
              meuFilme.setNome("Clube dos 7");
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

        System.out.println();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(minhaSerie);
        calculadora.inclui(meuFilme);
        System.out.println("O tempo total é : ");
        System.out.println(calculadora.getTempoTotal());

    }
}
