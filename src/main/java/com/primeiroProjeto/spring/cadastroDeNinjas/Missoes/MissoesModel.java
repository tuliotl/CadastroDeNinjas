package com.primeiroProjeto.spring.cadastroDeNinjas.Missoes;

import com.primeiroProjeto.spring.cadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

// Entity tranformar uma class em uma entidade no BD
// Só temos acesso ao entity quando baixamos o SpringBoot JPA
@Entity


@Table (name = "tb_missoes") // Cria uma tabela e podemos criar tambem o nome da tabela

@NoArgsConstructor // Cria um construtor vazio

@AllArgsConstructor // Cria um construtor com todos os parametos

@Data // Cria todos os getts e setts

public class MissoesModel {

    // ID usado para o java conseguir diferenciar cada usuario no BD
    // Vai criar na sequencia até o infinito de IDs no BD, começando em 1
    @Id
    // Gera sequencialmente o id no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String difuculdade;

    // @OneToMany uma missao para varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
