package com.ujian5.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.ujian5.main.entity.Soal;

public interface SoalRepository extends CrudRepository<Soal, Long> {
	
	public Soal findById(long id);
	public Soal findByNamaSoal(String name);

}
