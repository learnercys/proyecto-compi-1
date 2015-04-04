package net.project.lexer.structure;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import java.util.HashMap;
import net.project.parser.structure.sym;


%%

%public
%class StructureLexer
%unicode
%line
%column
%cupsym sym
%cup

%{
    public boolean hasErrors() { return errors.size() != 0; }

    public ArrayList<HashMap<String,String>> errors = new ArrayList<>();

    private Symbol symbol( int type ) {
        return new Symbol( type, yyline, yycolumn);
    }

    private Symbol symbol( int type, Object value ) {
        return  new Symbol( type, yyline, yycolumn, value );
    }
%}

// single chars
lessThan    = "<"
lessThanS   = "</"
whiteSpace  = [ \n\t\f]

// single chars with meaning
closeParens = ")"
comma       = ","
dot         = "."
equal       = "="
moreThan    = ">"
openParens  = "("
semicolon   = ";"

// tags single words
xScenario       = "x-escenario"
xCharacters     = "x-personajes"
xHeroes         = "x-heroes"
xEnemies        = "x-enemigos"
xWalls          = "x-paredes"
xExtras         = "x-extras"
xWeapon         = "x-armas"
xBonus          = "x-bonus"
xFinish         = "meta"


// single words
background      = "background"
height          = "alto"
width           = "ancho"

// ER
id              = [a-zA-Z][a-zA-Z0-9_]+
intValue        = [:digit:]+

// main tags
initScenario    = {lessThan}  {xScenario}
endScenario     = {lessThanS} {xScenario} {moreThan}

initCharacters  = {lessThan}  {xCharacters} {moreThan}
endCharacters   = {lessThanS} {xCharacters} {moreThan}

initHeroes      = {lessThan}  {xHeroes} {moreThan}
endHeroes       = {lessThanS} {xHeroes} {moreThan}

initEnemies     = {lessThan}  {xEnemies} {moreThan}
endEnemies      = {lessThanS} {xEnemies} {moreThan}

initWalls       = {lessThan}  {xWalls} {moreThan}
endWalls        = {lessThanS} {xWalls} {moreThan}

initExtras      = {lessThan}  {xExtras} {moreThan}
endExtras       = {lessThanS} {xExtras} {moreThan}

initWeapons     = {lessThan}  {xWeapon} {moreThan}
endWeapons      = {lessThanS} {xWeapon} {moreThan}

initBonus       = {lessThan}  {xBonus} {moreThan}
endBonus        = {lessThanS} {xBonus} {moreThan}

finish          = {lessThan} {xFinish} {moreThan}

%%

// main tags

{initScenario} { return symbol( sym.init_scenario ); }
{endScenario}  { return symbol( sym.end_scenario ); }

{initCharacters}    { return symbol( sym.init_characters ); }
{endCharacters}     { return symbol( sym.end_characters ); }

{initHeroes}    { return symbol( sym.init_heroes ); }
{endHeroes}     { return symbol( sym.end_heroes ); }

{initEnemies}   { return symbol( sym.init_enemies ); }
{endEnemies}    { return symbol( sym.end_enemies ); }

{initWalls}     { return symbol( sym.init_walls ); }
{endWalls}      { return symbol( sym.end_walls ); }

{initExtras}    { return symbol( sym.init_extras ); }
{endExtras}     { return symbol( sym.end_extras ); }

{initWeapons}   { return symbol( sym.init_weapons ); }
{endWeapons}    { return symbol( sym.end_weapons ); }

{initBonus}     { return symbol( sym.init_bonus ); }
{endBonus}      { return symbol( sym.end_bonus ); }

{finish}        { return symbol( sym.finish ); }


// single words
{background}    { return symbol( sym.background ); }
{height}        { return symbol( sym.height ); }
{width}         { return symbol( sym.width ); }

// single chars
{equal}         { return symbol( sym.equal ); }
{closeParens}   { return symbol( sym.close_parens ); }
{comma}         { return symbol( sym.comma ); }
{dot}           { return symbol( sym.dot ); }
{moreThan}      { return symbol( sym.more_than ); }
{openParens}    { return symbol( sym.open_parens ); }
{semicolon}     { return symbol( sym.semicolon ); }

// ER
{id}            { return symbol( sym.id ); }
{intValue}      { return symbol( sym.int_value ); }

{whiteSpace}    {/* white spaces for dummies */}

. {
    System.out.println("Line: " + (yyline + 1) + ", column: " + (yycolumn + 1) + ", Lexical error in: " + yytext());
    HashMap<String, String> error = new HashMap<>();
    error.put("line", Integer.toString(yyline + 1));
    error.put("column", Integer.toString(yycolumn +1));
    error.put("text", yytext());
    error.put("number", Integer.toString(errors.size() + 1));
    errors.add( error );
}
