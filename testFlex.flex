
class Yytoken {
  String token;
  int value;
  String name="Unary token";
  char charValue;
  float floatValue;

  Yytoken (String token) {
    this.token = token;
  }

  Yytoken (String token, int value) {
    this.token=token;
    this.value=value;
    this.name = Integer.toString(value);
  }

    Yytoken (String token, float value) {
    this.token=token;
    this.floatValue=value;
    this.name = Float.toString(value);
  }

    Yytoken (String token, char value) {
    this.token=token;
    this.charValue=value;
    this.name = Character.toString(value);
  }

  Yytoken (String token, String name) {
    this.token=token;
    this.name=name;
  }

   Yytoken (String token, boolean value) {
    this.token=token;
    this.name=Boolean.toString(value);
  }

  String getToken() {
    return token;
  }

  int getValue() {
    return value;
  }

  char getCharValue()
  {
  	return charValue;
  }

  float getFloatValue() {
    return floatValue;
  }

  String getName() {
    return name;
  }
}
%%

%unicode

%line
%column
%class testFlex
%state COMMENT
%state LINECOMMENT
%state STRING


%{
	private String string;
%}

digit = [0-9]
integer = -?[0-9]+
letter = [a-zA-Z]
identifier = {letter}({letter}|{digit})*
boolconst = "true"|"false"
whitespace = [ \t\r\n\f]
linecom = [\r\n]
char = \'({letter}|{digit})\'
str = \"{char}*\"
float = {integer}"."{digit}+
%%
<YYINITIAL>\" {yybegin(STRING); string="";}
<YYINITIAL>"+" {return new Yytoken("PLUS");}
<YYINITIAL>"*" {return new Yytoken("TIMES");}
<YYINITIAL>"-" {return new Yytoken("MINUS");}
<YYINITIAL>"/" {return new Yytoken("DIVIDE");}
<YYINITIAL>"::" {return new Yytoken("CONCAT");}
<YYINITIAL>"=" {return new Yytoken("ASSIGN");}

<YYINITIAL>"(" {return new Yytoken("LPAREN");}
<YYINITIAL>")" {return new Yytoken("RPAREN");}
<YYINITIAL>"[" {return new Yytoken("RBRACK");}
<YYINITIAL>"]" {return new Yytoken("LBRACK");}
<YYINITIAL>"{" {return new Yytoken("LCBRACK");}
<YYINITIAL>"}" {return new Yytoken("RCBRACK");}
<YYINITIAL>"." {return new Yytoken("DOT");}
<YYINITIAL>"," {return new Yytoken("COMMA");}
<YYINITIAL>":" {return new Yytoken("COLON");}
<YYINITIAL>";" {return new Yytoken("SEMI");}
<YYINITIAL>"|" {return new Yytoken("STROKE");}

<YYINITIAL>"==" {return new Yytoken("EQ");}
<YYINITIAL>">=" {return new Yytoken("GREATEREQ");}
<YYINITIAL>">" {return new Yytoken("GREATER");}
<YYINITIAL>"<" {return new Yytoken("LESS");}
<YYINITIAL>"<=" {return new Yytoken("LESSEQ");}
<YYINITIAL>"!=" {return new Yytoken("NEQ");}

<YYINITIAL>"if" {return new Yytoken("IF");}
<YYINITIAL>"else" {return new Yytoken("ELSE");}
<YYINITIAL>"while" {return new Yytoken("WHILE");}
<YYINITIAL>"do" {return new Yytoken("DO");}
<YYINITIAL>"repeat" {return new Yytoken("REPEAT");}
<YYINITIAL>"until" {return new Yytoken("UNTIL");}
<YYINITIAL>"void" {return new Yytoken("VOID");}
<YYINITIAL>"return" {return new Yytoken("RETURN");}
<YYINITIAL>"len" {return new Yytoken("LEN");}
<YYINITIAL>"fdef" {return new Yytoken("FDEF");}

<YYINITIAL>"||" {return new Yytoken("OR");}
<YYINITIAL>"&&" {return new Yytoken("AND");}
<YYINITIAL>"!" {return new Yytoken("NOT");}

<YYINITIAL>"tdef" {return new Yytoken("TDEF");}
<YYINITIAL>"bool" {return new Yytoken("BOOLTYPE");}
<YYINITIAL>"int" {return new Yytoken("INTEGERTYPE");}
<YYINITIAL>"float" {return new Yytoken("FLOATTYPE");}
<YYINITIAL>"char" {return new Yytoken("CHARTYPE");}
<YYINITIAL>"list" {return new Yytoken("LISTTYPE");}
<YYINITIAL>"string" {return new Yytoken("STRINGTYPE");}
<YYINITIAL>"tuple" {return new Yytoken("TUPLETYPE");}


<YYINITIAL>{boolconst} {return new Yytoken("BOOL",(new Boolean(yytext())).booleanValue());}
<YYINITIAL>{integer} {return new Yytoken("INTEGER", (new Integer(yytext())).intValue());}
<YYINITIAL>{float} {return new Yytoken("FLOAT", (new Float(yytext())).floatValue());}
<YYINITIAL>{char} {return new Yytoken("CHAR", (new Character(yytext().charAt(1))).charValue());}
<YYINITIAL>{identifier} {return new Yytoken("ID", yytext());}
<YYINITIAL>{whitespace} {}
<YYINITIAL>"/*" {yybegin(COMMENT);}
<COMMENT>"*/" {yybegin(YYINITIAL);}
<COMMENT>. {}
<YYINITIAL> "//" {yybegin(LINECOMMENT);}
<LINECOMMENT> {linecom} {yybegin(YYINITIAL); }
<LINECOMMENT>. {}
<YYINITIAL>. {System.out.println("error: unknown character " + yytext() + " found at line " + yyline);}
<STRING> 
{ 
\"                        { yybegin(YYINITIAL); return new Yytoken("STRING",new String(string)); } 
([^\"\n\t\r\']|{letter}|{digit})+       {string+=yytext(); }          
}
	   


