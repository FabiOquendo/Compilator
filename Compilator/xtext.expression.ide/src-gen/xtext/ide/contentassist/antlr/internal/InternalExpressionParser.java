package xtext.ide.contentassist.antlr.internal;

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
import xtext.services.ExpressionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'|'", "'-'", "';'", "'['", "']'", "','", "'<'", "'>'", "'lbl_'", "'txt_'", "'*'", "'btn_'"
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

    	public void setGrammarAccess(ExpressionGrammarAccess grammarAccess) {
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
    // InternalExpression.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalExpression.g:54:1: ( ruleModel EOF )
            // InternalExpression.g:55:1: ruleModel EOF
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
    // InternalExpression.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalExpression.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalExpression.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalExpression.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalExpression.g:69:3: ( rule__Model__Group__0 )
            // InternalExpression.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleElement"
    // InternalExpression.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalExpression.g:79:1: ( ruleElement EOF )
            // InternalExpression.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalExpression.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalExpression.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalExpression.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalExpression.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalExpression.g:94:3: ( rule__Element__Alternatives )
            // InternalExpression.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleContainer"
    // InternalExpression.g:103:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalExpression.g:104:1: ( ruleContainer EOF )
            // InternalExpression.g:105:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalExpression.g:112:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:116:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalExpression.g:117:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalExpression.g:117:2: ( ( rule__Container__Group__0 ) )
            // InternalExpression.g:118:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalExpression.g:119:3: ( rule__Container__Group__0 )
            // InternalExpression.g:119:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleOrientation"
    // InternalExpression.g:128:1: entryRuleOrientation : ruleOrientation EOF ;
    public final void entryRuleOrientation() throws RecognitionException {
        try {
            // InternalExpression.g:129:1: ( ruleOrientation EOF )
            // InternalExpression.g:130:1: ruleOrientation EOF
            {
             before(grammarAccess.getOrientationRule()); 
            pushFollow(FOLLOW_1);
            ruleOrientation();

            state._fsp--;

             after(grammarAccess.getOrientationRule()); 
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
    // $ANTLR end "entryRuleOrientation"


    // $ANTLR start "ruleOrientation"
    // InternalExpression.g:137:1: ruleOrientation : ( ( rule__Orientation__Alternatives ) ) ;
    public final void ruleOrientation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:141:2: ( ( ( rule__Orientation__Alternatives ) ) )
            // InternalExpression.g:142:2: ( ( rule__Orientation__Alternatives ) )
            {
            // InternalExpression.g:142:2: ( ( rule__Orientation__Alternatives ) )
            // InternalExpression.g:143:3: ( rule__Orientation__Alternatives )
            {
             before(grammarAccess.getOrientationAccess().getAlternatives()); 
            // InternalExpression.g:144:3: ( rule__Orientation__Alternatives )
            // InternalExpression.g:144:4: rule__Orientation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Orientation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrientationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOrientation"


    // $ANTLR start "entryRuleTable"
    // InternalExpression.g:153:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalExpression.g:154:1: ( ruleTable EOF )
            // InternalExpression.g:155:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalExpression.g:162:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:166:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalExpression.g:167:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalExpression.g:167:2: ( ( rule__Table__Group__0 ) )
            // InternalExpression.g:168:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalExpression.g:169:3: ( rule__Table__Group__0 )
            // InternalExpression.g:169:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalExpression.g:178:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalExpression.g:179:1: ( ruleColumn EOF )
            // InternalExpression.g:180:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalExpression.g:187:1: ruleColumn : ( ( rule__Column__NameAssignment ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:191:2: ( ( ( rule__Column__NameAssignment ) ) )
            // InternalExpression.g:192:2: ( ( rule__Column__NameAssignment ) )
            {
            // InternalExpression.g:192:2: ( ( rule__Column__NameAssignment ) )
            // InternalExpression.g:193:3: ( rule__Column__NameAssignment )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment()); 
            // InternalExpression.g:194:3: ( rule__Column__NameAssignment )
            // InternalExpression.g:194:4: rule__Column__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleLabel"
    // InternalExpression.g:203:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalExpression.g:204:1: ( ruleLabel EOF )
            // InternalExpression.g:205:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalExpression.g:212:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:216:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalExpression.g:217:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalExpression.g:217:2: ( ( rule__Label__Group__0 ) )
            // InternalExpression.g:218:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalExpression.g:219:3: ( rule__Label__Group__0 )
            // InternalExpression.g:219:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleTextView"
    // InternalExpression.g:228:1: entryRuleTextView : ruleTextView EOF ;
    public final void entryRuleTextView() throws RecognitionException {
        try {
            // InternalExpression.g:229:1: ( ruleTextView EOF )
            // InternalExpression.g:230:1: ruleTextView EOF
            {
             before(grammarAccess.getTextViewRule()); 
            pushFollow(FOLLOW_1);
            ruleTextView();

            state._fsp--;

             after(grammarAccess.getTextViewRule()); 
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
    // $ANTLR end "entryRuleTextView"


    // $ANTLR start "ruleTextView"
    // InternalExpression.g:237:1: ruleTextView : ( ( rule__TextView__Group__0 ) ) ;
    public final void ruleTextView() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:241:2: ( ( ( rule__TextView__Group__0 ) ) )
            // InternalExpression.g:242:2: ( ( rule__TextView__Group__0 ) )
            {
            // InternalExpression.g:242:2: ( ( rule__TextView__Group__0 ) )
            // InternalExpression.g:243:3: ( rule__TextView__Group__0 )
            {
             before(grammarAccess.getTextViewAccess().getGroup()); 
            // InternalExpression.g:244:3: ( rule__TextView__Group__0 )
            // InternalExpression.g:244:4: rule__TextView__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextView__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextViewAccess().getGroup()); 

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
    // $ANTLR end "ruleTextView"


    // $ANTLR start "entryRuleComboView"
    // InternalExpression.g:253:1: entryRuleComboView : ruleComboView EOF ;
    public final void entryRuleComboView() throws RecognitionException {
        try {
            // InternalExpression.g:254:1: ( ruleComboView EOF )
            // InternalExpression.g:255:1: ruleComboView EOF
            {
             before(grammarAccess.getComboViewRule()); 
            pushFollow(FOLLOW_1);
            ruleComboView();

            state._fsp--;

             after(grammarAccess.getComboViewRule()); 
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
    // $ANTLR end "entryRuleComboView"


    // $ANTLR start "ruleComboView"
    // InternalExpression.g:262:1: ruleComboView : ( ( rule__ComboView__Group__0 ) ) ;
    public final void ruleComboView() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:266:2: ( ( ( rule__ComboView__Group__0 ) ) )
            // InternalExpression.g:267:2: ( ( rule__ComboView__Group__0 ) )
            {
            // InternalExpression.g:267:2: ( ( rule__ComboView__Group__0 ) )
            // InternalExpression.g:268:3: ( rule__ComboView__Group__0 )
            {
             before(grammarAccess.getComboViewAccess().getGroup()); 
            // InternalExpression.g:269:3: ( rule__ComboView__Group__0 )
            // InternalExpression.g:269:4: rule__ComboView__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComboView__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComboViewAccess().getGroup()); 

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
    // $ANTLR end "ruleComboView"


    // $ANTLR start "entryRuleButton"
    // InternalExpression.g:278:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalExpression.g:279:1: ( ruleButton EOF )
            // InternalExpression.g:280:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalExpression.g:287:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:291:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalExpression.g:292:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalExpression.g:292:2: ( ( rule__Button__Group__0 ) )
            // InternalExpression.g:293:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalExpression.g:294:3: ( rule__Button__Group__0 )
            // InternalExpression.g:294:4: rule__Button__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalExpression.g:302:1: rule__Element__Alternatives : ( ( ruleContainer ) | ( ruleTable ) | ( ruleLabel ) | ( ruleTextView ) | ( ruleComboView ) | ( ruleButton ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:306:1: ( ( ruleContainer ) | ( ruleTable ) | ( ruleLabel ) | ( ruleTextView ) | ( ruleComboView ) | ( ruleButton ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==17) ) {
                    alt1=2;
                }
                else if ( ((LA1_1>=11 && LA1_1<=12)||LA1_1==14) ) {
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
                    // InternalExpression.g:307:2: ( ruleContainer )
                    {
                    // InternalExpression.g:307:2: ( ruleContainer )
                    // InternalExpression.g:308:3: ruleContainer
                    {
                     before(grammarAccess.getElementAccess().getContainerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleContainer();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getContainerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpression.g:313:2: ( ruleTable )
                    {
                    // InternalExpression.g:313:2: ( ruleTable )
                    // InternalExpression.g:314:3: ruleTable
                    {
                     before(grammarAccess.getElementAccess().getTableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTable();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpression.g:319:2: ( ruleLabel )
                    {
                    // InternalExpression.g:319:2: ( ruleLabel )
                    // InternalExpression.g:320:3: ruleLabel
                    {
                     before(grammarAccess.getElementAccess().getLabelParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getLabelParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpression.g:325:2: ( ruleTextView )
                    {
                    // InternalExpression.g:325:2: ( ruleTextView )
                    // InternalExpression.g:326:3: ruleTextView
                    {
                     before(grammarAccess.getElementAccess().getTextViewParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTextView();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTextViewParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExpression.g:331:2: ( ruleComboView )
                    {
                    // InternalExpression.g:331:2: ( ruleComboView )
                    // InternalExpression.g:332:3: ruleComboView
                    {
                     before(grammarAccess.getElementAccess().getComboViewParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleComboView();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getComboViewParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalExpression.g:337:2: ( ruleButton )
                    {
                    // InternalExpression.g:337:2: ( ruleButton )
                    // InternalExpression.g:338:3: ruleButton
                    {
                     before(grammarAccess.getElementAccess().getButtonParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getButtonParserRuleCall_5()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Orientation__Alternatives"
    // InternalExpression.g:347:1: rule__Orientation__Alternatives : ( ( '|' ) | ( '-' ) );
    public final void rule__Orientation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:351:1: ( ( '|' ) | ( '-' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExpression.g:352:2: ( '|' )
                    {
                    // InternalExpression.g:352:2: ( '|' )
                    // InternalExpression.g:353:3: '|'
                    {
                     before(grammarAccess.getOrientationAccess().getVerticalLineKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOrientationAccess().getVerticalLineKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpression.g:358:2: ( '-' )
                    {
                    // InternalExpression.g:358:2: ( '-' )
                    // InternalExpression.g:359:3: '-'
                    {
                     before(grammarAccess.getOrientationAccess().getHyphenMinusKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOrientationAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Orientation__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalExpression.g:368:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:372:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalExpression.g:373:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalExpression.g:380:1: rule__Model__Group__0__Impl : ( ( rule__Model__ElementsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:384:1: ( ( ( rule__Model__ElementsAssignment_0 ) ) )
            // InternalExpression.g:385:1: ( ( rule__Model__ElementsAssignment_0 ) )
            {
            // InternalExpression.g:385:1: ( ( rule__Model__ElementsAssignment_0 ) )
            // InternalExpression.g:386:2: ( rule__Model__ElementsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_0()); 
            // InternalExpression.g:387:2: ( rule__Model__ElementsAssignment_0 )
            // InternalExpression.g:387:3: rule__Model__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalExpression.g:395:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:399:1: ( rule__Model__Group__1__Impl )
            // InternalExpression.g:400:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalExpression.g:406:1: rule__Model__Group__1__Impl : ( ';' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:410:1: ( ( ';' ) )
            // InternalExpression.g:411:1: ( ';' )
            {
            // InternalExpression.g:411:1: ( ';' )
            // InternalExpression.g:412:2: ';'
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalExpression.g:422:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:426:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalExpression.g:427:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

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
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalExpression.g:434:1: rule__Container__Group__0__Impl : ( ( rule__Container__NameAssignment_0 ) ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:438:1: ( ( ( rule__Container__NameAssignment_0 ) ) )
            // InternalExpression.g:439:1: ( ( rule__Container__NameAssignment_0 ) )
            {
            // InternalExpression.g:439:1: ( ( rule__Container__NameAssignment_0 ) )
            // InternalExpression.g:440:2: ( rule__Container__NameAssignment_0 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_0()); 
            // InternalExpression.g:441:2: ( rule__Container__NameAssignment_0 )
            // InternalExpression.g:441:3: rule__Container__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalExpression.g:449:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:453:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalExpression.g:454:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

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
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalExpression.g:461:1: rule__Container__Group__1__Impl : ( ( ruleOrientation )? ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:465:1: ( ( ( ruleOrientation )? ) )
            // InternalExpression.g:466:1: ( ( ruleOrientation )? )
            {
            // InternalExpression.g:466:1: ( ( ruleOrientation )? )
            // InternalExpression.g:467:2: ( ruleOrientation )?
            {
             before(grammarAccess.getContainerAccess().getOrientationParserRuleCall_1()); 
            // InternalExpression.g:468:2: ( ruleOrientation )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalExpression.g:468:3: ruleOrientation
                    {
                    pushFollow(FOLLOW_2);
                    ruleOrientation();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getOrientationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalExpression.g:476:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:480:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalExpression.g:481:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__3();

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
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalExpression.g:488:1: rule__Container__Group__2__Impl : ( '[' ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:492:1: ( ( '[' ) )
            // InternalExpression.g:493:1: ( '[' )
            {
            // InternalExpression.g:493:1: ( '[' )
            // InternalExpression.g:494:2: '['
            {
             before(grammarAccess.getContainerAccess().getLeftSquareBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // InternalExpression.g:503:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:507:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // InternalExpression.g:508:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__4();

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
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // InternalExpression.g:515:1: rule__Container__Group__3__Impl : ( ( rule__Container__ElementsAssignment_3 ) ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:519:1: ( ( ( rule__Container__ElementsAssignment_3 ) ) )
            // InternalExpression.g:520:1: ( ( rule__Container__ElementsAssignment_3 ) )
            {
            // InternalExpression.g:520:1: ( ( rule__Container__ElementsAssignment_3 ) )
            // InternalExpression.g:521:2: ( rule__Container__ElementsAssignment_3 )
            {
             before(grammarAccess.getContainerAccess().getElementsAssignment_3()); 
            // InternalExpression.g:522:2: ( rule__Container__ElementsAssignment_3 )
            // InternalExpression.g:522:3: rule__Container__ElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Container__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Container__Group__4"
    // InternalExpression.g:530:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:534:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // InternalExpression.g:535:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__5();

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
    // $ANTLR end "rule__Container__Group__4"


    // $ANTLR start "rule__Container__Group__4__Impl"
    // InternalExpression.g:542:1: rule__Container__Group__4__Impl : ( ( rule__Container__Group_4__0 )* ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:546:1: ( ( ( rule__Container__Group_4__0 )* ) )
            // InternalExpression.g:547:1: ( ( rule__Container__Group_4__0 )* )
            {
            // InternalExpression.g:547:1: ( ( rule__Container__Group_4__0 )* )
            // InternalExpression.g:548:2: ( rule__Container__Group_4__0 )*
            {
             before(grammarAccess.getContainerAccess().getGroup_4()); 
            // InternalExpression.g:549:2: ( rule__Container__Group_4__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExpression.g:549:3: rule__Container__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Container__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Container__Group__4__Impl"


    // $ANTLR start "rule__Container__Group__5"
    // InternalExpression.g:557:1: rule__Container__Group__5 : rule__Container__Group__5__Impl ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:561:1: ( rule__Container__Group__5__Impl )
            // InternalExpression.g:562:2: rule__Container__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__5__Impl();

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
    // $ANTLR end "rule__Container__Group__5"


    // $ANTLR start "rule__Container__Group__5__Impl"
    // InternalExpression.g:568:1: rule__Container__Group__5__Impl : ( ']' ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:572:1: ( ( ']' ) )
            // InternalExpression.g:573:1: ( ']' )
            {
            // InternalExpression.g:573:1: ( ']' )
            // InternalExpression.g:574:2: ']'
            {
             before(grammarAccess.getContainerAccess().getRightSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Container__Group__5__Impl"


    // $ANTLR start "rule__Container__Group_4__0"
    // InternalExpression.g:584:1: rule__Container__Group_4__0 : rule__Container__Group_4__0__Impl rule__Container__Group_4__1 ;
    public final void rule__Container__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:588:1: ( rule__Container__Group_4__0__Impl rule__Container__Group_4__1 )
            // InternalExpression.g:589:2: rule__Container__Group_4__0__Impl rule__Container__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Container__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_4__1();

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
    // $ANTLR end "rule__Container__Group_4__0"


    // $ANTLR start "rule__Container__Group_4__0__Impl"
    // InternalExpression.g:596:1: rule__Container__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Container__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:600:1: ( ( ',' ) )
            // InternalExpression.g:601:1: ( ',' )
            {
            // InternalExpression.g:601:1: ( ',' )
            // InternalExpression.g:602:2: ','
            {
             before(grammarAccess.getContainerAccess().getCommaKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Container__Group_4__0__Impl"


    // $ANTLR start "rule__Container__Group_4__1"
    // InternalExpression.g:611:1: rule__Container__Group_4__1 : rule__Container__Group_4__1__Impl ;
    public final void rule__Container__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:615:1: ( rule__Container__Group_4__1__Impl )
            // InternalExpression.g:616:2: rule__Container__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_4__1__Impl();

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
    // $ANTLR end "rule__Container__Group_4__1"


    // $ANTLR start "rule__Container__Group_4__1__Impl"
    // InternalExpression.g:622:1: rule__Container__Group_4__1__Impl : ( ( rule__Container__ElementsAssignment_4_1 ) ) ;
    public final void rule__Container__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:626:1: ( ( ( rule__Container__ElementsAssignment_4_1 ) ) )
            // InternalExpression.g:627:1: ( ( rule__Container__ElementsAssignment_4_1 ) )
            {
            // InternalExpression.g:627:1: ( ( rule__Container__ElementsAssignment_4_1 ) )
            // InternalExpression.g:628:2: ( rule__Container__ElementsAssignment_4_1 )
            {
             before(grammarAccess.getContainerAccess().getElementsAssignment_4_1()); 
            // InternalExpression.g:629:2: ( rule__Container__ElementsAssignment_4_1 )
            // InternalExpression.g:629:3: rule__Container__ElementsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__ElementsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getElementsAssignment_4_1()); 

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
    // $ANTLR end "rule__Container__Group_4__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalExpression.g:638:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:642:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalExpression.g:643:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

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
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalExpression.g:650:1: rule__Table__Group__0__Impl : ( ( rule__Table__NameAssignment_0 ) ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:654:1: ( ( ( rule__Table__NameAssignment_0 ) ) )
            // InternalExpression.g:655:1: ( ( rule__Table__NameAssignment_0 ) )
            {
            // InternalExpression.g:655:1: ( ( rule__Table__NameAssignment_0 ) )
            // InternalExpression.g:656:2: ( rule__Table__NameAssignment_0 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_0()); 
            // InternalExpression.g:657:2: ( rule__Table__NameAssignment_0 )
            // InternalExpression.g:657:3: rule__Table__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalExpression.g:665:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:669:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalExpression.g:670:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

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
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalExpression.g:677:1: rule__Table__Group__1__Impl : ( '<' ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:681:1: ( ( '<' ) )
            // InternalExpression.g:682:1: ( '<' )
            {
            // InternalExpression.g:682:1: ( '<' )
            // InternalExpression.g:683:2: '<'
            {
             before(grammarAccess.getTableAccess().getLessThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLessThanSignKeyword_1()); 

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
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalExpression.g:692:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:696:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalExpression.g:697:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

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
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalExpression.g:704:1: rule__Table__Group__2__Impl : ( ( rule__Table__ColumnsAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:708:1: ( ( ( rule__Table__ColumnsAssignment_2 ) ) )
            // InternalExpression.g:709:1: ( ( rule__Table__ColumnsAssignment_2 ) )
            {
            // InternalExpression.g:709:1: ( ( rule__Table__ColumnsAssignment_2 ) )
            // InternalExpression.g:710:2: ( rule__Table__ColumnsAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_2()); 
            // InternalExpression.g:711:2: ( rule__Table__ColumnsAssignment_2 )
            // InternalExpression.g:711:3: rule__Table__ColumnsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_2()); 

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
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalExpression.g:719:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:723:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalExpression.g:724:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

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
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalExpression.g:731:1: rule__Table__Group__3__Impl : ( ( rule__Table__Group_3__0 )* ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:735:1: ( ( ( rule__Table__Group_3__0 )* ) )
            // InternalExpression.g:736:1: ( ( rule__Table__Group_3__0 )* )
            {
            // InternalExpression.g:736:1: ( ( rule__Table__Group_3__0 )* )
            // InternalExpression.g:737:2: ( rule__Table__Group_3__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_3()); 
            // InternalExpression.g:738:2: ( rule__Table__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalExpression.g:738:3: rule__Table__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Table__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalExpression.g:746:1: rule__Table__Group__4 : rule__Table__Group__4__Impl ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:750:1: ( rule__Table__Group__4__Impl )
            // InternalExpression.g:751:2: rule__Table__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__4__Impl();

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
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalExpression.g:757:1: rule__Table__Group__4__Impl : ( '>' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:761:1: ( ( '>' ) )
            // InternalExpression.g:762:1: ( '>' )
            {
            // InternalExpression.g:762:1: ( '>' )
            // InternalExpression.g:763:2: '>'
            {
             before(grammarAccess.getTableAccess().getGreaterThanSignKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getGreaterThanSignKeyword_4()); 

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
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group_3__0"
    // InternalExpression.g:773:1: rule__Table__Group_3__0 : rule__Table__Group_3__0__Impl rule__Table__Group_3__1 ;
    public final void rule__Table__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:777:1: ( rule__Table__Group_3__0__Impl rule__Table__Group_3__1 )
            // InternalExpression.g:778:2: rule__Table__Group_3__0__Impl rule__Table__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Table__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_3__1();

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
    // $ANTLR end "rule__Table__Group_3__0"


    // $ANTLR start "rule__Table__Group_3__0__Impl"
    // InternalExpression.g:785:1: rule__Table__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:789:1: ( ( ',' ) )
            // InternalExpression.g:790:1: ( ',' )
            {
            // InternalExpression.g:790:1: ( ',' )
            // InternalExpression.g:791:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Table__Group_3__0__Impl"


    // $ANTLR start "rule__Table__Group_3__1"
    // InternalExpression.g:800:1: rule__Table__Group_3__1 : rule__Table__Group_3__1__Impl ;
    public final void rule__Table__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:804:1: ( rule__Table__Group_3__1__Impl )
            // InternalExpression.g:805:2: rule__Table__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_3__1__Impl();

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
    // $ANTLR end "rule__Table__Group_3__1"


    // $ANTLR start "rule__Table__Group_3__1__Impl"
    // InternalExpression.g:811:1: rule__Table__Group_3__1__Impl : ( ( rule__Table__ColumnsAssignment_3_1 ) ) ;
    public final void rule__Table__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:815:1: ( ( ( rule__Table__ColumnsAssignment_3_1 ) ) )
            // InternalExpression.g:816:1: ( ( rule__Table__ColumnsAssignment_3_1 ) )
            {
            // InternalExpression.g:816:1: ( ( rule__Table__ColumnsAssignment_3_1 ) )
            // InternalExpression.g:817:2: ( rule__Table__ColumnsAssignment_3_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_3_1()); 
            // InternalExpression.g:818:2: ( rule__Table__ColumnsAssignment_3_1 )
            // InternalExpression.g:818:3: rule__Table__ColumnsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_3_1()); 

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
    // $ANTLR end "rule__Table__Group_3__1__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalExpression.g:827:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:831:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalExpression.g:832:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

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
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalExpression.g:839:1: rule__Label__Group__0__Impl : ( 'lbl_' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:843:1: ( ( 'lbl_' ) )
            // InternalExpression.g:844:1: ( 'lbl_' )
            {
            // InternalExpression.g:844:1: ( 'lbl_' )
            // InternalExpression.g:845:2: 'lbl_'
            {
             before(grammarAccess.getLabelAccess().getLbl_Keyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLbl_Keyword_0()); 

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
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalExpression.g:854:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:858:1: ( rule__Label__Group__1__Impl )
            // InternalExpression.g:859:2: rule__Label__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__1__Impl();

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
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalExpression.g:865:1: rule__Label__Group__1__Impl : ( ( rule__Label__NameAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:869:1: ( ( ( rule__Label__NameAssignment_1 ) ) )
            // InternalExpression.g:870:1: ( ( rule__Label__NameAssignment_1 ) )
            {
            // InternalExpression.g:870:1: ( ( rule__Label__NameAssignment_1 ) )
            // InternalExpression.g:871:2: ( rule__Label__NameAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment_1()); 
            // InternalExpression.g:872:2: ( rule__Label__NameAssignment_1 )
            // InternalExpression.g:872:3: rule__Label__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Label__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__TextView__Group__0"
    // InternalExpression.g:881:1: rule__TextView__Group__0 : rule__TextView__Group__0__Impl rule__TextView__Group__1 ;
    public final void rule__TextView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:885:1: ( rule__TextView__Group__0__Impl rule__TextView__Group__1 )
            // InternalExpression.g:886:2: rule__TextView__Group__0__Impl rule__TextView__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TextView__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextView__Group__1();

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
    // $ANTLR end "rule__TextView__Group__0"


    // $ANTLR start "rule__TextView__Group__0__Impl"
    // InternalExpression.g:893:1: rule__TextView__Group__0__Impl : ( 'txt_' ) ;
    public final void rule__TextView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:897:1: ( ( 'txt_' ) )
            // InternalExpression.g:898:1: ( 'txt_' )
            {
            // InternalExpression.g:898:1: ( 'txt_' )
            // InternalExpression.g:899:2: 'txt_'
            {
             before(grammarAccess.getTextViewAccess().getTxt_Keyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextViewAccess().getTxt_Keyword_0()); 

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
    // $ANTLR end "rule__TextView__Group__0__Impl"


    // $ANTLR start "rule__TextView__Group__1"
    // InternalExpression.g:908:1: rule__TextView__Group__1 : rule__TextView__Group__1__Impl ;
    public final void rule__TextView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:912:1: ( rule__TextView__Group__1__Impl )
            // InternalExpression.g:913:2: rule__TextView__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextView__Group__1__Impl();

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
    // $ANTLR end "rule__TextView__Group__1"


    // $ANTLR start "rule__TextView__Group__1__Impl"
    // InternalExpression.g:919:1: rule__TextView__Group__1__Impl : ( ( rule__TextView__NameAssignment_1 ) ) ;
    public final void rule__TextView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:923:1: ( ( ( rule__TextView__NameAssignment_1 ) ) )
            // InternalExpression.g:924:1: ( ( rule__TextView__NameAssignment_1 ) )
            {
            // InternalExpression.g:924:1: ( ( rule__TextView__NameAssignment_1 ) )
            // InternalExpression.g:925:2: ( rule__TextView__NameAssignment_1 )
            {
             before(grammarAccess.getTextViewAccess().getNameAssignment_1()); 
            // InternalExpression.g:926:2: ( rule__TextView__NameAssignment_1 )
            // InternalExpression.g:926:3: rule__TextView__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TextView__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextViewAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TextView__Group__1__Impl"


    // $ANTLR start "rule__ComboView__Group__0"
    // InternalExpression.g:935:1: rule__ComboView__Group__0 : rule__ComboView__Group__0__Impl rule__ComboView__Group__1 ;
    public final void rule__ComboView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:939:1: ( rule__ComboView__Group__0__Impl rule__ComboView__Group__1 )
            // InternalExpression.g:940:2: rule__ComboView__Group__0__Impl rule__ComboView__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ComboView__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComboView__Group__1();

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
    // $ANTLR end "rule__ComboView__Group__0"


    // $ANTLR start "rule__ComboView__Group__0__Impl"
    // InternalExpression.g:947:1: rule__ComboView__Group__0__Impl : ( '*' ) ;
    public final void rule__ComboView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:951:1: ( ( '*' ) )
            // InternalExpression.g:952:1: ( '*' )
            {
            // InternalExpression.g:952:1: ( '*' )
            // InternalExpression.g:953:2: '*'
            {
             before(grammarAccess.getComboViewAccess().getAsteriskKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComboViewAccess().getAsteriskKeyword_0()); 

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
    // $ANTLR end "rule__ComboView__Group__0__Impl"


    // $ANTLR start "rule__ComboView__Group__1"
    // InternalExpression.g:962:1: rule__ComboView__Group__1 : rule__ComboView__Group__1__Impl ;
    public final void rule__ComboView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:966:1: ( rule__ComboView__Group__1__Impl )
            // InternalExpression.g:967:2: rule__ComboView__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComboView__Group__1__Impl();

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
    // $ANTLR end "rule__ComboView__Group__1"


    // $ANTLR start "rule__ComboView__Group__1__Impl"
    // InternalExpression.g:973:1: rule__ComboView__Group__1__Impl : ( ( rule__ComboView__NameAssignment_1 ) ) ;
    public final void rule__ComboView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:977:1: ( ( ( rule__ComboView__NameAssignment_1 ) ) )
            // InternalExpression.g:978:1: ( ( rule__ComboView__NameAssignment_1 ) )
            {
            // InternalExpression.g:978:1: ( ( rule__ComboView__NameAssignment_1 ) )
            // InternalExpression.g:979:2: ( rule__ComboView__NameAssignment_1 )
            {
             before(grammarAccess.getComboViewAccess().getNameAssignment_1()); 
            // InternalExpression.g:980:2: ( rule__ComboView__NameAssignment_1 )
            // InternalExpression.g:980:3: rule__ComboView__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComboView__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComboViewAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ComboView__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalExpression.g:989:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:993:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalExpression.g:994:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__1();

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
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // InternalExpression.g:1001:1: rule__Button__Group__0__Impl : ( 'btn_' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1005:1: ( ( 'btn_' ) )
            // InternalExpression.g:1006:1: ( 'btn_' )
            {
            // InternalExpression.g:1006:1: ( 'btn_' )
            // InternalExpression.g:1007:2: 'btn_'
            {
             before(grammarAccess.getButtonAccess().getBtn_Keyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getBtn_Keyword_0()); 

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
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // InternalExpression.g:1016:1: rule__Button__Group__1 : rule__Button__Group__1__Impl ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1020:1: ( rule__Button__Group__1__Impl )
            // InternalExpression.g:1021:2: rule__Button__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__1__Impl();

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
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // InternalExpression.g:1027:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1031:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // InternalExpression.g:1032:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // InternalExpression.g:1032:1: ( ( rule__Button__NameAssignment_1 ) )
            // InternalExpression.g:1033:2: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // InternalExpression.g:1034:2: ( rule__Button__NameAssignment_1 )
            // InternalExpression.g:1034:3: rule__Button__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Button__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment_0"
    // InternalExpression.g:1043:1: rule__Model__ElementsAssignment_0 : ( ruleContainer ) ;
    public final void rule__Model__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1047:1: ( ( ruleContainer ) )
            // InternalExpression.g:1048:2: ( ruleContainer )
            {
            // InternalExpression.g:1048:2: ( ruleContainer )
            // InternalExpression.g:1049:3: ruleContainer
            {
             before(grammarAccess.getModelAccess().getElementsContainerParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsContainerParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_0"


    // $ANTLR start "rule__Container__NameAssignment_0"
    // InternalExpression.g:1058:1: rule__Container__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Container__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1062:1: ( ( RULE_ID ) )
            // InternalExpression.g:1063:2: ( RULE_ID )
            {
            // InternalExpression.g:1063:2: ( RULE_ID )
            // InternalExpression.g:1064:3: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Container__NameAssignment_0"


    // $ANTLR start "rule__Container__ElementsAssignment_3"
    // InternalExpression.g:1073:1: rule__Container__ElementsAssignment_3 : ( ruleElement ) ;
    public final void rule__Container__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1077:1: ( ( ruleElement ) )
            // InternalExpression.g:1078:2: ( ruleElement )
            {
            // InternalExpression.g:1078:2: ( ruleElement )
            // InternalExpression.g:1079:3: ruleElement
            {
             before(grammarAccess.getContainerAccess().getElementsElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getElementsElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Container__ElementsAssignment_3"


    // $ANTLR start "rule__Container__ElementsAssignment_4_1"
    // InternalExpression.g:1088:1: rule__Container__ElementsAssignment_4_1 : ( ruleElement ) ;
    public final void rule__Container__ElementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1092:1: ( ( ruleElement ) )
            // InternalExpression.g:1093:2: ( ruleElement )
            {
            // InternalExpression.g:1093:2: ( ruleElement )
            // InternalExpression.g:1094:3: ruleElement
            {
             before(grammarAccess.getContainerAccess().getElementsElementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getElementsElementParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Container__ElementsAssignment_4_1"


    // $ANTLR start "rule__Table__NameAssignment_0"
    // InternalExpression.g:1103:1: rule__Table__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1107:1: ( ( RULE_ID ) )
            // InternalExpression.g:1108:2: ( RULE_ID )
            {
            // InternalExpression.g:1108:2: ( RULE_ID )
            // InternalExpression.g:1109:3: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Table__NameAssignment_0"


    // $ANTLR start "rule__Table__ColumnsAssignment_2"
    // InternalExpression.g:1118:1: rule__Table__ColumnsAssignment_2 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1122:1: ( ( ruleColumn ) )
            // InternalExpression.g:1123:2: ( ruleColumn )
            {
            // InternalExpression.g:1123:2: ( ruleColumn )
            // InternalExpression.g:1124:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Table__ColumnsAssignment_2"


    // $ANTLR start "rule__Table__ColumnsAssignment_3_1"
    // InternalExpression.g:1133:1: rule__Table__ColumnsAssignment_3_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1137:1: ( ( ruleColumn ) )
            // InternalExpression.g:1138:2: ( ruleColumn )
            {
            // InternalExpression.g:1138:2: ( ruleColumn )
            // InternalExpression.g:1139:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Table__ColumnsAssignment_3_1"


    // $ANTLR start "rule__Column__NameAssignment"
    // InternalExpression.g:1148:1: rule__Column__NameAssignment : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1152:1: ( ( RULE_ID ) )
            // InternalExpression.g:1153:2: ( RULE_ID )
            {
            // InternalExpression.g:1153:2: ( RULE_ID )
            // InternalExpression.g:1154:3: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Column__NameAssignment"


    // $ANTLR start "rule__Label__NameAssignment_1"
    // InternalExpression.g:1163:1: rule__Label__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Label__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1167:1: ( ( RULE_ID ) )
            // InternalExpression.g:1168:2: ( RULE_ID )
            {
            // InternalExpression.g:1168:2: ( RULE_ID )
            // InternalExpression.g:1169:3: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Label__NameAssignment_1"


    // $ANTLR start "rule__TextView__NameAssignment_1"
    // InternalExpression.g:1178:1: rule__TextView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TextView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1182:1: ( ( RULE_ID ) )
            // InternalExpression.g:1183:2: ( RULE_ID )
            {
            // InternalExpression.g:1183:2: ( RULE_ID )
            // InternalExpression.g:1184:3: RULE_ID
            {
             before(grammarAccess.getTextViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextViewAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TextView__NameAssignment_1"


    // $ANTLR start "rule__ComboView__NameAssignment_1"
    // InternalExpression.g:1193:1: rule__ComboView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComboView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1197:1: ( ( RULE_ID ) )
            // InternalExpression.g:1198:2: ( RULE_ID )
            {
            // InternalExpression.g:1198:2: ( RULE_ID )
            // InternalExpression.g:1199:3: RULE_ID
            {
             before(grammarAccess.getComboViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComboViewAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ComboView__NameAssignment_1"


    // $ANTLR start "rule__Button__NameAssignment_1"
    // InternalExpression.g:1208:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpression.g:1212:1: ( ( RULE_ID ) )
            // InternalExpression.g:1213:2: ( RULE_ID )
            {
            // InternalExpression.g:1213:2: ( RULE_ID )
            // InternalExpression.g:1214:3: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Button__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000780010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000050000L});

}