package abc.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import abc.song.Header; 

public class HeaderVisitor extends AbcHeaderBaseVisitor<Header> {
	
	public Header visitHeader(AbcHeaderParser.HeaderContext ctx) {
		Map<String, String> headerHashMap = new HashMap<String, String>(); 
		int voiceCount = 0;
		
		for (int i = 0; i < ctx.getChildCount() - 1; i++) {
			String field = ctx.getChild(i).getChild(0).getText();
			String content = ctx.getChild(i).getChild(2).getText();

			if (field.equals("V")) {
				headerHashMap.put(field + "" + voiceCount, content);
				voiceCount++;
			} else {
			headerHashMap.put(field, content);
			}
		} //end for
		
		return hashMapToHeader(headerHashMap, voiceCount);
	}//end visitHead
	

	Float parseStringToFloat(String ratio) {
		try {
			if (ratio.contains("/")) {
				String[] rat = ratio.split("/");
				return Float.parseFloat(rat[0]) / Float.parseFloat(rat[1]);
			} else {
				return Float.parseFloat(ratio);
			}
		} catch(Exception e) {
			return null;
		}
	}
	
	
	// converts the hashMap to the appropriate value needed for the Header object
	private Header hashMapToHeader(Map<String, String> hashMap, int count) {
	
		String composerName = hashMap.get("C"); 
		String keySignature = hashMap.get("K");
		String title = hashMap.get("T");
		List<String> voices = new ArrayList<String>();
		Float meter = parseStringToFloat(hashMap.get("M"));
		Float length = parseStringToFloat(hashMap.get("L"));
		String tempoString = hashMap.get("Q"); 
		Float tempoLength = null;
		Integer tempo = 0; 
		
		if (tempoString != null) {
			if (tempoString.contains("=")) {
				String[] t = tempoString.split("=");
				tempoLength = parseStringToFloat(t[0]);	
				tempo = Integer.parseInt(t[1]);
			} else {
				tempo = Integer.parseInt(tempoString); 
			}
		}
		
		for (int i = 0; i < count; i++) {
			voices.add(hashMap.get("V" + "" + i));
		}
		
		
		Header headerObj = new Header(
				 composerName,
				 keySignature,
				 length,
				 meter,
				 tempoLength,
				 tempo,
				 title,
				 voices		
				 );
		
		return headerObj;
	}//endHashMapToHeader
		
}
