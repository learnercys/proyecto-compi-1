/* The following code was generated by JFlex 1.4.3 on 4/2/15 3:33 AM */

package net.project.lexer.scenario;

import java_cup.runtime.Symbol;
import net.project.parser.scenario.sym;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/2/15 3:33 AM from the specification file
 * <tt>scenario.jflex</tt>
 */
public class ScenearioLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\3\1\0\1\3\23\0\1\3\7\0\1\10\1\4"+
    "\3\0\1\13\1\5\1\2\12\64\1\0\1\11\1\1\1\6\1\7"+
    "\2\0\1\20\1\33\1\16\1\31\1\14\1\0\1\30\1\26\1\22"+
    "\1\25\1\35\1\36\1\27\1\17\1\23\1\24\1\0\1\21\1\15"+
    "\1\32\1\34\2\0\1\12\10\0\1\45\1\60\1\43\1\56\1\41"+
    "\1\37\1\55\1\53\1\47\1\52\1\62\1\63\1\54\1\44\1\50"+
    "\1\51\1\37\1\46\1\42\1\57\1\61\2\37\1\40\2\37\u05e5\0"+
    "\12\65\206\0\12\65\306\0\12\65\u019c\0\12\65\166\0\12\65\166\0"+
    "\12\65\166\0\12\65\166\0\12\65\166\0\12\65\166\0\12\65\166\0"+
    "\12\65\166\0\12\65\340\0\12\65\166\0\12\65\106\0\12\65\u0116\0"+
    "\12\65\106\0\12\65\u0746\0\12\65\46\0\12\65\u012c\0\12\65\200\0"+
    "\12\65\246\0\12\65\6\0\12\65\266\0\12\65\126\0\12\65\206\0"+
    "\12\65\6\0\12\65\u89c6\0\12\65\u02a6\0\12\65\46\0\12\65\306\0"+
    "\12\65\166\0\12\65\u0196\0\12\65\u5316\0\12\65\346\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\5\1\1\11\6\0\4\12\6\0\3\12\10\0"+
    "\1\13\1\0\1\12\1\13\1\12\16\0\1\14\1\0"+
    "\1\14\1\12\20\0\1\15\1\0\1\12\21\0\1\12"+
    "\21\0\1\12\13\0\1\16\3\0\1\17\1\0\1\12"+
    "\3\0\1\20\3\0\1\21\1\22\4\0\1\23\2\24"+
    "\1\25\4\0\1\26\3\0\1\27\3\0\1\30\1\31"+
    "\1\32\2\0\1\33\2\0\1\34\1\0\1\35\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[180];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\66\0\66\0\66\0\66\0\66"+
    "\0\66\0\66\0\242\0\330\0\u010e\0\u0144\0\u017a\0\u01b0"+
    "\0\u01e6\0\u021c\0\u0252\0\u0288\0\u02be\0\u02f4\0\u010e\0\u032a"+
    "\0\u0360\0\u0396\0\u03cc\0\u0402\0\u0438\0\u046e\0\u04a4\0\u04da"+
    "\0\u0510\0\u0546\0\u057c\0\u05b2\0\u05e8\0\u061e\0\u0654\0\u068a"+
    "\0\u06c0\0\u06f6\0\u072c\0\66\0\u0762\0\u0798\0\u010e\0\u07ce"+
    "\0\u0804\0\u083a\0\u0870\0\u08a6\0\u08dc\0\u0912\0\u0948\0\u097e"+
    "\0\u09b4\0\u09ea\0\u0a20\0\u0a56\0\u0a8c\0\u0ac2\0\66\0\u0af8"+
    "\0\u010e\0\u0b2e\0\u0b64\0\u0b9a\0\u0bd0\0\u0c06\0\u0c3c\0\u0c72"+
    "\0\u0ca8\0\u0cde\0\u0d14\0\u0d4a\0\u0d80\0\u0db6\0\u0dec\0\u0e22"+
    "\0\u0e58\0\u0e8e\0\66\0\u0ec4\0\u0efa\0\u0f30\0\u0f66\0\u0f9c"+
    "\0\u0fd2\0\u1008\0\u103e\0\u1074\0\u10aa\0\u10e0\0\u1116\0\u114c"+
    "\0\u1182\0\u11b8\0\u11ee\0\u1224\0\u125a\0\u1290\0\u12c6\0\u12fc"+
    "\0\u1332\0\u1368\0\u139e\0\u13d4\0\u140a\0\u1440\0\u1476\0\u14ac"+
    "\0\u14e2\0\u1518\0\u154e\0\u1584\0\u15ba\0\u15f0\0\u1626\0\u165c"+
    "\0\u1692\0\u16c8\0\u16fe\0\u1734\0\u176a\0\u17a0\0\u17d6\0\u180c"+
    "\0\u1842\0\u1878\0\u18ae\0\u18e4\0\66\0\u191a\0\u1950\0\u1986"+
    "\0\66\0\u19bc\0\u19f2\0\u1a28\0\u1a5e\0\u1a94\0\66\0\u1aca"+
    "\0\u1b00\0\u1b36\0\66\0\66\0\u1b6c\0\u1ba2\0\u1bd8\0\u1c0e"+
    "\0\66\0\66\0\u010e\0\66\0\u1c44\0\u1c7a\0\u1cb0\0\u1ce6"+
    "\0\66\0\u1d1c\0\u1d52\0\u1d88\0\66\0\u1dbe\0\u1df4\0\u1e2a"+
    "\0\66\0\66\0\66\0\u1e60\0\u1e96\0\66\0\u1ecc\0\u1f02"+
    "\0\66\0\u1f38\0\66\0\66";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[180];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\2\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\6\2\1\13\12\2\1\14\3\2\6\15"+
    "\1\16\12\15\1\17\3\15\2\20\70\0\1\21\7\0"+
    "\1\22\14\0\1\23\10\0\1\22\13\0\1\23\30\0"+
    "\1\24\16\0\1\25\5\0\1\24\16\0\1\25\22\0"+
    "\1\26\24\0\1\26\57\0\26\27\20\0\1\24\16\0"+
    "\1\25\5\27\1\30\16\27\1\31\1\27\21\0\1\26"+
    "\16\0\6\27\1\32\17\27\65\0\2\20\12\0\1\33"+
    "\25\0\1\33\40\0\1\34\66\0\1\35\24\0\1\35"+
    "\42\0\1\36\24\0\1\36\54\0\1\37\24\0\1\37"+
    "\24\0\1\40\24\0\1\40\40\0\1\36\20\0\4\27"+
    "\1\41\21\27\33\0\1\37\4\0\20\27\1\42\5\27"+
    "\17\0\1\40\20\0\4\27\1\43\21\27\14\0\1\44"+
    "\66\0\1\45\3\0\1\46\3\0\1\47\1\0\1\50"+
    "\4\0\1\51\5\0\1\45\3\0\1\46\3\0\1\47"+
    "\1\0\1\50\4\0\1\51\37\0\1\52\24\0\1\52"+
    "\34\0\1\53\24\0\1\53\35\0\1\54\24\0\1\54"+
    "\52\0\1\55\24\0\1\55\31\0\1\53\10\0\14\27"+
    "\1\56\11\27\24\0\1\54\13\0\11\27\1\57\14\27"+
    "\36\0\1\55\1\0\23\27\1\60\2\27\15\0\1\61"+
    "\3\0\1\62\3\0\1\63\1\0\1\64\4\0\1\65"+
    "\5\0\1\61\3\0\1\62\3\0\1\63\1\0\1\64"+
    "\4\0\1\65\17\0\1\66\2\0\1\67\1\0\1\70"+
    "\20\0\1\66\1\0\1\67\1\0\1\70\42\0\1\71"+
    "\24\0\1\71\33\0\1\72\3\0\1\73\20\0\1\72"+
    "\3\0\1\73\34\0\1\74\24\0\1\74\47\0\1\75"+
    "\24\0\1\75\35\0\1\76\24\0\1\76\43\0\1\77"+
    "\24\0\1\77\45\0\1\100\24\0\1\100\33\0\1\77"+
    "\13\0\11\27\1\101\14\27\31\0\1\100\6\0\16\27"+
    "\1\102\7\27\13\0\1\103\2\0\1\104\1\0\1\105"+
    "\20\0\1\103\1\0\1\104\1\0\1\105\42\0\1\106"+
    "\24\0\1\106\33\0\1\107\3\0\1\110\20\0\1\107"+
    "\3\0\1\110\34\0\1\111\24\0\1\111\47\0\1\112"+
    "\24\0\1\112\47\0\1\113\24\0\1\113\24\0\1\114"+
    "\24\0\1\114\36\0\1\115\24\0\1\115\53\0\1\116"+
    "\24\0\1\116\32\0\1\117\24\0\1\117\40\0\1\120"+
    "\24\0\1\120\40\0\1\121\24\0\1\121\36\0\1\122"+
    "\24\0\1\122\30\0\1\123\77\0\1\124\24\0\1\124"+
    "\40\0\1\124\15\0\7\27\1\125\16\27\33\0\1\126"+
    "\24\0\1\126\24\0\1\127\24\0\1\127\36\0\1\130"+
    "\24\0\1\130\53\0\1\131\24\0\1\131\32\0\1\132"+
    "\24\0\1\132\40\0\1\133\24\0\1\133\40\0\1\134"+
    "\24\0\1\134\36\0\1\135\24\0\1\135\42\0\1\136"+
    "\24\0\1\136\33\0\1\137\24\0\1\137\53\0\1\140"+
    "\24\0\1\140\31\0\1\141\24\0\1\141\35\0\1\142"+
    "\24\0\1\142\37\0\1\143\24\0\1\143\47\0\1\144"+
    "\24\0\1\144\51\0\1\145\24\0\1\145\27\0\1\146"+
    "\24\0\1\146\40\0\1\146\13\0\11\27\1\147\14\27"+
    "\22\0\1\150\24\0\1\150\33\0\1\151\24\0\1\151"+
    "\53\0\1\152\24\0\1\152\31\0\1\153\24\0\1\153"+
    "\35\0\1\154\24\0\1\154\37\0\1\155\24\0\1\155"+
    "\47\0\1\156\24\0\1\156\51\0\1\157\24\0\1\157"+
    "\24\0\1\160\24\0\1\160\37\0\1\161\24\0\1\161"+
    "\43\0\1\162\24\0\1\162\33\0\1\163\24\0\1\163"+
    "\46\0\1\164\24\0\1\164\46\0\1\165\24\0\1\165"+
    "\23\0\1\166\24\0\1\166\41\0\1\167\24\0\1\167"+
    "\57\0\1\170\24\0\1\170\40\0\1\170\2\0\22\27"+
    "\1\171\3\27\21\0\1\172\24\0\1\172\37\0\1\173"+
    "\24\0\1\173\43\0\1\174\24\0\1\174\33\0\1\175"+
    "\24\0\1\175\46\0\1\176\24\0\1\176\46\0\1\177"+
    "\24\0\1\177\23\0\1\200\24\0\1\200\41\0\1\201"+
    "\24\0\1\201\40\0\1\202\24\0\1\202\43\0\1\203"+
    "\24\0\1\203\50\0\1\204\24\0\1\204\17\0\1\205"+
    "\75\0\1\206\24\0\1\206\35\0\1\207\24\0\1\207"+
    "\41\0\1\210\24\0\1\210\32\0\1\211\75\0\1\212"+
    "\24\0\1\212\40\0\1\212\17\0\5\27\1\213\20\27"+
    "\16\0\1\214\24\0\1\214\43\0\1\215\24\0\1\215"+
    "\50\0\1\216\24\0\1\216\17\0\1\217\75\0\1\220"+
    "\24\0\1\220\35\0\1\221\24\0\1\221\41\0\1\222"+
    "\24\0\1\222\32\0\1\223\65\0\1\224\77\0\1\225"+
    "\24\0\1\225\42\0\1\226\24\0\1\226\35\0\1\227"+
    "\24\0\1\227\35\0\1\230\24\0\1\230\32\0\1\231"+
    "\107\0\1\232\24\0\1\232\40\0\1\232\5\0\17\27"+
    "\1\233\6\27\10\0\1\234\77\0\1\235\24\0\1\235"+
    "\42\0\1\236\24\0\1\236\35\0\1\237\24\0\1\237"+
    "\35\0\1\240\24\0\1\240\32\0\1\241\100\0\1\242"+
    "\24\0\1\242\33\0\1\243\24\0\1\243\50\0\1\244"+
    "\24\0\1\244\22\0\1\245\100\0\1\246\24\0\1\246"+
    "\33\0\1\247\24\0\1\247\50\0\1\250\24\0\1\250"+
    "\22\0\1\251\101\0\1\252\24\0\1\252\24\0\1\253"+
    "\72\0\1\254\24\0\1\254\47\0\1\255\24\0\1\255"+
    "\24\0\1\256\72\0\1\257\24\0\1\257\41\0\1\260"+
    "\24\0\1\260\32\0\1\261\73\0\1\262\24\0\1\262"+
    "\32\0\1\263\65\0\1\264\56\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8046];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\7\11\6\1\6\0\4\1\6\0"+
    "\3\1\10\0\1\11\1\0\3\1\16\0\1\11\1\0"+
    "\2\1\20\0\1\11\1\0\1\1\21\0\1\1\21\0"+
    "\1\1\13\0\1\11\3\0\1\11\1\0\1\1\3\0"+
    "\1\11\3\0\2\11\4\0\2\11\1\1\1\11\4\0"+
    "\1\11\3\0\1\11\3\0\3\11\2\0\1\11\2\0"+
    "\1\11\1\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[180];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol( int type ) { return new Symbol( type, yyline, yycolumn); }

    private Symbol symbol( int type, Object value ) {
        return  new Symbol( type, yyline, yycolumn, value );
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public ScenearioLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public ScenearioLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 276) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 11: 
          { return symbol( sym.height );
          }
        case 31: break;
        case 21: 
          { return symbol( sym.end_extras );
          }
        case 32: break;
        case 20: 
          { return symbol( sym.background );
          }
        case 33: break;
        case 15: 
          { return symbol( sym.init_bonus );
          }
        case 34: break;
        case 26: 
          { return symbol( sym.init_enemies );
          }
        case 35: break;
        case 19: 
          { return symbol( sym.init_heroes );
          }
        case 36: break;
        case 29: 
          { return symbol( sym.init_characters );
          }
        case 37: break;
        case 12: 
          { return symbol( sym.width );
          }
        case 38: break;
        case 4: 
          { return symbol( sym.dot );
          }
        case 39: break;
        case 5: 
          { return symbol( sym.equal );
          }
        case 40: break;
        case 25: 
          { return symbol( sym.init_scenario );
          }
        case 41: break;
        case 30: 
          { return symbol( sym.end_characters );
          }
        case 42: break;
        case 6: 
          { return symbol( sym.more_than );
          }
        case 43: break;
        case 8: 
          { return symbol( sym.semicolon );
          }
        case 44: break;
        case 17: 
          { return symbol( sym.end_bonus );
          }
        case 45: break;
        case 7: 
          { return symbol( sym.open_parens );
          }
        case 46: break;
        case 18: 
          { return symbol( sym.init_extras );
          }
        case 47: break;
        case 13: 
          { return symbol( sym.finish );
          }
        case 48: break;
        case 16: 
          { return symbol( sym.end_weapons );
          }
        case 49: break;
        case 10: 
          { return symbol( sym.id );
          }
        case 50: break;
        case 9: 
          { return symbol( sym.int_value );
          }
        case 51: break;
        case 23: 
          { return symbol( sym.init_walls );
          }
        case 52: break;
        case 28: 
          { return symbol( sym.end_scenario );
          }
        case 53: break;
        case 22: 
          { return symbol( sym.end_heroes );
          }
        case 54: break;
        case 14: 
          { return symbol( sym.init_weapons );
          }
        case 55: break;
        case 1: 
          { System.out.println("Line: " + (yyline + 1) + ", column: " + (yycolumn + 1) + ", Lexical error in: " + yytext());
          }
        case 56: break;
        case 27: 
          { return symbol( sym.end_enemies );
          }
        case 57: break;
        case 24: 
          { return symbol( sym.end_walls );
          }
        case 58: break;
        case 2: 
          { /* white spaces for dummies */
          }
        case 59: break;
        case 3: 
          { return symbol( sym.close_parens );
          }
        case 60: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
