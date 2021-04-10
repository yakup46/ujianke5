package com.ujian5.main.services;

import java.util.List;

import com.ujian5.main.entity.Dosen;


public interface ModelDosenInterface {
	
	public List<Dosen> getAllDosen();
	public Dosen getDosenByName(String name);
	
	public Dosen addDosen (Dosen dosen);
	public Dosen getDosenById(long id);
	public void deleteDosen(long id);

}
