/* The following code was generated by JFlex 1.4.3 on 3/11/13 5:52 PM */

import java_cup.runtime.*; 



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/11/13 5:52 PM from the specification file
 * <tt>C:/Users/zceeh_000/Documents/GitHub/compilerCwk/q.flex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 6;
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;
  public static final int LINECOMMENT = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
<<<<<<< HEAD:Yylex.java
    "\11\0\1\55\1\54\1\0\1\3\1\4\22\0\1\3\1\0\1\40"+
    "\4\0\1\5\1\25\1\26\1\20\1\17\1\33\1\21\1\6\1\22"+
    "\12\1\1\23\1\34\1\37\1\24\1\36\2\0\32\2\1\30\1\0"+
    "\1\27\3\0\1\14\1\52\1\51\1\44\1\12\1\13\1\53\1\43"+
    "\1\41\2\2\1\15\1\2\1\47\1\45\1\46\1\2\1\10\1\16"+
    "\1\7\1\11\1\50\1\42\3\2\1\31\1\35\1\32\uff82\0";
=======
    "\11\0\1\57\1\56\1\0\1\14\1\15\22\0\1\14\1\40\1\41"+
    "\3\0\1\52\1\16\1\25\1\26\1\21\1\20\1\33\1\2\1\17"+
    "\1\22\12\1\1\23\1\34\1\37\1\24\1\36\2\0\32\3\1\27"+
    "\1\0\1\30\3\0\1\11\1\53\1\54\1\45\1\7\1\10\1\55"+
    "\1\44\1\42\2\3\1\12\1\3\1\50\1\46\1\47\1\3\1\5"+
    "\1\13\1\4\1\6\1\51\1\43\3\3\1\31\1\35\1\32\uff82\0";
