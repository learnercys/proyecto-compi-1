
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Apr 02 03:31:06 CST 2015
//----------------------------------------------------

package net.project.parser.scenario;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Apr 02 03:31:06 CST 2015
  */
public class ScenarioParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ScenarioParser() {super();}

  /** Constructor which sets the default scanner. */
  public ScenarioParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ScenarioParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\055\000\002\002\007\000\002\002\004\000\002\003" +
    "\005\000\002\003\003\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\005\005\000\002\006\005\000" +
    "\002\007\005\000\002\010\004\000\002\010\003\000\002" +
    "\011\003\000\002\011\003\000\002\011\003\000\002\011" +
    "\003\000\002\012\005\000\002\013\004\000\002\013\003" +
    "\000\002\014\003\000\002\014\003\000\002\015\005\000" +
    "\002\016\010\000\002\017\005\000\002\020\004\000\002" +
    "\020\003\000\002\021\010\000\002\022\005\000\002\023" +
    "\010\000\002\024\003\000\002\024\006\000\002\025\005" +
    "\000\002\026\004\000\002\026\003\000\002\027\003\000" +
    "\002\027\003\000\002\030\005\000\002\031\004\000\002" +
    "\031\003\000\002\032\010\000\002\033\005\000\002\034" +
    "\004\000\002\034\003\000\002\035\010\000\002\036\012" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\153\000\004\004\004\001\002\000\010\034\011\035" +
    "\007\036\013\001\002\000\004\002\006\001\002\000\004" +
    "\002\000\001\002\000\004\027\154\001\002\000\006\030" +
    "\ufffd\032\ufffd\001\002\000\004\027\152\001\002\000\006" +
    "\030\021\032\022\001\002\000\004\027\017\001\002\000" +
    "\006\030\ufffb\032\ufffb\001\002\000\006\030\ufffc\032\ufffc" +
    "\001\002\000\006\030\ufffe\032\ufffe\001\002\000\004\037" +
    "\020\001\002\000\006\030\ufff9\032\ufff9\001\002\000\012" +
    "\006\030\014\026\016\025\024\034\001\002\000\010\034" +
    "\011\035\007\036\013\001\002\000\006\030\uffff\032\uffff" +
    "\001\002\000\014\005\ufff3\006\ufff3\014\ufff3\016\ufff3\024" +
    "\ufff3\001\002\000\006\020\121\022\120\001\002\000\004" +
    "\040\103\001\002\000\014\005\ufff6\006\ufff6\014\ufff6\016" +
    "\ufff6\024\ufff6\001\002\000\010\006\030\010\047\012\050" +
    "\001\002\000\014\005\ufff5\006\ufff5\014\ufff5\016\ufff5\024" +
    "\ufff5\001\002\000\014\005\ufff2\006\ufff2\014\ufff2\016\ufff2" +
    "\024\ufff2\001\002\000\014\005\046\006\030\014\026\016" +
    "\025\024\034\001\002\000\004\040\036\001\002\000\014" +
    "\005\ufff4\006\ufff4\014\ufff4\016\ufff4\024\ufff4\001\002\000" +
    "\004\031\037\001\002\000\004\037\040\001\002\000\004" +
    "\033\041\001\002\000\004\037\042\001\002\000\004\025" +
    "\043\001\002\000\004\024\044\001\002\000\014\005\uffd5" +
    "\006\uffd5\014\uffd5\016\uffd5\024\uffd5\001\002\000\014\005" +
    "\ufff7\006\ufff7\014\ufff7\016\ufff7\024\ufff7\001\002\000\004" +
    "\002\001\001\002\000\004\040\072\001\002\000\004\040" +
    "\062\001\002\000\006\010\047\012\050\001\002\000\004" +
    "\007\uffef\001\002\000\004\007\056\001\002\000\004\007" +
    "\uffed\001\002\000\004\007\uffee\001\002\000\020\005\ufff1" +
    "\006\ufff1\010\ufff1\012\ufff1\014\ufff1\016\ufff1\024\ufff1\001" +
    "\002\000\004\007\ufff0\001\002\000\006\013\uffe8\040\uffe8" +
    "\001\002\000\006\013\071\040\062\001\002\000\004\031" +
    "\063\001\002\000\004\037\064\001\002\000\004\033\065" +
    "\001\002\000\004\037\066\001\002\000\004\025\067\001" +
    "\002\000\006\013\uffe7\040\uffe7\001\002\000\006\013\uffe9" +
    "\040\uffe9\001\002\000\004\007\uffea\001\002\000\004\031" +
    "\075\001\002\000\004\011\074\001\002\000\004\007\uffec" +
    "\001\002\000\004\037\076\001\002\000\004\033\077\001" +
    "\002\000\004\037\100\001\002\000\004\025\101\001\002" +
    "\000\004\011\uffeb\001\002\000\004\015\115\001\002\000" +
    "\004\031\104\001\002\000\004\037\106\001\002\000\004" +
    "\033\112\001\002\000\010\025\uffe4\026\107\033\uffe4\001" +
    "\002\000\004\026\110\001\002\000\004\037\111\001\002" +
    "\000\006\025\uffe3\033\uffe3\001\002\000\004\037\106\001" +
    "\002\000\004\025\114\001\002\000\004\015\uffe5\001\002" +
    "\000\014\005\uffe6\006\uffe6\014\uffe6\016\uffe6\024\uffe6\001" +
    "\002\000\010\017\uffe0\020\uffe0\022\uffe0\001\002\000\010" +
    "\017\uffdf\020\uffdf\022\uffdf\001\002\000\004\040\142\001" +
    "\002\000\004\040\130\001\002\000\010\017\124\020\121" +
    "\022\120\001\002\000\010\017\uffde\020\uffde\022\uffde\001" +
    "\002\000\014\005\uffe2\006\uffe2\014\uffe2\016\uffe2\024\uffe2" +
    "\001\002\000\010\017\uffe1\020\uffe1\022\uffe1\001\002\000" +
    "\006\021\uffdb\040\uffdb\001\002\000\006\021\136\040\130" +
    "\001\002\000\004\031\131\001\002\000\004\037\132\001" +
    "\002\000\004\033\133\001\002\000\004\037\134\001\002" +
    "\000\004\025\135\001\002\000\006\021\uffda\040\uffda\001" +
    "\002\000\010\017\uffdd\020\uffdd\022\uffdd\001\002\000\006" +
    "\021\uffdc\040\uffdc\001\002\000\006\023\uffd7\040\uffd7\001" +
    "\002\000\006\023\150\040\142\001\002\000\004\031\143" +
    "\001\002\000\004\037\144\001\002\000\004\033\145\001" +
    "\002\000\004\037\146\001\002\000\004\025\147\001\002" +
    "\000\006\023\uffd6\040\uffd6\001\002\000\010\017\uffd9\020" +
    "\uffd9\022\uffd9\001\002\000\006\023\uffd8\040\uffd8\001\002" +
    "\000\004\040\153\001\002\000\006\030\ufffa\032\ufffa\001" +
    "\002\000\004\037\155\001\002\000\006\030\ufff8\032\ufff8" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\153\000\004\002\004\001\001\000\014\003\011\004" +
    "\015\005\007\006\014\007\013\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\016\010\032\011\026\012\030" +
    "\022\034\025\023\036\031\001\001\000\012\004\022\005" +
    "\007\006\014\007\013\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\026\121\027\115\030\116\033\122\001" +
    "\001\000\004\023\101\001\001\000\002\001\001\000\014" +
    "\012\050\013\052\014\051\015\054\017\053\001\001\000" +
    "\002\001\001\000\002\001\001\000\014\011\044\012\030" +
    "\022\034\025\023\036\031\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\016\072\001\001\000\006\020\060\021\057\001" +
    "\001\000\010\014\056\015\054\017\053\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\021\067\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\024\104\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\024\112\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\034\140\035\137\001\001\000\006\031\126\032" +
    "\125\001\001\000\010\027\124\030\116\033\122\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\032\136\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\035\150\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ScenarioParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ScenarioParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ScenarioParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public boolean hasUnRecoveredSyntaxError = false;

    public void syntax_error( Symbol currentToken ) {
        // just to avoid native syntax_error method.
    }

    public void unrecovered_syntax_error( Symbol s ) throws java.lang Exception {
        // has an un-recovered syntax error(structure error)
        this.hasUnRecoveredSyntaxError = true;
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ScenarioParser$actions {
  private final ScenarioParser parser;

  /** Constructor */
  CUP$ScenarioParser$actions(ScenarioParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ScenarioParser$do_action(
    int                        CUP$ScenarioParser$act_num,
    java_cup.runtime.lr_parser CUP$ScenarioParser$parser,
    java.util.Stack            CUP$ScenarioParser$stack,
    int                        CUP$ScenarioParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ScenarioParser$result;

      /* select the action based on the action number */
      switch (CUP$ScenarioParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // FINISH ::= finish id open_parens int_value comma int_value close_parens finish 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("FINISH",28, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-7)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // BONUS_ELEMENT ::= id open_parens int_value comma int_value close_parens 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("BONUS_ELEMENT",27, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-5)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // BONUS_STR ::= BONUS_ELEMENT 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("BONUS_STR",26, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // BONUS_STR ::= BONUS_STR BONUS_ELEMENT 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("BONUS_STR",26, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-1)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // BONUS ::= init_bonus BONUS_STR end_bonus 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("BONUS",25, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-2)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // WEAPON ::= id open_parens int_value comma int_value close_parens 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("WEAPON",24, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-5)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // WEAPONS_STR ::= WEAPON 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("WEAPONS_STR",23, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // WEAPONS_STR ::= WEAPONS_STR WEAPON 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("WEAPONS_STR",23, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-1)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // WEAPONS ::= init_weapons WEAPONS_STR end_weapons 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("WEAPONS",22, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-2)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // EXTRAS_ELEMENT ::= BONUS 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("EXTRAS_ELEMENT",21, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // EXTRAS_ELEMENT ::= WEAPONS 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("EXTRAS_ELEMENT",21, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // EXTRAS_STR ::= EXTRAS_ELEMENT 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("EXTRAS_STR",20, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // EXTRAS_STR ::= EXTRAS_STR EXTRAS_ELEMENT 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("EXTRAS_STR",20, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-1)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // EXTRAS ::= init_extras EXTRAS_STR end_extras 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("EXTRAS",19, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-2)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // WALL_INT ::= int_value dot dot int_value 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("WALL_INT",18, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-3)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // WALL_INT ::= int_value 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("WALL_INT",18, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // WALL ::= id open_parens WALL_INT comma WALL_INT close_parens 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("WALL",17, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-5)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // WALLS ::= init_walls WALL end_walls 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("WALLS",16, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-2)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // ENEMY ::= id open_parens int_value comma int_value close_parens 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("ENEMY",15, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-5)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // ENEMIES_STR ::= ENEMY 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("ENEMIES_STR",14, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // ENEMIES_STR ::= ENEMIES_STR ENEMY 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("ENEMIES_STR",14, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-1)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // ENEMIES ::= init_enemies ENEMIES_STR end_enemies 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("ENEMIES",13, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-2)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // HERO ::= id open_parens int_value comma int_value close_parens 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("HERO",12, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-5)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // HEROES ::= init_heroes HERO end_heroes 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("HEROES",11, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-2)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // CHARACTER ::= ENEMIES 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("CHARACTER",10, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // CHARACTER ::= HEROES 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("CHARACTER",10, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // CHARACTERS_STR ::= CHARACTER 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("CHARACTERS_STR",9, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // CHARACTERS_STR ::= CHARACTERS CHARACTER 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("CHARACTERS_STR",9, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-1)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // CHARACTERS ::= init_characters CHARACTERS_STR end_characters 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("CHARACTERS",8, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-2)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // SCN_ELEMENT ::= FINISH 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("SCN_ELEMENT",7, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SCN_ELEMENT ::= EXTRAS 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("SCN_ELEMENT",7, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SCN_ELEMENT ::= WALLS 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("SCN_ELEMENT",7, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SCN_ELEMENT ::= CHARACTERS 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("SCN_ELEMENT",7, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SCN_ELEMENTS ::= SCN_ELEMENT 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("SCN_ELEMENTS",6, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SCN_ELEMENTS ::= SCN_ELEMENTS SCN_ELEMENT 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("SCN_ELEMENTS",6, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-1)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SCN_HEIGHT ::= height equal int_value 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("SCN_HEIGHT",5, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-2)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SCN_WIDTH ::= width equal int_value 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("SCN_WIDTH",4, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-2)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SCN_BACKGROUND ::= background equal id 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("SCN_BACKGROUND",3, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-2)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SCN_ATTR ::= SCN_HEIGHT 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("SCN_ATTR",2, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SCN_ATTR ::= SCN_WIDTH 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("SCN_ATTR",2, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SCN_ATTR ::= SCN_BACKGROUND 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("SCN_ATTR",2, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SCN_ATTRS ::= SCN_ATTR 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("SCN_ATTRS",1, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // SCN_ATTRS ::= SCN_ATTRS semicolon SCN_ATTR 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("SCN_ATTRS",1, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-2)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= START EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-1)).value;
		RESULT = start_val;
              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-1)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ScenarioParser$parser.done_parsing();
          return CUP$ScenarioParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // START ::= init_scenario SCN_ATTRS more_than SCN_ELEMENTS end_scenario 
            {
              Object RESULT =null;

              CUP$ScenarioParser$result = parser.getSymbolFactory().newSymbol("START",0, ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.elementAt(CUP$ScenarioParser$top-4)), ((java_cup.runtime.Symbol)CUP$ScenarioParser$stack.peek()), RESULT);
            }
          return CUP$ScenarioParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

