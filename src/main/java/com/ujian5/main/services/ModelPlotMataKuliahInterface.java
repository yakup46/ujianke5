package com.ujian5.main.services;

import java.util.List;

import com.ujian5.main.entity.PlotMataKuliah;

public interface ModelPlotMataKuliahInterface {
	
	public List<PlotMataKuliah> getAllPlotMataKuliah();
	
	public PlotMataKuliah addPlotMataKuliah (PlotMataKuliah plotMatkul);
	public PlotMataKuliah getPlotMataKuliahById(long id);
	public void deletePlotMataKuliah (long id);

}
