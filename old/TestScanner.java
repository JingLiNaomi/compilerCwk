import java.io.*;

public class TestScanner {

    public static void main (String[] args) throws IOException {
	
	testFlex myscanner = new testFlex(System.in);
	Yytoken nextToken = myscanner.yylex();
	while (nextToken != null) {
	    System.out.println(nextToken.getToken()+" "+nextToken.getName());
	    nextToken = myscanner.yylex();
	}


    }

}