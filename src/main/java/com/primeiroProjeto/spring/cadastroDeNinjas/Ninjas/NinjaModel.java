package com.primeiroProjeto.spring.cadastroDeNinjas.Ninjas;

import com.primeiroProjeto.spring.cadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

// Entity tranformar uma class em uma entidade no BD
// Só temos acesso ao entity quando baixamos o SpringBoot JPA
@Entity

// Cria uma tabela e podemos criar tambem o nome da tabela
@Table(name = "tb_cadastro")

public class NinjaModel {

    @Id // ID usado para o java conseguir diferenciar cada usuario no BD
    // Vai criar na sequencia até o infinito de IDs no BD, começando em 1
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Long não precisa ser posto no contrutor, o java la usa ele no BD

    private String nome;

    private String email;

    private int idade;

    @ManyToOne // @ManyToOne um ninja tem uma unica missão
    @JoinColumn(name = "missoes_id") // Foreing key ou chave estrangeira
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
