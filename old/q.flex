import java_cup.runtime.*; 


%%

%unicode
%cup
%line
%column



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
float = {digit}+[\.]{digit}*
boolconst = "true"|"false"
float = {integer}"."{digit}+
%%

<YYINITIAL>"+" {System.out.println("Obtain token: "+yytext()); return new Symbol(sym.PLUS);}
<YYINITIAL>"*" {return new Symbol(sym.TIMES);}
<YYINITIAL>"-" {return new Symbol(sym.MINUS);}
<YYINITIAL>"/" {return new Symbol(sym.DIVIDE);}
<YYINITIAL>"::" {return new Symbol(sym.CONCAT);}
<YYINITIAL>"=" {return new Symbol(sym.ASSIGN);}

<YYINITIAL>"(" {return new Symbol(sym.LPAREN);}
<YYINITIAL>")" {return new Symbol(sym.RPAREN);}
<YYINITIAL>"[" {return new Symbol(sym.LBRACK);}
<YYINITIAL>"]" {return new Symbol(sym.RBRACK);}
<YYINITIAL>"{" {return new Symbol(sym.LCBRACK);}
<YYINITIAL>"}" {return new Symbol(sym.RCBRACK);}
<YYINITIAL>"." {return new Symbol(sym.DOT);}
<YYINITIAL>"," {return new Symbol(sym.COMMA);}
<YYINITIAL>":" {return new Symbol(sym.COLON);}
<YYINITIAL>";" {return new Symbol(sym.SEMI);}
<YYINITIAL>"|" {return new Symbol(sym.STROKE);}

<YYINITIAL>"==" {return new Symbol(sym.EQ);}
<YYINITIAL>">=" {return new Symbol(sym.GREATEREQ);}
<YYINITIAL>">" {return new Symbol(sym.GREATER);}
<YYINITIAL>"<" {return new Symbol(sym.LESS);}
<YYINITIAL>"<=" {return new Symbol(sym.LESSEQ);}
<YYINITIAL>"!=" {return new Symbol(sym.NEQ);}
<YYINITIAL>\" {string = ""; yybegin(STRING);}
<YYINITIAL>"if" {return new Symbol(sym.IF);}
<YYINITIAL>"else" {return new Symbol(sym.ELSE);}
<YYINITIAL>"while" {return new Symbol(sym.WHILE);}
<YYINITIAL>"do" {return new Symbol(sym.DO);}
<YYINITIAL>"repeat" {return new Symbol(sym.REPEAT);}
<YYINITIAL>"until" {return new Symbol(sym.UNTIL);}
<YYINITIAL>"void" {return new Symbol(sym.VOID);}
<<<<<<< HEAD:q.flex

<YYINITIAL>"or" {return new Symbol(sym.OR);}
<YYINITIAL>"and" {return new Symbol(sym.AND);}
<YYINITIAL>"not" {return new Symbol(sym.NOT);}

<YYINITIAL>
{
	"int" {return new Symbol(sym.INTEGERTYPE);}
	"float" {return new Symbol(sym.FLOATTYPE);}
	"char" {return new Symbol(sym.CHARTYPE);}
	"bool" {return new Symbol(sym.BOOLTYPE);}
	"list" {return new Symbol(sym.LISTTYPE);}
	"string" {return new Symbol(sym.STRINGTYPE);}
	"tuple" {return new Symbol(sym.TUPLETYPE);}
}

<YYINITIAL>
{
	"len" {return new Symbol(sym.LEN);}
	"tdef" {return new Symbol(sym.TDEF);}
	"fdef" {return new Symbol(sym.FDEF);}
}

=======
<YYINITIAL>"return" {return new Symbol(sym.RETURN);}
<YYINITIAL>"len" {return new Symbol(sym.LEN);}
<YYINITIAL>"fdef" {return new Symbol(sym.FDEF);}

<YYINITIAL>"||" {return new Symbol(sym.OR);}
<YYINITIAL>"&&" {return new Symbol(sym.AND);}
<YYINITIAL>"!" {return new Symbol(sym.NOT);}

<YYINITIAL>"tdef" {return new Symbol(sym.TDEF);}
<YYINITIAL>"bool" {return new Symbol(sym.BOOLTYPE);}
<YYINITIAL>"int" {return new Symbol(sym.INTEGERTYPE);}
<YYINITIAL>"float" {return new Symbol(sym.FLOATTYPE);}
<YYINITIAL>"char" {return new Symbol(sym.CHARTYPE);}
<YYINITIAL>"list" {return new Symbol(sym.LISTTYPE);}
<YYINITIAL>"string" {return new Symbol(sym.STRINGTYPE);}
<YYINITIAL>"tuple" {return new Symbol(sym.TUPLETYPE);}

>>>>>>> dd6f4b07c1895bf0db60b3f0a615f108a8343e28:old/q.flex
<YYINITIAL>{boolconst} {return new Symbol(sym.BOOL,(new Boolean(yytext())).booleanValue());}
<YYINITIAL>{integer} {return new Symbol(sym.INTEGER, (new Integer(yytext())).intValue());}
<YYINITIAL>{float} {return new Symbol(sym.FLOAT, (new Float(yytext())).floatValue());}
<YYINITIAL>{char} {return new Symbol(sym.CHAR, (new Character(yytext().charAt(0))).charValue());}
<YYINITIAL>{identifier} {System.out.println("Obtain token: "+yytext()); return new Symbol(sym.ID, yytext());}
<YYINITIAL>{whitespace} {}
<YYINITIAL>"/*" {yybegin(COMMENT);}
<COMMENT>"*/" {yybegin(YYINITIAL);}
<COMMENT>. {}
<YYINITIAL> "//" {yybegin(LINECOMMENT);}
<LINECOMMENT> {linecom} {yybegin(YYINITIAL); }
<LINECOMMENT>. {}
<YYINITIAL>. {System.out.println("error: unknown character " + yytext() + " found at line " + yyline);}
<<<<<<< HEAD:q.flex
<STRING> 
{ 
\"                        { yybegin(YYINITIAL); return new Symbol(sym.STRING,new String(string)); } 
([^\"\n\t\r\']|{letter}|{digit})+       {string+=yytext(); }          
}
=======
<STRING> { \"  { yybegin(YYINITIAL); return new Symbol(sym.STRING,new String(string)); } 
       ([^\"\n\t\r]|{letter}|{digit})+       {string+=yytext(); }    }
	   
>>>>>>> dd6f4b07c1895bf0db60b3f0a615f108a8343e28:old/q.flex


