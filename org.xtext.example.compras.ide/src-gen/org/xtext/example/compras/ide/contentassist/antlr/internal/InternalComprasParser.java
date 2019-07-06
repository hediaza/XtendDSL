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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AllowedToUse'", "'string'", "'int'", "'bool'", "'float'", "'datetime'", "'SQLSERVER'", "'ORACLE (future...)'", "'POSTGRES (future...)'", "'SolutionName'", "':'", "'{'", "'Domain'", "'Architecture'", "'Technology'", "'}'", "'.'", "'Module'", "'Entities'", "'Functionalities'", "'['", "'label'", "']'", "'RelEntity'", "'Layers'", "'PresentationLayer'", "'BusinessLayer'", "'DataAccessLayer'", "'CommonLayer'", "'Relations'", "'ControllerSegmentLayer'", "'ViewSegmentLayer'", "'ScriptSegmentLayer'", "'DbConnectorSegmentLayer'", "'AspNet'", "'Database'", "'DatabaseRDBMSType'", "'ConnectionString'", "'DataFileSeed'", "'Controller'", "'View'", "'Script'", "'BLogic'", "'DataAccess'", "'DtoModel'", "'required'", "'CREATE'", "'VIEW_GRID'", "'VIEW_DROPDOWN'", "'EDIT'", "'DELETE'"
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
    public static final int T__61=61;
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


    // $ANTLR start "entryRuleDataFileSeed"
    // InternalCompras.g:928:1: entryRuleDataFileSeed : ruleDataFileSeed EOF ;
    public final void entryRuleDataFileSeed() throws RecognitionException {
        try {
            // InternalCompras.g:929:1: ( ruleDataFileSeed EOF )
            // InternalCompras.g:930:1: ruleDataFileSeed EOF
            {
             before(grammarAccess.getDataFileSeedRule()); 
            pushFollow(FOLLOW_1);
            ruleDataFileSeed();

            state._fsp--;

             after(grammarAccess.getDataFileSeedRule()); 
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
    // $ANTLR end "entryRuleDataFileSeed"


    // $ANTLR start "ruleDataFileSeed"
    // InternalCompras.g:937:1: ruleDataFileSeed : ( RULE_STRING ) ;
    public final void ruleDataFileSeed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:941:2: ( ( RULE_STRING ) )
            // InternalCompras.g:942:2: ( RULE_STRING )
            {
            // InternalCompras.g:942:2: ( RULE_STRING )
            // InternalCompras.g:943:3: RULE_STRING
            {
             before(grammarAccess.getDataFileSeedAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataFileSeedAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataFileSeed"


    // $ANTLR start "ruleCommonFieldType"
    // InternalCompras.g:953:1: ruleCommonFieldType : ( ( rule__CommonFieldType__Alternatives ) ) ;
    public final void ruleCommonFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:957:1: ( ( ( rule__CommonFieldType__Alternatives ) ) )
            // InternalCompras.g:958:2: ( ( rule__CommonFieldType__Alternatives ) )
            {
            // InternalCompras.g:958:2: ( ( rule__CommonFieldType__Alternatives ) )
            // InternalCompras.g:959:3: ( rule__CommonFieldType__Alternatives )
            {
             before(grammarAccess.getCommonFieldTypeAccess().getAlternatives()); 
            // InternalCompras.g:960:3: ( rule__CommonFieldType__Alternatives )
            // InternalCompras.g:960:4: rule__CommonFieldType__Alternatives
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
    // InternalCompras.g:969:1: ruleRelationsType : ( ( 'AllowedToUse' ) ) ;
    public final void ruleRelationsType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:973:1: ( ( ( 'AllowedToUse' ) ) )
            // InternalCompras.g:974:2: ( ( 'AllowedToUse' ) )
            {
            // InternalCompras.g:974:2: ( ( 'AllowedToUse' ) )
            // InternalCompras.g:975:3: ( 'AllowedToUse' )
            {
             before(grammarAccess.getRelationsTypeAccess().getALLOWED_TO_USEEnumLiteralDeclaration()); 
            // InternalCompras.g:976:3: ( 'AllowedToUse' )
            // InternalCompras.g:976:4: 'AllowedToUse'
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
    // InternalCompras.g:985:1: ruleDatabaseRDBMSType : ( ( rule__DatabaseRDBMSType__Alternatives ) ) ;
    public final void ruleDatabaseRDBMSType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:989:1: ( ( ( rule__DatabaseRDBMSType__Alternatives ) ) )
            // InternalCompras.g:990:2: ( ( rule__DatabaseRDBMSType__Alternatives ) )
            {
            // InternalCompras.g:990:2: ( ( rule__DatabaseRDBMSType__Alternatives ) )
            // InternalCompras.g:991:3: ( rule__DatabaseRDBMSType__Alternatives )
            {
             before(grammarAccess.getDatabaseRDBMSTypeAccess().getAlternatives()); 
            // InternalCompras.g:992:3: ( rule__DatabaseRDBMSType__Alternatives )
            // InternalCompras.g:992:4: rule__DatabaseRDBMSType__Alternatives
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
    // InternalCompras.g:1000:1: rule__EntityType__Alternatives : ( ( ( rule__EntityType__EntityAssignment_0 ) ) | ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) ) );
    public final void rule__EntityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1004:1: ( ( ( rule__EntityType__EntityAssignment_0 ) ) | ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) ) )
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
                    // InternalCompras.g:1005:2: ( ( rule__EntityType__EntityAssignment_0 ) )
                    {
                    // InternalCompras.g:1005:2: ( ( rule__EntityType__EntityAssignment_0 ) )
                    // InternalCompras.g:1006:3: ( rule__EntityType__EntityAssignment_0 )
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityAssignment_0()); 
                    // InternalCompras.g:1007:3: ( rule__EntityType__EntityAssignment_0 )
                    // InternalCompras.g:1007:4: rule__EntityType__EntityAssignment_0
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
                    // InternalCompras.g:1011:2: ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) )
                    {
                    // InternalCompras.g:1011:2: ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) )
                    // InternalCompras.g:1012:3: ( rule__EntityType__CommonFieldTypeAssignment_1 )
                    {
                     before(grammarAccess.getEntityTypeAccess().getCommonFieldTypeAssignment_1()); 
                    // InternalCompras.g:1013:3: ( rule__EntityType__CommonFieldTypeAssignment_1 )
                    // InternalCompras.g:1013:4: rule__EntityType__CommonFieldTypeAssignment_1
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
    // InternalCompras.g:1021:1: rule__FunctionalityActionType__Alternatives : ( ( ruleFuncCreateAction ) | ( ruleFuncViewGridAction ) | ( ruleFuncViewDropDownAction ) | ( ruleFuncEditAction ) | ( ruleFuncDeleteAction ) );
    public final void rule__FunctionalityActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1025:1: ( ( ruleFuncCreateAction ) | ( ruleFuncViewGridAction ) | ( ruleFuncViewDropDownAction ) | ( ruleFuncEditAction ) | ( ruleFuncDeleteAction ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt2=1;
                }
                break;
            case 58:
                {
                alt2=2;
                }
                break;
            case 59:
                {
                alt2=3;
                }
                break;
            case 60:
                {
                alt2=4;
                }
                break;
            case 61:
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
                    // InternalCompras.g:1026:2: ( ruleFuncCreateAction )
                    {
                    // InternalCompras.g:1026:2: ( ruleFuncCreateAction )
                    // InternalCompras.g:1027:3: ruleFuncCreateAction
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
                    // InternalCompras.g:1032:2: ( ruleFuncViewGridAction )
                    {
                    // InternalCompras.g:1032:2: ( ruleFuncViewGridAction )
                    // InternalCompras.g:1033:3: ruleFuncViewGridAction
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
                    // InternalCompras.g:1038:2: ( ruleFuncViewDropDownAction )
                    {
                    // InternalCompras.g:1038:2: ( ruleFuncViewDropDownAction )
                    // InternalCompras.g:1039:3: ruleFuncViewDropDownAction
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
                    // InternalCompras.g:1044:2: ( ruleFuncEditAction )
                    {
                    // InternalCompras.g:1044:2: ( ruleFuncEditAction )
                    // InternalCompras.g:1045:3: ruleFuncEditAction
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
                    // InternalCompras.g:1050:2: ( ruleFuncDeleteAction )
                    {
                    // InternalCompras.g:1050:2: ( ruleFuncDeleteAction )
                    // InternalCompras.g:1051:3: ruleFuncDeleteAction
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
    // InternalCompras.g:1060:1: rule__CommonFieldType__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'bool' ) ) | ( ( 'float' ) ) | ( ( 'datetime' ) ) );
    public final void rule__CommonFieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1064:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'bool' ) ) | ( ( 'float' ) ) | ( ( 'datetime' ) ) )
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
                    // InternalCompras.g:1065:2: ( ( 'string' ) )
                    {
                    // InternalCompras.g:1065:2: ( ( 'string' ) )
                    // InternalCompras.g:1066:3: ( 'string' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalCompras.g:1067:3: ( 'string' )
                    // InternalCompras.g:1067:4: 'string'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:1071:2: ( ( 'int' ) )
                    {
                    // InternalCompras.g:1071:2: ( ( 'int' ) )
                    // InternalCompras.g:1072:3: ( 'int' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalCompras.g:1073:3: ( 'int' )
                    // InternalCompras.g:1073:4: 'int'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:1077:2: ( ( 'bool' ) )
                    {
                    // InternalCompras.g:1077:2: ( ( 'bool' ) )
                    // InternalCompras.g:1078:3: ( 'bool' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getBOOLEnumLiteralDeclaration_2()); 
                    // InternalCompras.g:1079:3: ( 'bool' )
                    // InternalCompras.g:1079:4: 'bool'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getBOOLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCompras.g:1083:2: ( ( 'float' ) )
                    {
                    // InternalCompras.g:1083:2: ( ( 'float' ) )
                    // InternalCompras.g:1084:3: ( 'float' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getFLOATEnumLiteralDeclaration_3()); 
                    // InternalCompras.g:1085:3: ( 'float' )
                    // InternalCompras.g:1085:4: 'float'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getFLOATEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCompras.g:1089:2: ( ( 'datetime' ) )
                    {
                    // InternalCompras.g:1089:2: ( ( 'datetime' ) )
                    // InternalCompras.g:1090:3: ( 'datetime' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getDATEEnumLiteralDeclaration_4()); 
                    // InternalCompras.g:1091:3: ( 'datetime' )
                    // InternalCompras.g:1091:4: 'datetime'
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
    // InternalCompras.g:1099:1: rule__DatabaseRDBMSType__Alternatives : ( ( ( 'SQLSERVER' ) ) | ( ( 'ORACLE (future...)' ) ) | ( ( 'POSTGRES (future...)' ) ) );
    public final void rule__DatabaseRDBMSType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1103:1: ( ( ( 'SQLSERVER' ) ) | ( ( 'ORACLE (future...)' ) ) | ( ( 'POSTGRES (future...)' ) ) )
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
                    // InternalCompras.g:1104:2: ( ( 'SQLSERVER' ) )
                    {
                    // InternalCompras.g:1104:2: ( ( 'SQLSERVER' ) )
                    // InternalCompras.g:1105:3: ( 'SQLSERVER' )
                    {
                     before(grammarAccess.getDatabaseRDBMSTypeAccess().getSQLSERVEREnumLiteralDeclaration_0()); 
                    // InternalCompras.g:1106:3: ( 'SQLSERVER' )
                    // InternalCompras.g:1106:4: 'SQLSERVER'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseRDBMSTypeAccess().getSQLSERVEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:1110:2: ( ( 'ORACLE (future...)' ) )
                    {
                    // InternalCompras.g:1110:2: ( ( 'ORACLE (future...)' ) )
                    // InternalCompras.g:1111:3: ( 'ORACLE (future...)' )
                    {
                     before(grammarAccess.getDatabaseRDBMSTypeAccess().getORACLEEnumLiteralDeclaration_1()); 
                    // InternalCompras.g:1112:3: ( 'ORACLE (future...)' )
                    // InternalCompras.g:1112:4: 'ORACLE (future...)'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseRDBMSTypeAccess().getORACLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:1116:2: ( ( 'POSTGRES (future...)' ) )
                    {
                    // InternalCompras.g:1116:2: ( ( 'POSTGRES (future...)' ) )
                    // InternalCompras.g:1117:3: ( 'POSTGRES (future...)' )
                    {
                     before(grammarAccess.getDatabaseRDBMSTypeAccess().getPOSTGRESEnumLiteralDeclaration_2()); 
                    // InternalCompras.g:1118:3: ( 'POSTGRES (future...)' )
                    // InternalCompras.g:1118:4: 'POSTGRES (future...)'
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
    // InternalCompras.g:1126:1: rule__Solution__Group__0 : rule__Solution__Group__0__Impl rule__Solution__Group__1 ;
    public final void rule__Solution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1130:1: ( rule__Solution__Group__0__Impl rule__Solution__Group__1 )
            // InternalCompras.g:1131:2: rule__Solution__Group__0__Impl rule__Solution__Group__1
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
    // InternalCompras.g:1138:1: rule__Solution__Group__0__Impl : ( 'SolutionName' ) ;
    public final void rule__Solution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1142:1: ( ( 'SolutionName' ) )
            // InternalCompras.g:1143:1: ( 'SolutionName' )
            {
            // InternalCompras.g:1143:1: ( 'SolutionName' )
            // InternalCompras.g:1144:2: 'SolutionName'
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
    // InternalCompras.g:1153:1: rule__Solution__Group__1 : rule__Solution__Group__1__Impl rule__Solution__Group__2 ;
    public final void rule__Solution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1157:1: ( rule__Solution__Group__1__Impl rule__Solution__Group__2 )
            // InternalCompras.g:1158:2: rule__Solution__Group__1__Impl rule__Solution__Group__2
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
    // InternalCompras.g:1165:1: rule__Solution__Group__1__Impl : ( ':' ) ;
    public final void rule__Solution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1169:1: ( ( ':' ) )
            // InternalCompras.g:1170:1: ( ':' )
            {
            // InternalCompras.g:1170:1: ( ':' )
            // InternalCompras.g:1171:2: ':'
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
    // InternalCompras.g:1180:1: rule__Solution__Group__2 : rule__Solution__Group__2__Impl rule__Solution__Group__3 ;
    public final void rule__Solution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1184:1: ( rule__Solution__Group__2__Impl rule__Solution__Group__3 )
            // InternalCompras.g:1185:2: rule__Solution__Group__2__Impl rule__Solution__Group__3
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
    // InternalCompras.g:1192:1: rule__Solution__Group__2__Impl : ( ( rule__Solution__NameAssignment_2 ) ) ;
    public final void rule__Solution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1196:1: ( ( ( rule__Solution__NameAssignment_2 ) ) )
            // InternalCompras.g:1197:1: ( ( rule__Solution__NameAssignment_2 ) )
            {
            // InternalCompras.g:1197:1: ( ( rule__Solution__NameAssignment_2 ) )
            // InternalCompras.g:1198:2: ( rule__Solution__NameAssignment_2 )
            {
             before(grammarAccess.getSolutionAccess().getNameAssignment_2()); 
            // InternalCompras.g:1199:2: ( rule__Solution__NameAssignment_2 )
            // InternalCompras.g:1199:3: rule__Solution__NameAssignment_2
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
    // InternalCompras.g:1207:1: rule__Solution__Group__3 : rule__Solution__Group__3__Impl rule__Solution__Group__4 ;
    public final void rule__Solution__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1211:1: ( rule__Solution__Group__3__Impl rule__Solution__Group__4 )
            // InternalCompras.g:1212:2: rule__Solution__Group__3__Impl rule__Solution__Group__4
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
    // InternalCompras.g:1219:1: rule__Solution__Group__3__Impl : ( '{' ) ;
    public final void rule__Solution__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1223:1: ( ( '{' ) )
            // InternalCompras.g:1224:1: ( '{' )
            {
            // InternalCompras.g:1224:1: ( '{' )
            // InternalCompras.g:1225:2: '{'
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
    // InternalCompras.g:1234:1: rule__Solution__Group__4 : rule__Solution__Group__4__Impl rule__Solution__Group__5 ;
    public final void rule__Solution__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1238:1: ( rule__Solution__Group__4__Impl rule__Solution__Group__5 )
            // InternalCompras.g:1239:2: rule__Solution__Group__4__Impl rule__Solution__Group__5
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
    // InternalCompras.g:1246:1: rule__Solution__Group__4__Impl : ( 'Domain' ) ;
    public final void rule__Solution__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1250:1: ( ( 'Domain' ) )
            // InternalCompras.g:1251:1: ( 'Domain' )
            {
            // InternalCompras.g:1251:1: ( 'Domain' )
            // InternalCompras.g:1252:2: 'Domain'
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
    // InternalCompras.g:1261:1: rule__Solution__Group__5 : rule__Solution__Group__5__Impl rule__Solution__Group__6 ;
    public final void rule__Solution__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1265:1: ( rule__Solution__Group__5__Impl rule__Solution__Group__6 )
            // InternalCompras.g:1266:2: rule__Solution__Group__5__Impl rule__Solution__Group__6
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
    // InternalCompras.g:1273:1: rule__Solution__Group__5__Impl : ( ':' ) ;
    public final void rule__Solution__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1277:1: ( ( ':' ) )
            // InternalCompras.g:1278:1: ( ':' )
            {
            // InternalCompras.g:1278:1: ( ':' )
            // InternalCompras.g:1279:2: ':'
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
    // InternalCompras.g:1288:1: rule__Solution__Group__6 : rule__Solution__Group__6__Impl rule__Solution__Group__7 ;
    public final void rule__Solution__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1292:1: ( rule__Solution__Group__6__Impl rule__Solution__Group__7 )
            // InternalCompras.g:1293:2: rule__Solution__Group__6__Impl rule__Solution__Group__7
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
    // InternalCompras.g:1300:1: rule__Solution__Group__6__Impl : ( ( rule__Solution__DomainAssignment_6 )? ) ;
    public final void rule__Solution__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1304:1: ( ( ( rule__Solution__DomainAssignment_6 )? ) )
            // InternalCompras.g:1305:1: ( ( rule__Solution__DomainAssignment_6 )? )
            {
            // InternalCompras.g:1305:1: ( ( rule__Solution__DomainAssignment_6 )? )
            // InternalCompras.g:1306:2: ( rule__Solution__DomainAssignment_6 )?
            {
             before(grammarAccess.getSolutionAccess().getDomainAssignment_6()); 
            // InternalCompras.g:1307:2: ( rule__Solution__DomainAssignment_6 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCompras.g:1307:3: rule__Solution__DomainAssignment_6
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
    // InternalCompras.g:1315:1: rule__Solution__Group__7 : rule__Solution__Group__7__Impl rule__Solution__Group__8 ;
    public final void rule__Solution__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1319:1: ( rule__Solution__Group__7__Impl rule__Solution__Group__8 )
            // InternalCompras.g:1320:2: rule__Solution__Group__7__Impl rule__Solution__Group__8
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
    // InternalCompras.g:1327:1: rule__Solution__Group__7__Impl : ( 'Architecture' ) ;
    public final void rule__Solution__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1331:1: ( ( 'Architecture' ) )
            // InternalCompras.g:1332:1: ( 'Architecture' )
            {
            // InternalCompras.g:1332:1: ( 'Architecture' )
            // InternalCompras.g:1333:2: 'Architecture'
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
    // InternalCompras.g:1342:1: rule__Solution__Group__8 : rule__Solution__Group__8__Impl rule__Solution__Group__9 ;
    public final void rule__Solution__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1346:1: ( rule__Solution__Group__8__Impl rule__Solution__Group__9 )
            // InternalCompras.g:1347:2: rule__Solution__Group__8__Impl rule__Solution__Group__9
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
    // InternalCompras.g:1354:1: rule__Solution__Group__8__Impl : ( ':' ) ;
    public final void rule__Solution__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1358:1: ( ( ':' ) )
            // InternalCompras.g:1359:1: ( ':' )
            {
            // InternalCompras.g:1359:1: ( ':' )
            // InternalCompras.g:1360:2: ':'
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
    // InternalCompras.g:1369:1: rule__Solution__Group__9 : rule__Solution__Group__9__Impl rule__Solution__Group__10 ;
    public final void rule__Solution__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1373:1: ( rule__Solution__Group__9__Impl rule__Solution__Group__10 )
            // InternalCompras.g:1374:2: rule__Solution__Group__9__Impl rule__Solution__Group__10
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
    // InternalCompras.g:1381:1: rule__Solution__Group__9__Impl : ( ( rule__Solution__ArchitectureAssignment_9 )? ) ;
    public final void rule__Solution__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1385:1: ( ( ( rule__Solution__ArchitectureAssignment_9 )? ) )
            // InternalCompras.g:1386:1: ( ( rule__Solution__ArchitectureAssignment_9 )? )
            {
            // InternalCompras.g:1386:1: ( ( rule__Solution__ArchitectureAssignment_9 )? )
            // InternalCompras.g:1387:2: ( rule__Solution__ArchitectureAssignment_9 )?
            {
             before(grammarAccess.getSolutionAccess().getArchitectureAssignment_9()); 
            // InternalCompras.g:1388:2: ( rule__Solution__ArchitectureAssignment_9 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCompras.g:1388:3: rule__Solution__ArchitectureAssignment_9
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
    // InternalCompras.g:1396:1: rule__Solution__Group__10 : rule__Solution__Group__10__Impl rule__Solution__Group__11 ;
    public final void rule__Solution__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1400:1: ( rule__Solution__Group__10__Impl rule__Solution__Group__11 )
            // InternalCompras.g:1401:2: rule__Solution__Group__10__Impl rule__Solution__Group__11
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
    // InternalCompras.g:1408:1: rule__Solution__Group__10__Impl : ( 'Technology' ) ;
    public final void rule__Solution__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1412:1: ( ( 'Technology' ) )
            // InternalCompras.g:1413:1: ( 'Technology' )
            {
            // InternalCompras.g:1413:1: ( 'Technology' )
            // InternalCompras.g:1414:2: 'Technology'
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
    // InternalCompras.g:1423:1: rule__Solution__Group__11 : rule__Solution__Group__11__Impl rule__Solution__Group__12 ;
    public final void rule__Solution__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1427:1: ( rule__Solution__Group__11__Impl rule__Solution__Group__12 )
            // InternalCompras.g:1428:2: rule__Solution__Group__11__Impl rule__Solution__Group__12
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
    // InternalCompras.g:1435:1: rule__Solution__Group__11__Impl : ( ':' ) ;
    public final void rule__Solution__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1439:1: ( ( ':' ) )
            // InternalCompras.g:1440:1: ( ':' )
            {
            // InternalCompras.g:1440:1: ( ':' )
            // InternalCompras.g:1441:2: ':'
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
    // InternalCompras.g:1450:1: rule__Solution__Group__12 : rule__Solution__Group__12__Impl rule__Solution__Group__13 ;
    public final void rule__Solution__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1454:1: ( rule__Solution__Group__12__Impl rule__Solution__Group__13 )
            // InternalCompras.g:1455:2: rule__Solution__Group__12__Impl rule__Solution__Group__13
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
    // InternalCompras.g:1462:1: rule__Solution__Group__12__Impl : ( ( rule__Solution__TechnologyAssignment_12 )? ) ;
    public final void rule__Solution__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1466:1: ( ( ( rule__Solution__TechnologyAssignment_12 )? ) )
            // InternalCompras.g:1467:1: ( ( rule__Solution__TechnologyAssignment_12 )? )
            {
            // InternalCompras.g:1467:1: ( ( rule__Solution__TechnologyAssignment_12 )? )
            // InternalCompras.g:1468:2: ( rule__Solution__TechnologyAssignment_12 )?
            {
             before(grammarAccess.getSolutionAccess().getTechnologyAssignment_12()); 
            // InternalCompras.g:1469:2: ( rule__Solution__TechnologyAssignment_12 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCompras.g:1469:3: rule__Solution__TechnologyAssignment_12
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
    // InternalCompras.g:1477:1: rule__Solution__Group__13 : rule__Solution__Group__13__Impl ;
    public final void rule__Solution__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1481:1: ( rule__Solution__Group__13__Impl )
            // InternalCompras.g:1482:2: rule__Solution__Group__13__Impl
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
    // InternalCompras.g:1488:1: rule__Solution__Group__13__Impl : ( '}' ) ;
    public final void rule__Solution__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1492:1: ( ( '}' ) )
            // InternalCompras.g:1493:1: ( '}' )
            {
            // InternalCompras.g:1493:1: ( '}' )
            // InternalCompras.g:1494:2: '}'
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
    // InternalCompras.g:1504:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1508:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCompras.g:1509:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalCompras.g:1516:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1520:1: ( ( RULE_ID ) )
            // InternalCompras.g:1521:1: ( RULE_ID )
            {
            // InternalCompras.g:1521:1: ( RULE_ID )
            // InternalCompras.g:1522:2: RULE_ID
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
    // InternalCompras.g:1531:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1535:1: ( rule__FQN__Group__1__Impl )
            // InternalCompras.g:1536:2: rule__FQN__Group__1__Impl
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
    // InternalCompras.g:1542:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1546:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCompras.g:1547:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCompras.g:1547:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCompras.g:1548:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCompras.g:1549:2: ( rule__FQN__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCompras.g:1549:3: rule__FQN__Group_1__0
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
    // InternalCompras.g:1558:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1562:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCompras.g:1563:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalCompras.g:1570:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1574:1: ( ( '.' ) )
            // InternalCompras.g:1575:1: ( '.' )
            {
            // InternalCompras.g:1575:1: ( '.' )
            // InternalCompras.g:1576:2: '.'
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
    // InternalCompras.g:1585:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1589:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCompras.g:1590:2: rule__FQN__Group_1__1__Impl
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
    // InternalCompras.g:1596:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1600:1: ( ( RULE_ID ) )
            // InternalCompras.g:1601:1: ( RULE_ID )
            {
            // InternalCompras.g:1601:1: ( RULE_ID )
            // InternalCompras.g:1602:2: RULE_ID
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
    // InternalCompras.g:1612:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1616:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalCompras.g:1617:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalCompras.g:1624:1: rule__Domain__Group__0__Impl : ( '{' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1628:1: ( ( '{' ) )
            // InternalCompras.g:1629:1: ( '{' )
            {
            // InternalCompras.g:1629:1: ( '{' )
            // InternalCompras.g:1630:2: '{'
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
    // InternalCompras.g:1639:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1643:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalCompras.g:1644:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
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
    // InternalCompras.g:1651:1: rule__Domain__Group__1__Impl : ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1655:1: ( ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) ) )
            // InternalCompras.g:1656:1: ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) )
            {
            // InternalCompras.g:1656:1: ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) )
            // InternalCompras.g:1657:2: ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* )
            {
            // InternalCompras.g:1657:2: ( ( rule__Domain__ModuleAssignment_1 ) )
            // InternalCompras.g:1658:3: ( rule__Domain__ModuleAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getModuleAssignment_1()); 
            // InternalCompras.g:1659:3: ( rule__Domain__ModuleAssignment_1 )
            // InternalCompras.g:1659:4: rule__Domain__ModuleAssignment_1
            {
            pushFollow(FOLLOW_14);
            rule__Domain__ModuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getModuleAssignment_1()); 

            }

            // InternalCompras.g:1662:2: ( ( rule__Domain__ModuleAssignment_1 )* )
            // InternalCompras.g:1663:3: ( rule__Domain__ModuleAssignment_1 )*
            {
             before(grammarAccess.getDomainAccess().getModuleAssignment_1()); 
            // InternalCompras.g:1664:3: ( rule__Domain__ModuleAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCompras.g:1664:4: rule__Domain__ModuleAssignment_1
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
    // InternalCompras.g:1673:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1677:1: ( rule__Domain__Group__2__Impl )
            // InternalCompras.g:1678:2: rule__Domain__Group__2__Impl
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
    // InternalCompras.g:1684:1: rule__Domain__Group__2__Impl : ( '}' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1688:1: ( ( '}' ) )
            // InternalCompras.g:1689:1: ( '}' )
            {
            // InternalCompras.g:1689:1: ( '}' )
            // InternalCompras.g:1690:2: '}'
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
    // InternalCompras.g:1700:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1704:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalCompras.g:1705:2: rule__Module__Group__0__Impl rule__Module__Group__1
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
    // InternalCompras.g:1712:1: rule__Module__Group__0__Impl : ( 'Module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1716:1: ( ( 'Module' ) )
            // InternalCompras.g:1717:1: ( 'Module' )
            {
            // InternalCompras.g:1717:1: ( 'Module' )
            // InternalCompras.g:1718:2: 'Module'
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
    // InternalCompras.g:1727:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1731:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalCompras.g:1732:2: rule__Module__Group__1__Impl rule__Module__Group__2
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
    // InternalCompras.g:1739:1: rule__Module__Group__1__Impl : ( ':' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1743:1: ( ( ':' ) )
            // InternalCompras.g:1744:1: ( ':' )
            {
            // InternalCompras.g:1744:1: ( ':' )
            // InternalCompras.g:1745:2: ':'
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
    // InternalCompras.g:1754:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1758:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalCompras.g:1759:2: rule__Module__Group__2__Impl rule__Module__Group__3
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
    // InternalCompras.g:1766:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1770:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // InternalCompras.g:1771:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // InternalCompras.g:1771:1: ( ( rule__Module__NameAssignment_2 ) )
            // InternalCompras.g:1772:2: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // InternalCompras.g:1773:2: ( rule__Module__NameAssignment_2 )
            // InternalCompras.g:1773:3: rule__Module__NameAssignment_2
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
    // InternalCompras.g:1781:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1785:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalCompras.g:1786:2: rule__Module__Group__3__Impl rule__Module__Group__4
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
    // InternalCompras.g:1793:1: rule__Module__Group__3__Impl : ( ':' ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1797:1: ( ( ':' ) )
            // InternalCompras.g:1798:1: ( ':' )
            {
            // InternalCompras.g:1798:1: ( ':' )
            // InternalCompras.g:1799:2: ':'
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
    // InternalCompras.g:1808:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1812:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // InternalCompras.g:1813:2: rule__Module__Group__4__Impl rule__Module__Group__5
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
    // InternalCompras.g:1820:1: rule__Module__Group__4__Impl : ( '{' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1824:1: ( ( '{' ) )
            // InternalCompras.g:1825:1: ( '{' )
            {
            // InternalCompras.g:1825:1: ( '{' )
            // InternalCompras.g:1826:2: '{'
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
    // InternalCompras.g:1835:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1839:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // InternalCompras.g:1840:2: rule__Module__Group__5__Impl rule__Module__Group__6
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
    // InternalCompras.g:1847:1: rule__Module__Group__5__Impl : ( 'Entities' ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1851:1: ( ( 'Entities' ) )
            // InternalCompras.g:1852:1: ( 'Entities' )
            {
            // InternalCompras.g:1852:1: ( 'Entities' )
            // InternalCompras.g:1853:2: 'Entities'
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
    // InternalCompras.g:1862:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1866:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // InternalCompras.g:1867:2: rule__Module__Group__6__Impl rule__Module__Group__7
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
    // InternalCompras.g:1874:1: rule__Module__Group__6__Impl : ( ':' ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1878:1: ( ( ':' ) )
            // InternalCompras.g:1879:1: ( ':' )
            {
            // InternalCompras.g:1879:1: ( ':' )
            // InternalCompras.g:1880:2: ':'
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
    // InternalCompras.g:1889:1: rule__Module__Group__7 : rule__Module__Group__7__Impl rule__Module__Group__8 ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1893:1: ( rule__Module__Group__7__Impl rule__Module__Group__8 )
            // InternalCompras.g:1894:2: rule__Module__Group__7__Impl rule__Module__Group__8
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
    // InternalCompras.g:1901:1: rule__Module__Group__7__Impl : ( '{' ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1905:1: ( ( '{' ) )
            // InternalCompras.g:1906:1: ( '{' )
            {
            // InternalCompras.g:1906:1: ( '{' )
            // InternalCompras.g:1907:2: '{'
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
    // InternalCompras.g:1916:1: rule__Module__Group__8 : rule__Module__Group__8__Impl rule__Module__Group__9 ;
    public final void rule__Module__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1920:1: ( rule__Module__Group__8__Impl rule__Module__Group__9 )
            // InternalCompras.g:1921:2: rule__Module__Group__8__Impl rule__Module__Group__9
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
    // InternalCompras.g:1928:1: rule__Module__Group__8__Impl : ( ( rule__Module__EntityAssignment_8 )* ) ;
    public final void rule__Module__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1932:1: ( ( ( rule__Module__EntityAssignment_8 )* ) )
            // InternalCompras.g:1933:1: ( ( rule__Module__EntityAssignment_8 )* )
            {
            // InternalCompras.g:1933:1: ( ( rule__Module__EntityAssignment_8 )* )
            // InternalCompras.g:1934:2: ( rule__Module__EntityAssignment_8 )*
            {
             before(grammarAccess.getModuleAccess().getEntityAssignment_8()); 
            // InternalCompras.g:1935:2: ( rule__Module__EntityAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCompras.g:1935:3: rule__Module__EntityAssignment_8
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
    // InternalCompras.g:1943:1: rule__Module__Group__9 : rule__Module__Group__9__Impl rule__Module__Group__10 ;
    public final void rule__Module__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1947:1: ( rule__Module__Group__9__Impl rule__Module__Group__10 )
            // InternalCompras.g:1948:2: rule__Module__Group__9__Impl rule__Module__Group__10
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
    // InternalCompras.g:1955:1: rule__Module__Group__9__Impl : ( '}' ) ;
    public final void rule__Module__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1959:1: ( ( '}' ) )
            // InternalCompras.g:1960:1: ( '}' )
            {
            // InternalCompras.g:1960:1: ( '}' )
            // InternalCompras.g:1961:2: '}'
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
    // InternalCompras.g:1970:1: rule__Module__Group__10 : rule__Module__Group__10__Impl rule__Module__Group__11 ;
    public final void rule__Module__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1974:1: ( rule__Module__Group__10__Impl rule__Module__Group__11 )
            // InternalCompras.g:1975:2: rule__Module__Group__10__Impl rule__Module__Group__11
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
    // InternalCompras.g:1982:1: rule__Module__Group__10__Impl : ( ( rule__Module__Group_10__0 )? ) ;
    public final void rule__Module__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1986:1: ( ( ( rule__Module__Group_10__0 )? ) )
            // InternalCompras.g:1987:1: ( ( rule__Module__Group_10__0 )? )
            {
            // InternalCompras.g:1987:1: ( ( rule__Module__Group_10__0 )? )
            // InternalCompras.g:1988:2: ( rule__Module__Group_10__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_10()); 
            // InternalCompras.g:1989:2: ( rule__Module__Group_10__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCompras.g:1989:3: rule__Module__Group_10__0
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
    // InternalCompras.g:1997:1: rule__Module__Group__11 : rule__Module__Group__11__Impl ;
    public final void rule__Module__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2001:1: ( rule__Module__Group__11__Impl )
            // InternalCompras.g:2002:2: rule__Module__Group__11__Impl
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
    // InternalCompras.g:2008:1: rule__Module__Group__11__Impl : ( '}' ) ;
    public final void rule__Module__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2012:1: ( ( '}' ) )
            // InternalCompras.g:2013:1: ( '}' )
            {
            // InternalCompras.g:2013:1: ( '}' )
            // InternalCompras.g:2014:2: '}'
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
    // InternalCompras.g:2024:1: rule__Module__Group_10__0 : rule__Module__Group_10__0__Impl rule__Module__Group_10__1 ;
    public final void rule__Module__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2028:1: ( rule__Module__Group_10__0__Impl rule__Module__Group_10__1 )
            // InternalCompras.g:2029:2: rule__Module__Group_10__0__Impl rule__Module__Group_10__1
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
    // InternalCompras.g:2036:1: rule__Module__Group_10__0__Impl : ( 'Functionalities' ) ;
    public final void rule__Module__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2040:1: ( ( 'Functionalities' ) )
            // InternalCompras.g:2041:1: ( 'Functionalities' )
            {
            // InternalCompras.g:2041:1: ( 'Functionalities' )
            // InternalCompras.g:2042:2: 'Functionalities'
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
    // InternalCompras.g:2051:1: rule__Module__Group_10__1 : rule__Module__Group_10__1__Impl rule__Module__Group_10__2 ;
    public final void rule__Module__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2055:1: ( rule__Module__Group_10__1__Impl rule__Module__Group_10__2 )
            // InternalCompras.g:2056:2: rule__Module__Group_10__1__Impl rule__Module__Group_10__2
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
    // InternalCompras.g:2063:1: rule__Module__Group_10__1__Impl : ( ':' ) ;
    public final void rule__Module__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2067:1: ( ( ':' ) )
            // InternalCompras.g:2068:1: ( ':' )
            {
            // InternalCompras.g:2068:1: ( ':' )
            // InternalCompras.g:2069:2: ':'
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
    // InternalCompras.g:2078:1: rule__Module__Group_10__2 : rule__Module__Group_10__2__Impl rule__Module__Group_10__3 ;
    public final void rule__Module__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2082:1: ( rule__Module__Group_10__2__Impl rule__Module__Group_10__3 )
            // InternalCompras.g:2083:2: rule__Module__Group_10__2__Impl rule__Module__Group_10__3
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
    // InternalCompras.g:2090:1: rule__Module__Group_10__2__Impl : ( '{' ) ;
    public final void rule__Module__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2094:1: ( ( '{' ) )
            // InternalCompras.g:2095:1: ( '{' )
            {
            // InternalCompras.g:2095:1: ( '{' )
            // InternalCompras.g:2096:2: '{'
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
    // InternalCompras.g:2105:1: rule__Module__Group_10__3 : rule__Module__Group_10__3__Impl rule__Module__Group_10__4 ;
    public final void rule__Module__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2109:1: ( rule__Module__Group_10__3__Impl rule__Module__Group_10__4 )
            // InternalCompras.g:2110:2: rule__Module__Group_10__3__Impl rule__Module__Group_10__4
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
    // InternalCompras.g:2117:1: rule__Module__Group_10__3__Impl : ( ( rule__Module__FunctionalityAssignment_10_3 )* ) ;
    public final void rule__Module__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2121:1: ( ( ( rule__Module__FunctionalityAssignment_10_3 )* ) )
            // InternalCompras.g:2122:1: ( ( rule__Module__FunctionalityAssignment_10_3 )* )
            {
            // InternalCompras.g:2122:1: ( ( rule__Module__FunctionalityAssignment_10_3 )* )
            // InternalCompras.g:2123:2: ( rule__Module__FunctionalityAssignment_10_3 )*
            {
             before(grammarAccess.getModuleAccess().getFunctionalityAssignment_10_3()); 
            // InternalCompras.g:2124:2: ( rule__Module__FunctionalityAssignment_10_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCompras.g:2124:3: rule__Module__FunctionalityAssignment_10_3
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
    // InternalCompras.g:2132:1: rule__Module__Group_10__4 : rule__Module__Group_10__4__Impl ;
    public final void rule__Module__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2136:1: ( rule__Module__Group_10__4__Impl )
            // InternalCompras.g:2137:2: rule__Module__Group_10__4__Impl
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
    // InternalCompras.g:2143:1: rule__Module__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Module__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2147:1: ( ( '}' ) )
            // InternalCompras.g:2148:1: ( '}' )
            {
            // InternalCompras.g:2148:1: ( '}' )
            // InternalCompras.g:2149:2: '}'
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
    // InternalCompras.g:2159:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2163:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalCompras.g:2164:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalCompras.g:2171:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2175:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // InternalCompras.g:2176:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // InternalCompras.g:2176:1: ( ( rule__Entity__NameAssignment_0 ) )
            // InternalCompras.g:2177:2: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // InternalCompras.g:2178:2: ( rule__Entity__NameAssignment_0 )
            // InternalCompras.g:2178:3: rule__Entity__NameAssignment_0
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
    // InternalCompras.g:2186:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2190:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalCompras.g:2191:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalCompras.g:2198:1: rule__Entity__Group__1__Impl : ( ':' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2202:1: ( ( ':' ) )
            // InternalCompras.g:2203:1: ( ':' )
            {
            // InternalCompras.g:2203:1: ( ':' )
            // InternalCompras.g:2204:2: ':'
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
    // InternalCompras.g:2213:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2217:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalCompras.g:2218:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalCompras.g:2225:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2229:1: ( ( '{' ) )
            // InternalCompras.g:2230:1: ( '{' )
            {
            // InternalCompras.g:2230:1: ( '{' )
            // InternalCompras.g:2231:2: '{'
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
    // InternalCompras.g:2240:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2244:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalCompras.g:2245:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalCompras.g:2252:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__EntityFieldAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2256:1: ( ( ( rule__Entity__EntityFieldAssignment_3 )* ) )
            // InternalCompras.g:2257:1: ( ( rule__Entity__EntityFieldAssignment_3 )* )
            {
            // InternalCompras.g:2257:1: ( ( rule__Entity__EntityFieldAssignment_3 )* )
            // InternalCompras.g:2258:2: ( rule__Entity__EntityFieldAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getEntityFieldAssignment_3()); 
            // InternalCompras.g:2259:2: ( rule__Entity__EntityFieldAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=12 && LA13_0<=16)||LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCompras.g:2259:3: rule__Entity__EntityFieldAssignment_3
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
    // InternalCompras.g:2267:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2271:1: ( rule__Entity__Group__4__Impl )
            // InternalCompras.g:2272:2: rule__Entity__Group__4__Impl
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
    // InternalCompras.g:2278:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2282:1: ( ( '}' ) )
            // InternalCompras.g:2283:1: ( '}' )
            {
            // InternalCompras.g:2283:1: ( '}' )
            // InternalCompras.g:2284:2: '}'
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
    // InternalCompras.g:2294:1: rule__EntityField__Group__0 : rule__EntityField__Group__0__Impl rule__EntityField__Group__1 ;
    public final void rule__EntityField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2298:1: ( rule__EntityField__Group__0__Impl rule__EntityField__Group__1 )
            // InternalCompras.g:2299:2: rule__EntityField__Group__0__Impl rule__EntityField__Group__1
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
    // InternalCompras.g:2306:1: rule__EntityField__Group__0__Impl : ( ( rule__EntityField__EntityFieldRequiredAssignment_0 )? ) ;
    public final void rule__EntityField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2310:1: ( ( ( rule__EntityField__EntityFieldRequiredAssignment_0 )? ) )
            // InternalCompras.g:2311:1: ( ( rule__EntityField__EntityFieldRequiredAssignment_0 )? )
            {
            // InternalCompras.g:2311:1: ( ( rule__EntityField__EntityFieldRequiredAssignment_0 )? )
            // InternalCompras.g:2312:2: ( rule__EntityField__EntityFieldRequiredAssignment_0 )?
            {
             before(grammarAccess.getEntityFieldAccess().getEntityFieldRequiredAssignment_0()); 
            // InternalCompras.g:2313:2: ( rule__EntityField__EntityFieldRequiredAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==56) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalCompras.g:2313:3: rule__EntityField__EntityFieldRequiredAssignment_0
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
    // InternalCompras.g:2321:1: rule__EntityField__Group__1 : rule__EntityField__Group__1__Impl rule__EntityField__Group__2 ;
    public final void rule__EntityField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2325:1: ( rule__EntityField__Group__1__Impl rule__EntityField__Group__2 )
            // InternalCompras.g:2326:2: rule__EntityField__Group__1__Impl rule__EntityField__Group__2
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
    // InternalCompras.g:2333:1: rule__EntityField__Group__1__Impl : ( ( rule__EntityField__EntityFieldLabelAssignment_1 )? ) ;
    public final void rule__EntityField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2337:1: ( ( ( rule__EntityField__EntityFieldLabelAssignment_1 )? ) )
            // InternalCompras.g:2338:1: ( ( rule__EntityField__EntityFieldLabelAssignment_1 )? )
            {
            // InternalCompras.g:2338:1: ( ( rule__EntityField__EntityFieldLabelAssignment_1 )? )
            // InternalCompras.g:2339:2: ( rule__EntityField__EntityFieldLabelAssignment_1 )?
            {
             before(grammarAccess.getEntityFieldAccess().getEntityFieldLabelAssignment_1()); 
            // InternalCompras.g:2340:2: ( rule__EntityField__EntityFieldLabelAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCompras.g:2340:3: rule__EntityField__EntityFieldLabelAssignment_1
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
    // InternalCompras.g:2348:1: rule__EntityField__Group__2 : rule__EntityField__Group__2__Impl rule__EntityField__Group__3 ;
    public final void rule__EntityField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2352:1: ( rule__EntityField__Group__2__Impl rule__EntityField__Group__3 )
            // InternalCompras.g:2353:2: rule__EntityField__Group__2__Impl rule__EntityField__Group__3
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
    // InternalCompras.g:2360:1: rule__EntityField__Group__2__Impl : ( ( rule__EntityField__EntityTypeAssignment_2 ) ) ;
    public final void rule__EntityField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2364:1: ( ( ( rule__EntityField__EntityTypeAssignment_2 ) ) )
            // InternalCompras.g:2365:1: ( ( rule__EntityField__EntityTypeAssignment_2 ) )
            {
            // InternalCompras.g:2365:1: ( ( rule__EntityField__EntityTypeAssignment_2 ) )
            // InternalCompras.g:2366:2: ( rule__EntityField__EntityTypeAssignment_2 )
            {
             before(grammarAccess.getEntityFieldAccess().getEntityTypeAssignment_2()); 
            // InternalCompras.g:2367:2: ( rule__EntityField__EntityTypeAssignment_2 )
            // InternalCompras.g:2367:3: rule__EntityField__EntityTypeAssignment_2
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
    // InternalCompras.g:2375:1: rule__EntityField__Group__3 : rule__EntityField__Group__3__Impl ;
    public final void rule__EntityField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2379:1: ( rule__EntityField__Group__3__Impl )
            // InternalCompras.g:2380:2: rule__EntityField__Group__3__Impl
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
    // InternalCompras.g:2386:1: rule__EntityField__Group__3__Impl : ( ( rule__EntityField__NameAssignment_3 ) ) ;
    public final void rule__EntityField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2390:1: ( ( ( rule__EntityField__NameAssignment_3 ) ) )
            // InternalCompras.g:2391:1: ( ( rule__EntityField__NameAssignment_3 ) )
            {
            // InternalCompras.g:2391:1: ( ( rule__EntityField__NameAssignment_3 ) )
            // InternalCompras.g:2392:2: ( rule__EntityField__NameAssignment_3 )
            {
             before(grammarAccess.getEntityFieldAccess().getNameAssignment_3()); 
            // InternalCompras.g:2393:2: ( rule__EntityField__NameAssignment_3 )
            // InternalCompras.g:2393:3: rule__EntityField__NameAssignment_3
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
    // InternalCompras.g:2402:1: rule__EntityFieldLabel__Group__0 : rule__EntityFieldLabel__Group__0__Impl rule__EntityFieldLabel__Group__1 ;
    public final void rule__EntityFieldLabel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2406:1: ( rule__EntityFieldLabel__Group__0__Impl rule__EntityFieldLabel__Group__1 )
            // InternalCompras.g:2407:2: rule__EntityFieldLabel__Group__0__Impl rule__EntityFieldLabel__Group__1
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
    // InternalCompras.g:2414:1: rule__EntityFieldLabel__Group__0__Impl : ( '[' ) ;
    public final void rule__EntityFieldLabel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2418:1: ( ( '[' ) )
            // InternalCompras.g:2419:1: ( '[' )
            {
            // InternalCompras.g:2419:1: ( '[' )
            // InternalCompras.g:2420:2: '['
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
    // InternalCompras.g:2429:1: rule__EntityFieldLabel__Group__1 : rule__EntityFieldLabel__Group__1__Impl rule__EntityFieldLabel__Group__2 ;
    public final void rule__EntityFieldLabel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2433:1: ( rule__EntityFieldLabel__Group__1__Impl rule__EntityFieldLabel__Group__2 )
            // InternalCompras.g:2434:2: rule__EntityFieldLabel__Group__1__Impl rule__EntityFieldLabel__Group__2
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
    // InternalCompras.g:2441:1: rule__EntityFieldLabel__Group__1__Impl : ( 'label' ) ;
    public final void rule__EntityFieldLabel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2445:1: ( ( 'label' ) )
            // InternalCompras.g:2446:1: ( 'label' )
            {
            // InternalCompras.g:2446:1: ( 'label' )
            // InternalCompras.g:2447:2: 'label'
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
    // InternalCompras.g:2456:1: rule__EntityFieldLabel__Group__2 : rule__EntityFieldLabel__Group__2__Impl rule__EntityFieldLabel__Group__3 ;
    public final void rule__EntityFieldLabel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2460:1: ( rule__EntityFieldLabel__Group__2__Impl rule__EntityFieldLabel__Group__3 )
            // InternalCompras.g:2461:2: rule__EntityFieldLabel__Group__2__Impl rule__EntityFieldLabel__Group__3
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
    // InternalCompras.g:2468:1: rule__EntityFieldLabel__Group__2__Impl : ( ':' ) ;
    public final void rule__EntityFieldLabel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2472:1: ( ( ':' ) )
            // InternalCompras.g:2473:1: ( ':' )
            {
            // InternalCompras.g:2473:1: ( ':' )
            // InternalCompras.g:2474:2: ':'
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
    // InternalCompras.g:2483:1: rule__EntityFieldLabel__Group__3 : rule__EntityFieldLabel__Group__3__Impl rule__EntityFieldLabel__Group__4 ;
    public final void rule__EntityFieldLabel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2487:1: ( rule__EntityFieldLabel__Group__3__Impl rule__EntityFieldLabel__Group__4 )
            // InternalCompras.g:2488:2: rule__EntityFieldLabel__Group__3__Impl rule__EntityFieldLabel__Group__4
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
    // InternalCompras.g:2495:1: rule__EntityFieldLabel__Group__3__Impl : ( ( rule__EntityFieldLabel__NameAssignment_3 ) ) ;
    public final void rule__EntityFieldLabel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2499:1: ( ( ( rule__EntityFieldLabel__NameAssignment_3 ) ) )
            // InternalCompras.g:2500:1: ( ( rule__EntityFieldLabel__NameAssignment_3 ) )
            {
            // InternalCompras.g:2500:1: ( ( rule__EntityFieldLabel__NameAssignment_3 ) )
            // InternalCompras.g:2501:2: ( rule__EntityFieldLabel__NameAssignment_3 )
            {
             before(grammarAccess.getEntityFieldLabelAccess().getNameAssignment_3()); 
            // InternalCompras.g:2502:2: ( rule__EntityFieldLabel__NameAssignment_3 )
            // InternalCompras.g:2502:3: rule__EntityFieldLabel__NameAssignment_3
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
    // InternalCompras.g:2510:1: rule__EntityFieldLabel__Group__4 : rule__EntityFieldLabel__Group__4__Impl ;
    public final void rule__EntityFieldLabel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2514:1: ( rule__EntityFieldLabel__Group__4__Impl )
            // InternalCompras.g:2515:2: rule__EntityFieldLabel__Group__4__Impl
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
    // InternalCompras.g:2521:1: rule__EntityFieldLabel__Group__4__Impl : ( ']' ) ;
    public final void rule__EntityFieldLabel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2525:1: ( ( ']' ) )
            // InternalCompras.g:2526:1: ( ']' )
            {
            // InternalCompras.g:2526:1: ( ']' )
            // InternalCompras.g:2527:2: ']'
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
    // InternalCompras.g:2537:1: rule__EntityFieldRequired__Group__0 : rule__EntityFieldRequired__Group__0__Impl rule__EntityFieldRequired__Group__1 ;
    public final void rule__EntityFieldRequired__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2541:1: ( rule__EntityFieldRequired__Group__0__Impl rule__EntityFieldRequired__Group__1 )
            // InternalCompras.g:2542:2: rule__EntityFieldRequired__Group__0__Impl rule__EntityFieldRequired__Group__1
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
    // InternalCompras.g:2549:1: rule__EntityFieldRequired__Group__0__Impl : ( '[' ) ;
    public final void rule__EntityFieldRequired__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2553:1: ( ( '[' ) )
            // InternalCompras.g:2554:1: ( '[' )
            {
            // InternalCompras.g:2554:1: ( '[' )
            // InternalCompras.g:2555:2: '['
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
    // InternalCompras.g:2564:1: rule__EntityFieldRequired__Group__1 : rule__EntityFieldRequired__Group__1__Impl rule__EntityFieldRequired__Group__2 ;
    public final void rule__EntityFieldRequired__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2568:1: ( rule__EntityFieldRequired__Group__1__Impl rule__EntityFieldRequired__Group__2 )
            // InternalCompras.g:2569:2: rule__EntityFieldRequired__Group__1__Impl rule__EntityFieldRequired__Group__2
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
    // InternalCompras.g:2576:1: rule__EntityFieldRequired__Group__1__Impl : ( ( rule__EntityFieldRequired__NameAssignment_1 ) ) ;
    public final void rule__EntityFieldRequired__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2580:1: ( ( ( rule__EntityFieldRequired__NameAssignment_1 ) ) )
            // InternalCompras.g:2581:1: ( ( rule__EntityFieldRequired__NameAssignment_1 ) )
            {
            // InternalCompras.g:2581:1: ( ( rule__EntityFieldRequired__NameAssignment_1 ) )
            // InternalCompras.g:2582:2: ( rule__EntityFieldRequired__NameAssignment_1 )
            {
             before(grammarAccess.getEntityFieldRequiredAccess().getNameAssignment_1()); 
            // InternalCompras.g:2583:2: ( rule__EntityFieldRequired__NameAssignment_1 )
            // InternalCompras.g:2583:3: rule__EntityFieldRequired__NameAssignment_1
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
    // InternalCompras.g:2591:1: rule__EntityFieldRequired__Group__2 : rule__EntityFieldRequired__Group__2__Impl ;
    public final void rule__EntityFieldRequired__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2595:1: ( rule__EntityFieldRequired__Group__2__Impl )
            // InternalCompras.g:2596:2: rule__EntityFieldRequired__Group__2__Impl
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
    // InternalCompras.g:2602:1: rule__EntityFieldRequired__Group__2__Impl : ( ']' ) ;
    public final void rule__EntityFieldRequired__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2606:1: ( ( ']' ) )
            // InternalCompras.g:2607:1: ( ']' )
            {
            // InternalCompras.g:2607:1: ( ']' )
            // InternalCompras.g:2608:2: ']'
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
    // InternalCompras.g:2618:1: rule__Functionality__Group__0 : rule__Functionality__Group__0__Impl rule__Functionality__Group__1 ;
    public final void rule__Functionality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2622:1: ( rule__Functionality__Group__0__Impl rule__Functionality__Group__1 )
            // InternalCompras.g:2623:2: rule__Functionality__Group__0__Impl rule__Functionality__Group__1
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
    // InternalCompras.g:2630:1: rule__Functionality__Group__0__Impl : ( ( rule__Functionality__NameAssignment_0 ) ) ;
    public final void rule__Functionality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2634:1: ( ( ( rule__Functionality__NameAssignment_0 ) ) )
            // InternalCompras.g:2635:1: ( ( rule__Functionality__NameAssignment_0 ) )
            {
            // InternalCompras.g:2635:1: ( ( rule__Functionality__NameAssignment_0 ) )
            // InternalCompras.g:2636:2: ( rule__Functionality__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionalityAccess().getNameAssignment_0()); 
            // InternalCompras.g:2637:2: ( rule__Functionality__NameAssignment_0 )
            // InternalCompras.g:2637:3: rule__Functionality__NameAssignment_0
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
    // InternalCompras.g:2645:1: rule__Functionality__Group__1 : rule__Functionality__Group__1__Impl rule__Functionality__Group__2 ;
    public final void rule__Functionality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2649:1: ( rule__Functionality__Group__1__Impl rule__Functionality__Group__2 )
            // InternalCompras.g:2650:2: rule__Functionality__Group__1__Impl rule__Functionality__Group__2
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
    // InternalCompras.g:2657:1: rule__Functionality__Group__1__Impl : ( 'RelEntity' ) ;
    public final void rule__Functionality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2661:1: ( ( 'RelEntity' ) )
            // InternalCompras.g:2662:1: ( 'RelEntity' )
            {
            // InternalCompras.g:2662:1: ( 'RelEntity' )
            // InternalCompras.g:2663:2: 'RelEntity'
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
    // InternalCompras.g:2672:1: rule__Functionality__Group__2 : rule__Functionality__Group__2__Impl rule__Functionality__Group__3 ;
    public final void rule__Functionality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2676:1: ( rule__Functionality__Group__2__Impl rule__Functionality__Group__3 )
            // InternalCompras.g:2677:2: rule__Functionality__Group__2__Impl rule__Functionality__Group__3
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
    // InternalCompras.g:2684:1: rule__Functionality__Group__2__Impl : ( ( rule__Functionality__EntityAssignment_2 ) ) ;
    public final void rule__Functionality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2688:1: ( ( ( rule__Functionality__EntityAssignment_2 ) ) )
            // InternalCompras.g:2689:1: ( ( rule__Functionality__EntityAssignment_2 ) )
            {
            // InternalCompras.g:2689:1: ( ( rule__Functionality__EntityAssignment_2 ) )
            // InternalCompras.g:2690:2: ( rule__Functionality__EntityAssignment_2 )
            {
             before(grammarAccess.getFunctionalityAccess().getEntityAssignment_2()); 
            // InternalCompras.g:2691:2: ( rule__Functionality__EntityAssignment_2 )
            // InternalCompras.g:2691:3: rule__Functionality__EntityAssignment_2
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
    // InternalCompras.g:2699:1: rule__Functionality__Group__3 : rule__Functionality__Group__3__Impl rule__Functionality__Group__4 ;
    public final void rule__Functionality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2703:1: ( rule__Functionality__Group__3__Impl rule__Functionality__Group__4 )
            // InternalCompras.g:2704:2: rule__Functionality__Group__3__Impl rule__Functionality__Group__4
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
    // InternalCompras.g:2711:1: rule__Functionality__Group__3__Impl : ( ':' ) ;
    public final void rule__Functionality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2715:1: ( ( ':' ) )
            // InternalCompras.g:2716:1: ( ':' )
            {
            // InternalCompras.g:2716:1: ( ':' )
            // InternalCompras.g:2717:2: ':'
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
    // InternalCompras.g:2726:1: rule__Functionality__Group__4 : rule__Functionality__Group__4__Impl rule__Functionality__Group__5 ;
    public final void rule__Functionality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2730:1: ( rule__Functionality__Group__4__Impl rule__Functionality__Group__5 )
            // InternalCompras.g:2731:2: rule__Functionality__Group__4__Impl rule__Functionality__Group__5
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
    // InternalCompras.g:2738:1: rule__Functionality__Group__4__Impl : ( '{' ) ;
    public final void rule__Functionality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2742:1: ( ( '{' ) )
            // InternalCompras.g:2743:1: ( '{' )
            {
            // InternalCompras.g:2743:1: ( '{' )
            // InternalCompras.g:2744:2: '{'
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
    // InternalCompras.g:2753:1: rule__Functionality__Group__5 : rule__Functionality__Group__5__Impl rule__Functionality__Group__6 ;
    public final void rule__Functionality__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2757:1: ( rule__Functionality__Group__5__Impl rule__Functionality__Group__6 )
            // InternalCompras.g:2758:2: rule__Functionality__Group__5__Impl rule__Functionality__Group__6
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
    // InternalCompras.g:2765:1: rule__Functionality__Group__5__Impl : ( ( rule__Functionality__FunctionalityActionTypeAssignment_5 )* ) ;
    public final void rule__Functionality__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2769:1: ( ( ( rule__Functionality__FunctionalityActionTypeAssignment_5 )* ) )
            // InternalCompras.g:2770:1: ( ( rule__Functionality__FunctionalityActionTypeAssignment_5 )* )
            {
            // InternalCompras.g:2770:1: ( ( rule__Functionality__FunctionalityActionTypeAssignment_5 )* )
            // InternalCompras.g:2771:2: ( rule__Functionality__FunctionalityActionTypeAssignment_5 )*
            {
             before(grammarAccess.getFunctionalityAccess().getFunctionalityActionTypeAssignment_5()); 
            // InternalCompras.g:2772:2: ( rule__Functionality__FunctionalityActionTypeAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=57 && LA16_0<=61)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCompras.g:2772:3: rule__Functionality__FunctionalityActionTypeAssignment_5
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
    // InternalCompras.g:2780:1: rule__Functionality__Group__6 : rule__Functionality__Group__6__Impl ;
    public final void rule__Functionality__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2784:1: ( rule__Functionality__Group__6__Impl )
            // InternalCompras.g:2785:2: rule__Functionality__Group__6__Impl
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
    // InternalCompras.g:2791:1: rule__Functionality__Group__6__Impl : ( '}' ) ;
    public final void rule__Functionality__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2795:1: ( ( '}' ) )
            // InternalCompras.g:2796:1: ( '}' )
            {
            // InternalCompras.g:2796:1: ( '}' )
            // InternalCompras.g:2797:2: '}'
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
    // InternalCompras.g:2807:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2811:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalCompras.g:2812:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
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
    // InternalCompras.g:2819:1: rule__Architecture__Group__0__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2823:1: ( ( '{' ) )
            // InternalCompras.g:2824:1: ( '{' )
            {
            // InternalCompras.g:2824:1: ( '{' )
            // InternalCompras.g:2825:2: '{'
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
    // InternalCompras.g:2834:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2838:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalCompras.g:2839:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
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
    // InternalCompras.g:2846:1: rule__Architecture__Group__1__Impl : ( 'Layers' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2850:1: ( ( 'Layers' ) )
            // InternalCompras.g:2851:1: ( 'Layers' )
            {
            // InternalCompras.g:2851:1: ( 'Layers' )
            // InternalCompras.g:2852:2: 'Layers'
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
    // InternalCompras.g:2861:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2865:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalCompras.g:2866:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
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
    // InternalCompras.g:2873:1: rule__Architecture__Group__2__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2877:1: ( ( ':' ) )
            // InternalCompras.g:2878:1: ( ':' )
            {
            // InternalCompras.g:2878:1: ( ':' )
            // InternalCompras.g:2879:2: ':'
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
    // InternalCompras.g:2888:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl rule__Architecture__Group__4 ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2892:1: ( rule__Architecture__Group__3__Impl rule__Architecture__Group__4 )
            // InternalCompras.g:2893:2: rule__Architecture__Group__3__Impl rule__Architecture__Group__4
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
    // InternalCompras.g:2900:1: rule__Architecture__Group__3__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2904:1: ( ( '{' ) )
            // InternalCompras.g:2905:1: ( '{' )
            {
            // InternalCompras.g:2905:1: ( '{' )
            // InternalCompras.g:2906:2: '{'
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
    // InternalCompras.g:2915:1: rule__Architecture__Group__4 : rule__Architecture__Group__4__Impl rule__Architecture__Group__5 ;
    public final void rule__Architecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2919:1: ( rule__Architecture__Group__4__Impl rule__Architecture__Group__5 )
            // InternalCompras.g:2920:2: rule__Architecture__Group__4__Impl rule__Architecture__Group__5
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
    // InternalCompras.g:2927:1: rule__Architecture__Group__4__Impl : ( 'PresentationLayer' ) ;
    public final void rule__Architecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2931:1: ( ( 'PresentationLayer' ) )
            // InternalCompras.g:2932:1: ( 'PresentationLayer' )
            {
            // InternalCompras.g:2932:1: ( 'PresentationLayer' )
            // InternalCompras.g:2933:2: 'PresentationLayer'
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
    // InternalCompras.g:2942:1: rule__Architecture__Group__5 : rule__Architecture__Group__5__Impl rule__Architecture__Group__6 ;
    public final void rule__Architecture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2946:1: ( rule__Architecture__Group__5__Impl rule__Architecture__Group__6 )
            // InternalCompras.g:2947:2: rule__Architecture__Group__5__Impl rule__Architecture__Group__6
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
    // InternalCompras.g:2954:1: rule__Architecture__Group__5__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2958:1: ( ( ':' ) )
            // InternalCompras.g:2959:1: ( ':' )
            {
            // InternalCompras.g:2959:1: ( ':' )
            // InternalCompras.g:2960:2: ':'
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
    // InternalCompras.g:2969:1: rule__Architecture__Group__6 : rule__Architecture__Group__6__Impl rule__Architecture__Group__7 ;
    public final void rule__Architecture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2973:1: ( rule__Architecture__Group__6__Impl rule__Architecture__Group__7 )
            // InternalCompras.g:2974:2: rule__Architecture__Group__6__Impl rule__Architecture__Group__7
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
    // InternalCompras.g:2981:1: rule__Architecture__Group__6__Impl : ( ( rule__Architecture__PresentationLayerAssignment_6 ) ) ;
    public final void rule__Architecture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2985:1: ( ( ( rule__Architecture__PresentationLayerAssignment_6 ) ) )
            // InternalCompras.g:2986:1: ( ( rule__Architecture__PresentationLayerAssignment_6 ) )
            {
            // InternalCompras.g:2986:1: ( ( rule__Architecture__PresentationLayerAssignment_6 ) )
            // InternalCompras.g:2987:2: ( rule__Architecture__PresentationLayerAssignment_6 )
            {
             before(grammarAccess.getArchitectureAccess().getPresentationLayerAssignment_6()); 
            // InternalCompras.g:2988:2: ( rule__Architecture__PresentationLayerAssignment_6 )
            // InternalCompras.g:2988:3: rule__Architecture__PresentationLayerAssignment_6
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
    // InternalCompras.g:2996:1: rule__Architecture__Group__7 : rule__Architecture__Group__7__Impl rule__Architecture__Group__8 ;
    public final void rule__Architecture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3000:1: ( rule__Architecture__Group__7__Impl rule__Architecture__Group__8 )
            // InternalCompras.g:3001:2: rule__Architecture__Group__7__Impl rule__Architecture__Group__8
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
    // InternalCompras.g:3008:1: rule__Architecture__Group__7__Impl : ( 'BusinessLayer' ) ;
    public final void rule__Architecture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3012:1: ( ( 'BusinessLayer' ) )
            // InternalCompras.g:3013:1: ( 'BusinessLayer' )
            {
            // InternalCompras.g:3013:1: ( 'BusinessLayer' )
            // InternalCompras.g:3014:2: 'BusinessLayer'
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
    // InternalCompras.g:3023:1: rule__Architecture__Group__8 : rule__Architecture__Group__8__Impl rule__Architecture__Group__9 ;
    public final void rule__Architecture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3027:1: ( rule__Architecture__Group__8__Impl rule__Architecture__Group__9 )
            // InternalCompras.g:3028:2: rule__Architecture__Group__8__Impl rule__Architecture__Group__9
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
    // InternalCompras.g:3035:1: rule__Architecture__Group__8__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3039:1: ( ( ':' ) )
            // InternalCompras.g:3040:1: ( ':' )
            {
            // InternalCompras.g:3040:1: ( ':' )
            // InternalCompras.g:3041:2: ':'
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
    // InternalCompras.g:3050:1: rule__Architecture__Group__9 : rule__Architecture__Group__9__Impl rule__Architecture__Group__10 ;
    public final void rule__Architecture__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3054:1: ( rule__Architecture__Group__9__Impl rule__Architecture__Group__10 )
            // InternalCompras.g:3055:2: rule__Architecture__Group__9__Impl rule__Architecture__Group__10
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
    // InternalCompras.g:3062:1: rule__Architecture__Group__9__Impl : ( ( rule__Architecture__BusinessLayerAssignment_9 ) ) ;
    public final void rule__Architecture__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3066:1: ( ( ( rule__Architecture__BusinessLayerAssignment_9 ) ) )
            // InternalCompras.g:3067:1: ( ( rule__Architecture__BusinessLayerAssignment_9 ) )
            {
            // InternalCompras.g:3067:1: ( ( rule__Architecture__BusinessLayerAssignment_9 ) )
            // InternalCompras.g:3068:2: ( rule__Architecture__BusinessLayerAssignment_9 )
            {
             before(grammarAccess.getArchitectureAccess().getBusinessLayerAssignment_9()); 
            // InternalCompras.g:3069:2: ( rule__Architecture__BusinessLayerAssignment_9 )
            // InternalCompras.g:3069:3: rule__Architecture__BusinessLayerAssignment_9
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
    // InternalCompras.g:3077:1: rule__Architecture__Group__10 : rule__Architecture__Group__10__Impl rule__Architecture__Group__11 ;
    public final void rule__Architecture__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3081:1: ( rule__Architecture__Group__10__Impl rule__Architecture__Group__11 )
            // InternalCompras.g:3082:2: rule__Architecture__Group__10__Impl rule__Architecture__Group__11
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
    // InternalCompras.g:3089:1: rule__Architecture__Group__10__Impl : ( 'DataAccessLayer' ) ;
    public final void rule__Architecture__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3093:1: ( ( 'DataAccessLayer' ) )
            // InternalCompras.g:3094:1: ( 'DataAccessLayer' )
            {
            // InternalCompras.g:3094:1: ( 'DataAccessLayer' )
            // InternalCompras.g:3095:2: 'DataAccessLayer'
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
    // InternalCompras.g:3104:1: rule__Architecture__Group__11 : rule__Architecture__Group__11__Impl rule__Architecture__Group__12 ;
    public final void rule__Architecture__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3108:1: ( rule__Architecture__Group__11__Impl rule__Architecture__Group__12 )
            // InternalCompras.g:3109:2: rule__Architecture__Group__11__Impl rule__Architecture__Group__12
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
    // InternalCompras.g:3116:1: rule__Architecture__Group__11__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3120:1: ( ( ':' ) )
            // InternalCompras.g:3121:1: ( ':' )
            {
            // InternalCompras.g:3121:1: ( ':' )
            // InternalCompras.g:3122:2: ':'
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
    // InternalCompras.g:3131:1: rule__Architecture__Group__12 : rule__Architecture__Group__12__Impl rule__Architecture__Group__13 ;
    public final void rule__Architecture__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3135:1: ( rule__Architecture__Group__12__Impl rule__Architecture__Group__13 )
            // InternalCompras.g:3136:2: rule__Architecture__Group__12__Impl rule__Architecture__Group__13
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
    // InternalCompras.g:3143:1: rule__Architecture__Group__12__Impl : ( ( rule__Architecture__DataAccessLayerAssignment_12 ) ) ;
    public final void rule__Architecture__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3147:1: ( ( ( rule__Architecture__DataAccessLayerAssignment_12 ) ) )
            // InternalCompras.g:3148:1: ( ( rule__Architecture__DataAccessLayerAssignment_12 ) )
            {
            // InternalCompras.g:3148:1: ( ( rule__Architecture__DataAccessLayerAssignment_12 ) )
            // InternalCompras.g:3149:2: ( rule__Architecture__DataAccessLayerAssignment_12 )
            {
             before(grammarAccess.getArchitectureAccess().getDataAccessLayerAssignment_12()); 
            // InternalCompras.g:3150:2: ( rule__Architecture__DataAccessLayerAssignment_12 )
            // InternalCompras.g:3150:3: rule__Architecture__DataAccessLayerAssignment_12
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
    // InternalCompras.g:3158:1: rule__Architecture__Group__13 : rule__Architecture__Group__13__Impl rule__Architecture__Group__14 ;
    public final void rule__Architecture__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3162:1: ( rule__Architecture__Group__13__Impl rule__Architecture__Group__14 )
            // InternalCompras.g:3163:2: rule__Architecture__Group__13__Impl rule__Architecture__Group__14
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
    // InternalCompras.g:3170:1: rule__Architecture__Group__13__Impl : ( 'CommonLayer' ) ;
    public final void rule__Architecture__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3174:1: ( ( 'CommonLayer' ) )
            // InternalCompras.g:3175:1: ( 'CommonLayer' )
            {
            // InternalCompras.g:3175:1: ( 'CommonLayer' )
            // InternalCompras.g:3176:2: 'CommonLayer'
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
    // InternalCompras.g:3185:1: rule__Architecture__Group__14 : rule__Architecture__Group__14__Impl rule__Architecture__Group__15 ;
    public final void rule__Architecture__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3189:1: ( rule__Architecture__Group__14__Impl rule__Architecture__Group__15 )
            // InternalCompras.g:3190:2: rule__Architecture__Group__14__Impl rule__Architecture__Group__15
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
    // InternalCompras.g:3197:1: rule__Architecture__Group__14__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3201:1: ( ( ':' ) )
            // InternalCompras.g:3202:1: ( ':' )
            {
            // InternalCompras.g:3202:1: ( ':' )
            // InternalCompras.g:3203:2: ':'
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
    // InternalCompras.g:3212:1: rule__Architecture__Group__15 : rule__Architecture__Group__15__Impl rule__Architecture__Group__16 ;
    public final void rule__Architecture__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3216:1: ( rule__Architecture__Group__15__Impl rule__Architecture__Group__16 )
            // InternalCompras.g:3217:2: rule__Architecture__Group__15__Impl rule__Architecture__Group__16
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
    // InternalCompras.g:3224:1: rule__Architecture__Group__15__Impl : ( ( rule__Architecture__CommonLayerAssignment_15 ) ) ;
    public final void rule__Architecture__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3228:1: ( ( ( rule__Architecture__CommonLayerAssignment_15 ) ) )
            // InternalCompras.g:3229:1: ( ( rule__Architecture__CommonLayerAssignment_15 ) )
            {
            // InternalCompras.g:3229:1: ( ( rule__Architecture__CommonLayerAssignment_15 ) )
            // InternalCompras.g:3230:2: ( rule__Architecture__CommonLayerAssignment_15 )
            {
             before(grammarAccess.getArchitectureAccess().getCommonLayerAssignment_15()); 
            // InternalCompras.g:3231:2: ( rule__Architecture__CommonLayerAssignment_15 )
            // InternalCompras.g:3231:3: rule__Architecture__CommonLayerAssignment_15
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
    // InternalCompras.g:3239:1: rule__Architecture__Group__16 : rule__Architecture__Group__16__Impl rule__Architecture__Group__17 ;
    public final void rule__Architecture__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3243:1: ( rule__Architecture__Group__16__Impl rule__Architecture__Group__17 )
            // InternalCompras.g:3244:2: rule__Architecture__Group__16__Impl rule__Architecture__Group__17
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
    // InternalCompras.g:3251:1: rule__Architecture__Group__16__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3255:1: ( ( '}' ) )
            // InternalCompras.g:3256:1: ( '}' )
            {
            // InternalCompras.g:3256:1: ( '}' )
            // InternalCompras.g:3257:2: '}'
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
    // InternalCompras.g:3266:1: rule__Architecture__Group__17 : rule__Architecture__Group__17__Impl rule__Architecture__Group__18 ;
    public final void rule__Architecture__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3270:1: ( rule__Architecture__Group__17__Impl rule__Architecture__Group__18 )
            // InternalCompras.g:3271:2: rule__Architecture__Group__17__Impl rule__Architecture__Group__18
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
    // InternalCompras.g:3278:1: rule__Architecture__Group__17__Impl : ( 'Relations' ) ;
    public final void rule__Architecture__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3282:1: ( ( 'Relations' ) )
            // InternalCompras.g:3283:1: ( 'Relations' )
            {
            // InternalCompras.g:3283:1: ( 'Relations' )
            // InternalCompras.g:3284:2: 'Relations'
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
    // InternalCompras.g:3293:1: rule__Architecture__Group__18 : rule__Architecture__Group__18__Impl rule__Architecture__Group__19 ;
    public final void rule__Architecture__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3297:1: ( rule__Architecture__Group__18__Impl rule__Architecture__Group__19 )
            // InternalCompras.g:3298:2: rule__Architecture__Group__18__Impl rule__Architecture__Group__19
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
    // InternalCompras.g:3305:1: rule__Architecture__Group__18__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3309:1: ( ( ':' ) )
            // InternalCompras.g:3310:1: ( ':' )
            {
            // InternalCompras.g:3310:1: ( ':' )
            // InternalCompras.g:3311:2: ':'
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
    // InternalCompras.g:3320:1: rule__Architecture__Group__19 : rule__Architecture__Group__19__Impl rule__Architecture__Group__20 ;
    public final void rule__Architecture__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3324:1: ( rule__Architecture__Group__19__Impl rule__Architecture__Group__20 )
            // InternalCompras.g:3325:2: rule__Architecture__Group__19__Impl rule__Architecture__Group__20
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
    // InternalCompras.g:3332:1: rule__Architecture__Group__19__Impl : ( ( rule__Architecture__RelationsAssignment_19 ) ) ;
    public final void rule__Architecture__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3336:1: ( ( ( rule__Architecture__RelationsAssignment_19 ) ) )
            // InternalCompras.g:3337:1: ( ( rule__Architecture__RelationsAssignment_19 ) )
            {
            // InternalCompras.g:3337:1: ( ( rule__Architecture__RelationsAssignment_19 ) )
            // InternalCompras.g:3338:2: ( rule__Architecture__RelationsAssignment_19 )
            {
             before(grammarAccess.getArchitectureAccess().getRelationsAssignment_19()); 
            // InternalCompras.g:3339:2: ( rule__Architecture__RelationsAssignment_19 )
            // InternalCompras.g:3339:3: rule__Architecture__RelationsAssignment_19
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
    // InternalCompras.g:3347:1: rule__Architecture__Group__20 : rule__Architecture__Group__20__Impl ;
    public final void rule__Architecture__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3351:1: ( rule__Architecture__Group__20__Impl )
            // InternalCompras.g:3352:2: rule__Architecture__Group__20__Impl
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
    // InternalCompras.g:3358:1: rule__Architecture__Group__20__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3362:1: ( ( '}' ) )
            // InternalCompras.g:3363:1: ( '}' )
            {
            // InternalCompras.g:3363:1: ( '}' )
            // InternalCompras.g:3364:2: '}'
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
    // InternalCompras.g:3374:1: rule__PresentationLayer__Group__0 : rule__PresentationLayer__Group__0__Impl rule__PresentationLayer__Group__1 ;
    public final void rule__PresentationLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3378:1: ( rule__PresentationLayer__Group__0__Impl rule__PresentationLayer__Group__1 )
            // InternalCompras.g:3379:2: rule__PresentationLayer__Group__0__Impl rule__PresentationLayer__Group__1
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
    // InternalCompras.g:3386:1: rule__PresentationLayer__Group__0__Impl : ( ( rule__PresentationLayer__NameAssignment_0 ) ) ;
    public final void rule__PresentationLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3390:1: ( ( ( rule__PresentationLayer__NameAssignment_0 ) ) )
            // InternalCompras.g:3391:1: ( ( rule__PresentationLayer__NameAssignment_0 ) )
            {
            // InternalCompras.g:3391:1: ( ( rule__PresentationLayer__NameAssignment_0 ) )
            // InternalCompras.g:3392:2: ( rule__PresentationLayer__NameAssignment_0 )
            {
             before(grammarAccess.getPresentationLayerAccess().getNameAssignment_0()); 
            // InternalCompras.g:3393:2: ( rule__PresentationLayer__NameAssignment_0 )
            // InternalCompras.g:3393:3: rule__PresentationLayer__NameAssignment_0
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
    // InternalCompras.g:3401:1: rule__PresentationLayer__Group__1 : rule__PresentationLayer__Group__1__Impl rule__PresentationLayer__Group__2 ;
    public final void rule__PresentationLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3405:1: ( rule__PresentationLayer__Group__1__Impl rule__PresentationLayer__Group__2 )
            // InternalCompras.g:3406:2: rule__PresentationLayer__Group__1__Impl rule__PresentationLayer__Group__2
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
    // InternalCompras.g:3413:1: rule__PresentationLayer__Group__1__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3417:1: ( ( ':' ) )
            // InternalCompras.g:3418:1: ( ':' )
            {
            // InternalCompras.g:3418:1: ( ':' )
            // InternalCompras.g:3419:2: ':'
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
    // InternalCompras.g:3428:1: rule__PresentationLayer__Group__2 : rule__PresentationLayer__Group__2__Impl rule__PresentationLayer__Group__3 ;
    public final void rule__PresentationLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3432:1: ( rule__PresentationLayer__Group__2__Impl rule__PresentationLayer__Group__3 )
            // InternalCompras.g:3433:2: rule__PresentationLayer__Group__2__Impl rule__PresentationLayer__Group__3
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
    // InternalCompras.g:3440:1: rule__PresentationLayer__Group__2__Impl : ( '{' ) ;
    public final void rule__PresentationLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3444:1: ( ( '{' ) )
            // InternalCompras.g:3445:1: ( '{' )
            {
            // InternalCompras.g:3445:1: ( '{' )
            // InternalCompras.g:3446:2: '{'
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
    // InternalCompras.g:3455:1: rule__PresentationLayer__Group__3 : rule__PresentationLayer__Group__3__Impl rule__PresentationLayer__Group__4 ;
    public final void rule__PresentationLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3459:1: ( rule__PresentationLayer__Group__3__Impl rule__PresentationLayer__Group__4 )
            // InternalCompras.g:3460:2: rule__PresentationLayer__Group__3__Impl rule__PresentationLayer__Group__4
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
    // InternalCompras.g:3467:1: rule__PresentationLayer__Group__3__Impl : ( 'ControllerSegmentLayer' ) ;
    public final void rule__PresentationLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3471:1: ( ( 'ControllerSegmentLayer' ) )
            // InternalCompras.g:3472:1: ( 'ControllerSegmentLayer' )
            {
            // InternalCompras.g:3472:1: ( 'ControllerSegmentLayer' )
            // InternalCompras.g:3473:2: 'ControllerSegmentLayer'
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
    // InternalCompras.g:3482:1: rule__PresentationLayer__Group__4 : rule__PresentationLayer__Group__4__Impl rule__PresentationLayer__Group__5 ;
    public final void rule__PresentationLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3486:1: ( rule__PresentationLayer__Group__4__Impl rule__PresentationLayer__Group__5 )
            // InternalCompras.g:3487:2: rule__PresentationLayer__Group__4__Impl rule__PresentationLayer__Group__5
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
    // InternalCompras.g:3494:1: rule__PresentationLayer__Group__4__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3498:1: ( ( ':' ) )
            // InternalCompras.g:3499:1: ( ':' )
            {
            // InternalCompras.g:3499:1: ( ':' )
            // InternalCompras.g:3500:2: ':'
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
    // InternalCompras.g:3509:1: rule__PresentationLayer__Group__5 : rule__PresentationLayer__Group__5__Impl rule__PresentationLayer__Group__6 ;
    public final void rule__PresentationLayer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3513:1: ( rule__PresentationLayer__Group__5__Impl rule__PresentationLayer__Group__6 )
            // InternalCompras.g:3514:2: rule__PresentationLayer__Group__5__Impl rule__PresentationLayer__Group__6
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
    // InternalCompras.g:3521:1: rule__PresentationLayer__Group__5__Impl : ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) ) ;
    public final void rule__PresentationLayer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3525:1: ( ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) ) )
            // InternalCompras.g:3526:1: ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) )
            {
            // InternalCompras.g:3526:1: ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) )
            // InternalCompras.g:3527:2: ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 )
            {
             before(grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerAssignment_5()); 
            // InternalCompras.g:3528:2: ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 )
            // InternalCompras.g:3528:3: rule__PresentationLayer__ControllerSegmentLayerAssignment_5
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
    // InternalCompras.g:3536:1: rule__PresentationLayer__Group__6 : rule__PresentationLayer__Group__6__Impl rule__PresentationLayer__Group__7 ;
    public final void rule__PresentationLayer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3540:1: ( rule__PresentationLayer__Group__6__Impl rule__PresentationLayer__Group__7 )
            // InternalCompras.g:3541:2: rule__PresentationLayer__Group__6__Impl rule__PresentationLayer__Group__7
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
    // InternalCompras.g:3548:1: rule__PresentationLayer__Group__6__Impl : ( 'ViewSegmentLayer' ) ;
    public final void rule__PresentationLayer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3552:1: ( ( 'ViewSegmentLayer' ) )
            // InternalCompras.g:3553:1: ( 'ViewSegmentLayer' )
            {
            // InternalCompras.g:3553:1: ( 'ViewSegmentLayer' )
            // InternalCompras.g:3554:2: 'ViewSegmentLayer'
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
    // InternalCompras.g:3563:1: rule__PresentationLayer__Group__7 : rule__PresentationLayer__Group__7__Impl rule__PresentationLayer__Group__8 ;
    public final void rule__PresentationLayer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3567:1: ( rule__PresentationLayer__Group__7__Impl rule__PresentationLayer__Group__8 )
            // InternalCompras.g:3568:2: rule__PresentationLayer__Group__7__Impl rule__PresentationLayer__Group__8
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
    // InternalCompras.g:3575:1: rule__PresentationLayer__Group__7__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3579:1: ( ( ':' ) )
            // InternalCompras.g:3580:1: ( ':' )
            {
            // InternalCompras.g:3580:1: ( ':' )
            // InternalCompras.g:3581:2: ':'
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
    // InternalCompras.g:3590:1: rule__PresentationLayer__Group__8 : rule__PresentationLayer__Group__8__Impl rule__PresentationLayer__Group__9 ;
    public final void rule__PresentationLayer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3594:1: ( rule__PresentationLayer__Group__8__Impl rule__PresentationLayer__Group__9 )
            // InternalCompras.g:3595:2: rule__PresentationLayer__Group__8__Impl rule__PresentationLayer__Group__9
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
    // InternalCompras.g:3602:1: rule__PresentationLayer__Group__8__Impl : ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) ) ;
    public final void rule__PresentationLayer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3606:1: ( ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) ) )
            // InternalCompras.g:3607:1: ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) )
            {
            // InternalCompras.g:3607:1: ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) )
            // InternalCompras.g:3608:2: ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 )
            {
             before(grammarAccess.getPresentationLayerAccess().getViewSegmentLayerAssignment_8()); 
            // InternalCompras.g:3609:2: ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 )
            // InternalCompras.g:3609:3: rule__PresentationLayer__ViewSegmentLayerAssignment_8
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
    // InternalCompras.g:3617:1: rule__PresentationLayer__Group__9 : rule__PresentationLayer__Group__9__Impl rule__PresentationLayer__Group__10 ;
    public final void rule__PresentationLayer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3621:1: ( rule__PresentationLayer__Group__9__Impl rule__PresentationLayer__Group__10 )
            // InternalCompras.g:3622:2: rule__PresentationLayer__Group__9__Impl rule__PresentationLayer__Group__10
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
    // InternalCompras.g:3629:1: rule__PresentationLayer__Group__9__Impl : ( 'ScriptSegmentLayer' ) ;
    public final void rule__PresentationLayer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3633:1: ( ( 'ScriptSegmentLayer' ) )
            // InternalCompras.g:3634:1: ( 'ScriptSegmentLayer' )
            {
            // InternalCompras.g:3634:1: ( 'ScriptSegmentLayer' )
            // InternalCompras.g:3635:2: 'ScriptSegmentLayer'
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
    // InternalCompras.g:3644:1: rule__PresentationLayer__Group__10 : rule__PresentationLayer__Group__10__Impl rule__PresentationLayer__Group__11 ;
    public final void rule__PresentationLayer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3648:1: ( rule__PresentationLayer__Group__10__Impl rule__PresentationLayer__Group__11 )
            // InternalCompras.g:3649:2: rule__PresentationLayer__Group__10__Impl rule__PresentationLayer__Group__11
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
    // InternalCompras.g:3656:1: rule__PresentationLayer__Group__10__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3660:1: ( ( ':' ) )
            // InternalCompras.g:3661:1: ( ':' )
            {
            // InternalCompras.g:3661:1: ( ':' )
            // InternalCompras.g:3662:2: ':'
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
    // InternalCompras.g:3671:1: rule__PresentationLayer__Group__11 : rule__PresentationLayer__Group__11__Impl rule__PresentationLayer__Group__12 ;
    public final void rule__PresentationLayer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3675:1: ( rule__PresentationLayer__Group__11__Impl rule__PresentationLayer__Group__12 )
            // InternalCompras.g:3676:2: rule__PresentationLayer__Group__11__Impl rule__PresentationLayer__Group__12
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
    // InternalCompras.g:3683:1: rule__PresentationLayer__Group__11__Impl : ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) ) ;
    public final void rule__PresentationLayer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3687:1: ( ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) ) )
            // InternalCompras.g:3688:1: ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) )
            {
            // InternalCompras.g:3688:1: ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) )
            // InternalCompras.g:3689:2: ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 )
            {
             before(grammarAccess.getPresentationLayerAccess().getScriptegmentLayerAssignment_11()); 
            // InternalCompras.g:3690:2: ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 )
            // InternalCompras.g:3690:3: rule__PresentationLayer__ScriptegmentLayerAssignment_11
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
    // InternalCompras.g:3698:1: rule__PresentationLayer__Group__12 : rule__PresentationLayer__Group__12__Impl ;
    public final void rule__PresentationLayer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3702:1: ( rule__PresentationLayer__Group__12__Impl )
            // InternalCompras.g:3703:2: rule__PresentationLayer__Group__12__Impl
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
    // InternalCompras.g:3709:1: rule__PresentationLayer__Group__12__Impl : ( '}' ) ;
    public final void rule__PresentationLayer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3713:1: ( ( '}' ) )
            // InternalCompras.g:3714:1: ( '}' )
            {
            // InternalCompras.g:3714:1: ( '}' )
            // InternalCompras.g:3715:2: '}'
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
    // InternalCompras.g:3725:1: rule__DataAccessLayer__Group__0 : rule__DataAccessLayer__Group__0__Impl rule__DataAccessLayer__Group__1 ;
    public final void rule__DataAccessLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3729:1: ( rule__DataAccessLayer__Group__0__Impl rule__DataAccessLayer__Group__1 )
            // InternalCompras.g:3730:2: rule__DataAccessLayer__Group__0__Impl rule__DataAccessLayer__Group__1
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
    // InternalCompras.g:3737:1: rule__DataAccessLayer__Group__0__Impl : ( ( rule__DataAccessLayer__NameAssignment_0 ) ) ;
    public final void rule__DataAccessLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3741:1: ( ( ( rule__DataAccessLayer__NameAssignment_0 ) ) )
            // InternalCompras.g:3742:1: ( ( rule__DataAccessLayer__NameAssignment_0 ) )
            {
            // InternalCompras.g:3742:1: ( ( rule__DataAccessLayer__NameAssignment_0 ) )
            // InternalCompras.g:3743:2: ( rule__DataAccessLayer__NameAssignment_0 )
            {
             before(grammarAccess.getDataAccessLayerAccess().getNameAssignment_0()); 
            // InternalCompras.g:3744:2: ( rule__DataAccessLayer__NameAssignment_0 )
            // InternalCompras.g:3744:3: rule__DataAccessLayer__NameAssignment_0
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
    // InternalCompras.g:3752:1: rule__DataAccessLayer__Group__1 : rule__DataAccessLayer__Group__1__Impl rule__DataAccessLayer__Group__2 ;
    public final void rule__DataAccessLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3756:1: ( rule__DataAccessLayer__Group__1__Impl rule__DataAccessLayer__Group__2 )
            // InternalCompras.g:3757:2: rule__DataAccessLayer__Group__1__Impl rule__DataAccessLayer__Group__2
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
    // InternalCompras.g:3764:1: rule__DataAccessLayer__Group__1__Impl : ( ':' ) ;
    public final void rule__DataAccessLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3768:1: ( ( ':' ) )
            // InternalCompras.g:3769:1: ( ':' )
            {
            // InternalCompras.g:3769:1: ( ':' )
            // InternalCompras.g:3770:2: ':'
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
    // InternalCompras.g:3779:1: rule__DataAccessLayer__Group__2 : rule__DataAccessLayer__Group__2__Impl rule__DataAccessLayer__Group__3 ;
    public final void rule__DataAccessLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3783:1: ( rule__DataAccessLayer__Group__2__Impl rule__DataAccessLayer__Group__3 )
            // InternalCompras.g:3784:2: rule__DataAccessLayer__Group__2__Impl rule__DataAccessLayer__Group__3
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
    // InternalCompras.g:3791:1: rule__DataAccessLayer__Group__2__Impl : ( '{' ) ;
    public final void rule__DataAccessLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3795:1: ( ( '{' ) )
            // InternalCompras.g:3796:1: ( '{' )
            {
            // InternalCompras.g:3796:1: ( '{' )
            // InternalCompras.g:3797:2: '{'
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
    // InternalCompras.g:3806:1: rule__DataAccessLayer__Group__3 : rule__DataAccessLayer__Group__3__Impl rule__DataAccessLayer__Group__4 ;
    public final void rule__DataAccessLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3810:1: ( rule__DataAccessLayer__Group__3__Impl rule__DataAccessLayer__Group__4 )
            // InternalCompras.g:3811:2: rule__DataAccessLayer__Group__3__Impl rule__DataAccessLayer__Group__4
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
    // InternalCompras.g:3818:1: rule__DataAccessLayer__Group__3__Impl : ( 'DbConnectorSegmentLayer' ) ;
    public final void rule__DataAccessLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3822:1: ( ( 'DbConnectorSegmentLayer' ) )
            // InternalCompras.g:3823:1: ( 'DbConnectorSegmentLayer' )
            {
            // InternalCompras.g:3823:1: ( 'DbConnectorSegmentLayer' )
            // InternalCompras.g:3824:2: 'DbConnectorSegmentLayer'
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
    // InternalCompras.g:3833:1: rule__DataAccessLayer__Group__4 : rule__DataAccessLayer__Group__4__Impl rule__DataAccessLayer__Group__5 ;
    public final void rule__DataAccessLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3837:1: ( rule__DataAccessLayer__Group__4__Impl rule__DataAccessLayer__Group__5 )
            // InternalCompras.g:3838:2: rule__DataAccessLayer__Group__4__Impl rule__DataAccessLayer__Group__5
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
    // InternalCompras.g:3845:1: rule__DataAccessLayer__Group__4__Impl : ( ':' ) ;
    public final void rule__DataAccessLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3849:1: ( ( ':' ) )
            // InternalCompras.g:3850:1: ( ':' )
            {
            // InternalCompras.g:3850:1: ( ':' )
            // InternalCompras.g:3851:2: ':'
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
    // InternalCompras.g:3860:1: rule__DataAccessLayer__Group__5 : rule__DataAccessLayer__Group__5__Impl rule__DataAccessLayer__Group__6 ;
    public final void rule__DataAccessLayer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3864:1: ( rule__DataAccessLayer__Group__5__Impl rule__DataAccessLayer__Group__6 )
            // InternalCompras.g:3865:2: rule__DataAccessLayer__Group__5__Impl rule__DataAccessLayer__Group__6
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
    // InternalCompras.g:3872:1: rule__DataAccessLayer__Group__5__Impl : ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) ) ;
    public final void rule__DataAccessLayer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3876:1: ( ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) ) )
            // InternalCompras.g:3877:1: ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) )
            {
            // InternalCompras.g:3877:1: ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) )
            // InternalCompras.g:3878:2: ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 )
            {
             before(grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerAssignment_5()); 
            // InternalCompras.g:3879:2: ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 )
            // InternalCompras.g:3879:3: rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5
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
    // InternalCompras.g:3887:1: rule__DataAccessLayer__Group__6 : rule__DataAccessLayer__Group__6__Impl ;
    public final void rule__DataAccessLayer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3891:1: ( rule__DataAccessLayer__Group__6__Impl )
            // InternalCompras.g:3892:2: rule__DataAccessLayer__Group__6__Impl
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
    // InternalCompras.g:3898:1: rule__DataAccessLayer__Group__6__Impl : ( '}' ) ;
    public final void rule__DataAccessLayer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3902:1: ( ( '}' ) )
            // InternalCompras.g:3903:1: ( '}' )
            {
            // InternalCompras.g:3903:1: ( '}' )
            // InternalCompras.g:3904:2: '}'
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
    // InternalCompras.g:3914:1: rule__Relations__Group__0 : rule__Relations__Group__0__Impl rule__Relations__Group__1 ;
    public final void rule__Relations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3918:1: ( rule__Relations__Group__0__Impl rule__Relations__Group__1 )
            // InternalCompras.g:3919:2: rule__Relations__Group__0__Impl rule__Relations__Group__1
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
    // InternalCompras.g:3926:1: rule__Relations__Group__0__Impl : ( '{' ) ;
    public final void rule__Relations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3930:1: ( ( '{' ) )
            // InternalCompras.g:3931:1: ( '{' )
            {
            // InternalCompras.g:3931:1: ( '{' )
            // InternalCompras.g:3932:2: '{'
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
    // InternalCompras.g:3941:1: rule__Relations__Group__1 : rule__Relations__Group__1__Impl rule__Relations__Group__2 ;
    public final void rule__Relations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3945:1: ( rule__Relations__Group__1__Impl rule__Relations__Group__2 )
            // InternalCompras.g:3946:2: rule__Relations__Group__1__Impl rule__Relations__Group__2
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
    // InternalCompras.g:3953:1: rule__Relations__Group__1__Impl : ( ( rule__Relations__SourceLayer1Assignment_1 ) ) ;
    public final void rule__Relations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3957:1: ( ( ( rule__Relations__SourceLayer1Assignment_1 ) ) )
            // InternalCompras.g:3958:1: ( ( rule__Relations__SourceLayer1Assignment_1 ) )
            {
            // InternalCompras.g:3958:1: ( ( rule__Relations__SourceLayer1Assignment_1 ) )
            // InternalCompras.g:3959:2: ( rule__Relations__SourceLayer1Assignment_1 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer1Assignment_1()); 
            // InternalCompras.g:3960:2: ( rule__Relations__SourceLayer1Assignment_1 )
            // InternalCompras.g:3960:3: rule__Relations__SourceLayer1Assignment_1
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
    // InternalCompras.g:3968:1: rule__Relations__Group__2 : rule__Relations__Group__2__Impl rule__Relations__Group__3 ;
    public final void rule__Relations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3972:1: ( rule__Relations__Group__2__Impl rule__Relations__Group__3 )
            // InternalCompras.g:3973:2: rule__Relations__Group__2__Impl rule__Relations__Group__3
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
    // InternalCompras.g:3980:1: rule__Relations__Group__2__Impl : ( ( rule__Relations__RelationsType1Assignment_2 ) ) ;
    public final void rule__Relations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3984:1: ( ( ( rule__Relations__RelationsType1Assignment_2 ) ) )
            // InternalCompras.g:3985:1: ( ( rule__Relations__RelationsType1Assignment_2 ) )
            {
            // InternalCompras.g:3985:1: ( ( rule__Relations__RelationsType1Assignment_2 ) )
            // InternalCompras.g:3986:2: ( rule__Relations__RelationsType1Assignment_2 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType1Assignment_2()); 
            // InternalCompras.g:3987:2: ( rule__Relations__RelationsType1Assignment_2 )
            // InternalCompras.g:3987:3: rule__Relations__RelationsType1Assignment_2
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
    // InternalCompras.g:3995:1: rule__Relations__Group__3 : rule__Relations__Group__3__Impl rule__Relations__Group__4 ;
    public final void rule__Relations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3999:1: ( rule__Relations__Group__3__Impl rule__Relations__Group__4 )
            // InternalCompras.g:4000:2: rule__Relations__Group__3__Impl rule__Relations__Group__4
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
    // InternalCompras.g:4007:1: rule__Relations__Group__3__Impl : ( ( rule__Relations__TargetLayer1Assignment_3 ) ) ;
    public final void rule__Relations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4011:1: ( ( ( rule__Relations__TargetLayer1Assignment_3 ) ) )
            // InternalCompras.g:4012:1: ( ( rule__Relations__TargetLayer1Assignment_3 ) )
            {
            // InternalCompras.g:4012:1: ( ( rule__Relations__TargetLayer1Assignment_3 ) )
            // InternalCompras.g:4013:2: ( rule__Relations__TargetLayer1Assignment_3 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer1Assignment_3()); 
            // InternalCompras.g:4014:2: ( rule__Relations__TargetLayer1Assignment_3 )
            // InternalCompras.g:4014:3: rule__Relations__TargetLayer1Assignment_3
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
    // InternalCompras.g:4022:1: rule__Relations__Group__4 : rule__Relations__Group__4__Impl rule__Relations__Group__5 ;
    public final void rule__Relations__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4026:1: ( rule__Relations__Group__4__Impl rule__Relations__Group__5 )
            // InternalCompras.g:4027:2: rule__Relations__Group__4__Impl rule__Relations__Group__5
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
    // InternalCompras.g:4034:1: rule__Relations__Group__4__Impl : ( ( rule__Relations__SourceLayer2Assignment_4 ) ) ;
    public final void rule__Relations__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4038:1: ( ( ( rule__Relations__SourceLayer2Assignment_4 ) ) )
            // InternalCompras.g:4039:1: ( ( rule__Relations__SourceLayer2Assignment_4 ) )
            {
            // InternalCompras.g:4039:1: ( ( rule__Relations__SourceLayer2Assignment_4 ) )
            // InternalCompras.g:4040:2: ( rule__Relations__SourceLayer2Assignment_4 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer2Assignment_4()); 
            // InternalCompras.g:4041:2: ( rule__Relations__SourceLayer2Assignment_4 )
            // InternalCompras.g:4041:3: rule__Relations__SourceLayer2Assignment_4
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
    // InternalCompras.g:4049:1: rule__Relations__Group__5 : rule__Relations__Group__5__Impl rule__Relations__Group__6 ;
    public final void rule__Relations__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4053:1: ( rule__Relations__Group__5__Impl rule__Relations__Group__6 )
            // InternalCompras.g:4054:2: rule__Relations__Group__5__Impl rule__Relations__Group__6
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
    // InternalCompras.g:4061:1: rule__Relations__Group__5__Impl : ( ( rule__Relations__RelationsType2Assignment_5 ) ) ;
    public final void rule__Relations__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4065:1: ( ( ( rule__Relations__RelationsType2Assignment_5 ) ) )
            // InternalCompras.g:4066:1: ( ( rule__Relations__RelationsType2Assignment_5 ) )
            {
            // InternalCompras.g:4066:1: ( ( rule__Relations__RelationsType2Assignment_5 ) )
            // InternalCompras.g:4067:2: ( rule__Relations__RelationsType2Assignment_5 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType2Assignment_5()); 
            // InternalCompras.g:4068:2: ( rule__Relations__RelationsType2Assignment_5 )
            // InternalCompras.g:4068:3: rule__Relations__RelationsType2Assignment_5
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
    // InternalCompras.g:4076:1: rule__Relations__Group__6 : rule__Relations__Group__6__Impl rule__Relations__Group__7 ;
    public final void rule__Relations__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4080:1: ( rule__Relations__Group__6__Impl rule__Relations__Group__7 )
            // InternalCompras.g:4081:2: rule__Relations__Group__6__Impl rule__Relations__Group__7
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
    // InternalCompras.g:4088:1: rule__Relations__Group__6__Impl : ( ( rule__Relations__TargetLayer2Assignment_6 ) ) ;
    public final void rule__Relations__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4092:1: ( ( ( rule__Relations__TargetLayer2Assignment_6 ) ) )
            // InternalCompras.g:4093:1: ( ( rule__Relations__TargetLayer2Assignment_6 ) )
            {
            // InternalCompras.g:4093:1: ( ( rule__Relations__TargetLayer2Assignment_6 ) )
            // InternalCompras.g:4094:2: ( rule__Relations__TargetLayer2Assignment_6 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer2Assignment_6()); 
            // InternalCompras.g:4095:2: ( rule__Relations__TargetLayer2Assignment_6 )
            // InternalCompras.g:4095:3: rule__Relations__TargetLayer2Assignment_6
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
    // InternalCompras.g:4103:1: rule__Relations__Group__7 : rule__Relations__Group__7__Impl rule__Relations__Group__8 ;
    public final void rule__Relations__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4107:1: ( rule__Relations__Group__7__Impl rule__Relations__Group__8 )
            // InternalCompras.g:4108:2: rule__Relations__Group__7__Impl rule__Relations__Group__8
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
    // InternalCompras.g:4115:1: rule__Relations__Group__7__Impl : ( ( rule__Relations__SourceLayer3Assignment_7 ) ) ;
    public final void rule__Relations__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4119:1: ( ( ( rule__Relations__SourceLayer3Assignment_7 ) ) )
            // InternalCompras.g:4120:1: ( ( rule__Relations__SourceLayer3Assignment_7 ) )
            {
            // InternalCompras.g:4120:1: ( ( rule__Relations__SourceLayer3Assignment_7 ) )
            // InternalCompras.g:4121:2: ( rule__Relations__SourceLayer3Assignment_7 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer3Assignment_7()); 
            // InternalCompras.g:4122:2: ( rule__Relations__SourceLayer3Assignment_7 )
            // InternalCompras.g:4122:3: rule__Relations__SourceLayer3Assignment_7
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
    // InternalCompras.g:4130:1: rule__Relations__Group__8 : rule__Relations__Group__8__Impl rule__Relations__Group__9 ;
    public final void rule__Relations__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4134:1: ( rule__Relations__Group__8__Impl rule__Relations__Group__9 )
            // InternalCompras.g:4135:2: rule__Relations__Group__8__Impl rule__Relations__Group__9
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
    // InternalCompras.g:4142:1: rule__Relations__Group__8__Impl : ( ( rule__Relations__RelationsType3Assignment_8 ) ) ;
    public final void rule__Relations__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4146:1: ( ( ( rule__Relations__RelationsType3Assignment_8 ) ) )
            // InternalCompras.g:4147:1: ( ( rule__Relations__RelationsType3Assignment_8 ) )
            {
            // InternalCompras.g:4147:1: ( ( rule__Relations__RelationsType3Assignment_8 ) )
            // InternalCompras.g:4148:2: ( rule__Relations__RelationsType3Assignment_8 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType3Assignment_8()); 
            // InternalCompras.g:4149:2: ( rule__Relations__RelationsType3Assignment_8 )
            // InternalCompras.g:4149:3: rule__Relations__RelationsType3Assignment_8
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
    // InternalCompras.g:4157:1: rule__Relations__Group__9 : rule__Relations__Group__9__Impl rule__Relations__Group__10 ;
    public final void rule__Relations__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4161:1: ( rule__Relations__Group__9__Impl rule__Relations__Group__10 )
            // InternalCompras.g:4162:2: rule__Relations__Group__9__Impl rule__Relations__Group__10
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
    // InternalCompras.g:4169:1: rule__Relations__Group__9__Impl : ( ( rule__Relations__TargetLayer3Assignment_9 ) ) ;
    public final void rule__Relations__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4173:1: ( ( ( rule__Relations__TargetLayer3Assignment_9 ) ) )
            // InternalCompras.g:4174:1: ( ( rule__Relations__TargetLayer3Assignment_9 ) )
            {
            // InternalCompras.g:4174:1: ( ( rule__Relations__TargetLayer3Assignment_9 ) )
            // InternalCompras.g:4175:2: ( rule__Relations__TargetLayer3Assignment_9 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer3Assignment_9()); 
            // InternalCompras.g:4176:2: ( rule__Relations__TargetLayer3Assignment_9 )
            // InternalCompras.g:4176:3: rule__Relations__TargetLayer3Assignment_9
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
    // InternalCompras.g:4184:1: rule__Relations__Group__10 : rule__Relations__Group__10__Impl rule__Relations__Group__11 ;
    public final void rule__Relations__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4188:1: ( rule__Relations__Group__10__Impl rule__Relations__Group__11 )
            // InternalCompras.g:4189:2: rule__Relations__Group__10__Impl rule__Relations__Group__11
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
    // InternalCompras.g:4196:1: rule__Relations__Group__10__Impl : ( ( rule__Relations__SourceLayer4Assignment_10 ) ) ;
    public final void rule__Relations__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4200:1: ( ( ( rule__Relations__SourceLayer4Assignment_10 ) ) )
            // InternalCompras.g:4201:1: ( ( rule__Relations__SourceLayer4Assignment_10 ) )
            {
            // InternalCompras.g:4201:1: ( ( rule__Relations__SourceLayer4Assignment_10 ) )
            // InternalCompras.g:4202:2: ( rule__Relations__SourceLayer4Assignment_10 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer4Assignment_10()); 
            // InternalCompras.g:4203:2: ( rule__Relations__SourceLayer4Assignment_10 )
            // InternalCompras.g:4203:3: rule__Relations__SourceLayer4Assignment_10
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
    // InternalCompras.g:4211:1: rule__Relations__Group__11 : rule__Relations__Group__11__Impl rule__Relations__Group__12 ;
    public final void rule__Relations__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4215:1: ( rule__Relations__Group__11__Impl rule__Relations__Group__12 )
            // InternalCompras.g:4216:2: rule__Relations__Group__11__Impl rule__Relations__Group__12
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
    // InternalCompras.g:4223:1: rule__Relations__Group__11__Impl : ( ( rule__Relations__RelationsType4Assignment_11 ) ) ;
    public final void rule__Relations__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4227:1: ( ( ( rule__Relations__RelationsType4Assignment_11 ) ) )
            // InternalCompras.g:4228:1: ( ( rule__Relations__RelationsType4Assignment_11 ) )
            {
            // InternalCompras.g:4228:1: ( ( rule__Relations__RelationsType4Assignment_11 ) )
            // InternalCompras.g:4229:2: ( rule__Relations__RelationsType4Assignment_11 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType4Assignment_11()); 
            // InternalCompras.g:4230:2: ( rule__Relations__RelationsType4Assignment_11 )
            // InternalCompras.g:4230:3: rule__Relations__RelationsType4Assignment_11
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
    // InternalCompras.g:4238:1: rule__Relations__Group__12 : rule__Relations__Group__12__Impl rule__Relations__Group__13 ;
    public final void rule__Relations__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4242:1: ( rule__Relations__Group__12__Impl rule__Relations__Group__13 )
            // InternalCompras.g:4243:2: rule__Relations__Group__12__Impl rule__Relations__Group__13
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
    // InternalCompras.g:4250:1: rule__Relations__Group__12__Impl : ( ( rule__Relations__TargetLayer4Assignment_12 ) ) ;
    public final void rule__Relations__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4254:1: ( ( ( rule__Relations__TargetLayer4Assignment_12 ) ) )
            // InternalCompras.g:4255:1: ( ( rule__Relations__TargetLayer4Assignment_12 ) )
            {
            // InternalCompras.g:4255:1: ( ( rule__Relations__TargetLayer4Assignment_12 ) )
            // InternalCompras.g:4256:2: ( rule__Relations__TargetLayer4Assignment_12 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer4Assignment_12()); 
            // InternalCompras.g:4257:2: ( rule__Relations__TargetLayer4Assignment_12 )
            // InternalCompras.g:4257:3: rule__Relations__TargetLayer4Assignment_12
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
    // InternalCompras.g:4265:1: rule__Relations__Group__13 : rule__Relations__Group__13__Impl rule__Relations__Group__14 ;
    public final void rule__Relations__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4269:1: ( rule__Relations__Group__13__Impl rule__Relations__Group__14 )
            // InternalCompras.g:4270:2: rule__Relations__Group__13__Impl rule__Relations__Group__14
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
    // InternalCompras.g:4277:1: rule__Relations__Group__13__Impl : ( ( rule__Relations__SourceLayer5Assignment_13 ) ) ;
    public final void rule__Relations__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4281:1: ( ( ( rule__Relations__SourceLayer5Assignment_13 ) ) )
            // InternalCompras.g:4282:1: ( ( rule__Relations__SourceLayer5Assignment_13 ) )
            {
            // InternalCompras.g:4282:1: ( ( rule__Relations__SourceLayer5Assignment_13 ) )
            // InternalCompras.g:4283:2: ( rule__Relations__SourceLayer5Assignment_13 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer5Assignment_13()); 
            // InternalCompras.g:4284:2: ( rule__Relations__SourceLayer5Assignment_13 )
            // InternalCompras.g:4284:3: rule__Relations__SourceLayer5Assignment_13
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
    // InternalCompras.g:4292:1: rule__Relations__Group__14 : rule__Relations__Group__14__Impl rule__Relations__Group__15 ;
    public final void rule__Relations__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4296:1: ( rule__Relations__Group__14__Impl rule__Relations__Group__15 )
            // InternalCompras.g:4297:2: rule__Relations__Group__14__Impl rule__Relations__Group__15
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
    // InternalCompras.g:4304:1: rule__Relations__Group__14__Impl : ( ( rule__Relations__RelationsType5Assignment_14 ) ) ;
    public final void rule__Relations__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4308:1: ( ( ( rule__Relations__RelationsType5Assignment_14 ) ) )
            // InternalCompras.g:4309:1: ( ( rule__Relations__RelationsType5Assignment_14 ) )
            {
            // InternalCompras.g:4309:1: ( ( rule__Relations__RelationsType5Assignment_14 ) )
            // InternalCompras.g:4310:2: ( rule__Relations__RelationsType5Assignment_14 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType5Assignment_14()); 
            // InternalCompras.g:4311:2: ( rule__Relations__RelationsType5Assignment_14 )
            // InternalCompras.g:4311:3: rule__Relations__RelationsType5Assignment_14
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
    // InternalCompras.g:4319:1: rule__Relations__Group__15 : rule__Relations__Group__15__Impl rule__Relations__Group__16 ;
    public final void rule__Relations__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4323:1: ( rule__Relations__Group__15__Impl rule__Relations__Group__16 )
            // InternalCompras.g:4324:2: rule__Relations__Group__15__Impl rule__Relations__Group__16
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
    // InternalCompras.g:4331:1: rule__Relations__Group__15__Impl : ( ( rule__Relations__TargetLayer5Assignment_15 ) ) ;
    public final void rule__Relations__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4335:1: ( ( ( rule__Relations__TargetLayer5Assignment_15 ) ) )
            // InternalCompras.g:4336:1: ( ( rule__Relations__TargetLayer5Assignment_15 ) )
            {
            // InternalCompras.g:4336:1: ( ( rule__Relations__TargetLayer5Assignment_15 ) )
            // InternalCompras.g:4337:2: ( rule__Relations__TargetLayer5Assignment_15 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer5Assignment_15()); 
            // InternalCompras.g:4338:2: ( rule__Relations__TargetLayer5Assignment_15 )
            // InternalCompras.g:4338:3: rule__Relations__TargetLayer5Assignment_15
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
    // InternalCompras.g:4346:1: rule__Relations__Group__16 : rule__Relations__Group__16__Impl ;
    public final void rule__Relations__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4350:1: ( rule__Relations__Group__16__Impl )
            // InternalCompras.g:4351:2: rule__Relations__Group__16__Impl
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
    // InternalCompras.g:4357:1: rule__Relations__Group__16__Impl : ( '}' ) ;
    public final void rule__Relations__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4361:1: ( ( '}' ) )
            // InternalCompras.g:4362:1: ( '}' )
            {
            // InternalCompras.g:4362:1: ( '}' )
            // InternalCompras.g:4363:2: '}'
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
    // InternalCompras.g:4373:1: rule__Technology__Group__0 : rule__Technology__Group__0__Impl rule__Technology__Group__1 ;
    public final void rule__Technology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4377:1: ( rule__Technology__Group__0__Impl rule__Technology__Group__1 )
            // InternalCompras.g:4378:2: rule__Technology__Group__0__Impl rule__Technology__Group__1
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
    // InternalCompras.g:4385:1: rule__Technology__Group__0__Impl : ( '{' ) ;
    public final void rule__Technology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4389:1: ( ( '{' ) )
            // InternalCompras.g:4390:1: ( '{' )
            {
            // InternalCompras.g:4390:1: ( '{' )
            // InternalCompras.g:4391:2: '{'
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
    // InternalCompras.g:4400:1: rule__Technology__Group__1 : rule__Technology__Group__1__Impl rule__Technology__Group__2 ;
    public final void rule__Technology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4404:1: ( rule__Technology__Group__1__Impl rule__Technology__Group__2 )
            // InternalCompras.g:4405:2: rule__Technology__Group__1__Impl rule__Technology__Group__2
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
    // InternalCompras.g:4412:1: rule__Technology__Group__1__Impl : ( ( rule__Technology__Group_1__0 )? ) ;
    public final void rule__Technology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4416:1: ( ( ( rule__Technology__Group_1__0 )? ) )
            // InternalCompras.g:4417:1: ( ( rule__Technology__Group_1__0 )? )
            {
            // InternalCompras.g:4417:1: ( ( rule__Technology__Group_1__0 )? )
            // InternalCompras.g:4418:2: ( rule__Technology__Group_1__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_1()); 
            // InternalCompras.g:4419:2: ( rule__Technology__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCompras.g:4419:3: rule__Technology__Group_1__0
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
    // InternalCompras.g:4427:1: rule__Technology__Group__2 : rule__Technology__Group__2__Impl rule__Technology__Group__3 ;
    public final void rule__Technology__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4431:1: ( rule__Technology__Group__2__Impl rule__Technology__Group__3 )
            // InternalCompras.g:4432:2: rule__Technology__Group__2__Impl rule__Technology__Group__3
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
    // InternalCompras.g:4439:1: rule__Technology__Group__2__Impl : ( ( rule__Technology__Group_2__0 )? ) ;
    public final void rule__Technology__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4443:1: ( ( ( rule__Technology__Group_2__0 )? ) )
            // InternalCompras.g:4444:1: ( ( rule__Technology__Group_2__0 )? )
            {
            // InternalCompras.g:4444:1: ( ( rule__Technology__Group_2__0 )? )
            // InternalCompras.g:4445:2: ( rule__Technology__Group_2__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2()); 
            // InternalCompras.g:4446:2: ( rule__Technology__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCompras.g:4446:3: rule__Technology__Group_2__0
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
    // InternalCompras.g:4454:1: rule__Technology__Group__3 : rule__Technology__Group__3__Impl ;
    public final void rule__Technology__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4458:1: ( rule__Technology__Group__3__Impl )
            // InternalCompras.g:4459:2: rule__Technology__Group__3__Impl
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
    // InternalCompras.g:4465:1: rule__Technology__Group__3__Impl : ( '}' ) ;
    public final void rule__Technology__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4469:1: ( ( '}' ) )
            // InternalCompras.g:4470:1: ( '}' )
            {
            // InternalCompras.g:4470:1: ( '}' )
            // InternalCompras.g:4471:2: '}'
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
    // InternalCompras.g:4481:1: rule__Technology__Group_1__0 : rule__Technology__Group_1__0__Impl rule__Technology__Group_1__1 ;
    public final void rule__Technology__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4485:1: ( rule__Technology__Group_1__0__Impl rule__Technology__Group_1__1 )
            // InternalCompras.g:4486:2: rule__Technology__Group_1__0__Impl rule__Technology__Group_1__1
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
    // InternalCompras.g:4493:1: rule__Technology__Group_1__0__Impl : ( 'AspNet' ) ;
    public final void rule__Technology__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4497:1: ( ( 'AspNet' ) )
            // InternalCompras.g:4498:1: ( 'AspNet' )
            {
            // InternalCompras.g:4498:1: ( 'AspNet' )
            // InternalCompras.g:4499:2: 'AspNet'
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
    // InternalCompras.g:4508:1: rule__Technology__Group_1__1 : rule__Technology__Group_1__1__Impl rule__Technology__Group_1__2 ;
    public final void rule__Technology__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4512:1: ( rule__Technology__Group_1__1__Impl rule__Technology__Group_1__2 )
            // InternalCompras.g:4513:2: rule__Technology__Group_1__1__Impl rule__Technology__Group_1__2
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
    // InternalCompras.g:4520:1: rule__Technology__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4524:1: ( ( ':' ) )
            // InternalCompras.g:4525:1: ( ':' )
            {
            // InternalCompras.g:4525:1: ( ':' )
            // InternalCompras.g:4526:2: ':'
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
    // InternalCompras.g:4535:1: rule__Technology__Group_1__2 : rule__Technology__Group_1__2__Impl rule__Technology__Group_1__3 ;
    public final void rule__Technology__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4539:1: ( rule__Technology__Group_1__2__Impl rule__Technology__Group_1__3 )
            // InternalCompras.g:4540:2: rule__Technology__Group_1__2__Impl rule__Technology__Group_1__3
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
    // InternalCompras.g:4547:1: rule__Technology__Group_1__2__Impl : ( '{' ) ;
    public final void rule__Technology__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4551:1: ( ( '{' ) )
            // InternalCompras.g:4552:1: ( '{' )
            {
            // InternalCompras.g:4552:1: ( '{' )
            // InternalCompras.g:4553:2: '{'
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
    // InternalCompras.g:4562:1: rule__Technology__Group_1__3 : rule__Technology__Group_1__3__Impl rule__Technology__Group_1__4 ;
    public final void rule__Technology__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4566:1: ( rule__Technology__Group_1__3__Impl rule__Technology__Group_1__4 )
            // InternalCompras.g:4567:2: rule__Technology__Group_1__3__Impl rule__Technology__Group_1__4
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
    // InternalCompras.g:4574:1: rule__Technology__Group_1__3__Impl : ( ( rule__Technology__ModuleTechAssignment_1_3 )* ) ;
    public final void rule__Technology__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4578:1: ( ( ( rule__Technology__ModuleTechAssignment_1_3 )* ) )
            // InternalCompras.g:4579:1: ( ( rule__Technology__ModuleTechAssignment_1_3 )* )
            {
            // InternalCompras.g:4579:1: ( ( rule__Technology__ModuleTechAssignment_1_3 )* )
            // InternalCompras.g:4580:2: ( rule__Technology__ModuleTechAssignment_1_3 )*
            {
             before(grammarAccess.getTechnologyAccess().getModuleTechAssignment_1_3()); 
            // InternalCompras.g:4581:2: ( rule__Technology__ModuleTechAssignment_1_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCompras.g:4581:3: rule__Technology__ModuleTechAssignment_1_3
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
    // InternalCompras.g:4589:1: rule__Technology__Group_1__4 : rule__Technology__Group_1__4__Impl ;
    public final void rule__Technology__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4593:1: ( rule__Technology__Group_1__4__Impl )
            // InternalCompras.g:4594:2: rule__Technology__Group_1__4__Impl
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
    // InternalCompras.g:4600:1: rule__Technology__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Technology__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4604:1: ( ( '}' ) )
            // InternalCompras.g:4605:1: ( '}' )
            {
            // InternalCompras.g:4605:1: ( '}' )
            // InternalCompras.g:4606:2: '}'
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
    // InternalCompras.g:4616:1: rule__Technology__Group_2__0 : rule__Technology__Group_2__0__Impl rule__Technology__Group_2__1 ;
    public final void rule__Technology__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4620:1: ( rule__Technology__Group_2__0__Impl rule__Technology__Group_2__1 )
            // InternalCompras.g:4621:2: rule__Technology__Group_2__0__Impl rule__Technology__Group_2__1
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
    // InternalCompras.g:4628:1: rule__Technology__Group_2__0__Impl : ( 'Database' ) ;
    public final void rule__Technology__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4632:1: ( ( 'Database' ) )
            // InternalCompras.g:4633:1: ( 'Database' )
            {
            // InternalCompras.g:4633:1: ( 'Database' )
            // InternalCompras.g:4634:2: 'Database'
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
    // InternalCompras.g:4643:1: rule__Technology__Group_2__1 : rule__Technology__Group_2__1__Impl rule__Technology__Group_2__2 ;
    public final void rule__Technology__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4647:1: ( rule__Technology__Group_2__1__Impl rule__Technology__Group_2__2 )
            // InternalCompras.g:4648:2: rule__Technology__Group_2__1__Impl rule__Technology__Group_2__2
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
    // InternalCompras.g:4655:1: rule__Technology__Group_2__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4659:1: ( ( ':' ) )
            // InternalCompras.g:4660:1: ( ':' )
            {
            // InternalCompras.g:4660:1: ( ':' )
            // InternalCompras.g:4661:2: ':'
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
    // InternalCompras.g:4670:1: rule__Technology__Group_2__2 : rule__Technology__Group_2__2__Impl rule__Technology__Group_2__3 ;
    public final void rule__Technology__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4674:1: ( rule__Technology__Group_2__2__Impl rule__Technology__Group_2__3 )
            // InternalCompras.g:4675:2: rule__Technology__Group_2__2__Impl rule__Technology__Group_2__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalCompras.g:4682:1: rule__Technology__Group_2__2__Impl : ( '{' ) ;
    public final void rule__Technology__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4686:1: ( ( '{' ) )
            // InternalCompras.g:4687:1: ( '{' )
            {
            // InternalCompras.g:4687:1: ( '{' )
            // InternalCompras.g:4688:2: '{'
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
    // InternalCompras.g:4697:1: rule__Technology__Group_2__3 : rule__Technology__Group_2__3__Impl rule__Technology__Group_2__4 ;
    public final void rule__Technology__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4701:1: ( rule__Technology__Group_2__3__Impl rule__Technology__Group_2__4 )
            // InternalCompras.g:4702:2: rule__Technology__Group_2__3__Impl rule__Technology__Group_2__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalCompras.g:4709:1: rule__Technology__Group_2__3__Impl : ( ( rule__Technology__Group_2_3__0 )? ) ;
    public final void rule__Technology__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4713:1: ( ( ( rule__Technology__Group_2_3__0 )? ) )
            // InternalCompras.g:4714:1: ( ( rule__Technology__Group_2_3__0 )? )
            {
            // InternalCompras.g:4714:1: ( ( rule__Technology__Group_2_3__0 )? )
            // InternalCompras.g:4715:2: ( rule__Technology__Group_2_3__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2_3()); 
            // InternalCompras.g:4716:2: ( rule__Technology__Group_2_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCompras.g:4716:3: rule__Technology__Group_2_3__0
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
    // InternalCompras.g:4724:1: rule__Technology__Group_2__4 : rule__Technology__Group_2__4__Impl rule__Technology__Group_2__5 ;
    public final void rule__Technology__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4728:1: ( rule__Technology__Group_2__4__Impl rule__Technology__Group_2__5 )
            // InternalCompras.g:4729:2: rule__Technology__Group_2__4__Impl rule__Technology__Group_2__5
            {
            pushFollow(FOLLOW_42);
            rule__Technology__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2__5();

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
    // InternalCompras.g:4736:1: rule__Technology__Group_2__4__Impl : ( ( rule__Technology__Group_2_4__0 )? ) ;
    public final void rule__Technology__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4740:1: ( ( ( rule__Technology__Group_2_4__0 )? ) )
            // InternalCompras.g:4741:1: ( ( rule__Technology__Group_2_4__0 )? )
            {
            // InternalCompras.g:4741:1: ( ( rule__Technology__Group_2_4__0 )? )
            // InternalCompras.g:4742:2: ( rule__Technology__Group_2_4__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2_4()); 
            // InternalCompras.g:4743:2: ( rule__Technology__Group_2_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==49) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCompras.g:4743:3: rule__Technology__Group_2_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Technology__Group_2_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTechnologyAccess().getGroup_2_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Technology__Group_2__5"
    // InternalCompras.g:4751:1: rule__Technology__Group_2__5 : rule__Technology__Group_2__5__Impl ;
    public final void rule__Technology__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4755:1: ( rule__Technology__Group_2__5__Impl )
            // InternalCompras.g:4756:2: rule__Technology__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Group_2__5__Impl();

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
    // $ANTLR end "rule__Technology__Group_2__5"


    // $ANTLR start "rule__Technology__Group_2__5__Impl"
    // InternalCompras.g:4762:1: rule__Technology__Group_2__5__Impl : ( '}' ) ;
    public final void rule__Technology__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4766:1: ( ( '}' ) )
            // InternalCompras.g:4767:1: ( '}' )
            {
            // InternalCompras.g:4767:1: ( '}' )
            // InternalCompras.g:4768:2: '}'
            {
             before(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_2_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group_2__5__Impl"


    // $ANTLR start "rule__Technology__Group_2_3__0"
    // InternalCompras.g:4778:1: rule__Technology__Group_2_3__0 : rule__Technology__Group_2_3__0__Impl rule__Technology__Group_2_3__1 ;
    public final void rule__Technology__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4782:1: ( rule__Technology__Group_2_3__0__Impl rule__Technology__Group_2_3__1 )
            // InternalCompras.g:4783:2: rule__Technology__Group_2_3__0__Impl rule__Technology__Group_2_3__1
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
    // InternalCompras.g:4790:1: rule__Technology__Group_2_3__0__Impl : ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) ) ;
    public final void rule__Technology__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4794:1: ( ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) ) )
            // InternalCompras.g:4795:1: ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) )
            {
            // InternalCompras.g:4795:1: ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) )
            // InternalCompras.g:4796:2: ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 )
            {
             before(grammarAccess.getTechnologyAccess().getDbConnectorSegmentLayerAssignment_2_3_0()); 
            // InternalCompras.g:4797:2: ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 )
            // InternalCompras.g:4797:3: rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0
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
    // InternalCompras.g:4805:1: rule__Technology__Group_2_3__1 : rule__Technology__Group_2_3__1__Impl rule__Technology__Group_2_3__2 ;
    public final void rule__Technology__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4809:1: ( rule__Technology__Group_2_3__1__Impl rule__Technology__Group_2_3__2 )
            // InternalCompras.g:4810:2: rule__Technology__Group_2_3__1__Impl rule__Technology__Group_2_3__2
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
    // InternalCompras.g:4817:1: rule__Technology__Group_2_3__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4821:1: ( ( ':' ) )
            // InternalCompras.g:4822:1: ( ':' )
            {
            // InternalCompras.g:4822:1: ( ':' )
            // InternalCompras.g:4823:2: ':'
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
    // InternalCompras.g:4832:1: rule__Technology__Group_2_3__2 : rule__Technology__Group_2_3__2__Impl rule__Technology__Group_2_3__3 ;
    public final void rule__Technology__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4836:1: ( rule__Technology__Group_2_3__2__Impl rule__Technology__Group_2_3__3 )
            // InternalCompras.g:4837:2: rule__Technology__Group_2_3__2__Impl rule__Technology__Group_2_3__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalCompras.g:4844:1: rule__Technology__Group_2_3__2__Impl : ( '{' ) ;
    public final void rule__Technology__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4848:1: ( ( '{' ) )
            // InternalCompras.g:4849:1: ( '{' )
            {
            // InternalCompras.g:4849:1: ( '{' )
            // InternalCompras.g:4850:2: '{'
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
    // InternalCompras.g:4859:1: rule__Technology__Group_2_3__3 : rule__Technology__Group_2_3__3__Impl rule__Technology__Group_2_3__4 ;
    public final void rule__Technology__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4863:1: ( rule__Technology__Group_2_3__3__Impl rule__Technology__Group_2_3__4 )
            // InternalCompras.g:4864:2: rule__Technology__Group_2_3__3__Impl rule__Technology__Group_2_3__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalCompras.g:4871:1: rule__Technology__Group_2_3__3__Impl : ( ( rule__Technology__Group_2_3_3__0 )? ) ;
    public final void rule__Technology__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4875:1: ( ( ( rule__Technology__Group_2_3_3__0 )? ) )
            // InternalCompras.g:4876:1: ( ( rule__Technology__Group_2_3_3__0 )? )
            {
            // InternalCompras.g:4876:1: ( ( rule__Technology__Group_2_3_3__0 )? )
            // InternalCompras.g:4877:2: ( rule__Technology__Group_2_3_3__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2_3_3()); 
            // InternalCompras.g:4878:2: ( rule__Technology__Group_2_3_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==47) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCompras.g:4878:3: rule__Technology__Group_2_3_3__0
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
    // InternalCompras.g:4886:1: rule__Technology__Group_2_3__4 : rule__Technology__Group_2_3__4__Impl rule__Technology__Group_2_3__5 ;
    public final void rule__Technology__Group_2_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4890:1: ( rule__Technology__Group_2_3__4__Impl rule__Technology__Group_2_3__5 )
            // InternalCompras.g:4891:2: rule__Technology__Group_2_3__4__Impl rule__Technology__Group_2_3__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalCompras.g:4898:1: rule__Technology__Group_2_3__4__Impl : ( ( rule__Technology__Group_2_3_4__0 )? ) ;
    public final void rule__Technology__Group_2_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4902:1: ( ( ( rule__Technology__Group_2_3_4__0 )? ) )
            // InternalCompras.g:4903:1: ( ( rule__Technology__Group_2_3_4__0 )? )
            {
            // InternalCompras.g:4903:1: ( ( rule__Technology__Group_2_3_4__0 )? )
            // InternalCompras.g:4904:2: ( rule__Technology__Group_2_3_4__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2_3_4()); 
            // InternalCompras.g:4905:2: ( rule__Technology__Group_2_3_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCompras.g:4905:3: rule__Technology__Group_2_3_4__0
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
    // InternalCompras.g:4913:1: rule__Technology__Group_2_3__5 : rule__Technology__Group_2_3__5__Impl ;
    public final void rule__Technology__Group_2_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4917:1: ( rule__Technology__Group_2_3__5__Impl )
            // InternalCompras.g:4918:2: rule__Technology__Group_2_3__5__Impl
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
    // InternalCompras.g:4924:1: rule__Technology__Group_2_3__5__Impl : ( '}' ) ;
    public final void rule__Technology__Group_2_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4928:1: ( ( '}' ) )
            // InternalCompras.g:4929:1: ( '}' )
            {
            // InternalCompras.g:4929:1: ( '}' )
            // InternalCompras.g:4930:2: '}'
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
    // InternalCompras.g:4940:1: rule__Technology__Group_2_3_3__0 : rule__Technology__Group_2_3_3__0__Impl rule__Technology__Group_2_3_3__1 ;
    public final void rule__Technology__Group_2_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4944:1: ( rule__Technology__Group_2_3_3__0__Impl rule__Technology__Group_2_3_3__1 )
            // InternalCompras.g:4945:2: rule__Technology__Group_2_3_3__0__Impl rule__Technology__Group_2_3_3__1
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
    // InternalCompras.g:4952:1: rule__Technology__Group_2_3_3__0__Impl : ( 'DatabaseRDBMSType' ) ;
    public final void rule__Technology__Group_2_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4956:1: ( ( 'DatabaseRDBMSType' ) )
            // InternalCompras.g:4957:1: ( 'DatabaseRDBMSType' )
            {
            // InternalCompras.g:4957:1: ( 'DatabaseRDBMSType' )
            // InternalCompras.g:4958:2: 'DatabaseRDBMSType'
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
    // InternalCompras.g:4967:1: rule__Technology__Group_2_3_3__1 : rule__Technology__Group_2_3_3__1__Impl rule__Technology__Group_2_3_3__2 ;
    public final void rule__Technology__Group_2_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4971:1: ( rule__Technology__Group_2_3_3__1__Impl rule__Technology__Group_2_3_3__2 )
            // InternalCompras.g:4972:2: rule__Technology__Group_2_3_3__1__Impl rule__Technology__Group_2_3_3__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalCompras.g:4979:1: rule__Technology__Group_2_3_3__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4983:1: ( ( ':' ) )
            // InternalCompras.g:4984:1: ( ':' )
            {
            // InternalCompras.g:4984:1: ( ':' )
            // InternalCompras.g:4985:2: ':'
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
    // InternalCompras.g:4994:1: rule__Technology__Group_2_3_3__2 : rule__Technology__Group_2_3_3__2__Impl ;
    public final void rule__Technology__Group_2_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4998:1: ( rule__Technology__Group_2_3_3__2__Impl )
            // InternalCompras.g:4999:2: rule__Technology__Group_2_3_3__2__Impl
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
    // InternalCompras.g:5005:1: rule__Technology__Group_2_3_3__2__Impl : ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) ) ;
    public final void rule__Technology__Group_2_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5009:1: ( ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) ) )
            // InternalCompras.g:5010:1: ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) )
            {
            // InternalCompras.g:5010:1: ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) )
            // InternalCompras.g:5011:2: ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 )
            {
             before(grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeAssignment_2_3_3_2()); 
            // InternalCompras.g:5012:2: ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 )
            // InternalCompras.g:5012:3: rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2
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
    // InternalCompras.g:5021:1: rule__Technology__Group_2_3_4__0 : rule__Technology__Group_2_3_4__0__Impl rule__Technology__Group_2_3_4__1 ;
    public final void rule__Technology__Group_2_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5025:1: ( rule__Technology__Group_2_3_4__0__Impl rule__Technology__Group_2_3_4__1 )
            // InternalCompras.g:5026:2: rule__Technology__Group_2_3_4__0__Impl rule__Technology__Group_2_3_4__1
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
    // InternalCompras.g:5033:1: rule__Technology__Group_2_3_4__0__Impl : ( 'ConnectionString' ) ;
    public final void rule__Technology__Group_2_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5037:1: ( ( 'ConnectionString' ) )
            // InternalCompras.g:5038:1: ( 'ConnectionString' )
            {
            // InternalCompras.g:5038:1: ( 'ConnectionString' )
            // InternalCompras.g:5039:2: 'ConnectionString'
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
    // InternalCompras.g:5048:1: rule__Technology__Group_2_3_4__1 : rule__Technology__Group_2_3_4__1__Impl rule__Technology__Group_2_3_4__2 ;
    public final void rule__Technology__Group_2_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5052:1: ( rule__Technology__Group_2_3_4__1__Impl rule__Technology__Group_2_3_4__2 )
            // InternalCompras.g:5053:2: rule__Technology__Group_2_3_4__1__Impl rule__Technology__Group_2_3_4__2
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
    // InternalCompras.g:5060:1: rule__Technology__Group_2_3_4__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5064:1: ( ( ':' ) )
            // InternalCompras.g:5065:1: ( ':' )
            {
            // InternalCompras.g:5065:1: ( ':' )
            // InternalCompras.g:5066:2: ':'
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
    // InternalCompras.g:5075:1: rule__Technology__Group_2_3_4__2 : rule__Technology__Group_2_3_4__2__Impl ;
    public final void rule__Technology__Group_2_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5079:1: ( rule__Technology__Group_2_3_4__2__Impl )
            // InternalCompras.g:5080:2: rule__Technology__Group_2_3_4__2__Impl
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
    // InternalCompras.g:5086:1: rule__Technology__Group_2_3_4__2__Impl : ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) ) ;
    public final void rule__Technology__Group_2_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5090:1: ( ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) ) )
            // InternalCompras.g:5091:1: ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) )
            {
            // InternalCompras.g:5091:1: ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) )
            // InternalCompras.g:5092:2: ( rule__Technology__ConnectionStringAssignment_2_3_4_2 )
            {
             before(grammarAccess.getTechnologyAccess().getConnectionStringAssignment_2_3_4_2()); 
            // InternalCompras.g:5093:2: ( rule__Technology__ConnectionStringAssignment_2_3_4_2 )
            // InternalCompras.g:5093:3: rule__Technology__ConnectionStringAssignment_2_3_4_2
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


    // $ANTLR start "rule__Technology__Group_2_4__0"
    // InternalCompras.g:5102:1: rule__Technology__Group_2_4__0 : rule__Technology__Group_2_4__0__Impl rule__Technology__Group_2_4__1 ;
    public final void rule__Technology__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5106:1: ( rule__Technology__Group_2_4__0__Impl rule__Technology__Group_2_4__1 )
            // InternalCompras.g:5107:2: rule__Technology__Group_2_4__0__Impl rule__Technology__Group_2_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Technology__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_4__1();

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
    // $ANTLR end "rule__Technology__Group_2_4__0"


    // $ANTLR start "rule__Technology__Group_2_4__0__Impl"
    // InternalCompras.g:5114:1: rule__Technology__Group_2_4__0__Impl : ( 'DataFileSeed' ) ;
    public final void rule__Technology__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5118:1: ( ( 'DataFileSeed' ) )
            // InternalCompras.g:5119:1: ( 'DataFileSeed' )
            {
            // InternalCompras.g:5119:1: ( 'DataFileSeed' )
            // InternalCompras.g:5120:2: 'DataFileSeed'
            {
             before(grammarAccess.getTechnologyAccess().getDataFileSeedKeyword_2_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getDataFileSeedKeyword_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group_2_4__0__Impl"


    // $ANTLR start "rule__Technology__Group_2_4__1"
    // InternalCompras.g:5129:1: rule__Technology__Group_2_4__1 : rule__Technology__Group_2_4__1__Impl rule__Technology__Group_2_4__2 ;
    public final void rule__Technology__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5133:1: ( rule__Technology__Group_2_4__1__Impl rule__Technology__Group_2_4__2 )
            // InternalCompras.g:5134:2: rule__Technology__Group_2_4__1__Impl rule__Technology__Group_2_4__2
            {
            pushFollow(FOLLOW_23);
            rule__Technology__Group_2_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_4__2();

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
    // $ANTLR end "rule__Technology__Group_2_4__1"


    // $ANTLR start "rule__Technology__Group_2_4__1__Impl"
    // InternalCompras.g:5141:1: rule__Technology__Group_2_4__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5145:1: ( ( ':' ) )
            // InternalCompras.g:5146:1: ( ':' )
            {
            // InternalCompras.g:5146:1: ( ':' )
            // InternalCompras.g:5147:2: ':'
            {
             before(grammarAccess.getTechnologyAccess().getColonKeyword_2_4_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getColonKeyword_2_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group_2_4__1__Impl"


    // $ANTLR start "rule__Technology__Group_2_4__2"
    // InternalCompras.g:5156:1: rule__Technology__Group_2_4__2 : rule__Technology__Group_2_4__2__Impl ;
    public final void rule__Technology__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5160:1: ( rule__Technology__Group_2_4__2__Impl )
            // InternalCompras.g:5161:2: rule__Technology__Group_2_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Group_2_4__2__Impl();

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
    // $ANTLR end "rule__Technology__Group_2_4__2"


    // $ANTLR start "rule__Technology__Group_2_4__2__Impl"
    // InternalCompras.g:5167:1: rule__Technology__Group_2_4__2__Impl : ( ( rule__Technology__DataFileSeedAssignment_2_4_2 ) ) ;
    public final void rule__Technology__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5171:1: ( ( ( rule__Technology__DataFileSeedAssignment_2_4_2 ) ) )
            // InternalCompras.g:5172:1: ( ( rule__Technology__DataFileSeedAssignment_2_4_2 ) )
            {
            // InternalCompras.g:5172:1: ( ( rule__Technology__DataFileSeedAssignment_2_4_2 ) )
            // InternalCompras.g:5173:2: ( rule__Technology__DataFileSeedAssignment_2_4_2 )
            {
             before(grammarAccess.getTechnologyAccess().getDataFileSeedAssignment_2_4_2()); 
            // InternalCompras.g:5174:2: ( rule__Technology__DataFileSeedAssignment_2_4_2 )
            // InternalCompras.g:5174:3: rule__Technology__DataFileSeedAssignment_2_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Technology__DataFileSeedAssignment_2_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyAccess().getDataFileSeedAssignment_2_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group_2_4__2__Impl"


    // $ANTLR start "rule__ModuleTech__Group__0"
    // InternalCompras.g:5183:1: rule__ModuleTech__Group__0 : rule__ModuleTech__Group__0__Impl rule__ModuleTech__Group__1 ;
    public final void rule__ModuleTech__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5187:1: ( rule__ModuleTech__Group__0__Impl rule__ModuleTech__Group__1 )
            // InternalCompras.g:5188:2: rule__ModuleTech__Group__0__Impl rule__ModuleTech__Group__1
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
    // InternalCompras.g:5195:1: rule__ModuleTech__Group__0__Impl : ( 'Module' ) ;
    public final void rule__ModuleTech__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5199:1: ( ( 'Module' ) )
            // InternalCompras.g:5200:1: ( 'Module' )
            {
            // InternalCompras.g:5200:1: ( 'Module' )
            // InternalCompras.g:5201:2: 'Module'
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
    // InternalCompras.g:5210:1: rule__ModuleTech__Group__1 : rule__ModuleTech__Group__1__Impl rule__ModuleTech__Group__2 ;
    public final void rule__ModuleTech__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5214:1: ( rule__ModuleTech__Group__1__Impl rule__ModuleTech__Group__2 )
            // InternalCompras.g:5215:2: rule__ModuleTech__Group__1__Impl rule__ModuleTech__Group__2
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
    // InternalCompras.g:5222:1: rule__ModuleTech__Group__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5226:1: ( ( ':' ) )
            // InternalCompras.g:5227:1: ( ':' )
            {
            // InternalCompras.g:5227:1: ( ':' )
            // InternalCompras.g:5228:2: ':'
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
    // InternalCompras.g:5237:1: rule__ModuleTech__Group__2 : rule__ModuleTech__Group__2__Impl rule__ModuleTech__Group__3 ;
    public final void rule__ModuleTech__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5241:1: ( rule__ModuleTech__Group__2__Impl rule__ModuleTech__Group__3 )
            // InternalCompras.g:5242:2: rule__ModuleTech__Group__2__Impl rule__ModuleTech__Group__3
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
    // InternalCompras.g:5249:1: rule__ModuleTech__Group__2__Impl : ( ( rule__ModuleTech__NameAssignment_2 ) ) ;
    public final void rule__ModuleTech__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5253:1: ( ( ( rule__ModuleTech__NameAssignment_2 ) ) )
            // InternalCompras.g:5254:1: ( ( rule__ModuleTech__NameAssignment_2 ) )
            {
            // InternalCompras.g:5254:1: ( ( rule__ModuleTech__NameAssignment_2 ) )
            // InternalCompras.g:5255:2: ( rule__ModuleTech__NameAssignment_2 )
            {
             before(grammarAccess.getModuleTechAccess().getNameAssignment_2()); 
            // InternalCompras.g:5256:2: ( rule__ModuleTech__NameAssignment_2 )
            // InternalCompras.g:5256:3: rule__ModuleTech__NameAssignment_2
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
    // InternalCompras.g:5264:1: rule__ModuleTech__Group__3 : rule__ModuleTech__Group__3__Impl rule__ModuleTech__Group__4 ;
    public final void rule__ModuleTech__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5268:1: ( rule__ModuleTech__Group__3__Impl rule__ModuleTech__Group__4 )
            // InternalCompras.g:5269:2: rule__ModuleTech__Group__3__Impl rule__ModuleTech__Group__4
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
    // InternalCompras.g:5276:1: rule__ModuleTech__Group__3__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5280:1: ( ( ':' ) )
            // InternalCompras.g:5281:1: ( ':' )
            {
            // InternalCompras.g:5281:1: ( ':' )
            // InternalCompras.g:5282:2: ':'
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
    // InternalCompras.g:5291:1: rule__ModuleTech__Group__4 : rule__ModuleTech__Group__4__Impl rule__ModuleTech__Group__5 ;
    public final void rule__ModuleTech__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5295:1: ( rule__ModuleTech__Group__4__Impl rule__ModuleTech__Group__5 )
            // InternalCompras.g:5296:2: rule__ModuleTech__Group__4__Impl rule__ModuleTech__Group__5
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
    // InternalCompras.g:5303:1: rule__ModuleTech__Group__4__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5307:1: ( ( '{' ) )
            // InternalCompras.g:5308:1: ( '{' )
            {
            // InternalCompras.g:5308:1: ( '{' )
            // InternalCompras.g:5309:2: '{'
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
    // InternalCompras.g:5318:1: rule__ModuleTech__Group__5 : rule__ModuleTech__Group__5__Impl rule__ModuleTech__Group__6 ;
    public final void rule__ModuleTech__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5322:1: ( rule__ModuleTech__Group__5__Impl rule__ModuleTech__Group__6 )
            // InternalCompras.g:5323:2: rule__ModuleTech__Group__5__Impl rule__ModuleTech__Group__6
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
    // InternalCompras.g:5330:1: rule__ModuleTech__Group__5__Impl : ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) ) ;
    public final void rule__ModuleTech__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5334:1: ( ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) ) )
            // InternalCompras.g:5335:1: ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) )
            {
            // InternalCompras.g:5335:1: ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) )
            // InternalCompras.g:5336:2: ( rule__ModuleTech__PresentationLayerAssignment_5 )
            {
             before(grammarAccess.getModuleTechAccess().getPresentationLayerAssignment_5()); 
            // InternalCompras.g:5337:2: ( rule__ModuleTech__PresentationLayerAssignment_5 )
            // InternalCompras.g:5337:3: rule__ModuleTech__PresentationLayerAssignment_5
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
    // InternalCompras.g:5345:1: rule__ModuleTech__Group__6 : rule__ModuleTech__Group__6__Impl rule__ModuleTech__Group__7 ;
    public final void rule__ModuleTech__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5349:1: ( rule__ModuleTech__Group__6__Impl rule__ModuleTech__Group__7 )
            // InternalCompras.g:5350:2: rule__ModuleTech__Group__6__Impl rule__ModuleTech__Group__7
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
    // InternalCompras.g:5357:1: rule__ModuleTech__Group__6__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5361:1: ( ( ':' ) )
            // InternalCompras.g:5362:1: ( ':' )
            {
            // InternalCompras.g:5362:1: ( ':' )
            // InternalCompras.g:5363:2: ':'
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
    // InternalCompras.g:5372:1: rule__ModuleTech__Group__7 : rule__ModuleTech__Group__7__Impl rule__ModuleTech__Group__8 ;
    public final void rule__ModuleTech__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5376:1: ( rule__ModuleTech__Group__7__Impl rule__ModuleTech__Group__8 )
            // InternalCompras.g:5377:2: rule__ModuleTech__Group__7__Impl rule__ModuleTech__Group__8
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
    // InternalCompras.g:5384:1: rule__ModuleTech__Group__7__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5388:1: ( ( '{' ) )
            // InternalCompras.g:5389:1: ( '{' )
            {
            // InternalCompras.g:5389:1: ( '{' )
            // InternalCompras.g:5390:2: '{'
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
    // InternalCompras.g:5399:1: rule__ModuleTech__Group__8 : rule__ModuleTech__Group__8__Impl rule__ModuleTech__Group__9 ;
    public final void rule__ModuleTech__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5403:1: ( rule__ModuleTech__Group__8__Impl rule__ModuleTech__Group__9 )
            // InternalCompras.g:5404:2: rule__ModuleTech__Group__8__Impl rule__ModuleTech__Group__9
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
    // InternalCompras.g:5411:1: rule__ModuleTech__Group__8__Impl : ( ( rule__ModuleTech__Group_8__0 )? ) ;
    public final void rule__ModuleTech__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5415:1: ( ( ( rule__ModuleTech__Group_8__0 )? ) )
            // InternalCompras.g:5416:1: ( ( rule__ModuleTech__Group_8__0 )? )
            {
            // InternalCompras.g:5416:1: ( ( rule__ModuleTech__Group_8__0 )? )
            // InternalCompras.g:5417:2: ( rule__ModuleTech__Group_8__0 )?
            {
             before(grammarAccess.getModuleTechAccess().getGroup_8()); 
            // InternalCompras.g:5418:2: ( rule__ModuleTech__Group_8__0 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalCompras.g:5418:3: rule__ModuleTech__Group_8__0
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
    // InternalCompras.g:5426:1: rule__ModuleTech__Group__9 : rule__ModuleTech__Group__9__Impl rule__ModuleTech__Group__10 ;
    public final void rule__ModuleTech__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5430:1: ( rule__ModuleTech__Group__9__Impl rule__ModuleTech__Group__10 )
            // InternalCompras.g:5431:2: rule__ModuleTech__Group__9__Impl rule__ModuleTech__Group__10
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
    // InternalCompras.g:5438:1: rule__ModuleTech__Group__9__Impl : ( ( rule__ModuleTech__Group_9__0 )? ) ;
    public final void rule__ModuleTech__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5442:1: ( ( ( rule__ModuleTech__Group_9__0 )? ) )
            // InternalCompras.g:5443:1: ( ( rule__ModuleTech__Group_9__0 )? )
            {
            // InternalCompras.g:5443:1: ( ( rule__ModuleTech__Group_9__0 )? )
            // InternalCompras.g:5444:2: ( rule__ModuleTech__Group_9__0 )?
            {
             before(grammarAccess.getModuleTechAccess().getGroup_9()); 
            // InternalCompras.g:5445:2: ( rule__ModuleTech__Group_9__0 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalCompras.g:5445:3: rule__ModuleTech__Group_9__0
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
    // InternalCompras.g:5453:1: rule__ModuleTech__Group__10 : rule__ModuleTech__Group__10__Impl rule__ModuleTech__Group__11 ;
    public final void rule__ModuleTech__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5457:1: ( rule__ModuleTech__Group__10__Impl rule__ModuleTech__Group__11 )
            // InternalCompras.g:5458:2: rule__ModuleTech__Group__10__Impl rule__ModuleTech__Group__11
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
    // InternalCompras.g:5465:1: rule__ModuleTech__Group__10__Impl : ( ( rule__ModuleTech__Group_10__0 )? ) ;
    public final void rule__ModuleTech__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5469:1: ( ( ( rule__ModuleTech__Group_10__0 )? ) )
            // InternalCompras.g:5470:1: ( ( rule__ModuleTech__Group_10__0 )? )
            {
            // InternalCompras.g:5470:1: ( ( rule__ModuleTech__Group_10__0 )? )
            // InternalCompras.g:5471:2: ( rule__ModuleTech__Group_10__0 )?
            {
             before(grammarAccess.getModuleTechAccess().getGroup_10()); 
            // InternalCompras.g:5472:2: ( rule__ModuleTech__Group_10__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCompras.g:5472:3: rule__ModuleTech__Group_10__0
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
    // InternalCompras.g:5480:1: rule__ModuleTech__Group__11 : rule__ModuleTech__Group__11__Impl rule__ModuleTech__Group__12 ;
    public final void rule__ModuleTech__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5484:1: ( rule__ModuleTech__Group__11__Impl rule__ModuleTech__Group__12 )
            // InternalCompras.g:5485:2: rule__ModuleTech__Group__11__Impl rule__ModuleTech__Group__12
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
    // InternalCompras.g:5492:1: rule__ModuleTech__Group__11__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5496:1: ( ( '}' ) )
            // InternalCompras.g:5497:1: ( '}' )
            {
            // InternalCompras.g:5497:1: ( '}' )
            // InternalCompras.g:5498:2: '}'
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
    // InternalCompras.g:5507:1: rule__ModuleTech__Group__12 : rule__ModuleTech__Group__12__Impl rule__ModuleTech__Group__13 ;
    public final void rule__ModuleTech__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5511:1: ( rule__ModuleTech__Group__12__Impl rule__ModuleTech__Group__13 )
            // InternalCompras.g:5512:2: rule__ModuleTech__Group__12__Impl rule__ModuleTech__Group__13
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
    // InternalCompras.g:5519:1: rule__ModuleTech__Group__12__Impl : ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) ) ;
    public final void rule__ModuleTech__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5523:1: ( ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) ) )
            // InternalCompras.g:5524:1: ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) )
            {
            // InternalCompras.g:5524:1: ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) )
            // InternalCompras.g:5525:2: ( rule__ModuleTech__BusinessLayerAssignment_12 )
            {
             before(grammarAccess.getModuleTechAccess().getBusinessLayerAssignment_12()); 
            // InternalCompras.g:5526:2: ( rule__ModuleTech__BusinessLayerAssignment_12 )
            // InternalCompras.g:5526:3: rule__ModuleTech__BusinessLayerAssignment_12
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
    // InternalCompras.g:5534:1: rule__ModuleTech__Group__13 : rule__ModuleTech__Group__13__Impl rule__ModuleTech__Group__14 ;
    public final void rule__ModuleTech__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5538:1: ( rule__ModuleTech__Group__13__Impl rule__ModuleTech__Group__14 )
            // InternalCompras.g:5539:2: rule__ModuleTech__Group__13__Impl rule__ModuleTech__Group__14
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
    // InternalCompras.g:5546:1: rule__ModuleTech__Group__13__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5550:1: ( ( ':' ) )
            // InternalCompras.g:5551:1: ( ':' )
            {
            // InternalCompras.g:5551:1: ( ':' )
            // InternalCompras.g:5552:2: ':'
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
    // InternalCompras.g:5561:1: rule__ModuleTech__Group__14 : rule__ModuleTech__Group__14__Impl rule__ModuleTech__Group__15 ;
    public final void rule__ModuleTech__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5565:1: ( rule__ModuleTech__Group__14__Impl rule__ModuleTech__Group__15 )
            // InternalCompras.g:5566:2: rule__ModuleTech__Group__14__Impl rule__ModuleTech__Group__15
            {
            pushFollow(FOLLOW_45);
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
    // InternalCompras.g:5573:1: rule__ModuleTech__Group__14__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5577:1: ( ( '{' ) )
            // InternalCompras.g:5578:1: ( '{' )
            {
            // InternalCompras.g:5578:1: ( '{' )
            // InternalCompras.g:5579:2: '{'
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
    // InternalCompras.g:5588:1: rule__ModuleTech__Group__15 : rule__ModuleTech__Group__15__Impl rule__ModuleTech__Group__16 ;
    public final void rule__ModuleTech__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5592:1: ( rule__ModuleTech__Group__15__Impl rule__ModuleTech__Group__16 )
            // InternalCompras.g:5593:2: rule__ModuleTech__Group__15__Impl rule__ModuleTech__Group__16
            {
            pushFollow(FOLLOW_45);
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
    // InternalCompras.g:5600:1: rule__ModuleTech__Group__15__Impl : ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* ) ;
    public final void rule__ModuleTech__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5604:1: ( ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* ) )
            // InternalCompras.g:5605:1: ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* )
            {
            // InternalCompras.g:5605:1: ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* )
            // InternalCompras.g:5606:2: ( rule__ModuleTech__BusinessLayerRefAssignment_15 )*
            {
             before(grammarAccess.getModuleTechAccess().getBusinessLayerRefAssignment_15()); 
            // InternalCompras.g:5607:2: ( rule__ModuleTech__BusinessLayerRefAssignment_15 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==53) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCompras.g:5607:3: rule__ModuleTech__BusinessLayerRefAssignment_15
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__ModuleTech__BusinessLayerRefAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalCompras.g:5615:1: rule__ModuleTech__Group__16 : rule__ModuleTech__Group__16__Impl rule__ModuleTech__Group__17 ;
    public final void rule__ModuleTech__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5619:1: ( rule__ModuleTech__Group__16__Impl rule__ModuleTech__Group__17 )
            // InternalCompras.g:5620:2: rule__ModuleTech__Group__16__Impl rule__ModuleTech__Group__17
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
    // InternalCompras.g:5627:1: rule__ModuleTech__Group__16__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5631:1: ( ( '}' ) )
            // InternalCompras.g:5632:1: ( '}' )
            {
            // InternalCompras.g:5632:1: ( '}' )
            // InternalCompras.g:5633:2: '}'
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
    // InternalCompras.g:5642:1: rule__ModuleTech__Group__17 : rule__ModuleTech__Group__17__Impl rule__ModuleTech__Group__18 ;
    public final void rule__ModuleTech__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5646:1: ( rule__ModuleTech__Group__17__Impl rule__ModuleTech__Group__18 )
            // InternalCompras.g:5647:2: rule__ModuleTech__Group__17__Impl rule__ModuleTech__Group__18
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
    // InternalCompras.g:5654:1: rule__ModuleTech__Group__17__Impl : ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) ) ;
    public final void rule__ModuleTech__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5658:1: ( ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) ) )
            // InternalCompras.g:5659:1: ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) )
            {
            // InternalCompras.g:5659:1: ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) )
            // InternalCompras.g:5660:2: ( rule__ModuleTech__DataAccessLayerAssignment_17 )
            {
             before(grammarAccess.getModuleTechAccess().getDataAccessLayerAssignment_17()); 
            // InternalCompras.g:5661:2: ( rule__ModuleTech__DataAccessLayerAssignment_17 )
            // InternalCompras.g:5661:3: rule__ModuleTech__DataAccessLayerAssignment_17
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
    // InternalCompras.g:5669:1: rule__ModuleTech__Group__18 : rule__ModuleTech__Group__18__Impl rule__ModuleTech__Group__19 ;
    public final void rule__ModuleTech__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5673:1: ( rule__ModuleTech__Group__18__Impl rule__ModuleTech__Group__19 )
            // InternalCompras.g:5674:2: rule__ModuleTech__Group__18__Impl rule__ModuleTech__Group__19
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
    // InternalCompras.g:5681:1: rule__ModuleTech__Group__18__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5685:1: ( ( ':' ) )
            // InternalCompras.g:5686:1: ( ':' )
            {
            // InternalCompras.g:5686:1: ( ':' )
            // InternalCompras.g:5687:2: ':'
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
    // InternalCompras.g:5696:1: rule__ModuleTech__Group__19 : rule__ModuleTech__Group__19__Impl rule__ModuleTech__Group__20 ;
    public final void rule__ModuleTech__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5700:1: ( rule__ModuleTech__Group__19__Impl rule__ModuleTech__Group__20 )
            // InternalCompras.g:5701:2: rule__ModuleTech__Group__19__Impl rule__ModuleTech__Group__20
            {
            pushFollow(FOLLOW_47);
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
    // InternalCompras.g:5708:1: rule__ModuleTech__Group__19__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5712:1: ( ( '{' ) )
            // InternalCompras.g:5713:1: ( '{' )
            {
            // InternalCompras.g:5713:1: ( '{' )
            // InternalCompras.g:5714:2: '{'
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
    // InternalCompras.g:5723:1: rule__ModuleTech__Group__20 : rule__ModuleTech__Group__20__Impl rule__ModuleTech__Group__21 ;
    public final void rule__ModuleTech__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5727:1: ( rule__ModuleTech__Group__20__Impl rule__ModuleTech__Group__21 )
            // InternalCompras.g:5728:2: rule__ModuleTech__Group__20__Impl rule__ModuleTech__Group__21
            {
            pushFollow(FOLLOW_47);
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
    // InternalCompras.g:5735:1: rule__ModuleTech__Group__20__Impl : ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* ) ;
    public final void rule__ModuleTech__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5739:1: ( ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* ) )
            // InternalCompras.g:5740:1: ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* )
            {
            // InternalCompras.g:5740:1: ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* )
            // InternalCompras.g:5741:2: ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )*
            {
             before(grammarAccess.getModuleTechAccess().getDataAccessLayerRefAssignment_20()); 
            // InternalCompras.g:5742:2: ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==54) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCompras.g:5742:3: rule__ModuleTech__DataAccessLayerRefAssignment_20
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__ModuleTech__DataAccessLayerRefAssignment_20();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalCompras.g:5750:1: rule__ModuleTech__Group__21 : rule__ModuleTech__Group__21__Impl rule__ModuleTech__Group__22 ;
    public final void rule__ModuleTech__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5754:1: ( rule__ModuleTech__Group__21__Impl rule__ModuleTech__Group__22 )
            // InternalCompras.g:5755:2: rule__ModuleTech__Group__21__Impl rule__ModuleTech__Group__22
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
    // InternalCompras.g:5762:1: rule__ModuleTech__Group__21__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5766:1: ( ( '}' ) )
            // InternalCompras.g:5767:1: ( '}' )
            {
            // InternalCompras.g:5767:1: ( '}' )
            // InternalCompras.g:5768:2: '}'
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
    // InternalCompras.g:5777:1: rule__ModuleTech__Group__22 : rule__ModuleTech__Group__22__Impl rule__ModuleTech__Group__23 ;
    public final void rule__ModuleTech__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5781:1: ( rule__ModuleTech__Group__22__Impl rule__ModuleTech__Group__23 )
            // InternalCompras.g:5782:2: rule__ModuleTech__Group__22__Impl rule__ModuleTech__Group__23
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
    // InternalCompras.g:5789:1: rule__ModuleTech__Group__22__Impl : ( ( rule__ModuleTech__CommonLayerAssignment_22 ) ) ;
    public final void rule__ModuleTech__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5793:1: ( ( ( rule__ModuleTech__CommonLayerAssignment_22 ) ) )
            // InternalCompras.g:5794:1: ( ( rule__ModuleTech__CommonLayerAssignment_22 ) )
            {
            // InternalCompras.g:5794:1: ( ( rule__ModuleTech__CommonLayerAssignment_22 ) )
            // InternalCompras.g:5795:2: ( rule__ModuleTech__CommonLayerAssignment_22 )
            {
             before(grammarAccess.getModuleTechAccess().getCommonLayerAssignment_22()); 
            // InternalCompras.g:5796:2: ( rule__ModuleTech__CommonLayerAssignment_22 )
            // InternalCompras.g:5796:3: rule__ModuleTech__CommonLayerAssignment_22
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
    // InternalCompras.g:5804:1: rule__ModuleTech__Group__23 : rule__ModuleTech__Group__23__Impl rule__ModuleTech__Group__24 ;
    public final void rule__ModuleTech__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5808:1: ( rule__ModuleTech__Group__23__Impl rule__ModuleTech__Group__24 )
            // InternalCompras.g:5809:2: rule__ModuleTech__Group__23__Impl rule__ModuleTech__Group__24
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
    // InternalCompras.g:5816:1: rule__ModuleTech__Group__23__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5820:1: ( ( ':' ) )
            // InternalCompras.g:5821:1: ( ':' )
            {
            // InternalCompras.g:5821:1: ( ':' )
            // InternalCompras.g:5822:2: ':'
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
    // InternalCompras.g:5831:1: rule__ModuleTech__Group__24 : rule__ModuleTech__Group__24__Impl rule__ModuleTech__Group__25 ;
    public final void rule__ModuleTech__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5835:1: ( rule__ModuleTech__Group__24__Impl rule__ModuleTech__Group__25 )
            // InternalCompras.g:5836:2: rule__ModuleTech__Group__24__Impl rule__ModuleTech__Group__25
            {
            pushFollow(FOLLOW_49);
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
    // InternalCompras.g:5843:1: rule__ModuleTech__Group__24__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5847:1: ( ( '{' ) )
            // InternalCompras.g:5848:1: ( '{' )
            {
            // InternalCompras.g:5848:1: ( '{' )
            // InternalCompras.g:5849:2: '{'
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
    // InternalCompras.g:5858:1: rule__ModuleTech__Group__25 : rule__ModuleTech__Group__25__Impl rule__ModuleTech__Group__26 ;
    public final void rule__ModuleTech__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5862:1: ( rule__ModuleTech__Group__25__Impl rule__ModuleTech__Group__26 )
            // InternalCompras.g:5863:2: rule__ModuleTech__Group__25__Impl rule__ModuleTech__Group__26
            {
            pushFollow(FOLLOW_49);
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
    // InternalCompras.g:5870:1: rule__ModuleTech__Group__25__Impl : ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* ) ;
    public final void rule__ModuleTech__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5874:1: ( ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* ) )
            // InternalCompras.g:5875:1: ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* )
            {
            // InternalCompras.g:5875:1: ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* )
            // InternalCompras.g:5876:2: ( rule__ModuleTech__CommonLayerRefAssignment_25 )*
            {
             before(grammarAccess.getModuleTechAccess().getCommonLayerRefAssignment_25()); 
            // InternalCompras.g:5877:2: ( rule__ModuleTech__CommonLayerRefAssignment_25 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==55) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCompras.g:5877:3: rule__ModuleTech__CommonLayerRefAssignment_25
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__ModuleTech__CommonLayerRefAssignment_25();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalCompras.g:5885:1: rule__ModuleTech__Group__26 : rule__ModuleTech__Group__26__Impl rule__ModuleTech__Group__27 ;
    public final void rule__ModuleTech__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5889:1: ( rule__ModuleTech__Group__26__Impl rule__ModuleTech__Group__27 )
            // InternalCompras.g:5890:2: rule__ModuleTech__Group__26__Impl rule__ModuleTech__Group__27
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
    // InternalCompras.g:5897:1: rule__ModuleTech__Group__26__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5901:1: ( ( '}' ) )
            // InternalCompras.g:5902:1: ( '}' )
            {
            // InternalCompras.g:5902:1: ( '}' )
            // InternalCompras.g:5903:2: '}'
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
    // InternalCompras.g:5912:1: rule__ModuleTech__Group__27 : rule__ModuleTech__Group__27__Impl ;
    public final void rule__ModuleTech__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5916:1: ( rule__ModuleTech__Group__27__Impl )
            // InternalCompras.g:5917:2: rule__ModuleTech__Group__27__Impl
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
    // InternalCompras.g:5923:1: rule__ModuleTech__Group__27__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5927:1: ( ( '}' ) )
            // InternalCompras.g:5928:1: ( '}' )
            {
            // InternalCompras.g:5928:1: ( '}' )
            // InternalCompras.g:5929:2: '}'
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
    // InternalCompras.g:5939:1: rule__ModuleTech__Group_8__0 : rule__ModuleTech__Group_8__0__Impl rule__ModuleTech__Group_8__1 ;
    public final void rule__ModuleTech__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5943:1: ( rule__ModuleTech__Group_8__0__Impl rule__ModuleTech__Group_8__1 )
            // InternalCompras.g:5944:2: rule__ModuleTech__Group_8__0__Impl rule__ModuleTech__Group_8__1
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
    // InternalCompras.g:5951:1: rule__ModuleTech__Group_8__0__Impl : ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) ) ;
    public final void rule__ModuleTech__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5955:1: ( ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) ) )
            // InternalCompras.g:5956:1: ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) )
            {
            // InternalCompras.g:5956:1: ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) )
            // InternalCompras.g:5957:2: ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 )
            {
             before(grammarAccess.getModuleTechAccess().getControllerSegmentLayerAssignment_8_0()); 
            // InternalCompras.g:5958:2: ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 )
            // InternalCompras.g:5958:3: rule__ModuleTech__ControllerSegmentLayerAssignment_8_0
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
    // InternalCompras.g:5966:1: rule__ModuleTech__Group_8__1 : rule__ModuleTech__Group_8__1__Impl rule__ModuleTech__Group_8__2 ;
    public final void rule__ModuleTech__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5970:1: ( rule__ModuleTech__Group_8__1__Impl rule__ModuleTech__Group_8__2 )
            // InternalCompras.g:5971:2: rule__ModuleTech__Group_8__1__Impl rule__ModuleTech__Group_8__2
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
    // InternalCompras.g:5978:1: rule__ModuleTech__Group_8__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5982:1: ( ( ':' ) )
            // InternalCompras.g:5983:1: ( ':' )
            {
            // InternalCompras.g:5983:1: ( ':' )
            // InternalCompras.g:5984:2: ':'
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
    // InternalCompras.g:5993:1: rule__ModuleTech__Group_8__2 : rule__ModuleTech__Group_8__2__Impl rule__ModuleTech__Group_8__3 ;
    public final void rule__ModuleTech__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5997:1: ( rule__ModuleTech__Group_8__2__Impl rule__ModuleTech__Group_8__3 )
            // InternalCompras.g:5998:2: rule__ModuleTech__Group_8__2__Impl rule__ModuleTech__Group_8__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalCompras.g:6005:1: rule__ModuleTech__Group_8__2__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6009:1: ( ( '{' ) )
            // InternalCompras.g:6010:1: ( '{' )
            {
            // InternalCompras.g:6010:1: ( '{' )
            // InternalCompras.g:6011:2: '{'
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
    // InternalCompras.g:6020:1: rule__ModuleTech__Group_8__3 : rule__ModuleTech__Group_8__3__Impl rule__ModuleTech__Group_8__4 ;
    public final void rule__ModuleTech__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6024:1: ( rule__ModuleTech__Group_8__3__Impl rule__ModuleTech__Group_8__4 )
            // InternalCompras.g:6025:2: rule__ModuleTech__Group_8__3__Impl rule__ModuleTech__Group_8__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalCompras.g:6032:1: rule__ModuleTech__Group_8__3__Impl : ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* ) ;
    public final void rule__ModuleTech__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6036:1: ( ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* ) )
            // InternalCompras.g:6037:1: ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* )
            {
            // InternalCompras.g:6037:1: ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* )
            // InternalCompras.g:6038:2: ( rule__ModuleTech__ControllersRefAssignment_8_3 )*
            {
             before(grammarAccess.getModuleTechAccess().getControllersRefAssignment_8_3()); 
            // InternalCompras.g:6039:2: ( rule__ModuleTech__ControllersRefAssignment_8_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==50) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCompras.g:6039:3: rule__ModuleTech__ControllersRefAssignment_8_3
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__ModuleTech__ControllersRefAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalCompras.g:6047:1: rule__ModuleTech__Group_8__4 : rule__ModuleTech__Group_8__4__Impl ;
    public final void rule__ModuleTech__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6051:1: ( rule__ModuleTech__Group_8__4__Impl )
            // InternalCompras.g:6052:2: rule__ModuleTech__Group_8__4__Impl
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
    // InternalCompras.g:6058:1: rule__ModuleTech__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6062:1: ( ( '}' ) )
            // InternalCompras.g:6063:1: ( '}' )
            {
            // InternalCompras.g:6063:1: ( '}' )
            // InternalCompras.g:6064:2: '}'
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
    // InternalCompras.g:6074:1: rule__ModuleTech__Group_9__0 : rule__ModuleTech__Group_9__0__Impl rule__ModuleTech__Group_9__1 ;
    public final void rule__ModuleTech__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6078:1: ( rule__ModuleTech__Group_9__0__Impl rule__ModuleTech__Group_9__1 )
            // InternalCompras.g:6079:2: rule__ModuleTech__Group_9__0__Impl rule__ModuleTech__Group_9__1
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
    // InternalCompras.g:6086:1: rule__ModuleTech__Group_9__0__Impl : ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) ) ;
    public final void rule__ModuleTech__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6090:1: ( ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) ) )
            // InternalCompras.g:6091:1: ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) )
            {
            // InternalCompras.g:6091:1: ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) )
            // InternalCompras.g:6092:2: ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 )
            {
             before(grammarAccess.getModuleTechAccess().getViewSegmentLayerAssignment_9_0()); 
            // InternalCompras.g:6093:2: ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 )
            // InternalCompras.g:6093:3: rule__ModuleTech__ViewSegmentLayerAssignment_9_0
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
    // InternalCompras.g:6101:1: rule__ModuleTech__Group_9__1 : rule__ModuleTech__Group_9__1__Impl rule__ModuleTech__Group_9__2 ;
    public final void rule__ModuleTech__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6105:1: ( rule__ModuleTech__Group_9__1__Impl rule__ModuleTech__Group_9__2 )
            // InternalCompras.g:6106:2: rule__ModuleTech__Group_9__1__Impl rule__ModuleTech__Group_9__2
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
    // InternalCompras.g:6113:1: rule__ModuleTech__Group_9__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6117:1: ( ( ':' ) )
            // InternalCompras.g:6118:1: ( ':' )
            {
            // InternalCompras.g:6118:1: ( ':' )
            // InternalCompras.g:6119:2: ':'
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
    // InternalCompras.g:6128:1: rule__ModuleTech__Group_9__2 : rule__ModuleTech__Group_9__2__Impl rule__ModuleTech__Group_9__3 ;
    public final void rule__ModuleTech__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6132:1: ( rule__ModuleTech__Group_9__2__Impl rule__ModuleTech__Group_9__3 )
            // InternalCompras.g:6133:2: rule__ModuleTech__Group_9__2__Impl rule__ModuleTech__Group_9__3
            {
            pushFollow(FOLLOW_53);
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
    // InternalCompras.g:6140:1: rule__ModuleTech__Group_9__2__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6144:1: ( ( '{' ) )
            // InternalCompras.g:6145:1: ( '{' )
            {
            // InternalCompras.g:6145:1: ( '{' )
            // InternalCompras.g:6146:2: '{'
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
    // InternalCompras.g:6155:1: rule__ModuleTech__Group_9__3 : rule__ModuleTech__Group_9__3__Impl rule__ModuleTech__Group_9__4 ;
    public final void rule__ModuleTech__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6159:1: ( rule__ModuleTech__Group_9__3__Impl rule__ModuleTech__Group_9__4 )
            // InternalCompras.g:6160:2: rule__ModuleTech__Group_9__3__Impl rule__ModuleTech__Group_9__4
            {
            pushFollow(FOLLOW_53);
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
    // InternalCompras.g:6167:1: rule__ModuleTech__Group_9__3__Impl : ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* ) ;
    public final void rule__ModuleTech__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6171:1: ( ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* ) )
            // InternalCompras.g:6172:1: ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* )
            {
            // InternalCompras.g:6172:1: ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* )
            // InternalCompras.g:6173:2: ( rule__ModuleTech__ViewsRefAssignment_9_3 )*
            {
             before(grammarAccess.getModuleTechAccess().getViewsRefAssignment_9_3()); 
            // InternalCompras.g:6174:2: ( rule__ModuleTech__ViewsRefAssignment_9_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==51) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCompras.g:6174:3: rule__ModuleTech__ViewsRefAssignment_9_3
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__ModuleTech__ViewsRefAssignment_9_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalCompras.g:6182:1: rule__ModuleTech__Group_9__4 : rule__ModuleTech__Group_9__4__Impl ;
    public final void rule__ModuleTech__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6186:1: ( rule__ModuleTech__Group_9__4__Impl )
            // InternalCompras.g:6187:2: rule__ModuleTech__Group_9__4__Impl
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
    // InternalCompras.g:6193:1: rule__ModuleTech__Group_9__4__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6197:1: ( ( '}' ) )
            // InternalCompras.g:6198:1: ( '}' )
            {
            // InternalCompras.g:6198:1: ( '}' )
            // InternalCompras.g:6199:2: '}'
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
    // InternalCompras.g:6209:1: rule__ModuleTech__Group_10__0 : rule__ModuleTech__Group_10__0__Impl rule__ModuleTech__Group_10__1 ;
    public final void rule__ModuleTech__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6213:1: ( rule__ModuleTech__Group_10__0__Impl rule__ModuleTech__Group_10__1 )
            // InternalCompras.g:6214:2: rule__ModuleTech__Group_10__0__Impl rule__ModuleTech__Group_10__1
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
    // InternalCompras.g:6221:1: rule__ModuleTech__Group_10__0__Impl : ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) ) ;
    public final void rule__ModuleTech__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6225:1: ( ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) ) )
            // InternalCompras.g:6226:1: ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) )
            {
            // InternalCompras.g:6226:1: ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) )
            // InternalCompras.g:6227:2: ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 )
            {
             before(grammarAccess.getModuleTechAccess().getScriptSegmentLayerAssignment_10_0()); 
            // InternalCompras.g:6228:2: ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 )
            // InternalCompras.g:6228:3: rule__ModuleTech__ScriptSegmentLayerAssignment_10_0
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
    // InternalCompras.g:6236:1: rule__ModuleTech__Group_10__1 : rule__ModuleTech__Group_10__1__Impl rule__ModuleTech__Group_10__2 ;
    public final void rule__ModuleTech__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6240:1: ( rule__ModuleTech__Group_10__1__Impl rule__ModuleTech__Group_10__2 )
            // InternalCompras.g:6241:2: rule__ModuleTech__Group_10__1__Impl rule__ModuleTech__Group_10__2
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
    // InternalCompras.g:6248:1: rule__ModuleTech__Group_10__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6252:1: ( ( ':' ) )
            // InternalCompras.g:6253:1: ( ':' )
            {
            // InternalCompras.g:6253:1: ( ':' )
            // InternalCompras.g:6254:2: ':'
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
    // InternalCompras.g:6263:1: rule__ModuleTech__Group_10__2 : rule__ModuleTech__Group_10__2__Impl rule__ModuleTech__Group_10__3 ;
    public final void rule__ModuleTech__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6267:1: ( rule__ModuleTech__Group_10__2__Impl rule__ModuleTech__Group_10__3 )
            // InternalCompras.g:6268:2: rule__ModuleTech__Group_10__2__Impl rule__ModuleTech__Group_10__3
            {
            pushFollow(FOLLOW_55);
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
    // InternalCompras.g:6275:1: rule__ModuleTech__Group_10__2__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6279:1: ( ( '{' ) )
            // InternalCompras.g:6280:1: ( '{' )
            {
            // InternalCompras.g:6280:1: ( '{' )
            // InternalCompras.g:6281:2: '{'
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
    // InternalCompras.g:6290:1: rule__ModuleTech__Group_10__3 : rule__ModuleTech__Group_10__3__Impl rule__ModuleTech__Group_10__4 ;
    public final void rule__ModuleTech__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6294:1: ( rule__ModuleTech__Group_10__3__Impl rule__ModuleTech__Group_10__4 )
            // InternalCompras.g:6295:2: rule__ModuleTech__Group_10__3__Impl rule__ModuleTech__Group_10__4
            {
            pushFollow(FOLLOW_55);
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
    // InternalCompras.g:6302:1: rule__ModuleTech__Group_10__3__Impl : ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* ) ;
    public final void rule__ModuleTech__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6306:1: ( ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* ) )
            // InternalCompras.g:6307:1: ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* )
            {
            // InternalCompras.g:6307:1: ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* )
            // InternalCompras.g:6308:2: ( rule__ModuleTech__ScriptRefAssignment_10_3 )*
            {
             before(grammarAccess.getModuleTechAccess().getScriptRefAssignment_10_3()); 
            // InternalCompras.g:6309:2: ( rule__ModuleTech__ScriptRefAssignment_10_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==52) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCompras.g:6309:3: rule__ModuleTech__ScriptRefAssignment_10_3
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__ModuleTech__ScriptRefAssignment_10_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalCompras.g:6317:1: rule__ModuleTech__Group_10__4 : rule__ModuleTech__Group_10__4__Impl ;
    public final void rule__ModuleTech__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6321:1: ( rule__ModuleTech__Group_10__4__Impl )
            // InternalCompras.g:6322:2: rule__ModuleTech__Group_10__4__Impl
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
    // InternalCompras.g:6328:1: rule__ModuleTech__Group_10__4__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6332:1: ( ( '}' ) )
            // InternalCompras.g:6333:1: ( '}' )
            {
            // InternalCompras.g:6333:1: ( '}' )
            // InternalCompras.g:6334:2: '}'
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
    // InternalCompras.g:6344:1: rule__ControllersRef__Group__0 : rule__ControllersRef__Group__0__Impl rule__ControllersRef__Group__1 ;
    public final void rule__ControllersRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6348:1: ( rule__ControllersRef__Group__0__Impl rule__ControllersRef__Group__1 )
            // InternalCompras.g:6349:2: rule__ControllersRef__Group__0__Impl rule__ControllersRef__Group__1
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
    // InternalCompras.g:6356:1: rule__ControllersRef__Group__0__Impl : ( 'Controller' ) ;
    public final void rule__ControllersRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6360:1: ( ( 'Controller' ) )
            // InternalCompras.g:6361:1: ( 'Controller' )
            {
            // InternalCompras.g:6361:1: ( 'Controller' )
            // InternalCompras.g:6362:2: 'Controller'
            {
             before(grammarAccess.getControllersRefAccess().getControllerKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalCompras.g:6371:1: rule__ControllersRef__Group__1 : rule__ControllersRef__Group__1__Impl rule__ControllersRef__Group__2 ;
    public final void rule__ControllersRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6375:1: ( rule__ControllersRef__Group__1__Impl rule__ControllersRef__Group__2 )
            // InternalCompras.g:6376:2: rule__ControllersRef__Group__1__Impl rule__ControllersRef__Group__2
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
    // InternalCompras.g:6383:1: rule__ControllersRef__Group__1__Impl : ( ':' ) ;
    public final void rule__ControllersRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6387:1: ( ( ':' ) )
            // InternalCompras.g:6388:1: ( ':' )
            {
            // InternalCompras.g:6388:1: ( ':' )
            // InternalCompras.g:6389:2: ':'
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
    // InternalCompras.g:6398:1: rule__ControllersRef__Group__2 : rule__ControllersRef__Group__2__Impl ;
    public final void rule__ControllersRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6402:1: ( rule__ControllersRef__Group__2__Impl )
            // InternalCompras.g:6403:2: rule__ControllersRef__Group__2__Impl
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
    // InternalCompras.g:6409:1: rule__ControllersRef__Group__2__Impl : ( ( rule__ControllersRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__ControllersRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6413:1: ( ( ( rule__ControllersRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6414:1: ( ( rule__ControllersRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6414:1: ( ( rule__ControllersRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6415:2: ( rule__ControllersRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getControllersRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6416:2: ( rule__ControllersRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6416:3: rule__ControllersRef__FunctionalityAssignment_2
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
    // InternalCompras.g:6425:1: rule__ViewsRef__Group__0 : rule__ViewsRef__Group__0__Impl rule__ViewsRef__Group__1 ;
    public final void rule__ViewsRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6429:1: ( rule__ViewsRef__Group__0__Impl rule__ViewsRef__Group__1 )
            // InternalCompras.g:6430:2: rule__ViewsRef__Group__0__Impl rule__ViewsRef__Group__1
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
    // InternalCompras.g:6437:1: rule__ViewsRef__Group__0__Impl : ( 'View' ) ;
    public final void rule__ViewsRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6441:1: ( ( 'View' ) )
            // InternalCompras.g:6442:1: ( 'View' )
            {
            // InternalCompras.g:6442:1: ( 'View' )
            // InternalCompras.g:6443:2: 'View'
            {
             before(grammarAccess.getViewsRefAccess().getViewKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalCompras.g:6452:1: rule__ViewsRef__Group__1 : rule__ViewsRef__Group__1__Impl rule__ViewsRef__Group__2 ;
    public final void rule__ViewsRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6456:1: ( rule__ViewsRef__Group__1__Impl rule__ViewsRef__Group__2 )
            // InternalCompras.g:6457:2: rule__ViewsRef__Group__1__Impl rule__ViewsRef__Group__2
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
    // InternalCompras.g:6464:1: rule__ViewsRef__Group__1__Impl : ( ':' ) ;
    public final void rule__ViewsRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6468:1: ( ( ':' ) )
            // InternalCompras.g:6469:1: ( ':' )
            {
            // InternalCompras.g:6469:1: ( ':' )
            // InternalCompras.g:6470:2: ':'
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
    // InternalCompras.g:6479:1: rule__ViewsRef__Group__2 : rule__ViewsRef__Group__2__Impl ;
    public final void rule__ViewsRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6483:1: ( rule__ViewsRef__Group__2__Impl )
            // InternalCompras.g:6484:2: rule__ViewsRef__Group__2__Impl
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
    // InternalCompras.g:6490:1: rule__ViewsRef__Group__2__Impl : ( ( rule__ViewsRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__ViewsRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6494:1: ( ( ( rule__ViewsRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6495:1: ( ( rule__ViewsRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6495:1: ( ( rule__ViewsRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6496:2: ( rule__ViewsRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getViewsRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6497:2: ( rule__ViewsRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6497:3: rule__ViewsRef__FunctionalityAssignment_2
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
    // InternalCompras.g:6506:1: rule__ScriptRef__Group__0 : rule__ScriptRef__Group__0__Impl rule__ScriptRef__Group__1 ;
    public final void rule__ScriptRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6510:1: ( rule__ScriptRef__Group__0__Impl rule__ScriptRef__Group__1 )
            // InternalCompras.g:6511:2: rule__ScriptRef__Group__0__Impl rule__ScriptRef__Group__1
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
    // InternalCompras.g:6518:1: rule__ScriptRef__Group__0__Impl : ( 'Script' ) ;
    public final void rule__ScriptRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6522:1: ( ( 'Script' ) )
            // InternalCompras.g:6523:1: ( 'Script' )
            {
            // InternalCompras.g:6523:1: ( 'Script' )
            // InternalCompras.g:6524:2: 'Script'
            {
             before(grammarAccess.getScriptRefAccess().getScriptKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalCompras.g:6533:1: rule__ScriptRef__Group__1 : rule__ScriptRef__Group__1__Impl rule__ScriptRef__Group__2 ;
    public final void rule__ScriptRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6537:1: ( rule__ScriptRef__Group__1__Impl rule__ScriptRef__Group__2 )
            // InternalCompras.g:6538:2: rule__ScriptRef__Group__1__Impl rule__ScriptRef__Group__2
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
    // InternalCompras.g:6545:1: rule__ScriptRef__Group__1__Impl : ( ':' ) ;
    public final void rule__ScriptRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6549:1: ( ( ':' ) )
            // InternalCompras.g:6550:1: ( ':' )
            {
            // InternalCompras.g:6550:1: ( ':' )
            // InternalCompras.g:6551:2: ':'
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
    // InternalCompras.g:6560:1: rule__ScriptRef__Group__2 : rule__ScriptRef__Group__2__Impl ;
    public final void rule__ScriptRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6564:1: ( rule__ScriptRef__Group__2__Impl )
            // InternalCompras.g:6565:2: rule__ScriptRef__Group__2__Impl
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
    // InternalCompras.g:6571:1: rule__ScriptRef__Group__2__Impl : ( ( rule__ScriptRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__ScriptRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6575:1: ( ( ( rule__ScriptRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6576:1: ( ( rule__ScriptRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6576:1: ( ( rule__ScriptRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6577:2: ( rule__ScriptRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getScriptRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6578:2: ( rule__ScriptRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6578:3: rule__ScriptRef__FunctionalityAssignment_2
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
    // InternalCompras.g:6587:1: rule__BusinessLayerRef__Group__0 : rule__BusinessLayerRef__Group__0__Impl rule__BusinessLayerRef__Group__1 ;
    public final void rule__BusinessLayerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6591:1: ( rule__BusinessLayerRef__Group__0__Impl rule__BusinessLayerRef__Group__1 )
            // InternalCompras.g:6592:2: rule__BusinessLayerRef__Group__0__Impl rule__BusinessLayerRef__Group__1
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
    // InternalCompras.g:6599:1: rule__BusinessLayerRef__Group__0__Impl : ( 'BLogic' ) ;
    public final void rule__BusinessLayerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6603:1: ( ( 'BLogic' ) )
            // InternalCompras.g:6604:1: ( 'BLogic' )
            {
            // InternalCompras.g:6604:1: ( 'BLogic' )
            // InternalCompras.g:6605:2: 'BLogic'
            {
             before(grammarAccess.getBusinessLayerRefAccess().getBLogicKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalCompras.g:6614:1: rule__BusinessLayerRef__Group__1 : rule__BusinessLayerRef__Group__1__Impl rule__BusinessLayerRef__Group__2 ;
    public final void rule__BusinessLayerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6618:1: ( rule__BusinessLayerRef__Group__1__Impl rule__BusinessLayerRef__Group__2 )
            // InternalCompras.g:6619:2: rule__BusinessLayerRef__Group__1__Impl rule__BusinessLayerRef__Group__2
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
    // InternalCompras.g:6626:1: rule__BusinessLayerRef__Group__1__Impl : ( ':' ) ;
    public final void rule__BusinessLayerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6630:1: ( ( ':' ) )
            // InternalCompras.g:6631:1: ( ':' )
            {
            // InternalCompras.g:6631:1: ( ':' )
            // InternalCompras.g:6632:2: ':'
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
    // InternalCompras.g:6641:1: rule__BusinessLayerRef__Group__2 : rule__BusinessLayerRef__Group__2__Impl ;
    public final void rule__BusinessLayerRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6645:1: ( rule__BusinessLayerRef__Group__2__Impl )
            // InternalCompras.g:6646:2: rule__BusinessLayerRef__Group__2__Impl
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
    // InternalCompras.g:6652:1: rule__BusinessLayerRef__Group__2__Impl : ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__BusinessLayerRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6656:1: ( ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6657:1: ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6657:1: ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6658:2: ( rule__BusinessLayerRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getBusinessLayerRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6659:2: ( rule__BusinessLayerRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6659:3: rule__BusinessLayerRef__FunctionalityAssignment_2
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
    // InternalCompras.g:6668:1: rule__DataAccessLayerRef__Group__0 : rule__DataAccessLayerRef__Group__0__Impl rule__DataAccessLayerRef__Group__1 ;
    public final void rule__DataAccessLayerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6672:1: ( rule__DataAccessLayerRef__Group__0__Impl rule__DataAccessLayerRef__Group__1 )
            // InternalCompras.g:6673:2: rule__DataAccessLayerRef__Group__0__Impl rule__DataAccessLayerRef__Group__1
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
    // InternalCompras.g:6680:1: rule__DataAccessLayerRef__Group__0__Impl : ( 'DataAccess' ) ;
    public final void rule__DataAccessLayerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6684:1: ( ( 'DataAccess' ) )
            // InternalCompras.g:6685:1: ( 'DataAccess' )
            {
            // InternalCompras.g:6685:1: ( 'DataAccess' )
            // InternalCompras.g:6686:2: 'DataAccess'
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getDataAccessKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalCompras.g:6695:1: rule__DataAccessLayerRef__Group__1 : rule__DataAccessLayerRef__Group__1__Impl rule__DataAccessLayerRef__Group__2 ;
    public final void rule__DataAccessLayerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6699:1: ( rule__DataAccessLayerRef__Group__1__Impl rule__DataAccessLayerRef__Group__2 )
            // InternalCompras.g:6700:2: rule__DataAccessLayerRef__Group__1__Impl rule__DataAccessLayerRef__Group__2
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
    // InternalCompras.g:6707:1: rule__DataAccessLayerRef__Group__1__Impl : ( ':' ) ;
    public final void rule__DataAccessLayerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6711:1: ( ( ':' ) )
            // InternalCompras.g:6712:1: ( ':' )
            {
            // InternalCompras.g:6712:1: ( ':' )
            // InternalCompras.g:6713:2: ':'
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
    // InternalCompras.g:6722:1: rule__DataAccessLayerRef__Group__2 : rule__DataAccessLayerRef__Group__2__Impl ;
    public final void rule__DataAccessLayerRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6726:1: ( rule__DataAccessLayerRef__Group__2__Impl )
            // InternalCompras.g:6727:2: rule__DataAccessLayerRef__Group__2__Impl
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
    // InternalCompras.g:6733:1: rule__DataAccessLayerRef__Group__2__Impl : ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__DataAccessLayerRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6737:1: ( ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6738:1: ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6738:1: ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6739:2: ( rule__DataAccessLayerRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6740:2: ( rule__DataAccessLayerRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6740:3: rule__DataAccessLayerRef__FunctionalityAssignment_2
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
    // InternalCompras.g:6749:1: rule__CommonLayerRef__Group__0 : rule__CommonLayerRef__Group__0__Impl rule__CommonLayerRef__Group__1 ;
    public final void rule__CommonLayerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6753:1: ( rule__CommonLayerRef__Group__0__Impl rule__CommonLayerRef__Group__1 )
            // InternalCompras.g:6754:2: rule__CommonLayerRef__Group__0__Impl rule__CommonLayerRef__Group__1
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
    // InternalCompras.g:6761:1: rule__CommonLayerRef__Group__0__Impl : ( 'DtoModel' ) ;
    public final void rule__CommonLayerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6765:1: ( ( 'DtoModel' ) )
            // InternalCompras.g:6766:1: ( 'DtoModel' )
            {
            // InternalCompras.g:6766:1: ( 'DtoModel' )
            // InternalCompras.g:6767:2: 'DtoModel'
            {
             before(grammarAccess.getCommonLayerRefAccess().getDtoModelKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalCompras.g:6776:1: rule__CommonLayerRef__Group__1 : rule__CommonLayerRef__Group__1__Impl rule__CommonLayerRef__Group__2 ;
    public final void rule__CommonLayerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6780:1: ( rule__CommonLayerRef__Group__1__Impl rule__CommonLayerRef__Group__2 )
            // InternalCompras.g:6781:2: rule__CommonLayerRef__Group__1__Impl rule__CommonLayerRef__Group__2
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
    // InternalCompras.g:6788:1: rule__CommonLayerRef__Group__1__Impl : ( ':' ) ;
    public final void rule__CommonLayerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6792:1: ( ( ':' ) )
            // InternalCompras.g:6793:1: ( ':' )
            {
            // InternalCompras.g:6793:1: ( ':' )
            // InternalCompras.g:6794:2: ':'
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
    // InternalCompras.g:6803:1: rule__CommonLayerRef__Group__2 : rule__CommonLayerRef__Group__2__Impl ;
    public final void rule__CommonLayerRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6807:1: ( rule__CommonLayerRef__Group__2__Impl )
            // InternalCompras.g:6808:2: rule__CommonLayerRef__Group__2__Impl
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
    // InternalCompras.g:6814:1: rule__CommonLayerRef__Group__2__Impl : ( ( rule__CommonLayerRef__EntityAssignment_2 ) ) ;
    public final void rule__CommonLayerRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6818:1: ( ( ( rule__CommonLayerRef__EntityAssignment_2 ) ) )
            // InternalCompras.g:6819:1: ( ( rule__CommonLayerRef__EntityAssignment_2 ) )
            {
            // InternalCompras.g:6819:1: ( ( rule__CommonLayerRef__EntityAssignment_2 ) )
            // InternalCompras.g:6820:2: ( rule__CommonLayerRef__EntityAssignment_2 )
            {
             before(grammarAccess.getCommonLayerRefAccess().getEntityAssignment_2()); 
            // InternalCompras.g:6821:2: ( rule__CommonLayerRef__EntityAssignment_2 )
            // InternalCompras.g:6821:3: rule__CommonLayerRef__EntityAssignment_2
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
    // InternalCompras.g:6830:1: rule__Solution__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Solution__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6834:1: ( ( RULE_ID ) )
            // InternalCompras.g:6835:2: ( RULE_ID )
            {
            // InternalCompras.g:6835:2: ( RULE_ID )
            // InternalCompras.g:6836:3: RULE_ID
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
    // InternalCompras.g:6845:1: rule__Solution__DomainAssignment_6 : ( ruleDomain ) ;
    public final void rule__Solution__DomainAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6849:1: ( ( ruleDomain ) )
            // InternalCompras.g:6850:2: ( ruleDomain )
            {
            // InternalCompras.g:6850:2: ( ruleDomain )
            // InternalCompras.g:6851:3: ruleDomain
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
    // InternalCompras.g:6860:1: rule__Solution__ArchitectureAssignment_9 : ( ruleArchitecture ) ;
    public final void rule__Solution__ArchitectureAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6864:1: ( ( ruleArchitecture ) )
            // InternalCompras.g:6865:2: ( ruleArchitecture )
            {
            // InternalCompras.g:6865:2: ( ruleArchitecture )
            // InternalCompras.g:6866:3: ruleArchitecture
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
    // InternalCompras.g:6875:1: rule__Solution__TechnologyAssignment_12 : ( ruleTechnology ) ;
    public final void rule__Solution__TechnologyAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6879:1: ( ( ruleTechnology ) )
            // InternalCompras.g:6880:2: ( ruleTechnology )
            {
            // InternalCompras.g:6880:2: ( ruleTechnology )
            // InternalCompras.g:6881:3: ruleTechnology
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
    // InternalCompras.g:6890:1: rule__Domain__ModuleAssignment_1 : ( ruleModule ) ;
    public final void rule__Domain__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6894:1: ( ( ruleModule ) )
            // InternalCompras.g:6895:2: ( ruleModule )
            {
            // InternalCompras.g:6895:2: ( ruleModule )
            // InternalCompras.g:6896:3: ruleModule
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
    // InternalCompras.g:6905:1: rule__Module__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6909:1: ( ( RULE_ID ) )
            // InternalCompras.g:6910:2: ( RULE_ID )
            {
            // InternalCompras.g:6910:2: ( RULE_ID )
            // InternalCompras.g:6911:3: RULE_ID
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
    // InternalCompras.g:6920:1: rule__Module__EntityAssignment_8 : ( ruleEntity ) ;
    public final void rule__Module__EntityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6924:1: ( ( ruleEntity ) )
            // InternalCompras.g:6925:2: ( ruleEntity )
            {
            // InternalCompras.g:6925:2: ( ruleEntity )
            // InternalCompras.g:6926:3: ruleEntity
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
    // InternalCompras.g:6935:1: rule__Module__FunctionalityAssignment_10_3 : ( ruleFunctionality ) ;
    public final void rule__Module__FunctionalityAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6939:1: ( ( ruleFunctionality ) )
            // InternalCompras.g:6940:2: ( ruleFunctionality )
            {
            // InternalCompras.g:6940:2: ( ruleFunctionality )
            // InternalCompras.g:6941:3: ruleFunctionality
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
    // InternalCompras.g:6950:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6954:1: ( ( RULE_ID ) )
            // InternalCompras.g:6955:2: ( RULE_ID )
            {
            // InternalCompras.g:6955:2: ( RULE_ID )
            // InternalCompras.g:6956:3: RULE_ID
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
    // InternalCompras.g:6965:1: rule__Entity__EntityFieldAssignment_3 : ( ruleEntityField ) ;
    public final void rule__Entity__EntityFieldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6969:1: ( ( ruleEntityField ) )
            // InternalCompras.g:6970:2: ( ruleEntityField )
            {
            // InternalCompras.g:6970:2: ( ruleEntityField )
            // InternalCompras.g:6971:3: ruleEntityField
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
    // InternalCompras.g:6980:1: rule__EntityField__EntityFieldRequiredAssignment_0 : ( ruleEntityFieldRequired ) ;
    public final void rule__EntityField__EntityFieldRequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6984:1: ( ( ruleEntityFieldRequired ) )
            // InternalCompras.g:6985:2: ( ruleEntityFieldRequired )
            {
            // InternalCompras.g:6985:2: ( ruleEntityFieldRequired )
            // InternalCompras.g:6986:3: ruleEntityFieldRequired
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
    // InternalCompras.g:6995:1: rule__EntityField__EntityFieldLabelAssignment_1 : ( ruleEntityFieldLabel ) ;
    public final void rule__EntityField__EntityFieldLabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6999:1: ( ( ruleEntityFieldLabel ) )
            // InternalCompras.g:7000:2: ( ruleEntityFieldLabel )
            {
            // InternalCompras.g:7000:2: ( ruleEntityFieldLabel )
            // InternalCompras.g:7001:3: ruleEntityFieldLabel
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
    // InternalCompras.g:7010:1: rule__EntityField__EntityTypeAssignment_2 : ( ruleEntityType ) ;
    public final void rule__EntityField__EntityTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7014:1: ( ( ruleEntityType ) )
            // InternalCompras.g:7015:2: ( ruleEntityType )
            {
            // InternalCompras.g:7015:2: ( ruleEntityType )
            // InternalCompras.g:7016:3: ruleEntityType
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
    // InternalCompras.g:7025:1: rule__EntityField__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__EntityField__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7029:1: ( ( RULE_ID ) )
            // InternalCompras.g:7030:2: ( RULE_ID )
            {
            // InternalCompras.g:7030:2: ( RULE_ID )
            // InternalCompras.g:7031:3: RULE_ID
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
    // InternalCompras.g:7040:1: rule__EntityFieldLabel__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__EntityFieldLabel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7044:1: ( ( RULE_STRING ) )
            // InternalCompras.g:7045:2: ( RULE_STRING )
            {
            // InternalCompras.g:7045:2: ( RULE_STRING )
            // InternalCompras.g:7046:3: RULE_STRING
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
    // InternalCompras.g:7055:1: rule__EntityFieldRequired__NameAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__EntityFieldRequired__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7059:1: ( ( ( 'required' ) ) )
            // InternalCompras.g:7060:2: ( ( 'required' ) )
            {
            // InternalCompras.g:7060:2: ( ( 'required' ) )
            // InternalCompras.g:7061:3: ( 'required' )
            {
             before(grammarAccess.getEntityFieldRequiredAccess().getNameRequiredKeyword_1_0()); 
            // InternalCompras.g:7062:3: ( 'required' )
            // InternalCompras.g:7063:4: 'required'
            {
             before(grammarAccess.getEntityFieldRequiredAccess().getNameRequiredKeyword_1_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalCompras.g:7074:1: rule__EntityType__EntityAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__EntityType__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7078:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7079:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7079:2: ( ( ruleFQN ) )
            // InternalCompras.g:7080:3: ( ruleFQN )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0_0()); 
            // InternalCompras.g:7081:3: ( ruleFQN )
            // InternalCompras.g:7082:4: ruleFQN
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
    // InternalCompras.g:7093:1: rule__EntityType__CommonFieldTypeAssignment_1 : ( ruleCommonFieldType ) ;
    public final void rule__EntityType__CommonFieldTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7097:1: ( ( ruleCommonFieldType ) )
            // InternalCompras.g:7098:2: ( ruleCommonFieldType )
            {
            // InternalCompras.g:7098:2: ( ruleCommonFieldType )
            // InternalCompras.g:7099:3: ruleCommonFieldType
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
    // InternalCompras.g:7108:1: rule__Functionality__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Functionality__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7112:1: ( ( RULE_ID ) )
            // InternalCompras.g:7113:2: ( RULE_ID )
            {
            // InternalCompras.g:7113:2: ( RULE_ID )
            // InternalCompras.g:7114:3: RULE_ID
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
    // InternalCompras.g:7123:1: rule__Functionality__EntityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Functionality__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7127:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7128:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7128:2: ( ( ruleFQN ) )
            // InternalCompras.g:7129:3: ( ruleFQN )
            {
             before(grammarAccess.getFunctionalityAccess().getEntityEntityCrossReference_2_0()); 
            // InternalCompras.g:7130:3: ( ruleFQN )
            // InternalCompras.g:7131:4: ruleFQN
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
    // InternalCompras.g:7142:1: rule__Functionality__FunctionalityActionTypeAssignment_5 : ( ruleFunctionalityActionType ) ;
    public final void rule__Functionality__FunctionalityActionTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7146:1: ( ( ruleFunctionalityActionType ) )
            // InternalCompras.g:7147:2: ( ruleFunctionalityActionType )
            {
            // InternalCompras.g:7147:2: ( ruleFunctionalityActionType )
            // InternalCompras.g:7148:3: ruleFunctionalityActionType
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
    // InternalCompras.g:7157:1: rule__FuncCreateAction__NameAssignment : ( ( 'CREATE' ) ) ;
    public final void rule__FuncCreateAction__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7161:1: ( ( ( 'CREATE' ) ) )
            // InternalCompras.g:7162:2: ( ( 'CREATE' ) )
            {
            // InternalCompras.g:7162:2: ( ( 'CREATE' ) )
            // InternalCompras.g:7163:3: ( 'CREATE' )
            {
             before(grammarAccess.getFuncCreateActionAccess().getNameCREATEKeyword_0()); 
            // InternalCompras.g:7164:3: ( 'CREATE' )
            // InternalCompras.g:7165:4: 'CREATE'
            {
             before(grammarAccess.getFuncCreateActionAccess().getNameCREATEKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalCompras.g:7176:1: rule__FuncViewGridAction__NameAssignment : ( ( 'VIEW_GRID' ) ) ;
    public final void rule__FuncViewGridAction__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7180:1: ( ( ( 'VIEW_GRID' ) ) )
            // InternalCompras.g:7181:2: ( ( 'VIEW_GRID' ) )
            {
            // InternalCompras.g:7181:2: ( ( 'VIEW_GRID' ) )
            // InternalCompras.g:7182:3: ( 'VIEW_GRID' )
            {
             before(grammarAccess.getFuncViewGridActionAccess().getNameVIEW_GRIDKeyword_0()); 
            // InternalCompras.g:7183:3: ( 'VIEW_GRID' )
            // InternalCompras.g:7184:4: 'VIEW_GRID'
            {
             before(grammarAccess.getFuncViewGridActionAccess().getNameVIEW_GRIDKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalCompras.g:7195:1: rule__FuncViewDropDownAction__NameAssignment : ( ( 'VIEW_DROPDOWN' ) ) ;
    public final void rule__FuncViewDropDownAction__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7199:1: ( ( ( 'VIEW_DROPDOWN' ) ) )
            // InternalCompras.g:7200:2: ( ( 'VIEW_DROPDOWN' ) )
            {
            // InternalCompras.g:7200:2: ( ( 'VIEW_DROPDOWN' ) )
            // InternalCompras.g:7201:3: ( 'VIEW_DROPDOWN' )
            {
             before(grammarAccess.getFuncViewDropDownActionAccess().getNameVIEW_DROPDOWNKeyword_0()); 
            // InternalCompras.g:7202:3: ( 'VIEW_DROPDOWN' )
            // InternalCompras.g:7203:4: 'VIEW_DROPDOWN'
            {
             before(grammarAccess.getFuncViewDropDownActionAccess().getNameVIEW_DROPDOWNKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalCompras.g:7214:1: rule__FuncEditAction__NameAssignment : ( ( 'EDIT' ) ) ;
    public final void rule__FuncEditAction__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7218:1: ( ( ( 'EDIT' ) ) )
            // InternalCompras.g:7219:2: ( ( 'EDIT' ) )
            {
            // InternalCompras.g:7219:2: ( ( 'EDIT' ) )
            // InternalCompras.g:7220:3: ( 'EDIT' )
            {
             before(grammarAccess.getFuncEditActionAccess().getNameEDITKeyword_0()); 
            // InternalCompras.g:7221:3: ( 'EDIT' )
            // InternalCompras.g:7222:4: 'EDIT'
            {
             before(grammarAccess.getFuncEditActionAccess().getNameEDITKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalCompras.g:7233:1: rule__FuncDeleteAction__NameAssignment : ( ( 'DELETE' ) ) ;
    public final void rule__FuncDeleteAction__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7237:1: ( ( ( 'DELETE' ) ) )
            // InternalCompras.g:7238:2: ( ( 'DELETE' ) )
            {
            // InternalCompras.g:7238:2: ( ( 'DELETE' ) )
            // InternalCompras.g:7239:3: ( 'DELETE' )
            {
             before(grammarAccess.getFuncDeleteActionAccess().getNameDELETEKeyword_0()); 
            // InternalCompras.g:7240:3: ( 'DELETE' )
            // InternalCompras.g:7241:4: 'DELETE'
            {
             before(grammarAccess.getFuncDeleteActionAccess().getNameDELETEKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalCompras.g:7252:1: rule__Architecture__PresentationLayerAssignment_6 : ( rulePresentationLayer ) ;
    public final void rule__Architecture__PresentationLayerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7256:1: ( ( rulePresentationLayer ) )
            // InternalCompras.g:7257:2: ( rulePresentationLayer )
            {
            // InternalCompras.g:7257:2: ( rulePresentationLayer )
            // InternalCompras.g:7258:3: rulePresentationLayer
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
    // InternalCompras.g:7267:1: rule__Architecture__BusinessLayerAssignment_9 : ( ruleBusinessLayer ) ;
    public final void rule__Architecture__BusinessLayerAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7271:1: ( ( ruleBusinessLayer ) )
            // InternalCompras.g:7272:2: ( ruleBusinessLayer )
            {
            // InternalCompras.g:7272:2: ( ruleBusinessLayer )
            // InternalCompras.g:7273:3: ruleBusinessLayer
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
    // InternalCompras.g:7282:1: rule__Architecture__DataAccessLayerAssignment_12 : ( ruleDataAccessLayer ) ;
    public final void rule__Architecture__DataAccessLayerAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7286:1: ( ( ruleDataAccessLayer ) )
            // InternalCompras.g:7287:2: ( ruleDataAccessLayer )
            {
            // InternalCompras.g:7287:2: ( ruleDataAccessLayer )
            // InternalCompras.g:7288:3: ruleDataAccessLayer
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
    // InternalCompras.g:7297:1: rule__Architecture__CommonLayerAssignment_15 : ( ruleCommonLayer ) ;
    public final void rule__Architecture__CommonLayerAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7301:1: ( ( ruleCommonLayer ) )
            // InternalCompras.g:7302:2: ( ruleCommonLayer )
            {
            // InternalCompras.g:7302:2: ( ruleCommonLayer )
            // InternalCompras.g:7303:3: ruleCommonLayer
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
    // InternalCompras.g:7312:1: rule__Architecture__RelationsAssignment_19 : ( ruleRelations ) ;
    public final void rule__Architecture__RelationsAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7316:1: ( ( ruleRelations ) )
            // InternalCompras.g:7317:2: ( ruleRelations )
            {
            // InternalCompras.g:7317:2: ( ruleRelations )
            // InternalCompras.g:7318:3: ruleRelations
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
    // InternalCompras.g:7327:1: rule__PresentationLayer__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PresentationLayer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7331:1: ( ( RULE_ID ) )
            // InternalCompras.g:7332:2: ( RULE_ID )
            {
            // InternalCompras.g:7332:2: ( RULE_ID )
            // InternalCompras.g:7333:3: RULE_ID
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
    // InternalCompras.g:7342:1: rule__PresentationLayer__ControllerSegmentLayerAssignment_5 : ( ruleControllerSegmentLayer ) ;
    public final void rule__PresentationLayer__ControllerSegmentLayerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7346:1: ( ( ruleControllerSegmentLayer ) )
            // InternalCompras.g:7347:2: ( ruleControllerSegmentLayer )
            {
            // InternalCompras.g:7347:2: ( ruleControllerSegmentLayer )
            // InternalCompras.g:7348:3: ruleControllerSegmentLayer
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
    // InternalCompras.g:7357:1: rule__PresentationLayer__ViewSegmentLayerAssignment_8 : ( ruleViewSegmentLayer ) ;
    public final void rule__PresentationLayer__ViewSegmentLayerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7361:1: ( ( ruleViewSegmentLayer ) )
            // InternalCompras.g:7362:2: ( ruleViewSegmentLayer )
            {
            // InternalCompras.g:7362:2: ( ruleViewSegmentLayer )
            // InternalCompras.g:7363:3: ruleViewSegmentLayer
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
    // InternalCompras.g:7372:1: rule__PresentationLayer__ScriptegmentLayerAssignment_11 : ( ruleScriptSegmentLayer ) ;
    public final void rule__PresentationLayer__ScriptegmentLayerAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7376:1: ( ( ruleScriptSegmentLayer ) )
            // InternalCompras.g:7377:2: ( ruleScriptSegmentLayer )
            {
            // InternalCompras.g:7377:2: ( ruleScriptSegmentLayer )
            // InternalCompras.g:7378:3: ruleScriptSegmentLayer
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
    // InternalCompras.g:7387:1: rule__ControllerSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__ControllerSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7391:1: ( ( RULE_ID ) )
            // InternalCompras.g:7392:2: ( RULE_ID )
            {
            // InternalCompras.g:7392:2: ( RULE_ID )
            // InternalCompras.g:7393:3: RULE_ID
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
    // InternalCompras.g:7402:1: rule__ViewSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__ViewSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7406:1: ( ( RULE_ID ) )
            // InternalCompras.g:7407:2: ( RULE_ID )
            {
            // InternalCompras.g:7407:2: ( RULE_ID )
            // InternalCompras.g:7408:3: RULE_ID
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
    // InternalCompras.g:7417:1: rule__ScriptSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__ScriptSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7421:1: ( ( RULE_ID ) )
            // InternalCompras.g:7422:2: ( RULE_ID )
            {
            // InternalCompras.g:7422:2: ( RULE_ID )
            // InternalCompras.g:7423:3: RULE_ID
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
    // InternalCompras.g:7432:1: rule__BusinessLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__BusinessLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7436:1: ( ( RULE_ID ) )
            // InternalCompras.g:7437:2: ( RULE_ID )
            {
            // InternalCompras.g:7437:2: ( RULE_ID )
            // InternalCompras.g:7438:3: RULE_ID
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
    // InternalCompras.g:7447:1: rule__DataAccessLayer__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DataAccessLayer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7451:1: ( ( RULE_ID ) )
            // InternalCompras.g:7452:2: ( RULE_ID )
            {
            // InternalCompras.g:7452:2: ( RULE_ID )
            // InternalCompras.g:7453:3: RULE_ID
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
    // InternalCompras.g:7462:1: rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 : ( ruleDbConnectorSegmentLayer ) ;
    public final void rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7466:1: ( ( ruleDbConnectorSegmentLayer ) )
            // InternalCompras.g:7467:2: ( ruleDbConnectorSegmentLayer )
            {
            // InternalCompras.g:7467:2: ( ruleDbConnectorSegmentLayer )
            // InternalCompras.g:7468:3: ruleDbConnectorSegmentLayer
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
    // InternalCompras.g:7477:1: rule__DbConnectorSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__DbConnectorSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7481:1: ( ( RULE_ID ) )
            // InternalCompras.g:7482:2: ( RULE_ID )
            {
            // InternalCompras.g:7482:2: ( RULE_ID )
            // InternalCompras.g:7483:3: RULE_ID
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
    // InternalCompras.g:7492:1: rule__CommonLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__CommonLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7496:1: ( ( RULE_ID ) )
            // InternalCompras.g:7497:2: ( RULE_ID )
            {
            // InternalCompras.g:7497:2: ( RULE_ID )
            // InternalCompras.g:7498:3: RULE_ID
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
    // InternalCompras.g:7507:1: rule__Relations__SourceLayer1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7511:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7512:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7512:2: ( ( RULE_ID ) )
            // InternalCompras.g:7513:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer1PresentationLayerCrossReference_1_0()); 
            // InternalCompras.g:7514:3: ( RULE_ID )
            // InternalCompras.g:7515:4: RULE_ID
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
    // InternalCompras.g:7526:1: rule__Relations__RelationsType1Assignment_2 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7530:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7531:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7531:2: ( ruleRelationsType )
            // InternalCompras.g:7532:3: ruleRelationsType
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
    // InternalCompras.g:7541:1: rule__Relations__TargetLayer1Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7545:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7546:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7546:2: ( ( RULE_ID ) )
            // InternalCompras.g:7547:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer1BusinessLayerCrossReference_3_0()); 
            // InternalCompras.g:7548:3: ( RULE_ID )
            // InternalCompras.g:7549:4: RULE_ID
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
    // InternalCompras.g:7560:1: rule__Relations__SourceLayer2Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7564:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7565:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7565:2: ( ( RULE_ID ) )
            // InternalCompras.g:7566:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer2BusinessLayerCrossReference_4_0()); 
            // InternalCompras.g:7567:3: ( RULE_ID )
            // InternalCompras.g:7568:4: RULE_ID
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
    // InternalCompras.g:7579:1: rule__Relations__RelationsType2Assignment_5 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7583:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7584:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7584:2: ( ruleRelationsType )
            // InternalCompras.g:7585:3: ruleRelationsType
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
    // InternalCompras.g:7594:1: rule__Relations__TargetLayer2Assignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7598:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7599:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7599:2: ( ( RULE_ID ) )
            // InternalCompras.g:7600:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer2DataAccessLayerCrossReference_6_0()); 
            // InternalCompras.g:7601:3: ( RULE_ID )
            // InternalCompras.g:7602:4: RULE_ID
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
    // InternalCompras.g:7613:1: rule__Relations__SourceLayer3Assignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer3Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7617:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7618:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7618:2: ( ( RULE_ID ) )
            // InternalCompras.g:7619:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer3DataAccessLayerCrossReference_7_0()); 
            // InternalCompras.g:7620:3: ( RULE_ID )
            // InternalCompras.g:7621:4: RULE_ID
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
    // InternalCompras.g:7632:1: rule__Relations__RelationsType3Assignment_8 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType3Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7636:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7637:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7637:2: ( ruleRelationsType )
            // InternalCompras.g:7638:3: ruleRelationsType
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
    // InternalCompras.g:7647:1: rule__Relations__TargetLayer3Assignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer3Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7651:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7652:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7652:2: ( ( RULE_ID ) )
            // InternalCompras.g:7653:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer3CommonLayerCrossReference_9_0()); 
            // InternalCompras.g:7654:3: ( RULE_ID )
            // InternalCompras.g:7655:4: RULE_ID
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
    // InternalCompras.g:7666:1: rule__Relations__SourceLayer4Assignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer4Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7670:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7671:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7671:2: ( ( RULE_ID ) )
            // InternalCompras.g:7672:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer4PresentationLayerCrossReference_10_0()); 
            // InternalCompras.g:7673:3: ( RULE_ID )
            // InternalCompras.g:7674:4: RULE_ID
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
    // InternalCompras.g:7685:1: rule__Relations__RelationsType4Assignment_11 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType4Assignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7689:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7690:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7690:2: ( ruleRelationsType )
            // InternalCompras.g:7691:3: ruleRelationsType
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
    // InternalCompras.g:7700:1: rule__Relations__TargetLayer4Assignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer4Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7704:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7705:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7705:2: ( ( RULE_ID ) )
            // InternalCompras.g:7706:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer4CommonLayerCrossReference_12_0()); 
            // InternalCompras.g:7707:3: ( RULE_ID )
            // InternalCompras.g:7708:4: RULE_ID
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
    // InternalCompras.g:7719:1: rule__Relations__SourceLayer5Assignment_13 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer5Assignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7723:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7724:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7724:2: ( ( RULE_ID ) )
            // InternalCompras.g:7725:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer5BusinessLayerCrossReference_13_0()); 
            // InternalCompras.g:7726:3: ( RULE_ID )
            // InternalCompras.g:7727:4: RULE_ID
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
    // InternalCompras.g:7738:1: rule__Relations__RelationsType5Assignment_14 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType5Assignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7742:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7743:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7743:2: ( ruleRelationsType )
            // InternalCompras.g:7744:3: ruleRelationsType
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
    // InternalCompras.g:7753:1: rule__Relations__TargetLayer5Assignment_15 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer5Assignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7757:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7758:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7758:2: ( ( RULE_ID ) )
            // InternalCompras.g:7759:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer5CommonLayerCrossReference_15_0()); 
            // InternalCompras.g:7760:3: ( RULE_ID )
            // InternalCompras.g:7761:4: RULE_ID
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
    // InternalCompras.g:7772:1: rule__Technology__ModuleTechAssignment_1_3 : ( ruleModuleTech ) ;
    public final void rule__Technology__ModuleTechAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7776:1: ( ( ruleModuleTech ) )
            // InternalCompras.g:7777:2: ( ruleModuleTech )
            {
            // InternalCompras.g:7777:2: ( ruleModuleTech )
            // InternalCompras.g:7778:3: ruleModuleTech
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
    // InternalCompras.g:7787:1: rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 : ( ( ruleFQN ) ) ;
    public final void rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7791:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7792:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7792:2: ( ( ruleFQN ) )
            // InternalCompras.g:7793:3: ( ruleFQN )
            {
             before(grammarAccess.getTechnologyAccess().getDbConnectorSegmentLayerDbConnectorSegmentLayerCrossReference_2_3_0_0()); 
            // InternalCompras.g:7794:3: ( ruleFQN )
            // InternalCompras.g:7795:4: ruleFQN
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
    // InternalCompras.g:7806:1: rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 : ( ruleDatabaseRDBMSType ) ;
    public final void rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7810:1: ( ( ruleDatabaseRDBMSType ) )
            // InternalCompras.g:7811:2: ( ruleDatabaseRDBMSType )
            {
            // InternalCompras.g:7811:2: ( ruleDatabaseRDBMSType )
            // InternalCompras.g:7812:3: ruleDatabaseRDBMSType
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
    // InternalCompras.g:7821:1: rule__Technology__ConnectionStringAssignment_2_3_4_2 : ( ruleConnectionString ) ;
    public final void rule__Technology__ConnectionStringAssignment_2_3_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7825:1: ( ( ruleConnectionString ) )
            // InternalCompras.g:7826:2: ( ruleConnectionString )
            {
            // InternalCompras.g:7826:2: ( ruleConnectionString )
            // InternalCompras.g:7827:3: ruleConnectionString
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


    // $ANTLR start "rule__Technology__DataFileSeedAssignment_2_4_2"
    // InternalCompras.g:7836:1: rule__Technology__DataFileSeedAssignment_2_4_2 : ( ruleDataFileSeed ) ;
    public final void rule__Technology__DataFileSeedAssignment_2_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7840:1: ( ( ruleDataFileSeed ) )
            // InternalCompras.g:7841:2: ( ruleDataFileSeed )
            {
            // InternalCompras.g:7841:2: ( ruleDataFileSeed )
            // InternalCompras.g:7842:3: ruleDataFileSeed
            {
             before(grammarAccess.getTechnologyAccess().getDataFileSeedDataFileSeedParserRuleCall_2_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataFileSeed();

            state._fsp--;

             after(grammarAccess.getTechnologyAccess().getDataFileSeedDataFileSeedParserRuleCall_2_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__DataFileSeedAssignment_2_4_2"


    // $ANTLR start "rule__ModuleTech__NameAssignment_2"
    // InternalCompras.g:7851:1: rule__ModuleTech__NameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7855:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7856:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7856:2: ( ( RULE_ID ) )
            // InternalCompras.g:7857:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getNameModuleCrossReference_2_0()); 
            // InternalCompras.g:7858:3: ( RULE_ID )
            // InternalCompras.g:7859:4: RULE_ID
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
    // InternalCompras.g:7870:1: rule__ModuleTech__PresentationLayerAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__PresentationLayerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7874:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7875:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7875:2: ( ( RULE_ID ) )
            // InternalCompras.g:7876:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getPresentationLayerPresentationLayerCrossReference_5_0()); 
            // InternalCompras.g:7877:3: ( RULE_ID )
            // InternalCompras.g:7878:4: RULE_ID
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
    // InternalCompras.g:7889:1: rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 : ( ( ruleFQN ) ) ;
    public final void rule__ModuleTech__ControllerSegmentLayerAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7893:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7894:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7894:2: ( ( ruleFQN ) )
            // InternalCompras.g:7895:3: ( ruleFQN )
            {
             before(grammarAccess.getModuleTechAccess().getControllerSegmentLayerControllerSegmentLayerCrossReference_8_0_0()); 
            // InternalCompras.g:7896:3: ( ruleFQN )
            // InternalCompras.g:7897:4: ruleFQN
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
    // InternalCompras.g:7908:1: rule__ModuleTech__ControllersRefAssignment_8_3 : ( ruleControllersRef ) ;
    public final void rule__ModuleTech__ControllersRefAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7912:1: ( ( ruleControllersRef ) )
            // InternalCompras.g:7913:2: ( ruleControllersRef )
            {
            // InternalCompras.g:7913:2: ( ruleControllersRef )
            // InternalCompras.g:7914:3: ruleControllersRef
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
    // InternalCompras.g:7923:1: rule__ModuleTech__ViewSegmentLayerAssignment_9_0 : ( ( ruleFQN ) ) ;
    public final void rule__ModuleTech__ViewSegmentLayerAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7927:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7928:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7928:2: ( ( ruleFQN ) )
            // InternalCompras.g:7929:3: ( ruleFQN )
            {
             before(grammarAccess.getModuleTechAccess().getViewSegmentLayerViewSegmentLayerCrossReference_9_0_0()); 
            // InternalCompras.g:7930:3: ( ruleFQN )
            // InternalCompras.g:7931:4: ruleFQN
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
    // InternalCompras.g:7942:1: rule__ModuleTech__ViewsRefAssignment_9_3 : ( ruleViewsRef ) ;
    public final void rule__ModuleTech__ViewsRefAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7946:1: ( ( ruleViewsRef ) )
            // InternalCompras.g:7947:2: ( ruleViewsRef )
            {
            // InternalCompras.g:7947:2: ( ruleViewsRef )
            // InternalCompras.g:7948:3: ruleViewsRef
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
    // InternalCompras.g:7957:1: rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 : ( ( ruleFQN ) ) ;
    public final void rule__ModuleTech__ScriptSegmentLayerAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7961:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7962:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7962:2: ( ( ruleFQN ) )
            // InternalCompras.g:7963:3: ( ruleFQN )
            {
             before(grammarAccess.getModuleTechAccess().getScriptSegmentLayerScriptSegmentLayerCrossReference_10_0_0()); 
            // InternalCompras.g:7964:3: ( ruleFQN )
            // InternalCompras.g:7965:4: ruleFQN
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
    // InternalCompras.g:7976:1: rule__ModuleTech__ScriptRefAssignment_10_3 : ( ruleScriptRef ) ;
    public final void rule__ModuleTech__ScriptRefAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7980:1: ( ( ruleScriptRef ) )
            // InternalCompras.g:7981:2: ( ruleScriptRef )
            {
            // InternalCompras.g:7981:2: ( ruleScriptRef )
            // InternalCompras.g:7982:3: ruleScriptRef
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
    // InternalCompras.g:7991:1: rule__ModuleTech__BusinessLayerAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__BusinessLayerAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7995:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7996:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7996:2: ( ( RULE_ID ) )
            // InternalCompras.g:7997:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getBusinessLayerBusinessLayerCrossReference_12_0()); 
            // InternalCompras.g:7998:3: ( RULE_ID )
            // InternalCompras.g:7999:4: RULE_ID
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
    // InternalCompras.g:8010:1: rule__ModuleTech__BusinessLayerRefAssignment_15 : ( ruleBusinessLayerRef ) ;
    public final void rule__ModuleTech__BusinessLayerRefAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:8014:1: ( ( ruleBusinessLayerRef ) )
            // InternalCompras.g:8015:2: ( ruleBusinessLayerRef )
            {
            // InternalCompras.g:8015:2: ( ruleBusinessLayerRef )
            // InternalCompras.g:8016:3: ruleBusinessLayerRef
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
    // InternalCompras.g:8025:1: rule__ModuleTech__DataAccessLayerAssignment_17 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__DataAccessLayerAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:8029:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:8030:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:8030:2: ( ( RULE_ID ) )
            // InternalCompras.g:8031:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getDataAccessLayerDataAccessLayerCrossReference_17_0()); 
            // InternalCompras.g:8032:3: ( RULE_ID )
            // InternalCompras.g:8033:4: RULE_ID
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
    // InternalCompras.g:8044:1: rule__ModuleTech__DataAccessLayerRefAssignment_20 : ( ruleDataAccessLayerRef ) ;
    public final void rule__ModuleTech__DataAccessLayerRefAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:8048:1: ( ( ruleDataAccessLayerRef ) )
            // InternalCompras.g:8049:2: ( ruleDataAccessLayerRef )
            {
            // InternalCompras.g:8049:2: ( ruleDataAccessLayerRef )
            // InternalCompras.g:8050:3: ruleDataAccessLayerRef
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
    // InternalCompras.g:8059:1: rule__ModuleTech__CommonLayerAssignment_22 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__CommonLayerAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:8063:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:8064:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:8064:2: ( ( RULE_ID ) )
            // InternalCompras.g:8065:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getCommonLayerCommonLayerCrossReference_22_0()); 
            // InternalCompras.g:8066:3: ( RULE_ID )
            // InternalCompras.g:8067:4: RULE_ID
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
    // InternalCompras.g:8078:1: rule__ModuleTech__CommonLayerRefAssignment_25 : ( ruleCommonLayerRef ) ;
    public final void rule__ModuleTech__CommonLayerRefAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:8082:1: ( ( ruleCommonLayerRef ) )
            // InternalCompras.g:8083:2: ( ruleCommonLayerRef )
            {
            // InternalCompras.g:8083:2: ( ruleCommonLayerRef )
            // InternalCompras.g:8084:3: ruleCommonLayerRef
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
    // InternalCompras.g:8093:1: rule__ControllersRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ControllersRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:8097:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:8098:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:8098:2: ( ( ruleFQN ) )
            // InternalCompras.g:8099:3: ( ruleFQN )
            {
             before(grammarAccess.getControllersRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:8100:3: ( ruleFQN )
            // InternalCompras.g:8101:4: ruleFQN
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
    // InternalCompras.g:8112:1: rule__ViewsRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ViewsRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:8116:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:8117:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:8117:2: ( ( ruleFQN ) )
            // InternalCompras.g:8118:3: ( ruleFQN )
            {
             before(grammarAccess.getViewsRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:8119:3: ( ruleFQN )
            // InternalCompras.g:8120:4: ruleFQN
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
    // InternalCompras.g:8131:1: rule__ScriptRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ScriptRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:8135:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:8136:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:8136:2: ( ( ruleFQN ) )
            // InternalCompras.g:8137:3: ( ruleFQN )
            {
             before(grammarAccess.getScriptRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:8138:3: ( ruleFQN )
            // InternalCompras.g:8139:4: ruleFQN
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
    // InternalCompras.g:8150:1: rule__BusinessLayerRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__BusinessLayerRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:8154:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:8155:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:8155:2: ( ( ruleFQN ) )
            // InternalCompras.g:8156:3: ( ruleFQN )
            {
             before(grammarAccess.getBusinessLayerRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:8157:3: ( ruleFQN )
            // InternalCompras.g:8158:4: ruleFQN
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
    // InternalCompras.g:8169:1: rule__DataAccessLayerRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__DataAccessLayerRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:8173:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:8174:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:8174:2: ( ( ruleFQN ) )
            // InternalCompras.g:8175:3: ( ruleFQN )
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:8176:3: ( ruleFQN )
            // InternalCompras.g:8177:4: ruleFQN
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
    // InternalCompras.g:8188:1: rule__CommonLayerRef__EntityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__CommonLayerRef__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:8192:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:8193:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:8193:2: ( ( ruleFQN ) )
            // InternalCompras.g:8194:3: ( ruleFQN )
            {
             before(grammarAccess.getCommonLayerRefAccess().getEntityEntityCrossReference_2_0()); 
            // InternalCompras.g:8195:3: ( ruleFQN )
            // InternalCompras.g:8196:4: ruleFQN
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


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\5\1\25\1\uffff\1\5\1\26\1\25\1\32\1\uffff";
    static final String dfa_3s = "\1\32\1\33\1\uffff\1\5\1\26\1\33\1\64\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\4\uffff\1\1";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\24\uffff\1\2",
            "\1\4\5\uffff\1\3",
            "",
            "\1\5",
            "\1\6",
            "\1\4\5\uffff\1\3",
            "\1\7\27\uffff\1\7\2\2",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

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
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "5418:2: ( rule__ModuleTech__Group_8__0 )?";
        }
    }
    static final String dfa_7s = "\11\uffff";
    static final String dfa_8s = "\1\5\1\25\1\uffff\1\5\1\26\1\25\1\32\2\uffff";
    static final String dfa_9s = "\1\32\1\33\1\uffff\1\5\1\26\1\33\1\64\2\uffff";
    static final String dfa_10s = "\2\uffff\1\2\4\uffff\2\1";
    static final String dfa_11s = "\11\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\24\uffff\1\2",
            "\1\4\5\uffff\1\3",
            "",
            "\1\5",
            "\1\6",
            "\1\4\5\uffff\1\3",
            "\1\10\30\uffff\1\7\1\2",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "5445:2: ( rule__ModuleTech__Group_9__0 )?";
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
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x3E00000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x3E00000000000002L});
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
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000004000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001800004000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000004000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040000004000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0080000004000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000004000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008000004000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000004000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0010000000000002L});

}