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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'['", "','", "']'", "'|'", "'-'", "'<'", "'>'", "'lbl_'", "'txt_'", "'*'", "'btn_'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalExpressionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExpression.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalExpression.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalExpression.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalExpression.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalExpression.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_elements_0_0= ruleContainer ) ) otherlv_1= ';' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalExpression.g:77:2: ( ( ( (lv_elements_0_0= ruleContainer ) ) otherlv_1= ';' ) )
            // InternalExpression.g:78:2: ( ( (lv_elements_0_0= ruleContainer ) ) otherlv_1= ';' )
            {
            // InternalExpression.g:78:2: ( ( (lv_elements_0_0= ruleContainer ) ) otherlv_1= ';' )
            // InternalExpression.g:79:3: ( (lv_elements_0_0= ruleContainer ) ) otherlv_1= ';'
            {
            // InternalExpression.g:79:3: ( (lv_elements_0_0= ruleContainer ) )
            // InternalExpression.g:80:4: (lv_elements_0_0= ruleContainer )
            {
            // InternalExpression.g:80:4: (lv_elements_0_0= ruleContainer )
            // InternalExpression.g:81:5: lv_elements_0_0= ruleContainer
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementsContainerParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_elements_0_0=ruleContainer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"xtext.Expression.Container");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalExpression.g:106:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalExpression.g:106:48: (iv_ruleElement= ruleElement EOF )
            // InternalExpression.g:107:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalExpression.g:113:1: ruleElement returns [EObject current=null] : (this_Container_0= ruleContainer | this_Table_1= ruleTable | this_Label_2= ruleLabel | this_TextView_3= ruleTextView | this_ComboView_4= ruleComboView | this_Button_5= ruleButton ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;

        EObject this_Table_1 = null;

        EObject this_Label_2 = null;

        EObject this_TextView_3 = null;

        EObject this_ComboView_4 = null;

        EObject this_Button_5 = null;



        	enterRule();

        try {
            // InternalExpression.g:119:2: ( (this_Container_0= ruleContainer | this_Table_1= ruleTable | this_Label_2= ruleLabel | this_TextView_3= ruleTextView | this_ComboView_4= ruleComboView | this_Button_5= ruleButton ) )
            // InternalExpression.g:120:2: (this_Container_0= ruleContainer | this_Table_1= ruleTable | this_Label_2= ruleLabel | this_TextView_3= ruleTextView | this_ComboView_4= ruleComboView | this_Button_5= ruleButton )
            {
            // InternalExpression.g:120:2: (this_Container_0= ruleContainer | this_Table_1= ruleTable | this_Label_2= ruleLabel | this_TextView_3= ruleTextView | this_ComboView_4= ruleComboView | this_Button_5= ruleButton )
            int alt1=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==17) ) {
                    alt1=2;
                }
                else if ( (LA1_1==12||(LA1_1>=15 && LA1_1<=16)) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 20:
                {
                alt1=4;
                }
                break;
            case 21:
                {
                alt1=5;
                }
                break;
            case 22:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalExpression.g:121:3: this_Container_0= ruleContainer
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getContainerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Container_0=ruleContainer();

                    state._fsp--;


                    			current = this_Container_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExpression.g:130:3: this_Table_1= ruleTable
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Table_1=ruleTable();

                    state._fsp--;


                    			current = this_Table_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExpression.g:139:3: this_Label_2= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getLabelParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_2=ruleLabel();

                    state._fsp--;


                    			current = this_Label_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalExpression.g:148:3: this_TextView_3= ruleTextView
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTextViewParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextView_3=ruleTextView();

                    state._fsp--;


                    			current = this_TextView_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalExpression.g:157:3: this_ComboView_4= ruleComboView
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getComboViewParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComboView_4=ruleComboView();

                    state._fsp--;


                    			current = this_ComboView_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalExpression.g:166:3: this_Button_5= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getButtonParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_5=ruleButton();

                    state._fsp--;


                    			current = this_Button_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleContainer"
    // InternalExpression.g:178:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalExpression.g:178:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalExpression.g:179:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalExpression.g:185:1: ruleContainer returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ruleOrientation )? otherlv_2= '[' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalExpression.g:191:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ruleOrientation )? otherlv_2= '[' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= ']' ) )
            // InternalExpression.g:192:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleOrientation )? otherlv_2= '[' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= ']' )
            {
            // InternalExpression.g:192:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleOrientation )? otherlv_2= '[' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= ']' )
            // InternalExpression.g:193:3: ( (lv_name_0_0= RULE_ID ) ) ( ruleOrientation )? otherlv_2= '[' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= ']'
            {
            // InternalExpression.g:193:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExpression.g:194:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExpression.g:194:4: (lv_name_0_0= RULE_ID )
            // InternalExpression.g:195:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"xtext.Expression.ID");
            				

            }


            }

            // InternalExpression.g:211:3: ( ruleOrientation )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalExpression.g:212:4: ruleOrientation
                    {

                    				newCompositeNode(grammarAccess.getContainerAccess().getOrientationParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_5);
                    ruleOrientation();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalExpression.g:224:3: ( (lv_elements_3_0= ruleElement ) )
            // InternalExpression.g:225:4: (lv_elements_3_0= ruleElement )
            {
            // InternalExpression.g:225:4: (lv_elements_3_0= ruleElement )
            // InternalExpression.g:226:5: lv_elements_3_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getElementsElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_elements_3_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"xtext.Expression.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalExpression.g:243:3: (otherlv_4= ',' ( (lv_elements_5_0= ruleElement ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExpression.g:244:4: otherlv_4= ',' ( (lv_elements_5_0= ruleElement ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalExpression.g:248:4: ( (lv_elements_5_0= ruleElement ) )
            	    // InternalExpression.g:249:5: (lv_elements_5_0= ruleElement )
            	    {
            	    // InternalExpression.g:249:5: (lv_elements_5_0= ruleElement )
            	    // InternalExpression.g:250:6: lv_elements_5_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getContainerAccess().getElementsElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_elements_5_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContainerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_5_0,
            	    							"xtext.Expression.Element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleOrientation"
    // InternalExpression.g:276:1: entryRuleOrientation returns [String current=null] : iv_ruleOrientation= ruleOrientation EOF ;
    public final String entryRuleOrientation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrientation = null;


        try {
            // InternalExpression.g:276:51: (iv_ruleOrientation= ruleOrientation EOF )
            // InternalExpression.g:277:2: iv_ruleOrientation= ruleOrientation EOF
            {
             newCompositeNode(grammarAccess.getOrientationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrientation=ruleOrientation();

            state._fsp--;

             current =iv_ruleOrientation.getText(); 
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
    // $ANTLR end "entryRuleOrientation"


    // $ANTLR start "ruleOrientation"
    // InternalExpression.g:283:1: ruleOrientation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '|' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOrientation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalExpression.g:289:2: ( (kw= '|' | kw= '-' ) )
            // InternalExpression.g:290:2: (kw= '|' | kw= '-' )
            {
            // InternalExpression.g:290:2: (kw= '|' | kw= '-' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExpression.g:291:3: kw= '|'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrientationAccess().getVerticalLineKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExpression.g:297:3: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrientationAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleOrientation"


    // $ANTLR start "entryRuleTable"
    // InternalExpression.g:306:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalExpression.g:306:46: (iv_ruleTable= ruleTable EOF )
            // InternalExpression.g:307:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalExpression.g:313:1: ruleTable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '>' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_columns_2_0 = null;

        EObject lv_columns_4_0 = null;



        	enterRule();

        try {
            // InternalExpression.g:319:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '>' ) )
            // InternalExpression.g:320:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '>' )
            {
            // InternalExpression.g:320:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '>' )
            // InternalExpression.g:321:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* otherlv_5= '>'
            {
            // InternalExpression.g:321:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExpression.g:322:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExpression.g:322:4: (lv_name_0_0= RULE_ID )
            // InternalExpression.g:323:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"xtext.Expression.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getLessThanSignKeyword_1());
            		
            // InternalExpression.g:343:3: ( (lv_columns_2_0= ruleColumn ) )
            // InternalExpression.g:344:4: (lv_columns_2_0= ruleColumn )
            {
            // InternalExpression.g:344:4: (lv_columns_2_0= ruleColumn )
            // InternalExpression.g:345:5: lv_columns_2_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_columns_2_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					add(
            						current,
            						"columns",
            						lv_columns_2_0,
            						"xtext.Expression.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalExpression.g:362:3: (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalExpression.g:363:4: otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTableAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalExpression.g:367:4: ( (lv_columns_4_0= ruleColumn ) )
            	    // InternalExpression.g:368:5: (lv_columns_4_0= ruleColumn )
            	    {
            	    // InternalExpression.g:368:5: (lv_columns_4_0= ruleColumn )
            	    // InternalExpression.g:369:6: lv_columns_4_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_columns_4_0=ruleColumn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columns",
            	    							lv_columns_4_0,
            	    							"xtext.Expression.Column");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTableAccess().getGreaterThanSignKeyword_4());
            		

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalExpression.g:395:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalExpression.g:395:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalExpression.g:396:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalExpression.g:402:1: ruleColumn returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalExpression.g:408:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalExpression.g:409:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalExpression.g:409:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalExpression.g:410:3: (lv_name_0_0= RULE_ID )
            {
            // InternalExpression.g:410:3: (lv_name_0_0= RULE_ID )
            // InternalExpression.g:411:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColumnRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"xtext.Expression.ID");
            			

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleLabel"
    // InternalExpression.g:430:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalExpression.g:430:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalExpression.g:431:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalExpression.g:437:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'lbl_' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalExpression.g:443:2: ( (otherlv_0= 'lbl_' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalExpression.g:444:2: (otherlv_0= 'lbl_' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalExpression.g:444:2: (otherlv_0= 'lbl_' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalExpression.g:445:3: otherlv_0= 'lbl_' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLbl_Keyword_0());
            		
            // InternalExpression.g:449:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpression.g:450:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpression.g:450:4: (lv_name_1_0= RULE_ID )
            // InternalExpression.g:451:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.Expression.ID");
            				

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleTextView"
    // InternalExpression.g:471:1: entryRuleTextView returns [EObject current=null] : iv_ruleTextView= ruleTextView EOF ;
    public final EObject entryRuleTextView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextView = null;


        try {
            // InternalExpression.g:471:49: (iv_ruleTextView= ruleTextView EOF )
            // InternalExpression.g:472:2: iv_ruleTextView= ruleTextView EOF
            {
             newCompositeNode(grammarAccess.getTextViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextView=ruleTextView();

            state._fsp--;

             current =iv_ruleTextView; 
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
    // $ANTLR end "entryRuleTextView"


    // $ANTLR start "ruleTextView"
    // InternalExpression.g:478:1: ruleTextView returns [EObject current=null] : (otherlv_0= 'txt_' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTextView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalExpression.g:484:2: ( (otherlv_0= 'txt_' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalExpression.g:485:2: (otherlv_0= 'txt_' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalExpression.g:485:2: (otherlv_0= 'txt_' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalExpression.g:486:3: otherlv_0= 'txt_' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTextViewAccess().getTxt_Keyword_0());
            		
            // InternalExpression.g:490:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpression.g:491:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpression.g:491:4: (lv_name_1_0= RULE_ID )
            // InternalExpression.g:492:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTextViewAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextViewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.Expression.ID");
            				

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
    // $ANTLR end "ruleTextView"


    // $ANTLR start "entryRuleComboView"
    // InternalExpression.g:512:1: entryRuleComboView returns [EObject current=null] : iv_ruleComboView= ruleComboView EOF ;
    public final EObject entryRuleComboView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboView = null;


        try {
            // InternalExpression.g:512:50: (iv_ruleComboView= ruleComboView EOF )
            // InternalExpression.g:513:2: iv_ruleComboView= ruleComboView EOF
            {
             newCompositeNode(grammarAccess.getComboViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComboView=ruleComboView();

            state._fsp--;

             current =iv_ruleComboView; 
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
    // $ANTLR end "entryRuleComboView"


    // $ANTLR start "ruleComboView"
    // InternalExpression.g:519:1: ruleComboView returns [EObject current=null] : (otherlv_0= '*' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleComboView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalExpression.g:525:2: ( (otherlv_0= '*' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalExpression.g:526:2: (otherlv_0= '*' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalExpression.g:526:2: (otherlv_0= '*' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalExpression.g:527:3: otherlv_0= '*' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComboViewAccess().getAsteriskKeyword_0());
            		
            // InternalExpression.g:531:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpression.g:532:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpression.g:532:4: (lv_name_1_0= RULE_ID )
            // InternalExpression.g:533:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComboViewAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComboViewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.Expression.ID");
            				

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
    // $ANTLR end "ruleComboView"


    // $ANTLR start "entryRuleButton"
    // InternalExpression.g:553:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalExpression.g:553:47: (iv_ruleButton= ruleButton EOF )
            // InternalExpression.g:554:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalExpression.g:560:1: ruleButton returns [EObject current=null] : (otherlv_0= 'btn_' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalExpression.g:566:2: ( (otherlv_0= 'btn_' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalExpression.g:567:2: (otherlv_0= 'btn_' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalExpression.g:567:2: (otherlv_0= 'btn_' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalExpression.g:568:3: otherlv_0= 'btn_' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getBtn_Keyword_0());
            		
            // InternalExpression.g:572:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpression.g:573:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpression.g:573:4: (lv_name_1_0= RULE_ID )
            // InternalExpression.g:574:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.Expression.ID");
            				

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
    // $ANTLR end "ruleButton"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000019000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000780010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000042000L});

}