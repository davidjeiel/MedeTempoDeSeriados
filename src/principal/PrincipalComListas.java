package principal;

import modelos.Filme;
import modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas
{
    private String apikey;
    public static void main(String[] args) {
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

        // Criando e iterando com listas
        System.out.println();
        ArrayList<Titulo> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("O tamanho da lista de filmes é "+listaDeFilmes.size());
        System.out.println("O primeiro filme listado é : "+ listaDeFilmes.get(0).getNome());

        System.out.println();
        for (Titulo item: listaDeFilmes) {
            System.out.println(item.getNome());
        }

        System.out.println();
        ArrayList<String> listaArtistas = new ArrayList<String>();
                          listaArtistas.add("Mel Gibson");
                          listaArtistas.add("Silvester Stallone");
                          listaArtistas.add("Arnold Shwarznegger");
        System.out.println("Lista desordenada:");
        System.out.println(listaArtistas);
        System.out.println("Lista ordenada:");
        Collections.sort(listaArtistas);
        System.out.println(listaArtistas);


    }
}
