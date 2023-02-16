package br.com.fiap.teste.view;

import br.com.fiap.teste.model.Veiculo;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class VeiculoView {

    private VeiculoView() {

    }

    public static Veiculo form() {

        Veiculo veiculo = new Veiculo();

        String nome = JOptionPane.showInputDialog("Nome do veículo:");
        String descricao = JOptionPane.showInputDialog("Descrição do veículo:");
        BigDecimal preco = new BigDecimal(JOptionPane.showInputDialog("Preço do produto: R$"));

        return veiculo.setNome(nome).setDescricao(descricao).setPreco(preco).setFabricacao(LocalDate.now());

    }

    public static Long formFindById(){
        return Long.valueOf(JOptionPane.showInputDialog("Informe o ID do veículo:"));
    }

}
