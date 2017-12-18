/*
 * generated by Xtext 2.10.0
 */
grammar InternalExpression;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.services.ExpressionGrammarAccess;

}

@parser::members {

 	private ExpressionGrammarAccess grammarAccess;

    public InternalExpressionParser(TokenStream input, ExpressionGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected ExpressionGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getElementsContainerParserRuleCall_0_0());
				}
				lv_elements_0_0=ruleContainer
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"elements",
						lv_elements_0_0,
						"xtext.Expression.Container");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=';'
		{
			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getSemicolonKeyword_1());
		}
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getElementAccess().getContainerParserRuleCall_0());
		}
		this_Container_0=ruleContainer
		{
			$current = $this_Container_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getTableParserRuleCall_1());
		}
		this_Table_1=ruleTable
		{
			$current = $this_Table_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getLabelParserRuleCall_2());
		}
		this_Label_2=ruleLabel
		{
			$current = $this_Label_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getTextViewParserRuleCall_3());
		}
		this_TextView_3=ruleTextView
		{
			$current = $this_TextView_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getComboViewParserRuleCall_4());
		}
		this_ComboView_4=ruleComboView
		{
			$current = $this_ComboView_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getButtonParserRuleCall_5());
		}
		this_Button_5=ruleButton
		{
			$current = $this_Button_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleContainer
entryRuleContainer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainerRule()); }
	iv_ruleContainer=ruleContainer
	{ $current=$iv_ruleContainer.current; }
	EOF;

// Rule Container
ruleContainer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContainerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"xtext.Expression.ID");
				}
			)
		)
		(
			{
				newCompositeNode(grammarAccess.getContainerAccess().getOrientationParserRuleCall_1());
			}
			ruleOrientation
			{
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContainerAccess().getElementsElementParserRuleCall_3_0());
				}
				lv_elements_3_0=ruleElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContainerRule());
					}
					add(
						$current,
						"elements",
						lv_elements_3_0,
						"xtext.Expression.Element");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getContainerAccess().getElementsElementParserRuleCall_4_1_0());
					}
					lv_elements_5_0=ruleElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContainerRule());
						}
						add(
							$current,
							"elements",
							lv_elements_5_0,
							"xtext.Expression.Element");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6=']'
		{
			newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getRightSquareBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleOrientation
entryRuleOrientation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOrientationRule()); }
	iv_ruleOrientation=ruleOrientation
	{ $current=$iv_ruleOrientation.current.getText(); }
	EOF;

// Rule Orientation
ruleOrientation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='|'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOrientationAccess().getVerticalLineKeyword_0());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOrientationAccess().getHyphenMinusKeyword_1());
		}
	)
;

// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	iv_ruleTable=ruleTable
	{ $current=$iv_ruleTable.current; }
	EOF;

// Rule Table
ruleTable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"xtext.Expression.ID");
				}
			)
		)
		otherlv_1='<'
		{
			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getLessThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_2_0());
				}
				lv_columns_2_0=ruleColumn
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTableRule());
					}
					add(
						$current,
						"columns",
						lv_columns_2_0,
						"xtext.Expression.Column");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getTableAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_1_0());
					}
					lv_columns_4_0=ruleColumn
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTableRule());
						}
						add(
							$current,
							"columns",
							lv_columns_4_0,
							"xtext.Expression.Column");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='>'
		{
			newLeafNode(otherlv_5, grammarAccess.getTableAccess().getGreaterThanSignKeyword_4());
		}
	)
;

// Entry rule entryRuleColumn
entryRuleColumn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColumnRule()); }
	iv_ruleColumn=ruleColumn
	{ $current=$iv_ruleColumn.current; }
	EOF;

// Rule Column
ruleColumn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getColumnRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"xtext.Expression.ID");
			}
		)
	)
;

// Entry rule entryRuleLabel
entryRuleLabel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLabelRule()); }
	iv_ruleLabel=ruleLabel
	{ $current=$iv_ruleLabel.current; }
	EOF;

// Rule Label
ruleLabel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='lbl_'
		{
			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLbl_Keyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLabelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"xtext.Expression.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleTextView
entryRuleTextView returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTextViewRule()); }
	iv_ruleTextView=ruleTextView
	{ $current=$iv_ruleTextView.current; }
	EOF;

// Rule TextView
ruleTextView returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='txt_'
		{
			newLeafNode(otherlv_0, grammarAccess.getTextViewAccess().getTxt_Keyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTextViewAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTextViewRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"xtext.Expression.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleComboView
entryRuleComboView returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComboViewRule()); }
	iv_ruleComboView=ruleComboView
	{ $current=$iv_ruleComboView.current; }
	EOF;

// Rule ComboView
ruleComboView returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='*'
		{
			newLeafNode(otherlv_0, grammarAccess.getComboViewAccess().getAsteriskKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getComboViewAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComboViewRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"xtext.Expression.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleButton
entryRuleButton returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonRule()); }
	iv_ruleButton=ruleButton
	{ $current=$iv_ruleButton.current; }
	EOF;

// Rule Button
ruleButton returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='btn_'
		{
			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getBtn_Keyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"xtext.Expression.ID");
				}
			)
		)
	)
;

RULE_ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;