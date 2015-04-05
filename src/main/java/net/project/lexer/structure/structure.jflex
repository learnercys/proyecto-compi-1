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
    public boolean hasErrors() { return errors.size() > 0; }
    public boolean hasSymbols() { return symbols.size() > 0; }

    public ArrayList<HashMap<String,String>> errors = new ArrayList<>();
    public ArrayList<HashMap<String, String>> symbols = new ArrayList<>();

    private Symbol symbol( int type, String typeName, String scope ) {
        addSymbol( yytext(), typeName, scope );
        return new Symbol( type, yyline, yycolumn);
    }

    private Symbol symbol( int type, String value, String typeName, String scope ) {
        addSymbol( value, typeName, scope );
        return  new Symbol( type, yyline, yycolumn, value );
    }

    private void addSymbol( String value, String typeName, String scope) {
        HashMap<String, String> s = new HashMap<>();
        s.put("text", value);
        s.put("type", typeName);
        s.put("scope", scope);
        s.put("column", Integer.toString(yycolumn));
        s.put("line", Integer.toString(yyline));
        symbols.add(s);
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

{initScenario} { return symbol( sym.init_scenario, "tag", "root" ); }
{endScenario}  { return symbol( sym.end_scenario, "tag", "root" ); }

{initCharacters}    { return symbol( sym.init_characters, "tag", "scenario tag" ); }
{endCharacters}     { return symbol( sym.end_characters, "tag", "scenario tag" ); }

{initHeroes}    { return symbol( sym.init_heroes, "tag", "characters tag" ); }
{endHeroes}     { return symbol( sym.end_heroes, "tag", "characters tag" ); }

{initEnemies}   { return symbol( sym.init_enemies, "tag", "characters tag" ); }
{endEnemies}    { return symbol( sym.end_enemies, "tag", "characters tag" ); }

{initWalls}     { return symbol( sym.init_walls, "tag", "scenario tag" ); }
{endWalls}      { return symbol( sym.end_walls, "tag", "scenario tag" ); }

{initExtras}    { return symbol( sym.init_extras, "tag", "scenario tag" ); }
{endExtras}     { return symbol( sym.end_extras, "tag", "scenario tag" ); }

{initWeapons}   { return symbol( sym.init_weapons, "tag", "extras tag" ); }
{endWeapons}    { return symbol( sym.end_weapons, "tag", "extras tag" ); }

{initBonus}     { return symbol( sym.init_bonus, "tag", "extras tag" ); }
{endBonus}      { return symbol( sym.end_bonus, "tag", "extras tag" ); }

{finish}        { return symbol( sym.finish, "tag", "scenario tag"  ); }


// single words
{background}    { return symbol( sym.background, "attribute", "scenario tag" ); }
{height}        { return symbol( sym.height, "attribute", "scenario tag" ); }
{width}         { return symbol( sym.width, "attribute", "scenario tag" ); }

// single chars
{equal}         { return symbol( sym.equal, "assignation", "scenario tag" ); }
{closeParens}   { return symbol( sym.close_parens, "params", "heroes, enemies, walls, weapon, bonus and finish tags" ); }
{comma}         { return symbol( sym.comma, "params", "heroes, enemies, walls, weapon, bonus and finish tags" ); }
{dot}           { return symbol( sym.dot, "params", "heroes, enemies, walls, weapon, bonus and finish tags" ); }
{moreThan}      { return symbol( sym.more_than, "block", "root" ); }
{openParens}    { return symbol( sym.open_parens, "params", "heroes, enemies, walls, weapon, bonus and finish tags" ); }
{semicolon}     { return symbol( sym.semicolon, "block", "scenario tag" ); }

// ER
{id}            { return symbol( sym.id, yytext(), "id", "heroes, enemies, walls, weapon, bonus and finish tags" ); }
{intValue}      { return symbol( sym.int_value, yytext(), "int", "params" ); }

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
