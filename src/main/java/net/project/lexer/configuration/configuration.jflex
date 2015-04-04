package net.project.lexer.configuration;

import java_cup.runtime.Symbol;
import net.project.parser.configuration.sym;
import net.project.parser.configuration.

%%

%public
%class ConfigurationLexer
%unicode
%line
%column
%ignorecase
%cupsym sym
%cup

%{
    private Symbol symbol( int type ) {
        return new Symbol( type, yyline, yycolumn );
    }

    private Symbol symbol( int type, Object value ) {
        return new Symbol( type, yyline, yycolumn, value );
    }

%}

// single characters
moreThan    = ">"
lessThan    = "<"
lessThanS   = "</"
dQuote      = [\"]
iString     = [^\"]+
// is not a single char i'm sorry =D.
iPath       = ([\/][^/]+)+
whiteSpace  = [ \n\t\f]

// single chars with meaning
openBrace   = "{"
closeBrace  = "}"
comma       = ","
equal       = "="
semicolon   = ";"

/*
 * Single words
 */

// main tags -- single words
swConfiguration = "configuration"
swBackground    = "background"
swFigure        = "figure"
swDesign        = "design"

// real single words.
xName           = "x-nombre"
xPicture        = "x-imagen"
xType           = "x-tipo"
xHero           = "x-heroe"
xEnemy          = "x-enemigo"
xLive           = "x-vida"
xDestroy        = "x-destruir"
xDescription    = "x-descripcion"
xFinish         = "x-meta"
xBlock          = "x-bloque"
xBonus          = "x-bonus"
xBomb           = "x-bomb"
xWeapon         = "x-arma"
xCredit         = "x-creditos"


// ER
id          = [a-zA-Z][a-za-Z0-9_]+
intValue    = [:digit:]+
path        = {dQuote} {iPath} {dQuote}
stringValue      = {dQuote} {iString} {dQuote}

// main tags

initConfiguration   = {lessThan}  {swConfiguration} {moreThan}
endConfiguration    = {lessThanS} {swConfiguration} {moreThan}

initBackground      = {lessThan}  {swBackground} {moreThan}
endBackground       = {lessThanS} {swBackground} {moreThan}

initFigure          = {lessThan}  {swFigure} {moreThan}
endFigure           = {lessThanS} {swFigure} {moreThan}

initDesign          = {lessThan}  {swDesign} {moreThan}
endDesign           = {lessThanS} {swDesign} {moreThan}


%%

// main  tags

{initConfiguration} { return symbol( sym.init_configuration ); }
{endConfiguration}  { return symbol( sym.end_configuration ); }

{initBackground}    { return symbol( sym.init_background ); }
{endBackground}     { return symbol( sym.end_configuration ); }

{initFigure}        { return symbol( sym.init_figure ); }
{endFigure}         { return symbol( sym.end_figure ); }

{initDesign}        { return symbol( sym.init_design ); }
{endDesign}         { return symbol( sym.end_design ); }

// single words
{xName}             { return symbol( sym.x_name ); }
{xPicture}          { return symbol( sym.x_picture ); }
{xType}             { return symbol( sym.x_type ); }
{xHero}             { return symbol( sym.x_hero ); }
{xEnemy}            { return symbol( sym.x_enemy ); }
{xLive}             { return symbol( sym.x_live ); }
{xDestroy}          { return symbol( sym.x_destroy ); }
{xDescription}      { return symbol( sym.x_description ); }
{xFinish}           { return symbol( sym.x_finish ); }
{xBlock}            { return symbol( sym.x_block ); }
{xBonus}            { return symbol( sym.x_bonus ); }
{xBomb}             { return symbol( sym.x_bomb ); }
{xWeapon}           { return symbol( sym.x_weapon ); }
{xCredit}           { return symbol( sym.x_credit ); }


// single chars
{comma}             { return symbol( sym.comma ); }
{openBrace}         { return symbol( sym.open_brace ); }
{closeBrace}        { return symbol( sym.close_brace ); }
{equal}             { return symbol( sym.equal ); }
{semicolon}         { return symbol( sym.semicolon ); }

// ER
{id}                { return symbol( sym.id ); }
{path}              { return symbol( sym.path ); }
{intValue}          { return symbol( sym.int_value ); }
{stringValue}            { return symbol( sym.string_value ); }

// ignore white spaces.

{whiteSpace}        {/* the life is short, whitespace not.*/}

// errors

. {
    System.out.println("Line: " + (yyline+1) + " Column: " + (yycolumn+1) + " - Lexical error in: " + yytext());
}
