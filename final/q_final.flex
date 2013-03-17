import java_cup.runtime.*; 


%%
 
%cup 
%line

%state COMMENT
%state LINECOMMENT
%state STRING
%state MAIN
%{
private String string;
private String section="declaration list";
%}
digit = [0-9]
integer = -?{digit}+
letter = [a-zA-Z]
identifier = {letter}({letter}|{digit})*
whitespace = [ \t\r\n\f]
linecom = [\r\n]
multiLineComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
char = \'({letter}|{digit})\'
float = -?{digit}+[\.]{digit}*
boolconst = "true"|"false"
%%
<YYINITIAL>{multiLineComment} {}
<YYINITIAL>"+" {return new Symbol(sym.PLUS);}
<YYINITIAL>"*" {return new Symbol(sym.TIMES);}
<YYINITIAL>"-" {return new Symbol(sym.MINUS);}
<YYINITIAL>"/" {return new Symbol(sym.DIVIDE);}
<YYINITIAL>"::" {return new Symbol(sym.CONCAT);}
<YYINITIAL>"=" {return new Symbol(sym.ASSIGN);}

<YYINITIAL>"(" {return new Symbol(sym.LPAREN);}
<YYINITIAL>")" {return new Symbol(sym.RPAREN);}
<YYINITIAL>"]" {return new Symbol(sym.RBRACK);}
<YYINITIAL>"[" {return new Symbol(sym.LBRACK);}
<YYINITIAL>"{" {section="main";return new Symbol(sym.LCBRACK);}
<YYINITIAL>"}" {return new Symbol(sym.RCBRACK);}
<YYINITIAL>"." {return new Symbol(sym.DOT);}
<YYINITIAL>"," {return new Symbol(sym.COMMA);}
<YYINITIAL>":" {return new Symbol(sym.COLON);}
<YYINITIAL>";" {return new Symbol(sym.SEMI);}
<YYINITIAL>"|" {return new Symbol(sym.STROKE);}

<YYINITIAL>"==" {return new Symbol(sym.EQ);}
<YYINITIAL>"!=" {return new Symbol(sym.NEQ);}
<YYINITIAL>">=" {return new Symbol(sym.GREATEREQ);}
<YYINITIAL>">" {return new Symbol(sym.GREATER);}
<YYINITIAL>"<" {return new Symbol(sym.LESS);}
<YYINITIAL>"<=" {return new Symbol(sym.LESSEQ);}
<YYINITIAL>\" {string = ""; yybegin(STRING);}
<YYINITIAL>"if" {return new Symbol(sym.IF);}
<YYINITIAL>"else" {return new Symbol(sym.ELSE);}
<YYINITIAL>"while" {return new Symbol(sym.WHILE);}
<YYINITIAL>"do" {return new Symbol(sym.DO);}
<YYINITIAL>"repeat" {return new Symbol(sym.REPEAT);}
<YYINITIAL>"until" {return new Symbol(sym.UNTIL);}
<YYINITIAL>"void" {return new Symbol(sym.VOID);}
<YYINITIAL>"return" {return new Symbol(sym.RETURN);}

<YYINITIAL>"||" {return new Symbol(sym.OR);}
<YYINITIAL>"&&" {return new Symbol(sym.AND);}
<YYINITIAL>"!" {return new Symbol(sym.NOT);}

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
	"in" {return new Symbol(sym.IN);}
	"tdef" {return new Symbol(sym.TDEF);}
	"fdef" {return new Symbol(sym.FDEF);}
}

<YYINITIAL>{boolconst} {return new Symbol(sym.BOOL,(new Boolean(yytext())).booleanValue());}
<YYINITIAL>{integer} {return new Symbol(sym.INTEGER, (new Integer(yytext())).intValue());}
<YYINITIAL>{float} {return new Symbol(sym.FLOAT, (new Float(yytext())).floatValue());}
<YYINITIAL>{char} {return new Symbol(sym.CHAR, (new Character(yytext().charAt(0))).charValue());}
<YYINITIAL>{identifier} {return new Symbol(sym.ID, yytext());}
<YYINITIAL>{whitespace} {}
<YYINITIAL> "//" {yybegin(LINECOMMENT);}
<LINECOMMENT> {linecom} {yybegin(YYINITIAL); }
<LINECOMMENT>. {}
<YYINITIAL>. {System.out.println("error: unknown character " + yytext() + " found at line " + yyline);  
<<<<<<< HEAD
        System.out.println("Error is in "+section);
=======
        System.out.println("Error is in "+parser.section);
        return new Symbol(sym.ILLEGALCHAR);
>>>>>>> added error report statements
      }
<STRING> 
{ 
\"                        { yybegin(YYINITIAL); return new Symbol(sym.STRING,new String(string)); } 
([^\"\n\t\r\']|{letter}|{digit})+       {string+=yytext(); }          
}


