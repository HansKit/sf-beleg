/*
 * generated by Xtext 2.35.0
 */
grammar InternalDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package de.htwdd.sf.beleg.s83765s83768.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getStoriesAssignment()); }
		(rule__Model__StoriesAssignment)*
		{ after(grammarAccess.getModelAccess().getStoriesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStory
entryRuleStory
:
{ before(grammarAccess.getStoryRule()); }
	 ruleStory
{ after(grammarAccess.getStoryRule()); } 
	 EOF 
;

// Rule Story
ruleStory 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStoryAccess().getGroup()); }
		(rule__Story__Group__0)
		{ after(grammarAccess.getStoryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTitle
entryRuleTitle
:
{ before(grammarAccess.getTitleRule()); }
	 ruleTitle
{ after(grammarAccess.getTitleRule()); } 
	 EOF 
;

// Rule Title
ruleTitle 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTitleAccess().getGroup()); }
		(rule__Title__Group__0)
		{ after(grammarAccess.getTitleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBenefit
entryRuleBenefit
:
{ before(grammarAccess.getBenefitRule()); }
	 ruleBenefit
{ after(grammarAccess.getBenefitRule()); } 
	 EOF 
;

// Rule Benefit
ruleBenefit 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBenefitAccess().getGroup()); }
		(rule__Benefit__Group__0)
		{ after(grammarAccess.getBenefitAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRole
entryRuleRole
:
{ before(grammarAccess.getRoleRule()); }
	 ruleRole
{ after(grammarAccess.getRoleRule()); } 
	 EOF 
;

// Rule Role
ruleRole 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRoleAccess().getNounAssignment()); }
		(rule__Role__NounAssignment)
		{ after(grammarAccess.getRoleAccess().getNounAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAction
entryRuleAction
:
{ before(grammarAccess.getActionRule()); }
	 ruleAction
{ after(grammarAccess.getActionRule()); } 
	 EOF 
;

// Rule Action
ruleAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActionAccess().getGroup()); }
		(rule__Action__Group__0)
		{ after(grammarAccess.getActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Story__Group__0__Impl
	rule__Story__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoryAccess().getTitleAssignment_0()); }
	(rule__Story__TitleAssignment_0)
	{ after(grammarAccess.getStoryAccess().getTitleAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Story__Group__1__Impl
	rule__Story__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoryAccess().getDpAssignment_1()); }
	(rule__Story__DpAssignment_1)
	{ after(grammarAccess.getStoryAccess().getDpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Story__Group__2__Impl
	rule__Story__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoryAccess().getUmKeyword_2()); }
	'Um'
	{ after(grammarAccess.getStoryAccess().getUmKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Story__Group__3__Impl
	rule__Story__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoryAccess().getBenefitAssignment_3()); }
	(rule__Story__BenefitAssignment_3)
	{ after(grammarAccess.getStoryAccess().getBenefitAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Story__Group__4__Impl
	rule__Story__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoryAccess().getMöchteKeyword_4()); }
	'm\u00F6chte'
	{ after(grammarAccess.getStoryAccess().getMöchteKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Story__Group__5__Impl
	rule__Story__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoryAccess().getIchKeyword_5()); }
	'ich'
	{ after(grammarAccess.getStoryAccess().getIchKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Story__Group__6__Impl
	rule__Story__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoryAccess().getAlsKeyword_6()); }
	'als'
	{ after(grammarAccess.getStoryAccess().getAlsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Story__Group__7__Impl
	rule__Story__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoryAccess().getRoleAssignment_7()); }
	(rule__Story__RoleAssignment_7)
	{ after(grammarAccess.getStoryAccess().getRoleAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Story__Group__8__Impl
	rule__Story__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoryAccess().getActionAssignment_8()); }
	(rule__Story__ActionAssignment_8)
	{ after(grammarAccess.getStoryAccess().getActionAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Story__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoryAccess().getFullStopKeyword_9()); }
	'.'
	{ after(grammarAccess.getStoryAccess().getFullStopKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Title__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Title__Group__0__Impl
	rule__Title__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTitleAccess().getNounAssignment_0()); }
	(rule__Title__NounAssignment_0)
	{ after(grammarAccess.getTitleAccess().getNounAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Title__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTitleAccess().getVerbAssignment_1()); }
	(rule__Title__VerbAssignment_1)
	{ after(grammarAccess.getTitleAccess().getVerbAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Benefit__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Benefit__Group__0__Impl
	rule__Benefit__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Benefit__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBenefitAccess().getNounAssignment_0()); }
	(rule__Benefit__NounAssignment_0)
	{ after(grammarAccess.getBenefitAccess().getNounAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Benefit__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Benefit__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Benefit__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBenefitAccess().getPzviAssignment_1()); }
	(rule__Benefit__PzviAssignment_1)
	{ after(grammarAccess.getBenefitAccess().getPzviAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Action__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__0__Impl
	rule__Action__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getNounAssignment_0()); }
	(rule__Action__NounAssignment_0)
	{ after(grammarAccess.getActionAccess().getNounAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getViAssignment_1()); }
	(rule__Action__ViAssignment_1)
	{ after(grammarAccess.getActionAccess().getViAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__StoriesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getStoriesStoryParserRuleCall_0()); }
		ruleStory
		{ after(grammarAccess.getModelAccess().getStoriesStoryParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__TitleAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStoryAccess().getTitleTitleParserRuleCall_0_0()); }
		ruleTitle
		{ after(grammarAccess.getStoryAccess().getTitleTitleParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__DpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStoryAccess().getDpDOPPELPUNKTTerminalRuleCall_1_0()); }
		RULE_DOPPELPUNKT
		{ after(grammarAccess.getStoryAccess().getDpDOPPELPUNKTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__BenefitAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStoryAccess().getBenefitBenefitParserRuleCall_3_0()); }
		ruleBenefit
		{ after(grammarAccess.getStoryAccess().getBenefitBenefitParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__RoleAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStoryAccess().getRoleRoleParserRuleCall_7_0()); }
		ruleRole
		{ after(grammarAccess.getStoryAccess().getRoleRoleParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Story__ActionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStoryAccess().getActionActionParserRuleCall_8_0()); }
		ruleAction
		{ after(grammarAccess.getStoryAccess().getActionActionParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__NounAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTitleAccess().getNounNOUNTerminalRuleCall_0_0()); }
		RULE_NOUN
		{ after(grammarAccess.getTitleAccess().getNounNOUNTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__VerbAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTitleAccess().getVerbVERB_INFINTIVTerminalRuleCall_1_0()); }
		RULE_VERB_INFINTIV
		{ after(grammarAccess.getTitleAccess().getVerbVERB_INFINTIVTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Benefit__NounAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBenefitAccess().getNounNOUNTerminalRuleCall_0_0()); }
		RULE_NOUN
		{ after(grammarAccess.getBenefitAccess().getNounNOUNTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Benefit__PzviAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBenefitAccess().getPzviPREFIX_ZU_VERB_INFINTIVTerminalRuleCall_1_0()); }
		RULE_PREFIX_ZU_VERB_INFINTIV
		{ after(grammarAccess.getBenefitAccess().getPzviPREFIX_ZU_VERB_INFINTIVTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Role__NounAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoleAccess().getNounNOUNTerminalRuleCall_0()); }
		RULE_NOUN
		{ after(grammarAccess.getRoleAccess().getNounNOUNTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__NounAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getNounNOUNTerminalRuleCall_0_0()); }
		RULE_NOUN
		{ after(grammarAccess.getActionAccess().getNounNOUNTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__ViAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getViVERB_INFINTIVTerminalRuleCall_1_0()); }
		RULE_VERB_INFINTIV
		{ after(grammarAccess.getActionAccess().getViVERB_INFINTIVTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_NOUN : ('A'..'Z'|'\u00C4'|'\u00D6'|'\u00DC') ('a'..'z'|'\u00E4'|'\u00F6'|'\u00FC')*;

RULE_PREFIX_ZU_VERB_INFINTIV : ('a'..'z'|'\u00E4'|'\u00F6'|'\u00FC')* 'zu' ('a'..'y'|'\u00E4'|'\u00F6'|'\u00FC'|'z' ('a'..'t'|'v'..'y'|'\u00E4'|'\u00F6'|'\u00FC'))* 'en' ',';

RULE_VERB_INFINTIV : ('a'..'y'|'\u00E4'|'\u00F6'|'\u00FC'|'z' ('a'..'t'|'v'..'y'|'\u00E4'|'\u00F6'|'\u00FC'))+ 'z'* 'en';

RULE_DOPPELPUNKT : ':';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
