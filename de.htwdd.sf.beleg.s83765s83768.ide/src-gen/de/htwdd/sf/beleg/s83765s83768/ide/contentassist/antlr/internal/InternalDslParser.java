package de.htwdd.sf.beleg.s83765s83768.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.htwdd.sf.beleg.s83765s83768.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOPPELPUNKT", "RULE_NOUN", "RULE_VERB_INFINTIV", "RULE_PREFIX_ZU_VERB_INFINTIV", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Um'", "'m\\u00F6chte'", "'ich'", "'als'", "'.'"
    };
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


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


    	private DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleModel EOF )
            // InternalDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:62:1: ruleModel : ( ( rule__Model__StoriesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Model__StoriesAssignment )* ) )
            // InternalDsl.g:67:2: ( ( rule__Model__StoriesAssignment )* )
            {
            // InternalDsl.g:67:2: ( ( rule__Model__StoriesAssignment )* )
            // InternalDsl.g:68:3: ( rule__Model__StoriesAssignment )*
            {
             before(grammarAccess.getModelAccess().getStoriesAssignment()); 
            // InternalDsl.g:69:3: ( rule__Model__StoriesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NOUN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:69:4: rule__Model__StoriesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StoriesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStoriesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStory"
    // InternalDsl.g:78:1: entryRuleStory : ruleStory EOF ;
    public final void entryRuleStory() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleStory EOF )
            // InternalDsl.g:80:1: ruleStory EOF
            {
             before(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_1);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getStoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // InternalDsl.g:87:1: ruleStory : ( ( rule__Story__Group__0 ) ) ;
    public final void ruleStory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Story__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__Story__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Story__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__Story__Group__0 )
            {
             before(grammarAccess.getStoryAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__Story__Group__0 )
            // InternalDsl.g:94:4: rule__Story__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Story__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleTitle"
    // InternalDsl.g:103:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleTitle EOF )
            // InternalDsl.g:105:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalDsl.g:112:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Title__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Title__Group__0 )
            // InternalDsl.g:119:4: rule__Title__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleBenefit"
    // InternalDsl.g:128:1: entryRuleBenefit : ruleBenefit EOF ;
    public final void entryRuleBenefit() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleBenefit EOF )
            // InternalDsl.g:130:1: ruleBenefit EOF
            {
             before(grammarAccess.getBenefitRule()); 
            pushFollow(FOLLOW_1);
            ruleBenefit();

            state._fsp--;

             after(grammarAccess.getBenefitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBenefit"


    // $ANTLR start "ruleBenefit"
    // InternalDsl.g:137:1: ruleBenefit : ( ( rule__Benefit__Group__0 ) ) ;
    public final void ruleBenefit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Benefit__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Benefit__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Benefit__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Benefit__Group__0 )
            {
             before(grammarAccess.getBenefitAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Benefit__Group__0 )
            // InternalDsl.g:144:4: rule__Benefit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Benefit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBenefitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBenefit"


    // $ANTLR start "entryRuleRole"
    // InternalDsl.g:153:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleRole EOF )
            // InternalDsl.g:155:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalDsl.g:162:1: ruleRole : ( ( rule__Role__NounAssignment ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Role__NounAssignment ) ) )
            // InternalDsl.g:167:2: ( ( rule__Role__NounAssignment ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Role__NounAssignment ) )
            // InternalDsl.g:168:3: ( rule__Role__NounAssignment )
            {
             before(grammarAccess.getRoleAccess().getNounAssignment()); 
            // InternalDsl.g:169:3: ( rule__Role__NounAssignment )
            // InternalDsl.g:169:4: rule__Role__NounAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Role__NounAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNounAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleAction"
    // InternalDsl.g:178:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleAction EOF )
            // InternalDsl.g:180:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalDsl.g:187:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Action__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Action__Group__0 )
            // InternalDsl.g:194:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "rule__Story__Group__0"
    // InternalDsl.g:202:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:206:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // InternalDsl.g:207:2: rule__Story__Group__0__Impl rule__Story__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Story__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__0"


    // $ANTLR start "rule__Story__Group__0__Impl"
    // InternalDsl.g:214:1: rule__Story__Group__0__Impl : ( ( rule__Story__TitleAssignment_0 ) ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:218:1: ( ( ( rule__Story__TitleAssignment_0 ) ) )
            // InternalDsl.g:219:1: ( ( rule__Story__TitleAssignment_0 ) )
            {
            // InternalDsl.g:219:1: ( ( rule__Story__TitleAssignment_0 ) )
            // InternalDsl.g:220:2: ( rule__Story__TitleAssignment_0 )
            {
             before(grammarAccess.getStoryAccess().getTitleAssignment_0()); 
            // InternalDsl.g:221:2: ( rule__Story__TitleAssignment_0 )
            // InternalDsl.g:221:3: rule__Story__TitleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Story__TitleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getTitleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__0__Impl"


    // $ANTLR start "rule__Story__Group__1"
    // InternalDsl.g:229:1: rule__Story__Group__1 : rule__Story__Group__1__Impl rule__Story__Group__2 ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:233:1: ( rule__Story__Group__1__Impl rule__Story__Group__2 )
            // InternalDsl.g:234:2: rule__Story__Group__1__Impl rule__Story__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Story__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__1"


    // $ANTLR start "rule__Story__Group__1__Impl"
    // InternalDsl.g:241:1: rule__Story__Group__1__Impl : ( ( rule__Story__DpAssignment_1 ) ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:245:1: ( ( ( rule__Story__DpAssignment_1 ) ) )
            // InternalDsl.g:246:1: ( ( rule__Story__DpAssignment_1 ) )
            {
            // InternalDsl.g:246:1: ( ( rule__Story__DpAssignment_1 ) )
            // InternalDsl.g:247:2: ( rule__Story__DpAssignment_1 )
            {
             before(grammarAccess.getStoryAccess().getDpAssignment_1()); 
            // InternalDsl.g:248:2: ( rule__Story__DpAssignment_1 )
            // InternalDsl.g:248:3: rule__Story__DpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Story__DpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getDpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__1__Impl"


    // $ANTLR start "rule__Story__Group__2"
    // InternalDsl.g:256:1: rule__Story__Group__2 : rule__Story__Group__2__Impl rule__Story__Group__3 ;
    public final void rule__Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:260:1: ( rule__Story__Group__2__Impl rule__Story__Group__3 )
            // InternalDsl.g:261:2: rule__Story__Group__2__Impl rule__Story__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Story__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__2"


    // $ANTLR start "rule__Story__Group__2__Impl"
    // InternalDsl.g:268:1: rule__Story__Group__2__Impl : ( 'Um' ) ;
    public final void rule__Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:272:1: ( ( 'Um' ) )
            // InternalDsl.g:273:1: ( 'Um' )
            {
            // InternalDsl.g:273:1: ( 'Um' )
            // InternalDsl.g:274:2: 'Um'
            {
             before(grammarAccess.getStoryAccess().getUmKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getUmKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__2__Impl"


    // $ANTLR start "rule__Story__Group__3"
    // InternalDsl.g:283:1: rule__Story__Group__3 : rule__Story__Group__3__Impl rule__Story__Group__4 ;
    public final void rule__Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:287:1: ( rule__Story__Group__3__Impl rule__Story__Group__4 )
            // InternalDsl.g:288:2: rule__Story__Group__3__Impl rule__Story__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Story__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__3"


    // $ANTLR start "rule__Story__Group__3__Impl"
    // InternalDsl.g:295:1: rule__Story__Group__3__Impl : ( ( rule__Story__BenefitAssignment_3 ) ) ;
    public final void rule__Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:299:1: ( ( ( rule__Story__BenefitAssignment_3 ) ) )
            // InternalDsl.g:300:1: ( ( rule__Story__BenefitAssignment_3 ) )
            {
            // InternalDsl.g:300:1: ( ( rule__Story__BenefitAssignment_3 ) )
            // InternalDsl.g:301:2: ( rule__Story__BenefitAssignment_3 )
            {
             before(grammarAccess.getStoryAccess().getBenefitAssignment_3()); 
            // InternalDsl.g:302:2: ( rule__Story__BenefitAssignment_3 )
            // InternalDsl.g:302:3: rule__Story__BenefitAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Story__BenefitAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getBenefitAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__3__Impl"


    // $ANTLR start "rule__Story__Group__4"
    // InternalDsl.g:310:1: rule__Story__Group__4 : rule__Story__Group__4__Impl rule__Story__Group__5 ;
    public final void rule__Story__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:314:1: ( rule__Story__Group__4__Impl rule__Story__Group__5 )
            // InternalDsl.g:315:2: rule__Story__Group__4__Impl rule__Story__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Story__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__4"


    // $ANTLR start "rule__Story__Group__4__Impl"
    // InternalDsl.g:322:1: rule__Story__Group__4__Impl : ( 'm\\u00F6chte' ) ;
    public final void rule__Story__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:326:1: ( ( 'm\\u00F6chte' ) )
            // InternalDsl.g:327:1: ( 'm\\u00F6chte' )
            {
            // InternalDsl.g:327:1: ( 'm\\u00F6chte' )
            // InternalDsl.g:328:2: 'm\\u00F6chte'
            {
             before(grammarAccess.getStoryAccess().getMöchteKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getMöchteKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__4__Impl"


    // $ANTLR start "rule__Story__Group__5"
    // InternalDsl.g:337:1: rule__Story__Group__5 : rule__Story__Group__5__Impl rule__Story__Group__6 ;
    public final void rule__Story__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:1: ( rule__Story__Group__5__Impl rule__Story__Group__6 )
            // InternalDsl.g:342:2: rule__Story__Group__5__Impl rule__Story__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Story__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__5"


    // $ANTLR start "rule__Story__Group__5__Impl"
    // InternalDsl.g:349:1: rule__Story__Group__5__Impl : ( 'ich' ) ;
    public final void rule__Story__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:353:1: ( ( 'ich' ) )
            // InternalDsl.g:354:1: ( 'ich' )
            {
            // InternalDsl.g:354:1: ( 'ich' )
            // InternalDsl.g:355:2: 'ich'
            {
             before(grammarAccess.getStoryAccess().getIchKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getIchKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__5__Impl"


    // $ANTLR start "rule__Story__Group__6"
    // InternalDsl.g:364:1: rule__Story__Group__6 : rule__Story__Group__6__Impl rule__Story__Group__7 ;
    public final void rule__Story__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:368:1: ( rule__Story__Group__6__Impl rule__Story__Group__7 )
            // InternalDsl.g:369:2: rule__Story__Group__6__Impl rule__Story__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Story__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__6"


    // $ANTLR start "rule__Story__Group__6__Impl"
    // InternalDsl.g:376:1: rule__Story__Group__6__Impl : ( 'als' ) ;
    public final void rule__Story__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:380:1: ( ( 'als' ) )
            // InternalDsl.g:381:1: ( 'als' )
            {
            // InternalDsl.g:381:1: ( 'als' )
            // InternalDsl.g:382:2: 'als'
            {
             before(grammarAccess.getStoryAccess().getAlsKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getAlsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__6__Impl"


    // $ANTLR start "rule__Story__Group__7"
    // InternalDsl.g:391:1: rule__Story__Group__7 : rule__Story__Group__7__Impl rule__Story__Group__8 ;
    public final void rule__Story__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:395:1: ( rule__Story__Group__7__Impl rule__Story__Group__8 )
            // InternalDsl.g:396:2: rule__Story__Group__7__Impl rule__Story__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Story__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__7"


    // $ANTLR start "rule__Story__Group__7__Impl"
    // InternalDsl.g:403:1: rule__Story__Group__7__Impl : ( ( rule__Story__RoleAssignment_7 ) ) ;
    public final void rule__Story__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:407:1: ( ( ( rule__Story__RoleAssignment_7 ) ) )
            // InternalDsl.g:408:1: ( ( rule__Story__RoleAssignment_7 ) )
            {
            // InternalDsl.g:408:1: ( ( rule__Story__RoleAssignment_7 ) )
            // InternalDsl.g:409:2: ( rule__Story__RoleAssignment_7 )
            {
             before(grammarAccess.getStoryAccess().getRoleAssignment_7()); 
            // InternalDsl.g:410:2: ( rule__Story__RoleAssignment_7 )
            // InternalDsl.g:410:3: rule__Story__RoleAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Story__RoleAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getRoleAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__7__Impl"


    // $ANTLR start "rule__Story__Group__8"
    // InternalDsl.g:418:1: rule__Story__Group__8 : rule__Story__Group__8__Impl rule__Story__Group__9 ;
    public final void rule__Story__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:422:1: ( rule__Story__Group__8__Impl rule__Story__Group__9 )
            // InternalDsl.g:423:2: rule__Story__Group__8__Impl rule__Story__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Story__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__8"


    // $ANTLR start "rule__Story__Group__8__Impl"
    // InternalDsl.g:430:1: rule__Story__Group__8__Impl : ( ( rule__Story__ActionAssignment_8 ) ) ;
    public final void rule__Story__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:434:1: ( ( ( rule__Story__ActionAssignment_8 ) ) )
            // InternalDsl.g:435:1: ( ( rule__Story__ActionAssignment_8 ) )
            {
            // InternalDsl.g:435:1: ( ( rule__Story__ActionAssignment_8 ) )
            // InternalDsl.g:436:2: ( rule__Story__ActionAssignment_8 )
            {
             before(grammarAccess.getStoryAccess().getActionAssignment_8()); 
            // InternalDsl.g:437:2: ( rule__Story__ActionAssignment_8 )
            // InternalDsl.g:437:3: rule__Story__ActionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Story__ActionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getActionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__8__Impl"


    // $ANTLR start "rule__Story__Group__9"
    // InternalDsl.g:445:1: rule__Story__Group__9 : rule__Story__Group__9__Impl ;
    public final void rule__Story__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:449:1: ( rule__Story__Group__9__Impl )
            // InternalDsl.g:450:2: rule__Story__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Story__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__9"


    // $ANTLR start "rule__Story__Group__9__Impl"
    // InternalDsl.g:456:1: rule__Story__Group__9__Impl : ( '.' ) ;
    public final void rule__Story__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:460:1: ( ( '.' ) )
            // InternalDsl.g:461:1: ( '.' )
            {
            // InternalDsl.g:461:1: ( '.' )
            // InternalDsl.g:462:2: '.'
            {
             before(grammarAccess.getStoryAccess().getFullStopKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getFullStopKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__9__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // InternalDsl.g:472:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:476:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalDsl.g:477:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // InternalDsl.g:484:1: rule__Title__Group__0__Impl : ( ( rule__Title__NounAssignment_0 ) ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:488:1: ( ( ( rule__Title__NounAssignment_0 ) ) )
            // InternalDsl.g:489:1: ( ( rule__Title__NounAssignment_0 ) )
            {
            // InternalDsl.g:489:1: ( ( rule__Title__NounAssignment_0 ) )
            // InternalDsl.g:490:2: ( rule__Title__NounAssignment_0 )
            {
             before(grammarAccess.getTitleAccess().getNounAssignment_0()); 
            // InternalDsl.g:491:2: ( rule__Title__NounAssignment_0 )
            // InternalDsl.g:491:3: rule__Title__NounAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Title__NounAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getNounAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // InternalDsl.g:499:1: rule__Title__Group__1 : rule__Title__Group__1__Impl ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:503:1: ( rule__Title__Group__1__Impl )
            // InternalDsl.g:504:2: rule__Title__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // InternalDsl.g:510:1: rule__Title__Group__1__Impl : ( ( rule__Title__VerbAssignment_1 ) ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:514:1: ( ( ( rule__Title__VerbAssignment_1 ) ) )
            // InternalDsl.g:515:1: ( ( rule__Title__VerbAssignment_1 ) )
            {
            // InternalDsl.g:515:1: ( ( rule__Title__VerbAssignment_1 ) )
            // InternalDsl.g:516:2: ( rule__Title__VerbAssignment_1 )
            {
             before(grammarAccess.getTitleAccess().getVerbAssignment_1()); 
            // InternalDsl.g:517:2: ( rule__Title__VerbAssignment_1 )
            // InternalDsl.g:517:3: rule__Title__VerbAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Title__VerbAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getVerbAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Benefit__Group__0"
    // InternalDsl.g:526:1: rule__Benefit__Group__0 : rule__Benefit__Group__0__Impl rule__Benefit__Group__1 ;
    public final void rule__Benefit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:530:1: ( rule__Benefit__Group__0__Impl rule__Benefit__Group__1 )
            // InternalDsl.g:531:2: rule__Benefit__Group__0__Impl rule__Benefit__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Benefit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Benefit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Benefit__Group__0"


    // $ANTLR start "rule__Benefit__Group__0__Impl"
    // InternalDsl.g:538:1: rule__Benefit__Group__0__Impl : ( ( rule__Benefit__NounAssignment_0 ) ) ;
    public final void rule__Benefit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:542:1: ( ( ( rule__Benefit__NounAssignment_0 ) ) )
            // InternalDsl.g:543:1: ( ( rule__Benefit__NounAssignment_0 ) )
            {
            // InternalDsl.g:543:1: ( ( rule__Benefit__NounAssignment_0 ) )
            // InternalDsl.g:544:2: ( rule__Benefit__NounAssignment_0 )
            {
             before(grammarAccess.getBenefitAccess().getNounAssignment_0()); 
            // InternalDsl.g:545:2: ( rule__Benefit__NounAssignment_0 )
            // InternalDsl.g:545:3: rule__Benefit__NounAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Benefit__NounAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBenefitAccess().getNounAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Benefit__Group__0__Impl"


    // $ANTLR start "rule__Benefit__Group__1"
    // InternalDsl.g:553:1: rule__Benefit__Group__1 : rule__Benefit__Group__1__Impl ;
    public final void rule__Benefit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:557:1: ( rule__Benefit__Group__1__Impl )
            // InternalDsl.g:558:2: rule__Benefit__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Benefit__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Benefit__Group__1"


    // $ANTLR start "rule__Benefit__Group__1__Impl"
    // InternalDsl.g:564:1: rule__Benefit__Group__1__Impl : ( ( rule__Benefit__PzviAssignment_1 ) ) ;
    public final void rule__Benefit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:568:1: ( ( ( rule__Benefit__PzviAssignment_1 ) ) )
            // InternalDsl.g:569:1: ( ( rule__Benefit__PzviAssignment_1 ) )
            {
            // InternalDsl.g:569:1: ( ( rule__Benefit__PzviAssignment_1 ) )
            // InternalDsl.g:570:2: ( rule__Benefit__PzviAssignment_1 )
            {
             before(grammarAccess.getBenefitAccess().getPzviAssignment_1()); 
            // InternalDsl.g:571:2: ( rule__Benefit__PzviAssignment_1 )
            // InternalDsl.g:571:3: rule__Benefit__PzviAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Benefit__PzviAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBenefitAccess().getPzviAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Benefit__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalDsl.g:580:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:584:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalDsl.g:585:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalDsl.g:592:1: rule__Action__Group__0__Impl : ( ( rule__Action__NounAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:596:1: ( ( ( rule__Action__NounAssignment_0 ) ) )
            // InternalDsl.g:597:1: ( ( rule__Action__NounAssignment_0 ) )
            {
            // InternalDsl.g:597:1: ( ( rule__Action__NounAssignment_0 ) )
            // InternalDsl.g:598:2: ( rule__Action__NounAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getNounAssignment_0()); 
            // InternalDsl.g:599:2: ( rule__Action__NounAssignment_0 )
            // InternalDsl.g:599:3: rule__Action__NounAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__NounAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNounAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalDsl.g:607:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:611:1: ( rule__Action__Group__1__Impl )
            // InternalDsl.g:612:2: rule__Action__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalDsl.g:618:1: rule__Action__Group__1__Impl : ( ( rule__Action__ViAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:622:1: ( ( ( rule__Action__ViAssignment_1 ) ) )
            // InternalDsl.g:623:1: ( ( rule__Action__ViAssignment_1 ) )
            {
            // InternalDsl.g:623:1: ( ( rule__Action__ViAssignment_1 ) )
            // InternalDsl.g:624:2: ( rule__Action__ViAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getViAssignment_1()); 
            // InternalDsl.g:625:2: ( rule__Action__ViAssignment_1 )
            // InternalDsl.g:625:3: rule__Action__ViAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ViAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getViAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Model__StoriesAssignment"
    // InternalDsl.g:634:1: rule__Model__StoriesAssignment : ( ruleStory ) ;
    public final void rule__Model__StoriesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:638:1: ( ( ruleStory ) )
            // InternalDsl.g:639:2: ( ruleStory )
            {
            // InternalDsl.g:639:2: ( ruleStory )
            // InternalDsl.g:640:3: ruleStory
            {
             before(grammarAccess.getModelAccess().getStoriesStoryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStoriesStoryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StoriesAssignment"


    // $ANTLR start "rule__Story__TitleAssignment_0"
    // InternalDsl.g:649:1: rule__Story__TitleAssignment_0 : ( ruleTitle ) ;
    public final void rule__Story__TitleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:653:1: ( ( ruleTitle ) )
            // InternalDsl.g:654:2: ( ruleTitle )
            {
            // InternalDsl.g:654:2: ( ruleTitle )
            // InternalDsl.g:655:3: ruleTitle
            {
             before(grammarAccess.getStoryAccess().getTitleTitleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getStoryAccess().getTitleTitleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__TitleAssignment_0"


    // $ANTLR start "rule__Story__DpAssignment_1"
    // InternalDsl.g:664:1: rule__Story__DpAssignment_1 : ( RULE_DOPPELPUNKT ) ;
    public final void rule__Story__DpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:668:1: ( ( RULE_DOPPELPUNKT ) )
            // InternalDsl.g:669:2: ( RULE_DOPPELPUNKT )
            {
            // InternalDsl.g:669:2: ( RULE_DOPPELPUNKT )
            // InternalDsl.g:670:3: RULE_DOPPELPUNKT
            {
             before(grammarAccess.getStoryAccess().getDpDOPPELPUNKTTerminalRuleCall_1_0()); 
            match(input,RULE_DOPPELPUNKT,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getDpDOPPELPUNKTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__DpAssignment_1"


    // $ANTLR start "rule__Story__BenefitAssignment_3"
    // InternalDsl.g:679:1: rule__Story__BenefitAssignment_3 : ( ruleBenefit ) ;
    public final void rule__Story__BenefitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:683:1: ( ( ruleBenefit ) )
            // InternalDsl.g:684:2: ( ruleBenefit )
            {
            // InternalDsl.g:684:2: ( ruleBenefit )
            // InternalDsl.g:685:3: ruleBenefit
            {
             before(grammarAccess.getStoryAccess().getBenefitBenefitParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBenefit();

            state._fsp--;

             after(grammarAccess.getStoryAccess().getBenefitBenefitParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__BenefitAssignment_3"


    // $ANTLR start "rule__Story__RoleAssignment_7"
    // InternalDsl.g:694:1: rule__Story__RoleAssignment_7 : ( ruleRole ) ;
    public final void rule__Story__RoleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:698:1: ( ( ruleRole ) )
            // InternalDsl.g:699:2: ( ruleRole )
            {
            // InternalDsl.g:699:2: ( ruleRole )
            // InternalDsl.g:700:3: ruleRole
            {
             before(grammarAccess.getStoryAccess().getRoleRoleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getStoryAccess().getRoleRoleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__RoleAssignment_7"


    // $ANTLR start "rule__Story__ActionAssignment_8"
    // InternalDsl.g:709:1: rule__Story__ActionAssignment_8 : ( ruleAction ) ;
    public final void rule__Story__ActionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:713:1: ( ( ruleAction ) )
            // InternalDsl.g:714:2: ( ruleAction )
            {
            // InternalDsl.g:714:2: ( ruleAction )
            // InternalDsl.g:715:3: ruleAction
            {
             before(grammarAccess.getStoryAccess().getActionActionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStoryAccess().getActionActionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__ActionAssignment_8"


    // $ANTLR start "rule__Title__NounAssignment_0"
    // InternalDsl.g:724:1: rule__Title__NounAssignment_0 : ( RULE_NOUN ) ;
    public final void rule__Title__NounAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:728:1: ( ( RULE_NOUN ) )
            // InternalDsl.g:729:2: ( RULE_NOUN )
            {
            // InternalDsl.g:729:2: ( RULE_NOUN )
            // InternalDsl.g:730:3: RULE_NOUN
            {
             before(grammarAccess.getTitleAccess().getNounNOUNTerminalRuleCall_0_0()); 
            match(input,RULE_NOUN,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getNounNOUNTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__NounAssignment_0"


    // $ANTLR start "rule__Title__VerbAssignment_1"
    // InternalDsl.g:739:1: rule__Title__VerbAssignment_1 : ( RULE_VERB_INFINTIV ) ;
    public final void rule__Title__VerbAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:743:1: ( ( RULE_VERB_INFINTIV ) )
            // InternalDsl.g:744:2: ( RULE_VERB_INFINTIV )
            {
            // InternalDsl.g:744:2: ( RULE_VERB_INFINTIV )
            // InternalDsl.g:745:3: RULE_VERB_INFINTIV
            {
             before(grammarAccess.getTitleAccess().getVerbVERB_INFINTIVTerminalRuleCall_1_0()); 
            match(input,RULE_VERB_INFINTIV,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getVerbVERB_INFINTIVTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__VerbAssignment_1"


    // $ANTLR start "rule__Benefit__NounAssignment_0"
    // InternalDsl.g:754:1: rule__Benefit__NounAssignment_0 : ( RULE_NOUN ) ;
    public final void rule__Benefit__NounAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:758:1: ( ( RULE_NOUN ) )
            // InternalDsl.g:759:2: ( RULE_NOUN )
            {
            // InternalDsl.g:759:2: ( RULE_NOUN )
            // InternalDsl.g:760:3: RULE_NOUN
            {
             before(grammarAccess.getBenefitAccess().getNounNOUNTerminalRuleCall_0_0()); 
            match(input,RULE_NOUN,FOLLOW_2); 
             after(grammarAccess.getBenefitAccess().getNounNOUNTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Benefit__NounAssignment_0"


    // $ANTLR start "rule__Benefit__PzviAssignment_1"
    // InternalDsl.g:769:1: rule__Benefit__PzviAssignment_1 : ( RULE_PREFIX_ZU_VERB_INFINTIV ) ;
    public final void rule__Benefit__PzviAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:773:1: ( ( RULE_PREFIX_ZU_VERB_INFINTIV ) )
            // InternalDsl.g:774:2: ( RULE_PREFIX_ZU_VERB_INFINTIV )
            {
            // InternalDsl.g:774:2: ( RULE_PREFIX_ZU_VERB_INFINTIV )
            // InternalDsl.g:775:3: RULE_PREFIX_ZU_VERB_INFINTIV
            {
             before(grammarAccess.getBenefitAccess().getPzviPREFIX_ZU_VERB_INFINTIVTerminalRuleCall_1_0()); 
            match(input,RULE_PREFIX_ZU_VERB_INFINTIV,FOLLOW_2); 
             after(grammarAccess.getBenefitAccess().getPzviPREFIX_ZU_VERB_INFINTIVTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Benefit__PzviAssignment_1"


    // $ANTLR start "rule__Role__NounAssignment"
    // InternalDsl.g:784:1: rule__Role__NounAssignment : ( RULE_NOUN ) ;
    public final void rule__Role__NounAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:788:1: ( ( RULE_NOUN ) )
            // InternalDsl.g:789:2: ( RULE_NOUN )
            {
            // InternalDsl.g:789:2: ( RULE_NOUN )
            // InternalDsl.g:790:3: RULE_NOUN
            {
             before(grammarAccess.getRoleAccess().getNounNOUNTerminalRuleCall_0()); 
            match(input,RULE_NOUN,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getNounNOUNTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NounAssignment"


    // $ANTLR start "rule__Action__NounAssignment_0"
    // InternalDsl.g:799:1: rule__Action__NounAssignment_0 : ( RULE_NOUN ) ;
    public final void rule__Action__NounAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:803:1: ( ( RULE_NOUN ) )
            // InternalDsl.g:804:2: ( RULE_NOUN )
            {
            // InternalDsl.g:804:2: ( RULE_NOUN )
            // InternalDsl.g:805:3: RULE_NOUN
            {
             before(grammarAccess.getActionAccess().getNounNOUNTerminalRuleCall_0_0()); 
            match(input,RULE_NOUN,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getNounNOUNTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NounAssignment_0"


    // $ANTLR start "rule__Action__ViAssignment_1"
    // InternalDsl.g:814:1: rule__Action__ViAssignment_1 : ( RULE_VERB_INFINTIV ) ;
    public final void rule__Action__ViAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:818:1: ( ( RULE_VERB_INFINTIV ) )
            // InternalDsl.g:819:2: ( RULE_VERB_INFINTIV )
            {
            // InternalDsl.g:819:2: ( RULE_VERB_INFINTIV )
            // InternalDsl.g:820:3: RULE_VERB_INFINTIV
            {
             before(grammarAccess.getActionAccess().getViVERB_INFINTIVTerminalRuleCall_1_0()); 
            match(input,RULE_VERB_INFINTIV,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getViVERB_INFINTIVTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ViAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});

}