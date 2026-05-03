package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);
        Livro livro = new Livro("Metamorfose", 300);
        System.out.println(livro.toString());
    }
}
