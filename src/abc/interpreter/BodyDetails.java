package abc.interpreter;

import java.util.ArrayList;
import java.util.List;

public class BodyDetails {
	private List<Song> bodyDetails ; 
	
	private BodyDetails() {
		this.bodyDetails = new ArrayList<>(); 
		
	}
	
	private void addBodyDetails(Song e) {
		bodyDetails.add(e);
	}
	
	
}
