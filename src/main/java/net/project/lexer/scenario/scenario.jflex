package net.project.lexer.scenario;

import java_cup.runtime.Symbol;
import net.project.parser.scenario.sym;


%%

%public
%class ScenearioLexer
%unicode
%line
%column
%ignorecase
%cupsym Sym
%cup

%{
    private Symbol symbol( int type ) { return new Symbol( type, yyline, yycolumn); }

    private Symbol symbol( int type, Object value ) {
        return  new Symbol( type, yyline, yycolumn, value );
    }
%}

// single chars
moreThan    = ">"
lessThan    = "<"
lessThanS   = "</"
dQuote      = [\"]
iString     = [^\"]+
whiteSpace  = [\n\t\f]

// single chars with meaning

// tags single words
xSceneario      = "x-escenario"
xCharacters     = "x-personajes"
xHeros          = "x-heroes"
xEnemies        = "x-enemigos"
xWalls          = "x-paredes"
xXtras          = "x-extras"
xGuns           = "x-armas"
xBonus          = "x-bonus"
xFinish         = "meta"


// single words


// main tags
initScenario    =
endScenario     =

%%

{whiteSpace}    {/**/}

. {
    System.out.println("Line: " + (yyline + 1) + ", colun: " + (yycolumn + 1) + ", Lexical error in: " + yytext());
}
