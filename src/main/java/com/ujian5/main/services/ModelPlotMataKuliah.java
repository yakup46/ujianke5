package com.ujian5.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ujian5.main.entity.PlotMataKuliah;
import com.ujian5.main.repository.PlotMataKuliahRepository;

@Service
public class ModelPlotMataKuliah implements ModelPlotMataKuliahInterface {
	
	@Autowired
	PlotMataKuliahRepository plotmatkulRepo;

	@Override
	public List<PlotMataKuliah> getAllPlotMataKuliah() {
		// TODO Auto-generated method stub
		return (List<PlotMataKuliah>) this.plotmatkulRepo.findAll();
	}

	@Override
	public PlotMataKuliah addPlotMataKuliah(PlotMataKuliah plotMatkul) {
		// TODO Auto-generated method stub
		return this.plotmatkulRepo.save(plotMatkul);
	}

	@Override
	public PlotMataKuliah getPlotMataKuliahById(long id) {
		// TODO Auto-generated method stub
		return this.plotmatkulRepo.findById(id);
	}

	@Override
	public void deletePlotMataKuliah(long id) {
		// TODO Auto-generated method stub
		this.plotmatkulRepo.deleteById(id);
	}

}
