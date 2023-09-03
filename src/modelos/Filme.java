package modelos;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel
{
    private String diretor;

    /** Construtor da classe que recebe o nome do filme ao ser criado **/
    public Filme(String nome) {
        this.setNome(nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) getAvaliacaoMedia() / 2;
    }
}
