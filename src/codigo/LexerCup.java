/* The following code was generated by JFlex 1.4.3 on 20/11/23 20:08 */

package codigo;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 20/11/23 20:08 from the specification file
 * <tt>src/codigo/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

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
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0, 16, 16, 58,  0, 16, 59,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    16,  0,  0,  0,  0,  0,  0,  4, 46, 47,  0,  0, 50, 60, 15,  0, 
     6, 11, 13, 13, 13, 13, 13, 13,  2,  2,  0, 57,  0,  0,  0,  0, 
     0, 27, 10, 33, 26, 32, 18, 44, 31, 40, 29,  1, 22, 24, 41, 19, 
    23, 45, 20, 34, 28, 30, 39, 43,  8, 25, 42, 48,  0, 49,  0, 21, 
     0, 37,  9, 54, 14, 53,  5, 51,  3, 55,  1,  1, 52, 17, 56, 12, 
     1,  1, 38, 35, 36,  1, 17,  1,  7,  1,  1,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\2\1\4\1\3\5\2"+
    "\1\1\2\5\21\2\1\6\1\7\1\10\1\11\1\12"+
    "\1\2\1\13\1\14\1\15\4\0\1\15\3\2\1\0"+
    "\1\2\2\0\1\16\3\0\1\2\1\17\17\2\1\20"+
    "\2\2\1\21\1\22\1\2\1\23\1\24\13\2\1\0"+
    "\1\2\1\13\1\0\1\16\1\25\1\26\2\2\1\0"+
    "\1\27\1\30\4\0\1\2\1\31\1\32\1\33\3\2"+
    "\1\34\1\35\1\2\1\36\1\2\1\37\1\40\1\41"+
    "\1\42\1\43\1\2\1\44\1\2\1\45\1\2\1\46"+
    "\1\47\1\50\1\2\1\51\1\52\1\53\1\2\1\54"+
    "\1\55\1\2\1\56\1\57\1\60\1\2\1\61\1\62"+
    "\1\63\1\0\1\2\1\64\1\65\1\66\1\67\2\0"+
    "\1\2\1\70\1\2\1\71\1\2\1\72\1\73\2\2"+
    "\1\74\2\2\1\75\3\2\1\3\1\2\1\76\1\77"+
    "\3\2\1\100\1\101\1\102\1\103\2\2\1\104\1\105"+
    "\1\2\1\106\3\2\1\107\5\2\1\110\4\2\1\111"+
    "\3\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[208];
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
    "\0\0\0\75\0\172\0\267\0\364\0\u0131\0\u016e\0\u01ab"+
    "\0\u01e8\0\u0225\0\u0262\0\u029f\0\u02dc\0\u0319\0\u0356\0\u0393"+
    "\0\u03d0\0\u040d\0\u044a\0\u0487\0\u04c4\0\u0501\0\u053e\0\u057b"+
    "\0\u05b8\0\u05f5\0\u0632\0\u066f\0\u06ac\0\u06e9\0\u0726\0\u0763"+
    "\0\u07a0\0\75\0\75\0\75\0\u0319\0\u07dd\0\u081a\0\75"+
    "\0\75\0\u0857\0\u0894\0\u08d1\0\u090e\0\u094b\0\u0988\0\u09c5"+
    "\0\u0a02\0\u0a3f\0\u0a7c\0\u0ab9\0\u0af6\0\u0b33\0\u0b70\0\u0bad"+
    "\0\u0bea\0\u0c27\0\172\0\u0c64\0\u0ca1\0\u0cde\0\u0d1b\0\u0d58"+
    "\0\u0d95\0\u0dd2\0\u0e0f\0\u0e4c\0\u0e89\0\u0ec6\0\u0f03\0\u0f40"+
    "\0\u0f7d\0\u0fba\0\172\0\u0ff7\0\u1034\0\u1071\0\172\0\u10ae"+
    "\0\172\0\172\0\u10eb\0\u1128\0\u1165\0\u11a2\0\u11df\0\u121c"+
    "\0\u1259\0\u1296\0\u12d3\0\u1310\0\u134d\0\u138a\0\u13c7\0\u1404"+
    "\0\u1441\0\75\0\75\0\172\0\u147e\0\u14bb\0\u14f8\0\172"+
    "\0\172\0\u1535\0\u1572\0\u15af\0\u15ec\0\u1629\0\172\0\172"+
    "\0\u1666\0\u16a3\0\u16e0\0\u171d\0\172\0\u175a\0\u1797\0\u17d4"+
    "\0\u1811\0\172\0\172\0\172\0\172\0\172\0\u184e\0\172"+
    "\0\u188b\0\172\0\u18c8\0\172\0\172\0\172\0\u1905\0\172"+
    "\0\172\0\u1942\0\u197f\0\172\0\172\0\u19bc\0\172\0\172"+
    "\0\172\0\u19f9\0\172\0\172\0\172\0\u1a36\0\u1a73\0\172"+
    "\0\172\0\75\0\75\0\u1ab0\0\u1aed\0\u1b2a\0\172\0\u1b67"+
    "\0\u1ba4\0\u1be1\0\172\0\u1c1e\0\u1c5b\0\u1c98\0\172\0\u1cd5"+
    "\0\u1d12\0\u1d4f\0\u1d8c\0\u1dc9\0\u1e06\0\75\0\u1e43\0\75"+
    "\0\75\0\u1e80\0\u1ebd\0\u1efa\0\172\0\172\0\172\0\172"+
    "\0\u1f37\0\u1f74\0\172\0\172\0\u1fb1\0\172\0\u1fee\0\u202b"+
    "\0\u2068\0\172\0\u20a5\0\u20e2\0\u211f\0\u215c\0\u2199\0\172"+
    "\0\u21d6\0\u2213\0\u2250\0\u228d\0\172\0\u22ca\0\u2307\0\u2344";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[208];
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
    "\1\2\1\3\1\4\1\5\1\6\1\3\1\7\1\3"+
    "\1\10\1\11\1\12\1\4\1\13\1\4\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\3\1\27\1\30\1\31\1\32\1\3\1\33"+
    "\1\3\1\34\1\35\1\36\4\3\1\37\1\40\4\3"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\5\3\1\47"+
    "\1\50\1\16\1\2\76\0\3\3\1\0\13\3\1\0"+
    "\35\3\5\0\6\3\6\0\1\4\1\51\1\0\1\52"+
    "\1\4\2\51\2\52\1\4\1\0\1\4\1\52\3\0"+
    "\1\52\7\0\2\52\3\0\1\51\2\52\3\0\1\52"+
    "\17\0\2\52\7\0\3\3\1\53\13\3\1\0\35\3"+
    "\5\0\6\3\6\0\1\54\3\0\1\55\4\0\1\55"+
    "\1\0\1\55\61\0\1\4\1\51\1\0\1\52\1\4"+
    "\1\56\1\51\2\52\1\4\1\0\1\4\1\52\3\0"+
    "\1\52\7\0\2\52\3\0\1\51\2\52\3\0\1\52"+
    "\17\0\2\52\7\0\3\3\1\0\13\3\1\0\2\3"+
    "\1\57\2\3\1\60\12\3\1\61\14\3\5\0\6\3"+
    "\5\0\3\3\1\62\13\3\1\0\35\3\5\0\6\3"+
    "\5\0\3\3\1\62\13\3\1\0\21\3\1\63\13\3"+
    "\5\0\6\3\5\0\3\3\1\64\13\3\1\0\35\3"+
    "\5\0\6\3\5\0\3\3\1\65\13\3\1\0\35\3"+
    "\5\0\6\3\6\0\1\66\3\0\1\66\2\0\1\67"+
    "\1\0\1\66\1\0\1\66\1\70\25\0\1\71\50\0"+
    "\2\16\40\0\1\16\10\0\1\16\2\0\3\3\1\0"+
    "\13\3\1\16\1\17\34\3\4\0\1\16\6\3\2\0"+
    "\1\16\2\0\3\3\1\0\13\3\1\0\2\3\1\72"+
    "\32\3\5\0\6\3\5\0\3\3\1\64\13\3\1\0"+
    "\3\3\1\73\31\3\5\0\6\3\5\0\3\3\1\0"+
    "\13\3\1\0\2\3\1\74\14\3\1\75\15\3\5\0"+
    "\6\3\5\0\3\3\1\0\13\3\1\0\22\3\1\76"+
    "\12\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\2\3\1\77\14\3\1\100\15\3\5\0\6\3\5\0"+
    "\3\3\1\0\13\3\1\0\2\3\1\101\12\3\1\102"+
    "\17\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\2\3\1\103\5\3\1\104\4\3\1\105\17\3\5\0"+
    "\6\3\5\0\3\3\1\65\13\3\1\0\17\3\1\106"+
    "\7\3\1\107\5\3\5\0\6\3\5\0\3\3\1\0"+
    "\13\3\1\0\11\3\1\110\16\3\1\111\4\3\5\0"+
    "\6\3\5\0\3\3\1\0\13\3\1\0\17\3\1\112"+
    "\15\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\5\3\1\113\1\3\1\114\5\3\1\115\1\3\1\116"+
    "\1\117\7\3\1\120\1\121\1\3\1\122\1\3\5\0"+
    "\6\3\5\0\3\3\1\53\13\3\1\0\5\3\1\123"+
    "\27\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\5\3\1\124\1\3\1\125\2\3\1\126\22\3\5\0"+
    "\6\3\5\0\3\3\1\0\13\3\1\0\12\3\1\127"+
    "\1\130\1\3\1\131\1\132\16\3\5\0\6\3\5\0"+
    "\3\3\1\0\13\3\1\0\35\3\5\0\2\3\1\133"+
    "\3\3\5\0\3\3\1\0\13\3\1\0\30\3\1\134"+
    "\4\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\2\3\1\135\32\3\5\0\6\3\100\0\1\136\1\0"+
    "\3\3\1\0\13\3\1\0\35\3\5\0\1\3\1\137"+
    "\4\3\4\0\72\47\1\140\2\47\2\0\1\52\1\51"+
    "\1\0\2\52\2\51\3\52\1\0\2\52\3\0\1\52"+
    "\7\0\2\52\3\0\1\51\2\52\3\0\1\52\17\0"+
    "\2\52\10\0\1\141\2\0\2\141\2\0\3\141\1\0"+
    "\2\141\3\0\1\141\7\0\2\141\4\0\2\141\3\0"+
    "\1\141\17\0\2\141\10\0\1\54\1\0\1\142\1\0"+
    "\1\54\4\0\1\54\1\0\1\54\61\0\1\54\1\0"+
    "\1\143\1\0\1\55\4\0\1\55\1\0\1\55\61\0"+
    "\1\56\2\0\2\56\2\0\3\56\1\0\2\56\3\0"+
    "\1\56\7\0\2\56\4\0\2\56\3\0\1\56\17\0"+
    "\2\56\7\0\3\3\1\0\13\3\1\0\3\3\1\144"+
    "\31\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\12\3\1\145\22\3\5\0\6\3\5\0\3\3\1\0"+
    "\13\3\1\0\16\3\1\146\16\3\5\0\6\3\12\0"+
    "\1\147\4\0\1\147\62\0\3\3\1\0\13\3\1\0"+
    "\1\3\1\150\1\3\1\151\31\3\5\0\6\3\12\0"+
    "\1\152\4\0\1\152\1\0\1\152\61\0\1\54\3\0"+
    "\1\54\4\0\1\54\1\0\1\54\61\0\1\66\3\0"+
    "\1\66\4\0\1\66\1\0\1\66\122\0\1\153\76\0"+
    "\1\154\114\0\1\155\10\0\3\3\1\0\13\3\1\0"+
    "\3\3\1\156\31\3\5\0\6\3\5\0\3\3\1\0"+
    "\13\3\1\0\3\3\1\157\1\3\1\160\27\3\5\0"+
    "\6\3\5\0\3\3\1\0\13\3\1\0\13\3\1\161"+
    "\21\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\23\3\1\162\11\3\5\0\6\3\5\0\3\3\1\0"+
    "\13\3\1\0\2\3\1\163\6\3\1\164\23\3\5\0"+
    "\6\3\5\0\3\3\1\0\13\3\1\0\12\3\1\165"+
    "\22\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\6\3\1\166\26\3\5\0\6\3\5\0\3\3\1\0"+
    "\13\3\1\0\21\3\1\167\13\3\5\0\6\3\5\0"+
    "\3\3\1\0\13\3\1\0\26\3\1\170\6\3\5\0"+
    "\6\3\5\0\3\3\1\0\13\3\1\0\4\3\1\171"+
    "\30\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\5\3\1\172\27\3\5\0\6\3\5\0\3\3\1\0"+
    "\13\3\1\0\20\3\1\173\14\3\5\0\6\3\5\0"+
    "\3\3\1\0\13\3\1\0\26\3\1\174\6\3\5\0"+
    "\6\3\5\0\3\3\1\0\13\3\1\0\11\3\1\175"+
    "\23\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\11\3\1\176\23\3\5\0\6\3\5\0\3\3\1\0"+
    "\13\3\1\0\21\3\1\177\13\3\5\0\6\3\5\0"+
    "\3\3\1\0\13\3\1\0\6\3\1\200\26\3\5\0"+
    "\6\3\5\0\3\3\1\0\13\3\1\0\7\3\1\201"+
    "\25\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\34\3\1\202\5\0\6\3\5\0\3\3\1\0\13\3"+
    "\1\0\5\3\1\203\11\3\1\204\1\205\10\3\1\206"+
    "\1\3\1\207\1\3\5\0\6\3\5\0\3\3\1\0"+
    "\13\3\1\0\13\3\1\210\21\3\5\0\6\3\5\0"+
    "\3\3\1\0\13\3\1\0\27\3\1\211\5\3\5\0"+
    "\6\3\5\0\3\3\1\0\13\3\1\0\6\3\1\212"+
    "\26\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\5\3\1\213\27\3\5\0\6\3\5\0\3\3\1\0"+
    "\13\3\1\0\3\3\1\214\1\3\1\215\27\3\5\0"+
    "\6\3\5\0\3\3\1\0\13\3\1\0\2\3\1\216"+
    "\24\3\1\217\5\3\5\0\6\3\5\0\3\3\1\0"+
    "\5\3\1\220\5\3\1\0\35\3\5\0\6\3\5\0"+
    "\3\3\1\0\13\3\1\0\3\3\1\221\1\3\1\215"+
    "\27\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\35\3\5\0\3\3\1\222\2\3\5\0\3\3\1\0"+
    "\13\3\1\0\20\3\1\223\14\3\5\0\6\3\5\0"+
    "\3\3\1\0\13\3\1\0\6\3\1\224\4\3\1\225"+
    "\21\3\5\0\6\3\6\0\1\226\3\0\1\226\4\0"+
    "\1\226\1\0\1\226\60\0\3\3\1\0\7\3\1\227"+
    "\3\3\1\0\35\3\5\0\6\3\76\0\2\140\3\0"+
    "\1\141\1\0\1\51\2\141\2\0\3\141\1\0\2\141"+
    "\3\0\1\141\7\0\2\141\4\0\2\141\3\0\1\141"+
    "\17\0\2\141\7\0\3\3\1\0\13\3\1\0\13\3"+
    "\1\230\21\3\5\0\6\3\5\0\3\3\1\0\13\3"+
    "\1\0\33\3\1\231\1\3\5\0\6\3\10\0\1\232"+
    "\1\0\1\147\4\0\1\147\65\0\1\143\1\0\1\152"+
    "\4\0\1\152\1\0\1\152\122\0\1\233\75\0\1\234"+
    "\37\0\1\235\66\0\3\3\1\0\13\3\1\0\4\3"+
    "\1\236\30\3\5\0\6\3\5\0\3\3\1\0\13\3"+
    "\1\0\1\3\1\237\33\3\5\0\6\3\5\0\3\3"+
    "\1\0\13\3\1\0\24\3\1\240\10\3\5\0\6\3"+
    "\5\0\3\3\1\0\13\3\1\0\6\3\1\241\26\3"+
    "\5\0\6\3\5\0\3\3\1\0\13\3\1\0\21\3"+
    "\1\242\13\3\5\0\6\3\5\0\3\3\1\0\13\3"+
    "\1\0\1\3\1\243\33\3\5\0\6\3\5\0\3\3"+
    "\1\0\13\3\1\0\16\3\1\244\16\3\5\0\6\3"+
    "\5\0\3\3\1\0\13\3\1\0\21\3\1\245\13\3"+
    "\5\0\6\3\5\0\3\3\1\0\13\3\1\0\11\3"+
    "\1\246\23\3\5\0\6\3\5\0\3\3\1\0\13\3"+
    "\1\0\13\3\1\247\21\3\5\0\6\3\5\0\3\3"+
    "\1\0\13\3\1\0\6\3\1\250\26\3\5\0\6\3"+
    "\5\0\3\3\1\0\13\3\1\0\17\3\1\122\15\3"+
    "\5\0\6\3\5\0\3\3\1\0\13\3\1\0\17\3"+
    "\1\113\15\3\5\0\6\3\5\0\3\3\1\0\13\3"+
    "\1\0\21\3\1\251\13\3\5\0\6\3\5\0\3\3"+
    "\1\0\13\3\1\0\5\3\1\252\12\3\1\253\14\3"+
    "\5\0\6\3\5\0\3\3\1\0\13\3\1\0\21\3"+
    "\1\254\13\3\5\0\6\3\5\0\3\3\1\0\13\3"+
    "\1\0\23\3\1\255\11\3\5\0\6\3\6\0\1\226"+
    "\3\0\1\226\4\0\1\226\1\0\1\226\41\0\1\256"+
    "\16\0\3\3\1\0\4\3\1\257\6\3\1\0\35\3"+
    "\5\0\6\3\51\0\1\260\73\0\1\261\31\0\3\3"+
    "\1\0\13\3\1\0\5\3\1\262\27\3\5\0\6\3"+
    "\5\0\3\3\1\0\13\3\1\0\25\3\1\263\7\3"+
    "\5\0\6\3\5\0\3\3\1\0\13\3\1\0\4\3"+
    "\1\264\30\3\5\0\6\3\5\0\3\3\1\0\5\3"+
    "\1\265\5\3\1\0\35\3\5\0\6\3\5\0\3\3"+
    "\1\0\13\3\1\0\1\3\1\266\33\3\5\0\6\3"+
    "\5\0\3\3\1\0\5\3\1\267\5\3\1\0\32\3"+
    "\1\270\2\3\5\0\6\3\5\0\3\3\1\0\13\3"+
    "\1\0\12\3\1\271\22\3\5\0\6\3\5\0\3\3"+
    "\1\0\13\3\1\0\4\3\1\272\30\3\5\0\6\3"+
    "\5\0\3\3\1\0\5\3\1\273\5\3\1\0\35\3"+
    "\5\0\6\3\5\0\3\3\1\0\13\3\1\0\1\3"+
    "\1\274\33\3\5\0\6\3\5\0\3\3\1\0\13\3"+
    "\1\0\4\3\1\275\30\3\5\0\6\3\5\0\3\3"+
    "\1\0\5\3\1\276\5\3\1\0\35\3\5\0\6\3"+
    "\5\0\3\3\1\0\13\3\1\0\35\3\5\0\4\3"+
    "\1\277\1\3\5\0\3\3\1\0\13\3\1\0\24\3"+
    "\1\300\10\3\5\0\6\3\5\0\3\3\1\0\13\3"+
    "\1\0\2\3\1\301\32\3\5\0\6\3\5\0\3\3"+
    "\1\0\13\3\1\0\23\3\1\302\11\3\5\0\6\3"+
    "\5\0\3\3\1\0\13\3\1\0\21\3\1\303\13\3"+
    "\5\0\6\3\5\0\3\3\1\0\13\3\1\0\13\3"+
    "\1\304\21\3\5\0\6\3\5\0\3\3\1\0\13\3"+
    "\1\0\16\3\1\305\16\3\5\0\6\3\5\0\3\3"+
    "\1\0\13\3\1\0\21\3\1\306\13\3\5\0\6\3"+
    "\5\0\3\3\1\0\7\3\1\307\3\3\1\0\35\3"+
    "\5\0\6\3\5\0\3\3\1\0\13\3\1\0\35\3"+
    "\5\0\1\3\1\310\4\3\5\0\3\3\1\0\13\3"+
    "\1\0\2\3\1\311\32\3\5\0\6\3\5\0\3\3"+
    "\1\0\13\3\1\0\13\3\1\312\21\3\5\0\6\3"+
    "\5\0\3\3\1\0\13\3\1\0\12\3\1\302\22\3"+
    "\5\0\6\3\5\0\3\3\1\0\13\3\1\0\17\3"+
    "\1\313\15\3\5\0\6\3\5\0\3\3\1\0\13\3"+
    "\1\0\15\3\1\314\17\3\5\0\6\3\5\0\3\3"+
    "\1\0\13\3\1\0\35\3\5\0\5\3\1\315\5\0"+
    "\3\3\1\0\13\3\1\0\6\3\1\302\26\3\5\0"+
    "\6\3\5\0\3\3\1\0\13\3\1\0\12\3\1\316"+
    "\22\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\3\3\1\317\31\3\5\0\6\3\5\0\3\3\1\0"+
    "\13\3\1\0\7\3\1\302\25\3\5\0\6\3\5\0"+
    "\3\3\1\0\13\3\1\0\3\3\1\320\31\3\5\0"+
    "\6\3\5\0\3\3\1\0\13\3\1\0\17\3\1\302"+
    "\15\3\5\0\6\3\5\0\3\3\1\0\13\3\1\0"+
    "\13\3\1\302\21\3\5\0\6\3\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9089];
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
    "\1\0\1\11\37\1\3\11\3\1\2\11\4\0\4\1"+
    "\1\0\1\1\2\0\1\1\3\0\44\1\1\0\2\1"+
    "\1\0\2\11\3\1\1\0\2\1\4\0\50\1\1\0"+
    "\3\1\2\11\2\0\20\1\1\11\1\1\2\11\37\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[208];
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
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    } 
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }   
;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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

      yychar+= zzMarkedPosL-zzStartRead;

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
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
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
        case 67: 
          { return new Symbol(sym.MOVSW, yychar, yyline, yytext());
          }
        case 74: break;
        case 41: 
          { return new Symbol(sym.HLT, yychar, yyline, yytext());
          }
        case 75: break;
        case 13: 
          { return new Symbol(sym.NumeroHexadecimal, yychar, yyline, yytext());
          }
        case 76: break;
        case 6: 
          { return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());
          }
        case 77: break;
        case 49: 
          { return new Symbol(sym.INC, yychar, yyline, yytext());
          }
        case 78: break;
        case 65: 
          { return new Symbol(sym.PUSHF, yychar, yyline, yytext());
          }
        case 79: break;
        case 64: 
          { return new Symbol(sym.LODSB, yychar, yyline, yytext());
          }
        case 80: break;
        case 14: 
          { return new Symbol(sym.NumeroDecimal, yychar, yyline, yytext());
          }
        case 81: break;
        case 59: 
          { return new Symbol(sym.PUSH, yychar, yyline, yytext());
          }
        case 82: break;
        case 27: 
          { return new Symbol(sym.RET, yychar, yyline, yytext());
          }
        case 83: break;
        case 53: 
          { return new Symbol(sym.XCHG, yychar, yyline, yytext());
          }
        case 84: break;
        case 10: 
          { return new Symbol(sym.Coma, yychar, yyline, yytext());
          }
        case 85: break;
        case 17: 
          { return new Symbol(sym.JE, yychar, yyline, yytext());
          }
        case 86: break;
        case 5: 
          { /*Ignorar*/
          }
        case 87: break;
        case 39: 
          { return new Symbol(sym.JNC, yychar, yyline, yytext());
          }
        case 88: break;
        case 8: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 89: break;
        case 25: 
          { return new Symbol(sym.ROR, yychar, yyline, yytext());
          }
        case 90: break;
        case 56: 
          { return new Symbol(sym.RETF, yychar, yyline, yytext());
          }
        case 91: break;
        case 58: 
          { return new Symbol(sym.POPF, yychar, yyline, yytext());
          }
        case 92: break;
        case 4: 
          { return new Symbol(sym.Comilla_a, yychar, yyline, yytext());
          }
        case 93: break;
        case 32: 
          { return new Symbol(sym.DEC, yychar, yyline, yytext());
          }
        case 94: break;
        case 46: 
          { return new Symbol(sym.STI, yychar, yyline, yytext());
          }
        case 95: break;
        case 50: 
          { return new Symbol(sym.NOP, yychar, yyline, yytext());
          }
        case 96: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 97: break;
        case 11: 
          { /* Ignorar los comentarios, incluyendo saltos de línea */
          }
        case 98: break;
        case 70: 
          { return new Symbol(sym.STOSB, yychar, yyline, yytext());
          }
        case 99: break;
        case 40: 
          { return new Symbol(sym.JNZ, yychar, yyline, yytext());
          }
        case 100: break;
        case 51: 
          { return new Symbol(sym.NOT, yychar, yyline, yytext());
          }
        case 101: break;
        case 33: 
          { return new Symbol(sym.DIV, yychar, yyline, yytext());
          }
        case 102: break;
        case 36: 
          { return new Symbol(sym.JMP, yychar, yyline, yytext());
          }
        case 103: break;
        case 66: 
          { return new Symbol(sym.MOVSB, yychar, yyline, yytext());
          }
        case 104: break;
        case 71: 
          { return new Symbol(sym.Etiquetas, yychar, yyline, yytext());
          }
        case 105: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 106: break;
        case 12: 
          { /* Saltos de línea */
          }
        case 107: break;
        case 29: 
          { return new Symbol(sym.POP, yychar, yyline, yytext());
          }
        case 108: break;
        case 48: 
          { return new Symbol(sym.SHR, yychar, yyline, yytext());
          }
        case 109: break;
        case 42: 
          { return new Symbol(sym.CLI, yychar, yyline, yytext());
          }
        case 110: break;
        case 28: 
          { return new Symbol(sym.LEA, yychar, yyline, yytext());
          }
        case 111: break;
        case 35: 
          { return new Symbol(sym.AND, yychar, yyline, yytext());
          }
        case 112: break;
        case 18: 
          { return new Symbol(sym.JC, yychar, yyline, yytext());
          }
        case 113: break;
        case 61: 
          { return new Symbol(sym.CALL, yychar, yyline, yytext());
          }
        case 114: break;
        case 62: 
          { return new Symbol(sym.Section_data, yychar, yyline, yytext());
          }
        case 115: break;
        case 52: 
          { return new Symbol(sym.XLAT, yychar, yyline, yytext());
          }
        case 116: break;
        case 23: 
          { return new Symbol(sym.BSF, yychar, yyline, yytext());
          }
        case 117: break;
        case 37: 
          { return new Symbol(sym.JEQ, yychar, yyline, yytext());
          }
        case 118: break;
        case 47: 
          { return new Symbol(sym.SUB, yychar, yyline, yytext());
          }
        case 119: break;
        case 26: 
          { return new Symbol(sym.ROL, yychar, yyline, yytext());
          }
        case 120: break;
        case 21: 
          { return new Symbol(sym.NumeroOctal, yychar, yyline, yytext());
          }
        case 121: break;
        case 7: 
          { return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());
          }
        case 122: break;
        case 20: 
          { return new Symbol(sym.JG, yychar, yyline, yytext());
          }
        case 123: break;
        case 9: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 124: break;
        case 44: 
          { return new Symbol(sym.SAR, yychar, yyline, yytext());
          }
        case 125: break;
        case 57: 
          { return new Symbol(sym.LOOP, yychar, yyline, yytext());
          }
        case 126: break;
        case 72: 
          { return new Symbol(sym.Global, yychar, yyline, yytext());
          }
        case 127: break;
        case 43: 
          { return new Symbol(sym.CMP, yychar, yyline, yytext());
          }
        case 128: break;
        case 60: 
          { return new Symbol(sym.TEST, yychar, yyline, yytext());
          }
        case 129: break;
        case 31: 
          { return new Symbol(sym.MUL, yychar, yyline, yytext());
          }
        case 130: break;
        case 19: 
          { return new Symbol(sym.JZ, yychar, yyline, yytext());
          }
        case 131: break;
        case 69: 
          { return new Symbol(sym.CALLF, yychar, yyline, yytext());
          }
        case 132: break;
        case 24: 
          { return new Symbol(sym.BSR, yychar, yyline, yytext());
          }
        case 133: break;
        case 68: 
          { return new Symbol(sym.CMPSB, yychar, yyline, yytext());
          }
        case 134: break;
        case 38: 
          { return new Symbol(sym.JNE, yychar, yyline, yytext());
          }
        case 135: break;
        case 55: 
          { return new Symbol(sym.Section_bss, yychar, yyline, yytext());
          }
        case 136: break;
        case 22: 
          { return new Symbol(sym.XOR, yychar, yyline, yytext());
          }
        case 137: break;
        case 73: 
          { return new Symbol(sym.Section, yychar, yyline, yytext());
          }
        case 138: break;
        case 54: 
          { return new Symbol(sym.NumeroBinario, yychar, yyline, yytext());
          }
        case 139: break;
        case 63: 
          { return new Symbol(sym.Section_text, yychar, yyline, yytext());
          }
        case 140: break;
        case 15: 
          { return new Symbol(sym.OR, yychar, yyline, yytext());
          }
        case 141: break;
        case 30: 
          { return new Symbol(sym.MOV, yychar, yyline, yytext());
          }
        case 142: break;
        case 3: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 143: break;
        case 45: 
          { return new Symbol(sym.SHL, yychar, yyline, yytext());
          }
        case 144: break;
        case 34: 
          { return new Symbol(sym.ADD, yychar, yyline, yytext());
          }
        case 145: break;
        case 16: 
          { return new Symbol(sym.JL, yychar, yyline, yytext());
          }
        case 146: break;
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
