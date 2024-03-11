package iccFormats;

import org.springframework.stereotype.Component;

@Component
public class Test {

	private int overs;
	private String jerseyColor;
	
	public int getOvers() {
		return overs;
	}
	public void setOvers(int overs) {
		this.overs = overs;
	}
	public String getJerseyColor() {
		return jerseyColor;
	}
	public void setJerseyColor(String jerseyColor) {
		this.jerseyColor = jerseyColor;
	}
	
}
