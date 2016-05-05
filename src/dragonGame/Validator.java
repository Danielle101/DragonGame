package dragonGame;
import java.util.*;
public class Validator {
	
		public static String get_String(String prompt) {
	    String s = "";
	    boolean isValid = false;
	    Scanner sc = new Scanner(System.in);
	    while (!isValid){ // loops until user enters a non-blank line

	    System.out.print(prompt);
	    s = sc.nextLine();
	    if (!s.equals(""))
	    isValid = true;
	}

	    return s;

	}
	       

	    public static String getString(String prompt)
	    {

	            String s = null;
	            boolean isValid = false;
	            while (!isValid)

	       {
	            s = get_String(prompt);
	            if (s.compareTo("Y") == 0 || s.compareTo("y") == 0 || s.compareTo("N") == 0 || s.compareTo("n") == 0)
	            isValid = true;
	            else
	            System.out.println("\nError! Entry must be 'y' or 'n'. Try again.");
	       }

	            return s;
	     }
	    public static String getEscape(String prompt)
	    {

	            String s = null;
	            boolean isValid = false;
	            while (!isValid)

	       {
	            s = get_String(prompt);
	            if (s.compareTo("FB") == 0 || s.compareTo("fb") == 0 || s.compareTo("RA") == 0 || s.compareTo("ra") == 0)
	            isValid = true;
	            else
	            System.out.println("\nError! Entry must be 'fb' or 'ra'. Try again.");
	       }

	            return s;
	     }
	    public static String getHeads(String prompt)
	    {

	            String s = null;
	            boolean isValid = false;
	            while (!isValid)

	       {
	            s = get_String(prompt);
	            if (s.equalsIgnoreCase("three") || s.equalsIgnoreCase("two") || s.equalsIgnoreCase("one") )
	            isValid = true;
	            else
	            System.out.println("\nError! Entry must be 'one' or 'two' or 'three'. Try again.");
	       }

	            return s;
	     }
	    public static String getWeapon(String prompt)
	    {

	            String s = null;
	            boolean isValid = false;
	            while (!isValid)

	       {
	            s = get_String(prompt);
	            if (s.equalsIgnoreCase("slingshot") || s.equalsIgnoreCase("sword") )
	            isValid = true;
	            else
	            System.out.println("\nError! Entry must be 'slingshot' or 'sword'. Try again.");
	       }

	            return s;
	     }
	    public static String getEyes(String prompt)
	    {

	            String s = null;
	            boolean isValid = false;
	            while (!isValid)

	       {
	            s = get_String(prompt);
	            if (s.equalsIgnoreCase("red") || s.equalsIgnoreCase("blue") )
	            isValid = true;
	            else
	            System.out.println("\nError! Entry must be 'red' or 'blue'. Try again.");
	       }

	            return s;
	     }
	
}
