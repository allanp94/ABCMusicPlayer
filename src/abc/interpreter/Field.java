package abc.interpreter;

public class Field extends Song {

	char field;
	
	private Field(char field) {
		this.field = field; 
	}
	
	
	@Override
	public String toString() {
		return new Character(field).toString(); 
	}
}
