package abc.parser;

public class Divider {
	private int index;
	private String type;
	private String voice;
	
	public Divider(int index, String type, String voice) {
		this.setIndex(index);
		this.setType(type);
		this.setVoice(voice);
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}
}
