package de.htwdd.sf.beleg.s83765s83768.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslLexer extends Lexer {
    public static final int RULE_DOPPELPUNKT=4;
    public static final int RULE_VERB_ENDUNG=8;
    public static final int RULE_STRING=14;
    public static final int RULE_VALIDER_ZU_PREFIX=9;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int RULE_WORT_TEIL_OHNE_ZU=10;
    public static final int RULE_Z_UND_NICHT_U=11;
    public static final int EOF=-1;
    public static final int RULE_NOMEN=5;
    public static final int RULE_ID=12;
    public static final int RULE_WS=17;
    public static final int RULE_PREFIX_ZU_VERB_INFINITIV=7;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_VERB_INFINITIV=6;
    public static final int RULE_INT=13;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

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

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "RULE_NOMEN"
    public final void mRULE_NOMEN() throws RecognitionException {
        try {
            int _type = RULE_NOMEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:432:12: ( ( 'A' .. 'Z' | '\\u00C4' | '\\u00D6' | '\\u00DC' ) ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )* )
            // InternalDsl.g:432:14: ( 'A' .. 'Z' | '\\u00C4' | '\\u00D6' | '\\u00DC' ) ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDsl.g:432:52: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )*
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
    // $ANTLR end "RULE_NOMEN"

    // $ANTLR start "RULE_VERB_ENDUNG"
    public final void mRULE_VERB_ENDUNG() throws RecognitionException {
        try {
            // InternalDsl.g:434:27: ( ( 'en' | 'eln' | 'ern' | 'tun' | 'sein' ) )
            // InternalDsl.g:434:29: ( 'en' | 'eln' | 'ern' | 'tun' | 'sein' )
            {
            // InternalDsl.g:434:29: ( 'en' | 'eln' | 'ern' | 'tun' | 'sein' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 'e':
                {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    alt2=1;
                    }
                    break;
                case 'l':
                    {
                    alt2=2;
                    }
                    break;
                case 'r':
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 't':
                {
                alt2=4;
                }
                break;
            case 's':
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDsl.g:434:30: 'en'
                    {
                    match("en"); 


                    }
                    break;
                case 2 :
                    // InternalDsl.g:434:35: 'eln'
                    {
                    match("eln"); 


                    }
                    break;
                case 3 :
                    // InternalDsl.g:434:41: 'ern'
                    {
                    match("ern"); 


                    }
                    break;
                case 4 :
                    // InternalDsl.g:434:47: 'tun'
                    {
                    match("tun"); 


                    }
                    break;
                case 5 :
                    // InternalDsl.g:434:53: 'sein'
                    {
                    match("sein"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERB_ENDUNG"

    // $ANTLR start "RULE_PREFIX_ZU_VERB_INFINITIV"
    public final void mRULE_PREFIX_ZU_VERB_INFINITIV() throws RecognitionException {
        try {
            int _type = RULE_PREFIX_ZU_VERB_INFINITIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:436:31: ( ( RULE_VALIDER_ZU_PREFIX | ( RULE_WORT_TEIL_OHNE_ZU )+ ) 'zu' ( RULE_WORT_TEIL_OHNE_ZU )+ RULE_VERB_ENDUNG ',' )
            // InternalDsl.g:436:33: ( RULE_VALIDER_ZU_PREFIX | ( RULE_WORT_TEIL_OHNE_ZU )+ ) 'zu' ( RULE_WORT_TEIL_OHNE_ZU )+ RULE_VERB_ENDUNG ','
            {
            // InternalDsl.g:436:33: ( RULE_VALIDER_ZU_PREFIX | ( RULE_WORT_TEIL_OHNE_ZU )+ )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='z') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='u') ) {
                    alt4=1;
                }
                else if ( ((LA4_1>='a' && LA4_1<='t')||(LA4_1>='v' && LA4_1<='y')||LA4_1=='\u00E4'||LA4_1=='\u00F6'||LA4_1=='\u00FC') ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>='a' && LA4_0<='y')||LA4_0=='\u00E4'||LA4_0=='\u00F6'||LA4_0=='\u00FC') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:436:34: RULE_VALIDER_ZU_PREFIX
                    {
                    mRULE_VALIDER_ZU_PREFIX(); 

                    }
                    break;
                case 2 :
                    // InternalDsl.g:436:57: ( RULE_WORT_TEIL_OHNE_ZU )+
                    {
                    // InternalDsl.g:436:57: ( RULE_WORT_TEIL_OHNE_ZU )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='z') ) {
                            int LA3_1 = input.LA(2);

                            if ( ((LA3_1>='a' && LA3_1<='t')||(LA3_1>='v' && LA3_1<='y')||LA3_1=='\u00E4'||LA3_1=='\u00F6'||LA3_1=='\u00FC') ) {
                                alt3=1;
                            }


                        }
                        else if ( ((LA3_0>='a' && LA3_0<='y')||LA3_0=='\u00E4'||LA3_0=='\u00F6'||LA3_0=='\u00FC') ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDsl.g:436:57: RULE_WORT_TEIL_OHNE_ZU
                    	    {
                    	    mRULE_WORT_TEIL_OHNE_ZU(); 

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


                    }
                    break;

            }

            match("zu"); 

            // InternalDsl.g:436:87: ( RULE_WORT_TEIL_OHNE_ZU )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:436:87: RULE_WORT_TEIL_OHNE_ZU
            	    {
            	    mRULE_WORT_TEIL_OHNE_ZU(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            mRULE_VERB_ENDUNG(); 
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PREFIX_ZU_VERB_INFINITIV"

    // $ANTLR start "RULE_VALIDER_ZU_PREFIX"
    public final void mRULE_VALIDER_ZU_PREFIX() throws RecognitionException {
        try {
            // InternalDsl.g:438:33: ( ( 'zusammen' | 'zur\\u00FCck' ) )
            // InternalDsl.g:438:35: ( 'zusammen' | 'zur\\u00FCck' )
            {
            // InternalDsl.g:438:35: ( 'zusammen' | 'zur\\u00FCck' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='z') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='u') ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2=='s') ) {
                        alt6=1;
                    }
                    else if ( (LA6_2=='r') ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:438:36: 'zusammen'
                    {
                    match("zusammen"); 


                    }
                    break;
                case 2 :
                    // InternalDsl.g:438:47: 'zur\\u00FCck'
                    {
                    match("zur\u00FCck"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_VALIDER_ZU_PREFIX"

    // $ANTLR start "RULE_Z_UND_NICHT_U"
    public final void mRULE_Z_UND_NICHT_U() throws RecognitionException {
        try {
            // InternalDsl.g:440:29: ( 'z' ( 'a' .. 't' | 'v' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' ) )
            // InternalDsl.g:440:31: 'z' ( 'a' .. 't' | 'v' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' )
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

        }
        finally {
        }
    }
    // $ANTLR end "RULE_Z_UND_NICHT_U"

    // $ANTLR start "RULE_WORT_TEIL_OHNE_ZU"
    public final void mRULE_WORT_TEIL_OHNE_ZU() throws RecognitionException {
        try {
            // InternalDsl.g:442:33: ( ( ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' ) | RULE_Z_UND_NICHT_U ) )
            // InternalDsl.g:442:35: ( ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' ) | RULE_Z_UND_NICHT_U )
            {
            // InternalDsl.g:442:35: ( ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' ) | RULE_Z_UND_NICHT_U )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='a' && LA7_0<='y')||LA7_0=='\u00E4'||LA7_0=='\u00F6'||LA7_0=='\u00FC') ) {
                alt7=1;
            }
            else if ( (LA7_0=='z') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:442:36: ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' )
                    {
                    if ( (input.LA(1)>='a' && input.LA(1)<='y')||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // InternalDsl.g:442:74: RULE_Z_UND_NICHT_U
                    {
                    mRULE_Z_UND_NICHT_U(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORT_TEIL_OHNE_ZU"

    // $ANTLR start "RULE_VERB_INFINITIV"
    public final void mRULE_VERB_INFINITIV() throws RecognitionException {
        try {
            int _type = RULE_VERB_INFINITIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:444:21: ( ( RULE_VALIDER_ZU_PREFIX )? ( RULE_WORT_TEIL_OHNE_ZU )+ RULE_VERB_ENDUNG )
            // InternalDsl.g:444:23: ( RULE_VALIDER_ZU_PREFIX )? ( RULE_WORT_TEIL_OHNE_ZU )+ RULE_VERB_ENDUNG
            {
            // InternalDsl.g:444:23: ( RULE_VALIDER_ZU_PREFIX )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='z') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='u') ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:444:23: RULE_VALIDER_ZU_PREFIX
                    {
                    mRULE_VALIDER_ZU_PREFIX(); 

                    }
                    break;

            }

            // InternalDsl.g:444:47: ( RULE_WORT_TEIL_OHNE_ZU )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:444:47: RULE_WORT_TEIL_OHNE_ZU
            	    {
            	    mRULE_WORT_TEIL_OHNE_ZU(); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            mRULE_VERB_ENDUNG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERB_INFINITIV"

    // $ANTLR start "RULE_DOPPELPUNKT"
    public final void mRULE_DOPPELPUNKT() throws RecognitionException {
        try {
            int _type = RULE_DOPPELPUNKT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:446:18: ( ':' )
            // InternalDsl.g:446:20: ':'
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
            // InternalDsl.g:448:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDsl.g:448:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDsl.g:448:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:448:11: '^'
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

            // InternalDsl.g:448:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    break loop11;
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
            // InternalDsl.g:450:10: ( ( '0' .. '9' )+ )
            // InternalDsl.g:450:12: ( '0' .. '9' )+
            {
            // InternalDsl.g:450:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:450:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalDsl.g:452:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDsl.g:452:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDsl.g:452:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:452:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDsl.g:452:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDsl.g:452:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDsl.g:452:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDsl.g:452:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDsl.g:452:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDsl.g:452:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDsl.g:452:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop14;
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
            // InternalDsl.g:454:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDsl.g:454:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDsl.g:454:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:454:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // InternalDsl.g:456:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDsl.g:456:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDsl.g:456:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:456:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop17;
                }
            } while (true);

            // InternalDsl.g:456:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:456:41: ( '\\r' )? '\\n'
                    {
                    // InternalDsl.g:456:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalDsl.g:456:41: '\\r'
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
            // InternalDsl.g:458:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDsl.g:458:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDsl.g:458:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // InternalDsl.g:460:16: ( . )
            // InternalDsl.g:460:18: .
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
        // InternalDsl.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | RULE_NOMEN | RULE_PREFIX_ZU_VERB_INFINITIV | RULE_VERB_INFINITIV | RULE_DOPPELPUNKT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=16;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalDsl.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalDsl.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalDsl.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalDsl.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalDsl.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalDsl.g:1:40: RULE_NOMEN
                {
                mRULE_NOMEN(); 

                }
                break;
            case 7 :
                // InternalDsl.g:1:51: RULE_PREFIX_ZU_VERB_INFINITIV
                {
                mRULE_PREFIX_ZU_VERB_INFINITIV(); 

                }
                break;
            case 8 :
                // InternalDsl.g:1:81: RULE_VERB_INFINITIV
                {
                mRULE_VERB_INFINITIV(); 

                }
                break;
            case 9 :
                // InternalDsl.g:1:101: RULE_DOPPELPUNKT
                {
                mRULE_DOPPELPUNKT(); 

                }
                break;
            case 10 :
                // InternalDsl.g:1:118: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // InternalDsl.g:1:126: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // InternalDsl.g:1:135: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // InternalDsl.g:1:147: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // InternalDsl.g:1:163: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // InternalDsl.g:1:179: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // InternalDsl.g:1:187: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA5_eotS =
        "\20\uffff";
    static final String DFA5_eofS =
        "\20\uffff";
    static final String DFA5_minS =
        "\4\141\1\uffff\1\54\4\141\1\uffff\3\54\1\141\1\54";
    static final String DFA5_maxS =
        "\4\u00fc\1\uffff\5\u00fc\1\uffff\5\u00fc";
    static final String DFA5_acceptS =
        "\4\uffff\1\1\5\uffff\1\2\5\uffff";
    static final String DFA5_specialS =
        "\20\uffff}>";
    static final String[] DFA5_transitionS = {
            "\4\4\1\1\15\4\1\3\1\2\6\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\13\4\1\6\1\4\1\5\3\4\1\7\10\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\24\4\1\10\5\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\4\4\1\11\25\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "",
            "\1\12\64\uffff\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\13\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\14\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\15\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\10\4\1\16\21\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "",
            "\1\12\64\uffff\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\1\12\64\uffff\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\1\12\64\uffff\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\17\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\1\12\64\uffff\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()+ loopback of 436:87: ( RULE_WORT_TEIL_OHNE_ZU )+";
        }
    }
    static final String DFA9_eotS =
        "\5\uffff\1\12\5\uffff\3\12\1\uffff\1\12";
    static final String DFA9_eofS =
        "\20\uffff";
    static final String DFA9_minS =
        "\4\141\1\uffff\5\141\1\uffff\5\141";
    static final String DFA9_maxS =
        "\4\u00fc\1\uffff\5\u00fc\1\uffff\5\u00fc";
    static final String DFA9_acceptS =
        "\4\uffff\1\1\5\uffff\1\2\5\uffff";
    static final String DFA9_specialS =
        "\20\uffff}>";
    static final String[] DFA9_transitionS = {
            "\4\4\1\1\15\4\1\3\1\2\6\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\13\4\1\6\1\4\1\5\3\4\1\7\10\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\24\4\1\10\5\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\4\4\1\11\25\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "",
            "\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\13\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\14\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\15\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\10\4\1\16\21\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "",
            "\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\17\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()+ loopback of 444:47: ( RULE_WORT_TEIL_OHNE_ZU )+";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\1\26\3\27\1\uffff\1\26\2\27\1\uffff\1\23\1\uffff\1\23\2\uffff\3\23\2\uffff\1\57\1\26\3\uffff\2\27\1\uffff\5\27\1\uffff\2\27\15\uffff\1\27\1\104\4\27\1\111\1\112\2\27\1\uffff\1\104\5\uffff\2\27\1\uffff\3\104\1\27\2\uffff\1\27\1\uffff\3\104\2\uffff\4\27\1\104\1\27\1\uffff\1\104\1\142\6\27\2\uffff\5\27\1\uffff\11\27\1\104\4\27\3\104\1\27\1\104";
    static final String DFA21_eofS =
        "\174\uffff";
    static final String DFA21_minS =
        "\1\0\1\60\3\141\1\uffff\1\60\2\141\1\uffff\1\101\1\uffff\1\141\2\uffff\2\0\1\52\2\uffff\2\60\2\uffff\11\141\1\uffff\1\162\2\141\1\uffff\4\141\6\uffff\2\141\1\60\4\141\2\60\1\141\1\u00fc\1\uffff\10\141\1\uffff\3\60\1\141\2\uffff\1\155\1\143\11\141\1\60\1\155\1\153\2\141\1\54\4\141\1\145\1\141\1\uffff\3\54\1\141\1\156\1\141\1\54\10\141\1\60\4\141\3\60\1\141\1\60";
    static final String DFA21_maxS =
        "\1\uffff\1\172\3\u00fc\1\uffff\1\172\2\u00fc\1\uffff\1\172\1\uffff\1\u00fc\2\uffff\2\uffff\1\57\2\uffff\1\u00fc\1\172\2\uffff\11\u00fc\1\uffff\1\163\2\u00fc\1\uffff\4\u00fc\6\uffff\11\u00fc\1\141\1\u00fc\1\uffff\10\u00fc\1\uffff\4\u00fc\2\uffff\1\155\1\143\12\u00fc\1\155\1\153\7\u00fc\1\145\1\u00fc\1\uffff\4\u00fc\1\156\12\u00fc\1\172\4\u00fc\3\172\1\u00fc\1\172";
    static final String DFA21_acceptS =
        "\5\uffff\1\5\3\uffff\1\11\1\uffff\1\6\1\uffff\1\12\1\13\3\uffff\1\17\1\20\2\uffff\1\6\1\12\11\uffff\1\5\3\uffff\1\11\4\uffff\1\13\1\14\1\15\1\16\1\17\1\1\13\uffff\1\7\10\uffff\1\10\4\uffff\1\3\1\4\27\uffff\1\2\31\uffff";
    static final String DFA21_specialS =
        "\1\2\16\uffff\1\0\1\1\153\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\4\23\1\20\6\23\1\5\1\21\12\16\1\11\6\23\24\6\1\1\5\6\3\23\1\12\1\15\1\23\1\4\7\10\1\3\3\10\1\2\14\10\1\7\111\23\1\13\21\23\1\13\5\23\1\13\7\23\1\14\21\23\1\14\5\23\1\14\uff03\23",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\14\25\1\24\15\25",
            "\4\36\1\32\15\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\30\5\uffff\1\33",
            "\2\36\1\37\1\36\1\32\15\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\36\1\32\6\36\1\40\6\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\25",
            "\24\43\1\42\4\43\152\uffff\1\44\21\uffff\1\44\5\uffff\1\44",
            "\4\36\1\32\15\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\4\33\1\47\15\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "",
            "",
            "\0\53",
            "\0\53",
            "\1\54\4\uffff\1\55",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\25\151\uffff\1\26\21\uffff\1\26\5\uffff\1\26",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\25",
            "",
            "",
            "\2\33\1\60\1\33\1\47\15\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\24\43\1\61\4\43\152\uffff\1\44\21\uffff\1\44\5\uffff\1\44",
            "\4\36\1\32\6\36\1\63\1\36\1\62\3\36\1\64\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\33\1\47\15\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\36\1\32\15\36\1\35\1\34\1\65\4\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\36\1\66\15\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\36\1\32\15\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\36\1\32\2\36\1\67\12\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\36\1\32\15\36\1\70\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "",
            "\1\72\1\71",
            "\4\36\1\32\15\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\33\1\47\15\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "",
            "\24\44\1\73\4\44\152\uffff\1\44\21\uffff\1\44\5\uffff\1\44",
            "\4\33\1\47\6\33\1\75\1\33\1\74\3\33\1\76\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\33\1\47\15\33\1\51\1\50\1\77\4\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\33\1\100\15\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\33\1\47\2\33\1\101\12\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\31\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\36\1\32\15\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\36\1\32\10\36\1\105\4\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\36\1\32\10\36\1\106\4\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\36\1\32\10\36\1\107\4\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\36\1\32\3\36\1\110\2\36\1\63\1\36\1\62\3\36\1\64\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\36\1\32\15\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\36\1\66\15\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\1\113",
            "\1\114",
            "",
            "\4\33\1\47\15\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\33\1\47\10\33\1\115\4\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\33\1\47\10\33\1\116\4\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\33\1\47\10\33\1\117\4\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\33\1\47\3\33\1\120\2\33\1\75\1\33\1\74\3\33\1\76\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\33\1\47\15\33\1\51\1\121\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\102\1\122\15\102\1\124\1\123\5\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\24\125\1\uffff\4\125\152\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\36\1\32\15\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\36\1\32\15\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\36\1\32\15\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\36\1\32\10\36\1\126\4\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "",
            "",
            "\1\127",
            "\1\130",
            "\4\33\1\47\15\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\33\1\47\15\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\33\1\47\15\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\33\1\47\10\33\1\131\4\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\33\1\132\15\33\1\51\1\50\1\77\4\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\102\1\122\6\102\1\134\1\102\1\133\3\102\1\135\1\124\1\123\5\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\102\1\122\15\102\1\124\1\123\1\136\4\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\102\1\137\15\102\1\124\1\123\5\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\102\1\122\15\102\1\124\1\123\5\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\36\1\32\15\36\1\35\1\34\5\36\1\31\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\1\140",
            "\1\141",
            "\4\33\1\47\15\33\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\4\33\1\47\6\33\1\75\1\33\1\74\3\33\1\76\1\51\1\50\5\33\1\46\151\uffff\1\33\21\uffff\1\33\5\uffff\1\33",
            "\1\73\64\uffff\4\102\1\122\15\102\1\124\1\123\5\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\102\1\122\10\102\1\143\4\102\1\124\1\123\5\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\102\1\122\10\102\1\144\4\102\1\124\1\123\5\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\102\1\122\10\102\1\145\4\102\1\124\1\123\5\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\102\1\122\3\102\1\146\2\102\1\134\1\102\1\133\3\102\1\135\1\124\1\123\5\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\1\147",
            "\31\104\1\150\151\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "",
            "\1\73\64\uffff\4\102\1\122\15\102\1\124\1\123\5\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\1\73\64\uffff\4\102\1\122\15\102\1\124\1\123\5\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\1\73\64\uffff\4\102\1\122\15\102\1\124\1\123\5\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\102\1\122\10\102\1\151\4\102\1\124\1\123\5\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\1\152",
            "\24\104\1\73\4\104\152\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "\1\73\64\uffff\4\102\1\122\15\102\1\124\1\123\5\102\1\103\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\31\153\1\154\151\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "\4\153\1\155\15\153\1\157\1\156\5\153\1\160\151\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "\24\161\1\61\4\161\152\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "\4\153\1\155\6\153\1\163\1\153\1\162\3\153\1\164\1\157\1\156\5\153\1\160\151\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "\4\153\1\155\15\153\1\157\1\156\1\165\4\153\1\160\151\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "\4\153\1\166\15\153\1\157\1\156\5\153\1\160\151\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "\24\161\1\uffff\4\161\152\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "\4\153\1\155\15\153\1\157\1\156\5\153\1\160\151\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\153\1\155\15\153\1\157\1\156\5\153\1\160",
            "\4\153\1\155\10\153\1\167\4\153\1\157\1\156\5\153\1\160\151\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "\4\153\1\155\10\153\1\170\4\153\1\157\1\156\5\153\1\160\151\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "\4\153\1\155\10\153\1\171\4\153\1\157\1\156\5\153\1\160\151\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "\4\153\1\155\3\153\1\172\2\153\1\163\1\153\1\162\3\153\1\164\1\157\1\156\5\153\1\160\151\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\153\1\155\15\153\1\157\1\156\5\153\1\160",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\153\1\155\15\153\1\157\1\156\5\153\1\160",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\153\1\155\15\153\1\157\1\156\5\153\1\160",
            "\4\153\1\155\10\153\1\173\4\153\1\157\1\156\5\153\1\160\151\uffff\1\104\21\uffff\1\104\5\uffff\1\104",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\153\1\155\15\153\1\157\1\156\5\153\1\160"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | RULE_NOMEN | RULE_PREFIX_ZU_VERB_INFINITIV | RULE_VERB_INFINITIV | RULE_DOPPELPUNKT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_15 = input.LA(1);

                        s = -1;
                        if ( ((LA21_15>='\u0000' && LA21_15<='\uFFFF')) ) {s = 43;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_16 = input.LA(1);

                        s = -1;
                        if ( ((LA21_16>='\u0000' && LA21_16<='\uFFFF')) ) {s = 43;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='U') ) {s = 1;}

                        else if ( (LA21_0=='m') ) {s = 2;}

                        else if ( (LA21_0=='i') ) {s = 3;}

                        else if ( (LA21_0=='a') ) {s = 4;}

                        else if ( (LA21_0=='.') ) {s = 5;}

                        else if ( ((LA21_0>='A' && LA21_0<='T')||(LA21_0>='V' && LA21_0<='Z')) ) {s = 6;}

                        else if ( (LA21_0=='z') ) {s = 7;}

                        else if ( ((LA21_0>='b' && LA21_0<='h')||(LA21_0>='j' && LA21_0<='l')||(LA21_0>='n' && LA21_0<='y')) ) {s = 8;}

                        else if ( (LA21_0==':') ) {s = 9;}

                        else if ( (LA21_0=='^') ) {s = 10;}

                        else if ( (LA21_0=='\u00C4'||LA21_0=='\u00D6'||LA21_0=='\u00DC') ) {s = 11;}

                        else if ( (LA21_0=='\u00E4'||LA21_0=='\u00F6'||LA21_0=='\u00FC') ) {s = 12;}

                        else if ( (LA21_0=='_') ) {s = 13;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 14;}

                        else if ( (LA21_0=='\"') ) {s = 15;}

                        else if ( (LA21_0=='\'') ) {s = 16;}

                        else if ( (LA21_0=='/') ) {s = 17;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 18;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='!'||(LA21_0>='#' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='-')||(LA21_0>=';' && LA21_0<='@')||(LA21_0>='[' && LA21_0<=']')||LA21_0=='`'||(LA21_0>='{' && LA21_0<='\u00C3')||(LA21_0>='\u00C5' && LA21_0<='\u00D5')||(LA21_0>='\u00D7' && LA21_0<='\u00DB')||(LA21_0>='\u00DD' && LA21_0<='\u00E3')||(LA21_0>='\u00E5' && LA21_0<='\u00F5')||(LA21_0>='\u00F7' && LA21_0<='\u00FB')||(LA21_0>='\u00FD' && LA21_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}