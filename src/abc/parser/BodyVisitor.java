package abc.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import abc.song.Note;
import abc.song.Pitch;
import abc.song.Body;
import abc.song.Song;

public class BodyVisitor extends AbcBodyBaseVisitor<Body> {
		
	public Body visitBody(AbcBodyParser.BodyContext ctx) {

		List<Note> orderedNoteList = new ArrayList<Note>();
		int ChordID = 1;
		
		for (int s = 0; s < ctx.section().size(); s++)
		{
			AbcBodyParser.SectionContext section = ctx.section(s);
			if (section.VOICE() != null && !section.VOICE().isEmpty()) {
				//System.out.println(s.VOICE());
			}
			for (int m = 0; m < section.measure().size(); m++)
			{
				AbcBodyParser.MeasureContext measure = section.measure(m);
				if (measure.divider() != null && !measure.divider().isEmpty()) {
					//System.out.println(measure.divider().getText());
				}
				if (measure.parts() != null && !measure.parts().isEmpty()) {
					//System.out.println(m.parts().getText());
				}
				

				for (int i = 0; i < measure.getChildCount(); i++)
				{
					if (measure.getChild(i) instanceof AbcBodyParser.ChordContext)
					{
						System.out.println("yahoo!!!");
					}
					if (measure.getChild(i) instanceof AbcBodyParser.NoteContext)
					{
						System.out.println("yahoo!!!");
					}
					if (measure.getChild(i) instanceof AbcBodyParser.TupletContext)
					{
						System.out.println("yahoo!!!");
					}
				}
				
				//System.out.println(measure.getChild(0).getText());
				
				
				//System.out.println(measure.getChild(0).getClass());
				
				
				if (measure.note() != null && !measure.note().isEmpty()) {
					//System.out.println(m.note());
					for (int n = 0; n < measure.note().size(); n++)
					{
						AbcBodyParser.NoteContext note = measure.note(n);
						if (note.ACCIDENTAL() != null) {
							//System.out.println(n.ACCIDENTAL().getText());
						}
						if (note.LETTER() != null) {
							//System.out.println(n.LETTER().getText());
							
							Pitch P = new Pitch(note.LETTER().getText());
							//new Pitch('C').toMidiNote();
							
							float L = 1;
							if (note.FRACTION() != null) {
								//System.out.println(n.NUMBER().getText());
								L = parseStringToFloat(note.FRACTION().getText());
								//System.out.println(L);
							}
							else if (note.NUMBER() != null) {
								L = parseStringToFloat(note.NUMBER().getText());
							}
							
							//System.out.println(L);

							String A = null;
							if (note.ACCIDENTAL() != null) {
								A = note.ACCIDENTAL().getText();
							}

							String V = null;
							if (section.VOICE() != null && !section.VOICE().isEmpty()) {
								V = section.VOICE().get(0).getText();
							}
							
							int C = 0;
							
							Note N = new Note(
									P, 
									L, 
									A, 
									C, 
									V
									);
							orderedNoteList.add(N);
						}

						if (note.NUMBER() != null) {
							//System.out.println(n.NUMBER().getText());
						}
						else if (note.FRACTION() != null) {
							//System.out.println(n.FRACTION().getText());
						}
					}
				}
				if (measure.chord() != null && !measure.chord().isEmpty()) {
					for (int c = 0; c < measure.chord().size(); c++)
					{
						AbcBodyParser.ChordContext chord = measure.chord(c);
						if (chord.note() != null && !chord.note().isEmpty()) {
							//System.out.println(c.note());
							for (int n = 0; n < chord.note().size(); n++)
							{
								AbcBodyParser.NoteContext note = chord.note(n);
								if (note.ACCIDENTAL() != null) {
									//System.out.println(n.ACCIDENTAL().getText());
								}
								if (note.LETTER() != null) {
									//System.out.println(n.LETTER().getText());
									
									Pitch P = new Pitch(note.LETTER().getText());
									//new Pitch('C').toMidiNote();
									
									float L = 1;
									if (note.FRACTION() != null) {
										//System.out.println(n.NUMBER().getText());
										L = parseStringToFloat(note.FRACTION().getText());
										//System.out.println(L);
									}
									else if (note.NUMBER() != null) {
										L = parseStringToFloat(note.NUMBER().getText());
									}

									String A = null;
									if (note.ACCIDENTAL() != null) {
										A = note.ACCIDENTAL().getText();
									}

									String V = null;
									if (section.VOICE() != null && !section.VOICE().isEmpty()) {
										V = section.VOICE().get(0).getText();
									}
									
									int C = ChordID;
									
									Note N = new Note(
											P, 
											L, 
											A, 
											C, 
											V
											);
									orderedNoteList.add(N);
								}

								if (note.NUMBER() != null) {
									//System.out.println(n.NUMBER().getText());
								}
								else if (note.FRACTION() != null) {
									//System.out.println(n.FRACTION().getText());
								}
							}
						}
						ChordID++;
					}
				}
				
				else if (measure.tuplet() != null && !measure.tuplet().isEmpty()) {
					for (int t = 0; t < measure.tuplet().size(); t++)
					{
						AbcBodyParser.TupletContext tuplet = measure.tuplet(t);
						if (tuplet.NUMBER() != null)
						{
							//System.out.println(t.NUMBER().getText());
						}
						if (tuplet.note() != null && !tuplet.note().isEmpty()) {
							//System.out.println(c.note());
							for (int n = 0; n < tuplet.note().size(); n++)
							{
								AbcBodyParser.NoteContext note = tuplet.note(n);
								if (note.ACCIDENTAL() != null) {
									//System.out.println(n.ACCIDENTAL().getText());
								}
								if (note.LETTER() != null) {
									//System.out.println(n.LETTER().getText());
									
									Pitch P = new Pitch(note.LETTER().getText());
									//new Pitch('C').toMidiNote();
									
									float L = 1;
									if (note.FRACTION() != null) {
										//System.out.println(n.NUMBER().getText());
										L = parseStringToFloat(note.FRACTION().getText());
										//System.out.println(L);
									}
									else if (note.NUMBER() != null) {
										L = parseStringToFloat(note.NUMBER().getText());
									}
									L=(L*2)/3;

									String A = null;
									if (note.ACCIDENTAL() != null) {
										A = note.ACCIDENTAL().getText();
									}

									String V = null;
									if (section.VOICE() != null && !section.VOICE().isEmpty()) {
										V = section.VOICE().get(0).getText();
									}
									
									int C = 0;
									
									Note N = new Note(
											P, 
											L, 
											A, 
											C, 
											V
											);
									orderedNoteList.add(N);
								}

								if (note.NUMBER() != null) {
									//System.out.println(n.NUMBER().getText());
								}
								else if (note.FRACTION() != null) {
									//System.out.println(n.FRACTION().getText());
								}
							}
						}

						//'(' NUMBER ( {counter<=$NUMBER.int}? note {counter++;} )*
						
					}
					//System.out.println(m.tuplet());
				}
			}
			if (section.divider() != null && !section.divider().isEmpty()) {
				//System.out.println(s.divider().getText());
			}
		}
		
		
		/*
		ctx.section().forEach( (s) -> {
				if (s.VOICE() != null && !s.VOICE().isEmpty()) {
					//System.out.println(s.VOICE());
				}
				s.measure().forEach( (m) -> {
					if (m.divider() != null && !m.divider().isEmpty()) {
						//System.out.println(m.divider().getText());
					}
					if (m.parts() != null && !m.parts().isEmpty()) {
						//System.out.println(m.parts().getText());
					}
					if (m.note() != null && !m.note().isEmpty()) {
						//System.out.println(m.note());
						m.note().forEach( (n) -> {
							if (n.ACCIDENTAL() != null) {
								//System.out.println(n.ACCIDENTAL().getText());
							}
							if (n.LETTER() != null) {
								//System.out.println(n.LETTER().getText());
								
								Pitch P = new Pitch(n.LETTER().getText());
								//new Pitch('C').toMidiNote();
								
								float L = 1;
								if (n.FRACTION() != null) {
									//System.out.println(n.NUMBER().getText());
									L = parseStringToFloat(n.FRACTION().getText());
									//System.out.println(L);
								}
								else if (n.NUMBER() != null) {
									L = parseStringToFloat(n.NUMBER().getText());
								}
								
								//System.out.println(L);

								String A = null;
								if (n.ACCIDENTAL() != null) {
									A = n.ACCIDENTAL().getText();
								}

								String V = null;
								if (s.VOICE() != null && !s.VOICE().isEmpty()) {
									V = s.VOICE().get(0).getText();
								}
								
								int C = 0;
								
								Note N = new Note(
										P, 
										L, 
										A, 
										C, 
										V
										);
								orderedNoteList.add(N);
							}

							if (n.NUMBER() != null) {
								//System.out.println(n.NUMBER().getText());
							}
							else if (n.FRACTION() != null) {
								//System.out.println(n.FRACTION().getText());
							}
						});
					}
					if (m.chord() != null && !m.chord().isEmpty()) {
						m.chord().forEach( (c) -> {
							if (c.note() != null && !c.note().isEmpty()) {
								//System.out.println(c.note());
								c.note().forEach( (n) -> {
									if (n.ACCIDENTAL() != null) {
										//System.out.println(n.ACCIDENTAL().getText());
									}
									if (n.LETTER() != null) {
										//System.out.println(n.LETTER().getText());
										
										Pitch P = new Pitch(n.LETTER().getText());
										//new Pitch('C').toMidiNote();
										
										float L = 1;
										if (n.FRACTION() != null) {
											//System.out.println(n.NUMBER().getText());
											L = parseStringToFloat(n.FRACTION().getText());
											//System.out.println(L);
										}
										else if (n.NUMBER() != null) {
											L = parseStringToFloat(n.NUMBER().getText());
										}

										String A = null;
										if (n.ACCIDENTAL() != null) {
											A = n.ACCIDENTAL().getText();
										}

										String V = null;
										if (s.VOICE() != null && !s.VOICE().isEmpty()) {
											V = s.VOICE().get(0).getText();
										}
										
										int C = ChordID;
										
										Note N = new Note(
												P, 
												L, 
												A, 
												C, 
												V
												);
										orderedNoteList.add(N);
									}

									if (n.NUMBER() != null) {
										//System.out.println(n.NUMBER().getText());
									}
									else if (n.FRACTION() != null) {
										//System.out.println(n.FRACTION().getText());
									}
								});
							}
							ChordID++;
						});
					}
					
					else if (m.tuplet() != null && !m.tuplet().isEmpty()) {
						m.tuplet().forEach( (t) -> {
							if (t.NUMBER() != null)
							{
								//System.out.println(t.NUMBER().getText());
							}
							if (t.note() != null && !t.note().isEmpty()) {
								//System.out.println(c.note());
								t.note().forEach( (n) -> {
									if (n.ACCIDENTAL() != null) {
										//System.out.println(n.ACCIDENTAL().getText());
									}
									if (n.LETTER() != null) {
										//System.out.println(n.LETTER().getText());
										
										Pitch P = new Pitch(n.LETTER().getText());
										//new Pitch('C').toMidiNote();
										
										float L = 1;
										if (n.FRACTION() != null) {
											//System.out.println(n.NUMBER().getText());
											L = parseStringToFloat(n.FRACTION().getText());
											//System.out.println(L);
										}
										else if (n.NUMBER() != null) {
											L = parseStringToFloat(n.NUMBER().getText());
										}
										L=(L*2)/3;

										String A = null;
										if (n.ACCIDENTAL() != null) {
											A = n.ACCIDENTAL().getText();
										}

										String V = null;
										if (s.VOICE() != null && !s.VOICE().isEmpty()) {
											V = s.VOICE().get(0).getText();
										}
										
										int C = 0;
										
										Note N = new Note(
												P, 
												L, 
												A, 
												C, 
												V
												);
										orderedNoteList.add(N);
									}

									if (n.NUMBER() != null) {
										//System.out.println(n.NUMBER().getText());
									}
									else if (n.FRACTION() != null) {
										//System.out.println(n.FRACTION().getText());
									}
								});
							}

							//'(' NUMBER ( {counter<=$NUMBER.int}? note {counter++;} )*
							
						});
						//System.out.println(m.tuplet());
					}
				});
				if (s.divider() != null && !s.divider().isEmpty()) {
					//System.out.println(s.divider().getText());
				}
			}
		);
		*/
		Body bodyObj = new Body(orderedNoteList);
		return bodyObj;
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
	}
}
