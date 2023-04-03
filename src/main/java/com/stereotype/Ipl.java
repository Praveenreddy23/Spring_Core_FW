package com.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ipl-2023")
@Scope("prototype")
public class Ipl {

	@Value("CSK")
	private String teamName;
	@Value("MS Dhoni")
	private String captainName;
//	SpEL - Expression
	@Value("#{pnames}")
	private List<String> playersName;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	public List<String> getPlayersName() {
		return playersName;
	}
	public void setPlayersName(List<String> playersName) {
		this.playersName = playersName;

	}
	@Override
	public String toString() {
		return "Ipl [teamName=" + teamName + ", captainName=" + captainName + ", playersName=" + playersName + "]";
	}
}
