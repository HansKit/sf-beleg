package de.htwdd.sf.beleg.s83765s83768.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslLexer extends Lexer {
    public static final int RULE_DOPPELPUNKT=4;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_NOUN=5;
    public static final int EOF=-1;
    public static final int RULE_ID=8;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_VERB_INFINTIV=6;
    public static final int RULE_PREFIX_ZU_VERB_INFINTIV=7;
    public static final int RULE_INT=9;
    public static final int RULE_ML_COMMENT=11;

    // delegates
    // delegators

    public InternalDslLexer() {;} 
    public InternalDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDsl.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:11:7: ( 'Um' )
            // InternalDsl.g:11:9: 'Um'
            {
            match("Um"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:12:7: ( 'm\\u00F6chte' )
            // InternalDsl.g:12:9: 'm\\u00F6chte'
            {
            match("m\u00F6chte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:13:7: ( 'ich' )
            // InternalDsl.g:13:9: 'ich'
            {
            match("ich"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:14:7: ( 'als' )
            // InternalDsl.g:14:9: 'als'
            {
            match("als"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:15:7: ( '.' )
            // InternalDsl.g:15:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_NOUN"
    public final void mRULE_NOUN() throws RecognitionException {
        try {
            int _type = RULE_NOUN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:829:11: ( ( 'A' .. 'Z' | '\\u00C4' | '\\u00D6' | '\\u00DC' ) ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )* )
            // InternalDsl.g:829:13: ( 'A' .. 'Z' | '\\u00C4' | '\\u00D6' | '\\u00DC' ) ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDsl.g:829:51: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')||LA1_0=='\u00E4'||LA1_0=='\u00F6'||LA1_0=='\u00FC') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:
            	    {
            	    if ( (input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOUN"

    // $ANTLR start "RULE_PREFIX_ZU_VERB_INFINTIV"
    public final void mRULE_PREFIX_ZU_VERB_INFINTIV() throws RecognitionException {
        try {
            int _type = RULE_PREFIX_ZU_VERB_INFINTIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:831:30: ( ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )* 'zu' ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' | 'z' ( 'a' .. 't' | 'v' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' ) )* 'en' ',' )
            // InternalDsl.g:831:32: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )* 'zu' ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' | 'z' ( 'a' .. 't' | 'v' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' ) )* 'en' ','
            {
            // InternalDsl.g:831:32: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:
            	    {
            	    if ( (input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("zu"); 

            // InternalDsl.g:831:76: ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' | 'z' ( 'a' .. 't' | 'v' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' ) )*
            loop3:
            do {
                int alt3=6;
                switch ( input.LA(1) ) {
                case 'e':
                    {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='n') ) {
                        int LA3_7 = input.LA(3);

                        if ( ((LA3_7>='a' && LA3_7<='z')||LA3_7=='\u00E4'||LA3_7=='\u00F6'||LA3_7=='\u00FC') ) {
                            alt3=1;
                        }


                    }
                    else if ( ((LA3_1>='a' && LA3_1<='m')||(LA3_1>='o' && LA3_1<='z')||LA3_1=='\u00E4'||LA3_1=='\u00F6'||LA3_1=='\u00FC') ) {
                        alt3=1;
                    }


                    }
                    break;
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                    {
                    alt3=1;
                    }
                    break;
                case '\u00E4':
                    {
                    alt3=2;
                    }
                    break;
                case '\u00F6':
                    {
                    alt3=3;
                    }
                    break;
                case '\u00FC':
                    {
                    alt3=4;
                    }
                    break;
                case 'z':
                    {
                    alt3=5;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:831:77: 'a' .. 'y'
            	    {
            	    matchRange('a','y'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:831:86: '\\u00E4'
            	    {
            	    match('\u00E4'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalDsl.g:831:95: '\\u00F6'
            	    {
            	    match('\u00F6'); 

            	    }
            	    break;
            	case 4 :
            	    // InternalDsl.g:831:104: '\\u00FC'
            	    {
            	    match('\u00FC'); 

            	    }
            	    break;
            	case 5 :
            	    // InternalDsl.g:831:113: 'z' ( 'a' .. 't' | 'v' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' )
            	    {
            	    match('z'); 
            	    if ( (input.LA(1)>='a' && input.LA(1)<='t')||(input.LA(1)>='v' && input.LA(1)<='y')||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("en"); 

            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PREFIX_ZU_VERB_INFINTIV"

    // $ANTLR start "RULE_VERB_INFINTIV"
    public final void mRULE_VERB_INFINTIV() throws RecognitionException {
        try {
            int _type = RULE_VERB_INFINTIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:833:20: ( ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' | 'z' ( 'a' .. 't' | 'v' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' ) )+ ( 'z' )* 'en' )
            // InternalDsl.g:833:22: ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' | 'z' ( 'a' .. 't' | 'v' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' ) )+ ( 'z' )* 'en'
            {
            // InternalDsl.g:833:22: ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' | 'z' ( 'a' .. 't' | 'v' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=6;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:833:23: 'a' .. 'y'
            	    {
            	    matchRange('a','y'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:833:32: '\\u00E4'
            	    {
            	    match('\u00E4'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalDsl.g:833:41: '\\u00F6'
            	    {
            	    match('\u00F6'); 

            	    }
            	    break;
            	case 4 :
            	    // InternalDsl.g:833:50: '\\u00FC'
            	    {
            	    match('\u00FC'); 

            	    }
            	    break;
            	case 5 :
            	    // InternalDsl.g:833:59: 'z' ( 'a' .. 't' | 'v' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' )
            	    {
            	    match('z'); 
            	    if ( (input.LA(1)>='a' && input.LA(1)<='t')||(input.LA(1)>='v' && input.LA(1)<='y')||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalDsl.g:833:112: ( 'z' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='z') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:833:112: 'z'
            	    {
            	    match('z'); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("en"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERB_INFINTIV"

    // $ANTLR start "RULE_DOPPELPUNKT"
    public final void mRULE_DOPPELPUNKT() throws RecognitionException {
        try {
            int _type = RULE_DOPPELPUNKT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:835:18: ( ':' )
            // InternalDsl.g:835:20: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOPPELPUNKT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:837:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDsl.g:837:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDsl.g:837:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:837:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDsl.g:837:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:839:10: ( ( '0' .. '9' )+ )
            // InternalDsl.g:839:12: ( '0' .. '9' )+
            {
            // InternalDsl.g:839:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:839:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:841:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDsl.g:841:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDsl.g:841:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:841:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDsl.g:841:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDsl.g:841:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDsl.g:841:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDsl.g:841:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDsl.g:841:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDsl.g:841:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDsl.g:841:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:843:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDsl.g:843:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDsl.g:843:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:843:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:845:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDsl.g:845:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDsl.g:845:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:845:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalDsl.g:845:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:845:41: ( '\\r' )? '\\n'
                    {
                    // InternalDsl.g:845:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalDsl.g:845:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:847:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDsl.g:847:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDsl.g:847:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:849:16: ( . )
            // InternalDsl.g:849:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDsl.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | RULE_NOUN | RULE_PREFIX_ZU_VERB_INFINTIV | RULE_VERB_INFINTIV | RULE_DOPPELPUNKT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=16;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalDsl.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalDsl.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalDsl.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalDsl.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalDsl.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalDsl.g:1:40: RULE_NOUN
                {
                mRULE_NOUN(); 

                }
                break;
            case 7 :
                // InternalDsl.g:1:50: RULE_PREFIX_ZU_VERB_INFINTIV
                {
                mRULE_PREFIX_ZU_VERB_INFINTIV(); 

                }
                break;
            case 8 :
                // InternalDsl.g:1:79: RULE_VERB_INFINTIV
                {
                mRULE_VERB_INFINTIV(); 

                }
                break;
            case 9 :
                // InternalDsl.g:1:98: RULE_DOPPELPUNKT
                {
                mRULE_DOPPELPUNKT(); 

                }
                break;
            case 10 :
                // InternalDsl.g:1:115: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // InternalDsl.g:1:123: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // InternalDsl.g:1:132: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // InternalDsl.g:1:144: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // InternalDsl.g:1:160: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // InternalDsl.g:1:176: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // InternalDsl.g:1:184: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA2_eotS =
        "\15\uffff";
    static final String DFA2_eofS =
        "\15\uffff";
    static final String DFA2_minS =
        "\2\141\1\uffff\10\141\1\54\1\uffff";
    static final String DFA2_maxS =
        "\2\u00fc\1\uffff\11\u00fc\1\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\11\uffff\1\2";
    static final String DFA2_specialS =
        "\15\uffff}>";
    static final String[] DFA2_transitionS = {
            "\31\2\1\1\151\uffff\1\2\21\uffff\1\2\5\uffff\1\2",
            "\24\2\1\3\5\2\151\uffff\1\2\21\uffff\1\2\5\uffff\1\2",
            "",
            "\4\11\1\5\24\11\1\4\151\uffff\1\6\21\uffff\1\7\5\uffff\1\10",
            "\24\12\1\2\4\12\1\2\151\uffff\1\12\21\uffff\1\12\5\uffff\1\12",
            "\4\11\1\5\10\11\1\13\13\11\1\4\151\uffff\1\6\21\uffff\1\7\5\uffff\1\10",
            "\4\11\1\5\24\11\1\4\151\uffff\1\6\21\uffff\1\7\5\uffff\1\10",
            "\4\11\1\5\24\11\1\4\151\uffff\1\6\21\uffff\1\7\5\uffff\1\10",
            "\4\11\1\5\24\11\1\4\151\uffff\1\6\21\uffff\1\7\5\uffff\1\10",
            "\4\11\1\5\24\11\1\4\151\uffff\1\6\21\uffff\1\7\5\uffff\1\10",
            "\4\11\1\5\24\11\1\4\151\uffff\1\6\21\uffff\1\7\5\uffff\1\10",
            "\1\14\64\uffff\4\11\1\5\24\11\1\4\151\uffff\1\6\21\uffff\1\7\5\uffff\1\10",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 831:32: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )*";
        }
    }
    static final String DFA4_eotS =
        "\12\uffff\2\11";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\3\141\4\uffff\1\141\2\uffff\2\141";
    static final String DFA4_maxS =
        "\3\u00fc\4\uffff\1\u00fc\2\uffff\2\u00fc";
    static final String DFA4_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\uffff\1\5\1\6\2\uffff";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\4\3\1\2\24\3\1\1\151\uffff\1\4\21\uffff\1\5\5\uffff\1\6",
            "\4\10\1\7\17\10\1\uffff\4\10\1\11\151\uffff\1\10\21\uffff\1\10\5\uffff\1\10",
            "\15\3\1\12\14\3\151\uffff\1\3\21\uffff\1\3\5\uffff\1\3",
            "",
            "",
            "",
            "",
            "\15\10\1\13\14\10\151\uffff\1\10\21\uffff\1\10\5\uffff\1\10",
            "",
            "",
            "\32\3\151\uffff\1\3\21\uffff\1\3\5\uffff\1\3",
            "\32\10\151\uffff\1\10\21\uffff\1\10\5\uffff\1\10"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()+ loopback of 833:22: ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' | 'z' ( 'a' .. 't' | 'v' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' ) )+";
        }
    }
    static final String DFA17_eotS =
        "\1\uffff\1\30\3\31\1\uffff\1\30\2\31\3\25\1\uffff\1\25\3\uffff\3\25\2\uffff\1\61\1\30\3\uffff\3\31\2\uffff\1\31\1\uffff\1\31\1\uffff\2\31\1\uffff\1\31\13\uffff\2\31\1\102\1\103\1\104\2\31\1\uffff\2\31\2\uffff\1\102\1\uffff\1\31\3\uffff\2\31\2\uffff\2\102\1\114\1\uffff";
    static final String DFA17_eofS =
        "\115\uffff";
    static final String DFA17_minS =
        "\1\0\1\60\3\141\1\uffff\1\60\5\141\1\uffff\1\101\3\uffff\2\0\1\52\2\uffff\2\60\2\uffff\11\141\1\uffff\7\141\7\uffff\3\141\3\60\2\141\1\uffff\7\141\3\uffff\1\54\3\141\1\60\2\141\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\172\3\u00fc\1\uffff\1\172\5\u00fc\1\uffff\1\172\3\uffff\2\uffff\1\57\2\uffff\1\u00fc\1\172\2\uffff\11\u00fc\1\uffff\7\u00fc\7\uffff\10\u00fc\1\uffff\7\u00fc\3\uffff\7\u00fc\1\uffff";
    static final String DFA17_acceptS =
        "\5\uffff\1\5\6\uffff\1\11\1\uffff\1\6\1\12\1\13\3\uffff\1\17\1\20\2\uffff\1\6\1\12\11\uffff\1\5\7\uffff\1\11\1\13\1\14\1\15\1\16\1\17\1\1\10\uffff\1\7\7\uffff\1\10\1\3\1\4\7\uffff\1\2";
    static final String DFA17_specialS =
        "\1\0\20\uffff\1\1\1\2\72\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\4\25\1\22\6\25\1\5\1\23\12\20\1\14\6\25\24\6\1\1\5\6\3\25\1\15\1\17\1\25\1\4\7\10\1\3\3\10\1\2\14\10\1\7\111\25\1\16\21\25\1\16\5\25\1\16\7\25\1\11\21\25\1\12\5\25\1\13\uff03\25",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\14\27\1\26\15\27",
            "\4\35\1\34\24\35\1\33\151\uffff\1\36\21\uffff\1\32\5\uffff\1\37",
            "\2\35\1\40\1\35\1\34\24\35\1\33\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\35\1\34\6\35\1\42\15\35\1\33\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\27",
            "\24\45\1\44\4\45\1\47\151\uffff\1\46\21\uffff\1\46\5\uffff\1\46",
            "\4\35\1\34\24\35\1\33\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\52\1\51\24\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\52\1\51\24\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\52\1\51\24\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "",
            "\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\0\55",
            "\0\55",
            "\1\56\4\uffff\1\57",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\27\151\uffff\1\30\21\uffff\1\30\5\uffff\1\30",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\27",
            "",
            "",
            "\2\52\1\62\1\52\1\51\24\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\45\1\63\17\45\1\44\4\45\1\64\151\uffff\1\46\21\uffff\1\46\5\uffff\1\46",
            "\4\35\1\34\10\35\1\65\13\35\1\33\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\35\1\34\24\35\1\33\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\52\1\51\24\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\52\1\51\24\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\35\1\34\2\35\1\66\21\35\1\33\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\52\1\51\24\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\35\1\34\15\35\1\67\6\35\1\33\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "",
            "\4\73\1\70\24\73\1\71\151\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "\4\35\1\34\24\35\1\33\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\52\1\51\24\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\24\74\1\44\4\74\1\47\151\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "\4\46\1\75\17\46\1\72\4\46\1\76\151\uffff\1\46\21\uffff\1\46\5\uffff\1\46",
            "\4\52\1\51\10\52\1\77\13\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\52\1\51\24\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\52\1\51\2\52\1\100\21\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\35\1\34\10\35\1\65\13\35\1\33\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\74\1\101\17\74\1\44\4\74\1\64\151\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\35\1\34\24\35\1\33\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\35\1\34\24\35\1\33\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\35\1\34\24\35\1\33\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\73\1\70\10\73\1\105\13\73\1\71\151\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "\24\106\1\44\4\106\1\47\151\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "",
            "\4\73\1\70\24\73\1\71\151\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "\31\74\1\47\151\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "\4\52\1\51\10\52\1\77\13\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\72\1\107\24\72\1\76\151\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "\4\52\1\51\24\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\4\52\1\51\16\52\1\110\5\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\15\74\1\111\13\74\1\47\151\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "",
            "",
            "",
            "\1\72\64\uffff\4\73\1\70\24\73\1\71\151\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "\4\73\1\70\24\73\1\71\151\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "\15\72\1\112\14\72\151\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "\4\52\1\113\24\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\31\74\1\47\151\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "\32\72\151\uffff\1\72\21\uffff\1\72\5\uffff\1\72",
            "\4\52\1\51\10\52\1\77\13\52\1\50\151\uffff\1\36\21\uffff\1\41\5\uffff\1\37",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | RULE_NOUN | RULE_PREFIX_ZU_VERB_INFINTIV | RULE_VERB_INFINTIV | RULE_DOPPELPUNKT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='U') ) {s = 1;}

                        else if ( (LA17_0=='m') ) {s = 2;}

                        else if ( (LA17_0=='i') ) {s = 3;}

                        else if ( (LA17_0=='a') ) {s = 4;}

                        else if ( (LA17_0=='.') ) {s = 5;}

                        else if ( ((LA17_0>='A' && LA17_0<='T')||(LA17_0>='V' && LA17_0<='Z')) ) {s = 6;}

                        else if ( (LA17_0=='z') ) {s = 7;}

                        else if ( ((LA17_0>='b' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='l')||(LA17_0>='n' && LA17_0<='y')) ) {s = 8;}

                        else if ( (LA17_0=='\u00E4') ) {s = 9;}

                        else if ( (LA17_0=='\u00F6') ) {s = 10;}

                        else if ( (LA17_0=='\u00FC') ) {s = 11;}

                        else if ( (LA17_0==':') ) {s = 12;}

                        else if ( (LA17_0=='^') ) {s = 13;}

                        else if ( (LA17_0=='\u00C4'||LA17_0=='\u00D6'||LA17_0=='\u00DC') ) {s = 14;}

                        else if ( (LA17_0=='_') ) {s = 15;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 16;}

                        else if ( (LA17_0=='\"') ) {s = 17;}

                        else if ( (LA17_0=='\'') ) {s = 18;}

                        else if ( (LA17_0=='/') ) {s = 19;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 20;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='-')||(LA17_0>=';' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\u00C3')||(LA17_0>='\u00C5' && LA17_0<='\u00D5')||(LA17_0>='\u00D7' && LA17_0<='\u00DB')||(LA17_0>='\u00DD' && LA17_0<='\u00E3')||(LA17_0>='\u00E5' && LA17_0<='\u00F5')||(LA17_0>='\u00F7' && LA17_0<='\u00FB')||(LA17_0>='\u00FD' && LA17_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_17 = input.LA(1);

                        s = -1;
                        if ( ((LA17_17>='\u0000' && LA17_17<='\uFFFF')) ) {s = 45;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_18 = input.LA(1);

                        s = -1;
                        if ( ((LA17_18>='\u0000' && LA17_18<='\uFFFF')) ) {s = 45;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}