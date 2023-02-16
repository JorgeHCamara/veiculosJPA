import br.com.fiap.teste.repository.VeiculoRepository;
import br.com.fiap.teste.view.VeiculoView;

public class Main {

    public static void main(String[] args) {

        var repoVeiculo = new VeiculoRepository();

        var veiculo = VeiculoView.form();

        repoVeiculo.save(veiculo);

    }

}
