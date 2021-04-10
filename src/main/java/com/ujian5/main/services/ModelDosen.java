package com.ujian5.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ujian5.main.entity.Dosen;
import com.ujian5.main.repository.DosenRepository;

@Service
public class ModelDosen implements ModelDosenInterface{
	
	@Autowired
	DosenRepository dosenRepo;

	@Override
	public List<Dosen> getAllDosen() {
		// TODO Auto-generated method stub
		return (List<Dosen>) this.dosenRepo.findAll();
	}

	@Override
	public Dosen getDosenByName(String name) {
		// TODO Auto-generated method stub
		return this.dosenRepo.findByNamaDosen(name);
	}

	@Override
	public Dosen addDosen(Dosen dosen) {
		// TODO Auto-generated method stub
		return this.dosenRepo.save(dosen);
	}

	@Override
	public Dosen getDosenById(long id) {
		// TODO Auto-generated method stub
		return this.dosenRepo.findById(id);
	}

	@Override
	public void deleteDosen(long id) {
		// TODO Auto-generated method stub
		this.dosenRepo.deleteById(id);
	}
		
}