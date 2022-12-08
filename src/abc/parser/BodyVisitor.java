package abc.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import abc.song.Note; 
import abc.song.Body; 

public class BodyVisitor extends AbcBodyBaseVisitor<Body> {
	public Body visitBody(AbcBodyParser.BodyContext ctx) {
		ctx.section().forEach( //foreach section
			(s) -> {
				if (!s.VOICE().isEmpty()) {
					System.out.println(s.VOICE());
				};
				s.measure().forEach( (m) -> {
					if (m.divider() != null && !m.divider().isEmpty()) {
						System.out.println(m.divider().getText());
					};
					if (m.parts() != null && !m.parts().isEmpty()) {
						System.out.println(m.parts().getText());
					};
					
					//(tuplet | note | chord)+
					//System.out.println(m.tuplet().getText());
					//System.out.println(m.note().getText());
					//System.out.println(m.chord().getText());
				});
				if (s.divider() != null && !s.divider().isEmpty()) {
					System.out.println(s.divider().getText());
				};
				
			}
		);
		Body bodyObj = new Body(
				new ArrayList<String>()		
				 );
		
		return bodyObj;
	}
}
