package com.tobias.saul.starwarsspeciesservice.web.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tobias.saul.starwarsspeciesservice.model.Species;
import com.tobias.saul.starwarsspeciesservice.web.response.SpeciesResponse;
import com.tobias.saul.starwarsspeciesservice.web.utils.StarwarsSpeciesUtils;

@RestController
@RequestMapping("/species")
public class SpeciesService {
	
	private final String BASE_URL = "https://swapi.dev/api/species/";
	private final RestTemplate restTemplate;
	
	public SpeciesService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@GetMapping
	public List<Species> getAllStarships() {

		ResponseEntity<SpeciesResponse> response = restTemplate.getForEntity(BASE_URL, SpeciesResponse.class);

		List<Species> starships = StarwarsSpeciesUtils.addToSpeciesList(restTemplate, response);

		return starships;
	}
	
	@GetMapping("/{speciesId}")
	public Species getStarship(@PathVariable("speciesId") Integer speciesId) {
		ResponseEntity<SpeciesResponse> response = restTemplate.getForEntity(BASE_URL, SpeciesResponse.class);

		List<Species> speciesList = StarwarsSpeciesUtils.addToSpeciesList(restTemplate, response);
		
		Species species = speciesList.get(speciesId - 1);
		
		return species;
	}
	
	

}
