package com.ujian5.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.ujian5.main.entity.Pertanyaan;

public interface PertanyaanRepository extends CrudRepository<Pertanyaan, Long> {

	public Pertanyaan findById(long id);
	public Pertanyaan findByNamaPertanyaan(String name);

}
