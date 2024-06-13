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
            // InternalDsl.g:434:27: ( ( 'en' | 'eln' | 'ern' | 'un' | 'in' ) )
            // InternalDsl.g:434:29: ( 'en' | 'eln' | 'ern' | 'un' | 'in' )
            {
            // InternalDsl.g:434:29: ( 'en' | 'eln' | 'ern' | 'un' | 'in' )
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
            case 'u':
                {
                alt2=4;
                }
                break;
            case 'i':
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
                    // InternalDsl.g:434:47: 'un'
                    {
                    match("un"); 


                    }
                    break;
                case 5 :
                    // InternalDsl.g:434:52: 'in'
                    {
                    match("in"); 


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
            // InternalDsl.g:444:21: ( ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )+ RULE_VERB_ENDUNG )
            // InternalDsl.g:444:23: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )+ RULE_VERB_ENDUNG
            {
            // InternalDsl.g:444:23: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
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
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    break loop10;
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
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:450:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:452:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDsl.g:452:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
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
                    	    break loop12;
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
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
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
                    	    break loop13;
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
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:454:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
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
            	    break loop16;
                }
            } while (true);

            // InternalDsl.g:456:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:456:41: ( '\\r' )? '\\n'
                    {
                    // InternalDsl.g:456:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
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
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
        int alt20=16;
        alt20 = dfa20.predict(input);
        switch (alt20) {
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
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA5_eotS =
        "\15\uffff";
    static final String DFA5_eofS =
        "\15\uffff";
    static final String DFA5_minS =
        "\4\141\1\uffff\1\54\2\141\2\54\1\uffff\2\54";
    static final String DFA5_maxS =
        "\4\u00fc\1\uffff\5\u00fc\1\uffff\2\u00fc";
    static final String DFA5_acceptS =
        "\4\uffff\1\1\5\uffff\1\2\2\uffff";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\4\4\1\1\3\4\1\3\13\4\1\2\5\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\13\4\1\6\1\4\1\5\3\4\1\7\10\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\10\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\11\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "",
            "\1\12\64\uffff\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\13\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\14\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\1\12\64\uffff\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\1\12\64\uffff\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "",
            "\1\12\64\uffff\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
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
    static final String DFA8_eotS =
        "\5\uffff\1\12\2\uffff\2\12\1\uffff\2\12";
    static final String DFA8_eofS =
        "\15\uffff";
    static final String DFA8_minS =
        "\4\141\1\uffff\5\141\1\uffff\2\141";
    static final String DFA8_maxS =
        "\4\u00fc\1\uffff\5\u00fc\1\uffff\2\u00fc";
    static final String DFA8_acceptS =
        "\4\uffff\1\1\5\uffff\1\2\2\uffff";
    static final String DFA8_specialS =
        "\15\uffff}>";
    static final String[] DFA8_transitionS = {
            "\4\4\1\1\3\4\1\3\13\4\1\2\5\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\13\4\1\6\1\4\1\5\3\4\1\7\10\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\10\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\11\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "",
            "\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\13\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\15\4\1\14\14\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "",
            "\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4",
            "\32\4\151\uffff\1\4\21\uffff\1\4\5\uffff\1\4"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()+ loopback of 444:23: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )+";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\1\25\3\27\1\uffff\1\25\2\27\1\uffff\1\23\1\uffff\1\23\2\uffff\3\23\2\uffff\1\62\1\uffff\1\25\2\uffff\5\27\1\uffff\2\27\1\uffff\5\27\15\uffff\1\27\1\102\2\27\2\102\1\125\1\126\2\27\1\102\3\27\4\uffff\1\102\2\uffff\2\102\1\uffff\1\102\2\27\1\uffff\3\27\2\102\2\uffff\1\27\1\uffff\1\102\2\27\2\102\4\uffff\2\102\1\uffff\3\27\1\102\3\27\1\uffff\2\27\3\uffff\1\102\1\27\1\uffff\3\102\4\uffff\1\102\1\u008e\1\102\2\27\5\102\2\uffff\2\102\1\27\1\uffff\2\102\2\uffff\4\102\1\27\1\uffff\1\102\1\27";
    static final String DFA20_eofS =
        "\u0098\uffff";
    static final String DFA20_minS =
        "\1\0\1\60\3\141\1\uffff\1\60\2\141\1\uffff\1\101\1\uffff\1\141\2\uffff\2\0\1\52\2\uffff\1\60\1\uffff\1\60\1\uffff\11\141\1\uffff\6\141\1\uffff\4\141\6\uffff\2\141\1\60\2\141\4\60\2\141\1\60\3\141\1\uffff\11\141\1\60\6\141\2\60\2\uffff\2\141\1\60\2\141\1\60\13\141\1\60\11\141\1\60\2\141\2\60\7\141\1\54\2\141\2\54\2\60\1\54\2\141\2\54\4\141\2\uffff\4\54\2\141\1\60\1\141";
    static final String DFA20_maxS =
        "\1\uffff\1\172\3\u00fc\1\uffff\1\172\2\u00fc\1\uffff\1\172\1\uffff\1\u00fc\2\uffff\2\uffff\1\57\2\uffff\1\u00fc\1\uffff\1\172\1\uffff\11\u00fc\1\uffff\6\u00fc\1\uffff\4\u00fc\6\uffff\13\u00fc\1\172\3\u00fc\1\uffff\22\u00fc\2\uffff\2\u00fc\1\172\2\u00fc\1\172\30\u00fc\2\172\27\u00fc\2\uffff\6\u00fc\1\172\1\u00fc";
    static final String DFA20_acceptS =
        "\5\uffff\1\5\3\uffff\1\11\1\uffff\1\6\1\uffff\1\12\1\13\3\uffff\1\17\1\20\1\uffff\1\6\1\uffff\1\12\11\uffff\1\5\6\uffff\1\11\4\uffff\1\13\1\14\1\15\1\16\1\17\1\1\17\uffff\1\10\22\uffff\1\3\1\4\67\uffff\1\2\1\7\10\uffff";
    static final String DFA20_specialS =
        "\1\2\16\uffff\1\1\1\0\u0087\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\4\23\1\20\6\23\1\5\1\21\12\16\1\11\6\23\24\6\1\1\5\6\3\23\1\12\1\15\1\23\1\4\7\10\1\3\3\10\1\2\14\10\1\7\111\23\1\13\21\23\1\13\5\23\1\13\7\23\1\14\21\23\1\14\5\23\1\14\uff03\23",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\14\26\1\24\15\26",
            "\4\35\1\32\3\35\1\34\13\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\30\5\uffff\1\36",
            "\2\35\1\37\1\35\1\32\3\35\1\34\13\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\35\1\32\3\35\1\34\2\35\1\40\10\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\26",
            "\4\45\1\43\3\45\1\44\13\45\1\42\4\45\1\46\151\uffff\1\47\21\uffff\1\47\5\uffff\1\47",
            "\4\35\1\32\3\35\1\34\13\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\4\36\1\52\3\36\1\54\13\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "",
            "",
            "\0\56",
            "\0\56",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\26\151\uffff\1\25\21\uffff\1\25\5\uffff\1\25",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\26",
            "",
            "\2\36\1\63\1\36\1\52\3\36\1\54\13\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\45\1\43\3\45\1\44\13\45\1\64\4\45\1\46\151\uffff\1\47\21\uffff\1\47\5\uffff\1\47",
            "\4\35\1\32\3\35\1\34\2\35\1\66\1\35\1\65\3\35\1\67\2\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\35\1\32\3\35\1\34\4\35\1\70\6\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\35\1\32\3\35\1\34\4\35\1\71\6\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\35\1\32\3\35\1\34\13\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\36\1\52\3\36\1\54\13\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\35\1\32\2\35\1\72\1\34\13\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\35\1\32\3\35\1\34\11\35\1\73\1\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "",
            "\4\46\1\77\3\46\1\101\4\46\1\76\3\46\1\75\1\74\1\46\1\100\5\46\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\4\35\1\32\3\35\1\34\2\35\1\66\1\35\1\65\3\35\1\67\2\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\35\1\32\3\35\1\34\4\35\1\71\6\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\35\1\32\3\35\1\34\13\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\46\1\77\3\46\1\101\13\46\1\100\5\46\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\4\36\1\52\3\36\1\54\13\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "",
            "\4\47\1\104\3\47\1\105\13\47\1\103\4\47\1\102\151\uffff\1\47\21\uffff\1\47\5\uffff\1\47",
            "\4\36\1\52\3\36\1\54\2\36\1\107\1\36\1\106\3\36\1\110\2\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\36\1\52\3\36\1\54\4\36\1\111\6\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\36\1\52\3\36\1\54\4\36\1\112\6\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\36\1\52\2\36\1\113\1\54\13\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\122\1\115\3\122\1\121\4\122\1\114\6\122\1\120\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\35\1\32\3\35\1\34\13\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\35\1\32\3\35\1\34\4\35\1\123\6\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\35\1\32\3\35\1\34\4\35\1\124\6\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\35\1\32\3\35\1\34\13\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\35\1\32\3\35\1\34\13\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\35\1\32\3\35\1\34\13\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\35\1\32\3\35\1\34\13\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\1\127\3\46\1\77\3\46\1\101\13\46\1\100\5\46\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\4\46\1\77\3\46\1\101\13\46\1\100\5\46\151\uffff\1\102\21\uffff\1\102\5\uffff\1\130",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\46\1\77\3\46\1\101\13\46\1\100\5\46",
            "\4\46\1\77\3\46\1\101\2\46\1\132\1\46\1\131\3\46\1\133\2\46\1\100\5\46\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\4\46\1\77\3\46\1\101\4\46\1\76\6\46\1\100\5\46\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\4\46\1\77\3\46\1\101\4\46\1\134\6\46\1\100\5\46\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "",
            "\4\117\1\136\3\117\1\141\4\117\1\135\6\117\1\140\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\36\1\52\3\36\1\54\2\36\1\107\1\36\1\106\3\36\1\110\2\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\36\1\52\3\36\1\54\4\36\1\112\6\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\36\1\52\3\36\1\54\13\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\36\1\52\3\36\1\54\4\36\1\142\6\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\36\1\52\3\36\1\54\4\36\1\143\6\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\36\1\52\3\36\1\54\13\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\36\1\52\3\36\1\54\13\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\36\1\52\3\36\1\54\12\36\1\144\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\122\1\145\3\122\1\147\13\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\122\1\145\3\122\1\147\2\122\1\151\1\122\1\150\3\122\1\152\2\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\156\1\153\3\156\1\155\13\156\1\100\4\156\1\46\151\uffff\1\154\21\uffff\1\154\5\uffff\1\154",
            "\4\117\1\157\3\117\1\161\13\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\122\1\145\3\122\1\147\4\122\1\114\6\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\122\1\145\3\122\1\147\4\122\1\162\6\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\122\1\145\3\122\1\147\13\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\35\1\32\3\35\1\34\13\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\35\1\32\3\35\1\34\13\35\1\33\4\35\1\31\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "",
            "",
            "\4\46\1\77\3\46\1\101\3\46\1\163\7\46\1\100\5\46\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\2\102\1\164\27\102\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\46\1\77\3\46\1\101\13\46\1\100\5\46",
            "\4\46\1\77\3\46\1\101\4\46\1\165\6\46\1\100\5\46\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\4\46\1\77\3\46\1\101\4\46\1\166\6\46\1\100\5\46\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\46\1\77\3\46\1\101\13\46\1\100\5\46",
            "\4\117\1\157\3\117\1\161\13\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\117\1\157\3\117\1\161\2\117\1\170\1\117\1\167\3\117\1\171\2\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\154\1\172\3\154\1\173\13\154\1\102\4\154\1\102\151\uffff\1\154\21\uffff\1\154\5\uffff\1\154",
            "\4\117\1\157\3\117\1\161\4\117\1\135\6\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\117\1\157\3\117\1\161\4\117\1\174\6\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\36\1\52\3\36\1\54\13\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\36\1\52\3\36\1\54\13\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\36\1\175\3\36\1\54\13\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\4\122\1\145\3\122\1\147\2\122\1\177\1\122\1\176\3\122\1\u0080\2\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\122\1\145\3\122\1\147\4\122\1\u0081\6\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\122\1\145\3\122\1\147\4\122\1\u0082\6\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\122\1\145\3\122\1\147\13\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\122\1\145\3\122\1\147\4\122\1\u0083\6\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\122\1\145\3\122\1\147\4\122\1\u0084\6\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\122\1\145\3\122\1\147\2\122\1\151\1\122\1\150\3\122\1\152\2\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\117\1\157\3\117\1\161\13\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\122\1\145\3\122\1\147\4\122\1\162\6\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\122\1\145\3\122\1\147\13\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\117\1\157\3\117\1\161\2\117\1\u0086\1\117\1\u0085\3\117\1\u0087\2\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\117\1\157\3\117\1\161\4\117\1\u0088\6\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\117\1\157\3\117\1\161\4\117\1\u0089\6\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\122\1\145\3\122\1\147\13\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\46\1\77\3\46\1\101\3\46\1\u008a\7\46\1\100\5\46\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\12\102\1\u008b\17\102\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\46\1\77\3\46\1\101\13\46\1\100\5\46",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\46\1\77\3\46\1\101\13\46\1\100\5\46",
            "\4\117\1\157\3\117\1\161\13\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\117\1\157\3\117\1\161\4\117\1\u008c\6\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\117\1\157\3\117\1\161\4\117\1\u008d\6\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\117\1\157\3\117\1\161\2\117\1\170\1\117\1\167\3\117\1\171\2\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\117\1\157\3\117\1\161\4\117\1\174\6\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\117\1\157\3\117\1\161\13\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\36\1\52\3\36\1\54\2\36\1\107\1\36\1\106\3\36\1\110\2\36\1\53\4\36\1\51\151\uffff\1\36\21\uffff\1\36\5\uffff\1\36",
            "\1\u008f\3\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\122\1\145\3\122\1\147\13\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\122\1\145\3\122\1\147\4\122\1\u0090\6\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\122\1\145\3\122\1\147\4\122\1\u0091\6\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\1\u008f\3\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\122\1\145\3\122\1\147\13\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\1\u008f\3\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\122\1\145\3\122\1\147\13\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\122\1\145\3\122\1\147\13\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\122\1\145\3\122\1\147\13\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\1\u008f\64\uffff\4\117\1\157\3\117\1\161\13\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\117\1\157\3\117\1\161\4\117\1\u0092\6\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\117\1\157\3\117\1\161\4\117\1\u0093\6\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\1\u008f\64\uffff\4\117\1\157\3\117\1\161\13\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\1\u008f\64\uffff\4\117\1\157\3\117\1\161\13\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\46\1\u0094\3\46\1\101\13\46\1\100\5\46\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\31\102\1\u0095\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\4\117\1\157\3\117\1\161\13\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\117\1\157\3\117\1\161\13\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "",
            "",
            "\1\u008f\3\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\122\1\145\3\122\1\147\13\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\1\u008f\3\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\122\1\145\3\122\1\147\13\122\1\146\4\122\1\116\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\1\u008f\64\uffff\4\117\1\157\3\117\1\161\13\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\1\u008f\64\uffff\4\117\1\157\3\117\1\161\13\117\1\160\4\117\1\137\151\uffff\1\117\21\uffff\1\117\5\uffff\1\117",
            "\4\46\1\77\3\46\1\101\2\46\1\132\1\46\1\u0096\3\46\1\133\2\46\1\100\5\46\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\24\102\1\103\5\102\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\46\1\77\3\46\1\101\13\46\1\100\4\46\1\u0097",
            "\4\46\1\77\3\46\1\101\13\46\1\64\5\46\151\uffff\1\102\21\uffff\1\102\5\uffff\1\102"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | RULE_NOMEN | RULE_PREFIX_ZU_VERB_INFINITIV | RULE_VERB_INFINITIV | RULE_DOPPELPUNKT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_16 = input.LA(1);

                        s = -1;
                        if ( ((LA20_16>='\u0000' && LA20_16<='\uFFFF')) ) {s = 46;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_15 = input.LA(1);

                        s = -1;
                        if ( ((LA20_15>='\u0000' && LA20_15<='\uFFFF')) ) {s = 46;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='U') ) {s = 1;}

                        else if ( (LA20_0=='m') ) {s = 2;}

                        else if ( (LA20_0=='i') ) {s = 3;}

                        else if ( (LA20_0=='a') ) {s = 4;}

                        else if ( (LA20_0=='.') ) {s = 5;}

                        else if ( ((LA20_0>='A' && LA20_0<='T')||(LA20_0>='V' && LA20_0<='Z')) ) {s = 6;}

                        else if ( (LA20_0=='z') ) {s = 7;}

                        else if ( ((LA20_0>='b' && LA20_0<='h')||(LA20_0>='j' && LA20_0<='l')||(LA20_0>='n' && LA20_0<='y')) ) {s = 8;}

                        else if ( (LA20_0==':') ) {s = 9;}

                        else if ( (LA20_0=='^') ) {s = 10;}

                        else if ( (LA20_0=='\u00C4'||LA20_0=='\u00D6'||LA20_0=='\u00DC') ) {s = 11;}

                        else if ( (LA20_0=='\u00E4'||LA20_0=='\u00F6'||LA20_0=='\u00FC') ) {s = 12;}

                        else if ( (LA20_0=='_') ) {s = 13;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 14;}

                        else if ( (LA20_0=='\"') ) {s = 15;}

                        else if ( (LA20_0=='\'') ) {s = 16;}

                        else if ( (LA20_0=='/') ) {s = 17;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 18;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='#' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='-')||(LA20_0>=';' && LA20_0<='@')||(LA20_0>='[' && LA20_0<=']')||LA20_0=='`'||(LA20_0>='{' && LA20_0<='\u00C3')||(LA20_0>='\u00C5' && LA20_0<='\u00D5')||(LA20_0>='\u00D7' && LA20_0<='\u00DB')||(LA20_0>='\u00DD' && LA20_0<='\u00E3')||(LA20_0>='\u00E5' && LA20_0<='\u00F5')||(LA20_0>='\u00F7' && LA20_0<='\u00FB')||(LA20_0>='\u00FD' && LA20_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}