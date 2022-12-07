package abc.parser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import abc.song.Header; 

public class HeaderVisitor extends AbcHeaderBaseVisitor<String> {

	Map<String, String> headerHashMap = new HashMap<String, String>(); 
	protected Header headerObj;
	
	@Override 
	public String visitHeaderField(AbcHeaderParser.HeaderFieldContext ctx) {
		
		String fieldTextId = ctx.FIELDTEXT().getText(); 
		String fieldContentText = visit(ctx.content());  
		System.out.println(fieldTextId);
		System.out.println(fieldContentText);
		
		headerHashMap.put(fieldTextId, fieldContentText);		
//		
//		switch(fieldTextId) {
//			case "Q": 
//				headerObj.setTempo(Integer.parseInt(fieldContentText));
//			case "K":
//				headerObj.setKeySignature(fieldContentText);
//			case "L":
//				headerObj.setLength(Float.parseFloat(fieldContentText));
//			case "M":
//				headerObj.setMeter(Float.parseFloat(fieldContentText));
//			case "C":
//				headerObj.setComposerName(fieldContentText);
//			case "T":
//				headerObj.setTitle(fieldContentText);
//		}
		
		return fieldContentText; 
	}
	
	@Override 
	public String visitContent(AbcHeaderParser.ContentContext ctx) {
		return ctx.getText();
	}
	
	//function that returns the contents of the headerHashMap
	public void printHashMap() {
		for (String i: headerHashMap.keySet()) {
			System.out.println("Field: " + i + " value: " + headerHashMap.get(i));
		}
	}
	
	public Header getHeader() {
		
		return headerObj; 
	}
	

}
