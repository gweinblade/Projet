/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

/**
 *
 * @author khaoula
 */
public class Myanalisare2 {
     public String Ul(String c) {
		
		String[] mot = {"Give",";;",";",":","--",">=","<=","==","!=", "<", ">", ",", "Start_Program", "Int_Number",  "Set", "Real_Number", "If" , "Else",
				"Start", "Get","From", "Finish", "Put", "//.", "End_Program","Affect","ShowMess","ShowVal"};

		String[] sign = {" Mot reserve affectation val a var","Mot reserve fin d une instruction","Mot reserve","Mot reserve","Mot reserve","symbol superieur ou egale","symbol inferieur ou egale","Egale","N'egale pas",
				"symbol inferieur", "symbol superieur", "caractere reservé virgule",
				"Mot reserve debut du programme", " Mot reserve declaration d'un entier",
				 "Mot reserve pour affectation entre variables", " Mot reserve debut declaration d'un Real",
				" Mot reserve pour Condition",  "Mot reserve pour condition SINON", "Mot reserve Debut bloc ",
				"Mot reserve pour affectation", "Mot reserve pour affectation", "Fin du bloc",
				"Mot reservé pour afficher un message ou une valeur", "Mot reservé pour un commentaire", "Mot reserve Fin du programme",
                                "Mot reserve Affectation var a var","Mot reserve pour message","Mot reserve show valeur d'une variable"};
		int i = 0;
		while (i < mot.length) {
			if (c.equals(mot[i])) {
				return sign[i];
			}
			i++;
		}
		return null;
	}
    public static boolean isNumber(String c, int i) {
		char[] nombre = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		int j = 0;
		while (j < nombre.length) {
			if (c.charAt(i) == nombre[j]) {
				return true;
			}
			j++;
		}

		return false;
	}
		public static String number(String c) {
		int i = 0;
		int t= 0;
		boolean vir = true;
             
		while (i < c.length()) {
			if (isNumber(c, i)) t++;
			else if(vir & c.charAt(t)==',') {
				t++;
				vir = false;
			}
			i++;
		}

		if (t == c.length() && !c.contains(",")) return "Nombre entier";
		else if (t == c.length() && !vir) return "Nombre reel";
		return null;

	}
	
	
	
	
	public static boolean Charac(String c, int i) {
		char[] alphabet = { 'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i',
				'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T',
				't', 'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z' };
		int j = 0;
		while (j < alphabet.length) {
			if (c.charAt(i) == alphabet[j]) {
				return true;
			}
			j++;
		}
		return false;

	}

	public static String ident(String c) {
           
		boolean verif_Premier = false;
		boolean tir = true;
		int p = 0;
		int i = 0;
		if (Charac(c,0)) {
                 
			p++;
			verif_Premier = true;
		}
		if (verif_Premier == true && c.length() == 1)
			return "identificateur";

		else if (c.length() > 1) {
			i = 1;
			while (i < c.length()) {

				if (Charac(c, i)){
					
                                        p++;
					tir=true;
					}
				else if (isNumber(c, i))
					{p++;
					tir=true;
					}
				else if (c.charAt(i) == '_' && tir) {
					tir=true;
					p++;
				}
				i++;
			}
			if (p == c.length())
				return "Identificateur";
		}
		return null;
	}

    
}
