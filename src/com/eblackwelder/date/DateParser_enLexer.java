// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g 2012-06-15 22:22:45

package com.eblackwelder.date;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DateParser_enLexer extends Lexer {
    public static final int D=14;
    public static final int E=10;
    public static final int F=22;
    public static final int G=26;
    public static final int A=7;
    public static final int B=28;
    public static final int C=31;
    public static final int L=27;
    public static final int M=16;
    public static final int N=19;
    public static final int O=15;
    public static final int H=20;
    public static final int I=23;
    public static final int J=32;
    public static final int K=18;
    public static final int U=21;
    public static final int T=12;
    public static final int W=17;
    public static final int V=24;
    public static final int Q=34;
    public static final int P=33;
    public static final int S=11;
    public static final int R=13;
    public static final int MINUS=5;
    public static final int EOF=-1;
    public static final int Y=9;
    public static final int X=25;
    public static final int Z=35;
    public static final int WS=30;
    public static final int NEWLINE=29;
    public static final int COMMA=6;
    public static final int PLUS=4;
    public static final int NUMBER_LITERAL=8;

    // delegates
    // delegators

    public DateParser_enLexer() {;} 
    public DateParser_enLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DateParser_enLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g"; }

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:7:6: ( '+' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:7:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:8:7: ( '-' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:8:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:9:7: ( ',' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "NUMBER_LITERAL"
    public final void mNUMBER_LITERAL() throws RecognitionException {
        try {
            int _type = NUMBER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:181:16: ( ( '0' .. '9' )+ )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:181:18: ( '0' .. '9' )+
            {
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:181:18: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:181:19: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER_LITERAL"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:182:11: ( ( '\\r' )? '\\n' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:182:13: ( '\\r' )? '\\n'
            {
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:182:13: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:182:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:183:7: ( ( ' ' | '\\t' )+ )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:183:9: ( ' ' | '\\t' )+
            {
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:183:9: ( ' ' | '\\t' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            int _type = A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:185:2: ( 'A' | 'a' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            int _type = B;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:186:2: ( 'B' | 'b' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            int _type = C;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:187:2: ( 'C' | 'c' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            int _type = D;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:188:2: ( 'D' | 'd' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            int _type = E;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:189:2: ( 'E' | 'e' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            int _type = F;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:190:2: ( 'F' | 'f' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            int _type = G;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:191:2: ( 'G' | 'g' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            int _type = H;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:192:2: ( 'H' | 'h' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            int _type = I;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:193:2: ( 'I' | 'i' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            int _type = J;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:194:2: ( 'J' | 'j' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            int _type = K;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:195:2: ( 'K' | 'k' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            int _type = L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:196:2: ( 'L' | 'l' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            int _type = M;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:197:2: ( 'M' | 'm' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            int _type = N;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:198:2: ( 'N' | 'n' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            int _type = O;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:199:2: ( 'O' | 'o' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            int _type = P;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:200:2: ( 'P' | 'p' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            int _type = Q;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:201:2: ( 'Q' | 'q' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            int _type = R;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:202:2: ( 'R' | 'r' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            int _type = S;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:203:2: ( 'S' | 's' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            int _type = T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:204:2: ( 'T' | 't' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            int _type = U;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:205:2: ( 'U' | 'u' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            int _type = V;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:206:2: ( 'V' | 'v' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            int _type = W;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:207:2: ( 'W' | 'w' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            int _type = X;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:208:2: ( 'X' | 'x' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            int _type = Y;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:209:2: ( 'Y' | 'y' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            int _type = Z;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:210:2: ( 'Z' | 'z' )
            // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Z"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:8: ( PLUS | MINUS | COMMA | NUMBER_LITERAL | NEWLINE | WS | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z )
        int alt4=32;
        switch ( input.LA(1) ) {
        case '+':
            {
            alt4=1;
            }
            break;
        case '-':
            {
            alt4=2;
            }
            break;
        case ',':
            {
            alt4=3;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt4=4;
            }
            break;
        case '\n':
        case '\r':
            {
            alt4=5;
            }
            break;
        case '\t':
        case ' ':
            {
            alt4=6;
            }
            break;
        case 'A':
        case 'a':
            {
            alt4=7;
            }
            break;
        case 'B':
        case 'b':
            {
            alt4=8;
            }
            break;
        case 'C':
        case 'c':
            {
            alt4=9;
            }
            break;
        case 'D':
        case 'd':
            {
            alt4=10;
            }
            break;
        case 'E':
        case 'e':
            {
            alt4=11;
            }
            break;
        case 'F':
        case 'f':
            {
            alt4=12;
            }
            break;
        case 'G':
        case 'g':
            {
            alt4=13;
            }
            break;
        case 'H':
        case 'h':
            {
            alt4=14;
            }
            break;
        case 'I':
        case 'i':
            {
            alt4=15;
            }
            break;
        case 'J':
        case 'j':
            {
            alt4=16;
            }
            break;
        case 'K':
        case 'k':
            {
            alt4=17;
            }
            break;
        case 'L':
        case 'l':
            {
            alt4=18;
            }
            break;
        case 'M':
        case 'm':
            {
            alt4=19;
            }
            break;
        case 'N':
        case 'n':
            {
            alt4=20;
            }
            break;
        case 'O':
        case 'o':
            {
            alt4=21;
            }
            break;
        case 'P':
        case 'p':
            {
            alt4=22;
            }
            break;
        case 'Q':
        case 'q':
            {
            alt4=23;
            }
            break;
        case 'R':
        case 'r':
            {
            alt4=24;
            }
            break;
        case 'S':
        case 's':
            {
            alt4=25;
            }
            break;
        case 'T':
        case 't':
            {
            alt4=26;
            }
            break;
        case 'U':
        case 'u':
            {
            alt4=27;
            }
            break;
        case 'V':
        case 'v':
            {
            alt4=28;
            }
            break;
        case 'W':
        case 'w':
            {
            alt4=29;
            }
            break;
        case 'X':
        case 'x':
            {
            alt4=30;
            }
            break;
        case 'Y':
        case 'y':
            {
            alt4=31;
            }
            break;
        case 'Z':
        case 'z':
            {
            alt4=32;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;
        }

        switch (alt4) {
            case 1 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:21: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 4 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:27: NUMBER_LITERAL
                {
                mNUMBER_LITERAL(); 

                }
                break;
            case 5 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:42: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 6 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:50: WS
                {
                mWS(); 

                }
                break;
            case 7 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:53: A
                {
                mA(); 

                }
                break;
            case 8 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:55: B
                {
                mB(); 

                }
                break;
            case 9 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:57: C
                {
                mC(); 

                }
                break;
            case 10 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:59: D
                {
                mD(); 

                }
                break;
            case 11 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:61: E
                {
                mE(); 

                }
                break;
            case 12 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:63: F
                {
                mF(); 

                }
                break;
            case 13 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:65: G
                {
                mG(); 

                }
                break;
            case 14 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:67: H
                {
                mH(); 

                }
                break;
            case 15 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:69: I
                {
                mI(); 

                }
                break;
            case 16 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:71: J
                {
                mJ(); 

                }
                break;
            case 17 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:73: K
                {
                mK(); 

                }
                break;
            case 18 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:75: L
                {
                mL(); 

                }
                break;
            case 19 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:77: M
                {
                mM(); 

                }
                break;
            case 20 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:79: N
                {
                mN(); 

                }
                break;
            case 21 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:81: O
                {
                mO(); 

                }
                break;
            case 22 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:83: P
                {
                mP(); 

                }
                break;
            case 23 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:85: Q
                {
                mQ(); 

                }
                break;
            case 24 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:87: R
                {
                mR(); 

                }
                break;
            case 25 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:89: S
                {
                mS(); 

                }
                break;
            case 26 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:91: T
                {
                mT(); 

                }
                break;
            case 27 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:93: U
                {
                mU(); 

                }
                break;
            case 28 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:95: V
                {
                mV(); 

                }
                break;
            case 29 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:97: W
                {
                mW(); 

                }
                break;
            case 30 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:99: X
                {
                mX(); 

                }
                break;
            case 31 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:101: Y
                {
                mY(); 

                }
                break;
            case 32 :
                // C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g:1:103: Z
                {
                mZ(); 

                }
                break;

        }

    }


 

}