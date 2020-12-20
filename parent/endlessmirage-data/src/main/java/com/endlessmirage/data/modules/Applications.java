package com.endlessmirage.data.modules;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.endlessmirage.data.enums.Gamemodes;

@Entity
@Table(name = "Applications")
public class Applications {

	@Id
	private Long id;
	private String language;
	private Boolean rules;
	private String osu_username;
	private String osu_url;
	private Gamemodes gamemode;
	private String displayName;
	private String rank;
	private String speciality;
	private Boolean firstTimer;
	private Boolean notified;

	@OneToMany
	@JoinColumn(name = "collab_id", referencedColumnName = "id")
	private Collabs collab;

	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "character_id", referencedColumnName = "id")
	private Characters character;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Boolean getRules() {
		return rules;
	}

	public void setRules(Boolean rules) {
		this.rules = rules;
	}

	public String getOsu_username() {
		return osu_username;
	}

	public void setOsu_username(String osu_username) {
		this.osu_username = osu_username;
	}

	public String getOsu_url() {
		return osu_url;
	}

	public void setOsu_url(String osu_url) {
		this.osu_url = osu_url;
	}

	public Gamemodes getGamemode() {
		return gamemode;
	}

	public void setGamemode(Gamemodes gamemode) {
		this.gamemode = gamemode;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public Boolean getFirstTimer() {
		return firstTimer;
	}

	public void setFirstTimer(Boolean firstTimer) {
		this.firstTimer = firstTimer;
	}

	public Boolean getNotified() {
		return notified;
	}

	public void setNotified(Boolean notified) {
		this.notified = notified;
	}

	public Collabs getCollab() {
		return collab;
	}

	public void setCollab(Collabs collab) {
		this.collab = collab;
	}

	public Characters getCharacter() {
		return character;
	}

	public void setCharacter(Characters character) {
		this.character = character;
	}
}
