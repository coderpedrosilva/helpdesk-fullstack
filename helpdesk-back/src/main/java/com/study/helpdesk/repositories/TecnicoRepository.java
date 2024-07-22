package com.study.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
