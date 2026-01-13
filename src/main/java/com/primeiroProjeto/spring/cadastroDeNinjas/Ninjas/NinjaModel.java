package com.primeiroProjeto.spring.cadastroDeNinjas.Ninjas;

import com.primeiroProjeto.spring.cadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity tranformar uma class em uma entidade no BD
// Só temos acesso ao entity quando baixamos o SpringBoot JPA
@Entity

@Table(name = "tb_cadastro") // Cria uma tabela e podemos criar tambem o nome da tabela

@NoArgsConstructor // Cria um construtor vazio

@AllArgsConstructor // Cria um construtor com todos os parametos

@Data // Cria todos os getts e setts
public class NinjaModel {

    @Id // ID usado para o java conseguir diferenciar cada usuario no BD
    // Vai criar na sequencia até o infinito de IDs no BD, começando em 1
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Long não precisa ser posto no contrutor, o java la usa ele no BD
    private String nome;

    @Column(unique = true) // E-mail so poder ser email unico, so pode ser usado para um usuario
    private String email;

    private int idade;

    @ManyToOne // @ManyToOne um ninja tem uma unica missão
    @JoinColumn(name = "missoes_id") // Foreing key ou chave estrangeira
    private MissoesModel missoes;

}
