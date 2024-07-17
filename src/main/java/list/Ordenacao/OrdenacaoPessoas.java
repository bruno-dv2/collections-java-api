package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa (String nome, int idade, double altura) {
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Bruno", 28, 1.70);
        ordenacaoPessoas.adicionarPessoa("Sabrina", 27, 1.55);
        ordenacaoPessoas.adicionarPessoa("Davi", 2, 0.65);
        ordenacaoPessoas.adicionarPessoa("Ravi", 2, 0.70);
        ordenacaoPessoas.adicionarPessoa("Estrela", 5, 0.20);

        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println(ordenacaoPessoas.pessoasList);
    }

}
