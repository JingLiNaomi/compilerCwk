import java.io.*;
import java.lang.Exception;

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
      {
        System.out.println("Parsing is successful");
      }
      else
      {
        System.out.println("Parsing is unsuccessful");
      }
    } catch (Exception e) { 
	System.out.println("Error is catched");
        } 

  } 
}
