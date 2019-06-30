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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AllowedToUse'", "'string'", "'int'", "'bool'", "'float'", "'CREATE'", "'VIEW_GRID'", "'VIEW_DROPDOWN'", "'EDIT'", "'DELETE'", "'SQLSERVER'", "'ORACLE (future...)'", "'POSTGRES (future...)'", "'SolutionName'", "':'", "'{'", "'Domain'", "'Architecture'", "'Technology'", "'}'", "'.'", "'Module'", "'Entities'", "'Functionalities'", "'['", "'label'", "']'", "'RelEntity'", "'Layers'", "'PresentationLayer'", "'BusinessLayer'", "'DataAccessLayer'", "'CommonLayer'", "'Relations'", "'ControllerSegmentLayer'", "'ViewSegmentLayer'", "'ScriptSegmentLayer'", "'DbConnectorSegmentLayer'", "'AspNet'", "'Database'", "'DatabaseRDBMSType'", "'ConnectionString'", "'Controller'", "'View'", "'Script'", "'BLogic'", "'DataAccess'", "'DtoModel'", "'required'"
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


    // $ANTLR start "entryRuleArchitecture"
    // InternalCompras.g:303:1: entryRuleArchitecture : ruleArchitecture EOF ;
    public final void entryRuleArchitecture() throws RecognitionException {
        try {
            // InternalCompras.g:304:1: ( ruleArchitecture EOF )
            // InternalCompras.g:305:1: ruleArchitecture EOF
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
    // InternalCompras.g:312:1: ruleArchitecture : ( ( rule__Architecture__Group__0 ) ) ;
    public final void ruleArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:316:2: ( ( ( rule__Architecture__Group__0 ) ) )
            // InternalCompras.g:317:2: ( ( rule__Architecture__Group__0 ) )
            {
            // InternalCompras.g:317:2: ( ( rule__Architecture__Group__0 ) )
            // InternalCompras.g:318:3: ( rule__Architecture__Group__0 )
            {
             before(grammarAccess.getArchitectureAccess().getGroup()); 
            // InternalCompras.g:319:3: ( rule__Architecture__Group__0 )
            // InternalCompras.g:319:4: rule__Architecture__Group__0
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
    // InternalCompras.g:328:1: entryRulePresentationLayer : rulePresentationLayer EOF ;
    public final void entryRulePresentationLayer() throws RecognitionException {
        try {
            // InternalCompras.g:329:1: ( rulePresentationLayer EOF )
            // InternalCompras.g:330:1: rulePresentationLayer EOF
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
    // InternalCompras.g:337:1: rulePresentationLayer : ( ( rule__PresentationLayer__Group__0 ) ) ;
    public final void rulePresentationLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:341:2: ( ( ( rule__PresentationLayer__Group__0 ) ) )
            // InternalCompras.g:342:2: ( ( rule__PresentationLayer__Group__0 ) )
            {
            // InternalCompras.g:342:2: ( ( rule__PresentationLayer__Group__0 ) )
            // InternalCompras.g:343:3: ( rule__PresentationLayer__Group__0 )
            {
             before(grammarAccess.getPresentationLayerAccess().getGroup()); 
            // InternalCompras.g:344:3: ( rule__PresentationLayer__Group__0 )
            // InternalCompras.g:344:4: rule__PresentationLayer__Group__0
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
    // InternalCompras.g:353:1: entryRuleControllerSegmentLayer : ruleControllerSegmentLayer EOF ;
    public final void entryRuleControllerSegmentLayer() throws RecognitionException {
        try {
            // InternalCompras.g:354:1: ( ruleControllerSegmentLayer EOF )
            // InternalCompras.g:355:1: ruleControllerSegmentLayer EOF
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
    // InternalCompras.g:362:1: ruleControllerSegmentLayer : ( ( rule__ControllerSegmentLayer__NameAssignment ) ) ;
    public final void ruleControllerSegmentLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:366:2: ( ( ( rule__ControllerSegmentLayer__NameAssignment ) ) )
            // InternalCompras.g:367:2: ( ( rule__ControllerSegmentLayer__NameAssignment ) )
            {
            // InternalCompras.g:367:2: ( ( rule__ControllerSegmentLayer__NameAssignment ) )
            // InternalCompras.g:368:3: ( rule__ControllerSegmentLayer__NameAssignment )
            {
             before(grammarAccess.getControllerSegmentLayerAccess().getNameAssignment()); 
            // InternalCompras.g:369:3: ( rule__ControllerSegmentLayer__NameAssignment )
            // InternalCompras.g:369:4: rule__ControllerSegmentLayer__NameAssignment
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
    // InternalCompras.g:378:1: entryRuleViewSegmentLayer : ruleViewSegmentLayer EOF ;
    public final void entryRuleViewSegmentLayer() throws RecognitionException {
        try {
            // InternalCompras.g:379:1: ( ruleViewSegmentLayer EOF )
            // InternalCompras.g:380:1: ruleViewSegmentLayer EOF
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
    // InternalCompras.g:387:1: ruleViewSegmentLayer : ( ( rule__ViewSegmentLayer__NameAssignment ) ) ;
    public final void ruleViewSegmentLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:391:2: ( ( ( rule__ViewSegmentLayer__NameAssignment ) ) )
            // InternalCompras.g:392:2: ( ( rule__ViewSegmentLayer__NameAssignment ) )
            {
            // InternalCompras.g:392:2: ( ( rule__ViewSegmentLayer__NameAssignment ) )
            // InternalCompras.g:393:3: ( rule__ViewSegmentLayer__NameAssignment )
            {
             before(grammarAccess.getViewSegmentLayerAccess().getNameAssignment()); 
            // InternalCompras.g:394:3: ( rule__ViewSegmentLayer__NameAssignment )
            // InternalCompras.g:394:4: rule__ViewSegmentLayer__NameAssignment
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
    // InternalCompras.g:403:1: entryRuleScriptSegmentLayer : ruleScriptSegmentLayer EOF ;
    public final void entryRuleScriptSegmentLayer() throws RecognitionException {
        try {
            // InternalCompras.g:404:1: ( ruleScriptSegmentLayer EOF )
            // InternalCompras.g:405:1: ruleScriptSegmentLayer EOF
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
    // InternalCompras.g:412:1: ruleScriptSegmentLayer : ( ( rule__ScriptSegmentLayer__NameAssignment ) ) ;
    public final void ruleScriptSegmentLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:416:2: ( ( ( rule__ScriptSegmentLayer__NameAssignment ) ) )
            // InternalCompras.g:417:2: ( ( rule__ScriptSegmentLayer__NameAssignment ) )
            {
            // InternalCompras.g:417:2: ( ( rule__ScriptSegmentLayer__NameAssignment ) )
            // InternalCompras.g:418:3: ( rule__ScriptSegmentLayer__NameAssignment )
            {
             before(grammarAccess.getScriptSegmentLayerAccess().getNameAssignment()); 
            // InternalCompras.g:419:3: ( rule__ScriptSegmentLayer__NameAssignment )
            // InternalCompras.g:419:4: rule__ScriptSegmentLayer__NameAssignment
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
    // InternalCompras.g:428:1: entryRuleBusinessLayer : ruleBusinessLayer EOF ;
    public final void entryRuleBusinessLayer() throws RecognitionException {
        try {
            // InternalCompras.g:429:1: ( ruleBusinessLayer EOF )
            // InternalCompras.g:430:1: ruleBusinessLayer EOF
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
    // InternalCompras.g:437:1: ruleBusinessLayer : ( ( rule__BusinessLayer__NameAssignment ) ) ;
    public final void ruleBusinessLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:441:2: ( ( ( rule__BusinessLayer__NameAssignment ) ) )
            // InternalCompras.g:442:2: ( ( rule__BusinessLayer__NameAssignment ) )
            {
            // InternalCompras.g:442:2: ( ( rule__BusinessLayer__NameAssignment ) )
            // InternalCompras.g:443:3: ( rule__BusinessLayer__NameAssignment )
            {
             before(grammarAccess.getBusinessLayerAccess().getNameAssignment()); 
            // InternalCompras.g:444:3: ( rule__BusinessLayer__NameAssignment )
            // InternalCompras.g:444:4: rule__BusinessLayer__NameAssignment
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
    // InternalCompras.g:453:1: entryRuleDataAccessLayer : ruleDataAccessLayer EOF ;
    public final void entryRuleDataAccessLayer() throws RecognitionException {
        try {
            // InternalCompras.g:454:1: ( ruleDataAccessLayer EOF )
            // InternalCompras.g:455:1: ruleDataAccessLayer EOF
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
    // InternalCompras.g:462:1: ruleDataAccessLayer : ( ( rule__DataAccessLayer__Group__0 ) ) ;
    public final void ruleDataAccessLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:466:2: ( ( ( rule__DataAccessLayer__Group__0 ) ) )
            // InternalCompras.g:467:2: ( ( rule__DataAccessLayer__Group__0 ) )
            {
            // InternalCompras.g:467:2: ( ( rule__DataAccessLayer__Group__0 ) )
            // InternalCompras.g:468:3: ( rule__DataAccessLayer__Group__0 )
            {
             before(grammarAccess.getDataAccessLayerAccess().getGroup()); 
            // InternalCompras.g:469:3: ( rule__DataAccessLayer__Group__0 )
            // InternalCompras.g:469:4: rule__DataAccessLayer__Group__0
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
    // InternalCompras.g:478:1: entryRuleDbConnectorSegmentLayer : ruleDbConnectorSegmentLayer EOF ;
    public final void entryRuleDbConnectorSegmentLayer() throws RecognitionException {
        try {
            // InternalCompras.g:479:1: ( ruleDbConnectorSegmentLayer EOF )
            // InternalCompras.g:480:1: ruleDbConnectorSegmentLayer EOF
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
    // InternalCompras.g:487:1: ruleDbConnectorSegmentLayer : ( ( rule__DbConnectorSegmentLayer__NameAssignment ) ) ;
    public final void ruleDbConnectorSegmentLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:491:2: ( ( ( rule__DbConnectorSegmentLayer__NameAssignment ) ) )
            // InternalCompras.g:492:2: ( ( rule__DbConnectorSegmentLayer__NameAssignment ) )
            {
            // InternalCompras.g:492:2: ( ( rule__DbConnectorSegmentLayer__NameAssignment ) )
            // InternalCompras.g:493:3: ( rule__DbConnectorSegmentLayer__NameAssignment )
            {
             before(grammarAccess.getDbConnectorSegmentLayerAccess().getNameAssignment()); 
            // InternalCompras.g:494:3: ( rule__DbConnectorSegmentLayer__NameAssignment )
            // InternalCompras.g:494:4: rule__DbConnectorSegmentLayer__NameAssignment
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
    // InternalCompras.g:503:1: entryRuleCommonLayer : ruleCommonLayer EOF ;
    public final void entryRuleCommonLayer() throws RecognitionException {
        try {
            // InternalCompras.g:504:1: ( ruleCommonLayer EOF )
            // InternalCompras.g:505:1: ruleCommonLayer EOF
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
    // InternalCompras.g:512:1: ruleCommonLayer : ( ( rule__CommonLayer__NameAssignment ) ) ;
    public final void ruleCommonLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:516:2: ( ( ( rule__CommonLayer__NameAssignment ) ) )
            // InternalCompras.g:517:2: ( ( rule__CommonLayer__NameAssignment ) )
            {
            // InternalCompras.g:517:2: ( ( rule__CommonLayer__NameAssignment ) )
            // InternalCompras.g:518:3: ( rule__CommonLayer__NameAssignment )
            {
             before(grammarAccess.getCommonLayerAccess().getNameAssignment()); 
            // InternalCompras.g:519:3: ( rule__CommonLayer__NameAssignment )
            // InternalCompras.g:519:4: rule__CommonLayer__NameAssignment
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
    // InternalCompras.g:528:1: entryRuleRelations : ruleRelations EOF ;
    public final void entryRuleRelations() throws RecognitionException {
        try {
            // InternalCompras.g:529:1: ( ruleRelations EOF )
            // InternalCompras.g:530:1: ruleRelations EOF
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
    // InternalCompras.g:537:1: ruleRelations : ( ( rule__Relations__Group__0 ) ) ;
    public final void ruleRelations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:541:2: ( ( ( rule__Relations__Group__0 ) ) )
            // InternalCompras.g:542:2: ( ( rule__Relations__Group__0 ) )
            {
            // InternalCompras.g:542:2: ( ( rule__Relations__Group__0 ) )
            // InternalCompras.g:543:3: ( rule__Relations__Group__0 )
            {
             before(grammarAccess.getRelationsAccess().getGroup()); 
            // InternalCompras.g:544:3: ( rule__Relations__Group__0 )
            // InternalCompras.g:544:4: rule__Relations__Group__0
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
    // InternalCompras.g:553:1: entryRuleTechnology : ruleTechnology EOF ;
    public final void entryRuleTechnology() throws RecognitionException {
        try {
            // InternalCompras.g:554:1: ( ruleTechnology EOF )
            // InternalCompras.g:555:1: ruleTechnology EOF
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
    // InternalCompras.g:562:1: ruleTechnology : ( ( rule__Technology__Group__0 ) ) ;
    public final void ruleTechnology() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:566:2: ( ( ( rule__Technology__Group__0 ) ) )
            // InternalCompras.g:567:2: ( ( rule__Technology__Group__0 ) )
            {
            // InternalCompras.g:567:2: ( ( rule__Technology__Group__0 ) )
            // InternalCompras.g:568:3: ( rule__Technology__Group__0 )
            {
             before(grammarAccess.getTechnologyAccess().getGroup()); 
            // InternalCompras.g:569:3: ( rule__Technology__Group__0 )
            // InternalCompras.g:569:4: rule__Technology__Group__0
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
    // InternalCompras.g:578:1: entryRuleModuleTech : ruleModuleTech EOF ;
    public final void entryRuleModuleTech() throws RecognitionException {
        try {
            // InternalCompras.g:579:1: ( ruleModuleTech EOF )
            // InternalCompras.g:580:1: ruleModuleTech EOF
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
    // InternalCompras.g:587:1: ruleModuleTech : ( ( rule__ModuleTech__Group__0 ) ) ;
    public final void ruleModuleTech() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:591:2: ( ( ( rule__ModuleTech__Group__0 ) ) )
            // InternalCompras.g:592:2: ( ( rule__ModuleTech__Group__0 ) )
            {
            // InternalCompras.g:592:2: ( ( rule__ModuleTech__Group__0 ) )
            // InternalCompras.g:593:3: ( rule__ModuleTech__Group__0 )
            {
             before(grammarAccess.getModuleTechAccess().getGroup()); 
            // InternalCompras.g:594:3: ( rule__ModuleTech__Group__0 )
            // InternalCompras.g:594:4: rule__ModuleTech__Group__0
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
    // InternalCompras.g:603:1: entryRuleControllersRef : ruleControllersRef EOF ;
    public final void entryRuleControllersRef() throws RecognitionException {
        try {
            // InternalCompras.g:604:1: ( ruleControllersRef EOF )
            // InternalCompras.g:605:1: ruleControllersRef EOF
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
    // InternalCompras.g:612:1: ruleControllersRef : ( ( rule__ControllersRef__Group__0 ) ) ;
    public final void ruleControllersRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:616:2: ( ( ( rule__ControllersRef__Group__0 ) ) )
            // InternalCompras.g:617:2: ( ( rule__ControllersRef__Group__0 ) )
            {
            // InternalCompras.g:617:2: ( ( rule__ControllersRef__Group__0 ) )
            // InternalCompras.g:618:3: ( rule__ControllersRef__Group__0 )
            {
             before(grammarAccess.getControllersRefAccess().getGroup()); 
            // InternalCompras.g:619:3: ( rule__ControllersRef__Group__0 )
            // InternalCompras.g:619:4: rule__ControllersRef__Group__0
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
    // InternalCompras.g:628:1: entryRuleViewsRef : ruleViewsRef EOF ;
    public final void entryRuleViewsRef() throws RecognitionException {
        try {
            // InternalCompras.g:629:1: ( ruleViewsRef EOF )
            // InternalCompras.g:630:1: ruleViewsRef EOF
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
    // InternalCompras.g:637:1: ruleViewsRef : ( ( rule__ViewsRef__Group__0 ) ) ;
    public final void ruleViewsRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:641:2: ( ( ( rule__ViewsRef__Group__0 ) ) )
            // InternalCompras.g:642:2: ( ( rule__ViewsRef__Group__0 ) )
            {
            // InternalCompras.g:642:2: ( ( rule__ViewsRef__Group__0 ) )
            // InternalCompras.g:643:3: ( rule__ViewsRef__Group__0 )
            {
             before(grammarAccess.getViewsRefAccess().getGroup()); 
            // InternalCompras.g:644:3: ( rule__ViewsRef__Group__0 )
            // InternalCompras.g:644:4: rule__ViewsRef__Group__0
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
    // InternalCompras.g:653:1: entryRuleScriptRef : ruleScriptRef EOF ;
    public final void entryRuleScriptRef() throws RecognitionException {
        try {
            // InternalCompras.g:654:1: ( ruleScriptRef EOF )
            // InternalCompras.g:655:1: ruleScriptRef EOF
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
    // InternalCompras.g:662:1: ruleScriptRef : ( ( rule__ScriptRef__Group__0 ) ) ;
    public final void ruleScriptRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:666:2: ( ( ( rule__ScriptRef__Group__0 ) ) )
            // InternalCompras.g:667:2: ( ( rule__ScriptRef__Group__0 ) )
            {
            // InternalCompras.g:667:2: ( ( rule__ScriptRef__Group__0 ) )
            // InternalCompras.g:668:3: ( rule__ScriptRef__Group__0 )
            {
             before(grammarAccess.getScriptRefAccess().getGroup()); 
            // InternalCompras.g:669:3: ( rule__ScriptRef__Group__0 )
            // InternalCompras.g:669:4: rule__ScriptRef__Group__0
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
    // InternalCompras.g:678:1: entryRuleBusinessLayerRef : ruleBusinessLayerRef EOF ;
    public final void entryRuleBusinessLayerRef() throws RecognitionException {
        try {
            // InternalCompras.g:679:1: ( ruleBusinessLayerRef EOF )
            // InternalCompras.g:680:1: ruleBusinessLayerRef EOF
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
    // InternalCompras.g:687:1: ruleBusinessLayerRef : ( ( rule__BusinessLayerRef__Group__0 ) ) ;
    public final void ruleBusinessLayerRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:691:2: ( ( ( rule__BusinessLayerRef__Group__0 ) ) )
            // InternalCompras.g:692:2: ( ( rule__BusinessLayerRef__Group__0 ) )
            {
            // InternalCompras.g:692:2: ( ( rule__BusinessLayerRef__Group__0 ) )
            // InternalCompras.g:693:3: ( rule__BusinessLayerRef__Group__0 )
            {
             before(grammarAccess.getBusinessLayerRefAccess().getGroup()); 
            // InternalCompras.g:694:3: ( rule__BusinessLayerRef__Group__0 )
            // InternalCompras.g:694:4: rule__BusinessLayerRef__Group__0
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
    // InternalCompras.g:703:1: entryRuleDataAccessLayerRef : ruleDataAccessLayerRef EOF ;
    public final void entryRuleDataAccessLayerRef() throws RecognitionException {
        try {
            // InternalCompras.g:704:1: ( ruleDataAccessLayerRef EOF )
            // InternalCompras.g:705:1: ruleDataAccessLayerRef EOF
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
    // InternalCompras.g:712:1: ruleDataAccessLayerRef : ( ( rule__DataAccessLayerRef__Group__0 ) ) ;
    public final void ruleDataAccessLayerRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:716:2: ( ( ( rule__DataAccessLayerRef__Group__0 ) ) )
            // InternalCompras.g:717:2: ( ( rule__DataAccessLayerRef__Group__0 ) )
            {
            // InternalCompras.g:717:2: ( ( rule__DataAccessLayerRef__Group__0 ) )
            // InternalCompras.g:718:3: ( rule__DataAccessLayerRef__Group__0 )
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getGroup()); 
            // InternalCompras.g:719:3: ( rule__DataAccessLayerRef__Group__0 )
            // InternalCompras.g:719:4: rule__DataAccessLayerRef__Group__0
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
    // InternalCompras.g:728:1: entryRuleCommonLayerRef : ruleCommonLayerRef EOF ;
    public final void entryRuleCommonLayerRef() throws RecognitionException {
        try {
            // InternalCompras.g:729:1: ( ruleCommonLayerRef EOF )
            // InternalCompras.g:730:1: ruleCommonLayerRef EOF
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
    // InternalCompras.g:737:1: ruleCommonLayerRef : ( ( rule__CommonLayerRef__Group__0 ) ) ;
    public final void ruleCommonLayerRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:741:2: ( ( ( rule__CommonLayerRef__Group__0 ) ) )
            // InternalCompras.g:742:2: ( ( rule__CommonLayerRef__Group__0 ) )
            {
            // InternalCompras.g:742:2: ( ( rule__CommonLayerRef__Group__0 ) )
            // InternalCompras.g:743:3: ( rule__CommonLayerRef__Group__0 )
            {
             before(grammarAccess.getCommonLayerRefAccess().getGroup()); 
            // InternalCompras.g:744:3: ( rule__CommonLayerRef__Group__0 )
            // InternalCompras.g:744:4: rule__CommonLayerRef__Group__0
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
    // InternalCompras.g:753:1: entryRuleConnectionString : ruleConnectionString EOF ;
    public final void entryRuleConnectionString() throws RecognitionException {
        try {
            // InternalCompras.g:754:1: ( ruleConnectionString EOF )
            // InternalCompras.g:755:1: ruleConnectionString EOF
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
    // InternalCompras.g:762:1: ruleConnectionString : ( RULE_STRING ) ;
    public final void ruleConnectionString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:766:2: ( ( RULE_STRING ) )
            // InternalCompras.g:767:2: ( RULE_STRING )
            {
            // InternalCompras.g:767:2: ( RULE_STRING )
            // InternalCompras.g:768:3: RULE_STRING
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
    // InternalCompras.g:778:1: ruleCommonFieldType : ( ( rule__CommonFieldType__Alternatives ) ) ;
    public final void ruleCommonFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:782:1: ( ( ( rule__CommonFieldType__Alternatives ) ) )
            // InternalCompras.g:783:2: ( ( rule__CommonFieldType__Alternatives ) )
            {
            // InternalCompras.g:783:2: ( ( rule__CommonFieldType__Alternatives ) )
            // InternalCompras.g:784:3: ( rule__CommonFieldType__Alternatives )
            {
             before(grammarAccess.getCommonFieldTypeAccess().getAlternatives()); 
            // InternalCompras.g:785:3: ( rule__CommonFieldType__Alternatives )
            // InternalCompras.g:785:4: rule__CommonFieldType__Alternatives
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


    // $ANTLR start "ruleFunctionalityFieldType"
    // InternalCompras.g:794:1: ruleFunctionalityFieldType : ( ( rule__FunctionalityFieldType__Alternatives ) ) ;
    public final void ruleFunctionalityFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:798:1: ( ( ( rule__FunctionalityFieldType__Alternatives ) ) )
            // InternalCompras.g:799:2: ( ( rule__FunctionalityFieldType__Alternatives ) )
            {
            // InternalCompras.g:799:2: ( ( rule__FunctionalityFieldType__Alternatives ) )
            // InternalCompras.g:800:3: ( rule__FunctionalityFieldType__Alternatives )
            {
             before(grammarAccess.getFunctionalityFieldTypeAccess().getAlternatives()); 
            // InternalCompras.g:801:3: ( rule__FunctionalityFieldType__Alternatives )
            // InternalCompras.g:801:4: rule__FunctionalityFieldType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FunctionalityFieldType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityFieldTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionalityFieldType"


    // $ANTLR start "ruleRelationsType"
    // InternalCompras.g:810:1: ruleRelationsType : ( ( 'AllowedToUse' ) ) ;
    public final void ruleRelationsType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:814:1: ( ( ( 'AllowedToUse' ) ) )
            // InternalCompras.g:815:2: ( ( 'AllowedToUse' ) )
            {
            // InternalCompras.g:815:2: ( ( 'AllowedToUse' ) )
            // InternalCompras.g:816:3: ( 'AllowedToUse' )
            {
             before(grammarAccess.getRelationsTypeAccess().getALLOWED_TO_USEEnumLiteralDeclaration()); 
            // InternalCompras.g:817:3: ( 'AllowedToUse' )
            // InternalCompras.g:817:4: 'AllowedToUse'
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
    // InternalCompras.g:826:1: ruleDatabaseRDBMSType : ( ( rule__DatabaseRDBMSType__Alternatives ) ) ;
    public final void ruleDatabaseRDBMSType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:830:1: ( ( ( rule__DatabaseRDBMSType__Alternatives ) ) )
            // InternalCompras.g:831:2: ( ( rule__DatabaseRDBMSType__Alternatives ) )
            {
            // InternalCompras.g:831:2: ( ( rule__DatabaseRDBMSType__Alternatives ) )
            // InternalCompras.g:832:3: ( rule__DatabaseRDBMSType__Alternatives )
            {
             before(grammarAccess.getDatabaseRDBMSTypeAccess().getAlternatives()); 
            // InternalCompras.g:833:3: ( rule__DatabaseRDBMSType__Alternatives )
            // InternalCompras.g:833:4: rule__DatabaseRDBMSType__Alternatives
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
    // InternalCompras.g:841:1: rule__EntityType__Alternatives : ( ( ( rule__EntityType__EntityAssignment_0 ) ) | ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) ) );
    public final void rule__EntityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:845:1: ( ( ( rule__EntityType__EntityAssignment_0 ) ) | ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=12 && LA1_0<=15)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCompras.g:846:2: ( ( rule__EntityType__EntityAssignment_0 ) )
                    {
                    // InternalCompras.g:846:2: ( ( rule__EntityType__EntityAssignment_0 ) )
                    // InternalCompras.g:847:3: ( rule__EntityType__EntityAssignment_0 )
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityAssignment_0()); 
                    // InternalCompras.g:848:3: ( rule__EntityType__EntityAssignment_0 )
                    // InternalCompras.g:848:4: rule__EntityType__EntityAssignment_0
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
                    // InternalCompras.g:852:2: ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) )
                    {
                    // InternalCompras.g:852:2: ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) )
                    // InternalCompras.g:853:3: ( rule__EntityType__CommonFieldTypeAssignment_1 )
                    {
                     before(grammarAccess.getEntityTypeAccess().getCommonFieldTypeAssignment_1()); 
                    // InternalCompras.g:854:3: ( rule__EntityType__CommonFieldTypeAssignment_1 )
                    // InternalCompras.g:854:4: rule__EntityType__CommonFieldTypeAssignment_1
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


    // $ANTLR start "rule__CommonFieldType__Alternatives"
    // InternalCompras.g:862:1: rule__CommonFieldType__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'bool' ) ) | ( ( 'float' ) ) );
    public final void rule__CommonFieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:866:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'bool' ) ) | ( ( 'float' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCompras.g:867:2: ( ( 'string' ) )
                    {
                    // InternalCompras.g:867:2: ( ( 'string' ) )
                    // InternalCompras.g:868:3: ( 'string' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalCompras.g:869:3: ( 'string' )
                    // InternalCompras.g:869:4: 'string'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:873:2: ( ( 'int' ) )
                    {
                    // InternalCompras.g:873:2: ( ( 'int' ) )
                    // InternalCompras.g:874:3: ( 'int' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalCompras.g:875:3: ( 'int' )
                    // InternalCompras.g:875:4: 'int'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:879:2: ( ( 'bool' ) )
                    {
                    // InternalCompras.g:879:2: ( ( 'bool' ) )
                    // InternalCompras.g:880:3: ( 'bool' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getBOOLEnumLiteralDeclaration_2()); 
                    // InternalCompras.g:881:3: ( 'bool' )
                    // InternalCompras.g:881:4: 'bool'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getBOOLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCompras.g:885:2: ( ( 'float' ) )
                    {
                    // InternalCompras.g:885:2: ( ( 'float' ) )
                    // InternalCompras.g:886:3: ( 'float' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getFLOATEnumLiteralDeclaration_3()); 
                    // InternalCompras.g:887:3: ( 'float' )
                    // InternalCompras.g:887:4: 'float'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getFLOATEnumLiteralDeclaration_3()); 

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


    // $ANTLR start "rule__FunctionalityFieldType__Alternatives"
    // InternalCompras.g:895:1: rule__FunctionalityFieldType__Alternatives : ( ( ( 'CREATE' ) ) | ( ( 'VIEW_GRID' ) ) | ( ( 'VIEW_DROPDOWN' ) ) | ( ( 'EDIT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__FunctionalityFieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:899:1: ( ( ( 'CREATE' ) ) | ( ( 'VIEW_GRID' ) ) | ( ( 'VIEW_DROPDOWN' ) ) | ( ( 'EDIT' ) ) | ( ( 'DELETE' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
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
                    // InternalCompras.g:900:2: ( ( 'CREATE' ) )
                    {
                    // InternalCompras.g:900:2: ( ( 'CREATE' ) )
                    // InternalCompras.g:901:3: ( 'CREATE' )
                    {
                     before(grammarAccess.getFunctionalityFieldTypeAccess().getCREATEEnumLiteralDeclaration_0()); 
                    // InternalCompras.g:902:3: ( 'CREATE' )
                    // InternalCompras.g:902:4: 'CREATE'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionalityFieldTypeAccess().getCREATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:906:2: ( ( 'VIEW_GRID' ) )
                    {
                    // InternalCompras.g:906:2: ( ( 'VIEW_GRID' ) )
                    // InternalCompras.g:907:3: ( 'VIEW_GRID' )
                    {
                     before(grammarAccess.getFunctionalityFieldTypeAccess().getVIEW_GRIDEnumLiteralDeclaration_1()); 
                    // InternalCompras.g:908:3: ( 'VIEW_GRID' )
                    // InternalCompras.g:908:4: 'VIEW_GRID'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionalityFieldTypeAccess().getVIEW_GRIDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:912:2: ( ( 'VIEW_DROPDOWN' ) )
                    {
                    // InternalCompras.g:912:2: ( ( 'VIEW_DROPDOWN' ) )
                    // InternalCompras.g:913:3: ( 'VIEW_DROPDOWN' )
                    {
                     before(grammarAccess.getFunctionalityFieldTypeAccess().getVIEW_DROPDOWNEnumLiteralDeclaration_2()); 
                    // InternalCompras.g:914:3: ( 'VIEW_DROPDOWN' )
                    // InternalCompras.g:914:4: 'VIEW_DROPDOWN'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionalityFieldTypeAccess().getVIEW_DROPDOWNEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCompras.g:918:2: ( ( 'EDIT' ) )
                    {
                    // InternalCompras.g:918:2: ( ( 'EDIT' ) )
                    // InternalCompras.g:919:3: ( 'EDIT' )
                    {
                     before(grammarAccess.getFunctionalityFieldTypeAccess().getEDITEnumLiteralDeclaration_3()); 
                    // InternalCompras.g:920:3: ( 'EDIT' )
                    // InternalCompras.g:920:4: 'EDIT'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionalityFieldTypeAccess().getEDITEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCompras.g:924:2: ( ( 'DELETE' ) )
                    {
                    // InternalCompras.g:924:2: ( ( 'DELETE' ) )
                    // InternalCompras.g:925:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getFunctionalityFieldTypeAccess().getDELETEEnumLiteralDeclaration_4()); 
                    // InternalCompras.g:926:3: ( 'DELETE' )
                    // InternalCompras.g:926:4: 'DELETE'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionalityFieldTypeAccess().getDELETEEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__FunctionalityFieldType__Alternatives"


    // $ANTLR start "rule__DatabaseRDBMSType__Alternatives"
    // InternalCompras.g:934:1: rule__DatabaseRDBMSType__Alternatives : ( ( ( 'SQLSERVER' ) ) | ( ( 'ORACLE (future...)' ) ) | ( ( 'POSTGRES (future...)' ) ) );
    public final void rule__DatabaseRDBMSType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:938:1: ( ( ( 'SQLSERVER' ) ) | ( ( 'ORACLE (future...)' ) ) | ( ( 'POSTGRES (future...)' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
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
                    // InternalCompras.g:939:2: ( ( 'SQLSERVER' ) )
                    {
                    // InternalCompras.g:939:2: ( ( 'SQLSERVER' ) )
                    // InternalCompras.g:940:3: ( 'SQLSERVER' )
                    {
                     before(grammarAccess.getDatabaseRDBMSTypeAccess().getSQLSERVEREnumLiteralDeclaration_0()); 
                    // InternalCompras.g:941:3: ( 'SQLSERVER' )
                    // InternalCompras.g:941:4: 'SQLSERVER'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseRDBMSTypeAccess().getSQLSERVEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:945:2: ( ( 'ORACLE (future...)' ) )
                    {
                    // InternalCompras.g:945:2: ( ( 'ORACLE (future...)' ) )
                    // InternalCompras.g:946:3: ( 'ORACLE (future...)' )
                    {
                     before(grammarAccess.getDatabaseRDBMSTypeAccess().getORACLEEnumLiteralDeclaration_1()); 
                    // InternalCompras.g:947:3: ( 'ORACLE (future...)' )
                    // InternalCompras.g:947:4: 'ORACLE (future...)'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseRDBMSTypeAccess().getORACLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:951:2: ( ( 'POSTGRES (future...)' ) )
                    {
                    // InternalCompras.g:951:2: ( ( 'POSTGRES (future...)' ) )
                    // InternalCompras.g:952:3: ( 'POSTGRES (future...)' )
                    {
                     before(grammarAccess.getDatabaseRDBMSTypeAccess().getPOSTGRESEnumLiteralDeclaration_2()); 
                    // InternalCompras.g:953:3: ( 'POSTGRES (future...)' )
                    // InternalCompras.g:953:4: 'POSTGRES (future...)'
                    {
                    match(input,23,FOLLOW_2); 

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
    // InternalCompras.g:961:1: rule__Solution__Group__0 : rule__Solution__Group__0__Impl rule__Solution__Group__1 ;
    public final void rule__Solution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:965:1: ( rule__Solution__Group__0__Impl rule__Solution__Group__1 )
            // InternalCompras.g:966:2: rule__Solution__Group__0__Impl rule__Solution__Group__1
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
    // InternalCompras.g:973:1: rule__Solution__Group__0__Impl : ( 'SolutionName' ) ;
    public final void rule__Solution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:977:1: ( ( 'SolutionName' ) )
            // InternalCompras.g:978:1: ( 'SolutionName' )
            {
            // InternalCompras.g:978:1: ( 'SolutionName' )
            // InternalCompras.g:979:2: 'SolutionName'
            {
             before(grammarAccess.getSolutionAccess().getSolutionNameKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCompras.g:988:1: rule__Solution__Group__1 : rule__Solution__Group__1__Impl rule__Solution__Group__2 ;
    public final void rule__Solution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:992:1: ( rule__Solution__Group__1__Impl rule__Solution__Group__2 )
            // InternalCompras.g:993:2: rule__Solution__Group__1__Impl rule__Solution__Group__2
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
    // InternalCompras.g:1000:1: rule__Solution__Group__1__Impl : ( ':' ) ;
    public final void rule__Solution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1004:1: ( ( ':' ) )
            // InternalCompras.g:1005:1: ( ':' )
            {
            // InternalCompras.g:1005:1: ( ':' )
            // InternalCompras.g:1006:2: ':'
            {
             before(grammarAccess.getSolutionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:1015:1: rule__Solution__Group__2 : rule__Solution__Group__2__Impl rule__Solution__Group__3 ;
    public final void rule__Solution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1019:1: ( rule__Solution__Group__2__Impl rule__Solution__Group__3 )
            // InternalCompras.g:1020:2: rule__Solution__Group__2__Impl rule__Solution__Group__3
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
    // InternalCompras.g:1027:1: rule__Solution__Group__2__Impl : ( ( rule__Solution__NameAssignment_2 ) ) ;
    public final void rule__Solution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1031:1: ( ( ( rule__Solution__NameAssignment_2 ) ) )
            // InternalCompras.g:1032:1: ( ( rule__Solution__NameAssignment_2 ) )
            {
            // InternalCompras.g:1032:1: ( ( rule__Solution__NameAssignment_2 ) )
            // InternalCompras.g:1033:2: ( rule__Solution__NameAssignment_2 )
            {
             before(grammarAccess.getSolutionAccess().getNameAssignment_2()); 
            // InternalCompras.g:1034:2: ( rule__Solution__NameAssignment_2 )
            // InternalCompras.g:1034:3: rule__Solution__NameAssignment_2
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
    // InternalCompras.g:1042:1: rule__Solution__Group__3 : rule__Solution__Group__3__Impl rule__Solution__Group__4 ;
    public final void rule__Solution__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1046:1: ( rule__Solution__Group__3__Impl rule__Solution__Group__4 )
            // InternalCompras.g:1047:2: rule__Solution__Group__3__Impl rule__Solution__Group__4
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
    // InternalCompras.g:1054:1: rule__Solution__Group__3__Impl : ( '{' ) ;
    public final void rule__Solution__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1058:1: ( ( '{' ) )
            // InternalCompras.g:1059:1: ( '{' )
            {
            // InternalCompras.g:1059:1: ( '{' )
            // InternalCompras.g:1060:2: '{'
            {
             before(grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:1069:1: rule__Solution__Group__4 : rule__Solution__Group__4__Impl rule__Solution__Group__5 ;
    public final void rule__Solution__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1073:1: ( rule__Solution__Group__4__Impl rule__Solution__Group__5 )
            // InternalCompras.g:1074:2: rule__Solution__Group__4__Impl rule__Solution__Group__5
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
    // InternalCompras.g:1081:1: rule__Solution__Group__4__Impl : ( 'Domain' ) ;
    public final void rule__Solution__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1085:1: ( ( 'Domain' ) )
            // InternalCompras.g:1086:1: ( 'Domain' )
            {
            // InternalCompras.g:1086:1: ( 'Domain' )
            // InternalCompras.g:1087:2: 'Domain'
            {
             before(grammarAccess.getSolutionAccess().getDomainKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCompras.g:1096:1: rule__Solution__Group__5 : rule__Solution__Group__5__Impl rule__Solution__Group__6 ;
    public final void rule__Solution__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1100:1: ( rule__Solution__Group__5__Impl rule__Solution__Group__6 )
            // InternalCompras.g:1101:2: rule__Solution__Group__5__Impl rule__Solution__Group__6
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
    // InternalCompras.g:1108:1: rule__Solution__Group__5__Impl : ( ':' ) ;
    public final void rule__Solution__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1112:1: ( ( ':' ) )
            // InternalCompras.g:1113:1: ( ':' )
            {
            // InternalCompras.g:1113:1: ( ':' )
            // InternalCompras.g:1114:2: ':'
            {
             before(grammarAccess.getSolutionAccess().getColonKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:1123:1: rule__Solution__Group__6 : rule__Solution__Group__6__Impl rule__Solution__Group__7 ;
    public final void rule__Solution__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1127:1: ( rule__Solution__Group__6__Impl rule__Solution__Group__7 )
            // InternalCompras.g:1128:2: rule__Solution__Group__6__Impl rule__Solution__Group__7
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
    // InternalCompras.g:1135:1: rule__Solution__Group__6__Impl : ( ( rule__Solution__DomainAssignment_6 )? ) ;
    public final void rule__Solution__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1139:1: ( ( ( rule__Solution__DomainAssignment_6 )? ) )
            // InternalCompras.g:1140:1: ( ( rule__Solution__DomainAssignment_6 )? )
            {
            // InternalCompras.g:1140:1: ( ( rule__Solution__DomainAssignment_6 )? )
            // InternalCompras.g:1141:2: ( rule__Solution__DomainAssignment_6 )?
            {
             before(grammarAccess.getSolutionAccess().getDomainAssignment_6()); 
            // InternalCompras.g:1142:2: ( rule__Solution__DomainAssignment_6 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCompras.g:1142:3: rule__Solution__DomainAssignment_6
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
    // InternalCompras.g:1150:1: rule__Solution__Group__7 : rule__Solution__Group__7__Impl rule__Solution__Group__8 ;
    public final void rule__Solution__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1154:1: ( rule__Solution__Group__7__Impl rule__Solution__Group__8 )
            // InternalCompras.g:1155:2: rule__Solution__Group__7__Impl rule__Solution__Group__8
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
    // InternalCompras.g:1162:1: rule__Solution__Group__7__Impl : ( 'Architecture' ) ;
    public final void rule__Solution__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1166:1: ( ( 'Architecture' ) )
            // InternalCompras.g:1167:1: ( 'Architecture' )
            {
            // InternalCompras.g:1167:1: ( 'Architecture' )
            // InternalCompras.g:1168:2: 'Architecture'
            {
             before(grammarAccess.getSolutionAccess().getArchitectureKeyword_7()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCompras.g:1177:1: rule__Solution__Group__8 : rule__Solution__Group__8__Impl rule__Solution__Group__9 ;
    public final void rule__Solution__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1181:1: ( rule__Solution__Group__8__Impl rule__Solution__Group__9 )
            // InternalCompras.g:1182:2: rule__Solution__Group__8__Impl rule__Solution__Group__9
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
    // InternalCompras.g:1189:1: rule__Solution__Group__8__Impl : ( ':' ) ;
    public final void rule__Solution__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1193:1: ( ( ':' ) )
            // InternalCompras.g:1194:1: ( ':' )
            {
            // InternalCompras.g:1194:1: ( ':' )
            // InternalCompras.g:1195:2: ':'
            {
             before(grammarAccess.getSolutionAccess().getColonKeyword_8()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:1204:1: rule__Solution__Group__9 : rule__Solution__Group__9__Impl rule__Solution__Group__10 ;
    public final void rule__Solution__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1208:1: ( rule__Solution__Group__9__Impl rule__Solution__Group__10 )
            // InternalCompras.g:1209:2: rule__Solution__Group__9__Impl rule__Solution__Group__10
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
    // InternalCompras.g:1216:1: rule__Solution__Group__9__Impl : ( ( rule__Solution__ArchitectureAssignment_9 )? ) ;
    public final void rule__Solution__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1220:1: ( ( ( rule__Solution__ArchitectureAssignment_9 )? ) )
            // InternalCompras.g:1221:1: ( ( rule__Solution__ArchitectureAssignment_9 )? )
            {
            // InternalCompras.g:1221:1: ( ( rule__Solution__ArchitectureAssignment_9 )? )
            // InternalCompras.g:1222:2: ( rule__Solution__ArchitectureAssignment_9 )?
            {
             before(grammarAccess.getSolutionAccess().getArchitectureAssignment_9()); 
            // InternalCompras.g:1223:2: ( rule__Solution__ArchitectureAssignment_9 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCompras.g:1223:3: rule__Solution__ArchitectureAssignment_9
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
    // InternalCompras.g:1231:1: rule__Solution__Group__10 : rule__Solution__Group__10__Impl rule__Solution__Group__11 ;
    public final void rule__Solution__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1235:1: ( rule__Solution__Group__10__Impl rule__Solution__Group__11 )
            // InternalCompras.g:1236:2: rule__Solution__Group__10__Impl rule__Solution__Group__11
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
    // InternalCompras.g:1243:1: rule__Solution__Group__10__Impl : ( 'Technology' ) ;
    public final void rule__Solution__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1247:1: ( ( 'Technology' ) )
            // InternalCompras.g:1248:1: ( 'Technology' )
            {
            // InternalCompras.g:1248:1: ( 'Technology' )
            // InternalCompras.g:1249:2: 'Technology'
            {
             before(grammarAccess.getSolutionAccess().getTechnologyKeyword_10()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCompras.g:1258:1: rule__Solution__Group__11 : rule__Solution__Group__11__Impl rule__Solution__Group__12 ;
    public final void rule__Solution__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1262:1: ( rule__Solution__Group__11__Impl rule__Solution__Group__12 )
            // InternalCompras.g:1263:2: rule__Solution__Group__11__Impl rule__Solution__Group__12
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
    // InternalCompras.g:1270:1: rule__Solution__Group__11__Impl : ( ':' ) ;
    public final void rule__Solution__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1274:1: ( ( ':' ) )
            // InternalCompras.g:1275:1: ( ':' )
            {
            // InternalCompras.g:1275:1: ( ':' )
            // InternalCompras.g:1276:2: ':'
            {
             before(grammarAccess.getSolutionAccess().getColonKeyword_11()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:1285:1: rule__Solution__Group__12 : rule__Solution__Group__12__Impl rule__Solution__Group__13 ;
    public final void rule__Solution__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1289:1: ( rule__Solution__Group__12__Impl rule__Solution__Group__13 )
            // InternalCompras.g:1290:2: rule__Solution__Group__12__Impl rule__Solution__Group__13
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
    // InternalCompras.g:1297:1: rule__Solution__Group__12__Impl : ( ( rule__Solution__TechnologyAssignment_12 )? ) ;
    public final void rule__Solution__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1301:1: ( ( ( rule__Solution__TechnologyAssignment_12 )? ) )
            // InternalCompras.g:1302:1: ( ( rule__Solution__TechnologyAssignment_12 )? )
            {
            // InternalCompras.g:1302:1: ( ( rule__Solution__TechnologyAssignment_12 )? )
            // InternalCompras.g:1303:2: ( rule__Solution__TechnologyAssignment_12 )?
            {
             before(grammarAccess.getSolutionAccess().getTechnologyAssignment_12()); 
            // InternalCompras.g:1304:2: ( rule__Solution__TechnologyAssignment_12 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCompras.g:1304:3: rule__Solution__TechnologyAssignment_12
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
    // InternalCompras.g:1312:1: rule__Solution__Group__13 : rule__Solution__Group__13__Impl ;
    public final void rule__Solution__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1316:1: ( rule__Solution__Group__13__Impl )
            // InternalCompras.g:1317:2: rule__Solution__Group__13__Impl
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
    // InternalCompras.g:1323:1: rule__Solution__Group__13__Impl : ( '}' ) ;
    public final void rule__Solution__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1327:1: ( ( '}' ) )
            // InternalCompras.g:1328:1: ( '}' )
            {
            // InternalCompras.g:1328:1: ( '}' )
            // InternalCompras.g:1329:2: '}'
            {
             before(grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_13()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:1339:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1343:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCompras.g:1344:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalCompras.g:1351:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1355:1: ( ( RULE_ID ) )
            // InternalCompras.g:1356:1: ( RULE_ID )
            {
            // InternalCompras.g:1356:1: ( RULE_ID )
            // InternalCompras.g:1357:2: RULE_ID
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
    // InternalCompras.g:1366:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1370:1: ( rule__FQN__Group__1__Impl )
            // InternalCompras.g:1371:2: rule__FQN__Group__1__Impl
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
    // InternalCompras.g:1377:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1381:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCompras.g:1382:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCompras.g:1382:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCompras.g:1383:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCompras.g:1384:2: ( rule__FQN__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCompras.g:1384:3: rule__FQN__Group_1__0
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
    // InternalCompras.g:1393:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1397:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCompras.g:1398:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalCompras.g:1405:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1409:1: ( ( '.' ) )
            // InternalCompras.g:1410:1: ( '.' )
            {
            // InternalCompras.g:1410:1: ( '.' )
            // InternalCompras.g:1411:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCompras.g:1420:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1424:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCompras.g:1425:2: rule__FQN__Group_1__1__Impl
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
    // InternalCompras.g:1431:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1435:1: ( ( RULE_ID ) )
            // InternalCompras.g:1436:1: ( RULE_ID )
            {
            // InternalCompras.g:1436:1: ( RULE_ID )
            // InternalCompras.g:1437:2: RULE_ID
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
    // InternalCompras.g:1447:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1451:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalCompras.g:1452:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalCompras.g:1459:1: rule__Domain__Group__0__Impl : ( '{' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1463:1: ( ( '{' ) )
            // InternalCompras.g:1464:1: ( '{' )
            {
            // InternalCompras.g:1464:1: ( '{' )
            // InternalCompras.g:1465:2: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:1474:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1478:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalCompras.g:1479:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
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
    // InternalCompras.g:1486:1: rule__Domain__Group__1__Impl : ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1490:1: ( ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) ) )
            // InternalCompras.g:1491:1: ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) )
            {
            // InternalCompras.g:1491:1: ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) )
            // InternalCompras.g:1492:2: ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* )
            {
            // InternalCompras.g:1492:2: ( ( rule__Domain__ModuleAssignment_1 ) )
            // InternalCompras.g:1493:3: ( rule__Domain__ModuleAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getModuleAssignment_1()); 
            // InternalCompras.g:1494:3: ( rule__Domain__ModuleAssignment_1 )
            // InternalCompras.g:1494:4: rule__Domain__ModuleAssignment_1
            {
            pushFollow(FOLLOW_14);
            rule__Domain__ModuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getModuleAssignment_1()); 

            }

            // InternalCompras.g:1497:2: ( ( rule__Domain__ModuleAssignment_1 )* )
            // InternalCompras.g:1498:3: ( rule__Domain__ModuleAssignment_1 )*
            {
             before(grammarAccess.getDomainAccess().getModuleAssignment_1()); 
            // InternalCompras.g:1499:3: ( rule__Domain__ModuleAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCompras.g:1499:4: rule__Domain__ModuleAssignment_1
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
    // InternalCompras.g:1508:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1512:1: ( rule__Domain__Group__2__Impl )
            // InternalCompras.g:1513:2: rule__Domain__Group__2__Impl
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
    // InternalCompras.g:1519:1: rule__Domain__Group__2__Impl : ( '}' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1523:1: ( ( '}' ) )
            // InternalCompras.g:1524:1: ( '}' )
            {
            // InternalCompras.g:1524:1: ( '}' )
            // InternalCompras.g:1525:2: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:1535:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1539:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalCompras.g:1540:2: rule__Module__Group__0__Impl rule__Module__Group__1
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
    // InternalCompras.g:1547:1: rule__Module__Group__0__Impl : ( 'Module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1551:1: ( ( 'Module' ) )
            // InternalCompras.g:1552:1: ( 'Module' )
            {
            // InternalCompras.g:1552:1: ( 'Module' )
            // InternalCompras.g:1553:2: 'Module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCompras.g:1562:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1566:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalCompras.g:1567:2: rule__Module__Group__1__Impl rule__Module__Group__2
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
    // InternalCompras.g:1574:1: rule__Module__Group__1__Impl : ( ':' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1578:1: ( ( ':' ) )
            // InternalCompras.g:1579:1: ( ':' )
            {
            // InternalCompras.g:1579:1: ( ':' )
            // InternalCompras.g:1580:2: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:1589:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1593:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalCompras.g:1594:2: rule__Module__Group__2__Impl rule__Module__Group__3
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
    // InternalCompras.g:1601:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1605:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // InternalCompras.g:1606:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // InternalCompras.g:1606:1: ( ( rule__Module__NameAssignment_2 ) )
            // InternalCompras.g:1607:2: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // InternalCompras.g:1608:2: ( rule__Module__NameAssignment_2 )
            // InternalCompras.g:1608:3: rule__Module__NameAssignment_2
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
    // InternalCompras.g:1616:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1620:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalCompras.g:1621:2: rule__Module__Group__3__Impl rule__Module__Group__4
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
    // InternalCompras.g:1628:1: rule__Module__Group__3__Impl : ( ':' ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1632:1: ( ( ':' ) )
            // InternalCompras.g:1633:1: ( ':' )
            {
            // InternalCompras.g:1633:1: ( ':' )
            // InternalCompras.g:1634:2: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:1643:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1647:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // InternalCompras.g:1648:2: rule__Module__Group__4__Impl rule__Module__Group__5
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
    // InternalCompras.g:1655:1: rule__Module__Group__4__Impl : ( '{' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1659:1: ( ( '{' ) )
            // InternalCompras.g:1660:1: ( '{' )
            {
            // InternalCompras.g:1660:1: ( '{' )
            // InternalCompras.g:1661:2: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:1670:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1674:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // InternalCompras.g:1675:2: rule__Module__Group__5__Impl rule__Module__Group__6
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
    // InternalCompras.g:1682:1: rule__Module__Group__5__Impl : ( 'Entities' ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1686:1: ( ( 'Entities' ) )
            // InternalCompras.g:1687:1: ( 'Entities' )
            {
            // InternalCompras.g:1687:1: ( 'Entities' )
            // InternalCompras.g:1688:2: 'Entities'
            {
             before(grammarAccess.getModuleAccess().getEntitiesKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCompras.g:1697:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1701:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // InternalCompras.g:1702:2: rule__Module__Group__6__Impl rule__Module__Group__7
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
    // InternalCompras.g:1709:1: rule__Module__Group__6__Impl : ( ':' ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1713:1: ( ( ':' ) )
            // InternalCompras.g:1714:1: ( ':' )
            {
            // InternalCompras.g:1714:1: ( ':' )
            // InternalCompras.g:1715:2: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:1724:1: rule__Module__Group__7 : rule__Module__Group__7__Impl rule__Module__Group__8 ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1728:1: ( rule__Module__Group__7__Impl rule__Module__Group__8 )
            // InternalCompras.g:1729:2: rule__Module__Group__7__Impl rule__Module__Group__8
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
    // InternalCompras.g:1736:1: rule__Module__Group__7__Impl : ( '{' ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1740:1: ( ( '{' ) )
            // InternalCompras.g:1741:1: ( '{' )
            {
            // InternalCompras.g:1741:1: ( '{' )
            // InternalCompras.g:1742:2: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:1751:1: rule__Module__Group__8 : rule__Module__Group__8__Impl rule__Module__Group__9 ;
    public final void rule__Module__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1755:1: ( rule__Module__Group__8__Impl rule__Module__Group__9 )
            // InternalCompras.g:1756:2: rule__Module__Group__8__Impl rule__Module__Group__9
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
    // InternalCompras.g:1763:1: rule__Module__Group__8__Impl : ( ( rule__Module__EntityAssignment_8 )* ) ;
    public final void rule__Module__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1767:1: ( ( ( rule__Module__EntityAssignment_8 )* ) )
            // InternalCompras.g:1768:1: ( ( rule__Module__EntityAssignment_8 )* )
            {
            // InternalCompras.g:1768:1: ( ( rule__Module__EntityAssignment_8 )* )
            // InternalCompras.g:1769:2: ( rule__Module__EntityAssignment_8 )*
            {
             before(grammarAccess.getModuleAccess().getEntityAssignment_8()); 
            // InternalCompras.g:1770:2: ( rule__Module__EntityAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCompras.g:1770:3: rule__Module__EntityAssignment_8
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
    // InternalCompras.g:1778:1: rule__Module__Group__9 : rule__Module__Group__9__Impl rule__Module__Group__10 ;
    public final void rule__Module__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1782:1: ( rule__Module__Group__9__Impl rule__Module__Group__10 )
            // InternalCompras.g:1783:2: rule__Module__Group__9__Impl rule__Module__Group__10
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
    // InternalCompras.g:1790:1: rule__Module__Group__9__Impl : ( '}' ) ;
    public final void rule__Module__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1794:1: ( ( '}' ) )
            // InternalCompras.g:1795:1: ( '}' )
            {
            // InternalCompras.g:1795:1: ( '}' )
            // InternalCompras.g:1796:2: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_9()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:1805:1: rule__Module__Group__10 : rule__Module__Group__10__Impl rule__Module__Group__11 ;
    public final void rule__Module__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1809:1: ( rule__Module__Group__10__Impl rule__Module__Group__11 )
            // InternalCompras.g:1810:2: rule__Module__Group__10__Impl rule__Module__Group__11
            {
            pushFollow(FOLLOW_3);
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
    // InternalCompras.g:1817:1: rule__Module__Group__10__Impl : ( 'Functionalities' ) ;
    public final void rule__Module__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1821:1: ( ( 'Functionalities' ) )
            // InternalCompras.g:1822:1: ( 'Functionalities' )
            {
            // InternalCompras.g:1822:1: ( 'Functionalities' )
            // InternalCompras.g:1823:2: 'Functionalities'
            {
             before(grammarAccess.getModuleAccess().getFunctionalitiesKeyword_10()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getFunctionalitiesKeyword_10()); 

            }


            }

        }
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
    // InternalCompras.g:1832:1: rule__Module__Group__11 : rule__Module__Group__11__Impl rule__Module__Group__12 ;
    public final void rule__Module__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1836:1: ( rule__Module__Group__11__Impl rule__Module__Group__12 )
            // InternalCompras.g:1837:2: rule__Module__Group__11__Impl rule__Module__Group__12
            {
            pushFollow(FOLLOW_5);
            rule__Module__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__12();

            state._fsp--;


            }

        }
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
    // InternalCompras.g:1844:1: rule__Module__Group__11__Impl : ( ':' ) ;
    public final void rule__Module__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1848:1: ( ( ':' ) )
            // InternalCompras.g:1849:1: ( ':' )
            {
            // InternalCompras.g:1849:1: ( ':' )
            // InternalCompras.g:1850:2: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_11()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getColonKeyword_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__Module__Group__12"
    // InternalCompras.g:1859:1: rule__Module__Group__12 : rule__Module__Group__12__Impl rule__Module__Group__13 ;
    public final void rule__Module__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1863:1: ( rule__Module__Group__12__Impl rule__Module__Group__13 )
            // InternalCompras.g:1864:2: rule__Module__Group__12__Impl rule__Module__Group__13
            {
            pushFollow(FOLLOW_16);
            rule__Module__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__12"


    // $ANTLR start "rule__Module__Group__12__Impl"
    // InternalCompras.g:1871:1: rule__Module__Group__12__Impl : ( '{' ) ;
    public final void rule__Module__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1875:1: ( ( '{' ) )
            // InternalCompras.g:1876:1: ( '{' )
            {
            // InternalCompras.g:1876:1: ( '{' )
            // InternalCompras.g:1877:2: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__12__Impl"


    // $ANTLR start "rule__Module__Group__13"
    // InternalCompras.g:1886:1: rule__Module__Group__13 : rule__Module__Group__13__Impl rule__Module__Group__14 ;
    public final void rule__Module__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1890:1: ( rule__Module__Group__13__Impl rule__Module__Group__14 )
            // InternalCompras.g:1891:2: rule__Module__Group__13__Impl rule__Module__Group__14
            {
            pushFollow(FOLLOW_16);
            rule__Module__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__13"


    // $ANTLR start "rule__Module__Group__13__Impl"
    // InternalCompras.g:1898:1: rule__Module__Group__13__Impl : ( ( rule__Module__FunctionalityAssignment_13 )* ) ;
    public final void rule__Module__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1902:1: ( ( ( rule__Module__FunctionalityAssignment_13 )* ) )
            // InternalCompras.g:1903:1: ( ( rule__Module__FunctionalityAssignment_13 )* )
            {
            // InternalCompras.g:1903:1: ( ( rule__Module__FunctionalityAssignment_13 )* )
            // InternalCompras.g:1904:2: ( rule__Module__FunctionalityAssignment_13 )*
            {
             before(grammarAccess.getModuleAccess().getFunctionalityAssignment_13()); 
            // InternalCompras.g:1905:2: ( rule__Module__FunctionalityAssignment_13 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCompras.g:1905:3: rule__Module__FunctionalityAssignment_13
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Module__FunctionalityAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getFunctionalityAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__13__Impl"


    // $ANTLR start "rule__Module__Group__14"
    // InternalCompras.g:1913:1: rule__Module__Group__14 : rule__Module__Group__14__Impl rule__Module__Group__15 ;
    public final void rule__Module__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1917:1: ( rule__Module__Group__14__Impl rule__Module__Group__15 )
            // InternalCompras.g:1918:2: rule__Module__Group__14__Impl rule__Module__Group__15
            {
            pushFollow(FOLLOW_13);
            rule__Module__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__14"


    // $ANTLR start "rule__Module__Group__14__Impl"
    // InternalCompras.g:1925:1: rule__Module__Group__14__Impl : ( '}' ) ;
    public final void rule__Module__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1929:1: ( ( '}' ) )
            // InternalCompras.g:1930:1: ( '}' )
            {
            // InternalCompras.g:1930:1: ( '}' )
            // InternalCompras.g:1931:2: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_14()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__14__Impl"


    // $ANTLR start "rule__Module__Group__15"
    // InternalCompras.g:1940:1: rule__Module__Group__15 : rule__Module__Group__15__Impl ;
    public final void rule__Module__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1944:1: ( rule__Module__Group__15__Impl )
            // InternalCompras.g:1945:2: rule__Module__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__15"


    // $ANTLR start "rule__Module__Group__15__Impl"
    // InternalCompras.g:1951:1: rule__Module__Group__15__Impl : ( '}' ) ;
    public final void rule__Module__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1955:1: ( ( '}' ) )
            // InternalCompras.g:1956:1: ( '}' )
            {
            // InternalCompras.g:1956:1: ( '}' )
            // InternalCompras.g:1957:2: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_15()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__15__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalCompras.g:1967:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1971:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalCompras.g:1972:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalCompras.g:1979:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1983:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // InternalCompras.g:1984:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // InternalCompras.g:1984:1: ( ( rule__Entity__NameAssignment_0 ) )
            // InternalCompras.g:1985:2: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // InternalCompras.g:1986:2: ( rule__Entity__NameAssignment_0 )
            // InternalCompras.g:1986:3: rule__Entity__NameAssignment_0
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
    // InternalCompras.g:1994:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1998:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalCompras.g:1999:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalCompras.g:2006:1: rule__Entity__Group__1__Impl : ( ':' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2010:1: ( ( ':' ) )
            // InternalCompras.g:2011:1: ( ':' )
            {
            // InternalCompras.g:2011:1: ( ':' )
            // InternalCompras.g:2012:2: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:2021:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2025:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalCompras.g:2026:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalCompras.g:2033:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2037:1: ( ( '{' ) )
            // InternalCompras.g:2038:1: ( '{' )
            {
            // InternalCompras.g:2038:1: ( '{' )
            // InternalCompras.g:2039:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:2048:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2052:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalCompras.g:2053:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalCompras.g:2060:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__EntityFieldAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2064:1: ( ( ( rule__Entity__EntityFieldAssignment_3 )* ) )
            // InternalCompras.g:2065:1: ( ( rule__Entity__EntityFieldAssignment_3 )* )
            {
            // InternalCompras.g:2065:1: ( ( rule__Entity__EntityFieldAssignment_3 )* )
            // InternalCompras.g:2066:2: ( rule__Entity__EntityFieldAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getEntityFieldAssignment_3()); 
            // InternalCompras.g:2067:2: ( rule__Entity__EntityFieldAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=12 && LA12_0<=15)||LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCompras.g:2067:3: rule__Entity__EntityFieldAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Entity__EntityFieldAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalCompras.g:2075:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2079:1: ( rule__Entity__Group__4__Impl )
            // InternalCompras.g:2080:2: rule__Entity__Group__4__Impl
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
    // InternalCompras.g:2086:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2090:1: ( ( '}' ) )
            // InternalCompras.g:2091:1: ( '}' )
            {
            // InternalCompras.g:2091:1: ( '}' )
            // InternalCompras.g:2092:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:2102:1: rule__EntityField__Group__0 : rule__EntityField__Group__0__Impl rule__EntityField__Group__1 ;
    public final void rule__EntityField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2106:1: ( rule__EntityField__Group__0__Impl rule__EntityField__Group__1 )
            // InternalCompras.g:2107:2: rule__EntityField__Group__0__Impl rule__EntityField__Group__1
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
    // InternalCompras.g:2114:1: rule__EntityField__Group__0__Impl : ( ( rule__EntityField__EntityFieldRequiredAssignment_0 )? ) ;
    public final void rule__EntityField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2118:1: ( ( ( rule__EntityField__EntityFieldRequiredAssignment_0 )? ) )
            // InternalCompras.g:2119:1: ( ( rule__EntityField__EntityFieldRequiredAssignment_0 )? )
            {
            // InternalCompras.g:2119:1: ( ( rule__EntityField__EntityFieldRequiredAssignment_0 )? )
            // InternalCompras.g:2120:2: ( rule__EntityField__EntityFieldRequiredAssignment_0 )?
            {
             before(grammarAccess.getEntityFieldAccess().getEntityFieldRequiredAssignment_0()); 
            // InternalCompras.g:2121:2: ( rule__EntityField__EntityFieldRequiredAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==59) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalCompras.g:2121:3: rule__EntityField__EntityFieldRequiredAssignment_0
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
    // InternalCompras.g:2129:1: rule__EntityField__Group__1 : rule__EntityField__Group__1__Impl rule__EntityField__Group__2 ;
    public final void rule__EntityField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2133:1: ( rule__EntityField__Group__1__Impl rule__EntityField__Group__2 )
            // InternalCompras.g:2134:2: rule__EntityField__Group__1__Impl rule__EntityField__Group__2
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
    // InternalCompras.g:2141:1: rule__EntityField__Group__1__Impl : ( ( rule__EntityField__EntityFieldLabelAssignment_1 )? ) ;
    public final void rule__EntityField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2145:1: ( ( ( rule__EntityField__EntityFieldLabelAssignment_1 )? ) )
            // InternalCompras.g:2146:1: ( ( rule__EntityField__EntityFieldLabelAssignment_1 )? )
            {
            // InternalCompras.g:2146:1: ( ( rule__EntityField__EntityFieldLabelAssignment_1 )? )
            // InternalCompras.g:2147:2: ( rule__EntityField__EntityFieldLabelAssignment_1 )?
            {
             before(grammarAccess.getEntityFieldAccess().getEntityFieldLabelAssignment_1()); 
            // InternalCompras.g:2148:2: ( rule__EntityField__EntityFieldLabelAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCompras.g:2148:3: rule__EntityField__EntityFieldLabelAssignment_1
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
    // InternalCompras.g:2156:1: rule__EntityField__Group__2 : rule__EntityField__Group__2__Impl rule__EntityField__Group__3 ;
    public final void rule__EntityField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2160:1: ( rule__EntityField__Group__2__Impl rule__EntityField__Group__3 )
            // InternalCompras.g:2161:2: rule__EntityField__Group__2__Impl rule__EntityField__Group__3
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
    // InternalCompras.g:2168:1: rule__EntityField__Group__2__Impl : ( ( rule__EntityField__EntityTypeAssignment_2 ) ) ;
    public final void rule__EntityField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2172:1: ( ( ( rule__EntityField__EntityTypeAssignment_2 ) ) )
            // InternalCompras.g:2173:1: ( ( rule__EntityField__EntityTypeAssignment_2 ) )
            {
            // InternalCompras.g:2173:1: ( ( rule__EntityField__EntityTypeAssignment_2 ) )
            // InternalCompras.g:2174:2: ( rule__EntityField__EntityTypeAssignment_2 )
            {
             before(grammarAccess.getEntityFieldAccess().getEntityTypeAssignment_2()); 
            // InternalCompras.g:2175:2: ( rule__EntityField__EntityTypeAssignment_2 )
            // InternalCompras.g:2175:3: rule__EntityField__EntityTypeAssignment_2
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
    // InternalCompras.g:2183:1: rule__EntityField__Group__3 : rule__EntityField__Group__3__Impl ;
    public final void rule__EntityField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2187:1: ( rule__EntityField__Group__3__Impl )
            // InternalCompras.g:2188:2: rule__EntityField__Group__3__Impl
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
    // InternalCompras.g:2194:1: rule__EntityField__Group__3__Impl : ( ( rule__EntityField__NameAssignment_3 ) ) ;
    public final void rule__EntityField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2198:1: ( ( ( rule__EntityField__NameAssignment_3 ) ) )
            // InternalCompras.g:2199:1: ( ( rule__EntityField__NameAssignment_3 ) )
            {
            // InternalCompras.g:2199:1: ( ( rule__EntityField__NameAssignment_3 ) )
            // InternalCompras.g:2200:2: ( rule__EntityField__NameAssignment_3 )
            {
             before(grammarAccess.getEntityFieldAccess().getNameAssignment_3()); 
            // InternalCompras.g:2201:2: ( rule__EntityField__NameAssignment_3 )
            // InternalCompras.g:2201:3: rule__EntityField__NameAssignment_3
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
    // InternalCompras.g:2210:1: rule__EntityFieldLabel__Group__0 : rule__EntityFieldLabel__Group__0__Impl rule__EntityFieldLabel__Group__1 ;
    public final void rule__EntityFieldLabel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2214:1: ( rule__EntityFieldLabel__Group__0__Impl rule__EntityFieldLabel__Group__1 )
            // InternalCompras.g:2215:2: rule__EntityFieldLabel__Group__0__Impl rule__EntityFieldLabel__Group__1
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
    // InternalCompras.g:2222:1: rule__EntityFieldLabel__Group__0__Impl : ( '[' ) ;
    public final void rule__EntityFieldLabel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2226:1: ( ( '[' ) )
            // InternalCompras.g:2227:1: ( '[' )
            {
            // InternalCompras.g:2227:1: ( '[' )
            // InternalCompras.g:2228:2: '['
            {
             before(grammarAccess.getEntityFieldLabelAccess().getLeftSquareBracketKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCompras.g:2237:1: rule__EntityFieldLabel__Group__1 : rule__EntityFieldLabel__Group__1__Impl rule__EntityFieldLabel__Group__2 ;
    public final void rule__EntityFieldLabel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2241:1: ( rule__EntityFieldLabel__Group__1__Impl rule__EntityFieldLabel__Group__2 )
            // InternalCompras.g:2242:2: rule__EntityFieldLabel__Group__1__Impl rule__EntityFieldLabel__Group__2
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
    // InternalCompras.g:2249:1: rule__EntityFieldLabel__Group__1__Impl : ( 'label' ) ;
    public final void rule__EntityFieldLabel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2253:1: ( ( 'label' ) )
            // InternalCompras.g:2254:1: ( 'label' )
            {
            // InternalCompras.g:2254:1: ( 'label' )
            // InternalCompras.g:2255:2: 'label'
            {
             before(grammarAccess.getEntityFieldLabelAccess().getLabelKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCompras.g:2264:1: rule__EntityFieldLabel__Group__2 : rule__EntityFieldLabel__Group__2__Impl rule__EntityFieldLabel__Group__3 ;
    public final void rule__EntityFieldLabel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2268:1: ( rule__EntityFieldLabel__Group__2__Impl rule__EntityFieldLabel__Group__3 )
            // InternalCompras.g:2269:2: rule__EntityFieldLabel__Group__2__Impl rule__EntityFieldLabel__Group__3
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
    // InternalCompras.g:2276:1: rule__EntityFieldLabel__Group__2__Impl : ( ':' ) ;
    public final void rule__EntityFieldLabel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2280:1: ( ( ':' ) )
            // InternalCompras.g:2281:1: ( ':' )
            {
            // InternalCompras.g:2281:1: ( ':' )
            // InternalCompras.g:2282:2: ':'
            {
             before(grammarAccess.getEntityFieldLabelAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:2291:1: rule__EntityFieldLabel__Group__3 : rule__EntityFieldLabel__Group__3__Impl rule__EntityFieldLabel__Group__4 ;
    public final void rule__EntityFieldLabel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2295:1: ( rule__EntityFieldLabel__Group__3__Impl rule__EntityFieldLabel__Group__4 )
            // InternalCompras.g:2296:2: rule__EntityFieldLabel__Group__3__Impl rule__EntityFieldLabel__Group__4
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
    // InternalCompras.g:2303:1: rule__EntityFieldLabel__Group__3__Impl : ( ( rule__EntityFieldLabel__NameAssignment_3 ) ) ;
    public final void rule__EntityFieldLabel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2307:1: ( ( ( rule__EntityFieldLabel__NameAssignment_3 ) ) )
            // InternalCompras.g:2308:1: ( ( rule__EntityFieldLabel__NameAssignment_3 ) )
            {
            // InternalCompras.g:2308:1: ( ( rule__EntityFieldLabel__NameAssignment_3 ) )
            // InternalCompras.g:2309:2: ( rule__EntityFieldLabel__NameAssignment_3 )
            {
             before(grammarAccess.getEntityFieldLabelAccess().getNameAssignment_3()); 
            // InternalCompras.g:2310:2: ( rule__EntityFieldLabel__NameAssignment_3 )
            // InternalCompras.g:2310:3: rule__EntityFieldLabel__NameAssignment_3
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
    // InternalCompras.g:2318:1: rule__EntityFieldLabel__Group__4 : rule__EntityFieldLabel__Group__4__Impl ;
    public final void rule__EntityFieldLabel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2322:1: ( rule__EntityFieldLabel__Group__4__Impl )
            // InternalCompras.g:2323:2: rule__EntityFieldLabel__Group__4__Impl
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
    // InternalCompras.g:2329:1: rule__EntityFieldLabel__Group__4__Impl : ( ']' ) ;
    public final void rule__EntityFieldLabel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2333:1: ( ( ']' ) )
            // InternalCompras.g:2334:1: ( ']' )
            {
            // InternalCompras.g:2334:1: ( ']' )
            // InternalCompras.g:2335:2: ']'
            {
             before(grammarAccess.getEntityFieldLabelAccess().getRightSquareBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCompras.g:2345:1: rule__EntityFieldRequired__Group__0 : rule__EntityFieldRequired__Group__0__Impl rule__EntityFieldRequired__Group__1 ;
    public final void rule__EntityFieldRequired__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2349:1: ( rule__EntityFieldRequired__Group__0__Impl rule__EntityFieldRequired__Group__1 )
            // InternalCompras.g:2350:2: rule__EntityFieldRequired__Group__0__Impl rule__EntityFieldRequired__Group__1
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
    // InternalCompras.g:2357:1: rule__EntityFieldRequired__Group__0__Impl : ( '[' ) ;
    public final void rule__EntityFieldRequired__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2361:1: ( ( '[' ) )
            // InternalCompras.g:2362:1: ( '[' )
            {
            // InternalCompras.g:2362:1: ( '[' )
            // InternalCompras.g:2363:2: '['
            {
             before(grammarAccess.getEntityFieldRequiredAccess().getLeftSquareBracketKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCompras.g:2372:1: rule__EntityFieldRequired__Group__1 : rule__EntityFieldRequired__Group__1__Impl rule__EntityFieldRequired__Group__2 ;
    public final void rule__EntityFieldRequired__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2376:1: ( rule__EntityFieldRequired__Group__1__Impl rule__EntityFieldRequired__Group__2 )
            // InternalCompras.g:2377:2: rule__EntityFieldRequired__Group__1__Impl rule__EntityFieldRequired__Group__2
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
    // InternalCompras.g:2384:1: rule__EntityFieldRequired__Group__1__Impl : ( ( rule__EntityFieldRequired__NameAssignment_1 ) ) ;
    public final void rule__EntityFieldRequired__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2388:1: ( ( ( rule__EntityFieldRequired__NameAssignment_1 ) ) )
            // InternalCompras.g:2389:1: ( ( rule__EntityFieldRequired__NameAssignment_1 ) )
            {
            // InternalCompras.g:2389:1: ( ( rule__EntityFieldRequired__NameAssignment_1 ) )
            // InternalCompras.g:2390:2: ( rule__EntityFieldRequired__NameAssignment_1 )
            {
             before(grammarAccess.getEntityFieldRequiredAccess().getNameAssignment_1()); 
            // InternalCompras.g:2391:2: ( rule__EntityFieldRequired__NameAssignment_1 )
            // InternalCompras.g:2391:3: rule__EntityFieldRequired__NameAssignment_1
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
    // InternalCompras.g:2399:1: rule__EntityFieldRequired__Group__2 : rule__EntityFieldRequired__Group__2__Impl ;
    public final void rule__EntityFieldRequired__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2403:1: ( rule__EntityFieldRequired__Group__2__Impl )
            // InternalCompras.g:2404:2: rule__EntityFieldRequired__Group__2__Impl
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
    // InternalCompras.g:2410:1: rule__EntityFieldRequired__Group__2__Impl : ( ']' ) ;
    public final void rule__EntityFieldRequired__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2414:1: ( ( ']' ) )
            // InternalCompras.g:2415:1: ( ']' )
            {
            // InternalCompras.g:2415:1: ( ']' )
            // InternalCompras.g:2416:2: ']'
            {
             before(grammarAccess.getEntityFieldRequiredAccess().getRightSquareBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCompras.g:2426:1: rule__Functionality__Group__0 : rule__Functionality__Group__0__Impl rule__Functionality__Group__1 ;
    public final void rule__Functionality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2430:1: ( rule__Functionality__Group__0__Impl rule__Functionality__Group__1 )
            // InternalCompras.g:2431:2: rule__Functionality__Group__0__Impl rule__Functionality__Group__1
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
    // InternalCompras.g:2438:1: rule__Functionality__Group__0__Impl : ( ( rule__Functionality__NameAssignment_0 ) ) ;
    public final void rule__Functionality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2442:1: ( ( ( rule__Functionality__NameAssignment_0 ) ) )
            // InternalCompras.g:2443:1: ( ( rule__Functionality__NameAssignment_0 ) )
            {
            // InternalCompras.g:2443:1: ( ( rule__Functionality__NameAssignment_0 ) )
            // InternalCompras.g:2444:2: ( rule__Functionality__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionalityAccess().getNameAssignment_0()); 
            // InternalCompras.g:2445:2: ( rule__Functionality__NameAssignment_0 )
            // InternalCompras.g:2445:3: rule__Functionality__NameAssignment_0
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
    // InternalCompras.g:2453:1: rule__Functionality__Group__1 : rule__Functionality__Group__1__Impl rule__Functionality__Group__2 ;
    public final void rule__Functionality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2457:1: ( rule__Functionality__Group__1__Impl rule__Functionality__Group__2 )
            // InternalCompras.g:2458:2: rule__Functionality__Group__1__Impl rule__Functionality__Group__2
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
    // InternalCompras.g:2465:1: rule__Functionality__Group__1__Impl : ( 'RelEntity' ) ;
    public final void rule__Functionality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2469:1: ( ( 'RelEntity' ) )
            // InternalCompras.g:2470:1: ( 'RelEntity' )
            {
            // InternalCompras.g:2470:1: ( 'RelEntity' )
            // InternalCompras.g:2471:2: 'RelEntity'
            {
             before(grammarAccess.getFunctionalityAccess().getRelEntityKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCompras.g:2480:1: rule__Functionality__Group__2 : rule__Functionality__Group__2__Impl rule__Functionality__Group__3 ;
    public final void rule__Functionality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2484:1: ( rule__Functionality__Group__2__Impl rule__Functionality__Group__3 )
            // InternalCompras.g:2485:2: rule__Functionality__Group__2__Impl rule__Functionality__Group__3
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
    // InternalCompras.g:2492:1: rule__Functionality__Group__2__Impl : ( ( rule__Functionality__EntityAssignment_2 ) ) ;
    public final void rule__Functionality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2496:1: ( ( ( rule__Functionality__EntityAssignment_2 ) ) )
            // InternalCompras.g:2497:1: ( ( rule__Functionality__EntityAssignment_2 ) )
            {
            // InternalCompras.g:2497:1: ( ( rule__Functionality__EntityAssignment_2 ) )
            // InternalCompras.g:2498:2: ( rule__Functionality__EntityAssignment_2 )
            {
             before(grammarAccess.getFunctionalityAccess().getEntityAssignment_2()); 
            // InternalCompras.g:2499:2: ( rule__Functionality__EntityAssignment_2 )
            // InternalCompras.g:2499:3: rule__Functionality__EntityAssignment_2
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
    // InternalCompras.g:2507:1: rule__Functionality__Group__3 : rule__Functionality__Group__3__Impl rule__Functionality__Group__4 ;
    public final void rule__Functionality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2511:1: ( rule__Functionality__Group__3__Impl rule__Functionality__Group__4 )
            // InternalCompras.g:2512:2: rule__Functionality__Group__3__Impl rule__Functionality__Group__4
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
    // InternalCompras.g:2519:1: rule__Functionality__Group__3__Impl : ( ':' ) ;
    public final void rule__Functionality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2523:1: ( ( ':' ) )
            // InternalCompras.g:2524:1: ( ':' )
            {
            // InternalCompras.g:2524:1: ( ':' )
            // InternalCompras.g:2525:2: ':'
            {
             before(grammarAccess.getFunctionalityAccess().getColonKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:2534:1: rule__Functionality__Group__4 : rule__Functionality__Group__4__Impl rule__Functionality__Group__5 ;
    public final void rule__Functionality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2538:1: ( rule__Functionality__Group__4__Impl rule__Functionality__Group__5 )
            // InternalCompras.g:2539:2: rule__Functionality__Group__4__Impl rule__Functionality__Group__5
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
    // InternalCompras.g:2546:1: rule__Functionality__Group__4__Impl : ( '{' ) ;
    public final void rule__Functionality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2550:1: ( ( '{' ) )
            // InternalCompras.g:2551:1: ( '{' )
            {
            // InternalCompras.g:2551:1: ( '{' )
            // InternalCompras.g:2552:2: '{'
            {
             before(grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:2561:1: rule__Functionality__Group__5 : rule__Functionality__Group__5__Impl rule__Functionality__Group__6 ;
    public final void rule__Functionality__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2565:1: ( rule__Functionality__Group__5__Impl rule__Functionality__Group__6 )
            // InternalCompras.g:2566:2: rule__Functionality__Group__5__Impl rule__Functionality__Group__6
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
    // InternalCompras.g:2573:1: rule__Functionality__Group__5__Impl : ( ( rule__Functionality__FunctionalityFieldTypeAssignment_5 )* ) ;
    public final void rule__Functionality__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2577:1: ( ( ( rule__Functionality__FunctionalityFieldTypeAssignment_5 )* ) )
            // InternalCompras.g:2578:1: ( ( rule__Functionality__FunctionalityFieldTypeAssignment_5 )* )
            {
            // InternalCompras.g:2578:1: ( ( rule__Functionality__FunctionalityFieldTypeAssignment_5 )* )
            // InternalCompras.g:2579:2: ( rule__Functionality__FunctionalityFieldTypeAssignment_5 )*
            {
             before(grammarAccess.getFunctionalityAccess().getFunctionalityFieldTypeAssignment_5()); 
            // InternalCompras.g:2580:2: ( rule__Functionality__FunctionalityFieldTypeAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=16 && LA15_0<=20)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCompras.g:2580:3: rule__Functionality__FunctionalityFieldTypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Functionality__FunctionalityFieldTypeAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFunctionalityAccess().getFunctionalityFieldTypeAssignment_5()); 

            }


            }

        }
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
    // InternalCompras.g:2588:1: rule__Functionality__Group__6 : rule__Functionality__Group__6__Impl ;
    public final void rule__Functionality__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2592:1: ( rule__Functionality__Group__6__Impl )
            // InternalCompras.g:2593:2: rule__Functionality__Group__6__Impl
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
    // InternalCompras.g:2599:1: rule__Functionality__Group__6__Impl : ( '}' ) ;
    public final void rule__Functionality__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2603:1: ( ( '}' ) )
            // InternalCompras.g:2604:1: ( '}' )
            {
            // InternalCompras.g:2604:1: ( '}' )
            // InternalCompras.g:2605:2: '}'
            {
             before(grammarAccess.getFunctionalityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:2615:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2619:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalCompras.g:2620:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
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
    // InternalCompras.g:2627:1: rule__Architecture__Group__0__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2631:1: ( ( '{' ) )
            // InternalCompras.g:2632:1: ( '{' )
            {
            // InternalCompras.g:2632:1: ( '{' )
            // InternalCompras.g:2633:2: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:2642:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2646:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalCompras.g:2647:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
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
    // InternalCompras.g:2654:1: rule__Architecture__Group__1__Impl : ( 'Layers' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2658:1: ( ( 'Layers' ) )
            // InternalCompras.g:2659:1: ( 'Layers' )
            {
            // InternalCompras.g:2659:1: ( 'Layers' )
            // InternalCompras.g:2660:2: 'Layers'
            {
             before(grammarAccess.getArchitectureAccess().getLayersKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCompras.g:2669:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2673:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalCompras.g:2674:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
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
    // InternalCompras.g:2681:1: rule__Architecture__Group__2__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2685:1: ( ( ':' ) )
            // InternalCompras.g:2686:1: ( ':' )
            {
            // InternalCompras.g:2686:1: ( ':' )
            // InternalCompras.g:2687:2: ':'
            {
             before(grammarAccess.getArchitectureAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:2696:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl rule__Architecture__Group__4 ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2700:1: ( rule__Architecture__Group__3__Impl rule__Architecture__Group__4 )
            // InternalCompras.g:2701:2: rule__Architecture__Group__3__Impl rule__Architecture__Group__4
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
    // InternalCompras.g:2708:1: rule__Architecture__Group__3__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2712:1: ( ( '{' ) )
            // InternalCompras.g:2713:1: ( '{' )
            {
            // InternalCompras.g:2713:1: ( '{' )
            // InternalCompras.g:2714:2: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:2723:1: rule__Architecture__Group__4 : rule__Architecture__Group__4__Impl rule__Architecture__Group__5 ;
    public final void rule__Architecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2727:1: ( rule__Architecture__Group__4__Impl rule__Architecture__Group__5 )
            // InternalCompras.g:2728:2: rule__Architecture__Group__4__Impl rule__Architecture__Group__5
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
    // InternalCompras.g:2735:1: rule__Architecture__Group__4__Impl : ( 'PresentationLayer' ) ;
    public final void rule__Architecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2739:1: ( ( 'PresentationLayer' ) )
            // InternalCompras.g:2740:1: ( 'PresentationLayer' )
            {
            // InternalCompras.g:2740:1: ( 'PresentationLayer' )
            // InternalCompras.g:2741:2: 'PresentationLayer'
            {
             before(grammarAccess.getArchitectureAccess().getPresentationLayerKeyword_4()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCompras.g:2750:1: rule__Architecture__Group__5 : rule__Architecture__Group__5__Impl rule__Architecture__Group__6 ;
    public final void rule__Architecture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2754:1: ( rule__Architecture__Group__5__Impl rule__Architecture__Group__6 )
            // InternalCompras.g:2755:2: rule__Architecture__Group__5__Impl rule__Architecture__Group__6
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
    // InternalCompras.g:2762:1: rule__Architecture__Group__5__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2766:1: ( ( ':' ) )
            // InternalCompras.g:2767:1: ( ':' )
            {
            // InternalCompras.g:2767:1: ( ':' )
            // InternalCompras.g:2768:2: ':'
            {
             before(grammarAccess.getArchitectureAccess().getColonKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:2777:1: rule__Architecture__Group__6 : rule__Architecture__Group__6__Impl rule__Architecture__Group__7 ;
    public final void rule__Architecture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2781:1: ( rule__Architecture__Group__6__Impl rule__Architecture__Group__7 )
            // InternalCompras.g:2782:2: rule__Architecture__Group__6__Impl rule__Architecture__Group__7
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
    // InternalCompras.g:2789:1: rule__Architecture__Group__6__Impl : ( ( rule__Architecture__PresentationLayerAssignment_6 ) ) ;
    public final void rule__Architecture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2793:1: ( ( ( rule__Architecture__PresentationLayerAssignment_6 ) ) )
            // InternalCompras.g:2794:1: ( ( rule__Architecture__PresentationLayerAssignment_6 ) )
            {
            // InternalCompras.g:2794:1: ( ( rule__Architecture__PresentationLayerAssignment_6 ) )
            // InternalCompras.g:2795:2: ( rule__Architecture__PresentationLayerAssignment_6 )
            {
             before(grammarAccess.getArchitectureAccess().getPresentationLayerAssignment_6()); 
            // InternalCompras.g:2796:2: ( rule__Architecture__PresentationLayerAssignment_6 )
            // InternalCompras.g:2796:3: rule__Architecture__PresentationLayerAssignment_6
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
    // InternalCompras.g:2804:1: rule__Architecture__Group__7 : rule__Architecture__Group__7__Impl rule__Architecture__Group__8 ;
    public final void rule__Architecture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2808:1: ( rule__Architecture__Group__7__Impl rule__Architecture__Group__8 )
            // InternalCompras.g:2809:2: rule__Architecture__Group__7__Impl rule__Architecture__Group__8
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
    // InternalCompras.g:2816:1: rule__Architecture__Group__7__Impl : ( 'BusinessLayer' ) ;
    public final void rule__Architecture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2820:1: ( ( 'BusinessLayer' ) )
            // InternalCompras.g:2821:1: ( 'BusinessLayer' )
            {
            // InternalCompras.g:2821:1: ( 'BusinessLayer' )
            // InternalCompras.g:2822:2: 'BusinessLayer'
            {
             before(grammarAccess.getArchitectureAccess().getBusinessLayerKeyword_7()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCompras.g:2831:1: rule__Architecture__Group__8 : rule__Architecture__Group__8__Impl rule__Architecture__Group__9 ;
    public final void rule__Architecture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2835:1: ( rule__Architecture__Group__8__Impl rule__Architecture__Group__9 )
            // InternalCompras.g:2836:2: rule__Architecture__Group__8__Impl rule__Architecture__Group__9
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
    // InternalCompras.g:2843:1: rule__Architecture__Group__8__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2847:1: ( ( ':' ) )
            // InternalCompras.g:2848:1: ( ':' )
            {
            // InternalCompras.g:2848:1: ( ':' )
            // InternalCompras.g:2849:2: ':'
            {
             before(grammarAccess.getArchitectureAccess().getColonKeyword_8()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:2858:1: rule__Architecture__Group__9 : rule__Architecture__Group__9__Impl rule__Architecture__Group__10 ;
    public final void rule__Architecture__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2862:1: ( rule__Architecture__Group__9__Impl rule__Architecture__Group__10 )
            // InternalCompras.g:2863:2: rule__Architecture__Group__9__Impl rule__Architecture__Group__10
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
    // InternalCompras.g:2870:1: rule__Architecture__Group__9__Impl : ( ( rule__Architecture__BusinessLayerAssignment_9 ) ) ;
    public final void rule__Architecture__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2874:1: ( ( ( rule__Architecture__BusinessLayerAssignment_9 ) ) )
            // InternalCompras.g:2875:1: ( ( rule__Architecture__BusinessLayerAssignment_9 ) )
            {
            // InternalCompras.g:2875:1: ( ( rule__Architecture__BusinessLayerAssignment_9 ) )
            // InternalCompras.g:2876:2: ( rule__Architecture__BusinessLayerAssignment_9 )
            {
             before(grammarAccess.getArchitectureAccess().getBusinessLayerAssignment_9()); 
            // InternalCompras.g:2877:2: ( rule__Architecture__BusinessLayerAssignment_9 )
            // InternalCompras.g:2877:3: rule__Architecture__BusinessLayerAssignment_9
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
    // InternalCompras.g:2885:1: rule__Architecture__Group__10 : rule__Architecture__Group__10__Impl rule__Architecture__Group__11 ;
    public final void rule__Architecture__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2889:1: ( rule__Architecture__Group__10__Impl rule__Architecture__Group__11 )
            // InternalCompras.g:2890:2: rule__Architecture__Group__10__Impl rule__Architecture__Group__11
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
    // InternalCompras.g:2897:1: rule__Architecture__Group__10__Impl : ( 'DataAccessLayer' ) ;
    public final void rule__Architecture__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2901:1: ( ( 'DataAccessLayer' ) )
            // InternalCompras.g:2902:1: ( 'DataAccessLayer' )
            {
            // InternalCompras.g:2902:1: ( 'DataAccessLayer' )
            // InternalCompras.g:2903:2: 'DataAccessLayer'
            {
             before(grammarAccess.getArchitectureAccess().getDataAccessLayerKeyword_10()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCompras.g:2912:1: rule__Architecture__Group__11 : rule__Architecture__Group__11__Impl rule__Architecture__Group__12 ;
    public final void rule__Architecture__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2916:1: ( rule__Architecture__Group__11__Impl rule__Architecture__Group__12 )
            // InternalCompras.g:2917:2: rule__Architecture__Group__11__Impl rule__Architecture__Group__12
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
    // InternalCompras.g:2924:1: rule__Architecture__Group__11__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2928:1: ( ( ':' ) )
            // InternalCompras.g:2929:1: ( ':' )
            {
            // InternalCompras.g:2929:1: ( ':' )
            // InternalCompras.g:2930:2: ':'
            {
             before(grammarAccess.getArchitectureAccess().getColonKeyword_11()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:2939:1: rule__Architecture__Group__12 : rule__Architecture__Group__12__Impl rule__Architecture__Group__13 ;
    public final void rule__Architecture__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2943:1: ( rule__Architecture__Group__12__Impl rule__Architecture__Group__13 )
            // InternalCompras.g:2944:2: rule__Architecture__Group__12__Impl rule__Architecture__Group__13
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
    // InternalCompras.g:2951:1: rule__Architecture__Group__12__Impl : ( ( rule__Architecture__DataAccessLayerAssignment_12 ) ) ;
    public final void rule__Architecture__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2955:1: ( ( ( rule__Architecture__DataAccessLayerAssignment_12 ) ) )
            // InternalCompras.g:2956:1: ( ( rule__Architecture__DataAccessLayerAssignment_12 ) )
            {
            // InternalCompras.g:2956:1: ( ( rule__Architecture__DataAccessLayerAssignment_12 ) )
            // InternalCompras.g:2957:2: ( rule__Architecture__DataAccessLayerAssignment_12 )
            {
             before(grammarAccess.getArchitectureAccess().getDataAccessLayerAssignment_12()); 
            // InternalCompras.g:2958:2: ( rule__Architecture__DataAccessLayerAssignment_12 )
            // InternalCompras.g:2958:3: rule__Architecture__DataAccessLayerAssignment_12
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
    // InternalCompras.g:2966:1: rule__Architecture__Group__13 : rule__Architecture__Group__13__Impl rule__Architecture__Group__14 ;
    public final void rule__Architecture__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2970:1: ( rule__Architecture__Group__13__Impl rule__Architecture__Group__14 )
            // InternalCompras.g:2971:2: rule__Architecture__Group__13__Impl rule__Architecture__Group__14
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
    // InternalCompras.g:2978:1: rule__Architecture__Group__13__Impl : ( 'CommonLayer' ) ;
    public final void rule__Architecture__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2982:1: ( ( 'CommonLayer' ) )
            // InternalCompras.g:2983:1: ( 'CommonLayer' )
            {
            // InternalCompras.g:2983:1: ( 'CommonLayer' )
            // InternalCompras.g:2984:2: 'CommonLayer'
            {
             before(grammarAccess.getArchitectureAccess().getCommonLayerKeyword_13()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCompras.g:2993:1: rule__Architecture__Group__14 : rule__Architecture__Group__14__Impl rule__Architecture__Group__15 ;
    public final void rule__Architecture__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2997:1: ( rule__Architecture__Group__14__Impl rule__Architecture__Group__15 )
            // InternalCompras.g:2998:2: rule__Architecture__Group__14__Impl rule__Architecture__Group__15
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
    // InternalCompras.g:3005:1: rule__Architecture__Group__14__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3009:1: ( ( ':' ) )
            // InternalCompras.g:3010:1: ( ':' )
            {
            // InternalCompras.g:3010:1: ( ':' )
            // InternalCompras.g:3011:2: ':'
            {
             before(grammarAccess.getArchitectureAccess().getColonKeyword_14()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:3020:1: rule__Architecture__Group__15 : rule__Architecture__Group__15__Impl rule__Architecture__Group__16 ;
    public final void rule__Architecture__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3024:1: ( rule__Architecture__Group__15__Impl rule__Architecture__Group__16 )
            // InternalCompras.g:3025:2: rule__Architecture__Group__15__Impl rule__Architecture__Group__16
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
    // InternalCompras.g:3032:1: rule__Architecture__Group__15__Impl : ( ( rule__Architecture__CommonLayerAssignment_15 ) ) ;
    public final void rule__Architecture__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3036:1: ( ( ( rule__Architecture__CommonLayerAssignment_15 ) ) )
            // InternalCompras.g:3037:1: ( ( rule__Architecture__CommonLayerAssignment_15 ) )
            {
            // InternalCompras.g:3037:1: ( ( rule__Architecture__CommonLayerAssignment_15 ) )
            // InternalCompras.g:3038:2: ( rule__Architecture__CommonLayerAssignment_15 )
            {
             before(grammarAccess.getArchitectureAccess().getCommonLayerAssignment_15()); 
            // InternalCompras.g:3039:2: ( rule__Architecture__CommonLayerAssignment_15 )
            // InternalCompras.g:3039:3: rule__Architecture__CommonLayerAssignment_15
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
    // InternalCompras.g:3047:1: rule__Architecture__Group__16 : rule__Architecture__Group__16__Impl rule__Architecture__Group__17 ;
    public final void rule__Architecture__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3051:1: ( rule__Architecture__Group__16__Impl rule__Architecture__Group__17 )
            // InternalCompras.g:3052:2: rule__Architecture__Group__16__Impl rule__Architecture__Group__17
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
    // InternalCompras.g:3059:1: rule__Architecture__Group__16__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3063:1: ( ( '}' ) )
            // InternalCompras.g:3064:1: ( '}' )
            {
            // InternalCompras.g:3064:1: ( '}' )
            // InternalCompras.g:3065:2: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_16()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:3074:1: rule__Architecture__Group__17 : rule__Architecture__Group__17__Impl rule__Architecture__Group__18 ;
    public final void rule__Architecture__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3078:1: ( rule__Architecture__Group__17__Impl rule__Architecture__Group__18 )
            // InternalCompras.g:3079:2: rule__Architecture__Group__17__Impl rule__Architecture__Group__18
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
    // InternalCompras.g:3086:1: rule__Architecture__Group__17__Impl : ( 'Relations' ) ;
    public final void rule__Architecture__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3090:1: ( ( 'Relations' ) )
            // InternalCompras.g:3091:1: ( 'Relations' )
            {
            // InternalCompras.g:3091:1: ( 'Relations' )
            // InternalCompras.g:3092:2: 'Relations'
            {
             before(grammarAccess.getArchitectureAccess().getRelationsKeyword_17()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCompras.g:3101:1: rule__Architecture__Group__18 : rule__Architecture__Group__18__Impl rule__Architecture__Group__19 ;
    public final void rule__Architecture__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3105:1: ( rule__Architecture__Group__18__Impl rule__Architecture__Group__19 )
            // InternalCompras.g:3106:2: rule__Architecture__Group__18__Impl rule__Architecture__Group__19
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
    // InternalCompras.g:3113:1: rule__Architecture__Group__18__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3117:1: ( ( ':' ) )
            // InternalCompras.g:3118:1: ( ':' )
            {
            // InternalCompras.g:3118:1: ( ':' )
            // InternalCompras.g:3119:2: ':'
            {
             before(grammarAccess.getArchitectureAccess().getColonKeyword_18()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:3128:1: rule__Architecture__Group__19 : rule__Architecture__Group__19__Impl rule__Architecture__Group__20 ;
    public final void rule__Architecture__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3132:1: ( rule__Architecture__Group__19__Impl rule__Architecture__Group__20 )
            // InternalCompras.g:3133:2: rule__Architecture__Group__19__Impl rule__Architecture__Group__20
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
    // InternalCompras.g:3140:1: rule__Architecture__Group__19__Impl : ( ( rule__Architecture__RelationsAssignment_19 ) ) ;
    public final void rule__Architecture__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3144:1: ( ( ( rule__Architecture__RelationsAssignment_19 ) ) )
            // InternalCompras.g:3145:1: ( ( rule__Architecture__RelationsAssignment_19 ) )
            {
            // InternalCompras.g:3145:1: ( ( rule__Architecture__RelationsAssignment_19 ) )
            // InternalCompras.g:3146:2: ( rule__Architecture__RelationsAssignment_19 )
            {
             before(grammarAccess.getArchitectureAccess().getRelationsAssignment_19()); 
            // InternalCompras.g:3147:2: ( rule__Architecture__RelationsAssignment_19 )
            // InternalCompras.g:3147:3: rule__Architecture__RelationsAssignment_19
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
    // InternalCompras.g:3155:1: rule__Architecture__Group__20 : rule__Architecture__Group__20__Impl ;
    public final void rule__Architecture__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3159:1: ( rule__Architecture__Group__20__Impl )
            // InternalCompras.g:3160:2: rule__Architecture__Group__20__Impl
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
    // InternalCompras.g:3166:1: rule__Architecture__Group__20__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3170:1: ( ( '}' ) )
            // InternalCompras.g:3171:1: ( '}' )
            {
            // InternalCompras.g:3171:1: ( '}' )
            // InternalCompras.g:3172:2: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_20()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:3182:1: rule__PresentationLayer__Group__0 : rule__PresentationLayer__Group__0__Impl rule__PresentationLayer__Group__1 ;
    public final void rule__PresentationLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3186:1: ( rule__PresentationLayer__Group__0__Impl rule__PresentationLayer__Group__1 )
            // InternalCompras.g:3187:2: rule__PresentationLayer__Group__0__Impl rule__PresentationLayer__Group__1
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
    // InternalCompras.g:3194:1: rule__PresentationLayer__Group__0__Impl : ( ( rule__PresentationLayer__NameAssignment_0 ) ) ;
    public final void rule__PresentationLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3198:1: ( ( ( rule__PresentationLayer__NameAssignment_0 ) ) )
            // InternalCompras.g:3199:1: ( ( rule__PresentationLayer__NameAssignment_0 ) )
            {
            // InternalCompras.g:3199:1: ( ( rule__PresentationLayer__NameAssignment_0 ) )
            // InternalCompras.g:3200:2: ( rule__PresentationLayer__NameAssignment_0 )
            {
             before(grammarAccess.getPresentationLayerAccess().getNameAssignment_0()); 
            // InternalCompras.g:3201:2: ( rule__PresentationLayer__NameAssignment_0 )
            // InternalCompras.g:3201:3: rule__PresentationLayer__NameAssignment_0
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
    // InternalCompras.g:3209:1: rule__PresentationLayer__Group__1 : rule__PresentationLayer__Group__1__Impl rule__PresentationLayer__Group__2 ;
    public final void rule__PresentationLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3213:1: ( rule__PresentationLayer__Group__1__Impl rule__PresentationLayer__Group__2 )
            // InternalCompras.g:3214:2: rule__PresentationLayer__Group__1__Impl rule__PresentationLayer__Group__2
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
    // InternalCompras.g:3221:1: rule__PresentationLayer__Group__1__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3225:1: ( ( ':' ) )
            // InternalCompras.g:3226:1: ( ':' )
            {
            // InternalCompras.g:3226:1: ( ':' )
            // InternalCompras.g:3227:2: ':'
            {
             before(grammarAccess.getPresentationLayerAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:3236:1: rule__PresentationLayer__Group__2 : rule__PresentationLayer__Group__2__Impl rule__PresentationLayer__Group__3 ;
    public final void rule__PresentationLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3240:1: ( rule__PresentationLayer__Group__2__Impl rule__PresentationLayer__Group__3 )
            // InternalCompras.g:3241:2: rule__PresentationLayer__Group__2__Impl rule__PresentationLayer__Group__3
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
    // InternalCompras.g:3248:1: rule__PresentationLayer__Group__2__Impl : ( '{' ) ;
    public final void rule__PresentationLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3252:1: ( ( '{' ) )
            // InternalCompras.g:3253:1: ( '{' )
            {
            // InternalCompras.g:3253:1: ( '{' )
            // InternalCompras.g:3254:2: '{'
            {
             before(grammarAccess.getPresentationLayerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:3263:1: rule__PresentationLayer__Group__3 : rule__PresentationLayer__Group__3__Impl rule__PresentationLayer__Group__4 ;
    public final void rule__PresentationLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3267:1: ( rule__PresentationLayer__Group__3__Impl rule__PresentationLayer__Group__4 )
            // InternalCompras.g:3268:2: rule__PresentationLayer__Group__3__Impl rule__PresentationLayer__Group__4
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
    // InternalCompras.g:3275:1: rule__PresentationLayer__Group__3__Impl : ( 'ControllerSegmentLayer' ) ;
    public final void rule__PresentationLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3279:1: ( ( 'ControllerSegmentLayer' ) )
            // InternalCompras.g:3280:1: ( 'ControllerSegmentLayer' )
            {
            // InternalCompras.g:3280:1: ( 'ControllerSegmentLayer' )
            // InternalCompras.g:3281:2: 'ControllerSegmentLayer'
            {
             before(grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCompras.g:3290:1: rule__PresentationLayer__Group__4 : rule__PresentationLayer__Group__4__Impl rule__PresentationLayer__Group__5 ;
    public final void rule__PresentationLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3294:1: ( rule__PresentationLayer__Group__4__Impl rule__PresentationLayer__Group__5 )
            // InternalCompras.g:3295:2: rule__PresentationLayer__Group__4__Impl rule__PresentationLayer__Group__5
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
    // InternalCompras.g:3302:1: rule__PresentationLayer__Group__4__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3306:1: ( ( ':' ) )
            // InternalCompras.g:3307:1: ( ':' )
            {
            // InternalCompras.g:3307:1: ( ':' )
            // InternalCompras.g:3308:2: ':'
            {
             before(grammarAccess.getPresentationLayerAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:3317:1: rule__PresentationLayer__Group__5 : rule__PresentationLayer__Group__5__Impl rule__PresentationLayer__Group__6 ;
    public final void rule__PresentationLayer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3321:1: ( rule__PresentationLayer__Group__5__Impl rule__PresentationLayer__Group__6 )
            // InternalCompras.g:3322:2: rule__PresentationLayer__Group__5__Impl rule__PresentationLayer__Group__6
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
    // InternalCompras.g:3329:1: rule__PresentationLayer__Group__5__Impl : ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) ) ;
    public final void rule__PresentationLayer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3333:1: ( ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) ) )
            // InternalCompras.g:3334:1: ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) )
            {
            // InternalCompras.g:3334:1: ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) )
            // InternalCompras.g:3335:2: ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 )
            {
             before(grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerAssignment_5()); 
            // InternalCompras.g:3336:2: ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 )
            // InternalCompras.g:3336:3: rule__PresentationLayer__ControllerSegmentLayerAssignment_5
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
    // InternalCompras.g:3344:1: rule__PresentationLayer__Group__6 : rule__PresentationLayer__Group__6__Impl rule__PresentationLayer__Group__7 ;
    public final void rule__PresentationLayer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3348:1: ( rule__PresentationLayer__Group__6__Impl rule__PresentationLayer__Group__7 )
            // InternalCompras.g:3349:2: rule__PresentationLayer__Group__6__Impl rule__PresentationLayer__Group__7
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
    // InternalCompras.g:3356:1: rule__PresentationLayer__Group__6__Impl : ( 'ViewSegmentLayer' ) ;
    public final void rule__PresentationLayer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3360:1: ( ( 'ViewSegmentLayer' ) )
            // InternalCompras.g:3361:1: ( 'ViewSegmentLayer' )
            {
            // InternalCompras.g:3361:1: ( 'ViewSegmentLayer' )
            // InternalCompras.g:3362:2: 'ViewSegmentLayer'
            {
             before(grammarAccess.getPresentationLayerAccess().getViewSegmentLayerKeyword_6()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCompras.g:3371:1: rule__PresentationLayer__Group__7 : rule__PresentationLayer__Group__7__Impl rule__PresentationLayer__Group__8 ;
    public final void rule__PresentationLayer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3375:1: ( rule__PresentationLayer__Group__7__Impl rule__PresentationLayer__Group__8 )
            // InternalCompras.g:3376:2: rule__PresentationLayer__Group__7__Impl rule__PresentationLayer__Group__8
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
    // InternalCompras.g:3383:1: rule__PresentationLayer__Group__7__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3387:1: ( ( ':' ) )
            // InternalCompras.g:3388:1: ( ':' )
            {
            // InternalCompras.g:3388:1: ( ':' )
            // InternalCompras.g:3389:2: ':'
            {
             before(grammarAccess.getPresentationLayerAccess().getColonKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:3398:1: rule__PresentationLayer__Group__8 : rule__PresentationLayer__Group__8__Impl rule__PresentationLayer__Group__9 ;
    public final void rule__PresentationLayer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3402:1: ( rule__PresentationLayer__Group__8__Impl rule__PresentationLayer__Group__9 )
            // InternalCompras.g:3403:2: rule__PresentationLayer__Group__8__Impl rule__PresentationLayer__Group__9
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
    // InternalCompras.g:3410:1: rule__PresentationLayer__Group__8__Impl : ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) ) ;
    public final void rule__PresentationLayer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3414:1: ( ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) ) )
            // InternalCompras.g:3415:1: ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) )
            {
            // InternalCompras.g:3415:1: ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) )
            // InternalCompras.g:3416:2: ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 )
            {
             before(grammarAccess.getPresentationLayerAccess().getViewSegmentLayerAssignment_8()); 
            // InternalCompras.g:3417:2: ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 )
            // InternalCompras.g:3417:3: rule__PresentationLayer__ViewSegmentLayerAssignment_8
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
    // InternalCompras.g:3425:1: rule__PresentationLayer__Group__9 : rule__PresentationLayer__Group__9__Impl rule__PresentationLayer__Group__10 ;
    public final void rule__PresentationLayer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3429:1: ( rule__PresentationLayer__Group__9__Impl rule__PresentationLayer__Group__10 )
            // InternalCompras.g:3430:2: rule__PresentationLayer__Group__9__Impl rule__PresentationLayer__Group__10
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
    // InternalCompras.g:3437:1: rule__PresentationLayer__Group__9__Impl : ( 'ScriptSegmentLayer' ) ;
    public final void rule__PresentationLayer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3441:1: ( ( 'ScriptSegmentLayer' ) )
            // InternalCompras.g:3442:1: ( 'ScriptSegmentLayer' )
            {
            // InternalCompras.g:3442:1: ( 'ScriptSegmentLayer' )
            // InternalCompras.g:3443:2: 'ScriptSegmentLayer'
            {
             before(grammarAccess.getPresentationLayerAccess().getScriptSegmentLayerKeyword_9()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCompras.g:3452:1: rule__PresentationLayer__Group__10 : rule__PresentationLayer__Group__10__Impl rule__PresentationLayer__Group__11 ;
    public final void rule__PresentationLayer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3456:1: ( rule__PresentationLayer__Group__10__Impl rule__PresentationLayer__Group__11 )
            // InternalCompras.g:3457:2: rule__PresentationLayer__Group__10__Impl rule__PresentationLayer__Group__11
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
    // InternalCompras.g:3464:1: rule__PresentationLayer__Group__10__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3468:1: ( ( ':' ) )
            // InternalCompras.g:3469:1: ( ':' )
            {
            // InternalCompras.g:3469:1: ( ':' )
            // InternalCompras.g:3470:2: ':'
            {
             before(grammarAccess.getPresentationLayerAccess().getColonKeyword_10()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:3479:1: rule__PresentationLayer__Group__11 : rule__PresentationLayer__Group__11__Impl rule__PresentationLayer__Group__12 ;
    public final void rule__PresentationLayer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3483:1: ( rule__PresentationLayer__Group__11__Impl rule__PresentationLayer__Group__12 )
            // InternalCompras.g:3484:2: rule__PresentationLayer__Group__11__Impl rule__PresentationLayer__Group__12
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
    // InternalCompras.g:3491:1: rule__PresentationLayer__Group__11__Impl : ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) ) ;
    public final void rule__PresentationLayer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3495:1: ( ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) ) )
            // InternalCompras.g:3496:1: ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) )
            {
            // InternalCompras.g:3496:1: ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) )
            // InternalCompras.g:3497:2: ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 )
            {
             before(grammarAccess.getPresentationLayerAccess().getScriptegmentLayerAssignment_11()); 
            // InternalCompras.g:3498:2: ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 )
            // InternalCompras.g:3498:3: rule__PresentationLayer__ScriptegmentLayerAssignment_11
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
    // InternalCompras.g:3506:1: rule__PresentationLayer__Group__12 : rule__PresentationLayer__Group__12__Impl ;
    public final void rule__PresentationLayer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3510:1: ( rule__PresentationLayer__Group__12__Impl )
            // InternalCompras.g:3511:2: rule__PresentationLayer__Group__12__Impl
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
    // InternalCompras.g:3517:1: rule__PresentationLayer__Group__12__Impl : ( '}' ) ;
    public final void rule__PresentationLayer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3521:1: ( ( '}' ) )
            // InternalCompras.g:3522:1: ( '}' )
            {
            // InternalCompras.g:3522:1: ( '}' )
            // InternalCompras.g:3523:2: '}'
            {
             before(grammarAccess.getPresentationLayerAccess().getRightCurlyBracketKeyword_12()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:3533:1: rule__DataAccessLayer__Group__0 : rule__DataAccessLayer__Group__0__Impl rule__DataAccessLayer__Group__1 ;
    public final void rule__DataAccessLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3537:1: ( rule__DataAccessLayer__Group__0__Impl rule__DataAccessLayer__Group__1 )
            // InternalCompras.g:3538:2: rule__DataAccessLayer__Group__0__Impl rule__DataAccessLayer__Group__1
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
    // InternalCompras.g:3545:1: rule__DataAccessLayer__Group__0__Impl : ( ( rule__DataAccessLayer__NameAssignment_0 ) ) ;
    public final void rule__DataAccessLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3549:1: ( ( ( rule__DataAccessLayer__NameAssignment_0 ) ) )
            // InternalCompras.g:3550:1: ( ( rule__DataAccessLayer__NameAssignment_0 ) )
            {
            // InternalCompras.g:3550:1: ( ( rule__DataAccessLayer__NameAssignment_0 ) )
            // InternalCompras.g:3551:2: ( rule__DataAccessLayer__NameAssignment_0 )
            {
             before(grammarAccess.getDataAccessLayerAccess().getNameAssignment_0()); 
            // InternalCompras.g:3552:2: ( rule__DataAccessLayer__NameAssignment_0 )
            // InternalCompras.g:3552:3: rule__DataAccessLayer__NameAssignment_0
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
    // InternalCompras.g:3560:1: rule__DataAccessLayer__Group__1 : rule__DataAccessLayer__Group__1__Impl rule__DataAccessLayer__Group__2 ;
    public final void rule__DataAccessLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3564:1: ( rule__DataAccessLayer__Group__1__Impl rule__DataAccessLayer__Group__2 )
            // InternalCompras.g:3565:2: rule__DataAccessLayer__Group__1__Impl rule__DataAccessLayer__Group__2
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
    // InternalCompras.g:3572:1: rule__DataAccessLayer__Group__1__Impl : ( ':' ) ;
    public final void rule__DataAccessLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3576:1: ( ( ':' ) )
            // InternalCompras.g:3577:1: ( ':' )
            {
            // InternalCompras.g:3577:1: ( ':' )
            // InternalCompras.g:3578:2: ':'
            {
             before(grammarAccess.getDataAccessLayerAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:3587:1: rule__DataAccessLayer__Group__2 : rule__DataAccessLayer__Group__2__Impl rule__DataAccessLayer__Group__3 ;
    public final void rule__DataAccessLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3591:1: ( rule__DataAccessLayer__Group__2__Impl rule__DataAccessLayer__Group__3 )
            // InternalCompras.g:3592:2: rule__DataAccessLayer__Group__2__Impl rule__DataAccessLayer__Group__3
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
    // InternalCompras.g:3599:1: rule__DataAccessLayer__Group__2__Impl : ( '{' ) ;
    public final void rule__DataAccessLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3603:1: ( ( '{' ) )
            // InternalCompras.g:3604:1: ( '{' )
            {
            // InternalCompras.g:3604:1: ( '{' )
            // InternalCompras.g:3605:2: '{'
            {
             before(grammarAccess.getDataAccessLayerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:3614:1: rule__DataAccessLayer__Group__3 : rule__DataAccessLayer__Group__3__Impl rule__DataAccessLayer__Group__4 ;
    public final void rule__DataAccessLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3618:1: ( rule__DataAccessLayer__Group__3__Impl rule__DataAccessLayer__Group__4 )
            // InternalCompras.g:3619:2: rule__DataAccessLayer__Group__3__Impl rule__DataAccessLayer__Group__4
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
    // InternalCompras.g:3626:1: rule__DataAccessLayer__Group__3__Impl : ( 'DbConnectorSegmentLayer' ) ;
    public final void rule__DataAccessLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3630:1: ( ( 'DbConnectorSegmentLayer' ) )
            // InternalCompras.g:3631:1: ( 'DbConnectorSegmentLayer' )
            {
            // InternalCompras.g:3631:1: ( 'DbConnectorSegmentLayer' )
            // InternalCompras.g:3632:2: 'DbConnectorSegmentLayer'
            {
             before(grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCompras.g:3641:1: rule__DataAccessLayer__Group__4 : rule__DataAccessLayer__Group__4__Impl rule__DataAccessLayer__Group__5 ;
    public final void rule__DataAccessLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3645:1: ( rule__DataAccessLayer__Group__4__Impl rule__DataAccessLayer__Group__5 )
            // InternalCompras.g:3646:2: rule__DataAccessLayer__Group__4__Impl rule__DataAccessLayer__Group__5
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
    // InternalCompras.g:3653:1: rule__DataAccessLayer__Group__4__Impl : ( ':' ) ;
    public final void rule__DataAccessLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3657:1: ( ( ':' ) )
            // InternalCompras.g:3658:1: ( ':' )
            {
            // InternalCompras.g:3658:1: ( ':' )
            // InternalCompras.g:3659:2: ':'
            {
             before(grammarAccess.getDataAccessLayerAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:3668:1: rule__DataAccessLayer__Group__5 : rule__DataAccessLayer__Group__5__Impl rule__DataAccessLayer__Group__6 ;
    public final void rule__DataAccessLayer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3672:1: ( rule__DataAccessLayer__Group__5__Impl rule__DataAccessLayer__Group__6 )
            // InternalCompras.g:3673:2: rule__DataAccessLayer__Group__5__Impl rule__DataAccessLayer__Group__6
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
    // InternalCompras.g:3680:1: rule__DataAccessLayer__Group__5__Impl : ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) ) ;
    public final void rule__DataAccessLayer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3684:1: ( ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) ) )
            // InternalCompras.g:3685:1: ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) )
            {
            // InternalCompras.g:3685:1: ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) )
            // InternalCompras.g:3686:2: ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 )
            {
             before(grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerAssignment_5()); 
            // InternalCompras.g:3687:2: ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 )
            // InternalCompras.g:3687:3: rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5
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
    // InternalCompras.g:3695:1: rule__DataAccessLayer__Group__6 : rule__DataAccessLayer__Group__6__Impl ;
    public final void rule__DataAccessLayer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3699:1: ( rule__DataAccessLayer__Group__6__Impl )
            // InternalCompras.g:3700:2: rule__DataAccessLayer__Group__6__Impl
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
    // InternalCompras.g:3706:1: rule__DataAccessLayer__Group__6__Impl : ( '}' ) ;
    public final void rule__DataAccessLayer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3710:1: ( ( '}' ) )
            // InternalCompras.g:3711:1: ( '}' )
            {
            // InternalCompras.g:3711:1: ( '}' )
            // InternalCompras.g:3712:2: '}'
            {
             before(grammarAccess.getDataAccessLayerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:3722:1: rule__Relations__Group__0 : rule__Relations__Group__0__Impl rule__Relations__Group__1 ;
    public final void rule__Relations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3726:1: ( rule__Relations__Group__0__Impl rule__Relations__Group__1 )
            // InternalCompras.g:3727:2: rule__Relations__Group__0__Impl rule__Relations__Group__1
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
    // InternalCompras.g:3734:1: rule__Relations__Group__0__Impl : ( '{' ) ;
    public final void rule__Relations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3738:1: ( ( '{' ) )
            // InternalCompras.g:3739:1: ( '{' )
            {
            // InternalCompras.g:3739:1: ( '{' )
            // InternalCompras.g:3740:2: '{'
            {
             before(grammarAccess.getRelationsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:3749:1: rule__Relations__Group__1 : rule__Relations__Group__1__Impl rule__Relations__Group__2 ;
    public final void rule__Relations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3753:1: ( rule__Relations__Group__1__Impl rule__Relations__Group__2 )
            // InternalCompras.g:3754:2: rule__Relations__Group__1__Impl rule__Relations__Group__2
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
    // InternalCompras.g:3761:1: rule__Relations__Group__1__Impl : ( ( rule__Relations__SourceLayer1Assignment_1 ) ) ;
    public final void rule__Relations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3765:1: ( ( ( rule__Relations__SourceLayer1Assignment_1 ) ) )
            // InternalCompras.g:3766:1: ( ( rule__Relations__SourceLayer1Assignment_1 ) )
            {
            // InternalCompras.g:3766:1: ( ( rule__Relations__SourceLayer1Assignment_1 ) )
            // InternalCompras.g:3767:2: ( rule__Relations__SourceLayer1Assignment_1 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer1Assignment_1()); 
            // InternalCompras.g:3768:2: ( rule__Relations__SourceLayer1Assignment_1 )
            // InternalCompras.g:3768:3: rule__Relations__SourceLayer1Assignment_1
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
    // InternalCompras.g:3776:1: rule__Relations__Group__2 : rule__Relations__Group__2__Impl rule__Relations__Group__3 ;
    public final void rule__Relations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3780:1: ( rule__Relations__Group__2__Impl rule__Relations__Group__3 )
            // InternalCompras.g:3781:2: rule__Relations__Group__2__Impl rule__Relations__Group__3
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
    // InternalCompras.g:3788:1: rule__Relations__Group__2__Impl : ( ( rule__Relations__RelationsType1Assignment_2 ) ) ;
    public final void rule__Relations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3792:1: ( ( ( rule__Relations__RelationsType1Assignment_2 ) ) )
            // InternalCompras.g:3793:1: ( ( rule__Relations__RelationsType1Assignment_2 ) )
            {
            // InternalCompras.g:3793:1: ( ( rule__Relations__RelationsType1Assignment_2 ) )
            // InternalCompras.g:3794:2: ( rule__Relations__RelationsType1Assignment_2 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType1Assignment_2()); 
            // InternalCompras.g:3795:2: ( rule__Relations__RelationsType1Assignment_2 )
            // InternalCompras.g:3795:3: rule__Relations__RelationsType1Assignment_2
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
    // InternalCompras.g:3803:1: rule__Relations__Group__3 : rule__Relations__Group__3__Impl rule__Relations__Group__4 ;
    public final void rule__Relations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3807:1: ( rule__Relations__Group__3__Impl rule__Relations__Group__4 )
            // InternalCompras.g:3808:2: rule__Relations__Group__3__Impl rule__Relations__Group__4
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
    // InternalCompras.g:3815:1: rule__Relations__Group__3__Impl : ( ( rule__Relations__TargetLayer1Assignment_3 ) ) ;
    public final void rule__Relations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3819:1: ( ( ( rule__Relations__TargetLayer1Assignment_3 ) ) )
            // InternalCompras.g:3820:1: ( ( rule__Relations__TargetLayer1Assignment_3 ) )
            {
            // InternalCompras.g:3820:1: ( ( rule__Relations__TargetLayer1Assignment_3 ) )
            // InternalCompras.g:3821:2: ( rule__Relations__TargetLayer1Assignment_3 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer1Assignment_3()); 
            // InternalCompras.g:3822:2: ( rule__Relations__TargetLayer1Assignment_3 )
            // InternalCompras.g:3822:3: rule__Relations__TargetLayer1Assignment_3
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
    // InternalCompras.g:3830:1: rule__Relations__Group__4 : rule__Relations__Group__4__Impl rule__Relations__Group__5 ;
    public final void rule__Relations__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3834:1: ( rule__Relations__Group__4__Impl rule__Relations__Group__5 )
            // InternalCompras.g:3835:2: rule__Relations__Group__4__Impl rule__Relations__Group__5
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
    // InternalCompras.g:3842:1: rule__Relations__Group__4__Impl : ( ( rule__Relations__SourceLayer2Assignment_4 ) ) ;
    public final void rule__Relations__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3846:1: ( ( ( rule__Relations__SourceLayer2Assignment_4 ) ) )
            // InternalCompras.g:3847:1: ( ( rule__Relations__SourceLayer2Assignment_4 ) )
            {
            // InternalCompras.g:3847:1: ( ( rule__Relations__SourceLayer2Assignment_4 ) )
            // InternalCompras.g:3848:2: ( rule__Relations__SourceLayer2Assignment_4 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer2Assignment_4()); 
            // InternalCompras.g:3849:2: ( rule__Relations__SourceLayer2Assignment_4 )
            // InternalCompras.g:3849:3: rule__Relations__SourceLayer2Assignment_4
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
    // InternalCompras.g:3857:1: rule__Relations__Group__5 : rule__Relations__Group__5__Impl rule__Relations__Group__6 ;
    public final void rule__Relations__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3861:1: ( rule__Relations__Group__5__Impl rule__Relations__Group__6 )
            // InternalCompras.g:3862:2: rule__Relations__Group__5__Impl rule__Relations__Group__6
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
    // InternalCompras.g:3869:1: rule__Relations__Group__5__Impl : ( ( rule__Relations__RelationsType2Assignment_5 ) ) ;
    public final void rule__Relations__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3873:1: ( ( ( rule__Relations__RelationsType2Assignment_5 ) ) )
            // InternalCompras.g:3874:1: ( ( rule__Relations__RelationsType2Assignment_5 ) )
            {
            // InternalCompras.g:3874:1: ( ( rule__Relations__RelationsType2Assignment_5 ) )
            // InternalCompras.g:3875:2: ( rule__Relations__RelationsType2Assignment_5 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType2Assignment_5()); 
            // InternalCompras.g:3876:2: ( rule__Relations__RelationsType2Assignment_5 )
            // InternalCompras.g:3876:3: rule__Relations__RelationsType2Assignment_5
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
    // InternalCompras.g:3884:1: rule__Relations__Group__6 : rule__Relations__Group__6__Impl rule__Relations__Group__7 ;
    public final void rule__Relations__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3888:1: ( rule__Relations__Group__6__Impl rule__Relations__Group__7 )
            // InternalCompras.g:3889:2: rule__Relations__Group__6__Impl rule__Relations__Group__7
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
    // InternalCompras.g:3896:1: rule__Relations__Group__6__Impl : ( ( rule__Relations__TargetLayer2Assignment_6 ) ) ;
    public final void rule__Relations__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3900:1: ( ( ( rule__Relations__TargetLayer2Assignment_6 ) ) )
            // InternalCompras.g:3901:1: ( ( rule__Relations__TargetLayer2Assignment_6 ) )
            {
            // InternalCompras.g:3901:1: ( ( rule__Relations__TargetLayer2Assignment_6 ) )
            // InternalCompras.g:3902:2: ( rule__Relations__TargetLayer2Assignment_6 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer2Assignment_6()); 
            // InternalCompras.g:3903:2: ( rule__Relations__TargetLayer2Assignment_6 )
            // InternalCompras.g:3903:3: rule__Relations__TargetLayer2Assignment_6
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
    // InternalCompras.g:3911:1: rule__Relations__Group__7 : rule__Relations__Group__7__Impl rule__Relations__Group__8 ;
    public final void rule__Relations__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3915:1: ( rule__Relations__Group__7__Impl rule__Relations__Group__8 )
            // InternalCompras.g:3916:2: rule__Relations__Group__7__Impl rule__Relations__Group__8
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
    // InternalCompras.g:3923:1: rule__Relations__Group__7__Impl : ( ( rule__Relations__SourceLayer3Assignment_7 ) ) ;
    public final void rule__Relations__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3927:1: ( ( ( rule__Relations__SourceLayer3Assignment_7 ) ) )
            // InternalCompras.g:3928:1: ( ( rule__Relations__SourceLayer3Assignment_7 ) )
            {
            // InternalCompras.g:3928:1: ( ( rule__Relations__SourceLayer3Assignment_7 ) )
            // InternalCompras.g:3929:2: ( rule__Relations__SourceLayer3Assignment_7 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer3Assignment_7()); 
            // InternalCompras.g:3930:2: ( rule__Relations__SourceLayer3Assignment_7 )
            // InternalCompras.g:3930:3: rule__Relations__SourceLayer3Assignment_7
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
    // InternalCompras.g:3938:1: rule__Relations__Group__8 : rule__Relations__Group__8__Impl rule__Relations__Group__9 ;
    public final void rule__Relations__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3942:1: ( rule__Relations__Group__8__Impl rule__Relations__Group__9 )
            // InternalCompras.g:3943:2: rule__Relations__Group__8__Impl rule__Relations__Group__9
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
    // InternalCompras.g:3950:1: rule__Relations__Group__8__Impl : ( ( rule__Relations__RelationsType3Assignment_8 ) ) ;
    public final void rule__Relations__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3954:1: ( ( ( rule__Relations__RelationsType3Assignment_8 ) ) )
            // InternalCompras.g:3955:1: ( ( rule__Relations__RelationsType3Assignment_8 ) )
            {
            // InternalCompras.g:3955:1: ( ( rule__Relations__RelationsType3Assignment_8 ) )
            // InternalCompras.g:3956:2: ( rule__Relations__RelationsType3Assignment_8 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType3Assignment_8()); 
            // InternalCompras.g:3957:2: ( rule__Relations__RelationsType3Assignment_8 )
            // InternalCompras.g:3957:3: rule__Relations__RelationsType3Assignment_8
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
    // InternalCompras.g:3965:1: rule__Relations__Group__9 : rule__Relations__Group__9__Impl rule__Relations__Group__10 ;
    public final void rule__Relations__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3969:1: ( rule__Relations__Group__9__Impl rule__Relations__Group__10 )
            // InternalCompras.g:3970:2: rule__Relations__Group__9__Impl rule__Relations__Group__10
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
    // InternalCompras.g:3977:1: rule__Relations__Group__9__Impl : ( ( rule__Relations__TargetLayer3Assignment_9 ) ) ;
    public final void rule__Relations__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3981:1: ( ( ( rule__Relations__TargetLayer3Assignment_9 ) ) )
            // InternalCompras.g:3982:1: ( ( rule__Relations__TargetLayer3Assignment_9 ) )
            {
            // InternalCompras.g:3982:1: ( ( rule__Relations__TargetLayer3Assignment_9 ) )
            // InternalCompras.g:3983:2: ( rule__Relations__TargetLayer3Assignment_9 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer3Assignment_9()); 
            // InternalCompras.g:3984:2: ( rule__Relations__TargetLayer3Assignment_9 )
            // InternalCompras.g:3984:3: rule__Relations__TargetLayer3Assignment_9
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
    // InternalCompras.g:3992:1: rule__Relations__Group__10 : rule__Relations__Group__10__Impl rule__Relations__Group__11 ;
    public final void rule__Relations__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3996:1: ( rule__Relations__Group__10__Impl rule__Relations__Group__11 )
            // InternalCompras.g:3997:2: rule__Relations__Group__10__Impl rule__Relations__Group__11
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
    // InternalCompras.g:4004:1: rule__Relations__Group__10__Impl : ( ( rule__Relations__SourceLayer4Assignment_10 ) ) ;
    public final void rule__Relations__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4008:1: ( ( ( rule__Relations__SourceLayer4Assignment_10 ) ) )
            // InternalCompras.g:4009:1: ( ( rule__Relations__SourceLayer4Assignment_10 ) )
            {
            // InternalCompras.g:4009:1: ( ( rule__Relations__SourceLayer4Assignment_10 ) )
            // InternalCompras.g:4010:2: ( rule__Relations__SourceLayer4Assignment_10 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer4Assignment_10()); 
            // InternalCompras.g:4011:2: ( rule__Relations__SourceLayer4Assignment_10 )
            // InternalCompras.g:4011:3: rule__Relations__SourceLayer4Assignment_10
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
    // InternalCompras.g:4019:1: rule__Relations__Group__11 : rule__Relations__Group__11__Impl rule__Relations__Group__12 ;
    public final void rule__Relations__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4023:1: ( rule__Relations__Group__11__Impl rule__Relations__Group__12 )
            // InternalCompras.g:4024:2: rule__Relations__Group__11__Impl rule__Relations__Group__12
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
    // InternalCompras.g:4031:1: rule__Relations__Group__11__Impl : ( ( rule__Relations__RelationsType4Assignment_11 ) ) ;
    public final void rule__Relations__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4035:1: ( ( ( rule__Relations__RelationsType4Assignment_11 ) ) )
            // InternalCompras.g:4036:1: ( ( rule__Relations__RelationsType4Assignment_11 ) )
            {
            // InternalCompras.g:4036:1: ( ( rule__Relations__RelationsType4Assignment_11 ) )
            // InternalCompras.g:4037:2: ( rule__Relations__RelationsType4Assignment_11 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType4Assignment_11()); 
            // InternalCompras.g:4038:2: ( rule__Relations__RelationsType4Assignment_11 )
            // InternalCompras.g:4038:3: rule__Relations__RelationsType4Assignment_11
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
    // InternalCompras.g:4046:1: rule__Relations__Group__12 : rule__Relations__Group__12__Impl rule__Relations__Group__13 ;
    public final void rule__Relations__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4050:1: ( rule__Relations__Group__12__Impl rule__Relations__Group__13 )
            // InternalCompras.g:4051:2: rule__Relations__Group__12__Impl rule__Relations__Group__13
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
    // InternalCompras.g:4058:1: rule__Relations__Group__12__Impl : ( ( rule__Relations__TargetLayer4Assignment_12 ) ) ;
    public final void rule__Relations__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4062:1: ( ( ( rule__Relations__TargetLayer4Assignment_12 ) ) )
            // InternalCompras.g:4063:1: ( ( rule__Relations__TargetLayer4Assignment_12 ) )
            {
            // InternalCompras.g:4063:1: ( ( rule__Relations__TargetLayer4Assignment_12 ) )
            // InternalCompras.g:4064:2: ( rule__Relations__TargetLayer4Assignment_12 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer4Assignment_12()); 
            // InternalCompras.g:4065:2: ( rule__Relations__TargetLayer4Assignment_12 )
            // InternalCompras.g:4065:3: rule__Relations__TargetLayer4Assignment_12
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
    // InternalCompras.g:4073:1: rule__Relations__Group__13 : rule__Relations__Group__13__Impl rule__Relations__Group__14 ;
    public final void rule__Relations__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4077:1: ( rule__Relations__Group__13__Impl rule__Relations__Group__14 )
            // InternalCompras.g:4078:2: rule__Relations__Group__13__Impl rule__Relations__Group__14
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
    // InternalCompras.g:4085:1: rule__Relations__Group__13__Impl : ( ( rule__Relations__SourceLayer5Assignment_13 ) ) ;
    public final void rule__Relations__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4089:1: ( ( ( rule__Relations__SourceLayer5Assignment_13 ) ) )
            // InternalCompras.g:4090:1: ( ( rule__Relations__SourceLayer5Assignment_13 ) )
            {
            // InternalCompras.g:4090:1: ( ( rule__Relations__SourceLayer5Assignment_13 ) )
            // InternalCompras.g:4091:2: ( rule__Relations__SourceLayer5Assignment_13 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer5Assignment_13()); 
            // InternalCompras.g:4092:2: ( rule__Relations__SourceLayer5Assignment_13 )
            // InternalCompras.g:4092:3: rule__Relations__SourceLayer5Assignment_13
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
    // InternalCompras.g:4100:1: rule__Relations__Group__14 : rule__Relations__Group__14__Impl rule__Relations__Group__15 ;
    public final void rule__Relations__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4104:1: ( rule__Relations__Group__14__Impl rule__Relations__Group__15 )
            // InternalCompras.g:4105:2: rule__Relations__Group__14__Impl rule__Relations__Group__15
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
    // InternalCompras.g:4112:1: rule__Relations__Group__14__Impl : ( ( rule__Relations__RelationsType5Assignment_14 ) ) ;
    public final void rule__Relations__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4116:1: ( ( ( rule__Relations__RelationsType5Assignment_14 ) ) )
            // InternalCompras.g:4117:1: ( ( rule__Relations__RelationsType5Assignment_14 ) )
            {
            // InternalCompras.g:4117:1: ( ( rule__Relations__RelationsType5Assignment_14 ) )
            // InternalCompras.g:4118:2: ( rule__Relations__RelationsType5Assignment_14 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType5Assignment_14()); 
            // InternalCompras.g:4119:2: ( rule__Relations__RelationsType5Assignment_14 )
            // InternalCompras.g:4119:3: rule__Relations__RelationsType5Assignment_14
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
    // InternalCompras.g:4127:1: rule__Relations__Group__15 : rule__Relations__Group__15__Impl rule__Relations__Group__16 ;
    public final void rule__Relations__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4131:1: ( rule__Relations__Group__15__Impl rule__Relations__Group__16 )
            // InternalCompras.g:4132:2: rule__Relations__Group__15__Impl rule__Relations__Group__16
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
    // InternalCompras.g:4139:1: rule__Relations__Group__15__Impl : ( ( rule__Relations__TargetLayer5Assignment_15 ) ) ;
    public final void rule__Relations__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4143:1: ( ( ( rule__Relations__TargetLayer5Assignment_15 ) ) )
            // InternalCompras.g:4144:1: ( ( rule__Relations__TargetLayer5Assignment_15 ) )
            {
            // InternalCompras.g:4144:1: ( ( rule__Relations__TargetLayer5Assignment_15 ) )
            // InternalCompras.g:4145:2: ( rule__Relations__TargetLayer5Assignment_15 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer5Assignment_15()); 
            // InternalCompras.g:4146:2: ( rule__Relations__TargetLayer5Assignment_15 )
            // InternalCompras.g:4146:3: rule__Relations__TargetLayer5Assignment_15
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
    // InternalCompras.g:4154:1: rule__Relations__Group__16 : rule__Relations__Group__16__Impl ;
    public final void rule__Relations__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4158:1: ( rule__Relations__Group__16__Impl )
            // InternalCompras.g:4159:2: rule__Relations__Group__16__Impl
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
    // InternalCompras.g:4165:1: rule__Relations__Group__16__Impl : ( '}' ) ;
    public final void rule__Relations__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4169:1: ( ( '}' ) )
            // InternalCompras.g:4170:1: ( '}' )
            {
            // InternalCompras.g:4170:1: ( '}' )
            // InternalCompras.g:4171:2: '}'
            {
             before(grammarAccess.getRelationsAccess().getRightCurlyBracketKeyword_16()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:4181:1: rule__Technology__Group__0 : rule__Technology__Group__0__Impl rule__Technology__Group__1 ;
    public final void rule__Technology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4185:1: ( rule__Technology__Group__0__Impl rule__Technology__Group__1 )
            // InternalCompras.g:4186:2: rule__Technology__Group__0__Impl rule__Technology__Group__1
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
    // InternalCompras.g:4193:1: rule__Technology__Group__0__Impl : ( '{' ) ;
    public final void rule__Technology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4197:1: ( ( '{' ) )
            // InternalCompras.g:4198:1: ( '{' )
            {
            // InternalCompras.g:4198:1: ( '{' )
            // InternalCompras.g:4199:2: '{'
            {
             before(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:4208:1: rule__Technology__Group__1 : rule__Technology__Group__1__Impl rule__Technology__Group__2 ;
    public final void rule__Technology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4212:1: ( rule__Technology__Group__1__Impl rule__Technology__Group__2 )
            // InternalCompras.g:4213:2: rule__Technology__Group__1__Impl rule__Technology__Group__2
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
    // InternalCompras.g:4220:1: rule__Technology__Group__1__Impl : ( ( rule__Technology__Group_1__0 )? ) ;
    public final void rule__Technology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4224:1: ( ( ( rule__Technology__Group_1__0 )? ) )
            // InternalCompras.g:4225:1: ( ( rule__Technology__Group_1__0 )? )
            {
            // InternalCompras.g:4225:1: ( ( rule__Technology__Group_1__0 )? )
            // InternalCompras.g:4226:2: ( rule__Technology__Group_1__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_1()); 
            // InternalCompras.g:4227:2: ( rule__Technology__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCompras.g:4227:3: rule__Technology__Group_1__0
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
    // InternalCompras.g:4235:1: rule__Technology__Group__2 : rule__Technology__Group__2__Impl rule__Technology__Group__3 ;
    public final void rule__Technology__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4239:1: ( rule__Technology__Group__2__Impl rule__Technology__Group__3 )
            // InternalCompras.g:4240:2: rule__Technology__Group__2__Impl rule__Technology__Group__3
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
    // InternalCompras.g:4247:1: rule__Technology__Group__2__Impl : ( ( rule__Technology__Group_2__0 )? ) ;
    public final void rule__Technology__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4251:1: ( ( ( rule__Technology__Group_2__0 )? ) )
            // InternalCompras.g:4252:1: ( ( rule__Technology__Group_2__0 )? )
            {
            // InternalCompras.g:4252:1: ( ( rule__Technology__Group_2__0 )? )
            // InternalCompras.g:4253:2: ( rule__Technology__Group_2__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2()); 
            // InternalCompras.g:4254:2: ( rule__Technology__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==50) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCompras.g:4254:3: rule__Technology__Group_2__0
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
    // InternalCompras.g:4262:1: rule__Technology__Group__3 : rule__Technology__Group__3__Impl ;
    public final void rule__Technology__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4266:1: ( rule__Technology__Group__3__Impl )
            // InternalCompras.g:4267:2: rule__Technology__Group__3__Impl
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
    // InternalCompras.g:4273:1: rule__Technology__Group__3__Impl : ( '}' ) ;
    public final void rule__Technology__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4277:1: ( ( '}' ) )
            // InternalCompras.g:4278:1: ( '}' )
            {
            // InternalCompras.g:4278:1: ( '}' )
            // InternalCompras.g:4279:2: '}'
            {
             before(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:4289:1: rule__Technology__Group_1__0 : rule__Technology__Group_1__0__Impl rule__Technology__Group_1__1 ;
    public final void rule__Technology__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4293:1: ( rule__Technology__Group_1__0__Impl rule__Technology__Group_1__1 )
            // InternalCompras.g:4294:2: rule__Technology__Group_1__0__Impl rule__Technology__Group_1__1
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
    // InternalCompras.g:4301:1: rule__Technology__Group_1__0__Impl : ( 'AspNet' ) ;
    public final void rule__Technology__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4305:1: ( ( 'AspNet' ) )
            // InternalCompras.g:4306:1: ( 'AspNet' )
            {
            // InternalCompras.g:4306:1: ( 'AspNet' )
            // InternalCompras.g:4307:2: 'AspNet'
            {
             before(grammarAccess.getTechnologyAccess().getAspNetKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCompras.g:4316:1: rule__Technology__Group_1__1 : rule__Technology__Group_1__1__Impl rule__Technology__Group_1__2 ;
    public final void rule__Technology__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4320:1: ( rule__Technology__Group_1__1__Impl rule__Technology__Group_1__2 )
            // InternalCompras.g:4321:2: rule__Technology__Group_1__1__Impl rule__Technology__Group_1__2
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
    // InternalCompras.g:4328:1: rule__Technology__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4332:1: ( ( ':' ) )
            // InternalCompras.g:4333:1: ( ':' )
            {
            // InternalCompras.g:4333:1: ( ':' )
            // InternalCompras.g:4334:2: ':'
            {
             before(grammarAccess.getTechnologyAccess().getColonKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:4343:1: rule__Technology__Group_1__2 : rule__Technology__Group_1__2__Impl rule__Technology__Group_1__3 ;
    public final void rule__Technology__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4347:1: ( rule__Technology__Group_1__2__Impl rule__Technology__Group_1__3 )
            // InternalCompras.g:4348:2: rule__Technology__Group_1__2__Impl rule__Technology__Group_1__3
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
    // InternalCompras.g:4355:1: rule__Technology__Group_1__2__Impl : ( '{' ) ;
    public final void rule__Technology__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4359:1: ( ( '{' ) )
            // InternalCompras.g:4360:1: ( '{' )
            {
            // InternalCompras.g:4360:1: ( '{' )
            // InternalCompras.g:4361:2: '{'
            {
             before(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:4370:1: rule__Technology__Group_1__3 : rule__Technology__Group_1__3__Impl rule__Technology__Group_1__4 ;
    public final void rule__Technology__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4374:1: ( rule__Technology__Group_1__3__Impl rule__Technology__Group_1__4 )
            // InternalCompras.g:4375:2: rule__Technology__Group_1__3__Impl rule__Technology__Group_1__4
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
    // InternalCompras.g:4382:1: rule__Technology__Group_1__3__Impl : ( ( rule__Technology__ModuleTechAssignment_1_3 )* ) ;
    public final void rule__Technology__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4386:1: ( ( ( rule__Technology__ModuleTechAssignment_1_3 )* ) )
            // InternalCompras.g:4387:1: ( ( rule__Technology__ModuleTechAssignment_1_3 )* )
            {
            // InternalCompras.g:4387:1: ( ( rule__Technology__ModuleTechAssignment_1_3 )* )
            // InternalCompras.g:4388:2: ( rule__Technology__ModuleTechAssignment_1_3 )*
            {
             before(grammarAccess.getTechnologyAccess().getModuleTechAssignment_1_3()); 
            // InternalCompras.g:4389:2: ( rule__Technology__ModuleTechAssignment_1_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCompras.g:4389:3: rule__Technology__ModuleTechAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Technology__ModuleTechAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalCompras.g:4397:1: rule__Technology__Group_1__4 : rule__Technology__Group_1__4__Impl ;
    public final void rule__Technology__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4401:1: ( rule__Technology__Group_1__4__Impl )
            // InternalCompras.g:4402:2: rule__Technology__Group_1__4__Impl
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
    // InternalCompras.g:4408:1: rule__Technology__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Technology__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4412:1: ( ( '}' ) )
            // InternalCompras.g:4413:1: ( '}' )
            {
            // InternalCompras.g:4413:1: ( '}' )
            // InternalCompras.g:4414:2: '}'
            {
             before(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:4424:1: rule__Technology__Group_2__0 : rule__Technology__Group_2__0__Impl rule__Technology__Group_2__1 ;
    public final void rule__Technology__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4428:1: ( rule__Technology__Group_2__0__Impl rule__Technology__Group_2__1 )
            // InternalCompras.g:4429:2: rule__Technology__Group_2__0__Impl rule__Technology__Group_2__1
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
    // InternalCompras.g:4436:1: rule__Technology__Group_2__0__Impl : ( 'Database' ) ;
    public final void rule__Technology__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4440:1: ( ( 'Database' ) )
            // InternalCompras.g:4441:1: ( 'Database' )
            {
            // InternalCompras.g:4441:1: ( 'Database' )
            // InternalCompras.g:4442:2: 'Database'
            {
             before(grammarAccess.getTechnologyAccess().getDatabaseKeyword_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalCompras.g:4451:1: rule__Technology__Group_2__1 : rule__Technology__Group_2__1__Impl rule__Technology__Group_2__2 ;
    public final void rule__Technology__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4455:1: ( rule__Technology__Group_2__1__Impl rule__Technology__Group_2__2 )
            // InternalCompras.g:4456:2: rule__Technology__Group_2__1__Impl rule__Technology__Group_2__2
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
    // InternalCompras.g:4463:1: rule__Technology__Group_2__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4467:1: ( ( ':' ) )
            // InternalCompras.g:4468:1: ( ':' )
            {
            // InternalCompras.g:4468:1: ( ':' )
            // InternalCompras.g:4469:2: ':'
            {
             before(grammarAccess.getTechnologyAccess().getColonKeyword_2_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:4478:1: rule__Technology__Group_2__2 : rule__Technology__Group_2__2__Impl rule__Technology__Group_2__3 ;
    public final void rule__Technology__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4482:1: ( rule__Technology__Group_2__2__Impl rule__Technology__Group_2__3 )
            // InternalCompras.g:4483:2: rule__Technology__Group_2__2__Impl rule__Technology__Group_2__3
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
    // InternalCompras.g:4490:1: rule__Technology__Group_2__2__Impl : ( '{' ) ;
    public final void rule__Technology__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4494:1: ( ( '{' ) )
            // InternalCompras.g:4495:1: ( '{' )
            {
            // InternalCompras.g:4495:1: ( '{' )
            // InternalCompras.g:4496:2: '{'
            {
             before(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_2_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:4505:1: rule__Technology__Group_2__3 : rule__Technology__Group_2__3__Impl rule__Technology__Group_2__4 ;
    public final void rule__Technology__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4509:1: ( rule__Technology__Group_2__3__Impl rule__Technology__Group_2__4 )
            // InternalCompras.g:4510:2: rule__Technology__Group_2__3__Impl rule__Technology__Group_2__4
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
    // InternalCompras.g:4517:1: rule__Technology__Group_2__3__Impl : ( ( rule__Technology__Group_2_3__0 )? ) ;
    public final void rule__Technology__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4521:1: ( ( ( rule__Technology__Group_2_3__0 )? ) )
            // InternalCompras.g:4522:1: ( ( rule__Technology__Group_2_3__0 )? )
            {
            // InternalCompras.g:4522:1: ( ( rule__Technology__Group_2_3__0 )? )
            // InternalCompras.g:4523:2: ( rule__Technology__Group_2_3__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2_3()); 
            // InternalCompras.g:4524:2: ( rule__Technology__Group_2_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCompras.g:4524:3: rule__Technology__Group_2_3__0
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
    // InternalCompras.g:4532:1: rule__Technology__Group_2__4 : rule__Technology__Group_2__4__Impl ;
    public final void rule__Technology__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4536:1: ( rule__Technology__Group_2__4__Impl )
            // InternalCompras.g:4537:2: rule__Technology__Group_2__4__Impl
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
    // InternalCompras.g:4543:1: rule__Technology__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Technology__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4547:1: ( ( '}' ) )
            // InternalCompras.g:4548:1: ( '}' )
            {
            // InternalCompras.g:4548:1: ( '}' )
            // InternalCompras.g:4549:2: '}'
            {
             before(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:4559:1: rule__Technology__Group_2_3__0 : rule__Technology__Group_2_3__0__Impl rule__Technology__Group_2_3__1 ;
    public final void rule__Technology__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4563:1: ( rule__Technology__Group_2_3__0__Impl rule__Technology__Group_2_3__1 )
            // InternalCompras.g:4564:2: rule__Technology__Group_2_3__0__Impl rule__Technology__Group_2_3__1
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
    // InternalCompras.g:4571:1: rule__Technology__Group_2_3__0__Impl : ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) ) ;
    public final void rule__Technology__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4575:1: ( ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) ) )
            // InternalCompras.g:4576:1: ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) )
            {
            // InternalCompras.g:4576:1: ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) )
            // InternalCompras.g:4577:2: ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 )
            {
             before(grammarAccess.getTechnologyAccess().getDbConnectorSegmentLayerAssignment_2_3_0()); 
            // InternalCompras.g:4578:2: ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 )
            // InternalCompras.g:4578:3: rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0
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
    // InternalCompras.g:4586:1: rule__Technology__Group_2_3__1 : rule__Technology__Group_2_3__1__Impl rule__Technology__Group_2_3__2 ;
    public final void rule__Technology__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4590:1: ( rule__Technology__Group_2_3__1__Impl rule__Technology__Group_2_3__2 )
            // InternalCompras.g:4591:2: rule__Technology__Group_2_3__1__Impl rule__Technology__Group_2_3__2
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
    // InternalCompras.g:4598:1: rule__Technology__Group_2_3__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4602:1: ( ( ':' ) )
            // InternalCompras.g:4603:1: ( ':' )
            {
            // InternalCompras.g:4603:1: ( ':' )
            // InternalCompras.g:4604:2: ':'
            {
             before(grammarAccess.getTechnologyAccess().getColonKeyword_2_3_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:4613:1: rule__Technology__Group_2_3__2 : rule__Technology__Group_2_3__2__Impl rule__Technology__Group_2_3__3 ;
    public final void rule__Technology__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4617:1: ( rule__Technology__Group_2_3__2__Impl rule__Technology__Group_2_3__3 )
            // InternalCompras.g:4618:2: rule__Technology__Group_2_3__2__Impl rule__Technology__Group_2_3__3
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
    // InternalCompras.g:4625:1: rule__Technology__Group_2_3__2__Impl : ( '{' ) ;
    public final void rule__Technology__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4629:1: ( ( '{' ) )
            // InternalCompras.g:4630:1: ( '{' )
            {
            // InternalCompras.g:4630:1: ( '{' )
            // InternalCompras.g:4631:2: '{'
            {
             before(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_2_3_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:4640:1: rule__Technology__Group_2_3__3 : rule__Technology__Group_2_3__3__Impl rule__Technology__Group_2_3__4 ;
    public final void rule__Technology__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4644:1: ( rule__Technology__Group_2_3__3__Impl rule__Technology__Group_2_3__4 )
            // InternalCompras.g:4645:2: rule__Technology__Group_2_3__3__Impl rule__Technology__Group_2_3__4
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
    // InternalCompras.g:4652:1: rule__Technology__Group_2_3__3__Impl : ( ( rule__Technology__Group_2_3_3__0 )? ) ;
    public final void rule__Technology__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4656:1: ( ( ( rule__Technology__Group_2_3_3__0 )? ) )
            // InternalCompras.g:4657:1: ( ( rule__Technology__Group_2_3_3__0 )? )
            {
            // InternalCompras.g:4657:1: ( ( rule__Technology__Group_2_3_3__0 )? )
            // InternalCompras.g:4658:2: ( rule__Technology__Group_2_3_3__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2_3_3()); 
            // InternalCompras.g:4659:2: ( rule__Technology__Group_2_3_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==51) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCompras.g:4659:3: rule__Technology__Group_2_3_3__0
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
    // InternalCompras.g:4667:1: rule__Technology__Group_2_3__4 : rule__Technology__Group_2_3__4__Impl rule__Technology__Group_2_3__5 ;
    public final void rule__Technology__Group_2_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4671:1: ( rule__Technology__Group_2_3__4__Impl rule__Technology__Group_2_3__5 )
            // InternalCompras.g:4672:2: rule__Technology__Group_2_3__4__Impl rule__Technology__Group_2_3__5
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
    // InternalCompras.g:4679:1: rule__Technology__Group_2_3__4__Impl : ( ( rule__Technology__Group_2_3_4__0 )? ) ;
    public final void rule__Technology__Group_2_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4683:1: ( ( ( rule__Technology__Group_2_3_4__0 )? ) )
            // InternalCompras.g:4684:1: ( ( rule__Technology__Group_2_3_4__0 )? )
            {
            // InternalCompras.g:4684:1: ( ( rule__Technology__Group_2_3_4__0 )? )
            // InternalCompras.g:4685:2: ( rule__Technology__Group_2_3_4__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2_3_4()); 
            // InternalCompras.g:4686:2: ( rule__Technology__Group_2_3_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCompras.g:4686:3: rule__Technology__Group_2_3_4__0
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
    // InternalCompras.g:4694:1: rule__Technology__Group_2_3__5 : rule__Technology__Group_2_3__5__Impl ;
    public final void rule__Technology__Group_2_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4698:1: ( rule__Technology__Group_2_3__5__Impl )
            // InternalCompras.g:4699:2: rule__Technology__Group_2_3__5__Impl
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
    // InternalCompras.g:4705:1: rule__Technology__Group_2_3__5__Impl : ( '}' ) ;
    public final void rule__Technology__Group_2_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4709:1: ( ( '}' ) )
            // InternalCompras.g:4710:1: ( '}' )
            {
            // InternalCompras.g:4710:1: ( '}' )
            // InternalCompras.g:4711:2: '}'
            {
             before(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_2_3_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:4721:1: rule__Technology__Group_2_3_3__0 : rule__Technology__Group_2_3_3__0__Impl rule__Technology__Group_2_3_3__1 ;
    public final void rule__Technology__Group_2_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4725:1: ( rule__Technology__Group_2_3_3__0__Impl rule__Technology__Group_2_3_3__1 )
            // InternalCompras.g:4726:2: rule__Technology__Group_2_3_3__0__Impl rule__Technology__Group_2_3_3__1
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
    // InternalCompras.g:4733:1: rule__Technology__Group_2_3_3__0__Impl : ( 'DatabaseRDBMSType' ) ;
    public final void rule__Technology__Group_2_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4737:1: ( ( 'DatabaseRDBMSType' ) )
            // InternalCompras.g:4738:1: ( 'DatabaseRDBMSType' )
            {
            // InternalCompras.g:4738:1: ( 'DatabaseRDBMSType' )
            // InternalCompras.g:4739:2: 'DatabaseRDBMSType'
            {
             before(grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeKeyword_2_3_3_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalCompras.g:4748:1: rule__Technology__Group_2_3_3__1 : rule__Technology__Group_2_3_3__1__Impl rule__Technology__Group_2_3_3__2 ;
    public final void rule__Technology__Group_2_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4752:1: ( rule__Technology__Group_2_3_3__1__Impl rule__Technology__Group_2_3_3__2 )
            // InternalCompras.g:4753:2: rule__Technology__Group_2_3_3__1__Impl rule__Technology__Group_2_3_3__2
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
    // InternalCompras.g:4760:1: rule__Technology__Group_2_3_3__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4764:1: ( ( ':' ) )
            // InternalCompras.g:4765:1: ( ':' )
            {
            // InternalCompras.g:4765:1: ( ':' )
            // InternalCompras.g:4766:2: ':'
            {
             before(grammarAccess.getTechnologyAccess().getColonKeyword_2_3_3_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:4775:1: rule__Technology__Group_2_3_3__2 : rule__Technology__Group_2_3_3__2__Impl ;
    public final void rule__Technology__Group_2_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4779:1: ( rule__Technology__Group_2_3_3__2__Impl )
            // InternalCompras.g:4780:2: rule__Technology__Group_2_3_3__2__Impl
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
    // InternalCompras.g:4786:1: rule__Technology__Group_2_3_3__2__Impl : ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) ) ;
    public final void rule__Technology__Group_2_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4790:1: ( ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) ) )
            // InternalCompras.g:4791:1: ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) )
            {
            // InternalCompras.g:4791:1: ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) )
            // InternalCompras.g:4792:2: ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 )
            {
             before(grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeAssignment_2_3_3_2()); 
            // InternalCompras.g:4793:2: ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 )
            // InternalCompras.g:4793:3: rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2
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
    // InternalCompras.g:4802:1: rule__Technology__Group_2_3_4__0 : rule__Technology__Group_2_3_4__0__Impl rule__Technology__Group_2_3_4__1 ;
    public final void rule__Technology__Group_2_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4806:1: ( rule__Technology__Group_2_3_4__0__Impl rule__Technology__Group_2_3_4__1 )
            // InternalCompras.g:4807:2: rule__Technology__Group_2_3_4__0__Impl rule__Technology__Group_2_3_4__1
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
    // InternalCompras.g:4814:1: rule__Technology__Group_2_3_4__0__Impl : ( 'ConnectionString' ) ;
    public final void rule__Technology__Group_2_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4818:1: ( ( 'ConnectionString' ) )
            // InternalCompras.g:4819:1: ( 'ConnectionString' )
            {
            // InternalCompras.g:4819:1: ( 'ConnectionString' )
            // InternalCompras.g:4820:2: 'ConnectionString'
            {
             before(grammarAccess.getTechnologyAccess().getConnectionStringKeyword_2_3_4_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalCompras.g:4829:1: rule__Technology__Group_2_3_4__1 : rule__Technology__Group_2_3_4__1__Impl rule__Technology__Group_2_3_4__2 ;
    public final void rule__Technology__Group_2_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4833:1: ( rule__Technology__Group_2_3_4__1__Impl rule__Technology__Group_2_3_4__2 )
            // InternalCompras.g:4834:2: rule__Technology__Group_2_3_4__1__Impl rule__Technology__Group_2_3_4__2
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
    // InternalCompras.g:4841:1: rule__Technology__Group_2_3_4__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4845:1: ( ( ':' ) )
            // InternalCompras.g:4846:1: ( ':' )
            {
            // InternalCompras.g:4846:1: ( ':' )
            // InternalCompras.g:4847:2: ':'
            {
             before(grammarAccess.getTechnologyAccess().getColonKeyword_2_3_4_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:4856:1: rule__Technology__Group_2_3_4__2 : rule__Technology__Group_2_3_4__2__Impl ;
    public final void rule__Technology__Group_2_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4860:1: ( rule__Technology__Group_2_3_4__2__Impl )
            // InternalCompras.g:4861:2: rule__Technology__Group_2_3_4__2__Impl
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
    // InternalCompras.g:4867:1: rule__Technology__Group_2_3_4__2__Impl : ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) ) ;
    public final void rule__Technology__Group_2_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4871:1: ( ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) ) )
            // InternalCompras.g:4872:1: ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) )
            {
            // InternalCompras.g:4872:1: ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) )
            // InternalCompras.g:4873:2: ( rule__Technology__ConnectionStringAssignment_2_3_4_2 )
            {
             before(grammarAccess.getTechnologyAccess().getConnectionStringAssignment_2_3_4_2()); 
            // InternalCompras.g:4874:2: ( rule__Technology__ConnectionStringAssignment_2_3_4_2 )
            // InternalCompras.g:4874:3: rule__Technology__ConnectionStringAssignment_2_3_4_2
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
    // InternalCompras.g:4883:1: rule__ModuleTech__Group__0 : rule__ModuleTech__Group__0__Impl rule__ModuleTech__Group__1 ;
    public final void rule__ModuleTech__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4887:1: ( rule__ModuleTech__Group__0__Impl rule__ModuleTech__Group__1 )
            // InternalCompras.g:4888:2: rule__ModuleTech__Group__0__Impl rule__ModuleTech__Group__1
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
    // InternalCompras.g:4895:1: rule__ModuleTech__Group__0__Impl : ( 'Module' ) ;
    public final void rule__ModuleTech__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4899:1: ( ( 'Module' ) )
            // InternalCompras.g:4900:1: ( 'Module' )
            {
            // InternalCompras.g:4900:1: ( 'Module' )
            // InternalCompras.g:4901:2: 'Module'
            {
             before(grammarAccess.getModuleTechAccess().getModuleKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCompras.g:4910:1: rule__ModuleTech__Group__1 : rule__ModuleTech__Group__1__Impl rule__ModuleTech__Group__2 ;
    public final void rule__ModuleTech__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4914:1: ( rule__ModuleTech__Group__1__Impl rule__ModuleTech__Group__2 )
            // InternalCompras.g:4915:2: rule__ModuleTech__Group__1__Impl rule__ModuleTech__Group__2
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
    // InternalCompras.g:4922:1: rule__ModuleTech__Group__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4926:1: ( ( ':' ) )
            // InternalCompras.g:4927:1: ( ':' )
            {
            // InternalCompras.g:4927:1: ( ':' )
            // InternalCompras.g:4928:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:4937:1: rule__ModuleTech__Group__2 : rule__ModuleTech__Group__2__Impl rule__ModuleTech__Group__3 ;
    public final void rule__ModuleTech__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4941:1: ( rule__ModuleTech__Group__2__Impl rule__ModuleTech__Group__3 )
            // InternalCompras.g:4942:2: rule__ModuleTech__Group__2__Impl rule__ModuleTech__Group__3
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
    // InternalCompras.g:4949:1: rule__ModuleTech__Group__2__Impl : ( ( rule__ModuleTech__NameAssignment_2 ) ) ;
    public final void rule__ModuleTech__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4953:1: ( ( ( rule__ModuleTech__NameAssignment_2 ) ) )
            // InternalCompras.g:4954:1: ( ( rule__ModuleTech__NameAssignment_2 ) )
            {
            // InternalCompras.g:4954:1: ( ( rule__ModuleTech__NameAssignment_2 ) )
            // InternalCompras.g:4955:2: ( rule__ModuleTech__NameAssignment_2 )
            {
             before(grammarAccess.getModuleTechAccess().getNameAssignment_2()); 
            // InternalCompras.g:4956:2: ( rule__ModuleTech__NameAssignment_2 )
            // InternalCompras.g:4956:3: rule__ModuleTech__NameAssignment_2
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
    // InternalCompras.g:4964:1: rule__ModuleTech__Group__3 : rule__ModuleTech__Group__3__Impl rule__ModuleTech__Group__4 ;
    public final void rule__ModuleTech__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4968:1: ( rule__ModuleTech__Group__3__Impl rule__ModuleTech__Group__4 )
            // InternalCompras.g:4969:2: rule__ModuleTech__Group__3__Impl rule__ModuleTech__Group__4
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
    // InternalCompras.g:4976:1: rule__ModuleTech__Group__3__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4980:1: ( ( ':' ) )
            // InternalCompras.g:4981:1: ( ':' )
            {
            // InternalCompras.g:4981:1: ( ':' )
            // InternalCompras.g:4982:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:4991:1: rule__ModuleTech__Group__4 : rule__ModuleTech__Group__4__Impl rule__ModuleTech__Group__5 ;
    public final void rule__ModuleTech__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4995:1: ( rule__ModuleTech__Group__4__Impl rule__ModuleTech__Group__5 )
            // InternalCompras.g:4996:2: rule__ModuleTech__Group__4__Impl rule__ModuleTech__Group__5
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
    // InternalCompras.g:5003:1: rule__ModuleTech__Group__4__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5007:1: ( ( '{' ) )
            // InternalCompras.g:5008:1: ( '{' )
            {
            // InternalCompras.g:5008:1: ( '{' )
            // InternalCompras.g:5009:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:5018:1: rule__ModuleTech__Group__5 : rule__ModuleTech__Group__5__Impl rule__ModuleTech__Group__6 ;
    public final void rule__ModuleTech__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5022:1: ( rule__ModuleTech__Group__5__Impl rule__ModuleTech__Group__6 )
            // InternalCompras.g:5023:2: rule__ModuleTech__Group__5__Impl rule__ModuleTech__Group__6
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
    // InternalCompras.g:5030:1: rule__ModuleTech__Group__5__Impl : ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) ) ;
    public final void rule__ModuleTech__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5034:1: ( ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) ) )
            // InternalCompras.g:5035:1: ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) )
            {
            // InternalCompras.g:5035:1: ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) )
            // InternalCompras.g:5036:2: ( rule__ModuleTech__PresentationLayerAssignment_5 )
            {
             before(grammarAccess.getModuleTechAccess().getPresentationLayerAssignment_5()); 
            // InternalCompras.g:5037:2: ( rule__ModuleTech__PresentationLayerAssignment_5 )
            // InternalCompras.g:5037:3: rule__ModuleTech__PresentationLayerAssignment_5
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
    // InternalCompras.g:5045:1: rule__ModuleTech__Group__6 : rule__ModuleTech__Group__6__Impl rule__ModuleTech__Group__7 ;
    public final void rule__ModuleTech__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5049:1: ( rule__ModuleTech__Group__6__Impl rule__ModuleTech__Group__7 )
            // InternalCompras.g:5050:2: rule__ModuleTech__Group__6__Impl rule__ModuleTech__Group__7
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
    // InternalCompras.g:5057:1: rule__ModuleTech__Group__6__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5061:1: ( ( ':' ) )
            // InternalCompras.g:5062:1: ( ':' )
            {
            // InternalCompras.g:5062:1: ( ':' )
            // InternalCompras.g:5063:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:5072:1: rule__ModuleTech__Group__7 : rule__ModuleTech__Group__7__Impl rule__ModuleTech__Group__8 ;
    public final void rule__ModuleTech__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5076:1: ( rule__ModuleTech__Group__7__Impl rule__ModuleTech__Group__8 )
            // InternalCompras.g:5077:2: rule__ModuleTech__Group__7__Impl rule__ModuleTech__Group__8
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
    // InternalCompras.g:5084:1: rule__ModuleTech__Group__7__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5088:1: ( ( '{' ) )
            // InternalCompras.g:5089:1: ( '{' )
            {
            // InternalCompras.g:5089:1: ( '{' )
            // InternalCompras.g:5090:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:5099:1: rule__ModuleTech__Group__8 : rule__ModuleTech__Group__8__Impl rule__ModuleTech__Group__9 ;
    public final void rule__ModuleTech__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5103:1: ( rule__ModuleTech__Group__8__Impl rule__ModuleTech__Group__9 )
            // InternalCompras.g:5104:2: rule__ModuleTech__Group__8__Impl rule__ModuleTech__Group__9
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
    // InternalCompras.g:5111:1: rule__ModuleTech__Group__8__Impl : ( ( rule__ModuleTech__Group_8__0 )? ) ;
    public final void rule__ModuleTech__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5115:1: ( ( ( rule__ModuleTech__Group_8__0 )? ) )
            // InternalCompras.g:5116:1: ( ( rule__ModuleTech__Group_8__0 )? )
            {
            // InternalCompras.g:5116:1: ( ( rule__ModuleTech__Group_8__0 )? )
            // InternalCompras.g:5117:2: ( rule__ModuleTech__Group_8__0 )?
            {
             before(grammarAccess.getModuleTechAccess().getGroup_8()); 
            // InternalCompras.g:5118:2: ( rule__ModuleTech__Group_8__0 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalCompras.g:5118:3: rule__ModuleTech__Group_8__0
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
    // InternalCompras.g:5126:1: rule__ModuleTech__Group__9 : rule__ModuleTech__Group__9__Impl rule__ModuleTech__Group__10 ;
    public final void rule__ModuleTech__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5130:1: ( rule__ModuleTech__Group__9__Impl rule__ModuleTech__Group__10 )
            // InternalCompras.g:5131:2: rule__ModuleTech__Group__9__Impl rule__ModuleTech__Group__10
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
    // InternalCompras.g:5138:1: rule__ModuleTech__Group__9__Impl : ( ( rule__ModuleTech__Group_9__0 )? ) ;
    public final void rule__ModuleTech__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5142:1: ( ( ( rule__ModuleTech__Group_9__0 )? ) )
            // InternalCompras.g:5143:1: ( ( rule__ModuleTech__Group_9__0 )? )
            {
            // InternalCompras.g:5143:1: ( ( rule__ModuleTech__Group_9__0 )? )
            // InternalCompras.g:5144:2: ( rule__ModuleTech__Group_9__0 )?
            {
             before(grammarAccess.getModuleTechAccess().getGroup_9()); 
            // InternalCompras.g:5145:2: ( rule__ModuleTech__Group_9__0 )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalCompras.g:5145:3: rule__ModuleTech__Group_9__0
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
    // InternalCompras.g:5153:1: rule__ModuleTech__Group__10 : rule__ModuleTech__Group__10__Impl rule__ModuleTech__Group__11 ;
    public final void rule__ModuleTech__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5157:1: ( rule__ModuleTech__Group__10__Impl rule__ModuleTech__Group__11 )
            // InternalCompras.g:5158:2: rule__ModuleTech__Group__10__Impl rule__ModuleTech__Group__11
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
    // InternalCompras.g:5165:1: rule__ModuleTech__Group__10__Impl : ( ( rule__ModuleTech__Group_10__0 )? ) ;
    public final void rule__ModuleTech__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5169:1: ( ( ( rule__ModuleTech__Group_10__0 )? ) )
            // InternalCompras.g:5170:1: ( ( rule__ModuleTech__Group_10__0 )? )
            {
            // InternalCompras.g:5170:1: ( ( rule__ModuleTech__Group_10__0 )? )
            // InternalCompras.g:5171:2: ( rule__ModuleTech__Group_10__0 )?
            {
             before(grammarAccess.getModuleTechAccess().getGroup_10()); 
            // InternalCompras.g:5172:2: ( rule__ModuleTech__Group_10__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCompras.g:5172:3: rule__ModuleTech__Group_10__0
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
    // InternalCompras.g:5180:1: rule__ModuleTech__Group__11 : rule__ModuleTech__Group__11__Impl rule__ModuleTech__Group__12 ;
    public final void rule__ModuleTech__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5184:1: ( rule__ModuleTech__Group__11__Impl rule__ModuleTech__Group__12 )
            // InternalCompras.g:5185:2: rule__ModuleTech__Group__11__Impl rule__ModuleTech__Group__12
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
    // InternalCompras.g:5192:1: rule__ModuleTech__Group__11__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5196:1: ( ( '}' ) )
            // InternalCompras.g:5197:1: ( '}' )
            {
            // InternalCompras.g:5197:1: ( '}' )
            // InternalCompras.g:5198:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_11()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:5207:1: rule__ModuleTech__Group__12 : rule__ModuleTech__Group__12__Impl rule__ModuleTech__Group__13 ;
    public final void rule__ModuleTech__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5211:1: ( rule__ModuleTech__Group__12__Impl rule__ModuleTech__Group__13 )
            // InternalCompras.g:5212:2: rule__ModuleTech__Group__12__Impl rule__ModuleTech__Group__13
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
    // InternalCompras.g:5219:1: rule__ModuleTech__Group__12__Impl : ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) ) ;
    public final void rule__ModuleTech__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5223:1: ( ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) ) )
            // InternalCompras.g:5224:1: ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) )
            {
            // InternalCompras.g:5224:1: ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) )
            // InternalCompras.g:5225:2: ( rule__ModuleTech__BusinessLayerAssignment_12 )
            {
             before(grammarAccess.getModuleTechAccess().getBusinessLayerAssignment_12()); 
            // InternalCompras.g:5226:2: ( rule__ModuleTech__BusinessLayerAssignment_12 )
            // InternalCompras.g:5226:3: rule__ModuleTech__BusinessLayerAssignment_12
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
    // InternalCompras.g:5234:1: rule__ModuleTech__Group__13 : rule__ModuleTech__Group__13__Impl rule__ModuleTech__Group__14 ;
    public final void rule__ModuleTech__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5238:1: ( rule__ModuleTech__Group__13__Impl rule__ModuleTech__Group__14 )
            // InternalCompras.g:5239:2: rule__ModuleTech__Group__13__Impl rule__ModuleTech__Group__14
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
    // InternalCompras.g:5246:1: rule__ModuleTech__Group__13__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5250:1: ( ( ':' ) )
            // InternalCompras.g:5251:1: ( ':' )
            {
            // InternalCompras.g:5251:1: ( ':' )
            // InternalCompras.g:5252:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_13()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:5261:1: rule__ModuleTech__Group__14 : rule__ModuleTech__Group__14__Impl rule__ModuleTech__Group__15 ;
    public final void rule__ModuleTech__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5265:1: ( rule__ModuleTech__Group__14__Impl rule__ModuleTech__Group__15 )
            // InternalCompras.g:5266:2: rule__ModuleTech__Group__14__Impl rule__ModuleTech__Group__15
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
    // InternalCompras.g:5273:1: rule__ModuleTech__Group__14__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5277:1: ( ( '{' ) )
            // InternalCompras.g:5278:1: ( '{' )
            {
            // InternalCompras.g:5278:1: ( '{' )
            // InternalCompras.g:5279:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:5288:1: rule__ModuleTech__Group__15 : rule__ModuleTech__Group__15__Impl rule__ModuleTech__Group__16 ;
    public final void rule__ModuleTech__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5292:1: ( rule__ModuleTech__Group__15__Impl rule__ModuleTech__Group__16 )
            // InternalCompras.g:5293:2: rule__ModuleTech__Group__15__Impl rule__ModuleTech__Group__16
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
    // InternalCompras.g:5300:1: rule__ModuleTech__Group__15__Impl : ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* ) ;
    public final void rule__ModuleTech__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5304:1: ( ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* ) )
            // InternalCompras.g:5305:1: ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* )
            {
            // InternalCompras.g:5305:1: ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* )
            // InternalCompras.g:5306:2: ( rule__ModuleTech__BusinessLayerRefAssignment_15 )*
            {
             before(grammarAccess.getModuleTechAccess().getBusinessLayerRefAssignment_15()); 
            // InternalCompras.g:5307:2: ( rule__ModuleTech__BusinessLayerRefAssignment_15 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==56) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCompras.g:5307:3: rule__ModuleTech__BusinessLayerRefAssignment_15
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__ModuleTech__BusinessLayerRefAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalCompras.g:5315:1: rule__ModuleTech__Group__16 : rule__ModuleTech__Group__16__Impl rule__ModuleTech__Group__17 ;
    public final void rule__ModuleTech__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5319:1: ( rule__ModuleTech__Group__16__Impl rule__ModuleTech__Group__17 )
            // InternalCompras.g:5320:2: rule__ModuleTech__Group__16__Impl rule__ModuleTech__Group__17
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
    // InternalCompras.g:5327:1: rule__ModuleTech__Group__16__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5331:1: ( ( '}' ) )
            // InternalCompras.g:5332:1: ( '}' )
            {
            // InternalCompras.g:5332:1: ( '}' )
            // InternalCompras.g:5333:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_16()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:5342:1: rule__ModuleTech__Group__17 : rule__ModuleTech__Group__17__Impl rule__ModuleTech__Group__18 ;
    public final void rule__ModuleTech__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5346:1: ( rule__ModuleTech__Group__17__Impl rule__ModuleTech__Group__18 )
            // InternalCompras.g:5347:2: rule__ModuleTech__Group__17__Impl rule__ModuleTech__Group__18
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
    // InternalCompras.g:5354:1: rule__ModuleTech__Group__17__Impl : ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) ) ;
    public final void rule__ModuleTech__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5358:1: ( ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) ) )
            // InternalCompras.g:5359:1: ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) )
            {
            // InternalCompras.g:5359:1: ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) )
            // InternalCompras.g:5360:2: ( rule__ModuleTech__DataAccessLayerAssignment_17 )
            {
             before(grammarAccess.getModuleTechAccess().getDataAccessLayerAssignment_17()); 
            // InternalCompras.g:5361:2: ( rule__ModuleTech__DataAccessLayerAssignment_17 )
            // InternalCompras.g:5361:3: rule__ModuleTech__DataAccessLayerAssignment_17
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
    // InternalCompras.g:5369:1: rule__ModuleTech__Group__18 : rule__ModuleTech__Group__18__Impl rule__ModuleTech__Group__19 ;
    public final void rule__ModuleTech__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5373:1: ( rule__ModuleTech__Group__18__Impl rule__ModuleTech__Group__19 )
            // InternalCompras.g:5374:2: rule__ModuleTech__Group__18__Impl rule__ModuleTech__Group__19
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
    // InternalCompras.g:5381:1: rule__ModuleTech__Group__18__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5385:1: ( ( ':' ) )
            // InternalCompras.g:5386:1: ( ':' )
            {
            // InternalCompras.g:5386:1: ( ':' )
            // InternalCompras.g:5387:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_18()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:5396:1: rule__ModuleTech__Group__19 : rule__ModuleTech__Group__19__Impl rule__ModuleTech__Group__20 ;
    public final void rule__ModuleTech__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5400:1: ( rule__ModuleTech__Group__19__Impl rule__ModuleTech__Group__20 )
            // InternalCompras.g:5401:2: rule__ModuleTech__Group__19__Impl rule__ModuleTech__Group__20
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
    // InternalCompras.g:5408:1: rule__ModuleTech__Group__19__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5412:1: ( ( '{' ) )
            // InternalCompras.g:5413:1: ( '{' )
            {
            // InternalCompras.g:5413:1: ( '{' )
            // InternalCompras.g:5414:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_19()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:5423:1: rule__ModuleTech__Group__20 : rule__ModuleTech__Group__20__Impl rule__ModuleTech__Group__21 ;
    public final void rule__ModuleTech__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5427:1: ( rule__ModuleTech__Group__20__Impl rule__ModuleTech__Group__21 )
            // InternalCompras.g:5428:2: rule__ModuleTech__Group__20__Impl rule__ModuleTech__Group__21
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
    // InternalCompras.g:5435:1: rule__ModuleTech__Group__20__Impl : ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* ) ;
    public final void rule__ModuleTech__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5439:1: ( ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* ) )
            // InternalCompras.g:5440:1: ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* )
            {
            // InternalCompras.g:5440:1: ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* )
            // InternalCompras.g:5441:2: ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )*
            {
             before(grammarAccess.getModuleTechAccess().getDataAccessLayerRefAssignment_20()); 
            // InternalCompras.g:5442:2: ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==57) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCompras.g:5442:3: rule__ModuleTech__DataAccessLayerRefAssignment_20
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__ModuleTech__DataAccessLayerRefAssignment_20();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalCompras.g:5450:1: rule__ModuleTech__Group__21 : rule__ModuleTech__Group__21__Impl rule__ModuleTech__Group__22 ;
    public final void rule__ModuleTech__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5454:1: ( rule__ModuleTech__Group__21__Impl rule__ModuleTech__Group__22 )
            // InternalCompras.g:5455:2: rule__ModuleTech__Group__21__Impl rule__ModuleTech__Group__22
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
    // InternalCompras.g:5462:1: rule__ModuleTech__Group__21__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5466:1: ( ( '}' ) )
            // InternalCompras.g:5467:1: ( '}' )
            {
            // InternalCompras.g:5467:1: ( '}' )
            // InternalCompras.g:5468:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_21()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:5477:1: rule__ModuleTech__Group__22 : rule__ModuleTech__Group__22__Impl rule__ModuleTech__Group__23 ;
    public final void rule__ModuleTech__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5481:1: ( rule__ModuleTech__Group__22__Impl rule__ModuleTech__Group__23 )
            // InternalCompras.g:5482:2: rule__ModuleTech__Group__22__Impl rule__ModuleTech__Group__23
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
    // InternalCompras.g:5489:1: rule__ModuleTech__Group__22__Impl : ( ( rule__ModuleTech__CommonLayerAssignment_22 ) ) ;
    public final void rule__ModuleTech__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5493:1: ( ( ( rule__ModuleTech__CommonLayerAssignment_22 ) ) )
            // InternalCompras.g:5494:1: ( ( rule__ModuleTech__CommonLayerAssignment_22 ) )
            {
            // InternalCompras.g:5494:1: ( ( rule__ModuleTech__CommonLayerAssignment_22 ) )
            // InternalCompras.g:5495:2: ( rule__ModuleTech__CommonLayerAssignment_22 )
            {
             before(grammarAccess.getModuleTechAccess().getCommonLayerAssignment_22()); 
            // InternalCompras.g:5496:2: ( rule__ModuleTech__CommonLayerAssignment_22 )
            // InternalCompras.g:5496:3: rule__ModuleTech__CommonLayerAssignment_22
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
    // InternalCompras.g:5504:1: rule__ModuleTech__Group__23 : rule__ModuleTech__Group__23__Impl rule__ModuleTech__Group__24 ;
    public final void rule__ModuleTech__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5508:1: ( rule__ModuleTech__Group__23__Impl rule__ModuleTech__Group__24 )
            // InternalCompras.g:5509:2: rule__ModuleTech__Group__23__Impl rule__ModuleTech__Group__24
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
    // InternalCompras.g:5516:1: rule__ModuleTech__Group__23__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5520:1: ( ( ':' ) )
            // InternalCompras.g:5521:1: ( ':' )
            {
            // InternalCompras.g:5521:1: ( ':' )
            // InternalCompras.g:5522:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_23()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:5531:1: rule__ModuleTech__Group__24 : rule__ModuleTech__Group__24__Impl rule__ModuleTech__Group__25 ;
    public final void rule__ModuleTech__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5535:1: ( rule__ModuleTech__Group__24__Impl rule__ModuleTech__Group__25 )
            // InternalCompras.g:5536:2: rule__ModuleTech__Group__24__Impl rule__ModuleTech__Group__25
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
    // InternalCompras.g:5543:1: rule__ModuleTech__Group__24__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5547:1: ( ( '{' ) )
            // InternalCompras.g:5548:1: ( '{' )
            {
            // InternalCompras.g:5548:1: ( '{' )
            // InternalCompras.g:5549:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_24()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:5558:1: rule__ModuleTech__Group__25 : rule__ModuleTech__Group__25__Impl rule__ModuleTech__Group__26 ;
    public final void rule__ModuleTech__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5562:1: ( rule__ModuleTech__Group__25__Impl rule__ModuleTech__Group__26 )
            // InternalCompras.g:5563:2: rule__ModuleTech__Group__25__Impl rule__ModuleTech__Group__26
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
    // InternalCompras.g:5570:1: rule__ModuleTech__Group__25__Impl : ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* ) ;
    public final void rule__ModuleTech__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5574:1: ( ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* ) )
            // InternalCompras.g:5575:1: ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* )
            {
            // InternalCompras.g:5575:1: ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* )
            // InternalCompras.g:5576:2: ( rule__ModuleTech__CommonLayerRefAssignment_25 )*
            {
             before(grammarAccess.getModuleTechAccess().getCommonLayerRefAssignment_25()); 
            // InternalCompras.g:5577:2: ( rule__ModuleTech__CommonLayerRefAssignment_25 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==58) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCompras.g:5577:3: rule__ModuleTech__CommonLayerRefAssignment_25
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__ModuleTech__CommonLayerRefAssignment_25();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalCompras.g:5585:1: rule__ModuleTech__Group__26 : rule__ModuleTech__Group__26__Impl rule__ModuleTech__Group__27 ;
    public final void rule__ModuleTech__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5589:1: ( rule__ModuleTech__Group__26__Impl rule__ModuleTech__Group__27 )
            // InternalCompras.g:5590:2: rule__ModuleTech__Group__26__Impl rule__ModuleTech__Group__27
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
    // InternalCompras.g:5597:1: rule__ModuleTech__Group__26__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5601:1: ( ( '}' ) )
            // InternalCompras.g:5602:1: ( '}' )
            {
            // InternalCompras.g:5602:1: ( '}' )
            // InternalCompras.g:5603:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_26()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:5612:1: rule__ModuleTech__Group__27 : rule__ModuleTech__Group__27__Impl ;
    public final void rule__ModuleTech__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5616:1: ( rule__ModuleTech__Group__27__Impl )
            // InternalCompras.g:5617:2: rule__ModuleTech__Group__27__Impl
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
    // InternalCompras.g:5623:1: rule__ModuleTech__Group__27__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5627:1: ( ( '}' ) )
            // InternalCompras.g:5628:1: ( '}' )
            {
            // InternalCompras.g:5628:1: ( '}' )
            // InternalCompras.g:5629:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_27()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:5639:1: rule__ModuleTech__Group_8__0 : rule__ModuleTech__Group_8__0__Impl rule__ModuleTech__Group_8__1 ;
    public final void rule__ModuleTech__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5643:1: ( rule__ModuleTech__Group_8__0__Impl rule__ModuleTech__Group_8__1 )
            // InternalCompras.g:5644:2: rule__ModuleTech__Group_8__0__Impl rule__ModuleTech__Group_8__1
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
    // InternalCompras.g:5651:1: rule__ModuleTech__Group_8__0__Impl : ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) ) ;
    public final void rule__ModuleTech__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5655:1: ( ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) ) )
            // InternalCompras.g:5656:1: ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) )
            {
            // InternalCompras.g:5656:1: ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) )
            // InternalCompras.g:5657:2: ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 )
            {
             before(grammarAccess.getModuleTechAccess().getControllerSegmentLayerAssignment_8_0()); 
            // InternalCompras.g:5658:2: ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 )
            // InternalCompras.g:5658:3: rule__ModuleTech__ControllerSegmentLayerAssignment_8_0
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
    // InternalCompras.g:5666:1: rule__ModuleTech__Group_8__1 : rule__ModuleTech__Group_8__1__Impl rule__ModuleTech__Group_8__2 ;
    public final void rule__ModuleTech__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5670:1: ( rule__ModuleTech__Group_8__1__Impl rule__ModuleTech__Group_8__2 )
            // InternalCompras.g:5671:2: rule__ModuleTech__Group_8__1__Impl rule__ModuleTech__Group_8__2
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
    // InternalCompras.g:5678:1: rule__ModuleTech__Group_8__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5682:1: ( ( ':' ) )
            // InternalCompras.g:5683:1: ( ':' )
            {
            // InternalCompras.g:5683:1: ( ':' )
            // InternalCompras.g:5684:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_8_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:5693:1: rule__ModuleTech__Group_8__2 : rule__ModuleTech__Group_8__2__Impl rule__ModuleTech__Group_8__3 ;
    public final void rule__ModuleTech__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5697:1: ( rule__ModuleTech__Group_8__2__Impl rule__ModuleTech__Group_8__3 )
            // InternalCompras.g:5698:2: rule__ModuleTech__Group_8__2__Impl rule__ModuleTech__Group_8__3
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
    // InternalCompras.g:5705:1: rule__ModuleTech__Group_8__2__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5709:1: ( ( '{' ) )
            // InternalCompras.g:5710:1: ( '{' )
            {
            // InternalCompras.g:5710:1: ( '{' )
            // InternalCompras.g:5711:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_8_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:5720:1: rule__ModuleTech__Group_8__3 : rule__ModuleTech__Group_8__3__Impl rule__ModuleTech__Group_8__4 ;
    public final void rule__ModuleTech__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5724:1: ( rule__ModuleTech__Group_8__3__Impl rule__ModuleTech__Group_8__4 )
            // InternalCompras.g:5725:2: rule__ModuleTech__Group_8__3__Impl rule__ModuleTech__Group_8__4
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
    // InternalCompras.g:5732:1: rule__ModuleTech__Group_8__3__Impl : ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* ) ;
    public final void rule__ModuleTech__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5736:1: ( ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* ) )
            // InternalCompras.g:5737:1: ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* )
            {
            // InternalCompras.g:5737:1: ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* )
            // InternalCompras.g:5738:2: ( rule__ModuleTech__ControllersRefAssignment_8_3 )*
            {
             before(grammarAccess.getModuleTechAccess().getControllersRefAssignment_8_3()); 
            // InternalCompras.g:5739:2: ( rule__ModuleTech__ControllersRefAssignment_8_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==53) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCompras.g:5739:3: rule__ModuleTech__ControllersRefAssignment_8_3
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__ModuleTech__ControllersRefAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalCompras.g:5747:1: rule__ModuleTech__Group_8__4 : rule__ModuleTech__Group_8__4__Impl ;
    public final void rule__ModuleTech__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5751:1: ( rule__ModuleTech__Group_8__4__Impl )
            // InternalCompras.g:5752:2: rule__ModuleTech__Group_8__4__Impl
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
    // InternalCompras.g:5758:1: rule__ModuleTech__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5762:1: ( ( '}' ) )
            // InternalCompras.g:5763:1: ( '}' )
            {
            // InternalCompras.g:5763:1: ( '}' )
            // InternalCompras.g:5764:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:5774:1: rule__ModuleTech__Group_9__0 : rule__ModuleTech__Group_9__0__Impl rule__ModuleTech__Group_9__1 ;
    public final void rule__ModuleTech__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5778:1: ( rule__ModuleTech__Group_9__0__Impl rule__ModuleTech__Group_9__1 )
            // InternalCompras.g:5779:2: rule__ModuleTech__Group_9__0__Impl rule__ModuleTech__Group_9__1
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
    // InternalCompras.g:5786:1: rule__ModuleTech__Group_9__0__Impl : ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) ) ;
    public final void rule__ModuleTech__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5790:1: ( ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) ) )
            // InternalCompras.g:5791:1: ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) )
            {
            // InternalCompras.g:5791:1: ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) )
            // InternalCompras.g:5792:2: ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 )
            {
             before(grammarAccess.getModuleTechAccess().getViewSegmentLayerAssignment_9_0()); 
            // InternalCompras.g:5793:2: ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 )
            // InternalCompras.g:5793:3: rule__ModuleTech__ViewSegmentLayerAssignment_9_0
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
    // InternalCompras.g:5801:1: rule__ModuleTech__Group_9__1 : rule__ModuleTech__Group_9__1__Impl rule__ModuleTech__Group_9__2 ;
    public final void rule__ModuleTech__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5805:1: ( rule__ModuleTech__Group_9__1__Impl rule__ModuleTech__Group_9__2 )
            // InternalCompras.g:5806:2: rule__ModuleTech__Group_9__1__Impl rule__ModuleTech__Group_9__2
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
    // InternalCompras.g:5813:1: rule__ModuleTech__Group_9__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5817:1: ( ( ':' ) )
            // InternalCompras.g:5818:1: ( ':' )
            {
            // InternalCompras.g:5818:1: ( ':' )
            // InternalCompras.g:5819:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_9_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:5828:1: rule__ModuleTech__Group_9__2 : rule__ModuleTech__Group_9__2__Impl rule__ModuleTech__Group_9__3 ;
    public final void rule__ModuleTech__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5832:1: ( rule__ModuleTech__Group_9__2__Impl rule__ModuleTech__Group_9__3 )
            // InternalCompras.g:5833:2: rule__ModuleTech__Group_9__2__Impl rule__ModuleTech__Group_9__3
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
    // InternalCompras.g:5840:1: rule__ModuleTech__Group_9__2__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5844:1: ( ( '{' ) )
            // InternalCompras.g:5845:1: ( '{' )
            {
            // InternalCompras.g:5845:1: ( '{' )
            // InternalCompras.g:5846:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_9_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:5855:1: rule__ModuleTech__Group_9__3 : rule__ModuleTech__Group_9__3__Impl rule__ModuleTech__Group_9__4 ;
    public final void rule__ModuleTech__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5859:1: ( rule__ModuleTech__Group_9__3__Impl rule__ModuleTech__Group_9__4 )
            // InternalCompras.g:5860:2: rule__ModuleTech__Group_9__3__Impl rule__ModuleTech__Group_9__4
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
    // InternalCompras.g:5867:1: rule__ModuleTech__Group_9__3__Impl : ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* ) ;
    public final void rule__ModuleTech__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5871:1: ( ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* ) )
            // InternalCompras.g:5872:1: ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* )
            {
            // InternalCompras.g:5872:1: ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* )
            // InternalCompras.g:5873:2: ( rule__ModuleTech__ViewsRefAssignment_9_3 )*
            {
             before(grammarAccess.getModuleTechAccess().getViewsRefAssignment_9_3()); 
            // InternalCompras.g:5874:2: ( rule__ModuleTech__ViewsRefAssignment_9_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==54) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCompras.g:5874:3: rule__ModuleTech__ViewsRefAssignment_9_3
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__ModuleTech__ViewsRefAssignment_9_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalCompras.g:5882:1: rule__ModuleTech__Group_9__4 : rule__ModuleTech__Group_9__4__Impl ;
    public final void rule__ModuleTech__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5886:1: ( rule__ModuleTech__Group_9__4__Impl )
            // InternalCompras.g:5887:2: rule__ModuleTech__Group_9__4__Impl
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
    // InternalCompras.g:5893:1: rule__ModuleTech__Group_9__4__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5897:1: ( ( '}' ) )
            // InternalCompras.g:5898:1: ( '}' )
            {
            // InternalCompras.g:5898:1: ( '}' )
            // InternalCompras.g:5899:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:5909:1: rule__ModuleTech__Group_10__0 : rule__ModuleTech__Group_10__0__Impl rule__ModuleTech__Group_10__1 ;
    public final void rule__ModuleTech__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5913:1: ( rule__ModuleTech__Group_10__0__Impl rule__ModuleTech__Group_10__1 )
            // InternalCompras.g:5914:2: rule__ModuleTech__Group_10__0__Impl rule__ModuleTech__Group_10__1
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
    // InternalCompras.g:5921:1: rule__ModuleTech__Group_10__0__Impl : ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) ) ;
    public final void rule__ModuleTech__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5925:1: ( ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) ) )
            // InternalCompras.g:5926:1: ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) )
            {
            // InternalCompras.g:5926:1: ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) )
            // InternalCompras.g:5927:2: ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 )
            {
             before(grammarAccess.getModuleTechAccess().getScriptSegmentLayerAssignment_10_0()); 
            // InternalCompras.g:5928:2: ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 )
            // InternalCompras.g:5928:3: rule__ModuleTech__ScriptSegmentLayerAssignment_10_0
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
    // InternalCompras.g:5936:1: rule__ModuleTech__Group_10__1 : rule__ModuleTech__Group_10__1__Impl rule__ModuleTech__Group_10__2 ;
    public final void rule__ModuleTech__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5940:1: ( rule__ModuleTech__Group_10__1__Impl rule__ModuleTech__Group_10__2 )
            // InternalCompras.g:5941:2: rule__ModuleTech__Group_10__1__Impl rule__ModuleTech__Group_10__2
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
    // InternalCompras.g:5948:1: rule__ModuleTech__Group_10__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5952:1: ( ( ':' ) )
            // InternalCompras.g:5953:1: ( ':' )
            {
            // InternalCompras.g:5953:1: ( ':' )
            // InternalCompras.g:5954:2: ':'
            {
             before(grammarAccess.getModuleTechAccess().getColonKeyword_10_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:5963:1: rule__ModuleTech__Group_10__2 : rule__ModuleTech__Group_10__2__Impl rule__ModuleTech__Group_10__3 ;
    public final void rule__ModuleTech__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5967:1: ( rule__ModuleTech__Group_10__2__Impl rule__ModuleTech__Group_10__3 )
            // InternalCompras.g:5968:2: rule__ModuleTech__Group_10__2__Impl rule__ModuleTech__Group_10__3
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
    // InternalCompras.g:5975:1: rule__ModuleTech__Group_10__2__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5979:1: ( ( '{' ) )
            // InternalCompras.g:5980:1: ( '{' )
            {
            // InternalCompras.g:5980:1: ( '{' )
            // InternalCompras.g:5981:2: '{'
            {
             before(grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_10_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCompras.g:5990:1: rule__ModuleTech__Group_10__3 : rule__ModuleTech__Group_10__3__Impl rule__ModuleTech__Group_10__4 ;
    public final void rule__ModuleTech__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5994:1: ( rule__ModuleTech__Group_10__3__Impl rule__ModuleTech__Group_10__4 )
            // InternalCompras.g:5995:2: rule__ModuleTech__Group_10__3__Impl rule__ModuleTech__Group_10__4
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
    // InternalCompras.g:6002:1: rule__ModuleTech__Group_10__3__Impl : ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* ) ;
    public final void rule__ModuleTech__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6006:1: ( ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* ) )
            // InternalCompras.g:6007:1: ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* )
            {
            // InternalCompras.g:6007:1: ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* )
            // InternalCompras.g:6008:2: ( rule__ModuleTech__ScriptRefAssignment_10_3 )*
            {
             before(grammarAccess.getModuleTechAccess().getScriptRefAssignment_10_3()); 
            // InternalCompras.g:6009:2: ( rule__ModuleTech__ScriptRefAssignment_10_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==55) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCompras.g:6009:3: rule__ModuleTech__ScriptRefAssignment_10_3
            	    {
            	    pushFollow(FOLLOW_55);
            	    rule__ModuleTech__ScriptRefAssignment_10_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalCompras.g:6017:1: rule__ModuleTech__Group_10__4 : rule__ModuleTech__Group_10__4__Impl ;
    public final void rule__ModuleTech__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6021:1: ( rule__ModuleTech__Group_10__4__Impl )
            // InternalCompras.g:6022:2: rule__ModuleTech__Group_10__4__Impl
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
    // InternalCompras.g:6028:1: rule__ModuleTech__Group_10__4__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6032:1: ( ( '}' ) )
            // InternalCompras.g:6033:1: ( '}' )
            {
            // InternalCompras.g:6033:1: ( '}' )
            // InternalCompras.g:6034:2: '}'
            {
             before(grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCompras.g:6044:1: rule__ControllersRef__Group__0 : rule__ControllersRef__Group__0__Impl rule__ControllersRef__Group__1 ;
    public final void rule__ControllersRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6048:1: ( rule__ControllersRef__Group__0__Impl rule__ControllersRef__Group__1 )
            // InternalCompras.g:6049:2: rule__ControllersRef__Group__0__Impl rule__ControllersRef__Group__1
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
    // InternalCompras.g:6056:1: rule__ControllersRef__Group__0__Impl : ( 'Controller' ) ;
    public final void rule__ControllersRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6060:1: ( ( 'Controller' ) )
            // InternalCompras.g:6061:1: ( 'Controller' )
            {
            // InternalCompras.g:6061:1: ( 'Controller' )
            // InternalCompras.g:6062:2: 'Controller'
            {
             before(grammarAccess.getControllersRefAccess().getControllerKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalCompras.g:6071:1: rule__ControllersRef__Group__1 : rule__ControllersRef__Group__1__Impl rule__ControllersRef__Group__2 ;
    public final void rule__ControllersRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6075:1: ( rule__ControllersRef__Group__1__Impl rule__ControllersRef__Group__2 )
            // InternalCompras.g:6076:2: rule__ControllersRef__Group__1__Impl rule__ControllersRef__Group__2
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
    // InternalCompras.g:6083:1: rule__ControllersRef__Group__1__Impl : ( ':' ) ;
    public final void rule__ControllersRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6087:1: ( ( ':' ) )
            // InternalCompras.g:6088:1: ( ':' )
            {
            // InternalCompras.g:6088:1: ( ':' )
            // InternalCompras.g:6089:2: ':'
            {
             before(grammarAccess.getControllersRefAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:6098:1: rule__ControllersRef__Group__2 : rule__ControllersRef__Group__2__Impl ;
    public final void rule__ControllersRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6102:1: ( rule__ControllersRef__Group__2__Impl )
            // InternalCompras.g:6103:2: rule__ControllersRef__Group__2__Impl
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
    // InternalCompras.g:6109:1: rule__ControllersRef__Group__2__Impl : ( ( rule__ControllersRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__ControllersRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6113:1: ( ( ( rule__ControllersRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6114:1: ( ( rule__ControllersRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6114:1: ( ( rule__ControllersRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6115:2: ( rule__ControllersRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getControllersRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6116:2: ( rule__ControllersRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6116:3: rule__ControllersRef__FunctionalityAssignment_2
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
    // InternalCompras.g:6125:1: rule__ViewsRef__Group__0 : rule__ViewsRef__Group__0__Impl rule__ViewsRef__Group__1 ;
    public final void rule__ViewsRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6129:1: ( rule__ViewsRef__Group__0__Impl rule__ViewsRef__Group__1 )
            // InternalCompras.g:6130:2: rule__ViewsRef__Group__0__Impl rule__ViewsRef__Group__1
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
    // InternalCompras.g:6137:1: rule__ViewsRef__Group__0__Impl : ( 'View' ) ;
    public final void rule__ViewsRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6141:1: ( ( 'View' ) )
            // InternalCompras.g:6142:1: ( 'View' )
            {
            // InternalCompras.g:6142:1: ( 'View' )
            // InternalCompras.g:6143:2: 'View'
            {
             before(grammarAccess.getViewsRefAccess().getViewKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalCompras.g:6152:1: rule__ViewsRef__Group__1 : rule__ViewsRef__Group__1__Impl rule__ViewsRef__Group__2 ;
    public final void rule__ViewsRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6156:1: ( rule__ViewsRef__Group__1__Impl rule__ViewsRef__Group__2 )
            // InternalCompras.g:6157:2: rule__ViewsRef__Group__1__Impl rule__ViewsRef__Group__2
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
    // InternalCompras.g:6164:1: rule__ViewsRef__Group__1__Impl : ( ':' ) ;
    public final void rule__ViewsRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6168:1: ( ( ':' ) )
            // InternalCompras.g:6169:1: ( ':' )
            {
            // InternalCompras.g:6169:1: ( ':' )
            // InternalCompras.g:6170:2: ':'
            {
             before(grammarAccess.getViewsRefAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:6179:1: rule__ViewsRef__Group__2 : rule__ViewsRef__Group__2__Impl ;
    public final void rule__ViewsRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6183:1: ( rule__ViewsRef__Group__2__Impl )
            // InternalCompras.g:6184:2: rule__ViewsRef__Group__2__Impl
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
    // InternalCompras.g:6190:1: rule__ViewsRef__Group__2__Impl : ( ( rule__ViewsRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__ViewsRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6194:1: ( ( ( rule__ViewsRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6195:1: ( ( rule__ViewsRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6195:1: ( ( rule__ViewsRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6196:2: ( rule__ViewsRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getViewsRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6197:2: ( rule__ViewsRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6197:3: rule__ViewsRef__FunctionalityAssignment_2
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
    // InternalCompras.g:6206:1: rule__ScriptRef__Group__0 : rule__ScriptRef__Group__0__Impl rule__ScriptRef__Group__1 ;
    public final void rule__ScriptRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6210:1: ( rule__ScriptRef__Group__0__Impl rule__ScriptRef__Group__1 )
            // InternalCompras.g:6211:2: rule__ScriptRef__Group__0__Impl rule__ScriptRef__Group__1
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
    // InternalCompras.g:6218:1: rule__ScriptRef__Group__0__Impl : ( 'Script' ) ;
    public final void rule__ScriptRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6222:1: ( ( 'Script' ) )
            // InternalCompras.g:6223:1: ( 'Script' )
            {
            // InternalCompras.g:6223:1: ( 'Script' )
            // InternalCompras.g:6224:2: 'Script'
            {
             before(grammarAccess.getScriptRefAccess().getScriptKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalCompras.g:6233:1: rule__ScriptRef__Group__1 : rule__ScriptRef__Group__1__Impl rule__ScriptRef__Group__2 ;
    public final void rule__ScriptRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6237:1: ( rule__ScriptRef__Group__1__Impl rule__ScriptRef__Group__2 )
            // InternalCompras.g:6238:2: rule__ScriptRef__Group__1__Impl rule__ScriptRef__Group__2
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
    // InternalCompras.g:6245:1: rule__ScriptRef__Group__1__Impl : ( ':' ) ;
    public final void rule__ScriptRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6249:1: ( ( ':' ) )
            // InternalCompras.g:6250:1: ( ':' )
            {
            // InternalCompras.g:6250:1: ( ':' )
            // InternalCompras.g:6251:2: ':'
            {
             before(grammarAccess.getScriptRefAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:6260:1: rule__ScriptRef__Group__2 : rule__ScriptRef__Group__2__Impl ;
    public final void rule__ScriptRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6264:1: ( rule__ScriptRef__Group__2__Impl )
            // InternalCompras.g:6265:2: rule__ScriptRef__Group__2__Impl
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
    // InternalCompras.g:6271:1: rule__ScriptRef__Group__2__Impl : ( ( rule__ScriptRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__ScriptRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6275:1: ( ( ( rule__ScriptRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6276:1: ( ( rule__ScriptRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6276:1: ( ( rule__ScriptRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6277:2: ( rule__ScriptRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getScriptRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6278:2: ( rule__ScriptRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6278:3: rule__ScriptRef__FunctionalityAssignment_2
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
    // InternalCompras.g:6287:1: rule__BusinessLayerRef__Group__0 : rule__BusinessLayerRef__Group__0__Impl rule__BusinessLayerRef__Group__1 ;
    public final void rule__BusinessLayerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6291:1: ( rule__BusinessLayerRef__Group__0__Impl rule__BusinessLayerRef__Group__1 )
            // InternalCompras.g:6292:2: rule__BusinessLayerRef__Group__0__Impl rule__BusinessLayerRef__Group__1
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
    // InternalCompras.g:6299:1: rule__BusinessLayerRef__Group__0__Impl : ( 'BLogic' ) ;
    public final void rule__BusinessLayerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6303:1: ( ( 'BLogic' ) )
            // InternalCompras.g:6304:1: ( 'BLogic' )
            {
            // InternalCompras.g:6304:1: ( 'BLogic' )
            // InternalCompras.g:6305:2: 'BLogic'
            {
             before(grammarAccess.getBusinessLayerRefAccess().getBLogicKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalCompras.g:6314:1: rule__BusinessLayerRef__Group__1 : rule__BusinessLayerRef__Group__1__Impl rule__BusinessLayerRef__Group__2 ;
    public final void rule__BusinessLayerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6318:1: ( rule__BusinessLayerRef__Group__1__Impl rule__BusinessLayerRef__Group__2 )
            // InternalCompras.g:6319:2: rule__BusinessLayerRef__Group__1__Impl rule__BusinessLayerRef__Group__2
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
    // InternalCompras.g:6326:1: rule__BusinessLayerRef__Group__1__Impl : ( ':' ) ;
    public final void rule__BusinessLayerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6330:1: ( ( ':' ) )
            // InternalCompras.g:6331:1: ( ':' )
            {
            // InternalCompras.g:6331:1: ( ':' )
            // InternalCompras.g:6332:2: ':'
            {
             before(grammarAccess.getBusinessLayerRefAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:6341:1: rule__BusinessLayerRef__Group__2 : rule__BusinessLayerRef__Group__2__Impl ;
    public final void rule__BusinessLayerRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6345:1: ( rule__BusinessLayerRef__Group__2__Impl )
            // InternalCompras.g:6346:2: rule__BusinessLayerRef__Group__2__Impl
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
    // InternalCompras.g:6352:1: rule__BusinessLayerRef__Group__2__Impl : ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__BusinessLayerRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6356:1: ( ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6357:1: ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6357:1: ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6358:2: ( rule__BusinessLayerRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getBusinessLayerRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6359:2: ( rule__BusinessLayerRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6359:3: rule__BusinessLayerRef__FunctionalityAssignment_2
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
    // InternalCompras.g:6368:1: rule__DataAccessLayerRef__Group__0 : rule__DataAccessLayerRef__Group__0__Impl rule__DataAccessLayerRef__Group__1 ;
    public final void rule__DataAccessLayerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6372:1: ( rule__DataAccessLayerRef__Group__0__Impl rule__DataAccessLayerRef__Group__1 )
            // InternalCompras.g:6373:2: rule__DataAccessLayerRef__Group__0__Impl rule__DataAccessLayerRef__Group__1
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
    // InternalCompras.g:6380:1: rule__DataAccessLayerRef__Group__0__Impl : ( 'DataAccess' ) ;
    public final void rule__DataAccessLayerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6384:1: ( ( 'DataAccess' ) )
            // InternalCompras.g:6385:1: ( 'DataAccess' )
            {
            // InternalCompras.g:6385:1: ( 'DataAccess' )
            // InternalCompras.g:6386:2: 'DataAccess'
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getDataAccessKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalCompras.g:6395:1: rule__DataAccessLayerRef__Group__1 : rule__DataAccessLayerRef__Group__1__Impl rule__DataAccessLayerRef__Group__2 ;
    public final void rule__DataAccessLayerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6399:1: ( rule__DataAccessLayerRef__Group__1__Impl rule__DataAccessLayerRef__Group__2 )
            // InternalCompras.g:6400:2: rule__DataAccessLayerRef__Group__1__Impl rule__DataAccessLayerRef__Group__2
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
    // InternalCompras.g:6407:1: rule__DataAccessLayerRef__Group__1__Impl : ( ':' ) ;
    public final void rule__DataAccessLayerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6411:1: ( ( ':' ) )
            // InternalCompras.g:6412:1: ( ':' )
            {
            // InternalCompras.g:6412:1: ( ':' )
            // InternalCompras.g:6413:2: ':'
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:6422:1: rule__DataAccessLayerRef__Group__2 : rule__DataAccessLayerRef__Group__2__Impl ;
    public final void rule__DataAccessLayerRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6426:1: ( rule__DataAccessLayerRef__Group__2__Impl )
            // InternalCompras.g:6427:2: rule__DataAccessLayerRef__Group__2__Impl
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
    // InternalCompras.g:6433:1: rule__DataAccessLayerRef__Group__2__Impl : ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__DataAccessLayerRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6437:1: ( ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6438:1: ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6438:1: ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6439:2: ( rule__DataAccessLayerRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6440:2: ( rule__DataAccessLayerRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6440:3: rule__DataAccessLayerRef__FunctionalityAssignment_2
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
    // InternalCompras.g:6449:1: rule__CommonLayerRef__Group__0 : rule__CommonLayerRef__Group__0__Impl rule__CommonLayerRef__Group__1 ;
    public final void rule__CommonLayerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6453:1: ( rule__CommonLayerRef__Group__0__Impl rule__CommonLayerRef__Group__1 )
            // InternalCompras.g:6454:2: rule__CommonLayerRef__Group__0__Impl rule__CommonLayerRef__Group__1
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
    // InternalCompras.g:6461:1: rule__CommonLayerRef__Group__0__Impl : ( 'DtoModel' ) ;
    public final void rule__CommonLayerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6465:1: ( ( 'DtoModel' ) )
            // InternalCompras.g:6466:1: ( 'DtoModel' )
            {
            // InternalCompras.g:6466:1: ( 'DtoModel' )
            // InternalCompras.g:6467:2: 'DtoModel'
            {
             before(grammarAccess.getCommonLayerRefAccess().getDtoModelKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalCompras.g:6476:1: rule__CommonLayerRef__Group__1 : rule__CommonLayerRef__Group__1__Impl rule__CommonLayerRef__Group__2 ;
    public final void rule__CommonLayerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6480:1: ( rule__CommonLayerRef__Group__1__Impl rule__CommonLayerRef__Group__2 )
            // InternalCompras.g:6481:2: rule__CommonLayerRef__Group__1__Impl rule__CommonLayerRef__Group__2
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
    // InternalCompras.g:6488:1: rule__CommonLayerRef__Group__1__Impl : ( ':' ) ;
    public final void rule__CommonLayerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6492:1: ( ( ':' ) )
            // InternalCompras.g:6493:1: ( ':' )
            {
            // InternalCompras.g:6493:1: ( ':' )
            // InternalCompras.g:6494:2: ':'
            {
             before(grammarAccess.getCommonLayerRefAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCompras.g:6503:1: rule__CommonLayerRef__Group__2 : rule__CommonLayerRef__Group__2__Impl ;
    public final void rule__CommonLayerRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6507:1: ( rule__CommonLayerRef__Group__2__Impl )
            // InternalCompras.g:6508:2: rule__CommonLayerRef__Group__2__Impl
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
    // InternalCompras.g:6514:1: rule__CommonLayerRef__Group__2__Impl : ( ( rule__CommonLayerRef__EntityAssignment_2 ) ) ;
    public final void rule__CommonLayerRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6518:1: ( ( ( rule__CommonLayerRef__EntityAssignment_2 ) ) )
            // InternalCompras.g:6519:1: ( ( rule__CommonLayerRef__EntityAssignment_2 ) )
            {
            // InternalCompras.g:6519:1: ( ( rule__CommonLayerRef__EntityAssignment_2 ) )
            // InternalCompras.g:6520:2: ( rule__CommonLayerRef__EntityAssignment_2 )
            {
             before(grammarAccess.getCommonLayerRefAccess().getEntityAssignment_2()); 
            // InternalCompras.g:6521:2: ( rule__CommonLayerRef__EntityAssignment_2 )
            // InternalCompras.g:6521:3: rule__CommonLayerRef__EntityAssignment_2
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
    // InternalCompras.g:6530:1: rule__Solution__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Solution__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6534:1: ( ( RULE_ID ) )
            // InternalCompras.g:6535:2: ( RULE_ID )
            {
            // InternalCompras.g:6535:2: ( RULE_ID )
            // InternalCompras.g:6536:3: RULE_ID
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
    // InternalCompras.g:6545:1: rule__Solution__DomainAssignment_6 : ( ruleDomain ) ;
    public final void rule__Solution__DomainAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6549:1: ( ( ruleDomain ) )
            // InternalCompras.g:6550:2: ( ruleDomain )
            {
            // InternalCompras.g:6550:2: ( ruleDomain )
            // InternalCompras.g:6551:3: ruleDomain
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
    // InternalCompras.g:6560:1: rule__Solution__ArchitectureAssignment_9 : ( ruleArchitecture ) ;
    public final void rule__Solution__ArchitectureAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6564:1: ( ( ruleArchitecture ) )
            // InternalCompras.g:6565:2: ( ruleArchitecture )
            {
            // InternalCompras.g:6565:2: ( ruleArchitecture )
            // InternalCompras.g:6566:3: ruleArchitecture
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
    // InternalCompras.g:6575:1: rule__Solution__TechnologyAssignment_12 : ( ruleTechnology ) ;
    public final void rule__Solution__TechnologyAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6579:1: ( ( ruleTechnology ) )
            // InternalCompras.g:6580:2: ( ruleTechnology )
            {
            // InternalCompras.g:6580:2: ( ruleTechnology )
            // InternalCompras.g:6581:3: ruleTechnology
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
    // InternalCompras.g:6590:1: rule__Domain__ModuleAssignment_1 : ( ruleModule ) ;
    public final void rule__Domain__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6594:1: ( ( ruleModule ) )
            // InternalCompras.g:6595:2: ( ruleModule )
            {
            // InternalCompras.g:6595:2: ( ruleModule )
            // InternalCompras.g:6596:3: ruleModule
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
    // InternalCompras.g:6605:1: rule__Module__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6609:1: ( ( RULE_ID ) )
            // InternalCompras.g:6610:2: ( RULE_ID )
            {
            // InternalCompras.g:6610:2: ( RULE_ID )
            // InternalCompras.g:6611:3: RULE_ID
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
    // InternalCompras.g:6620:1: rule__Module__EntityAssignment_8 : ( ruleEntity ) ;
    public final void rule__Module__EntityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6624:1: ( ( ruleEntity ) )
            // InternalCompras.g:6625:2: ( ruleEntity )
            {
            // InternalCompras.g:6625:2: ( ruleEntity )
            // InternalCompras.g:6626:3: ruleEntity
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


    // $ANTLR start "rule__Module__FunctionalityAssignment_13"
    // InternalCompras.g:6635:1: rule__Module__FunctionalityAssignment_13 : ( ruleFunctionality ) ;
    public final void rule__Module__FunctionalityAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6639:1: ( ( ruleFunctionality ) )
            // InternalCompras.g:6640:2: ( ruleFunctionality )
            {
            // InternalCompras.g:6640:2: ( ruleFunctionality )
            // InternalCompras.g:6641:3: ruleFunctionality
            {
             before(grammarAccess.getModuleAccess().getFunctionalityFunctionalityParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionality();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getFunctionalityFunctionalityParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__FunctionalityAssignment_13"


    // $ANTLR start "rule__Entity__NameAssignment_0"
    // InternalCompras.g:6650:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6654:1: ( ( RULE_ID ) )
            // InternalCompras.g:6655:2: ( RULE_ID )
            {
            // InternalCompras.g:6655:2: ( RULE_ID )
            // InternalCompras.g:6656:3: RULE_ID
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
    // InternalCompras.g:6665:1: rule__Entity__EntityFieldAssignment_3 : ( ruleEntityField ) ;
    public final void rule__Entity__EntityFieldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6669:1: ( ( ruleEntityField ) )
            // InternalCompras.g:6670:2: ( ruleEntityField )
            {
            // InternalCompras.g:6670:2: ( ruleEntityField )
            // InternalCompras.g:6671:3: ruleEntityField
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
    // InternalCompras.g:6680:1: rule__EntityField__EntityFieldRequiredAssignment_0 : ( ruleEntityFieldRequired ) ;
    public final void rule__EntityField__EntityFieldRequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6684:1: ( ( ruleEntityFieldRequired ) )
            // InternalCompras.g:6685:2: ( ruleEntityFieldRequired )
            {
            // InternalCompras.g:6685:2: ( ruleEntityFieldRequired )
            // InternalCompras.g:6686:3: ruleEntityFieldRequired
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
    // InternalCompras.g:6695:1: rule__EntityField__EntityFieldLabelAssignment_1 : ( ruleEntityFieldLabel ) ;
    public final void rule__EntityField__EntityFieldLabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6699:1: ( ( ruleEntityFieldLabel ) )
            // InternalCompras.g:6700:2: ( ruleEntityFieldLabel )
            {
            // InternalCompras.g:6700:2: ( ruleEntityFieldLabel )
            // InternalCompras.g:6701:3: ruleEntityFieldLabel
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
    // InternalCompras.g:6710:1: rule__EntityField__EntityTypeAssignment_2 : ( ruleEntityType ) ;
    public final void rule__EntityField__EntityTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6714:1: ( ( ruleEntityType ) )
            // InternalCompras.g:6715:2: ( ruleEntityType )
            {
            // InternalCompras.g:6715:2: ( ruleEntityType )
            // InternalCompras.g:6716:3: ruleEntityType
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
    // InternalCompras.g:6725:1: rule__EntityField__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__EntityField__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6729:1: ( ( RULE_ID ) )
            // InternalCompras.g:6730:2: ( RULE_ID )
            {
            // InternalCompras.g:6730:2: ( RULE_ID )
            // InternalCompras.g:6731:3: RULE_ID
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
    // InternalCompras.g:6740:1: rule__EntityFieldLabel__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__EntityFieldLabel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6744:1: ( ( RULE_STRING ) )
            // InternalCompras.g:6745:2: ( RULE_STRING )
            {
            // InternalCompras.g:6745:2: ( RULE_STRING )
            // InternalCompras.g:6746:3: RULE_STRING
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
    // InternalCompras.g:6755:1: rule__EntityFieldRequired__NameAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__EntityFieldRequired__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6759:1: ( ( ( 'required' ) ) )
            // InternalCompras.g:6760:2: ( ( 'required' ) )
            {
            // InternalCompras.g:6760:2: ( ( 'required' ) )
            // InternalCompras.g:6761:3: ( 'required' )
            {
             before(grammarAccess.getEntityFieldRequiredAccess().getNameRequiredKeyword_1_0()); 
            // InternalCompras.g:6762:3: ( 'required' )
            // InternalCompras.g:6763:4: 'required'
            {
             before(grammarAccess.getEntityFieldRequiredAccess().getNameRequiredKeyword_1_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalCompras.g:6774:1: rule__EntityType__EntityAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__EntityType__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6778:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:6779:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:6779:2: ( ( ruleFQN ) )
            // InternalCompras.g:6780:3: ( ruleFQN )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0_0()); 
            // InternalCompras.g:6781:3: ( ruleFQN )
            // InternalCompras.g:6782:4: ruleFQN
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
    // InternalCompras.g:6793:1: rule__EntityType__CommonFieldTypeAssignment_1 : ( ruleCommonFieldType ) ;
    public final void rule__EntityType__CommonFieldTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6797:1: ( ( ruleCommonFieldType ) )
            // InternalCompras.g:6798:2: ( ruleCommonFieldType )
            {
            // InternalCompras.g:6798:2: ( ruleCommonFieldType )
            // InternalCompras.g:6799:3: ruleCommonFieldType
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
    // InternalCompras.g:6808:1: rule__Functionality__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Functionality__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6812:1: ( ( RULE_ID ) )
            // InternalCompras.g:6813:2: ( RULE_ID )
            {
            // InternalCompras.g:6813:2: ( RULE_ID )
            // InternalCompras.g:6814:3: RULE_ID
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
    // InternalCompras.g:6823:1: rule__Functionality__EntityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Functionality__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6827:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:6828:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:6828:2: ( ( ruleFQN ) )
            // InternalCompras.g:6829:3: ( ruleFQN )
            {
             before(grammarAccess.getFunctionalityAccess().getEntityEntityCrossReference_2_0()); 
            // InternalCompras.g:6830:3: ( ruleFQN )
            // InternalCompras.g:6831:4: ruleFQN
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


    // $ANTLR start "rule__Functionality__FunctionalityFieldTypeAssignment_5"
    // InternalCompras.g:6842:1: rule__Functionality__FunctionalityFieldTypeAssignment_5 : ( ruleFunctionalityFieldType ) ;
    public final void rule__Functionality__FunctionalityFieldTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6846:1: ( ( ruleFunctionalityFieldType ) )
            // InternalCompras.g:6847:2: ( ruleFunctionalityFieldType )
            {
            // InternalCompras.g:6847:2: ( ruleFunctionalityFieldType )
            // InternalCompras.g:6848:3: ruleFunctionalityFieldType
            {
             before(grammarAccess.getFunctionalityAccess().getFunctionalityFieldTypeFunctionalityFieldTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionalityFieldType();

            state._fsp--;

             after(grammarAccess.getFunctionalityAccess().getFunctionalityFieldTypeFunctionalityFieldTypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__FunctionalityFieldTypeAssignment_5"


    // $ANTLR start "rule__Architecture__PresentationLayerAssignment_6"
    // InternalCompras.g:6857:1: rule__Architecture__PresentationLayerAssignment_6 : ( rulePresentationLayer ) ;
    public final void rule__Architecture__PresentationLayerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6861:1: ( ( rulePresentationLayer ) )
            // InternalCompras.g:6862:2: ( rulePresentationLayer )
            {
            // InternalCompras.g:6862:2: ( rulePresentationLayer )
            // InternalCompras.g:6863:3: rulePresentationLayer
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
    // InternalCompras.g:6872:1: rule__Architecture__BusinessLayerAssignment_9 : ( ruleBusinessLayer ) ;
    public final void rule__Architecture__BusinessLayerAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6876:1: ( ( ruleBusinessLayer ) )
            // InternalCompras.g:6877:2: ( ruleBusinessLayer )
            {
            // InternalCompras.g:6877:2: ( ruleBusinessLayer )
            // InternalCompras.g:6878:3: ruleBusinessLayer
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
    // InternalCompras.g:6887:1: rule__Architecture__DataAccessLayerAssignment_12 : ( ruleDataAccessLayer ) ;
    public final void rule__Architecture__DataAccessLayerAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6891:1: ( ( ruleDataAccessLayer ) )
            // InternalCompras.g:6892:2: ( ruleDataAccessLayer )
            {
            // InternalCompras.g:6892:2: ( ruleDataAccessLayer )
            // InternalCompras.g:6893:3: ruleDataAccessLayer
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
    // InternalCompras.g:6902:1: rule__Architecture__CommonLayerAssignment_15 : ( ruleCommonLayer ) ;
    public final void rule__Architecture__CommonLayerAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6906:1: ( ( ruleCommonLayer ) )
            // InternalCompras.g:6907:2: ( ruleCommonLayer )
            {
            // InternalCompras.g:6907:2: ( ruleCommonLayer )
            // InternalCompras.g:6908:3: ruleCommonLayer
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
    // InternalCompras.g:6917:1: rule__Architecture__RelationsAssignment_19 : ( ruleRelations ) ;
    public final void rule__Architecture__RelationsAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6921:1: ( ( ruleRelations ) )
            // InternalCompras.g:6922:2: ( ruleRelations )
            {
            // InternalCompras.g:6922:2: ( ruleRelations )
            // InternalCompras.g:6923:3: ruleRelations
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
    // InternalCompras.g:6932:1: rule__PresentationLayer__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PresentationLayer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6936:1: ( ( RULE_ID ) )
            // InternalCompras.g:6937:2: ( RULE_ID )
            {
            // InternalCompras.g:6937:2: ( RULE_ID )
            // InternalCompras.g:6938:3: RULE_ID
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
    // InternalCompras.g:6947:1: rule__PresentationLayer__ControllerSegmentLayerAssignment_5 : ( ruleControllerSegmentLayer ) ;
    public final void rule__PresentationLayer__ControllerSegmentLayerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6951:1: ( ( ruleControllerSegmentLayer ) )
            // InternalCompras.g:6952:2: ( ruleControllerSegmentLayer )
            {
            // InternalCompras.g:6952:2: ( ruleControllerSegmentLayer )
            // InternalCompras.g:6953:3: ruleControllerSegmentLayer
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
    // InternalCompras.g:6962:1: rule__PresentationLayer__ViewSegmentLayerAssignment_8 : ( ruleViewSegmentLayer ) ;
    public final void rule__PresentationLayer__ViewSegmentLayerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6966:1: ( ( ruleViewSegmentLayer ) )
            // InternalCompras.g:6967:2: ( ruleViewSegmentLayer )
            {
            // InternalCompras.g:6967:2: ( ruleViewSegmentLayer )
            // InternalCompras.g:6968:3: ruleViewSegmentLayer
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
    // InternalCompras.g:6977:1: rule__PresentationLayer__ScriptegmentLayerAssignment_11 : ( ruleScriptSegmentLayer ) ;
    public final void rule__PresentationLayer__ScriptegmentLayerAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6981:1: ( ( ruleScriptSegmentLayer ) )
            // InternalCompras.g:6982:2: ( ruleScriptSegmentLayer )
            {
            // InternalCompras.g:6982:2: ( ruleScriptSegmentLayer )
            // InternalCompras.g:6983:3: ruleScriptSegmentLayer
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
    // InternalCompras.g:6992:1: rule__ControllerSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__ControllerSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6996:1: ( ( RULE_ID ) )
            // InternalCompras.g:6997:2: ( RULE_ID )
            {
            // InternalCompras.g:6997:2: ( RULE_ID )
            // InternalCompras.g:6998:3: RULE_ID
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
    // InternalCompras.g:7007:1: rule__ViewSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__ViewSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7011:1: ( ( RULE_ID ) )
            // InternalCompras.g:7012:2: ( RULE_ID )
            {
            // InternalCompras.g:7012:2: ( RULE_ID )
            // InternalCompras.g:7013:3: RULE_ID
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
    // InternalCompras.g:7022:1: rule__ScriptSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__ScriptSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7026:1: ( ( RULE_ID ) )
            // InternalCompras.g:7027:2: ( RULE_ID )
            {
            // InternalCompras.g:7027:2: ( RULE_ID )
            // InternalCompras.g:7028:3: RULE_ID
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
    // InternalCompras.g:7037:1: rule__BusinessLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__BusinessLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7041:1: ( ( RULE_ID ) )
            // InternalCompras.g:7042:2: ( RULE_ID )
            {
            // InternalCompras.g:7042:2: ( RULE_ID )
            // InternalCompras.g:7043:3: RULE_ID
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
    // InternalCompras.g:7052:1: rule__DataAccessLayer__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DataAccessLayer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7056:1: ( ( RULE_ID ) )
            // InternalCompras.g:7057:2: ( RULE_ID )
            {
            // InternalCompras.g:7057:2: ( RULE_ID )
            // InternalCompras.g:7058:3: RULE_ID
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
    // InternalCompras.g:7067:1: rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 : ( ruleDbConnectorSegmentLayer ) ;
    public final void rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7071:1: ( ( ruleDbConnectorSegmentLayer ) )
            // InternalCompras.g:7072:2: ( ruleDbConnectorSegmentLayer )
            {
            // InternalCompras.g:7072:2: ( ruleDbConnectorSegmentLayer )
            // InternalCompras.g:7073:3: ruleDbConnectorSegmentLayer
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
    // InternalCompras.g:7082:1: rule__DbConnectorSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__DbConnectorSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7086:1: ( ( RULE_ID ) )
            // InternalCompras.g:7087:2: ( RULE_ID )
            {
            // InternalCompras.g:7087:2: ( RULE_ID )
            // InternalCompras.g:7088:3: RULE_ID
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
    // InternalCompras.g:7097:1: rule__CommonLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__CommonLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7101:1: ( ( RULE_ID ) )
            // InternalCompras.g:7102:2: ( RULE_ID )
            {
            // InternalCompras.g:7102:2: ( RULE_ID )
            // InternalCompras.g:7103:3: RULE_ID
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
    // InternalCompras.g:7112:1: rule__Relations__SourceLayer1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7116:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7117:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7117:2: ( ( RULE_ID ) )
            // InternalCompras.g:7118:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer1PresentationLayerCrossReference_1_0()); 
            // InternalCompras.g:7119:3: ( RULE_ID )
            // InternalCompras.g:7120:4: RULE_ID
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
    // InternalCompras.g:7131:1: rule__Relations__RelationsType1Assignment_2 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7135:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7136:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7136:2: ( ruleRelationsType )
            // InternalCompras.g:7137:3: ruleRelationsType
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
    // InternalCompras.g:7146:1: rule__Relations__TargetLayer1Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7150:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7151:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7151:2: ( ( RULE_ID ) )
            // InternalCompras.g:7152:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer1BusinessLayerCrossReference_3_0()); 
            // InternalCompras.g:7153:3: ( RULE_ID )
            // InternalCompras.g:7154:4: RULE_ID
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
    // InternalCompras.g:7165:1: rule__Relations__SourceLayer2Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7169:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7170:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7170:2: ( ( RULE_ID ) )
            // InternalCompras.g:7171:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer2BusinessLayerCrossReference_4_0()); 
            // InternalCompras.g:7172:3: ( RULE_ID )
            // InternalCompras.g:7173:4: RULE_ID
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
    // InternalCompras.g:7184:1: rule__Relations__RelationsType2Assignment_5 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7188:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7189:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7189:2: ( ruleRelationsType )
            // InternalCompras.g:7190:3: ruleRelationsType
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
    // InternalCompras.g:7199:1: rule__Relations__TargetLayer2Assignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7203:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7204:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7204:2: ( ( RULE_ID ) )
            // InternalCompras.g:7205:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer2DataAccessLayerCrossReference_6_0()); 
            // InternalCompras.g:7206:3: ( RULE_ID )
            // InternalCompras.g:7207:4: RULE_ID
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
    // InternalCompras.g:7218:1: rule__Relations__SourceLayer3Assignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer3Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7222:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7223:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7223:2: ( ( RULE_ID ) )
            // InternalCompras.g:7224:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer3DataAccessLayerCrossReference_7_0()); 
            // InternalCompras.g:7225:3: ( RULE_ID )
            // InternalCompras.g:7226:4: RULE_ID
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
    // InternalCompras.g:7237:1: rule__Relations__RelationsType3Assignment_8 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType3Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7241:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7242:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7242:2: ( ruleRelationsType )
            // InternalCompras.g:7243:3: ruleRelationsType
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
    // InternalCompras.g:7252:1: rule__Relations__TargetLayer3Assignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer3Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7256:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7257:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7257:2: ( ( RULE_ID ) )
            // InternalCompras.g:7258:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer3CommonLayerCrossReference_9_0()); 
            // InternalCompras.g:7259:3: ( RULE_ID )
            // InternalCompras.g:7260:4: RULE_ID
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
    // InternalCompras.g:7271:1: rule__Relations__SourceLayer4Assignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer4Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7275:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7276:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7276:2: ( ( RULE_ID ) )
            // InternalCompras.g:7277:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer4PresentationLayerCrossReference_10_0()); 
            // InternalCompras.g:7278:3: ( RULE_ID )
            // InternalCompras.g:7279:4: RULE_ID
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
    // InternalCompras.g:7290:1: rule__Relations__RelationsType4Assignment_11 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType4Assignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7294:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7295:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7295:2: ( ruleRelationsType )
            // InternalCompras.g:7296:3: ruleRelationsType
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
    // InternalCompras.g:7305:1: rule__Relations__TargetLayer4Assignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer4Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7309:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7310:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7310:2: ( ( RULE_ID ) )
            // InternalCompras.g:7311:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer4CommonLayerCrossReference_12_0()); 
            // InternalCompras.g:7312:3: ( RULE_ID )
            // InternalCompras.g:7313:4: RULE_ID
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
    // InternalCompras.g:7324:1: rule__Relations__SourceLayer5Assignment_13 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer5Assignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7328:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7329:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7329:2: ( ( RULE_ID ) )
            // InternalCompras.g:7330:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer5BusinessLayerCrossReference_13_0()); 
            // InternalCompras.g:7331:3: ( RULE_ID )
            // InternalCompras.g:7332:4: RULE_ID
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
    // InternalCompras.g:7343:1: rule__Relations__RelationsType5Assignment_14 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType5Assignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7347:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:7348:2: ( ruleRelationsType )
            {
            // InternalCompras.g:7348:2: ( ruleRelationsType )
            // InternalCompras.g:7349:3: ruleRelationsType
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
    // InternalCompras.g:7358:1: rule__Relations__TargetLayer5Assignment_15 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer5Assignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7362:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7363:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7363:2: ( ( RULE_ID ) )
            // InternalCompras.g:7364:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer5CommonLayerCrossReference_15_0()); 
            // InternalCompras.g:7365:3: ( RULE_ID )
            // InternalCompras.g:7366:4: RULE_ID
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
    // InternalCompras.g:7377:1: rule__Technology__ModuleTechAssignment_1_3 : ( ruleModuleTech ) ;
    public final void rule__Technology__ModuleTechAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7381:1: ( ( ruleModuleTech ) )
            // InternalCompras.g:7382:2: ( ruleModuleTech )
            {
            // InternalCompras.g:7382:2: ( ruleModuleTech )
            // InternalCompras.g:7383:3: ruleModuleTech
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
    // InternalCompras.g:7392:1: rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 : ( ( ruleFQN ) ) ;
    public final void rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7396:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7397:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7397:2: ( ( ruleFQN ) )
            // InternalCompras.g:7398:3: ( ruleFQN )
            {
             before(grammarAccess.getTechnologyAccess().getDbConnectorSegmentLayerDbConnectorSegmentLayerCrossReference_2_3_0_0()); 
            // InternalCompras.g:7399:3: ( ruleFQN )
            // InternalCompras.g:7400:4: ruleFQN
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
    // InternalCompras.g:7411:1: rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 : ( ruleDatabaseRDBMSType ) ;
    public final void rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7415:1: ( ( ruleDatabaseRDBMSType ) )
            // InternalCompras.g:7416:2: ( ruleDatabaseRDBMSType )
            {
            // InternalCompras.g:7416:2: ( ruleDatabaseRDBMSType )
            // InternalCompras.g:7417:3: ruleDatabaseRDBMSType
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
    // InternalCompras.g:7426:1: rule__Technology__ConnectionStringAssignment_2_3_4_2 : ( ruleConnectionString ) ;
    public final void rule__Technology__ConnectionStringAssignment_2_3_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7430:1: ( ( ruleConnectionString ) )
            // InternalCompras.g:7431:2: ( ruleConnectionString )
            {
            // InternalCompras.g:7431:2: ( ruleConnectionString )
            // InternalCompras.g:7432:3: ruleConnectionString
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
    // InternalCompras.g:7441:1: rule__ModuleTech__NameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7445:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7446:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7446:2: ( ( RULE_ID ) )
            // InternalCompras.g:7447:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getNameModuleCrossReference_2_0()); 
            // InternalCompras.g:7448:3: ( RULE_ID )
            // InternalCompras.g:7449:4: RULE_ID
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
    // InternalCompras.g:7460:1: rule__ModuleTech__PresentationLayerAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__PresentationLayerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7464:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7465:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7465:2: ( ( RULE_ID ) )
            // InternalCompras.g:7466:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getPresentationLayerPresentationLayerCrossReference_5_0()); 
            // InternalCompras.g:7467:3: ( RULE_ID )
            // InternalCompras.g:7468:4: RULE_ID
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
    // InternalCompras.g:7479:1: rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 : ( ( ruleFQN ) ) ;
    public final void rule__ModuleTech__ControllerSegmentLayerAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7483:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7484:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7484:2: ( ( ruleFQN ) )
            // InternalCompras.g:7485:3: ( ruleFQN )
            {
             before(grammarAccess.getModuleTechAccess().getControllerSegmentLayerControllerSegmentLayerCrossReference_8_0_0()); 
            // InternalCompras.g:7486:3: ( ruleFQN )
            // InternalCompras.g:7487:4: ruleFQN
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
    // InternalCompras.g:7498:1: rule__ModuleTech__ControllersRefAssignment_8_3 : ( ruleControllersRef ) ;
    public final void rule__ModuleTech__ControllersRefAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7502:1: ( ( ruleControllersRef ) )
            // InternalCompras.g:7503:2: ( ruleControllersRef )
            {
            // InternalCompras.g:7503:2: ( ruleControllersRef )
            // InternalCompras.g:7504:3: ruleControllersRef
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
    // InternalCompras.g:7513:1: rule__ModuleTech__ViewSegmentLayerAssignment_9_0 : ( ( ruleFQN ) ) ;
    public final void rule__ModuleTech__ViewSegmentLayerAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7517:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7518:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7518:2: ( ( ruleFQN ) )
            // InternalCompras.g:7519:3: ( ruleFQN )
            {
             before(grammarAccess.getModuleTechAccess().getViewSegmentLayerViewSegmentLayerCrossReference_9_0_0()); 
            // InternalCompras.g:7520:3: ( ruleFQN )
            // InternalCompras.g:7521:4: ruleFQN
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
    // InternalCompras.g:7532:1: rule__ModuleTech__ViewsRefAssignment_9_3 : ( ruleViewsRef ) ;
    public final void rule__ModuleTech__ViewsRefAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7536:1: ( ( ruleViewsRef ) )
            // InternalCompras.g:7537:2: ( ruleViewsRef )
            {
            // InternalCompras.g:7537:2: ( ruleViewsRef )
            // InternalCompras.g:7538:3: ruleViewsRef
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
    // InternalCompras.g:7547:1: rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 : ( ( ruleFQN ) ) ;
    public final void rule__ModuleTech__ScriptSegmentLayerAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7551:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7552:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7552:2: ( ( ruleFQN ) )
            // InternalCompras.g:7553:3: ( ruleFQN )
            {
             before(grammarAccess.getModuleTechAccess().getScriptSegmentLayerScriptSegmentLayerCrossReference_10_0_0()); 
            // InternalCompras.g:7554:3: ( ruleFQN )
            // InternalCompras.g:7555:4: ruleFQN
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
    // InternalCompras.g:7566:1: rule__ModuleTech__ScriptRefAssignment_10_3 : ( ruleScriptRef ) ;
    public final void rule__ModuleTech__ScriptRefAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7570:1: ( ( ruleScriptRef ) )
            // InternalCompras.g:7571:2: ( ruleScriptRef )
            {
            // InternalCompras.g:7571:2: ( ruleScriptRef )
            // InternalCompras.g:7572:3: ruleScriptRef
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
    // InternalCompras.g:7581:1: rule__ModuleTech__BusinessLayerAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__BusinessLayerAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7585:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7586:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7586:2: ( ( RULE_ID ) )
            // InternalCompras.g:7587:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getBusinessLayerBusinessLayerCrossReference_12_0()); 
            // InternalCompras.g:7588:3: ( RULE_ID )
            // InternalCompras.g:7589:4: RULE_ID
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
    // InternalCompras.g:7600:1: rule__ModuleTech__BusinessLayerRefAssignment_15 : ( ruleBusinessLayerRef ) ;
    public final void rule__ModuleTech__BusinessLayerRefAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7604:1: ( ( ruleBusinessLayerRef ) )
            // InternalCompras.g:7605:2: ( ruleBusinessLayerRef )
            {
            // InternalCompras.g:7605:2: ( ruleBusinessLayerRef )
            // InternalCompras.g:7606:3: ruleBusinessLayerRef
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
    // InternalCompras.g:7615:1: rule__ModuleTech__DataAccessLayerAssignment_17 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__DataAccessLayerAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7619:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7620:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7620:2: ( ( RULE_ID ) )
            // InternalCompras.g:7621:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getDataAccessLayerDataAccessLayerCrossReference_17_0()); 
            // InternalCompras.g:7622:3: ( RULE_ID )
            // InternalCompras.g:7623:4: RULE_ID
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
    // InternalCompras.g:7634:1: rule__ModuleTech__DataAccessLayerRefAssignment_20 : ( ruleDataAccessLayerRef ) ;
    public final void rule__ModuleTech__DataAccessLayerRefAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7638:1: ( ( ruleDataAccessLayerRef ) )
            // InternalCompras.g:7639:2: ( ruleDataAccessLayerRef )
            {
            // InternalCompras.g:7639:2: ( ruleDataAccessLayerRef )
            // InternalCompras.g:7640:3: ruleDataAccessLayerRef
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
    // InternalCompras.g:7649:1: rule__ModuleTech__CommonLayerAssignment_22 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__CommonLayerAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7653:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7654:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7654:2: ( ( RULE_ID ) )
            // InternalCompras.g:7655:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getCommonLayerCommonLayerCrossReference_22_0()); 
            // InternalCompras.g:7656:3: ( RULE_ID )
            // InternalCompras.g:7657:4: RULE_ID
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
    // InternalCompras.g:7668:1: rule__ModuleTech__CommonLayerRefAssignment_25 : ( ruleCommonLayerRef ) ;
    public final void rule__ModuleTech__CommonLayerRefAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7672:1: ( ( ruleCommonLayerRef ) )
            // InternalCompras.g:7673:2: ( ruleCommonLayerRef )
            {
            // InternalCompras.g:7673:2: ( ruleCommonLayerRef )
            // InternalCompras.g:7674:3: ruleCommonLayerRef
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
    // InternalCompras.g:7683:1: rule__ControllersRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ControllersRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7687:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7688:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7688:2: ( ( ruleFQN ) )
            // InternalCompras.g:7689:3: ( ruleFQN )
            {
             before(grammarAccess.getControllersRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:7690:3: ( ruleFQN )
            // InternalCompras.g:7691:4: ruleFQN
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
    // InternalCompras.g:7702:1: rule__ViewsRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ViewsRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7706:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7707:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7707:2: ( ( ruleFQN ) )
            // InternalCompras.g:7708:3: ( ruleFQN )
            {
             before(grammarAccess.getViewsRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:7709:3: ( ruleFQN )
            // InternalCompras.g:7710:4: ruleFQN
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
    // InternalCompras.g:7721:1: rule__ScriptRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ScriptRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7725:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7726:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7726:2: ( ( ruleFQN ) )
            // InternalCompras.g:7727:3: ( ruleFQN )
            {
             before(grammarAccess.getScriptRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:7728:3: ( ruleFQN )
            // InternalCompras.g:7729:4: ruleFQN
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
    // InternalCompras.g:7740:1: rule__BusinessLayerRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__BusinessLayerRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7744:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7745:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7745:2: ( ( ruleFQN ) )
            // InternalCompras.g:7746:3: ( ruleFQN )
            {
             before(grammarAccess.getBusinessLayerRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:7747:3: ( ruleFQN )
            // InternalCompras.g:7748:4: ruleFQN
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
    // InternalCompras.g:7759:1: rule__DataAccessLayerRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__DataAccessLayerRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7763:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7764:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7764:2: ( ( ruleFQN ) )
            // InternalCompras.g:7765:3: ( ruleFQN )
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:7766:3: ( ruleFQN )
            // InternalCompras.g:7767:4: ruleFQN
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
    // InternalCompras.g:7778:1: rule__CommonLayerRef__EntityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__CommonLayerRef__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7782:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7783:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7783:2: ( ( ruleFQN ) )
            // InternalCompras.g:7784:3: ( ruleFQN )
            {
             before(grammarAccess.getCommonLayerRefAccess().getEntityEntityCrossReference_2_0()); 
            // InternalCompras.g:7785:3: ( ruleFQN )
            // InternalCompras.g:7786:4: ruleFQN
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


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\5\1\31\1\uffff\1\5\1\32\1\31\1\36\1\uffff";
    static final String dfa_3s = "\1\36\1\37\1\uffff\1\5\1\32\1\37\1\67\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\4\uffff\1\1";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\30\uffff\1\2",
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

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "5118:2: ( rule__ModuleTech__Group_8__0 )?";
        }
    }
    static final String[] dfa_7s = {
            "\1\1\30\uffff\1\2",
            "\1\4\5\uffff\1\3",
            "",
            "\1\5",
            "\1\6",
            "\1\4\5\uffff\1\3",
            "\1\7\27\uffff\1\7\1\2",
            ""
    };
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

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
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5145:2: ( rule__ModuleTech__Group_9__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000084000F020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000080000F022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000080000F020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000401F0000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000001F0002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0006000040000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0018000040000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000040000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000040000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0400000040000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000040000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0040000040000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0080000040000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000000000002L});

}