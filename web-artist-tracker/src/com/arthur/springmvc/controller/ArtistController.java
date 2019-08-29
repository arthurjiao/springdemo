package com.arthur.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arthur.springmvc.dao.ArtistDao;
import com.arthur.springmvc.entity.Artist;
import com.arthur.springmvc.service.ArtistService;

@Controller
@RequestMapping("/artist")
public class ArtistController {
	//inject dao
	@Autowired
	private ArtistService artistService;
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		// get customers
		List<Artist> theArtists= artistService.getArtists();
		//add the customers into model
		theModel.addAttribute("artists",theArtists);
		return "list-artists";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Artist theArtist=new Artist();
		theModel.addAttribute("artist",theArtist);
		return "artist-form";
	}
	@PostMapping("/saveArtist")
	public String saveArtist(@ModelAttribute("artist") Artist c) {
		artistService.saveArtist(c);
		return "redirect:/artist/list";
	}
	@GetMapping("/showFormUpdate")
	public String showFormUpdate(@RequestParam("artistId") int theId, Model theModel) {
		Artist theCustomer=artistService.getArtist(theId);
		theModel.addAttribute("artist",theCustomer);
		return "artist-form";
	}
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("artistId") int theId) {
		artistService.deleteArtist(theId);
		
		return "redirect:/artist/list";
	}

}
