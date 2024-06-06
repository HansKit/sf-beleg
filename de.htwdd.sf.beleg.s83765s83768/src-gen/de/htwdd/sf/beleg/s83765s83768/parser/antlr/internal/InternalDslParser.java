package de.htwdd.sf.beleg.s83765s83768.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.htwdd.sf.beleg.s83765s83768.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
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

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_stories_0_0= ruleStory ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_stories_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( (lv_stories_0_0= ruleStory ) )* )
            // InternalDsl.g:78:2: ( (lv_stories_0_0= ruleStory ) )*
            {
            // InternalDsl.g:78:2: ( (lv_stories_0_0= ruleStory ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NOUN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:79:3: (lv_stories_0_0= ruleStory )
            	    {
            	    // InternalDsl.g:79:3: (lv_stories_0_0= ruleStory )
            	    // InternalDsl.g:80:4: lv_stories_0_0= ruleStory
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStoriesStoryParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_stories_0_0=ruleStory();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"stories",
            	    					lv_stories_0_0,
            	    					"de.htwdd.sf.beleg.s83765s83768.Dsl.Story");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStory"
    // InternalDsl.g:100:1: entryRuleStory returns [EObject current=null] : iv_ruleStory= ruleStory EOF ;
    public final EObject entryRuleStory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStory = null;


        try {
            // InternalDsl.g:100:46: (iv_ruleStory= ruleStory EOF )
            // InternalDsl.g:101:2: iv_ruleStory= ruleStory EOF
            {
             newCompositeNode(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStory=ruleStory();

            state._fsp--;

             current =iv_ruleStory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // InternalDsl.g:107:1: ruleStory returns [EObject current=null] : ( ( (lv_title_0_0= ruleTitle ) ) ( (lv_dp_1_0= RULE_DOPPELPUNKT ) ) otherlv_2= 'Um' ( (lv_benefit_3_0= ruleBenefit ) ) otherlv_4= 'm\\u00F6chte' otherlv_5= 'ich' otherlv_6= 'als' ( (lv_role_7_0= ruleRole ) ) ( (lv_action_8_0= ruleAction ) ) otherlv_9= '.' ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        Token lv_dp_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_title_0_0 = null;

        EObject lv_benefit_3_0 = null;

        EObject lv_role_7_0 = null;

        EObject lv_action_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:113:2: ( ( ( (lv_title_0_0= ruleTitle ) ) ( (lv_dp_1_0= RULE_DOPPELPUNKT ) ) otherlv_2= 'Um' ( (lv_benefit_3_0= ruleBenefit ) ) otherlv_4= 'm\\u00F6chte' otherlv_5= 'ich' otherlv_6= 'als' ( (lv_role_7_0= ruleRole ) ) ( (lv_action_8_0= ruleAction ) ) otherlv_9= '.' ) )
            // InternalDsl.g:114:2: ( ( (lv_title_0_0= ruleTitle ) ) ( (lv_dp_1_0= RULE_DOPPELPUNKT ) ) otherlv_2= 'Um' ( (lv_benefit_3_0= ruleBenefit ) ) otherlv_4= 'm\\u00F6chte' otherlv_5= 'ich' otherlv_6= 'als' ( (lv_role_7_0= ruleRole ) ) ( (lv_action_8_0= ruleAction ) ) otherlv_9= '.' )
            {
            // InternalDsl.g:114:2: ( ( (lv_title_0_0= ruleTitle ) ) ( (lv_dp_1_0= RULE_DOPPELPUNKT ) ) otherlv_2= 'Um' ( (lv_benefit_3_0= ruleBenefit ) ) otherlv_4= 'm\\u00F6chte' otherlv_5= 'ich' otherlv_6= 'als' ( (lv_role_7_0= ruleRole ) ) ( (lv_action_8_0= ruleAction ) ) otherlv_9= '.' )
            // InternalDsl.g:115:3: ( (lv_title_0_0= ruleTitle ) ) ( (lv_dp_1_0= RULE_DOPPELPUNKT ) ) otherlv_2= 'Um' ( (lv_benefit_3_0= ruleBenefit ) ) otherlv_4= 'm\\u00F6chte' otherlv_5= 'ich' otherlv_6= 'als' ( (lv_role_7_0= ruleRole ) ) ( (lv_action_8_0= ruleAction ) ) otherlv_9= '.'
            {
            // InternalDsl.g:115:3: ( (lv_title_0_0= ruleTitle ) )
            // InternalDsl.g:116:4: (lv_title_0_0= ruleTitle )
            {
            // InternalDsl.g:116:4: (lv_title_0_0= ruleTitle )
            // InternalDsl.g:117:5: lv_title_0_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getStoryAccess().getTitleTitleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_title_0_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoryRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_0_0,
            						"de.htwdd.sf.beleg.s83765s83768.Dsl.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:134:3: ( (lv_dp_1_0= RULE_DOPPELPUNKT ) )
            // InternalDsl.g:135:4: (lv_dp_1_0= RULE_DOPPELPUNKT )
            {
            // InternalDsl.g:135:4: (lv_dp_1_0= RULE_DOPPELPUNKT )
            // InternalDsl.g:136:5: lv_dp_1_0= RULE_DOPPELPUNKT
            {
            lv_dp_1_0=(Token)match(input,RULE_DOPPELPUNKT,FOLLOW_5); 

            					newLeafNode(lv_dp_1_0, grammarAccess.getStoryAccess().getDpDOPPELPUNKTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dp",
            						lv_dp_1_0,
            						"de.htwdd.sf.beleg.s83765s83768.Dsl.DOPPELPUNKT");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStoryAccess().getUmKeyword_2());
            		
            // InternalDsl.g:156:3: ( (lv_benefit_3_0= ruleBenefit ) )
            // InternalDsl.g:157:4: (lv_benefit_3_0= ruleBenefit )
            {
            // InternalDsl.g:157:4: (lv_benefit_3_0= ruleBenefit )
            // InternalDsl.g:158:5: lv_benefit_3_0= ruleBenefit
            {

            					newCompositeNode(grammarAccess.getStoryAccess().getBenefitBenefitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_benefit_3_0=ruleBenefit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoryRule());
            					}
            					set(
            						current,
            						"benefit",
            						lv_benefit_3_0,
            						"de.htwdd.sf.beleg.s83765s83768.Dsl.Benefit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getStoryAccess().getMöchteKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getStoryAccess().getIchKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getStoryAccess().getAlsKeyword_6());
            		
            // InternalDsl.g:187:3: ( (lv_role_7_0= ruleRole ) )
            // InternalDsl.g:188:4: (lv_role_7_0= ruleRole )
            {
            // InternalDsl.g:188:4: (lv_role_7_0= ruleRole )
            // InternalDsl.g:189:5: lv_role_7_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getStoryAccess().getRoleRoleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_6);
            lv_role_7_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoryRule());
            					}
            					set(
            						current,
            						"role",
            						lv_role_7_0,
            						"de.htwdd.sf.beleg.s83765s83768.Dsl.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:206:3: ( (lv_action_8_0= ruleAction ) )
            // InternalDsl.g:207:4: (lv_action_8_0= ruleAction )
            {
            // InternalDsl.g:207:4: (lv_action_8_0= ruleAction )
            // InternalDsl.g:208:5: lv_action_8_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStoryAccess().getActionActionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_action_8_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoryRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_8_0,
            						"de.htwdd.sf.beleg.s83765s83768.Dsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getStoryAccess().getFullStopKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleTitle"
    // InternalDsl.g:233:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalDsl.g:233:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalDsl.g:234:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalDsl.g:240:1: ruleTitle returns [EObject current=null] : ( ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_verb_1_0= RULE_VERB_INFINTIV ) ) ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token lv_noun_0_0=null;
        Token lv_verb_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:246:2: ( ( ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_verb_1_0= RULE_VERB_INFINTIV ) ) ) )
            // InternalDsl.g:247:2: ( ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_verb_1_0= RULE_VERB_INFINTIV ) ) )
            {
            // InternalDsl.g:247:2: ( ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_verb_1_0= RULE_VERB_INFINTIV ) ) )
            // InternalDsl.g:248:3: ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_verb_1_0= RULE_VERB_INFINTIV ) )
            {
            // InternalDsl.g:248:3: ( (lv_noun_0_0= RULE_NOUN ) )
            // InternalDsl.g:249:4: (lv_noun_0_0= RULE_NOUN )
            {
            // InternalDsl.g:249:4: (lv_noun_0_0= RULE_NOUN )
            // InternalDsl.g:250:5: lv_noun_0_0= RULE_NOUN
            {
            lv_noun_0_0=(Token)match(input,RULE_NOUN,FOLLOW_11); 

            					newLeafNode(lv_noun_0_0, grammarAccess.getTitleAccess().getNounNOUNTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"noun",
            						lv_noun_0_0,
            						"de.htwdd.sf.beleg.s83765s83768.Dsl.NOUN");
            				

            }


            }

            // InternalDsl.g:266:3: ( (lv_verb_1_0= RULE_VERB_INFINTIV ) )
            // InternalDsl.g:267:4: (lv_verb_1_0= RULE_VERB_INFINTIV )
            {
            // InternalDsl.g:267:4: (lv_verb_1_0= RULE_VERB_INFINTIV )
            // InternalDsl.g:268:5: lv_verb_1_0= RULE_VERB_INFINTIV
            {
            lv_verb_1_0=(Token)match(input,RULE_VERB_INFINTIV,FOLLOW_2); 

            					newLeafNode(lv_verb_1_0, grammarAccess.getTitleAccess().getVerbVERB_INFINTIVTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"verb",
            						lv_verb_1_0,
            						"de.htwdd.sf.beleg.s83765s83768.Dsl.VERB_INFINTIV");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleBenefit"
    // InternalDsl.g:288:1: entryRuleBenefit returns [EObject current=null] : iv_ruleBenefit= ruleBenefit EOF ;
    public final EObject entryRuleBenefit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBenefit = null;


        try {
            // InternalDsl.g:288:48: (iv_ruleBenefit= ruleBenefit EOF )
            // InternalDsl.g:289:2: iv_ruleBenefit= ruleBenefit EOF
            {
             newCompositeNode(grammarAccess.getBenefitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBenefit=ruleBenefit();

            state._fsp--;

             current =iv_ruleBenefit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBenefit"


    // $ANTLR start "ruleBenefit"
    // InternalDsl.g:295:1: ruleBenefit returns [EObject current=null] : ( ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_pzvi_1_0= RULE_PREFIX_ZU_VERB_INFINTIV ) ) ) ;
    public final EObject ruleBenefit() throws RecognitionException {
        EObject current = null;

        Token lv_noun_0_0=null;
        Token lv_pzvi_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:301:2: ( ( ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_pzvi_1_0= RULE_PREFIX_ZU_VERB_INFINTIV ) ) ) )
            // InternalDsl.g:302:2: ( ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_pzvi_1_0= RULE_PREFIX_ZU_VERB_INFINTIV ) ) )
            {
            // InternalDsl.g:302:2: ( ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_pzvi_1_0= RULE_PREFIX_ZU_VERB_INFINTIV ) ) )
            // InternalDsl.g:303:3: ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_pzvi_1_0= RULE_PREFIX_ZU_VERB_INFINTIV ) )
            {
            // InternalDsl.g:303:3: ( (lv_noun_0_0= RULE_NOUN ) )
            // InternalDsl.g:304:4: (lv_noun_0_0= RULE_NOUN )
            {
            // InternalDsl.g:304:4: (lv_noun_0_0= RULE_NOUN )
            // InternalDsl.g:305:5: lv_noun_0_0= RULE_NOUN
            {
            lv_noun_0_0=(Token)match(input,RULE_NOUN,FOLLOW_12); 

            					newLeafNode(lv_noun_0_0, grammarAccess.getBenefitAccess().getNounNOUNTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBenefitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"noun",
            						lv_noun_0_0,
            						"de.htwdd.sf.beleg.s83765s83768.Dsl.NOUN");
            				

            }


            }

            // InternalDsl.g:321:3: ( (lv_pzvi_1_0= RULE_PREFIX_ZU_VERB_INFINTIV ) )
            // InternalDsl.g:322:4: (lv_pzvi_1_0= RULE_PREFIX_ZU_VERB_INFINTIV )
            {
            // InternalDsl.g:322:4: (lv_pzvi_1_0= RULE_PREFIX_ZU_VERB_INFINTIV )
            // InternalDsl.g:323:5: lv_pzvi_1_0= RULE_PREFIX_ZU_VERB_INFINTIV
            {
            lv_pzvi_1_0=(Token)match(input,RULE_PREFIX_ZU_VERB_INFINTIV,FOLLOW_2); 

            					newLeafNode(lv_pzvi_1_0, grammarAccess.getBenefitAccess().getPzviPREFIX_ZU_VERB_INFINTIVTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBenefitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pzvi",
            						lv_pzvi_1_0,
            						"de.htwdd.sf.beleg.s83765s83768.Dsl.PREFIX_ZU_VERB_INFINTIV");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBenefit"


    // $ANTLR start "entryRuleRole"
    // InternalDsl.g:343:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalDsl.g:343:45: (iv_ruleRole= ruleRole EOF )
            // InternalDsl.g:344:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalDsl.g:350:1: ruleRole returns [EObject current=null] : ( (lv_noun_0_0= RULE_NOUN ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_noun_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:356:2: ( ( (lv_noun_0_0= RULE_NOUN ) ) )
            // InternalDsl.g:357:2: ( (lv_noun_0_0= RULE_NOUN ) )
            {
            // InternalDsl.g:357:2: ( (lv_noun_0_0= RULE_NOUN ) )
            // InternalDsl.g:358:3: (lv_noun_0_0= RULE_NOUN )
            {
            // InternalDsl.g:358:3: (lv_noun_0_0= RULE_NOUN )
            // InternalDsl.g:359:4: lv_noun_0_0= RULE_NOUN
            {
            lv_noun_0_0=(Token)match(input,RULE_NOUN,FOLLOW_2); 

            				newLeafNode(lv_noun_0_0, grammarAccess.getRoleAccess().getNounNOUNTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRoleRule());
            				}
            				setWithLastConsumed(
            					current,
            					"noun",
            					lv_noun_0_0,
            					"de.htwdd.sf.beleg.s83765s83768.Dsl.NOUN");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleAction"
    // InternalDsl.g:378:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalDsl.g:378:47: (iv_ruleAction= ruleAction EOF )
            // InternalDsl.g:379:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalDsl.g:385:1: ruleAction returns [EObject current=null] : ( ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_vi_1_0= RULE_VERB_INFINTIV ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_noun_0_0=null;
        Token lv_vi_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:391:2: ( ( ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_vi_1_0= RULE_VERB_INFINTIV ) ) ) )
            // InternalDsl.g:392:2: ( ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_vi_1_0= RULE_VERB_INFINTIV ) ) )
            {
            // InternalDsl.g:392:2: ( ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_vi_1_0= RULE_VERB_INFINTIV ) ) )
            // InternalDsl.g:393:3: ( (lv_noun_0_0= RULE_NOUN ) ) ( (lv_vi_1_0= RULE_VERB_INFINTIV ) )
            {
            // InternalDsl.g:393:3: ( (lv_noun_0_0= RULE_NOUN ) )
            // InternalDsl.g:394:4: (lv_noun_0_0= RULE_NOUN )
            {
            // InternalDsl.g:394:4: (lv_noun_0_0= RULE_NOUN )
            // InternalDsl.g:395:5: lv_noun_0_0= RULE_NOUN
            {
            lv_noun_0_0=(Token)match(input,RULE_NOUN,FOLLOW_11); 

            					newLeafNode(lv_noun_0_0, grammarAccess.getActionAccess().getNounNOUNTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"noun",
            						lv_noun_0_0,
            						"de.htwdd.sf.beleg.s83765s83768.Dsl.NOUN");
            				

            }


            }

            // InternalDsl.g:411:3: ( (lv_vi_1_0= RULE_VERB_INFINTIV ) )
            // InternalDsl.g:412:4: (lv_vi_1_0= RULE_VERB_INFINTIV )
            {
            // InternalDsl.g:412:4: (lv_vi_1_0= RULE_VERB_INFINTIV )
            // InternalDsl.g:413:5: lv_vi_1_0= RULE_VERB_INFINTIV
            {
            lv_vi_1_0=(Token)match(input,RULE_VERB_INFINTIV,FOLLOW_2); 

            					newLeafNode(lv_vi_1_0, grammarAccess.getActionAccess().getViVERB_INFINTIVTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"vi",
            						lv_vi_1_0,
            						"de.htwdd.sf.beleg.s83765s83768.Dsl.VERB_INFINTIV");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"

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