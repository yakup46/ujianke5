package com.ujian5.main.services;

import java.util.List;

import com.ujian5.main.entity.Mahasiswa;


public interface ModelMahasiswaInterface {
	
	public List<Mahasiswa> getAllMahasiswa();
	public Mahasiswa getMahasiwaByName(String name);
	
	public Mahasiswa addMahasiswa (Mahasiswa mahasiswa);
	public Mahasiswa getMahasiswaById(long id);
	public void deleteMahasiswa(long id);
	

}
