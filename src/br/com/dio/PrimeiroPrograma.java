package br.com.dio;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 380);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("três mais cinco é : " + (a+b));*/
    }
}
class Livro {
    private String nome;
    private Integer numPags;


    public Livro(String nome, Integer numPags) {
        this.nome = nome;
        this.numPags = numPags;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPags() {
        return numPags;
    }

    public void setNumPags(Integer numPags) {
        this.numPags = numPags;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPags=" + numPags +
                '}';
    }
}