/* ParserTokenManager.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. ParserTokenManager.java */
package parser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/** Token Manager. */
@SuppressWarnings("unused")public class ParserTokenManager implements ParserConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x10L) != 0L)
         {
            jjmatchedKind = 5;
            return 17;
         }
         if ((active0 & 0x140000000L) != 0L)
            return 7;
         return -1;
      case 1:
         if ((active0 & 0x10L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 1;
            return 17;
         }
         return -1;
      case 2:
         if ((active0 & 0x10L) != 0L)
            return 17;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 42);
      case 35:
         return jjMoveStringLiteralDfa1_0(0x3c00000000L);
      case 37:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 40:
         return jjStopAtPos(0, 22);
      case 41:
         return jjStopAtPos(0, 23);
      case 42:
         return jjStopAtPos(0, 20);
      case 43:
         return jjStopAtPos(0, 18);
      case 44:
         return jjStopAtPos(0, 11);
      case 45:
         return jjStopAtPos(0, 19);
      case 46:
         return jjStopAtPos(0, 10);
      case 47:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 58:
         jjmatchedKind = 13;
         return jjMoveStringLiteralDfa1_0(0x30000L);
      case 59:
         return jjStopAtPos(0, 14);
      case 60:
         jjmatchedKind = 30;
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 61:
         return jjStopAtPos(0, 28);
      case 62:
         jjmatchedKind = 31;
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 63:
         return jjStopAtPos(0, 12);
      case 64:
         return jjStopAtPos(0, 41);
      case 91:
         return jjStopAtPos(0, 24);
      case 93:
         return jjStopAtPos(0, 25);
      case 95:
         return jjStopAtPos(0, 43);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 123:
         return jjStopAtPos(0, 26);
      case 124:
         return jjStopAtPos(0, 15);
      case 125:
         return jjStopAtPos(0, 27);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 37:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L);
      case 45:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         break;
      case 46:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000L);
      case 61:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         break;
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x3000000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x10L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000L);
      case 126:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      case 46:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 116:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(2, 4, 17);
         break;
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 36:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(3, 38);
         break;
      case 42:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000L);
      case 109:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(3, 35);
         break;
      case 110:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(3, 37);
         break;
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000L);
      case 120:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(3, 36);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 37:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(5, 39);
         break;
      case 116:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(5, 34);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 17;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                     { jjCheckNAdd(6); }
                  }
                  else if (curChar == 33)
                     jjstateSet[jjnewStateCnt++] = 9;
                  else if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(4, 5); }
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 6)
                        kind = 6;
                     { jjCheckNAddTwoStates(15, 16); }
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                     { jjCheckNAddTwoStates(13, 14); }
                  }
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjAddStates(0, 1); }
                  break;
               case 3:
                  if (curChar == 34)
                     { jjCheckNAddTwoStates(4, 5); }
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(4, 5); }
                  break;
               case 5:
                  if (curChar == 34 && kind > 8)
                     kind = 8;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  { jjCheckNAdd(6); }
                  break;
               case 7:
                  if (curChar == 62)
                     kind = 29;
                  break;
               case 8:
                  if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 61)
                     kind = 29;
                  break;
               case 10:
                  if (curChar == 33)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  { jjCheckNAddTwoStates(13, 14); }
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  { jjCheckNAddTwoStates(15, 16); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 40)
                        kind = 40;
                  }
                  if ((0x7fffffe00000000L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                     { jjCheckNAddStates(2, 5); }
                  }
                  else if ((0x7fffffeL & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     { jjCheckNAddTwoStates(1, 2); }
                  }
                  break;
               case 17:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 6)
                        kind = 6;
                     { jjCheckNAddTwoStates(15, 16); }
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                     { jjCheckNAddTwoStates(13, 14); }
                  }
                  break;
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 4:
                  if ((0x7fffffe97fffffeL & l) != 0L)
                     { jjAddStates(6, 7); }
                  break;
               case 11:
                  if ((0x7fffffe07fffffeL & l) != 0L && kind > 40)
                     kind = 40;
                  break;
               case 12:
                  if ((0x7fffffe00000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  { jjCheckNAddStates(2, 5); }
                  break;
               case 13:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  { jjCheckNAddTwoStates(13, 14); }
                  break;
               case 15:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  { jjCheckNAddTwoStates(15, 16); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 17 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   1, 2, 13, 14, 15, 16, 4, 5, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, "\156\157\164", null, null, null, null, null, "\56", 
"\54", "\77", "\72", "\73", "\174", "\72\55", "\72\176", "\53", "\55", "\52", "\57", 
"\50", "\51", "\133", "\135", "\173", "\175", "\75", null, "\74", "\76", "\74\75", 
"\76\75", "\43\143\157\165\156\164", "\43\163\165\155", "\43\155\141\170", 
"\43\155\151\156", "\45\56\52\44", "\57\45\56\52\45\57", null, "\100", "\12", "\137", null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   t.image = curTokenImage;

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 44)
   {
      jjmatchedKind = 44;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public ParserTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public ParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 17; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  static public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1ffffffffff1L, 
};
static final long[] jjtoSkip = {
   0xeL, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[17];
    static private final int[] jjstateSet = new int[2 * 17];

    
    static protected char curChar;
}
