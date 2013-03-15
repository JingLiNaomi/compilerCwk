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
    Yylex scanner = new Yylex(reader);
      parser p = new parser(scanner); 
      Object result = p.parse(); 
      if(parser.parser_successful)
    //  p.debug_parse();
    //  if(result!=null)
        System.out.println("Parsing is successful");
      else
        System.out.println("Parsing is unsuccessful");
      //System.out.println(result.toString());
    //  System.out.println("Test1");
    } catch (Exception e) { 
      System.out.println("Error");
    //  System.out.println(e.getMessage().toString());
      // do cleanup here -- possibly rethrow e */ 
      //} finally { 
        // do close out here 
        } 
/*      String dirName = null;
try {

dirName = argv[1];

parser p = new parser( new File( dirName, argv[2] ) );
Object result = p.debug_parse(); // For debugging
}
catch ( Exception e ) {
System.err.println( "Exception at " );
e.printStackTrace();
}*/
  } 
}

/*  Return to Main for our Calculator  */