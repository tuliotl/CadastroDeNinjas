package com.primeiroProjeto.spring.cadastroDeNinjas.Missoes;

import com.primeiroProjeto.spring.cadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String difuculdade;

    // @OneToMany uma missao para varios ninjas
    @OneToMany (mappedBy = "missoes")
    private List<MissoesModel> ninjas;
}
