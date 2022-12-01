package abc.song;

import java.util.ArrayList;
import java.util.List;

public class Header {
	private String composerName; // C
	private String keySignature; // K
	private Float length; // L
	private Float meter; // M
	private Float tempoLength; // Q
	private Integer tempo; // Q
	private String title; // T
	private List<String> voices; // V
	
	private static final float DEFAULT_METER = 1.0f;
	private static final int DEFAULT_TEMPO = 100;
	private static final String DEFAULT_COMPOSER_NAME = "Unknown";
	private final DefaultLength DEFAULT_LENGTH = () -> {
		if (this.meter == null) throw new IllegalStateException("Meter must be defined to set default length");
		return meter < .75 ? 1/16f : 1/8f;
	};
	
	/*
	 * Get a Header object with the given fields
	 * Title and Key Signature are required to be non null. All other parameters allow null.
	 */
	public Header(
				String composerName,
				String keySignature,
				Float length,
				Float meter,
				Float tempoLength,
				Integer tempo,
				String title,
				List<String> voices
			) {
		this.setComposerName(composerName);
		this.setKeySignature(keySignature);
		this.setLength(length);
		this.setMeter(meter);
		this.setTempoLength(tempoLength);
		this.setTempo(tempo);
		this.setTitle(title);
		this.setVoices(voices);
	}
	
	/*
	 * Get a copy of a given header object
	 * Title and Key Signature are required to be non null. All other parameters can be passed as null.
	 */
	public Header(Header headerToCopy) {
		this.setComposerName(headerToCopy.getComposerName());
		this.setKeySignature(headerToCopy.getKeySignature());
		this.setLength(headerToCopy.getLength());
		this.setMeter(headerToCopy.getMeter());
		this.setTempo(headerToCopy.getTempo());
		this.setTitle(headerToCopy.getTitle());
		this.setVoices(headerToCopy.getVoices());
	}

	public String getComposerName() {
		return composerName;
	}

	public void setComposerName(String composerName) {
		if (composerName == null) {
			this.composerName = Header.DEFAULT_COMPOSER_NAME;
			return;
		}
		this.composerName = composerName;
	}

	public String getKeySignature() {
		return keySignature;
	}

	public void setKeySignature(String keySignature) {
		if (keySignature == null) throw new IllegalArgumentException("Key Signature cannot be null");
		this.keySignature = keySignature;
	}

	public Float getLength() {
		return length;
	}

	public void setLength(Float length) {
		if (length == null) {
			this.length = this.DEFAULT_LENGTH.get();
			return;
		}
		this.length = length;
	}

	public Float getMeter() {
		return meter;
	}

	public void setMeter(Float meter) {
		if (meter == null) {
			this.meter = Header.DEFAULT_METER;
			return;
		}
		
		this.meter = meter;
	}

	public Integer getTempo() {
		return tempo;
	}

	public void setTempo(Integer tempo) {
		if (tempo == null) {
			this.tempo = Header.DEFAULT_TEMPO;
			return;
		}
		this.tempo = tempo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title == null) throw new IllegalArgumentException("Title cannot be null");
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

	public Float getTempoLength() {
		return tempoLength;
	}
	
	public void setTempoLength(Float tempoLength) {
		this.tempoLength = tempoLength;
	}
	
	public String toString() {
		return "Composer Name: " + composerName + "\n" +
				"Key Signature: " + keySignature + "\n" +
				"Default Length: " + length + "\n" +
				"Meter: " + meter + "\n" +
				"Tempo: " + tempo + "\n" +
				"Title: " + title + "\n" +
				"Voices: " + voices + "\n";
	}

}

interface DefaultLength{
	public Float get();
}