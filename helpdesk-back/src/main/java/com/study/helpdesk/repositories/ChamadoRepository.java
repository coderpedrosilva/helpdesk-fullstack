package com.study.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
