package com.ujian5.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ujian5.main.entity.Mahasiswa;
import com.ujian5.main.repository.MahasiswaRepository;


@Service
public class ModelMahasiswa implements ModelMahasiswaInterface{
	
	@Autowired
	MahasiswaRepository mahasiswaRepo;

	@Override
	public List<Mahasiswa> getAllMahasiswa() {
		// TODO Auto-generated method stub
		return (List<Mahasiswa>) this.mahasiswaRepo.findAll();
	}

	@Override
	public Mahasiswa getMahasiwaByName(String name) {
		// TODO Auto-generated method stub
		return this.mahasiswaRepo.findByNamaMahasiswa(name);
	}

	@Override
	public Mahasiswa addMahasiswa(Mahasiswa mahasiswa) {
		// TODO Auto-generated method stub
		return this.mahasiswaRepo.save(mahasiswa);
	}

	@Override
	public Mahasiswa getMahasiswaById(long id) {
		// TODO Auto-generated method stub
		return this.mahasiswaRepo.findById(id);
	}

	@Override
	public void deleteMahasiswa(long id) {
		// TODO Auto-generated method stub
		this.mahasiswaRepo.deleteById(id);
	}

	
}