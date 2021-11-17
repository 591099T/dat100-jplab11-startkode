package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave3.Blogg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class SkrivBlogg {
	

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
	
		try {
		      File file = new File(mappe+filnavn);
		      PrintWriter skriver = new PrintWriter(file);
		      skriver.print(samling.toString());
		      skriver.close();
		      return true;
		      
		    }
		    catch(FileNotFoundException e) {
		      return false;
		    }
		
		
//		filnavn = "blogg.dat";
//		Blogg[] samlinge = new Blogg[toString()];
//		
//		boolean appendToFile = true;
//		
//		PrintWriter pw = null;
//	    if (appendToFile) {
//	      pw = new PrintWriter(new FileWriter(filnavn, true));
//	    } else {
//	      pw = new PrintWriter(new FileWriter(filnavn));
//	      // pw = new PrintWriter(new FileWriter(filename, false));
//	    }
//	    for (int i = 0; i < samlinge.length; i++) {
//	      pw.println(samlinge[i]);
//	    }
//	    pw.flush();
//	    pw.close();
	    
//		PrintWriter skriver = null;
//		String melding = "Det er lasta opp";
//		try { 
//			skriver = new PrintWriter("kat/blogg.dat");
//			String tekst = showInptDialog("Gi heiltall:");
//			int tall = parseInt(tekst);
//			skriver.println(tall);
//		}
//		catch (FileNotFoundException e) {
//			melding = "Katalogen finnes ikkje";
//		}
//		catch (NumberFormatException e) {
//			melding = "Feil tallformat";
//		}
//		finally {
//			if (skriver != null)
//				skriver.close();
//			System.out.println(melding);
//		}
		
		
	
//		String filnamn = "blogg.dat";
//		PrintWriter skriver = new PrintWriter(blogg);
		
				
//		//Declaring reference of File class
//				File file = null;
//		//Declaring reference of FileWriter class
//				FileWriter filewriter = null;
//				String data = "TechBlogStation";
//				try {
//					file = new File("D:/TBS/file.txt");
//		//Creating Object of FileWriter class
//					filewriter = new FileWriter(file);
//		//Writing to the file
//					filewriter.write(data);
//		//Closing the stream
//					filewriter.close();
//					System.out.println("File writing done.");
//				}
//		//Handing Exception
//				catch (Exception e) {
//					e.printStackTrace();
//				} finally {
//					try {
//						if (filewriter != null) {
//							filewriter.close();
//						}
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
		
		
	}

	
}
