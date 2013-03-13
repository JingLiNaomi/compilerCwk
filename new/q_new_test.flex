
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
%state STRING


%{
	private String string;
%}



LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

WhiteSpace = {LineTerminator} | [ \t\f]

Comment = {BlockComment} | {EndOfLineComment} 

BlockComment = "/*" [^*] ~"*/" 
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?

Digit = [0-9]
Letter = [a-zA-Z]
Identifier = {Letter}({Letter}|{Digit})*

%%
<YYINITIAL>{Identifier} {return new Yytoken("ID", yytext());}
<YYINITIAL>{WhiteSpace} {}
<YYINITIAL>{Comment} {}



