import java.util.*;
import java.io.*;
public class Generator {
	
	public static void main (String[] args) throws IOException {
		
		FileWriter arq = new FileWriter("C:\\Users\\Joao Victor\\Documents\\Repositorios\\generator-class\\" + args[0] + ".java");
		PrintWriter gravarArq = new PrintWriter(arq);
		gravarArq.printf("public class " + args[0] + " {%n%n");

		for(int contador = 1; contador < args.length-1; contador+=2)
			gravarArq.printf("	private " + args[contador] + " " + args[contador+1] + "; %n");
		
		gravarArq.printf("%n");
		
		for(int contador = 1; contador < args.length-1; contador+=2){		
			gravarArq.printf("	public void set" + args[contador+1].substring(0,1).toUpperCase().concat(args[contador+1].substring(1)) + "(" + args[contador] + " " + args[contador+1] + "){ %n" );
			gravarArq.printf("		this." + args[contador+1] + " = " + args[contador+1] + "; %n");
			gravarArq.printf("	}%n");		
			gravarArq.printf("	%n	public " + args[contador] + " get" + args[contador+1].substring(0,1).toUpperCase().concat(args[contador+1].substring(1)) + "(){ %n" );
			gravarArq.printf("		return this." + args[contador+1] + "; %n");
			gravarArq.printf("	}%n");	
		}
		
		gravarArq.printf("%n}");
		arq.close();
	}
}

