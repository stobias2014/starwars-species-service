package com.tobias.saul.starwarsspeciesservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Species {
	
	private String name;
	private String classification;
	private String designation;
	@JsonProperty("average_height")
	private String averageHeight;
	@JsonProperty("skin_colors")
	private String skinColors;
	@JsonProperty("hair_colors")
	private String hairColors;
	@JsonProperty("eye_colors")
	private String eyeColors;
	@JsonProperty("average_lifespan")
	private String averageLifespan;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAverageHeight() {
		return averageHeight;
	}
	public void setAverageHeight(String averageHeight) {
		this.averageHeight = averageHeight;
	}
	public String getSkinColors() {
		return skinColors;
	}
	public void setSkinColors(String skinColors) {
		this.skinColors = skinColors;
	}
	public String getHairColors() {
		return hairColors;
	}
	public void setHairColors(String hairColors) {
		this.hairColors = hairColors;
	}
	public String getEyeColors() {
		return eyeColors;
	}
	public void setEyeColors(String eyeColors) {
		this.eyeColors = eyeColors;
	}
	public String getAverageLifespan() {
		return averageLifespan;
	}
	public void setAverageLifespan(String averageLifespan) {
		this.averageLifespan = averageLifespan;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((averageHeight == null) ? 0 : averageHeight.hashCode());
		result = prime * result + ((averageLifespan == null) ? 0 : averageLifespan.hashCode());
		result = prime * result + ((classification == null) ? 0 : classification.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((eyeColors == null) ? 0 : eyeColors.hashCode());
		result = prime * result + ((hairColors == null) ? 0 : hairColors.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((skinColors == null) ? 0 : skinColors.hashCode());
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
		Species other = (Species) obj;
		if (averageHeight == null) {
			if (other.averageHeight != null)
				return false;
		} else if (!averageHeight.equals(other.averageHeight))
			return false;
		if (averageLifespan == null) {
			if (other.averageLifespan != null)
				return false;
		} else if (!averageLifespan.equals(other.averageLifespan))
			return false;
		if (classification == null) {
			if (other.classification != null)
				return false;
		} else if (!classification.equals(other.classification))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (eyeColors == null) {
			if (other.eyeColors != null)
				return false;
		} else if (!eyeColors.equals(other.eyeColors))
			return false;
		if (hairColors == null) {
			if (other.hairColors != null)
				return false;
		} else if (!hairColors.equals(other.hairColors))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (skinColors == null) {
			if (other.skinColors != null)
				return false;
		} else if (!skinColors.equals(other.skinColors))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Species [name=" + name + ", classification=" + classification + ", designation=" + designation
				+ ", averageHeight=" + averageHeight + ", skinColors=" + skinColors + ", hairColors=" + hairColors
				+ ", eyeColors=" + eyeColors + ", averageLifespan=" + averageLifespan + "]";
	}
	
	

}
