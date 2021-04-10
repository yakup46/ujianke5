package com.ujian5.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.ujian5.main.entity.Mahasiswa;

public interface MahasiswaRepository extends CrudRepository<Mahasiswa, Long> {
	
	public Mahasiswa findById(long id);
	public Mahasiswa findByNamaMahasiswa(String name);
	
}
