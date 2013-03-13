import java_cup.runtime.*;

%%

%public
%class Scanner
%implements sym

%unicode

%line
%column

%cup




LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

WhiteSpace = {LineTerminator} | [ \t\f]

Comment = {TraditionalComment} | {EndOfLineComment} | 
          {DocumentationComment}

BlockComment = "/*" [^*] ~"*/" 
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?

Digit = [0-9]
Letter = [a-zA-Z]
Identifier = {Letter}({Letter}|{Digit})*






