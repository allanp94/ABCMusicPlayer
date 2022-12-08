package abc.song;

import java.util.ArrayList;
import java.util.List;

public class Body {
	private List<String> voices;
	
	private static final float DEFAULT_METER = 1.0f;
	private static final int DEFAULT_TEMPO = 100;
	private static final String DEFAULT_COMPOSER_NAME = "Unknown";
	
	public Body(
				List<String> voices
			) {
		this.setVoices(voices);
	}
	
	public Body(Body bodyToCopy) {
		this.setVoices(bodyToCopy.getVoices());
	}

	public List<String> getVoices() {
		return new ArrayList<>(voices);
	}

	public void setVoices(List<String> voices) {
		this.voices = voices;
	}
	
	public void addVoice(String voice) {
		this.voices.add(voice);
	}

	public String toString() {
		return "Voices: " + voices + "\n";
	}

}

//interface DefaultLength{
//	public Float get();
//}