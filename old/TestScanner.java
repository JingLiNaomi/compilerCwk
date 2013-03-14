import java.io.*;

public class TestScanner {

    public static void main (String[] args) throws IOException {
		try{
		testFlex myscanner = new testFlex(System.in);
		Yytoken nextToken = myscanner.yylex();
		
			while (nextToken != null) {
				System.out.println(nextToken.getToken()+" "+nextToken.getName());
				nextToken = myscanner.yylex();
			}
		}
		catch(Exception e)
		{
			System.out.println("Lexical error");
		}


    }

}