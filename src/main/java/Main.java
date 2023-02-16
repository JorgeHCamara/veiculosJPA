import br.com.fiap.teste.repository.VeiculoRepository;
import br.com.fiap.teste.view.VeiculoView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        var repoVeiculo = new VeiculoRepository();

        var veiculo = VeiculoView.form();

        repoVeiculo.save(veiculo);

        var idVeiculo = VeiculoView.formFindById();

        System.out.println(repoVeiculo.findById(idVeiculo));
    }

}