>>>>>>> dd6f4b07c1895bf0db60b3f0a615f108a8343e28:old/Yylex.java

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
<<<<<<< HEAD:Yylex.java
    "\4\0\1\1\1\2\1\3\1\4\1\1\1\5\10\3"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\10\3\1\4\1\30\1\31\1\32\1\33"+
    "\1\0\15\3\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\2\3\1\43\1\44\4\3\1\45\11\3\1\46"+
    "\1\47\2\3\1\50\1\3\1\51\3\3\1\52\1\3"+
    "\1\53\2\3\1\54\1\3\1\55\1\56\2\3\1\57"+
    "\1\60\1\61\1\62\1\3\1\63\1\64\1\3\1\65"+
    "\1\66\1\67";

  private static int [] zzUnpackAction() {
    int [] result = new int[120];
=======
    "\4\0\1\1\1\2\1\3\10\4\1\5\1\1\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\4\4\1\1\2\4\1\5\1\31\1\32"+
    "\1\33\1\0\14\4\1\0\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\2\4\1\45\1\4"+
    "\1\46\2\4\1\47\12\4\1\50\2\4\1\51\1\52"+
    "\4\4\1\53\1\4\1\54\3\4\1\55\1\4\1\56"+
    "\1\57\2\4\1\60\1\61\1\62\1\63\2\4\1\64"+
    "\1\65\1\4\1\66\1\67\1\70\1\71";

  private static int [] zzUnpackAction() {
    int [] result = new int[122];
>>>>>>> dd6f4b07c1895bf0db60b3f0a615f108a8343e28:old/Yylex.java
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
<<<<<<< HEAD:Yylex.java
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\u0114\0\270"+
    "\0\u0142\0\270\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256"+
    "\0\u0284\0\u02b2\0\270\0\270\0\270\0\u02e0\0\u030e\0\u033c"+
    "\0\270\0\270\0\270\0\270\0\270\0\270\0\270\0\270"+
    "\0\270\0\u036a\0\u0398\0\270\0\u03c6\0\u03f4\0\u0422\0\u0450"+
    "\0\u047e\0\u04ac\0\u04da\0\u0508\0\u0536\0\270\0\u0564\0\270"+
    "\0\u0592\0\u05c0\0\u05ee\0\u061c\0\u064a\0\u0678\0\u06a6\0\u06d4"+
    "\0\u0702\0\u0730\0\u075e\0\u078c\0\u07ba\0\u07e8\0\u0816\0\270"+
    "\0\270\0\270\0\270\0\270\0\270\0\u0114\0\u0844\0\u0872"+
    "\0\u0114\0\u0114\0\u08a0\0\u08ce\0\u08fc\0\u092a\0\270\0\u0958"+
    "\0\u0986\0\u09b4\0\u09e2\0\u0a10\0\u0a3e\0\u0a6c\0\u0a9a\0\u0ac8"+
    "\0\u0114\0\u0114\0\u0af6\0\u0b24\0\u0114\0\u0b52\0\u0114\0\u0b80"+
    "\0\u0bae\0\u0bdc\0\u0114\0\u0c0a\0\u0114\0\u0c38\0\u0c66\0\u0114"+
    "\0\u0c94\0\u0114\0\u0114\0\u0cc2\0\u0cf0\0\u0114\0\u0114\0\u0114"+
    "\0\u0114\0\u0d1e\0\u0114\0\u0114\0\u0d4c\0\u0114\0\u0114\0\u0114";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[120];
=======
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\300"+
    "\0\u02d0\0\300\0\300\0\300\0\u0300\0\u0330\0\u0360\0\300"+
    "\0\300\0\300\0\300\0\300\0\300\0\300\0\300\0\u0390"+
    "\0\u03c0\0\u03f0\0\u0420\0\300\0\u0450\0\u0480\0\u04b0\0\u04e0"+
    "\0\u0510\0\u0540\0\u0570\0\u05a0\0\300\0\u05d0\0\300\0\u0600"+
    "\0\u0630\0\u0660\0\u0690\0\u06c0\0\u06f0\0\u0720\0\u0750\0\u0780"+
    "\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0870\0\300\0\300\0\300"+
    "\0\300\0\300\0\300\0\300\0\300\0\u0150\0\u08a0\0\u08d0"+
    "\0\u0150\0\u0900\0\300\0\u0930\0\u0960\0\u0600\0\u0990\0\u09c0"+
    "\0\u09f0\0\u0a20\0\u0a50\0\u0a80\0\u0ab0\0\u0ae0\0\u0b10\0\u0b40"+
    "\0\u0150\0\u0b70\0\u0ba0\0\300\0\u0150\0\u0bd0\0\u0c00\0\u0c30"+
    "\0\u0c60\0\u0150\0\u0c90\0\u0150\0\u0cc0\0\u0cf0\0\u0d20\0\u0150"+
    "\0\u0d50\0\u0150\0\u0150\0\u0d80\0\u0db0\0\u0150\0\u0150\0\u0150"+
    "\0\u0150\0\u0de0\0\u0e10\0\u0150\0\u0150\0\u0e40\0\u0150\0\u0150"+
    "\0\u0150\0\u0150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[122];
>>>>>>> dd6f4b07c1895bf0db60b3f0a615f108a8343e28:old/Yylex.java
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
<<<<<<< HEAD:Yylex.java
    "\1\5\1\6\1\7\2\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\7\1\47\1\50\1\7\1\51\1\52"+
    "\1\53\1\54\1\7\22\10\1\55\33\10\1\0\5\10"+
    "\1\56\47\10\1\56\1\10\4\57\2\0\32\57\1\60"+
    "\13\57\61\0\1\6\4\0\1\61\50\0\2\7\4\0"+
    "\10\7\22\0\13\7\3\0\2\62\4\0\10\62\22\0"+
    "\13\62\3\0\2\7\4\0\1\7\1\63\1\64\5\7"+
    "\22\0\3\7\1\65\7\7\3\0\2\7\4\0\3\7"+
    "\1\66\4\7\22\0\13\7\3\0\2\7\4\0\10\7"+
    "\22\0\6\7\1\67\4\7\3\0\2\7\4\0\6\7"+
    "\1\70\1\7\22\0\13\7\3\0\2\7\4\0\5\7"+
    "\1\71\1\72\1\7\22\0\3\7\1\73\7\7\3\0"+
    "\2\7\4\0\10\7\22\0\6\7\1\74\4\7\3\0"+
    "\2\7\4\0\3\7\1\75\4\7\22\0\1\76\12\7"+
    "\3\0\2\7\4\0\1\77\7\7\22\0\13\7\22\0"+
    "\1\100\1\0\1\101\56\0\1\102\56\0\1\103\55\0"+
    "\1\104\55\0\1\105\32\0\2\7\4\0\4\7\1\106"+
    "\3\7\22\0\6\7\1\107\4\7\3\0\2\7\4\0"+
    "\10\7\22\0\2\7\1\110\10\7\3\0\2\7\4\0"+
    "\10\7\22\0\4\7\1\111\6\7\3\0\2\7\4\0"+
    "\1\7\1\112\6\7\22\0\13\7\3\0\2\7\4\0"+
    "\10\7\22\0\4\7\1\113\6\7\3\0\2\7\4\0"+
    "\10\7\22\0\4\7\1\114\6\7\3\0\2\7\4\0"+
    "\10\7\22\0\2\7\1\115\10\7\3\0\2\7\4\0"+
    "\10\7\22\0\4\7\1\116\6\7\24\0\1\56\33\0"+
    "\4\57\2\0\32\57\1\0\13\57\3\0\1\61\61\0"+
    "\1\117\51\0\2\7\4\0\2\7\1\120\5\7\22\0"+
    "\13\7\3\0\2\7\4\0\10\7\22\0\5\7\1\121"+
    "\5\7\3\0\2\7\4\0\3\7\1\122\4\7\22\0"+
    "\13\7\3\0\2\7\4\0\10\7\22\0\5\7\1\123"+
    "\5\7\3\0\2\7\4\0\1\124\7\7\22\0\13\7"+
    "\3\0\2\7\4\0\7\7\1\125\22\0\13\7\3\0"+
    "\2\7\4\0\6\7\1\126\1\7\22\0\13\7\3\0"+
    "\2\7\4\0\10\7\22\0\4\7\1\127\6\7\3\0"+
    "\2\7\4\0\3\7\1\130\4\7\22\0\13\7\3\0"+
    "\2\7\4\0\10\7\22\0\3\7\1\131\7\7\3\0"+
    "\2\7\4\0\10\7\22\0\6\7\1\132\4\7\3\0"+
    "\2\7\4\0\7\7\1\133\22\0\13\7\3\0\2\7"+
    "\4\0\1\7\1\134\6\7\22\0\13\7\3\0\2\7"+
    "\4\0\1\135\7\7\22\0\13\7\3\0\2\7\4\0"+
    "\10\7\22\0\1\136\12\7\3\0\2\7\4\0\1\137"+
    "\7\7\22\0\13\7\3\0\2\7\4\0\10\7\22\0"+
    "\1\140\12\7\3\0\2\7\4\0\5\7\1\141\2\7"+
    "\22\0\13\7\3\0\2\7\4\0\10\7\22\0\4\7"+
    "\1\142\6\7\3\0\2\7\4\0\3\7\1\143\4\7"+
    "\22\0\13\7\3\0\2\7\4\0\6\7\1\144\1\7"+
    "\22\0\13\7\3\0\2\7\4\0\4\7\1\145\3\7"+
    "\22\0\13\7\3\0\2\7\4\0\3\7\1\146\4\7"+
    "\22\0\13\7\3\0\2\7\4\0\10\7\22\0\1\147"+
    "\12\7\3\0\2\7\4\0\3\7\1\150\4\7\22\0"+
    "\13\7\3\0\2\7\4\0\7\7\1\120\22\0\13\7"+
    "\3\0\2\7\4\0\5\7\1\151\2\7\22\0\13\7"+
    "\3\0\2\7\4\0\4\7\1\152\3\7\22\0\13\7"+
    "\3\0\2\7\4\0\1\153\7\7\22\0\13\7\3\0"+
    "\2\7\4\0\10\7\22\0\1\154\12\7\3\0\2\7"+
    "\4\0\6\7\1\155\1\7\22\0\13\7\3\0\2\7"+
    "\4\0\10\7\22\0\3\7\1\156\7\7\3\0\2\7"+
    "\4\0\1\7\1\157\6\7\22\0\13\7\3\0\2\7"+
    "\4\0\6\7\1\160\1\7\22\0\13\7\3\0\2\7"+
    "\4\0\3\7\1\161\4\7\22\0\13\7\3\0\2\7"+
    "\4\0\5\7\1\162\2\7\22\0\13\7\3\0\2\7"+
    "\4\0\6\7\1\163\1\7\22\0\13\7\3\0\2\7"+
    "\4\0\1\164\7\7\22\0\13\7\3\0\2\7\4\0"+
    "\10\7\22\0\6\7\1\165\4\7\3\0\2\7\4\0"+
    "\3\7\1\166\4\7\22\0\13\7\3\0\2\7\4\0"+
    "\1\167\7\7\22\0\13\7\3\0\2\7\4\0\10\7"+
    "\22\0\12\7\1\170\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3450];
=======
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\10\1\16\1\17\2\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\10\1\47\3\10\1\50\1\51"+
    "\1\52\1\53\1\10\23\20\1\54\34\20\1\0\16\20"+
    "\1\55\40\20\1\55\1\20\15\56\1\0\23\56\1\57"+
    "\14\56\63\0\1\6\15\0\1\60\41\0\1\6\57\0"+
    "\1\10\1\0\11\10\26\0\10\10\1\0\3\10\3\0"+
    "\1\10\1\0\2\10\1\61\1\62\5\10\26\0\3\10"+
    "\1\63\4\10\1\0\3\10\3\0\1\10\1\0\4\10"+
    "\1\64\4\10\26\0\10\10\1\0\3\10\3\0\1\10"+
    "\1\0\11\10\26\0\6\10\1\65\1\10\1\0\3\10"+
    "\3\0\1\10\1\0\7\10\1\66\1\10\26\0\10\10"+
    "\1\0\3\10\3\0\1\10\1\0\6\10\1\67\1\70"+
    "\1\10\26\0\3\10\1\71\4\10\1\0\3\10\3\0"+
    "\1\10\1\0\4\10\1\72\4\10\26\0\1\73\7\10"+
    "\1\0\3\10\3\0\1\10\1\0\1\10\1\74\7\10"+
    "\26\0\10\10\1\0\3\10\3\0\1\75\1\0\11\75"+
    "\26\0\10\75\1\0\3\75\23\0\1\76\1\77\60\0"+
    "\1\100\60\0\1\101\70\0\1\102\46\0\1\103\57\0"+
    "\1\104\57\0\1\105\34\0\1\10\1\0\5\10\1\106"+
    "\3\10\26\0\6\10\1\107\1\10\1\0\3\10\3\0"+
    "\1\10\1\0\11\10\26\0\2\10\1\110\5\10\1\0"+
    "\3\10\3\0\1\10\1\0\11\10\26\0\4\10\1\111"+
    "\3\10\1\0\3\10\3\0\1\10\1\0\11\10\26\0"+
    "\4\10\1\112\3\10\1\0\3\10\54\0\1\113\6\0"+
    "\1\10\1\0\11\10\26\0\4\10\1\114\3\10\1\0"+
    "\3\10\3\0\1\10\1\0\11\10\26\0\2\10\1\115"+
    "\5\10\1\0\3\10\24\0\1\55\35\0\15\56\1\0"+
    "\23\56\1\0\14\56\3\0\1\116\57\0\1\10\1\0"+
    "\3\10\1\117\5\10\26\0\10\10\1\0\3\10\3\0"+
    "\1\10\1\0\11\10\26\0\5\10\1\120\2\10\1\0"+
    "\3\10\3\0\1\10\1\0\4\10\1\121\4\10\26\0"+
    "\10\10\1\0\3\10\3\0\1\10\1\0\1\10\1\122"+
    "\7\10\26\0\5\10\1\123\2\10\1\0\3\10\3\0"+
    "\1\10\1\0\1\10\1\124\7\10\26\0\10\10\1\0"+
    "\3\10\3\0\1\10\1\0\10\10\1\125\26\0\10\10"+
    "\1\0\3\10\3\0\1\10\1\0\7\10\1\126\1\10"+
    "\26\0\10\10\1\0\3\10\3\0\1\10\1\0\11\10"+
    "\26\0\4\10\1\127\3\10\1\0\3\10\3\0\1\10"+
    "\1\0\4\10\1\130\4\10\26\0\10\10\1\0\3\10"+
    "\3\0\1\10\1\0\11\10\26\0\6\10\1\131\1\10"+
    "\1\0\3\10\3\0\1\10\1\0\10\10\1\132\26\0"+
    "\10\10\1\0\3\10\3\0\1\10\1\0\2\10\1\133"+
    "\6\10\26\0\10\10\1\0\3\10\20\0\1\134\42\0"+
    "\1\10\1\0\1\10\1\135\7\10\26\0\10\10\1\0"+
    "\3\10\3\0\1\10\1\0\11\10\26\0\1\136\7\10"+
    "\1\0\3\10\3\0\1\10\1\0\11\10\26\0\1\137"+
    "\7\10\1\0\3\10\3\0\1\10\1\0\11\10\26\0"+
    "\4\10\1\140\3\10\1\0\3\10\3\0\1\10\1\0"+
    "\6\10\1\141\2\10\26\0\10\10\1\0\3\10\3\0"+
    "\1\10\1\0\4\10\1\142\4\10\26\0\10\10\1\0"+
    "\3\10\3\0\1\10\1\0\7\10\1\143\1\10\26\0"+
    "\10\10\1\0\3\10\3\0\1\10\1\0\5\10\1\144"+
    "\3\10\26\0\10\10\1\0\3\10\3\0\1\10\1\0"+
    "\3\10\1\145\5\10\26\0\10\10\1\0\3\10\3\0"+
    "\1\10\1\0\4\10\1\146\4\10\26\0\10\10\1\0"+
    "\3\10\3\0\1\10\1\0\11\10\26\0\1\147\7\10"+
    "\1\0\3\10\3\0\1\10\1\0\4\10\1\150\4\10"+
    "\26\0\10\10\1\0\3\10\3\0\1\10\1\0\10\10"+
    "\1\117\26\0\10\10\1\0\3\10\3\0\1\10\1\0"+
    "\6\10\1\151\2\10\26\0\10\10\1\0\3\10\3\0"+
    "\1\10\1\0\5\10\1\152\3\10\26\0\10\10\1\0"+
    "\3\10\3\0\1\10\1\0\1\10\1\153\7\10\26\0"+
    "\10\10\1\0\3\10\3\0\1\10\1\0\11\10\26\0"+
    "\1\154\7\10\1\0\3\10\3\0\1\10\1\0\7\10"+
    "\1\155\1\10\26\0\10\10\1\0\3\10\3\0\1\10"+
    "\1\0\11\10\26\0\3\10\1\156\4\10\1\0\3\10"+
    "\3\0\1\10\1\0\7\10\1\157\1\10\26\0\10\10"+
    "\1\0\3\10\3\0\1\10\1\0\2\10\1\160\6\10"+
    "\26\0\10\10\1\0\3\10\3\0\1\10\1\0\4\10"+
    "\1\161\4\10\26\0\10\10\1\0\3\10\3\0\1\10"+
    "\1\0\2\10\1\162\6\10\26\0\10\10\1\0\3\10"+
    "\3\0\1\10\1\0\6\10\1\163\2\10\26\0\10\10"+
    "\1\0\3\10\3\0\1\10\1\0\7\10\1\164\1\10"+
    "\26\0\10\10\1\0\3\10\3\0\1\10\1\0\1\10"+
    "\1\165\7\10\26\0\10\10\1\0\3\10\3\0\1\10"+
    "\1\0\11\10\26\0\6\10\1\166\1\10\1\0\3\10"+
    "\3\0\1\10\1\0\4\10\1\167\4\10\26\0\10\10"+
    "\1\0\3\10\3\0\1\10\1\0\11\10\26\0\6\10"+
    "\1\170\1\10\1\0\3\10\3\0\1\10\1\0\1\10"+
    "\1\171\7\10\26\0\10\10\1\0\3\10\3\0\1\10"+
    "\1\0\11\10\26\0\10\10\1\0\2\10\1\172\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3696];
>>>>>>> dd6f4b07c1895bf0db60b3f0a615f108a8343e28:old/Yylex.java
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
<<<<<<< HEAD:Yylex.java
    "\4\0\1\11\2\1\1\11\1\1\1\11\10\1\3\11"+
    "\3\1\11\11\2\1\1\11\11\1\1\11\1\1\1\11"+
    "\1\1\1\0\15\1\6\11\11\1\1\11\51\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[120];
=======
    "\4\0\1\11\12\1\1\11\1\1\3\11\3\1\10\11"+
    "\4\1\1\11\10\1\1\11\1\1\1\11\1\0\14\1"+
    "\1\0\10\11\5\1\1\11\20\1\1\11\36\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[122];
>>>>>>> dd6f4b07c1895bf0db60b3f0a615f108a8343e28:old/Yylex.java
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
	private String string;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
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
<<<<<<< HEAD:Yylex.java
    while (i < 118) {
=======
    while (i < 120) {
>>>>>>> dd6f4b07c1895bf0db60b3f0a615f108a8343e28:old/Yylex.java
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
<<<<<<< HEAD:Yylex.java
        case 55: 
          { return new Symbol(sym.STRINGTYPE);
          }
        case 56: break;
        case 17: 
          { return new Symbol(sym.RCBRACK);
          }
        case 57: break;
        case 39: 
          { return new Symbol(sym.LEN);
          }
        case 58: break;
        case 35: 
          { return new Symbol(sym.DO);
          }
        case 59: break;
        case 25: 
          { string+=yytext();
          }
        case 60: break;
        case 7: 
          { return new Symbol(sym.TIMES);
          }
        case 61: break;
        case 10: 
          { return new Symbol(sym.COLON);
          }
        case 62: break;
        case 9: 
          { return new Symbol(sym.DIVIDE);
          }
        case 63: break;
        case 34: 
          { return new Symbol(sym.IF);
          }
        case 64: break;
        case 53: 
          { return new Symbol(sym.WHILE);
          }
        case 65: break;
        case 50: 
          { return new Symbol(sym.TUPLETYPE);
          }
        case 66: break;
        case 46: 
          { return new Symbol(sym.LISTTYPE);
          }
        case 67: break;
        case 51: 
          { return new Symbol(sym.UNTIL);
          }
        case 68: break;
        case 36: 
          { return new Symbol(sym.OR);
          }
        case 69: break;
        case 31: 
          { return new Symbol(sym.EQ);
          }
        case 70: break;
        case 14: 
          { return new Symbol(sym.RBRACK);
          }
        case 71: break;
        case 54: 
          { return new Symbol(sym.REPEAT);
          }
        case 72: break;
        case 45: 
          { return new Symbol(sym.FDEF);
          }
        case 73: break;
        case 13: 
          { return new Symbol(sym.RPAREN);
          }
        case 74: break;
        case 22: 
          { return new Symbol(sym.LESS);
          }
        case 75: break;
        case 8: 
          { return new Symbol(sym.MINUS);
          }
        case 76: break;
        case 6: 
          { return new Symbol(sym.PLUS);
          }
        case 77: break;
        case 49: 
          { return new Symbol(sym.BOOLTYPE);
          }
        case 78: break;
        case 24: 
          { yybegin(YYINITIAL);
          }
        case 79: break;
        case 47: 
          { return new Symbol(sym.VOID);
          }
        case 80: break;
        case 44: 
          { return new Symbol(sym.ELSE);
          }
        case 81: break;
        case 28: 
          { yybegin(COMMENT);
          }
        case 82: break;
        case 3: 
          { return new Symbol(sym.ID, yytext());
          }
        case 83: break;
        case 16: 
          { return new Symbol(sym.LCBRACK);
          }
        case 84: break;
        case 23: 
          { string = ""; yybegin(STRING);
          }
        case 85: break;
        case 33: 
          { return new Symbol(sym.LESSEQ);
          }
        case 86: break;
        case 18: 
          { return new Symbol(sym.COMMA);
          }
        case 87: break;
        case 48: 
          { return new Symbol(sym.CHARTYPE);
          }
        case 88: break;
        case 20: 
          { return new Symbol(sym.STROKE);
          }
        case 89: break;
        case 21: 
          { return new Symbol(sym.GREATER);
          }
        case 90: break;
        case 43: 
          { return new Symbol(sym.TDEF);
          }
        case 91: break;
        case 27: 
          { return new Symbol(sym.FLOAT, (new Integer(yytext())).intValue());
          }
        case 92: break;
        case 29: 
          { yybegin(LINECOMMENT);
          }
        case 93: break;
        case 11: 
          { return new Symbol(sym.ASSIGN);
          }
        case 94: break;
        case 40: 
          { return new Symbol(sym.INTEGERTYPE);
          }
        case 95: break;
        case 30: 
          { return new Symbol(sym.CONCAT);
          }
        case 96: break;
        case 1: 
          { System.out.println("error: unknown character " + yytext() + " found at line " + yyline);
          }
        case 97: break;
        case 5: 
          { return new Symbol(sym.DOT);
          }
        case 98: break;
        case 32: 
          { return new Symbol(sym.GREATEREQ);
          }
        case 99: break;
        case 19: 
          { return new Symbol(sym.SEMI);
          }
        case 100: break;
        case 26: 
          { yybegin(YYINITIAL); return new Symbol(sym.STRING,new String(string));
          }
        case 101: break;
        case 42: 
          { return new Symbol(sym.BOOL,(new Boolean(yytext())).booleanValue());
          }
        case 102: break;
        case 15: 
          { return new Symbol(sym.LBRACK);
          }
        case 103: break;
        case 37: 
          { return new Symbol(sym.CHAR, (new Character(yytext().charAt(0))).charValue());
          }
        case 104: break;
        case 2: 
          { return new Symbol(sym.INTEGER, (new Integer(yytext())).intValue());
          }
        case 105: break;
        case 12: 
          { return new Symbol(sym.LPAREN);
          }
        case 106: break;
        case 41: 
          { return new Symbol(sym.NOT);
          }
        case 107: break;
        case 38: 
          { return new Symbol(sym.AND);
          }
        case 108: break;
        case 52: 
          { return new Symbol(sym.FLOATTYPE);
          }
        case 109: break;
        case 4: 
          { 
          }
        case 110: break;
=======
        case 57: 
          { return new Symbol(sym.STRINGTYPE);
          }
        case 58: break;
        case 17: 
          { return new Symbol(sym.RCBRACK);
          }
        case 59: break;
        case 40: 
          { return new Symbol(sym.LEN);
          }
        case 60: break;
        case 37: 
          { return new Symbol(sym.DO);
          }
        case 61: break;
        case 26: 
          { string+=yytext();
          }
        case 62: break;
        case 8: 
          { return new Symbol(sym.TIMES);
          }
        case 63: break;
        case 10: 
          { return new Symbol(sym.COLON);
          }
        case 64: break;
        case 9: 
          { return new Symbol(sym.DIVIDE);
          }
        case 65: break;
        case 36: 
          { return new Symbol(sym.IF);
          }
        case 66: break;
        case 54: 
          { return new Symbol(sym.WHILE);
          }
        case 67: break;
        case 35: 
          { return new Symbol(sym.NEQ);
          }
        case 68: break;
        case 51: 
          { return new Symbol(sym.TUPLETYPE);
          }
        case 69: break;
        case 47: 
          { return new Symbol(sym.LISTTYPE);
          }
        case 70: break;
        case 52: 
          { return new Symbol(sym.UNTIL);
          }
        case 71: break;
        case 32: 
          { return new Symbol(sym.OR);
          }
        case 72: break;
        case 31: 
          { return new Symbol(sym.EQ);
          }
        case 73: break;
        case 15: 
          { return new Symbol(sym.RBRACK);
          }
        case 74: break;
        case 56: 
          { return new Symbol(sym.REPEAT);
          }
        case 75: break;
        case 46: 
          { return new Symbol(sym.FDEF);
          }
        case 76: break;
        case 39: 
          { return new Symbol(sym.FLOAT, (new Float(yytext())).floatValue());
          }
        case 77: break;
        case 13: 
          { return new Symbol(sym.RPAREN);
          }
        case 78: break;
        case 22: 
          { return new Symbol(sym.LESS);
          }
        case 79: break;
        case 3: 
          { return new Symbol(sym.MINUS);
          }
        case 80: break;
        case 49: 
          { return new Symbol(sym.BOOLTYPE);
          }
        case 81: break;
        case 25: 
          { yybegin(YYINITIAL);
          }
        case 82: break;
        case 48: 
          { return new Symbol(sym.VOID);
          }
        case 83: break;
        case 45: 
          { return new Symbol(sym.ELSE);
          }
        case 84: break;
        case 28: 
          { yybegin(COMMENT);
          }
        case 85: break;
        case 16: 
          { return new Symbol(sym.LCBRACK);
          }
        case 86: break;
        case 24: 
          { string = ""; yybegin(STRING);
          }
        case 87: break;
        case 34: 
          { return new Symbol(sym.LESSEQ);
          }
        case 88: break;
        case 18: 
          { return new Symbol(sym.COMMA);
          }
        case 89: break;
        case 50: 
          { return new Symbol(sym.CHARTYPE);
          }
        case 90: break;
        case 20: 
          { return new Symbol(sym.STROKE);
          }
        case 91: break;
        case 21: 
          { return new Symbol(sym.GREATER);
          }
        case 92: break;
        case 44: 
          { return new Symbol(sym.TDEF);
          }
        case 93: break;
        case 29: 
          { yybegin(LINECOMMENT);
          }
        case 94: break;
        case 11: 
          { return new Symbol(sym.ASSIGN);
          }
        case 95: break;
        case 55: 
          { return new Symbol(sym.RETURN);
          }
        case 96: break;
        case 42: 
          { return new Symbol(sym.INTEGERTYPE);
          }
        case 97: break;
        case 30: 
          { return new Symbol(sym.CONCAT);
          }
        case 98: break;
        case 1: 
          { System.out.println("error: unknown character " + yytext() + " found at line " + yyline);
          }
        case 99: break;
        case 6: 
          { return new Symbol(sym.DOT);
          }
        case 100: break;
        case 4: 
          { System.out.println("Obtain token: "+yytext()); return new Symbol(sym.ID, yytext());
          }
        case 101: break;
        case 33: 
          { return new Symbol(sym.GREATEREQ);
          }
        case 102: break;
        case 19: 
          { return new Symbol(sym.SEMI);
          }
        case 103: break;
        case 27: 
          { yybegin(YYINITIAL); return new Symbol(sym.STRING,new String(string));
          }
        case 104: break;
        case 43: 
          { return new Symbol(sym.BOOL,(new Boolean(yytext())).booleanValue());
          }
        case 105: break;
        case 14: 
          { return new Symbol(sym.LBRACK);
          }
        case 106: break;
        case 41: 
          { return new Symbol(sym.CHAR, (new Character(yytext().charAt(0))).charValue());
          }
        case 107: break;
        case 2: 
          { return new Symbol(sym.INTEGER, (new Integer(yytext())).intValue());
          }
        case 108: break;
        case 12: 
          { return new Symbol(sym.LPAREN);
          }
        case 109: break;
        case 7: 
          { System.out.println("Obtain token: "+yytext()); return new Symbol(sym.PLUS);
          }
        case 110: break;
        case 38: 
          { return new Symbol(sym.AND);
          }
        case 111: break;
        case 23: 
          { return new Symbol(sym.NOT);
          }
        case 112: break;
        case 53: 
          { return new Symbol(sym.FLOATTYPE);
          }
        case 113: break;
        case 5: 
          { 
          }
        case 114: break;
>>>>>>> dd6f4b07c1895bf0db60b3f0a615f108a8343e28:old/Yylex.java
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