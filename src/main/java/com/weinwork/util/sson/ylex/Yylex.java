package com.weinwork.util.sson.ylex;

import java.io.InputStreamReader;
import java.io.Reader;

import com.weinwork.util.sson.sson.SsonException;

public class Yylex
{
	public static final int YYEOF = -1;
	private static final int ZZ_BUFFERSIZE = 16384;
	public static final int YYINITIAL = 0;
	public static final int STRING_BEGIN = 2;
	private static final int ZZ_LEXSTATE[] = { 0, 0, 1, 1 };
	private static final String ZZ_CMAP_PACKED = "\11\0\1\7\1\7\2\0\1\7\22\0\1\7\1\0\1\11\10\0\1\6\1\31\1\2\1\4\1\12\12\3\1\32\6\0\4\1\1\5\1\1\24\0\1\27\1\10\1\30\3\0\1\22\1\13\2\1\1\21\1\14\5\0\1\23\1\0\1\15\3\0\1\16\1\24\1\17\1\20\5\0\1\25\1\0\1\26\uff82\0";
	private static final String ZZ_ACTION_PACKED_0 = "\2\0\2\1\1\2\1\3\1\4\3\1\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\5\0\1\14\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\0\1\2\1\0\1\2\4\0\1\25\1\26\2\0\1\27";
	private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);
	private static final int[] ZZ_ACTION = zzUnpackAction();
	private static final int[] ZZ_ROWMAP = zzUnpackRowMap();
	private static final String ZZ_ROWMAP_PACKED_0 = "\0\0\0\33\0\66\0\121\0\154\0\207\0\66\0\242\0\275\0\330\0\66\0\66\0\66\0\66\0\66\0\66\0\363\0\u010e\0\66\0\u0129\0\u0144\0\u015f\0\u017a\0\u0195\0\66\0\66\0\66\0\66\0\66\0\66\0\66\0\66\0\u01b0\0\u01cb\0\u01e6\0\u01e6\0\u0201\0\u021c\0\u0237\0\u0252\0\66\0\66\0\u026d\0\u0288\0\66";
	private static final int ZZ_UNKNOWN_ERROR = 0;
	private static final int ZZ_NO_MATCH = 1;
	private static final int ZZ_PUSHBACK_2BIG = 2;
	private static final String ZZ_ERROR_MSG[] = { "Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large" };
	private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();
	private static final String ZZ_ATTRIBUTE_PACKED_0 = "\2\0\1\11\3\1\1\11\3\1\6\11\2\1\1\11\5\0\10\11\1\0\1\1\1\0\1\1\4\0\2\11\2\0\1\11";
	private Reader zzReader;
	private int zzState;
	private int zzLexicalState = YYINITIAL;
	private char zzBuffer[] = new char[ZZ_BUFFERSIZE];
	private int zzMarkedPos;
	private int zzCurrentPos;
	private int zzStartRead;
	private int zzEndRead;
	private int yyline;
	private int yychar;
	private int yycolumn;
	private boolean zzAtBOL = true;
	private boolean zzAtEOF;
	private boolean zzEOFDone;
	private StringBuilder sb = new StringBuilder();
	
	private static int[] zzUnpackAction()
	{
		int[] result = new int[45];
		int offset = 0;
		
		offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
		return result;
	}
	
	private static int zzUnpackAction(String packed, int offset, int[] result)
	{
		int i = 0;
		int j = offset;
		int l = packed.length();
		
		while (i < l)
		{
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			
			do
			{
				result[j++] = value;
			}
			while (--count > 0);
		}
		
		return j;
	}
	
	private static int[] zzUnpackRowMap()
	{
		int[] result = new int[45];
		int offset = 0;
		offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
		
		return result;
	}
	
	private static int zzUnpackRowMap(String packed, int offset, int[] result)
	{
		int i = 0;
		int j = offset;
		int l = packed.length();
		
		while (i < l)
		{
			int high = packed.charAt(i++) << 16;
			result[j++] = high | packed.charAt(i++);
		}
		
		return j;
	}
	
	private static final int ZZ_TRANS[] = {
			2, 2, 3, 4, 2, 2, 2, 5, 2, 6,
			2, 2, 7, 8, 2, 9, 2, 2, 2, 2,
			2, 10, 11, 12, 13, 14, 15, 16, 16, 16,
			16, 16, 16, 16, 16, 17, 18, 16, 16, 16,
			16, 16, 16, 16, 16, 16, 16, 16, 16, 16,
			16, 16, 16, 16, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, 4, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, 4, 19, 20, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, 20, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, 5, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			21, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, 22, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			23, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, 16, 16, 16, 16, 16, 16, 16,
			16, -1, -1, 16, 16, 16, 16, 16, 16, 16,
			16, 16, 16, 16, 16, 16, 16, 16, 16, 16,
			-1, -1, -1, -1, -1, -1, -1, -1, 24, 25,
			26, 27, 28, 29, 30, 31, 32, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			33, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, 34, 35, -1, -1,
			34, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			36, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, 37, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, 38, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, 39, -1, 39, -1, 39, -1, -1,
			-1, -1, -1, 39, 39, -1, -1, -1, -1, 39,
			39, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, 33, -1, 20, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, 20, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, 35,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, 38, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, 40,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, 41, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, 42, -1, 42, -1, 42,
			-1, -1, -1, -1, -1, 42, 42, -1, -1, -1,
			-1, 42, 42, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, 43, -1, 43, -1, 43, -1, -1, -1,
			-1, -1, 43, 43, -1, -1, -1, -1, 43, 43,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, 44,
			-1, 44, -1, 44, -1, -1, -1, -1, -1, 44,
			44, -1, -1, -1, -1, 44, 44, -1, -1, -1,
			-1, -1, -1, -1, -1,
	};
	
	private static int[] zzUnpackAttribute()
	{
		int[] result = new int[45];
		int offset = 0;
		
		offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
		return result;
	}
	
	private static int zzUnpackAttribute(String packed, int offset, int[] result)
	{
		int i = 0;
		int j = offset;
		int l = packed.length();
		
		while (i < l)
		{
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			
			do
			{
				result[j++] = value;
			}
			while (--count > 0);
		}
		
		return j;
	}
	
	public int getPosition()
	{
		return yychar;
	}
	
	public Yylex(java.io.Reader in)
	{
		this.zzReader = in;
	}
	
	public Yylex(java.io.InputStream in)
	{
		this(new InputStreamReader(in));
	}
	
	private static char[] zzUnpackCMap(String packed)
	{
		char[] map = new char[0x10000];
		int i = 0;
		int j = 0;
		
		while (i < 90)
		{
			int count = packed.charAt(i++);
			char value = packed.charAt(i++);
			
			do
			{
				map[j++] = value;
			}
			while (--count > 0);
		}
		
		return map;
	}
	
	private boolean zzRefill() throws java.io.IOException
	{
		
		if (zzStartRead > 0)
		{
			System.arraycopy(zzBuffer, zzStartRead, zzBuffer, 0, zzEndRead - zzStartRead);
			
			zzEndRead -= zzStartRead;
			zzCurrentPos -= zzStartRead;
			zzMarkedPos -= zzStartRead;
			zzStartRead = 0;
		}
		
		if (zzCurrentPos >= zzBuffer.length)
		{
			char newBuffer[] = new char[zzCurrentPos * 2];
			
			System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
			zzBuffer = newBuffer;
		}
		
		int numRead = zzReader.read(zzBuffer, zzEndRead, zzBuffer.length - zzEndRead);
		
		if (numRead > 0)
		{
			zzEndRead += numRead;
			return false;
		}
		
		if (numRead == 0)
		{
			int c = zzReader.read();
			
			if (c == -1)
			{
				return true;
			}
			else
			{
				zzBuffer[zzEndRead++] = (char) c;
				return false;
			}
		}
		
		return true;
	}
	
	public final void yyclose() throws java.io.IOException
	{
		zzAtEOF = true;
		zzEndRead = zzStartRead;
		
		if (zzReader != null)
		{
			zzReader.close();
		}
	}
	
	public final void yyreset(java.io.Reader reader)
	{
		zzReader = reader;
		zzAtBOL = true;
		zzAtEOF = false;
		zzEOFDone = false;
		zzEndRead = zzStartRead = 0;
		zzCurrentPos = zzMarkedPos = 0;
		yyline = yychar = yycolumn = 0;
		zzLexicalState = YYINITIAL;
	}
	
	public final int yystate()
	{
		return zzLexicalState;
	}
	
	public final void yybegin(int newState)
	{
		zzLexicalState = newState;
	}
	
	public final String yytext()
	{
		return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
	}
	
	public final char yycharat(int pos)
	{
		return zzBuffer[zzStartRead + pos];
	}
	
	public final int yylength()
	{
		return zzMarkedPos - zzStartRead;
	}
	
	private void zzScanError(int errorCode)
	{
		String message;
		
		try
		{
			message = ZZ_ERROR_MSG[errorCode];
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
		}
		
		throw new Error(message);
	}
	
	public void yypushback(int number)
	{
		if (number > yylength()) zzScanError(ZZ_PUSHBACK_2BIG);
		
		zzMarkedPos -= number;
	}
	
	public Yytoken yylex() throws Exception
	{
		int zzInput;
		int zzAction;
		
		int zzCurrentPosL;
		int zzMarkedPosL;
		int zzEndReadL = zzEndRead;
		char[] zzBufferL = zzBuffer;
		char[] zzCMapL = ZZ_CMAP;
		
		int[] zzTransL = ZZ_TRANS;
		int[] zzRowMapL = ZZ_ROWMAP;
		int[] zzAttrL = ZZ_ATTRIBUTE;
		
		while (true)
		{
			zzMarkedPosL = zzMarkedPos;
			yychar += zzMarkedPosL - zzStartRead;
			zzAction = -1;
			zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
			zzState = ZZ_LEXSTATE[zzLexicalState];
			
			zzForAction:
			{
				
				while (true)
				{
					
					if (zzCurrentPosL < zzEndReadL)
					{
						zzInput = zzBufferL[zzCurrentPosL++];
					}
					else if (zzAtEOF)
					{
						zzInput = YYEOF;
						break zzForAction;
					}
					else
					{
						zzCurrentPos = zzCurrentPosL;
						zzMarkedPos = zzMarkedPosL;
						boolean eof = zzRefill();
						zzCurrentPosL = zzCurrentPos;
						zzMarkedPosL = zzMarkedPos;
						zzBufferL = zzBuffer;
						zzEndReadL = zzEndRead;
						
						if (eof)
						{
							zzInput = YYEOF;
							break zzForAction;
						}
						else
						{
							zzInput = zzBufferL[zzCurrentPosL++];
						}
					}
					
					int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
					
					if (zzNext == -1)
					{
						break zzForAction;
					}
					
					zzState = zzNext;
					int zzAttributes = zzAttrL[zzState];
					
					if ((zzAttributes & 1) == 1)
					{
						zzAction = zzState;
						zzMarkedPosL = zzCurrentPosL;
						
						if ((zzAttributes & 8) == 8)
						{
							break zzForAction;
						}
					}
					
				}
			}
			
			zzMarkedPos = zzMarkedPosL;
			
			switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction])
			{
				case 1:
					throw new SsonException(yychar, SsonException.Problems.UNEXPECTED_CHARACTER, new Character(yycharat(0)));
				
				case 24:
					break;
				
				case 4:
					sb = null;
					sb = new StringBuilder();
					yybegin(STRING_BEGIN);
					break;
				
				case 25:
					break;
				
				case 11:
					sb.append(yytext());
					break;
				
				case 26:
					break;
				
				case 5:
					return new Yytoken(com.weinwork.util.sson.ylex.Yytoken.Types.BRACE_L, null);
				
				case 27:
					break;
				
				case 16:
					sb.append('\b');
					break;
				
				case 28:
					break;
				
				case 22:
					Boolean val = Boolean.valueOf(yytext());
					return new Yytoken(Yytoken.Types.DATUM, val);
				
				case 29:
					break;
				
				case 12: 
					sb.append('\\');
					break;
				
				case 30:
					break;
				
				case 10: 
					return new Yytoken(Yytoken.Types.COLON, null);
				
				case 31:
					break;
				
				case 9: 
					return new Yytoken(Yytoken.Types.COMMA, null);
				
				case 32:
					break;
				
				case 21: 
					return new Yytoken(Yytoken.Types.DATUM, null);
				
				case 33:
					break;
				
				case 19: 
					sb.append('\r');
					break;
				
				case 34:
					break;
				
				case 15: 
					sb.append('/');
					break;
				
				case 35:
					break;
				
				case 2: 
					return new Yytoken(Yytoken.Types.DATUM, new java.math.BigDecimal(yytext()));
				
				case 36:
					break;
				
				case 14: 
					sb.append('"');
					break;
				
				case 37:
					break;
				
				case 8: 
					return new Yytoken(Yytoken.Types.BRACKET_R, null);
				
				case 38:
					break;
				
				case 23: 
					try
					{
						int ch = Integer.parseInt(yytext().substring(2), 16);
						sb.append((char) ch);
					}
					catch (Exception e)
					{
						throw new SsonException(yychar, SsonException.Problems.UNKNOWN, e);
					}
					
					break;
				
				case 39:
					break;
				
				case 17: 
					sb.append('\f');
					break;
				
				case 40:
					break;
				
				case 6: 
					return new Yytoken(Yytoken.Types.BRACE_R, null);
				
				case 41:
					break;
				
				case 20: 
					sb.append('\t');
					break;
				
				case 42:
					break;
				
				case 7: 
					return new Yytoken(Yytoken.Types.BRACKET_L, null);
				
				case 43:
					break;
				
				case 18: 
					sb.append('\n');
					break;
				
				case 44:
					break;
				
				case 13: 
					yybegin(YYINITIAL);
					return new Yytoken(Yytoken.Types.DATUM, sb.toString());
				
				case 45:
					break;
				
				case 3:
					break;
				
				case 46:
					break;
				
				default:
					if (zzInput == YYEOF && zzStartRead == zzCurrentPos)
					{
						zzAtEOF = true;
						return null;
					}
					else
					{
						zzScanError(ZZ_NO_MATCH);
					}
					
					break;
			}
		}
	}
	
}
