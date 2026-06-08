package main;

import java.util.Arrays;
import java.util.List;

public class Produto implements IProduto {

    private Integer codigo;
    private String nome;
    private String categoria;
    private Float quantidade;
    private Float preco;

    public Produto(int codigo) {
        this.codigo = codigo;
        Produto objeto = BD.getProduto(codigo);
        this.nome = objeto.nome;
        this.categoria = objeto.categoria;
        this.quantidade = objeto.quantidade;
        this.preco = objeto.preco;
    }

    public Produto(Integer codigo, String nome, String categoria, Float quantidade, Float preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public List<String> obterDadosProduto() {
        return Arrays.asList(this.nome, this.categoria);
    }

    @Override
    public List<Float> obterEstoque(Funcionario funcionario) {
        return Arrays.asList(this.quantidade, this.preco);
    }
}
