package br.com.stationOneApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stationOneApi.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme,Long>{

}
