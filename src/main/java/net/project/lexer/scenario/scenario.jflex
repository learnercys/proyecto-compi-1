package net.project.lexer.scenario;

import net.project.parser.scenario.*;


%%

%public
%class LexerSceneario
%unicode
%line
%column
%ignorecase
%cupsym Sym
%cup


%%

. {
    System.out.println("Line: " + (yyline + 1) + ", colun: " + (yycolumn + 1) + ", Lexical error in: " + yytext());
}
