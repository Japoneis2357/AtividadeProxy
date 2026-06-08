package main;

import java.util.List;

import java.util.List;

public class ProdutoProxy implements IProduto {

    private Produto produto;

    public ProdutoProxy(Produto produto) {
        this.produto = produto;
    }

    @Override
    public List<String> obterDadosProduto() {
        return this.produto.obterDadosProduto();
    }

    @Override
    public List<Float> obterEstoque(Funcionario funcionario) {
        if (!funcionario.isGerente()) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        }
        return this.produto.obterEstoque(funcionario);
    }
}