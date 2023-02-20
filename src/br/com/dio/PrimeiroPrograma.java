package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
    /*    int a = 3;
        int b = 7;

        System.out.println("Hello World é " + (a+b));*/

        Gato gato = new Gato();
        System.out.println(gato);

        Livros livro1 = new Livros("O Problema dos 3 Copos", 300);
        System.out.println(livro1);
    }


}


class Livros{
    private String nome;
    private Integer numpaginas;

    public Livros(String nome, Integer numpaginas) {
        this.nome = nome;
        this.numpaginas = numpaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(Integer numpaginas) {
        this.numpaginas = numpaginas;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", numpaginas=" + numpaginas +
                '}';
    }
}