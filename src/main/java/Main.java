import br.com.fiap.teste.model.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();

        veiculo.setNome(JOptionPane.showInputDialog("Nome do veículo:"))
                .setDescricao(JOptionPane.showInputDialog("Descrição do veículo:"));

        veiculo.setPreco(new BigDecimal(JOptionPane.showInputDialog("Preço do veículo: R$")));

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(veiculo);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

}
