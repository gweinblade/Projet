/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Locale.filter;
import java.util.Scanner;
import javax.swing.JFileChooser;
/**
 *
 * @author khaoula
 */
public class Myanalisare1 {
    
    
    public static void lexicale(ArrayList<String> liste){

                          int j;
		Myanalisare3 t= new Myanalisare3();
		
		/* Le chemin vers le fichier à lire */
		String pathFichier="C:\\Users\\imado\\Desktop\\Code.txt";

		BufferedReader fluxEntree=null;
		try {
			/* Création du flux vers le fichier texte */
			fluxEntree = new BufferedReader(new FileReader(pathFichier));

			/* Lecture d'une ligne */
			String ligneLue = fluxEntree.readLine();
                         int ligne =0; 
			while(ligneLue!=null){
				ligne++; 
				String[] mots = ligneLue.split(" ");
				j=0;
				 while(j<mots.length) {
					 
						String MSG ="";	
                                                String Comment=""; 
                                                char cot='"';
						

					 switch(mots[j]) {
					 
			 
						case "Start_Program": System.out.println("Start_Program : Mot réservé debut d'un programme");
						break;
						
						case "Int_Number": System.out.println("Int_Number : Mot réservé Déclaration d'un entier");
						break;
						
						case "Real_Number": System.out.println("Real_Number : Mot reserve Déclaration d'un reel");
						break;
						
						case "Give": System.out.println("Give : Mot réservé affectation valeur a variable");
						break;
						
						case "If": System.out.println("If : Mot réservé pour Condition");
						break;
						
						case "Else": System.out.println("Else : Sinon");
						break;
						
						case "Start": System.out.println("Start : Mot réservé Debut d'un bloc ");
						break;
						
						case "Finish": System.out.println("Finish : fin du bloc ");
						break;
						
						case "Affect": System.out.println("Affect : Mot réservé Affectation variable a variable");
						break;
						
						case "to": System.out.println("to : Mot réservé");
						break;
						
						case "ShowMes": System.out.println("ShowMes : Mot réservé pour message");
						
						break;
						
						case "ShowVal": System.out.println("ShowVal :Mot réservé pour afficher valeur d'une variable");
						break;
						
						case "//.": System.out.println("//. : Mot reserve pour commentaire");
						j++;
						
						while(j<mots.length){
							Comment=Comment+" "+mots[j];
							j++;
							
						}
						
						System.out.println(Comment+" : c'est un Commentaire");
						
				
						break;
						
						case "End_Program": System.out.println("End_Program : Mot réservé fin du programme");
						break;
						
						case ",": System.out.println(", : Mot réservé ");
						break;
						
						case ";;": System.out.println(";; : Mot réservé pour fin d'une instruction");
						break;
						
						case ":": System.out.println(": : Mot réservé");
						MSG=""+cot;
						
						if(mots[j+1].charAt(0) == cot) { 
							 
							 j++; j++;
						 
						 	while(mots[j].charAt(0)!=cot) {
						 		
						 		MSG=MSG+" "+mots[j];
						 		
						 		j++;
						 		
						 	}
						 
						 	
						 	MSG=MSG+'"';
						 System.out.println(MSG+" :c'est un message");
						 }
						
						break;
						
						case "<": System.out.println("< : Inferieur");
						break;
						
						case ">": System.out.println("> : Superieur");
						break;
						
						case "--": System.out.println("-- : Mot réservé");
						break;
						
						case ">=": System.out.println(">= : Superieur ou egale");
						break;
						
						case "<=": System.out.println("<= : Inferieur ou egale");
						break;
						
						case "==": System.out.println("== : Egale");
						break;
						
						case "!=": System.out.println("!= : N'egale pas");
						break; 
						case ";": System.out.println("; : Mot réservé");
						break; 
						case ".": System.out.println(". : Mot réservé");
						break; 
						 
						default: 
							
							if( t.isNum(mots[j],0)) { 
								String l1=t.num(mots[j]);
							if (l1!=null) System.out.println(mots[j]+" : "+l1);
							
							}
							
							else if(t.isChar(mots[j],0)) { 
								String l1=t.id(mots[j]);
							if (l1!=null) System.out.println(mots[j]+" : "+l1);
							
							}
						
							else System.out.println("erreur lexicale ");
							
							break; 
							
						 
							
							
						}
						
						 
				
						
						
					j++;
					
					 
				 }

				
				

				
				ligneLue = fluxEntree.readLine();
			}
		}
		catch(IOException exc){
			exc.printStackTrace();
		}
		finally{
			try{
				if(fluxEntree!=null){
					/* Fermeture du flux vers le fichier */
					fluxEntree.close();
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

public static void main(String[] args) throws IOException {
            ArrayList<String> mots = new ArrayList<String>();
		lexicale(mots);
		

}
		
		
}		
		
		

