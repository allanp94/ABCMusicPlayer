package abc.song;

import java.util.ArrayList;
import java.util.List;

public class Header {

	// TODO: may need to parse further than string prior to object
	private String composerName; // C
	private String keySignature; // K
	private String defaultLength; // L
	private String meter; // M
	private String tempo; // Q
	private String title; // T
	private List<String> voices; // V
	
	public Header(
				String composerName,
				String keySignature,
				String defaultLength,
				String meter,
				String tempo,
				String title,
				List<String> voices
			) {
		this.setComposerName(composerName);
		this.setKeySignature(keySignature);
		this.setDefaultLength(defaultLength);
		this.setMeter(meter);
		this.setTempo(tempo);
		this.setTitle(title);
		this.setVoices(voices);
	}
	
	public Header(Header headerToCopy) {
		this.setComposerName(headerToCopy.getComposerName());
		this.setKeySignature(headerToCopy.getKeySignature());
		this.setDefaultLength(headerToCopy.getDefaultLength());
		this.setMeter(headerToCopy.getMeter());
		this.setTempo(headerToCopy.getTempo());
		this.setTitle(headerToCopy.getTitle());
		this.setVoices(headerToCopy.getVoices());
	}

	public String getComposerName() {
		return composerName;
	}

	public void setComposerName(String composerName) {
		this.composerName = composerName;
	}

	public String getKeySignature() {
		return keySignature;
	}

	public void setKeySignature(String keySignature) {
		this.keySignature = keySignature;
	}

	public String getDefaultLength() {
		return defaultLength;
	}

	public void setDefaultLength(String defaultLength) {
		this.defaultLength = defaultLength;
	}

	public String getMeter() {
		return meter;
	}

	public void setMeter(String meter) {
		this.meter = meter;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
		return "Composer Name: " + composerName + "\n" +
				"Key Signature: " + keySignature + "\n" +
				"Default Length: " + defaultLength + "\n" +
				"Meter: " + meter + "\n" +
				"Tempo: " + tempo + "\n" +
				"Title: " + title + "\n" +
				"Voices: " + voices + "\n";
	}
}
