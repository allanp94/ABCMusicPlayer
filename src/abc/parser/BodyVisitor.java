package abc.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import abc.song.*;
import abc.sound.Pitch;
import abc.parser.AbcBodyParser.MeasureContext;
import abc.song.Body;
import abc.song.Song;

public class BodyVisitor extends AbcBodyBaseVisitor<Body> {
	static int ChordID = 1;
	List<Note> orderedNoteList = new ArrayList<Note>();
	List<String> stringNoteList = new ArrayList<String>();
		
	public Body visitBody(AbcBodyParser.BodyContext ctx) {
		ctx.section().forEach( (s) -> {
			List<MeasureContext> measure = s.measure(); 
			for (int i = 0; i < measure.size(); i++) {
				Body measure1 = visit(s.measure(i)); 
			}
	});
		System.out.println(stringNoteList);
		
		
//		ctx.section().forEach( (s) -> {
//			System.out.println(s.getText());
//		});
//				if (s.VOICE() != null && !s.VOICE().isEmpty()) {
//					//System.out.println(s.VOICE());
//				}
//				s.measure().forEach( (m) -> {
//					if (m.divider() != null && !m.divider().isEmpty()) {
//						//System.out.println(m.divider().getText());
//					}
//					if (m.parts() != null && !m.parts().isEmpty()) {
//						//System.out.println(m.parts().getText());
//					}
//					if (m.note() != null && !m.note().isEmpty()) {
//						System.out.println(m.note());
//						m.note().forEach( (n) -> {
//							if (n.ACCIDENTAL() != null) {
//								//System.out.println(n.ACCIDENTAL().getText());
//							}
//							if (n.LETTER() != null) {
//								//System.out.println(n.LETTER().getText());
//								
//								Pitch P = new Pitch(n.LETTER().getText());
//								//new Pitch('C').toMidiNote();
//								
//								float L = 1;
//								if (n.FRACTION() != null) {
//									//System.out.println(n.NUMBER().getText());
//									L = parseStringToFloat(n.FRACTION().getText());
//									//System.out.println(L);
//								}
//								else if (n.NUMBER() != null) {
//									L = parseStringToFloat(n.NUMBER().getText());
//								}
//
//								String A = null;
//								if (n.ACCIDENTAL() != null) {
//									A = n.ACCIDENTAL().getText();
//								}
//
//								String V = null;
//								if (s.VOICE() != null && !s.VOICE().isEmpty()) {
//									V = s.VOICE().get(0).getText();
//								}
//								
//								int C = 0;
//								
//								Note N = new Note(
//										P, 
//										L, 
//										A, 
//										C, 
//										V
//										);
//								orderedNoteList.add(N);
//							}
//
//							if (n.NUMBER() != null) {
//								//System.out.println(n.NUMBER().getText());
//							}
//							else if (n.FRACTION() != null) {
//								//System.out.println(n.FRACTION().getText());
//							}
//						});
//					}
//					if (m.chord() != null && !m.chord().isEmpty()) {
//						m.chord().forEach( (c) -> {
//							if (c.note() != null && !c.note().isEmpty()) {
//								System.out.println(c.note());
//								c.note().forEach( (n) -> {
//									if (n.ACCIDENTAL() != null) {
//										//System.out.println(n.ACCIDENTAL().getText());
//									}
//									if (n.LETTER() != null) {
//										//System.out.println(n.LETTER().getText());
//										
//										Pitch P = new Pitch(n.LETTER().getText());
//										//new Pitch('C').toMidiNote();
//										
//										float L = 1;
//										if (n.FRACTION() != null) {
//											//System.out.println(n.NUMBER().getText());
//											L = parseStringToFloat(n.FRACTION().getText());
//											//System.out.println(L);
//										}
//										else if (n.NUMBER() != null) {
//											L = parseStringToFloat(n.NUMBER().getText());
//										}
//
//										String A = null;
//										if (n.ACCIDENTAL() != null) {
//											A = n.ACCIDENTAL().getText();
//										}
//
//										String V = null;
//										if (s.VOICE() != null && !s.VOICE().isEmpty()) {
//											V = s.VOICE().get(0).getText();
//										}
//										
//										int C = ChordID;
//										
//										Note N = new Note(
//												P, 
//												L, 
//												A, 
//												C, 
//												V
//												);
//										orderedNoteList.add(N);
//									}
//
//									if (n.NUMBER() != null) {
//										//System.out.println(n.NUMBER().getText());
//									}
//									else if (n.FRACTION() != null) {
//										//System.out.println(n.FRACTION().getText());
//									}
//								});
//							}
//							ChordID++;
//						});
//					}
//					
//					else if (m.tuplet() != null && !m.tuplet().isEmpty()) {
//						//System.out.println(m.tuplet());
//						//'(' NUMBER ( {counter<=$NUMBER.int}? note {counter++;} )*
//					}
//				});
//				if (s.divider() != null && !s.divider().isEmpty()) {
//					//System.out.println(s.divider().getText());
//				}
//			}
//		);
//		
//		Body bodyObj = new Body(orderedNoteList);
		return null;
	}
	

