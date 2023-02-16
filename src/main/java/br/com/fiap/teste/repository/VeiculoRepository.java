package br.com.fiap.teste.repository;

import br.com.fiap.teste.model.Veiculo;

public class VeiculoRepository extends Repository {

    public VeiculoRepository(){
        super();
    }

    public void save(Veiculo veiculo) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(veiculo);
        this.entityManager.getTransaction().commit();
        this.close();
    }

}
