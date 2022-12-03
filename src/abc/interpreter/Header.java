package abc.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Header {
	private List<Song> headerDetails; 
	
	//constructor
	private Header() {
		this.headerDetails = new ArrayList<>(); 
	}
	
	private void addHeaderDetails(Song e) {
		headerDetails.add(e);
	}

	
	
}
