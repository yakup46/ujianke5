package com.ujian5.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ujian5.main.entity.PlotMataKuliah;
import com.ujian5.main.services.ModelDosen;
import com.ujian5.main.services.ModelMahasiswa;
import com.ujian5.main.services.ModelMataKuliah;
import com.ujian5.main.services.ModelPlotMataKuliah;
import com.ujian5.main.services.ModelSoal;

@Controller
public class PlotMataKuliahPage {
	
	@Autowired
	ModelDosen modelDosen;
	
	@Autowired
	ModelMahasiswa modelMahasiswa;

	@Autowired
	ModelMataKuliah modelMataKuliah;
	
	@Autowired
	ModelPlotMataKuliah modelPlotMataKuliah;

	@Autowired
	ModelSoal modelSoal;

	@GetMapping("/plotmatkul/view")
	public String viewIndexPlotMatkul(Model model) {
		
		model.addAttribute("listPlotMatkul",modelPlotMataKuliah.getAllPlotMataKuliah());
		model.addAttribute("active",6);
		return "plotmatkul/view_plotmatkul";
	}
	
	
	@GetMapping("/plotmatkul/add")
	public String viewAddPlotMatkul(Model model) {
		
		model.addAttribute("plotMatkul",new PlotMataKuliah());
		model.addAttribute("listDosen", modelDosen.getAllDosen());
		model.addAttribute("listMahasiswa", modelMahasiswa.getAllMahasiswa());
		model.addAttribute("listMatkul", modelMataKuliah.getAllMatkul());
		model.addAttribute("listSoal", modelSoal.getAllSoal());
		
		return "plotmatkul/add_plotmatkul";
	}
	
	@PostMapping("/plotmatkul/view")
	  public String addPlotMatkul(@ModelAttribute PlotMataKuliah plotMatkul, Model model) {
		
		this.modelPlotMataKuliah.addPlotMataKuliah(plotMatkul);
		model.addAttribute("listPlotMatkul",modelPlotMataKuliah.getAllPlotMataKuliah());
		
		return "redirect:/plotmatkul/view";
	}
	
	
	@GetMapping("/plotmatkul/update/{id}")
	public String viewUpdatePlotMatkul(@PathVariable long id, Model model) {
		
		PlotMataKuliah plotMatkul = modelPlotMataKuliah.getPlotMataKuliahById(id);
		model.addAttribute("plotMatkul", plotMatkul);
		
		return "plotmatkul/add_plotmatkul";
	}
	
	@GetMapping("/plotmatkul/delete/{id}")
	public String deletePlotMatkul(@PathVariable long id, Model model) {
		
		this.modelPlotMataKuliah.deletePlotMataKuliah(id);
		model.addAttribute("listPlotMatkul",modelMataKuliah.getAllMatkul());
		
		return "redirect:/plotmatkul/view";
	}

}