	Float parseStringToFloat(String ratio) {
		try {
			if (ratio.contains("/")) {
				String[] rat = ratio.split("/");
				if (ratio.length() == 3) {
					return Float.parseFloat(rat[0]) / Float.parseFloat(rat[1]);
				}
				else if (ratio.length() == 2) {
					return 1 / Float.parseFloat(rat[1]);
				}
				else {
					return (float) 0.5;
				}
			} else {
				return Float.parseFloat(ratio);
			}
		} catch(Exception e) {
			return null;
		}
	}//end parseStringToFloat
	
	
	//Pitch P = new Pitch(n.LETTER().getText());
//	//new Pitch('C').toMidiNote();
//	


//	String V = null;
//	if (s.VOICE() != null && !s.VOICE().isEmpty()) {
//		V = s.VOICE().get(0).getText();
//	}
//	
//	int C = 0;
//	
//	Note N = new Note(
//			V
//			);
//	orderedNoteList.add(N);


	@Override public Body visitNote(AbcBodyParser.NoteContext ctx) {
		System.out.println(ctx.getText());
		String A = null,V = null;
		Float L = null;
		Pitch P = null; 
		int C = ChordID;
		V = "1";
		

		if (ctx.LETTER() != null) {
//			P = new Pitch((ctx.LETTER().getText().charAt(0))); 
		}; 
		
		if (ctx.NUMBER() != null) {
			L = parseStringToFloat(ctx.NUMBER().getText()); 
//			System.out.println(L);
		}
		
		if (ctx.FRACTION() != null) {
			L = parseStringToFloat(ctx.FRACTION().getText());
//			System.out.println(L);
		}
		
		if (ctx.ACCIDENTAL() != null) {
			A = ctx.ACCIDENTAL().getText(); 
			System.out.println(A);
		}

		
//		Note N = new Note(P,L,A,C,V);
//
////				P, 
////				L, 
////				A, 
////				C, 
////				V
////				);
		
		stringNoteList.add(ctx.getText()); 

		
		return visitChildren(ctx); 
		}
	  
	@Override public Body visitTuplet(AbcBodyParser.TupletContext ctx) { 
		System.out.println(ctx.getText());
		return visitChildren(ctx); 
		}
	
	@Override public Body visitChord(AbcBodyParser.ChordContext ctx) { 
		System.out.println(ctx.getText());
		return visitChildren(ctx); 
		}

		
	@Override public Body visitBeginRepeat(AbcBodyParser.BeginRepeatContext ctx) { 
//		System.out.println(ctx.BEGINREPEAT().getText());
		return visitChildren(ctx); 
		}
	
	@Override public Body visitPartOne(AbcBodyParser.PartOneContext ctx) { 
//		System.out.println(ctx.PARTONE().getText());
		return visitChildren(ctx); 
		}
	
	@Override public Body visitPartTwo(AbcBodyParser.PartTwoContext ctx) { 
//		System.out.println(ctx.PARTTWO().getText());
		return visitChildren(ctx); 
		}
	
	@Override public Body visitEndRepeat(AbcBodyParser.EndRepeatContext ctx) { 
//		System.out.println(ctx.ENDREPEAT().getText());
		return visitChildren(ctx); 
		}
	
	
	
}
