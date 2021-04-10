package com.ujian5.main.services;

import java.util.List;

import com.ujian5.main.entity.MataKuliah;


public interface ModelMataKuliahInterface {
	
	public List<MataKuliah> getAllMatkul();
	public MataKuliah getMataKuliahByName(String name);
	
	public MataKuliah addMatkul (MataKuliah matkul);
	public MataKuliah getMatkulById(long id);
	public void deleteMatkul(long id);

}
