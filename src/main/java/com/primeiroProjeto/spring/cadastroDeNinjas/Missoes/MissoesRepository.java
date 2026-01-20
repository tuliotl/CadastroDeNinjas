package com.primeiroProjeto.spring.cadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

//JPA simplifica o codigo quando estamos lidando com banco de dados criando metodos
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
