package org.xtext.example.compras.ide.contentassist.antlr.internal;

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
import org.xtext.example.compras.services.ComprasGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComprasParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AllowedToUse'", "'string'", "'int'", "'bool'", "'float'", "'datetime'", "'SQLSERVER'", "'ORACLE (future...)'", "'POSTGRES (future...)'", "'SolutionName'", "':'", "'{'", "'Domain'", "'Architecture'", "'Technology'", "'}'", "'.'", "'Module'", "'Entities'", "'Functionalities'", "'['", "'label'", "']'", "'RelEntity'", "'Layers'", "'PresentationLayer'", "'BusinessLayer'", "'DataAccessLayer'", "'CommonLayer'", "'Relations'", "'ControllerSegmentLayer'", "'ViewSegmentLayer'", "'ScriptSegmentLayer'", "'DbConnectorSegmentLayer'", "'AspNet'", "'Database'", "'DatabaseRDBMSType'", "'ConnectionString'", "'Controller'", "'View'", "'Script'", "'BLogic'", "'DataAccess'", "'DtoModel'", "'required'", "'CREATE'", "'VIEW_GRID'", "'VIEW_DROPDOWN'", "'EDIT'", "'DELETE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalComprasParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComprasParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComprasParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCompras.g"; }


    	private ComprasGrammarAccess grammarAccess;

    	public void setGrammarAccess(ComprasGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSolution"
    // InternalCompras.g:53:1: entryRuleSolution : ruleSolution EOF ;
    public final void entryRuleSolution() throws RecognitionException {
        try {
            // InternalCompras.g:54:1: ( ruleSolution EOF )
            // InternalCompras.g:55:1: ruleSolution EOF
            {
             before(grammarAccess.getSolutionRule()); 
            pushFollow(FOLLOW_1);
            ruleSolution();

            state._fsp--;

             after(grammarAccess.getSolutionRule()); 
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
    // $ANTLR end "entryRuleSolution"


    // $ANTLR start "ruleSolution"
    // InternalCompras.g:62:1: ruleSolution : ( ( rule__Solution__Group__0 ) ) ;
    public final void ruleSolution() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:66:2: ( ( ( rule__Solution__Group__0 ) ) )
            // InternalCompras.g:67:2: ( ( rule__Solution__Group__0 ) )
            {
            // InternalCompras.g:67:2: ( ( rule__Solution__Group__0 ) )
            // InternalCompras.g:68:3: ( rule__Solution__Group__0 )
            {
             before(grammarAccess.getSolutionAccess().getGroup()); 
            // InternalCompras.g:69:3: ( rule__Solution__Group__0 )
            // InternalCompras.g:69:4: rule__Solution__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Solution__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSolutionAccess().getGroup()); 

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
    // $ANTLR end "ruleSolution"


    // $ANTLR start "entryRuleFQN"
    // InternalCompras.g:78:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalCompras.g:79:1: ( ruleFQN EOF )
            // InternalCompras.g:80:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalCompras.g:87:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:91:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalCompras.g:92:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalCompras.g:92:2: ( ( rule__FQN__Group__0 ) )
            // InternalCompras.g:93:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalCompras.g:94:3: ( rule__FQN__Group__0 )
            // InternalCompras.g:94:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleDomain"
    // InternalCompras.g:103:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalCompras.g:104:1: ( ruleDomain EOF )
            // InternalCompras.g:105:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalCompras.g:112:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:116:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalCompras.g:117:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalCompras.g:117:2: ( ( rule__Domain__Group__0 ) )
            // InternalCompras.g:118:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalCompras.g:119:3: ( rule__Domain__Group__0 )
            // InternalCompras.g:119:4: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleModule"
    // InternalCompras.g:128:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalCompras.g:129:1: ( ruleModule EOF )
            // InternalCompras.g:130:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalCompras.g:137:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:141:2: ( ( ( rule__Module__Group__0 ) ) )
            // InternalCompras.g:142:2: ( ( rule__Module__Group__0 ) )
            {
            // InternalCompras.g:142:2: ( ( rule__Module__Group__0 ) )
            // InternalCompras.g:143:3: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // InternalCompras.g:144:3: ( rule__Module__Group__0 )
            // InternalCompras.g:144:4: rule__Module__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleEntity"
    // InternalCompras.g:153:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalCompras.g:154:1: ( ruleEntity EOF )
            // InternalCompras.g:155:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalCompras.g:162:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:166:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalCompras.g:167:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalCompras.g:167:2: ( ( rule__Entity__Group__0 ) )
            // InternalCompras.g:168:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalCompras.g:169:3: ( rule__Entity__Group__0 )
            // InternalCompras.g:169:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityField"
    // InternalCompras.g:178:1: entryRuleEntityField : ruleEntityField EOF ;
    public final void entryRuleEntityField() throws RecognitionException {
        try {
            // InternalCompras.g:179:1: ( ruleEntityField EOF )
            // InternalCompras.g:180:1: ruleEntityField EOF
            {
             before(grammarAccess.getEntityFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityField();

            state._fsp--;

             after(grammarAccess.getEntityFieldRule()); 
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
    // $ANTLR end "entryRuleEntityField"


    // $ANTLR start "ruleEntityField"
    // InternalCompras.g:187:1: ruleEntityField : ( ( rule__EntityField__Group__0 ) ) ;
    public final void ruleEntityField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:191:2: ( ( ( rule__EntityField__Group__0 ) ) )
            // InternalCompras.g:192:2: ( ( rule__EntityField__Group__0 ) )
            {
            // InternalCompras.g:192:2: ( ( rule__EntityField__Group__0 ) )
            // InternalCompras.g:193:3: ( rule__EntityField__Group__0 )
            {
             before(grammarAccess.getEntityFieldAccess().getGroup()); 
            // InternalCompras.g:194:3: ( rule__EntityField__Group__0 )
            // InternalCompras.g:194:4: rule__EntityField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityField"


    // $ANTLR start "entryRuleEntityFieldLabel"
    // InternalCompras.g:203:1: entryRuleEntityFieldLabel : ruleEntityFieldLabel EOF ;
    public final void entryRuleEntityFieldLabel() throws RecognitionException {
        try {
            // InternalCompras.g:204:1: ( ruleEntityFieldLabel EOF )
            // InternalCompras.g:205:1: ruleEntityFieldLabel EOF
            {
             before(grammarAccess.getEntityFieldLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityFieldLabel();

            state._fsp--;

             after(grammarAccess.getEntityFieldLabelRule()); 
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
    // $ANTLR end "entryRuleEntityFieldLabel"


    // $ANTLR start "ruleEntityFieldLabel"
    // InternalCompras.g:212:1: ruleEntityFieldLabel : ( ( rule__EntityFieldLabel__Group__0 ) ) ;
    public final void ruleEntityFieldLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:216:2: ( ( ( rule__EntityFieldLabel__Group__0 ) ) )
            // InternalCompras.g:217:2: ( ( rule__EntityFieldLabel__Group__0 ) )
            {
            // InternalCompras.g:217:2: ( ( rule__EntityFieldLabel__Group__0 ) )
            // InternalCompras.g:218:3: ( rule__EntityFieldLabel__Group__0 )
            {
             before(grammarAccess.getEntityFieldLabelAccess().getGroup()); 
            // InternalCompras.g:219:3: ( rule__EntityFieldLabel__Group__0 )
            // InternalCompras.g:219:4: rule__EntityFieldLabel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityFieldLabel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityFieldLabelAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityFieldLabel"


    // $ANTLR start "entryRuleEntityFieldRequired"
    // InternalCompras.g:228:1: entryRuleEntityFieldRequired : ruleEntityFieldRequired EOF ;
    public final void entryRuleEntityFieldRequired() throws RecognitionException {
        try {
            // InternalCompras.g:229:1: ( ruleEntityFieldRequired EOF )
            // InternalCompras.g:230:1: ruleEntityFieldRequired EOF
            {
             before(grammarAccess.getEntityFieldRequiredRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityFieldRequired();

            state._fsp--;

             after(grammarAccess.getEntityFieldRequiredRule()); 
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
    // $ANTLR end "entryRuleEntityFieldRequired"


    // $ANTLR start "ruleEntityFieldRequired"
    // InternalCompras.g:237:1: ruleEntityFieldRequired : ( ( rule__EntityFieldRequired__Group__0 ) ) ;
    public final void ruleEntityFieldRequired() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:241:2: ( ( ( rule__EntityFieldRequired__Group__0 ) ) )
            // InternalCompras.g:242:2: ( ( rule__EntityFieldRequired__Group__0 ) )
            {
            // InternalCompras.g:242:2: ( ( rule__EntityFieldRequired__Group__0 ) )
            // InternalCompras.g:243:3: ( rule__EntityFieldRequired__Group__0 )
            {
             before(grammarAccess.getEntityFieldRequiredAccess().getGroup()); 
            // InternalCompras.g:244:3: ( rule__EntityFieldRequired__Group__0 )
            // InternalCompras.g:244:4: rule__EntityFieldRequired__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityFieldRequired__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityFieldRequiredAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityFieldRequired"


    // $ANTLR start "entryRuleEntityType"
    // InternalCompras.g:253:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // InternalCompras.g:254:1: ( ruleEntityType EOF )
            // InternalCompras.g:255:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalCompras.g:262:1: ruleEntityType : ( ( rule__EntityType__Alternatives ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:266:2: ( ( ( rule__EntityType__Alternatives ) ) )
            // InternalCompras.g:267:2: ( ( rule__EntityType__Alternatives ) )
            {
            // InternalCompras.g:267:2: ( ( rule__EntityType__Alternatives ) )
            // InternalCompras.g:268:3: ( rule__EntityType__Alternatives )
            {
             before(grammarAccess.getEntityTypeAccess().getAlternatives()); 
            // InternalCompras.g:269:3: ( rule__EntityType__Alternatives )
            // InternalCompras.g:269:4: rule__EntityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EntityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleFunctionality"
    // InternalCompras.g:278:1: entryRuleFunctionality : ruleFunctionality EOF ;
    public final void entryRuleFunctionality() throws RecognitionException {
        try {
            // InternalCompras.g:279:1: ( ruleFunctionality EOF )
            // InternalCompras.g:280:1: ruleFunctionality EOF
            {
             before(grammarAccess.getFunctionalityRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionality();

            state._fsp--;

             after(grammarAccess.getFunctionalityRule()); 
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
    // $ANTLR end "entryRuleFunctionality"


    // $ANTLR start "ruleFunctionality"
    // InternalCompras.g:287:1: ruleFunctionality : ( ( rule__Functionality__Group__0 ) ) ;
    public final void ruleFunctionality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:291:2: ( ( ( rule__Functionality__Group__0 ) ) )
            // InternalCompras.g:292:2: ( ( rule__Functionality__Group__0 ) )
            {
            // InternalCompras.g:292:2: ( ( rule__Functionality__Group__0 ) )
            // InternalCompras.g:293:3: ( rule__Functionality__Group__0 )
            {
             before(grammarAccess.getFunctionalityAccess().getGroup()); 
            // InternalCompras.g:294:3: ( rule__Functionality__Group__0 )
            // InternalCompras.g:294:4: rule__Functionality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionality"


    // $ANTLR start "entryRuleFunctionalityActionType"
    // InternalCompras.g:303:1: entryRuleFunctionalityActionType : ruleFunctionalityActionType EOF ;
    public final void entryRuleFunctionalityActionType() throws RecognitionException {
        try {
            // InternalCompras.g:304:1: ( ruleFunctionalityActionType EOF )
            // InternalCompras.g:305:1: ruleFunctionalityActionType EOF
            {
             before(grammarAccess.getFunctionalityActionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionalityActionType();

            state._fsp--;

             after(grammarAccess.getFunctionalityActionTypeRule()); 
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
    // $ANTLR end "entryRuleFunctionalityActionType"


    // $ANTLR start "ruleFunctionalityActionType"
    // InternalCompras.g:312:1: ruleFunctionalityActionType : ( ( rule__FunctionalityActionType__Alternatives ) ) ;
    public final void ruleFunctionalityActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:316:2: ( ( ( rule__FunctionalityActionType__Alternatives ) ) )
            // InternalCompras.g:317:2: ( ( rule__FunctionalityActionType__Alternatives ) )
            {
            // InternalCompras.g:317:2: ( ( rule__FunctionalityActionType__Alternatives ) )
            // InternalCompras.g:318:3: ( rule__FunctionalityActionType__Alternatives )
            {
             before(grammarAccess.getFunctionalityActionTypeAccess().getAlternatives()); 
            // InternalCompras.g:319:3: ( rule__FunctionalityActionType__Alternatives )
            // InternalCompras.g:319:4: rule__FunctionalityActionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FunctionalityActionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityActionTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFunctionalityActionType"


    // $ANTLR start "entryRuleFuncCreateAction"
    // InternalCompras.g:328:1: entryRuleFuncCreateAction : ruleFuncCreateAction EOF ;
    public final void entryRuleFuncCreateAction() throws RecognitionException {
        try {
            // InternalCompras.g:329:1: ( ruleFuncCreateAction EOF )
            // InternalCompras.g:330:1: ruleFuncCreateAction EOF
            {
             before(grammarAccess.getFuncCreateActionRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncCreateAction();

            state._fsp--;

             after(grammarAccess.getFuncCreateActionRule()); 
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
    // $ANTLR end "entryRuleFuncCreateAction"


    // $ANTLR start "ruleFuncCreateAction"
    // InternalCompras.g:337:1: ruleFuncCreateAction : ( ( rule__FuncCreateAction__NameAssignment ) ) ;
    public final void ruleFuncCreateAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:341:2: ( ( ( rule__FuncCreateAction__NameAssignment ) ) )
            // InternalCompras.g:342:2: ( ( rule__FuncCreateAction__NameAssignment ) )
            {
            // InternalCompras.g:342:2: ( ( rule__FuncCreateAction__NameAssignment ) )
            // InternalCompras.g:343:3: ( rule__FuncCreateAction__NameAssignment )
            {
             before(grammarAccess.getFuncCreateActionAccess().getNameAssignment()); 
            // InternalCompras.g:344:3: ( rule__FuncCreateAction__NameAssignment )
            // InternalCompras.g:344:4: rule__FuncCreateAction__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FuncCreateAction__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFuncCreateActionAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleFuncCreateAction"


    // $ANTLR start "entryRuleFuncViewGridAction"
    // InternalCompras.g:353:1: entryRuleFuncViewGridAction : ruleFuncViewGridAction EOF ;
    public final void entryRuleFuncViewGridAction() throws RecognitionException {
        try {
            // InternalCompras.g:354:1: ( ruleFuncViewGridAction EOF )
            // InternalCompras.g:355:1: ruleFuncViewGridAction EOF
            {
             before(grammarAccess.getFuncViewGridActionRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncViewGridAction();

            state._fsp--;

             after(grammarAccess.getFuncViewGridActionRule()); 
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
    // $ANTLR end "entryRuleFuncViewGridAction"


    // $ANTLR start "ruleFuncViewGridAction"
    // InternalCompras.g:362:1: ruleFuncViewGridAction : ( ( rule__FuncViewGridAction__NameAssignment ) ) ;
    public final void ruleFuncViewGridAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:366:2: ( ( ( rule__FuncViewGridAction__NameAssignment ) ) )
            // InternalCompras.g:367:2: ( ( rule__FuncViewGridAction__NameAssignment ) )
            {
            // InternalCompras.g:367:2: ( ( rule__FuncViewGridAction__NameAssignment ) )
            // InternalCompras.g:368:3: ( rule__FuncViewGridAction__NameAssignment )
            {
             before(grammarAccess.getFuncViewGridActionAccess().getNameAssignment()); 
            // InternalCompras.g:369:3: ( rule__FuncViewGridAction__NameAssignment )
            // InternalCompras.g:369:4: rule__FuncViewGridAction__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FuncViewGridAction__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFuncViewGridActionAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleFuncViewGridAction"


    // $ANTLR start "entryRuleFuncViewDropDownAction"
    // InternalCompras.g:378:1: entryRuleFuncViewDropDownAction : ruleFuncViewDropDownAction EOF ;
    public final void entryRuleFuncViewDropDownAction() throws RecognitionException {
        try {
            // InternalCompras.g:379:1: ( ruleFuncViewDropDownAction EOF )
            // InternalCompras.g:380:1: ruleFuncViewDropDownAction EOF
            {
             before(grammarAccess.getFuncViewDropDownActionRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncViewDropDownAction();

            state._fsp--;

             after(grammarAccess.getFuncViewDropDownActionRule()); 
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
    // $ANTLR end "entryRuleFuncViewDropDownAction"


    // $ANTLR start "ruleFuncViewDropDownAction"
    // InternalCompras.g:387:1: ruleFuncViewDropDownAction : ( ( rule__FuncViewDropDownAction__NameAssignment ) ) ;
    public final void ruleFuncViewDropDownAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:391:2: ( ( ( rule__FuncViewDropDownAction__NameAssignment ) ) )
            // InternalCompras.g:392:2: ( ( rule__FuncViewDropDownAction__NameAssignment ) )
            {
            // InternalCompras.g:392:2: ( ( rule__FuncViewDropDownAction__NameAssignment ) )
            // InternalCompras.g:393:3: ( rule__FuncViewDropDownAction__NameAssignment )
            {
             before(grammarAccess.getFuncViewDropDownActionAccess().getNameAssignment()); 
            // InternalCompras.g:394:3: ( rule__FuncViewDropDownAction__NameAssignment )
            // InternalCompras.g:394:4: rule__FuncViewDropDownAction__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FuncViewDropDownAction__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFuncViewDropDownActionAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleFuncViewDropDownAction"


    // $ANTLR start "entryRuleFuncEditAction"
    // InternalCompras.g:403:1: entryRuleFuncEditAction : ruleFuncEditAction EOF ;
    public final void entryRuleFuncEditAction() throws RecognitionException {
        try {
            // InternalCompras.g:404:1: ( ruleFuncEditAction EOF )
            // InternalCompras.g:405:1: ruleFuncEditAction EOF
            {
             before(grammarAccess.getFuncEditActionRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncEditAction();

            state._fsp--;

             after(grammarAccess.getFuncEditActionRule()); 
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
    // $ANTLR end "entryRuleFuncEditAction"


    // $ANTLR start "ruleFuncEditAction"
    // InternalCompras.g:412:1: ruleFuncEditAction : ( ( rule__FuncEditAction__NameAssignment ) ) ;
    public final void ruleFuncEditAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:416:2: ( ( ( rule__FuncEditAction__NameAssignment ) ) )
            // InternalCompras.g:417:2: ( ( rule__FuncEditAction__NameAssignment ) )
            {
            // InternalCompras.g:417:2: ( ( rule__FuncEditAction__NameAssignment ) )
            // InternalCompras.g:418:3: ( rule__FuncEditAction__NameAssignment )
            {
             before(grammarAccess.getFuncEditActionAccess().getNameAssignment()); 
            // InternalCompras.g:419:3: ( rule__FuncEditAction__NameAssignment )
            // InternalCompras.g:419:4: rule__FuncEditAction__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FuncEditAction__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFuncEditActionAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleFuncEditAction"


    // $ANTLR start "entryRuleFuncDeleteAction"
    // InternalCompras.g:428:1: entryRuleFuncDeleteAction : ruleFuncDeleteAction EOF ;
    public final void entryRuleFuncDeleteAction() throws RecognitionException {
        try {
            // InternalCompras.g:429:1: ( ruleFuncDeleteAction EOF )
            // InternalCompras.g:430:1: ruleFuncDeleteAction EOF
            {
             before(grammarAccess.getFuncDeleteActionRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncDeleteAction();

            state._fsp--;

             after(grammarAccess.getFuncDeleteActionRule()); 
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
    // $ANTLR end "entryRuleFuncDeleteAction"


    // $ANTLR start "ruleFuncDeleteAction"
    // InternalCompras.g:437:1: ruleFuncDeleteAction : ( ( rule__FuncDeleteAction__NameAssignment ) ) ;
    public final void ruleFuncDeleteAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:441:2: ( ( ( rule__FuncDeleteAction__NameAssignment ) ) )
            // InternalCompras.g:442:2: ( ( rule__FuncDeleteAction__NameAssignment ) )
            {
            // InternalCompras.g:442:2: ( ( rule__FuncDeleteAction__NameAssignment ) )
            // InternalCompras.g:443:3: ( rule__FuncDeleteAction__NameAssignment )
            {
             before(grammarAccess.getFuncDeleteActionAccess().getNameAssignment()); 
            // InternalCompras.g:444:3: ( rule__FuncDeleteAction__NameAssignment )
            // InternalCompras.g:444:4: rule__FuncDeleteAction__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FuncDeleteAction__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFuncDeleteActionAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleFuncDeleteAction"


    // $ANTLR start "entryRuleArchitecture"
    // InternalCompras.g:453:1: entryRuleArchitecture : ruleArchitecture EOF ;
    public final void entryRuleArchitecture() throws RecognitionException {
        try {
            // InternalCompras.g:454:1: ( ruleArchitecture EOF )
            // InternalCompras.g:455:1: ruleArchitecture EOF
            {
             before(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_1);
            ruleArchitecture();

            state._fsp--;

             after(grammarAccess.getArchitectureRule()); 
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
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // InternalCompras.g:462:1: ruleArchitecture : ( ( rule__Architecture__Group__0 ) ) ;
    public final void ruleArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:466:2: ( ( ( rule__Architecture__Group__0 ) ) )
            // InternalCompras.g:467:2: ( ( rule__Architecture__Group__0 ) )
            {
            // InternalCompras.g:467:2: ( ( rule__Architecture__Group__0 ) )
            // InternalCompras.g:468:3: ( rule__Architecture__Group__0 )
            {
             before(grammarAccess.getArchitectureAccess().getGroup()); 
            // InternalCompras.g:469:3: ( rule__Architecture__Group__0 )
            // InternalCompras.g:469:4: rule__Architecture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getGroup()); 

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
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRulePresentationLayer"
    // InternalCompras.g:478:1: entryRulePresentationLayer : rulePresentationLayer EOF ;
    public final void entryRulePresentationLayer() throws RecognitionException {
        try {
            // InternalCompras.g:479:1: ( rulePresentationLayer EOF )
            // InternalCompras.g:480:1: rulePresentationLayer EOF
            {
             before(grammarAccess.getPresentationLayerRule()); 
            pushFollow(FOLLOW_1);
            rulePresentationLayer();

            state._fsp--;

             after(grammarAccess.getPresentationLayerRule()); 
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
    // $ANTLR end "entryRulePresentationLayer"


    // $ANTLR start "rulePresentationLayer"
    // InternalCompras.g:487:1: rulePresentationLayer : ( ( rule__PresentationLayer__Group__0 ) ) ;
    public final void rulePresentationLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:491:2: ( ( ( rule__PresentationLayer__Group__0 ) ) )
            // InternalCompras.g:492:2: ( ( rule__PresentationLayer__Group__0 ) )
            {
            // InternalCompras.g:492:2: ( ( rule__PresentationLayer__Group__0 ) )
            // InternalCompras.g:493:3: ( rule__PresentationLayer__Group__0 )
            {
             before(grammarAccess.getPresentationLayerAccess().getGroup()); 
            // InternalCompras.g:494:3: ( rule__PresentationLayer__Group__0 )
            // InternalCompras.g:494:4: rule__PresentationLayer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PresentationLayer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPresentationLayerAccess().getGroup()); 

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
    // $ANTLR end "rulePresentationLayer"


    // $ANTLR start "entryRuleControllerSegmentLayer"
    // InternalCompras.g:503:1: entryRuleControllerSegmentLayer : ruleControllerSegmentLayer EOF ;
    public final void entryRuleControllerSegmentLayer() throws RecognitionException {
        try {
            // InternalCompras.g:504:1: ( ruleControllerSegmentLayer EOF )
            // InternalCompras.g:505:1: ruleControllerSegmentLayer EOF
            {
             before(grammarAccess.getControllerSegmentLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleControllerSegmentLayer();

            state._fsp--;

             after(grammarAccess.getControllerSegmentLayerRule()); 
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
    // $ANTLR end "entryRuleControllerSegmentLayer"


    // $ANTLR start "ruleControllerSegmentLayer"
    // InternalCompras.g:512:1: ruleControllerSegmentLayer : ( ( rule__ControllerSegmentLayer__NameAssignment ) ) ;
    public final void ruleControllerSegmentLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:516:2: ( ( ( rule__ControllerSegmentLayer__NameAssignment ) ) )
            // InternalCompras.g:517:2: ( ( rule__ControllerSegmentLayer__NameAssignment ) )
            {
            // InternalCompras.g:517:2: ( ( rule__ControllerSegmentLayer__NameAssignment ) )
            // InternalCompras.g:518:3: ( rule__ControllerSegmentLayer__NameAssignment )
            {
             before(grammarAccess.getControllerSegmentLayerAccess().getNameAssignment()); 
            // InternalCompras.g:519:3: ( rule__ControllerSegmentLayer__NameAssignment )
            // InternalCompras.g:519:4: rule__ControllerSegmentLayer__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ControllerSegmentLayer__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getControllerSegmentLayerAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleControllerSegmentLayer"


    // $ANTLR start "entryRuleViewSegmentLayer"
    // InternalCompras.g:528:1: entryRuleViewSegmentLayer : ruleViewSegmentLayer EOF ;
    public final void entryRuleViewSegmentLayer() throws RecognitionException {
        try {
            // InternalCompras.g:529:1: ( ruleViewSegmentLayer EOF )
            // InternalCompras.g:530:1: ruleViewSegmentLayer EOF
            {
             before(grammarAccess.getViewSegmentLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleViewSegmentLayer();

            state._fsp--;

             after(grammarAccess.getViewSegmentLayerRule()); 
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
    // $ANTLR end "entryRuleViewSegmentLayer"


    // $ANTLR start "ruleViewSegmentLayer"
    // InternalCompras.g:537:1: ruleViewSegmentLayer : ( ( rule__ViewSegmentLayer__NameAssignment ) ) ;
    public final void ruleViewSegmentLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:541:2: ( ( ( rule__ViewSegmentLayer__NameAssignment ) ) )
            // InternalCompras.g:542:2: ( ( rule__ViewSegmentLayer__NameAssignment ) )
            {
            // InternalCompras.g:542:2: ( ( rule__ViewSegmentLayer__NameAssignment ) )
            // InternalCompras.g:543:3: ( rule__ViewSegmentLayer__NameAssignment )
            {
             before(grammarAccess.getViewSegmentLayerAccess().getNameAssignment()); 
            // InternalCompras.g:544:3: ( rule__ViewSegmentLayer__NameAssignment )
            // InternalCompras.g:544:4: rule__ViewSegmentLayer__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ViewSegmentLayer__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getViewSegmentLayerAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleViewSegmentLayer"


    // $ANTLR start "entryRuleScriptSegmentLayer"
    // InternalCompras.g:553:1: entryRuleScriptSegmentLayer : ruleScriptSegmentLayer EOF ;
    public final void entryRuleScriptSegmentLayer() throws RecognitionException {
        try {
            // InternalCompras.g:554:1: ( ruleScriptSegmentLayer EOF )
            // InternalCompras.g:555:1: ruleScriptSegmentLayer EOF
            {
             before(grammarAccess.getScriptSegmentLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleScriptSegmentLayer();

            state._fsp--;

             after(grammarAccess.getScriptSegmentLayerRule()); 
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
    // $ANTLR end "entryRuleScriptSegmentLayer"


    // $ANTLR start "ruleScriptSegmentLayer"
    // InternalCompras.g:562:1: ruleScriptSegmentLayer : ( ( rule__ScriptSegmentLayer__NameAssignment ) ) ;
    public final void ruleScriptSegmentLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:566:2: ( ( ( rule__ScriptSegmentLayer__NameAssignment ) ) )
            // InternalCompras.g:567:2: ( ( rule__ScriptSegmentLayer__NameAssignment ) )
            {
            // InternalCompras.g:567:2: ( ( rule__ScriptSegmentLayer__NameAssignment ) )
            // InternalCompras.g:568:3: ( rule__ScriptSegmentLayer__NameAssignment )
            {
             before(grammarAccess.getScriptSegmentLayerAccess().getNameAssignment()); 
            // InternalCompras.g:569:3: ( rule__ScriptSegmentLayer__NameAssignment )
            // InternalCompras.g:569:4: rule__ScriptSegmentLayer__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ScriptSegmentLayer__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getScriptSegmentLayerAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleScriptSegmentLayer"


    // $ANTLR start "entryRuleBusinessLayer"
    // InternalCompras.g:578:1: entryRuleBusinessLayer : ruleBusinessLayer EOF ;
    public final void entryRuleBusinessLayer() throws RecognitionException {
        try {
            // InternalCompras.g:579:1: ( ruleBusinessLayer EOF )
            // InternalCompras.g:580:1: ruleBusinessLayer EOF
            {
             before(grammarAccess.getBusinessLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleBusinessLayer();

            state._fsp--;

             after(grammarAccess.getBusinessLayerRule()); 
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
    // $ANTLR end "entryRuleBusinessLayer"


    // $ANTLR start "ruleBusinessLayer"
    // InternalCompras.g:587:1: ruleBusinessLayer : ( ( rule__BusinessLayer__NameAssignment ) ) ;
    public final void ruleBusinessLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:591:2: ( ( ( rule__BusinessLayer__NameAssignment ) ) )
            // InternalCompras.g:592:2: ( ( rule__BusinessLayer__NameAssignment ) )
            {
            // InternalCompras.g:592:2: ( ( rule__BusinessLayer__NameAssignment ) )
            // InternalCompras.g:593:3: ( rule__BusinessLayer__NameAssignment )
            {
             before(grammarAccess.getBusinessLayerAccess().getNameAssignment()); 
            // InternalCompras.g:594:3: ( rule__BusinessLayer__NameAssignment )
            // InternalCompras.g:594:4: rule__BusinessLayer__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BusinessLayer__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBusinessLayerAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleBusinessLayer"


    // $ANTLR start "entryRuleDataAccessLayer"
    // InternalCompras.g:603:1: entryRuleDataAccessLayer : ruleDataAccessLayer EOF ;
    public final void entryRuleDataAccessLayer() throws RecognitionException {
        try {
            // InternalCompras.g:604:1: ( ruleDataAccessLayer EOF )
            // InternalCompras.g:605:1: ruleDataAccessLayer EOF
            {
             before(grammarAccess.getDataAccessLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleDataAccessLayer();

            state._fsp--;

             after(grammarAccess.getDataAccessLayerRule()); 
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
    // $ANTLR end "entryRuleDataAccessLayer"


    // $ANTLR start "ruleDataAccessLayer"
    // InternalCompras.g:612:1: ruleDataAccessLayer : ( ( rule__DataAccessLayer__Group__0 ) ) ;
    public final void ruleDataAccessLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:616:2: ( ( ( rule__DataAccessLayer__Group__0 ) ) )
            // InternalCompras.g:617:2: ( ( rule__DataAccessLayer__Group__0 ) )
            {
            // InternalCompras.g:617:2: ( ( rule__DataAccessLayer__Group__0 ) )
            // InternalCompras.g:618:3: ( rule__DataAccessLayer__Group__0 )
            {
             before(grammarAccess.getDataAccessLayerAccess().getGroup()); 
            // InternalCompras.g:619:3: ( rule__DataAccessLayer__Group__0 )
            // InternalCompras.g:619:4: rule__DataAccessLayer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessLayer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessLayerAccess().getGroup()); 

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
    // $ANTLR end "ruleDataAccessLayer"


    // $ANTLR start "entryRuleDbConnectorSegmentLayer"
    // InternalCompras.g:628:1: entryRuleDbConnectorSegmentLayer : ruleDbConnectorSegmentLayer EOF ;
    public final void entryRuleDbConnectorSegmentLayer() throws RecognitionException {
        try {
            // InternalCompras.g:629:1: ( ruleDbConnectorSegmentLayer EOF )
            // InternalCompras.g:630:1: ruleDbConnectorSegmentLayer EOF
            {
             before(grammarAccess.getDbConnectorSegmentLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleDbConnectorSegmentLayer();

            state._fsp--;

             after(grammarAccess.getDbConnectorSegmentLayerRule()); 
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
    // $ANTLR end "entryRuleDbConnectorSegmentLayer"


    // $ANTLR start "ruleDbConnectorSegmentLayer"
    // InternalCompras.g:637:1: ruleDbConnectorSegmentLayer : ( ( rule__DbConnectorSegmentLayer__NameAssignment ) ) ;
    public final void ruleDbConnectorSegmentLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:641:2: ( ( ( rule__DbConnectorSegmentLayer__NameAssignment ) ) )
            // InternalCompras.g:642:2: ( ( rule__DbConnectorSegmentLayer__NameAssignment ) )
            {
            // InternalCompras.g:642:2: ( ( rule__DbConnectorSegmentLayer__NameAssignment ) )
            // InternalCompras.g:643:3: ( rule__DbConnectorSegmentLayer__NameAssignment )
            {
             before(grammarAccess.getDbConnectorSegmentLayerAccess().getNameAssignment()); 
            // InternalCompras.g:644:3: ( rule__DbConnectorSegmentLayer__NameAssignment )
            // InternalCompras.g:644:4: rule__DbConnectorSegmentLayer__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DbConnectorSegmentLayer__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDbConnectorSegmentLayerAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleDbConnectorSegmentLayer"


    // $ANTLR start "entryRuleCommonLayer"
    // InternalCompras.g:653:1: entryRuleCommonLayer : ruleCommonLayer EOF ;
    public final void entryRuleCommonLayer() throws RecognitionException {
        try {
            // InternalCompras.g:654:1: ( ruleCommonLayer EOF )
            // InternalCompras.g:655:1: ruleCommonLayer EOF
            {
             before(grammarAccess.getCommonLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleCommonLayer();

            state._fsp--;

             after(grammarAccess.getCommonLayerRule()); 
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
    // $ANTLR end "entryRuleCommonLayer"


    // $ANTLR start "ruleCommonLayer"
    // InternalCompras.g:662:1: ruleCommonLayer : ( ( rule__CommonLayer__NameAssignment ) ) ;
    public final void ruleCommonLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:666:2: ( ( ( rule__CommonLayer__NameAssignment ) ) )
            // InternalCompras.g:667:2: ( ( rule__CommonLayer__NameAssignment ) )
            {
            // InternalCompras.g:667:2: ( ( rule__CommonLayer__NameAssignment ) )
            // InternalCompras.g:668:3: ( rule__CommonLayer__NameAssignment )
            {
             before(grammarAccess.getCommonLayerAccess().getNameAssignment()); 
            // InternalCompras.g:669:3: ( rule__CommonLayer__NameAssignment )
            // InternalCompras.g:669:4: rule__CommonLayer__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CommonLayer__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCommonLayerAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleCommonLayer"


    // $ANTLR start "entryRuleRelations"
    // InternalCompras.g:678:1: entryRuleRelations : ruleRelations EOF ;
    public final void entryRuleRelations() throws RecognitionException {
        try {
            // InternalCompras.g:679:1: ( ruleRelations EOF )
            // InternalCompras.g:680:1: ruleRelations EOF
            {
             before(grammarAccess.getRelationsRule()); 
            pushFollow(FOLLOW_1);
            ruleRelations();

            state._fsp--;

             after(grammarAccess.getRelationsRule()); 
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
    // $ANTLR end "entryRuleRelations"


    // $ANTLR start "ruleRelations"
    // InternalCompras.g:687:1: ruleRelations : ( ( rule__Relations__Group__0 ) ) ;
    public final void ruleRelations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:691:2: ( ( ( rule__Relations__Group__0 ) ) )
            // InternalCompras.g:692:2: ( ( rule__Relations__Group__0 ) )
            {
            // InternalCompras.g:692:2: ( ( rule__Relations__Group__0 ) )
            // InternalCompras.g:693:3: ( rule__Relations__Group__0 )
            {
             before(grammarAccess.getRelationsAccess().getGroup()); 
            // InternalCompras.g:694:3: ( rule__Relations__Group__0 )
            // InternalCompras.g:694:4: rule__Relations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getGroup()); 

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
    // $ANTLR end "ruleRelations"


    // $ANTLR start "entryRuleTechnology"
    // InternalCompras.g:703:1: entryRuleTechnology : ruleTechnology EOF ;
    public final void entryRuleTechnology() throws RecognitionException {
        try {
            // InternalCompras.g:704:1: ( ruleTechnology EOF )
            // InternalCompras.g:705:1: ruleTechnology EOF
            {
             before(grammarAccess.getTechnologyRule()); 
            pushFollow(FOLLOW_1);
            ruleTechnology();

            state._fsp--;

             after(grammarAccess.getTechnologyRule()); 
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
    // $ANTLR end "entryRuleTechnology"


    // $ANTLR start "ruleTechnology"
    // InternalCompras.g:712:1: ruleTechnology : ( ( rule__Technology__Group__0 ) ) ;
    public final void ruleTechnology() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:716:2: ( ( ( rule__Technology__Group__0 ) ) )
            // InternalCompras.g:717:2: ( ( rule__Technology__Group__0 ) )
            {
            // InternalCompras.g:717:2: ( ( rule__Technology__Group__0 ) )
            // InternalCompras.g:718:3: ( rule__Technology__Group__0 )
            {
             before(grammarAccess.getTechnologyAccess().getGroup()); 
            // InternalCompras.g:719:3: ( rule__Technology__Group__0 )
            // InternalCompras.g:719:4: rule__Technology__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyAccess().getGroup()); 

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
    // $ANTLR end "ruleTechnology"


    // $ANTLR start "entryRuleModuleTech"
    // InternalCompras.g:728:1: entryRuleModuleTech : ruleModuleTech EOF ;
    public final void entryRuleModuleTech() throws RecognitionException {
        try {
            // InternalCompras.g:729:1: ( ruleModuleTech EOF )
            // InternalCompras.g:730:1: ruleModuleTech EOF
            {
             before(grammarAccess.getModuleTechRule()); 
            pushFollow(FOLLOW_1);
            ruleModuleTech();

            state._fsp--;

             after(grammarAccess.getModuleTechRule()); 
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
    // $ANTLR end "entryRuleModuleTech"


    // $ANTLR start "ruleModuleTech"
    // InternalCompras.g:737:1: ruleModuleTech : ( ( rule__ModuleTech__Group__0 ) ) ;
    public final void ruleModuleTech() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:741:2: ( ( ( rule__ModuleTech__Group__0 ) ) )
            // InternalCompras.g:742:2: ( ( rule__ModuleTech__Group__0 ) )
            {
            // InternalCompras.g:742:2: ( ( rule__ModuleTech__Group__0 ) )
            // InternalCompras.g:743:3: ( rule__ModuleTech__Group__0 )
            {
             before(grammarAccess.getModuleTechAccess().getGroup()); 
            // InternalCompras.g:744:3: ( rule__ModuleTech__Group__0 )
            // InternalCompras.g:744:4: rule__ModuleTech__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleTechAccess().getGroup()); 

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
    // $ANTLR end "ruleModuleTech"


    // $ANTLR start "entryRuleControllersRef"
    // InternalCompras.g:753:1: entryRuleControllersRef : ruleControllersRef EOF ;
    public final void entryRuleControllersRef() throws RecognitionException {
        try {
            // InternalCompras.g:754:1: ( ruleControllersRef EOF )
            // InternalCompras.g:755:1: ruleControllersRef EOF
            {
             before(grammarAccess.getControllersRefRule()); 
            pushFollow(FOLLOW_1);
            ruleControllersRef();

            state._fsp--;

             after(grammarAccess.getControllersRefRule()); 
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
    // $ANTLR end "entryRuleControllersRef"


    // $ANTLR start "ruleControllersRef"
    // InternalCompras.g:762:1: ruleControllersRef : ( ( rule__ControllersRef__Group__0 ) ) ;
    public final void ruleControllersRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:766:2: ( ( ( rule__ControllersRef__Group__0 ) ) )
            // InternalCompras.g:767:2: ( ( rule__ControllersRef__Group__0 ) )
            {
            // InternalCompras.g:767:2: ( ( rule__ControllersRef__Group__0 ) )
            // InternalCompras.g:768:3: ( rule__ControllersRef__Group__0 )
            {
             before(grammarAccess.getControllersRefAccess().getGroup()); 
            // InternalCompras.g:769:3: ( rule__ControllersRef__Group__0 )
            // InternalCompras.g:769:4: rule__ControllersRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ControllersRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getControllersRefAccess().getGroup()); 

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
    // $ANTLR end "ruleControllersRef"


    // $ANTLR start "entryRuleViewsRef"
    // InternalCompras.g:778:1: entryRuleViewsRef : ruleViewsRef EOF ;
    public final void entryRuleViewsRef() throws RecognitionException {
        try {
            // InternalCompras.g:779:1: ( ruleViewsRef EOF )
            // InternalCompras.g:780:1: ruleViewsRef EOF
            {
             before(grammarAccess.getViewsRefRule()); 
            pushFollow(FOLLOW_1);
            ruleViewsRef();

            state._fsp--;

             after(grammarAccess.getViewsRefRule()); 
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
    // $ANTLR end "entryRuleViewsRef"


    // $ANTLR start "ruleViewsRef"
    // InternalCompras.g:787:1: ruleViewsRef : ( ( rule__ViewsRef__Group__0 ) ) ;
    public final void ruleViewsRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:791:2: ( ( ( rule__ViewsRef__Group__0 ) ) )
            // InternalCompras.g:792:2: ( ( rule__ViewsRef__Group__0 ) )
            {
            // InternalCompras.g:792:2: ( ( rule__ViewsRef__Group__0 ) )
            // InternalCompras.g:793:3: ( rule__ViewsRef__Group__0 )
            {
             before(grammarAccess.getViewsRefAccess().getGroup()); 
            // InternalCompras.g:794:3: ( rule__ViewsRef__Group__0 )
            // InternalCompras.g:794:4: rule__ViewsRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ViewsRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewsRefAccess().getGroup()); 

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
    // $ANTLR end "ruleViewsRef"


    // $ANTLR start "entryRuleScriptRef"
    // InternalCompras.g:803:1: entryRuleScriptRef : ruleScriptRef EOF ;
    public final void entryRuleScriptRef() throws RecognitionException {
        try {
            // InternalCompras.g:804:1: ( ruleScriptRef EOF )
            // InternalCompras.g:805:1: ruleScriptRef EOF
            {
             before(grammarAccess.getScriptRefRule()); 
            pushFollow(FOLLOW_1);
            ruleScriptRef();

            state._fsp--;

             after(grammarAccess.getScriptRefRule()); 
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
    // $ANTLR end "entryRuleScriptRef"


    // $ANTLR start "ruleScriptRef"
    // InternalCompras.g:812:1: ruleScriptRef : ( ( rule__ScriptRef__Group__0 ) ) ;
    public final void ruleScriptRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:816:2: ( ( ( rule__ScriptRef__Group__0 ) ) )
            // InternalCompras.g:817:2: ( ( rule__ScriptRef__Group__0 ) )
            {
            // InternalCompras.g:817:2: ( ( rule__ScriptRef__Group__0 ) )
            // InternalCompras.g:818:3: ( rule__ScriptRef__Group__0 )
            {
             before(grammarAccess.getScriptRefAccess().getGroup()); 
            // InternalCompras.g:819:3: ( rule__ScriptRef__Group__0 )
            // InternalCompras.g:819:4: rule__ScriptRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScriptRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScriptRefAccess().getGroup()); 

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
    // $ANTLR end "ruleScriptRef"


    // $ANTLR start "entryRuleBusinessLayerRef"
    // InternalCompras.g:828:1: entryRuleBusinessLayerRef : ruleBusinessLayerRef EOF ;
    public final void entryRuleBusinessLayerRef() throws RecognitionException {
        try {
            // InternalCompras.g:829:1: ( ruleBusinessLayerRef EOF )
            // InternalCompras.g:830:1: ruleBusinessLayerRef EOF
            {
             before(grammarAccess.getBusinessLayerRefRule()); 
            pushFollow(FOLLOW_1);
            ruleBusinessLayerRef();

            state._fsp--;

             after(grammarAccess.getBusinessLayerRefRule()); 
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
    // $ANTLR end "entryRuleBusinessLayerRef"


    // $ANTLR start "ruleBusinessLayerRef"
    // InternalCompras.g:837:1: ruleBusinessLayerRef : ( ( rule__BusinessLayerRef__Group__0 ) ) ;
    public final void ruleBusinessLayerRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:841:2: ( ( ( rule__BusinessLayerRef__Group__0 ) ) )
            // InternalCompras.g:842:2: ( ( rule__BusinessLayerRef__Group__0 ) )
            {
            // InternalCompras.g:842:2: ( ( rule__BusinessLayerRef__Group__0 ) )
            // InternalCompras.g:843:3: ( rule__BusinessLayerRef__Group__0 )
            {
             before(grammarAccess.getBusinessLayerRefAccess().getGroup()); 
            // InternalCompras.g:844:3: ( rule__BusinessLayerRef__Group__0 )
            // InternalCompras.g:844:4: rule__BusinessLayerRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BusinessLayerRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBusinessLayerRefAccess().getGroup()); 

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
    // $ANTLR end "ruleBusinessLayerRef"


    // $ANTLR start "entryRuleDataAccessLayerRef"
    // InternalCompras.g:853:1: entryRuleDataAccessLayerRef : ruleDataAccessLayerRef EOF ;
    public final void entryRuleDataAccessLayerRef() throws RecognitionException {
        try {
            // InternalCompras.g:854:1: ( ruleDataAccessLayerRef EOF )
            // InternalCompras.g:855:1: ruleDataAccessLayerRef EOF
            {
             before(grammarAccess.getDataAccessLayerRefRule()); 
            pushFollow(FOLLOW_1);
            ruleDataAccessLayerRef();

            state._fsp--;

             after(grammarAccess.getDataAccessLayerRefRule()); 
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
    // $ANTLR end "entryRuleDataAccessLayerRef"


    // $ANTLR start "ruleDataAccessLayerRef"
    // InternalCompras.g:862:1: ruleDataAccessLayerRef : ( ( rule__DataAccessLayerRef__Group__0 ) ) ;
    public final void ruleDataAccessLayerRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:866:2: ( ( ( rule__DataAccessLayerRef__Group__0 ) ) )
            // InternalCompras.g:867:2: ( ( rule__DataAccessLayerRef__Group__0 ) )
            {
            // InternalCompras.g:867:2: ( ( rule__DataAccessLayerRef__Group__0 ) )
            // InternalCompras.g:868:3: ( rule__DataAccessLayerRef__Group__0 )
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getGroup()); 
            // InternalCompras.g:869:3: ( rule__DataAccessLayerRef__Group__0 )
            // InternalCompras.g:869:4: rule__DataAccessLayerRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessLayerRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessLayerRefAccess().getGroup()); 

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
    // $ANTLR end "ruleDataAccessLayerRef"


    // $ANTLR start "entryRuleCommonLayerRef"
    // InternalCompras.g:878:1: entryRuleCommonLayerRef : ruleCommonLayerRef EOF ;
    public final void entryRuleCommonLayerRef() throws RecognitionException {
        try {
            // InternalCompras.g:879:1: ( ruleCommonLayerRef EOF )
            // InternalCompras.g:880:1: ruleCommonLayerRef EOF
            {
             before(grammarAccess.getCommonLayerRefRule()); 
            pushFollow(FOLLOW_1);
            ruleCommonLayerRef();

            state._fsp--;

             after(grammarAccess.getCommonLayerRefRule()); 
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
    // $ANTLR end "entryRuleCommonLayerRef"


    // $ANTLR start "ruleCommonLayerRef"
    // InternalCompras.g:887:1: ruleCommonLayerRef : ( ( rule__CommonLayerRef__Group__0 ) ) ;
    public final void ruleCommonLayerRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:891:2: ( ( ( rule__CommonLayerRef__Group__0 ) ) )
            // InternalCompras.g:892:2: ( ( rule__CommonLayerRef__Group__0 ) )
            {
            // InternalCompras.g:892:2: ( ( rule__CommonLayerRef__Group__0 ) )
            // InternalCompras.g:893:3: ( rule__CommonLayerRef__Group__0 )
            {
             before(grammarAccess.getCommonLayerRefAccess().getGroup()); 
            // InternalCompras.g:894:3: ( rule__CommonLayerRef__Group__0 )
            // InternalCompras.g:894:4: rule__CommonLayerRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommonLayerRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommonLayerRefAccess().getGroup()); 

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
    // $ANTLR end "ruleCommonLayerRef"


    // $ANTLR start "entryRuleConnectionString"
    // InternalCompras.g:903:1: entryRuleConnectionString : ruleConnectionString EOF ;
    public final void entryRuleConnectionString() throws RecognitionException {
        try {
            // InternalCompras.g:904:1: ( ruleConnectionString EOF )
            // InternalCompras.g:905:1: ruleConnectionString EOF
            {
             before(grammarAccess.getConnectionStringRule()); 
            pushFollow(FOLLOW_1);
            ruleConnectionString();

            state._fsp--;

             after(grammarAccess.getConnectionStringRule()); 
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
    // $ANTLR end "entryRuleConnectionString"


    // $ANTLR start "ruleConnectionString"
    // InternalCompras.g:912:1: ruleConnectionString : ( RULE_STRING ) ;
    public final void ruleConnectionString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:916:2: ( ( RULE_STRING ) )
            // InternalCompras.g:917:2: ( RULE_STRING )
            {
            // InternalCompras.g:917:2: ( RULE_STRING )
            // InternalCompras.g:918:3: RULE_STRING
            {
             before(grammarAccess.getConnectionStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnectionStringAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleConnectionString"


    // $ANTLR start "ruleCommonFieldType"
    // InternalCompras.g:928:1: ruleCommonFieldType : ( ( rule__CommonFieldType__Alternatives ) ) ;
    public final void ruleCommonFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:932:1: ( ( ( rule__CommonFieldType__Alternatives ) ) )
            // InternalCompras.g:933:2: ( ( rule__CommonFieldType__Alternatives ) )
            {
            // InternalCompras.g:933:2: ( ( rule__CommonFieldType__Alternatives ) )
            // InternalCompras.g:934:3: ( rule__CommonFieldType__Alternatives )
            {
             before(grammarAccess.getCommonFieldTypeAccess().getAlternatives()); 
            // InternalCompras.g:935:3: ( rule__CommonFieldType__Alternatives )
            // InternalCompras.g:935:4: rule__CommonFieldType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CommonFieldType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommonFieldTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCommonFieldType"


    // $ANTLR start "ruleRelationsType"
    // InternalCompras.g:944:1: ruleRelationsType : ( ( 'AllowedToUse' ) ) ;
    public final void ruleRelationsType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:948:1: ( ( ( 'AllowedToUse' ) ) )
            // InternalCompras.g:949:2: ( ( 'AllowedToUse' ) )
            {
            // InternalCompras.g:949:2: ( ( 'AllowedToUse' ) )
            // InternalCompras.g:950:3: ( 'AllowedToUse' )
            {
             before(grammarAccess.getRelationsTypeAccess().getALLOWED_TO_USEEnumLiteralDeclaration()); 
            // InternalCompras.g:951:3: ( 'AllowedToUse' )
            // InternalCompras.g:951:4: 'AllowedToUse'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getRelationsTypeAccess().getALLOWED_TO_USEEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleRelationsType"


    // $ANTLR start "ruleDatabaseRDBMSType"
    // InternalCompras.g:960:1: ruleDatabaseRDBMSType : ( ( rule__DatabaseRDBMSType__Alternatives ) ) ;
    public final void ruleDatabaseRDBMSType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:964:1: ( ( ( rule__DatabaseRDBMSType__Alternatives ) ) )
            // InternalCompras.g:965:2: ( ( rule__DatabaseRDBMSType__Alternatives ) )
            {
            // InternalCompras.g:965:2: ( ( rule__DatabaseRDBMSType__Alternatives ) )
            // InternalCompras.g:966:3: ( rule__DatabaseRDBMSType__Alternatives )
            {
             before(grammarAccess.getDatabaseRDBMSTypeAccess().getAlternatives()); 
            // InternalCompras.g:967:3: ( rule__DatabaseRDBMSType__Alternatives )
            // InternalCompras.g:967:4: rule__DatabaseRDBMSType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseRDBMSType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseRDBMSTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDatabaseRDBMSType"


    // $ANTLR start "rule__EntityType__Alternatives"
    // InternalCompras.g:975:1: rule__EntityType__Alternatives : ( ( ( rule__EntityType__EntityAssignment_0 ) ) | ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) ) );
    public final void rule__EntityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:979:1: ( ( ( rule__EntityType__EntityAssignment_0 ) ) | ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=12 && LA1_0<=16)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCompras.g:980:2: ( ( rule__EntityType__EntityAssignment_0 ) )
                    {
                    // InternalCompras.g:980:2: ( ( rule__EntityType__EntityAssignment_0 ) )
                    // InternalCompras.g:981:3: ( rule__EntityType__EntityAssignment_0 )
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityAssignment_0()); 
                    // InternalCompras.g:982:3: ( rule__EntityType__EntityAssignment_0 )
                    // InternalCompras.g:982:4: rule__EntityType__EntityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntityType__EntityAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityTypeAccess().getEntityAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:986:2: ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) )
                    {
                    // InternalCompras.g:986:2: ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) )
                    // InternalCompras.g:987:3: ( rule__EntityType__CommonFieldTypeAssignment_1 )
                    {
                     before(grammarAccess.getEntityTypeAccess().getCommonFieldTypeAssignment_1()); 
                    // InternalCompras.g:988:3: ( rule__EntityType__CommonFieldTypeAssignment_1 )
                    // InternalCompras.g:988:4: rule__EntityType__CommonFieldTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntityType__CommonFieldTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityTypeAccess().getCommonFieldTypeAssignment_1()); 

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
    // $ANTLR end "rule__EntityType__Alternatives"


    // $ANTLR start "rule__FunctionalityActionType__Alternatives"
    // InternalCompras.g:996:1: rule__FunctionalityActionType__Alternatives : ( ( ruleFuncCreateAction ) | ( ruleFuncViewGridAction ) | ( ruleFuncViewDropDownAction ) | ( ruleFuncEditAction ) | ( ruleFuncDeleteAction ) );
    public final void rule__FunctionalityActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1000:1: ( ( ruleFuncCreateAction ) | ( ruleFuncViewGridAction ) | ( ruleFuncViewDropDownAction ) | ( ruleFuncEditAction ) | ( ruleFuncDeleteAction ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt2=1;
                }
                break;
            case 57:
                {
                alt2=2;
                }
                break;
            case 58:
                {
                alt2=3;
                }
                break;
            case 59:
                {
                alt2=4;
                }
                break;
            case 60:
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
                    // InternalCompras.g:1001:2: ( ruleFuncCreateAction )
                    {
                    // InternalCompras.g:1001:2: ( ruleFuncCreateAction )
                    // InternalCompras.g:1002:3: ruleFuncCreateAction
                    {
                     before(grammarAccess.getFunctionalityActionTypeAccess().getFuncCreateActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFuncCreateAction();

                    state._fsp--;

                     after(grammarAccess.getFunctionalityActionTypeAccess().getFuncCreateActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:1007:2: ( ruleFuncViewGridAction )
                    {
                    // InternalCompras.g:1007:2: ( ruleFuncViewGridAction )
                    // InternalCompras.g:1008:3: ruleFuncViewGridAction
                    {
                     before(grammarAccess.getFunctionalityActionTypeAccess().getFuncViewGridActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFuncViewGridAction();

                    state._fsp--;

                     after(grammarAccess.getFunctionalityActionTypeAccess().getFuncViewGridActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:1013:2: ( ruleFuncViewDropDownAction )
                    {
                    // InternalCompras.g:1013:2: ( ruleFuncViewDropDownAction )
                    // InternalCompras.g:1014:3: ruleFuncViewDropDownAction
                    {
                     before(grammarAccess.getFunctionalityActionTypeAccess().getFuncViewDropDownActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFuncViewDropDownAction();

                    state._fsp--;

                     after(grammarAccess.getFunctionalityActionTypeAccess().getFuncViewDropDownActionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCompras.g:1019:2: ( ruleFuncEditAction )
                    {
                    // InternalCompras.g:1019:2: ( ruleFuncEditAction )
                    // InternalCompras.g:1020:3: ruleFuncEditAction
                    {
                     before(grammarAccess.getFunctionalityActionTypeAccess().getFuncEditActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFuncEditAction();

                    state._fsp--;

                     after(grammarAccess.getFunctionalityActionTypeAccess().getFuncEditActionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCompras.g:1025:2: ( ruleFuncDeleteAction )
                    {
                    // InternalCompras.g:1025:2: ( ruleFuncDeleteAction )
                    // InternalCompras.g:1026:3: ruleFuncDeleteAction
                    {
                     before(grammarAccess.getFunctionalityActionTypeAccess().getFuncDeleteActionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFuncDeleteAction();

                    state._fsp--;

                     after(grammarAccess.getFunctionalityActionTypeAccess().getFuncDeleteActionParserRuleCall_4()); 

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
    // $ANTLR end "rule__FunctionalityActionType__Alternatives"


    // $ANTLR start "rule__CommonFieldType__Alternatives"
    // InternalCompras.g:1035:1: rule__CommonFieldType__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'bool' ) ) | ( ( 'float' ) ) | ( ( 'datetime' ) ) );
    public final void rule__CommonFieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1039:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'bool' ) ) | ( ( 'float' ) ) | ( ( 'datetime' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCompras.g:1040:2: ( ( 'string' ) )
                    {
                    // InternalCompras.g:1040:2: ( ( 'string' ) )
                    // InternalCompras.g:1041:3: ( 'string' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalCompras.g:1042:3: ( 'string' )
                    // InternalCompras.g:1042:4: 'string'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:1046:2: ( ( 'int' ) )
                    {
                    // InternalCompras.g:1046:2: ( ( 'int' ) )
                    // InternalCompras.g:1047:3: ( 'int' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalCompras.g:1048:3: ( 'int' )
                    // InternalCompras.g:1048:4: 'int'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:1052:2: ( ( 'bool' ) )
                    {
                    // InternalCompras.g:1052:2: ( ( 'bool' ) )
                    // InternalCompras.g:1053:3: ( 'bool' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getBOOLEnumLiteralDeclaration_2()); 
                    // InternalCompras.g:1054:3: ( 'bool' )
                    // InternalCompras.g:1054:4: 'bool'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getBOOLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCompras.g:1058:2: ( ( 'float' ) )
                    {
                    // InternalCompras.g:1058:2: ( ( 'float' ) )
                    // InternalCompras.g:1059:3: ( 'float' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getFLOATEnumLiteralDeclaration_3()); 
                    // InternalCompras.g:1060:3: ( 'float' )
                    // InternalCompras.g:1060:4: 'float'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getFLOATEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCompras.g:1064:2: ( ( 'datetime' ) )
                    {
                    // InternalCompras.g:1064:2: ( ( 'datetime' ) )
                    // InternalCompras.g:1065:3: ( 'datetime' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getDATEEnumLiteralDeclaration_4()); 
                    // InternalCompras.g:1066:3: ( 'datetime' )
                    // InternalCompras.g:1066:4: 'datetime'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getDATEEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__CommonFieldType__Alternatives"


    // $ANTLR start "rule__DatabaseRDBMSType__Alternatives"
    // InternalCompras.g:1074:1: rule__DatabaseRDBMSType__Alternatives : ( ( ( 'SQLSERVER' ) ) | ( ( 'ORACLE (future...)' ) ) | ( ( 'POSTGRES (future...)' ) ) );
    public final void rule__DatabaseRDBMSType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1078:1: ( ( ( 'SQLSERVER' ) ) | ( ( 'ORACLE (future...)' ) ) | ( ( 'POSTGRES (future...)' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCompras.g:1079:2: ( ( 'SQLSERVER' ) )
                    {
                    // InternalCompras.g:1079:2: ( ( 'SQLSERVER' ) )
                    // InternalCompras.g:1080:3: ( 'SQLSERVER' )
                    {
                     before(grammarAccess.getDatabaseRDBMSTypeAccess().getSQLSERVEREnumLiteralDeclaration_0()); 
                    // InternalCompras.g:1081:3: ( 'SQLSERVER' )
                    // InternalCompras.g:1081:4: 'SQLSERVER'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseRDBMSTypeAccess().getSQLSERVEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:1085:2: ( ( 'ORACLE (future...)' ) )
                    {
                    // InternalCompras.g:1085:2: ( ( 'ORACLE (future...)' ) )
                    // InternalCompras.g:1086:3: ( 'ORACLE (future...)' )
                    {
                     before(grammarAccess.getDatabaseRDBMSTypeAccess().getORACLEEnumLiteralDeclaration_1()); 
                    // InternalCompras.g:1087:3: ( 'ORACLE (future...)' )
                    // InternalCompras.g:1087:4: 'ORACLE (future...)'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseRDBMSTypeAccess().getORACLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:1091:2: ( ( 'POSTGRES (future...)' ) )
                    {
                    // InternalCompras.g:1091:2: ( ( 'POSTGRES (future...)' ) )
                    // InternalCompras.g:1092:3: ( 'POSTGRES (future...)' )
                    {
                     before(grammarAccess.getDatabaseRDBMSTypeAccess().getPOSTGRESEnumLiteralDeclaration_2()); 
                    // InternalCompras.g:1093:3: ( 'POSTGRES (future...)' )
                    // InternalCompras.g:1093:4: 'POSTGRES (future...)'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseRDBMSTypeAccess().getPOSTGRESEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__DatabaseRDBMSType__Alternatives"


    // $ANTLR start "rule__Solution__Group__0"
    // InternalCompras.g:1101:1: rule__Solution__Group__0 : rule__Solution__Group__0__Impl rule__Solution__Group__1 ;
    public final void rule__Solution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1105:1: ( rule__Solution__Group__0__Impl rule__Solution__Group__1 )
            // InternalCompras.g:1106:2: rule__Solution__Group__0__Impl rule__Solution__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Solution__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__1();

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
    // $ANTLR end "rule__Solution__Group__0"


    // $ANTLR start "rule__Solution__Group__0__Impl"
    // InternalCompras.g:1113:1: rule__Solution__Group__0__Impl : ( 'SolutionName' ) ;
    public final void rule__Solution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1117:1: ( ( 'SolutionName' ) )
            // InternalCompras.g:1118:1: ( 'SolutionName' )
            {
            // InternalCompras.g:1118:1: ( 'SolutionName' )
            // InternalCompras.g:1119:2: 'SolutionName'
            {
             before(grammarAccess.getSolutionAccess().getSolutionNameKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getSolutionNameKeyword_0()); 

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
    // $ANTLR end "rule__Solution__Group__0__Impl"


    // $ANTLR start "rule__Solution__Group__1"
    // InternalCompras.g:1128:1: rule__Solution__Group__1 : rule__Solution__Group__1__Impl rule__Solution__Group__2 ;
    public final void rule__Solution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1132:1: ( rule__Solution__Group__1__Impl rule__Solution__Group__2 )
            // InternalCompras.g:1133:2: rule__Solution__Group__1__Impl rule__Solution__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Solution__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__2();

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
    // $ANTLR end "rule__Solution__Group__1"


    // $ANTLR start "rule__Solution__Group__1__Impl"
    // InternalCompras.g:1140:1: rule__Solution__Group__1__Impl : ( ':' ) ;
    public final void rule__Solution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1144:1: ( ( ':' ) )
            // InternalCompras.g:1145:1: ( ':' )
            {
            // InternalCompras.g:1145:1: ( ':' )
            // InternalCompras.g:1146:2: ':'
            {
             before(grammarAccess.getSolutionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Solution__Group__1__Impl"


    // $ANTLR start "rule__Solution__Group__2"
    // InternalCompras.g:1155:1: rule__Solution__Group__2 : rule__Solution__Group__2__Impl rule__Solution__Group__3 ;
    public final void rule__Solution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1159:1: ( rule__Solution__Group__2__Impl rule__Solution__Group__3 )
            // InternalCompras.g:1160:2: rule__Solution__Group__2__Impl rule__Solution__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Solution__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__3();

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
    // $ANTLR end "rule__Solution__Group__2"


    // $ANTLR start "rule__Solution__Group__2__Impl"
    // InternalCompras.g:1167:1: rule__Solution__Group__2__Impl : ( ( rule__Solution__NameAssignment_2 ) ) ;
    public final void rule__Solution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1171:1: ( ( ( rule__Solution__NameAssignment_2 ) ) )
            // InternalCompras.g:1172:1: ( ( rule__Solution__NameAssignment_2 ) )
            {
            // InternalCompras.g:1172:1: ( ( rule__Solution__NameAssignment_2 ) )
            // InternalCompras.g:1173:2: ( rule__Solution__NameAssignment_2 )
            {
             before(grammarAccess.getSolutionAccess().getNameAssignment_2()); 
            // InternalCompras.g:1174:2: ( rule__Solution__NameAssignment_2 )
            // InternalCompras.g:1174:3: rule__Solution__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Solution__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSolutionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Solution__Group__2__Impl"


    // $ANTLR start "rule__Solution__Group__3"
    // InternalCompras.g:1182:1: rule__Solution__Group__3 : rule__Solution__Group__3__Impl rule__Solution__Group__4 ;
    public final void rule__Solution__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1186:1: ( rule__Solution__Group__3__Impl rule__Solution__Group__4 )
            // InternalCompras.g:1187:2: rule__Solution__Group__3__Impl rule__Solution__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Solution__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__4();

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
    // $ANTLR end "rule__Solution__Group__3"


    // $ANTLR start "rule__Solution__Group__3__Impl"
    // InternalCompras.g:1194:1: rule__Solution__Group__3__Impl : ( '{' ) ;
    public final void rule__Solution__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1198:1: ( ( '{' ) )
            // InternalCompras.g:1199:1: ( '{' )
            {
            // InternalCompras.g:1199:1: ( '{' )
            // InternalCompras.g:1200:2: '{'
            {
             before(grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Solution__Group__3__Impl"


    // $ANTLR start "rule__Solution__Group__4"
    // InternalCompras.g:1209:1: rule__Solution__Group__4 : rule__Solution__Group__4__Impl rule__Solution__Group__5 ;
    public final void rule__Solution__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1213:1: ( rule__Solution__Group__4__Impl rule__Solution__Group__5 )
            // InternalCompras.g:1214:2: rule__Solution__Group__4__Impl rule__Solution__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Solution__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__5();

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
    // $ANTLR end "rule__Solution__Group__4"


    // $ANTLR start "rule__Solution__Group__4__Impl"
    // InternalCompras.g:1221:1: rule__Solution__Group__4__Impl : ( 'Domain' ) ;
    public final void rule__Solution__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1225:1: ( ( 'Domain' ) )
            // InternalCompras.g:1226:1: ( 'Domain' )
            {
            // InternalCompras.g:1226:1: ( 'Domain' )
            // InternalCompras.g:1227:2: 'Domain'
            {
             before(grammarAccess.getSolutionAccess().getDomainKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getDomainKeyword_4()); 

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
    // $ANTLR end "rule__Solution__Group__4__Impl"


    // $ANTLR start "rule__Solution__Group__5"
    // InternalCompras.g:1236:1: rule__Solution__Group__5 : rule__Solution__Group__5__Impl rule__Solution__Group__6 ;
    public final void rule__Solution__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1240:1: ( rule__Solution__Group__5__Impl rule__Solution__Group__6 )
            // InternalCompras.g:1241:2: rule__Solution__Group__5__Impl rule__Solution__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Solution__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__6();

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
    // $ANTLR end "rule__Solution__Group__5"


    // $ANTLR start "rule__Solution__Group__5__Impl"
    // InternalCompras.g:1248:1: rule__Solution__Group__5__Impl : ( ':' ) ;
    public final void rule__Solution__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1252:1: ( ( ':' ) )
            // InternalCompras.g:1253:1: ( ':' )
            {
            // InternalCompras.g:1253:1: ( ':' )
            // InternalCompras.g:1254:2: ':'
            {
             before(grammarAccess.getSolutionAccess().getColonKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__Solution__Group__5__Impl"


    // $ANTLR start "rule__Solution__Group__6"
    // InternalCompras.g:1263:1: rule__Solution__Group__6 : rule__Solution__Group__6__Impl rule__Solution__Group__7 ;
    public final void rule__Solution__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1267:1: ( rule__Solution__Group__6__Impl rule__Solution__Group__7 )
            // InternalCompras.g:1268:2: rule__Solution__Group__6__Impl rule__Solution__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Solution__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__7();

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
    // $ANTLR end "rule__Solution__Group__6"


    // $ANTLR start "rule__Solution__Group__6__Impl"
    // InternalCompras.g:1275:1: rule__Solution__Group__6__Impl : ( ( rule__Solution__DomainAssignment_6 )? ) ;
    public final void rule__Solution__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1279:1: ( ( ( rule__Solution__DomainAssignment_6 )? ) )
            // InternalCompras.g:1280:1: ( ( rule__Solution__DomainAssignment_6 )? )
            {
            // InternalCompras.g:1280:1: ( ( rule__Solution__DomainAssignment_6 )? )
            // InternalCompras.g:1281:2: ( rule__Solution__DomainAssignment_6 )?
            {
             before(grammarAccess.getSolutionAccess().getDomainAssignment_6()); 
            // InternalCompras.g:1282:2: ( rule__Solution__DomainAssignment_6 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCompras.g:1282:3: rule__Solution__DomainAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Solution__DomainAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolutionAccess().getDomainAssignment_6()); 

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
    // $ANTLR end "rule__Solution__Group__6__Impl"


    // $ANTLR start "rule__Solution__Group__7"
    // InternalCompras.g:1290:1: rule__Solution__Group__7 : rule__Solution__Group__7__Impl rule__Solution__Group__8 ;
    public final void rule__Solution__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1294:1: ( rule__Solution__Group__7__Impl rule__Solution__Group__8 )
            // InternalCompras.g:1295:2: rule__Solution__Group__7__Impl rule__Solution__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__Solution__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__8();

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
    // $ANTLR end "rule__Solution__Group__7"


    // $ANTLR start "rule__Solution__Group__7__Impl"
    // InternalCompras.g:1302:1: rule__Solution__Group__7__Impl : ( 'Architecture' ) ;
    public final void rule__Solution__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1306:1: ( ( 'Architecture' ) )
            // InternalCompras.g:1307:1: ( 'Architecture' )
            {
            // InternalCompras.g:1307:1: ( 'Architecture' )
            // InternalCompras.g:1308:2: 'Architecture'
            {
             before(grammarAccess.getSolutionAccess().getArchitectureKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getArchitectureKeyword_7()); 

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
    // $ANTLR end "rule__Solution__Group__7__Impl"


    // $ANTLR start "rule__Solution__Group__8"
    // InternalCompras.g:1317:1: rule__Solution__Group__8 : rule__Solution__Group__8__Impl rule__Solution__Group__9 ;
    public final void rule__Solution__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1321:1: ( rule__Solution__Group__8__Impl rule__Solution__Group__9 )
            // InternalCompras.g:1322:2: rule__Solution__Group__8__Impl rule__Solution__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Solution__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__9();

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
    // $ANTLR end "rule__Solution__Group__8"


    // $ANTLR start "rule__Solution__Group__8__Impl"
    // InternalCompras.g:1329:1: rule__Solution__Group__8__Impl : ( ':' ) ;
    public final void rule__Solution__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1333:1: ( ( ':' ) )
            // InternalCompras.g:1334:1: ( ':' )
            {
            // InternalCompras.g:1334:1: ( ':' )
            // InternalCompras.g:1335:2: ':'
            {
             before(grammarAccess.getSolutionAccess().getColonKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getColonKeyword_8()); 

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
    // $ANTLR end "rule__Solution__Group__8__Impl"


    // $ANTLR start "rule__Solution__Group__9"
    // InternalCompras.g:1344:1: rule__Solution__Group__9 : rule__Solution__Group__9__Impl rule__Solution__Group__10 ;
    public final void rule__Solution__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1348:1: ( rule__Solution__Group__9__Impl rule__Solution__Group__10 )
            // InternalCompras.g:1349:2: rule__Solution__Group__9__Impl rule__Solution__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Solution__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__10();

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
    // $ANTLR end "rule__Solution__Group__9"


    // $ANTLR start "rule__Solution__Group__9__Impl"
    // InternalCompras.g:1356:1: rule__Solution__Group__9__Impl : ( ( rule__Solution__ArchitectureAssignment_9 )? ) ;
    public final void rule__Solution__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1360:1: ( ( ( rule__Solution__ArchitectureAssignment_9 )? ) )
            // InternalCompras.g:1361:1: ( ( rule__Solution__ArchitectureAssignment_9 )? )
            {
            // InternalCompras.g:1361:1: ( ( rule__Solution__ArchitectureAssignment_9 )? )
            // InternalCompras.g:1362:2: ( rule__Solution__ArchitectureAssignment_9 )?
            {
             before(grammarAccess.getSolutionAccess().getArchitectureAssignment_9()); 
            // InternalCompras.g:1363:2: ( rule__Solution__ArchitectureAssignment_9 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCompras.g:1363:3: rule__Solution__ArchitectureAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Solution__ArchitectureAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolutionAccess().getArchitectureAssignment_9()); 

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
    // $ANTLR end "rule__Solution__Group__9__Impl"


    // $ANTLR start "rule__Solution__Group__10"
    // InternalCompras.g:1371:1: rule__Solution__Group__10 : rule__Solution__Group__10__Impl rule__Solution__Group__11 ;
    public final void rule__Solution__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1375:1: ( rule__Solution__Group__10__Impl rule__Solution__Group__11 )
            // InternalCompras.g:1376:2: rule__Solution__Group__10__Impl rule__Solution__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__Solution__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__11();

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
    // $ANTLR end "rule__Solution__Group__10"


    // $ANTLR start "rule__Solution__Group__10__Impl"
    // InternalCompras.g:1383:1: rule__Solution__Group__10__Impl : ( 'Technology' ) ;
    public final void rule__Solution__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1387:1: ( ( 'Technology' ) )
            // InternalCompras.g:1388:1: ( 'Technology' )
            {
            // InternalCompras.g:1388:1: ( 'Technology' )
            // InternalCompras.g:1389:2: 'Technology'
            {
             before(grammarAccess.getSolutionAccess().getTechnologyKeyword_10()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getTechnologyKeyword_10()); 

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
    // $ANTLR end "rule__Solution__Group__10__Impl"


    // $ANTLR start "rule__Solution__Group__11"
    // InternalCompras.g:1398:1: rule__Solution__Group__11 : rule__Solution__Group__11__Impl rule__Solution__Group__12 ;
    public final void rule__Solution__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1402:1: ( rule__Solution__Group__11__Impl rule__Solution__Group__12 )
            // InternalCompras.g:1403:2: rule__Solution__Group__11__Impl rule__Solution__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Solution__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__12();

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
    // $ANTLR end "rule__Solution__Group__11"


    // $ANTLR start "rule__Solution__Group__11__Impl"
    // InternalCompras.g:1410:1: rule__Solution__Group__11__Impl : ( ':' ) ;
    public final void rule__Solution__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1414:1: ( ( ':' ) )
            // InternalCompras.g:1415:1: ( ':' )
            {
            // InternalCompras.g:1415:1: ( ':' )
            // InternalCompras.g:1416:2: ':'
            {
             before(grammarAccess.getSolutionAccess().getColonKeyword_11()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getColonKeyword_11()); 

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
    // $ANTLR end "rule__Solution__Group__11__Impl"


    // $ANTLR start "rule__Solution__Group__12"
    // InternalCompras.g:1425:1: rule__Solution__Group__12 : rule__Solution__Group__12__Impl rule__Solution__Group__13 ;
    public final void rule__Solution__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1429:1: ( rule__Solution__Group__12__Impl rule__Solution__Group__13 )
            // InternalCompras.g:1430:2: rule__Solution__Group__12__Impl rule__Solution__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__Solution__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__13();

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
    // $ANTLR end "rule__Solution__Group__12"


    // $ANTLR start "rule__Solution__Group__12__Impl"
    // InternalCompras.g:1437:1: rule__Solution__Group__12__Impl : ( ( rule__Solution__TechnologyAssignment_12 )? ) ;
    public final void rule__Solution__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1441:1: ( ( ( rule__Solution__TechnologyAssignment_12 )? ) )
            // InternalCompras.g:1442:1: ( ( rule__Solution__TechnologyAssignment_12 )? )
            {
            // InternalCompras.g:1442:1: ( ( rule__Solution__TechnologyAssignment_12 )? )
            // InternalCompras.g:1443:2: ( rule__Solution__TechnologyAssignment_12 )?
            {
             before(grammarAccess.getSolutionAccess().getTechnologyAssignment_12()); 
            // InternalCompras.g:1444:2: ( rule__Solution__TechnologyAssignment_12 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCompras.g:1444:3: rule__Solution__TechnologyAssignment_12
                    {
                    pushFollow(FOLLOW_2);
                    rule__Solution__TechnologyAssignment_12();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolutionAccess().getTechnologyAssignment_12()); 

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
    // $ANTLR end "rule__Solution__Group__12__Impl"


    // $ANTLR start "rule__Solution__Group__13"
    // InternalCompras.g:1452:1: rule__Solution__Group__13 : rule__Solution__Group__13__Impl ;
    public final void rule__Solution__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1456:1: ( rule__Solution__Group__13__Impl )
            // InternalCompras.g:1457:2: rule__Solution__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Solution__Group__13__Impl();

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
    // $ANTLR end "rule__Solution__Group__13"


    // $ANTLR start "rule__Solution__Group__13__Impl"
    // InternalCompras.g:1463:1: rule__Solution__Group__13__Impl : ( '}' ) ;
    public final void rule__Solution__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1467:1: ( ( '}' ) )
            // InternalCompras.g:1468:1: ( '}' )
            {
            // InternalCompras.g:1468:1: ( '}' )
            // InternalCompras.g:1469:2: '}'
            {
             before(grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_13()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Solution__Group__13__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalCompras.g:1479:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1483:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCompras.g:1484:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalCompras.g:1491:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1495:1: ( ( RULE_ID ) )
            // InternalCompras.g:1496:1: ( RULE_ID )
            {
            // InternalCompras.g:1496:1: ( RULE_ID )
            // InternalCompras.g:1497:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalCompras.g:1506:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1510:1: ( rule__FQN__Group__1__Impl )
            // InternalCompras.g:1511:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalCompras.g:1517:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1521:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCompras.g:1522:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCompras.g:1522:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCompras.g:1523:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCompras.g:1524:2: ( rule__FQN__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCompras.g:1524:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalCompras.g:1533:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1537:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCompras.g:1538:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

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
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalCompras.g:1545:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1549:1: ( ( '.' ) )
            // InternalCompras.g:1550:1: ( '.' )
            {
            // InternalCompras.g:1550:1: ( '.' )
            // InternalCompras.g:1551:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalCompras.g:1560:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1564:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCompras.g:1565:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalCompras.g:1571:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1575:1: ( ( RULE_ID ) )
            // InternalCompras.g:1576:1: ( RULE_ID )
            {
            // InternalCompras.g:1576:1: ( RULE_ID )
            // InternalCompras.g:1577:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalCompras.g:1587:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1591:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalCompras.g:1592:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__1();

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
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // InternalCompras.g:1599:1: rule__Domain__Group__0__Impl : ( '{' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1603:1: ( ( '{' ) )
            // InternalCompras.g:1604:1: ( '{' )
            {
            // InternalCompras.g:1604:1: ( '{' )
            // InternalCompras.g:1605:2: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // InternalCompras.g:1614:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1618:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalCompras.g:1619:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Domain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__2();

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
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // InternalCompras.g:1626:1: rule__Domain__Group__1__Impl : ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1630:1: ( ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) ) )
            // InternalCompras.g:1631:1: ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) )
            {
            // InternalCompras.g:1631:1: ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) )
            // InternalCompras.g:1632:2: ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* )
            {
            // InternalCompras.g:1632:2: ( ( rule__Domain__ModuleAssignment_1 ) )
            // InternalCompras.g:1633:3: ( rule__Domain__ModuleAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getModuleAssignment_1()); 
            // InternalCompras.g:1634:3: ( rule__Domain__ModuleAssignment_1 )
            // InternalCompras.g:1634:4: rule__Domain__ModuleAssignment_1
            {
            pushFollow(FOLLOW_14);
            rule__Domain__ModuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getModuleAssignment_1()); 

            }

            // InternalCompras.g:1637:2: ( ( rule__Domain__ModuleAssignment_1 )* )
            // InternalCompras.g:1638:3: ( rule__Domain__ModuleAssignment_1 )*
            {
             before(grammarAccess.getDomainAccess().getModuleAssignment_1()); 
            // InternalCompras.g:1639:3: ( rule__Domain__ModuleAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCompras.g:1639:4: rule__Domain__ModuleAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Domain__ModuleAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getModuleAssignment_1()); 

            }


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
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // InternalCompras.g:1648:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1652:1: ( rule__Domain__Group__2__Impl )
            // InternalCompras.g:1653:2: rule__Domain__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__2__Impl();

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
    // $ANTLR end "rule__Domain__Group__2"


    // $ANTLR start "rule__Domain__Group__2__Impl"
    // InternalCompras.g:1659:1: rule__Domain__Group__2__Impl : ( '}' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1663:1: ( ( '}' ) )
            // InternalCompras.g:1664:1: ( '}' )
            {
            // InternalCompras.g:1664:1: ( '}' )
            // InternalCompras.g:1665:2: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__0"
    // InternalCompras.g:1675:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1679:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalCompras.g:1680:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__1();

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
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // InternalCompras.g:1687:1: rule__Module__Group__0__Impl : ( 'Module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1691:1: ( ( 'Module' ) )
            // InternalCompras.g:1692:1: ( 'Module' )
            {
            // InternalCompras.g:1692:1: ( 'Module' )
            // InternalCompras.g:1693:2: 'Module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_0()); 

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
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // InternalCompras.g:1702:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1706:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalCompras.g:1707:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__2();

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
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // InternalCompras.g:1714:1: rule__Module__Group__1__Impl : ( ':' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1718:1: ( ( ':' ) )
            // InternalCompras.g:1719:1: ( ':' )
            {
            // InternalCompras.g:1719:1: ( ':' )
            // InternalCompras.g:1720:2: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // InternalCompras.g:1729:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1733:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalCompras.g:1734:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__3();

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
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // InternalCompras.g:1741:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1745:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // InternalCompras.g:1746:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // InternalCompras.g:1746:1: ( ( rule__Module__NameAssignment_2 ) )
            // InternalCompras.g:1747:2: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // InternalCompras.g:1748:2: ( rule__Module__NameAssignment_2 )
            // InternalCompras.g:1748:3: rule__Module__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Module__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // InternalCompras.g:1756:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1760:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalCompras.g:1761:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__4();

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
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // InternalCompras.g:1768:1: rule__Module__Group__3__Impl : ( ':' ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1772:1: ( ( ':' ) )
            // InternalCompras.g:1773:1: ( ':' )
            {
            // InternalCompras.g:1773:1: ( ':' )
            // InternalCompras.g:1774:2: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // InternalCompras.g:1783:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1787:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // InternalCompras.g:1788:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Module__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__5();

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
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // InternalCompras.g:1795:1: rule__Module__Group__4__Impl : ( '{' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1799:1: ( ( '{' ) )
            // InternalCompras.g:1800:1: ( '{' )
            {
            // InternalCompras.g:1800:1: ( '{' )
            // InternalCompras.g:1801:2: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Module__Group__5"
    // InternalCompras.g:1810:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1814:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // InternalCompras.g:1815:2: rule__Module__Group__5__Impl rule__Module__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Module__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__6();

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
    // $ANTLR end "rule__Module__Group__5"


    // $ANTLR start "rule__Module__Group__5__Impl"
    // InternalCompras.g:1822:1: rule__Module__Group__5__Impl : ( 'Entities' ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1826:1: ( ( 'Entities' ) )
            // InternalCompras.g:1827:1: ( 'Entities' )
            {
            // InternalCompras.g:1827:1: ( 'Entities' )
            // InternalCompras.g:1828:2: 'Entities'
            {
             before(grammarAccess.getModuleAccess().getEntitiesKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getEntitiesKeyword_5()); 

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
    // $ANTLR end "rule__Module__Group__5__Impl"


    // $ANTLR start "rule__Module__Group__6"
    // InternalCompras.g:1837:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1841:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // InternalCompras.g:1842:2: rule__Module__Group__6__Impl rule__Module__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Module__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__7();

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
    // $ANTLR end "rule__Module__Group__6"


    // $ANTLR start "rule__Module__Group__6__Impl"
    // InternalCompras.g:1849:1: rule__Module__Group__6__Impl : ( ':' ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1853:1: ( ( ':' ) )
            // InternalCompras.g:1854:1: ( ':' )
            {
            // InternalCompras.g:1854:1: ( ':' )
            // InternalCompras.g:1855:2: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__Module__Group__6__Impl"


    // $ANTLR start "rule__Module__Group__7"
    // InternalCompras.g:1864:1: rule__Module__Group__7 : rule__Module__Group__7__Impl rule__Module__Group__8 ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1868:1: ( rule__Module__Group__7__Impl rule__Module__Group__8 )
            // InternalCompras.g:1869:2: rule__Module__Group__7__Impl rule__Module__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Module__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__8();

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
    // $ANTLR end "rule__Module__Group__7"


    // $ANTLR start "rule__Module__Group__7__Impl"
    // InternalCompras.g:1876:1: rule__Module__Group__7__Impl : ( '{' ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1880:1: ( ( '{' ) )
            // InternalCompras.g:1881:1: ( '{' )
            {
            // InternalCompras.g:1881:1: ( '{' )
            // InternalCompras.g:1882:2: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Module__Group__7__Impl"


    // $ANTLR start "rule__Module__Group__8"
    // InternalCompras.g:1891:1: rule__Module__Group__8 : rule__Module__Group__8__Impl rule__Module__Group__9 ;
    public final void rule__Module__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1895:1: ( rule__Module__Group__8__Impl rule__Module__Group__9 )
            // InternalCompras.g:1896:2: rule__Module__Group__8__Impl rule__Module__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Module__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__9();

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
    // $ANTLR end "rule__Module__Group__8"


    // $ANTLR start "rule__Module__Group__8__Impl"
    // InternalCompras.g:1903:1: rule__Module__Group__8__Impl : ( ( rule__Module__EntityAssignment_8 )* ) ;
    public final void rule__Module__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1907:1: ( ( ( rule__Module__EntityAssignment_8 )* ) )
            // InternalCompras.g:1908:1: ( ( rule__Module__EntityAssignment_8 )* )
            {
            // InternalCompras.g:1908:1: ( ( rule__Module__EntityAssignment_8 )* )
            // InternalCompras.g:1909:2: ( rule__Module__EntityAssignment_8 )*
            {
             before(grammarAccess.getModuleAccess().getEntityAssignment_8()); 
            // InternalCompras.g:1910:2: ( rule__Module__EntityAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCompras.g:1910:3: rule__Module__EntityAssignment_8
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Module__EntityAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getEntityAssignment_8()); 

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
    // $ANTLR end "rule__Module__Group__8__Impl"


    // $ANTLR start "rule__Module__Group__9"
    // InternalCompras.g:1918:1: rule__Module__Group__9 : rule__Module__Group__9__Impl rule__Module__Group__10 ;
    public final void rule__Module__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1922:1: ( rule__Module__Group__9__Impl rule__Module__Group__10 )
            // InternalCompras.g:1923:2: rule__Module__Group__9__Impl rule__Module__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Module__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__10();

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
    // $ANTLR end "rule__Module__Group__9"


    // $ANTLR start "rule__Module__Group__9__Impl"
    // InternalCompras.g:1930:1: rule__Module__Group__9__Impl : ( '}' ) ;
    public final void rule__Module__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1934:1: ( ( '}' ) )
            // InternalCompras.g:1935:1: ( '}' )
            {
            // InternalCompras.g:1935:1: ( '}' )
            // InternalCompras.g:1936:2: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Module__Group__9__Impl"


    // $ANTLR start "rule__Module__Group__10"
    // InternalCompras.g:1945:1: rule__Module__Group__10 : rule__Module__Group__10__Impl rule__Module__Group__11 ;
    public final void rule__Module__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1949:1: ( rule__Module__Group__10__Impl rule__Module__Group__11 )
            // InternalCompras.g:1950:2: rule__Module__Group__10__Impl rule__Module__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__Module__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__11();

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
    // $ANTLR end "rule__Module__Group__10"


    // $ANTLR start "rule__Module__Group__10__Impl"
    // InternalCompras.g:1957:1: rule__Module__Group__10__Impl : ( ( rule__Module__Group_10__0 )? ) ;
    public final void rule__Module__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1961:1: ( ( ( rule__Module__Group_10__0 )? ) )
            // InternalCompras.g:1962:1: ( ( rule__Module__Group_10__0 )? )
            {
            // InternalCompras.g:1962:1: ( ( rule__Module__Group_10__0 )? )
            // InternalCompras.g:1963:2: ( rule__Module__Group_10__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_10()); 
            // InternalCompras.g:1964:2: ( rule__Module__Group_10__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCompras.g:1964:3: rule__Module__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Module__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Module__Group__10__Impl"


    // $ANTLR start "rule__Module__Group__11"
    // InternalCompras.g:1972:1: rule__Module__Group__11 : rule__Module__Group__11__Impl ;
    public final void rule__Module__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1976:1: ( rule__Module__Group__11__Impl )
            // InternalCompras.g:1977:2: rule__Module__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__11__Impl();

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
    // $ANTLR end "rule__Module__Group__11"


    // $ANTLR start "rule__Module__Group__11__Impl"
    // InternalCompras.g:1983:1: rule__Module__Group__11__Impl : ( '}' ) ;
    public final void rule__Module__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1987:1: ( ( '}' ) )
            // InternalCompras.g:1988:1: ( '}' )
            {
            // InternalCompras.g:1988:1: ( '}' )
            // InternalCompras.g:1989:2: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Module__Group__11__Impl"


    // $ANTLR start "rule__Module__Group_10__0"
    // InternalCompras.g:1999:1: rule__Module__Group_10__0 : rule__Module__Group_10__0__Impl rule__Module__Group_10__1 ;
    public final void rule__Module__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2003:1: ( rule__Module__Group_10__0__Impl rule__Module__Group_10__1 )
            // InternalCompras.g:2004:2: rule__Module__Group_10__0__Impl rule__Module__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__Module__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group_10__1();

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
    // $ANTLR end "rule__Module__Group_10__0"


    // $ANTLR start "rule__Module__Group_10__0__Impl"
    // InternalCompras.g:2011:1: rule__Module__Group_10__0__Impl : ( 'Functionalities' ) ;
    public final void rule__Module__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2015:1: ( ( 'Functionalities' ) )
            // InternalCompras.g:2016:1: ( 'Functionalities' )
            {
            // InternalCompras.g:2016:1: ( 'Functionalities' )
            // InternalCompras.g:2017:2: 'Functionalities'
            {
             before(grammarAccess.getModuleAccess().getFunctionalitiesKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getFunctionalitiesKeyword_10_0()); 

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
    // $ANTLR end "rule__Module__Group_10__0__Impl"


    // $ANTLR start "rule__Module__Group_10__1"
    // InternalCompras.g:2026:1: rule__Module__Group_10__1 : rule__Module__Group_10__1__Impl rule__Module__Group_10__2 ;
    public final void rule__Module__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2030:1: ( rule__Module__Group_10__1__Impl rule__Module__Group_10__2 )
            // InternalCompras.g:2031:2: rule__Module__Group_10__1__Impl rule__Module__Group_10__2
            {
            pushFollow(FOLLOW_5);
            rule__Module__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group_10__2();

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
    // $ANTLR end "rule__Module__Group_10__1"


    // $ANTLR start "rule__Module__Group_10__1__Impl"
    // InternalCompras.g:2038:1: rule__Module__Group_10__1__Impl : ( ':' ) ;
    public final void rule__Module__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2042:1: ( ( ':' ) )
            // InternalCompras.g:2043:1: ( ':' )
            {
            // InternalCompras.g:2043:1: ( ':' )
            // InternalCompras.g:2044:2: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_10_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getColonKeyword_10_1()); 

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
    // $ANTLR end "rule__Module__Group_10__1__Impl"


    // $ANTLR start "rule__Module__Group_10__2"
    // InternalCompras.g:2053:1: rule__Module__Group_10__2 : rule__Module__Group_10__2__Impl rule__Module__Group_10__3 ;
    public final void rule__Module__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2057:1: ( rule__Module__Group_10__2__Impl rule__Module__Group_10__3 )
            // InternalCompras.g:2058:2: rule__Module__Group_10__2__Impl rule__Module__Group_10__3
            {
            pushFollow(FOLLOW_16);
            rule__Module__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group_10__3();

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
    // $ANTLR end "rule__Module__Group_10__2"


    // $ANTLR start "rule__Module__Group_10__2__Impl"
    // InternalCompras.g:2065:1: rule__Module__Group_10__2__Impl : ( '{' ) ;
    public final void rule__Module__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2069:1: ( ( '{' ) )
            // InternalCompras.g:2070:1: ( '{' )
            {
            // InternalCompras.g:2070:1: ( '{' )
            // InternalCompras.g:2071:2: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_10_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_10_2()); 

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
    // $ANTLR end "rule__Module__Group_10__2__Impl"


    // $ANTLR start "rule__Module__Group_10__3"
    // InternalCompras.g:2080:1: rule__Module__Group_10__3 : rule__Module__Group_10__3__Impl rule__Module__Group_10__4 ;
    public final void rule__Module__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2084:1: ( rule__Module__Group_10__3__Impl rule__Module__Group_10__4 )
            // InternalCompras.g:2085:2: rule__Module__Group_10__3__Impl rule__Module__Group_10__4
            {
            pushFollow(FOLLOW_16);
            rule__Module__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group_10__4();

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
    // $ANTLR end "rule__Module__Group_10__3"


    // $ANTLR start "rule__Module__Group_10__3__Impl"
    // InternalCompras.g:2092:1: rule__Module__Group_10__3__Impl : ( ( rule__Module__FunctionalityAssignment_10_3 )* ) ;
    public final void rule__Module__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2096:1: ( ( ( rule__Module__FunctionalityAssignment_10_3 )* ) )
            // InternalCompras.g:2097:1: ( ( rule__Module__FunctionalityAssignment_10_3 )* )
            {
            // InternalCompras.g:2097:1: ( ( rule__Module__FunctionalityAssignment_10_3 )* )
            // InternalCompras.g:2098:2: ( rule__Module__FunctionalityAssignment_10_3 )*
            {
             before(grammarAccess.getModuleAccess().getFunctionalityAssignment_10_3()); 
            // InternalCompras.g:2099:2: ( rule__Module__FunctionalityAssignment_10_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCompras.g:2099:3: rule__Module__FunctionalityAssignment_10_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Module__FunctionalityAssignment_10_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getFunctionalityAssignment_10_3()); 

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
    // $ANTLR end "rule__Module__Group_10__3__Impl"


    // $ANTLR start "rule__Module__Group_10__4"
    // InternalCompras.g:2107:1: rule__Module__Group_10__4 : rule__Module__Group_10__4__Impl ;
    public final void rule__Module__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2111:1: ( rule__Module__Group_10__4__Impl )
            // InternalCompras.g:2112:2: rule__Module__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group_10__4__Impl();

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
    // $ANTLR end "rule__Module__Group_10__4"


    // $ANTLR start "rule__Module__Group_10__4__Impl"
    // InternalCompras.g:2118:1: rule__Module__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Module__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2122:1: ( ( '}' ) )
            // InternalCompras.g:2123:1: ( '}' )
            {
            // InternalCompras.g:2123:1: ( '}' )
            // InternalCompras.g:2124:2: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_10_4()); 

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
    // $ANTLR end "rule__Module__Group_10__4__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalCompras.g:2134:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2138:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalCompras.g:2139:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalCompras.g:2146:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2150:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // InternalCompras.g:2151:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // InternalCompras.g:2151:1: ( ( rule__Entity__NameAssignment_0 ) )
            // InternalCompras.g:2152:2: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // InternalCompras.g:2153:2: ( rule__Entity__NameAssignment_0 )
            // InternalCompras.g:2153:3: rule__Entity__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalCompras.g:2161:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2165:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalCompras.g:2166:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalCompras.g:2173:1: rule__Entity__Group__1__Impl : ( ':' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2177:1: ( ( ':' ) )
            // InternalCompras.g:2178:1: ( ':' )
            {
            // InternalCompras.g:2178:1: ( ':' )
            // InternalCompras.g:2179:2: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalCompras.g:2188:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2192:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalCompras.g:2193:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalCompras.g:2200:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2204:1: ( ( '{' ) )
            // InternalCompras.g:2205:1: ( '{' )
            {
            // InternalCompras.g:2205:1: ( '{' )
            // InternalCompras.g:2206:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalCompras.g:2215:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2219:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalCompras.g:2220:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalCompras.g:2227:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__EntityFieldAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2231:1: ( ( ( rule__Entity__EntityFieldAssignment_3 )* ) )
            // InternalCompras.g:2232:1: ( ( rule__Entity__EntityFieldAssignment_3 )* )
            {
            // InternalCompras.g:2232:1: ( ( rule__Entity__EntityFieldAssignment_3 )* )
            // InternalCompras.g:2233:2: ( rule__Entity__EntityFieldAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getEntityFieldAssignment_3()); 
            // InternalCompras.g:2234:2: ( rule__Entity__EntityFieldAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=12 && LA13_0<=16)||LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCompras.g:2234:3: rule__Entity__EntityFieldAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Entity__EntityFieldAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getEntityFieldAssignment_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalCompras.g:2242:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2246:1: ( rule__Entity__Group__4__Impl )
            // InternalCompras.g:2247:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalCompras.g:2253:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2257:1: ( ( '}' ) )
            // InternalCompras.g:2258:1: ( '}' )
            {
            // InternalCompras.g:2258:1: ( '}' )
            // InternalCompras.g:2259:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__EntityField__Group__0"
    // InternalCompras.g:2269:1: rule__EntityField__Group__0 : rule__EntityField__Group__0__Impl rule__EntityField__Group__1 ;
    public final void rule__EntityField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2273:1: ( rule__EntityField__Group__0__Impl rule__EntityField__Group__1 )
            // InternalCompras.g:2274:2: rule__EntityField__Group__0__Impl rule__EntityField__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__EntityField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityField__Group__1();

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
    // $ANTLR end "rule__EntityField__Group__0"


    // $ANTLR start "rule__EntityField__Group__0__Impl"
    // InternalCompras.g:2281:1: rule__EntityField__Group__0__Impl : ( ( rule__EntityField__EntityFieldRequiredAssignment_0 )? ) ;
    public final void rule__EntityField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2285:1: ( ( ( rule__EntityField__EntityFieldRequiredAssignment_0 )? ) )
            // InternalCompras.g:2286:1: ( ( rule__EntityField__EntityFieldRequiredAssignment_0 )? )
            {
            // InternalCompras.g:2286:1: ( ( rule__EntityField__EntityFieldRequiredAssignment_0 )? )
            // InternalCompras.g:2287:2: ( rule__EntityField__EntityFieldRequiredAssignment_0 )?
            {
             before(grammarAccess.getEntityFieldAccess().getEntityFieldRequiredAssignment_0()); 
            // InternalCompras.g:2288:2: ( rule__EntityField__EntityFieldRequiredAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==55) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalCompras.g:2288:3: rule__EntityField__EntityFieldRequiredAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntityField__EntityFieldRequiredAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityFieldAccess().getEntityFieldRequiredAssignment_0()); 

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
    // $ANTLR end "rule__EntityField__Group__0__Impl"


    // $ANTLR start "rule__EntityField__Group__1"
    // InternalCompras.g:2296:1: rule__EntityField__Group__1 : rule__EntityField__Group__1__Impl rule__EntityField__Group__2 ;
    public final void rule__EntityField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2300:1: ( rule__EntityField__Group__1__Impl rule__EntityField__Group__2 )
            // InternalCompras.g:2301:2: rule__EntityField__Group__1__Impl rule__EntityField__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__EntityField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityField__Group__2();

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
    // $ANTLR end "rule__EntityField__Group__1"


    // $ANTLR start "rule__EntityField__Group__1__Impl"
    // InternalCompras.g:2308:1: rule__EntityField__Group__1__Impl : ( ( rule__EntityField__EntityFieldLabelAssignment_1 )? ) ;
    public final void rule__EntityField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2312:1: ( ( ( rule__EntityField__EntityFieldLabelAssignment_1 )? ) )
            // InternalCompras.g:2313:1: ( ( rule__EntityField__EntityFieldLabelAssignment_1 )? )
            {
            // InternalCompras.g:2313:1: ( ( rule__EntityField__EntityFieldLabelAssignment_1 )? )
            // InternalCompras.g:2314:2: ( rule__EntityField__EntityFieldLabelAssignment_1 )?
            {
             before(grammarAccess.getEntityFieldAccess().getEntityFieldLabelAssignment_1()); 
            // InternalCompras.g:2315:2: ( rule__EntityField__EntityFieldLabelAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCompras.g:2315:3: rule__EntityField__EntityFieldLabelAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntityField__EntityFieldLabelAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityFieldAccess().getEntityFieldLabelAssignment_1()); 

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
    // $ANTLR end "rule__EntityField__Group__1__Impl"


    // $ANTLR start "rule__EntityField__Group__2"
    // InternalCompras.g:2323:1: rule__EntityField__Group__2 : rule__EntityField__Group__2__Impl rule__EntityField__Group__3 ;
    public final void rule__EntityField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2327:1: ( rule__EntityField__Group__2__Impl rule__EntityField__Group__3 )
            // InternalCompras.g:2328:2: rule__EntityField__Group__2__Impl rule__EntityField__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__EntityField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityField__Group__3();

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
    // $ANTLR end "rule__EntityField__Group__2"


    // $ANTLR start "rule__EntityField__Group__2__Impl"
    // InternalCompras.g:2335:1: rule__EntityField__Group__2__Impl : ( ( rule__EntityField__EntityTypeAssignment_2 ) ) ;
    public final void rule__EntityField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2339:1: ( ( ( rule__EntityField__EntityTypeAssignment_2 ) ) )
            // InternalCompras.g:2340:1: ( ( rule__EntityField__EntityTypeAssignment_2 ) )
            {
            // InternalCompras.g:2340:1: ( ( rule__EntityField__EntityTypeAssignment_2 ) )
            // InternalCompras.g:2341:2: ( rule__EntityField__EntityTypeAssignment_2 )
            {
             before(grammarAccess.getEntityFieldAccess().getEntityTypeAssignment_2()); 
            // InternalCompras.g:2342:2: ( rule__EntityField__EntityTypeAssignment_2 )
            // InternalCompras.g:2342:3: rule__EntityField__EntityTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EntityField__EntityTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityFieldAccess().getEntityTypeAssignment_2()); 

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
    // $ANTLR end "rule__EntityField__Group__2__Impl"


    // $ANTLR start "rule__EntityField__Group__3"
    // InternalCompras.g:2350:1: rule__EntityField__Group__3 : rule__EntityField__Group__3__Impl ;
    public final void rule__EntityField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2354:1: ( rule__EntityField__Group__3__Impl )
            // InternalCompras.g:2355:2: rule__EntityField__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityField__Group__3__Impl();

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
    // $ANTLR end "rule__EntityField__Group__3"


    // $ANTLR start "rule__EntityField__Group__3__Impl"
    // InternalCompras.g:2361:1: rule__EntityField__Group__3__Impl : ( ( rule__EntityField__NameAssignment_3 ) ) ;
    public final void rule__EntityField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2365:1: ( ( ( rule__EntityField__NameAssignment_3 ) ) )
            // InternalCompras.g:2366:1: ( ( rule__EntityField__NameAssignment_3 ) )
            {
            // InternalCompras.g:2366:1: ( ( rule__EntityField__NameAssignment_3 ) )
            // InternalCompras.g:2367:2: ( rule__EntityField__NameAssignment_3 )
            {
             before(grammarAccess.getEntityFieldAccess().getNameAssignment_3()); 
            // InternalCompras.g:2368:2: ( rule__EntityField__NameAssignment_3 )
            // InternalCompras.g:2368:3: rule__EntityField__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EntityField__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityFieldAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__EntityField__Group__3__Impl"


    // $ANTLR start "rule__EntityFieldLabel__Group__0"
    // InternalCompras.g:2377:1: rule__EntityFieldLabel__Group__0 : rule__EntityFieldLabel__Group__0__Impl rule__EntityFieldLabel__Group__1 ;
    public final void rule__EntityFieldLabel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2381:1: ( rule__EntityFieldLabel__Group__0__Impl rule__EntityFieldLabel__Group__1 )
            // InternalCompras.g:2382:2: rule__EntityFieldLabel__Group__0__Impl rule__EntityFieldLabel__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__EntityFieldLabel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityFieldLabel__Group__1();

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
    // $ANTLR end "rule__EntityFieldLabel__Group__0"


    // $ANTLR start "rule__EntityFieldLabel__Group__0__Impl"
    // InternalCompras.g:2389:1: rule__EntityFieldLabel__Group__0__Impl : ( '[' ) ;
    public final void rule__EntityFieldLabel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2393:1: ( ( '[' ) )
            // InternalCompras.g:2394:1: ( '[' )
            {
            // InternalCompras.g:2394:1: ( '[' )
            // InternalCompras.g:2395:2: '['
            {
             before(grammarAccess.getEntityFieldLabelAccess().getLeftSquareBracketKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEntityFieldLabelAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__EntityFieldLabel__Group__0__Impl"


    // $ANTLR start "rule__EntityFieldLabel__Group__1"
    // InternalCompras.g:2404:1: rule__EntityFieldLabel__Group__1 : rule__EntityFieldLabel__Group__1__Impl rule__EntityFieldLabel__Group__2 ;
    public final void rule__EntityFieldLabel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2408:1: ( rule__EntityFieldLabel__Group__1__Impl rule__EntityFieldLabel__Group__2 )
            // InternalCompras.g:2409:2: rule__EntityFieldLabel__Group__1__Impl rule__EntityFieldLabel__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__EntityFieldLabel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityFieldLabel__Group__2();

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
    // $ANTLR end "rule__EntityFieldLabel__Group__1"


    // $ANTLR start "rule__EntityFieldLabel__Group__1__Impl"
    // InternalCompras.g:2416:1: rule__EntityFieldLabel__Group__1__Impl : ( 'label' ) ;
    public final void rule__EntityFieldLabel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2420:1: ( ( 'label' ) )
            // InternalCompras.g:2421:1: ( 'label' )
            {
            // InternalCompras.g:2421:1: ( 'label' )
            // InternalCompras.g:2422:2: 'label'
            {
             before(grammarAccess.getEntityFieldLabelAccess().getLabelKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEntityFieldLabelAccess().getLabelKeyword_1()); 

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
    // $ANTLR end "rule__EntityFieldLabel__Group__1__Impl"


    // $ANTLR start "rule__EntityFieldLabel__Group__2"
    // InternalCompras.g:2431:1: rule__EntityFieldLabel__Group__2 : rule__EntityFieldLabel__Group__2__Impl rule__EntityFieldLabel__Group__3 ;
    public final void rule__EntityFieldLabel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2435:1: ( rule__EntityFieldLabel__Group__2__Impl rule__EntityFieldLabel__Group__3 )
            // InternalCompras.g:2436:2: rule__EntityFieldLabel__Group__2__Impl rule__EntityFieldLabel__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__EntityFieldLabel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityFieldLabel__Group__3();

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
    // $ANTLR end "rule__EntityFieldLabel__Group__2"


    // $ANTLR start "rule__EntityFieldLabel__Group__2__Impl"
    // InternalCompras.g:2443:1: rule__EntityFieldLabel__Group__2__Impl : ( ':' ) ;
    public final void rule__EntityFieldLabel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2447:1: ( ( ':' ) )
            // InternalCompras.g:2448:1: ( ':' )
            {
            // InternalCompras.g:2448:1: ( ':' )
            // InternalCompras.g:2449:2: ':'
            {
             before(grammarAccess.getEntityFieldLabelAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityFieldLabelAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__EntityFieldLabel__Group__2__Impl"


    // $ANTLR start "rule__EntityFieldLabel__Group__3"
    // InternalCompras.g:2458:1: rule__EntityFieldLabel__Group__3 : rule__EntityFieldLabel__Group__3__Impl rule__EntityFieldLabel__Group__4 ;
    public final void rule__EntityFieldLabel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2462:1: ( rule__EntityFieldLabel__Group__3__Impl rule__EntityFieldLabel__Group__4 )
            // InternalCompras.g:2463:2: rule__EntityFieldLabel__Group__3__Impl rule__EntityFieldLabel__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__EntityFieldLabel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityFieldLabel__Group__4();

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
    // $ANTLR end "rule__EntityFieldLabel__Group__3"


    // $ANTLR start "rule__EntityFieldLabel__Group__3__Impl"
    // InternalCompras.g:2470:1: rule__EntityFieldLabel__Group__3__Impl : ( ( rule__EntityFieldLabel__NameAssignment_3 ) ) ;
    public final void rule__EntityFieldLabel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2474:1: ( ( ( rule__EntityFieldLabel__NameAssignment_3 ) ) )
            // InternalCompras.g:2475:1: ( ( rule__EntityFieldLabel__NameAssignment_3 ) )
            {
            // InternalCompras.g:2475:1: ( ( rule__EntityFieldLabel__NameAssignment_3 ) )
            // InternalCompras.g:2476:2: ( rule__EntityFieldLabel__NameAssignment_3 )
            {
             before(grammarAccess.getEntityFieldLabelAccess().getNameAssignment_3()); 
            // InternalCompras.g:2477:2: ( rule__EntityFieldLabel__NameAssignment_3 )
            // InternalCompras.g:2477:3: rule__EntityFieldLabel__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EntityFieldLabel__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityFieldLabelAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__EntityFieldLabel__Group__3__Impl"


    // $ANTLR start "rule__EntityFieldLabel__Group__4"
    // InternalCompras.g:2485:1: rule__EntityFieldLabel__Group__4 : rule__EntityFieldLabel__Group__4__Impl ;
    public final void rule__EntityFieldLabel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2489:1: ( rule__EntityFieldLabel__Group__4__Impl )
            // InternalCompras.g:2490:2: rule__EntityFieldLabel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityFieldLabel__Group__4__Impl();

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
    // $ANTLR end "rule__EntityFieldLabel__Group__4"


    // $ANTLR start "rule__EntityFieldLabel__Group__4__Impl"
    // InternalCompras.g:2496:1: rule__EntityFieldLabel__Group__4__Impl : ( ']' ) ;
    public final void rule__EntityFieldLabel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2500:1: ( ( ']' ) )
            // InternalCompras.g:2501:1: ( ']' )
            {
            // InternalCompras.g:2501:1: ( ']' )
            // InternalCompras.g:2502:2: ']'
            {
             before(grammarAccess.getEntityFieldLabelAccess().getRightSquareBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntityFieldLabelAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__EntityFieldLabel__Group__4__Impl"


    // $ANTLR start "rule__EntityFieldRequired__Group__0"
    // InternalCompras.g:2512:1: rule__EntityFieldRequired__Group__0 : rule__EntityFieldRequired__Group__0__Impl rule__EntityFieldRequired__Group__1 ;
    public final void rule__EntityFieldRequired__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2516:1: ( rule__EntityFieldRequired__Group__0__Impl rule__EntityFieldRequired__Group__1 )
            // InternalCompras.g:2517:2: rule__EntityFieldRequired__Group__0__Impl rule__EntityFieldRequired__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__EntityFieldRequired__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityFieldRequired__Group__1();

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
    // $ANTLR end "rule__EntityFieldRequired__Group__0"


    // $ANTLR start "rule__EntityFieldRequired__Group__0__Impl"
    // InternalCompras.g:2524:1: rule__EntityFieldRequired__Group__0__Impl : ( '[' ) ;
    public final void rule__EntityFieldRequired__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2528:1: ( ( '[' ) )
            // InternalCompras.g:2529:1: ( '[' )
            {
            // InternalCompras.g:2529:1: ( '[' )
            // InternalCompras.g:2530:2: '['
            {
             before(grammarAccess.getEntityFieldRequiredAccess().getLeftSquareBracketKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEntityFieldRequiredAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__EntityFieldRequired__Group__0__Impl"


    // $ANTLR start "rule__EntityFieldRequired__Group__1"
    // InternalCompras.g:2539:1: rule__EntityFieldRequired__Group__1 : rule__EntityFieldRequired__Group__1__Impl rule__EntityFieldRequired__Group__2 ;
    public final void rule__EntityFieldRequired__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2543:1: ( rule__EntityFieldRequired__Group__1__Impl rule__EntityFieldRequired__Group__2 )
            // InternalCompras.g:2544:2: rule__EntityFieldRequired__Group__1__Impl rule__EntityFieldRequired__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__EntityFieldRequired__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityFieldRequired__Group__2();

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
    // $ANTLR end "rule__EntityFieldRequired__Group__1"


    // $ANTLR start "rule__EntityFieldRequired__Group__1__Impl"
    // InternalCompras.g:2551:1: rule__EntityFieldRequired__Group__1__Impl : ( ( rule__EntityFieldRequired__NameAssignment_1 ) ) ;
    public final void rule__EntityFieldRequired__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2555:1: ( ( ( rule__EntityFieldRequired__NameAssignment_1 ) ) )
            // InternalCompras.g:2556:1: ( ( rule__EntityFieldRequired__NameAssignment_1 ) )
            {
            // InternalCompras.g:2556:1: ( ( rule__EntityFieldRequired__NameAssignment_1 ) )
            // InternalCompras.g:2557:2: ( rule__EntityFieldRequired__NameAssignment_1 )
            {
             before(grammarAccess.getEntityFieldRequiredAccess().getNameAssignment_1()); 
            // InternalCompras.g:2558:2: ( rule__EntityFieldRequired__NameAssignment_1 )
            // InternalCompras.g:2558:3: rule__EntityFieldRequired__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityFieldRequired__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityFieldRequiredAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EntityFieldRequired__Group__1__Impl"


    // $ANTLR start "rule__EntityFieldRequired__Group__2"
    // InternalCompras.g:2566:1: rule__EntityFieldRequired__Group__2 : rule__EntityFieldRequired__Group__2__Impl ;
    public final void rule__EntityFieldRequired__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2570:1: ( rule__EntityFieldRequired__Group__2__Impl )
            // InternalCompras.g:2571:2: rule__EntityFieldRequired__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityFieldRequired__Group__2__Impl();

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
    // $ANTLR end "rule__EntityFieldRequired__Group__2"


    // $ANTLR start "rule__EntityFieldRequired__Group__2__Impl"
    // InternalCompras.g:2577:1: rule__EntityFieldRequired__Group__2__Impl : ( ']' ) ;
    public final void rule__EntityFieldRequired__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2581:1: ( ( ']' ) )
            // InternalCompras.g:2582:1: ( ']' )
            {
            // InternalCompras.g:2582:1: ( ']' )
            // InternalCompras.g:2583:2: ']'
            {
             before(grammarAccess.getEntityFieldRequiredAccess().getRightSquareBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntityFieldRequiredAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__EntityFieldRequired__Group__2__Impl"


    // $ANTLR start "rule__Functionality__Group__0"
    // InternalCompras.g:2593:1: rule__Functionality__Group__0 : rule__Functionality__Group__0__Impl rule__Functionality__Group__1 ;
    public final void rule__Functionality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2597:1: ( rule__Functionality__Group__0__Impl rule__Functionality__Group__1 )
            // InternalCompras.g:2598:2: rule__Functionality__Group__0__Impl rule__Functionality__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Functionality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__1();

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
    // $ANTLR end "rule__Functionality__Group__0"


    // $ANTLR start "rule__Functionality__Group__0__Impl"
    // InternalCompras.g:2605:1: rule__Functionality__Group__0__Impl : ( ( rule__Functionality__NameAssignment_0 ) ) ;
    public final void rule__Functionality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2609:1: ( ( ( rule__Functionality__NameAssignment_0 ) ) )
            // InternalCompras.g:2610:1: ( ( rule__Functionality__NameAssignment_0 ) )
            {
            // InternalCompras.g:2610:1: ( ( rule__Functionality__NameAssignment_0 ) )
            // InternalCompras.g:2611:2: ( rule__Functionality__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionalityAccess().getNameAssignment_0()); 
            // InternalCompras.g:2612:2: ( rule__Functionality__NameAssignment_0 )
            // InternalCompras.g:2612:3: rule__Functionality__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Functionality__Group__0__Impl"


    // $ANTLR start "rule__Functionality__Group__1"
    // InternalCompras.g:2620:1: rule__Functionality__Group__1 : rule__Functionality__Group__1__Impl rule__Functionality__Group__2 ;
    public final void rule__Functionality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2624:1: ( rule__Functionality__Group__1__Impl rule__Functionality__Group__2 )
            // InternalCompras.g:2625:2: rule__Functionality__Group__1__Impl rule__Functionality__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Functionality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__2();

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
    // $ANTLR end "rule__Functionality__Group__1"


    // $ANTLR start "rule__Functionality__Group__1__Impl"
    // InternalCompras.g:2632:1: rule__Functionality__Group__1__Impl : ( 'RelEntity' ) ;
    public final void rule__Functionality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2636:1: ( ( 'RelEntity' ) )
            // InternalCompras.g:2637:1: ( 'RelEntity' )
            {
            // InternalCompras.g:2637:1: ( 'RelEntity' )
            // InternalCompras.g:2638:2: 'RelEntity'
            {
             before(grammarAccess.getFunctionalityAccess().getRelEntityKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getRelEntityKeyword_1()); 

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
    // $ANTLR end "rule__Functionality__Group__1__Impl"


    // $ANTLR start "rule__Functionality__Group__2"
    // InternalCompras.g:2647:1: rule__Functionality__Group__2 : rule__Functionality__Group__2__Impl rule__Functionality__Group__3 ;
    public final void rule__Functionality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2651:1: ( rule__Functionality__Group__2__Impl rule__Functionality__Group__3 )
            // InternalCompras.g:2652:2: rule__Functionality__Group__2__Impl rule__Functionality__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Functionality__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__3();

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
    // $ANTLR end "rule__Functionality__Group__2"


    // $ANTLR start "rule__Functionality__Group__2__Impl"
    // InternalCompras.g:2659:1: rule__Functionality__Group__2__Impl : ( ( rule__Functionality__EntityAssignment_2 ) ) ;
    public final void rule__Functionality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2663:1: ( ( ( rule__Functionality__EntityAssignment_2 ) ) )
            // InternalCompras.g:2664:1: ( ( rule__Functionality__EntityAssignment_2 ) )
            {
            // InternalCompras.g:2664:1: ( ( rule__Functionality__EntityAssignment_2 ) )
            // InternalCompras.g:2665:2: ( rule__Functionality__EntityAssignment_2 )
            {
             before(grammarAccess.getFunctionalityAccess().getEntityAssignment_2()); 
            // InternalCompras.g:2666:2: ( rule__Functionality__EntityAssignment_2 )
            // InternalCompras.g:2666:3: rule__Functionality__EntityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__EntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getEntityAssignment_2()); 

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
    // $ANTLR end "rule__Functionality__Group__2__Impl"


    // $ANTLR start "rule__Functionality__Group__3"
    // InternalCompras.g:2674:1: rule__Functionality__Group__3 : rule__Functionality__Group__3__Impl rule__Functionality__Group__4 ;
    public final void rule__Functionality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2678:1: ( rule__Functionality__Group__3__Impl rule__Functionality__Group__4 )
            // InternalCompras.g:2679:2: rule__Functionality__Group__3__Impl rule__Functionality__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Functionality__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__4();

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
    // $ANTLR end "rule__Functionality__Group__3"


    // $ANTLR start "rule__Functionality__Group__3__Impl"
    // InternalCompras.g:2686:1: rule__Functionality__Group__3__Impl : ( ':' ) ;
    public final void rule__Functionality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2690:1: ( ( ':' ) )
            // InternalCompras.g:2691:1: ( ':' )
            {
            // InternalCompras.g:2691:1: ( ':' )
            // InternalCompras.g:2692:2: ':'
            {
             before(grammarAccess.getFunctionalityAccess().getColonKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Functionality__Group__3__Impl"


    // $ANTLR start "rule__Functionality__Group__4"
    // InternalCompras.g:2701:1: rule__Functionality__Group__4 : rule__Functionality__Group__4__Impl rule__Functionality__Group__5 ;
    public final void rule__Functionality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2705:1: ( rule__Functionality__Group__4__Impl rule__Functionality__Group__5 )
            // InternalCompras.g:2706:2: rule__Functionality__Group__4__Impl rule__Functionality__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Functionality__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__5();

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
    // $ANTLR end "rule__Functionality__Group__4"


    // $ANTLR start "rule__Functionality__Group__4__Impl"
    // InternalCompras.g:2713:1: rule__Functionality__Group__4__Impl : ( '{' ) ;
    public final void rule__Functionality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2717:1: ( ( '{' ) )
            // InternalCompras.g:2718:1: ( '{' )
            {
            // InternalCompras.g:2718:1: ( '{' )
            // InternalCompras.g:2719:2: '{'
            {
             before(grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Functionality__Group__4__Impl"


    // $ANTLR start "rule__Functionality__Group__5"
    // InternalCompras.g:2728:1: rule__Functionality__Group__5 : rule__Functionality__Group__5__Impl rule__Functionality__Group__6 ;
    public final void rule__Functionality__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2732:1: ( rule__Functionality__Group__5__Impl rule__Functionality__Group__6 )
            // InternalCompras.g:2733:2: rule__Functionality__Group__5__Impl rule__Functionality__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Functionality__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__6();

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
    // $ANTLR end "rule__Functionality__Group__5"


    // $ANTLR start "rule__Functionality__Group__5__Impl"
    // InternalCompras.g:2740:1: rule__Functionality__Group__5__Impl : ( ( rule__Functionality__FunctionalityActionTypeAssignment_5 )* ) ;
    public final void rule__Functionality__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2744:1: ( ( ( rule__Functionality__FunctionalityActionTypeAssignment_5 )* ) )
            // InternalCompras.g:2745:1: ( ( rule__Functionality__FunctionalityActionTypeAssignment_5 )* )
            {
            // InternalCompras.g:2745:1: ( ( rule__Functionality__FunctionalityActionTypeAssignment_5 )* )
            // InternalCompras.g:2746:2: ( rule__Functionality__FunctionalityActionTypeAssignment_5 )*
            {
             before(grammarAccess.getFunctionalityAccess().getFunctionalityActionTypeAssignment_5()); 
            // InternalCompras.g:2747:2: ( rule__Functionality__FunctionalityActionTypeAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=56 && LA16_0<=60)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCompras.g:2747:3: rule__Functionality__FunctionalityActionTypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Functionality__FunctionalityActionTypeAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFunctionalityAccess().getFunctionalityActionTypeAssignment_5()); 

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
    // $ANTLR end "rule__Functionality__Group__5__Impl"


    // $ANTLR start "rule__Functionality__Group__6"
    // InternalCompras.g:2755:1: rule__Functionality__Group__6 : rule__Functionality__Group__6__Impl ;
    public final void rule__Functionality__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2759:1: ( rule__Functionality__Group__6__Impl )
            // InternalCompras.g:2760:2: rule__Functionality__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__Group__6__Impl();

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
    // $ANTLR end "rule__Functionality__Group__6"


    // $ANTLR start "rule__Functionality__Group__6__Impl"
    // InternalCompras.g:2766:1: rule__Functionality__Group__6__Impl : ( '}' ) ;
    public final void rule__Functionality__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2770:1: ( ( '}' ) )
            // InternalCompras.g:2771:1: ( '}' )
            {
            // InternalCompras.g:2771:1: ( '}' )
            // InternalCompras.g:2772:2: '}'
            {
             before(grammarAccess.getFunctionalityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Functionality__Group__6__Impl"


    // $ANTLR start "rule__Architecture__Group__0"
    // InternalCompras.g:2782:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2786:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalCompras.g:2787:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Architecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__1();

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
    // $ANTLR end "rule__Architecture__Group__0"


    // $ANTLR start "rule__Architecture__Group__0__Impl"
    // InternalCompras.g:2794:1: rule__Architecture__Group__0__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2798:1: ( ( '{' ) )
            // InternalCompras.g:2799:1: ( '{' )
            {
            // InternalCompras.g:2799:1: ( '{' )
            // InternalCompras.g:2800:2: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Architecture__Group__0__Impl"


    // $ANTLR start "rule__Architecture__Group__1"
    // InternalCompras.g:2809:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2813:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalCompras.g:2814:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Architecture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__2();

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
    // $ANTLR end "rule__Architecture__Group__1"


    // $ANTLR start "rule__Architecture__Group__1__Impl"
    // InternalCompras.g:2821:1: rule__Architecture__Group__1__Impl : ( 'Layers' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2825:1: ( ( 'Layers' ) )
            // InternalCompras.g:2826:1: ( 'Layers' )
            {
            // InternalCompras.g:2826:1: ( 'Layers' )
            // InternalCompras.g:2827:2: 'Layers'
            {
             before(grammarAccess.getArchitectureAccess().getLayersKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getLayersKeyword_1()); 

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
    // $ANTLR end "rule__Architecture__Group__1__Impl"


    // $ANTLR start "rule__Architecture__Group__2"
    // InternalCompras.g:2836:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2840:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalCompras.g:2841:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Architecture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__3();

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
    // $ANTLR end "rule__Architecture__Group__2"


    // $ANTLR start "rule__Architecture__Group__2__Impl"
    // InternalCompras.g:2848:1: rule__Architecture__Group__2__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2852:1: ( ( ':' ) )
            // InternalCompras.g:2853:1: ( ':' )
            {
            // InternalCompras.g:2853:1: ( ':' )
            // InternalCompras.g:2854:2: ':'
            {
             before(grammarAccess.getArchitectureAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Architecture__Group__2__Impl"


    // $ANTLR start "rule__Architecture__Group__3"
    // InternalCompras.g:2863:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl rule__Architecture__Group__4 ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2867:1: ( rule__Architecture__Group__3__Impl rule__Architecture__Group__4 )
            // InternalCompras.g:2868:2: rule__Architecture__Group__3__Impl rule__Architecture__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Architecture__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__4();

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
    // $ANTLR end "rule__Architecture__Group__3"


    // $ANTLR start "rule__Architecture__Group__3__Impl"
    // InternalCompras.g:2875:1: rule__Architecture__Group__3__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2879:1: ( ( '{' ) )
            // InternalCompras.g:2880:1: ( '{' )
            {
            // InternalCompras.g:2880:1: ( '{' )
            // InternalCompras.g:2881:2: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Architecture__Group__3__Impl"


    // $ANTLR start "rule__Architecture__Group__4"
    // InternalCompras.g:2890:1: rule__Architecture__Group__4 : rule__Architecture__Group__4__Impl rule__Architecture__Group__5 ;
    public final void rule__Architecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2894:1: ( rule__Architecture__Group__4__Impl rule__Architecture__Group__5 )
            // InternalCompras.g:2895:2: rule__Architecture__Group__4__Impl rule__Architecture__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Architecture__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__5();

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
    // $ANTLR end "rule__Architecture__Group__4"


    // $ANTLR start "rule__Architecture__Group__4__Impl"
    // InternalCompras.g:2902:1: rule__Architecture__Group__4__Impl : ( 'PresentationLayer' ) ;
    public final void rule__Architecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2906:1: ( ( 'PresentationLayer' ) )
            // InternalCompras.g:2907:1: ( 'PresentationLayer' )
            {
            // InternalCompras.g:2907:1: ( 'PresentationLayer' )
            // InternalCompras.g:2908:2: 'PresentationLayer'
            {
             before(grammarAccess.getArchitectureAccess().getPresentationLayerKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getPresentationLayerKeyword_4()); 

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
    // $ANTLR end "rule__Architecture__Group__4__Impl"


    // $ANTLR start "rule__Architecture__Group__5"
    // InternalCompras.g:2917:1: rule__Architecture__Group__5 : rule__Architecture__Group__5__Impl rule__Architecture__Group__6 ;
    public final void rule__Architecture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2921:1: ( rule__Architecture__Group__5__Impl rule__Architecture__Group__6 )
            // InternalCompras.g:2922:2: rule__Architecture__Group__5__Impl rule__Architecture__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Architecture__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__6();

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
    // $ANTLR end "rule__Architecture__Group__5"


    // $ANTLR start "rule__Architecture__Group__5__Impl"
    // InternalCompras.g:2929:1: rule__Architecture__Group__5__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2933:1: ( ( ':' ) )
            // InternalCompras.g:2934:1: ( ':' )
            {
            // InternalCompras.g:2934:1: ( ':' )
            // InternalCompras.g:2935:2: ':'
            {
             before(grammarAccess.getArchitectureAccess().getColonKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__Architecture__Group__5__Impl"


    // $ANTLR start "rule__Architecture__Group__6"
    // InternalCompras.g:2944:1: rule__Architecture__Group__6 : rule__Architecture__Group__6__Impl rule__Architecture__Group__7 ;
    public final void rule__Architecture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2948:1: ( rule__Architecture__Group__6__Impl rule__Architecture__Group__7 )
            // InternalCompras.g:2949:2: rule__Architecture__Group__6__Impl rule__Architecture__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Architecture__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__7();

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
    // $ANTLR end "rule__Architecture__Group__6"


    // $ANTLR start "rule__Architecture__Group__6__Impl"
    // InternalCompras.g:2956:1: rule__Architecture__Group__6__Impl : ( ( rule__Architecture__PresentationLayerAssignment_6 ) ) ;
    public final void rule__Architecture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2960:1: ( ( ( rule__Architecture__PresentationLayerAssignment_6 ) ) )
            // InternalCompras.g:2961:1: ( ( rule__Architecture__PresentationLayerAssignment_6 ) )
            {
            // InternalCompras.g:2961:1: ( ( rule__Architecture__PresentationLayerAssignment_6 ) )
            // InternalCompras.g:2962:2: ( rule__Architecture__PresentationLayerAssignment_6 )
            {
             before(grammarAccess.getArchitectureAccess().getPresentationLayerAssignment_6()); 
            // InternalCompras.g:2963:2: ( rule__Architecture__PresentationLayerAssignment_6 )
            // InternalCompras.g:2963:3: rule__Architecture__PresentationLayerAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__PresentationLayerAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getPresentationLayerAssignment_6()); 

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
    // $ANTLR end "rule__Architecture__Group__6__Impl"


    // $ANTLR start "rule__Architecture__Group__7"
    // InternalCompras.g:2971:1: rule__Architecture__Group__7 : rule__Architecture__Group__7__Impl rule__Architecture__Group__8 ;
    public final void rule__Architecture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2975:1: ( rule__Architecture__Group__7__Impl rule__Architecture__Group__8 )
            // InternalCompras.g:2976:2: rule__Architecture__Group__7__Impl rule__Architecture__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__Architecture__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__8();

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
    // $ANTLR end "rule__Architecture__Group__7"


    // $ANTLR start "rule__Architecture__Group__7__Impl"
    // InternalCompras.g:2983:1: rule__Architecture__Group__7__Impl : ( 'BusinessLayer' ) ;
    public final void rule__Architecture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2987:1: ( ( 'BusinessLayer' ) )
            // InternalCompras.g:2988:1: ( 'BusinessLayer' )
            {
            // InternalCompras.g:2988:1: ( 'BusinessLayer' )
            // InternalCompras.g:2989:2: 'BusinessLayer'
            {
             before(grammarAccess.getArchitectureAccess().getBusinessLayerKeyword_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getBusinessLayerKeyword_7()); 

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
    // $ANTLR end "rule__Architecture__Group__7__Impl"


    // $ANTLR start "rule__Architecture__Group__8"
    // InternalCompras.g:2998:1: rule__Architecture__Group__8 : rule__Architecture__Group__8__Impl rule__Architecture__Group__9 ;
    public final void rule__Architecture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3002:1: ( rule__Architecture__Group__8__Impl rule__Architecture__Group__9 )
            // InternalCompras.g:3003:2: rule__Architecture__Group__8__Impl rule__Architecture__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Architecture__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__9();

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
    // $ANTLR end "rule__Architecture__Group__8"


    // $ANTLR start "rule__Architecture__Group__8__Impl"
    // InternalCompras.g:3010:1: rule__Architecture__Group__8__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3014:1: ( ( ':' ) )
            // InternalCompras.g:3015:1: ( ':' )
            {
            // InternalCompras.g:3015:1: ( ':' )
            // InternalCompras.g:3016:2: ':'
            {
             before(grammarAccess.getArchitectureAccess().getColonKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getColonKeyword_8()); 

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
    // $ANTLR end "rule__Architecture__Group__8__Impl"


    // $ANTLR start "rule__Architecture__Group__9"
    // InternalCompras.g:3025:1: rule__Architecture__Group__9 : rule__Architecture__Group__9__Impl rule__Architecture__Group__10 ;
    public final void rule__Architecture__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3029:1: ( rule__Architecture__Group__9__Impl rule__Architecture__Group__10 )
            // InternalCompras.g:3030:2: rule__Architecture__Group__9__Impl rule__Architecture__Group__10
            {
            pushFollow(FOLLOW_32);
            rule__Architecture__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__10();

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
    // $ANTLR end "rule__Architecture__Group__9"


    // $ANTLR start "rule__Architecture__Group__9__Impl"
    // InternalCompras.g:3037:1: rule__Architecture__Group__9__Impl : ( ( rule__Architecture__BusinessLayerAssignment_9 ) ) ;
    public final void rule__Architecture__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3041:1: ( ( ( rule__Architecture__BusinessLayerAssignment_9 ) ) )
            // InternalCompras.g:3042:1: ( ( rule__Architecture__BusinessLayerAssignment_9 ) )
            {
            // InternalCompras.g:3042:1: ( ( rule__Architecture__BusinessLayerAssignment_9 ) )
            // InternalCompras.g:3043:2: ( rule__Architecture__BusinessLayerAssignment_9 )
            {
             before(grammarAccess.getArchitectureAccess().getBusinessLayerAssignment_9()); 
            // InternalCompras.g:3044:2: ( rule__Architecture__BusinessLayerAssignment_9 )
            // InternalCompras.g:3044:3: rule__Architecture__BusinessLayerAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__BusinessLayerAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getBusinessLayerAssignment_9()); 

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
    // $ANTLR end "rule__Architecture__Group__9__Impl"


    // $ANTLR start "rule__Architecture__Group__10"
    // InternalCompras.g:3052:1: rule__Architecture__Group__10 : rule__Architecture__Group__10__Impl rule__Architecture__Group__11 ;
    public final void rule__Architecture__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3056:1: ( rule__Architecture__Group__10__Impl rule__Architecture__Group__11 )
            // InternalCompras.g:3057:2: rule__Architecture__Group__10__Impl rule__Architecture__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__Architecture__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__11();

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
    // $ANTLR end "rule__Architecture__Group__10"


    // $ANTLR start "rule__Architecture__Group__10__Impl"
    // InternalCompras.g:3064:1: rule__Architecture__Group__10__Impl : ( 'DataAccessLayer' ) ;
    public final void rule__Architecture__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3068:1: ( ( 'DataAccessLayer' ) )
            // InternalCompras.g:3069:1: ( 'DataAccessLayer' )
            {
            // InternalCompras.g:3069:1: ( 'DataAccessLayer' )
            // InternalCompras.g:3070:2: 'DataAccessLayer'
            {
             before(grammarAccess.getArchitectureAccess().getDataAccessLayerKeyword_10()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getDataAccessLayerKeyword_10()); 

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
    // $ANTLR end "rule__Architecture__Group__10__Impl"


    // $ANTLR start "rule__Architecture__Group__11"
    // InternalCompras.g:3079:1: rule__Architecture__Group__11 : rule__Architecture__Group__11__Impl rule__Architecture__Group__12 ;
    public final void rule__Architecture__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3083:1: ( rule__Architecture__Group__11__Impl rule__Architecture__Group__12 )
            // InternalCompras.g:3084:2: rule__Architecture__Group__11__Impl rule__Architecture__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__Architecture__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__12();

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
    // $ANTLR end "rule__Architecture__Group__11"


    // $ANTLR start "rule__Architecture__Group__11__Impl"
    // InternalCompras.g:3091:1: rule__Architecture__Group__11__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3095:1: ( ( ':' ) )
            // InternalCompras.g:3096:1: ( ':' )
            {
            // InternalCompras.g:3096:1: ( ':' )
            // InternalCompras.g:3097:2: ':'
            {
             before(grammarAccess.getArchitectureAccess().getColonKeyword_11()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getColonKeyword_11()); 

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
    // $ANTLR end "rule__Architecture__Group__11__Impl"


    // $ANTLR start "rule__Architecture__Group__12"
    // InternalCompras.g:3106:1: rule__Architecture__Group__12 : rule__Architecture__Group__12__Impl rule__Architecture__Group__13 ;
    public final void rule__Architecture__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3110:1: ( rule__Architecture__Group__12__Impl rule__Architecture__Group__13 )
            // InternalCompras.g:3111:2: rule__Architecture__Group__12__Impl rule__Architecture__Group__13
            {
            pushFollow(FOLLOW_33);
            rule__Architecture__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__13();

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
    // $ANTLR end "rule__Architecture__Group__12"


    // $ANTLR start "rule__Architecture__Group__12__Impl"
    // InternalCompras.g:3118:1: rule__Architecture__Group__12__Impl : ( ( rule__Architecture__DataAccessLayerAssignment_12 ) ) ;
    public final void rule__Architecture__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3122:1: ( ( ( rule__Architecture__DataAccessLayerAssignment_12 ) ) )
            // InternalCompras.g:3123:1: ( ( rule__Architecture__DataAccessLayerAssignment_12 ) )
            {
            // InternalCompras.g:3123:1: ( ( rule__Architecture__DataAccessLayerAssignment_12 ) )
            // InternalCompras.g:3124:2: ( rule__Architecture__DataAccessLayerAssignment_12 )
            {
             before(grammarAccess.getArchitectureAccess().getDataAccessLayerAssignment_12()); 
            // InternalCompras.g:3125:2: ( rule__Architecture__DataAccessLayerAssignment_12 )
            // InternalCompras.g:3125:3: rule__Architecture__DataAccessLayerAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__DataAccessLayerAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getDataAccessLayerAssignment_12()); 

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
    // $ANTLR end "rule__Architecture__Group__12__Impl"


    // $ANTLR start "rule__Architecture__Group__13"
    // InternalCompras.g:3133:1: rule__Architecture__Group__13 : rule__Architecture__Group__13__Impl rule__Architecture__Group__14 ;
    public final void rule__Architecture__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3137:1: ( rule__Architecture__Group__13__Impl rule__Architecture__Group__14 )
            // InternalCompras.g:3138:2: rule__Architecture__Group__13__Impl rule__Architecture__Group__14
            {
            pushFollow(FOLLOW_3);
            rule__Architecture__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__14();

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
    // $ANTLR end "rule__Architecture__Group__13"


    // $ANTLR start "rule__Architecture__Group__13__Impl"
    // InternalCompras.g:3145:1: rule__Architecture__Group__13__Impl : ( 'CommonLayer' ) ;
    public final void rule__Architecture__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3149:1: ( ( 'CommonLayer' ) )
            // InternalCompras.g:3150:1: ( 'CommonLayer' )
            {
            // InternalCompras.g:3150:1: ( 'CommonLayer' )
            // InternalCompras.g:3151:2: 'CommonLayer'
            {
             before(grammarAccess.getArchitectureAccess().getCommonLayerKeyword_13()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getCommonLayerKeyword_13()); 

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
    // $ANTLR end "rule__Architecture__Group__13__Impl"


    // $ANTLR start "rule__Architecture__Group__14"
    // InternalCompras.g:3160:1: rule__Architecture__Group__14 : rule__Architecture__Group__14__Impl rule__Architecture__Group__15 ;
    public final void rule__Architecture__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3164:1: ( rule__Architecture__Group__14__Impl rule__Architecture__Group__15 )
            // InternalCompras.g:3165:2: rule__Architecture__Group__14__Impl rule__Architecture__Group__15
            {
            pushFollow(FOLLOW_4);
            rule__Architecture__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__15();

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
    // $ANTLR end "rule__Architecture__Group__14"


    // $ANTLR start "rule__Architecture__Group__14__Impl"
    // InternalCompras.g:3172:1: rule__Architecture__Group__14__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3176:1: ( ( ':' ) )
            // InternalCompras.g:3177:1: ( ':' )
            {
            // InternalCompras.g:3177:1: ( ':' )
            // InternalCompras.g:3178:2: ':'
            {
             before(grammarAccess.getArchitectureAccess().getColonKeyword_14()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getColonKeyword_14()); 

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
    // $ANTLR end "rule__Architecture__Group__14__Impl"


    // $ANTLR start "rule__Architecture__Group__15"
    // InternalCompras.g:3187:1: rule__Architecture__Group__15 : rule__Architecture__Group__15__Impl rule__Architecture__Group__16 ;
    public final void rule__Architecture__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3191:1: ( rule__Architecture__Group__15__Impl rule__Architecture__Group__16 )
            // InternalCompras.g:3192:2: rule__Architecture__Group__15__Impl rule__Architecture__Group__16
            {
            pushFollow(FOLLOW_13);
            rule__Architecture__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__16();

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
    // $ANTLR end "rule__Architecture__Group__15"


    // $ANTLR start "rule__Architecture__Group__15__Impl"
    // InternalCompras.g:3199:1: rule__Architecture__Group__15__Impl : ( ( rule__Architecture__CommonLayerAssignment_15 ) ) ;
    public final void rule__Architecture__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3203:1: ( ( ( rule__Architecture__CommonLayerAssignment_15 ) ) )
            // InternalCompras.g:3204:1: ( ( rule__Architecture__CommonLayerAssignment_15 ) )
            {
            // InternalCompras.g:3204:1: ( ( rule__Architecture__CommonLayerAssignment_15 ) )
            // InternalCompras.g:3205:2: ( rule__Architecture__CommonLayerAssignment_15 )
            {
             before(grammarAccess.getArchitectureAccess().getCommonLayerAssignment_15()); 
            // InternalCompras.g:3206:2: ( rule__Architecture__CommonLayerAssignment_15 )
            // InternalCompras.g:3206:3: rule__Architecture__CommonLayerAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__CommonLayerAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getCommonLayerAssignment_15()); 

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
    // $ANTLR end "rule__Architecture__Group__15__Impl"


    // $ANTLR start "rule__Architecture__Group__16"
    // InternalCompras.g:3214:1: rule__Architecture__Group__16 : rule__Architecture__Group__16__Impl rule__Architecture__Group__17 ;
    public final void rule__Architecture__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3218:1: ( rule__Architecture__Group__16__Impl rule__Architecture__Group__17 )
            // InternalCompras.g:3219:2: rule__Architecture__Group__16__Impl rule__Architecture__Group__17
            {
            pushFollow(FOLLOW_34);
            rule__Architecture__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__17();

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
    // $ANTLR end "rule__Architecture__Group__16"


    // $ANTLR start "rule__Architecture__Group__16__Impl"
    // InternalCompras.g:3226:1: rule__Architecture__Group__16__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3230:1: ( ( '}' ) )
            // InternalCompras.g:3231:1: ( '}' )
            {
            // InternalCompras.g:3231:1: ( '}' )
            // InternalCompras.g:3232:2: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_16()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_16()); 

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
    // $ANTLR end "rule__Architecture__Group__16__Impl"


    // $ANTLR start "rule__Architecture__Group__17"
    // InternalCompras.g:3241:1: rule__Architecture__Group__17 : rule__Architecture__Group__17__Impl rule__Architecture__Group__18 ;
    public final void rule__Architecture__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3245:1: ( rule__Architecture__Group__17__Impl rule__Architecture__Group__18 )
            // InternalCompras.g:3246:2: rule__Architecture__Group__17__Impl rule__Architecture__Group__18
            {
            pushFollow(FOLLOW_3);
            rule__Architecture__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__18();

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
    // $ANTLR end "rule__Architecture__Group__17"


    // $ANTLR start "rule__Architecture__Group__17__Impl"
    // InternalCompras.g:3253:1: rule__Architecture__Group__17__Impl : ( 'Relations' ) ;
    public final void rule__Architecture__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3257:1: ( ( 'Relations' ) )
            // InternalCompras.g:3258:1: ( 'Relations' )
            {
            // InternalCompras.g:3258:1: ( 'Relations' )
            // InternalCompras.g:3259:2: 'Relations'
            {
             before(grammarAccess.getArchitectureAccess().getRelationsKeyword_17()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getRelationsKeyword_17()); 

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
    // $ANTLR end "rule__Architecture__Group__17__Impl"


    // $ANTLR start "rule__Architecture__Group__18"
    // InternalCompras.g:3268:1: rule__Architecture__Group__18 : rule__Architecture__Group__18__Impl rule__Architecture__Group__19 ;
    public final void rule__Architecture__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3272:1: ( rule__Architecture__Group__18__Impl rule__Architecture__Group__19 )
            // InternalCompras.g:3273:2: rule__Architecture__Group__18__Impl rule__Architecture__Group__19
            {
            pushFollow(FOLLOW_5);
            rule__Architecture__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__19();

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
    // $ANTLR end "rule__Architecture__Group__18"


    // $ANTLR start "rule__Architecture__Group__18__Impl"
    // InternalCompras.g:3280:1: rule__Architecture__Group__18__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3284:1: ( ( ':' ) )
            // InternalCompras.g:3285:1: ( ':' )
            {
            // InternalCompras.g:3285:1: ( ':' )
            // InternalCompras.g:3286:2: ':'
            {
             before(grammarAccess.getArchitectureAccess().getColonKeyword_18()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getColonKeyword_18()); 

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
    // $ANTLR end "rule__Architecture__Group__18__Impl"


    // $ANTLR start "rule__Architecture__Group__19"
    // InternalCompras.g:3295:1: rule__Architecture__Group__19 : rule__Architecture__Group__19__Impl rule__Architecture__Group__20 ;
    public final void rule__Architecture__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3299:1: ( rule__Architecture__Group__19__Impl rule__Architecture__Group__20 )
            // InternalCompras.g:3300:2: rule__Architecture__Group__19__Impl rule__Architecture__Group__20
            {
            pushFollow(FOLLOW_13);
            rule__Architecture__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__20();

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
    // $ANTLR end "rule__Architecture__Group__19"


    // $ANTLR start "rule__Architecture__Group__19__Impl"
    // InternalCompras.g:3307:1: rule__Architecture__Group__19__Impl : ( ( rule__Architecture__RelationsAssignment_19 ) ) ;
    public final void rule__Architecture__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3311:1: ( ( ( rule__Architecture__RelationsAssignment_19 ) ) )
            // InternalCompras.g:3312:1: ( ( rule__Architecture__RelationsAssignment_19 ) )
            {
            // InternalCompras.g:3312:1: ( ( rule__Architecture__RelationsAssignment_19 ) )
            // InternalCompras.g:3313:2: ( rule__Architecture__RelationsAssignment_19 )
            {
             before(grammarAccess.getArchitectureAccess().getRelationsAssignment_19()); 
            // InternalCompras.g:3314:2: ( rule__Architecture__RelationsAssignment_19 )
            // InternalCompras.g:3314:3: rule__Architecture__RelationsAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__RelationsAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getRelationsAssignment_19()); 

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
    // $ANTLR end "rule__Architecture__Group__19__Impl"


    // $ANTLR start "rule__Architecture__Group__20"
    // InternalCompras.g:3322:1: rule__Architecture__Group__20 : rule__Architecture__Group__20__Impl ;
    public final void rule__Architecture__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3326:1: ( rule__Architecture__Group__20__Impl )
            // InternalCompras.g:3327:2: rule__Architecture__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__20__Impl();

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
    // $ANTLR end "rule__Architecture__Group__20"


    // $ANTLR start "rule__Architecture__Group__20__Impl"
    // InternalCompras.g:3333:1: rule__Architecture__Group__20__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3337:1: ( ( '}' ) )
            // InternalCompras.g:3338:1: ( '}' )
            {
            // InternalCompras.g:3338:1: ( '}' )
            // InternalCompras.g:3339:2: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_20()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_20()); 

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
    // $ANTLR end "rule__Architecture__Group__20__Impl"


    // $ANTLR start "rule__PresentationLayer__Group__0"
    // InternalCompras.g:3349:1: rule__PresentationLayer__Group__0 : rule__PresentationLayer__Group__0__Impl rule__PresentationLayer__Group__1 ;
    public final void rule__PresentationLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3353:1: ( rule__PresentationLayer__Group__0__Impl rule__PresentationLayer__Group__1 )
            // InternalCompras.g:3354:2: rule__PresentationLayer__Group__0__Impl rule__PresentationLayer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PresentationLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PresentationLayer__Group__1();

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
    // $ANTLR end "rule__PresentationLayer__Group__0"


    // $ANTLR start "rule__PresentationLayer__Group__0__Impl"
    // InternalCompras.g:3361:1: rule__PresentationLayer__Group__0__Impl : ( ( rule__PresentationLayer__NameAssignment_0 ) ) ;
    public final void rule__PresentationLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3365:1: ( ( ( rule__PresentationLayer__NameAssignment_0 ) ) )
            // InternalCompras.g:3366:1: ( ( rule__PresentationLayer__NameAssignment_0 ) )
            {
            // InternalCompras.g:3366:1: ( ( rule__PresentationLayer__NameAssignment_0 ) )
            // InternalCompras.g:3367:2: ( rule__PresentationLayer__NameAssignment_0 )
            {
             before(grammarAccess.getPresentationLayerAccess().getNameAssignment_0()); 
            // InternalCompras.g:3368:2: ( rule__PresentationLayer__NameAssignment_0 )
            // InternalCompras.g:3368:3: rule__PresentationLayer__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PresentationLayer__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPresentationLayerAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__PresentationLayer__Group__0__Impl"


    // $ANTLR start "rule__PresentationLayer__Group__1"
    // InternalCompras.g:3376:1: rule__PresentationLayer__Group__1 : rule__PresentationLayer__Group__1__Impl rule__PresentationLayer__Group__2 ;
    public final void rule__PresentationLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3380:1: ( rule__PresentationLayer__Group__1__Impl rule__PresentationLayer__Group__2 )
            // InternalCompras.g:3381:2: rule__PresentationLayer__Group__1__Impl rule__PresentationLayer__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PresentationLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PresentationLayer__Group__2();

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
    // $ANTLR end "rule__PresentationLayer__Group__1"


    // $ANTLR start "rule__PresentationLayer__Group__1__Impl"
    // InternalCompras.g:3388:1: rule__PresentationLayer__Group__1__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3392:1: ( ( ':' ) )
            // InternalCompras.g:3393:1: ( ':' )
            {
            // InternalCompras.g:3393:1: ( ':' )
            // InternalCompras.g:3394:2: ':'
            {
             before(grammarAccess.getPresentationLayerAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPresentationLayerAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__PresentationLayer__Group__1__Impl"


    // $ANTLR start "rule__PresentationLayer__Group__2"
    // InternalCompras.g:3403:1: rule__PresentationLayer__Group__2 : rule__PresentationLayer__Group__2__Impl rule__PresentationLayer__Group__3 ;
    public final void rule__PresentationLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3407:1: ( rule__PresentationLayer__Group__2__Impl rule__PresentationLayer__Group__3 )
            // InternalCompras.g:3408:2: rule__PresentationLayer__Group__2__Impl rule__PresentationLayer__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__PresentationLayer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PresentationLayer__Group__3();

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
    // $ANTLR end "rule__PresentationLayer__Group__2"


    // $ANTLR start "rule__PresentationLayer__Group__2__Impl"
    // InternalCompras.g:3415:1: rule__PresentationLayer__Group__2__Impl : ( '{' ) ;
    public final void rule__PresentationLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3419:1: ( ( '{' ) )
            // InternalCompras.g:3420:1: ( '{' )
            {
            // InternalCompras.g:3420:1: ( '{' )
            // InternalCompras.g:3421:2: '{'
            {
             before(grammarAccess.getPresentationLayerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPresentationLayerAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PresentationLayer__Group__2__Impl"


    // $ANTLR start "rule__PresentationLayer__Group__3"
    // InternalCompras.g:3430:1: rule__PresentationLayer__Group__3 : rule__PresentationLayer__Group__3__Impl rule__PresentationLayer__Group__4 ;
    public final void rule__PresentationLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3434:1: ( rule__PresentationLayer__Group__3__Impl rule__PresentationLayer__Group__4 )
            // InternalCompras.g:3435:2: rule__PresentationLayer__Group__3__Impl rule__PresentationLayer__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__PresentationLayer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PresentationLayer__Group__4();

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
    // $ANTLR end "rule__PresentationLayer__Group__3"


    // $ANTLR start "rule__PresentationLayer__Group__3__Impl"
    // InternalCompras.g:3442:1: rule__PresentationLayer__Group__3__Impl : ( 'ControllerSegmentLayer' ) ;
    public final void rule__PresentationLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3446:1: ( ( 'ControllerSegmentLayer' ) )
            // InternalCompras.g:3447:1: ( 'ControllerSegmentLayer' )
            {
            // InternalCompras.g:3447:1: ( 'ControllerSegmentLayer' )
            // InternalCompras.g:3448:2: 'ControllerSegmentLayer'
            {
             before(grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerKeyword_3()); 

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
    // $ANTLR end "rule__PresentationLayer__Group__3__Impl"


    // $ANTLR start "rule__PresentationLayer__Group__4"
    // InternalCompras.g:3457:1: rule__PresentationLayer__Group__4 : rule__PresentationLayer__Group__4__Impl rule__PresentationLayer__Group__5 ;
    public final void rule__PresentationLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3461:1: ( rule__PresentationLayer__Group__4__Impl rule__PresentationLayer__Group__5 )
            // InternalCompras.g:3462:2: rule__PresentationLayer__Group__4__Impl rule__PresentationLayer__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__PresentationLayer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PresentationLayer__Group__5();

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
    // $ANTLR end "rule__PresentationLayer__Group__4"


    // $ANTLR start "rule__PresentationLayer__Group__4__Impl"
    // InternalCompras.g:3469:1: rule__PresentationLayer__Group__4__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3473:1: ( ( ':' ) )
            // InternalCompras.g:3474:1: ( ':' )
            {
            // InternalCompras.g:3474:1: ( ':' )
            // InternalCompras.g:3475:2: ':'
            {
             before(grammarAccess.getPresentationLayerAccess().getColonKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPresentationLayerAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__PresentationLayer__Group__4__Impl"


    // $ANTLR start "rule__PresentationLayer__Group__5"
    // InternalCompras.g:3484:1: rule__PresentationLayer__Group__5 : rule__PresentationLayer__Group__5__Impl rule__PresentationLayer__Group__6 ;
    public final void rule__PresentationLayer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3488:1: ( rule__PresentationLayer__Group__5__Impl rule__PresentationLayer__Group__6 )
            // InternalCompras.g:3489:2: rule__PresentationLayer__Group__5__Impl rule__PresentationLayer__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__PresentationLayer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PresentationLayer__Group__6();

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
    // $ANTLR end "rule__PresentationLayer__Group__5"


    // $ANTLR start "rule__PresentationLayer__Group__5__Impl"
    // InternalCompras.g:3496:1: rule__PresentationLayer__Group__5__Impl : ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) ) ;
    public final void rule__PresentationLayer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3500:1: ( ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) ) )
            // InternalCompras.g:3501:1: ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) )
            {
            // InternalCompras.g:3501:1: ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) )
            // InternalCompras.g:3502:2: ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 )
            {
             before(grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerAssignment_5()); 
            // InternalCompras.g:3503:2: ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 )
            // InternalCompras.g:3503:3: rule__PresentationLayer__ControllerSegmentLayerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PresentationLayer__ControllerSegmentLayerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerAssignment_5()); 

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
    // $ANTLR end "rule__PresentationLayer__Group__5__Impl"


    // $ANTLR start "rule__PresentationLayer__Group__6"
    // InternalCompras.g:3511:1: rule__PresentationLayer__Group__6 : rule__PresentationLayer__Group__6__Impl rule__PresentationLayer__Group__7 ;
    public final void rule__PresentationLayer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3515:1: ( rule__PresentationLayer__Group__6__Impl rule__PresentationLayer__Group__7 )
            // InternalCompras.g:3516:2: rule__PresentationLayer__Group__6__Impl rule__PresentationLayer__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__PresentationLayer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PresentationLayer__Group__7();

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
    // $ANTLR end "rule__PresentationLayer__Group__6"


    // $ANTLR start "rule__PresentationLayer__Group__6__Impl"
    // InternalCompras.g:3523:1: rule__PresentationLayer__Group__6__Impl : ( 'ViewSegmentLayer' ) ;
    public final void rule__PresentationLayer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3527:1: ( ( 'ViewSegmentLayer' ) )
            // InternalCompras.g:3528:1: ( 'ViewSegmentLayer' )
            {
            // InternalCompras.g:3528:1: ( 'ViewSegmentLayer' )
            // InternalCompras.g:3529:2: 'ViewSegmentLayer'
            {
             before(grammarAccess.getPresentationLayerAccess().getViewSegmentLayerKeyword_6()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPresentationLayerAccess().getViewSegmentLayerKeyword_6()); 

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
    // $ANTLR end "rule__PresentationLayer__Group__6__Impl"


    // $ANTLR start "rule__PresentationLayer__Group__7"
    // InternalCompras.g:3538:1: rule__PresentationLayer__Group__7 : rule__PresentationLayer__Group__7__Impl rule__PresentationLayer__Group__8 ;
    public final void rule__PresentationLayer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3542:1: ( rule__PresentationLayer__Group__7__Impl rule__PresentationLayer__Group__8 )
            // InternalCompras.g:3543:2: rule__PresentationLayer__Group__7__Impl rule__PresentationLayer__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__PresentationLayer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PresentationLayer__Group__8();

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
    // $ANTLR end "rule__PresentationLayer__Group__7"


    // $ANTLR start "rule__PresentationLayer__Group__7__Impl"
    // InternalCompras.g:3550:1: rule__PresentationLayer__Group__7__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3554:1: ( ( ':' ) )
            // InternalCompras.g:3555:1: ( ':' )
            {
            // InternalCompras.g:3555:1: ( ':' )
            // InternalCompras.g:3556:2: ':'
            {
             before(grammarAccess.getPresentationLayerAccess().getColonKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPresentationLayerAccess().getColonKeyword_7()); 

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
    // $ANTLR end "rule__PresentationLayer__Group__7__Impl"


    // $ANTLR start "rule__PresentationLayer__Group__8"
    // InternalCompras.g:3565:1: rule__PresentationLayer__Group__8 : rule__PresentationLayer__Group__8__Impl rule__PresentationLayer__Group__9 ;
    public final void rule__PresentationLayer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3569:1: ( rule__PresentationLayer__Group__8__Impl rule__PresentationLayer__Group__9 )
            // InternalCompras.g:3570:2: rule__PresentationLayer__Group__8__Impl rule__PresentationLayer__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__PresentationLayer__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PresentationLayer__Group__9();

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
    // $ANTLR end "rule__PresentationLayer__Group__8"


    // $ANTLR start "rule__PresentationLayer__Group__8__Impl"
    // InternalCompras.g:3577:1: rule__PresentationLayer__Group__8__Impl : ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) ) ;
    public final void rule__PresentationLayer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3581:1: ( ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) ) )
            // InternalCompras.g:3582:1: ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) )
            {
            // InternalCompras.g:3582:1: ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) )
            // InternalCompras.g:3583:2: ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 )
            {
             before(grammarAccess.getPresentationLayerAccess().getViewSegmentLayerAssignment_8()); 
            // InternalCompras.g:3584:2: ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 )
            // InternalCompras.g:3584:3: rule__PresentationLayer__ViewSegmentLayerAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__PresentationLayer__ViewSegmentLayerAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPresentationLayerAccess().getViewSegmentLayerAssignment_8()); 

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
    // $ANTLR end "rule__PresentationLayer__Group__8__Impl"


    // $ANTLR start "rule__PresentationLayer__Group__9"
    // InternalCompras.g:3592:1: rule__PresentationLayer__Group__9 : rule__PresentationLayer__Group__9__Impl rule__PresentationLayer__Group__10 ;
    public final void rule__PresentationLayer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3596:1: ( rule__PresentationLayer__Group__9__Impl rule__PresentationLayer__Group__10 )
            // InternalCompras.g:3597:2: rule__PresentationLayer__Group__9__Impl rule__PresentationLayer__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__PresentationLayer__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PresentationLayer__Group__10();

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
    // $ANTLR end "rule__PresentationLayer__Group__9"


    // $ANTLR start "rule__PresentationLayer__Group__9__Impl"
    // InternalCompras.g:3604:1: rule__PresentationLayer__Group__9__Impl : ( 'ScriptSegmentLayer' ) ;
    public final void rule__PresentationLayer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3608:1: ( ( 'ScriptSegmentLayer' ) )
            // InternalCompras.g:3609:1: ( 'ScriptSegmentLayer' )
            {
            // InternalCompras.g:3609:1: ( 'ScriptSegmentLayer' )
            // InternalCompras.g:3610:2: 'ScriptSegmentLayer'
            {
             before(grammarAccess.getPresentationLayerAccess().getScriptSegmentLayerKeyword_9()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPresentationLayerAccess().getScriptSegmentLayerKeyword_9()); 

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
    // $ANTLR end "rule__PresentationLayer__Group__9__Impl"


    // $ANTLR start "rule__PresentationLayer__Group__10"
    // InternalCompras.g:3619:1: rule__PresentationLayer__Group__10 : rule__PresentationLayer__Group__10__Impl rule__PresentationLayer__Group__11 ;
    public final void rule__PresentationLayer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3623:1: ( rule__PresentationLayer__Group__10__Impl rule__PresentationLayer__Group__11 )
            // InternalCompras.g:3624:2: rule__PresentationLayer__Group__10__Impl rule__PresentationLayer__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__PresentationLayer__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PresentationLayer__Group__11();

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
    // $ANTLR end "rule__PresentationLayer__Group__10"


    // $ANTLR start "rule__PresentationLayer__Group__10__Impl"
    // InternalCompras.g:3631:1: rule__PresentationLayer__Group__10__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3635:1: ( ( ':' ) )
            // InternalCompras.g:3636:1: ( ':' )
            {
            // InternalCompras.g:3636:1: ( ':' )
            // InternalCompras.g:3637:2: ':'
            {
             before(grammarAccess.getPresentationLayerAccess().getColonKeyword_10()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPresentationLayerAccess().getColonKeyword_10()); 

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
    // $ANTLR end "rule__PresentationLayer__Group__10__Impl"


    // $ANTLR start "rule__PresentationLayer__Group__11"
    // InternalCompras.g:3646:1: rule__PresentationLayer__Group__11 : rule__PresentationLayer__Group__11__Impl rule__PresentationLayer__Group__12 ;
    public final void rule__PresentationLayer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3650:1: ( rule__PresentationLayer__Group__11__Impl rule__PresentationLayer__Group__12 )
            // InternalCompras.g:3651:2: rule__PresentationLayer__Group__11__Impl rule__PresentationLayer__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__PresentationLayer__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PresentationLayer__Group__12();

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
    // $ANTLR end "rule__PresentationLayer__Group__11"


    // $ANTLR start "rule__PresentationLayer__Group__11__Impl"
    // InternalCompras.g:3658:1: rule__PresentationLayer__Group__11__Impl : ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) ) ;
    public final void rule__PresentationLayer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3662:1: ( ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) ) )
            // InternalCompras.g:3663:1: ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) )
            {
            // InternalCompras.g:3663:1: ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) )
            // InternalCompras.g:3664:2: ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 )
            {
             before(grammarAccess.getPresentationLayerAccess().getScriptegmentLayerAssignment_11()); 
            // InternalCompras.g:3665:2: ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 )
            // InternalCompras.g:3665:3: rule__PresentationLayer__ScriptegmentLayerAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__PresentationLayer__ScriptegmentLayerAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPresentationLayerAccess().getScriptegmentLayerAssignment_11()); 

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
    // $ANTLR end "rule__PresentationLayer__Group__11__Impl"


    // $ANTLR start "rule__PresentationLayer__Group__12"
    // InternalCompras.g:3673:1: rule__PresentationLayer__Group__12 : rule__PresentationLayer__Group__12__Impl ;
    public final void rule__PresentationLayer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3677:1: ( rule__PresentationLayer__Group__12__Impl )
            // InternalCompras.g:3678:2: rule__PresentationLayer__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PresentationLayer__Group__12__Impl();

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
    // $ANTLR end "rule__PresentationLayer__Group__12"


    // $ANTLR start "rule__PresentationLayer__Group__12__Impl"
    // InternalCompras.g:3684:1: rule__PresentationLayer__Group__12__Impl : ( '}' ) ;
    public final void rule__PresentationLayer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3688:1: ( ( '}' ) )
            // InternalCompras.g:3689:1: ( '}' )
            {
            // InternalCompras.g:3689:1: ( '}' )
            // InternalCompras.g:3690:2: '}'
            {
             before(grammarAccess.getPresentationLayerAccess().getRightCurlyBracketKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPresentationLayerAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__PresentationLayer__Group__12__Impl"


    // $ANTLR start "rule__DataAccessLayer__Group__0"
    // InternalCompras.g:3700:1: rule__DataAccessLayer__Group__0 : rule__DataAccessLayer__Group__0__Impl rule__DataAccessLayer__Group__1 ;
    public final void rule__DataAccessLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3704:1: ( rule__DataAccessLayer__Group__0__Impl rule__DataAccessLayer__Group__1 )
            // InternalCompras.g:3705:2: rule__DataAccessLayer__Group__0__Impl rule__DataAccessLayer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataAccessLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessLayer__Group__1();

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
    // $ANTLR end "rule__DataAccessLayer__Group__0"


    // $ANTLR start "rule__DataAccessLayer__Group__0__Impl"
    // InternalCompras.g:3712:1: rule__DataAccessLayer__Group__0__Impl : ( ( rule__DataAccessLayer__NameAssignment_0 ) ) ;
    public final void rule__DataAccessLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3716:1: ( ( ( rule__DataAccessLayer__NameAssignment_0 ) ) )
            // InternalCompras.g:3717:1: ( ( rule__DataAccessLayer__NameAssignment_0 ) )
            {
            // InternalCompras.g:3717:1: ( ( rule__DataAccessLayer__NameAssignment_0 ) )
            // InternalCompras.g:3718:2: ( rule__DataAccessLayer__NameAssignment_0 )
            {
             before(grammarAccess.getDataAccessLayerAccess().getNameAssignment_0()); 
            // InternalCompras.g:3719:2: ( rule__DataAccessLayer__NameAssignment_0 )
            // InternalCompras.g:3719:3: rule__DataAccessLayer__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessLayer__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessLayerAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__DataAccessLayer__Group__0__Impl"


    // $ANTLR start "rule__DataAccessLayer__Group__1"
    // InternalCompras.g:3727:1: rule__DataAccessLayer__Group__1 : rule__DataAccessLayer__Group__1__Impl rule__DataAccessLayer__Group__2 ;
    public final void rule__DataAccessLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3731:1: ( rule__DataAccessLayer__Group__1__Impl rule__DataAccessLayer__Group__2 )
            // InternalCompras.g:3732:2: rule__DataAccessLayer__Group__1__Impl rule__DataAccessLayer__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DataAccessLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessLayer__Group__2();

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
    // $ANTLR end "rule__DataAccessLayer__Group__1"


    // $ANTLR start "rule__DataAccessLayer__Group__1__Impl"
    // InternalCompras.g:3739:1: rule__DataAccessLayer__Group__1__Impl : ( ':' ) ;
    public final void rule__DataAccessLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3743:1: ( ( ':' ) )
            // InternalCompras.g:3744:1: ( ':' )
            {
            // InternalCompras.g:3744:1: ( ':' )
            // InternalCompras.g:3745:2: ':'
            {
             before(grammarAccess.getDataAccessLayerAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataAccessLayerAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__DataAccessLayer__Group__1__Impl"


    // $ANTLR start "rule__DataAccessLayer__Group__2"
    // InternalCompras.g:3754:1: rule__DataAccessLayer__Group__2 : rule__DataAccessLayer__Group__2__Impl rule__DataAccessLayer__Group__3 ;
    public final void rule__DataAccessLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3758:1: ( rule__DataAccessLayer__Group__2__Impl rule__DataAccessLayer__Group__3 )
            // InternalCompras.g:3759:2: rule__DataAccessLayer__Group__2__Impl rule__DataAccessLayer__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__DataAccessLayer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessLayer__Group__3();

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
    // $ANTLR end "rule__DataAccessLayer__Group__2"


    // $ANTLR start "rule__DataAccessLayer__Group__2__Impl"
    // InternalCompras.g:3766:1: rule__DataAccessLayer__Group__2__Impl : ( '{' ) ;
    public final void rule__DataAccessLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3770:1: ( ( '{' ) )
            // InternalCompras.g:3771:1: ( '{' )
            {
            // InternalCompras.g:3771:1: ( '{' )
            // InternalCompras.g:3772:2: '{'
            {
             before(grammarAccess.getDataAccessLayerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDataAccessLayerAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DataAccessLayer__Group__2__Impl"


    // $ANTLR start "rule__DataAccessLayer__Group__3"
    // InternalCompras.g:3781:1: rule__DataAccessLayer__Group__3 : rule__DataAccessLayer__Group__3__Impl rule__DataAccessLayer__Group__4 ;
    public final void rule__DataAccessLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3785:1: ( rule__DataAccessLayer__Group__3__Impl rule__DataAccessLayer__Group__4 )
            // InternalCompras.g:3786:2: rule__DataAccessLayer__Group__3__Impl rule__DataAccessLayer__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__DataAccessLayer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessLayer__Group__4();

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
    // $ANTLR end "rule__DataAccessLayer__Group__3"


    // $ANTLR start "rule__DataAccessLayer__Group__3__Impl"
    // InternalCompras.g:3793:1: rule__DataAccessLayer__Group__3__Impl : ( 'DbConnectorSegmentLayer' ) ;
    public final void rule__DataAccessLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3797:1: ( ( 'DbConnectorSegmentLayer' ) )
            // InternalCompras.g:3798:1: ( 'DbConnectorSegmentLayer' )
            {
            // InternalCompras.g:3798:1: ( 'DbConnectorSegmentLayer' )
            // InternalCompras.g:3799:2: 'DbConnectorSegmentLayer'
            {
             before(grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerKeyword_3()); 

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
    // $ANTLR end "rule__DataAccessLayer__Group__3__Impl"


    // $ANTLR start "rule__DataAccessLayer__Group__4"
    // InternalCompras.g:3808:1: rule__DataAccessLayer__Group__4 : rule__DataAccessLayer__Group__4__Impl rule__DataAccessLayer__Group__5 ;
    public final void rule__DataAccessLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3812:1: ( rule__DataAccessLayer__Group__4__Impl rule__DataAccessLayer__Group__5 )
            // InternalCompras.g:3813:2: rule__DataAccessLayer__Group__4__Impl rule__DataAccessLayer__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__DataAccessLayer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessLayer__Group__5();

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
    // $ANTLR end "rule__DataAccessLayer__Group__4"


    // $ANTLR start "rule__DataAccessLayer__Group__4__Impl"
    // InternalCompras.g:3820:1: rule__DataAccessLayer__Group__4__Impl : ( ':' ) ;
    public final void rule__DataAccessLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3824:1: ( ( ':' ) )
            // InternalCompras.g:3825:1: ( ':' )
            {
            // InternalCompras.g:3825:1: ( ':' )
            // InternalCompras.g:3826:2: ':'
            {
             before(grammarAccess.getDataAccessLayerAccess().getColonKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataAccessLayerAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__DataAccessLayer__Group__4__Impl"


    // $ANTLR start "rule__DataAccessLayer__Group__5"
    // InternalCompras.g:3835:1: rule__DataAccessLayer__Group__5 : rule__DataAccessLayer__Group__5__Impl rule__DataAccessLayer__Group__6 ;
    public final void rule__DataAccessLayer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3839:1: ( rule__DataAccessLayer__Group__5__Impl rule__DataAccessLayer__Group__6 )
            // InternalCompras.g:3840:2: rule__DataAccessLayer__Group__5__Impl rule__DataAccessLayer__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__DataAccessLayer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessLayer__Group__6();

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
    // $ANTLR end "rule__DataAccessLayer__Group__5"


    // $ANTLR start "rule__DataAccessLayer__Group__5__Impl"
    // InternalCompras.g:3847:1: rule__DataAccessLayer__Group__5__Impl : ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) ) ;
    public final void rule__DataAccessLayer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3851:1: ( ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) ) )
            // InternalCompras.g:3852:1: ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) )
            {
            // InternalCompras.g:3852:1: ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) )
            // InternalCompras.g:3853:2: ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 )
            {
             before(grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerAssignment_5()); 
            // InternalCompras.g:3854:2: ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 )
            // InternalCompras.g:3854:3: rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerAssignment_5()); 

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
    // $ANTLR end "rule__DataAccessLayer__Group__5__Impl"


    // $ANTLR start "rule__DataAccessLayer__Group__6"
    // InternalCompras.g:3862:1: rule__DataAccessLayer__Group__6 : rule__DataAccessLayer__Group__6__Impl ;
    public final void rule__DataAccessLayer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3866:1: ( rule__DataAccessLayer__Group__6__Impl )
            // InternalCompras.g:3867:2: rule__DataAccessLayer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessLayer__Group__6__Impl();

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
    // $ANTLR end "rule__DataAccessLayer__Group__6"


    // $ANTLR start "rule__DataAccessLayer__Group__6__Impl"
    // InternalCompras.g:3873:1: rule__DataAccessLayer__Group__6__Impl : ( '}' ) ;
    public final void rule__DataAccessLayer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3877:1: ( ( '}' ) )
            // InternalCompras.g:3878:1: ( '}' )
            {
            // InternalCompras.g:3878:1: ( '}' )
            // InternalCompras.g:3879:2: '}'
            {
             before(grammarAccess.getDataAccessLayerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDataAccessLayerAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__DataAccessLayer__Group__6__Impl"


    // $ANTLR start "rule__Relations__Group__0"
    // InternalCompras.g:3889:1: rule__Relations__Group__0 : rule__Relations__Group__0__Impl rule__Relations__Group__1 ;
    public final void rule__Relations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3893:1: ( rule__Relations__Group__0__Impl rule__Relations__Group__1 )
            // InternalCompras.g:3894:2: rule__Relations__Group__0__Impl rule__Relations__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Relations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__1();

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
    // $ANTLR end "rule__Relations__Group__0"


    // $ANTLR start "rule__Relations__Group__0__Impl"
    // InternalCompras.g:3901:1: rule__Relations__Group__0__Impl : ( '{' ) ;
    public final void rule__Relations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3905:1: ( ( '{' ) )
            // InternalCompras.g:3906:1: ( '{' )
            {
            // InternalCompras.g:3906:1: ( '{' )
            // InternalCompras.g:3907:2: '{'
            {
             before(grammarAccess.getRelationsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Relations__Group__0__Impl"


    // $ANTLR start "rule__Relations__Group__1"
    // InternalCompras.g:3916:1: rule__Relations__Group__1 : rule__Relations__Group__1__Impl rule__Relations__Group__2 ;
    public final void rule__Relations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3920:1: ( rule__Relations__Group__1__Impl rule__Relations__Group__2 )
            // InternalCompras.g:3921:2: rule__Relations__Group__1__Impl rule__Relations__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Relations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__2();

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
    // $ANTLR end "rule__Relations__Group__1"


    // $ANTLR start "rule__Relations__Group__1__Impl"
    // InternalCompras.g:3928:1: rule__Relations__Group__1__Impl : ( ( rule__Relations__SourceLayer1Assignment_1 ) ) ;
    public final void rule__Relations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3932:1: ( ( ( rule__Relations__SourceLayer1Assignment_1 ) ) )
            // InternalCompras.g:3933:1: ( ( rule__Relations__SourceLayer1Assignment_1 ) )
            {
            // InternalCompras.g:3933:1: ( ( rule__Relations__SourceLayer1Assignment_1 ) )
            // InternalCompras.g:3934:2: ( rule__Relations__SourceLayer1Assignment_1 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer1Assignment_1()); 
            // InternalCompras.g:3935:2: ( rule__Relations__SourceLayer1Assignment_1 )
            // InternalCompras.g:3935:3: rule__Relations__SourceLayer1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relations__SourceLayer1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getSourceLayer1Assignment_1()); 

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
    // $ANTLR end "rule__Relations__Group__1__Impl"


    // $ANTLR start "rule__Relations__Group__2"
    // InternalCompras.g:3943:1: rule__Relations__Group__2 : rule__Relations__Group__2__Impl rule__Relations__Group__3 ;
    public final void rule__Relations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3947:1: ( rule__Relations__Group__2__Impl rule__Relations__Group__3 )
            // InternalCompras.g:3948:2: rule__Relations__Group__2__Impl rule__Relations__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Relations__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__3();

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
    // $ANTLR end "rule__Relations__Group__2"


    // $ANTLR start "rule__Relations__Group__2__Impl"
    // InternalCompras.g:3955:1: rule__Relations__Group__2__Impl : ( ( rule__Relations__RelationsType1Assignment_2 ) ) ;
    public final void rule__Relations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3959:1: ( ( ( rule__Relations__RelationsType1Assignment_2 ) ) )
            // InternalCompras.g:3960:1: ( ( rule__Relations__RelationsType1Assignment_2 ) )
            {
            // InternalCompras.g:3960:1: ( ( rule__Relations__RelationsType1Assignment_2 ) )
            // InternalCompras.g:3961:2: ( rule__Relations__RelationsType1Assignment_2 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType1Assignment_2()); 
            // InternalCompras.g:3962:2: ( rule__Relations__RelationsType1Assignment_2 )
            // InternalCompras.g:3962:3: rule__Relations__RelationsType1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Relations__RelationsType1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getRelationsType1Assignment_2()); 

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
    // $ANTLR end "rule__Relations__Group__2__Impl"


    // $ANTLR start "rule__Relations__Group__3"
    // InternalCompras.g:3970:1: rule__Relations__Group__3 : rule__Relations__Group__3__Impl rule__Relations__Group__4 ;
    public final void rule__Relations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3974:1: ( rule__Relations__Group__3__Impl rule__Relations__Group__4 )
            // InternalCompras.g:3975:2: rule__Relations__Group__3__Impl rule__Relations__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Relations__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__4();

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
    // $ANTLR end "rule__Relations__Group__3"


    // $ANTLR start "rule__Relations__Group__3__Impl"
    // InternalCompras.g:3982:1: rule__Relations__Group__3__Impl : ( ( rule__Relations__TargetLayer1Assignment_3 ) ) ;
    public final void rule__Relations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3986:1: ( ( ( rule__Relations__TargetLayer1Assignment_3 ) ) )
            // InternalCompras.g:3987:1: ( ( rule__Relations__TargetLayer1Assignment_3 ) )
            {
            // InternalCompras.g:3987:1: ( ( rule__Relations__TargetLayer1Assignment_3 ) )
            // InternalCompras.g:3988:2: ( rule__Relations__TargetLayer1Assignment_3 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer1Assignment_3()); 
            // InternalCompras.g:3989:2: ( rule__Relations__TargetLayer1Assignment_3 )
            // InternalCompras.g:3989:3: rule__Relations__TargetLayer1Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Relations__TargetLayer1Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getTargetLayer1Assignment_3()); 

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
    // $ANTLR end "rule__Relations__Group__3__Impl"


    // $ANTLR start "rule__Relations__Group__4"
    // InternalCompras.g:3997:1: rule__Relations__Group__4 : rule__Relations__Group__4__Impl rule__Relations__Group__5 ;
    public final void rule__Relations__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4001:1: ( rule__Relations__Group__4__Impl rule__Relations__Group__5 )
            // InternalCompras.g:4002:2: rule__Relations__Group__4__Impl rule__Relations__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__Relations__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__5();

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
    // $ANTLR end "rule__Relations__Group__4"


    // $ANTLR start "rule__Relations__Group__4__Impl"
    // InternalCompras.g:4009:1: rule__Relations__Group__4__Impl : ( ( rule__Relations__SourceLayer2Assignment_4 ) ) ;
    public final void rule__Relations__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4013:1: ( ( ( rule__Relations__SourceLayer2Assignment_4 ) ) )
            // InternalCompras.g:4014:1: ( ( rule__Relations__SourceLayer2Assignment_4 ) )
            {
            // InternalCompras.g:4014:1: ( ( rule__Relations__SourceLayer2Assignment_4 ) )
            // InternalCompras.g:4015:2: ( rule__Relations__SourceLayer2Assignment_4 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer2Assignment_4()); 
            // InternalCompras.g:4016:2: ( rule__Relations__SourceLayer2Assignment_4 )
            // InternalCompras.g:4016:3: rule__Relations__SourceLayer2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Relations__SourceLayer2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getSourceLayer2Assignment_4()); 

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
    // $ANTLR end "rule__Relations__Group__4__Impl"


    // $ANTLR start "rule__Relations__Group__5"
    // InternalCompras.g:4024:1: rule__Relations__Group__5 : rule__Relations__Group__5__Impl rule__Relations__Group__6 ;
    public final void rule__Relations__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4028:1: ( rule__Relations__Group__5__Impl rule__Relations__Group__6 )
            // InternalCompras.g:4029:2: rule__Relations__Group__5__Impl rule__Relations__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Relations__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__6();

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
    // $ANTLR end "rule__Relations__Group__5"


    // $ANTLR start "rule__Relations__Group__5__Impl"
    // InternalCompras.g:4036:1: rule__Relations__Group__5__Impl : ( ( rule__Relations__RelationsType2Assignment_5 ) ) ;
    public final void rule__Relations__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4040:1: ( ( ( rule__Relations__RelationsType2Assignment_5 ) ) )
            // InternalCompras.g:4041:1: ( ( rule__Relations__RelationsType2Assignment_5 ) )
            {
            // InternalCompras.g:4041:1: ( ( rule__Relations__RelationsType2Assignment_5 ) )
            // InternalCompras.g:4042:2: ( rule__Relations__RelationsType2Assignment_5 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType2Assignment_5()); 
            // InternalCompras.g:4043:2: ( rule__Relations__RelationsType2Assignment_5 )
            // InternalCompras.g:4043:3: rule__Relations__RelationsType2Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Relations__RelationsType2Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getRelationsType2Assignment_5()); 

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
    // $ANTLR end "rule__Relations__Group__5__Impl"


    // $ANTLR start "rule__Relations__Group__6"
    // InternalCompras.g:4051:1: rule__Relations__Group__6 : rule__Relations__Group__6__Impl rule__Relations__Group__7 ;
    public final void rule__Relations__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4055:1: ( rule__Relations__Group__6__Impl rule__Relations__Group__7 )
            // InternalCompras.g:4056:2: rule__Relations__Group__6__Impl rule__Relations__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Relations__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__7();

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
    // $ANTLR end "rule__Relations__Group__6"


    // $ANTLR start "rule__Relations__Group__6__Impl"
    // InternalCompras.g:4063:1: rule__Relations__Group__6__Impl : ( ( rule__Relations__TargetLayer2Assignment_6 ) ) ;
    public final void rule__Relations__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4067:1: ( ( ( rule__Relations__TargetLayer2Assignment_6 ) ) )
            // InternalCompras.g:4068:1: ( ( rule__Relations__TargetLayer2Assignment_6 ) )
            {
            // InternalCompras.g:4068:1: ( ( rule__Relations__TargetLayer2Assignment_6 ) )
            // InternalCompras.g:4069:2: ( rule__Relations__TargetLayer2Assignment_6 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer2Assignment_6()); 
            // InternalCompras.g:4070:2: ( rule__Relations__TargetLayer2Assignment_6 )
            // InternalCompras.g:4070:3: rule__Relations__TargetLayer2Assignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Relations__TargetLayer2Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getTargetLayer2Assignment_6()); 

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
    // $ANTLR end "rule__Relations__Group__6__Impl"


    // $ANTLR start "rule__Relations__Group__7"
    // InternalCompras.g:4078:1: rule__Relations__Group__7 : rule__Relations__Group__7__Impl rule__Relations__Group__8 ;
    public final void rule__Relations__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4082:1: ( rule__Relations__Group__7__Impl rule__Relations__Group__8 )
            // InternalCompras.g:4083:2: rule__Relations__Group__7__Impl rule__Relations__Group__8
            {
            pushFollow(FOLLOW_39);
            rule__Relations__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__8();

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
    // $ANTLR end "rule__Relations__Group__7"


    // $ANTLR start "rule__Relations__Group__7__Impl"
    // InternalCompras.g:4090:1: rule__Relations__Group__7__Impl : ( ( rule__Relations__SourceLayer3Assignment_7 ) ) ;
    public final void rule__Relations__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4094:1: ( ( ( rule__Relations__SourceLayer3Assignment_7 ) ) )
            // InternalCompras.g:4095:1: ( ( rule__Relations__SourceLayer3Assignment_7 ) )
            {
            // InternalCompras.g:4095:1: ( ( rule__Relations__SourceLayer3Assignment_7 ) )
            // InternalCompras.g:4096:2: ( rule__Relations__SourceLayer3Assignment_7 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer3Assignment_7()); 
            // InternalCompras.g:4097:2: ( rule__Relations__SourceLayer3Assignment_7 )
            // InternalCompras.g:4097:3: rule__Relations__SourceLayer3Assignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Relations__SourceLayer3Assignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getSourceLayer3Assignment_7()); 

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
    // $ANTLR end "rule__Relations__Group__7__Impl"


    // $ANTLR start "rule__Relations__Group__8"
    // InternalCompras.g:4105:1: rule__Relations__Group__8 : rule__Relations__Group__8__Impl rule__Relations__Group__9 ;
    public final void rule__Relations__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4109:1: ( rule__Relations__Group__8__Impl rule__Relations__Group__9 )
            // InternalCompras.g:4110:2: rule__Relations__Group__8__Impl rule__Relations__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Relations__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__9();

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
    // $ANTLR end "rule__Relations__Group__8"


    // $ANTLR start "rule__Relations__Group__8__Impl"
    // InternalCompras.g:4117:1: rule__Relations__Group__8__Impl : ( ( rule__Relations__RelationsType3Assignment_8 ) ) ;
    public final void rule__Relations__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4121:1: ( ( ( rule__Relations__RelationsType3Assignment_8 ) ) )
            // InternalCompras.g:4122:1: ( ( rule__Relations__RelationsType3Assignment_8 ) )
            {
            // InternalCompras.g:4122:1: ( ( rule__Relations__RelationsType3Assignment_8 ) )
            // InternalCompras.g:4123:2: ( rule__Relations__RelationsType3Assignment_8 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType3Assignment_8()); 
            // InternalCompras.g:4124:2: ( rule__Relations__RelationsType3Assignment_8 )
            // InternalCompras.g:4124:3: rule__Relations__RelationsType3Assignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Relations__RelationsType3Assignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getRelationsType3Assignment_8()); 

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
    // $ANTLR end "rule__Relations__Group__8__Impl"


    // $ANTLR start "rule__Relations__Group__9"
    // InternalCompras.g:4132:1: rule__Relations__Group__9 : rule__Relations__Group__9__Impl rule__Relations__Group__10 ;
    public final void rule__Relations__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4136:1: ( rule__Relations__Group__9__Impl rule__Relations__Group__10 )
            // InternalCompras.g:4137:2: rule__Relations__Group__9__Impl rule__Relations__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Relations__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__10();

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
    // $ANTLR end "rule__Relations__Group__9"


    // $ANTLR start "rule__Relations__Group__9__Impl"
    // InternalCompras.g:4144:1: rule__Relations__Group__9__Impl : ( ( rule__Relations__TargetLayer3Assignment_9 ) ) ;
    public final void rule__Relations__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4148:1: ( ( ( rule__Relations__TargetLayer3Assignment_9 ) ) )
            // InternalCompras.g:4149:1: ( ( rule__Relations__TargetLayer3Assignment_9 ) )
            {
            // InternalCompras.g:4149:1: ( ( rule__Relations__TargetLayer3Assignment_9 ) )
            // InternalCompras.g:4150:2: ( rule__Relations__TargetLayer3Assignment_9 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer3Assignment_9()); 
            // InternalCompras.g:4151:2: ( rule__Relations__TargetLayer3Assignment_9 )
            // InternalCompras.g:4151:3: rule__Relations__TargetLayer3Assignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Relations__TargetLayer3Assignment_9();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getTargetLayer3Assignment_9()); 

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
    // $ANTLR end "rule__Relations__Group__9__Impl"


    // $ANTLR start "rule__Relations__Group__10"
    // InternalCompras.g:4159:1: rule__Relations__Group__10 : rule__Relations__Group__10__Impl rule__Relations__Group__11 ;
    public final void rule__Relations__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4163:1: ( rule__Relations__Group__10__Impl rule__Relations__Group__11 )
            // InternalCompras.g:4164:2: rule__Relations__Group__10__Impl rule__Relations__Group__11
            {
            pushFollow(FOLLOW_39);
            rule__Relations__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__11();

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
    // $ANTLR end "rule__Relations__Group__10"


    // $ANTLR start "rule__Relations__Group__10__Impl"
    // InternalCompras.g:4171:1: rule__Relations__Group__10__Impl : ( ( rule__Relations__SourceLayer4Assignment_10 ) ) ;
    public final void rule__Relations__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4175:1: ( ( ( rule__Relations__SourceLayer4Assignment_10 ) ) )
            // InternalCompras.g:4176:1: ( ( rule__Relations__SourceLayer4Assignment_10 ) )
            {
            // InternalCompras.g:4176:1: ( ( rule__Relations__SourceLayer4Assignment_10 ) )
            // InternalCompras.g:4177:2: ( rule__Relations__SourceLayer4Assignment_10 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer4Assignment_10()); 
            // InternalCompras.g:4178:2: ( rule__Relations__SourceLayer4Assignment_10 )
            // InternalCompras.g:4178:3: rule__Relations__SourceLayer4Assignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Relations__SourceLayer4Assignment_10();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getSourceLayer4Assignment_10()); 

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
    // $ANTLR end "rule__Relations__Group__10__Impl"


    // $ANTLR start "rule__Relations__Group__11"
    // InternalCompras.g:4186:1: rule__Relations__Group__11 : rule__Relations__Group__11__Impl rule__Relations__Group__12 ;
    public final void rule__Relations__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4190:1: ( rule__Relations__Group__11__Impl rule__Relations__Group__12 )
            // InternalCompras.g:4191:2: rule__Relations__Group__11__Impl rule__Relations__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__Relations__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__12();

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
    // $ANTLR end "rule__Relations__Group__11"


    // $ANTLR start "rule__Relations__Group__11__Impl"
    // InternalCompras.g:4198:1: rule__Relations__Group__11__Impl : ( ( rule__Relations__RelationsType4Assignment_11 ) ) ;
    public final void rule__Relations__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4202:1: ( ( ( rule__Relations__RelationsType4Assignment_11 ) ) )
            // InternalCompras.g:4203:1: ( ( rule__Relations__RelationsType4Assignment_11 ) )
            {
            // InternalCompras.g:4203:1: ( ( rule__Relations__RelationsType4Assignment_11 ) )
            // InternalCompras.g:4204:2: ( rule__Relations__RelationsType4Assignment_11 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType4Assignment_11()); 
            // InternalCompras.g:4205:2: ( rule__Relations__RelationsType4Assignment_11 )
            // InternalCompras.g:4205:3: rule__Relations__RelationsType4Assignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Relations__RelationsType4Assignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getRelationsType4Assignment_11()); 

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
    // $ANTLR end "rule__Relations__Group__11__Impl"


    // $ANTLR start "rule__Relations__Group__12"
    // InternalCompras.g:4213:1: rule__Relations__Group__12 : rule__Relations__Group__12__Impl rule__Relations__Group__13 ;
    public final void rule__Relations__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4217:1: ( rule__Relations__Group__12__Impl rule__Relations__Group__13 )
            // InternalCompras.g:4218:2: rule__Relations__Group__12__Impl rule__Relations__Group__13
            {
            pushFollow(FOLLOW_4);
            rule__Relations__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__13();

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
    // $ANTLR end "rule__Relations__Group__12"


    // $ANTLR start "rule__Relations__Group__12__Impl"
    // InternalCompras.g:4225:1: rule__Relations__Group__12__Impl : ( ( rule__Relations__TargetLayer4Assignment_12 ) ) ;
    public final void rule__Relations__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4229:1: ( ( ( rule__Relations__TargetLayer4Assignment_12 ) ) )
            // InternalCompras.g:4230:1: ( ( rule__Relations__TargetLayer4Assignment_12 ) )
            {
            // InternalCompras.g:4230:1: ( ( rule__Relations__TargetLayer4Assignment_12 ) )
            // InternalCompras.g:4231:2: ( rule__Relations__TargetLayer4Assignment_12 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer4Assignment_12()); 
            // InternalCompras.g:4232:2: ( rule__Relations__TargetLayer4Assignment_12 )
            // InternalCompras.g:4232:3: rule__Relations__TargetLayer4Assignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Relations__TargetLayer4Assignment_12();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getTargetLayer4Assignment_12()); 

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
    // $ANTLR end "rule__Relations__Group__12__Impl"


    // $ANTLR start "rule__Relations__Group__13"
    // InternalCompras.g:4240:1: rule__Relations__Group__13 : rule__Relations__Group__13__Impl rule__Relations__Group__14 ;
    public final void rule__Relations__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4244:1: ( rule__Relations__Group__13__Impl rule__Relations__Group__14 )
            // InternalCompras.g:4245:2: rule__Relations__Group__13__Impl rule__Relations__Group__14
            {
            pushFollow(FOLLOW_39);
            rule__Relations__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__14();

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
    // $ANTLR end "rule__Relations__Group__13"


    // $ANTLR start "rule__Relations__Group__13__Impl"
    // InternalCompras.g:4252:1: rule__Relations__Group__13__Impl : ( ( rule__Relations__SourceLayer5Assignment_13 ) ) ;
    public final void rule__Relations__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4256:1: ( ( ( rule__Relations__SourceLayer5Assignment_13 ) ) )
            // InternalCompras.g:4257:1: ( ( rule__Relations__SourceLayer5Assignment_13 ) )
            {
            // InternalCompras.g:4257:1: ( ( rule__Relations__SourceLayer5Assignment_13 ) )
            // InternalCompras.g:4258:2: ( rule__Relations__SourceLayer5Assignment_13 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer5Assignment_13()); 
            // InternalCompras.g:4259:2: ( rule__Relations__SourceLayer5Assignment_13 )
            // InternalCompras.g:4259:3: rule__Relations__SourceLayer5Assignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Relations__SourceLayer5Assignment_13();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getSourceLayer5Assignment_13()); 

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
    // $ANTLR end "rule__Relations__Group__13__Impl"


    // $ANTLR start "rule__Relations__Group__14"
    // InternalCompras.g:4267:1: rule__Relations__Group__14 : rule__Relations__Group__14__Impl rule__Relations__Group__15 ;
    public final void rule__Relations__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4271:1: ( rule__Relations__Group__14__Impl rule__Relations__Group__15 )
            // InternalCompras.g:4272:2: rule__Relations__Group__14__Impl rule__Relations__Group__15
            {
            pushFollow(FOLLOW_4);
            rule__Relations__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__15();

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
    // $ANTLR end "rule__Relations__Group__14"


    // $ANTLR start "rule__Relations__Group__14__Impl"
    // InternalCompras.g:4279:1: rule__Relations__Group__14__Impl : ( ( rule__Relations__RelationsType5Assignment_14 ) ) ;
    public final void rule__Relations__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4283:1: ( ( ( rule__Relations__RelationsType5Assignment_14 ) ) )
            // InternalCompras.g:4284:1: ( ( rule__Relations__RelationsType5Assignment_14 ) )
            {
            // InternalCompras.g:4284:1: ( ( rule__Relations__RelationsType5Assignment_14 ) )
            // InternalCompras.g:4285:2: ( rule__Relations__RelationsType5Assignment_14 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType5Assignment_14()); 
            // InternalCompras.g:4286:2: ( rule__Relations__RelationsType5Assignment_14 )
            // InternalCompras.g:4286:3: rule__Relations__RelationsType5Assignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Relations__RelationsType5Assignment_14();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getRelationsType5Assignment_14()); 

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
    // $ANTLR end "rule__Relations__Group__14__Impl"


    // $ANTLR start "rule__Relations__Group__15"
    // InternalCompras.g:4294:1: rule__Relations__Group__15 : rule__Relations__Group__15__Impl rule__Relations__Group__16 ;
    public final void rule__Relations__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4298:1: ( rule__Relations__Group__15__Impl rule__Relations__Group__16 )
            // InternalCompras.g:4299:2: rule__Relations__Group__15__Impl rule__Relations__Group__16
            {
            pushFollow(FOLLOW_13);
            rule__Relations__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__16();

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
    // $ANTLR end "rule__Relations__Group__15"


    // $ANTLR start "rule__Relations__Group__15__Impl"
    // InternalCompras.g:4306:1: rule__Relations__Group__15__Impl : ( ( rule__Relations__TargetLayer5Assignment_15 ) ) ;
    public final void rule__Relations__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4310:1: ( ( ( rule__Relations__TargetLayer5Assignment_15 ) ) )
            // InternalCompras.g:4311:1: ( ( rule__Relations__TargetLayer5Assignment_15 ) )
            {
            // InternalCompras.g:4311:1: ( ( rule__Relations__TargetLayer5Assignment_15 ) )
            // InternalCompras.g:4312:2: ( rule__Relations__TargetLayer5Assignment_15 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer5Assignment_15()); 
            // InternalCompras.g:4313:2: ( rule__Relations__TargetLayer5Assignment_15 )
            // InternalCompras.g:4313:3: rule__Relations__TargetLayer5Assignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Relations__TargetLayer5Assignment_15();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getTargetLayer5Assignment_15()); 

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
    // $ANTLR end "rule__Relations__Group__15__Impl"


    // $ANTLR start "rule__Relations__Group__16"
    // InternalCompras.g:4321:1: rule__Relations__Group__16 : rule__Relations__Group__16__Impl ;
    public final void rule__Relations__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4325:1: ( rule__Relations__Group__16__Impl )
            // InternalCompras.g:4326:2: rule__Relations__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relations__Group__16__Impl();

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
    // $ANTLR end "rule__Relations__Group__16"


    // $ANTLR start "rule__Relations__Group__16__Impl"
    // InternalCompras.g:4332:1: rule__Relations__Group__16__Impl : ( '}' ) ;
    public final void rule__Relations__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4336:1: ( ( '}' ) )
            // InternalCompras.g:4337:1: ( '}' )
            {
            // InternalCompras.g:4337:1: ( '}' )
            // InternalCompras.g:4338:2: '}'
            {
             before(grammarAccess.getRelationsAccess().getRightCurlyBracketKeyword_16()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getRightCurlyBracketKeyword_16()); 

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
    // $ANTLR end "rule__Relations__Group__16__Impl"


    // $ANTLR start "rule__Technology__Group__0"
    // InternalCompras.g:4348:1: rule__Technology__Group__0 : rule__Technology__Group__0__Impl rule__Technology__Group__1 ;
    public final void rule__Technology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4352:1: ( rule__Technology__Group__0__Impl rule__Technology__Group__1 )
            // InternalCompras.g:4353:2: rule__Technology__Group__0__Impl rule__Technology__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Technology__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group__1();

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
    // $ANTLR end "rule__Technology__Group__0"


    // $ANTLR start "rule__Technology__Group__0__Impl"
    // InternalCompras.g:4360:1: rule__Technology__Group__0__Impl : ( '{' ) ;
    public final void rule__Technology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4364:1: ( ( '{' ) )
            // InternalCompras.g:4365:1: ( '{' )
            {
            // InternalCompras.g:4365:1: ( '{' )
            // InternalCompras.g:4366:2: '{'
            {
             before(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Technology__Group__0__Impl"


    // $ANTLR start "rule__Technology__Group__1"
    // InternalCompras.g:4375:1: rule__Technology__Group__1 : rule__Technology__Group__1__Impl rule__Technology__Group__2 ;
    public final void rule__Technology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4379:1: ( rule__Technology__Group__1__Impl rule__Technology__Group__2 )
            // InternalCompras.g:4380:2: rule__Technology__Group__1__Impl rule__Technology__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Technology__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group__2();

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
    // $ANTLR end "rule__Technology__Group__1"


    // $ANTLR start "rule__Technology__Group__1__Impl"
    // InternalCompras.g:4387:1: rule__Technology__Group__1__Impl : ( ( rule__Technology__Group_1__0 )? ) ;
    public final void rule__Technology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4391:1: ( ( ( rule__Technology__Group_1__0 )? ) )
            // InternalCompras.g:4392:1: ( ( rule__Technology__Group_1__0 )? )
            {
            // InternalCompras.g:4392:1: ( ( rule__Technology__Group_1__0 )? )
            // InternalCompras.g:4393:2: ( rule__Technology__Group_1__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_1()); 
            // InternalCompras.g:4394:2: ( rule__Technology__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCompras.g:4394:3: rule__Technology__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Technology__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTechnologyAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Technology__Group__1__Impl"


    // $ANTLR start "rule__Technology__Group__2"
    // InternalCompras.g:4402:1: rule__Technology__Group__2 : rule__Technology__Group__2__Impl rule__Technology__Group__3 ;
    public final void rule__Technology__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4406:1: ( rule__Technology__Group__2__Impl rule__Technology__Group__3 )
            // InternalCompras.g:4407:2: rule__Technology__Group__2__Impl rule__Technology__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__Technology__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group__3();

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
    // $ANTLR end "rule__Technology__Group__2"


    // $ANTLR start "rule__Technology__Group__2__Impl"
    // InternalCompras.g:4414:1: rule__Technology__Group__2__Impl : ( ( rule__Technology__Group_2__0 )? ) ;
    public final void rule__Technology__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4418:1: ( ( ( rule__Technology__Group_2__0 )? ) )
            // InternalCompras.g:4419:1: ( ( rule__Technology__Group_2__0 )? )
            {
            // InternalCompras.g:4419:1: ( ( rule__Technology__Group_2__0 )? )
            // InternalCompras.g:4420:2: ( rule__Technology__Group_2__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2()); 
            // InternalCompras.g:4421:2: ( rule__Technology__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCompras.g:4421:3: rule__Technology__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Technology__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTechnologyAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Technology__Group__2__Impl"


    // $ANTLR start "rule__Technology__Group__3"
    // InternalCompras.g:4429:1: rule__Technology__Group__3 : rule__Technology__Group__3__Impl ;
    public final void rule__Technology__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4433:1: ( rule__Technology__Group__3__Impl )
            // InternalCompras.g:4434:2: rule__Technology__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Group__3__Impl();

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
    // $ANTLR end "rule__Technology__Group__3"


    // $ANTLR start "rule__Technology__Group__3__Impl"
    // InternalCompras.g:4440:1: rule__Technology__Group__3__Impl : ( '}' ) ;
    public final void rule__Technology__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4444:1: ( ( '}' ) )
            // InternalCompras.g:4445:1: ( '}' )
            {
            // InternalCompras.g:4445:1: ( '}' )
            // InternalCompras.g:4446:2: '}'
            {
             before(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Technology__Group__3__Impl"


    // $ANTLR start "rule__Technology__Group_1__0"
    // InternalCompras.g:4456:1: rule__Technology__Group_1__0 : rule__Technology__Group_1__0__Impl rule__Technology__Group_1__1 ;
    public final void rule__Technology__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4460:1: ( rule__Technology__Group_1__0__Impl rule__Technology__Group_1__1 )
            // InternalCompras.g:4461:2: rule__Technology__Group_1__0__Impl rule__Technology__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Technology__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_1__1();

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
    // $ANTLR end "rule__Technology__Group_1__0"


    // $ANTLR start "rule__Technology__Group_1__0__Impl"
    // InternalCompras.g:4468:1: rule__Technology__Group_1__0__Impl : ( 'AspNet' ) ;
    public final void rule__Technology__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4472:1: ( ( 'AspNet' ) )
            // InternalCompras.g:4473:1: ( 'AspNet' )
            {
            // InternalCompras.g:4473:1: ( 'AspNet' )
            // InternalCompras.g:4474:2: 'AspNet'
            {
             before(grammarAccess.getTechnologyAccess().getAspNetKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getAspNetKeyword_1_0()); 

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
    // $ANTLR end "rule__Technology__Group_1__0__Impl"


    // $ANTLR start "rule__Technology__Group_1__1"
    // InternalCompras.g:4483:1: rule__Technology__Group_1__1 : rule__Technology__Group_1__1__Impl rule__Technology__Group_1__2 ;
    public final void rule__Technology__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4487:1: ( rule__Technology__Group_1__1__Impl rule__Technology__Group_1__2 )
            // InternalCompras.g:4488:2: rule__Technology__Group_1__1__Impl rule__Technology__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Technology__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_1__2();

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
    // $ANTLR end "rule__Technology__Group_1__1"


    // $ANTLR start "rule__Technology__Group_1__1__Impl"
    // InternalCompras.g:4495:1: rule__Technology__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4499:1: ( ( ':' ) )
            // InternalCompras.g:4500:1: ( ':' )
            {
            // InternalCompras.g:4500:1: ( ':' )
            // InternalCompras.g:4501:2: ':'
            {
             before(grammarAccess.getTechnologyAccess().getColonKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getColonKeyword_1_1()); 

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
    // $ANTLR end "rule__Technology__Group_1__1__Impl"


    // $ANTLR start "rule__Technology__Group_1__2"
    // InternalCompras.g:4510:1: rule__Technology__Group_1__2 : rule__Technology__Group_1__2__Impl rule__Technology__Group_1__3 ;
    public final void rule__Technology__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4514:1: ( rule__Technology__Group_1__2__Impl rule__Technology__Group_1__3 )
            // InternalCompras.g:4515:2: rule__Technology__Group_1__2__Impl rule__Technology__Group_1__3
            {
            pushFollow(FOLLOW_41);
            rule__Technology__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_1__3();

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
    // $ANTLR end "rule__Technology__Group_1__2"


    // $ANTLR start "rule__Technology__Group_1__2__Impl"
    // InternalCompras.g:4522:1: rule__Technology__Group_1__2__Impl : ( '{' ) ;
    public final void rule__Technology__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4526:1: ( ( '{' ) )
            // InternalCompras.g:4527:1: ( '{' )
            {
            // InternalCompras.g:4527:1: ( '{' )
            // InternalCompras.g:4528:2: '{'
            {
             before(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_1_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_1_2()); 

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
    // $ANTLR end "rule__Technology__Group_1__2__Impl"


    // $ANTLR start "rule__Technology__Group_1__3"
    // InternalCompras.g:4537:1: rule__Technology__Group_1__3 : rule__Technology__Group_1__3__Impl rule__Technology__Group_1__4 ;
    public final void rule__Technology__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4541:1: ( rule__Technology__Group_1__3__Impl rule__Technology__Group_1__4 )
            // InternalCompras.g:4542:2: rule__Technology__Group_1__3__Impl rule__Technology__Group_1__4
            {
            pushFollow(FOLLOW_41);
            rule__Technology__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_1__4();

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
    // $ANTLR end "rule__Technology__Group_1__3"


    // $ANTLR start "rule__Technology__Group_1__3__Impl"
    // InternalCompras.g:4549:1: rule__Technology__Group_1__3__Impl : ( ( rule__Technology__ModuleTechAssignment_1_3 )* ) ;
    public final void rule__Technology__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4553:1: ( ( ( rule__Technology__ModuleTechAssignment_1_3 )* ) )
            // InternalCompras.g:4554:1: ( ( rule__Technology__ModuleTechAssignment_1_3 )* )
            {
            // InternalCompras.g:4554:1: ( ( rule__Technology__ModuleTechAssignment_1_3 )* )
            // InternalCompras.g:4555:2: ( rule__Technology__ModuleTechAssignment_1_3 )*
            {
             before(grammarAccess.getTechnologyAccess().getModuleTechAssignment_1_3()); 
            // InternalCompras.g:4556:2: ( rule__Technology__ModuleTechAssignment_1_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCompras.g:4556:3: rule__Technology__ModuleTechAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Technology__ModuleTechAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTechnologyAccess().getModuleTechAssignment_1_3()); 

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
    // $ANTLR end "rule__Technology__Group_1__3__Impl"


    // $ANTLR start "rule__Technology__Group_1__4"
    // InternalCompras.g:4564:1: rule__Technology__Group_1__4 : rule__Technology__Group_1__4__Impl ;
    public final void rule__Technology__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4568:1: ( rule__Technology__Group_1__4__Impl )
            // InternalCompras.g:4569:2: rule__Technology__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Group_1__4__Impl();

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
    // $ANTLR end "rule__Technology__Group_1__4"


    // $ANTLR start "rule__Technology__Group_1__4__Impl"
    // InternalCompras.g:4575:1: rule__Technology__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Technology__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4579:1: ( ( '}' ) )
            // InternalCompras.g:4580:1: ( '}' )
            {
            // InternalCompras.g:4580:1: ( '}' )
            // InternalCompras.g:4581:2: '}'
            {
             before(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_1_4()); 

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
    // $ANTLR end "rule__Technology__Group_1__4__Impl"


    // $ANTLR start "rule__Technology__Group_2__0"
    // InternalCompras.g:4591:1: rule__Technology__Group_2__0 : rule__Technology__Group_2__0__Impl rule__Technology__Group_2__1 ;
    public final void rule__Technology__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4595:1: ( rule__Technology__Group_2__0__Impl rule__Technology__Group_2__1 )
            // InternalCompras.g:4596:2: rule__Technology__Group_2__0__Impl rule__Technology__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Technology__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2__1();

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
    // $ANTLR end "rule__Technology__Group_2__0"


    // $ANTLR start "rule__Technology__Group_2__0__Impl"
    // InternalCompras.g:4603:1: rule__Technology__Group_2__0__Impl : ( 'Database' ) ;
    public final void rule__Technology__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4607:1: ( ( 'Database' ) )
            // InternalCompras.g:4608:1: ( 'Database' )
            {
            // InternalCompras.g:4608:1: ( 'Database' )
            // InternalCompras.g:4609:2: 'Database'
            {
             before(grammarAccess.getTechnologyAccess().getDatabaseKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getDatabaseKeyword_2_0()); 

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
    // $ANTLR end "rule__Technology__Group_2__0__Impl"


    // $ANTLR start "rule__Technology__Group_2__1"
    // InternalCompras.g:4618:1: rule__Technology__Group_2__1 : rule__Technology__Group_2__1__Impl rule__Technology__Group_2__2 ;
    public final void rule__Technology__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4622:1: ( rule__Technology__Group_2__1__Impl rule__Technology__Group_2__2 )
            // InternalCompras.g:4623:2: rule__Technology__Group_2__1__Impl rule__Technology__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__Technology__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2__2();

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
    // $ANTLR end "rule__Technology__Group_2__1"


    // $ANTLR start "rule__Technology__Group_2__1__Impl"
    // InternalCompras.g:4630:1: rule__Technology__Group_2__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4634:1: ( ( ':' ) )
            // InternalCompras.g:4635:1: ( ':' )
            {
            // InternalCompras.g:4635:1: ( ':' )
            // InternalCompras.g:4636:2: ':'
            {
             before(grammarAccess.getTechnologyAccess().getColonKeyword_2_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getColonKeyword_2_1()); 

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
    // $ANTLR end "rule__Technology__Group_2__1__Impl"


    // $ANTLR start "rule__Technology__Group_2__2"
    // InternalCompras.g:4645:1: rule__Technology__Group_2__2 : rule__Technology__Group_2__2__Impl rule__Technology__Group_2__3 ;
    public final void rule__Technology__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4649:1: ( rule__Technology__Group_2__2__Impl rule__Technology__Group_2__3 )
            // InternalCompras.g:4650:2: rule__Technology__Group_2__2__Impl rule__Technology__Group_2__3
            {
            pushFollow(FOLLOW_16);
            rule__Technology__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2__3();

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
    // $ANTLR end "rule__Technology__Group_2__2"


    // $ANTLR start "rule__Technology__Group_2__2__Impl"
    // InternalCompras.g:4657:1: rule__Technology__Group_2__2__Impl : ( '{' ) ;
    public final void rule__Technology__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4661:1: ( ( '{' ) )
            // InternalCompras.g:4662:1: ( '{' )
            {
            // InternalCompras.g:4662:1: ( '{' )
            // InternalCompras.g:4663:2: '{'
            {
             before(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_2_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_2_2()); 

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
    // $ANTLR end "rule__Technology__Group_2__2__Impl"


    // $ANTLR start "rule__Technology__Group_2__3"
    // InternalCompras.g:4672:1: rule__Technology__Group_2__3 : rule__Technology__Group_2__3__Impl rule__Technology__Group_2__4 ;
    public final void rule__Technology__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4676:1: ( rule__Technology__Group_2__3__Impl rule__Technology__Group_2__4 )
            // InternalCompras.g:4677:2: rule__Technology__Group_2__3__Impl rule__Technology__Group_2__4
            {
            pushFollow(FOLLOW_16);
            rule__Technology__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2__4();

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
    // $ANTLR end "rule__Technology__Group_2__3"


    // $ANTLR start "rule__Technology__Group_2__3__Impl"
    // InternalCompras.g:4684:1: rule__Technology__Group_2__3__Impl : ( ( rule__Technology__Group_2_3__0 )? ) ;
    public final void rule__Technology__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4688:1: ( ( ( rule__Technology__Group_2_3__0 )? ) )
            // InternalCompras.g:4689:1: ( ( rule__Technology__Group_2_3__0 )? )
            {
            // InternalCompras.g:4689:1: ( ( rule__Technology__Group_2_3__0 )? )
            // InternalCompras.g:4690:2: ( rule__Technology__Group_2_3__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2_3()); 
            // InternalCompras.g:4691:2: ( rule__Technology__Group_2_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCompras.g:4691:3: rule__Technology__Group_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Technology__Group_2_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTechnologyAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__Technology__Group_2__3__Impl"


    // $ANTLR start "rule__Technology__Group_2__4"
    // InternalCompras.g:4699:1: rule__Technology__Group_2__4 : rule__Technology__Group_2__4__Impl ;
    public final void rule__Technology__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4703:1: ( rule__Technology__Group_2__4__Impl )
            // InternalCompras.g:4704:2: rule__Technology__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Group_2__4__Impl();

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
    // $ANTLR end "rule__Technology__Group_2__4"


    // $ANTLR start "rule__Technology__Group_2__4__Impl"
    // InternalCompras.g:4710:1: rule__Technology__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Technology__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4714:1: ( ( '}' ) )
            // InternalCompras.g:4715:1: ( '}' )
            {
            // InternalCompras.g:4715:1: ( '}' )
            // InternalCompras.g:4716:2: '}'
            {
             before(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_2_4()); 

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
    // $ANTLR end "rule__Technology__Group_2__4__Impl"


    // $ANTLR start "rule__Technology__Group_2_3__0"
    // InternalCompras.g:4726:1: rule__Technology__Group_2_3__0 : rule__Technology__Group_2_3__0__Impl rule__Technology__Group_2_3__1 ;
    public final void rule__Technology__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4730:1: ( rule__Technology__Group_2_3__0__Impl rule__Technology__Group_2_3__1 )
            // InternalCompras.g:4731:2: rule__Technology__Group_2_3__0__Impl rule__Technology__Group_2_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Technology__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_3__1();

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
    // $ANTLR end "rule__Technology__Group_2_3__0"


    // $ANTLR start "rule__Technology__Group_2_3__0__Impl"
    // InternalCompras.g:4738:1: rule__Technology__Group_2_3__0__Impl : ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) ) ;
    public final void rule__Technology__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4742:1: ( ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) ) )
            // InternalCompras.g:4743:1: ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) )
            {
            // InternalCompras.g:4743:1: ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) )
            // InternalCompras.g:4744:2: ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 )
            {
             before(grammarAccess.getTechnologyAccess().getDbConnectorSegmentLayerAssignment_2_3_0()); 
            // InternalCompras.g:4745:2: ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 )
            // InternalCompras.g:4745:3: rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyAccess().getDbConnectorSegmentLayerAssignment_2_3_0()); 

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
    // $ANTLR end "rule__Technology__Group_2_3__0__Impl"


    // $ANTLR start "rule__Technology__Group_2_3__1"
    // InternalCompras.g:4753:1: rule__Technology__Group_2_3__1 : rule__Technology__Group_2_3__1__Impl rule__Technology__Group_2_3__2 ;
    public final void rule__Technology__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4757:1: ( rule__Technology__Group_2_3__1__Impl rule__Technology__Group_2_3__2 )
            // InternalCompras.g:4758:2: rule__Technology__Group_2_3__1__Impl rule__Technology__Group_2_3__2
            {
            pushFollow(FOLLOW_5);
            rule__Technology__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_3__2();

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
    // $ANTLR end "rule__Technology__Group_2_3__1"


    // $ANTLR start "rule__Technology__Group_2_3__1__Impl"
    // InternalCompras.g:4765:1: rule__Technology__Group_2_3__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4769:1: ( ( ':' ) )
            // InternalCompras.g:4770:1: ( ':' )
            {
            // InternalCompras.g:4770:1: ( ':' )
            // InternalCompras.g:4771:2: ':'
            {
             before(grammarAccess.getTechnologyAccess().getColonKeyword_2_3_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getColonKeyword_2_3_1()); 

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
    // $ANTLR end "rule__Technology__Group_2_3__1__Impl"


    // $ANTLR start "rule__Technology__Group_2_3__2"
    // InternalCompras.g:4780:1: rule__Technology__Group_2_3__2 : rule__Technology__Group_2_3__2__Impl rule__Technology__Group_2_3__3 ;
    public final void rule__Technology__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4784:1: ( rule__Technology__Group_2_3__2__Impl rule__Technology__Group_2_3__3 )
            // InternalCompras.g:4785:2: rule__Technology__Group_2_3__2__Impl rule__Technology__Group_2_3__3
            {
            pushFollow(FOLLOW_42);
            rule__Technology__Group_2_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_3__3();

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
    // $ANTLR end "rule__Technology__Group_2_3__2"


    // $ANTLR start "rule__Technology__Group_2_3__2__Impl"
    // InternalCompras.g:4792:1: rule__Technology__Group_2_3__2__Impl : ( '{' ) ;
    public final void rule__Technology__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4796:1: ( ( '{' ) )
            // InternalCompras.g:4797:1: ( '{' )
            {
            // InternalCompras.g:4797:1: ( '{' )
            // InternalCompras.g:4798:2: '{'
            {
             before(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_2_3_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_2_3_2()); 

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
    // $ANTLR end "rule__Technology__Group_2_3__2__Impl"


    // $ANTLR start "rule__Technology__Group_2_3__3"
    // InternalCompras.g:4807:1: rule__Technology__Group_2_3__3 : rule__Technology__Group_2_3__3__Impl rule__Technology__Group_2_3__4 ;
    public final void rule__Technology__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4811:1: ( rule__Technology__Group_2_3__3__Impl rule__Technology__Group_2_3__4 )
            // InternalCompras.g:4812:2: rule__Technology__Group_2_3__3__Impl rule__Technology__Group_2_3__4
            {
            pushFollow(FOLLOW_42);
            rule__Technology__Group_2_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_3__4();

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
    // $ANTLR end "rule__Technology__Group_2_3__3"


    // $ANTLR start "rule__Technology__Group_2_3__3__Impl"
    // InternalCompras.g:4819:1: rule__Technology__Group_2_3__3__Impl : ( ( rule__Technology__Group_2_3_3__0 )? ) ;
    public final void rule__Technology__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4823:1: ( ( ( rule__Technology__Group_2_3_3__0 )? ) )
            // InternalCompras.g:4824:1: ( ( rule__Technology__Group_2_3_3__0 )? )
            {
            // InternalCompras.g:4824:1: ( ( rule__Technology__Group_2_3_3__0 )? )
            // InternalCompras.g:4825:2: ( rule__Technology__Group_2_3_3__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2_3_3()); 
            // InternalCompras.g:4826:2: ( rule__Technology__Group_2_3_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCompras.g:4826:3: rule__Technology__Group_2_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Technology__Group_2_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTechnologyAccess().getGroup_2_3_3()); 

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
    // $ANTLR end "rule__Technology__Group_2_3__3__Impl"


    // $ANTLR start "rule__Technology__Group_2_3__4"
    // InternalCompras.g:4834:1: rule__Technology__Group_2_3__4 : rule__Technology__Group_2_3__4__Impl rule__Technology__Group_2_3__5 ;
    public final void rule__Technology__Group_2_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4838:1: ( rule__Technology__Group_2_3__4__Impl rule__Technology__Group_2_3__5 )
            // InternalCompras.g:4839:2: rule__Technology__Group_2_3__4__Impl rule__Technology__Group_2_3__5
            {
            pushFollow(FOLLOW_42);
            rule__Technology__Group_2_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_3__5();

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
    // $ANTLR end "rule__Technology__Group_2_3__4"


    // $ANTLR start "rule__Technology__Group_2_3__4__Impl"
    // InternalCompras.g:4846:1: rule__Technology__Group_2_3__4__Impl : ( ( rule__Technology__Group_2_3_4__0 )? ) ;
    public final void rule__Technology__Group_2_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4850:1: ( ( ( rule__Technology__Group_2_3_4__0 )? ) )
            // InternalCompras.g:4851:1: ( ( rule__Technology__Group_2_3_4__0 )? )
            {
            // InternalCompras.g:4851:1: ( ( rule__Technology__Group_2_3_4__0 )? )
            // InternalCompras.g:4852:2: ( rule__Technology__Group_2_3_4__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2_3_4()); 
            // InternalCompras.g:4853:2: ( rule__Technology__Group_2_3_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==48) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCompras.g:4853:3: rule__Technology__Group_2_3_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Technology__Group_2_3_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTechnologyAccess().getGroup_2_3_4()); 

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
    // $ANTLR end "rule__Technology__Group_2_3__4__Impl"


    // $ANTLR start "rule__Technology__Group_2_3__5"
    // InternalCompras.g:4861:1: rule__Technology__Group_2_3__5 : rule__Technology__Group_2_3__5__Impl ;
    public final void rule__Technology__Group_2_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4865:1: ( rule__Technology__Group_2_3__5__Impl )
            // InternalCompras.g:4866:2: rule__Technology__Group_2_3__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_3__5__Impl();

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
    // $ANTLR end "rule__Technology__Group_2_3__5"


    // $ANTLR start "rule__Technology__Group_2_3__5__Impl"
    // InternalCompras.g:4872:1: rule__Technology__Group_2_3__5__Impl : ( '}' ) ;
    public final void rule__Technology__Group_2_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4876:1: ( ( '}' ) )
            // InternalCompras.g:4877:1: ( '}' )
            {
            // InternalCompras.g:4877:1: ( '}' )
            // InternalCompras.g:4878:2: '}'
            {
             before(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_2_3_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_2_3_5()); 

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
    // $ANTLR end "rule__Technology__Group_2_3__5__Impl"


    // $ANTLR start "rule__Technology__Group_2_3_3__0"
    // InternalCompras.g:4888:1: rule__Technology__Group_2_3_3__0 : rule__Technology__Group_2_3_3__0__Impl rule__Technology__Group_2_3_3__1 ;
    public final void rule__Technology__Group_2_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4892:1: ( rule__Technology__Group_2_3_3__0__Impl rule__Technology__Group_2_3_3__1 )
            // InternalCompras.g:4893:2: rule__Technology__Group_2_3_3__0__Impl rule__Technology__Group_2_3_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Technology__Group_2_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_3_3__1();

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
    // $ANTLR end "rule__Technology__Group_2_3_3__0"


    // $ANTLR start "rule__Technology__Group_2_3_3__0__Impl"
    // InternalCompras.g:4900:1: rule__Technology__Group_2_3_3__0__Impl : ( 'DatabaseRDBMSType' ) ;
    public final void rule__Technology__Group_2_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4904:1: ( ( 'DatabaseRDBMSType' ) )
            // InternalCompras.g:4905:1: ( 'DatabaseRDBMSType' )
            {
            // InternalCompras.g:4905:1: ( 'DatabaseRDBMSType' )
            // InternalCompras.g:4906:2: 'DatabaseRDBMSType'
            {
             before(grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeKeyword_2_3_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeKeyword_2_3_3_0()); 

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
    // $ANTLR end "rule__Technology__Group_2_3_3__0__Impl"


    // $ANTLR start "rule__Technology__Group_2_3_3__1"
    // InternalCompras.g:4915:1: rule__Technology__Group_2_3_3__1 : rule__Technology__Group_2_3_3__1__Impl rule__Technology__Group_2_3_3__2 ;
    public final void rule__Technology__Group_2_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4919:1: ( rule__Technology__Group_2_3_3__1__Impl rule__Technology__Group_2_3_3__2 )
            // InternalCompras.g:4920:2: rule__Technology__Group_2_3_3__1__Impl rule__Technology__Group_2_3_3__2
            {
            pushFollow(FOLLOW_43);
            rule__Technology__Group_2_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_3_3__2();

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
    // $ANTLR end "rule__Technology__Group_2_3_3__1"


    // $ANTLR start "rule__Technology__Group_2_3_3__1__Impl"
    // InternalCompras.g:4927:1: rule__Technology__Group_2_3_3__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4931:1: ( ( ':' ) )
            // InternalCompras.g:4932:1: ( ':' )
            {
            // InternalCompras.g:4932:1: ( ':' )
            // InternalCompras.g:4933:2: ':'
            {
             before(grammarAccess.getTechnologyAccess().getColonKeyword_2_3_3_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getColonKeyword_2_3_3_1()); 

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
    // $ANTLR end "rule__Technology__Group_2_3_3__1__Impl"


    // $ANTLR start "rule__Technology__Group_2_3_3__2"
    // InternalCompras.g:4942:1: rule__Technology__Group_2_3_3__2 : rule__Technology__Group_2_3_3__2__Impl ;
    public final void rule__Technology__Group_2_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4946:1: ( rule__Technology__Group_2_3_3__2__Impl )
            // InternalCompras.g:4947:2: rule__Technology__Group_2_3_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_3_3__2__Impl();

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
    // $ANTLR end "rule__Technology__Group_2_3_3__2"


    // $ANTLR start "rule__Technology__Group_2_3_3__2__Impl"
    // InternalCompras.g:4953:1: rule__Technology__Group_2_3_3__2__Impl : ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) ) ;
    public final void rule__Technology__Group_2_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4957:1: ( ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) ) )
            // InternalCompras.g:4958:1: ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) )
            {
            // InternalCompras.g:4958:1: ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) )
            // InternalCompras.g:4959:2: ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 )
            {
             before(grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeAssignment_2_3_3_2()); 
            // InternalCompras.g:4960:2: ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 )
            // InternalCompras.g:4960:3: rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeAssignment_2_3_3_2()); 

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
    // $ANTLR end "rule__Technology__Group_2_3_3__2__Impl"


    // $ANTLR start "rule__Technology__Group_2_3_4__0"
    // InternalCompras.g:4969:1: rule__Technology__Group_2_3_4__0 : rule__Technology__Group_2_3_4__0__Impl rule__Technology__Group_2_3_4__1 ;
    public final void rule__Technology__Group_2_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4973:1: ( rule__Technology__Group_2_3_4__0__Impl rule__Technology__Group_2_3_4__1 )
            // InternalCompras.g:4974:2: rule__Technology__Group_2_3_4__0__Impl rule__Technology__Group_2_3_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Technology__Group_2_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_3_4__1();

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
    // $ANTLR end "rule__Technology__Group_2_3_4__0"


    // $ANTLR start "rule__Technology__Group_2_3_4__0__Impl"
    // InternalCompras.g:4981:1: rule__Technology__Group_2_3_4__0__Impl : ( 'ConnectionString' ) ;
    public final void rule__Technology__Group_2_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4985:1: ( ( 'ConnectionString' ) )
            // InternalCompras.g:4986:1: ( 'ConnectionString' )
            {
            // InternalCompras.g:4986:1: ( 'ConnectionString' )
            // InternalCompras.g:4987:2: 'ConnectionString'
            {
             before(grammarAccess.getTechnologyAccess().getConnectionStringKeyword_2_3_4_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getConnectionStringKeyword_2_3_4_0()); 

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
    // $ANTLR end "rule__Technology__Group_2_3_4__0__Impl"


    // $ANTLR start "rule__Technology__Group_2_3_4__1"
    // InternalCompras.g:4996:1: rule__Technology__Group_2_3_4__1 : rule__Technology__Group_2_3_4__1__Impl rule__Technology__Group_2_3_4__2 ;
    public final void rule__Technology__Group_2_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5000:1: ( rule__Technology__Group_2_3_4__1__Impl rule__Technology__Group_2_3_4__2 )
            // InternalCompras.g:5001:2: rule__Technology__Group_2_3_4__1__Impl rule__Technology__Group_2_3_4__2
            {
            pushFollow(FOLLOW_23);
            rule__Technology__Group_2_3_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_3_4__2();

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
    // $ANTLR end "rule__Technology__Group_2_3_4__1"


    // $ANTLR start "rule__Technology__Group_2_3_4__1__Impl"
    // InternalCompras.g:5008:1: rule__Technology__Group_2_3_4__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5012:1: ( ( ':' ) )
            // InternalCompras.g:5013:1: ( ':' )
            {
            // InternalCompras.g:5013:1: ( ':' )
            // InternalCompras.g:5014:2: ':'
            {
             before(grammarAccess.getTechnologyAccess().getColonKeyword_2_3_4_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getColonKeyword_2_3_4_1()); 

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
    // $ANTLR end "rule__Technology__Group_2_3_4__1__Impl"


    // $ANTLR start "rule__Technology__Group_2_3_4__2"
    // InternalCompras.g:5023:1: rule__Technology__Group_2_3_4__2 : rule__Technology__Group_2_3_4__2__Impl ;
    public final void rule__Technology__Group_2_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5027:1: ( rule__Technology__Group_2_3_4__2__Impl )
            // InternalCompras.g:5028:2: rule__Technology__Group_2_3_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_3_4__2__Impl();

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
    // $ANTLR end "rule__Technology__Group_2_3_4__2"


    // $ANTLR start "rule__Technology__Group_2_3_4__2__Impl"
    // InternalCompras.g:5034:1: rule__Technology__Group_2_3_4__2__Impl : ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) ) ;
    public final void rule__Technology__Group_2_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5038:1: ( ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) ) )
            // InternalCompras.g:5039:1: ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) )
            {
            // InternalCompras.g:5039:1: ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) )
            // InternalCompras.g:5040:2: ( rule__Technology__ConnectionStringAssignment_2_3_4_2 )
            {
             before(grammarAccess.getTechnologyAccess().getConnectionStringAssignment_2_3_4_2()); 
            // InternalCompras.g:5041:2: ( rule__Technology__ConnectionStringAssignment_2_3_4_2 )
            // InternalCompras.g:5041:3: rule__Technology__ConnectionStringAssignment_2_3_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Technology__ConnectionStringAssignment_2_3_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyAccess().getConnectionStringAssignment_2_3_4_2()); 

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
    // $ANTLR end "rule__Technology__Group_2_3_4__2__Impl"


    // $ANTLR start "rule__ModuleTech__Group__0"
    // InternalCompras.g:5050:1: rule__ModuleTech__Group__0 : rule__ModuleTech__Group__0__Impl rule__ModuleTech__Group__1 ;
    public final void rule__ModuleTech__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5054:1: ( rule__ModuleTech__Group__0__Impl rule__ModuleTech__Group__1 )
            // InternalCompras.g:5055:2: rule__ModuleTech__Group__0__Impl rule__ModuleTech__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ModuleTech__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__1();

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
    // $ANTLR end "rule__ModuleTech__Group__0"


    // $ANTLR start "rule__ModuleTech__Group__0__Impl"
    // InternalCompras.g:5062:1: rule__ModuleTech__Group__0__Impl : ( 'Module' ) ;
    public final void rule__ModuleTech__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5066:1: ( ( 'Module' ) )
            // InternalCompras.g:5067:1: ( 'Module' )
            {
            // InternalCompras.g:5067:1: ( 'Module' )
            // InternalCompras.g:5068:2: 'Module'
            {
             before(grammarAccess.getModuleTechAccess().getModuleKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getModuleKeyword_0()); 

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
    // $ANTLR end "rule__ModuleTech__Group__0__Impl"


    // $ANTLR start "rule__ModuleTech__Group__1"
    // InternalCompras.g:5077:1: rule__ModuleTech__Group__1 : rule__ModuleTech__Group__1__Impl rule__ModuleTech__Group__2 ;
    public final void rule__ModuleTech__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5081:1: ( rule__ModuleTech__Group__1__Impl rule__ModuleTech__Group__2 )
            // InternalCompras.g:5082:2: rule__ModuleTech__Group__1__Impl rule__ModuleTech__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ModuleTech__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__2();

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
    // $ANTLR end "rule__ModuleTech__Group__1"


    // $ANTLR start "rule__ModuleTech__Group__1__Impl"
    // InternalCompras.g:5089:1: rule__ModuleTech__Group__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5093:1: ( ( ':' ) )
            // InternalCompras.g:5094:1: ( ':' )
            {
            // InternalCompras.g:5094:1: ( ':' )
            // InternalCompras.g:5095:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ModuleTech__Group__1__Impl"


    // $ANTLR start "rule__ModuleTech__Group__2"
    // InternalCompras.g:5104:1: rule__ModuleTech__Group__2 : rule__ModuleTech__Group__2__Impl rule__ModuleTech__Group__3 ;
    public final void rule__ModuleTech__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5108:1: ( rule__ModuleTech__Group__2__Impl rule__ModuleTech__Group__3 )
            // InternalCompras.g:5109:2: rule__ModuleTech__Group__2__Impl rule__ModuleTech__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ModuleTech__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__3();

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
    // $ANTLR end "rule__ModuleTech__Group__2"


    // $ANTLR start "rule__ModuleTech__Group__2__Impl"
    // InternalCompras.g:5116:1: rule__ModuleTech__Group__2__Impl : ( ( rule__ModuleTech__NameAssignment_2 ) ) ;
    public final void rule__ModuleTech__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5120:1: ( ( ( rule__ModuleTech__NameAssignment_2 ) ) )
            // InternalCompras.g:5121:1: ( ( rule__ModuleTech__NameAssignment_2 ) )
            {
            // InternalCompras.g:5121:1: ( ( rule__ModuleTech__NameAssignment_2 ) )
            // InternalCompras.g:5122:2: ( rule__ModuleTech__NameAssignment_2 )
            {
             before(grammarAccess.getModuleTechAccess().getNameAssignment_2()); 
            // InternalCompras.g:5123:2: ( rule__ModuleTech__NameAssignment_2 )
            // InternalCompras.g:5123:3: rule__ModuleTech__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ModuleTech__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleTechAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ModuleTech__Group__2__Impl"


    // $ANTLR start "rule__ModuleTech__Group__3"
    // InternalCompras.g:5131:1: rule__ModuleTech__Group__3 : rule__ModuleTech__Group__3__Impl rule__ModuleTech__Group__4 ;
    public final void rule__ModuleTech__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5135:1: ( rule__ModuleTech__Group__3__Impl rule__ModuleTech__Group__4 )
            // InternalCompras.g:5136:2: rule__ModuleTech__Group__3__Impl rule__ModuleTech__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ModuleTech__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__4();

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
    // $ANTLR end "rule__ModuleTech__Group__3"


    // $ANTLR start "rule__ModuleTech__Group__3__Impl"
    // InternalCompras.g:5143:1: rule__ModuleTech__Group__3__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5147:1: ( ( ':' ) )
            // InternalCompras.g:5148:1: ( ':' )
            {
            // InternalCompras.g:5148:1: ( ':' )
            // InternalCompras.g:5149:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__ModuleTech__Group__3__Impl"


    // $ANTLR start "rule__ModuleTech__Group__4"
    // InternalCompras.g:5158:1: rule__ModuleTech__Group__4 : rule__ModuleTech__Group__4__Impl rule__ModuleTech__Group__5 ;
    public final void rule__ModuleTech__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5162:1: ( rule__ModuleTech__Group__4__Impl rule__ModuleTech__Group__5 )
            // InternalCompras.g:5163:2: rule__ModuleTech__Group__4__Impl rule__ModuleTech__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__ModuleTech__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__5();

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
    // $ANTLR end "rule__ModuleTech__Group__4"


    // $ANTLR start "rule__ModuleTech__Group__4__Impl"
    // InternalCompras.g:5170:1: rule__ModuleTech__Group__4__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5174:1: ( ( '{' ) )
            // InternalCompras.g:5175:1: ( '{' )
            {
            // InternalCompras.g:5175:1: ( '{' )
            // InternalCompras.g:5176:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ModuleTech__Group__4__Impl"


    // $ANTLR start "rule__ModuleTech__Group__5"
    // InternalCompras.g:5185:1: rule__ModuleTech__Group__5 : rule__ModuleTech__Group__5__Impl rule__ModuleTech__Group__6 ;
    public final void rule__ModuleTech__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5189:1: ( rule__ModuleTech__Group__5__Impl rule__ModuleTech__Group__6 )
            // InternalCompras.g:5190:2: rule__ModuleTech__Group__5__Impl rule__ModuleTech__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__ModuleTech__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__6();

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
    // $ANTLR end "rule__ModuleTech__Group__5"


    // $ANTLR start "rule__ModuleTech__Group__5__Impl"
    // InternalCompras.g:5197:1: rule__ModuleTech__Group__5__Impl : ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) ) ;
    public final void rule__ModuleTech__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5201:1: ( ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) ) )
            // InternalCompras.g:5202:1: ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) )
            {
            // InternalCompras.g:5202:1: ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) )
            // InternalCompras.g:5203:2: ( rule__ModuleTech__PresentationLayerAssignment_5 )
            {
             before(grammarAccess.getModuleTechAccess().getPresentationLayerAssignment_5()); 
            // InternalCompras.g:5204:2: ( rule__ModuleTech__PresentationLayerAssignment_5 )
            // InternalCompras.g:5204:3: rule__ModuleTech__PresentationLayerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ModuleTech__PresentationLayerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModuleTechAccess().getPresentationLayerAssignment_5()); 

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
    // $ANTLR end "rule__ModuleTech__Group__5__Impl"


    // $ANTLR start "rule__ModuleTech__Group__6"
    // InternalCompras.g:5212:1: rule__ModuleTech__Group__6 : rule__ModuleTech__Group__6__Impl rule__ModuleTech__Group__7 ;
    public final void rule__ModuleTech__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5216:1: ( rule__ModuleTech__Group__6__Impl rule__ModuleTech__Group__7 )
            // InternalCompras.g:5217:2: rule__ModuleTech__Group__6__Impl rule__ModuleTech__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__ModuleTech__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__7();

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
    // $ANTLR end "rule__ModuleTech__Group__6"


    // $ANTLR start "rule__ModuleTech__Group__6__Impl"
    // InternalCompras.g:5224:1: rule__ModuleTech__Group__6__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5228:1: ( ( ':' ) )
            // InternalCompras.g:5229:1: ( ':' )
            {
            // InternalCompras.g:5229:1: ( ':' )
            // InternalCompras.g:5230:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__ModuleTech__Group__6__Impl"


    // $ANTLR start "rule__ModuleTech__Group__7"
    // InternalCompras.g:5239:1: rule__ModuleTech__Group__7 : rule__ModuleTech__Group__7__Impl rule__ModuleTech__Group__8 ;
    public final void rule__ModuleTech__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5243:1: ( rule__ModuleTech__Group__7__Impl rule__ModuleTech__Group__8 )
            // InternalCompras.g:5244:2: rule__ModuleTech__Group__7__Impl rule__ModuleTech__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__ModuleTech__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__8();

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
    // $ANTLR end "rule__ModuleTech__Group__7"


    // $ANTLR start "rule__ModuleTech__Group__7__Impl"
    // InternalCompras.g:5251:1: rule__ModuleTech__Group__7__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5255:1: ( ( '{' ) )
            // InternalCompras.g:5256:1: ( '{' )
            {
            // InternalCompras.g:5256:1: ( '{' )
            // InternalCompras.g:5257:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__ModuleTech__Group__7__Impl"


    // $ANTLR start "rule__ModuleTech__Group__8"
    // InternalCompras.g:5266:1: rule__ModuleTech__Group__8 : rule__ModuleTech__Group__8__Impl rule__ModuleTech__Group__9 ;
    public final void rule__ModuleTech__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5270:1: ( rule__ModuleTech__Group__8__Impl rule__ModuleTech__Group__9 )
            // InternalCompras.g:5271:2: rule__ModuleTech__Group__8__Impl rule__ModuleTech__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__ModuleTech__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__9();

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
    // $ANTLR end "rule__ModuleTech__Group__8"


    // $ANTLR start "rule__ModuleTech__Group__8__Impl"
    // InternalCompras.g:5278:1: rule__ModuleTech__Group__8__Impl : ( ( rule__ModuleTech__Group_8__0 )? ) ;
    public final void rule__ModuleTech__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5282:1: ( ( ( rule__ModuleTech__Group_8__0 )? ) )
            // InternalCompras.g:5283:1: ( ( rule__ModuleTech__Group_8__0 )? )
            {
            // InternalCompras.g:5283:1: ( ( rule__ModuleTech__Group_8__0 )? )
            // InternalCompras.g:5284:2: ( rule__ModuleTech__Group_8__0 )?
            {
             before(grammarAccess.getModuleTechAccess().getGroup_8()); 
            // InternalCompras.g:5285:2: ( rule__ModuleTech__Group_8__0 )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalCompras.g:5285:3: rule__ModuleTech__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModuleTech__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleTechAccess().getGroup_8()); 

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
    // $ANTLR end "rule__ModuleTech__Group__8__Impl"


    // $ANTLR start "rule__ModuleTech__Group__9"
    // InternalCompras.g:5293:1: rule__ModuleTech__Group__9 : rule__ModuleTech__Group__9__Impl rule__ModuleTech__Group__10 ;
    public final void rule__ModuleTech__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5297:1: ( rule__ModuleTech__Group__9__Impl rule__ModuleTech__Group__10 )
            // InternalCompras.g:5298:2: rule__ModuleTech__Group__9__Impl rule__ModuleTech__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__ModuleTech__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__10();

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
    // $ANTLR end "rule__ModuleTech__Group__9"


    // $ANTLR start "rule__ModuleTech__Group__9__Impl"
    // InternalCompras.g:5305:1: rule__ModuleTech__Group__9__Impl : ( ( rule__ModuleTech__Group_9__0 )? ) ;
    public final void rule__ModuleTech__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5309:1: ( ( ( rule__ModuleTech__Group_9__0 )? ) )
            // InternalCompras.g:5310:1: ( ( rule__ModuleTech__Group_9__0 )? )
            {
            // InternalCompras.g:5310:1: ( ( rule__ModuleTech__Group_9__0 )? )
            // InternalCompras.g:5311:2: ( rule__ModuleTech__Group_9__0 )?
            {
             before(grammarAccess.getModuleTechAccess().getGroup_9()); 
            // InternalCompras.g:5312:2: ( rule__ModuleTech__Group_9__0 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalCompras.g:5312:3: rule__ModuleTech__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModuleTech__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleTechAccess().getGroup_9()); 

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
    // $ANTLR end "rule__ModuleTech__Group__9__Impl"


    // $ANTLR start "rule__ModuleTech__Group__10"
    // InternalCompras.g:5320:1: rule__ModuleTech__Group__10 : rule__ModuleTech__Group__10__Impl rule__ModuleTech__Group__11 ;
    public final void rule__ModuleTech__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5324:1: ( rule__ModuleTech__Group__10__Impl rule__ModuleTech__Group__11 )
            // InternalCompras.g:5325:2: rule__ModuleTech__Group__10__Impl rule__ModuleTech__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__ModuleTech__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__11();

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
    // $ANTLR end "rule__ModuleTech__Group__10"


    // $ANTLR start "rule__ModuleTech__Group__10__Impl"
    // InternalCompras.g:5332:1: rule__ModuleTech__Group__10__Impl : ( ( rule__ModuleTech__Group_10__0 )? ) ;
    public final void rule__ModuleTech__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5336:1: ( ( ( rule__ModuleTech__Group_10__0 )? ) )
            // InternalCompras.g:5337:1: ( ( rule__ModuleTech__Group_10__0 )? )
            {
            // InternalCompras.g:5337:1: ( ( rule__ModuleTech__Group_10__0 )? )
            // InternalCompras.g:5338:2: ( rule__ModuleTech__Group_10__0 )?
            {
             before(grammarAccess.getModuleTechAccess().getGroup_10()); 
            // InternalCompras.g:5339:2: ( rule__ModuleTech__Group_10__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCompras.g:5339:3: rule__ModuleTech__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModuleTech__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleTechAccess().getGroup_10()); 

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
    // $ANTLR end "rule__ModuleTech__Group__10__Impl"


    // $ANTLR start "rule__ModuleTech__Group__11"
    // InternalCompras.g:5347:1: rule__ModuleTech__Group__11 : rule__ModuleTech__Group__11__Impl rule__ModuleTech__Group__12 ;
    public final void rule__ModuleTech__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5351:1: ( rule__ModuleTech__Group__11__Impl rule__ModuleTech__Group__12 )
            // InternalCompras.g:5352:2: rule__ModuleTech__Group__11__Impl rule__ModuleTech__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__ModuleTech__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__12();

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
    // $ANTLR end "rule__ModuleTech__Group__11"


    // $ANTLR start "rule__ModuleTech__Group__11__Impl"
    // InternalCompras.g:5359:1: rule__ModuleTech__Group__11__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5363:1: ( ( '}' ) )
            // InternalCompras.g:5364:1: ( '}' )
            {
            // InternalCompras.g:5364:1: ( '}' )
            // InternalCompras.g:5365:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__ModuleTech__Group__11__Impl"


    // $ANTLR start "rule__ModuleTech__Group__12"
    // InternalCompras.g:5374:1: rule__ModuleTech__Group__12 : rule__ModuleTech__Group__12__Impl rule__ModuleTech__Group__13 ;
    public final void rule__ModuleTech__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5378:1: ( rule__ModuleTech__Group__12__Impl rule__ModuleTech__Group__13 )
            // InternalCompras.g:5379:2: rule__ModuleTech__Group__12__Impl rule__ModuleTech__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__ModuleTech__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__13();

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
    // $ANTLR end "rule__ModuleTech__Group__12"


    // $ANTLR start "rule__ModuleTech__Group__12__Impl"
    // InternalCompras.g:5386:1: rule__ModuleTech__Group__12__Impl : ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) ) ;
    public final void rule__ModuleTech__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5390:1: ( ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) ) )
            // InternalCompras.g:5391:1: ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) )
            {
            // InternalCompras.g:5391:1: ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) )
            // InternalCompras.g:5392:2: ( rule__ModuleTech__BusinessLayerAssignment_12 )
            {
             before(grammarAccess.getModuleTechAccess().getBusinessLayerAssignment_12()); 
            // InternalCompras.g:5393:2: ( rule__ModuleTech__BusinessLayerAssignment_12 )
            // InternalCompras.g:5393:3: rule__ModuleTech__BusinessLayerAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__ModuleTech__BusinessLayerAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getModuleTechAccess().getBusinessLayerAssignment_12()); 

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
    // $ANTLR end "rule__ModuleTech__Group__12__Impl"


    // $ANTLR start "rule__ModuleTech__Group__13"
    // InternalCompras.g:5401:1: rule__ModuleTech__Group__13 : rule__ModuleTech__Group__13__Impl rule__ModuleTech__Group__14 ;
    public final void rule__ModuleTech__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5405:1: ( rule__ModuleTech__Group__13__Impl rule__ModuleTech__Group__14 )
            // InternalCompras.g:5406:2: rule__ModuleTech__Group__13__Impl rule__ModuleTech__Group__14
            {
            pushFollow(FOLLOW_5);
            rule__ModuleTech__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__14();

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
    // $ANTLR end "rule__ModuleTech__Group__13"


    // $ANTLR start "rule__ModuleTech__Group__13__Impl"
    // InternalCompras.g:5413:1: rule__ModuleTech__Group__13__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5417:1: ( ( ':' ) )
            // InternalCompras.g:5418:1: ( ':' )
            {
            // InternalCompras.g:5418:1: ( ':' )
            // InternalCompras.g:5419:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_13()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getColonKeyword_13()); 

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
    // $ANTLR end "rule__ModuleTech__Group__13__Impl"


    // $ANTLR start "rule__ModuleTech__Group__14"
    // InternalCompras.g:5428:1: rule__ModuleTech__Group__14 : rule__ModuleTech__Group__14__Impl rule__ModuleTech__Group__15 ;
    public final void rule__ModuleTech__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5432:1: ( rule__ModuleTech__Group__14__Impl rule__ModuleTech__Group__15 )
            // InternalCompras.g:5433:2: rule__ModuleTech__Group__14__Impl rule__ModuleTech__Group__15
            {
            pushFollow(FOLLOW_44);
            rule__ModuleTech__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__15();

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
    // $ANTLR end "rule__ModuleTech__Group__14"


    // $ANTLR start "rule__ModuleTech__Group__14__Impl"
    // InternalCompras.g:5440:1: rule__ModuleTech__Group__14__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5444:1: ( ( '{' ) )
            // InternalCompras.g:5445:1: ( '{' )
            {
            // InternalCompras.g:5445:1: ( '{' )
            // InternalCompras.g:5446:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_14()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__ModuleTech__Group__14__Impl"


    // $ANTLR start "rule__ModuleTech__Group__15"
    // InternalCompras.g:5455:1: rule__ModuleTech__Group__15 : rule__ModuleTech__Group__15__Impl rule__ModuleTech__Group__16 ;
    public final void rule__ModuleTech__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5459:1: ( rule__ModuleTech__Group__15__Impl rule__ModuleTech__Group__16 )
            // InternalCompras.g:5460:2: rule__ModuleTech__Group__15__Impl rule__ModuleTech__Group__16
            {
            pushFollow(FOLLOW_44);
            rule__ModuleTech__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__16();

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
    // $ANTLR end "rule__ModuleTech__Group__15"


    // $ANTLR start "rule__ModuleTech__Group__15__Impl"
    // InternalCompras.g:5467:1: rule__ModuleTech__Group__15__Impl : ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* ) ;
    public final void rule__ModuleTech__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5471:1: ( ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* ) )
            // InternalCompras.g:5472:1: ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* )
            {
            // InternalCompras.g:5472:1: ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* )
            // InternalCompras.g:5473:2: ( rule__ModuleTech__BusinessLayerRefAssignment_15 )*
            {
             before(grammarAccess.getModuleTechAccess().getBusinessLayerRefAssignment_15()); 
            // InternalCompras.g:5474:2: ( rule__ModuleTech__BusinessLayerRefAssignment_15 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==52) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCompras.g:5474:3: rule__ModuleTech__BusinessLayerRefAssignment_15
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__ModuleTech__BusinessLayerRefAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getModuleTechAccess().getBusinessLayerRefAssignment_15()); 

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
    // $ANTLR end "rule__ModuleTech__Group__15__Impl"


    // $ANTLR start "rule__ModuleTech__Group__16"
    // InternalCompras.g:5482:1: rule__ModuleTech__Group__16 : rule__ModuleTech__Group__16__Impl rule__ModuleTech__Group__17 ;
    public final void rule__ModuleTech__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5486:1: ( rule__ModuleTech__Group__16__Impl rule__ModuleTech__Group__17 )
            // InternalCompras.g:5487:2: rule__ModuleTech__Group__16__Impl rule__ModuleTech__Group__17
            {
            pushFollow(FOLLOW_4);
            rule__ModuleTech__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__17();

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
    // $ANTLR end "rule__ModuleTech__Group__16"


    // $ANTLR start "rule__ModuleTech__Group__16__Impl"
    // InternalCompras.g:5494:1: rule__ModuleTech__Group__16__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5498:1: ( ( '}' ) )
            // InternalCompras.g:5499:1: ( '}' )
            {
            // InternalCompras.g:5499:1: ( '}' )
            // InternalCompras.g:5500:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_16()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_16()); 

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
    // $ANTLR end "rule__ModuleTech__Group__16__Impl"


    // $ANTLR start "rule__ModuleTech__Group__17"
    // InternalCompras.g:5509:1: rule__ModuleTech__Group__17 : rule__ModuleTech__Group__17__Impl rule__ModuleTech__Group__18 ;
    public final void rule__ModuleTech__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5513:1: ( rule__ModuleTech__Group__17__Impl rule__ModuleTech__Group__18 )
            // InternalCompras.g:5514:2: rule__ModuleTech__Group__17__Impl rule__ModuleTech__Group__18
            {
            pushFollow(FOLLOW_3);
            rule__ModuleTech__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__18();

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
    // $ANTLR end "rule__ModuleTech__Group__17"


    // $ANTLR start "rule__ModuleTech__Group__17__Impl"
    // InternalCompras.g:5521:1: rule__ModuleTech__Group__17__Impl : ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) ) ;
    public final void rule__ModuleTech__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5525:1: ( ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) ) )
            // InternalCompras.g:5526:1: ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) )
            {
            // InternalCompras.g:5526:1: ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) )
            // InternalCompras.g:5527:2: ( rule__ModuleTech__DataAccessLayerAssignment_17 )
            {
             before(grammarAccess.getModuleTechAccess().getDataAccessLayerAssignment_17()); 
            // InternalCompras.g:5528:2: ( rule__ModuleTech__DataAccessLayerAssignment_17 )
            // InternalCompras.g:5528:3: rule__ModuleTech__DataAccessLayerAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__ModuleTech__DataAccessLayerAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getModuleTechAccess().getDataAccessLayerAssignment_17()); 

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
    // $ANTLR end "rule__ModuleTech__Group__17__Impl"


    // $ANTLR start "rule__ModuleTech__Group__18"
    // InternalCompras.g:5536:1: rule__ModuleTech__Group__18 : rule__ModuleTech__Group__18__Impl rule__ModuleTech__Group__19 ;
    public final void rule__ModuleTech__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5540:1: ( rule__ModuleTech__Group__18__Impl rule__ModuleTech__Group__19 )
            // InternalCompras.g:5541:2: rule__ModuleTech__Group__18__Impl rule__ModuleTech__Group__19
            {
            pushFollow(FOLLOW_5);
            rule__ModuleTech__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__19();

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
    // $ANTLR end "rule__ModuleTech__Group__18"


    // $ANTLR start "rule__ModuleTech__Group__18__Impl"
    // InternalCompras.g:5548:1: rule__ModuleTech__Group__18__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5552:1: ( ( ':' ) )
            // InternalCompras.g:5553:1: ( ':' )
            {
            // InternalCompras.g:5553:1: ( ':' )
            // InternalCompras.g:5554:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_18()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getColonKeyword_18()); 

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
    // $ANTLR end "rule__ModuleTech__Group__18__Impl"


    // $ANTLR start "rule__ModuleTech__Group__19"
    // InternalCompras.g:5563:1: rule__ModuleTech__Group__19 : rule__ModuleTech__Group__19__Impl rule__ModuleTech__Group__20 ;
    public final void rule__ModuleTech__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5567:1: ( rule__ModuleTech__Group__19__Impl rule__ModuleTech__Group__20 )
            // InternalCompras.g:5568:2: rule__ModuleTech__Group__19__Impl rule__ModuleTech__Group__20
            {
            pushFollow(FOLLOW_46);
            rule__ModuleTech__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__20();

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
    // $ANTLR end "rule__ModuleTech__Group__19"


    // $ANTLR start "rule__ModuleTech__Group__19__Impl"
    // InternalCompras.g:5575:1: rule__ModuleTech__Group__19__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5579:1: ( ( '{' ) )
            // InternalCompras.g:5580:1: ( '{' )
            {
            // InternalCompras.g:5580:1: ( '{' )
            // InternalCompras.g:5581:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_19()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_19()); 

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
    // $ANTLR end "rule__ModuleTech__Group__19__Impl"


    // $ANTLR start "rule__ModuleTech__Group__20"
    // InternalCompras.g:5590:1: rule__ModuleTech__Group__20 : rule__ModuleTech__Group__20__Impl rule__ModuleTech__Group__21 ;
    public final void rule__ModuleTech__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5594:1: ( rule__ModuleTech__Group__20__Impl rule__ModuleTech__Group__21 )
            // InternalCompras.g:5595:2: rule__ModuleTech__Group__20__Impl rule__ModuleTech__Group__21
            {
            pushFollow(FOLLOW_46);
            rule__ModuleTech__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__21();

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
    // $ANTLR end "rule__ModuleTech__Group__20"


    // $ANTLR start "rule__ModuleTech__Group__20__Impl"
    // InternalCompras.g:5602:1: rule__ModuleTech__Group__20__Impl : ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* ) ;
    public final void rule__ModuleTech__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5606:1: ( ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* ) )
            // InternalCompras.g:5607:1: ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* )
            {
            // InternalCompras.g:5607:1: ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* )
            // InternalCompras.g:5608:2: ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )*
            {
             before(grammarAccess.getModuleTechAccess().getDataAccessLayerRefAssignment_20()); 
            // InternalCompras.g:5609:2: ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==53) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCompras.g:5609:3: rule__ModuleTech__DataAccessLayerRefAssignment_20
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__ModuleTech__DataAccessLayerRefAssignment_20();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getModuleTechAccess().getDataAccessLayerRefAssignment_20()); 

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
    // $ANTLR end "rule__ModuleTech__Group__20__Impl"


    // $ANTLR start "rule__ModuleTech__Group__21"
    // InternalCompras.g:5617:1: rule__ModuleTech__Group__21 : rule__ModuleTech__Group__21__Impl rule__ModuleTech__Group__22 ;
    public final void rule__ModuleTech__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5621:1: ( rule__ModuleTech__Group__21__Impl rule__ModuleTech__Group__22 )
            // InternalCompras.g:5622:2: rule__ModuleTech__Group__21__Impl rule__ModuleTech__Group__22
            {
            pushFollow(FOLLOW_4);
            rule__ModuleTech__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__22();

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
    // $ANTLR end "rule__ModuleTech__Group__21"


    // $ANTLR start "rule__ModuleTech__Group__21__Impl"
    // InternalCompras.g:5629:1: rule__ModuleTech__Group__21__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5633:1: ( ( '}' ) )
            // InternalCompras.g:5634:1: ( '}' )
            {
            // InternalCompras.g:5634:1: ( '}' )
            // InternalCompras.g:5635:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_21()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_21()); 

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
    // $ANTLR end "rule__ModuleTech__Group__21__Impl"


    // $ANTLR start "rule__ModuleTech__Group__22"
    // InternalCompras.g:5644:1: rule__ModuleTech__Group__22 : rule__ModuleTech__Group__22__Impl rule__ModuleTech__Group__23 ;
    public final void rule__ModuleTech__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5648:1: ( rule__ModuleTech__Group__22__Impl rule__ModuleTech__Group__23 )
            // InternalCompras.g:5649:2: rule__ModuleTech__Group__22__Impl rule__ModuleTech__Group__23
            {
            pushFollow(FOLLOW_3);
            rule__ModuleTech__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__23();

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
    // $ANTLR end "rule__ModuleTech__Group__22"


    // $ANTLR start "rule__ModuleTech__Group__22__Impl"
    // InternalCompras.g:5656:1: rule__ModuleTech__Group__22__Impl : ( ( rule__ModuleTech__CommonLayerAssignment_22 ) ) ;
    public final void rule__ModuleTech__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5660:1: ( ( ( rule__ModuleTech__CommonLayerAssignment_22 ) ) )
            // InternalCompras.g:5661:1: ( ( rule__ModuleTech__CommonLayerAssignment_22 ) )
            {
            // InternalCompras.g:5661:1: ( ( rule__ModuleTech__CommonLayerAssignment_22 ) )
            // InternalCompras.g:5662:2: ( rule__ModuleTech__CommonLayerAssignment_22 )
            {
             before(grammarAccess.getModuleTechAccess().getCommonLayerAssignment_22()); 
            // InternalCompras.g:5663:2: ( rule__ModuleTech__CommonLayerAssignment_22 )
            // InternalCompras.g:5663:3: rule__ModuleTech__CommonLayerAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__ModuleTech__CommonLayerAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getModuleTechAccess().getCommonLayerAssignment_22()); 

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
    // $ANTLR end "rule__ModuleTech__Group__22__Impl"


    // $ANTLR start "rule__ModuleTech__Group__23"
    // InternalCompras.g:5671:1: rule__ModuleTech__Group__23 : rule__ModuleTech__Group__23__Impl rule__ModuleTech__Group__24 ;
    public final void rule__ModuleTech__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5675:1: ( rule__ModuleTech__Group__23__Impl rule__ModuleTech__Group__24 )
            // InternalCompras.g:5676:2: rule__ModuleTech__Group__23__Impl rule__ModuleTech__Group__24
            {
            pushFollow(FOLLOW_5);
            rule__ModuleTech__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__24();

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
    // $ANTLR end "rule__ModuleTech__Group__23"


    // $ANTLR start "rule__ModuleTech__Group__23__Impl"
    // InternalCompras.g:5683:1: rule__ModuleTech__Group__23__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5687:1: ( ( ':' ) )
            // InternalCompras.g:5688:1: ( ':' )
            {
            // InternalCompras.g:5688:1: ( ':' )
            // InternalCompras.g:5689:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_23()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getColonKeyword_23()); 

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
    // $ANTLR end "rule__ModuleTech__Group__23__Impl"


    // $ANTLR start "rule__ModuleTech__Group__24"
    // InternalCompras.g:5698:1: rule__ModuleTech__Group__24 : rule__ModuleTech__Group__24__Impl rule__ModuleTech__Group__25 ;
    public final void rule__ModuleTech__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5702:1: ( rule__ModuleTech__Group__24__Impl rule__ModuleTech__Group__25 )
            // InternalCompras.g:5703:2: rule__ModuleTech__Group__24__Impl rule__ModuleTech__Group__25
            {
            pushFollow(FOLLOW_48);
            rule__ModuleTech__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__25();

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
    // $ANTLR end "rule__ModuleTech__Group__24"


    // $ANTLR start "rule__ModuleTech__Group__24__Impl"
    // InternalCompras.g:5710:1: rule__ModuleTech__Group__24__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5714:1: ( ( '{' ) )
            // InternalCompras.g:5715:1: ( '{' )
            {
            // InternalCompras.g:5715:1: ( '{' )
            // InternalCompras.g:5716:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_24()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_24()); 

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
    // $ANTLR end "rule__ModuleTech__Group__24__Impl"


    // $ANTLR start "rule__ModuleTech__Group__25"
    // InternalCompras.g:5725:1: rule__ModuleTech__Group__25 : rule__ModuleTech__Group__25__Impl rule__ModuleTech__Group__26 ;
    public final void rule__ModuleTech__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5729:1: ( rule__ModuleTech__Group__25__Impl rule__ModuleTech__Group__26 )
            // InternalCompras.g:5730:2: rule__ModuleTech__Group__25__Impl rule__ModuleTech__Group__26
            {
            pushFollow(FOLLOW_48);
            rule__ModuleTech__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__26();

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
    // $ANTLR end "rule__ModuleTech__Group__25"


    // $ANTLR start "rule__ModuleTech__Group__25__Impl"
    // InternalCompras.g:5737:1: rule__ModuleTech__Group__25__Impl : ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* ) ;
    public final void rule__ModuleTech__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5741:1: ( ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* ) )
            // InternalCompras.g:5742:1: ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* )
            {
            // InternalCompras.g:5742:1: ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* )
            // InternalCompras.g:5743:2: ( rule__ModuleTech__CommonLayerRefAssignment_25 )*
            {
             before(grammarAccess.getModuleTechAccess().getCommonLayerRefAssignment_25()); 
            // InternalCompras.g:5744:2: ( rule__ModuleTech__CommonLayerRefAssignment_25 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==54) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCompras.g:5744:3: rule__ModuleTech__CommonLayerRefAssignment_25
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__ModuleTech__CommonLayerRefAssignment_25();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getModuleTechAccess().getCommonLayerRefAssignment_25()); 

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
    // $ANTLR end "rule__ModuleTech__Group__25__Impl"


    // $ANTLR start "rule__ModuleTech__Group__26"
    // InternalCompras.g:5752:1: rule__ModuleTech__Group__26 : rule__ModuleTech__Group__26__Impl rule__ModuleTech__Group__27 ;
    public final void rule__ModuleTech__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5756:1: ( rule__ModuleTech__Group__26__Impl rule__ModuleTech__Group__27 )
            // InternalCompras.g:5757:2: rule__ModuleTech__Group__26__Impl rule__ModuleTech__Group__27
            {
            pushFollow(FOLLOW_13);
            rule__ModuleTech__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__27();

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
    // $ANTLR end "rule__ModuleTech__Group__26"


    // $ANTLR start "rule__ModuleTech__Group__26__Impl"
    // InternalCompras.g:5764:1: rule__ModuleTech__Group__26__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5768:1: ( ( '}' ) )
            // InternalCompras.g:5769:1: ( '}' )
            {
            // InternalCompras.g:5769:1: ( '}' )
            // InternalCompras.g:5770:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_26()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_26()); 

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
    // $ANTLR end "rule__ModuleTech__Group__26__Impl"


    // $ANTLR start "rule__ModuleTech__Group__27"
    // InternalCompras.g:5779:1: rule__ModuleTech__Group__27 : rule__ModuleTech__Group__27__Impl ;
    public final void rule__ModuleTech__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5783:1: ( rule__ModuleTech__Group__27__Impl )
            // InternalCompras.g:5784:2: rule__ModuleTech__Group__27__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group__27__Impl();

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
    // $ANTLR end "rule__ModuleTech__Group__27"


    // $ANTLR start "rule__ModuleTech__Group__27__Impl"
    // InternalCompras.g:5790:1: rule__ModuleTech__Group__27__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5794:1: ( ( '}' ) )
            // InternalCompras.g:5795:1: ( '}' )
            {
            // InternalCompras.g:5795:1: ( '}' )
            // InternalCompras.g:5796:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_27()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_27()); 

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
    // $ANTLR end "rule__ModuleTech__Group__27__Impl"


    // $ANTLR start "rule__ModuleTech__Group_8__0"
    // InternalCompras.g:5806:1: rule__ModuleTech__Group_8__0 : rule__ModuleTech__Group_8__0__Impl rule__ModuleTech__Group_8__1 ;
    public final void rule__ModuleTech__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5810:1: ( rule__ModuleTech__Group_8__0__Impl rule__ModuleTech__Group_8__1 )
            // InternalCompras.g:5811:2: rule__ModuleTech__Group_8__0__Impl rule__ModuleTech__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__ModuleTech__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_8__1();

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
    // $ANTLR end "rule__ModuleTech__Group_8__0"


    // $ANTLR start "rule__ModuleTech__Group_8__0__Impl"
    // InternalCompras.g:5818:1: rule__ModuleTech__Group_8__0__Impl : ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) ) ;
    public final void rule__ModuleTech__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5822:1: ( ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) ) )
            // InternalCompras.g:5823:1: ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) )
            {
            // InternalCompras.g:5823:1: ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) )
            // InternalCompras.g:5824:2: ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 )
            {
             before(grammarAccess.getModuleTechAccess().getControllerSegmentLayerAssignment_8_0()); 
            // InternalCompras.g:5825:2: ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 )
            // InternalCompras.g:5825:3: rule__ModuleTech__ControllerSegmentLayerAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__ModuleTech__ControllerSegmentLayerAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleTechAccess().getControllerSegmentLayerAssignment_8_0()); 

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
    // $ANTLR end "rule__ModuleTech__Group_8__0__Impl"


    // $ANTLR start "rule__ModuleTech__Group_8__1"
    // InternalCompras.g:5833:1: rule__ModuleTech__Group_8__1 : rule__ModuleTech__Group_8__1__Impl rule__ModuleTech__Group_8__2 ;
    public final void rule__ModuleTech__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5837:1: ( rule__ModuleTech__Group_8__1__Impl rule__ModuleTech__Group_8__2 )
            // InternalCompras.g:5838:2: rule__ModuleTech__Group_8__1__Impl rule__ModuleTech__Group_8__2
            {
            pushFollow(FOLLOW_5);
            rule__ModuleTech__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_8__2();

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
    // $ANTLR end "rule__ModuleTech__Group_8__1"


    // $ANTLR start "rule__ModuleTech__Group_8__1__Impl"
    // InternalCompras.g:5845:1: rule__ModuleTech__Group_8__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5849:1: ( ( ':' ) )
            // InternalCompras.g:5850:1: ( ':' )
            {
            // InternalCompras.g:5850:1: ( ':' )
            // InternalCompras.g:5851:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_8_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getColonKeyword_8_1()); 

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
    // $ANTLR end "rule__ModuleTech__Group_8__1__Impl"


    // $ANTLR start "rule__ModuleTech__Group_8__2"
    // InternalCompras.g:5860:1: rule__ModuleTech__Group_8__2 : rule__ModuleTech__Group_8__2__Impl rule__ModuleTech__Group_8__3 ;
    public final void rule__ModuleTech__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5864:1: ( rule__ModuleTech__Group_8__2__Impl rule__ModuleTech__Group_8__3 )
            // InternalCompras.g:5865:2: rule__ModuleTech__Group_8__2__Impl rule__ModuleTech__Group_8__3
            {
            pushFollow(FOLLOW_50);
            rule__ModuleTech__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_8__3();

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
    // $ANTLR end "rule__ModuleTech__Group_8__2"


    // $ANTLR start "rule__ModuleTech__Group_8__2__Impl"
    // InternalCompras.g:5872:1: rule__ModuleTech__Group_8__2__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5876:1: ( ( '{' ) )
            // InternalCompras.g:5877:1: ( '{' )
            {
            // InternalCompras.g:5877:1: ( '{' )
            // InternalCompras.g:5878:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_8_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_8_2()); 

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
    // $ANTLR end "rule__ModuleTech__Group_8__2__Impl"


    // $ANTLR start "rule__ModuleTech__Group_8__3"
    // InternalCompras.g:5887:1: rule__ModuleTech__Group_8__3 : rule__ModuleTech__Group_8__3__Impl rule__ModuleTech__Group_8__4 ;
    public final void rule__ModuleTech__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5891:1: ( rule__ModuleTech__Group_8__3__Impl rule__ModuleTech__Group_8__4 )
            // InternalCompras.g:5892:2: rule__ModuleTech__Group_8__3__Impl rule__ModuleTech__Group_8__4
            {
            pushFollow(FOLLOW_50);
            rule__ModuleTech__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_8__4();

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
    // $ANTLR end "rule__ModuleTech__Group_8__3"


    // $ANTLR start "rule__ModuleTech__Group_8__3__Impl"
    // InternalCompras.g:5899:1: rule__ModuleTech__Group_8__3__Impl : ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* ) ;
    public final void rule__ModuleTech__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5903:1: ( ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* ) )
            // InternalCompras.g:5904:1: ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* )
            {
            // InternalCompras.g:5904:1: ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* )
            // InternalCompras.g:5905:2: ( rule__ModuleTech__ControllersRefAssignment_8_3 )*
            {
             before(grammarAccess.getModuleTechAccess().getControllersRefAssignment_8_3()); 
            // InternalCompras.g:5906:2: ( rule__ModuleTech__ControllersRefAssignment_8_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==49) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCompras.g:5906:3: rule__ModuleTech__ControllersRefAssignment_8_3
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__ModuleTech__ControllersRefAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getModuleTechAccess().getControllersRefAssignment_8_3()); 

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
    // $ANTLR end "rule__ModuleTech__Group_8__3__Impl"


    // $ANTLR start "rule__ModuleTech__Group_8__4"
    // InternalCompras.g:5914:1: rule__ModuleTech__Group_8__4 : rule__ModuleTech__Group_8__4__Impl ;
    public final void rule__ModuleTech__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5918:1: ( rule__ModuleTech__Group_8__4__Impl )
            // InternalCompras.g:5919:2: rule__ModuleTech__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_8__4__Impl();

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
    // $ANTLR end "rule__ModuleTech__Group_8__4"


    // $ANTLR start "rule__ModuleTech__Group_8__4__Impl"
    // InternalCompras.g:5925:1: rule__ModuleTech__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5929:1: ( ( '}' ) )
            // InternalCompras.g:5930:1: ( '}' )
            {
            // InternalCompras.g:5930:1: ( '}' )
            // InternalCompras.g:5931:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_8_4()); 

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
    // $ANTLR end "rule__ModuleTech__Group_8__4__Impl"


    // $ANTLR start "rule__ModuleTech__Group_9__0"
    // InternalCompras.g:5941:1: rule__ModuleTech__Group_9__0 : rule__ModuleTech__Group_9__0__Impl rule__ModuleTech__Group_9__1 ;
    public final void rule__ModuleTech__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5945:1: ( rule__ModuleTech__Group_9__0__Impl rule__ModuleTech__Group_9__1 )
            // InternalCompras.g:5946:2: rule__ModuleTech__Group_9__0__Impl rule__ModuleTech__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__ModuleTech__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_9__1();

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
    // $ANTLR end "rule__ModuleTech__Group_9__0"


    // $ANTLR start "rule__ModuleTech__Group_9__0__Impl"
    // InternalCompras.g:5953:1: rule__ModuleTech__Group_9__0__Impl : ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) ) ;
    public final void rule__ModuleTech__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5957:1: ( ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) ) )
            // InternalCompras.g:5958:1: ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) )
            {
            // InternalCompras.g:5958:1: ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) )
            // InternalCompras.g:5959:2: ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 )
            {
             before(grammarAccess.getModuleTechAccess().getViewSegmentLayerAssignment_9_0()); 
            // InternalCompras.g:5960:2: ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 )
            // InternalCompras.g:5960:3: rule__ModuleTech__ViewSegmentLayerAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__ModuleTech__ViewSegmentLayerAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleTechAccess().getViewSegmentLayerAssignment_9_0()); 

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
    // $ANTLR end "rule__ModuleTech__Group_9__0__Impl"


    // $ANTLR start "rule__ModuleTech__Group_9__1"
    // InternalCompras.g:5968:1: rule__ModuleTech__Group_9__1 : rule__ModuleTech__Group_9__1__Impl rule__ModuleTech__Group_9__2 ;
    public final void rule__ModuleTech__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5972:1: ( rule__ModuleTech__Group_9__1__Impl rule__ModuleTech__Group_9__2 )
            // InternalCompras.g:5973:2: rule__ModuleTech__Group_9__1__Impl rule__ModuleTech__Group_9__2
            {
            pushFollow(FOLLOW_5);
            rule__ModuleTech__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_9__2();

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
    // $ANTLR end "rule__ModuleTech__Group_9__1"


    // $ANTLR start "rule__ModuleTech__Group_9__1__Impl"
    // InternalCompras.g:5980:1: rule__ModuleTech__Group_9__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5984:1: ( ( ':' ) )
            // InternalCompras.g:5985:1: ( ':' )
            {
            // InternalCompras.g:5985:1: ( ':' )
            // InternalCompras.g:5986:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_9_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getColonKeyword_9_1()); 

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
    // $ANTLR end "rule__ModuleTech__Group_9__1__Impl"


    // $ANTLR start "rule__ModuleTech__Group_9__2"
    // InternalCompras.g:5995:1: rule__ModuleTech__Group_9__2 : rule__ModuleTech__Group_9__2__Impl rule__ModuleTech__Group_9__3 ;
    public final void rule__ModuleTech__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5999:1: ( rule__ModuleTech__Group_9__2__Impl rule__ModuleTech__Group_9__3 )
            // InternalCompras.g:6000:2: rule__ModuleTech__Group_9__2__Impl rule__ModuleTech__Group_9__3
            {
            pushFollow(FOLLOW_52);
            rule__ModuleTech__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_9__3();

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
    // $ANTLR end "rule__ModuleTech__Group_9__2"


    // $ANTLR start "rule__ModuleTech__Group_9__2__Impl"
    // InternalCompras.g:6007:1: rule__ModuleTech__Group_9__2__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6011:1: ( ( '{' ) )
            // InternalCompras.g:6012:1: ( '{' )
            {
            // InternalCompras.g:6012:1: ( '{' )
            // InternalCompras.g:6013:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_9_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_9_2()); 

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
    // $ANTLR end "rule__ModuleTech__Group_9__2__Impl"


    // $ANTLR start "rule__ModuleTech__Group_9__3"
    // InternalCompras.g:6022:1: rule__ModuleTech__Group_9__3 : rule__ModuleTech__Group_9__3__Impl rule__ModuleTech__Group_9__4 ;
    public final void rule__ModuleTech__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6026:1: ( rule__ModuleTech__Group_9__3__Impl rule__ModuleTech__Group_9__4 )
            // InternalCompras.g:6027:2: rule__ModuleTech__Group_9__3__Impl rule__ModuleTech__Group_9__4
            {
            pushFollow(FOLLOW_52);
            rule__ModuleTech__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_9__4();

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
    // $ANTLR end "rule__ModuleTech__Group_9__3"


    // $ANTLR start "rule__ModuleTech__Group_9__3__Impl"
    // InternalCompras.g:6034:1: rule__ModuleTech__Group_9__3__Impl : ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* ) ;
    public final void rule__ModuleTech__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6038:1: ( ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* ) )
            // InternalCompras.g:6039:1: ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* )
            {
            // InternalCompras.g:6039:1: ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* )
            // InternalCompras.g:6040:2: ( rule__ModuleTech__ViewsRefAssignment_9_3 )*
            {
             before(grammarAccess.getModuleTechAccess().getViewsRefAssignment_9_3()); 
            // InternalCompras.g:6041:2: ( rule__ModuleTech__ViewsRefAssignment_9_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==50) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCompras.g:6041:3: rule__ModuleTech__ViewsRefAssignment_9_3
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__ModuleTech__ViewsRefAssignment_9_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getModuleTechAccess().getViewsRefAssignment_9_3()); 

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
    // $ANTLR end "rule__ModuleTech__Group_9__3__Impl"


    // $ANTLR start "rule__ModuleTech__Group_9__4"
    // InternalCompras.g:6049:1: rule__ModuleTech__Group_9__4 : rule__ModuleTech__Group_9__4__Impl ;
    public final void rule__ModuleTech__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6053:1: ( rule__ModuleTech__Group_9__4__Impl )
            // InternalCompras.g:6054:2: rule__ModuleTech__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_9__4__Impl();

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
    // $ANTLR end "rule__ModuleTech__Group_9__4"


    // $ANTLR start "rule__ModuleTech__Group_9__4__Impl"
    // InternalCompras.g:6060:1: rule__ModuleTech__Group_9__4__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6064:1: ( ( '}' ) )
            // InternalCompras.g:6065:1: ( '}' )
            {
            // InternalCompras.g:6065:1: ( '}' )
            // InternalCompras.g:6066:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_9_4()); 

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
    // $ANTLR end "rule__ModuleTech__Group_9__4__Impl"


    // $ANTLR start "rule__ModuleTech__Group_10__0"
    // InternalCompras.g:6076:1: rule__ModuleTech__Group_10__0 : rule__ModuleTech__Group_10__0__Impl rule__ModuleTech__Group_10__1 ;
    public final void rule__ModuleTech__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6080:1: ( rule__ModuleTech__Group_10__0__Impl rule__ModuleTech__Group_10__1 )
            // InternalCompras.g:6081:2: rule__ModuleTech__Group_10__0__Impl rule__ModuleTech__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__ModuleTech__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_10__1();

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
    // $ANTLR end "rule__ModuleTech__Group_10__0"


    // $ANTLR start "rule__ModuleTech__Group_10__0__Impl"
    // InternalCompras.g:6088:1: rule__ModuleTech__Group_10__0__Impl : ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) ) ;
    public final void rule__ModuleTech__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6092:1: ( ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) ) )
            // InternalCompras.g:6093:1: ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) )
            {
            // InternalCompras.g:6093:1: ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) )
            // InternalCompras.g:6094:2: ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 )
            {
             before(grammarAccess.getModuleTechAccess().getScriptSegmentLayerAssignment_10_0()); 
            // InternalCompras.g:6095:2: ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 )
            // InternalCompras.g:6095:3: rule__ModuleTech__ScriptSegmentLayerAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__ModuleTech__ScriptSegmentLayerAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleTechAccess().getScriptSegmentLayerAssignment_10_0()); 

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
    // $ANTLR end "rule__ModuleTech__Group_10__0__Impl"


    // $ANTLR start "rule__ModuleTech__Group_10__1"
    // InternalCompras.g:6103:1: rule__ModuleTech__Group_10__1 : rule__ModuleTech__Group_10__1__Impl rule__ModuleTech__Group_10__2 ;
    public final void rule__ModuleTech__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6107:1: ( rule__ModuleTech__Group_10__1__Impl rule__ModuleTech__Group_10__2 )
            // InternalCompras.g:6108:2: rule__ModuleTech__Group_10__1__Impl rule__ModuleTech__Group_10__2
            {
            pushFollow(FOLLOW_5);
            rule__ModuleTech__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_10__2();

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
    // $ANTLR end "rule__ModuleTech__Group_10__1"


    // $ANTLR start "rule__ModuleTech__Group_10__1__Impl"
    // InternalCompras.g:6115:1: rule__ModuleTech__Group_10__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6119:1: ( ( ':' ) )
            // InternalCompras.g:6120:1: ( ':' )
            {
            // InternalCompras.g:6120:1: ( ':' )
            // InternalCompras.g:6121:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_10_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getColonKeyword_10_1()); 

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
    // $ANTLR end "rule__ModuleTech__Group_10__1__Impl"


    // $ANTLR start "rule__ModuleTech__Group_10__2"
    // InternalCompras.g:6130:1: rule__ModuleTech__Group_10__2 : rule__ModuleTech__Group_10__2__Impl rule__ModuleTech__Group_10__3 ;
    public final void rule__ModuleTech__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6134:1: ( rule__ModuleTech__Group_10__2__Impl rule__ModuleTech__Group_10__3 )
            // InternalCompras.g:6135:2: rule__ModuleTech__Group_10__2__Impl rule__ModuleTech__Group_10__3
            {
            pushFollow(FOLLOW_54);
            rule__ModuleTech__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_10__3();

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
    // $ANTLR end "rule__ModuleTech__Group_10__2"


    // $ANTLR start "rule__ModuleTech__Group_10__2__Impl"
    // InternalCompras.g:6142:1: rule__ModuleTech__Group_10__2__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6146:1: ( ( '{' ) )
            // InternalCompras.g:6147:1: ( '{' )
            {
            // InternalCompras.g:6147:1: ( '{' )
            // InternalCompras.g:6148:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_10_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_10_2()); 

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
    // $ANTLR end "rule__ModuleTech__Group_10__2__Impl"


    // $ANTLR start "rule__ModuleTech__Group_10__3"
    // InternalCompras.g:6157:1: rule__ModuleTech__Group_10__3 : rule__ModuleTech__Group_10__3__Impl rule__ModuleTech__Group_10__4 ;
    public final void rule__ModuleTech__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6161:1: ( rule__ModuleTech__Group_10__3__Impl rule__ModuleTech__Group_10__4 )
            // InternalCompras.g:6162:2: rule__ModuleTech__Group_10__3__Impl rule__ModuleTech__Group_10__4
            {
            pushFollow(FOLLOW_54);
            rule__ModuleTech__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_10__4();

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
    // $ANTLR end "rule__ModuleTech__Group_10__3"


    // $ANTLR start "rule__ModuleTech__Group_10__3__Impl"
    // InternalCompras.g:6169:1: rule__ModuleTech__Group_10__3__Impl : ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* ) ;
    public final void rule__ModuleTech__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6173:1: ( ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* ) )
            // InternalCompras.g:6174:1: ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* )
            {
            // InternalCompras.g:6174:1: ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* )
            // InternalCompras.g:6175:2: ( rule__ModuleTech__ScriptRefAssignment_10_3 )*
            {
             before(grammarAccess.getModuleTechAccess().getScriptRefAssignment_10_3()); 
            // InternalCompras.g:6176:2: ( rule__ModuleTech__ScriptRefAssignment_10_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==51) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCompras.g:6176:3: rule__ModuleTech__ScriptRefAssignment_10_3
            	    {
            	    pushFollow(FOLLOW_55);
            	    rule__ModuleTech__ScriptRefAssignment_10_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getModuleTechAccess().getScriptRefAssignment_10_3()); 

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
    // $ANTLR end "rule__ModuleTech__Group_10__3__Impl"


    // $ANTLR start "rule__ModuleTech__Group_10__4"
    // InternalCompras.g:6184:1: rule__ModuleTech__Group_10__4 : rule__ModuleTech__Group_10__4__Impl ;
    public final void rule__ModuleTech__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6188:1: ( rule__ModuleTech__Group_10__4__Impl )
            // InternalCompras.g:6189:2: rule__ModuleTech__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModuleTech__Group_10__4__Impl();

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
    // $ANTLR end "rule__ModuleTech__Group_10__4"


    // $ANTLR start "rule__ModuleTech__Group_10__4__Impl"
    // InternalCompras.g:6195:1: rule__ModuleTech__Group_10__4__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6199:1: ( ( '}' ) )
            // InternalCompras.g:6200:1: ( '}' )
            {
            // InternalCompras.g:6200:1: ( '}' )
            // InternalCompras.g:6201:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_10_4()); 

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
    // $ANTLR end "rule__ModuleTech__Group_10__4__Impl"


    // $ANTLR start "rule__ControllersRef__Group__0"
    // InternalCompras.g:6211:1: rule__ControllersRef__Group__0 : rule__ControllersRef__Group__0__Impl rule__ControllersRef__Group__1 ;
    public final void rule__ControllersRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6215:1: ( rule__ControllersRef__Group__0__Impl rule__ControllersRef__Group__1 )
            // InternalCompras.g:6216:2: rule__ControllersRef__Group__0__Impl rule__ControllersRef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ControllersRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ControllersRef__Group__1();

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
    // $ANTLR end "rule__ControllersRef__Group__0"


    // $ANTLR start "rule__ControllersRef__Group__0__Impl"
    // InternalCompras.g:6223:1: rule__ControllersRef__Group__0__Impl : ( 'Controller' ) ;
    public final void rule__ControllersRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6227:1: ( ( 'Controller' ) )
            // InternalCompras.g:6228:1: ( 'Controller' )
            {
            // InternalCompras.g:6228:1: ( 'Controller' )
            // InternalCompras.g:6229:2: 'Controller'
            {
             before(grammarAccess.getControllersRefAccess().getControllerKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getControllersRefAccess().getControllerKeyword_0()); 

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
    // $ANTLR end "rule__ControllersRef__Group__0__Impl"


    // $ANTLR start "rule__ControllersRef__Group__1"
    // InternalCompras.g:6238:1: rule__ControllersRef__Group__1 : rule__ControllersRef__Group__1__Impl rule__ControllersRef__Group__2 ;
    public final void rule__ControllersRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6242:1: ( rule__ControllersRef__Group__1__Impl rule__ControllersRef__Group__2 )
            // InternalCompras.g:6243:2: rule__ControllersRef__Group__1__Impl rule__ControllersRef__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ControllersRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ControllersRef__Group__2();

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
    // $ANTLR end "rule__ControllersRef__Group__1"


    // $ANTLR start "rule__ControllersRef__Group__1__Impl"
    // InternalCompras.g:6250:1: rule__ControllersRef__Group__1__Impl : ( ':' ) ;
    public final void rule__ControllersRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6254:1: ( ( ':' ) )
            // InternalCompras.g:6255:1: ( ':' )
            {
            // InternalCompras.g:6255:1: ( ':' )
            // InternalCompras.g:6256:2: ':'
            {
             before(grammarAccess.getControllersRefAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getControllersRefAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ControllersRef__Group__1__Impl"


    // $ANTLR start "rule__ControllersRef__Group__2"
    // InternalCompras.g:6265:1: rule__ControllersRef__Group__2 : rule__ControllersRef__Group__2__Impl ;
    public final void rule__ControllersRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6269:1: ( rule__ControllersRef__Group__2__Impl )
            // InternalCompras.g:6270:2: rule__ControllersRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ControllersRef__Group__2__Impl();

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
    // $ANTLR end "rule__ControllersRef__Group__2"


    // $ANTLR start "rule__ControllersRef__Group__2__Impl"
    // InternalCompras.g:6276:1: rule__ControllersRef__Group__2__Impl : ( ( rule__ControllersRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__ControllersRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6280:1: ( ( ( rule__ControllersRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6281:1: ( ( rule__ControllersRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6281:1: ( ( rule__ControllersRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6282:2: ( rule__ControllersRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getControllersRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6283:2: ( rule__ControllersRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6283:3: rule__ControllersRef__FunctionalityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ControllersRef__FunctionalityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getControllersRefAccess().getFunctionalityAssignment_2()); 

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
    // $ANTLR end "rule__ControllersRef__Group__2__Impl"


    // $ANTLR start "rule__ViewsRef__Group__0"
    // InternalCompras.g:6292:1: rule__ViewsRef__Group__0 : rule__ViewsRef__Group__0__Impl rule__ViewsRef__Group__1 ;
    public final void rule__ViewsRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6296:1: ( rule__ViewsRef__Group__0__Impl rule__ViewsRef__Group__1 )
            // InternalCompras.g:6297:2: rule__ViewsRef__Group__0__Impl rule__ViewsRef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ViewsRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViewsRef__Group__1();

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
    // $ANTLR end "rule__ViewsRef__Group__0"


    // $ANTLR start "rule__ViewsRef__Group__0__Impl"
    // InternalCompras.g:6304:1: rule__ViewsRef__Group__0__Impl : ( 'View' ) ;
    public final void rule__ViewsRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6308:1: ( ( 'View' ) )
            // InternalCompras.g:6309:1: ( 'View' )
            {
            // InternalCompras.g:6309:1: ( 'View' )
            // InternalCompras.g:6310:2: 'View'
            {
             before(grammarAccess.getViewsRefAccess().getViewKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getViewsRefAccess().getViewKeyword_0()); 

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
    // $ANTLR end "rule__ViewsRef__Group__0__Impl"


    // $ANTLR start "rule__ViewsRef__Group__1"
    // InternalCompras.g:6319:1: rule__ViewsRef__Group__1 : rule__ViewsRef__Group__1__Impl rule__ViewsRef__Group__2 ;
    public final void rule__ViewsRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6323:1: ( rule__ViewsRef__Group__1__Impl rule__ViewsRef__Group__2 )
            // InternalCompras.g:6324:2: rule__ViewsRef__Group__1__Impl rule__ViewsRef__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ViewsRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViewsRef__Group__2();

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
    // $ANTLR end "rule__ViewsRef__Group__1"


    // $ANTLR start "rule__ViewsRef__Group__1__Impl"
    // InternalCompras.g:6331:1: rule__ViewsRef__Group__1__Impl : ( ':' ) ;
    public final void rule__ViewsRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6335:1: ( ( ':' ) )
            // InternalCompras.g:6336:1: ( ':' )
            {
            // InternalCompras.g:6336:1: ( ':' )
            // InternalCompras.g:6337:2: ':'
            {
             before(grammarAccess.getViewsRefAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getViewsRefAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ViewsRef__Group__1__Impl"


    // $ANTLR start "rule__ViewsRef__Group__2"
    // InternalCompras.g:6346:1: rule__ViewsRef__Group__2 : rule__ViewsRef__Group__2__Impl ;
    public final void rule__ViewsRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6350:1: ( rule__ViewsRef__Group__2__Impl )
            // InternalCompras.g:6351:2: rule__ViewsRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ViewsRef__Group__2__Impl();

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
    // $ANTLR end "rule__ViewsRef__Group__2"


    // $ANTLR start "rule__ViewsRef__Group__2__Impl"
    // InternalCompras.g:6357:1: rule__ViewsRef__Group__2__Impl : ( ( rule__ViewsRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__ViewsRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6361:1: ( ( ( rule__ViewsRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6362:1: ( ( rule__ViewsRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6362:1: ( ( rule__ViewsRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6363:2: ( rule__ViewsRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getViewsRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6364:2: ( rule__ViewsRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6364:3: rule__ViewsRef__FunctionalityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ViewsRef__FunctionalityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getViewsRefAccess().getFunctionalityAssignment_2()); 

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
    // $ANTLR end "rule__ViewsRef__Group__2__Impl"


    // $ANTLR start "rule__ScriptRef__Group__0"
    // InternalCompras.g:6373:1: rule__ScriptRef__Group__0 : rule__ScriptRef__Group__0__Impl rule__ScriptRef__Group__1 ;
    public final void rule__ScriptRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6377:1: ( rule__ScriptRef__Group__0__Impl rule__ScriptRef__Group__1 )
            // InternalCompras.g:6378:2: rule__ScriptRef__Group__0__Impl rule__ScriptRef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ScriptRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScriptRef__Group__1();

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
    // $ANTLR end "rule__ScriptRef__Group__0"


    // $ANTLR start "rule__ScriptRef__Group__0__Impl"
    // InternalCompras.g:6385:1: rule__ScriptRef__Group__0__Impl : ( 'Script' ) ;
    public final void rule__ScriptRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6389:1: ( ( 'Script' ) )
            // InternalCompras.g:6390:1: ( 'Script' )
            {
            // InternalCompras.g:6390:1: ( 'Script' )
            // InternalCompras.g:6391:2: 'Script'
            {
             before(grammarAccess.getScriptRefAccess().getScriptKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getScriptRefAccess().getScriptKeyword_0()); 

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
    // $ANTLR end "rule__ScriptRef__Group__0__Impl"


    // $ANTLR start "rule__ScriptRef__Group__1"
    // InternalCompras.g:6400:1: rule__ScriptRef__Group__1 : rule__ScriptRef__Group__1__Impl rule__ScriptRef__Group__2 ;
    public final void rule__ScriptRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6404:1: ( rule__ScriptRef__Group__1__Impl rule__ScriptRef__Group__2 )
            // InternalCompras.g:6405:2: rule__ScriptRef__Group__1__Impl rule__ScriptRef__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ScriptRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScriptRef__Group__2();

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
    // $ANTLR end "rule__ScriptRef__Group__1"


    // $ANTLR start "rule__ScriptRef__Group__1__Impl"
    // InternalCompras.g:6412:1: rule__ScriptRef__Group__1__Impl : ( ':' ) ;
    public final void rule__ScriptRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6416:1: ( ( ':' ) )
            // InternalCompras.g:6417:1: ( ':' )
            {
            // InternalCompras.g:6417:1: ( ':' )
            // InternalCompras.g:6418:2: ':'
            {
             before(grammarAccess.getScriptRefAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScriptRefAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ScriptRef__Group__1__Impl"


    // $ANTLR start "rule__ScriptRef__Group__2"
    // InternalCompras.g:6427:1: rule__ScriptRef__Group__2 : rule__ScriptRef__Group__2__Impl ;
    public final void rule__ScriptRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6431:1: ( rule__ScriptRef__Group__2__Impl )
            // InternalCompras.g:6432:2: rule__ScriptRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScriptRef__Group__2__Impl();

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
    // $ANTLR end "rule__ScriptRef__Group__2"


    // $ANTLR start "rule__ScriptRef__Group__2__Impl"
    // InternalCompras.g:6438:1: rule__ScriptRef__Group__2__Impl : ( ( rule__ScriptRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__ScriptRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6442:1: ( ( ( rule__ScriptRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6443:1: ( ( rule__ScriptRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6443:1: ( ( rule__ScriptRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6444:2: ( rule__ScriptRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getScriptRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6445:2: ( rule__ScriptRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6445:3: rule__ScriptRef__FunctionalityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ScriptRef__FunctionalityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScriptRefAccess().getFunctionalityAssignment_2()); 

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
    // $ANTLR end "rule__ScriptRef__Group__2__Impl"


    // $ANTLR start "rule__BusinessLayerRef__Group__0"
    // InternalCompras.g:6454:1: rule__BusinessLayerRef__Group__0 : rule__BusinessLayerRef__Group__0__Impl rule__BusinessLayerRef__Group__1 ;
    public final void rule__BusinessLayerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6458:1: ( rule__BusinessLayerRef__Group__0__Impl rule__BusinessLayerRef__Group__1 )
            // InternalCompras.g:6459:2: rule__BusinessLayerRef__Group__0__Impl rule__BusinessLayerRef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BusinessLayerRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessLayerRef__Group__1();

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
    // $ANTLR end "rule__BusinessLayerRef__Group__0"


    // $ANTLR start "rule__BusinessLayerRef__Group__0__Impl"
    // InternalCompras.g:6466:1: rule__BusinessLayerRef__Group__0__Impl : ( 'BLogic' ) ;
    public final void rule__BusinessLayerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6470:1: ( ( 'BLogic' ) )
            // InternalCompras.g:6471:1: ( 'BLogic' )
            {
            // InternalCompras.g:6471:1: ( 'BLogic' )
            // InternalCompras.g:6472:2: 'BLogic'
            {
             before(grammarAccess.getBusinessLayerRefAccess().getBLogicKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBusinessLayerRefAccess().getBLogicKeyword_0()); 

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
    // $ANTLR end "rule__BusinessLayerRef__Group__0__Impl"


    // $ANTLR start "rule__BusinessLayerRef__Group__1"
    // InternalCompras.g:6481:1: rule__BusinessLayerRef__Group__1 : rule__BusinessLayerRef__Group__1__Impl rule__BusinessLayerRef__Group__2 ;
    public final void rule__BusinessLayerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6485:1: ( rule__BusinessLayerRef__Group__1__Impl rule__BusinessLayerRef__Group__2 )
            // InternalCompras.g:6486:2: rule__BusinessLayerRef__Group__1__Impl rule__BusinessLayerRef__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BusinessLayerRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessLayerRef__Group__2();

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
    // $ANTLR end "rule__BusinessLayerRef__Group__1"


    // $ANTLR start "rule__BusinessLayerRef__Group__1__Impl"
    // InternalCompras.g:6493:1: rule__BusinessLayerRef__Group__1__Impl : ( ':' ) ;
    public final void rule__BusinessLayerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6497:1: ( ( ':' ) )
            // InternalCompras.g:6498:1: ( ':' )
            {
            // InternalCompras.g:6498:1: ( ':' )
            // InternalCompras.g:6499:2: ':'
            {
             before(grammarAccess.getBusinessLayerRefAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBusinessLayerRefAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__BusinessLayerRef__Group__1__Impl"


    // $ANTLR start "rule__BusinessLayerRef__Group__2"
    // InternalCompras.g:6508:1: rule__BusinessLayerRef__Group__2 : rule__BusinessLayerRef__Group__2__Impl ;
    public final void rule__BusinessLayerRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6512:1: ( rule__BusinessLayerRef__Group__2__Impl )
            // InternalCompras.g:6513:2: rule__BusinessLayerRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BusinessLayerRef__Group__2__Impl();

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
    // $ANTLR end "rule__BusinessLayerRef__Group__2"


    // $ANTLR start "rule__BusinessLayerRef__Group__2__Impl"
    // InternalCompras.g:6519:1: rule__BusinessLayerRef__Group__2__Impl : ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__BusinessLayerRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6523:1: ( ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6524:1: ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6524:1: ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6525:2: ( rule__BusinessLayerRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getBusinessLayerRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6526:2: ( rule__BusinessLayerRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6526:3: rule__BusinessLayerRef__FunctionalityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BusinessLayerRef__FunctionalityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBusinessLayerRefAccess().getFunctionalityAssignment_2()); 

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
    // $ANTLR end "rule__BusinessLayerRef__Group__2__Impl"


    // $ANTLR start "rule__DataAccessLayerRef__Group__0"
    // InternalCompras.g:6535:1: rule__DataAccessLayerRef__Group__0 : rule__DataAccessLayerRef__Group__0__Impl rule__DataAccessLayerRef__Group__1 ;
    public final void rule__DataAccessLayerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6539:1: ( rule__DataAccessLayerRef__Group__0__Impl rule__DataAccessLayerRef__Group__1 )
            // InternalCompras.g:6540:2: rule__DataAccessLayerRef__Group__0__Impl rule__DataAccessLayerRef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataAccessLayerRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessLayerRef__Group__1();

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
    // $ANTLR end "rule__DataAccessLayerRef__Group__0"


    // $ANTLR start "rule__DataAccessLayerRef__Group__0__Impl"
    // InternalCompras.g:6547:1: rule__DataAccessLayerRef__Group__0__Impl : ( 'DataAccess' ) ;
    public final void rule__DataAccessLayerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6551:1: ( ( 'DataAccess' ) )
            // InternalCompras.g:6552:1: ( 'DataAccess' )
            {
            // InternalCompras.g:6552:1: ( 'DataAccess' )
            // InternalCompras.g:6553:2: 'DataAccess'
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getDataAccessKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getDataAccessLayerRefAccess().getDataAccessKeyword_0()); 

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
    // $ANTLR end "rule__DataAccessLayerRef__Group__0__Impl"


    // $ANTLR start "rule__DataAccessLayerRef__Group__1"
    // InternalCompras.g:6562:1: rule__DataAccessLayerRef__Group__1 : rule__DataAccessLayerRef__Group__1__Impl rule__DataAccessLayerRef__Group__2 ;
    public final void rule__DataAccessLayerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6566:1: ( rule__DataAccessLayerRef__Group__1__Impl rule__DataAccessLayerRef__Group__2 )
            // InternalCompras.g:6567:2: rule__DataAccessLayerRef__Group__1__Impl rule__DataAccessLayerRef__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DataAccessLayerRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccessLayerRef__Group__2();

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
    // $ANTLR end "rule__DataAccessLayerRef__Group__1"


    // $ANTLR start "rule__DataAccessLayerRef__Group__1__Impl"
    // InternalCompras.g:6574:1: rule__DataAccessLayerRef__Group__1__Impl : ( ':' ) ;
    public final void rule__DataAccessLayerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6578:1: ( ( ':' ) )
            // InternalCompras.g:6579:1: ( ':' )
            {
            // InternalCompras.g:6579:1: ( ':' )
            // InternalCompras.g:6580:2: ':'
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataAccessLayerRefAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__DataAccessLayerRef__Group__1__Impl"


    // $ANTLR start "rule__DataAccessLayerRef__Group__2"
    // InternalCompras.g:6589:1: rule__DataAccessLayerRef__Group__2 : rule__DataAccessLayerRef__Group__2__Impl ;
    public final void rule__DataAccessLayerRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6593:1: ( rule__DataAccessLayerRef__Group__2__Impl )
            // InternalCompras.g:6594:2: rule__DataAccessLayerRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessLayerRef__Group__2__Impl();

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
    // $ANTLR end "rule__DataAccessLayerRef__Group__2"


    // $ANTLR start "rule__DataAccessLayerRef__Group__2__Impl"
    // InternalCompras.g:6600:1: rule__DataAccessLayerRef__Group__2__Impl : ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__DataAccessLayerRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6604:1: ( ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6605:1: ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6605:1: ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6606:2: ( rule__DataAccessLayerRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6607:2: ( rule__DataAccessLayerRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6607:3: rule__DataAccessLayerRef__FunctionalityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessLayerRef__FunctionalityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessLayerRefAccess().getFunctionalityAssignment_2()); 

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
    // $ANTLR end "rule__DataAccessLayerRef__Group__2__Impl"


    // $ANTLR start "rule__CommonLayerRef__Group__0"
    // InternalCompras.g:6616:1: rule__CommonLayerRef__Group__0 : rule__CommonLayerRef__Group__0__Impl rule__CommonLayerRef__Group__1 ;
    public final void rule__CommonLayerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6620:1: ( rule__CommonLayerRef__Group__0__Impl rule__CommonLayerRef__Group__1 )
            // InternalCompras.g:6621:2: rule__CommonLayerRef__Group__0__Impl rule__CommonLayerRef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CommonLayerRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommonLayerRef__Group__1();

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
    // $ANTLR end "rule__CommonLayerRef__Group__0"


    // $ANTLR start "rule__CommonLayerRef__Group__0__Impl"
    // InternalCompras.g:6628:1: rule__CommonLayerRef__Group__0__Impl : ( 'DtoModel' ) ;
    public final void rule__CommonLayerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6632:1: ( ( 'DtoModel' ) )
            // InternalCompras.g:6633:1: ( 'DtoModel' )
            {
            // InternalCompras.g:6633:1: ( 'DtoModel' )
            // InternalCompras.g:6634:2: 'DtoModel'
            {
             before(grammarAccess.getCommonLayerRefAccess().getDtoModelKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCommonLayerRefAccess().getDtoModelKeyword_0()); 

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
    // $ANTLR end "rule__CommonLayerRef__Group__0__Impl"


    // $ANTLR start "rule__CommonLayerRef__Group__1"
    // InternalCompras.g:6643:1: rule__CommonLayerRef__Group__1 : rule__CommonLayerRef__Group__1__Impl rule__CommonLayerRef__Group__2 ;
    public final void rule__CommonLayerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6647:1: ( rule__CommonLayerRef__Group__1__Impl rule__CommonLayerRef__Group__2 )
            // InternalCompras.g:6648:2: rule__CommonLayerRef__Group__1__Impl rule__CommonLayerRef__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CommonLayerRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommonLayerRef__Group__2();

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
    // $ANTLR end "rule__CommonLayerRef__Group__1"


    // $ANTLR start "rule__CommonLayerRef__Group__1__Impl"
    // InternalCompras.g:6655:1: rule__CommonLayerRef__Group__1__Impl : ( ':' ) ;
    public final void rule__CommonLayerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6659:1: ( ( ':' ) )
            // InternalCompras.g:6660:1: ( ':' )
            {
            // InternalCompras.g:6660:1: ( ':' )
            // InternalCompras.g:6661:2: ':'
            {
             before(grammarAccess.getCommonLayerRefAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCommonLayerRefAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__CommonLayerRef__Group__1__Impl"


    // $ANTLR start "rule__CommonLayerRef__Group__2"
    // InternalCompras.g:6670:1: rule__CommonLayerRef__Group__2 : rule__CommonLayerRef__Group__2__Impl ;
    public final void rule__CommonLayerRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6674:1: ( rule__CommonLayerRef__Group__2__Impl )
            // InternalCompras.g:6675:2: rule__CommonLayerRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommonLayerRef__Group__2__Impl();

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
    // $ANTLR end "rule__CommonLayerRef__Group__2"


    // $ANTLR start "rule__CommonLayerRef__Group__2__Impl"
    // InternalCompras.g:6681:1: rule__CommonLayerRef__Group__2__Impl : ( ( rule__CommonLayerRef__EntityAssignment_2 ) ) ;
    public final void rule__CommonLayerRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6685:1: ( ( ( rule__CommonLayerRef__EntityAssignment_2 ) ) )
            // InternalCompras.g:6686:1: ( ( rule__CommonLayerRef__EntityAssignment_2 ) )
            {
            // InternalCompras.g:6686:1: ( ( rule__CommonLayerRef__EntityAssignment_2 ) )
            // InternalCompras.g:6687:2: ( rule__CommonLayerRef__EntityAssignment_2 )
            {
             before(grammarAccess.getCommonLayerRefAccess().getEntityAssignment_2()); 
            // InternalCompras.g:6688:2: ( rule__CommonLayerRef__EntityAssignment_2 )
            // InternalCompras.g:6688:3: rule__CommonLayerRef__EntityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CommonLayerRef__EntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCommonLayerRefAccess().getEntityAssignment_2()); 

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
    // $ANTLR end "rule__CommonLayerRef__Group__2__Impl"


    // $ANTLR start "rule__Solution__NameAssignment_2"
    // InternalCompras.g:6697:1: rule__Solution__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Solution__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6701:1: ( ( RULE_ID ) )
            // InternalCompras.g:6702:2: ( RULE_ID )
            {
            // InternalCompras.g:6702:2: ( RULE_ID )
            // InternalCompras.g:6703:3: RULE_ID
            {
             before(grammarAccess.getSolutionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Solution__NameAssignment_2"


    // $ANTLR start "rule__Solution__DomainAssignment_6"
    // InternalCompras.g:6712:1: rule__Solution__DomainAssignment_6 : ( ruleDomain ) ;
    public final void rule__Solution__DomainAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6716:1: ( ( ruleDomain ) )
            // InternalCompras.g:6717:2: ( ruleDomain )
            {
            // InternalCompras.g:6717:2: ( ruleDomain )
            // InternalCompras.g:6718:3: ruleDomain
            {
             before(grammarAccess.getSolutionAccess().getDomainDomainParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getDomainDomainParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Solution__DomainAssignment_6"


    // $ANTLR start "rule__Solution__ArchitectureAssignment_9"
    // InternalCompras.g:6727:1: rule__Solution__ArchitectureAssignment_9 : ( ruleArchitecture ) ;
    public final void rule__Solution__ArchitectureAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6731:1: ( ( ruleArchitecture ) )
            // InternalCompras.g:6732:2: ( ruleArchitecture )
            {
            // InternalCompras.g:6732:2: ( ruleArchitecture )
            // InternalCompras.g:6733:3: ruleArchitecture
            {
             before(grammarAccess.getSolutionAccess().getArchitectureArchitectureParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleArchitecture();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getArchitectureArchitectureParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Solution__ArchitectureAssignment_9"


    // $ANTLR start "rule__Solution__TechnologyAssignment_12"
    // InternalCompras.g:6742:1: rule__Solution__TechnologyAssignment_12 : ( ruleTechnology ) ;
    public final void rule__Solution__TechnologyAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6746:1: ( ( ruleTechnology ) )
            // InternalCompras.g:6747:2: ( ruleTechnology )
            {
            // InternalCompras.g:6747:2: ( ruleTechnology )
            // InternalCompras.g:6748:3: ruleTechnology
            {
             before(grammarAccess.getSolutionAccess().getTechnologyTechnologyParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleTechnology();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getTechnologyTechnologyParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Solution__TechnologyAssignment_12"


    // $ANTLR start "rule__Domain__ModuleAssignment_1"
    // InternalCompras.g:6757:1: rule__Domain__ModuleAssignment_1 : ( ruleModule ) ;
    public final void rule__Domain__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6761:1: ( ( ruleModule ) )
            // InternalCompras.g:6762:2: ( ruleModule )
            {
            // InternalCompras.g:6762:2: ( ruleModule )
            // InternalCompras.g:6763:3: ruleModule
            {
             before(grammarAccess.getDomainAccess().getModuleModuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getModuleModuleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Domain__ModuleAssignment_1"


    // $ANTLR start "rule__Module__NameAssignment_2"
    // InternalCompras.g:6772:1: rule__Module__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6776:1: ( ( RULE_ID ) )
            // InternalCompras.g:6777:2: ( RULE_ID )
            {
            // InternalCompras.g:6777:2: ( RULE_ID )
            // InternalCompras.g:6778:3: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Module__NameAssignment_2"


    // $ANTLR start "rule__Module__EntityAssignment_8"
    // InternalCompras.g:6787:1: rule__Module__EntityAssignment_8 : ( ruleEntity ) ;
    public final void rule__Module__EntityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6791:1: ( ( ruleEntity ) )
            // InternalCompras.g:6792:2: ( ruleEntity )
            {
            // InternalCompras.g:6792:2: ( ruleEntity )
            // InternalCompras.g:6793:3: ruleEntity
            {
             before(grammarAccess.getModuleAccess().getEntityEntityParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getEntityEntityParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Module__EntityAssignment_8"


    // $ANTLR start "rule__Module__FunctionalityAssignment_10_3"
    // InternalCompras.g:6802:1: rule__Module__FunctionalityAssignment_10_3 : ( ruleFunctionality ) ;
    public final void rule__Module__FunctionalityAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6806:1: ( ( ruleFunctionality ) )
            // InternalCompras.g:6807:2: ( ruleFunctionality )
            {
            // InternalCompras.g:6807:2: ( ruleFunctionality )
            // InternalCompras.g:6808:3: ruleFunctionality
            {
             before(grammarAccess.getModuleAccess().getFunctionalityFunctionalityParserRuleCall_10_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionality();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getFunctionalityFunctionalityParserRuleCall_10_3_0()); 

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
    // $ANTLR end "rule__Module__FunctionalityAssignment_10_3"


    // $ANTLR start "rule__Entity__NameAssignment_0"
    // InternalCompras.g:6817:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6821:1: ( ( RULE_ID ) )
            // InternalCompras.g:6822:2: ( RULE_ID )
            {
            // InternalCompras.g:6822:2: ( RULE_ID )
            // InternalCompras.g:6823:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_0"


    // $ANTLR start "rule__Entity__EntityFieldAssignment_3"
    // InternalCompras.g:6832:1: rule__Entity__EntityFieldAssignment_3 : ( ruleEntityField ) ;
    public final void rule__Entity__EntityFieldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6836:1: ( ( ruleEntityField ) )
            // InternalCompras.g:6837:2: ( ruleEntityField )
            {
            // InternalCompras.g:6837:2: ( ruleEntityField )
            // InternalCompras.g:6838:3: ruleEntityField
            {
             before(grammarAccess.getEntityAccess().getEntityFieldEntityFieldParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getEntityFieldEntityFieldParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entity__EntityFieldAssignment_3"


    // $ANTLR start "rule__EntityField__EntityFieldRequiredAssignment_0"
    // InternalCompras.g:6847:1: rule__EntityField__EntityFieldRequiredAssignment_0 : ( ruleEntityFieldRequired ) ;
    public final void rule__EntityField__EntityFieldRequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6851:1: ( ( ruleEntityFieldRequired ) )
            // InternalCompras.g:6852:2: ( ruleEntityFieldRequired )
            {
            // InternalCompras.g:6852:2: ( ruleEntityFieldRequired )
            // InternalCompras.g:6853:3: ruleEntityFieldRequired
            {
             before(grammarAccess.getEntityFieldAccess().getEntityFieldRequiredEntityFieldRequiredParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityFieldRequired();

            state._fsp--;

             after(grammarAccess.getEntityFieldAccess().getEntityFieldRequiredEntityFieldRequiredParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__EntityField__EntityFieldRequiredAssignment_0"


    // $ANTLR start "rule__EntityField__EntityFieldLabelAssignment_1"
    // InternalCompras.g:6862:1: rule__EntityField__EntityFieldLabelAssignment_1 : ( ruleEntityFieldLabel ) ;
    public final void rule__EntityField__EntityFieldLabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6866:1: ( ( ruleEntityFieldLabel ) )
            // InternalCompras.g:6867:2: ( ruleEntityFieldLabel )
            {
            // InternalCompras.g:6867:2: ( ruleEntityFieldLabel )
            // InternalCompras.g:6868:3: ruleEntityFieldLabel
            {
             before(grammarAccess.getEntityFieldAccess().getEntityFieldLabelEntityFieldLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityFieldLabel();

            state._fsp--;

             after(grammarAccess.getEntityFieldAccess().getEntityFieldLabelEntityFieldLabelParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EntityField__EntityFieldLabelAssignment_1"


    // $ANTLR start "rule__EntityField__EntityTypeAssignment_2"
    // InternalCompras.g:6877:1: rule__EntityField__EntityTypeAssignment_2 : ( ruleEntityType ) ;
    public final void rule__EntityField__EntityTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6881:1: ( ( ruleEntityType ) )
            // InternalCompras.g:6882:2: ( ruleEntityType )
            {
            // InternalCompras.g:6882:2: ( ruleEntityType )
            // InternalCompras.g:6883:3: ruleEntityType
            {
             before(grammarAccess.getEntityFieldAccess().getEntityTypeEntityTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityFieldAccess().getEntityTypeEntityTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EntityField__EntityTypeAssignment_2"


    // $ANTLR start "rule__EntityField__NameAssignment_3"
    // InternalCompras.g:6892:1: rule__EntityField__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__EntityField__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6896:1: ( ( RULE_ID ) )
            // InternalCompras.g:6897:2: ( RULE_ID )
            {
            // InternalCompras.g:6897:2: ( RULE_ID )
            // InternalCompras.g:6898:3: RULE_ID
            {
             before(grammarAccess.getEntityFieldAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityFieldAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__EntityField__NameAssignment_3"


    // $ANTLR start "rule__EntityFieldLabel__NameAssignment_3"
    // InternalCompras.g:6907:1: rule__EntityFieldLabel__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__EntityFieldLabel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6911:1: ( ( RULE_STRING ) )
            // InternalCompras.g:6912:2: ( RULE_STRING )
            {
            // InternalCompras.g:6912:2: ( RULE_STRING )
            // InternalCompras.g:6913:3: RULE_STRING
            {
             before(grammarAccess.getEntityFieldLabelAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntityFieldLabelAccess().getNameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__EntityFieldLabel__NameAssignment_3"


    // $ANTLR start "rule__EntityFieldRequired__NameAssignment_1"
    // InternalCompras.g:6922:1: rule__EntityFieldRequired__NameAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__EntityFieldRequired__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6926:1: ( ( ( 'required' ) ) )
            // InternalCompras.g:6927:2: ( ( 'required' ) )
            {
            // InternalCompras.g:6927:2: ( ( 'required' ) )
            // InternalCompras.g:6928:3: ( 'required' )
            {
             before(grammarAccess.getEntityFieldRequiredAccess().getNameRequiredKeyword_1_0()); 
            // InternalCompras.g:6929:3: ( 'required' )
            // InternalCompras.g:6930:4: 'required'
            {
             before(grammarAccess.getEntityFieldRequiredAccess().getNameRequiredKeyword_1_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getEntityFieldRequiredAccess().getNameRequiredKeyword_1_0()); 

            }

             after(grammarAccess.getEntityFieldRequiredAccess().getNameRequiredKeyword_1_0()); 

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
    // $ANTLR end "rule__EntityFieldRequired__NameAssignment_1"


    // $ANTLR start "rule__EntityType__EntityAssignment_0"
    // InternalCompras.g:6941:1: rule__EntityType__EntityAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__EntityType__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6945:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:6946:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:6946:2: ( ( ruleFQN ) )
            // InternalCompras.g:6947:3: ( ruleFQN )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0_0()); 
            // InternalCompras.g:6948:3: ( ruleFQN )
            // InternalCompras.g:6949:4: ruleFQN
            {
             before(grammarAccess.getEntityTypeAccess().getEntityEntityFQNParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getEntityTypeAccess().getEntityEntityFQNParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0_0()); 

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
    // $ANTLR end "rule__EntityType__EntityAssignment_0"


    // $ANTLR start "rule__EntityType__CommonFieldTypeAssignment_1"
    // InternalCompras.g:6960:1: rule__EntityType__CommonFieldTypeAssignment_1 : ( ruleCommonFieldType ) ;
    public final void rule__EntityType__CommonFieldTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6964:1: ( ( ruleCommonFieldType ) )
            // InternalCompras.g:6965:2: ( ruleCommonFieldType )
            {
            // InternalCompras.g:6965:2: ( ruleCommonFieldType )
            // InternalCompras.g:6966:3: ruleCommonFieldType
            {
             before(grammarAccess.getEntityTypeAccess().getCommonFieldTypeCommonFieldTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommonFieldType();

            state._fsp--;

             after(grammarAccess.getEntityTypeAccess().getCommonFieldTypeCommonFieldTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__EntityType__CommonFieldTypeAssignment_1"


    // $ANTLR start "rule__Functionality__NameAssignment_0"
    // InternalCompras.g:6975:1: rule__Functionality__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Functionality__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6979:1: ( ( RULE_ID ) )
            // InternalCompras.g:6980:2: ( RULE_ID )
            {
            // InternalCompras.g:6980:2: ( RULE_ID )
            // InternalCompras.g:6981:3: RULE_ID
            {
             before(grammarAccess.getFunctionalityAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Functionality__NameAssignment_0"


    // $ANTLR start "rule__Functionality__EntityAssignment_2"
    // InternalCompras.g:6990:1: rule__Functionality__EntityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Functionality__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6994:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:6995:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:6995:2: ( ( ruleFQN ) )
            // InternalCompras.g:6996:3: ( ruleFQN )
            {
             before(grammarAccess.getFunctionalityAccess().getEntityEntityCrossReference_2_0()); 
            // InternalCompras.g:6997:3: ( ruleFQN )
            // InternalCompras.g:6998:4: ruleFQN
            {
             before(grammarAccess.getFunctionalityAccess().getEntityEntityFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFunctionalityAccess().getEntityEntityFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFunctionalityAccess().getEntityEntityCrossReference_2_0()); 

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
    // $ANTLR end "rule__Functionality__EntityAssignment_2"


    // $ANTLR start "rule__Functionality__FunctionalityActionTypeAssignment_5"
    // InternalCompras.g:7009:1: rule__Functionality__FunctionalityActionTypeAssignment_5 : ( ruleFunctionalityActionType ) ;
    public final void rule__Functionality__FunctionalityActionTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7013:1: ( ( ruleFunctionalityActionType ) )
            // InternalCompras.g:7014:2: ( ruleFunctionalityActionType )
            {
            // InternalCompras.g:7014:2: ( ruleFunctionalityActionType )
            // InternalCompras.g:7015:3: ruleFunctionalityActionType
            {
             before(grammarAccess.getFunctionalityAccess().getFunctionalityActionTypeFunctionalityActionTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionalityActionType();

            state._fsp--;

             after(grammarAccess.getFunctionalityAccess().getFunctionalityActionTypeFunctionalityActionTypeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Functionality__FunctionalityActionTypeAssignment_5"


    // $ANTLR start "rule__FuncCreateAction__NameAssignment"
    // InternalCompras.g:7024:1: rule__FuncCreateAction__NameAssignment : ( ( 'CREATE' ) ) ;
    public final void rule__FuncCreateAction__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7028:1: ( ( ( 'CREATE' ) ) )
            // InternalCompras.g:7029:2: ( ( 'CREATE' ) )
            {
            // InternalCompras.g:7029:2: ( ( 'CREATE' ) )
            // InternalCompras.g:7030:3: ( 'CREATE' )
            {
             before(grammarAccess.getFuncCreateActionAccess().getNameCREATEKeyword_0()); 
            // InternalCompras.g:7031:3: ( 'CREATE' )
            // InternalCompras.g:7032:4: 'CREATE'
            {
             before(grammarAccess.getFuncCreateActionAccess().getNameCREATEKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getFuncCreateActionAccess().getNameCREATEKeyword_0()); 

            }

             after(grammarAccess.getFuncCreateActionAccess().getNameCREATEKeyword_0()); 

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
    // $ANTLR end "rule__FuncCreateAction__NameAssignment"


    // $ANTLR start "rule__FuncViewGridAction__NameAssignment"
    // InternalCompras.g:7043:1: rule__FuncViewGridAction__NameAssignment : ( ( 'VIEW_GRID' ) ) ;
    public final void rule__FuncViewGridAction__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7047:1: ( ( ( 'VIEW_GRID' ) ) )
            // InternalCompras.g:7048:2: ( ( 'VIEW_GRID' ) )
            {
            // InternalCompras.g:7048:2: ( ( 'VIEW_GRID' ) )
            // InternalCompras.g:7049:3: ( 'VIEW_GRID' )
            {
             before(grammarAccess.getFuncViewGridActionAccess().getNameVIEW_GRIDKeyword_0()); 
            // InternalCompras.g:7050:3: ( 'VIEW_GRID' )
            // InternalCompras.g:7051:4: 'VIEW_GRID'
            {
             before(grammarAccess.getFuncViewGridActionAccess().getNameVIEW_GRIDKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getFuncViewGridActionAccess().getNameVIEW_GRIDKeyword_0()); 

            }

             after(grammarAccess.getFuncViewGridActionAccess().getNameVIEW_GRIDKeyword_0()); 

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
    // $ANTLR end "rule__FuncViewGridAction__NameAssignment"


    // $ANTLR start "rule__FuncViewDropDownAction__NameAssignment"
    // InternalCompras.g:7062:1: rule__FuncViewDropDownAction__NameAssignment : ( ( 'VIEW_DROPDOWN' ) ) ;
    public final void rule__FuncViewDropDownAction__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7066:1: ( ( ( 'VIEW_DROPDOWN' ) ) )
            // InternalCompras.g:7067:2: ( ( 'VIEW_DROPDOWN' ) )
            {
            // InternalCompras.g:7067:2: ( ( 'VIEW_DROPDOWN' ) )
            // InternalCompras.g:7068:3: ( 'VIEW_DROPDOWN' )
            {
             before(grammarAccess.getFuncViewDropDownActionAccess().getNameVIEW_DROPDOWNKeyword_0()); 
            // InternalCompras.g:7069:3: ( 'VIEW_DROPDOWN' )
            // InternalCompras.g:7070:4: 'VIEW_DROPDOWN'
            {
             before(grammarAccess.getFuncViewDropDownActionAccess().getNameVIEW_DROPDOWNKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getFuncViewDropDownActionAccess().getNameVIEW_DROPDOWNKeyword_0()); 

            }

             after(grammarAccess.getFuncViewDropDownActionAccess().getNameVIEW_DROPDOWNKeyword_0()); 

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
    // $ANTLR end "rule__FuncViewDropDownAction__NameAssignment"


    // $ANTLR start "rule__FuncEditAction__NameAssignment"
    // InternalCompras.g:7081:1: rule__FuncEditAction__NameAssignment : ( ( 'EDIT' ) ) ;
    public final void rule__FuncEditAction__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7085:1: ( ( ( 'EDIT' ) ) )
            // InternalCompras.g:7086:2: ( ( 'EDIT' ) )
            {
            // InternalCompras.g:7086:2: ( ( 'EDIT' ) )
            // InternalCompras.g:7087:3: ( 'EDIT' )
            {
             before(grammarAccess.getFuncEditActionAccess().getNameEDITKeyword_0()); 
            // InternalCompras.g:7088:3: ( 'EDIT' )
            // InternalCompras.g:7089:4: 'EDIT'
            {
             before(grammarAccess.getFuncEditActionAccess().getNameEDITKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getFuncEditActionAccess().getNameEDITKeyword_0()); 

            }

             after(grammarAccess.getFuncEditActionAccess().getNameEDITKeyword_0()); 

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
    // $ANTLR end "rule__FuncEditAction__NameAssignment"


    // $ANTLR start "rule__FuncDeleteAction__NameAssignment"
    // InternalCompras.g:7100:1: rule__FuncDeleteAction__NameAssignment : ( ( 'DELETE' ) ) ;
    public final void rule__FuncDeleteAction__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7104:1: ( ( ( 'DELETE' ) ) )
            // InternalCompras.g:7105:2: ( ( 'DELETE' ) )
            {
            // InternalCompras.g:7105:2: ( ( 'DELETE' ) )
            // InternalCompras.g:7106:3: ( 'DELETE' )
            {
             before(grammarAccess.getFuncDeleteActionAccess().getNameDELETEKeyword_0()); 
            // InternalCompras.g:7107:3: ( 'DELETE' )
            // InternalCompras.g:7108:4: 'DELETE'
            {
             before(grammarAccess.getFuncDeleteActionAccess().getNameDELETEKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getFuncDeleteActionAccess().getNameDELETEKeyword_0()); 

            }

             after(grammarAccess.getFuncDeleteActionAccess().getNameDELETEKeyword_0()); 

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
    // $ANTLR end "rule__FuncDeleteAction__NameAssignment"


    // $ANTLR start "rule__Architecture__PresentationLayerAssignment_6"
    // InternalCompras.g:7119:1: rule__Architecture__PresentationLayerAssignment_6 : ( rulePresentationLayer ) ;
    public final void rule__Architecture__PresentationLayerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7123:1: ( ( rulePresentationLayer ) )
            // InternalCompras.g:7124:2: ( rulePresentationLayer )
            {
            // InternalCompras.g:7124:2: ( rulePresentationLayer )
            // InternalCompras.g:7125:3: rulePresentationLayer
            {
             before(grammarAccess.getArchitectureAccess().getPresentationLayerPresentationLayerParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePresentationLayer();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getPresentationLayerPresentationLayerParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Architecture__PresentationLayerAssignment_6"


    // $ANTLR start "rule__Architecture__BusinessLayerAssignment_9"
    // InternalCompras.g:7134:1: rule__Architecture__BusinessLayerAssignment_9 : ( ruleBusinessLayer ) ;
    public final void rule__Architecture__BusinessLayerAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7138:1: ( ( ruleBusinessLayer ) )
            // InternalCompras.g:7139:2: ( ruleBusinessLayer )
            {
            // InternalCompras.g:7139:2: ( ruleBusinessLayer )
            // InternalCompras.g:7140:3: ruleBusinessLayer
            {
             before(grammarAccess.getArchitectureAccess().getBusinessLayerBusinessLayerParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessLayer();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getBusinessLayerBusinessLayerParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Architecture__BusinessLayerAssignment_9"


    // $ANTLR start "rule__Architecture__DataAccessLayerAssignment_12"
    // InternalCompras.g:7149:1: rule__Architecture__DataAccessLayerAssignment_12 : ( ruleDataAccessLayer ) ;
    public final void rule__Architecture__DataAccessLayerAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7153:1: ( ( ruleDataAccessLayer ) )
            // InternalCompras.g:7154:2: ( ruleDataAccessLayer )
            {
            // InternalCompras.g:7154:2: ( ruleDataAccessLayer )
            // InternalCompras.g:7155:3: ruleDataAccessLayer
            {
             before(grammarAccess.getArchitectureAccess().getDataAccessLayerDataAccessLayerParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleDataAccessLayer();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getDataAccessLayerDataAccessLayerParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Architecture__DataAccessLayerAssignment_12"


    // $ANTLR start "rule__Architecture__CommonLayerAssignment_15"
    // InternalCompras.g:7164:1: rule__Architecture__CommonLayerAssignment_15 : ( ruleCommonLayer ) ;
    public final void rule__Architecture__CommonLayerAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7168:1: ( ( ruleCommonLayer ) )
            // InternalCompras.g:7169:2: ( ruleCommonLayer )
            {
            // InternalCompras.g:7169:2: ( ruleCommonLayer )
            // InternalCompras.g:7170:3: ruleCommonLayer
            {
             before(grammarAccess.getArchitectureAccess().getCommonLayerCommonLayerParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleCommonLayer();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getCommonLayerCommonLayerParserRuleCall_15_0()); 

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
    // $ANTLR end "rule__Architecture__CommonLayerAssignment_15"


    // $ANTLR start "rule__Architecture__RelationsAssignment_19"
    // InternalCompras.g:7179:1: rule__Architecture__RelationsAssignment_19 : ( ruleRelations ) ;
    public final void rule__Architecture__RelationsAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7183:1: ( ( ruleRelations ) )
            // InternalCompras.g:7184:2: ( ruleRelations )
            {
            // InternalCompras.g:7184:2: ( ruleRelations )
            // InternalCompras.g:7185:3: ruleRelations
            {
             before(grammarAccess.getArchitectureAccess().getRelationsRelationsParserRuleCall_19_0()); 
            pushFollow(FOLLOW_2);
            ruleRelations();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getRelationsRelationsParserRuleCall_19_0()); 

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
    // $ANTLR end "rule__Architecture__RelationsAssignment_19"


    // $ANTLR start "rule__PresentationLayer__NameAssignment_0"
    // InternalCompras.g:7194:1: rule__PresentationLayer__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PresentationLayer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7198:1: ( ( RULE_ID ) )
            // InternalCompras.g:7199:2: ( RULE_ID )
            {
            // InternalCompras.g:7199:2: ( RULE_ID )
            // InternalCompras.g:7200:3: RULE_ID
            {
             before(grammarAccess.getPresentationLayerAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPresentationLayerAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__PresentationLayer__NameAssignment_0"


    // $ANTLR start "rule__PresentationLayer__ControllerSegmentLayerAssignment_5"
    // InternalCompras.g:7209:1: rule__PresentationLayer__ControllerSegmentLayerAssignment_5 : ( ruleControllerSegmentLayer ) ;
    public final void rule__PresentationLayer__ControllerSegmentLayerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7213:1: ( ( ruleControllerSegmentLayer ) )
            // InternalCompras.g:7214:2: ( ruleControllerSegmentLayer )
            {
            // InternalCompras.g:7214:2: ( ruleControllerSegmentLayer )
            // InternalCompras.g:7215:3: ruleControllerSegmentLayer
            {
             before(grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerControllerSegmentLayerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleControllerSegmentLayer();

            state._fsp--;

             after(grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerControllerSegmentLayerParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__PresentationLayer__ControllerSegmentLayerAssignment_5"


    // $ANTLR start "rule__PresentationLayer__ViewSegmentLayerAssignment_8"
    // InternalCompras.g:7224:1: rule__PresentationLayer__ViewSegmentLayerAssignment_8 : ( ruleViewSegmentLayer ) ;
    public final void rule__PresentationLayer__ViewSegmentLayerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7228:1: ( ( ruleViewSegmentLayer ) )
            // InternalCompras.g:7229:2: ( ruleViewSegmentLayer )
            {
            // InternalCompras.g:7229:2: ( ruleViewSegmentLayer )
            // InternalCompras.g:7230:3: ruleViewSegmentLayer
            {
             before(grammarAccess.getPresentationLayerAccess().getViewSegmentLayerViewSegmentLayerParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleViewSegmentLayer();

            state._fsp--;

             after(grammarAccess.getPresentationLayerAccess().getViewSegmentLayerViewSegmentLayerParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__PresentationLayer__ViewSegmentLayerAssignment_8"


    // $ANTLR start "rule__PresentationLayer__ScriptegmentLayerAssignment_11"
    // InternalCompras.g:7239:1: rule__PresentationLayer__ScriptegmentLayerAssignment_11 : ( ruleScriptSegmentLayer ) ;
    public final void rule__PresentationLayer__ScriptegmentLayerAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7243:1: ( ( ruleScriptSegmentLayer ) )
            // InternalCompras.g:7244:2: ( ruleScriptSegmentLayer )
            {
            // InternalCompras.g:7244:2: ( ruleScriptSegmentLayer )
            // InternalCompras.g:7245:3: ruleScriptSegmentLayer
            {
             before(grammarAccess.getPresentationLayerAccess().getScriptegmentLayerScriptSegmentLayerParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleScriptSegmentLayer();

            state._fsp--;

             after(grammarAccess.getPresentationLayerAccess().getScriptegmentLayerScriptSegmentLayerParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__PresentationLayer__ScriptegmentLayerAssignment_11"


    // $ANTLR start "rule__ControllerSegmentLayer__NameAssignment"
    // InternalCompras.g:7254:1: rule__ControllerSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__ControllerSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7258:1: ( ( RULE_ID ) )
            // InternalCompras.g:7259:2: ( RULE_ID )
            {
            // InternalCompras.g:7259:2: ( RULE_ID )
            // InternalCompras.g:7260:3: RULE_ID
            {
             before(grammarAccess.getControllerSegmentLayerAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getControllerSegmentLayerAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ControllerSegmentLayer__NameAssignment"


    // $ANTLR start "rule__ViewSegmentLayer__NameAssignment"
    // InternalCompras.g:7269:1: rule__ViewSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__ViewSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7273:1: ( ( RULE_ID ) )
            // InternalCompras.g:7274:2: ( RULE_ID )
            {
            // InternalCompras.g:7274:2: ( RULE_ID )
            // InternalCompras.g:7275:3: RULE_ID
            {
             before(grammarAccess.getViewSegmentLayerAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getViewSegmentLayerAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ViewSegmentLayer__NameAssignment"


    // $ANTLR start "rule__ScriptSegmentLayer__NameAssignment"
    // InternalCompras.g:7284:1: rule__ScriptSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__ScriptSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7288:1: ( ( RULE_ID ) )
            // InternalCompras.g:7289:2: ( RULE_ID )
            {
            // InternalCompras.g:7289:2: ( RULE_ID )
            // InternalCompras.g:7290:3: RULE_ID
            {
             before(grammarAccess.getScriptSegmentLayerAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScriptSegmentLayerAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ScriptSegmentLayer__NameAssignment"


    // $ANTLR start "rule__BusinessLayer__NameAssignment"
    // InternalCompras.g:7299:1: rule__BusinessLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__BusinessLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7303:1: ( ( RULE_ID ) )
            // InternalCompras.g:7304:2: ( RULE_ID )
            {
            // InternalCompras.g:7304:2: ( RULE_ID )
            // InternalCompras.g:7305:3: RULE_ID
            {
             before(grammarAccess.getBusinessLayerAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBusinessLayerAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__BusinessLayer__NameAssignment"


    // $ANTLR start "rule__DataAccessLayer__NameAssignment_0"
    // InternalCompras.g:7314:1: rule__DataAccessLayer__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DataAccessLayer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7318:1: ( ( RULE_ID ) )
            // InternalCompras.g:7319:2: ( RULE_ID )
            {
            // InternalCompras.g:7319:2: ( RULE_ID )
            // InternalCompras.g:7320:3: RULE_ID
            {
             before(grammarAccess.getDataAccessLayerAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataAccessLayerAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__DataAccessLayer__NameAssignment_0"


    // $ANTLR start "rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5"
    // InternalCompras.g:7329:1: rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 : ( ruleDbConnectorSegmentLayer ) ;
    public final void rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7333:1: ( ( ruleDbConnectorSegmentLayer ) )
            // InternalCompras.g:7334:2: ( ruleDbConnectorSegmentLayer )
            {
            // InternalCompras.g:7334:2: ( ruleDbConnectorSegmentLayer )
            // InternalCompras.g:7335:3: ruleDbConnectorSegmentLayer
            {
             before(grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerDbConnectorSegmentLayerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDbConnectorSegmentLayer();

            state._fsp--;

             after(grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerDbConnectorSegmentLayerParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5"


    // $ANTLR start "rule__DbConnectorSegmentLayer__NameAssignment"
    // InternalCompras.g:7344:1: rule__DbConnectorSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__DbConnectorSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7348:1: ( ( RULE_ID ) )
            // InternalCompras.g:7349:2: ( RULE_ID )
            {
            // InternalCompras.g:7349:2: ( RULE_ID )
            // InternalCompras.g:7350:3: RULE_ID
            {
             before(grammarAccess.getDbConnectorSegmentLayerAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDbConnectorSegmentLayerAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DbConnectorSegmentLayer__NameAssignment"


    // $ANTLR start "rule__CommonLayer__NameAssignment"
    // InternalCompras.g:7359:1: rule__CommonLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__CommonLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7363:1: ( ( RULE_ID ) )
            // InternalCompras.g:7364:2: ( RULE_ID )
            {
            // InternalCompras.g:7364:2: ( RULE_ID )
            // InternalCompras.g:7365:3: RULE_ID
            {
             before(grammarAccess.getCommonLayerAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommonLayerAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__CommonLayer__NameAssignment"


    // $ANTLR start "rule__Relations__SourceLayer1Assignment_1"
    // InternalCompras.g:7374:1: rule__Relations__SourceLayer1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7378:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7379:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7379:2: ( ( RULE_ID ) )
            // InternalCompras.g:7380:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer1PresentationLayerCrossReference_1_0()); 
            // InternalCompras.g:7381:3: ( RULE_ID )
            // InternalCompras.g:7382:4: RULE_ID
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer1PresentationLayerIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getSourceLayer1PresentationLayerIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRelationsAccess().getSourceLayer1PresentationLayerCrossReference_1_0()); 

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
    // $ANTLR end "rule__Relations__SourceLayer1Assignment_1"


    // $ANTLR start "rule__Relations__RelationsType1Assignment_2"
    // InternalCompras.g:7393:1: rule__Relations__RelationsType1Assignment_2 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7397:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7398:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7398:2: ( ruleRelationsType )
            // InternalCompras.g:7399:3: ruleRelationsType
            {
             before(grammarAccess.getRelationsAccess().getRelationsType1RelationsTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationsType();

            state._fsp--;

             after(grammarAccess.getRelationsAccess().getRelationsType1RelationsTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Relations__RelationsType1Assignment_2"


    // $ANTLR start "rule__Relations__TargetLayer1Assignment_3"
    // InternalCompras.g:7408:1: rule__Relations__TargetLayer1Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7412:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7413:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7413:2: ( ( RULE_ID ) )
            // InternalCompras.g:7414:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer1BusinessLayerCrossReference_3_0()); 
            // InternalCompras.g:7415:3: ( RULE_ID )
            // InternalCompras.g:7416:4: RULE_ID
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer1BusinessLayerIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getTargetLayer1BusinessLayerIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRelationsAccess().getTargetLayer1BusinessLayerCrossReference_3_0()); 

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
    // $ANTLR end "rule__Relations__TargetLayer1Assignment_3"


    // $ANTLR start "rule__Relations__SourceLayer2Assignment_4"
    // InternalCompras.g:7427:1: rule__Relations__SourceLayer2Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7431:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7432:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7432:2: ( ( RULE_ID ) )
            // InternalCompras.g:7433:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer2BusinessLayerCrossReference_4_0()); 
            // InternalCompras.g:7434:3: ( RULE_ID )
            // InternalCompras.g:7435:4: RULE_ID
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer2BusinessLayerIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getSourceLayer2BusinessLayerIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRelationsAccess().getSourceLayer2BusinessLayerCrossReference_4_0()); 

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
    // $ANTLR end "rule__Relations__SourceLayer2Assignment_4"


    // $ANTLR start "rule__Relations__RelationsType2Assignment_5"
    // InternalCompras.g:7446:1: rule__Relations__RelationsType2Assignment_5 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7450:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7451:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7451:2: ( ruleRelationsType )
            // InternalCompras.g:7452:3: ruleRelationsType
            {
             before(grammarAccess.getRelationsAccess().getRelationsType2RelationsTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationsType();

            state._fsp--;

             after(grammarAccess.getRelationsAccess().getRelationsType2RelationsTypeEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__Relations__RelationsType2Assignment_5"


    // $ANTLR start "rule__Relations__TargetLayer2Assignment_6"
    // InternalCompras.g:7461:1: rule__Relations__TargetLayer2Assignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7465:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7466:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7466:2: ( ( RULE_ID ) )
            // InternalCompras.g:7467:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer2DataAccessLayerCrossReference_6_0()); 
            // InternalCompras.g:7468:3: ( RULE_ID )
            // InternalCompras.g:7469:4: RULE_ID
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer2DataAccessLayerIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getTargetLayer2DataAccessLayerIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRelationsAccess().getTargetLayer2DataAccessLayerCrossReference_6_0()); 

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
    // $ANTLR end "rule__Relations__TargetLayer2Assignment_6"


    // $ANTLR start "rule__Relations__SourceLayer3Assignment_7"
    // InternalCompras.g:7480:1: rule__Relations__SourceLayer3Assignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer3Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7484:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7485:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7485:2: ( ( RULE_ID ) )
            // InternalCompras.g:7486:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer3DataAccessLayerCrossReference_7_0()); 
            // InternalCompras.g:7487:3: ( RULE_ID )
            // InternalCompras.g:7488:4: RULE_ID
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer3DataAccessLayerIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getSourceLayer3DataAccessLayerIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getRelationsAccess().getSourceLayer3DataAccessLayerCrossReference_7_0()); 

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
    // $ANTLR end "rule__Relations__SourceLayer3Assignment_7"


    // $ANTLR start "rule__Relations__RelationsType3Assignment_8"
    // InternalCompras.g:7499:1: rule__Relations__RelationsType3Assignment_8 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType3Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7503:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7504:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7504:2: ( ruleRelationsType )
            // InternalCompras.g:7505:3: ruleRelationsType
            {
             before(grammarAccess.getRelationsAccess().getRelationsType3RelationsTypeEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationsType();

            state._fsp--;

             after(grammarAccess.getRelationsAccess().getRelationsType3RelationsTypeEnumRuleCall_8_0()); 

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
    // $ANTLR end "rule__Relations__RelationsType3Assignment_8"


    // $ANTLR start "rule__Relations__TargetLayer3Assignment_9"
    // InternalCompras.g:7514:1: rule__Relations__TargetLayer3Assignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer3Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7518:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7519:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7519:2: ( ( RULE_ID ) )
            // InternalCompras.g:7520:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer3CommonLayerCrossReference_9_0()); 
            // InternalCompras.g:7521:3: ( RULE_ID )
            // InternalCompras.g:7522:4: RULE_ID
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer3CommonLayerIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getTargetLayer3CommonLayerIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getRelationsAccess().getTargetLayer3CommonLayerCrossReference_9_0()); 

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
    // $ANTLR end "rule__Relations__TargetLayer3Assignment_9"


    // $ANTLR start "rule__Relations__SourceLayer4Assignment_10"
    // InternalCompras.g:7533:1: rule__Relations__SourceLayer4Assignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer4Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7537:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7538:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7538:2: ( ( RULE_ID ) )
            // InternalCompras.g:7539:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer4PresentationLayerCrossReference_10_0()); 
            // InternalCompras.g:7540:3: ( RULE_ID )
            // InternalCompras.g:7541:4: RULE_ID
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer4PresentationLayerIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getSourceLayer4PresentationLayerIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getRelationsAccess().getSourceLayer4PresentationLayerCrossReference_10_0()); 

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
    // $ANTLR end "rule__Relations__SourceLayer4Assignment_10"


    // $ANTLR start "rule__Relations__RelationsType4Assignment_11"
    // InternalCompras.g:7552:1: rule__Relations__RelationsType4Assignment_11 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType4Assignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7556:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7557:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7557:2: ( ruleRelationsType )
            // InternalCompras.g:7558:3: ruleRelationsType
            {
             before(grammarAccess.getRelationsAccess().getRelationsType4RelationsTypeEnumRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationsType();

            state._fsp--;

             after(grammarAccess.getRelationsAccess().getRelationsType4RelationsTypeEnumRuleCall_11_0()); 

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
    // $ANTLR end "rule__Relations__RelationsType4Assignment_11"


    // $ANTLR start "rule__Relations__TargetLayer4Assignment_12"
    // InternalCompras.g:7567:1: rule__Relations__TargetLayer4Assignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer4Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7571:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7572:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7572:2: ( ( RULE_ID ) )
            // InternalCompras.g:7573:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer4CommonLayerCrossReference_12_0()); 
            // InternalCompras.g:7574:3: ( RULE_ID )
            // InternalCompras.g:7575:4: RULE_ID
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer4CommonLayerIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getTargetLayer4CommonLayerIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getRelationsAccess().getTargetLayer4CommonLayerCrossReference_12_0()); 

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
    // $ANTLR end "rule__Relations__TargetLayer4Assignment_12"


    // $ANTLR start "rule__Relations__SourceLayer5Assignment_13"
    // InternalCompras.g:7586:1: rule__Relations__SourceLayer5Assignment_13 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer5Assignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7590:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7591:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7591:2: ( ( RULE_ID ) )
            // InternalCompras.g:7592:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer5BusinessLayerCrossReference_13_0()); 
            // InternalCompras.g:7593:3: ( RULE_ID )
            // InternalCompras.g:7594:4: RULE_ID
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer5BusinessLayerIDTerminalRuleCall_13_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getSourceLayer5BusinessLayerIDTerminalRuleCall_13_0_1()); 

            }

             after(grammarAccess.getRelationsAccess().getSourceLayer5BusinessLayerCrossReference_13_0()); 

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
    // $ANTLR end "rule__Relations__SourceLayer5Assignment_13"


    // $ANTLR start "rule__Relations__RelationsType5Assignment_14"
    // InternalCompras.g:7605:1: rule__Relations__RelationsType5Assignment_14 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType5Assignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7609:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7610:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7610:2: ( ruleRelationsType )
            // InternalCompras.g:7611:3: ruleRelationsType
            {
             before(grammarAccess.getRelationsAccess().getRelationsType5RelationsTypeEnumRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationsType();

            state._fsp--;

             after(grammarAccess.getRelationsAccess().getRelationsType5RelationsTypeEnumRuleCall_14_0()); 

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
    // $ANTLR end "rule__Relations__RelationsType5Assignment_14"


    // $ANTLR start "rule__Relations__TargetLayer5Assignment_15"
    // InternalCompras.g:7620:1: rule__Relations__TargetLayer5Assignment_15 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer5Assignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7624:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7625:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7625:2: ( ( RULE_ID ) )
            // InternalCompras.g:7626:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer5CommonLayerCrossReference_15_0()); 
            // InternalCompras.g:7627:3: ( RULE_ID )
            // InternalCompras.g:7628:4: RULE_ID
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer5CommonLayerIDTerminalRuleCall_15_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getTargetLayer5CommonLayerIDTerminalRuleCall_15_0_1()); 

            }

             after(grammarAccess.getRelationsAccess().getTargetLayer5CommonLayerCrossReference_15_0()); 

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
    // $ANTLR end "rule__Relations__TargetLayer5Assignment_15"


    // $ANTLR start "rule__Technology__ModuleTechAssignment_1_3"
    // InternalCompras.g:7639:1: rule__Technology__ModuleTechAssignment_1_3 : ( ruleModuleTech ) ;
    public final void rule__Technology__ModuleTechAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7643:1: ( ( ruleModuleTech ) )
            // InternalCompras.g:7644:2: ( ruleModuleTech )
            {
            // InternalCompras.g:7644:2: ( ruleModuleTech )
            // InternalCompras.g:7645:3: ruleModuleTech
            {
             before(grammarAccess.getTechnologyAccess().getModuleTechModuleTechParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModuleTech();

            state._fsp--;

             after(grammarAccess.getTechnologyAccess().getModuleTechModuleTechParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__Technology__ModuleTechAssignment_1_3"


    // $ANTLR start "rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0"
    // InternalCompras.g:7654:1: rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 : ( ( ruleFQN ) ) ;
    public final void rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7658:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7659:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7659:2: ( ( ruleFQN ) )
            // InternalCompras.g:7660:3: ( ruleFQN )
            {
             before(grammarAccess.getTechnologyAccess().getDbConnectorSegmentLayerDbConnectorSegmentLayerCrossReference_2_3_0_0()); 
            // InternalCompras.g:7661:3: ( ruleFQN )
            // InternalCompras.g:7662:4: ruleFQN
            {
             before(grammarAccess.getTechnologyAccess().getDbConnectorSegmentLayerDbConnectorSegmentLayerFQNParserRuleCall_2_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getTechnologyAccess().getDbConnectorSegmentLayerDbConnectorSegmentLayerFQNParserRuleCall_2_3_0_0_1()); 

            }

             after(grammarAccess.getTechnologyAccess().getDbConnectorSegmentLayerDbConnectorSegmentLayerCrossReference_2_3_0_0()); 

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
    // $ANTLR end "rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0"


    // $ANTLR start "rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2"
    // InternalCompras.g:7673:1: rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 : ( ruleDatabaseRDBMSType ) ;
    public final void rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7677:1: ( ( ruleDatabaseRDBMSType ) )
            // InternalCompras.g:7678:2: ( ruleDatabaseRDBMSType )
            {
            // InternalCompras.g:7678:2: ( ruleDatabaseRDBMSType )
            // InternalCompras.g:7679:3: ruleDatabaseRDBMSType
            {
             before(grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeDatabaseRDBMSTypeEnumRuleCall_2_3_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabaseRDBMSType();

            state._fsp--;

             after(grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeDatabaseRDBMSTypeEnumRuleCall_2_3_3_2_0()); 

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
    // $ANTLR end "rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2"


    // $ANTLR start "rule__Technology__ConnectionStringAssignment_2_3_4_2"
    // InternalCompras.g:7688:1: rule__Technology__ConnectionStringAssignment_2_3_4_2 : ( ruleConnectionString ) ;
    public final void rule__Technology__ConnectionStringAssignment_2_3_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7692:1: ( ( ruleConnectionString ) )
            // InternalCompras.g:7693:2: ( ruleConnectionString )
            {
            // InternalCompras.g:7693:2: ( ruleConnectionString )
            // InternalCompras.g:7694:3: ruleConnectionString
            {
             before(grammarAccess.getTechnologyAccess().getConnectionStringConnectionStringParserRuleCall_2_3_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConnectionString();

            state._fsp--;

             after(grammarAccess.getTechnologyAccess().getConnectionStringConnectionStringParserRuleCall_2_3_4_2_0()); 

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
    // $ANTLR end "rule__Technology__ConnectionStringAssignment_2_3_4_2"


    // $ANTLR start "rule__ModuleTech__NameAssignment_2"
    // InternalCompras.g:7703:1: rule__ModuleTech__NameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7707:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7708:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7708:2: ( ( RULE_ID ) )
            // InternalCompras.g:7709:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getNameModuleCrossReference_2_0()); 
            // InternalCompras.g:7710:3: ( RULE_ID )
            // InternalCompras.g:7711:4: RULE_ID
            {
             before(grammarAccess.getModuleTechAccess().getNameModuleIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getNameModuleIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getModuleTechAccess().getNameModuleCrossReference_2_0()); 

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
    // $ANTLR end "rule__ModuleTech__NameAssignment_2"


    // $ANTLR start "rule__ModuleTech__PresentationLayerAssignment_5"
    // InternalCompras.g:7722:1: rule__ModuleTech__PresentationLayerAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__PresentationLayerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7726:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7727:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7727:2: ( ( RULE_ID ) )
            // InternalCompras.g:7728:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getPresentationLayerPresentationLayerCrossReference_5_0()); 
            // InternalCompras.g:7729:3: ( RULE_ID )
            // InternalCompras.g:7730:4: RULE_ID
            {
             before(grammarAccess.getModuleTechAccess().getPresentationLayerPresentationLayerIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getPresentationLayerPresentationLayerIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getModuleTechAccess().getPresentationLayerPresentationLayerCrossReference_5_0()); 

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
    // $ANTLR end "rule__ModuleTech__PresentationLayerAssignment_5"


    // $ANTLR start "rule__ModuleTech__ControllerSegmentLayerAssignment_8_0"
    // InternalCompras.g:7741:1: rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 : ( ( ruleFQN ) ) ;
    public final void rule__ModuleTech__ControllerSegmentLayerAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7745:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7746:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7746:2: ( ( ruleFQN ) )
            // InternalCompras.g:7747:3: ( ruleFQN )
            {
             before(grammarAccess.getModuleTechAccess().getControllerSegmentLayerControllerSegmentLayerCrossReference_8_0_0()); 
            // InternalCompras.g:7748:3: ( ruleFQN )
            // InternalCompras.g:7749:4: ruleFQN
            {
             before(grammarAccess.getModuleTechAccess().getControllerSegmentLayerControllerSegmentLayerFQNParserRuleCall_8_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getModuleTechAccess().getControllerSegmentLayerControllerSegmentLayerFQNParserRuleCall_8_0_0_1()); 

            }

             after(grammarAccess.getModuleTechAccess().getControllerSegmentLayerControllerSegmentLayerCrossReference_8_0_0()); 

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
    // $ANTLR end "rule__ModuleTech__ControllerSegmentLayerAssignment_8_0"


    // $ANTLR start "rule__ModuleTech__ControllersRefAssignment_8_3"
    // InternalCompras.g:7760:1: rule__ModuleTech__ControllersRefAssignment_8_3 : ( ruleControllersRef ) ;
    public final void rule__ModuleTech__ControllersRefAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7764:1: ( ( ruleControllersRef ) )
            // InternalCompras.g:7765:2: ( ruleControllersRef )
            {
            // InternalCompras.g:7765:2: ( ruleControllersRef )
            // InternalCompras.g:7766:3: ruleControllersRef
            {
             before(grammarAccess.getModuleTechAccess().getControllersRefControllersRefParserRuleCall_8_3_0()); 
            pushFollow(FOLLOW_2);
            ruleControllersRef();

            state._fsp--;

             after(grammarAccess.getModuleTechAccess().getControllersRefControllersRefParserRuleCall_8_3_0()); 

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
    // $ANTLR end "rule__ModuleTech__ControllersRefAssignment_8_3"


    // $ANTLR start "rule__ModuleTech__ViewSegmentLayerAssignment_9_0"
    // InternalCompras.g:7775:1: rule__ModuleTech__ViewSegmentLayerAssignment_9_0 : ( ( ruleFQN ) ) ;
    public final void rule__ModuleTech__ViewSegmentLayerAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7779:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7780:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7780:2: ( ( ruleFQN ) )
            // InternalCompras.g:7781:3: ( ruleFQN )
            {
             before(grammarAccess.getModuleTechAccess().getViewSegmentLayerViewSegmentLayerCrossReference_9_0_0()); 
            // InternalCompras.g:7782:3: ( ruleFQN )
            // InternalCompras.g:7783:4: ruleFQN
            {
             before(grammarAccess.getModuleTechAccess().getViewSegmentLayerViewSegmentLayerFQNParserRuleCall_9_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getModuleTechAccess().getViewSegmentLayerViewSegmentLayerFQNParserRuleCall_9_0_0_1()); 

            }

             after(grammarAccess.getModuleTechAccess().getViewSegmentLayerViewSegmentLayerCrossReference_9_0_0()); 

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
    // $ANTLR end "rule__ModuleTech__ViewSegmentLayerAssignment_9_0"


    // $ANTLR start "rule__ModuleTech__ViewsRefAssignment_9_3"
    // InternalCompras.g:7794:1: rule__ModuleTech__ViewsRefAssignment_9_3 : ( ruleViewsRef ) ;
    public final void rule__ModuleTech__ViewsRefAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7798:1: ( ( ruleViewsRef ) )
            // InternalCompras.g:7799:2: ( ruleViewsRef )
            {
            // InternalCompras.g:7799:2: ( ruleViewsRef )
            // InternalCompras.g:7800:3: ruleViewsRef
            {
             before(grammarAccess.getModuleTechAccess().getViewsRefViewsRefParserRuleCall_9_3_0()); 
            pushFollow(FOLLOW_2);
            ruleViewsRef();

            state._fsp--;

             after(grammarAccess.getModuleTechAccess().getViewsRefViewsRefParserRuleCall_9_3_0()); 

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
    // $ANTLR end "rule__ModuleTech__ViewsRefAssignment_9_3"


    // $ANTLR start "rule__ModuleTech__ScriptSegmentLayerAssignment_10_0"
    // InternalCompras.g:7809:1: rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 : ( ( ruleFQN ) ) ;
    public final void rule__ModuleTech__ScriptSegmentLayerAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7813:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7814:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7814:2: ( ( ruleFQN ) )
            // InternalCompras.g:7815:3: ( ruleFQN )
            {
             before(grammarAccess.getModuleTechAccess().getScriptSegmentLayerScriptSegmentLayerCrossReference_10_0_0()); 
            // InternalCompras.g:7816:3: ( ruleFQN )
            // InternalCompras.g:7817:4: ruleFQN
            {
             before(grammarAccess.getModuleTechAccess().getScriptSegmentLayerScriptSegmentLayerFQNParserRuleCall_10_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getModuleTechAccess().getScriptSegmentLayerScriptSegmentLayerFQNParserRuleCall_10_0_0_1()); 

            }

             after(grammarAccess.getModuleTechAccess().getScriptSegmentLayerScriptSegmentLayerCrossReference_10_0_0()); 

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
    // $ANTLR end "rule__ModuleTech__ScriptSegmentLayerAssignment_10_0"


    // $ANTLR start "rule__ModuleTech__ScriptRefAssignment_10_3"
    // InternalCompras.g:7828:1: rule__ModuleTech__ScriptRefAssignment_10_3 : ( ruleScriptRef ) ;
    public final void rule__ModuleTech__ScriptRefAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7832:1: ( ( ruleScriptRef ) )
            // InternalCompras.g:7833:2: ( ruleScriptRef )
            {
            // InternalCompras.g:7833:2: ( ruleScriptRef )
            // InternalCompras.g:7834:3: ruleScriptRef
            {
             before(grammarAccess.getModuleTechAccess().getScriptRefScriptRefParserRuleCall_10_3_0()); 
            pushFollow(FOLLOW_2);
            ruleScriptRef();

            state._fsp--;

             after(grammarAccess.getModuleTechAccess().getScriptRefScriptRefParserRuleCall_10_3_0()); 

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
    // $ANTLR end "rule__ModuleTech__ScriptRefAssignment_10_3"


    // $ANTLR start "rule__ModuleTech__BusinessLayerAssignment_12"
    // InternalCompras.g:7843:1: rule__ModuleTech__BusinessLayerAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__BusinessLayerAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7847:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7848:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7848:2: ( ( RULE_ID ) )
            // InternalCompras.g:7849:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getBusinessLayerBusinessLayerCrossReference_12_0()); 
            // InternalCompras.g:7850:3: ( RULE_ID )
            // InternalCompras.g:7851:4: RULE_ID
            {
             before(grammarAccess.getModuleTechAccess().getBusinessLayerBusinessLayerIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getBusinessLayerBusinessLayerIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getModuleTechAccess().getBusinessLayerBusinessLayerCrossReference_12_0()); 

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
    // $ANTLR end "rule__ModuleTech__BusinessLayerAssignment_12"


    // $ANTLR start "rule__ModuleTech__BusinessLayerRefAssignment_15"
    // InternalCompras.g:7862:1: rule__ModuleTech__BusinessLayerRefAssignment_15 : ( ruleBusinessLayerRef ) ;
    public final void rule__ModuleTech__BusinessLayerRefAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7866:1: ( ( ruleBusinessLayerRef ) )
            // InternalCompras.g:7867:2: ( ruleBusinessLayerRef )
            {
            // InternalCompras.g:7867:2: ( ruleBusinessLayerRef )
            // InternalCompras.g:7868:3: ruleBusinessLayerRef
            {
             before(grammarAccess.getModuleTechAccess().getBusinessLayerRefBusinessLayerRefParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessLayerRef();

            state._fsp--;

             after(grammarAccess.getModuleTechAccess().getBusinessLayerRefBusinessLayerRefParserRuleCall_15_0()); 

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
    // $ANTLR end "rule__ModuleTech__BusinessLayerRefAssignment_15"


    // $ANTLR start "rule__ModuleTech__DataAccessLayerAssignment_17"
    // InternalCompras.g:7877:1: rule__ModuleTech__DataAccessLayerAssignment_17 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__DataAccessLayerAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7881:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7882:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7882:2: ( ( RULE_ID ) )
            // InternalCompras.g:7883:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getDataAccessLayerDataAccessLayerCrossReference_17_0()); 
            // InternalCompras.g:7884:3: ( RULE_ID )
            // InternalCompras.g:7885:4: RULE_ID
            {
             before(grammarAccess.getModuleTechAccess().getDataAccessLayerDataAccessLayerIDTerminalRuleCall_17_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getDataAccessLayerDataAccessLayerIDTerminalRuleCall_17_0_1()); 

            }

             after(grammarAccess.getModuleTechAccess().getDataAccessLayerDataAccessLayerCrossReference_17_0()); 

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
    // $ANTLR end "rule__ModuleTech__DataAccessLayerAssignment_17"


    // $ANTLR start "rule__ModuleTech__DataAccessLayerRefAssignment_20"
    // InternalCompras.g:7896:1: rule__ModuleTech__DataAccessLayerRefAssignment_20 : ( ruleDataAccessLayerRef ) ;
    public final void rule__ModuleTech__DataAccessLayerRefAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7900:1: ( ( ruleDataAccessLayerRef ) )
            // InternalCompras.g:7901:2: ( ruleDataAccessLayerRef )
            {
            // InternalCompras.g:7901:2: ( ruleDataAccessLayerRef )
            // InternalCompras.g:7902:3: ruleDataAccessLayerRef
            {
             before(grammarAccess.getModuleTechAccess().getDataAccessLayerRefDataAccessLayerRefParserRuleCall_20_0()); 
            pushFollow(FOLLOW_2);
            ruleDataAccessLayerRef();

            state._fsp--;

             after(grammarAccess.getModuleTechAccess().getDataAccessLayerRefDataAccessLayerRefParserRuleCall_20_0()); 

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
    // $ANTLR end "rule__ModuleTech__DataAccessLayerRefAssignment_20"


    // $ANTLR start "rule__ModuleTech__CommonLayerAssignment_22"
    // InternalCompras.g:7911:1: rule__ModuleTech__CommonLayerAssignment_22 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__CommonLayerAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7915:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7916:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7916:2: ( ( RULE_ID ) )
            // InternalCompras.g:7917:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getCommonLayerCommonLayerCrossReference_22_0()); 
            // InternalCompras.g:7918:3: ( RULE_ID )
            // InternalCompras.g:7919:4: RULE_ID
            {
             before(grammarAccess.getModuleTechAccess().getCommonLayerCommonLayerIDTerminalRuleCall_22_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleTechAccess().getCommonLayerCommonLayerIDTerminalRuleCall_22_0_1()); 

            }

             after(grammarAccess.getModuleTechAccess().getCommonLayerCommonLayerCrossReference_22_0()); 

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
    // $ANTLR end "rule__ModuleTech__CommonLayerAssignment_22"


    // $ANTLR start "rule__ModuleTech__CommonLayerRefAssignment_25"
    // InternalCompras.g:7930:1: rule__ModuleTech__CommonLayerRefAssignment_25 : ( ruleCommonLayerRef ) ;
    public final void rule__ModuleTech__CommonLayerRefAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7934:1: ( ( ruleCommonLayerRef ) )
            // InternalCompras.g:7935:2: ( ruleCommonLayerRef )
            {
            // InternalCompras.g:7935:2: ( ruleCommonLayerRef )
            // InternalCompras.g:7936:3: ruleCommonLayerRef
            {
             before(grammarAccess.getModuleTechAccess().getCommonLayerRefCommonLayerRefParserRuleCall_25_0()); 
            pushFollow(FOLLOW_2);
            ruleCommonLayerRef();

            state._fsp--;

             after(grammarAccess.getModuleTechAccess().getCommonLayerRefCommonLayerRefParserRuleCall_25_0()); 

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
    // $ANTLR end "rule__ModuleTech__CommonLayerRefAssignment_25"


    // $ANTLR start "rule__ControllersRef__FunctionalityAssignment_2"
    // InternalCompras.g:7945:1: rule__ControllersRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ControllersRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7949:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7950:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7950:2: ( ( ruleFQN ) )
            // InternalCompras.g:7951:3: ( ruleFQN )
            {
             before(grammarAccess.getControllersRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:7952:3: ( ruleFQN )
            // InternalCompras.g:7953:4: ruleFQN
            {
             before(grammarAccess.getControllersRefAccess().getFunctionalityFunctionalityFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getControllersRefAccess().getFunctionalityFunctionalityFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getControllersRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 

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
    // $ANTLR end "rule__ControllersRef__FunctionalityAssignment_2"


    // $ANTLR start "rule__ViewsRef__FunctionalityAssignment_2"
    // InternalCompras.g:7964:1: rule__ViewsRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ViewsRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7968:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7969:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7969:2: ( ( ruleFQN ) )
            // InternalCompras.g:7970:3: ( ruleFQN )
            {
             before(grammarAccess.getViewsRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:7971:3: ( ruleFQN )
            // InternalCompras.g:7972:4: ruleFQN
            {
             before(grammarAccess.getViewsRefAccess().getFunctionalityFunctionalityFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getViewsRefAccess().getFunctionalityFunctionalityFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getViewsRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 

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
    // $ANTLR end "rule__ViewsRef__FunctionalityAssignment_2"


    // $ANTLR start "rule__ScriptRef__FunctionalityAssignment_2"
    // InternalCompras.g:7983:1: rule__ScriptRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ScriptRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7987:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7988:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7988:2: ( ( ruleFQN ) )
            // InternalCompras.g:7989:3: ( ruleFQN )
            {
             before(grammarAccess.getScriptRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:7990:3: ( ruleFQN )
            // InternalCompras.g:7991:4: ruleFQN
            {
             before(grammarAccess.getScriptRefAccess().getFunctionalityFunctionalityFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getScriptRefAccess().getFunctionalityFunctionalityFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getScriptRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 

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
    // $ANTLR end "rule__ScriptRef__FunctionalityAssignment_2"


    // $ANTLR start "rule__BusinessLayerRef__FunctionalityAssignment_2"
    // InternalCompras.g:8002:1: rule__BusinessLayerRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__BusinessLayerRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:8006:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:8007:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:8007:2: ( ( ruleFQN ) )
            // InternalCompras.g:8008:3: ( ruleFQN )
            {
             before(grammarAccess.getBusinessLayerRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:8009:3: ( ruleFQN )
            // InternalCompras.g:8010:4: ruleFQN
            {
             before(grammarAccess.getBusinessLayerRefAccess().getFunctionalityFunctionalityFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getBusinessLayerRefAccess().getFunctionalityFunctionalityFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBusinessLayerRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 

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
    // $ANTLR end "rule__BusinessLayerRef__FunctionalityAssignment_2"


    // $ANTLR start "rule__DataAccessLayerRef__FunctionalityAssignment_2"
    // InternalCompras.g:8021:1: rule__DataAccessLayerRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__DataAccessLayerRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:8025:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:8026:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:8026:2: ( ( ruleFQN ) )
            // InternalCompras.g:8027:3: ( ruleFQN )
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:8028:3: ( ruleFQN )
            // InternalCompras.g:8029:4: ruleFQN
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getFunctionalityFunctionalityFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDataAccessLayerRefAccess().getFunctionalityFunctionalityFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDataAccessLayerRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 

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
    // $ANTLR end "rule__DataAccessLayerRef__FunctionalityAssignment_2"


    // $ANTLR start "rule__CommonLayerRef__EntityAssignment_2"
    // InternalCompras.g:8040:1: rule__CommonLayerRef__EntityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__CommonLayerRef__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:8044:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:8045:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:8045:2: ( ( ruleFQN ) )
            // InternalCompras.g:8046:3: ( ruleFQN )
            {
             before(grammarAccess.getCommonLayerRefAccess().getEntityEntityCrossReference_2_0()); 
            // InternalCompras.g:8047:3: ( ruleFQN )
            // InternalCompras.g:8048:4: ruleFQN
            {
             before(grammarAccess.getCommonLayerRefAccess().getEntityEntityFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCommonLayerRefAccess().getEntityEntityFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCommonLayerRefAccess().getEntityEntityCrossReference_2_0()); 

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
    // $ANTLR end "rule__CommonLayerRef__EntityAssignment_2"

    // Delegated rules


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\5\1\25\1\uffff\1\5\1\26\1\25\1\32\1\uffff";
    static final String dfa_3s = "\1\32\1\33\1\uffff\1\5\1\26\1\33\1\63\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\4\uffff\1\1";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\24\uffff\1\2",
            "\1\4\5\uffff\1\3",
            "",
            "\1\5",
            "\1\6",
            "\1\4\5\uffff\1\3",
            "\1\7\26\uffff\1\7\2\2",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "5285:2: ( rule__ModuleTech__Group_8__0 )?";
        }
    }
    static final String[] dfa_7s = {
            "\1\1\24\uffff\1\2",
            "\1\4\5\uffff\1\3",
            "",
            "\1\5",
            "\1\6",
            "\1\4\5\uffff\1\3",
            "\1\7\27\uffff\1\7\1\2",
            ""
    };
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5312:2: ( rule__ModuleTech__Group_9__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000008401F020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000008001F022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000008001F020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1F00000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1F00000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000600004000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001800004000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000004000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000004000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000004000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000004000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004000004000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0008000004000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0008000000000002L});

}