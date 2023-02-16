package br.com.fiap.teste.model;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "VEICULOS_JPA")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;

    public Veiculo() {

    }

    public Long getId() {
        return id;
    }

    public Veiculo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Veiculo setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Veiculo setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Veiculo setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Veiculo{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", descricao='").append(descricao).append('\'');
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }
}
