package com.ujian5.main.services;

import java.util.List;

import com.ujian5.main.entity.Soal;

public interface ModelSoalInterface {
	
	public List<Soal> getAllSoal();
	public Soal getSoalByName(String name);
	public Soal addSoal(Soal Soal);
	public Soal getSoalById(long id);
	public void deleteSoal(long id);

}