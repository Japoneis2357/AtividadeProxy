package main;

import java.util.List;

public interface IProduto {
    List<String> obterDadosProduto();
    List<Float> obterEstoque(Funcionario funcionario);
}
