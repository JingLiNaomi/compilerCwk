/* 
Commented By: Christopher Lopes 
File Name: Main.java 
To Create: After the scanner, lcalc.flex, and the parser, ycalc.cup, have been 
           created. 
                > javac Main.java 
To Run: > java Main test.txt 
                where test.txt is an test input file for the calculator. 
*/
import java.io.*;


public class Main {

  static boolean do_debug_parse = false; 
  static public void main(String argv[]) {

  /* Start the parser */ 
  try { 
    FileReader reader = new FileReader(argv[0]);
      parser p = new parser(new Yylex(reader)); 
      Object result = p.parse(); 
      if(result!=null)
        System.out.println("Parsing is successful");
      //System.out.println(result.toString());
    //  System.out.println("Test1");
    } catch (Exception e) { 
      System.out.println("Error"+e.getMessage().toString());
    //  System.out.println(e.getMessage().toString());
      /* do cleanup here -- possibly rethrow e */ 
      } finally { 
        /* do close out here */ 
        } 
  } 
}

/*  Return to Main for our Calculator  */