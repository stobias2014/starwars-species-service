package com.tobias.saul.starwarsspeciesservice.web.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tobias.saul.starwarsspeciesservice.model.Species;

public class SpeciesResponse {
	
	private String next;
	@JsonProperty(value = "results")
	private List<Species> speciesResults;
	
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public List<Species> getSpeciesResults() {
		return speciesResults;
	}
	public void setSpeciesResults(List<Species> speciesResults) {
		this.speciesResults = speciesResults;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + ((speciesResults == null) ? 0 : speciesResults.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpeciesResponse other = (SpeciesResponse) obj;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (speciesResults == null) {
			if (other.speciesResults != null)
				return false;
		} else if (!speciesResults.equals(other.speciesResults))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SpeciesResponse [next=" + next + ", speciesResults=" + speciesResults + "]";
	}
	
	
	
	
}
