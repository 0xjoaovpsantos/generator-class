import java.util.*;
import java.io.*;
public class Generator {
	
	public static void main (String[] args) {
		
		System.out.println("public class " + args[0] + " {");
		System.out.println("");

		for(int contador = 1; contador < args.length-1; contador+=2)
			System.out.println("	private " + args[contador] + " " + args[contador+1] + ";");
		
		System.out.println("");
		
		for(int contador = 1; contador < args.length-1; contador+=2){		
			System.out.println("	public void set" + args[contador+1].substring(0,1).toUpperCase().concat(args[contador+1].substring(1)) + "(" + args[contador] + " " + args[contador+1] + "){" );
			System.out.println("		this." + args[contador+1] + " = " + args[contador+1] + "; ");
			System.out.println("	}");
			System.out.println("");		
			System.out.println("	public " + args[contador] + " get" + args[contador+1].substring(0,1).toUpperCase().concat(args[contador+1].substring(1)) + "(){" );
			System.out.println("		return this." + args[contador+1] + "; ");
			System.out.println("	}");	
			System.out.println("");	
		}
		
		System.out.println("");
		System.out.println("}");
	}
}
