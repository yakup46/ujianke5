package com.ujian5.main.services;

import java.util.List;

import com.ujian5.main.entity.Pertanyaan;

public interface ModelPertanyaanInterface {
	
	public List<Pertanyaan> getAllPertanyaan();
	public Pertanyaan getPertanyaanByName(String name);
	
	public Pertanyaan addPertanyaan (Pertanyaan pertanyaan);
	public Pertanyaan getPertanyaanById(long id);
	public void deletePertanyaan (long id);

}
