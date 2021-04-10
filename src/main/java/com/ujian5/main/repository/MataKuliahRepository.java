package com.ujian5.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.ujian5.main.entity.MataKuliah;

public interface MataKuliahRepository extends CrudRepository<MataKuliah, Long> {
	
	public MataKuliah findById(long id);
	public MataKuliah findByNamaMataKuliah(String name);

	
}
