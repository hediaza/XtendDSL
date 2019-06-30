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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AllowedToUse'", "'string'", "'int'", "'bool'", "'float'", "'CREATE'", "'VIEW_GRID'", "'VIEW_DROPDOWN'", "'EDIT'", "'DELETE'", "'SQLSERVER'", "'ORACLE (future...)'", "'POSTGRES (future...)'", "'SolutionName'", "':'", "'{'", "'Domain'", "'Architecture'", "'Technology'", "'}'", "'.'", "'Module'", "'Entities'", "'Functionalities'", "'RelEntity'", "'Layers'", "'PresentationLayer'", "'BusinessLayer'", "'DataAccessLayer'", "'CommonLayer'", "'Relations'", "'ControllerSegmentLayer'", "'ViewSegmentLayer'", "'ScriptSegmentLayer'", "'DbConnectorSegmentLayer'", "'AspNet'", "'Database'", "'DatabaseRDBMSType'", "'ConnectionString'", "'Controller'", "'View'", "'Script'", "'BLogic'", "'DataAccess'", "'DtoModel'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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


    // $ANTLR start "entryRuleEntityType"
    // InternalCompras.g:203:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // InternalCompras.g:204:1: ( ruleEntityType EOF )
            // InternalCompras.g:205:1: ruleEntityType EOF
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
    // InternalCompras.g:212:1: ruleEntityType : ( ( rule__EntityType__Alternatives ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:216:2: ( ( ( rule__EntityType__Alternatives ) ) )
            // InternalCompras.g:217:2: ( ( rule__EntityType__Alternatives ) )
            {
            // InternalCompras.g:217:2: ( ( rule__EntityType__Alternatives ) )
            // InternalCompras.g:218:3: ( rule__EntityType__Alternatives )
            {
             before(grammarAccess.getEntityTypeAccess().getAlternatives()); 
            // InternalCompras.g:219:3: ( rule__EntityType__Alternatives )
            // InternalCompras.g:219:4: rule__EntityType__Alternatives
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
    // InternalCompras.g:228:1: entryRuleFunctionality : ruleFunctionality EOF ;
    public final void entryRuleFunctionality() throws RecognitionException {
        try {
            // InternalCompras.g:229:1: ( ruleFunctionality EOF )
            // InternalCompras.g:230:1: ruleFunctionality EOF
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
    // InternalCompras.g:237:1: ruleFunctionality : ( ( rule__Functionality__Group__0 ) ) ;
    public final void ruleFunctionality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:241:2: ( ( ( rule__Functionality__Group__0 ) ) )
            // InternalCompras.g:242:2: ( ( rule__Functionality__Group__0 ) )
            {
            // InternalCompras.g:242:2: ( ( rule__Functionality__Group__0 ) )
            // InternalCompras.g:243:3: ( rule__Functionality__Group__0 )
            {
             before(grammarAccess.getFunctionalityAccess().getGroup()); 
            // InternalCompras.g:244:3: ( rule__Functionality__Group__0 )
            // InternalCompras.g:244:4: rule__Functionality__Group__0
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
    // InternalCompras.g:253:1: entryRuleArchitecture : ruleArchitecture EOF ;
    public final void entryRuleArchitecture() throws RecognitionException {
        try {
            // InternalCompras.g:254:1: ( ruleArchitecture EOF )
            // InternalCompras.g:255:1: ruleArchitecture EOF
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
    // InternalCompras.g:262:1: ruleArchitecture : ( ( rule__Architecture__Group__0 ) ) ;
    public final void ruleArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:266:2: ( ( ( rule__Architecture__Group__0 ) ) )
            // InternalCompras.g:267:2: ( ( rule__Architecture__Group__0 ) )
            {
            // InternalCompras.g:267:2: ( ( rule__Architecture__Group__0 ) )
            // InternalCompras.g:268:3: ( rule__Architecture__Group__0 )
            {
             before(grammarAccess.getArchitectureAccess().getGroup()); 
            // InternalCompras.g:269:3: ( rule__Architecture__Group__0 )
            // InternalCompras.g:269:4: rule__Architecture__Group__0
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
    // InternalCompras.g:278:1: entryRulePresentationLayer : rulePresentationLayer EOF ;
    public final void entryRulePresentationLayer() throws RecognitionException {
        try {
            // InternalCompras.g:279:1: ( rulePresentationLayer EOF )
            // InternalCompras.g:280:1: rulePresentationLayer EOF
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
    // InternalCompras.g:287:1: rulePresentationLayer : ( ( rule__PresentationLayer__Group__0 ) ) ;
    public final void rulePresentationLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:291:2: ( ( ( rule__PresentationLayer__Group__0 ) ) )
            // InternalCompras.g:292:2: ( ( rule__PresentationLayer__Group__0 ) )
            {
            // InternalCompras.g:292:2: ( ( rule__PresentationLayer__Group__0 ) )
            // InternalCompras.g:293:3: ( rule__PresentationLayer__Group__0 )
            {
             before(grammarAccess.getPresentationLayerAccess().getGroup()); 
            // InternalCompras.g:294:3: ( rule__PresentationLayer__Group__0 )
            // InternalCompras.g:294:4: rule__PresentationLayer__Group__0
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
    // InternalCompras.g:303:1: entryRuleControllerSegmentLayer : ruleControllerSegmentLayer EOF ;
    public final void entryRuleControllerSegmentLayer() throws RecognitionException {
        try {
            // InternalCompras.g:304:1: ( ruleControllerSegmentLayer EOF )
            // InternalCompras.g:305:1: ruleControllerSegmentLayer EOF
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
    // InternalCompras.g:312:1: ruleControllerSegmentLayer : ( ( rule__ControllerSegmentLayer__NameAssignment ) ) ;
    public final void ruleControllerSegmentLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:316:2: ( ( ( rule__ControllerSegmentLayer__NameAssignment ) ) )
            // InternalCompras.g:317:2: ( ( rule__ControllerSegmentLayer__NameAssignment ) )
            {
            // InternalCompras.g:317:2: ( ( rule__ControllerSegmentLayer__NameAssignment ) )
            // InternalCompras.g:318:3: ( rule__ControllerSegmentLayer__NameAssignment )
            {
             before(grammarAccess.getControllerSegmentLayerAccess().getNameAssignment()); 
            // InternalCompras.g:319:3: ( rule__ControllerSegmentLayer__NameAssignment )
            // InternalCompras.g:319:4: rule__ControllerSegmentLayer__NameAssignment
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
    // InternalCompras.g:328:1: entryRuleViewSegmentLayer : ruleViewSegmentLayer EOF ;
    public final void entryRuleViewSegmentLayer() throws RecognitionException {
        try {
            // InternalCompras.g:329:1: ( ruleViewSegmentLayer EOF )
            // InternalCompras.g:330:1: ruleViewSegmentLayer EOF
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
    // InternalCompras.g:337:1: ruleViewSegmentLayer : ( ( rule__ViewSegmentLayer__NameAssignment ) ) ;
    public final void ruleViewSegmentLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:341:2: ( ( ( rule__ViewSegmentLayer__NameAssignment ) ) )
            // InternalCompras.g:342:2: ( ( rule__ViewSegmentLayer__NameAssignment ) )
            {
            // InternalCompras.g:342:2: ( ( rule__ViewSegmentLayer__NameAssignment ) )
            // InternalCompras.g:343:3: ( rule__ViewSegmentLayer__NameAssignment )
            {
             before(grammarAccess.getViewSegmentLayerAccess().getNameAssignment()); 
            // InternalCompras.g:344:3: ( rule__ViewSegmentLayer__NameAssignment )
            // InternalCompras.g:344:4: rule__ViewSegmentLayer__NameAssignment
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
    // InternalCompras.g:353:1: entryRuleScriptSegmentLayer : ruleScriptSegmentLayer EOF ;
    public final void entryRuleScriptSegmentLayer() throws RecognitionException {
        try {
            // InternalCompras.g:354:1: ( ruleScriptSegmentLayer EOF )
            // InternalCompras.g:355:1: ruleScriptSegmentLayer EOF
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
    // InternalCompras.g:362:1: ruleScriptSegmentLayer : ( ( rule__ScriptSegmentLayer__NameAssignment ) ) ;
    public final void ruleScriptSegmentLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:366:2: ( ( ( rule__ScriptSegmentLayer__NameAssignment ) ) )
            // InternalCompras.g:367:2: ( ( rule__ScriptSegmentLayer__NameAssignment ) )
            {
            // InternalCompras.g:367:2: ( ( rule__ScriptSegmentLayer__NameAssignment ) )
            // InternalCompras.g:368:3: ( rule__ScriptSegmentLayer__NameAssignment )
            {
             before(grammarAccess.getScriptSegmentLayerAccess().getNameAssignment()); 
            // InternalCompras.g:369:3: ( rule__ScriptSegmentLayer__NameAssignment )
            // InternalCompras.g:369:4: rule__ScriptSegmentLayer__NameAssignment
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
    // InternalCompras.g:378:1: entryRuleBusinessLayer : ruleBusinessLayer EOF ;
    public final void entryRuleBusinessLayer() throws RecognitionException {
        try {
            // InternalCompras.g:379:1: ( ruleBusinessLayer EOF )
            // InternalCompras.g:380:1: ruleBusinessLayer EOF
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
    // InternalCompras.g:387:1: ruleBusinessLayer : ( ( rule__BusinessLayer__NameAssignment ) ) ;
    public final void ruleBusinessLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:391:2: ( ( ( rule__BusinessLayer__NameAssignment ) ) )
            // InternalCompras.g:392:2: ( ( rule__BusinessLayer__NameAssignment ) )
            {
            // InternalCompras.g:392:2: ( ( rule__BusinessLayer__NameAssignment ) )
            // InternalCompras.g:393:3: ( rule__BusinessLayer__NameAssignment )
            {
             before(grammarAccess.getBusinessLayerAccess().getNameAssignment()); 
            // InternalCompras.g:394:3: ( rule__BusinessLayer__NameAssignment )
            // InternalCompras.g:394:4: rule__BusinessLayer__NameAssignment
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
    // InternalCompras.g:403:1: entryRuleDataAccessLayer : ruleDataAccessLayer EOF ;
    public final void entryRuleDataAccessLayer() throws RecognitionException {
        try {
            // InternalCompras.g:404:1: ( ruleDataAccessLayer EOF )
            // InternalCompras.g:405:1: ruleDataAccessLayer EOF
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
    // InternalCompras.g:412:1: ruleDataAccessLayer : ( ( rule__DataAccessLayer__Group__0 ) ) ;
    public final void ruleDataAccessLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:416:2: ( ( ( rule__DataAccessLayer__Group__0 ) ) )
            // InternalCompras.g:417:2: ( ( rule__DataAccessLayer__Group__0 ) )
            {
            // InternalCompras.g:417:2: ( ( rule__DataAccessLayer__Group__0 ) )
            // InternalCompras.g:418:3: ( rule__DataAccessLayer__Group__0 )
            {
             before(grammarAccess.getDataAccessLayerAccess().getGroup()); 
            // InternalCompras.g:419:3: ( rule__DataAccessLayer__Group__0 )
            // InternalCompras.g:419:4: rule__DataAccessLayer__Group__0
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
    // InternalCompras.g:428:1: entryRuleDbConnectorSegmentLayer : ruleDbConnectorSegmentLayer EOF ;
    public final void entryRuleDbConnectorSegmentLayer() throws RecognitionException {
        try {
            // InternalCompras.g:429:1: ( ruleDbConnectorSegmentLayer EOF )
            // InternalCompras.g:430:1: ruleDbConnectorSegmentLayer EOF
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
    // InternalCompras.g:437:1: ruleDbConnectorSegmentLayer : ( ( rule__DbConnectorSegmentLayer__NameAssignment ) ) ;
    public final void ruleDbConnectorSegmentLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:441:2: ( ( ( rule__DbConnectorSegmentLayer__NameAssignment ) ) )
            // InternalCompras.g:442:2: ( ( rule__DbConnectorSegmentLayer__NameAssignment ) )
            {
            // InternalCompras.g:442:2: ( ( rule__DbConnectorSegmentLayer__NameAssignment ) )
            // InternalCompras.g:443:3: ( rule__DbConnectorSegmentLayer__NameAssignment )
            {
             before(grammarAccess.getDbConnectorSegmentLayerAccess().getNameAssignment()); 
            // InternalCompras.g:444:3: ( rule__DbConnectorSegmentLayer__NameAssignment )
            // InternalCompras.g:444:4: rule__DbConnectorSegmentLayer__NameAssignment
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
    // InternalCompras.g:453:1: entryRuleCommonLayer : ruleCommonLayer EOF ;
    public final void entryRuleCommonLayer() throws RecognitionException {
        try {
            // InternalCompras.g:454:1: ( ruleCommonLayer EOF )
            // InternalCompras.g:455:1: ruleCommonLayer EOF
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
    // InternalCompras.g:462:1: ruleCommonLayer : ( ( rule__CommonLayer__NameAssignment ) ) ;
    public final void ruleCommonLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:466:2: ( ( ( rule__CommonLayer__NameAssignment ) ) )
            // InternalCompras.g:467:2: ( ( rule__CommonLayer__NameAssignment ) )
            {
            // InternalCompras.g:467:2: ( ( rule__CommonLayer__NameAssignment ) )
            // InternalCompras.g:468:3: ( rule__CommonLayer__NameAssignment )
            {
             before(grammarAccess.getCommonLayerAccess().getNameAssignment()); 
            // InternalCompras.g:469:3: ( rule__CommonLayer__NameAssignment )
            // InternalCompras.g:469:4: rule__CommonLayer__NameAssignment
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
    // InternalCompras.g:478:1: entryRuleRelations : ruleRelations EOF ;
    public final void entryRuleRelations() throws RecognitionException {
        try {
            // InternalCompras.g:479:1: ( ruleRelations EOF )
            // InternalCompras.g:480:1: ruleRelations EOF
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
    // InternalCompras.g:487:1: ruleRelations : ( ( rule__Relations__Group__0 ) ) ;
    public final void ruleRelations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:491:2: ( ( ( rule__Relations__Group__0 ) ) )
            // InternalCompras.g:492:2: ( ( rule__Relations__Group__0 ) )
            {
            // InternalCompras.g:492:2: ( ( rule__Relations__Group__0 ) )
            // InternalCompras.g:493:3: ( rule__Relations__Group__0 )
            {
             before(grammarAccess.getRelationsAccess().getGroup()); 
            // InternalCompras.g:494:3: ( rule__Relations__Group__0 )
            // InternalCompras.g:494:4: rule__Relations__Group__0
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
    // InternalCompras.g:503:1: entryRuleTechnology : ruleTechnology EOF ;
    public final void entryRuleTechnology() throws RecognitionException {
        try {
            // InternalCompras.g:504:1: ( ruleTechnology EOF )
            // InternalCompras.g:505:1: ruleTechnology EOF
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
    // InternalCompras.g:512:1: ruleTechnology : ( ( rule__Technology__Group__0 ) ) ;
    public final void ruleTechnology() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:516:2: ( ( ( rule__Technology__Group__0 ) ) )
            // InternalCompras.g:517:2: ( ( rule__Technology__Group__0 ) )
            {
            // InternalCompras.g:517:2: ( ( rule__Technology__Group__0 ) )
            // InternalCompras.g:518:3: ( rule__Technology__Group__0 )
            {
             before(grammarAccess.getTechnologyAccess().getGroup()); 
            // InternalCompras.g:519:3: ( rule__Technology__Group__0 )
            // InternalCompras.g:519:4: rule__Technology__Group__0
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
    // InternalCompras.g:528:1: entryRuleModuleTech : ruleModuleTech EOF ;
    public final void entryRuleModuleTech() throws RecognitionException {
        try {
            // InternalCompras.g:529:1: ( ruleModuleTech EOF )
            // InternalCompras.g:530:1: ruleModuleTech EOF
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
    // InternalCompras.g:537:1: ruleModuleTech : ( ( rule__ModuleTech__Group__0 ) ) ;
    public final void ruleModuleTech() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:541:2: ( ( ( rule__ModuleTech__Group__0 ) ) )
            // InternalCompras.g:542:2: ( ( rule__ModuleTech__Group__0 ) )
            {
            // InternalCompras.g:542:2: ( ( rule__ModuleTech__Group__0 ) )
            // InternalCompras.g:543:3: ( rule__ModuleTech__Group__0 )
            {
             before(grammarAccess.getModuleTechAccess().getGroup()); 
            // InternalCompras.g:544:3: ( rule__ModuleTech__Group__0 )
            // InternalCompras.g:544:4: rule__ModuleTech__Group__0
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
    // InternalCompras.g:553:1: entryRuleControllersRef : ruleControllersRef EOF ;
    public final void entryRuleControllersRef() throws RecognitionException {
        try {
            // InternalCompras.g:554:1: ( ruleControllersRef EOF )
            // InternalCompras.g:555:1: ruleControllersRef EOF
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
    // InternalCompras.g:562:1: ruleControllersRef : ( ( rule__ControllersRef__Group__0 ) ) ;
    public final void ruleControllersRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:566:2: ( ( ( rule__ControllersRef__Group__0 ) ) )
            // InternalCompras.g:567:2: ( ( rule__ControllersRef__Group__0 ) )
            {
            // InternalCompras.g:567:2: ( ( rule__ControllersRef__Group__0 ) )
            // InternalCompras.g:568:3: ( rule__ControllersRef__Group__0 )
            {
             before(grammarAccess.getControllersRefAccess().getGroup()); 
            // InternalCompras.g:569:3: ( rule__ControllersRef__Group__0 )
            // InternalCompras.g:569:4: rule__ControllersRef__Group__0
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
    // InternalCompras.g:578:1: entryRuleViewsRef : ruleViewsRef EOF ;
    public final void entryRuleViewsRef() throws RecognitionException {
        try {
            // InternalCompras.g:579:1: ( ruleViewsRef EOF )
            // InternalCompras.g:580:1: ruleViewsRef EOF
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
    // InternalCompras.g:587:1: ruleViewsRef : ( ( rule__ViewsRef__Group__0 ) ) ;
    public final void ruleViewsRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:591:2: ( ( ( rule__ViewsRef__Group__0 ) ) )
            // InternalCompras.g:592:2: ( ( rule__ViewsRef__Group__0 ) )
            {
            // InternalCompras.g:592:2: ( ( rule__ViewsRef__Group__0 ) )
            // InternalCompras.g:593:3: ( rule__ViewsRef__Group__0 )
            {
             before(grammarAccess.getViewsRefAccess().getGroup()); 
            // InternalCompras.g:594:3: ( rule__ViewsRef__Group__0 )
            // InternalCompras.g:594:4: rule__ViewsRef__Group__0
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
    // InternalCompras.g:603:1: entryRuleScriptRef : ruleScriptRef EOF ;
    public final void entryRuleScriptRef() throws RecognitionException {
        try {
            // InternalCompras.g:604:1: ( ruleScriptRef EOF )
            // InternalCompras.g:605:1: ruleScriptRef EOF
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
    // InternalCompras.g:612:1: ruleScriptRef : ( ( rule__ScriptRef__Group__0 ) ) ;
    public final void ruleScriptRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:616:2: ( ( ( rule__ScriptRef__Group__0 ) ) )
            // InternalCompras.g:617:2: ( ( rule__ScriptRef__Group__0 ) )
            {
            // InternalCompras.g:617:2: ( ( rule__ScriptRef__Group__0 ) )
            // InternalCompras.g:618:3: ( rule__ScriptRef__Group__0 )
            {
             before(grammarAccess.getScriptRefAccess().getGroup()); 
            // InternalCompras.g:619:3: ( rule__ScriptRef__Group__0 )
            // InternalCompras.g:619:4: rule__ScriptRef__Group__0
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
    // InternalCompras.g:628:1: entryRuleBusinessLayerRef : ruleBusinessLayerRef EOF ;
    public final void entryRuleBusinessLayerRef() throws RecognitionException {
        try {
            // InternalCompras.g:629:1: ( ruleBusinessLayerRef EOF )
            // InternalCompras.g:630:1: ruleBusinessLayerRef EOF
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
    // InternalCompras.g:637:1: ruleBusinessLayerRef : ( ( rule__BusinessLayerRef__Group__0 ) ) ;
    public final void ruleBusinessLayerRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:641:2: ( ( ( rule__BusinessLayerRef__Group__0 ) ) )
            // InternalCompras.g:642:2: ( ( rule__BusinessLayerRef__Group__0 ) )
            {
            // InternalCompras.g:642:2: ( ( rule__BusinessLayerRef__Group__0 ) )
            // InternalCompras.g:643:3: ( rule__BusinessLayerRef__Group__0 )
            {
             before(grammarAccess.getBusinessLayerRefAccess().getGroup()); 
            // InternalCompras.g:644:3: ( rule__BusinessLayerRef__Group__0 )
            // InternalCompras.g:644:4: rule__BusinessLayerRef__Group__0
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
    // InternalCompras.g:653:1: entryRuleDataAccessLayerRef : ruleDataAccessLayerRef EOF ;
    public final void entryRuleDataAccessLayerRef() throws RecognitionException {
        try {
            // InternalCompras.g:654:1: ( ruleDataAccessLayerRef EOF )
            // InternalCompras.g:655:1: ruleDataAccessLayerRef EOF
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
    // InternalCompras.g:662:1: ruleDataAccessLayerRef : ( ( rule__DataAccessLayerRef__Group__0 ) ) ;
    public final void ruleDataAccessLayerRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:666:2: ( ( ( rule__DataAccessLayerRef__Group__0 ) ) )
            // InternalCompras.g:667:2: ( ( rule__DataAccessLayerRef__Group__0 ) )
            {
            // InternalCompras.g:667:2: ( ( rule__DataAccessLayerRef__Group__0 ) )
            // InternalCompras.g:668:3: ( rule__DataAccessLayerRef__Group__0 )
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getGroup()); 
            // InternalCompras.g:669:3: ( rule__DataAccessLayerRef__Group__0 )
            // InternalCompras.g:669:4: rule__DataAccessLayerRef__Group__0
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
    // InternalCompras.g:678:1: entryRuleCommonLayerRef : ruleCommonLayerRef EOF ;
    public final void entryRuleCommonLayerRef() throws RecognitionException {
        try {
            // InternalCompras.g:679:1: ( ruleCommonLayerRef EOF )
            // InternalCompras.g:680:1: ruleCommonLayerRef EOF
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
    // InternalCompras.g:687:1: ruleCommonLayerRef : ( ( rule__CommonLayerRef__Group__0 ) ) ;
    public final void ruleCommonLayerRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:691:2: ( ( ( rule__CommonLayerRef__Group__0 ) ) )
            // InternalCompras.g:692:2: ( ( rule__CommonLayerRef__Group__0 ) )
            {
            // InternalCompras.g:692:2: ( ( rule__CommonLayerRef__Group__0 ) )
            // InternalCompras.g:693:3: ( rule__CommonLayerRef__Group__0 )
            {
             before(grammarAccess.getCommonLayerRefAccess().getGroup()); 
            // InternalCompras.g:694:3: ( rule__CommonLayerRef__Group__0 )
            // InternalCompras.g:694:4: rule__CommonLayerRef__Group__0
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
    // InternalCompras.g:703:1: entryRuleConnectionString : ruleConnectionString EOF ;
    public final void entryRuleConnectionString() throws RecognitionException {
        try {
            // InternalCompras.g:704:1: ( ruleConnectionString EOF )
            // InternalCompras.g:705:1: ruleConnectionString EOF
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
    // InternalCompras.g:712:1: ruleConnectionString : ( RULE_STRING ) ;
    public final void ruleConnectionString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:716:2: ( ( RULE_STRING ) )
            // InternalCompras.g:717:2: ( RULE_STRING )
            {
            // InternalCompras.g:717:2: ( RULE_STRING )
            // InternalCompras.g:718:3: RULE_STRING
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
    // InternalCompras.g:728:1: ruleCommonFieldType : ( ( rule__CommonFieldType__Alternatives ) ) ;
    public final void ruleCommonFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:732:1: ( ( ( rule__CommonFieldType__Alternatives ) ) )
            // InternalCompras.g:733:2: ( ( rule__CommonFieldType__Alternatives ) )
            {
            // InternalCompras.g:733:2: ( ( rule__CommonFieldType__Alternatives ) )
            // InternalCompras.g:734:3: ( rule__CommonFieldType__Alternatives )
            {
             before(grammarAccess.getCommonFieldTypeAccess().getAlternatives()); 
            // InternalCompras.g:735:3: ( rule__CommonFieldType__Alternatives )
            // InternalCompras.g:735:4: rule__CommonFieldType__Alternatives
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
    // InternalCompras.g:744:1: ruleFunctionalityFieldType : ( ( rule__FunctionalityFieldType__Alternatives ) ) ;
    public final void ruleFunctionalityFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:748:1: ( ( ( rule__FunctionalityFieldType__Alternatives ) ) )
            // InternalCompras.g:749:2: ( ( rule__FunctionalityFieldType__Alternatives ) )
            {
            // InternalCompras.g:749:2: ( ( rule__FunctionalityFieldType__Alternatives ) )
            // InternalCompras.g:750:3: ( rule__FunctionalityFieldType__Alternatives )
            {
             before(grammarAccess.getFunctionalityFieldTypeAccess().getAlternatives()); 
            // InternalCompras.g:751:3: ( rule__FunctionalityFieldType__Alternatives )
            // InternalCompras.g:751:4: rule__FunctionalityFieldType__Alternatives
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
    // InternalCompras.g:760:1: ruleRelationsType : ( ( 'AllowedToUse' ) ) ;
    public final void ruleRelationsType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:764:1: ( ( ( 'AllowedToUse' ) ) )
            // InternalCompras.g:765:2: ( ( 'AllowedToUse' ) )
            {
            // InternalCompras.g:765:2: ( ( 'AllowedToUse' ) )
            // InternalCompras.g:766:3: ( 'AllowedToUse' )
            {
             before(grammarAccess.getRelationsTypeAccess().getALLOWED_TO_USEEnumLiteralDeclaration()); 
            // InternalCompras.g:767:3: ( 'AllowedToUse' )
            // InternalCompras.g:767:4: 'AllowedToUse'
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
    // InternalCompras.g:776:1: ruleDatabaseRDBMSType : ( ( rule__DatabaseRDBMSType__Alternatives ) ) ;
    public final void ruleDatabaseRDBMSType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:780:1: ( ( ( rule__DatabaseRDBMSType__Alternatives ) ) )
            // InternalCompras.g:781:2: ( ( rule__DatabaseRDBMSType__Alternatives ) )
            {
            // InternalCompras.g:781:2: ( ( rule__DatabaseRDBMSType__Alternatives ) )
            // InternalCompras.g:782:3: ( rule__DatabaseRDBMSType__Alternatives )
            {
             before(grammarAccess.getDatabaseRDBMSTypeAccess().getAlternatives()); 
            // InternalCompras.g:783:3: ( rule__DatabaseRDBMSType__Alternatives )
            // InternalCompras.g:783:4: rule__DatabaseRDBMSType__Alternatives
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
    // InternalCompras.g:791:1: rule__EntityType__Alternatives : ( ( ( rule__EntityType__EntityAssignment_0 ) ) | ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) ) );
    public final void rule__EntityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:795:1: ( ( ( rule__EntityType__EntityAssignment_0 ) ) | ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) ) )
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
                    // InternalCompras.g:796:2: ( ( rule__EntityType__EntityAssignment_0 ) )
                    {
                    // InternalCompras.g:796:2: ( ( rule__EntityType__EntityAssignment_0 ) )
                    // InternalCompras.g:797:3: ( rule__EntityType__EntityAssignment_0 )
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityAssignment_0()); 
                    // InternalCompras.g:798:3: ( rule__EntityType__EntityAssignment_0 )
                    // InternalCompras.g:798:4: rule__EntityType__EntityAssignment_0
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
                    // InternalCompras.g:802:2: ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) )
                    {
                    // InternalCompras.g:802:2: ( ( rule__EntityType__CommonFieldTypeAssignment_1 ) )
                    // InternalCompras.g:803:3: ( rule__EntityType__CommonFieldTypeAssignment_1 )
                    {
                     before(grammarAccess.getEntityTypeAccess().getCommonFieldTypeAssignment_1()); 
                    // InternalCompras.g:804:3: ( rule__EntityType__CommonFieldTypeAssignment_1 )
                    // InternalCompras.g:804:4: rule__EntityType__CommonFieldTypeAssignment_1
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
    // InternalCompras.g:812:1: rule__CommonFieldType__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'bool' ) ) | ( ( 'float' ) ) );
    public final void rule__CommonFieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:816:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'bool' ) ) | ( ( 'float' ) ) )
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
                    // InternalCompras.g:817:2: ( ( 'string' ) )
                    {
                    // InternalCompras.g:817:2: ( ( 'string' ) )
                    // InternalCompras.g:818:3: ( 'string' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalCompras.g:819:3: ( 'string' )
                    // InternalCompras.g:819:4: 'string'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:823:2: ( ( 'int' ) )
                    {
                    // InternalCompras.g:823:2: ( ( 'int' ) )
                    // InternalCompras.g:824:3: ( 'int' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalCompras.g:825:3: ( 'int' )
                    // InternalCompras.g:825:4: 'int'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:829:2: ( ( 'bool' ) )
                    {
                    // InternalCompras.g:829:2: ( ( 'bool' ) )
                    // InternalCompras.g:830:3: ( 'bool' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getBOOLEnumLiteralDeclaration_2()); 
                    // InternalCompras.g:831:3: ( 'bool' )
                    // InternalCompras.g:831:4: 'bool'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommonFieldTypeAccess().getBOOLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCompras.g:835:2: ( ( 'float' ) )
                    {
                    // InternalCompras.g:835:2: ( ( 'float' ) )
                    // InternalCompras.g:836:3: ( 'float' )
                    {
                     before(grammarAccess.getCommonFieldTypeAccess().getFLOATEnumLiteralDeclaration_3()); 
                    // InternalCompras.g:837:3: ( 'float' )
                    // InternalCompras.g:837:4: 'float'
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
    // InternalCompras.g:845:1: rule__FunctionalityFieldType__Alternatives : ( ( ( 'CREATE' ) ) | ( ( 'VIEW_GRID' ) ) | ( ( 'VIEW_DROPDOWN' ) ) | ( ( 'EDIT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__FunctionalityFieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:849:1: ( ( ( 'CREATE' ) ) | ( ( 'VIEW_GRID' ) ) | ( ( 'VIEW_DROPDOWN' ) ) | ( ( 'EDIT' ) ) | ( ( 'DELETE' ) ) )
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
                    // InternalCompras.g:850:2: ( ( 'CREATE' ) )
                    {
                    // InternalCompras.g:850:2: ( ( 'CREATE' ) )
                    // InternalCompras.g:851:3: ( 'CREATE' )
                    {
                     before(grammarAccess.getFunctionalityFieldTypeAccess().getCREATEEnumLiteralDeclaration_0()); 
                    // InternalCompras.g:852:3: ( 'CREATE' )
                    // InternalCompras.g:852:4: 'CREATE'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionalityFieldTypeAccess().getCREATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:856:2: ( ( 'VIEW_GRID' ) )
                    {
                    // InternalCompras.g:856:2: ( ( 'VIEW_GRID' ) )
                    // InternalCompras.g:857:3: ( 'VIEW_GRID' )
                    {
                     before(grammarAccess.getFunctionalityFieldTypeAccess().getVIEW_GRIDEnumLiteralDeclaration_1()); 
                    // InternalCompras.g:858:3: ( 'VIEW_GRID' )
                    // InternalCompras.g:858:4: 'VIEW_GRID'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionalityFieldTypeAccess().getVIEW_GRIDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:862:2: ( ( 'VIEW_DROPDOWN' ) )
                    {
                    // InternalCompras.g:862:2: ( ( 'VIEW_DROPDOWN' ) )
                    // InternalCompras.g:863:3: ( 'VIEW_DROPDOWN' )
                    {
                     before(grammarAccess.getFunctionalityFieldTypeAccess().getVIEW_DROPDOWNEnumLiteralDeclaration_2()); 
                    // InternalCompras.g:864:3: ( 'VIEW_DROPDOWN' )
                    // InternalCompras.g:864:4: 'VIEW_DROPDOWN'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionalityFieldTypeAccess().getVIEW_DROPDOWNEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCompras.g:868:2: ( ( 'EDIT' ) )
                    {
                    // InternalCompras.g:868:2: ( ( 'EDIT' ) )
                    // InternalCompras.g:869:3: ( 'EDIT' )
                    {
                     before(grammarAccess.getFunctionalityFieldTypeAccess().getEDITEnumLiteralDeclaration_3()); 
                    // InternalCompras.g:870:3: ( 'EDIT' )
                    // InternalCompras.g:870:4: 'EDIT'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getFunctionalityFieldTypeAccess().getEDITEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCompras.g:874:2: ( ( 'DELETE' ) )
                    {
                    // InternalCompras.g:874:2: ( ( 'DELETE' ) )
                    // InternalCompras.g:875:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getFunctionalityFieldTypeAccess().getDELETEEnumLiteralDeclaration_4()); 
                    // InternalCompras.g:876:3: ( 'DELETE' )
                    // InternalCompras.g:876:4: 'DELETE'
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
    // InternalCompras.g:884:1: rule__DatabaseRDBMSType__Alternatives : ( ( ( 'SQLSERVER' ) ) | ( ( 'ORACLE (future...)' ) ) | ( ( 'POSTGRES (future...)' ) ) );
    public final void rule__DatabaseRDBMSType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:888:1: ( ( ( 'SQLSERVER' ) ) | ( ( 'ORACLE (future...)' ) ) | ( ( 'POSTGRES (future...)' ) ) )
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
                    // InternalCompras.g:889:2: ( ( 'SQLSERVER' ) )
                    {
                    // InternalCompras.g:889:2: ( ( 'SQLSERVER' ) )
                    // InternalCompras.g:890:3: ( 'SQLSERVER' )
                    {
                     before(grammarAccess.getDatabaseRDBMSTypeAccess().getSQLSERVEREnumLiteralDeclaration_0()); 
                    // InternalCompras.g:891:3: ( 'SQLSERVER' )
                    // InternalCompras.g:891:4: 'SQLSERVER'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseRDBMSTypeAccess().getSQLSERVEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:895:2: ( ( 'ORACLE (future...)' ) )
                    {
                    // InternalCompras.g:895:2: ( ( 'ORACLE (future...)' ) )
                    // InternalCompras.g:896:3: ( 'ORACLE (future...)' )
                    {
                     before(grammarAccess.getDatabaseRDBMSTypeAccess().getORACLEEnumLiteralDeclaration_1()); 
                    // InternalCompras.g:897:3: ( 'ORACLE (future...)' )
                    // InternalCompras.g:897:4: 'ORACLE (future...)'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseRDBMSTypeAccess().getORACLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:901:2: ( ( 'POSTGRES (future...)' ) )
                    {
                    // InternalCompras.g:901:2: ( ( 'POSTGRES (future...)' ) )
                    // InternalCompras.g:902:3: ( 'POSTGRES (future...)' )
                    {
                     before(grammarAccess.getDatabaseRDBMSTypeAccess().getPOSTGRESEnumLiteralDeclaration_2()); 
                    // InternalCompras.g:903:3: ( 'POSTGRES (future...)' )
                    // InternalCompras.g:903:4: 'POSTGRES (future...)'
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
    // InternalCompras.g:911:1: rule__Solution__Group__0 : rule__Solution__Group__0__Impl rule__Solution__Group__1 ;
    public final void rule__Solution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:915:1: ( rule__Solution__Group__0__Impl rule__Solution__Group__1 )
            // InternalCompras.g:916:2: rule__Solution__Group__0__Impl rule__Solution__Group__1
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
    // InternalCompras.g:923:1: rule__Solution__Group__0__Impl : ( 'SolutionName' ) ;
    public final void rule__Solution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:927:1: ( ( 'SolutionName' ) )
            // InternalCompras.g:928:1: ( 'SolutionName' )
            {
            // InternalCompras.g:928:1: ( 'SolutionName' )
            // InternalCompras.g:929:2: 'SolutionName'
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
    // InternalCompras.g:938:1: rule__Solution__Group__1 : rule__Solution__Group__1__Impl rule__Solution__Group__2 ;
    public final void rule__Solution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:942:1: ( rule__Solution__Group__1__Impl rule__Solution__Group__2 )
            // InternalCompras.g:943:2: rule__Solution__Group__1__Impl rule__Solution__Group__2
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
    // InternalCompras.g:950:1: rule__Solution__Group__1__Impl : ( ':' ) ;
    public final void rule__Solution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:954:1: ( ( ':' ) )
            // InternalCompras.g:955:1: ( ':' )
            {
            // InternalCompras.g:955:1: ( ':' )
            // InternalCompras.g:956:2: ':'
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
    // InternalCompras.g:965:1: rule__Solution__Group__2 : rule__Solution__Group__2__Impl rule__Solution__Group__3 ;
    public final void rule__Solution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:969:1: ( rule__Solution__Group__2__Impl rule__Solution__Group__3 )
            // InternalCompras.g:970:2: rule__Solution__Group__2__Impl rule__Solution__Group__3
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
    // InternalCompras.g:977:1: rule__Solution__Group__2__Impl : ( ( rule__Solution__NameAssignment_2 ) ) ;
    public final void rule__Solution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:981:1: ( ( ( rule__Solution__NameAssignment_2 ) ) )
            // InternalCompras.g:982:1: ( ( rule__Solution__NameAssignment_2 ) )
            {
            // InternalCompras.g:982:1: ( ( rule__Solution__NameAssignment_2 ) )
            // InternalCompras.g:983:2: ( rule__Solution__NameAssignment_2 )
            {
             before(grammarAccess.getSolutionAccess().getNameAssignment_2()); 
            // InternalCompras.g:984:2: ( rule__Solution__NameAssignment_2 )
            // InternalCompras.g:984:3: rule__Solution__NameAssignment_2
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
    // InternalCompras.g:992:1: rule__Solution__Group__3 : rule__Solution__Group__3__Impl rule__Solution__Group__4 ;
    public final void rule__Solution__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:996:1: ( rule__Solution__Group__3__Impl rule__Solution__Group__4 )
            // InternalCompras.g:997:2: rule__Solution__Group__3__Impl rule__Solution__Group__4
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
    // InternalCompras.g:1004:1: rule__Solution__Group__3__Impl : ( '{' ) ;
    public final void rule__Solution__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1008:1: ( ( '{' ) )
            // InternalCompras.g:1009:1: ( '{' )
            {
            // InternalCompras.g:1009:1: ( '{' )
            // InternalCompras.g:1010:2: '{'
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
    // InternalCompras.g:1019:1: rule__Solution__Group__4 : rule__Solution__Group__4__Impl rule__Solution__Group__5 ;
    public final void rule__Solution__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1023:1: ( rule__Solution__Group__4__Impl rule__Solution__Group__5 )
            // InternalCompras.g:1024:2: rule__Solution__Group__4__Impl rule__Solution__Group__5
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
    // InternalCompras.g:1031:1: rule__Solution__Group__4__Impl : ( 'Domain' ) ;
    public final void rule__Solution__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1035:1: ( ( 'Domain' ) )
            // InternalCompras.g:1036:1: ( 'Domain' )
            {
            // InternalCompras.g:1036:1: ( 'Domain' )
            // InternalCompras.g:1037:2: 'Domain'
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
    // InternalCompras.g:1046:1: rule__Solution__Group__5 : rule__Solution__Group__5__Impl rule__Solution__Group__6 ;
    public final void rule__Solution__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1050:1: ( rule__Solution__Group__5__Impl rule__Solution__Group__6 )
            // InternalCompras.g:1051:2: rule__Solution__Group__5__Impl rule__Solution__Group__6
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
    // InternalCompras.g:1058:1: rule__Solution__Group__5__Impl : ( ':' ) ;
    public final void rule__Solution__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1062:1: ( ( ':' ) )
            // InternalCompras.g:1063:1: ( ':' )
            {
            // InternalCompras.g:1063:1: ( ':' )
            // InternalCompras.g:1064:2: ':'
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
    // InternalCompras.g:1073:1: rule__Solution__Group__6 : rule__Solution__Group__6__Impl rule__Solution__Group__7 ;
    public final void rule__Solution__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1077:1: ( rule__Solution__Group__6__Impl rule__Solution__Group__7 )
            // InternalCompras.g:1078:2: rule__Solution__Group__6__Impl rule__Solution__Group__7
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
    // InternalCompras.g:1085:1: rule__Solution__Group__6__Impl : ( ( rule__Solution__DomainAssignment_6 )? ) ;
    public final void rule__Solution__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1089:1: ( ( ( rule__Solution__DomainAssignment_6 )? ) )
            // InternalCompras.g:1090:1: ( ( rule__Solution__DomainAssignment_6 )? )
            {
            // InternalCompras.g:1090:1: ( ( rule__Solution__DomainAssignment_6 )? )
            // InternalCompras.g:1091:2: ( rule__Solution__DomainAssignment_6 )?
            {
             before(grammarAccess.getSolutionAccess().getDomainAssignment_6()); 
            // InternalCompras.g:1092:2: ( rule__Solution__DomainAssignment_6 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCompras.g:1092:3: rule__Solution__DomainAssignment_6
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
    // InternalCompras.g:1100:1: rule__Solution__Group__7 : rule__Solution__Group__7__Impl rule__Solution__Group__8 ;
    public final void rule__Solution__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1104:1: ( rule__Solution__Group__7__Impl rule__Solution__Group__8 )
            // InternalCompras.g:1105:2: rule__Solution__Group__7__Impl rule__Solution__Group__8
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
    // InternalCompras.g:1112:1: rule__Solution__Group__7__Impl : ( 'Architecture' ) ;
    public final void rule__Solution__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1116:1: ( ( 'Architecture' ) )
            // InternalCompras.g:1117:1: ( 'Architecture' )
            {
            // InternalCompras.g:1117:1: ( 'Architecture' )
            // InternalCompras.g:1118:2: 'Architecture'
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
    // InternalCompras.g:1127:1: rule__Solution__Group__8 : rule__Solution__Group__8__Impl rule__Solution__Group__9 ;
    public final void rule__Solution__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1131:1: ( rule__Solution__Group__8__Impl rule__Solution__Group__9 )
            // InternalCompras.g:1132:2: rule__Solution__Group__8__Impl rule__Solution__Group__9
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
    // InternalCompras.g:1139:1: rule__Solution__Group__8__Impl : ( ':' ) ;
    public final void rule__Solution__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1143:1: ( ( ':' ) )
            // InternalCompras.g:1144:1: ( ':' )
            {
            // InternalCompras.g:1144:1: ( ':' )
            // InternalCompras.g:1145:2: ':'
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
    // InternalCompras.g:1154:1: rule__Solution__Group__9 : rule__Solution__Group__9__Impl rule__Solution__Group__10 ;
    public final void rule__Solution__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1158:1: ( rule__Solution__Group__9__Impl rule__Solution__Group__10 )
            // InternalCompras.g:1159:2: rule__Solution__Group__9__Impl rule__Solution__Group__10
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
    // InternalCompras.g:1166:1: rule__Solution__Group__9__Impl : ( ( rule__Solution__ArchitectureAssignment_9 )? ) ;
    public final void rule__Solution__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1170:1: ( ( ( rule__Solution__ArchitectureAssignment_9 )? ) )
            // InternalCompras.g:1171:1: ( ( rule__Solution__ArchitectureAssignment_9 )? )
            {
            // InternalCompras.g:1171:1: ( ( rule__Solution__ArchitectureAssignment_9 )? )
            // InternalCompras.g:1172:2: ( rule__Solution__ArchitectureAssignment_9 )?
            {
             before(grammarAccess.getSolutionAccess().getArchitectureAssignment_9()); 
            // InternalCompras.g:1173:2: ( rule__Solution__ArchitectureAssignment_9 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCompras.g:1173:3: rule__Solution__ArchitectureAssignment_9
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
    // InternalCompras.g:1181:1: rule__Solution__Group__10 : rule__Solution__Group__10__Impl rule__Solution__Group__11 ;
    public final void rule__Solution__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1185:1: ( rule__Solution__Group__10__Impl rule__Solution__Group__11 )
            // InternalCompras.g:1186:2: rule__Solution__Group__10__Impl rule__Solution__Group__11
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
    // InternalCompras.g:1193:1: rule__Solution__Group__10__Impl : ( 'Technology' ) ;
    public final void rule__Solution__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1197:1: ( ( 'Technology' ) )
            // InternalCompras.g:1198:1: ( 'Technology' )
            {
            // InternalCompras.g:1198:1: ( 'Technology' )
            // InternalCompras.g:1199:2: 'Technology'
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
    // InternalCompras.g:1208:1: rule__Solution__Group__11 : rule__Solution__Group__11__Impl rule__Solution__Group__12 ;
    public final void rule__Solution__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1212:1: ( rule__Solution__Group__11__Impl rule__Solution__Group__12 )
            // InternalCompras.g:1213:2: rule__Solution__Group__11__Impl rule__Solution__Group__12
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
    // InternalCompras.g:1220:1: rule__Solution__Group__11__Impl : ( ':' ) ;
    public final void rule__Solution__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1224:1: ( ( ':' ) )
            // InternalCompras.g:1225:1: ( ':' )
            {
            // InternalCompras.g:1225:1: ( ':' )
            // InternalCompras.g:1226:2: ':'
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
    // InternalCompras.g:1235:1: rule__Solution__Group__12 : rule__Solution__Group__12__Impl rule__Solution__Group__13 ;
    public final void rule__Solution__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1239:1: ( rule__Solution__Group__12__Impl rule__Solution__Group__13 )
            // InternalCompras.g:1240:2: rule__Solution__Group__12__Impl rule__Solution__Group__13
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
    // InternalCompras.g:1247:1: rule__Solution__Group__12__Impl : ( ( rule__Solution__TechnologyAssignment_12 )? ) ;
    public final void rule__Solution__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1251:1: ( ( ( rule__Solution__TechnologyAssignment_12 )? ) )
            // InternalCompras.g:1252:1: ( ( rule__Solution__TechnologyAssignment_12 )? )
            {
            // InternalCompras.g:1252:1: ( ( rule__Solution__TechnologyAssignment_12 )? )
            // InternalCompras.g:1253:2: ( rule__Solution__TechnologyAssignment_12 )?
            {
             before(grammarAccess.getSolutionAccess().getTechnologyAssignment_12()); 
            // InternalCompras.g:1254:2: ( rule__Solution__TechnologyAssignment_12 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCompras.g:1254:3: rule__Solution__TechnologyAssignment_12
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
    // InternalCompras.g:1262:1: rule__Solution__Group__13 : rule__Solution__Group__13__Impl ;
    public final void rule__Solution__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1266:1: ( rule__Solution__Group__13__Impl )
            // InternalCompras.g:1267:2: rule__Solution__Group__13__Impl
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
    // InternalCompras.g:1273:1: rule__Solution__Group__13__Impl : ( '}' ) ;
    public final void rule__Solution__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1277:1: ( ( '}' ) )
            // InternalCompras.g:1278:1: ( '}' )
            {
            // InternalCompras.g:1278:1: ( '}' )
            // InternalCompras.g:1279:2: '}'
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
    // InternalCompras.g:1289:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1293:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCompras.g:1294:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalCompras.g:1301:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1305:1: ( ( RULE_ID ) )
            // InternalCompras.g:1306:1: ( RULE_ID )
            {
            // InternalCompras.g:1306:1: ( RULE_ID )
            // InternalCompras.g:1307:2: RULE_ID
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
    // InternalCompras.g:1316:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1320:1: ( rule__FQN__Group__1__Impl )
            // InternalCompras.g:1321:2: rule__FQN__Group__1__Impl
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
    // InternalCompras.g:1327:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1331:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCompras.g:1332:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCompras.g:1332:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCompras.g:1333:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCompras.g:1334:2: ( rule__FQN__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCompras.g:1334:3: rule__FQN__Group_1__0
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
    // InternalCompras.g:1343:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1347:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCompras.g:1348:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalCompras.g:1355:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1359:1: ( ( '.' ) )
            // InternalCompras.g:1360:1: ( '.' )
            {
            // InternalCompras.g:1360:1: ( '.' )
            // InternalCompras.g:1361:2: '.'
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
    // InternalCompras.g:1370:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1374:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCompras.g:1375:2: rule__FQN__Group_1__1__Impl
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
    // InternalCompras.g:1381:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1385:1: ( ( RULE_ID ) )
            // InternalCompras.g:1386:1: ( RULE_ID )
            {
            // InternalCompras.g:1386:1: ( RULE_ID )
            // InternalCompras.g:1387:2: RULE_ID
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
    // InternalCompras.g:1397:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1401:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalCompras.g:1402:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalCompras.g:1409:1: rule__Domain__Group__0__Impl : ( '{' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1413:1: ( ( '{' ) )
            // InternalCompras.g:1414:1: ( '{' )
            {
            // InternalCompras.g:1414:1: ( '{' )
            // InternalCompras.g:1415:2: '{'
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
    // InternalCompras.g:1424:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1428:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalCompras.g:1429:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
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
    // InternalCompras.g:1436:1: rule__Domain__Group__1__Impl : ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1440:1: ( ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) ) )
            // InternalCompras.g:1441:1: ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) )
            {
            // InternalCompras.g:1441:1: ( ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* ) )
            // InternalCompras.g:1442:2: ( ( rule__Domain__ModuleAssignment_1 ) ) ( ( rule__Domain__ModuleAssignment_1 )* )
            {
            // InternalCompras.g:1442:2: ( ( rule__Domain__ModuleAssignment_1 ) )
            // InternalCompras.g:1443:3: ( rule__Domain__ModuleAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getModuleAssignment_1()); 
            // InternalCompras.g:1444:3: ( rule__Domain__ModuleAssignment_1 )
            // InternalCompras.g:1444:4: rule__Domain__ModuleAssignment_1
            {
            pushFollow(FOLLOW_14);
            rule__Domain__ModuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getModuleAssignment_1()); 

            }

            // InternalCompras.g:1447:2: ( ( rule__Domain__ModuleAssignment_1 )* )
            // InternalCompras.g:1448:3: ( rule__Domain__ModuleAssignment_1 )*
            {
             before(grammarAccess.getDomainAccess().getModuleAssignment_1()); 
            // InternalCompras.g:1449:3: ( rule__Domain__ModuleAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCompras.g:1449:4: rule__Domain__ModuleAssignment_1
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
    // InternalCompras.g:1458:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1462:1: ( rule__Domain__Group__2__Impl )
            // InternalCompras.g:1463:2: rule__Domain__Group__2__Impl
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
    // InternalCompras.g:1469:1: rule__Domain__Group__2__Impl : ( '}' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1473:1: ( ( '}' ) )
            // InternalCompras.g:1474:1: ( '}' )
            {
            // InternalCompras.g:1474:1: ( '}' )
            // InternalCompras.g:1475:2: '}'
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
    // InternalCompras.g:1485:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1489:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalCompras.g:1490:2: rule__Module__Group__0__Impl rule__Module__Group__1
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
    // InternalCompras.g:1497:1: rule__Module__Group__0__Impl : ( 'Module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1501:1: ( ( 'Module' ) )
            // InternalCompras.g:1502:1: ( 'Module' )
            {
            // InternalCompras.g:1502:1: ( 'Module' )
            // InternalCompras.g:1503:2: 'Module'
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
    // InternalCompras.g:1512:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1516:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalCompras.g:1517:2: rule__Module__Group__1__Impl rule__Module__Group__2
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
    // InternalCompras.g:1524:1: rule__Module__Group__1__Impl : ( ':' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1528:1: ( ( ':' ) )
            // InternalCompras.g:1529:1: ( ':' )
            {
            // InternalCompras.g:1529:1: ( ':' )
            // InternalCompras.g:1530:2: ':'
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
    // InternalCompras.g:1539:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1543:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalCompras.g:1544:2: rule__Module__Group__2__Impl rule__Module__Group__3
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
    // InternalCompras.g:1551:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1555:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // InternalCompras.g:1556:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // InternalCompras.g:1556:1: ( ( rule__Module__NameAssignment_2 ) )
            // InternalCompras.g:1557:2: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // InternalCompras.g:1558:2: ( rule__Module__NameAssignment_2 )
            // InternalCompras.g:1558:3: rule__Module__NameAssignment_2
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
    // InternalCompras.g:1566:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1570:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalCompras.g:1571:2: rule__Module__Group__3__Impl rule__Module__Group__4
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
    // InternalCompras.g:1578:1: rule__Module__Group__3__Impl : ( ':' ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1582:1: ( ( ':' ) )
            // InternalCompras.g:1583:1: ( ':' )
            {
            // InternalCompras.g:1583:1: ( ':' )
            // InternalCompras.g:1584:2: ':'
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
    // InternalCompras.g:1593:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1597:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // InternalCompras.g:1598:2: rule__Module__Group__4__Impl rule__Module__Group__5
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
    // InternalCompras.g:1605:1: rule__Module__Group__4__Impl : ( '{' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1609:1: ( ( '{' ) )
            // InternalCompras.g:1610:1: ( '{' )
            {
            // InternalCompras.g:1610:1: ( '{' )
            // InternalCompras.g:1611:2: '{'
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
    // InternalCompras.g:1620:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1624:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // InternalCompras.g:1625:2: rule__Module__Group__5__Impl rule__Module__Group__6
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
    // InternalCompras.g:1632:1: rule__Module__Group__5__Impl : ( 'Entities' ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1636:1: ( ( 'Entities' ) )
            // InternalCompras.g:1637:1: ( 'Entities' )
            {
            // InternalCompras.g:1637:1: ( 'Entities' )
            // InternalCompras.g:1638:2: 'Entities'
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
    // InternalCompras.g:1647:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1651:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // InternalCompras.g:1652:2: rule__Module__Group__6__Impl rule__Module__Group__7
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
    // InternalCompras.g:1659:1: rule__Module__Group__6__Impl : ( ':' ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1663:1: ( ( ':' ) )
            // InternalCompras.g:1664:1: ( ':' )
            {
            // InternalCompras.g:1664:1: ( ':' )
            // InternalCompras.g:1665:2: ':'
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
    // InternalCompras.g:1674:1: rule__Module__Group__7 : rule__Module__Group__7__Impl rule__Module__Group__8 ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1678:1: ( rule__Module__Group__7__Impl rule__Module__Group__8 )
            // InternalCompras.g:1679:2: rule__Module__Group__7__Impl rule__Module__Group__8
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
    // InternalCompras.g:1686:1: rule__Module__Group__7__Impl : ( '{' ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1690:1: ( ( '{' ) )
            // InternalCompras.g:1691:1: ( '{' )
            {
            // InternalCompras.g:1691:1: ( '{' )
            // InternalCompras.g:1692:2: '{'
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
    // InternalCompras.g:1701:1: rule__Module__Group__8 : rule__Module__Group__8__Impl rule__Module__Group__9 ;
    public final void rule__Module__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1705:1: ( rule__Module__Group__8__Impl rule__Module__Group__9 )
            // InternalCompras.g:1706:2: rule__Module__Group__8__Impl rule__Module__Group__9
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
    // InternalCompras.g:1713:1: rule__Module__Group__8__Impl : ( ( rule__Module__EntityAssignment_8 )* ) ;
    public final void rule__Module__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1717:1: ( ( ( rule__Module__EntityAssignment_8 )* ) )
            // InternalCompras.g:1718:1: ( ( rule__Module__EntityAssignment_8 )* )
            {
            // InternalCompras.g:1718:1: ( ( rule__Module__EntityAssignment_8 )* )
            // InternalCompras.g:1719:2: ( rule__Module__EntityAssignment_8 )*
            {
             before(grammarAccess.getModuleAccess().getEntityAssignment_8()); 
            // InternalCompras.g:1720:2: ( rule__Module__EntityAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCompras.g:1720:3: rule__Module__EntityAssignment_8
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
    // InternalCompras.g:1728:1: rule__Module__Group__9 : rule__Module__Group__9__Impl rule__Module__Group__10 ;
    public final void rule__Module__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1732:1: ( rule__Module__Group__9__Impl rule__Module__Group__10 )
            // InternalCompras.g:1733:2: rule__Module__Group__9__Impl rule__Module__Group__10
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
    // InternalCompras.g:1740:1: rule__Module__Group__9__Impl : ( '}' ) ;
    public final void rule__Module__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1744:1: ( ( '}' ) )
            // InternalCompras.g:1745:1: ( '}' )
            {
            // InternalCompras.g:1745:1: ( '}' )
            // InternalCompras.g:1746:2: '}'
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
    // InternalCompras.g:1755:1: rule__Module__Group__10 : rule__Module__Group__10__Impl rule__Module__Group__11 ;
    public final void rule__Module__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1759:1: ( rule__Module__Group__10__Impl rule__Module__Group__11 )
            // InternalCompras.g:1760:2: rule__Module__Group__10__Impl rule__Module__Group__11
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
    // InternalCompras.g:1767:1: rule__Module__Group__10__Impl : ( 'Functionalities' ) ;
    public final void rule__Module__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1771:1: ( ( 'Functionalities' ) )
            // InternalCompras.g:1772:1: ( 'Functionalities' )
            {
            // InternalCompras.g:1772:1: ( 'Functionalities' )
            // InternalCompras.g:1773:2: 'Functionalities'
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
    // InternalCompras.g:1782:1: rule__Module__Group__11 : rule__Module__Group__11__Impl rule__Module__Group__12 ;
    public final void rule__Module__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1786:1: ( rule__Module__Group__11__Impl rule__Module__Group__12 )
            // InternalCompras.g:1787:2: rule__Module__Group__11__Impl rule__Module__Group__12
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
    // InternalCompras.g:1794:1: rule__Module__Group__11__Impl : ( ':' ) ;
    public final void rule__Module__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1798:1: ( ( ':' ) )
            // InternalCompras.g:1799:1: ( ':' )
            {
            // InternalCompras.g:1799:1: ( ':' )
            // InternalCompras.g:1800:2: ':'
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
    // InternalCompras.g:1809:1: rule__Module__Group__12 : rule__Module__Group__12__Impl rule__Module__Group__13 ;
    public final void rule__Module__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1813:1: ( rule__Module__Group__12__Impl rule__Module__Group__13 )
            // InternalCompras.g:1814:2: rule__Module__Group__12__Impl rule__Module__Group__13
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
    // InternalCompras.g:1821:1: rule__Module__Group__12__Impl : ( '{' ) ;
    public final void rule__Module__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1825:1: ( ( '{' ) )
            // InternalCompras.g:1826:1: ( '{' )
            {
            // InternalCompras.g:1826:1: ( '{' )
            // InternalCompras.g:1827:2: '{'
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
    // InternalCompras.g:1836:1: rule__Module__Group__13 : rule__Module__Group__13__Impl rule__Module__Group__14 ;
    public final void rule__Module__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1840:1: ( rule__Module__Group__13__Impl rule__Module__Group__14 )
            // InternalCompras.g:1841:2: rule__Module__Group__13__Impl rule__Module__Group__14
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
    // InternalCompras.g:1848:1: rule__Module__Group__13__Impl : ( ( rule__Module__FunctionalityAssignment_13 )* ) ;
    public final void rule__Module__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1852:1: ( ( ( rule__Module__FunctionalityAssignment_13 )* ) )
            // InternalCompras.g:1853:1: ( ( rule__Module__FunctionalityAssignment_13 )* )
            {
            // InternalCompras.g:1853:1: ( ( rule__Module__FunctionalityAssignment_13 )* )
            // InternalCompras.g:1854:2: ( rule__Module__FunctionalityAssignment_13 )*
            {
             before(grammarAccess.getModuleAccess().getFunctionalityAssignment_13()); 
            // InternalCompras.g:1855:2: ( rule__Module__FunctionalityAssignment_13 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCompras.g:1855:3: rule__Module__FunctionalityAssignment_13
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
    // InternalCompras.g:1863:1: rule__Module__Group__14 : rule__Module__Group__14__Impl rule__Module__Group__15 ;
    public final void rule__Module__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1867:1: ( rule__Module__Group__14__Impl rule__Module__Group__15 )
            // InternalCompras.g:1868:2: rule__Module__Group__14__Impl rule__Module__Group__15
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
    // InternalCompras.g:1875:1: rule__Module__Group__14__Impl : ( '}' ) ;
    public final void rule__Module__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1879:1: ( ( '}' ) )
            // InternalCompras.g:1880:1: ( '}' )
            {
            // InternalCompras.g:1880:1: ( '}' )
            // InternalCompras.g:1881:2: '}'
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
    // InternalCompras.g:1890:1: rule__Module__Group__15 : rule__Module__Group__15__Impl ;
    public final void rule__Module__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1894:1: ( rule__Module__Group__15__Impl )
            // InternalCompras.g:1895:2: rule__Module__Group__15__Impl
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
    // InternalCompras.g:1901:1: rule__Module__Group__15__Impl : ( '}' ) ;
    public final void rule__Module__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1905:1: ( ( '}' ) )
            // InternalCompras.g:1906:1: ( '}' )
            {
            // InternalCompras.g:1906:1: ( '}' )
            // InternalCompras.g:1907:2: '}'
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
    // InternalCompras.g:1917:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1921:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalCompras.g:1922:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalCompras.g:1929:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1933:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // InternalCompras.g:1934:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // InternalCompras.g:1934:1: ( ( rule__Entity__NameAssignment_0 ) )
            // InternalCompras.g:1935:2: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // InternalCompras.g:1936:2: ( rule__Entity__NameAssignment_0 )
            // InternalCompras.g:1936:3: rule__Entity__NameAssignment_0
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
    // InternalCompras.g:1944:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1948:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalCompras.g:1949:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalCompras.g:1956:1: rule__Entity__Group__1__Impl : ( ':' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1960:1: ( ( ':' ) )
            // InternalCompras.g:1961:1: ( ':' )
            {
            // InternalCompras.g:1961:1: ( ':' )
            // InternalCompras.g:1962:2: ':'
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
    // InternalCompras.g:1971:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1975:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalCompras.g:1976:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalCompras.g:1983:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:1987:1: ( ( '{' ) )
            // InternalCompras.g:1988:1: ( '{' )
            {
            // InternalCompras.g:1988:1: ( '{' )
            // InternalCompras.g:1989:2: '{'
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
    // InternalCompras.g:1998:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2002:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalCompras.g:2003:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalCompras.g:2010:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__EntityFieldAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2014:1: ( ( ( rule__Entity__EntityFieldAssignment_3 )* ) )
            // InternalCompras.g:2015:1: ( ( rule__Entity__EntityFieldAssignment_3 )* )
            {
            // InternalCompras.g:2015:1: ( ( rule__Entity__EntityFieldAssignment_3 )* )
            // InternalCompras.g:2016:2: ( rule__Entity__EntityFieldAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getEntityFieldAssignment_3()); 
            // InternalCompras.g:2017:2: ( rule__Entity__EntityFieldAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=12 && LA12_0<=15)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCompras.g:2017:3: rule__Entity__EntityFieldAssignment_3
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
    // InternalCompras.g:2025:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2029:1: ( rule__Entity__Group__4__Impl )
            // InternalCompras.g:2030:2: rule__Entity__Group__4__Impl
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
    // InternalCompras.g:2036:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2040:1: ( ( '}' ) )
            // InternalCompras.g:2041:1: ( '}' )
            {
            // InternalCompras.g:2041:1: ( '}' )
            // InternalCompras.g:2042:2: '}'
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
    // InternalCompras.g:2052:1: rule__EntityField__Group__0 : rule__EntityField__Group__0__Impl rule__EntityField__Group__1 ;
    public final void rule__EntityField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2056:1: ( rule__EntityField__Group__0__Impl rule__EntityField__Group__1 )
            // InternalCompras.g:2057:2: rule__EntityField__Group__0__Impl rule__EntityField__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalCompras.g:2064:1: rule__EntityField__Group__0__Impl : ( ( rule__EntityField__EntityTypeAssignment_0 ) ) ;
    public final void rule__EntityField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2068:1: ( ( ( rule__EntityField__EntityTypeAssignment_0 ) ) )
            // InternalCompras.g:2069:1: ( ( rule__EntityField__EntityTypeAssignment_0 ) )
            {
            // InternalCompras.g:2069:1: ( ( rule__EntityField__EntityTypeAssignment_0 ) )
            // InternalCompras.g:2070:2: ( rule__EntityField__EntityTypeAssignment_0 )
            {
             before(grammarAccess.getEntityFieldAccess().getEntityTypeAssignment_0()); 
            // InternalCompras.g:2071:2: ( rule__EntityField__EntityTypeAssignment_0 )
            // InternalCompras.g:2071:3: rule__EntityField__EntityTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityField__EntityTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityFieldAccess().getEntityTypeAssignment_0()); 

            }


            }

        }
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
    // InternalCompras.g:2079:1: rule__EntityField__Group__1 : rule__EntityField__Group__1__Impl ;
    public final void rule__EntityField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2083:1: ( rule__EntityField__Group__1__Impl )
            // InternalCompras.g:2084:2: rule__EntityField__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityField__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCompras.g:2090:1: rule__EntityField__Group__1__Impl : ( ( rule__EntityField__NameAssignment_1 ) ) ;
    public final void rule__EntityField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2094:1: ( ( ( rule__EntityField__NameAssignment_1 ) ) )
            // InternalCompras.g:2095:1: ( ( rule__EntityField__NameAssignment_1 ) )
            {
            // InternalCompras.g:2095:1: ( ( rule__EntityField__NameAssignment_1 ) )
            // InternalCompras.g:2096:2: ( rule__EntityField__NameAssignment_1 )
            {
             before(grammarAccess.getEntityFieldAccess().getNameAssignment_1()); 
            // InternalCompras.g:2097:2: ( rule__EntityField__NameAssignment_1 )
            // InternalCompras.g:2097:3: rule__EntityField__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityField__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityFieldAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Functionality__Group__0"
    // InternalCompras.g:2106:1: rule__Functionality__Group__0 : rule__Functionality__Group__0__Impl rule__Functionality__Group__1 ;
    public final void rule__Functionality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2110:1: ( rule__Functionality__Group__0__Impl rule__Functionality__Group__1 )
            // InternalCompras.g:2111:2: rule__Functionality__Group__0__Impl rule__Functionality__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCompras.g:2118:1: rule__Functionality__Group__0__Impl : ( ( rule__Functionality__NameAssignment_0 ) ) ;
    public final void rule__Functionality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2122:1: ( ( ( rule__Functionality__NameAssignment_0 ) ) )
            // InternalCompras.g:2123:1: ( ( rule__Functionality__NameAssignment_0 ) )
            {
            // InternalCompras.g:2123:1: ( ( rule__Functionality__NameAssignment_0 ) )
            // InternalCompras.g:2124:2: ( rule__Functionality__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionalityAccess().getNameAssignment_0()); 
            // InternalCompras.g:2125:2: ( rule__Functionality__NameAssignment_0 )
            // InternalCompras.g:2125:3: rule__Functionality__NameAssignment_0
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
    // InternalCompras.g:2133:1: rule__Functionality__Group__1 : rule__Functionality__Group__1__Impl rule__Functionality__Group__2 ;
    public final void rule__Functionality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2137:1: ( rule__Functionality__Group__1__Impl rule__Functionality__Group__2 )
            // InternalCompras.g:2138:2: rule__Functionality__Group__1__Impl rule__Functionality__Group__2
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
    // InternalCompras.g:2145:1: rule__Functionality__Group__1__Impl : ( 'RelEntity' ) ;
    public final void rule__Functionality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2149:1: ( ( 'RelEntity' ) )
            // InternalCompras.g:2150:1: ( 'RelEntity' )
            {
            // InternalCompras.g:2150:1: ( 'RelEntity' )
            // InternalCompras.g:2151:2: 'RelEntity'
            {
             before(grammarAccess.getFunctionalityAccess().getRelEntityKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCompras.g:2160:1: rule__Functionality__Group__2 : rule__Functionality__Group__2__Impl rule__Functionality__Group__3 ;
    public final void rule__Functionality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2164:1: ( rule__Functionality__Group__2__Impl rule__Functionality__Group__3 )
            // InternalCompras.g:2165:2: rule__Functionality__Group__2__Impl rule__Functionality__Group__3
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
    // InternalCompras.g:2172:1: rule__Functionality__Group__2__Impl : ( ( rule__Functionality__EntityAssignment_2 ) ) ;
    public final void rule__Functionality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2176:1: ( ( ( rule__Functionality__EntityAssignment_2 ) ) )
            // InternalCompras.g:2177:1: ( ( rule__Functionality__EntityAssignment_2 ) )
            {
            // InternalCompras.g:2177:1: ( ( rule__Functionality__EntityAssignment_2 ) )
            // InternalCompras.g:2178:2: ( rule__Functionality__EntityAssignment_2 )
            {
             before(grammarAccess.getFunctionalityAccess().getEntityAssignment_2()); 
            // InternalCompras.g:2179:2: ( rule__Functionality__EntityAssignment_2 )
            // InternalCompras.g:2179:3: rule__Functionality__EntityAssignment_2
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
    // InternalCompras.g:2187:1: rule__Functionality__Group__3 : rule__Functionality__Group__3__Impl rule__Functionality__Group__4 ;
    public final void rule__Functionality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2191:1: ( rule__Functionality__Group__3__Impl rule__Functionality__Group__4 )
            // InternalCompras.g:2192:2: rule__Functionality__Group__3__Impl rule__Functionality__Group__4
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
    // InternalCompras.g:2199:1: rule__Functionality__Group__3__Impl : ( ':' ) ;
    public final void rule__Functionality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2203:1: ( ( ':' ) )
            // InternalCompras.g:2204:1: ( ':' )
            {
            // InternalCompras.g:2204:1: ( ':' )
            // InternalCompras.g:2205:2: ':'
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
    // InternalCompras.g:2214:1: rule__Functionality__Group__4 : rule__Functionality__Group__4__Impl rule__Functionality__Group__5 ;
    public final void rule__Functionality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2218:1: ( rule__Functionality__Group__4__Impl rule__Functionality__Group__5 )
            // InternalCompras.g:2219:2: rule__Functionality__Group__4__Impl rule__Functionality__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalCompras.g:2226:1: rule__Functionality__Group__4__Impl : ( '{' ) ;
    public final void rule__Functionality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2230:1: ( ( '{' ) )
            // InternalCompras.g:2231:1: ( '{' )
            {
            // InternalCompras.g:2231:1: ( '{' )
            // InternalCompras.g:2232:2: '{'
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
    // InternalCompras.g:2241:1: rule__Functionality__Group__5 : rule__Functionality__Group__5__Impl rule__Functionality__Group__6 ;
    public final void rule__Functionality__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2245:1: ( rule__Functionality__Group__5__Impl rule__Functionality__Group__6 )
            // InternalCompras.g:2246:2: rule__Functionality__Group__5__Impl rule__Functionality__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalCompras.g:2253:1: rule__Functionality__Group__5__Impl : ( ( rule__Functionality__FunctionalityFieldTypeAssignment_5 )* ) ;
    public final void rule__Functionality__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2257:1: ( ( ( rule__Functionality__FunctionalityFieldTypeAssignment_5 )* ) )
            // InternalCompras.g:2258:1: ( ( rule__Functionality__FunctionalityFieldTypeAssignment_5 )* )
            {
            // InternalCompras.g:2258:1: ( ( rule__Functionality__FunctionalityFieldTypeAssignment_5 )* )
            // InternalCompras.g:2259:2: ( rule__Functionality__FunctionalityFieldTypeAssignment_5 )*
            {
             before(grammarAccess.getFunctionalityAccess().getFunctionalityFieldTypeAssignment_5()); 
            // InternalCompras.g:2260:2: ( rule__Functionality__FunctionalityFieldTypeAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=16 && LA13_0<=20)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCompras.g:2260:3: rule__Functionality__FunctionalityFieldTypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Functionality__FunctionalityFieldTypeAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalCompras.g:2268:1: rule__Functionality__Group__6 : rule__Functionality__Group__6__Impl ;
    public final void rule__Functionality__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2272:1: ( rule__Functionality__Group__6__Impl )
            // InternalCompras.g:2273:2: rule__Functionality__Group__6__Impl
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
    // InternalCompras.g:2279:1: rule__Functionality__Group__6__Impl : ( '}' ) ;
    public final void rule__Functionality__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2283:1: ( ( '}' ) )
            // InternalCompras.g:2284:1: ( '}' )
            {
            // InternalCompras.g:2284:1: ( '}' )
            // InternalCompras.g:2285:2: '}'
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
    // InternalCompras.g:2295:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2299:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalCompras.g:2300:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalCompras.g:2307:1: rule__Architecture__Group__0__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2311:1: ( ( '{' ) )
            // InternalCompras.g:2312:1: ( '{' )
            {
            // InternalCompras.g:2312:1: ( '{' )
            // InternalCompras.g:2313:2: '{'
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
    // InternalCompras.g:2322:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2326:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalCompras.g:2327:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
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
    // InternalCompras.g:2334:1: rule__Architecture__Group__1__Impl : ( 'Layers' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2338:1: ( ( 'Layers' ) )
            // InternalCompras.g:2339:1: ( 'Layers' )
            {
            // InternalCompras.g:2339:1: ( 'Layers' )
            // InternalCompras.g:2340:2: 'Layers'
            {
             before(grammarAccess.getArchitectureAccess().getLayersKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCompras.g:2349:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2353:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalCompras.g:2354:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
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
    // InternalCompras.g:2361:1: rule__Architecture__Group__2__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2365:1: ( ( ':' ) )
            // InternalCompras.g:2366:1: ( ':' )
            {
            // InternalCompras.g:2366:1: ( ':' )
            // InternalCompras.g:2367:2: ':'
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
    // InternalCompras.g:2376:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl rule__Architecture__Group__4 ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2380:1: ( rule__Architecture__Group__3__Impl rule__Architecture__Group__4 )
            // InternalCompras.g:2381:2: rule__Architecture__Group__3__Impl rule__Architecture__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalCompras.g:2388:1: rule__Architecture__Group__3__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2392:1: ( ( '{' ) )
            // InternalCompras.g:2393:1: ( '{' )
            {
            // InternalCompras.g:2393:1: ( '{' )
            // InternalCompras.g:2394:2: '{'
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
    // InternalCompras.g:2403:1: rule__Architecture__Group__4 : rule__Architecture__Group__4__Impl rule__Architecture__Group__5 ;
    public final void rule__Architecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2407:1: ( rule__Architecture__Group__4__Impl rule__Architecture__Group__5 )
            // InternalCompras.g:2408:2: rule__Architecture__Group__4__Impl rule__Architecture__Group__5
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
    // InternalCompras.g:2415:1: rule__Architecture__Group__4__Impl : ( 'PresentationLayer' ) ;
    public final void rule__Architecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2419:1: ( ( 'PresentationLayer' ) )
            // InternalCompras.g:2420:1: ( 'PresentationLayer' )
            {
            // InternalCompras.g:2420:1: ( 'PresentationLayer' )
            // InternalCompras.g:2421:2: 'PresentationLayer'
            {
             before(grammarAccess.getArchitectureAccess().getPresentationLayerKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCompras.g:2430:1: rule__Architecture__Group__5 : rule__Architecture__Group__5__Impl rule__Architecture__Group__6 ;
    public final void rule__Architecture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2434:1: ( rule__Architecture__Group__5__Impl rule__Architecture__Group__6 )
            // InternalCompras.g:2435:2: rule__Architecture__Group__5__Impl rule__Architecture__Group__6
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
    // InternalCompras.g:2442:1: rule__Architecture__Group__5__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2446:1: ( ( ':' ) )
            // InternalCompras.g:2447:1: ( ':' )
            {
            // InternalCompras.g:2447:1: ( ':' )
            // InternalCompras.g:2448:2: ':'
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
    // InternalCompras.g:2457:1: rule__Architecture__Group__6 : rule__Architecture__Group__6__Impl rule__Architecture__Group__7 ;
    public final void rule__Architecture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2461:1: ( rule__Architecture__Group__6__Impl rule__Architecture__Group__7 )
            // InternalCompras.g:2462:2: rule__Architecture__Group__6__Impl rule__Architecture__Group__7
            {
            pushFollow(FOLLOW_26);
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
    // InternalCompras.g:2469:1: rule__Architecture__Group__6__Impl : ( ( rule__Architecture__PresentationLayerAssignment_6 ) ) ;
    public final void rule__Architecture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2473:1: ( ( ( rule__Architecture__PresentationLayerAssignment_6 ) ) )
            // InternalCompras.g:2474:1: ( ( rule__Architecture__PresentationLayerAssignment_6 ) )
            {
            // InternalCompras.g:2474:1: ( ( rule__Architecture__PresentationLayerAssignment_6 ) )
            // InternalCompras.g:2475:2: ( rule__Architecture__PresentationLayerAssignment_6 )
            {
             before(grammarAccess.getArchitectureAccess().getPresentationLayerAssignment_6()); 
            // InternalCompras.g:2476:2: ( rule__Architecture__PresentationLayerAssignment_6 )
            // InternalCompras.g:2476:3: rule__Architecture__PresentationLayerAssignment_6
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
    // InternalCompras.g:2484:1: rule__Architecture__Group__7 : rule__Architecture__Group__7__Impl rule__Architecture__Group__8 ;
    public final void rule__Architecture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2488:1: ( rule__Architecture__Group__7__Impl rule__Architecture__Group__8 )
            // InternalCompras.g:2489:2: rule__Architecture__Group__7__Impl rule__Architecture__Group__8
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
    // InternalCompras.g:2496:1: rule__Architecture__Group__7__Impl : ( 'BusinessLayer' ) ;
    public final void rule__Architecture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2500:1: ( ( 'BusinessLayer' ) )
            // InternalCompras.g:2501:1: ( 'BusinessLayer' )
            {
            // InternalCompras.g:2501:1: ( 'BusinessLayer' )
            // InternalCompras.g:2502:2: 'BusinessLayer'
            {
             before(grammarAccess.getArchitectureAccess().getBusinessLayerKeyword_7()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCompras.g:2511:1: rule__Architecture__Group__8 : rule__Architecture__Group__8__Impl rule__Architecture__Group__9 ;
    public final void rule__Architecture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2515:1: ( rule__Architecture__Group__8__Impl rule__Architecture__Group__9 )
            // InternalCompras.g:2516:2: rule__Architecture__Group__8__Impl rule__Architecture__Group__9
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
    // InternalCompras.g:2523:1: rule__Architecture__Group__8__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2527:1: ( ( ':' ) )
            // InternalCompras.g:2528:1: ( ':' )
            {
            // InternalCompras.g:2528:1: ( ':' )
            // InternalCompras.g:2529:2: ':'
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
    // InternalCompras.g:2538:1: rule__Architecture__Group__9 : rule__Architecture__Group__9__Impl rule__Architecture__Group__10 ;
    public final void rule__Architecture__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2542:1: ( rule__Architecture__Group__9__Impl rule__Architecture__Group__10 )
            // InternalCompras.g:2543:2: rule__Architecture__Group__9__Impl rule__Architecture__Group__10
            {
            pushFollow(FOLLOW_27);
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
    // InternalCompras.g:2550:1: rule__Architecture__Group__9__Impl : ( ( rule__Architecture__BusinessLayerAssignment_9 ) ) ;
    public final void rule__Architecture__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2554:1: ( ( ( rule__Architecture__BusinessLayerAssignment_9 ) ) )
            // InternalCompras.g:2555:1: ( ( rule__Architecture__BusinessLayerAssignment_9 ) )
            {
            // InternalCompras.g:2555:1: ( ( rule__Architecture__BusinessLayerAssignment_9 ) )
            // InternalCompras.g:2556:2: ( rule__Architecture__BusinessLayerAssignment_9 )
            {
             before(grammarAccess.getArchitectureAccess().getBusinessLayerAssignment_9()); 
            // InternalCompras.g:2557:2: ( rule__Architecture__BusinessLayerAssignment_9 )
            // InternalCompras.g:2557:3: rule__Architecture__BusinessLayerAssignment_9
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
    // InternalCompras.g:2565:1: rule__Architecture__Group__10 : rule__Architecture__Group__10__Impl rule__Architecture__Group__11 ;
    public final void rule__Architecture__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2569:1: ( rule__Architecture__Group__10__Impl rule__Architecture__Group__11 )
            // InternalCompras.g:2570:2: rule__Architecture__Group__10__Impl rule__Architecture__Group__11
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
    // InternalCompras.g:2577:1: rule__Architecture__Group__10__Impl : ( 'DataAccessLayer' ) ;
    public final void rule__Architecture__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2581:1: ( ( 'DataAccessLayer' ) )
            // InternalCompras.g:2582:1: ( 'DataAccessLayer' )
            {
            // InternalCompras.g:2582:1: ( 'DataAccessLayer' )
            // InternalCompras.g:2583:2: 'DataAccessLayer'
            {
             before(grammarAccess.getArchitectureAccess().getDataAccessLayerKeyword_10()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCompras.g:2592:1: rule__Architecture__Group__11 : rule__Architecture__Group__11__Impl rule__Architecture__Group__12 ;
    public final void rule__Architecture__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2596:1: ( rule__Architecture__Group__11__Impl rule__Architecture__Group__12 )
            // InternalCompras.g:2597:2: rule__Architecture__Group__11__Impl rule__Architecture__Group__12
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
    // InternalCompras.g:2604:1: rule__Architecture__Group__11__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2608:1: ( ( ':' ) )
            // InternalCompras.g:2609:1: ( ':' )
            {
            // InternalCompras.g:2609:1: ( ':' )
            // InternalCompras.g:2610:2: ':'
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
    // InternalCompras.g:2619:1: rule__Architecture__Group__12 : rule__Architecture__Group__12__Impl rule__Architecture__Group__13 ;
    public final void rule__Architecture__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2623:1: ( rule__Architecture__Group__12__Impl rule__Architecture__Group__13 )
            // InternalCompras.g:2624:2: rule__Architecture__Group__12__Impl rule__Architecture__Group__13
            {
            pushFollow(FOLLOW_28);
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
    // InternalCompras.g:2631:1: rule__Architecture__Group__12__Impl : ( ( rule__Architecture__DataAccessLayerAssignment_12 ) ) ;
    public final void rule__Architecture__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2635:1: ( ( ( rule__Architecture__DataAccessLayerAssignment_12 ) ) )
            // InternalCompras.g:2636:1: ( ( rule__Architecture__DataAccessLayerAssignment_12 ) )
            {
            // InternalCompras.g:2636:1: ( ( rule__Architecture__DataAccessLayerAssignment_12 ) )
            // InternalCompras.g:2637:2: ( rule__Architecture__DataAccessLayerAssignment_12 )
            {
             before(grammarAccess.getArchitectureAccess().getDataAccessLayerAssignment_12()); 
            // InternalCompras.g:2638:2: ( rule__Architecture__DataAccessLayerAssignment_12 )
            // InternalCompras.g:2638:3: rule__Architecture__DataAccessLayerAssignment_12
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
    // InternalCompras.g:2646:1: rule__Architecture__Group__13 : rule__Architecture__Group__13__Impl rule__Architecture__Group__14 ;
    public final void rule__Architecture__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2650:1: ( rule__Architecture__Group__13__Impl rule__Architecture__Group__14 )
            // InternalCompras.g:2651:2: rule__Architecture__Group__13__Impl rule__Architecture__Group__14
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
    // InternalCompras.g:2658:1: rule__Architecture__Group__13__Impl : ( 'CommonLayer' ) ;
    public final void rule__Architecture__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2662:1: ( ( 'CommonLayer' ) )
            // InternalCompras.g:2663:1: ( 'CommonLayer' )
            {
            // InternalCompras.g:2663:1: ( 'CommonLayer' )
            // InternalCompras.g:2664:2: 'CommonLayer'
            {
             before(grammarAccess.getArchitectureAccess().getCommonLayerKeyword_13()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCompras.g:2673:1: rule__Architecture__Group__14 : rule__Architecture__Group__14__Impl rule__Architecture__Group__15 ;
    public final void rule__Architecture__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2677:1: ( rule__Architecture__Group__14__Impl rule__Architecture__Group__15 )
            // InternalCompras.g:2678:2: rule__Architecture__Group__14__Impl rule__Architecture__Group__15
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
    // InternalCompras.g:2685:1: rule__Architecture__Group__14__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2689:1: ( ( ':' ) )
            // InternalCompras.g:2690:1: ( ':' )
            {
            // InternalCompras.g:2690:1: ( ':' )
            // InternalCompras.g:2691:2: ':'
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
    // InternalCompras.g:2700:1: rule__Architecture__Group__15 : rule__Architecture__Group__15__Impl rule__Architecture__Group__16 ;
    public final void rule__Architecture__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2704:1: ( rule__Architecture__Group__15__Impl rule__Architecture__Group__16 )
            // InternalCompras.g:2705:2: rule__Architecture__Group__15__Impl rule__Architecture__Group__16
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
    // InternalCompras.g:2712:1: rule__Architecture__Group__15__Impl : ( ( rule__Architecture__CommonLayerAssignment_15 ) ) ;
    public final void rule__Architecture__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2716:1: ( ( ( rule__Architecture__CommonLayerAssignment_15 ) ) )
            // InternalCompras.g:2717:1: ( ( rule__Architecture__CommonLayerAssignment_15 ) )
            {
            // InternalCompras.g:2717:1: ( ( rule__Architecture__CommonLayerAssignment_15 ) )
            // InternalCompras.g:2718:2: ( rule__Architecture__CommonLayerAssignment_15 )
            {
             before(grammarAccess.getArchitectureAccess().getCommonLayerAssignment_15()); 
            // InternalCompras.g:2719:2: ( rule__Architecture__CommonLayerAssignment_15 )
            // InternalCompras.g:2719:3: rule__Architecture__CommonLayerAssignment_15
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
    // InternalCompras.g:2727:1: rule__Architecture__Group__16 : rule__Architecture__Group__16__Impl rule__Architecture__Group__17 ;
    public final void rule__Architecture__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2731:1: ( rule__Architecture__Group__16__Impl rule__Architecture__Group__17 )
            // InternalCompras.g:2732:2: rule__Architecture__Group__16__Impl rule__Architecture__Group__17
            {
            pushFollow(FOLLOW_29);
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
    // InternalCompras.g:2739:1: rule__Architecture__Group__16__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2743:1: ( ( '}' ) )
            // InternalCompras.g:2744:1: ( '}' )
            {
            // InternalCompras.g:2744:1: ( '}' )
            // InternalCompras.g:2745:2: '}'
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
    // InternalCompras.g:2754:1: rule__Architecture__Group__17 : rule__Architecture__Group__17__Impl rule__Architecture__Group__18 ;
    public final void rule__Architecture__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2758:1: ( rule__Architecture__Group__17__Impl rule__Architecture__Group__18 )
            // InternalCompras.g:2759:2: rule__Architecture__Group__17__Impl rule__Architecture__Group__18
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
    // InternalCompras.g:2766:1: rule__Architecture__Group__17__Impl : ( 'Relations' ) ;
    public final void rule__Architecture__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2770:1: ( ( 'Relations' ) )
            // InternalCompras.g:2771:1: ( 'Relations' )
            {
            // InternalCompras.g:2771:1: ( 'Relations' )
            // InternalCompras.g:2772:2: 'Relations'
            {
             before(grammarAccess.getArchitectureAccess().getRelationsKeyword_17()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCompras.g:2781:1: rule__Architecture__Group__18 : rule__Architecture__Group__18__Impl rule__Architecture__Group__19 ;
    public final void rule__Architecture__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2785:1: ( rule__Architecture__Group__18__Impl rule__Architecture__Group__19 )
            // InternalCompras.g:2786:2: rule__Architecture__Group__18__Impl rule__Architecture__Group__19
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
    // InternalCompras.g:2793:1: rule__Architecture__Group__18__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2797:1: ( ( ':' ) )
            // InternalCompras.g:2798:1: ( ':' )
            {
            // InternalCompras.g:2798:1: ( ':' )
            // InternalCompras.g:2799:2: ':'
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
    // InternalCompras.g:2808:1: rule__Architecture__Group__19 : rule__Architecture__Group__19__Impl rule__Architecture__Group__20 ;
    public final void rule__Architecture__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2812:1: ( rule__Architecture__Group__19__Impl rule__Architecture__Group__20 )
            // InternalCompras.g:2813:2: rule__Architecture__Group__19__Impl rule__Architecture__Group__20
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
    // InternalCompras.g:2820:1: rule__Architecture__Group__19__Impl : ( ( rule__Architecture__RelationsAssignment_19 ) ) ;
    public final void rule__Architecture__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2824:1: ( ( ( rule__Architecture__RelationsAssignment_19 ) ) )
            // InternalCompras.g:2825:1: ( ( rule__Architecture__RelationsAssignment_19 ) )
            {
            // InternalCompras.g:2825:1: ( ( rule__Architecture__RelationsAssignment_19 ) )
            // InternalCompras.g:2826:2: ( rule__Architecture__RelationsAssignment_19 )
            {
             before(grammarAccess.getArchitectureAccess().getRelationsAssignment_19()); 
            // InternalCompras.g:2827:2: ( rule__Architecture__RelationsAssignment_19 )
            // InternalCompras.g:2827:3: rule__Architecture__RelationsAssignment_19
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
    // InternalCompras.g:2835:1: rule__Architecture__Group__20 : rule__Architecture__Group__20__Impl ;
    public final void rule__Architecture__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2839:1: ( rule__Architecture__Group__20__Impl )
            // InternalCompras.g:2840:2: rule__Architecture__Group__20__Impl
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
    // InternalCompras.g:2846:1: rule__Architecture__Group__20__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2850:1: ( ( '}' ) )
            // InternalCompras.g:2851:1: ( '}' )
            {
            // InternalCompras.g:2851:1: ( '}' )
            // InternalCompras.g:2852:2: '}'
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
    // InternalCompras.g:2862:1: rule__PresentationLayer__Group__0 : rule__PresentationLayer__Group__0__Impl rule__PresentationLayer__Group__1 ;
    public final void rule__PresentationLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2866:1: ( rule__PresentationLayer__Group__0__Impl rule__PresentationLayer__Group__1 )
            // InternalCompras.g:2867:2: rule__PresentationLayer__Group__0__Impl rule__PresentationLayer__Group__1
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
    // InternalCompras.g:2874:1: rule__PresentationLayer__Group__0__Impl : ( ( rule__PresentationLayer__NameAssignment_0 ) ) ;
    public final void rule__PresentationLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2878:1: ( ( ( rule__PresentationLayer__NameAssignment_0 ) ) )
            // InternalCompras.g:2879:1: ( ( rule__PresentationLayer__NameAssignment_0 ) )
            {
            // InternalCompras.g:2879:1: ( ( rule__PresentationLayer__NameAssignment_0 ) )
            // InternalCompras.g:2880:2: ( rule__PresentationLayer__NameAssignment_0 )
            {
             before(grammarAccess.getPresentationLayerAccess().getNameAssignment_0()); 
            // InternalCompras.g:2881:2: ( rule__PresentationLayer__NameAssignment_0 )
            // InternalCompras.g:2881:3: rule__PresentationLayer__NameAssignment_0
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
    // InternalCompras.g:2889:1: rule__PresentationLayer__Group__1 : rule__PresentationLayer__Group__1__Impl rule__PresentationLayer__Group__2 ;
    public final void rule__PresentationLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2893:1: ( rule__PresentationLayer__Group__1__Impl rule__PresentationLayer__Group__2 )
            // InternalCompras.g:2894:2: rule__PresentationLayer__Group__1__Impl rule__PresentationLayer__Group__2
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
    // InternalCompras.g:2901:1: rule__PresentationLayer__Group__1__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2905:1: ( ( ':' ) )
            // InternalCompras.g:2906:1: ( ':' )
            {
            // InternalCompras.g:2906:1: ( ':' )
            // InternalCompras.g:2907:2: ':'
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
    // InternalCompras.g:2916:1: rule__PresentationLayer__Group__2 : rule__PresentationLayer__Group__2__Impl rule__PresentationLayer__Group__3 ;
    public final void rule__PresentationLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2920:1: ( rule__PresentationLayer__Group__2__Impl rule__PresentationLayer__Group__3 )
            // InternalCompras.g:2921:2: rule__PresentationLayer__Group__2__Impl rule__PresentationLayer__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalCompras.g:2928:1: rule__PresentationLayer__Group__2__Impl : ( '{' ) ;
    public final void rule__PresentationLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2932:1: ( ( '{' ) )
            // InternalCompras.g:2933:1: ( '{' )
            {
            // InternalCompras.g:2933:1: ( '{' )
            // InternalCompras.g:2934:2: '{'
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
    // InternalCompras.g:2943:1: rule__PresentationLayer__Group__3 : rule__PresentationLayer__Group__3__Impl rule__PresentationLayer__Group__4 ;
    public final void rule__PresentationLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2947:1: ( rule__PresentationLayer__Group__3__Impl rule__PresentationLayer__Group__4 )
            // InternalCompras.g:2948:2: rule__PresentationLayer__Group__3__Impl rule__PresentationLayer__Group__4
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
    // InternalCompras.g:2955:1: rule__PresentationLayer__Group__3__Impl : ( 'ControllerSegmentLayer' ) ;
    public final void rule__PresentationLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2959:1: ( ( 'ControllerSegmentLayer' ) )
            // InternalCompras.g:2960:1: ( 'ControllerSegmentLayer' )
            {
            // InternalCompras.g:2960:1: ( 'ControllerSegmentLayer' )
            // InternalCompras.g:2961:2: 'ControllerSegmentLayer'
            {
             before(grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCompras.g:2970:1: rule__PresentationLayer__Group__4 : rule__PresentationLayer__Group__4__Impl rule__PresentationLayer__Group__5 ;
    public final void rule__PresentationLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2974:1: ( rule__PresentationLayer__Group__4__Impl rule__PresentationLayer__Group__5 )
            // InternalCompras.g:2975:2: rule__PresentationLayer__Group__4__Impl rule__PresentationLayer__Group__5
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
    // InternalCompras.g:2982:1: rule__PresentationLayer__Group__4__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:2986:1: ( ( ':' ) )
            // InternalCompras.g:2987:1: ( ':' )
            {
            // InternalCompras.g:2987:1: ( ':' )
            // InternalCompras.g:2988:2: ':'
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
    // InternalCompras.g:2997:1: rule__PresentationLayer__Group__5 : rule__PresentationLayer__Group__5__Impl rule__PresentationLayer__Group__6 ;
    public final void rule__PresentationLayer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3001:1: ( rule__PresentationLayer__Group__5__Impl rule__PresentationLayer__Group__6 )
            // InternalCompras.g:3002:2: rule__PresentationLayer__Group__5__Impl rule__PresentationLayer__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalCompras.g:3009:1: rule__PresentationLayer__Group__5__Impl : ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) ) ;
    public final void rule__PresentationLayer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3013:1: ( ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) ) )
            // InternalCompras.g:3014:1: ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) )
            {
            // InternalCompras.g:3014:1: ( ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 ) )
            // InternalCompras.g:3015:2: ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 )
            {
             before(grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerAssignment_5()); 
            // InternalCompras.g:3016:2: ( rule__PresentationLayer__ControllerSegmentLayerAssignment_5 )
            // InternalCompras.g:3016:3: rule__PresentationLayer__ControllerSegmentLayerAssignment_5
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
    // InternalCompras.g:3024:1: rule__PresentationLayer__Group__6 : rule__PresentationLayer__Group__6__Impl rule__PresentationLayer__Group__7 ;
    public final void rule__PresentationLayer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3028:1: ( rule__PresentationLayer__Group__6__Impl rule__PresentationLayer__Group__7 )
            // InternalCompras.g:3029:2: rule__PresentationLayer__Group__6__Impl rule__PresentationLayer__Group__7
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
    // InternalCompras.g:3036:1: rule__PresentationLayer__Group__6__Impl : ( 'ViewSegmentLayer' ) ;
    public final void rule__PresentationLayer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3040:1: ( ( 'ViewSegmentLayer' ) )
            // InternalCompras.g:3041:1: ( 'ViewSegmentLayer' )
            {
            // InternalCompras.g:3041:1: ( 'ViewSegmentLayer' )
            // InternalCompras.g:3042:2: 'ViewSegmentLayer'
            {
             before(grammarAccess.getPresentationLayerAccess().getViewSegmentLayerKeyword_6()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCompras.g:3051:1: rule__PresentationLayer__Group__7 : rule__PresentationLayer__Group__7__Impl rule__PresentationLayer__Group__8 ;
    public final void rule__PresentationLayer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3055:1: ( rule__PresentationLayer__Group__7__Impl rule__PresentationLayer__Group__8 )
            // InternalCompras.g:3056:2: rule__PresentationLayer__Group__7__Impl rule__PresentationLayer__Group__8
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
    // InternalCompras.g:3063:1: rule__PresentationLayer__Group__7__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3067:1: ( ( ':' ) )
            // InternalCompras.g:3068:1: ( ':' )
            {
            // InternalCompras.g:3068:1: ( ':' )
            // InternalCompras.g:3069:2: ':'
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
    // InternalCompras.g:3078:1: rule__PresentationLayer__Group__8 : rule__PresentationLayer__Group__8__Impl rule__PresentationLayer__Group__9 ;
    public final void rule__PresentationLayer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3082:1: ( rule__PresentationLayer__Group__8__Impl rule__PresentationLayer__Group__9 )
            // InternalCompras.g:3083:2: rule__PresentationLayer__Group__8__Impl rule__PresentationLayer__Group__9
            {
            pushFollow(FOLLOW_32);
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
    // InternalCompras.g:3090:1: rule__PresentationLayer__Group__8__Impl : ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) ) ;
    public final void rule__PresentationLayer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3094:1: ( ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) ) )
            // InternalCompras.g:3095:1: ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) )
            {
            // InternalCompras.g:3095:1: ( ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 ) )
            // InternalCompras.g:3096:2: ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 )
            {
             before(grammarAccess.getPresentationLayerAccess().getViewSegmentLayerAssignment_8()); 
            // InternalCompras.g:3097:2: ( rule__PresentationLayer__ViewSegmentLayerAssignment_8 )
            // InternalCompras.g:3097:3: rule__PresentationLayer__ViewSegmentLayerAssignment_8
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
    // InternalCompras.g:3105:1: rule__PresentationLayer__Group__9 : rule__PresentationLayer__Group__9__Impl rule__PresentationLayer__Group__10 ;
    public final void rule__PresentationLayer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3109:1: ( rule__PresentationLayer__Group__9__Impl rule__PresentationLayer__Group__10 )
            // InternalCompras.g:3110:2: rule__PresentationLayer__Group__9__Impl rule__PresentationLayer__Group__10
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
    // InternalCompras.g:3117:1: rule__PresentationLayer__Group__9__Impl : ( 'ScriptSegmentLayer' ) ;
    public final void rule__PresentationLayer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3121:1: ( ( 'ScriptSegmentLayer' ) )
            // InternalCompras.g:3122:1: ( 'ScriptSegmentLayer' )
            {
            // InternalCompras.g:3122:1: ( 'ScriptSegmentLayer' )
            // InternalCompras.g:3123:2: 'ScriptSegmentLayer'
            {
             before(grammarAccess.getPresentationLayerAccess().getScriptSegmentLayerKeyword_9()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCompras.g:3132:1: rule__PresentationLayer__Group__10 : rule__PresentationLayer__Group__10__Impl rule__PresentationLayer__Group__11 ;
    public final void rule__PresentationLayer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3136:1: ( rule__PresentationLayer__Group__10__Impl rule__PresentationLayer__Group__11 )
            // InternalCompras.g:3137:2: rule__PresentationLayer__Group__10__Impl rule__PresentationLayer__Group__11
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
    // InternalCompras.g:3144:1: rule__PresentationLayer__Group__10__Impl : ( ':' ) ;
    public final void rule__PresentationLayer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3148:1: ( ( ':' ) )
            // InternalCompras.g:3149:1: ( ':' )
            {
            // InternalCompras.g:3149:1: ( ':' )
            // InternalCompras.g:3150:2: ':'
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
    // InternalCompras.g:3159:1: rule__PresentationLayer__Group__11 : rule__PresentationLayer__Group__11__Impl rule__PresentationLayer__Group__12 ;
    public final void rule__PresentationLayer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3163:1: ( rule__PresentationLayer__Group__11__Impl rule__PresentationLayer__Group__12 )
            // InternalCompras.g:3164:2: rule__PresentationLayer__Group__11__Impl rule__PresentationLayer__Group__12
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
    // InternalCompras.g:3171:1: rule__PresentationLayer__Group__11__Impl : ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) ) ;
    public final void rule__PresentationLayer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3175:1: ( ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) ) )
            // InternalCompras.g:3176:1: ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) )
            {
            // InternalCompras.g:3176:1: ( ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 ) )
            // InternalCompras.g:3177:2: ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 )
            {
             before(grammarAccess.getPresentationLayerAccess().getScriptegmentLayerAssignment_11()); 
            // InternalCompras.g:3178:2: ( rule__PresentationLayer__ScriptegmentLayerAssignment_11 )
            // InternalCompras.g:3178:3: rule__PresentationLayer__ScriptegmentLayerAssignment_11
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
    // InternalCompras.g:3186:1: rule__PresentationLayer__Group__12 : rule__PresentationLayer__Group__12__Impl ;
    public final void rule__PresentationLayer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3190:1: ( rule__PresentationLayer__Group__12__Impl )
            // InternalCompras.g:3191:2: rule__PresentationLayer__Group__12__Impl
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
    // InternalCompras.g:3197:1: rule__PresentationLayer__Group__12__Impl : ( '}' ) ;
    public final void rule__PresentationLayer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3201:1: ( ( '}' ) )
            // InternalCompras.g:3202:1: ( '}' )
            {
            // InternalCompras.g:3202:1: ( '}' )
            // InternalCompras.g:3203:2: '}'
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
    // InternalCompras.g:3213:1: rule__DataAccessLayer__Group__0 : rule__DataAccessLayer__Group__0__Impl rule__DataAccessLayer__Group__1 ;
    public final void rule__DataAccessLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3217:1: ( rule__DataAccessLayer__Group__0__Impl rule__DataAccessLayer__Group__1 )
            // InternalCompras.g:3218:2: rule__DataAccessLayer__Group__0__Impl rule__DataAccessLayer__Group__1
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
    // InternalCompras.g:3225:1: rule__DataAccessLayer__Group__0__Impl : ( ( rule__DataAccessLayer__NameAssignment_0 ) ) ;
    public final void rule__DataAccessLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3229:1: ( ( ( rule__DataAccessLayer__NameAssignment_0 ) ) )
            // InternalCompras.g:3230:1: ( ( rule__DataAccessLayer__NameAssignment_0 ) )
            {
            // InternalCompras.g:3230:1: ( ( rule__DataAccessLayer__NameAssignment_0 ) )
            // InternalCompras.g:3231:2: ( rule__DataAccessLayer__NameAssignment_0 )
            {
             before(grammarAccess.getDataAccessLayerAccess().getNameAssignment_0()); 
            // InternalCompras.g:3232:2: ( rule__DataAccessLayer__NameAssignment_0 )
            // InternalCompras.g:3232:3: rule__DataAccessLayer__NameAssignment_0
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
    // InternalCompras.g:3240:1: rule__DataAccessLayer__Group__1 : rule__DataAccessLayer__Group__1__Impl rule__DataAccessLayer__Group__2 ;
    public final void rule__DataAccessLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3244:1: ( rule__DataAccessLayer__Group__1__Impl rule__DataAccessLayer__Group__2 )
            // InternalCompras.g:3245:2: rule__DataAccessLayer__Group__1__Impl rule__DataAccessLayer__Group__2
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
    // InternalCompras.g:3252:1: rule__DataAccessLayer__Group__1__Impl : ( ':' ) ;
    public final void rule__DataAccessLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3256:1: ( ( ':' ) )
            // InternalCompras.g:3257:1: ( ':' )
            {
            // InternalCompras.g:3257:1: ( ':' )
            // InternalCompras.g:3258:2: ':'
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
    // InternalCompras.g:3267:1: rule__DataAccessLayer__Group__2 : rule__DataAccessLayer__Group__2__Impl rule__DataAccessLayer__Group__3 ;
    public final void rule__DataAccessLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3271:1: ( rule__DataAccessLayer__Group__2__Impl rule__DataAccessLayer__Group__3 )
            // InternalCompras.g:3272:2: rule__DataAccessLayer__Group__2__Impl rule__DataAccessLayer__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalCompras.g:3279:1: rule__DataAccessLayer__Group__2__Impl : ( '{' ) ;
    public final void rule__DataAccessLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3283:1: ( ( '{' ) )
            // InternalCompras.g:3284:1: ( '{' )
            {
            // InternalCompras.g:3284:1: ( '{' )
            // InternalCompras.g:3285:2: '{'
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
    // InternalCompras.g:3294:1: rule__DataAccessLayer__Group__3 : rule__DataAccessLayer__Group__3__Impl rule__DataAccessLayer__Group__4 ;
    public final void rule__DataAccessLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3298:1: ( rule__DataAccessLayer__Group__3__Impl rule__DataAccessLayer__Group__4 )
            // InternalCompras.g:3299:2: rule__DataAccessLayer__Group__3__Impl rule__DataAccessLayer__Group__4
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
    // InternalCompras.g:3306:1: rule__DataAccessLayer__Group__3__Impl : ( 'DbConnectorSegmentLayer' ) ;
    public final void rule__DataAccessLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3310:1: ( ( 'DbConnectorSegmentLayer' ) )
            // InternalCompras.g:3311:1: ( 'DbConnectorSegmentLayer' )
            {
            // InternalCompras.g:3311:1: ( 'DbConnectorSegmentLayer' )
            // InternalCompras.g:3312:2: 'DbConnectorSegmentLayer'
            {
             before(grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCompras.g:3321:1: rule__DataAccessLayer__Group__4 : rule__DataAccessLayer__Group__4__Impl rule__DataAccessLayer__Group__5 ;
    public final void rule__DataAccessLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3325:1: ( rule__DataAccessLayer__Group__4__Impl rule__DataAccessLayer__Group__5 )
            // InternalCompras.g:3326:2: rule__DataAccessLayer__Group__4__Impl rule__DataAccessLayer__Group__5
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
    // InternalCompras.g:3333:1: rule__DataAccessLayer__Group__4__Impl : ( ':' ) ;
    public final void rule__DataAccessLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3337:1: ( ( ':' ) )
            // InternalCompras.g:3338:1: ( ':' )
            {
            // InternalCompras.g:3338:1: ( ':' )
            // InternalCompras.g:3339:2: ':'
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
    // InternalCompras.g:3348:1: rule__DataAccessLayer__Group__5 : rule__DataAccessLayer__Group__5__Impl rule__DataAccessLayer__Group__6 ;
    public final void rule__DataAccessLayer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3352:1: ( rule__DataAccessLayer__Group__5__Impl rule__DataAccessLayer__Group__6 )
            // InternalCompras.g:3353:2: rule__DataAccessLayer__Group__5__Impl rule__DataAccessLayer__Group__6
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
    // InternalCompras.g:3360:1: rule__DataAccessLayer__Group__5__Impl : ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) ) ;
    public final void rule__DataAccessLayer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3364:1: ( ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) ) )
            // InternalCompras.g:3365:1: ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) )
            {
            // InternalCompras.g:3365:1: ( ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 ) )
            // InternalCompras.g:3366:2: ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 )
            {
             before(grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerAssignment_5()); 
            // InternalCompras.g:3367:2: ( rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 )
            // InternalCompras.g:3367:3: rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5
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
    // InternalCompras.g:3375:1: rule__DataAccessLayer__Group__6 : rule__DataAccessLayer__Group__6__Impl ;
    public final void rule__DataAccessLayer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3379:1: ( rule__DataAccessLayer__Group__6__Impl )
            // InternalCompras.g:3380:2: rule__DataAccessLayer__Group__6__Impl
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
    // InternalCompras.g:3386:1: rule__DataAccessLayer__Group__6__Impl : ( '}' ) ;
    public final void rule__DataAccessLayer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3390:1: ( ( '}' ) )
            // InternalCompras.g:3391:1: ( '}' )
            {
            // InternalCompras.g:3391:1: ( '}' )
            // InternalCompras.g:3392:2: '}'
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
    // InternalCompras.g:3402:1: rule__Relations__Group__0 : rule__Relations__Group__0__Impl rule__Relations__Group__1 ;
    public final void rule__Relations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3406:1: ( rule__Relations__Group__0__Impl rule__Relations__Group__1 )
            // InternalCompras.g:3407:2: rule__Relations__Group__0__Impl rule__Relations__Group__1
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
    // InternalCompras.g:3414:1: rule__Relations__Group__0__Impl : ( '{' ) ;
    public final void rule__Relations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3418:1: ( ( '{' ) )
            // InternalCompras.g:3419:1: ( '{' )
            {
            // InternalCompras.g:3419:1: ( '{' )
            // InternalCompras.g:3420:2: '{'
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
    // InternalCompras.g:3429:1: rule__Relations__Group__1 : rule__Relations__Group__1__Impl rule__Relations__Group__2 ;
    public final void rule__Relations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3433:1: ( rule__Relations__Group__1__Impl rule__Relations__Group__2 )
            // InternalCompras.g:3434:2: rule__Relations__Group__1__Impl rule__Relations__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalCompras.g:3441:1: rule__Relations__Group__1__Impl : ( ( rule__Relations__SourceLayer1Assignment_1 ) ) ;
    public final void rule__Relations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3445:1: ( ( ( rule__Relations__SourceLayer1Assignment_1 ) ) )
            // InternalCompras.g:3446:1: ( ( rule__Relations__SourceLayer1Assignment_1 ) )
            {
            // InternalCompras.g:3446:1: ( ( rule__Relations__SourceLayer1Assignment_1 ) )
            // InternalCompras.g:3447:2: ( rule__Relations__SourceLayer1Assignment_1 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer1Assignment_1()); 
            // InternalCompras.g:3448:2: ( rule__Relations__SourceLayer1Assignment_1 )
            // InternalCompras.g:3448:3: rule__Relations__SourceLayer1Assignment_1
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
    // InternalCompras.g:3456:1: rule__Relations__Group__2 : rule__Relations__Group__2__Impl rule__Relations__Group__3 ;
    public final void rule__Relations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3460:1: ( rule__Relations__Group__2__Impl rule__Relations__Group__3 )
            // InternalCompras.g:3461:2: rule__Relations__Group__2__Impl rule__Relations__Group__3
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
    // InternalCompras.g:3468:1: rule__Relations__Group__2__Impl : ( ( rule__Relations__RelationsType1Assignment_2 ) ) ;
    public final void rule__Relations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3472:1: ( ( ( rule__Relations__RelationsType1Assignment_2 ) ) )
            // InternalCompras.g:3473:1: ( ( rule__Relations__RelationsType1Assignment_2 ) )
            {
            // InternalCompras.g:3473:1: ( ( rule__Relations__RelationsType1Assignment_2 ) )
            // InternalCompras.g:3474:2: ( rule__Relations__RelationsType1Assignment_2 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType1Assignment_2()); 
            // InternalCompras.g:3475:2: ( rule__Relations__RelationsType1Assignment_2 )
            // InternalCompras.g:3475:3: rule__Relations__RelationsType1Assignment_2
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
    // InternalCompras.g:3483:1: rule__Relations__Group__3 : rule__Relations__Group__3__Impl rule__Relations__Group__4 ;
    public final void rule__Relations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3487:1: ( rule__Relations__Group__3__Impl rule__Relations__Group__4 )
            // InternalCompras.g:3488:2: rule__Relations__Group__3__Impl rule__Relations__Group__4
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
    // InternalCompras.g:3495:1: rule__Relations__Group__3__Impl : ( ( rule__Relations__TargetLayer1Assignment_3 ) ) ;
    public final void rule__Relations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3499:1: ( ( ( rule__Relations__TargetLayer1Assignment_3 ) ) )
            // InternalCompras.g:3500:1: ( ( rule__Relations__TargetLayer1Assignment_3 ) )
            {
            // InternalCompras.g:3500:1: ( ( rule__Relations__TargetLayer1Assignment_3 ) )
            // InternalCompras.g:3501:2: ( rule__Relations__TargetLayer1Assignment_3 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer1Assignment_3()); 
            // InternalCompras.g:3502:2: ( rule__Relations__TargetLayer1Assignment_3 )
            // InternalCompras.g:3502:3: rule__Relations__TargetLayer1Assignment_3
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
    // InternalCompras.g:3510:1: rule__Relations__Group__4 : rule__Relations__Group__4__Impl rule__Relations__Group__5 ;
    public final void rule__Relations__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3514:1: ( rule__Relations__Group__4__Impl rule__Relations__Group__5 )
            // InternalCompras.g:3515:2: rule__Relations__Group__4__Impl rule__Relations__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalCompras.g:3522:1: rule__Relations__Group__4__Impl : ( ( rule__Relations__SourceLayer2Assignment_4 ) ) ;
    public final void rule__Relations__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3526:1: ( ( ( rule__Relations__SourceLayer2Assignment_4 ) ) )
            // InternalCompras.g:3527:1: ( ( rule__Relations__SourceLayer2Assignment_4 ) )
            {
            // InternalCompras.g:3527:1: ( ( rule__Relations__SourceLayer2Assignment_4 ) )
            // InternalCompras.g:3528:2: ( rule__Relations__SourceLayer2Assignment_4 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer2Assignment_4()); 
            // InternalCompras.g:3529:2: ( rule__Relations__SourceLayer2Assignment_4 )
            // InternalCompras.g:3529:3: rule__Relations__SourceLayer2Assignment_4
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
    // InternalCompras.g:3537:1: rule__Relations__Group__5 : rule__Relations__Group__5__Impl rule__Relations__Group__6 ;
    public final void rule__Relations__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3541:1: ( rule__Relations__Group__5__Impl rule__Relations__Group__6 )
            // InternalCompras.g:3542:2: rule__Relations__Group__5__Impl rule__Relations__Group__6
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
    // InternalCompras.g:3549:1: rule__Relations__Group__5__Impl : ( ( rule__Relations__RelationsType2Assignment_5 ) ) ;
    public final void rule__Relations__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3553:1: ( ( ( rule__Relations__RelationsType2Assignment_5 ) ) )
            // InternalCompras.g:3554:1: ( ( rule__Relations__RelationsType2Assignment_5 ) )
            {
            // InternalCompras.g:3554:1: ( ( rule__Relations__RelationsType2Assignment_5 ) )
            // InternalCompras.g:3555:2: ( rule__Relations__RelationsType2Assignment_5 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType2Assignment_5()); 
            // InternalCompras.g:3556:2: ( rule__Relations__RelationsType2Assignment_5 )
            // InternalCompras.g:3556:3: rule__Relations__RelationsType2Assignment_5
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
    // InternalCompras.g:3564:1: rule__Relations__Group__6 : rule__Relations__Group__6__Impl rule__Relations__Group__7 ;
    public final void rule__Relations__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3568:1: ( rule__Relations__Group__6__Impl rule__Relations__Group__7 )
            // InternalCompras.g:3569:2: rule__Relations__Group__6__Impl rule__Relations__Group__7
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
    // InternalCompras.g:3576:1: rule__Relations__Group__6__Impl : ( ( rule__Relations__TargetLayer2Assignment_6 ) ) ;
    public final void rule__Relations__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3580:1: ( ( ( rule__Relations__TargetLayer2Assignment_6 ) ) )
            // InternalCompras.g:3581:1: ( ( rule__Relations__TargetLayer2Assignment_6 ) )
            {
            // InternalCompras.g:3581:1: ( ( rule__Relations__TargetLayer2Assignment_6 ) )
            // InternalCompras.g:3582:2: ( rule__Relations__TargetLayer2Assignment_6 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer2Assignment_6()); 
            // InternalCompras.g:3583:2: ( rule__Relations__TargetLayer2Assignment_6 )
            // InternalCompras.g:3583:3: rule__Relations__TargetLayer2Assignment_6
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
    // InternalCompras.g:3591:1: rule__Relations__Group__7 : rule__Relations__Group__7__Impl rule__Relations__Group__8 ;
    public final void rule__Relations__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3595:1: ( rule__Relations__Group__7__Impl rule__Relations__Group__8 )
            // InternalCompras.g:3596:2: rule__Relations__Group__7__Impl rule__Relations__Group__8
            {
            pushFollow(FOLLOW_34);
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
    // InternalCompras.g:3603:1: rule__Relations__Group__7__Impl : ( ( rule__Relations__SourceLayer3Assignment_7 ) ) ;
    public final void rule__Relations__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3607:1: ( ( ( rule__Relations__SourceLayer3Assignment_7 ) ) )
            // InternalCompras.g:3608:1: ( ( rule__Relations__SourceLayer3Assignment_7 ) )
            {
            // InternalCompras.g:3608:1: ( ( rule__Relations__SourceLayer3Assignment_7 ) )
            // InternalCompras.g:3609:2: ( rule__Relations__SourceLayer3Assignment_7 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer3Assignment_7()); 
            // InternalCompras.g:3610:2: ( rule__Relations__SourceLayer3Assignment_7 )
            // InternalCompras.g:3610:3: rule__Relations__SourceLayer3Assignment_7
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
    // InternalCompras.g:3618:1: rule__Relations__Group__8 : rule__Relations__Group__8__Impl rule__Relations__Group__9 ;
    public final void rule__Relations__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3622:1: ( rule__Relations__Group__8__Impl rule__Relations__Group__9 )
            // InternalCompras.g:3623:2: rule__Relations__Group__8__Impl rule__Relations__Group__9
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
    // InternalCompras.g:3630:1: rule__Relations__Group__8__Impl : ( ( rule__Relations__RelationsType3Assignment_8 ) ) ;
    public final void rule__Relations__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3634:1: ( ( ( rule__Relations__RelationsType3Assignment_8 ) ) )
            // InternalCompras.g:3635:1: ( ( rule__Relations__RelationsType3Assignment_8 ) )
            {
            // InternalCompras.g:3635:1: ( ( rule__Relations__RelationsType3Assignment_8 ) )
            // InternalCompras.g:3636:2: ( rule__Relations__RelationsType3Assignment_8 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType3Assignment_8()); 
            // InternalCompras.g:3637:2: ( rule__Relations__RelationsType3Assignment_8 )
            // InternalCompras.g:3637:3: rule__Relations__RelationsType3Assignment_8
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
    // InternalCompras.g:3645:1: rule__Relations__Group__9 : rule__Relations__Group__9__Impl rule__Relations__Group__10 ;
    public final void rule__Relations__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3649:1: ( rule__Relations__Group__9__Impl rule__Relations__Group__10 )
            // InternalCompras.g:3650:2: rule__Relations__Group__9__Impl rule__Relations__Group__10
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
    // InternalCompras.g:3657:1: rule__Relations__Group__9__Impl : ( ( rule__Relations__TargetLayer3Assignment_9 ) ) ;
    public final void rule__Relations__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3661:1: ( ( ( rule__Relations__TargetLayer3Assignment_9 ) ) )
            // InternalCompras.g:3662:1: ( ( rule__Relations__TargetLayer3Assignment_9 ) )
            {
            // InternalCompras.g:3662:1: ( ( rule__Relations__TargetLayer3Assignment_9 ) )
            // InternalCompras.g:3663:2: ( rule__Relations__TargetLayer3Assignment_9 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer3Assignment_9()); 
            // InternalCompras.g:3664:2: ( rule__Relations__TargetLayer3Assignment_9 )
            // InternalCompras.g:3664:3: rule__Relations__TargetLayer3Assignment_9
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
    // InternalCompras.g:3672:1: rule__Relations__Group__10 : rule__Relations__Group__10__Impl rule__Relations__Group__11 ;
    public final void rule__Relations__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3676:1: ( rule__Relations__Group__10__Impl rule__Relations__Group__11 )
            // InternalCompras.g:3677:2: rule__Relations__Group__10__Impl rule__Relations__Group__11
            {
            pushFollow(FOLLOW_34);
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
    // InternalCompras.g:3684:1: rule__Relations__Group__10__Impl : ( ( rule__Relations__SourceLayer4Assignment_10 ) ) ;
    public final void rule__Relations__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3688:1: ( ( ( rule__Relations__SourceLayer4Assignment_10 ) ) )
            // InternalCompras.g:3689:1: ( ( rule__Relations__SourceLayer4Assignment_10 ) )
            {
            // InternalCompras.g:3689:1: ( ( rule__Relations__SourceLayer4Assignment_10 ) )
            // InternalCompras.g:3690:2: ( rule__Relations__SourceLayer4Assignment_10 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer4Assignment_10()); 
            // InternalCompras.g:3691:2: ( rule__Relations__SourceLayer4Assignment_10 )
            // InternalCompras.g:3691:3: rule__Relations__SourceLayer4Assignment_10
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
    // InternalCompras.g:3699:1: rule__Relations__Group__11 : rule__Relations__Group__11__Impl rule__Relations__Group__12 ;
    public final void rule__Relations__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3703:1: ( rule__Relations__Group__11__Impl rule__Relations__Group__12 )
            // InternalCompras.g:3704:2: rule__Relations__Group__11__Impl rule__Relations__Group__12
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
    // InternalCompras.g:3711:1: rule__Relations__Group__11__Impl : ( ( rule__Relations__RelationsType4Assignment_11 ) ) ;
    public final void rule__Relations__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3715:1: ( ( ( rule__Relations__RelationsType4Assignment_11 ) ) )
            // InternalCompras.g:3716:1: ( ( rule__Relations__RelationsType4Assignment_11 ) )
            {
            // InternalCompras.g:3716:1: ( ( rule__Relations__RelationsType4Assignment_11 ) )
            // InternalCompras.g:3717:2: ( rule__Relations__RelationsType4Assignment_11 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType4Assignment_11()); 
            // InternalCompras.g:3718:2: ( rule__Relations__RelationsType4Assignment_11 )
            // InternalCompras.g:3718:3: rule__Relations__RelationsType4Assignment_11
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
    // InternalCompras.g:3726:1: rule__Relations__Group__12 : rule__Relations__Group__12__Impl rule__Relations__Group__13 ;
    public final void rule__Relations__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3730:1: ( rule__Relations__Group__12__Impl rule__Relations__Group__13 )
            // InternalCompras.g:3731:2: rule__Relations__Group__12__Impl rule__Relations__Group__13
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
    // InternalCompras.g:3738:1: rule__Relations__Group__12__Impl : ( ( rule__Relations__TargetLayer4Assignment_12 ) ) ;
    public final void rule__Relations__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3742:1: ( ( ( rule__Relations__TargetLayer4Assignment_12 ) ) )
            // InternalCompras.g:3743:1: ( ( rule__Relations__TargetLayer4Assignment_12 ) )
            {
            // InternalCompras.g:3743:1: ( ( rule__Relations__TargetLayer4Assignment_12 ) )
            // InternalCompras.g:3744:2: ( rule__Relations__TargetLayer4Assignment_12 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer4Assignment_12()); 
            // InternalCompras.g:3745:2: ( rule__Relations__TargetLayer4Assignment_12 )
            // InternalCompras.g:3745:3: rule__Relations__TargetLayer4Assignment_12
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
    // InternalCompras.g:3753:1: rule__Relations__Group__13 : rule__Relations__Group__13__Impl rule__Relations__Group__14 ;
    public final void rule__Relations__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3757:1: ( rule__Relations__Group__13__Impl rule__Relations__Group__14 )
            // InternalCompras.g:3758:2: rule__Relations__Group__13__Impl rule__Relations__Group__14
            {
            pushFollow(FOLLOW_34);
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
    // InternalCompras.g:3765:1: rule__Relations__Group__13__Impl : ( ( rule__Relations__SourceLayer5Assignment_13 ) ) ;
    public final void rule__Relations__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3769:1: ( ( ( rule__Relations__SourceLayer5Assignment_13 ) ) )
            // InternalCompras.g:3770:1: ( ( rule__Relations__SourceLayer5Assignment_13 ) )
            {
            // InternalCompras.g:3770:1: ( ( rule__Relations__SourceLayer5Assignment_13 ) )
            // InternalCompras.g:3771:2: ( rule__Relations__SourceLayer5Assignment_13 )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer5Assignment_13()); 
            // InternalCompras.g:3772:2: ( rule__Relations__SourceLayer5Assignment_13 )
            // InternalCompras.g:3772:3: rule__Relations__SourceLayer5Assignment_13
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
    // InternalCompras.g:3780:1: rule__Relations__Group__14 : rule__Relations__Group__14__Impl rule__Relations__Group__15 ;
    public final void rule__Relations__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3784:1: ( rule__Relations__Group__14__Impl rule__Relations__Group__15 )
            // InternalCompras.g:3785:2: rule__Relations__Group__14__Impl rule__Relations__Group__15
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
    // InternalCompras.g:3792:1: rule__Relations__Group__14__Impl : ( ( rule__Relations__RelationsType5Assignment_14 ) ) ;
    public final void rule__Relations__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3796:1: ( ( ( rule__Relations__RelationsType5Assignment_14 ) ) )
            // InternalCompras.g:3797:1: ( ( rule__Relations__RelationsType5Assignment_14 ) )
            {
            // InternalCompras.g:3797:1: ( ( rule__Relations__RelationsType5Assignment_14 ) )
            // InternalCompras.g:3798:2: ( rule__Relations__RelationsType5Assignment_14 )
            {
             before(grammarAccess.getRelationsAccess().getRelationsType5Assignment_14()); 
            // InternalCompras.g:3799:2: ( rule__Relations__RelationsType5Assignment_14 )
            // InternalCompras.g:3799:3: rule__Relations__RelationsType5Assignment_14
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
    // InternalCompras.g:3807:1: rule__Relations__Group__15 : rule__Relations__Group__15__Impl rule__Relations__Group__16 ;
    public final void rule__Relations__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3811:1: ( rule__Relations__Group__15__Impl rule__Relations__Group__16 )
            // InternalCompras.g:3812:2: rule__Relations__Group__15__Impl rule__Relations__Group__16
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
    // InternalCompras.g:3819:1: rule__Relations__Group__15__Impl : ( ( rule__Relations__TargetLayer5Assignment_15 ) ) ;
    public final void rule__Relations__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3823:1: ( ( ( rule__Relations__TargetLayer5Assignment_15 ) ) )
            // InternalCompras.g:3824:1: ( ( rule__Relations__TargetLayer5Assignment_15 ) )
            {
            // InternalCompras.g:3824:1: ( ( rule__Relations__TargetLayer5Assignment_15 ) )
            // InternalCompras.g:3825:2: ( rule__Relations__TargetLayer5Assignment_15 )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer5Assignment_15()); 
            // InternalCompras.g:3826:2: ( rule__Relations__TargetLayer5Assignment_15 )
            // InternalCompras.g:3826:3: rule__Relations__TargetLayer5Assignment_15
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
    // InternalCompras.g:3834:1: rule__Relations__Group__16 : rule__Relations__Group__16__Impl ;
    public final void rule__Relations__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3838:1: ( rule__Relations__Group__16__Impl )
            // InternalCompras.g:3839:2: rule__Relations__Group__16__Impl
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
    // InternalCompras.g:3845:1: rule__Relations__Group__16__Impl : ( '}' ) ;
    public final void rule__Relations__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3849:1: ( ( '}' ) )
            // InternalCompras.g:3850:1: ( '}' )
            {
            // InternalCompras.g:3850:1: ( '}' )
            // InternalCompras.g:3851:2: '}'
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
    // InternalCompras.g:3861:1: rule__Technology__Group__0 : rule__Technology__Group__0__Impl rule__Technology__Group__1 ;
    public final void rule__Technology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3865:1: ( rule__Technology__Group__0__Impl rule__Technology__Group__1 )
            // InternalCompras.g:3866:2: rule__Technology__Group__0__Impl rule__Technology__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalCompras.g:3873:1: rule__Technology__Group__0__Impl : ( '{' ) ;
    public final void rule__Technology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3877:1: ( ( '{' ) )
            // InternalCompras.g:3878:1: ( '{' )
            {
            // InternalCompras.g:3878:1: ( '{' )
            // InternalCompras.g:3879:2: '{'
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
    // InternalCompras.g:3888:1: rule__Technology__Group__1 : rule__Technology__Group__1__Impl rule__Technology__Group__2 ;
    public final void rule__Technology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3892:1: ( rule__Technology__Group__1__Impl rule__Technology__Group__2 )
            // InternalCompras.g:3893:2: rule__Technology__Group__1__Impl rule__Technology__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalCompras.g:3900:1: rule__Technology__Group__1__Impl : ( ( rule__Technology__Group_1__0 )? ) ;
    public final void rule__Technology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3904:1: ( ( ( rule__Technology__Group_1__0 )? ) )
            // InternalCompras.g:3905:1: ( ( rule__Technology__Group_1__0 )? )
            {
            // InternalCompras.g:3905:1: ( ( rule__Technology__Group_1__0 )? )
            // InternalCompras.g:3906:2: ( rule__Technology__Group_1__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_1()); 
            // InternalCompras.g:3907:2: ( rule__Technology__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==46) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCompras.g:3907:3: rule__Technology__Group_1__0
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
    // InternalCompras.g:3915:1: rule__Technology__Group__2 : rule__Technology__Group__2__Impl rule__Technology__Group__3 ;
    public final void rule__Technology__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3919:1: ( rule__Technology__Group__2__Impl rule__Technology__Group__3 )
            // InternalCompras.g:3920:2: rule__Technology__Group__2__Impl rule__Technology__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalCompras.g:3927:1: rule__Technology__Group__2__Impl : ( ( rule__Technology__Group_2__0 )? ) ;
    public final void rule__Technology__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3931:1: ( ( ( rule__Technology__Group_2__0 )? ) )
            // InternalCompras.g:3932:1: ( ( rule__Technology__Group_2__0 )? )
            {
            // InternalCompras.g:3932:1: ( ( rule__Technology__Group_2__0 )? )
            // InternalCompras.g:3933:2: ( rule__Technology__Group_2__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2()); 
            // InternalCompras.g:3934:2: ( rule__Technology__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCompras.g:3934:3: rule__Technology__Group_2__0
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
    // InternalCompras.g:3942:1: rule__Technology__Group__3 : rule__Technology__Group__3__Impl ;
    public final void rule__Technology__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3946:1: ( rule__Technology__Group__3__Impl )
            // InternalCompras.g:3947:2: rule__Technology__Group__3__Impl
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
    // InternalCompras.g:3953:1: rule__Technology__Group__3__Impl : ( '}' ) ;
    public final void rule__Technology__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3957:1: ( ( '}' ) )
            // InternalCompras.g:3958:1: ( '}' )
            {
            // InternalCompras.g:3958:1: ( '}' )
            // InternalCompras.g:3959:2: '}'
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
    // InternalCompras.g:3969:1: rule__Technology__Group_1__0 : rule__Technology__Group_1__0__Impl rule__Technology__Group_1__1 ;
    public final void rule__Technology__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3973:1: ( rule__Technology__Group_1__0__Impl rule__Technology__Group_1__1 )
            // InternalCompras.g:3974:2: rule__Technology__Group_1__0__Impl rule__Technology__Group_1__1
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
    // InternalCompras.g:3981:1: rule__Technology__Group_1__0__Impl : ( 'AspNet' ) ;
    public final void rule__Technology__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:3985:1: ( ( 'AspNet' ) )
            // InternalCompras.g:3986:1: ( 'AspNet' )
            {
            // InternalCompras.g:3986:1: ( 'AspNet' )
            // InternalCompras.g:3987:2: 'AspNet'
            {
             before(grammarAccess.getTechnologyAccess().getAspNetKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCompras.g:3996:1: rule__Technology__Group_1__1 : rule__Technology__Group_1__1__Impl rule__Technology__Group_1__2 ;
    public final void rule__Technology__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4000:1: ( rule__Technology__Group_1__1__Impl rule__Technology__Group_1__2 )
            // InternalCompras.g:4001:2: rule__Technology__Group_1__1__Impl rule__Technology__Group_1__2
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
    // InternalCompras.g:4008:1: rule__Technology__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4012:1: ( ( ':' ) )
            // InternalCompras.g:4013:1: ( ':' )
            {
            // InternalCompras.g:4013:1: ( ':' )
            // InternalCompras.g:4014:2: ':'
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
    // InternalCompras.g:4023:1: rule__Technology__Group_1__2 : rule__Technology__Group_1__2__Impl rule__Technology__Group_1__3 ;
    public final void rule__Technology__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4027:1: ( rule__Technology__Group_1__2__Impl rule__Technology__Group_1__3 )
            // InternalCompras.g:4028:2: rule__Technology__Group_1__2__Impl rule__Technology__Group_1__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalCompras.g:4035:1: rule__Technology__Group_1__2__Impl : ( '{' ) ;
    public final void rule__Technology__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4039:1: ( ( '{' ) )
            // InternalCompras.g:4040:1: ( '{' )
            {
            // InternalCompras.g:4040:1: ( '{' )
            // InternalCompras.g:4041:2: '{'
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
    // InternalCompras.g:4050:1: rule__Technology__Group_1__3 : rule__Technology__Group_1__3__Impl rule__Technology__Group_1__4 ;
    public final void rule__Technology__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4054:1: ( rule__Technology__Group_1__3__Impl rule__Technology__Group_1__4 )
            // InternalCompras.g:4055:2: rule__Technology__Group_1__3__Impl rule__Technology__Group_1__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalCompras.g:4062:1: rule__Technology__Group_1__3__Impl : ( ( rule__Technology__ModuleTechAssignment_1_3 )* ) ;
    public final void rule__Technology__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4066:1: ( ( ( rule__Technology__ModuleTechAssignment_1_3 )* ) )
            // InternalCompras.g:4067:1: ( ( rule__Technology__ModuleTechAssignment_1_3 )* )
            {
            // InternalCompras.g:4067:1: ( ( rule__Technology__ModuleTechAssignment_1_3 )* )
            // InternalCompras.g:4068:2: ( rule__Technology__ModuleTechAssignment_1_3 )*
            {
             before(grammarAccess.getTechnologyAccess().getModuleTechAssignment_1_3()); 
            // InternalCompras.g:4069:2: ( rule__Technology__ModuleTechAssignment_1_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCompras.g:4069:3: rule__Technology__ModuleTechAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Technology__ModuleTechAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalCompras.g:4077:1: rule__Technology__Group_1__4 : rule__Technology__Group_1__4__Impl ;
    public final void rule__Technology__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4081:1: ( rule__Technology__Group_1__4__Impl )
            // InternalCompras.g:4082:2: rule__Technology__Group_1__4__Impl
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
    // InternalCompras.g:4088:1: rule__Technology__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Technology__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4092:1: ( ( '}' ) )
            // InternalCompras.g:4093:1: ( '}' )
            {
            // InternalCompras.g:4093:1: ( '}' )
            // InternalCompras.g:4094:2: '}'
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
    // InternalCompras.g:4104:1: rule__Technology__Group_2__0 : rule__Technology__Group_2__0__Impl rule__Technology__Group_2__1 ;
    public final void rule__Technology__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4108:1: ( rule__Technology__Group_2__0__Impl rule__Technology__Group_2__1 )
            // InternalCompras.g:4109:2: rule__Technology__Group_2__0__Impl rule__Technology__Group_2__1
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
    // InternalCompras.g:4116:1: rule__Technology__Group_2__0__Impl : ( 'Database' ) ;
    public final void rule__Technology__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4120:1: ( ( 'Database' ) )
            // InternalCompras.g:4121:1: ( 'Database' )
            {
            // InternalCompras.g:4121:1: ( 'Database' )
            // InternalCompras.g:4122:2: 'Database'
            {
             before(grammarAccess.getTechnologyAccess().getDatabaseKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCompras.g:4131:1: rule__Technology__Group_2__1 : rule__Technology__Group_2__1__Impl rule__Technology__Group_2__2 ;
    public final void rule__Technology__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4135:1: ( rule__Technology__Group_2__1__Impl rule__Technology__Group_2__2 )
            // InternalCompras.g:4136:2: rule__Technology__Group_2__1__Impl rule__Technology__Group_2__2
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
    // InternalCompras.g:4143:1: rule__Technology__Group_2__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4147:1: ( ( ':' ) )
            // InternalCompras.g:4148:1: ( ':' )
            {
            // InternalCompras.g:4148:1: ( ':' )
            // InternalCompras.g:4149:2: ':'
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
    // InternalCompras.g:4158:1: rule__Technology__Group_2__2 : rule__Technology__Group_2__2__Impl rule__Technology__Group_2__3 ;
    public final void rule__Technology__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4162:1: ( rule__Technology__Group_2__2__Impl rule__Technology__Group_2__3 )
            // InternalCompras.g:4163:2: rule__Technology__Group_2__2__Impl rule__Technology__Group_2__3
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
    // InternalCompras.g:4170:1: rule__Technology__Group_2__2__Impl : ( '{' ) ;
    public final void rule__Technology__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4174:1: ( ( '{' ) )
            // InternalCompras.g:4175:1: ( '{' )
            {
            // InternalCompras.g:4175:1: ( '{' )
            // InternalCompras.g:4176:2: '{'
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
    // InternalCompras.g:4185:1: rule__Technology__Group_2__3 : rule__Technology__Group_2__3__Impl rule__Technology__Group_2__4 ;
    public final void rule__Technology__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4189:1: ( rule__Technology__Group_2__3__Impl rule__Technology__Group_2__4 )
            // InternalCompras.g:4190:2: rule__Technology__Group_2__3__Impl rule__Technology__Group_2__4
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
    // InternalCompras.g:4197:1: rule__Technology__Group_2__3__Impl : ( ( rule__Technology__Group_2_3__0 )? ) ;
    public final void rule__Technology__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4201:1: ( ( ( rule__Technology__Group_2_3__0 )? ) )
            // InternalCompras.g:4202:1: ( ( rule__Technology__Group_2_3__0 )? )
            {
            // InternalCompras.g:4202:1: ( ( rule__Technology__Group_2_3__0 )? )
            // InternalCompras.g:4203:2: ( rule__Technology__Group_2_3__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2_3()); 
            // InternalCompras.g:4204:2: ( rule__Technology__Group_2_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCompras.g:4204:3: rule__Technology__Group_2_3__0
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
    // InternalCompras.g:4212:1: rule__Technology__Group_2__4 : rule__Technology__Group_2__4__Impl ;
    public final void rule__Technology__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4216:1: ( rule__Technology__Group_2__4__Impl )
            // InternalCompras.g:4217:2: rule__Technology__Group_2__4__Impl
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
    // InternalCompras.g:4223:1: rule__Technology__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Technology__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4227:1: ( ( '}' ) )
            // InternalCompras.g:4228:1: ( '}' )
            {
            // InternalCompras.g:4228:1: ( '}' )
            // InternalCompras.g:4229:2: '}'
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
    // InternalCompras.g:4239:1: rule__Technology__Group_2_3__0 : rule__Technology__Group_2_3__0__Impl rule__Technology__Group_2_3__1 ;
    public final void rule__Technology__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4243:1: ( rule__Technology__Group_2_3__0__Impl rule__Technology__Group_2_3__1 )
            // InternalCompras.g:4244:2: rule__Technology__Group_2_3__0__Impl rule__Technology__Group_2_3__1
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
    // InternalCompras.g:4251:1: rule__Technology__Group_2_3__0__Impl : ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) ) ;
    public final void rule__Technology__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4255:1: ( ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) ) )
            // InternalCompras.g:4256:1: ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) )
            {
            // InternalCompras.g:4256:1: ( ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 ) )
            // InternalCompras.g:4257:2: ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 )
            {
             before(grammarAccess.getTechnologyAccess().getDbConnectorSegmentLayerAssignment_2_3_0()); 
            // InternalCompras.g:4258:2: ( rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 )
            // InternalCompras.g:4258:3: rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0
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
    // InternalCompras.g:4266:1: rule__Technology__Group_2_3__1 : rule__Technology__Group_2_3__1__Impl rule__Technology__Group_2_3__2 ;
    public final void rule__Technology__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4270:1: ( rule__Technology__Group_2_3__1__Impl rule__Technology__Group_2_3__2 )
            // InternalCompras.g:4271:2: rule__Technology__Group_2_3__1__Impl rule__Technology__Group_2_3__2
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
    // InternalCompras.g:4278:1: rule__Technology__Group_2_3__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4282:1: ( ( ':' ) )
            // InternalCompras.g:4283:1: ( ':' )
            {
            // InternalCompras.g:4283:1: ( ':' )
            // InternalCompras.g:4284:2: ':'
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
    // InternalCompras.g:4293:1: rule__Technology__Group_2_3__2 : rule__Technology__Group_2_3__2__Impl rule__Technology__Group_2_3__3 ;
    public final void rule__Technology__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4297:1: ( rule__Technology__Group_2_3__2__Impl rule__Technology__Group_2_3__3 )
            // InternalCompras.g:4298:2: rule__Technology__Group_2_3__2__Impl rule__Technology__Group_2_3__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalCompras.g:4305:1: rule__Technology__Group_2_3__2__Impl : ( '{' ) ;
    public final void rule__Technology__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4309:1: ( ( '{' ) )
            // InternalCompras.g:4310:1: ( '{' )
            {
            // InternalCompras.g:4310:1: ( '{' )
            // InternalCompras.g:4311:2: '{'
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
    // InternalCompras.g:4320:1: rule__Technology__Group_2_3__3 : rule__Technology__Group_2_3__3__Impl rule__Technology__Group_2_3__4 ;
    public final void rule__Technology__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4324:1: ( rule__Technology__Group_2_3__3__Impl rule__Technology__Group_2_3__4 )
            // InternalCompras.g:4325:2: rule__Technology__Group_2_3__3__Impl rule__Technology__Group_2_3__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalCompras.g:4332:1: rule__Technology__Group_2_3__3__Impl : ( ( rule__Technology__Group_2_3_3__0 )? ) ;
    public final void rule__Technology__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4336:1: ( ( ( rule__Technology__Group_2_3_3__0 )? ) )
            // InternalCompras.g:4337:1: ( ( rule__Technology__Group_2_3_3__0 )? )
            {
            // InternalCompras.g:4337:1: ( ( rule__Technology__Group_2_3_3__0 )? )
            // InternalCompras.g:4338:2: ( rule__Technology__Group_2_3_3__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2_3_3()); 
            // InternalCompras.g:4339:2: ( rule__Technology__Group_2_3_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCompras.g:4339:3: rule__Technology__Group_2_3_3__0
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
    // InternalCompras.g:4347:1: rule__Technology__Group_2_3__4 : rule__Technology__Group_2_3__4__Impl rule__Technology__Group_2_3__5 ;
    public final void rule__Technology__Group_2_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4351:1: ( rule__Technology__Group_2_3__4__Impl rule__Technology__Group_2_3__5 )
            // InternalCompras.g:4352:2: rule__Technology__Group_2_3__4__Impl rule__Technology__Group_2_3__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalCompras.g:4359:1: rule__Technology__Group_2_3__4__Impl : ( ( rule__Technology__Group_2_3_4__0 )? ) ;
    public final void rule__Technology__Group_2_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4363:1: ( ( ( rule__Technology__Group_2_3_4__0 )? ) )
            // InternalCompras.g:4364:1: ( ( rule__Technology__Group_2_3_4__0 )? )
            {
            // InternalCompras.g:4364:1: ( ( rule__Technology__Group_2_3_4__0 )? )
            // InternalCompras.g:4365:2: ( rule__Technology__Group_2_3_4__0 )?
            {
             before(grammarAccess.getTechnologyAccess().getGroup_2_3_4()); 
            // InternalCompras.g:4366:2: ( rule__Technology__Group_2_3_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==49) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCompras.g:4366:3: rule__Technology__Group_2_3_4__0
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
    // InternalCompras.g:4374:1: rule__Technology__Group_2_3__5 : rule__Technology__Group_2_3__5__Impl ;
    public final void rule__Technology__Group_2_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4378:1: ( rule__Technology__Group_2_3__5__Impl )
            // InternalCompras.g:4379:2: rule__Technology__Group_2_3__5__Impl
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
    // InternalCompras.g:4385:1: rule__Technology__Group_2_3__5__Impl : ( '}' ) ;
    public final void rule__Technology__Group_2_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4389:1: ( ( '}' ) )
            // InternalCompras.g:4390:1: ( '}' )
            {
            // InternalCompras.g:4390:1: ( '}' )
            // InternalCompras.g:4391:2: '}'
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
    // InternalCompras.g:4401:1: rule__Technology__Group_2_3_3__0 : rule__Technology__Group_2_3_3__0__Impl rule__Technology__Group_2_3_3__1 ;
    public final void rule__Technology__Group_2_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4405:1: ( rule__Technology__Group_2_3_3__0__Impl rule__Technology__Group_2_3_3__1 )
            // InternalCompras.g:4406:2: rule__Technology__Group_2_3_3__0__Impl rule__Technology__Group_2_3_3__1
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
    // InternalCompras.g:4413:1: rule__Technology__Group_2_3_3__0__Impl : ( 'DatabaseRDBMSType' ) ;
    public final void rule__Technology__Group_2_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4417:1: ( ( 'DatabaseRDBMSType' ) )
            // InternalCompras.g:4418:1: ( 'DatabaseRDBMSType' )
            {
            // InternalCompras.g:4418:1: ( 'DatabaseRDBMSType' )
            // InternalCompras.g:4419:2: 'DatabaseRDBMSType'
            {
             before(grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeKeyword_2_3_3_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCompras.g:4428:1: rule__Technology__Group_2_3_3__1 : rule__Technology__Group_2_3_3__1__Impl rule__Technology__Group_2_3_3__2 ;
    public final void rule__Technology__Group_2_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4432:1: ( rule__Technology__Group_2_3_3__1__Impl rule__Technology__Group_2_3_3__2 )
            // InternalCompras.g:4433:2: rule__Technology__Group_2_3_3__1__Impl rule__Technology__Group_2_3_3__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalCompras.g:4440:1: rule__Technology__Group_2_3_3__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4444:1: ( ( ':' ) )
            // InternalCompras.g:4445:1: ( ':' )
            {
            // InternalCompras.g:4445:1: ( ':' )
            // InternalCompras.g:4446:2: ':'
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
    // InternalCompras.g:4455:1: rule__Technology__Group_2_3_3__2 : rule__Technology__Group_2_3_3__2__Impl ;
    public final void rule__Technology__Group_2_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4459:1: ( rule__Technology__Group_2_3_3__2__Impl )
            // InternalCompras.g:4460:2: rule__Technology__Group_2_3_3__2__Impl
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
    // InternalCompras.g:4466:1: rule__Technology__Group_2_3_3__2__Impl : ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) ) ;
    public final void rule__Technology__Group_2_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4470:1: ( ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) ) )
            // InternalCompras.g:4471:1: ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) )
            {
            // InternalCompras.g:4471:1: ( ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 ) )
            // InternalCompras.g:4472:2: ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 )
            {
             before(grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeAssignment_2_3_3_2()); 
            // InternalCompras.g:4473:2: ( rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 )
            // InternalCompras.g:4473:3: rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2
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
    // InternalCompras.g:4482:1: rule__Technology__Group_2_3_4__0 : rule__Technology__Group_2_3_4__0__Impl rule__Technology__Group_2_3_4__1 ;
    public final void rule__Technology__Group_2_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4486:1: ( rule__Technology__Group_2_3_4__0__Impl rule__Technology__Group_2_3_4__1 )
            // InternalCompras.g:4487:2: rule__Technology__Group_2_3_4__0__Impl rule__Technology__Group_2_3_4__1
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
    // InternalCompras.g:4494:1: rule__Technology__Group_2_3_4__0__Impl : ( 'ConnectionString' ) ;
    public final void rule__Technology__Group_2_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4498:1: ( ( 'ConnectionString' ) )
            // InternalCompras.g:4499:1: ( 'ConnectionString' )
            {
            // InternalCompras.g:4499:1: ( 'ConnectionString' )
            // InternalCompras.g:4500:2: 'ConnectionString'
            {
             before(grammarAccess.getTechnologyAccess().getConnectionStringKeyword_2_3_4_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCompras.g:4509:1: rule__Technology__Group_2_3_4__1 : rule__Technology__Group_2_3_4__1__Impl rule__Technology__Group_2_3_4__2 ;
    public final void rule__Technology__Group_2_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4513:1: ( rule__Technology__Group_2_3_4__1__Impl rule__Technology__Group_2_3_4__2 )
            // InternalCompras.g:4514:2: rule__Technology__Group_2_3_4__1__Impl rule__Technology__Group_2_3_4__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalCompras.g:4521:1: rule__Technology__Group_2_3_4__1__Impl : ( ':' ) ;
    public final void rule__Technology__Group_2_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4525:1: ( ( ':' ) )
            // InternalCompras.g:4526:1: ( ':' )
            {
            // InternalCompras.g:4526:1: ( ':' )
            // InternalCompras.g:4527:2: ':'
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
    // InternalCompras.g:4536:1: rule__Technology__Group_2_3_4__2 : rule__Technology__Group_2_3_4__2__Impl ;
    public final void rule__Technology__Group_2_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4540:1: ( rule__Technology__Group_2_3_4__2__Impl )
            // InternalCompras.g:4541:2: rule__Technology__Group_2_3_4__2__Impl
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
    // InternalCompras.g:4547:1: rule__Technology__Group_2_3_4__2__Impl : ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) ) ;
    public final void rule__Technology__Group_2_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4551:1: ( ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) ) )
            // InternalCompras.g:4552:1: ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) )
            {
            // InternalCompras.g:4552:1: ( ( rule__Technology__ConnectionStringAssignment_2_3_4_2 ) )
            // InternalCompras.g:4553:2: ( rule__Technology__ConnectionStringAssignment_2_3_4_2 )
            {
             before(grammarAccess.getTechnologyAccess().getConnectionStringAssignment_2_3_4_2()); 
            // InternalCompras.g:4554:2: ( rule__Technology__ConnectionStringAssignment_2_3_4_2 )
            // InternalCompras.g:4554:3: rule__Technology__ConnectionStringAssignment_2_3_4_2
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
    // InternalCompras.g:4563:1: rule__ModuleTech__Group__0 : rule__ModuleTech__Group__0__Impl rule__ModuleTech__Group__1 ;
    public final void rule__ModuleTech__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4567:1: ( rule__ModuleTech__Group__0__Impl rule__ModuleTech__Group__1 )
            // InternalCompras.g:4568:2: rule__ModuleTech__Group__0__Impl rule__ModuleTech__Group__1
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
    // InternalCompras.g:4575:1: rule__ModuleTech__Group__0__Impl : ( 'Module' ) ;
    public final void rule__ModuleTech__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4579:1: ( ( 'Module' ) )
            // InternalCompras.g:4580:1: ( 'Module' )
            {
            // InternalCompras.g:4580:1: ( 'Module' )
            // InternalCompras.g:4581:2: 'Module'
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
    // InternalCompras.g:4590:1: rule__ModuleTech__Group__1 : rule__ModuleTech__Group__1__Impl rule__ModuleTech__Group__2 ;
    public final void rule__ModuleTech__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4594:1: ( rule__ModuleTech__Group__1__Impl rule__ModuleTech__Group__2 )
            // InternalCompras.g:4595:2: rule__ModuleTech__Group__1__Impl rule__ModuleTech__Group__2
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
    // InternalCompras.g:4602:1: rule__ModuleTech__Group__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4606:1: ( ( ':' ) )
            // InternalCompras.g:4607:1: ( ':' )
            {
            // InternalCompras.g:4607:1: ( ':' )
            // InternalCompras.g:4608:2: ':'
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
    // InternalCompras.g:4617:1: rule__ModuleTech__Group__2 : rule__ModuleTech__Group__2__Impl rule__ModuleTech__Group__3 ;
    public final void rule__ModuleTech__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4621:1: ( rule__ModuleTech__Group__2__Impl rule__ModuleTech__Group__3 )
            // InternalCompras.g:4622:2: rule__ModuleTech__Group__2__Impl rule__ModuleTech__Group__3
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
    // InternalCompras.g:4629:1: rule__ModuleTech__Group__2__Impl : ( ( rule__ModuleTech__NameAssignment_2 ) ) ;
    public final void rule__ModuleTech__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4633:1: ( ( ( rule__ModuleTech__NameAssignment_2 ) ) )
            // InternalCompras.g:4634:1: ( ( rule__ModuleTech__NameAssignment_2 ) )
            {
            // InternalCompras.g:4634:1: ( ( rule__ModuleTech__NameAssignment_2 ) )
            // InternalCompras.g:4635:2: ( rule__ModuleTech__NameAssignment_2 )
            {
             before(grammarAccess.getModuleTechAccess().getNameAssignment_2()); 
            // InternalCompras.g:4636:2: ( rule__ModuleTech__NameAssignment_2 )
            // InternalCompras.g:4636:3: rule__ModuleTech__NameAssignment_2
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
    // InternalCompras.g:4644:1: rule__ModuleTech__Group__3 : rule__ModuleTech__Group__3__Impl rule__ModuleTech__Group__4 ;
    public final void rule__ModuleTech__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4648:1: ( rule__ModuleTech__Group__3__Impl rule__ModuleTech__Group__4 )
            // InternalCompras.g:4649:2: rule__ModuleTech__Group__3__Impl rule__ModuleTech__Group__4
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
    // InternalCompras.g:4656:1: rule__ModuleTech__Group__3__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4660:1: ( ( ':' ) )
            // InternalCompras.g:4661:1: ( ':' )
            {
            // InternalCompras.g:4661:1: ( ':' )
            // InternalCompras.g:4662:2: ':'
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
    // InternalCompras.g:4671:1: rule__ModuleTech__Group__4 : rule__ModuleTech__Group__4__Impl rule__ModuleTech__Group__5 ;
    public final void rule__ModuleTech__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4675:1: ( rule__ModuleTech__Group__4__Impl rule__ModuleTech__Group__5 )
            // InternalCompras.g:4676:2: rule__ModuleTech__Group__4__Impl rule__ModuleTech__Group__5
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
    // InternalCompras.g:4683:1: rule__ModuleTech__Group__4__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4687:1: ( ( '{' ) )
            // InternalCompras.g:4688:1: ( '{' )
            {
            // InternalCompras.g:4688:1: ( '{' )
            // InternalCompras.g:4689:2: '{'
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
    // InternalCompras.g:4698:1: rule__ModuleTech__Group__5 : rule__ModuleTech__Group__5__Impl rule__ModuleTech__Group__6 ;
    public final void rule__ModuleTech__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4702:1: ( rule__ModuleTech__Group__5__Impl rule__ModuleTech__Group__6 )
            // InternalCompras.g:4703:2: rule__ModuleTech__Group__5__Impl rule__ModuleTech__Group__6
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
    // InternalCompras.g:4710:1: rule__ModuleTech__Group__5__Impl : ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) ) ;
    public final void rule__ModuleTech__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4714:1: ( ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) ) )
            // InternalCompras.g:4715:1: ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) )
            {
            // InternalCompras.g:4715:1: ( ( rule__ModuleTech__PresentationLayerAssignment_5 ) )
            // InternalCompras.g:4716:2: ( rule__ModuleTech__PresentationLayerAssignment_5 )
            {
             before(grammarAccess.getModuleTechAccess().getPresentationLayerAssignment_5()); 
            // InternalCompras.g:4717:2: ( rule__ModuleTech__PresentationLayerAssignment_5 )
            // InternalCompras.g:4717:3: rule__ModuleTech__PresentationLayerAssignment_5
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
    // InternalCompras.g:4725:1: rule__ModuleTech__Group__6 : rule__ModuleTech__Group__6__Impl rule__ModuleTech__Group__7 ;
    public final void rule__ModuleTech__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4729:1: ( rule__ModuleTech__Group__6__Impl rule__ModuleTech__Group__7 )
            // InternalCompras.g:4730:2: rule__ModuleTech__Group__6__Impl rule__ModuleTech__Group__7
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
    // InternalCompras.g:4737:1: rule__ModuleTech__Group__6__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4741:1: ( ( ':' ) )
            // InternalCompras.g:4742:1: ( ':' )
            {
            // InternalCompras.g:4742:1: ( ':' )
            // InternalCompras.g:4743:2: ':'
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
    // InternalCompras.g:4752:1: rule__ModuleTech__Group__7 : rule__ModuleTech__Group__7__Impl rule__ModuleTech__Group__8 ;
    public final void rule__ModuleTech__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4756:1: ( rule__ModuleTech__Group__7__Impl rule__ModuleTech__Group__8 )
            // InternalCompras.g:4757:2: rule__ModuleTech__Group__7__Impl rule__ModuleTech__Group__8
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
    // InternalCompras.g:4764:1: rule__ModuleTech__Group__7__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4768:1: ( ( '{' ) )
            // InternalCompras.g:4769:1: ( '{' )
            {
            // InternalCompras.g:4769:1: ( '{' )
            // InternalCompras.g:4770:2: '{'
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
    // InternalCompras.g:4779:1: rule__ModuleTech__Group__8 : rule__ModuleTech__Group__8__Impl rule__ModuleTech__Group__9 ;
    public final void rule__ModuleTech__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4783:1: ( rule__ModuleTech__Group__8__Impl rule__ModuleTech__Group__9 )
            // InternalCompras.g:4784:2: rule__ModuleTech__Group__8__Impl rule__ModuleTech__Group__9
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
    // InternalCompras.g:4791:1: rule__ModuleTech__Group__8__Impl : ( ( rule__ModuleTech__Group_8__0 )? ) ;
    public final void rule__ModuleTech__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4795:1: ( ( ( rule__ModuleTech__Group_8__0 )? ) )
            // InternalCompras.g:4796:1: ( ( rule__ModuleTech__Group_8__0 )? )
            {
            // InternalCompras.g:4796:1: ( ( rule__ModuleTech__Group_8__0 )? )
            // InternalCompras.g:4797:2: ( rule__ModuleTech__Group_8__0 )?
            {
             before(grammarAccess.getModuleTechAccess().getGroup_8()); 
            // InternalCompras.g:4798:2: ( rule__ModuleTech__Group_8__0 )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalCompras.g:4798:3: rule__ModuleTech__Group_8__0
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
    // InternalCompras.g:4806:1: rule__ModuleTech__Group__9 : rule__ModuleTech__Group__9__Impl rule__ModuleTech__Group__10 ;
    public final void rule__ModuleTech__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4810:1: ( rule__ModuleTech__Group__9__Impl rule__ModuleTech__Group__10 )
            // InternalCompras.g:4811:2: rule__ModuleTech__Group__9__Impl rule__ModuleTech__Group__10
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
    // InternalCompras.g:4818:1: rule__ModuleTech__Group__9__Impl : ( ( rule__ModuleTech__Group_9__0 )? ) ;
    public final void rule__ModuleTech__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4822:1: ( ( ( rule__ModuleTech__Group_9__0 )? ) )
            // InternalCompras.g:4823:1: ( ( rule__ModuleTech__Group_9__0 )? )
            {
            // InternalCompras.g:4823:1: ( ( rule__ModuleTech__Group_9__0 )? )
            // InternalCompras.g:4824:2: ( rule__ModuleTech__Group_9__0 )?
            {
             before(grammarAccess.getModuleTechAccess().getGroup_9()); 
            // InternalCompras.g:4825:2: ( rule__ModuleTech__Group_9__0 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalCompras.g:4825:3: rule__ModuleTech__Group_9__0
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
    // InternalCompras.g:4833:1: rule__ModuleTech__Group__10 : rule__ModuleTech__Group__10__Impl rule__ModuleTech__Group__11 ;
    public final void rule__ModuleTech__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4837:1: ( rule__ModuleTech__Group__10__Impl rule__ModuleTech__Group__11 )
            // InternalCompras.g:4838:2: rule__ModuleTech__Group__10__Impl rule__ModuleTech__Group__11
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
    // InternalCompras.g:4845:1: rule__ModuleTech__Group__10__Impl : ( ( rule__ModuleTech__Group_10__0 )? ) ;
    public final void rule__ModuleTech__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4849:1: ( ( ( rule__ModuleTech__Group_10__0 )? ) )
            // InternalCompras.g:4850:1: ( ( rule__ModuleTech__Group_10__0 )? )
            {
            // InternalCompras.g:4850:1: ( ( rule__ModuleTech__Group_10__0 )? )
            // InternalCompras.g:4851:2: ( rule__ModuleTech__Group_10__0 )?
            {
             before(grammarAccess.getModuleTechAccess().getGroup_10()); 
            // InternalCompras.g:4852:2: ( rule__ModuleTech__Group_10__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCompras.g:4852:3: rule__ModuleTech__Group_10__0
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
    // InternalCompras.g:4860:1: rule__ModuleTech__Group__11 : rule__ModuleTech__Group__11__Impl rule__ModuleTech__Group__12 ;
    public final void rule__ModuleTech__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4864:1: ( rule__ModuleTech__Group__11__Impl rule__ModuleTech__Group__12 )
            // InternalCompras.g:4865:2: rule__ModuleTech__Group__11__Impl rule__ModuleTech__Group__12
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
    // InternalCompras.g:4872:1: rule__ModuleTech__Group__11__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4876:1: ( ( '}' ) )
            // InternalCompras.g:4877:1: ( '}' )
            {
            // InternalCompras.g:4877:1: ( '}' )
            // InternalCompras.g:4878:2: '}'
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
    // InternalCompras.g:4887:1: rule__ModuleTech__Group__12 : rule__ModuleTech__Group__12__Impl rule__ModuleTech__Group__13 ;
    public final void rule__ModuleTech__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4891:1: ( rule__ModuleTech__Group__12__Impl rule__ModuleTech__Group__13 )
            // InternalCompras.g:4892:2: rule__ModuleTech__Group__12__Impl rule__ModuleTech__Group__13
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
    // InternalCompras.g:4899:1: rule__ModuleTech__Group__12__Impl : ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) ) ;
    public final void rule__ModuleTech__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4903:1: ( ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) ) )
            // InternalCompras.g:4904:1: ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) )
            {
            // InternalCompras.g:4904:1: ( ( rule__ModuleTech__BusinessLayerAssignment_12 ) )
            // InternalCompras.g:4905:2: ( rule__ModuleTech__BusinessLayerAssignment_12 )
            {
             before(grammarAccess.getModuleTechAccess().getBusinessLayerAssignment_12()); 
            // InternalCompras.g:4906:2: ( rule__ModuleTech__BusinessLayerAssignment_12 )
            // InternalCompras.g:4906:3: rule__ModuleTech__BusinessLayerAssignment_12
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
    // InternalCompras.g:4914:1: rule__ModuleTech__Group__13 : rule__ModuleTech__Group__13__Impl rule__ModuleTech__Group__14 ;
    public final void rule__ModuleTech__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4918:1: ( rule__ModuleTech__Group__13__Impl rule__ModuleTech__Group__14 )
            // InternalCompras.g:4919:2: rule__ModuleTech__Group__13__Impl rule__ModuleTech__Group__14
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
    // InternalCompras.g:4926:1: rule__ModuleTech__Group__13__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4930:1: ( ( ':' ) )
            // InternalCompras.g:4931:1: ( ':' )
            {
            // InternalCompras.g:4931:1: ( ':' )
            // InternalCompras.g:4932:2: ':'
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
    // InternalCompras.g:4941:1: rule__ModuleTech__Group__14 : rule__ModuleTech__Group__14__Impl rule__ModuleTech__Group__15 ;
    public final void rule__ModuleTech__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4945:1: ( rule__ModuleTech__Group__14__Impl rule__ModuleTech__Group__15 )
            // InternalCompras.g:4946:2: rule__ModuleTech__Group__14__Impl rule__ModuleTech__Group__15
            {
            pushFollow(FOLLOW_40);
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
    // InternalCompras.g:4953:1: rule__ModuleTech__Group__14__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4957:1: ( ( '{' ) )
            // InternalCompras.g:4958:1: ( '{' )
            {
            // InternalCompras.g:4958:1: ( '{' )
            // InternalCompras.g:4959:2: '{'
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
    // InternalCompras.g:4968:1: rule__ModuleTech__Group__15 : rule__ModuleTech__Group__15__Impl rule__ModuleTech__Group__16 ;
    public final void rule__ModuleTech__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4972:1: ( rule__ModuleTech__Group__15__Impl rule__ModuleTech__Group__16 )
            // InternalCompras.g:4973:2: rule__ModuleTech__Group__15__Impl rule__ModuleTech__Group__16
            {
            pushFollow(FOLLOW_40);
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
    // InternalCompras.g:4980:1: rule__ModuleTech__Group__15__Impl : ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* ) ;
    public final void rule__ModuleTech__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4984:1: ( ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* ) )
            // InternalCompras.g:4985:1: ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* )
            {
            // InternalCompras.g:4985:1: ( ( rule__ModuleTech__BusinessLayerRefAssignment_15 )* )
            // InternalCompras.g:4986:2: ( rule__ModuleTech__BusinessLayerRefAssignment_15 )*
            {
             before(grammarAccess.getModuleTechAccess().getBusinessLayerRefAssignment_15()); 
            // InternalCompras.g:4987:2: ( rule__ModuleTech__BusinessLayerRefAssignment_15 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==53) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCompras.g:4987:3: rule__ModuleTech__BusinessLayerRefAssignment_15
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__ModuleTech__BusinessLayerRefAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalCompras.g:4995:1: rule__ModuleTech__Group__16 : rule__ModuleTech__Group__16__Impl rule__ModuleTech__Group__17 ;
    public final void rule__ModuleTech__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:4999:1: ( rule__ModuleTech__Group__16__Impl rule__ModuleTech__Group__17 )
            // InternalCompras.g:5000:2: rule__ModuleTech__Group__16__Impl rule__ModuleTech__Group__17
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
    // InternalCompras.g:5007:1: rule__ModuleTech__Group__16__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5011:1: ( ( '}' ) )
            // InternalCompras.g:5012:1: ( '}' )
            {
            // InternalCompras.g:5012:1: ( '}' )
            // InternalCompras.g:5013:2: '}'
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
    // InternalCompras.g:5022:1: rule__ModuleTech__Group__17 : rule__ModuleTech__Group__17__Impl rule__ModuleTech__Group__18 ;
    public final void rule__ModuleTech__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5026:1: ( rule__ModuleTech__Group__17__Impl rule__ModuleTech__Group__18 )
            // InternalCompras.g:5027:2: rule__ModuleTech__Group__17__Impl rule__ModuleTech__Group__18
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
    // InternalCompras.g:5034:1: rule__ModuleTech__Group__17__Impl : ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) ) ;
    public final void rule__ModuleTech__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5038:1: ( ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) ) )
            // InternalCompras.g:5039:1: ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) )
            {
            // InternalCompras.g:5039:1: ( ( rule__ModuleTech__DataAccessLayerAssignment_17 ) )
            // InternalCompras.g:5040:2: ( rule__ModuleTech__DataAccessLayerAssignment_17 )
            {
             before(grammarAccess.getModuleTechAccess().getDataAccessLayerAssignment_17()); 
            // InternalCompras.g:5041:2: ( rule__ModuleTech__DataAccessLayerAssignment_17 )
            // InternalCompras.g:5041:3: rule__ModuleTech__DataAccessLayerAssignment_17
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
    // InternalCompras.g:5049:1: rule__ModuleTech__Group__18 : rule__ModuleTech__Group__18__Impl rule__ModuleTech__Group__19 ;
    public final void rule__ModuleTech__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5053:1: ( rule__ModuleTech__Group__18__Impl rule__ModuleTech__Group__19 )
            // InternalCompras.g:5054:2: rule__ModuleTech__Group__18__Impl rule__ModuleTech__Group__19
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
    // InternalCompras.g:5061:1: rule__ModuleTech__Group__18__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5065:1: ( ( ':' ) )
            // InternalCompras.g:5066:1: ( ':' )
            {
            // InternalCompras.g:5066:1: ( ':' )
            // InternalCompras.g:5067:2: ':'
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
    // InternalCompras.g:5076:1: rule__ModuleTech__Group__19 : rule__ModuleTech__Group__19__Impl rule__ModuleTech__Group__20 ;
    public final void rule__ModuleTech__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5080:1: ( rule__ModuleTech__Group__19__Impl rule__ModuleTech__Group__20 )
            // InternalCompras.g:5081:2: rule__ModuleTech__Group__19__Impl rule__ModuleTech__Group__20
            {
            pushFollow(FOLLOW_42);
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
    // InternalCompras.g:5088:1: rule__ModuleTech__Group__19__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5092:1: ( ( '{' ) )
            // InternalCompras.g:5093:1: ( '{' )
            {
            // InternalCompras.g:5093:1: ( '{' )
            // InternalCompras.g:5094:2: '{'
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
    // InternalCompras.g:5103:1: rule__ModuleTech__Group__20 : rule__ModuleTech__Group__20__Impl rule__ModuleTech__Group__21 ;
    public final void rule__ModuleTech__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5107:1: ( rule__ModuleTech__Group__20__Impl rule__ModuleTech__Group__21 )
            // InternalCompras.g:5108:2: rule__ModuleTech__Group__20__Impl rule__ModuleTech__Group__21
            {
            pushFollow(FOLLOW_42);
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
    // InternalCompras.g:5115:1: rule__ModuleTech__Group__20__Impl : ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* ) ;
    public final void rule__ModuleTech__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5119:1: ( ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* ) )
            // InternalCompras.g:5120:1: ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* )
            {
            // InternalCompras.g:5120:1: ( ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )* )
            // InternalCompras.g:5121:2: ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )*
            {
             before(grammarAccess.getModuleTechAccess().getDataAccessLayerRefAssignment_20()); 
            // InternalCompras.g:5122:2: ( rule__ModuleTech__DataAccessLayerRefAssignment_20 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==54) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCompras.g:5122:3: rule__ModuleTech__DataAccessLayerRefAssignment_20
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__ModuleTech__DataAccessLayerRefAssignment_20();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalCompras.g:5130:1: rule__ModuleTech__Group__21 : rule__ModuleTech__Group__21__Impl rule__ModuleTech__Group__22 ;
    public final void rule__ModuleTech__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5134:1: ( rule__ModuleTech__Group__21__Impl rule__ModuleTech__Group__22 )
            // InternalCompras.g:5135:2: rule__ModuleTech__Group__21__Impl rule__ModuleTech__Group__22
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
    // InternalCompras.g:5142:1: rule__ModuleTech__Group__21__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5146:1: ( ( '}' ) )
            // InternalCompras.g:5147:1: ( '}' )
            {
            // InternalCompras.g:5147:1: ( '}' )
            // InternalCompras.g:5148:2: '}'
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
    // InternalCompras.g:5157:1: rule__ModuleTech__Group__22 : rule__ModuleTech__Group__22__Impl rule__ModuleTech__Group__23 ;
    public final void rule__ModuleTech__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5161:1: ( rule__ModuleTech__Group__22__Impl rule__ModuleTech__Group__23 )
            // InternalCompras.g:5162:2: rule__ModuleTech__Group__22__Impl rule__ModuleTech__Group__23
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
    // InternalCompras.g:5169:1: rule__ModuleTech__Group__22__Impl : ( ( rule__ModuleTech__CommonLayerAssignment_22 ) ) ;
    public final void rule__ModuleTech__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5173:1: ( ( ( rule__ModuleTech__CommonLayerAssignment_22 ) ) )
            // InternalCompras.g:5174:1: ( ( rule__ModuleTech__CommonLayerAssignment_22 ) )
            {
            // InternalCompras.g:5174:1: ( ( rule__ModuleTech__CommonLayerAssignment_22 ) )
            // InternalCompras.g:5175:2: ( rule__ModuleTech__CommonLayerAssignment_22 )
            {
             before(grammarAccess.getModuleTechAccess().getCommonLayerAssignment_22()); 
            // InternalCompras.g:5176:2: ( rule__ModuleTech__CommonLayerAssignment_22 )
            // InternalCompras.g:5176:3: rule__ModuleTech__CommonLayerAssignment_22
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
    // InternalCompras.g:5184:1: rule__ModuleTech__Group__23 : rule__ModuleTech__Group__23__Impl rule__ModuleTech__Group__24 ;
    public final void rule__ModuleTech__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5188:1: ( rule__ModuleTech__Group__23__Impl rule__ModuleTech__Group__24 )
            // InternalCompras.g:5189:2: rule__ModuleTech__Group__23__Impl rule__ModuleTech__Group__24
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
    // InternalCompras.g:5196:1: rule__ModuleTech__Group__23__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5200:1: ( ( ':' ) )
            // InternalCompras.g:5201:1: ( ':' )
            {
            // InternalCompras.g:5201:1: ( ':' )
            // InternalCompras.g:5202:2: ':'
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
    // InternalCompras.g:5211:1: rule__ModuleTech__Group__24 : rule__ModuleTech__Group__24__Impl rule__ModuleTech__Group__25 ;
    public final void rule__ModuleTech__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5215:1: ( rule__ModuleTech__Group__24__Impl rule__ModuleTech__Group__25 )
            // InternalCompras.g:5216:2: rule__ModuleTech__Group__24__Impl rule__ModuleTech__Group__25
            {
            pushFollow(FOLLOW_44);
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
    // InternalCompras.g:5223:1: rule__ModuleTech__Group__24__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5227:1: ( ( '{' ) )
            // InternalCompras.g:5228:1: ( '{' )
            {
            // InternalCompras.g:5228:1: ( '{' )
            // InternalCompras.g:5229:2: '{'
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
    // InternalCompras.g:5238:1: rule__ModuleTech__Group__25 : rule__ModuleTech__Group__25__Impl rule__ModuleTech__Group__26 ;
    public final void rule__ModuleTech__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5242:1: ( rule__ModuleTech__Group__25__Impl rule__ModuleTech__Group__26 )
            // InternalCompras.g:5243:2: rule__ModuleTech__Group__25__Impl rule__ModuleTech__Group__26
            {
            pushFollow(FOLLOW_44);
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
    // InternalCompras.g:5250:1: rule__ModuleTech__Group__25__Impl : ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* ) ;
    public final void rule__ModuleTech__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5254:1: ( ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* ) )
            // InternalCompras.g:5255:1: ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* )
            {
            // InternalCompras.g:5255:1: ( ( rule__ModuleTech__CommonLayerRefAssignment_25 )* )
            // InternalCompras.g:5256:2: ( rule__ModuleTech__CommonLayerRefAssignment_25 )*
            {
             before(grammarAccess.getModuleTechAccess().getCommonLayerRefAssignment_25()); 
            // InternalCompras.g:5257:2: ( rule__ModuleTech__CommonLayerRefAssignment_25 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==55) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCompras.g:5257:3: rule__ModuleTech__CommonLayerRefAssignment_25
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__ModuleTech__CommonLayerRefAssignment_25();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalCompras.g:5265:1: rule__ModuleTech__Group__26 : rule__ModuleTech__Group__26__Impl rule__ModuleTech__Group__27 ;
    public final void rule__ModuleTech__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5269:1: ( rule__ModuleTech__Group__26__Impl rule__ModuleTech__Group__27 )
            // InternalCompras.g:5270:2: rule__ModuleTech__Group__26__Impl rule__ModuleTech__Group__27
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
    // InternalCompras.g:5277:1: rule__ModuleTech__Group__26__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5281:1: ( ( '}' ) )
            // InternalCompras.g:5282:1: ( '}' )
            {
            // InternalCompras.g:5282:1: ( '}' )
            // InternalCompras.g:5283:2: '}'
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
    // InternalCompras.g:5292:1: rule__ModuleTech__Group__27 : rule__ModuleTech__Group__27__Impl ;
    public final void rule__ModuleTech__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5296:1: ( rule__ModuleTech__Group__27__Impl )
            // InternalCompras.g:5297:2: rule__ModuleTech__Group__27__Impl
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
    // InternalCompras.g:5303:1: rule__ModuleTech__Group__27__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5307:1: ( ( '}' ) )
            // InternalCompras.g:5308:1: ( '}' )
            {
            // InternalCompras.g:5308:1: ( '}' )
            // InternalCompras.g:5309:2: '}'
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
    // InternalCompras.g:5319:1: rule__ModuleTech__Group_8__0 : rule__ModuleTech__Group_8__0__Impl rule__ModuleTech__Group_8__1 ;
    public final void rule__ModuleTech__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5323:1: ( rule__ModuleTech__Group_8__0__Impl rule__ModuleTech__Group_8__1 )
            // InternalCompras.g:5324:2: rule__ModuleTech__Group_8__0__Impl rule__ModuleTech__Group_8__1
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
    // InternalCompras.g:5331:1: rule__ModuleTech__Group_8__0__Impl : ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) ) ;
    public final void rule__ModuleTech__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5335:1: ( ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) ) )
            // InternalCompras.g:5336:1: ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) )
            {
            // InternalCompras.g:5336:1: ( ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 ) )
            // InternalCompras.g:5337:2: ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 )
            {
             before(grammarAccess.getModuleTechAccess().getControllerSegmentLayerAssignment_8_0()); 
            // InternalCompras.g:5338:2: ( rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 )
            // InternalCompras.g:5338:3: rule__ModuleTech__ControllerSegmentLayerAssignment_8_0
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
    // InternalCompras.g:5346:1: rule__ModuleTech__Group_8__1 : rule__ModuleTech__Group_8__1__Impl rule__ModuleTech__Group_8__2 ;
    public final void rule__ModuleTech__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5350:1: ( rule__ModuleTech__Group_8__1__Impl rule__ModuleTech__Group_8__2 )
            // InternalCompras.g:5351:2: rule__ModuleTech__Group_8__1__Impl rule__ModuleTech__Group_8__2
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
    // InternalCompras.g:5358:1: rule__ModuleTech__Group_8__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5362:1: ( ( ':' ) )
            // InternalCompras.g:5363:1: ( ':' )
            {
            // InternalCompras.g:5363:1: ( ':' )
            // InternalCompras.g:5364:2: ':'
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
    // InternalCompras.g:5373:1: rule__ModuleTech__Group_8__2 : rule__ModuleTech__Group_8__2__Impl rule__ModuleTech__Group_8__3 ;
    public final void rule__ModuleTech__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5377:1: ( rule__ModuleTech__Group_8__2__Impl rule__ModuleTech__Group_8__3 )
            // InternalCompras.g:5378:2: rule__ModuleTech__Group_8__2__Impl rule__ModuleTech__Group_8__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalCompras.g:5385:1: rule__ModuleTech__Group_8__2__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5389:1: ( ( '{' ) )
            // InternalCompras.g:5390:1: ( '{' )
            {
            // InternalCompras.g:5390:1: ( '{' )
            // InternalCompras.g:5391:2: '{'
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
    // InternalCompras.g:5400:1: rule__ModuleTech__Group_8__3 : rule__ModuleTech__Group_8__3__Impl rule__ModuleTech__Group_8__4 ;
    public final void rule__ModuleTech__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5404:1: ( rule__ModuleTech__Group_8__3__Impl rule__ModuleTech__Group_8__4 )
            // InternalCompras.g:5405:2: rule__ModuleTech__Group_8__3__Impl rule__ModuleTech__Group_8__4
            {
            pushFollow(FOLLOW_46);
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
    // InternalCompras.g:5412:1: rule__ModuleTech__Group_8__3__Impl : ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* ) ;
    public final void rule__ModuleTech__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5416:1: ( ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* ) )
            // InternalCompras.g:5417:1: ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* )
            {
            // InternalCompras.g:5417:1: ( ( rule__ModuleTech__ControllersRefAssignment_8_3 )* )
            // InternalCompras.g:5418:2: ( rule__ModuleTech__ControllersRefAssignment_8_3 )*
            {
             before(grammarAccess.getModuleTechAccess().getControllersRefAssignment_8_3()); 
            // InternalCompras.g:5419:2: ( rule__ModuleTech__ControllersRefAssignment_8_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==50) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCompras.g:5419:3: rule__ModuleTech__ControllersRefAssignment_8_3
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__ModuleTech__ControllersRefAssignment_8_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalCompras.g:5427:1: rule__ModuleTech__Group_8__4 : rule__ModuleTech__Group_8__4__Impl ;
    public final void rule__ModuleTech__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5431:1: ( rule__ModuleTech__Group_8__4__Impl )
            // InternalCompras.g:5432:2: rule__ModuleTech__Group_8__4__Impl
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
    // InternalCompras.g:5438:1: rule__ModuleTech__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5442:1: ( ( '}' ) )
            // InternalCompras.g:5443:1: ( '}' )
            {
            // InternalCompras.g:5443:1: ( '}' )
            // InternalCompras.g:5444:2: '}'
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
    // InternalCompras.g:5454:1: rule__ModuleTech__Group_9__0 : rule__ModuleTech__Group_9__0__Impl rule__ModuleTech__Group_9__1 ;
    public final void rule__ModuleTech__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5458:1: ( rule__ModuleTech__Group_9__0__Impl rule__ModuleTech__Group_9__1 )
            // InternalCompras.g:5459:2: rule__ModuleTech__Group_9__0__Impl rule__ModuleTech__Group_9__1
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
    // InternalCompras.g:5466:1: rule__ModuleTech__Group_9__0__Impl : ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) ) ;
    public final void rule__ModuleTech__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5470:1: ( ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) ) )
            // InternalCompras.g:5471:1: ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) )
            {
            // InternalCompras.g:5471:1: ( ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 ) )
            // InternalCompras.g:5472:2: ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 )
            {
             before(grammarAccess.getModuleTechAccess().getViewSegmentLayerAssignment_9_0()); 
            // InternalCompras.g:5473:2: ( rule__ModuleTech__ViewSegmentLayerAssignment_9_0 )
            // InternalCompras.g:5473:3: rule__ModuleTech__ViewSegmentLayerAssignment_9_0
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
    // InternalCompras.g:5481:1: rule__ModuleTech__Group_9__1 : rule__ModuleTech__Group_9__1__Impl rule__ModuleTech__Group_9__2 ;
    public final void rule__ModuleTech__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5485:1: ( rule__ModuleTech__Group_9__1__Impl rule__ModuleTech__Group_9__2 )
            // InternalCompras.g:5486:2: rule__ModuleTech__Group_9__1__Impl rule__ModuleTech__Group_9__2
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
    // InternalCompras.g:5493:1: rule__ModuleTech__Group_9__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5497:1: ( ( ':' ) )
            // InternalCompras.g:5498:1: ( ':' )
            {
            // InternalCompras.g:5498:1: ( ':' )
            // InternalCompras.g:5499:2: ':'
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
    // InternalCompras.g:5508:1: rule__ModuleTech__Group_9__2 : rule__ModuleTech__Group_9__2__Impl rule__ModuleTech__Group_9__3 ;
    public final void rule__ModuleTech__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5512:1: ( rule__ModuleTech__Group_9__2__Impl rule__ModuleTech__Group_9__3 )
            // InternalCompras.g:5513:2: rule__ModuleTech__Group_9__2__Impl rule__ModuleTech__Group_9__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalCompras.g:5520:1: rule__ModuleTech__Group_9__2__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5524:1: ( ( '{' ) )
            // InternalCompras.g:5525:1: ( '{' )
            {
            // InternalCompras.g:5525:1: ( '{' )
            // InternalCompras.g:5526:2: '{'
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
    // InternalCompras.g:5535:1: rule__ModuleTech__Group_9__3 : rule__ModuleTech__Group_9__3__Impl rule__ModuleTech__Group_9__4 ;
    public final void rule__ModuleTech__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5539:1: ( rule__ModuleTech__Group_9__3__Impl rule__ModuleTech__Group_9__4 )
            // InternalCompras.g:5540:2: rule__ModuleTech__Group_9__3__Impl rule__ModuleTech__Group_9__4
            {
            pushFollow(FOLLOW_48);
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
    // InternalCompras.g:5547:1: rule__ModuleTech__Group_9__3__Impl : ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* ) ;
    public final void rule__ModuleTech__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5551:1: ( ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* ) )
            // InternalCompras.g:5552:1: ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* )
            {
            // InternalCompras.g:5552:1: ( ( rule__ModuleTech__ViewsRefAssignment_9_3 )* )
            // InternalCompras.g:5553:2: ( rule__ModuleTech__ViewsRefAssignment_9_3 )*
            {
             before(grammarAccess.getModuleTechAccess().getViewsRefAssignment_9_3()); 
            // InternalCompras.g:5554:2: ( rule__ModuleTech__ViewsRefAssignment_9_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==51) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCompras.g:5554:3: rule__ModuleTech__ViewsRefAssignment_9_3
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__ModuleTech__ViewsRefAssignment_9_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalCompras.g:5562:1: rule__ModuleTech__Group_9__4 : rule__ModuleTech__Group_9__4__Impl ;
    public final void rule__ModuleTech__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5566:1: ( rule__ModuleTech__Group_9__4__Impl )
            // InternalCompras.g:5567:2: rule__ModuleTech__Group_9__4__Impl
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
    // InternalCompras.g:5573:1: rule__ModuleTech__Group_9__4__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5577:1: ( ( '}' ) )
            // InternalCompras.g:5578:1: ( '}' )
            {
            // InternalCompras.g:5578:1: ( '}' )
            // InternalCompras.g:5579:2: '}'
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
    // InternalCompras.g:5589:1: rule__ModuleTech__Group_10__0 : rule__ModuleTech__Group_10__0__Impl rule__ModuleTech__Group_10__1 ;
    public final void rule__ModuleTech__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5593:1: ( rule__ModuleTech__Group_10__0__Impl rule__ModuleTech__Group_10__1 )
            // InternalCompras.g:5594:2: rule__ModuleTech__Group_10__0__Impl rule__ModuleTech__Group_10__1
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
    // InternalCompras.g:5601:1: rule__ModuleTech__Group_10__0__Impl : ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) ) ;
    public final void rule__ModuleTech__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5605:1: ( ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) ) )
            // InternalCompras.g:5606:1: ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) )
            {
            // InternalCompras.g:5606:1: ( ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 ) )
            // InternalCompras.g:5607:2: ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 )
            {
             before(grammarAccess.getModuleTechAccess().getScriptSegmentLayerAssignment_10_0()); 
            // InternalCompras.g:5608:2: ( rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 )
            // InternalCompras.g:5608:3: rule__ModuleTech__ScriptSegmentLayerAssignment_10_0
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
    // InternalCompras.g:5616:1: rule__ModuleTech__Group_10__1 : rule__ModuleTech__Group_10__1__Impl rule__ModuleTech__Group_10__2 ;
    public final void rule__ModuleTech__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5620:1: ( rule__ModuleTech__Group_10__1__Impl rule__ModuleTech__Group_10__2 )
            // InternalCompras.g:5621:2: rule__ModuleTech__Group_10__1__Impl rule__ModuleTech__Group_10__2
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
    // InternalCompras.g:5628:1: rule__ModuleTech__Group_10__1__Impl : ( ':' ) ;
    public final void rule__ModuleTech__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5632:1: ( ( ':' ) )
            // InternalCompras.g:5633:1: ( ':' )
            {
            // InternalCompras.g:5633:1: ( ':' )
            // InternalCompras.g:5634:2: ':'
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
    // InternalCompras.g:5643:1: rule__ModuleTech__Group_10__2 : rule__ModuleTech__Group_10__2__Impl rule__ModuleTech__Group_10__3 ;
    public final void rule__ModuleTech__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5647:1: ( rule__ModuleTech__Group_10__2__Impl rule__ModuleTech__Group_10__3 )
            // InternalCompras.g:5648:2: rule__ModuleTech__Group_10__2__Impl rule__ModuleTech__Group_10__3
            {
            pushFollow(FOLLOW_50);
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
    // InternalCompras.g:5655:1: rule__ModuleTech__Group_10__2__Impl : ( '{' ) ;
    public final void rule__ModuleTech__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5659:1: ( ( '{' ) )
            // InternalCompras.g:5660:1: ( '{' )
            {
            // InternalCompras.g:5660:1: ( '{' )
            // InternalCompras.g:5661:2: '{'
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
    // InternalCompras.g:5670:1: rule__ModuleTech__Group_10__3 : rule__ModuleTech__Group_10__3__Impl rule__ModuleTech__Group_10__4 ;
    public final void rule__ModuleTech__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5674:1: ( rule__ModuleTech__Group_10__3__Impl rule__ModuleTech__Group_10__4 )
            // InternalCompras.g:5675:2: rule__ModuleTech__Group_10__3__Impl rule__ModuleTech__Group_10__4
            {
            pushFollow(FOLLOW_50);
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
    // InternalCompras.g:5682:1: rule__ModuleTech__Group_10__3__Impl : ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* ) ;
    public final void rule__ModuleTech__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5686:1: ( ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* ) )
            // InternalCompras.g:5687:1: ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* )
            {
            // InternalCompras.g:5687:1: ( ( rule__ModuleTech__ScriptRefAssignment_10_3 )* )
            // InternalCompras.g:5688:2: ( rule__ModuleTech__ScriptRefAssignment_10_3 )*
            {
             before(grammarAccess.getModuleTechAccess().getScriptRefAssignment_10_3()); 
            // InternalCompras.g:5689:2: ( rule__ModuleTech__ScriptRefAssignment_10_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==52) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCompras.g:5689:3: rule__ModuleTech__ScriptRefAssignment_10_3
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__ModuleTech__ScriptRefAssignment_10_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalCompras.g:5697:1: rule__ModuleTech__Group_10__4 : rule__ModuleTech__Group_10__4__Impl ;
    public final void rule__ModuleTech__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5701:1: ( rule__ModuleTech__Group_10__4__Impl )
            // InternalCompras.g:5702:2: rule__ModuleTech__Group_10__4__Impl
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
    // InternalCompras.g:5708:1: rule__ModuleTech__Group_10__4__Impl : ( '}' ) ;
    public final void rule__ModuleTech__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5712:1: ( ( '}' ) )
            // InternalCompras.g:5713:1: ( '}' )
            {
            // InternalCompras.g:5713:1: ( '}' )
            // InternalCompras.g:5714:2: '}'
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
    // InternalCompras.g:5724:1: rule__ControllersRef__Group__0 : rule__ControllersRef__Group__0__Impl rule__ControllersRef__Group__1 ;
    public final void rule__ControllersRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5728:1: ( rule__ControllersRef__Group__0__Impl rule__ControllersRef__Group__1 )
            // InternalCompras.g:5729:2: rule__ControllersRef__Group__0__Impl rule__ControllersRef__Group__1
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
    // InternalCompras.g:5736:1: rule__ControllersRef__Group__0__Impl : ( 'Controller' ) ;
    public final void rule__ControllersRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5740:1: ( ( 'Controller' ) )
            // InternalCompras.g:5741:1: ( 'Controller' )
            {
            // InternalCompras.g:5741:1: ( 'Controller' )
            // InternalCompras.g:5742:2: 'Controller'
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
    // InternalCompras.g:5751:1: rule__ControllersRef__Group__1 : rule__ControllersRef__Group__1__Impl rule__ControllersRef__Group__2 ;
    public final void rule__ControllersRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5755:1: ( rule__ControllersRef__Group__1__Impl rule__ControllersRef__Group__2 )
            // InternalCompras.g:5756:2: rule__ControllersRef__Group__1__Impl rule__ControllersRef__Group__2
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
    // InternalCompras.g:5763:1: rule__ControllersRef__Group__1__Impl : ( ':' ) ;
    public final void rule__ControllersRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5767:1: ( ( ':' ) )
            // InternalCompras.g:5768:1: ( ':' )
            {
            // InternalCompras.g:5768:1: ( ':' )
            // InternalCompras.g:5769:2: ':'
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
    // InternalCompras.g:5778:1: rule__ControllersRef__Group__2 : rule__ControllersRef__Group__2__Impl ;
    public final void rule__ControllersRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5782:1: ( rule__ControllersRef__Group__2__Impl )
            // InternalCompras.g:5783:2: rule__ControllersRef__Group__2__Impl
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
    // InternalCompras.g:5789:1: rule__ControllersRef__Group__2__Impl : ( ( rule__ControllersRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__ControllersRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5793:1: ( ( ( rule__ControllersRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:5794:1: ( ( rule__ControllersRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:5794:1: ( ( rule__ControllersRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:5795:2: ( rule__ControllersRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getControllersRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:5796:2: ( rule__ControllersRef__FunctionalityAssignment_2 )
            // InternalCompras.g:5796:3: rule__ControllersRef__FunctionalityAssignment_2
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
    // InternalCompras.g:5805:1: rule__ViewsRef__Group__0 : rule__ViewsRef__Group__0__Impl rule__ViewsRef__Group__1 ;
    public final void rule__ViewsRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5809:1: ( rule__ViewsRef__Group__0__Impl rule__ViewsRef__Group__1 )
            // InternalCompras.g:5810:2: rule__ViewsRef__Group__0__Impl rule__ViewsRef__Group__1
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
    // InternalCompras.g:5817:1: rule__ViewsRef__Group__0__Impl : ( 'View' ) ;
    public final void rule__ViewsRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5821:1: ( ( 'View' ) )
            // InternalCompras.g:5822:1: ( 'View' )
            {
            // InternalCompras.g:5822:1: ( 'View' )
            // InternalCompras.g:5823:2: 'View'
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
    // InternalCompras.g:5832:1: rule__ViewsRef__Group__1 : rule__ViewsRef__Group__1__Impl rule__ViewsRef__Group__2 ;
    public final void rule__ViewsRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5836:1: ( rule__ViewsRef__Group__1__Impl rule__ViewsRef__Group__2 )
            // InternalCompras.g:5837:2: rule__ViewsRef__Group__1__Impl rule__ViewsRef__Group__2
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
    // InternalCompras.g:5844:1: rule__ViewsRef__Group__1__Impl : ( ':' ) ;
    public final void rule__ViewsRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5848:1: ( ( ':' ) )
            // InternalCompras.g:5849:1: ( ':' )
            {
            // InternalCompras.g:5849:1: ( ':' )
            // InternalCompras.g:5850:2: ':'
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
    // InternalCompras.g:5859:1: rule__ViewsRef__Group__2 : rule__ViewsRef__Group__2__Impl ;
    public final void rule__ViewsRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5863:1: ( rule__ViewsRef__Group__2__Impl )
            // InternalCompras.g:5864:2: rule__ViewsRef__Group__2__Impl
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
    // InternalCompras.g:5870:1: rule__ViewsRef__Group__2__Impl : ( ( rule__ViewsRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__ViewsRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5874:1: ( ( ( rule__ViewsRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:5875:1: ( ( rule__ViewsRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:5875:1: ( ( rule__ViewsRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:5876:2: ( rule__ViewsRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getViewsRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:5877:2: ( rule__ViewsRef__FunctionalityAssignment_2 )
            // InternalCompras.g:5877:3: rule__ViewsRef__FunctionalityAssignment_2
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
    // InternalCompras.g:5886:1: rule__ScriptRef__Group__0 : rule__ScriptRef__Group__0__Impl rule__ScriptRef__Group__1 ;
    public final void rule__ScriptRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5890:1: ( rule__ScriptRef__Group__0__Impl rule__ScriptRef__Group__1 )
            // InternalCompras.g:5891:2: rule__ScriptRef__Group__0__Impl rule__ScriptRef__Group__1
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
    // InternalCompras.g:5898:1: rule__ScriptRef__Group__0__Impl : ( 'Script' ) ;
    public final void rule__ScriptRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5902:1: ( ( 'Script' ) )
            // InternalCompras.g:5903:1: ( 'Script' )
            {
            // InternalCompras.g:5903:1: ( 'Script' )
            // InternalCompras.g:5904:2: 'Script'
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
    // InternalCompras.g:5913:1: rule__ScriptRef__Group__1 : rule__ScriptRef__Group__1__Impl rule__ScriptRef__Group__2 ;
    public final void rule__ScriptRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5917:1: ( rule__ScriptRef__Group__1__Impl rule__ScriptRef__Group__2 )
            // InternalCompras.g:5918:2: rule__ScriptRef__Group__1__Impl rule__ScriptRef__Group__2
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
    // InternalCompras.g:5925:1: rule__ScriptRef__Group__1__Impl : ( ':' ) ;
    public final void rule__ScriptRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5929:1: ( ( ':' ) )
            // InternalCompras.g:5930:1: ( ':' )
            {
            // InternalCompras.g:5930:1: ( ':' )
            // InternalCompras.g:5931:2: ':'
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
    // InternalCompras.g:5940:1: rule__ScriptRef__Group__2 : rule__ScriptRef__Group__2__Impl ;
    public final void rule__ScriptRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5944:1: ( rule__ScriptRef__Group__2__Impl )
            // InternalCompras.g:5945:2: rule__ScriptRef__Group__2__Impl
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
    // InternalCompras.g:5951:1: rule__ScriptRef__Group__2__Impl : ( ( rule__ScriptRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__ScriptRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5955:1: ( ( ( rule__ScriptRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:5956:1: ( ( rule__ScriptRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:5956:1: ( ( rule__ScriptRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:5957:2: ( rule__ScriptRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getScriptRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:5958:2: ( rule__ScriptRef__FunctionalityAssignment_2 )
            // InternalCompras.g:5958:3: rule__ScriptRef__FunctionalityAssignment_2
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
    // InternalCompras.g:5967:1: rule__BusinessLayerRef__Group__0 : rule__BusinessLayerRef__Group__0__Impl rule__BusinessLayerRef__Group__1 ;
    public final void rule__BusinessLayerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5971:1: ( rule__BusinessLayerRef__Group__0__Impl rule__BusinessLayerRef__Group__1 )
            // InternalCompras.g:5972:2: rule__BusinessLayerRef__Group__0__Impl rule__BusinessLayerRef__Group__1
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
    // InternalCompras.g:5979:1: rule__BusinessLayerRef__Group__0__Impl : ( 'BLogic' ) ;
    public final void rule__BusinessLayerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5983:1: ( ( 'BLogic' ) )
            // InternalCompras.g:5984:1: ( 'BLogic' )
            {
            // InternalCompras.g:5984:1: ( 'BLogic' )
            // InternalCompras.g:5985:2: 'BLogic'
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
    // InternalCompras.g:5994:1: rule__BusinessLayerRef__Group__1 : rule__BusinessLayerRef__Group__1__Impl rule__BusinessLayerRef__Group__2 ;
    public final void rule__BusinessLayerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:5998:1: ( rule__BusinessLayerRef__Group__1__Impl rule__BusinessLayerRef__Group__2 )
            // InternalCompras.g:5999:2: rule__BusinessLayerRef__Group__1__Impl rule__BusinessLayerRef__Group__2
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
    // InternalCompras.g:6006:1: rule__BusinessLayerRef__Group__1__Impl : ( ':' ) ;
    public final void rule__BusinessLayerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6010:1: ( ( ':' ) )
            // InternalCompras.g:6011:1: ( ':' )
            {
            // InternalCompras.g:6011:1: ( ':' )
            // InternalCompras.g:6012:2: ':'
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
    // InternalCompras.g:6021:1: rule__BusinessLayerRef__Group__2 : rule__BusinessLayerRef__Group__2__Impl ;
    public final void rule__BusinessLayerRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6025:1: ( rule__BusinessLayerRef__Group__2__Impl )
            // InternalCompras.g:6026:2: rule__BusinessLayerRef__Group__2__Impl
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
    // InternalCompras.g:6032:1: rule__BusinessLayerRef__Group__2__Impl : ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__BusinessLayerRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6036:1: ( ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6037:1: ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6037:1: ( ( rule__BusinessLayerRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6038:2: ( rule__BusinessLayerRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getBusinessLayerRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6039:2: ( rule__BusinessLayerRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6039:3: rule__BusinessLayerRef__FunctionalityAssignment_2
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
    // InternalCompras.g:6048:1: rule__DataAccessLayerRef__Group__0 : rule__DataAccessLayerRef__Group__0__Impl rule__DataAccessLayerRef__Group__1 ;
    public final void rule__DataAccessLayerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6052:1: ( rule__DataAccessLayerRef__Group__0__Impl rule__DataAccessLayerRef__Group__1 )
            // InternalCompras.g:6053:2: rule__DataAccessLayerRef__Group__0__Impl rule__DataAccessLayerRef__Group__1
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
    // InternalCompras.g:6060:1: rule__DataAccessLayerRef__Group__0__Impl : ( 'DataAccess' ) ;
    public final void rule__DataAccessLayerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6064:1: ( ( 'DataAccess' ) )
            // InternalCompras.g:6065:1: ( 'DataAccess' )
            {
            // InternalCompras.g:6065:1: ( 'DataAccess' )
            // InternalCompras.g:6066:2: 'DataAccess'
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
    // InternalCompras.g:6075:1: rule__DataAccessLayerRef__Group__1 : rule__DataAccessLayerRef__Group__1__Impl rule__DataAccessLayerRef__Group__2 ;
    public final void rule__DataAccessLayerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6079:1: ( rule__DataAccessLayerRef__Group__1__Impl rule__DataAccessLayerRef__Group__2 )
            // InternalCompras.g:6080:2: rule__DataAccessLayerRef__Group__1__Impl rule__DataAccessLayerRef__Group__2
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
    // InternalCompras.g:6087:1: rule__DataAccessLayerRef__Group__1__Impl : ( ':' ) ;
    public final void rule__DataAccessLayerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6091:1: ( ( ':' ) )
            // InternalCompras.g:6092:1: ( ':' )
            {
            // InternalCompras.g:6092:1: ( ':' )
            // InternalCompras.g:6093:2: ':'
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
    // InternalCompras.g:6102:1: rule__DataAccessLayerRef__Group__2 : rule__DataAccessLayerRef__Group__2__Impl ;
    public final void rule__DataAccessLayerRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6106:1: ( rule__DataAccessLayerRef__Group__2__Impl )
            // InternalCompras.g:6107:2: rule__DataAccessLayerRef__Group__2__Impl
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
    // InternalCompras.g:6113:1: rule__DataAccessLayerRef__Group__2__Impl : ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) ) ;
    public final void rule__DataAccessLayerRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6117:1: ( ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) ) )
            // InternalCompras.g:6118:1: ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) )
            {
            // InternalCompras.g:6118:1: ( ( rule__DataAccessLayerRef__FunctionalityAssignment_2 ) )
            // InternalCompras.g:6119:2: ( rule__DataAccessLayerRef__FunctionalityAssignment_2 )
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getFunctionalityAssignment_2()); 
            // InternalCompras.g:6120:2: ( rule__DataAccessLayerRef__FunctionalityAssignment_2 )
            // InternalCompras.g:6120:3: rule__DataAccessLayerRef__FunctionalityAssignment_2
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
    // InternalCompras.g:6129:1: rule__CommonLayerRef__Group__0 : rule__CommonLayerRef__Group__0__Impl rule__CommonLayerRef__Group__1 ;
    public final void rule__CommonLayerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6133:1: ( rule__CommonLayerRef__Group__0__Impl rule__CommonLayerRef__Group__1 )
            // InternalCompras.g:6134:2: rule__CommonLayerRef__Group__0__Impl rule__CommonLayerRef__Group__1
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
    // InternalCompras.g:6141:1: rule__CommonLayerRef__Group__0__Impl : ( 'DtoModel' ) ;
    public final void rule__CommonLayerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6145:1: ( ( 'DtoModel' ) )
            // InternalCompras.g:6146:1: ( 'DtoModel' )
            {
            // InternalCompras.g:6146:1: ( 'DtoModel' )
            // InternalCompras.g:6147:2: 'DtoModel'
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
    // InternalCompras.g:6156:1: rule__CommonLayerRef__Group__1 : rule__CommonLayerRef__Group__1__Impl rule__CommonLayerRef__Group__2 ;
    public final void rule__CommonLayerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6160:1: ( rule__CommonLayerRef__Group__1__Impl rule__CommonLayerRef__Group__2 )
            // InternalCompras.g:6161:2: rule__CommonLayerRef__Group__1__Impl rule__CommonLayerRef__Group__2
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
    // InternalCompras.g:6168:1: rule__CommonLayerRef__Group__1__Impl : ( ':' ) ;
    public final void rule__CommonLayerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6172:1: ( ( ':' ) )
            // InternalCompras.g:6173:1: ( ':' )
            {
            // InternalCompras.g:6173:1: ( ':' )
            // InternalCompras.g:6174:2: ':'
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
    // InternalCompras.g:6183:1: rule__CommonLayerRef__Group__2 : rule__CommonLayerRef__Group__2__Impl ;
    public final void rule__CommonLayerRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6187:1: ( rule__CommonLayerRef__Group__2__Impl )
            // InternalCompras.g:6188:2: rule__CommonLayerRef__Group__2__Impl
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
    // InternalCompras.g:6194:1: rule__CommonLayerRef__Group__2__Impl : ( ( rule__CommonLayerRef__EntityAssignment_2 ) ) ;
    public final void rule__CommonLayerRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6198:1: ( ( ( rule__CommonLayerRef__EntityAssignment_2 ) ) )
            // InternalCompras.g:6199:1: ( ( rule__CommonLayerRef__EntityAssignment_2 ) )
            {
            // InternalCompras.g:6199:1: ( ( rule__CommonLayerRef__EntityAssignment_2 ) )
            // InternalCompras.g:6200:2: ( rule__CommonLayerRef__EntityAssignment_2 )
            {
             before(grammarAccess.getCommonLayerRefAccess().getEntityAssignment_2()); 
            // InternalCompras.g:6201:2: ( rule__CommonLayerRef__EntityAssignment_2 )
            // InternalCompras.g:6201:3: rule__CommonLayerRef__EntityAssignment_2
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
    // InternalCompras.g:6210:1: rule__Solution__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Solution__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6214:1: ( ( RULE_ID ) )
            // InternalCompras.g:6215:2: ( RULE_ID )
            {
            // InternalCompras.g:6215:2: ( RULE_ID )
            // InternalCompras.g:6216:3: RULE_ID
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
    // InternalCompras.g:6225:1: rule__Solution__DomainAssignment_6 : ( ruleDomain ) ;
    public final void rule__Solution__DomainAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6229:1: ( ( ruleDomain ) )
            // InternalCompras.g:6230:2: ( ruleDomain )
            {
            // InternalCompras.g:6230:2: ( ruleDomain )
            // InternalCompras.g:6231:3: ruleDomain
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
    // InternalCompras.g:6240:1: rule__Solution__ArchitectureAssignment_9 : ( ruleArchitecture ) ;
    public final void rule__Solution__ArchitectureAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6244:1: ( ( ruleArchitecture ) )
            // InternalCompras.g:6245:2: ( ruleArchitecture )
            {
            // InternalCompras.g:6245:2: ( ruleArchitecture )
            // InternalCompras.g:6246:3: ruleArchitecture
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
    // InternalCompras.g:6255:1: rule__Solution__TechnologyAssignment_12 : ( ruleTechnology ) ;
    public final void rule__Solution__TechnologyAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6259:1: ( ( ruleTechnology ) )
            // InternalCompras.g:6260:2: ( ruleTechnology )
            {
            // InternalCompras.g:6260:2: ( ruleTechnology )
            // InternalCompras.g:6261:3: ruleTechnology
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
    // InternalCompras.g:6270:1: rule__Domain__ModuleAssignment_1 : ( ruleModule ) ;
    public final void rule__Domain__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6274:1: ( ( ruleModule ) )
            // InternalCompras.g:6275:2: ( ruleModule )
            {
            // InternalCompras.g:6275:2: ( ruleModule )
            // InternalCompras.g:6276:3: ruleModule
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
    // InternalCompras.g:6285:1: rule__Module__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6289:1: ( ( RULE_ID ) )
            // InternalCompras.g:6290:2: ( RULE_ID )
            {
            // InternalCompras.g:6290:2: ( RULE_ID )
            // InternalCompras.g:6291:3: RULE_ID
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
    // InternalCompras.g:6300:1: rule__Module__EntityAssignment_8 : ( ruleEntity ) ;
    public final void rule__Module__EntityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6304:1: ( ( ruleEntity ) )
            // InternalCompras.g:6305:2: ( ruleEntity )
            {
            // InternalCompras.g:6305:2: ( ruleEntity )
            // InternalCompras.g:6306:3: ruleEntity
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
    // InternalCompras.g:6315:1: rule__Module__FunctionalityAssignment_13 : ( ruleFunctionality ) ;
    public final void rule__Module__FunctionalityAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6319:1: ( ( ruleFunctionality ) )
            // InternalCompras.g:6320:2: ( ruleFunctionality )
            {
            // InternalCompras.g:6320:2: ( ruleFunctionality )
            // InternalCompras.g:6321:3: ruleFunctionality
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
    // InternalCompras.g:6330:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6334:1: ( ( RULE_ID ) )
            // InternalCompras.g:6335:2: ( RULE_ID )
            {
            // InternalCompras.g:6335:2: ( RULE_ID )
            // InternalCompras.g:6336:3: RULE_ID
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
    // InternalCompras.g:6345:1: rule__Entity__EntityFieldAssignment_3 : ( ruleEntityField ) ;
    public final void rule__Entity__EntityFieldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6349:1: ( ( ruleEntityField ) )
            // InternalCompras.g:6350:2: ( ruleEntityField )
            {
            // InternalCompras.g:6350:2: ( ruleEntityField )
            // InternalCompras.g:6351:3: ruleEntityField
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


    // $ANTLR start "rule__EntityField__EntityTypeAssignment_0"
    // InternalCompras.g:6360:1: rule__EntityField__EntityTypeAssignment_0 : ( ruleEntityType ) ;
    public final void rule__EntityField__EntityTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6364:1: ( ( ruleEntityType ) )
            // InternalCompras.g:6365:2: ( ruleEntityType )
            {
            // InternalCompras.g:6365:2: ( ruleEntityType )
            // InternalCompras.g:6366:3: ruleEntityType
            {
             before(grammarAccess.getEntityFieldAccess().getEntityTypeEntityTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityFieldAccess().getEntityTypeEntityTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityField__EntityTypeAssignment_0"


    // $ANTLR start "rule__EntityField__NameAssignment_1"
    // InternalCompras.g:6375:1: rule__EntityField__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EntityField__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6379:1: ( ( RULE_ID ) )
            // InternalCompras.g:6380:2: ( RULE_ID )
            {
            // InternalCompras.g:6380:2: ( RULE_ID )
            // InternalCompras.g:6381:3: RULE_ID
            {
             before(grammarAccess.getEntityFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityFieldAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityField__NameAssignment_1"


    // $ANTLR start "rule__EntityType__EntityAssignment_0"
    // InternalCompras.g:6390:1: rule__EntityType__EntityAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__EntityType__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6394:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:6395:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:6395:2: ( ( ruleFQN ) )
            // InternalCompras.g:6396:3: ( ruleFQN )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0_0()); 
            // InternalCompras.g:6397:3: ( ruleFQN )
            // InternalCompras.g:6398:4: ruleFQN
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
    // InternalCompras.g:6409:1: rule__EntityType__CommonFieldTypeAssignment_1 : ( ruleCommonFieldType ) ;
    public final void rule__EntityType__CommonFieldTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6413:1: ( ( ruleCommonFieldType ) )
            // InternalCompras.g:6414:2: ( ruleCommonFieldType )
            {
            // InternalCompras.g:6414:2: ( ruleCommonFieldType )
            // InternalCompras.g:6415:3: ruleCommonFieldType
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
    // InternalCompras.g:6424:1: rule__Functionality__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Functionality__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6428:1: ( ( RULE_ID ) )
            // InternalCompras.g:6429:2: ( RULE_ID )
            {
            // InternalCompras.g:6429:2: ( RULE_ID )
            // InternalCompras.g:6430:3: RULE_ID
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
    // InternalCompras.g:6439:1: rule__Functionality__EntityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Functionality__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6443:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:6444:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:6444:2: ( ( ruleFQN ) )
            // InternalCompras.g:6445:3: ( ruleFQN )
            {
             before(grammarAccess.getFunctionalityAccess().getEntityEntityCrossReference_2_0()); 
            // InternalCompras.g:6446:3: ( ruleFQN )
            // InternalCompras.g:6447:4: ruleFQN
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
    // InternalCompras.g:6458:1: rule__Functionality__FunctionalityFieldTypeAssignment_5 : ( ruleFunctionalityFieldType ) ;
    public final void rule__Functionality__FunctionalityFieldTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6462:1: ( ( ruleFunctionalityFieldType ) )
            // InternalCompras.g:6463:2: ( ruleFunctionalityFieldType )
            {
            // InternalCompras.g:6463:2: ( ruleFunctionalityFieldType )
            // InternalCompras.g:6464:3: ruleFunctionalityFieldType
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
    // InternalCompras.g:6473:1: rule__Architecture__PresentationLayerAssignment_6 : ( rulePresentationLayer ) ;
    public final void rule__Architecture__PresentationLayerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6477:1: ( ( rulePresentationLayer ) )
            // InternalCompras.g:6478:2: ( rulePresentationLayer )
            {
            // InternalCompras.g:6478:2: ( rulePresentationLayer )
            // InternalCompras.g:6479:3: rulePresentationLayer
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
    // InternalCompras.g:6488:1: rule__Architecture__BusinessLayerAssignment_9 : ( ruleBusinessLayer ) ;
    public final void rule__Architecture__BusinessLayerAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6492:1: ( ( ruleBusinessLayer ) )
            // InternalCompras.g:6493:2: ( ruleBusinessLayer )
            {
            // InternalCompras.g:6493:2: ( ruleBusinessLayer )
            // InternalCompras.g:6494:3: ruleBusinessLayer
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
    // InternalCompras.g:6503:1: rule__Architecture__DataAccessLayerAssignment_12 : ( ruleDataAccessLayer ) ;
    public final void rule__Architecture__DataAccessLayerAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6507:1: ( ( ruleDataAccessLayer ) )
            // InternalCompras.g:6508:2: ( ruleDataAccessLayer )
            {
            // InternalCompras.g:6508:2: ( ruleDataAccessLayer )
            // InternalCompras.g:6509:3: ruleDataAccessLayer
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
    // InternalCompras.g:6518:1: rule__Architecture__CommonLayerAssignment_15 : ( ruleCommonLayer ) ;
    public final void rule__Architecture__CommonLayerAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6522:1: ( ( ruleCommonLayer ) )
            // InternalCompras.g:6523:2: ( ruleCommonLayer )
            {
            // InternalCompras.g:6523:2: ( ruleCommonLayer )
            // InternalCompras.g:6524:3: ruleCommonLayer
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
    // InternalCompras.g:6533:1: rule__Architecture__RelationsAssignment_19 : ( ruleRelations ) ;
    public final void rule__Architecture__RelationsAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6537:1: ( ( ruleRelations ) )
            // InternalCompras.g:6538:2: ( ruleRelations )
            {
            // InternalCompras.g:6538:2: ( ruleRelations )
            // InternalCompras.g:6539:3: ruleRelations
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
    // InternalCompras.g:6548:1: rule__PresentationLayer__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PresentationLayer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6552:1: ( ( RULE_ID ) )
            // InternalCompras.g:6553:2: ( RULE_ID )
            {
            // InternalCompras.g:6553:2: ( RULE_ID )
            // InternalCompras.g:6554:3: RULE_ID
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
    // InternalCompras.g:6563:1: rule__PresentationLayer__ControllerSegmentLayerAssignment_5 : ( ruleControllerSegmentLayer ) ;
    public final void rule__PresentationLayer__ControllerSegmentLayerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6567:1: ( ( ruleControllerSegmentLayer ) )
            // InternalCompras.g:6568:2: ( ruleControllerSegmentLayer )
            {
            // InternalCompras.g:6568:2: ( ruleControllerSegmentLayer )
            // InternalCompras.g:6569:3: ruleControllerSegmentLayer
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
    // InternalCompras.g:6578:1: rule__PresentationLayer__ViewSegmentLayerAssignment_8 : ( ruleViewSegmentLayer ) ;
    public final void rule__PresentationLayer__ViewSegmentLayerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6582:1: ( ( ruleViewSegmentLayer ) )
            // InternalCompras.g:6583:2: ( ruleViewSegmentLayer )
            {
            // InternalCompras.g:6583:2: ( ruleViewSegmentLayer )
            // InternalCompras.g:6584:3: ruleViewSegmentLayer
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
    // InternalCompras.g:6593:1: rule__PresentationLayer__ScriptegmentLayerAssignment_11 : ( ruleScriptSegmentLayer ) ;
    public final void rule__PresentationLayer__ScriptegmentLayerAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6597:1: ( ( ruleScriptSegmentLayer ) )
            // InternalCompras.g:6598:2: ( ruleScriptSegmentLayer )
            {
            // InternalCompras.g:6598:2: ( ruleScriptSegmentLayer )
            // InternalCompras.g:6599:3: ruleScriptSegmentLayer
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
    // InternalCompras.g:6608:1: rule__ControllerSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__ControllerSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6612:1: ( ( RULE_ID ) )
            // InternalCompras.g:6613:2: ( RULE_ID )
            {
            // InternalCompras.g:6613:2: ( RULE_ID )
            // InternalCompras.g:6614:3: RULE_ID
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
    // InternalCompras.g:6623:1: rule__ViewSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__ViewSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6627:1: ( ( RULE_ID ) )
            // InternalCompras.g:6628:2: ( RULE_ID )
            {
            // InternalCompras.g:6628:2: ( RULE_ID )
            // InternalCompras.g:6629:3: RULE_ID
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
    // InternalCompras.g:6638:1: rule__ScriptSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__ScriptSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6642:1: ( ( RULE_ID ) )
            // InternalCompras.g:6643:2: ( RULE_ID )
            {
            // InternalCompras.g:6643:2: ( RULE_ID )
            // InternalCompras.g:6644:3: RULE_ID
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
    // InternalCompras.g:6653:1: rule__BusinessLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__BusinessLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6657:1: ( ( RULE_ID ) )
            // InternalCompras.g:6658:2: ( RULE_ID )
            {
            // InternalCompras.g:6658:2: ( RULE_ID )
            // InternalCompras.g:6659:3: RULE_ID
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
    // InternalCompras.g:6668:1: rule__DataAccessLayer__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DataAccessLayer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6672:1: ( ( RULE_ID ) )
            // InternalCompras.g:6673:2: ( RULE_ID )
            {
            // InternalCompras.g:6673:2: ( RULE_ID )
            // InternalCompras.g:6674:3: RULE_ID
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
    // InternalCompras.g:6683:1: rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5 : ( ruleDbConnectorSegmentLayer ) ;
    public final void rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6687:1: ( ( ruleDbConnectorSegmentLayer ) )
            // InternalCompras.g:6688:2: ( ruleDbConnectorSegmentLayer )
            {
            // InternalCompras.g:6688:2: ( ruleDbConnectorSegmentLayer )
            // InternalCompras.g:6689:3: ruleDbConnectorSegmentLayer
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
    // InternalCompras.g:6698:1: rule__DbConnectorSegmentLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__DbConnectorSegmentLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6702:1: ( ( RULE_ID ) )
            // InternalCompras.g:6703:2: ( RULE_ID )
            {
            // InternalCompras.g:6703:2: ( RULE_ID )
            // InternalCompras.g:6704:3: RULE_ID
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
    // InternalCompras.g:6713:1: rule__CommonLayer__NameAssignment : ( RULE_ID ) ;
    public final void rule__CommonLayer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6717:1: ( ( RULE_ID ) )
            // InternalCompras.g:6718:2: ( RULE_ID )
            {
            // InternalCompras.g:6718:2: ( RULE_ID )
            // InternalCompras.g:6719:3: RULE_ID
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
    // InternalCompras.g:6728:1: rule__Relations__SourceLayer1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6732:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:6733:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:6733:2: ( ( RULE_ID ) )
            // InternalCompras.g:6734:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer1PresentationLayerCrossReference_1_0()); 
            // InternalCompras.g:6735:3: ( RULE_ID )
            // InternalCompras.g:6736:4: RULE_ID
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
    // InternalCompras.g:6747:1: rule__Relations__RelationsType1Assignment_2 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6751:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:6752:2: ( ruleRelationsType )
            {
            // InternalCompras.g:6752:2: ( ruleRelationsType )
            // InternalCompras.g:6753:3: ruleRelationsType
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
    // InternalCompras.g:6762:1: rule__Relations__TargetLayer1Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6766:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:6767:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:6767:2: ( ( RULE_ID ) )
            // InternalCompras.g:6768:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer1BusinessLayerCrossReference_3_0()); 
            // InternalCompras.g:6769:3: ( RULE_ID )
            // InternalCompras.g:6770:4: RULE_ID
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
    // InternalCompras.g:6781:1: rule__Relations__SourceLayer2Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6785:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:6786:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:6786:2: ( ( RULE_ID ) )
            // InternalCompras.g:6787:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer2BusinessLayerCrossReference_4_0()); 
            // InternalCompras.g:6788:3: ( RULE_ID )
            // InternalCompras.g:6789:4: RULE_ID
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
    // InternalCompras.g:6800:1: rule__Relations__RelationsType2Assignment_5 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6804:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:6805:2: ( ruleRelationsType )
            {
            // InternalCompras.g:6805:2: ( ruleRelationsType )
            // InternalCompras.g:6806:3: ruleRelationsType
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
    // InternalCompras.g:6815:1: rule__Relations__TargetLayer2Assignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6819:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:6820:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:6820:2: ( ( RULE_ID ) )
            // InternalCompras.g:6821:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer2DataAccessLayerCrossReference_6_0()); 
            // InternalCompras.g:6822:3: ( RULE_ID )
            // InternalCompras.g:6823:4: RULE_ID
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
    // InternalCompras.g:6834:1: rule__Relations__SourceLayer3Assignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer3Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6838:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:6839:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:6839:2: ( ( RULE_ID ) )
            // InternalCompras.g:6840:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer3DataAccessLayerCrossReference_7_0()); 
            // InternalCompras.g:6841:3: ( RULE_ID )
            // InternalCompras.g:6842:4: RULE_ID
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
    // InternalCompras.g:6853:1: rule__Relations__RelationsType3Assignment_8 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType3Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6857:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:6858:2: ( ruleRelationsType )
            {
            // InternalCompras.g:6858:2: ( ruleRelationsType )
            // InternalCompras.g:6859:3: ruleRelationsType
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
    // InternalCompras.g:6868:1: rule__Relations__TargetLayer3Assignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer3Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6872:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:6873:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:6873:2: ( ( RULE_ID ) )
            // InternalCompras.g:6874:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer3CommonLayerCrossReference_9_0()); 
            // InternalCompras.g:6875:3: ( RULE_ID )
            // InternalCompras.g:6876:4: RULE_ID
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
    // InternalCompras.g:6887:1: rule__Relations__SourceLayer4Assignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer4Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6891:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:6892:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:6892:2: ( ( RULE_ID ) )
            // InternalCompras.g:6893:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer4PresentationLayerCrossReference_10_0()); 
            // InternalCompras.g:6894:3: ( RULE_ID )
            // InternalCompras.g:6895:4: RULE_ID
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
    // InternalCompras.g:6906:1: rule__Relations__RelationsType4Assignment_11 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType4Assignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6910:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:6911:2: ( ruleRelationsType )
            {
            // InternalCompras.g:6911:2: ( ruleRelationsType )
            // InternalCompras.g:6912:3: ruleRelationsType
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
    // InternalCompras.g:6921:1: rule__Relations__TargetLayer4Assignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer4Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6925:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:6926:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:6926:2: ( ( RULE_ID ) )
            // InternalCompras.g:6927:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer4CommonLayerCrossReference_12_0()); 
            // InternalCompras.g:6928:3: ( RULE_ID )
            // InternalCompras.g:6929:4: RULE_ID
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
    // InternalCompras.g:6940:1: rule__Relations__SourceLayer5Assignment_13 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__SourceLayer5Assignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6944:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:6945:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:6945:2: ( ( RULE_ID ) )
            // InternalCompras.g:6946:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getSourceLayer5BusinessLayerCrossReference_13_0()); 
            // InternalCompras.g:6947:3: ( RULE_ID )
            // InternalCompras.g:6948:4: RULE_ID
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
    // InternalCompras.g:6959:1: rule__Relations__RelationsType5Assignment_14 : ( ruleRelationsType ) ;
    public final void rule__Relations__RelationsType5Assignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6963:1: ( ( ruleRelationsType ) )
            // InternalCompras.g:6964:2: ( ruleRelationsType )
            {
            // InternalCompras.g:6964:2: ( ruleRelationsType )
            // InternalCompras.g:6965:3: ruleRelationsType
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
    // InternalCompras.g:6974:1: rule__Relations__TargetLayer5Assignment_15 : ( ( RULE_ID ) ) ;
    public final void rule__Relations__TargetLayer5Assignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6978:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:6979:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:6979:2: ( ( RULE_ID ) )
            // InternalCompras.g:6980:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationsAccess().getTargetLayer5CommonLayerCrossReference_15_0()); 
            // InternalCompras.g:6981:3: ( RULE_ID )
            // InternalCompras.g:6982:4: RULE_ID
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
    // InternalCompras.g:6993:1: rule__Technology__ModuleTechAssignment_1_3 : ( ruleModuleTech ) ;
    public final void rule__Technology__ModuleTechAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:6997:1: ( ( ruleModuleTech ) )
            // InternalCompras.g:6998:2: ( ruleModuleTech )
            {
            // InternalCompras.g:6998:2: ( ruleModuleTech )
            // InternalCompras.g:6999:3: ruleModuleTech
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
    // InternalCompras.g:7008:1: rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0 : ( ( ruleFQN ) ) ;
    public final void rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7012:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7013:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7013:2: ( ( ruleFQN ) )
            // InternalCompras.g:7014:3: ( ruleFQN )
            {
             before(grammarAccess.getTechnologyAccess().getDbConnectorSegmentLayerDbConnectorSegmentLayerCrossReference_2_3_0_0()); 
            // InternalCompras.g:7015:3: ( ruleFQN )
            // InternalCompras.g:7016:4: ruleFQN
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
    // InternalCompras.g:7027:1: rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2 : ( ruleDatabaseRDBMSType ) ;
    public final void rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7031:1: ( ( ruleDatabaseRDBMSType ) )
            // InternalCompras.g:7032:2: ( ruleDatabaseRDBMSType )
            {
            // InternalCompras.g:7032:2: ( ruleDatabaseRDBMSType )
            // InternalCompras.g:7033:3: ruleDatabaseRDBMSType
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
    // InternalCompras.g:7042:1: rule__Technology__ConnectionStringAssignment_2_3_4_2 : ( ruleConnectionString ) ;
    public final void rule__Technology__ConnectionStringAssignment_2_3_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7046:1: ( ( ruleConnectionString ) )
            // InternalCompras.g:7047:2: ( ruleConnectionString )
            {
            // InternalCompras.g:7047:2: ( ruleConnectionString )
            // InternalCompras.g:7048:3: ruleConnectionString
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
    // InternalCompras.g:7057:1: rule__ModuleTech__NameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7061:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7062:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7062:2: ( ( RULE_ID ) )
            // InternalCompras.g:7063:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getNameModuleCrossReference_2_0()); 
            // InternalCompras.g:7064:3: ( RULE_ID )
            // InternalCompras.g:7065:4: RULE_ID
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
    // InternalCompras.g:7076:1: rule__ModuleTech__PresentationLayerAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__PresentationLayerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7080:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7081:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7081:2: ( ( RULE_ID ) )
            // InternalCompras.g:7082:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getPresentationLayerPresentationLayerCrossReference_5_0()); 
            // InternalCompras.g:7083:3: ( RULE_ID )
            // InternalCompras.g:7084:4: RULE_ID
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
    // InternalCompras.g:7095:1: rule__ModuleTech__ControllerSegmentLayerAssignment_8_0 : ( ( ruleFQN ) ) ;
    public final void rule__ModuleTech__ControllerSegmentLayerAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7099:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7100:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7100:2: ( ( ruleFQN ) )
            // InternalCompras.g:7101:3: ( ruleFQN )
            {
             before(grammarAccess.getModuleTechAccess().getControllerSegmentLayerControllerSegmentLayerCrossReference_8_0_0()); 
            // InternalCompras.g:7102:3: ( ruleFQN )
            // InternalCompras.g:7103:4: ruleFQN
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
    // InternalCompras.g:7114:1: rule__ModuleTech__ControllersRefAssignment_8_3 : ( ruleControllersRef ) ;
    public final void rule__ModuleTech__ControllersRefAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7118:1: ( ( ruleControllersRef ) )
            // InternalCompras.g:7119:2: ( ruleControllersRef )
            {
            // InternalCompras.g:7119:2: ( ruleControllersRef )
            // InternalCompras.g:7120:3: ruleControllersRef
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
    // InternalCompras.g:7129:1: rule__ModuleTech__ViewSegmentLayerAssignment_9_0 : ( ( ruleFQN ) ) ;
    public final void rule__ModuleTech__ViewSegmentLayerAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7133:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7134:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7134:2: ( ( ruleFQN ) )
            // InternalCompras.g:7135:3: ( ruleFQN )
            {
             before(grammarAccess.getModuleTechAccess().getViewSegmentLayerViewSegmentLayerCrossReference_9_0_0()); 
            // InternalCompras.g:7136:3: ( ruleFQN )
            // InternalCompras.g:7137:4: ruleFQN
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
    // InternalCompras.g:7148:1: rule__ModuleTech__ViewsRefAssignment_9_3 : ( ruleViewsRef ) ;
    public final void rule__ModuleTech__ViewsRefAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7152:1: ( ( ruleViewsRef ) )
            // InternalCompras.g:7153:2: ( ruleViewsRef )
            {
            // InternalCompras.g:7153:2: ( ruleViewsRef )
            // InternalCompras.g:7154:3: ruleViewsRef
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
    // InternalCompras.g:7163:1: rule__ModuleTech__ScriptSegmentLayerAssignment_10_0 : ( ( ruleFQN ) ) ;
    public final void rule__ModuleTech__ScriptSegmentLayerAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7167:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7168:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7168:2: ( ( ruleFQN ) )
            // InternalCompras.g:7169:3: ( ruleFQN )
            {
             before(grammarAccess.getModuleTechAccess().getScriptSegmentLayerScriptSegmentLayerCrossReference_10_0_0()); 
            // InternalCompras.g:7170:3: ( ruleFQN )
            // InternalCompras.g:7171:4: ruleFQN
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
    // InternalCompras.g:7182:1: rule__ModuleTech__ScriptRefAssignment_10_3 : ( ruleScriptRef ) ;
    public final void rule__ModuleTech__ScriptRefAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7186:1: ( ( ruleScriptRef ) )
            // InternalCompras.g:7187:2: ( ruleScriptRef )
            {
            // InternalCompras.g:7187:2: ( ruleScriptRef )
            // InternalCompras.g:7188:3: ruleScriptRef
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
    // InternalCompras.g:7197:1: rule__ModuleTech__BusinessLayerAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__BusinessLayerAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7201:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7202:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7202:2: ( ( RULE_ID ) )
            // InternalCompras.g:7203:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getBusinessLayerBusinessLayerCrossReference_12_0()); 
            // InternalCompras.g:7204:3: ( RULE_ID )
            // InternalCompras.g:7205:4: RULE_ID
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
    // InternalCompras.g:7216:1: rule__ModuleTech__BusinessLayerRefAssignment_15 : ( ruleBusinessLayerRef ) ;
    public final void rule__ModuleTech__BusinessLayerRefAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7220:1: ( ( ruleBusinessLayerRef ) )
            // InternalCompras.g:7221:2: ( ruleBusinessLayerRef )
            {
            // InternalCompras.g:7221:2: ( ruleBusinessLayerRef )
            // InternalCompras.g:7222:3: ruleBusinessLayerRef
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
    // InternalCompras.g:7231:1: rule__ModuleTech__DataAccessLayerAssignment_17 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__DataAccessLayerAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7235:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7236:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7236:2: ( ( RULE_ID ) )
            // InternalCompras.g:7237:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getDataAccessLayerDataAccessLayerCrossReference_17_0()); 
            // InternalCompras.g:7238:3: ( RULE_ID )
            // InternalCompras.g:7239:4: RULE_ID
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
    // InternalCompras.g:7250:1: rule__ModuleTech__DataAccessLayerRefAssignment_20 : ( ruleDataAccessLayerRef ) ;
    public final void rule__ModuleTech__DataAccessLayerRefAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7254:1: ( ( ruleDataAccessLayerRef ) )
            // InternalCompras.g:7255:2: ( ruleDataAccessLayerRef )
            {
            // InternalCompras.g:7255:2: ( ruleDataAccessLayerRef )
            // InternalCompras.g:7256:3: ruleDataAccessLayerRef
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
    // InternalCompras.g:7265:1: rule__ModuleTech__CommonLayerAssignment_22 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleTech__CommonLayerAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7269:1: ( ( ( RULE_ID ) ) )
            // InternalCompras.g:7270:2: ( ( RULE_ID ) )
            {
            // InternalCompras.g:7270:2: ( ( RULE_ID ) )
            // InternalCompras.g:7271:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleTechAccess().getCommonLayerCommonLayerCrossReference_22_0()); 
            // InternalCompras.g:7272:3: ( RULE_ID )
            // InternalCompras.g:7273:4: RULE_ID
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
    // InternalCompras.g:7284:1: rule__ModuleTech__CommonLayerRefAssignment_25 : ( ruleCommonLayerRef ) ;
    public final void rule__ModuleTech__CommonLayerRefAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7288:1: ( ( ruleCommonLayerRef ) )
            // InternalCompras.g:7289:2: ( ruleCommonLayerRef )
            {
            // InternalCompras.g:7289:2: ( ruleCommonLayerRef )
            // InternalCompras.g:7290:3: ruleCommonLayerRef
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
    // InternalCompras.g:7299:1: rule__ControllersRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ControllersRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7303:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7304:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7304:2: ( ( ruleFQN ) )
            // InternalCompras.g:7305:3: ( ruleFQN )
            {
             before(grammarAccess.getControllersRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:7306:3: ( ruleFQN )
            // InternalCompras.g:7307:4: ruleFQN
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
    // InternalCompras.g:7318:1: rule__ViewsRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ViewsRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7322:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7323:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7323:2: ( ( ruleFQN ) )
            // InternalCompras.g:7324:3: ( ruleFQN )
            {
             before(grammarAccess.getViewsRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:7325:3: ( ruleFQN )
            // InternalCompras.g:7326:4: ruleFQN
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
    // InternalCompras.g:7337:1: rule__ScriptRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ScriptRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7341:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7342:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7342:2: ( ( ruleFQN ) )
            // InternalCompras.g:7343:3: ( ruleFQN )
            {
             before(grammarAccess.getScriptRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:7344:3: ( ruleFQN )
            // InternalCompras.g:7345:4: ruleFQN
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
    // InternalCompras.g:7356:1: rule__BusinessLayerRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__BusinessLayerRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7360:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7361:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7361:2: ( ( ruleFQN ) )
            // InternalCompras.g:7362:3: ( ruleFQN )
            {
             before(grammarAccess.getBusinessLayerRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:7363:3: ( ruleFQN )
            // InternalCompras.g:7364:4: ruleFQN
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
    // InternalCompras.g:7375:1: rule__DataAccessLayerRef__FunctionalityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__DataAccessLayerRef__FunctionalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7379:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7380:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7380:2: ( ( ruleFQN ) )
            // InternalCompras.g:7381:3: ( ruleFQN )
            {
             before(grammarAccess.getDataAccessLayerRefAccess().getFunctionalityFunctionalityCrossReference_2_0()); 
            // InternalCompras.g:7382:3: ( ruleFQN )
            // InternalCompras.g:7383:4: ruleFQN
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
    // InternalCompras.g:7394:1: rule__CommonLayerRef__EntityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__CommonLayerRef__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCompras.g:7398:1: ( ( ( ruleFQN ) ) )
            // InternalCompras.g:7399:2: ( ( ruleFQN ) )
            {
            // InternalCompras.g:7399:2: ( ( ruleFQN ) )
            // InternalCompras.g:7400:3: ( ruleFQN )
            {
             before(grammarAccess.getCommonLayerRefAccess().getEntityEntityCrossReference_2_0()); 
            // InternalCompras.g:7401:3: ( ruleFQN )
            // InternalCompras.g:7402:4: ruleFQN
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


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\5\1\31\1\uffff\1\5\1\32\1\31\1\36\1\uffff";
    static final String dfa_3s = "\1\36\1\37\1\uffff\1\5\1\32\1\37\1\64\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\4\uffff\1\1";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\30\uffff\1\2",
            "\1\4\5\uffff\1\3",
            "",
            "\1\5",
            "\1\6",
            "\1\4\5\uffff\1\3",
            "\1\7\23\uffff\1\7\2\2",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4798:2: ( rule__ModuleTech__Group_8__0 )?";
        }
    }
    static final String[] dfa_7s = {
            "\1\1\30\uffff\1\2",
            "\1\4\5\uffff\1\3",
            "",
            "\1\5",
            "\1\6",
            "\1\4\5\uffff\1\3",
            "\1\7\24\uffff\1\7\1\2",
            ""
    };
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "4825:2: ( rule__ModuleTech__Group_9__0 )?";
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
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000004000F020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000000F022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000401F0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000001F0002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000C00040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0003000040000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000040000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000040000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000040000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000040000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000040000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000002L});

}