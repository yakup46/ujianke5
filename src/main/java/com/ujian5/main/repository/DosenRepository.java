package com.ujian5.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.ujian5.main.entity.Dosen;

public interface DosenRepository extends CrudRepository<Dosen, Long> {
	
	public Dosen findById(long id);
	public Dosen findByNamaDosen(String name);

}
