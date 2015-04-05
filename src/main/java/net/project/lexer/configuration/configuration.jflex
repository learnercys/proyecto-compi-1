package net.project.lexer.configuration;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import java.util.HashMap;
import net.project.parser.configuration.sym;

%%

%public
%class ConfigurationLexer
%unicode
%line
%column
%cupsym sym
%cup

%{

    public boolean hasErrors () {
        return errors.size() != 0;
    }

    public ArrayList<HashMap<String, String>> errors = new ArrayList<>();
    public ArrayList<HashMap<String, String>> symbols = new ArrayList<>();

    private Symbol symbol( int type, String typeName, String scope ) {
        addSymbol( yytext(), typeName, scope );
        return new Symbol( type, yyline, yycolumn );
    }

    private Symbol symbol( int type, String value, String typeName, String scope ) {
        addSymbol( value, typeName, scope );
        return new Symbol( type, yyline, yycolumn, value );
    }

    private void addSymbol(String value, String typeName, String scope ){
        HashMap<String, String> s = new HashMap<>();
        s.put("text", value);
        s.put("type", typeName);
        s.put("scope", scope);
        s.put("column", Integer.toString(yycolumn));
        s.put("line", Integer.toString(yyline));
    }

%}

// single characters
moreThan    = ">"
lessThan    = "<"
lessThanS   = "</"
dQuote      = [\"]
iString     = [^\"]+
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
xBomb           = "x-bomba"
xWeapon         = "x-arma"
xCredit         = "x-creditos"


// ER
id          = [a-zA-Z][a-zA-Z0-9_]+
intValue    = [:digit:]+
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

{initConfiguration} { return symbol( sym.init_configuration, "main tags", "root" ); }
{endConfiguration}  { return symbol( sym.end_configuration, "main tags", "root" ); }

{initBackground}    { return symbol( sym.init_background, "main tags", "configuration tag" ); }
{endBackground}     { return symbol( sym.end_background, "main tags", "configuration tag" ); }

{initFigure}        { return symbol( sym.init_figure, "main tags", "configuration tag" ); }
{endFigure}         { return symbol( sym.end_figure, "main tags", "configuration tag" ); }

{initDesign}        { return symbol( sym.init_design, "main tags", "configuration tag" ); }
{endDesign}         { return symbol( sym.end_design, "main tags", "configuration tag" ); }

// single words
{xName}             { return symbol( sym.x_name, "attribute name", "objects" ); }
{xPicture}          { return symbol( sym.x_picture, "attribute name", "objects" ); }
{xType}             { return symbol( sym.x_type, "attribute name", "objects" ); }
{xHero}             { return symbol( sym.x_hero, "attribute name", "figure tag" ); }
{xEnemy}            { return symbol( sym.x_enemy, "attribute name", "figure tag" ); }
{xLive}             { return symbol( sym.x_live, "attribute name", "figure tag" ); }
{xDestroy}          { return symbol( sym.x_destroy, "attribute name", "figure and design tags" ); }
{xDescription}      { return symbol( sym.x_description, "attribute name", "figure tag" ); }
{xFinish}           { return symbol( sym.x_finish, "attribute value", "design tag" ); }
{xBlock}            { return symbol( sym.x_block, "attribute value", "design tag" ); }
{xBonus}            { return symbol( sym.x_bonus, "attribute value", "design tag" ); }
{xBomb}             { return symbol( sym.x_bomb, "attribute value", "design tag" ); }
{xWeapon}           { return symbol( sym.x_weapon, "attribute value", "design tag" ); }
{xCredit}           { return symbol( sym.x_credit, "attribute value", "design tag" ); }


// single chars
{comma}             { return symbol( sym.comma, "blocks", "objects separation" ); }
{openBrace}         { return symbol( sym.open_brace, "blocks", "background, figure and design tags" ); }
{closeBrace}        { return symbol( sym.close_brace, "blocks", "background, figure an design tags" ); }
{equal}             { return symbol( sym.equal, "assignation", "atribute assignation" ); }
{semicolon}         { return symbol( sym.semicolon, "blocks", "attributes separation" ); }

// ER
{id}                { return symbol( sym.id, yytext(), "id", "attribute value" ); }
{intValue}          { return symbol( sym.int_value, yytext(), "integer", "attribute value" ); }
{stringValue}       { return symbol( sym.string_value, yytext(), "string | path", "attribute value" ); }

// ignore white spaces.

{whiteSpace}        {/* the life is short, whitespace not.*/}

// errors

. {
    System.out.println("Line: " + (yyline+1) + " Column: " + (yycolumn+1) + " - Lexical error in: " + yytext());
    HashMap<String, String> error = new HashMap<>();
    error.put("line", Integer.toString(yyline + 1));
    error.put("column", Integer.toString(yycolumn +1));
    error.put("text", yytext());
    error.put("number", Integer.toString(errors.size() + 1));
    errors.add( error );
}
