package calculette;

import java.util.Scanner;

public class calculette {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un chiffre:");
		String strUn = sc.nextLine();
		
		System.out.println("Veuillez saisir un deuxieme chiffre:");
		String strDeux = sc.nextLine();
		
		System.out.println("Veuillez saisir un opérateur:");
		String strOperand = sc.nextLine();
		System.out.println(strOperand);
		float res = 0;
		
		if(strOperand.equalsIgnoreCase("+")){
			System.out.println("dcvb");
			res = addition(Float.parseFloat(strUn), Float.parseFloat(strDeux));
		}else if(strOperand == "-"){
			res = soustraction(Float.parseFloat(strUn), Float.parseFloat(strDeux));
		}else if(strOperand == "*"){
			res = multiplication(Float.parseFloat(strUn), Float.parseFloat(strDeux));
		}else if(strOperand == "/"){
			res = division(Float.parseFloat(strUn), Float.parseFloat(strDeux));
		} else {
			System.out.println("Dans le else");
		}
		
		System.out.println("Le resultat est:" + res);
		

	}

	private static float division(float fltUn, float fltDeux) {
		return fltUn / fltDeux ;
	}

	private static float multiplication(float fltUn, float fltDeux) {
		return fltUn * fltDeux ;
	}

	private static float soustraction(float fltUn, float fltDeux) {
		return fltUn - fltDeux ;
	}

	private static float addition(float fltUn, float fltDeux) {
		System.out.println(fltUn);
		return fltUn + fltDeux ;
	}

}
