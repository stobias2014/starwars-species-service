package com.tobias.saul.starwarsspeciesservice.web.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.tobias.saul.starwarsspeciesservice.model.Species;
import com.tobias.saul.starwarsspeciesservice.web.response.SpeciesResponse;

public class StarwarsSpeciesUtils {

	public static String formatUrlToContainHttps(String url) {
		StringBuilder str = new StringBuilder(url);
		str.insert(4, 's');
		return str.toString();
	}

	public static List<Species> addToSpeciesList(RestTemplate restTemplate,
			ResponseEntity<SpeciesResponse> response) {
		List<Species> speciesList = new ArrayList<Species>();
		speciesList.addAll(response.getBody().getSpeciesResults());

		while (response.getBody().getNext() != null) {
			if (response.getBody().getNext() == null) {
				continue;
			} else {
				String formattedUrl = StarwarsSpeciesUtils.formatUrlToContainHttps(response.getBody().getNext());
				response = restTemplate.getForEntity(formattedUrl, SpeciesResponse.class);
				speciesList.addAll(response.getBody().getSpeciesResults());
			}
		}

		return speciesList;
	}

}
