package org.xtext.example.compras.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.compras.services.ComprasGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComprasParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SolutionName'", "':'", "'{'", "'Domain'", "'Architecture'", "'Technology'", "'}'", "'.'", "'Module'", "'Entities'", "'Functionalities'", "'['", "'label'", "']'", "'required'", "'RelEntity'", "'CREATE'", "'VIEW_GRID'", "'VIEW_DROPDOWN'", "'EDIT'", "'DELETE'", "'Layers'", "'PresentationLayer'", "'BusinessLayer'", "'DataAccessLayer'", "'CommonLayer'", "'Relations'", "'ControllerSegmentLayer'", "'ViewSegmentLayer'", "'ScriptSegmentLayer'", "'DbConnectorSegmentLayer'", "'AspNet'", "'Database'", "'DatabaseRDBMSType'", "'ConnectionString'", "'DataFileSeed'", "'Controller'", "'View'", "'Script'", "'BLogic'", "'DataAccess'", "'DtoModel'", "'string'", "'int'", "'bool'", "'float'", "'datetime'", "'AllowedToUse'", "'SQLSERVER'", "'ORACLE (future...)'", "'POSTGRES (future...)'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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

        public InternalComprasParser(TokenStream input, ComprasGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Solution";
       	}

       	@Override
       	protected ComprasGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSolution"
    // InternalCompras.g:65:1: entryRuleSolution returns [EObject current=null] : iv_ruleSolution= ruleSolution EOF ;
    public final EObject entryRuleSolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolution = null;


        try {
            // InternalCompras.g:65:49: (iv_ruleSolution= ruleSolution EOF )
            // InternalCompras.g:66:2: iv_ruleSolution= ruleSolution EOF
            {
             newCompositeNode(grammarAccess.getSolutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolution=ruleSolution();

            state._fsp--;

             current =iv_ruleSolution; 
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
    // $ANTLR end "entryRuleSolution"


    // $ANTLR start "ruleSolution"
    // InternalCompras.g:72:1: ruleSolution returns [EObject current=null] : (otherlv_0= 'SolutionName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'Domain' otherlv_5= ':' ( (lv_domain_6_0= ruleDomain ) )? otherlv_7= 'Architecture' otherlv_8= ':' ( (lv_architecture_9_0= ruleArchitecture ) )? otherlv_10= 'Technology' otherlv_11= ':' ( (lv_technology_12_0= ruleTechnology ) )? otherlv_13= '}' ) ;
    public final EObject ruleSolution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_domain_6_0 = null;

        EObject lv_architecture_9_0 = null;

        EObject lv_technology_12_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:78:2: ( (otherlv_0= 'SolutionName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'Domain' otherlv_5= ':' ( (lv_domain_6_0= ruleDomain ) )? otherlv_7= 'Architecture' otherlv_8= ':' ( (lv_architecture_9_0= ruleArchitecture ) )? otherlv_10= 'Technology' otherlv_11= ':' ( (lv_technology_12_0= ruleTechnology ) )? otherlv_13= '}' ) )
            // InternalCompras.g:79:2: (otherlv_0= 'SolutionName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'Domain' otherlv_5= ':' ( (lv_domain_6_0= ruleDomain ) )? otherlv_7= 'Architecture' otherlv_8= ':' ( (lv_architecture_9_0= ruleArchitecture ) )? otherlv_10= 'Technology' otherlv_11= ':' ( (lv_technology_12_0= ruleTechnology ) )? otherlv_13= '}' )
            {
            // InternalCompras.g:79:2: (otherlv_0= 'SolutionName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'Domain' otherlv_5= ':' ( (lv_domain_6_0= ruleDomain ) )? otherlv_7= 'Architecture' otherlv_8= ':' ( (lv_architecture_9_0= ruleArchitecture ) )? otherlv_10= 'Technology' otherlv_11= ':' ( (lv_technology_12_0= ruleTechnology ) )? otherlv_13= '}' )
            // InternalCompras.g:80:3: otherlv_0= 'SolutionName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'Domain' otherlv_5= ':' ( (lv_domain_6_0= ruleDomain ) )? otherlv_7= 'Architecture' otherlv_8= ':' ( (lv_architecture_9_0= ruleArchitecture ) )? otherlv_10= 'Technology' otherlv_11= ':' ( (lv_technology_12_0= ruleTechnology ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSolutionAccess().getSolutionNameKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSolutionAccess().getColonKeyword_1());
            		
            // InternalCompras.g:88:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCompras.g:89:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCompras.g:89:4: (lv_name_2_0= RULE_ID )
            // InternalCompras.g:90:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSolutionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSolutionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSolutionAccess().getDomainKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getSolutionAccess().getColonKeyword_5());
            		
            // InternalCompras.g:118:3: ( (lv_domain_6_0= ruleDomain ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCompras.g:119:4: (lv_domain_6_0= ruleDomain )
                    {
                    // InternalCompras.g:119:4: (lv_domain_6_0= ruleDomain )
                    // InternalCompras.g:120:5: lv_domain_6_0= ruleDomain
                    {

                    					newCompositeNode(grammarAccess.getSolutionAccess().getDomainDomainParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_domain_6_0=ruleDomain();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSolutionRule());
                    					}
                    					set(
                    						current,
                    						"domain",
                    						lv_domain_6_0,
                    						"org.xtext.example.compras.Compras.Domain");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getSolutionAccess().getArchitectureKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getSolutionAccess().getColonKeyword_8());
            		
            // InternalCompras.g:145:3: ( (lv_architecture_9_0= ruleArchitecture ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCompras.g:146:4: (lv_architecture_9_0= ruleArchitecture )
                    {
                    // InternalCompras.g:146:4: (lv_architecture_9_0= ruleArchitecture )
                    // InternalCompras.g:147:5: lv_architecture_9_0= ruleArchitecture
                    {

                    					newCompositeNode(grammarAccess.getSolutionAccess().getArchitectureArchitectureParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_architecture_9_0=ruleArchitecture();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSolutionRule());
                    					}
                    					set(
                    						current,
                    						"architecture",
                    						lv_architecture_9_0,
                    						"org.xtext.example.compras.Compras.Architecture");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getSolutionAccess().getTechnologyKeyword_10());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getSolutionAccess().getColonKeyword_11());
            		
            // InternalCompras.g:172:3: ( (lv_technology_12_0= ruleTechnology ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCompras.g:173:4: (lv_technology_12_0= ruleTechnology )
                    {
                    // InternalCompras.g:173:4: (lv_technology_12_0= ruleTechnology )
                    // InternalCompras.g:174:5: lv_technology_12_0= ruleTechnology
                    {

                    					newCompositeNode(grammarAccess.getSolutionAccess().getTechnologyTechnologyParserRuleCall_12_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_technology_12_0=ruleTechnology();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSolutionRule());
                    					}
                    					set(
                    						current,
                    						"technology",
                    						lv_technology_12_0,
                    						"org.xtext.example.compras.Compras.Technology");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleSolution"


    // $ANTLR start "entryRuleFQN"
    // InternalCompras.g:199:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCompras.g:199:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalCompras.g:200:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalCompras.g:206:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCompras.g:212:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCompras.g:213:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCompras.g:213:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCompras.g:214:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalCompras.g:221:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCompras.g:222:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleDomain"
    // InternalCompras.g:239:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalCompras.g:239:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalCompras.g:240:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalCompras.g:246:1: ruleDomain returns [EObject current=null] : (otherlv_0= '{' ( (lv_module_1_0= ruleModule ) )+ otherlv_2= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_module_1_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:252:2: ( (otherlv_0= '{' ( (lv_module_1_0= ruleModule ) )+ otherlv_2= '}' ) )
            // InternalCompras.g:253:2: (otherlv_0= '{' ( (lv_module_1_0= ruleModule ) )+ otherlv_2= '}' )
            {
            // InternalCompras.g:253:2: (otherlv_0= '{' ( (lv_module_1_0= ruleModule ) )+ otherlv_2= '}' )
            // InternalCompras.g:254:3: otherlv_0= '{' ( (lv_module_1_0= ruleModule ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalCompras.g:258:3: ( (lv_module_1_0= ruleModule ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCompras.g:259:4: (lv_module_1_0= ruleModule )
            	    {
            	    // InternalCompras.g:259:4: (lv_module_1_0= ruleModule )
            	    // InternalCompras.g:260:5: lv_module_1_0= ruleModule
            	    {

            	    					newCompositeNode(grammarAccess.getDomainAccess().getModuleModuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_module_1_0=ruleModule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"module",
            	    						lv_module_1_0,
            	    						"org.xtext.example.compras.Compras.Module");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleModule"
    // InternalCompras.g:285:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalCompras.g:285:47: (iv_ruleModule= ruleModule EOF )
            // InternalCompras.g:286:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalCompras.g:292:1: ruleModule returns [EObject current=null] : (otherlv_0= 'Module' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' otherlv_5= 'Entities' otherlv_6= ':' otherlv_7= '{' ( (lv_entity_8_0= ruleEntity ) )* otherlv_9= '}' (otherlv_10= 'Functionalities' otherlv_11= ':' otherlv_12= '{' ( (lv_functionality_13_0= ruleFunctionality ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_entity_8_0 = null;

        EObject lv_functionality_13_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:298:2: ( (otherlv_0= 'Module' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' otherlv_5= 'Entities' otherlv_6= ':' otherlv_7= '{' ( (lv_entity_8_0= ruleEntity ) )* otherlv_9= '}' (otherlv_10= 'Functionalities' otherlv_11= ':' otherlv_12= '{' ( (lv_functionality_13_0= ruleFunctionality ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalCompras.g:299:2: (otherlv_0= 'Module' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' otherlv_5= 'Entities' otherlv_6= ':' otherlv_7= '{' ( (lv_entity_8_0= ruleEntity ) )* otherlv_9= '}' (otherlv_10= 'Functionalities' otherlv_11= ':' otherlv_12= '{' ( (lv_functionality_13_0= ruleFunctionality ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalCompras.g:299:2: (otherlv_0= 'Module' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' otherlv_5= 'Entities' otherlv_6= ':' otherlv_7= '{' ( (lv_entity_8_0= ruleEntity ) )* otherlv_9= '}' (otherlv_10= 'Functionalities' otherlv_11= ':' otherlv_12= '{' ( (lv_functionality_13_0= ruleFunctionality ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalCompras.g:300:3: otherlv_0= 'Module' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' otherlv_5= 'Entities' otherlv_6= ':' otherlv_7= '{' ( (lv_entity_8_0= ruleEntity ) )* otherlv_9= '}' (otherlv_10= 'Functionalities' otherlv_11= ':' otherlv_12= '{' ( (lv_functionality_13_0= ruleFunctionality ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getColonKeyword_1());
            		
            // InternalCompras.g:308:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCompras.g:309:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCompras.g:309:4: (lv_name_2_0= RULE_ID )
            // InternalCompras.g:310:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_2_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getEntitiesKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getModuleAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalCompras.g:346:3: ( (lv_entity_8_0= ruleEntity ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCompras.g:347:4: (lv_entity_8_0= ruleEntity )
            	    {
            	    // InternalCompras.g:347:4: (lv_entity_8_0= ruleEntity )
            	    // InternalCompras.g:348:5: lv_entity_8_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getEntityEntityParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_entity_8_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entity",
            	    						lv_entity_8_0,
            	    						"org.xtext.example.compras.Compras.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_9());
            		
            // InternalCompras.g:369:3: (otherlv_10= 'Functionalities' otherlv_11= ':' otherlv_12= '{' ( (lv_functionality_13_0= ruleFunctionality ) )* otherlv_14= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCompras.g:370:4: otherlv_10= 'Functionalities' otherlv_11= ':' otherlv_12= '{' ( (lv_functionality_13_0= ruleFunctionality ) )* otherlv_14= '}'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getModuleAccess().getFunctionalitiesKeyword_10_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getModuleAccess().getColonKeyword_10_1());
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_10_2());
                    			
                    // InternalCompras.g:382:4: ( (lv_functionality_13_0= ruleFunctionality ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCompras.g:383:5: (lv_functionality_13_0= ruleFunctionality )
                    	    {
                    	    // InternalCompras.g:383:5: (lv_functionality_13_0= ruleFunctionality )
                    	    // InternalCompras.g:384:6: lv_functionality_13_0= ruleFunctionality
                    	    {

                    	    						newCompositeNode(grammarAccess.getModuleAccess().getFunctionalityFunctionalityParserRuleCall_10_3_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_functionality_13_0=ruleFunctionality();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"functionality",
                    	    							lv_functionality_13_0,
                    	    							"org.xtext.example.compras.Compras.Functionality");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleEntity"
    // InternalCompras.g:414:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalCompras.g:414:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalCompras.g:415:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalCompras.g:421:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_entityField_3_0= ruleEntityField ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entityField_3_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:427:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_entityField_3_0= ruleEntityField ) )* otherlv_4= '}' ) )
            // InternalCompras.g:428:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_entityField_3_0= ruleEntityField ) )* otherlv_4= '}' )
            {
            // InternalCompras.g:428:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_entityField_3_0= ruleEntityField ) )* otherlv_4= '}' )
            // InternalCompras.g:429:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_entityField_3_0= ruleEntityField ) )* otherlv_4= '}'
            {
            // InternalCompras.g:429:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:430:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:430:4: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:431:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCompras.g:455:3: ( (lv_entityField_3_0= ruleEntityField ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==22||(LA9_0>=53 && LA9_0<=57)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCompras.g:456:4: (lv_entityField_3_0= ruleEntityField )
            	    {
            	    // InternalCompras.g:456:4: (lv_entityField_3_0= ruleEntityField )
            	    // InternalCompras.g:457:5: lv_entityField_3_0= ruleEntityField
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getEntityFieldEntityFieldParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_entityField_3_0=ruleEntityField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entityField",
            	    						lv_entityField_3_0,
            	    						"org.xtext.example.compras.Compras.EntityField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityField"
    // InternalCompras.g:482:1: entryRuleEntityField returns [EObject current=null] : iv_ruleEntityField= ruleEntityField EOF ;
    public final EObject entryRuleEntityField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityField = null;


        try {
            // InternalCompras.g:482:52: (iv_ruleEntityField= ruleEntityField EOF )
            // InternalCompras.g:483:2: iv_ruleEntityField= ruleEntityField EOF
            {
             newCompositeNode(grammarAccess.getEntityFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityField=ruleEntityField();

            state._fsp--;

             current =iv_ruleEntityField; 
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
    // $ANTLR end "entryRuleEntityField"


    // $ANTLR start "ruleEntityField"
    // InternalCompras.g:489:1: ruleEntityField returns [EObject current=null] : ( ( (lv_entityFieldRequired_0_0= ruleEntityFieldRequired ) )? ( (lv_entityFieldLabel_1_0= ruleEntityFieldLabel ) )? ( (lv_entityType_2_0= ruleEntityType ) ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleEntityField() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_entityFieldRequired_0_0 = null;

        EObject lv_entityFieldLabel_1_0 = null;

        EObject lv_entityType_2_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:495:2: ( ( ( (lv_entityFieldRequired_0_0= ruleEntityFieldRequired ) )? ( (lv_entityFieldLabel_1_0= ruleEntityFieldLabel ) )? ( (lv_entityType_2_0= ruleEntityType ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalCompras.g:496:2: ( ( (lv_entityFieldRequired_0_0= ruleEntityFieldRequired ) )? ( (lv_entityFieldLabel_1_0= ruleEntityFieldLabel ) )? ( (lv_entityType_2_0= ruleEntityType ) ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalCompras.g:496:2: ( ( (lv_entityFieldRequired_0_0= ruleEntityFieldRequired ) )? ( (lv_entityFieldLabel_1_0= ruleEntityFieldLabel ) )? ( (lv_entityType_2_0= ruleEntityType ) ) ( (lv_name_3_0= RULE_ID ) ) )
            // InternalCompras.g:497:3: ( (lv_entityFieldRequired_0_0= ruleEntityFieldRequired ) )? ( (lv_entityFieldLabel_1_0= ruleEntityFieldLabel ) )? ( (lv_entityType_2_0= ruleEntityType ) ) ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalCompras.g:497:3: ( (lv_entityFieldRequired_0_0= ruleEntityFieldRequired ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==25) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalCompras.g:498:4: (lv_entityFieldRequired_0_0= ruleEntityFieldRequired )
                    {
                    // InternalCompras.g:498:4: (lv_entityFieldRequired_0_0= ruleEntityFieldRequired )
                    // InternalCompras.g:499:5: lv_entityFieldRequired_0_0= ruleEntityFieldRequired
                    {

                    					newCompositeNode(grammarAccess.getEntityFieldAccess().getEntityFieldRequiredEntityFieldRequiredParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_entityFieldRequired_0_0=ruleEntityFieldRequired();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityFieldRule());
                    					}
                    					set(
                    						current,
                    						"entityFieldRequired",
                    						lv_entityFieldRequired_0_0,
                    						"org.xtext.example.compras.Compras.EntityFieldRequired");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCompras.g:516:3: ( (lv_entityFieldLabel_1_0= ruleEntityFieldLabel ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCompras.g:517:4: (lv_entityFieldLabel_1_0= ruleEntityFieldLabel )
                    {
                    // InternalCompras.g:517:4: (lv_entityFieldLabel_1_0= ruleEntityFieldLabel )
                    // InternalCompras.g:518:5: lv_entityFieldLabel_1_0= ruleEntityFieldLabel
                    {

                    					newCompositeNode(grammarAccess.getEntityFieldAccess().getEntityFieldLabelEntityFieldLabelParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_entityFieldLabel_1_0=ruleEntityFieldLabel();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityFieldRule());
                    					}
                    					set(
                    						current,
                    						"entityFieldLabel",
                    						lv_entityFieldLabel_1_0,
                    						"org.xtext.example.compras.Compras.EntityFieldLabel");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCompras.g:535:3: ( (lv_entityType_2_0= ruleEntityType ) )
            // InternalCompras.g:536:4: (lv_entityType_2_0= ruleEntityType )
            {
            // InternalCompras.g:536:4: (lv_entityType_2_0= ruleEntityType )
            // InternalCompras.g:537:5: lv_entityType_2_0= ruleEntityType
            {

            					newCompositeNode(grammarAccess.getEntityFieldAccess().getEntityTypeEntityTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_entityType_2_0=ruleEntityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityFieldRule());
            					}
            					set(
            						current,
            						"entityType",
            						lv_entityType_2_0,
            						"org.xtext.example.compras.Compras.EntityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCompras.g:554:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCompras.g:555:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCompras.g:555:4: (lv_name_3_0= RULE_ID )
            // InternalCompras.g:556:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getEntityFieldAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleEntityField"


    // $ANTLR start "entryRuleEntityFieldLabel"
    // InternalCompras.g:576:1: entryRuleEntityFieldLabel returns [EObject current=null] : iv_ruleEntityFieldLabel= ruleEntityFieldLabel EOF ;
    public final EObject entryRuleEntityFieldLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityFieldLabel = null;


        try {
            // InternalCompras.g:576:57: (iv_ruleEntityFieldLabel= ruleEntityFieldLabel EOF )
            // InternalCompras.g:577:2: iv_ruleEntityFieldLabel= ruleEntityFieldLabel EOF
            {
             newCompositeNode(grammarAccess.getEntityFieldLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityFieldLabel=ruleEntityFieldLabel();

            state._fsp--;

             current =iv_ruleEntityFieldLabel; 
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
    // $ANTLR end "entryRuleEntityFieldLabel"


    // $ANTLR start "ruleEntityFieldLabel"
    // InternalCompras.g:583:1: ruleEntityFieldLabel returns [EObject current=null] : (otherlv_0= '[' otherlv_1= 'label' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ']' ) ;
    public final EObject ruleEntityFieldLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCompras.g:589:2: ( (otherlv_0= '[' otherlv_1= 'label' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ']' ) )
            // InternalCompras.g:590:2: (otherlv_0= '[' otherlv_1= 'label' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ']' )
            {
            // InternalCompras.g:590:2: (otherlv_0= '[' otherlv_1= 'label' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ']' )
            // InternalCompras.g:591:3: otherlv_0= '[' otherlv_1= 'label' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityFieldLabelAccess().getLeftSquareBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityFieldLabelAccess().getLabelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityFieldLabelAccess().getColonKeyword_2());
            		
            // InternalCompras.g:603:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalCompras.g:604:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalCompras.g:604:4: (lv_name_3_0= RULE_STRING )
            // InternalCompras.g:605:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_name_3_0, grammarAccess.getEntityFieldLabelAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityFieldLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityFieldLabelAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEntityFieldLabel"


    // $ANTLR start "entryRuleEntityFieldRequired"
    // InternalCompras.g:629:1: entryRuleEntityFieldRequired returns [EObject current=null] : iv_ruleEntityFieldRequired= ruleEntityFieldRequired EOF ;
    public final EObject entryRuleEntityFieldRequired() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityFieldRequired = null;


        try {
            // InternalCompras.g:629:60: (iv_ruleEntityFieldRequired= ruleEntityFieldRequired EOF )
            // InternalCompras.g:630:2: iv_ruleEntityFieldRequired= ruleEntityFieldRequired EOF
            {
             newCompositeNode(grammarAccess.getEntityFieldRequiredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityFieldRequired=ruleEntityFieldRequired();

            state._fsp--;

             current =iv_ruleEntityFieldRequired; 
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
    // $ANTLR end "entryRuleEntityFieldRequired"


    // $ANTLR start "ruleEntityFieldRequired"
    // InternalCompras.g:636:1: ruleEntityFieldRequired returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= 'required' ) ) otherlv_2= ']' ) ;
    public final EObject ruleEntityFieldRequired() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCompras.g:642:2: ( (otherlv_0= '[' ( (lv_name_1_0= 'required' ) ) otherlv_2= ']' ) )
            // InternalCompras.g:643:2: (otherlv_0= '[' ( (lv_name_1_0= 'required' ) ) otherlv_2= ']' )
            {
            // InternalCompras.g:643:2: (otherlv_0= '[' ( (lv_name_1_0= 'required' ) ) otherlv_2= ']' )
            // InternalCompras.g:644:3: otherlv_0= '[' ( (lv_name_1_0= 'required' ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityFieldRequiredAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalCompras.g:648:3: ( (lv_name_1_0= 'required' ) )
            // InternalCompras.g:649:4: (lv_name_1_0= 'required' )
            {
            // InternalCompras.g:649:4: (lv_name_1_0= 'required' )
            // InternalCompras.g:650:5: lv_name_1_0= 'required'
            {
            lv_name_1_0=(Token)match(input,25,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityFieldRequiredAccess().getNameRequiredKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityFieldRequiredRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "required");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityFieldRequiredAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleEntityFieldRequired"


    // $ANTLR start "entryRuleEntityType"
    // InternalCompras.g:670:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalCompras.g:670:51: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalCompras.g:671:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalCompras.g:677:1: ruleEntityType returns [EObject current=null] : ( ( ( ruleFQN ) ) | ( (lv_commonFieldType_1_0= ruleCommonFieldType ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_commonFieldType_1_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:683:2: ( ( ( ( ruleFQN ) ) | ( (lv_commonFieldType_1_0= ruleCommonFieldType ) ) ) )
            // InternalCompras.g:684:2: ( ( ( ruleFQN ) ) | ( (lv_commonFieldType_1_0= ruleCommonFieldType ) ) )
            {
            // InternalCompras.g:684:2: ( ( ( ruleFQN ) ) | ( (lv_commonFieldType_1_0= ruleCommonFieldType ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=53 && LA12_0<=57)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCompras.g:685:3: ( ( ruleFQN ) )
                    {
                    // InternalCompras.g:685:3: ( ( ruleFQN ) )
                    // InternalCompras.g:686:4: ( ruleFQN )
                    {
                    // InternalCompras.g:686:4: ( ruleFQN )
                    // InternalCompras.g:687:5: ruleFQN
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityTypeRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:702:3: ( (lv_commonFieldType_1_0= ruleCommonFieldType ) )
                    {
                    // InternalCompras.g:702:3: ( (lv_commonFieldType_1_0= ruleCommonFieldType ) )
                    // InternalCompras.g:703:4: (lv_commonFieldType_1_0= ruleCommonFieldType )
                    {
                    // InternalCompras.g:703:4: (lv_commonFieldType_1_0= ruleCommonFieldType )
                    // InternalCompras.g:704:5: lv_commonFieldType_1_0= ruleCommonFieldType
                    {

                    					newCompositeNode(grammarAccess.getEntityTypeAccess().getCommonFieldTypeCommonFieldTypeEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_commonFieldType_1_0=ruleCommonFieldType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityTypeRule());
                    					}
                    					set(
                    						current,
                    						"commonFieldType",
                    						lv_commonFieldType_1_0,
                    						"org.xtext.example.compras.Compras.CommonFieldType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleFunctionality"
    // InternalCompras.g:725:1: entryRuleFunctionality returns [EObject current=null] : iv_ruleFunctionality= ruleFunctionality EOF ;
    public final EObject entryRuleFunctionality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionality = null;


        try {
            // InternalCompras.g:725:54: (iv_ruleFunctionality= ruleFunctionality EOF )
            // InternalCompras.g:726:2: iv_ruleFunctionality= ruleFunctionality EOF
            {
             newCompositeNode(grammarAccess.getFunctionalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionality=ruleFunctionality();

            state._fsp--;

             current =iv_ruleFunctionality; 
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
    // $ANTLR end "entryRuleFunctionality"


    // $ANTLR start "ruleFunctionality"
    // InternalCompras.g:732:1: ruleFunctionality returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'RelEntity' ( ( ruleFQN ) ) otherlv_3= ':' otherlv_4= '{' ( (lv_functionalityActionType_5_0= ruleFunctionalityActionType ) )* otherlv_6= '}' ) ;
    public final EObject ruleFunctionality() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_functionalityActionType_5_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:738:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'RelEntity' ( ( ruleFQN ) ) otherlv_3= ':' otherlv_4= '{' ( (lv_functionalityActionType_5_0= ruleFunctionalityActionType ) )* otherlv_6= '}' ) )
            // InternalCompras.g:739:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'RelEntity' ( ( ruleFQN ) ) otherlv_3= ':' otherlv_4= '{' ( (lv_functionalityActionType_5_0= ruleFunctionalityActionType ) )* otherlv_6= '}' )
            {
            // InternalCompras.g:739:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'RelEntity' ( ( ruleFQN ) ) otherlv_3= ':' otherlv_4= '{' ( (lv_functionalityActionType_5_0= ruleFunctionalityActionType ) )* otherlv_6= '}' )
            // InternalCompras.g:740:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'RelEntity' ( ( ruleFQN ) ) otherlv_3= ':' otherlv_4= '{' ( (lv_functionalityActionType_5_0= ruleFunctionalityActionType ) )* otherlv_6= '}'
            {
            // InternalCompras.g:740:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:741:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:741:4: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:742:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFunctionalityAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionalityAccess().getRelEntityKeyword_1());
            		
            // InternalCompras.g:762:3: ( ( ruleFQN ) )
            // InternalCompras.g:763:4: ( ruleFQN )
            {
            // InternalCompras.g:763:4: ( ruleFQN )
            // InternalCompras.g:764:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionalityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFunctionalityAccess().getEntityEntityCrossReference_2_0());
            				
            pushFollow(FOLLOW_3);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionalityAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalCompras.g:786:3: ( (lv_functionalityActionType_5_0= ruleFunctionalityActionType ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=27 && LA13_0<=31)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCompras.g:787:4: (lv_functionalityActionType_5_0= ruleFunctionalityActionType )
            	    {
            	    // InternalCompras.g:787:4: (lv_functionalityActionType_5_0= ruleFunctionalityActionType )
            	    // InternalCompras.g:788:5: lv_functionalityActionType_5_0= ruleFunctionalityActionType
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionalityAccess().getFunctionalityActionTypeFunctionalityActionTypeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_functionalityActionType_5_0=ruleFunctionalityActionType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionalityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functionalityActionType",
            	    						lv_functionalityActionType_5_0,
            	    						"org.xtext.example.compras.Compras.FunctionalityActionType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionalityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleFunctionality"


    // $ANTLR start "entryRuleFunctionalityActionType"
    // InternalCompras.g:813:1: entryRuleFunctionalityActionType returns [EObject current=null] : iv_ruleFunctionalityActionType= ruleFunctionalityActionType EOF ;
    public final EObject entryRuleFunctionalityActionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalityActionType = null;


        try {
            // InternalCompras.g:813:64: (iv_ruleFunctionalityActionType= ruleFunctionalityActionType EOF )
            // InternalCompras.g:814:2: iv_ruleFunctionalityActionType= ruleFunctionalityActionType EOF
            {
             newCompositeNode(grammarAccess.getFunctionalityActionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionalityActionType=ruleFunctionalityActionType();

            state._fsp--;

             current =iv_ruleFunctionalityActionType; 
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
    // $ANTLR end "entryRuleFunctionalityActionType"


    // $ANTLR start "ruleFunctionalityActionType"
    // InternalCompras.g:820:1: ruleFunctionalityActionType returns [EObject current=null] : (this_FuncCreateAction_0= ruleFuncCreateAction | this_FuncViewGridAction_1= ruleFuncViewGridAction | this_FuncViewDropDownAction_2= ruleFuncViewDropDownAction | this_FuncEditAction_3= ruleFuncEditAction | this_FuncDeleteAction_4= ruleFuncDeleteAction ) ;
    public final EObject ruleFunctionalityActionType() throws RecognitionException {
        EObject current = null;

        EObject this_FuncCreateAction_0 = null;

        EObject this_FuncViewGridAction_1 = null;

        EObject this_FuncViewDropDownAction_2 = null;

        EObject this_FuncEditAction_3 = null;

        EObject this_FuncDeleteAction_4 = null;



        	enterRule();

        try {
            // InternalCompras.g:826:2: ( (this_FuncCreateAction_0= ruleFuncCreateAction | this_FuncViewGridAction_1= ruleFuncViewGridAction | this_FuncViewDropDownAction_2= ruleFuncViewDropDownAction | this_FuncEditAction_3= ruleFuncEditAction | this_FuncDeleteAction_4= ruleFuncDeleteAction ) )
            // InternalCompras.g:827:2: (this_FuncCreateAction_0= ruleFuncCreateAction | this_FuncViewGridAction_1= ruleFuncViewGridAction | this_FuncViewDropDownAction_2= ruleFuncViewDropDownAction | this_FuncEditAction_3= ruleFuncEditAction | this_FuncDeleteAction_4= ruleFuncDeleteAction )
            {
            // InternalCompras.g:827:2: (this_FuncCreateAction_0= ruleFuncCreateAction | this_FuncViewGridAction_1= ruleFuncViewGridAction | this_FuncViewDropDownAction_2= ruleFuncViewDropDownAction | this_FuncEditAction_3= ruleFuncEditAction | this_FuncDeleteAction_4= ruleFuncDeleteAction )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case 28:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            case 30:
                {
                alt14=4;
                }
                break;
            case 31:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalCompras.g:828:3: this_FuncCreateAction_0= ruleFuncCreateAction
                    {

                    			newCompositeNode(grammarAccess.getFunctionalityActionTypeAccess().getFuncCreateActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncCreateAction_0=ruleFuncCreateAction();

                    state._fsp--;


                    			current = this_FuncCreateAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCompras.g:837:3: this_FuncViewGridAction_1= ruleFuncViewGridAction
                    {

                    			newCompositeNode(grammarAccess.getFunctionalityActionTypeAccess().getFuncViewGridActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncViewGridAction_1=ruleFuncViewGridAction();

                    state._fsp--;


                    			current = this_FuncViewGridAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCompras.g:846:3: this_FuncViewDropDownAction_2= ruleFuncViewDropDownAction
                    {

                    			newCompositeNode(grammarAccess.getFunctionalityActionTypeAccess().getFuncViewDropDownActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncViewDropDownAction_2=ruleFuncViewDropDownAction();

                    state._fsp--;


                    			current = this_FuncViewDropDownAction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCompras.g:855:3: this_FuncEditAction_3= ruleFuncEditAction
                    {

                    			newCompositeNode(grammarAccess.getFunctionalityActionTypeAccess().getFuncEditActionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncEditAction_3=ruleFuncEditAction();

                    state._fsp--;


                    			current = this_FuncEditAction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCompras.g:864:3: this_FuncDeleteAction_4= ruleFuncDeleteAction
                    {

                    			newCompositeNode(grammarAccess.getFunctionalityActionTypeAccess().getFuncDeleteActionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncDeleteAction_4=ruleFuncDeleteAction();

                    state._fsp--;


                    			current = this_FuncDeleteAction_4;
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
    // $ANTLR end "ruleFunctionalityActionType"


    // $ANTLR start "entryRuleFuncCreateAction"
    // InternalCompras.g:876:1: entryRuleFuncCreateAction returns [EObject current=null] : iv_ruleFuncCreateAction= ruleFuncCreateAction EOF ;
    public final EObject entryRuleFuncCreateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncCreateAction = null;


        try {
            // InternalCompras.g:876:57: (iv_ruleFuncCreateAction= ruleFuncCreateAction EOF )
            // InternalCompras.g:877:2: iv_ruleFuncCreateAction= ruleFuncCreateAction EOF
            {
             newCompositeNode(grammarAccess.getFuncCreateActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncCreateAction=ruleFuncCreateAction();

            state._fsp--;

             current =iv_ruleFuncCreateAction; 
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
    // $ANTLR end "entryRuleFuncCreateAction"


    // $ANTLR start "ruleFuncCreateAction"
    // InternalCompras.g:883:1: ruleFuncCreateAction returns [EObject current=null] : ( (lv_name_0_0= 'CREATE' ) ) ;
    public final EObject ruleFuncCreateAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:889:2: ( ( (lv_name_0_0= 'CREATE' ) ) )
            // InternalCompras.g:890:2: ( (lv_name_0_0= 'CREATE' ) )
            {
            // InternalCompras.g:890:2: ( (lv_name_0_0= 'CREATE' ) )
            // InternalCompras.g:891:3: (lv_name_0_0= 'CREATE' )
            {
            // InternalCompras.g:891:3: (lv_name_0_0= 'CREATE' )
            // InternalCompras.g:892:4: lv_name_0_0= 'CREATE'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFuncCreateActionAccess().getNameCREATEKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFuncCreateActionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "CREATE");
            			

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
    // $ANTLR end "ruleFuncCreateAction"


    // $ANTLR start "entryRuleFuncViewGridAction"
    // InternalCompras.g:907:1: entryRuleFuncViewGridAction returns [EObject current=null] : iv_ruleFuncViewGridAction= ruleFuncViewGridAction EOF ;
    public final EObject entryRuleFuncViewGridAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncViewGridAction = null;


        try {
            // InternalCompras.g:907:59: (iv_ruleFuncViewGridAction= ruleFuncViewGridAction EOF )
            // InternalCompras.g:908:2: iv_ruleFuncViewGridAction= ruleFuncViewGridAction EOF
            {
             newCompositeNode(grammarAccess.getFuncViewGridActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncViewGridAction=ruleFuncViewGridAction();

            state._fsp--;

             current =iv_ruleFuncViewGridAction; 
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
    // $ANTLR end "entryRuleFuncViewGridAction"


    // $ANTLR start "ruleFuncViewGridAction"
    // InternalCompras.g:914:1: ruleFuncViewGridAction returns [EObject current=null] : ( (lv_name_0_0= 'VIEW_GRID' ) ) ;
    public final EObject ruleFuncViewGridAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:920:2: ( ( (lv_name_0_0= 'VIEW_GRID' ) ) )
            // InternalCompras.g:921:2: ( (lv_name_0_0= 'VIEW_GRID' ) )
            {
            // InternalCompras.g:921:2: ( (lv_name_0_0= 'VIEW_GRID' ) )
            // InternalCompras.g:922:3: (lv_name_0_0= 'VIEW_GRID' )
            {
            // InternalCompras.g:922:3: (lv_name_0_0= 'VIEW_GRID' )
            // InternalCompras.g:923:4: lv_name_0_0= 'VIEW_GRID'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFuncViewGridActionAccess().getNameVIEW_GRIDKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFuncViewGridActionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "VIEW_GRID");
            			

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
    // $ANTLR end "ruleFuncViewGridAction"


    // $ANTLR start "entryRuleFuncViewDropDownAction"
    // InternalCompras.g:938:1: entryRuleFuncViewDropDownAction returns [EObject current=null] : iv_ruleFuncViewDropDownAction= ruleFuncViewDropDownAction EOF ;
    public final EObject entryRuleFuncViewDropDownAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncViewDropDownAction = null;


        try {
            // InternalCompras.g:938:63: (iv_ruleFuncViewDropDownAction= ruleFuncViewDropDownAction EOF )
            // InternalCompras.g:939:2: iv_ruleFuncViewDropDownAction= ruleFuncViewDropDownAction EOF
            {
             newCompositeNode(grammarAccess.getFuncViewDropDownActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncViewDropDownAction=ruleFuncViewDropDownAction();

            state._fsp--;

             current =iv_ruleFuncViewDropDownAction; 
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
    // $ANTLR end "entryRuleFuncViewDropDownAction"


    // $ANTLR start "ruleFuncViewDropDownAction"
    // InternalCompras.g:945:1: ruleFuncViewDropDownAction returns [EObject current=null] : ( (lv_name_0_0= 'VIEW_DROPDOWN' ) ) ;
    public final EObject ruleFuncViewDropDownAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:951:2: ( ( (lv_name_0_0= 'VIEW_DROPDOWN' ) ) )
            // InternalCompras.g:952:2: ( (lv_name_0_0= 'VIEW_DROPDOWN' ) )
            {
            // InternalCompras.g:952:2: ( (lv_name_0_0= 'VIEW_DROPDOWN' ) )
            // InternalCompras.g:953:3: (lv_name_0_0= 'VIEW_DROPDOWN' )
            {
            // InternalCompras.g:953:3: (lv_name_0_0= 'VIEW_DROPDOWN' )
            // InternalCompras.g:954:4: lv_name_0_0= 'VIEW_DROPDOWN'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFuncViewDropDownActionAccess().getNameVIEW_DROPDOWNKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFuncViewDropDownActionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "VIEW_DROPDOWN");
            			

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
    // $ANTLR end "ruleFuncViewDropDownAction"


    // $ANTLR start "entryRuleFuncEditAction"
    // InternalCompras.g:969:1: entryRuleFuncEditAction returns [EObject current=null] : iv_ruleFuncEditAction= ruleFuncEditAction EOF ;
    public final EObject entryRuleFuncEditAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncEditAction = null;


        try {
            // InternalCompras.g:969:55: (iv_ruleFuncEditAction= ruleFuncEditAction EOF )
            // InternalCompras.g:970:2: iv_ruleFuncEditAction= ruleFuncEditAction EOF
            {
             newCompositeNode(grammarAccess.getFuncEditActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncEditAction=ruleFuncEditAction();

            state._fsp--;

             current =iv_ruleFuncEditAction; 
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
    // $ANTLR end "entryRuleFuncEditAction"


    // $ANTLR start "ruleFuncEditAction"
    // InternalCompras.g:976:1: ruleFuncEditAction returns [EObject current=null] : ( (lv_name_0_0= 'EDIT' ) ) ;
    public final EObject ruleFuncEditAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:982:2: ( ( (lv_name_0_0= 'EDIT' ) ) )
            // InternalCompras.g:983:2: ( (lv_name_0_0= 'EDIT' ) )
            {
            // InternalCompras.g:983:2: ( (lv_name_0_0= 'EDIT' ) )
            // InternalCompras.g:984:3: (lv_name_0_0= 'EDIT' )
            {
            // InternalCompras.g:984:3: (lv_name_0_0= 'EDIT' )
            // InternalCompras.g:985:4: lv_name_0_0= 'EDIT'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFuncEditActionAccess().getNameEDITKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFuncEditActionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "EDIT");
            			

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
    // $ANTLR end "ruleFuncEditAction"


    // $ANTLR start "entryRuleFuncDeleteAction"
    // InternalCompras.g:1000:1: entryRuleFuncDeleteAction returns [EObject current=null] : iv_ruleFuncDeleteAction= ruleFuncDeleteAction EOF ;
    public final EObject entryRuleFuncDeleteAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncDeleteAction = null;


        try {
            // InternalCompras.g:1000:57: (iv_ruleFuncDeleteAction= ruleFuncDeleteAction EOF )
            // InternalCompras.g:1001:2: iv_ruleFuncDeleteAction= ruleFuncDeleteAction EOF
            {
             newCompositeNode(grammarAccess.getFuncDeleteActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncDeleteAction=ruleFuncDeleteAction();

            state._fsp--;

             current =iv_ruleFuncDeleteAction; 
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
    // $ANTLR end "entryRuleFuncDeleteAction"


    // $ANTLR start "ruleFuncDeleteAction"
    // InternalCompras.g:1007:1: ruleFuncDeleteAction returns [EObject current=null] : ( (lv_name_0_0= 'DELETE' ) ) ;
    public final EObject ruleFuncDeleteAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:1013:2: ( ( (lv_name_0_0= 'DELETE' ) ) )
            // InternalCompras.g:1014:2: ( (lv_name_0_0= 'DELETE' ) )
            {
            // InternalCompras.g:1014:2: ( (lv_name_0_0= 'DELETE' ) )
            // InternalCompras.g:1015:3: (lv_name_0_0= 'DELETE' )
            {
            // InternalCompras.g:1015:3: (lv_name_0_0= 'DELETE' )
            // InternalCompras.g:1016:4: lv_name_0_0= 'DELETE'
            {
            lv_name_0_0=(Token)match(input,31,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFuncDeleteActionAccess().getNameDELETEKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFuncDeleteActionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "DELETE");
            			

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
    // $ANTLR end "ruleFuncDeleteAction"


    // $ANTLR start "entryRuleArchitecture"
    // InternalCompras.g:1031:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // InternalCompras.g:1031:53: (iv_ruleArchitecture= ruleArchitecture EOF )
            // InternalCompras.g:1032:2: iv_ruleArchitecture= ruleArchitecture EOF
            {
             newCompositeNode(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitecture=ruleArchitecture();

            state._fsp--;

             current =iv_ruleArchitecture; 
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
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // InternalCompras.g:1038:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'Layers' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'PresentationLayer' otherlv_5= ':' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) otherlv_7= 'BusinessLayer' otherlv_8= ':' ( (lv_businessLayer_9_0= ruleBusinessLayer ) ) otherlv_10= 'DataAccessLayer' otherlv_11= ':' ( (lv_dataAccessLayer_12_0= ruleDataAccessLayer ) ) otherlv_13= 'CommonLayer' otherlv_14= ':' ( (lv_commonLayer_15_0= ruleCommonLayer ) ) otherlv_16= '}' otherlv_17= 'Relations' otherlv_18= ':' ( (lv_relations_19_0= ruleRelations ) ) otherlv_20= '}' ) ;
    public final EObject ruleArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_presentationLayer_6_0 = null;

        EObject lv_businessLayer_9_0 = null;

        EObject lv_dataAccessLayer_12_0 = null;

        EObject lv_commonLayer_15_0 = null;

        EObject lv_relations_19_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:1044:2: ( (otherlv_0= '{' otherlv_1= 'Layers' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'PresentationLayer' otherlv_5= ':' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) otherlv_7= 'BusinessLayer' otherlv_8= ':' ( (lv_businessLayer_9_0= ruleBusinessLayer ) ) otherlv_10= 'DataAccessLayer' otherlv_11= ':' ( (lv_dataAccessLayer_12_0= ruleDataAccessLayer ) ) otherlv_13= 'CommonLayer' otherlv_14= ':' ( (lv_commonLayer_15_0= ruleCommonLayer ) ) otherlv_16= '}' otherlv_17= 'Relations' otherlv_18= ':' ( (lv_relations_19_0= ruleRelations ) ) otherlv_20= '}' ) )
            // InternalCompras.g:1045:2: (otherlv_0= '{' otherlv_1= 'Layers' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'PresentationLayer' otherlv_5= ':' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) otherlv_7= 'BusinessLayer' otherlv_8= ':' ( (lv_businessLayer_9_0= ruleBusinessLayer ) ) otherlv_10= 'DataAccessLayer' otherlv_11= ':' ( (lv_dataAccessLayer_12_0= ruleDataAccessLayer ) ) otherlv_13= 'CommonLayer' otherlv_14= ':' ( (lv_commonLayer_15_0= ruleCommonLayer ) ) otherlv_16= '}' otherlv_17= 'Relations' otherlv_18= ':' ( (lv_relations_19_0= ruleRelations ) ) otherlv_20= '}' )
            {
            // InternalCompras.g:1045:2: (otherlv_0= '{' otherlv_1= 'Layers' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'PresentationLayer' otherlv_5= ':' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) otherlv_7= 'BusinessLayer' otherlv_8= ':' ( (lv_businessLayer_9_0= ruleBusinessLayer ) ) otherlv_10= 'DataAccessLayer' otherlv_11= ':' ( (lv_dataAccessLayer_12_0= ruleDataAccessLayer ) ) otherlv_13= 'CommonLayer' otherlv_14= ':' ( (lv_commonLayer_15_0= ruleCommonLayer ) ) otherlv_16= '}' otherlv_17= 'Relations' otherlv_18= ':' ( (lv_relations_19_0= ruleRelations ) ) otherlv_20= '}' )
            // InternalCompras.g:1046:3: otherlv_0= '{' otherlv_1= 'Layers' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'PresentationLayer' otherlv_5= ':' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) otherlv_7= 'BusinessLayer' otherlv_8= ':' ( (lv_businessLayer_9_0= ruleBusinessLayer ) ) otherlv_10= 'DataAccessLayer' otherlv_11= ':' ( (lv_dataAccessLayer_12_0= ruleDataAccessLayer ) ) otherlv_13= 'CommonLayer' otherlv_14= ':' ( (lv_commonLayer_15_0= ruleCommonLayer ) ) otherlv_16= '}' otherlv_17= 'Relations' otherlv_18= ':' ( (lv_relations_19_0= ruleRelations ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getArchitectureAccess().getLayersKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getArchitectureAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getArchitectureAccess().getPresentationLayerKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getArchitectureAccess().getColonKeyword_5());
            		
            // InternalCompras.g:1070:3: ( (lv_presentationLayer_6_0= rulePresentationLayer ) )
            // InternalCompras.g:1071:4: (lv_presentationLayer_6_0= rulePresentationLayer )
            {
            // InternalCompras.g:1071:4: (lv_presentationLayer_6_0= rulePresentationLayer )
            // InternalCompras.g:1072:5: lv_presentationLayer_6_0= rulePresentationLayer
            {

            					newCompositeNode(grammarAccess.getArchitectureAccess().getPresentationLayerPresentationLayerParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_29);
            lv_presentationLayer_6_0=rulePresentationLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            					}
            					set(
            						current,
            						"presentationLayer",
            						lv_presentationLayer_6_0,
            						"org.xtext.example.compras.Compras.PresentationLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getArchitectureAccess().getBusinessLayerKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getArchitectureAccess().getColonKeyword_8());
            		
            // InternalCompras.g:1097:3: ( (lv_businessLayer_9_0= ruleBusinessLayer ) )
            // InternalCompras.g:1098:4: (lv_businessLayer_9_0= ruleBusinessLayer )
            {
            // InternalCompras.g:1098:4: (lv_businessLayer_9_0= ruleBusinessLayer )
            // InternalCompras.g:1099:5: lv_businessLayer_9_0= ruleBusinessLayer
            {

            					newCompositeNode(grammarAccess.getArchitectureAccess().getBusinessLayerBusinessLayerParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_30);
            lv_businessLayer_9_0=ruleBusinessLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            					}
            					set(
            						current,
            						"businessLayer",
            						lv_businessLayer_9_0,
            						"org.xtext.example.compras.Compras.BusinessLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getArchitectureAccess().getDataAccessLayerKeyword_10());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getArchitectureAccess().getColonKeyword_11());
            		
            // InternalCompras.g:1124:3: ( (lv_dataAccessLayer_12_0= ruleDataAccessLayer ) )
            // InternalCompras.g:1125:4: (lv_dataAccessLayer_12_0= ruleDataAccessLayer )
            {
            // InternalCompras.g:1125:4: (lv_dataAccessLayer_12_0= ruleDataAccessLayer )
            // InternalCompras.g:1126:5: lv_dataAccessLayer_12_0= ruleDataAccessLayer
            {

            					newCompositeNode(grammarAccess.getArchitectureAccess().getDataAccessLayerDataAccessLayerParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_31);
            lv_dataAccessLayer_12_0=ruleDataAccessLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            					}
            					set(
            						current,
            						"dataAccessLayer",
            						lv_dataAccessLayer_12_0,
            						"org.xtext.example.compras.Compras.DataAccessLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getArchitectureAccess().getCommonLayerKeyword_13());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getArchitectureAccess().getColonKeyword_14());
            		
            // InternalCompras.g:1151:3: ( (lv_commonLayer_15_0= ruleCommonLayer ) )
            // InternalCompras.g:1152:4: (lv_commonLayer_15_0= ruleCommonLayer )
            {
            // InternalCompras.g:1152:4: (lv_commonLayer_15_0= ruleCommonLayer )
            // InternalCompras.g:1153:5: lv_commonLayer_15_0= ruleCommonLayer
            {

            					newCompositeNode(grammarAccess.getArchitectureAccess().getCommonLayerCommonLayerParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_12);
            lv_commonLayer_15_0=ruleCommonLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            					}
            					set(
            						current,
            						"commonLayer",
            						lv_commonLayer_15_0,
            						"org.xtext.example.compras.Compras.CommonLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,17,FOLLOW_32); 

            			newLeafNode(otherlv_16, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_17=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getArchitectureAccess().getRelationsKeyword_17());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_18, grammarAccess.getArchitectureAccess().getColonKeyword_18());
            		
            // InternalCompras.g:1182:3: ( (lv_relations_19_0= ruleRelations ) )
            // InternalCompras.g:1183:4: (lv_relations_19_0= ruleRelations )
            {
            // InternalCompras.g:1183:4: (lv_relations_19_0= ruleRelations )
            // InternalCompras.g:1184:5: lv_relations_19_0= ruleRelations
            {

            					newCompositeNode(grammarAccess.getArchitectureAccess().getRelationsRelationsParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_12);
            lv_relations_19_0=ruleRelations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            					}
            					set(
            						current,
            						"relations",
            						lv_relations_19_0,
            						"org.xtext.example.compras.Compras.Relations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_20());
            		

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
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRulePresentationLayer"
    // InternalCompras.g:1209:1: entryRulePresentationLayer returns [EObject current=null] : iv_rulePresentationLayer= rulePresentationLayer EOF ;
    public final EObject entryRulePresentationLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationLayer = null;


        try {
            // InternalCompras.g:1209:58: (iv_rulePresentationLayer= rulePresentationLayer EOF )
            // InternalCompras.g:1210:2: iv_rulePresentationLayer= rulePresentationLayer EOF
            {
             newCompositeNode(grammarAccess.getPresentationLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresentationLayer=rulePresentationLayer();

            state._fsp--;

             current =iv_rulePresentationLayer; 
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
    // $ANTLR end "entryRulePresentationLayer"


    // $ANTLR start "rulePresentationLayer"
    // InternalCompras.g:1216:1: rulePresentationLayer returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'ControllerSegmentLayer' otherlv_4= ':' ( (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer ) ) otherlv_6= 'ViewSegmentLayer' otherlv_7= ':' ( (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer ) ) otherlv_9= 'ScriptSegmentLayer' otherlv_10= ':' ( (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer ) ) otherlv_12= '}' ) ;
    public final EObject rulePresentationLayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_controllerSegmentLayer_5_0 = null;

        EObject lv_viewSegmentLayer_8_0 = null;

        EObject lv_scriptegmentLayer_11_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:1222:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'ControllerSegmentLayer' otherlv_4= ':' ( (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer ) ) otherlv_6= 'ViewSegmentLayer' otherlv_7= ':' ( (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer ) ) otherlv_9= 'ScriptSegmentLayer' otherlv_10= ':' ( (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer ) ) otherlv_12= '}' ) )
            // InternalCompras.g:1223:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'ControllerSegmentLayer' otherlv_4= ':' ( (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer ) ) otherlv_6= 'ViewSegmentLayer' otherlv_7= ':' ( (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer ) ) otherlv_9= 'ScriptSegmentLayer' otherlv_10= ':' ( (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer ) ) otherlv_12= '}' )
            {
            // InternalCompras.g:1223:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'ControllerSegmentLayer' otherlv_4= ':' ( (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer ) ) otherlv_6= 'ViewSegmentLayer' otherlv_7= ':' ( (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer ) ) otherlv_9= 'ScriptSegmentLayer' otherlv_10= ':' ( (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer ) ) otherlv_12= '}' )
            // InternalCompras.g:1224:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'ControllerSegmentLayer' otherlv_4= ':' ( (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer ) ) otherlv_6= 'ViewSegmentLayer' otherlv_7= ':' ( (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer ) ) otherlv_9= 'ScriptSegmentLayer' otherlv_10= ':' ( (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer ) ) otherlv_12= '}'
            {
            // InternalCompras.g:1224:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1225:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1225:4: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1226:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPresentationLayerAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresentationLayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPresentationLayerAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getPresentationLayerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getPresentationLayerAccess().getColonKeyword_4());
            		
            // InternalCompras.g:1258:3: ( (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer ) )
            // InternalCompras.g:1259:4: (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer )
            {
            // InternalCompras.g:1259:4: (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer )
            // InternalCompras.g:1260:5: lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer
            {

            					newCompositeNode(grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerControllerSegmentLayerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_34);
            lv_controllerSegmentLayer_5_0=ruleControllerSegmentLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPresentationLayerRule());
            					}
            					set(
            						current,
            						"controllerSegmentLayer",
            						lv_controllerSegmentLayer_5_0,
            						"org.xtext.example.compras.Compras.ControllerSegmentLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getPresentationLayerAccess().getViewSegmentLayerKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getPresentationLayerAccess().getColonKeyword_7());
            		
            // InternalCompras.g:1285:3: ( (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer ) )
            // InternalCompras.g:1286:4: (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer )
            {
            // InternalCompras.g:1286:4: (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer )
            // InternalCompras.g:1287:5: lv_viewSegmentLayer_8_0= ruleViewSegmentLayer
            {

            					newCompositeNode(grammarAccess.getPresentationLayerAccess().getViewSegmentLayerViewSegmentLayerParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_35);
            lv_viewSegmentLayer_8_0=ruleViewSegmentLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPresentationLayerRule());
            					}
            					set(
            						current,
            						"viewSegmentLayer",
            						lv_viewSegmentLayer_8_0,
            						"org.xtext.example.compras.Compras.ViewSegmentLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getPresentationLayerAccess().getScriptSegmentLayerKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getPresentationLayerAccess().getColonKeyword_10());
            		
            // InternalCompras.g:1312:3: ( (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer ) )
            // InternalCompras.g:1313:4: (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer )
            {
            // InternalCompras.g:1313:4: (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer )
            // InternalCompras.g:1314:5: lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer
            {

            					newCompositeNode(grammarAccess.getPresentationLayerAccess().getScriptegmentLayerScriptSegmentLayerParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_scriptegmentLayer_11_0=ruleScriptSegmentLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPresentationLayerRule());
            					}
            					set(
            						current,
            						"scriptegmentLayer",
            						lv_scriptegmentLayer_11_0,
            						"org.xtext.example.compras.Compras.ScriptSegmentLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPresentationLayerAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "rulePresentationLayer"


    // $ANTLR start "entryRuleControllerSegmentLayer"
    // InternalCompras.g:1339:1: entryRuleControllerSegmentLayer returns [EObject current=null] : iv_ruleControllerSegmentLayer= ruleControllerSegmentLayer EOF ;
    public final EObject entryRuleControllerSegmentLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControllerSegmentLayer = null;


        try {
            // InternalCompras.g:1339:63: (iv_ruleControllerSegmentLayer= ruleControllerSegmentLayer EOF )
            // InternalCompras.g:1340:2: iv_ruleControllerSegmentLayer= ruleControllerSegmentLayer EOF
            {
             newCompositeNode(grammarAccess.getControllerSegmentLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControllerSegmentLayer=ruleControllerSegmentLayer();

            state._fsp--;

             current =iv_ruleControllerSegmentLayer; 
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
    // $ANTLR end "entryRuleControllerSegmentLayer"


    // $ANTLR start "ruleControllerSegmentLayer"
    // InternalCompras.g:1346:1: ruleControllerSegmentLayer returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleControllerSegmentLayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:1352:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCompras.g:1353:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCompras.g:1353:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1354:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1354:3: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1355:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getControllerSegmentLayerAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getControllerSegmentLayerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleControllerSegmentLayer"


    // $ANTLR start "entryRuleViewSegmentLayer"
    // InternalCompras.g:1374:1: entryRuleViewSegmentLayer returns [EObject current=null] : iv_ruleViewSegmentLayer= ruleViewSegmentLayer EOF ;
    public final EObject entryRuleViewSegmentLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewSegmentLayer = null;


        try {
            // InternalCompras.g:1374:57: (iv_ruleViewSegmentLayer= ruleViewSegmentLayer EOF )
            // InternalCompras.g:1375:2: iv_ruleViewSegmentLayer= ruleViewSegmentLayer EOF
            {
             newCompositeNode(grammarAccess.getViewSegmentLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewSegmentLayer=ruleViewSegmentLayer();

            state._fsp--;

             current =iv_ruleViewSegmentLayer; 
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
    // $ANTLR end "entryRuleViewSegmentLayer"


    // $ANTLR start "ruleViewSegmentLayer"
    // InternalCompras.g:1381:1: ruleViewSegmentLayer returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleViewSegmentLayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:1387:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCompras.g:1388:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCompras.g:1388:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1389:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1389:3: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1390:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getViewSegmentLayerAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getViewSegmentLayerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleViewSegmentLayer"


    // $ANTLR start "entryRuleScriptSegmentLayer"
    // InternalCompras.g:1409:1: entryRuleScriptSegmentLayer returns [EObject current=null] : iv_ruleScriptSegmentLayer= ruleScriptSegmentLayer EOF ;
    public final EObject entryRuleScriptSegmentLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptSegmentLayer = null;


        try {
            // InternalCompras.g:1409:59: (iv_ruleScriptSegmentLayer= ruleScriptSegmentLayer EOF )
            // InternalCompras.g:1410:2: iv_ruleScriptSegmentLayer= ruleScriptSegmentLayer EOF
            {
             newCompositeNode(grammarAccess.getScriptSegmentLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScriptSegmentLayer=ruleScriptSegmentLayer();

            state._fsp--;

             current =iv_ruleScriptSegmentLayer; 
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
    // $ANTLR end "entryRuleScriptSegmentLayer"


    // $ANTLR start "ruleScriptSegmentLayer"
    // InternalCompras.g:1416:1: ruleScriptSegmentLayer returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleScriptSegmentLayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:1422:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCompras.g:1423:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCompras.g:1423:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1424:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1424:3: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1425:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getScriptSegmentLayerAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getScriptSegmentLayerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleScriptSegmentLayer"


    // $ANTLR start "entryRuleBusinessLayer"
    // InternalCompras.g:1444:1: entryRuleBusinessLayer returns [EObject current=null] : iv_ruleBusinessLayer= ruleBusinessLayer EOF ;
    public final EObject entryRuleBusinessLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessLayer = null;


        try {
            // InternalCompras.g:1444:54: (iv_ruleBusinessLayer= ruleBusinessLayer EOF )
            // InternalCompras.g:1445:2: iv_ruleBusinessLayer= ruleBusinessLayer EOF
            {
             newCompositeNode(grammarAccess.getBusinessLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessLayer=ruleBusinessLayer();

            state._fsp--;

             current =iv_ruleBusinessLayer; 
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
    // $ANTLR end "entryRuleBusinessLayer"


    // $ANTLR start "ruleBusinessLayer"
    // InternalCompras.g:1451:1: ruleBusinessLayer returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBusinessLayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:1457:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCompras.g:1458:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCompras.g:1458:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1459:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1459:3: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1460:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getBusinessLayerAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBusinessLayerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleBusinessLayer"


    // $ANTLR start "entryRuleDataAccessLayer"
    // InternalCompras.g:1479:1: entryRuleDataAccessLayer returns [EObject current=null] : iv_ruleDataAccessLayer= ruleDataAccessLayer EOF ;
    public final EObject entryRuleDataAccessLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAccessLayer = null;


        try {
            // InternalCompras.g:1479:56: (iv_ruleDataAccessLayer= ruleDataAccessLayer EOF )
            // InternalCompras.g:1480:2: iv_ruleDataAccessLayer= ruleDataAccessLayer EOF
            {
             newCompositeNode(grammarAccess.getDataAccessLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataAccessLayer=ruleDataAccessLayer();

            state._fsp--;

             current =iv_ruleDataAccessLayer; 
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
    // $ANTLR end "entryRuleDataAccessLayer"


    // $ANTLR start "ruleDataAccessLayer"
    // InternalCompras.g:1486:1: ruleDataAccessLayer returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'DbConnectorSegmentLayer' otherlv_4= ':' ( (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer ) ) otherlv_6= '}' ) ;
    public final EObject ruleDataAccessLayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_dbConnectorSegmentLayer_5_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:1492:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'DbConnectorSegmentLayer' otherlv_4= ':' ( (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer ) ) otherlv_6= '}' ) )
            // InternalCompras.g:1493:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'DbConnectorSegmentLayer' otherlv_4= ':' ( (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer ) ) otherlv_6= '}' )
            {
            // InternalCompras.g:1493:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'DbConnectorSegmentLayer' otherlv_4= ':' ( (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer ) ) otherlv_6= '}' )
            // InternalCompras.g:1494:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'DbConnectorSegmentLayer' otherlv_4= ':' ( (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer ) ) otherlv_6= '}'
            {
            // InternalCompras.g:1494:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1495:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1495:4: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1496:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDataAccessLayerAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataAccessLayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccessLayerAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getDataAccessLayerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDataAccessLayerAccess().getColonKeyword_4());
            		
            // InternalCompras.g:1528:3: ( (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer ) )
            // InternalCompras.g:1529:4: (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer )
            {
            // InternalCompras.g:1529:4: (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer )
            // InternalCompras.g:1530:5: lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer
            {

            					newCompositeNode(grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerDbConnectorSegmentLayerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_dbConnectorSegmentLayer_5_0=ruleDbConnectorSegmentLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataAccessLayerRule());
            					}
            					set(
            						current,
            						"dbConnectorSegmentLayer",
            						lv_dbConnectorSegmentLayer_5_0,
            						"org.xtext.example.compras.Compras.DbConnectorSegmentLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDataAccessLayerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDataAccessLayer"


    // $ANTLR start "entryRuleDbConnectorSegmentLayer"
    // InternalCompras.g:1555:1: entryRuleDbConnectorSegmentLayer returns [EObject current=null] : iv_ruleDbConnectorSegmentLayer= ruleDbConnectorSegmentLayer EOF ;
    public final EObject entryRuleDbConnectorSegmentLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDbConnectorSegmentLayer = null;


        try {
            // InternalCompras.g:1555:64: (iv_ruleDbConnectorSegmentLayer= ruleDbConnectorSegmentLayer EOF )
            // InternalCompras.g:1556:2: iv_ruleDbConnectorSegmentLayer= ruleDbConnectorSegmentLayer EOF
            {
             newCompositeNode(grammarAccess.getDbConnectorSegmentLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDbConnectorSegmentLayer=ruleDbConnectorSegmentLayer();

            state._fsp--;

             current =iv_ruleDbConnectorSegmentLayer; 
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
    // $ANTLR end "entryRuleDbConnectorSegmentLayer"


    // $ANTLR start "ruleDbConnectorSegmentLayer"
    // InternalCompras.g:1562:1: ruleDbConnectorSegmentLayer returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDbConnectorSegmentLayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:1568:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCompras.g:1569:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCompras.g:1569:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1570:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1570:3: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1571:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getDbConnectorSegmentLayerAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDbConnectorSegmentLayerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleDbConnectorSegmentLayer"


    // $ANTLR start "entryRuleCommonLayer"
    // InternalCompras.g:1590:1: entryRuleCommonLayer returns [EObject current=null] : iv_ruleCommonLayer= ruleCommonLayer EOF ;
    public final EObject entryRuleCommonLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLayer = null;


        try {
            // InternalCompras.g:1590:52: (iv_ruleCommonLayer= ruleCommonLayer EOF )
            // InternalCompras.g:1591:2: iv_ruleCommonLayer= ruleCommonLayer EOF
            {
             newCompositeNode(grammarAccess.getCommonLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommonLayer=ruleCommonLayer();

            state._fsp--;

             current =iv_ruleCommonLayer; 
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
    // $ANTLR end "entryRuleCommonLayer"


    // $ANTLR start "ruleCommonLayer"
    // InternalCompras.g:1597:1: ruleCommonLayer returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCommonLayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:1603:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCompras.g:1604:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCompras.g:1604:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1605:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1605:3: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1606:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getCommonLayerAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCommonLayerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleCommonLayer"


    // $ANTLR start "entryRuleRelations"
    // InternalCompras.g:1625:1: entryRuleRelations returns [EObject current=null] : iv_ruleRelations= ruleRelations EOF ;
    public final EObject entryRuleRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelations = null;


        try {
            // InternalCompras.g:1625:50: (iv_ruleRelations= ruleRelations EOF )
            // InternalCompras.g:1626:2: iv_ruleRelations= ruleRelations EOF
            {
             newCompositeNode(grammarAccess.getRelationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelations=ruleRelations();

            state._fsp--;

             current =iv_ruleRelations; 
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
    // $ANTLR end "entryRuleRelations"


    // $ANTLR start "ruleRelations"
    // InternalCompras.g:1632:1: ruleRelations returns [EObject current=null] : (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_relationsType1_2_0= ruleRelationsType ) ) ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_relationsType2_5_0= ruleRelationsType ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_relationsType3_8_0= ruleRelationsType ) ) ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (lv_relationsType4_11_0= ruleRelationsType ) ) ( (otherlv_12= RULE_ID ) ) ( (otherlv_13= RULE_ID ) ) ( (lv_relationsType5_14_0= ruleRelationsType ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' ) ;
    public final EObject ruleRelations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_relationsType1_2_0 = null;

        Enumerator lv_relationsType2_5_0 = null;

        Enumerator lv_relationsType3_8_0 = null;

        Enumerator lv_relationsType4_11_0 = null;

        Enumerator lv_relationsType5_14_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:1638:2: ( (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_relationsType1_2_0= ruleRelationsType ) ) ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_relationsType2_5_0= ruleRelationsType ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_relationsType3_8_0= ruleRelationsType ) ) ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (lv_relationsType4_11_0= ruleRelationsType ) ) ( (otherlv_12= RULE_ID ) ) ( (otherlv_13= RULE_ID ) ) ( (lv_relationsType5_14_0= ruleRelationsType ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' ) )
            // InternalCompras.g:1639:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_relationsType1_2_0= ruleRelationsType ) ) ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_relationsType2_5_0= ruleRelationsType ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_relationsType3_8_0= ruleRelationsType ) ) ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (lv_relationsType4_11_0= ruleRelationsType ) ) ( (otherlv_12= RULE_ID ) ) ( (otherlv_13= RULE_ID ) ) ( (lv_relationsType5_14_0= ruleRelationsType ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' )
            {
            // InternalCompras.g:1639:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_relationsType1_2_0= ruleRelationsType ) ) ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_relationsType2_5_0= ruleRelationsType ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_relationsType3_8_0= ruleRelationsType ) ) ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (lv_relationsType4_11_0= ruleRelationsType ) ) ( (otherlv_12= RULE_ID ) ) ( (otherlv_13= RULE_ID ) ) ( (lv_relationsType5_14_0= ruleRelationsType ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' )
            // InternalCompras.g:1640:3: otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_relationsType1_2_0= ruleRelationsType ) ) ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_relationsType2_5_0= ruleRelationsType ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_relationsType3_8_0= ruleRelationsType ) ) ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (lv_relationsType4_11_0= ruleRelationsType ) ) ( (otherlv_12= RULE_ID ) ) ( (otherlv_13= RULE_ID ) ) ( (lv_relationsType5_14_0= ruleRelationsType ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationsAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalCompras.g:1644:3: ( (otherlv_1= RULE_ID ) )
            // InternalCompras.g:1645:4: (otherlv_1= RULE_ID )
            {
            // InternalCompras.g:1645:4: (otherlv_1= RULE_ID )
            // InternalCompras.g:1646:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_1, grammarAccess.getRelationsAccess().getSourceLayer1PresentationLayerCrossReference_1_0());
            				

            }


            }

            // InternalCompras.g:1657:3: ( (lv_relationsType1_2_0= ruleRelationsType ) )
            // InternalCompras.g:1658:4: (lv_relationsType1_2_0= ruleRelationsType )
            {
            // InternalCompras.g:1658:4: (lv_relationsType1_2_0= ruleRelationsType )
            // InternalCompras.g:1659:5: lv_relationsType1_2_0= ruleRelationsType
            {

            					newCompositeNode(grammarAccess.getRelationsAccess().getRelationsType1RelationsTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_relationsType1_2_0=ruleRelationsType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationsRule());
            					}
            					set(
            						current,
            						"relationsType1",
            						lv_relationsType1_2_0,
            						"org.xtext.example.compras.Compras.RelationsType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCompras.g:1676:3: ( (otherlv_3= RULE_ID ) )
            // InternalCompras.g:1677:4: (otherlv_3= RULE_ID )
            {
            // InternalCompras.g:1677:4: (otherlv_3= RULE_ID )
            // InternalCompras.g:1678:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_3, grammarAccess.getRelationsAccess().getTargetLayer1BusinessLayerCrossReference_3_0());
            				

            }


            }

            // InternalCompras.g:1689:3: ( (otherlv_4= RULE_ID ) )
            // InternalCompras.g:1690:4: (otherlv_4= RULE_ID )
            {
            // InternalCompras.g:1690:4: (otherlv_4= RULE_ID )
            // InternalCompras.g:1691:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_4, grammarAccess.getRelationsAccess().getSourceLayer2BusinessLayerCrossReference_4_0());
            				

            }


            }

            // InternalCompras.g:1702:3: ( (lv_relationsType2_5_0= ruleRelationsType ) )
            // InternalCompras.g:1703:4: (lv_relationsType2_5_0= ruleRelationsType )
            {
            // InternalCompras.g:1703:4: (lv_relationsType2_5_0= ruleRelationsType )
            // InternalCompras.g:1704:5: lv_relationsType2_5_0= ruleRelationsType
            {

            					newCompositeNode(grammarAccess.getRelationsAccess().getRelationsType2RelationsTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_4);
            lv_relationsType2_5_0=ruleRelationsType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationsRule());
            					}
            					set(
            						current,
            						"relationsType2",
            						lv_relationsType2_5_0,
            						"org.xtext.example.compras.Compras.RelationsType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCompras.g:1721:3: ( (otherlv_6= RULE_ID ) )
            // InternalCompras.g:1722:4: (otherlv_6= RULE_ID )
            {
            // InternalCompras.g:1722:4: (otherlv_6= RULE_ID )
            // InternalCompras.g:1723:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_6, grammarAccess.getRelationsAccess().getTargetLayer2DataAccessLayerCrossReference_6_0());
            				

            }


            }

            // InternalCompras.g:1734:3: ( (otherlv_7= RULE_ID ) )
            // InternalCompras.g:1735:4: (otherlv_7= RULE_ID )
            {
            // InternalCompras.g:1735:4: (otherlv_7= RULE_ID )
            // InternalCompras.g:1736:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_7, grammarAccess.getRelationsAccess().getSourceLayer3DataAccessLayerCrossReference_7_0());
            				

            }


            }

            // InternalCompras.g:1747:3: ( (lv_relationsType3_8_0= ruleRelationsType ) )
            // InternalCompras.g:1748:4: (lv_relationsType3_8_0= ruleRelationsType )
            {
            // InternalCompras.g:1748:4: (lv_relationsType3_8_0= ruleRelationsType )
            // InternalCompras.g:1749:5: lv_relationsType3_8_0= ruleRelationsType
            {

            					newCompositeNode(grammarAccess.getRelationsAccess().getRelationsType3RelationsTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_4);
            lv_relationsType3_8_0=ruleRelationsType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationsRule());
            					}
            					set(
            						current,
            						"relationsType3",
            						lv_relationsType3_8_0,
            						"org.xtext.example.compras.Compras.RelationsType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCompras.g:1766:3: ( (otherlv_9= RULE_ID ) )
            // InternalCompras.g:1767:4: (otherlv_9= RULE_ID )
            {
            // InternalCompras.g:1767:4: (otherlv_9= RULE_ID )
            // InternalCompras.g:1768:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_9, grammarAccess.getRelationsAccess().getTargetLayer3CommonLayerCrossReference_9_0());
            				

            }


            }

            // InternalCompras.g:1779:3: ( (otherlv_10= RULE_ID ) )
            // InternalCompras.g:1780:4: (otherlv_10= RULE_ID )
            {
            // InternalCompras.g:1780:4: (otherlv_10= RULE_ID )
            // InternalCompras.g:1781:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_10, grammarAccess.getRelationsAccess().getSourceLayer4PresentationLayerCrossReference_10_0());
            				

            }


            }

            // InternalCompras.g:1792:3: ( (lv_relationsType4_11_0= ruleRelationsType ) )
            // InternalCompras.g:1793:4: (lv_relationsType4_11_0= ruleRelationsType )
            {
            // InternalCompras.g:1793:4: (lv_relationsType4_11_0= ruleRelationsType )
            // InternalCompras.g:1794:5: lv_relationsType4_11_0= ruleRelationsType
            {

            					newCompositeNode(grammarAccess.getRelationsAccess().getRelationsType4RelationsTypeEnumRuleCall_11_0());
            				
            pushFollow(FOLLOW_4);
            lv_relationsType4_11_0=ruleRelationsType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationsRule());
            					}
            					set(
            						current,
            						"relationsType4",
            						lv_relationsType4_11_0,
            						"org.xtext.example.compras.Compras.RelationsType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCompras.g:1811:3: ( (otherlv_12= RULE_ID ) )
            // InternalCompras.g:1812:4: (otherlv_12= RULE_ID )
            {
            // InternalCompras.g:1812:4: (otherlv_12= RULE_ID )
            // InternalCompras.g:1813:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_12, grammarAccess.getRelationsAccess().getTargetLayer4CommonLayerCrossReference_12_0());
            				

            }


            }

            // InternalCompras.g:1824:3: ( (otherlv_13= RULE_ID ) )
            // InternalCompras.g:1825:4: (otherlv_13= RULE_ID )
            {
            // InternalCompras.g:1825:4: (otherlv_13= RULE_ID )
            // InternalCompras.g:1826:5: otherlv_13= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_13, grammarAccess.getRelationsAccess().getSourceLayer5BusinessLayerCrossReference_13_0());
            				

            }


            }

            // InternalCompras.g:1837:3: ( (lv_relationsType5_14_0= ruleRelationsType ) )
            // InternalCompras.g:1838:4: (lv_relationsType5_14_0= ruleRelationsType )
            {
            // InternalCompras.g:1838:4: (lv_relationsType5_14_0= ruleRelationsType )
            // InternalCompras.g:1839:5: lv_relationsType5_14_0= ruleRelationsType
            {

            					newCompositeNode(grammarAccess.getRelationsAccess().getRelationsType5RelationsTypeEnumRuleCall_14_0());
            				
            pushFollow(FOLLOW_4);
            lv_relationsType5_14_0=ruleRelationsType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationsRule());
            					}
            					set(
            						current,
            						"relationsType5",
            						lv_relationsType5_14_0,
            						"org.xtext.example.compras.Compras.RelationsType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCompras.g:1856:3: ( (otherlv_15= RULE_ID ) )
            // InternalCompras.g:1857:4: (otherlv_15= RULE_ID )
            {
            // InternalCompras.g:1857:4: (otherlv_15= RULE_ID )
            // InternalCompras.g:1858:5: otherlv_15= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_15, grammarAccess.getRelationsAccess().getTargetLayer5CommonLayerCrossReference_15_0());
            				

            }


            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getRelationsAccess().getRightCurlyBracketKeyword_16());
            		

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
    // $ANTLR end "ruleRelations"


    // $ANTLR start "entryRuleTechnology"
    // InternalCompras.g:1877:1: entryRuleTechnology returns [EObject current=null] : iv_ruleTechnology= ruleTechnology EOF ;
    public final EObject entryRuleTechnology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnology = null;


        try {
            // InternalCompras.g:1877:51: (iv_ruleTechnology= ruleTechnology EOF )
            // InternalCompras.g:1878:2: iv_ruleTechnology= ruleTechnology EOF
            {
             newCompositeNode(grammarAccess.getTechnologyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTechnology=ruleTechnology();

            state._fsp--;

             current =iv_ruleTechnology; 
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
    // $ANTLR end "entryRuleTechnology"


    // $ANTLR start "ruleTechnology"
    // InternalCompras.g:1884:1: ruleTechnology returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'AspNet' otherlv_2= ':' otherlv_3= '{' ( (lv_moduleTech_4_0= ruleModuleTech ) )* otherlv_5= '}' )? (otherlv_6= 'Database' otherlv_7= ':' otherlv_8= '{' ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )? (otherlv_19= 'DataFileSeed' otherlv_20= ':' ( (lv_dataFileSeed_21_0= ruleDataFileSeed ) ) )? otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleTechnology() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        EObject lv_moduleTech_4_0 = null;

        Enumerator lv_databaseRDBMSType_14_0 = null;

        AntlrDatatypeRuleToken lv_connectionString_17_0 = null;

        AntlrDatatypeRuleToken lv_dataFileSeed_21_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:1890:2: ( (otherlv_0= '{' (otherlv_1= 'AspNet' otherlv_2= ':' otherlv_3= '{' ( (lv_moduleTech_4_0= ruleModuleTech ) )* otherlv_5= '}' )? (otherlv_6= 'Database' otherlv_7= ':' otherlv_8= '{' ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )? (otherlv_19= 'DataFileSeed' otherlv_20= ':' ( (lv_dataFileSeed_21_0= ruleDataFileSeed ) ) )? otherlv_22= '}' )? otherlv_23= '}' ) )
            // InternalCompras.g:1891:2: (otherlv_0= '{' (otherlv_1= 'AspNet' otherlv_2= ':' otherlv_3= '{' ( (lv_moduleTech_4_0= ruleModuleTech ) )* otherlv_5= '}' )? (otherlv_6= 'Database' otherlv_7= ':' otherlv_8= '{' ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )? (otherlv_19= 'DataFileSeed' otherlv_20= ':' ( (lv_dataFileSeed_21_0= ruleDataFileSeed ) ) )? otherlv_22= '}' )? otherlv_23= '}' )
            {
            // InternalCompras.g:1891:2: (otherlv_0= '{' (otherlv_1= 'AspNet' otherlv_2= ':' otherlv_3= '{' ( (lv_moduleTech_4_0= ruleModuleTech ) )* otherlv_5= '}' )? (otherlv_6= 'Database' otherlv_7= ':' otherlv_8= '{' ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )? (otherlv_19= 'DataFileSeed' otherlv_20= ':' ( (lv_dataFileSeed_21_0= ruleDataFileSeed ) ) )? otherlv_22= '}' )? otherlv_23= '}' )
            // InternalCompras.g:1892:3: otherlv_0= '{' (otherlv_1= 'AspNet' otherlv_2= ':' otherlv_3= '{' ( (lv_moduleTech_4_0= ruleModuleTech ) )* otherlv_5= '}' )? (otherlv_6= 'Database' otherlv_7= ':' otherlv_8= '{' ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )? (otherlv_19= 'DataFileSeed' otherlv_20= ':' ( (lv_dataFileSeed_21_0= ruleDataFileSeed ) ) )? otherlv_22= '}' )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalCompras.g:1896:3: (otherlv_1= 'AspNet' otherlv_2= ':' otherlv_3= '{' ( (lv_moduleTech_4_0= ruleModuleTech ) )* otherlv_5= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCompras.g:1897:4: otherlv_1= 'AspNet' otherlv_2= ':' otherlv_3= '{' ( (lv_moduleTech_4_0= ruleModuleTech ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getTechnologyAccess().getAspNetKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getTechnologyAccess().getColonKeyword_1_1());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_1_2());
                    			
                    // InternalCompras.g:1909:4: ( (lv_moduleTech_4_0= ruleModuleTech ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==19) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalCompras.g:1910:5: (lv_moduleTech_4_0= ruleModuleTech )
                    	    {
                    	    // InternalCompras.g:1910:5: (lv_moduleTech_4_0= ruleModuleTech )
                    	    // InternalCompras.g:1911:6: lv_moduleTech_4_0= ruleModuleTech
                    	    {

                    	    						newCompositeNode(grammarAccess.getTechnologyAccess().getModuleTechModuleTechParserRuleCall_1_3_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_moduleTech_4_0=ruleModuleTech();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTechnologyRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"moduleTech",
                    	    							lv_moduleTech_4_0,
                    	    							"org.xtext.example.compras.Compras.ModuleTech");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_39); 

                    				newLeafNode(otherlv_5, grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalCompras.g:1933:3: (otherlv_6= 'Database' otherlv_7= ':' otherlv_8= '{' ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )? (otherlv_19= 'DataFileSeed' otherlv_20= ':' ( (lv_dataFileSeed_21_0= ruleDataFileSeed ) ) )? otherlv_22= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCompras.g:1934:4: otherlv_6= 'Database' otherlv_7= ':' otherlv_8= '{' ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )? (otherlv_19= 'DataFileSeed' otherlv_20= ':' ( (lv_dataFileSeed_21_0= ruleDataFileSeed ) ) )? otherlv_22= '}'
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTechnologyAccess().getDatabaseKeyword_2_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getTechnologyAccess().getColonKeyword_2_1());
                    			
                    otherlv_8=(Token)match(input,13,FOLLOW_40); 

                    				newLeafNode(otherlv_8, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_2_2());
                    			
                    // InternalCompras.g:1946:4: ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalCompras.g:1947:5: ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}'
                            {
                            // InternalCompras.g:1947:5: ( ( ruleFQN ) )
                            // InternalCompras.g:1948:6: ( ruleFQN )
                            {
                            // InternalCompras.g:1948:6: ( ruleFQN )
                            // InternalCompras.g:1949:7: ruleFQN
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTechnologyRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getTechnologyAccess().getDbConnectorSegmentLayerDbConnectorSegmentLayerCrossReference_2_3_0_0());
                            						
                            pushFollow(FOLLOW_3);
                            ruleFQN();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_10=(Token)match(input,12,FOLLOW_5); 

                            					newLeafNode(otherlv_10, grammarAccess.getTechnologyAccess().getColonKeyword_2_3_1());
                            				
                            otherlv_11=(Token)match(input,13,FOLLOW_41); 

                            					newLeafNode(otherlv_11, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_2_3_2());
                            				
                            // InternalCompras.g:1971:5: (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==44) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // InternalCompras.g:1972:6: otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) )
                                    {
                                    otherlv_12=(Token)match(input,44,FOLLOW_3); 

                                    						newLeafNode(otherlv_12, grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeKeyword_2_3_3_0());
                                    					
                                    otherlv_13=(Token)match(input,12,FOLLOW_42); 

                                    						newLeafNode(otherlv_13, grammarAccess.getTechnologyAccess().getColonKeyword_2_3_3_1());
                                    					
                                    // InternalCompras.g:1980:6: ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) )
                                    // InternalCompras.g:1981:7: (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType )
                                    {
                                    // InternalCompras.g:1981:7: (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType )
                                    // InternalCompras.g:1982:8: lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType
                                    {

                                    								newCompositeNode(grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeDatabaseRDBMSTypeEnumRuleCall_2_3_3_2_0());
                                    							
                                    pushFollow(FOLLOW_43);
                                    lv_databaseRDBMSType_14_0=ruleDatabaseRDBMSType();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getTechnologyRule());
                                    								}
                                    								set(
                                    									current,
                                    									"databaseRDBMSType",
                                    									lv_databaseRDBMSType_14_0,
                                    									"org.xtext.example.compras.Compras.DatabaseRDBMSType");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalCompras.g:2000:5: (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==45) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // InternalCompras.g:2001:6: otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) )
                                    {
                                    otherlv_15=(Token)match(input,45,FOLLOW_3); 

                                    						newLeafNode(otherlv_15, grammarAccess.getTechnologyAccess().getConnectionStringKeyword_2_3_4_0());
                                    					
                                    otherlv_16=(Token)match(input,12,FOLLOW_22); 

                                    						newLeafNode(otherlv_16, grammarAccess.getTechnologyAccess().getColonKeyword_2_3_4_1());
                                    					
                                    // InternalCompras.g:2009:6: ( (lv_connectionString_17_0= ruleConnectionString ) )
                                    // InternalCompras.g:2010:7: (lv_connectionString_17_0= ruleConnectionString )
                                    {
                                    // InternalCompras.g:2010:7: (lv_connectionString_17_0= ruleConnectionString )
                                    // InternalCompras.g:2011:8: lv_connectionString_17_0= ruleConnectionString
                                    {

                                    								newCompositeNode(grammarAccess.getTechnologyAccess().getConnectionStringConnectionStringParserRuleCall_2_3_4_2_0());
                                    							
                                    pushFollow(FOLLOW_12);
                                    lv_connectionString_17_0=ruleConnectionString();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getTechnologyRule());
                                    								}
                                    								set(
                                    									current,
                                    									"connectionString",
                                    									lv_connectionString_17_0,
                                    									"org.xtext.example.compras.Compras.ConnectionString");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_18=(Token)match(input,17,FOLLOW_44); 

                            					newLeafNode(otherlv_18, grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_2_3_5());
                            				

                            }
                            break;

                    }

                    // InternalCompras.g:2034:4: (otherlv_19= 'DataFileSeed' otherlv_20= ':' ( (lv_dataFileSeed_21_0= ruleDataFileSeed ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==46) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalCompras.g:2035:5: otherlv_19= 'DataFileSeed' otherlv_20= ':' ( (lv_dataFileSeed_21_0= ruleDataFileSeed ) )
                            {
                            otherlv_19=(Token)match(input,46,FOLLOW_3); 

                            					newLeafNode(otherlv_19, grammarAccess.getTechnologyAccess().getDataFileSeedKeyword_2_4_0());
                            				
                            otherlv_20=(Token)match(input,12,FOLLOW_22); 

                            					newLeafNode(otherlv_20, grammarAccess.getTechnologyAccess().getColonKeyword_2_4_1());
                            				
                            // InternalCompras.g:2043:5: ( (lv_dataFileSeed_21_0= ruleDataFileSeed ) )
                            // InternalCompras.g:2044:6: (lv_dataFileSeed_21_0= ruleDataFileSeed )
                            {
                            // InternalCompras.g:2044:6: (lv_dataFileSeed_21_0= ruleDataFileSeed )
                            // InternalCompras.g:2045:7: lv_dataFileSeed_21_0= ruleDataFileSeed
                            {

                            							newCompositeNode(grammarAccess.getTechnologyAccess().getDataFileSeedDataFileSeedParserRuleCall_2_4_2_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_dataFileSeed_21_0=ruleDataFileSeed();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTechnologyRule());
                            							}
                            							set(
                            								current,
                            								"dataFileSeed",
                            								lv_dataFileSeed_21_0,
                            								"org.xtext.example.compras.Compras.DataFileSeed");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_22, grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_2_5());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleTechnology"


    // $ANTLR start "entryRuleModuleTech"
    // InternalCompras.g:2076:1: entryRuleModuleTech returns [EObject current=null] : iv_ruleModuleTech= ruleModuleTech EOF ;
    public final EObject entryRuleModuleTech() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleTech = null;


        try {
            // InternalCompras.g:2076:51: (iv_ruleModuleTech= ruleModuleTech EOF )
            // InternalCompras.g:2077:2: iv_ruleModuleTech= ruleModuleTech EOF
            {
             newCompositeNode(grammarAccess.getModuleTechRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModuleTech=ruleModuleTech();

            state._fsp--;

             current =iv_ruleModuleTech; 
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
    // $ANTLR end "entryRuleModuleTech"


    // $ANTLR start "ruleModuleTech"
    // InternalCompras.g:2083:1: ruleModuleTech returns [EObject current=null] : (otherlv_0= 'Module' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' otherlv_7= '{' ( ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}' )? ( ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}' )? ( ( ( ruleFQN ) ) otherlv_19= ':' otherlv_20= '{' ( (lv_scriptRef_21_0= ruleScriptRef ) )* otherlv_22= '}' )? otherlv_23= '}' ( (otherlv_24= RULE_ID ) ) otherlv_25= ':' otherlv_26= '{' ( (lv_businessLayerRef_27_0= ruleBusinessLayerRef ) )* otherlv_28= '}' ( (otherlv_29= RULE_ID ) ) otherlv_30= ':' otherlv_31= '{' ( (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef ) )* otherlv_33= '}' ( (otherlv_34= RULE_ID ) ) otherlv_35= ':' otherlv_36= '{' ( (lv_commonLayerRef_37_0= ruleCommonLayerRef ) )* otherlv_38= '}' otherlv_39= '}' ) ;
    public final EObject ruleModuleTech() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        EObject lv_controllersRef_11_0 = null;

        EObject lv_viewsRef_16_0 = null;

        EObject lv_scriptRef_21_0 = null;

        EObject lv_businessLayerRef_27_0 = null;

        EObject lv_dataAccessLayerRef_32_0 = null;

        EObject lv_commonLayerRef_37_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:2089:2: ( (otherlv_0= 'Module' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' otherlv_7= '{' ( ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}' )? ( ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}' )? ( ( ( ruleFQN ) ) otherlv_19= ':' otherlv_20= '{' ( (lv_scriptRef_21_0= ruleScriptRef ) )* otherlv_22= '}' )? otherlv_23= '}' ( (otherlv_24= RULE_ID ) ) otherlv_25= ':' otherlv_26= '{' ( (lv_businessLayerRef_27_0= ruleBusinessLayerRef ) )* otherlv_28= '}' ( (otherlv_29= RULE_ID ) ) otherlv_30= ':' otherlv_31= '{' ( (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef ) )* otherlv_33= '}' ( (otherlv_34= RULE_ID ) ) otherlv_35= ':' otherlv_36= '{' ( (lv_commonLayerRef_37_0= ruleCommonLayerRef ) )* otherlv_38= '}' otherlv_39= '}' ) )
            // InternalCompras.g:2090:2: (otherlv_0= 'Module' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' otherlv_7= '{' ( ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}' )? ( ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}' )? ( ( ( ruleFQN ) ) otherlv_19= ':' otherlv_20= '{' ( (lv_scriptRef_21_0= ruleScriptRef ) )* otherlv_22= '}' )? otherlv_23= '}' ( (otherlv_24= RULE_ID ) ) otherlv_25= ':' otherlv_26= '{' ( (lv_businessLayerRef_27_0= ruleBusinessLayerRef ) )* otherlv_28= '}' ( (otherlv_29= RULE_ID ) ) otherlv_30= ':' otherlv_31= '{' ( (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef ) )* otherlv_33= '}' ( (otherlv_34= RULE_ID ) ) otherlv_35= ':' otherlv_36= '{' ( (lv_commonLayerRef_37_0= ruleCommonLayerRef ) )* otherlv_38= '}' otherlv_39= '}' )
            {
            // InternalCompras.g:2090:2: (otherlv_0= 'Module' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' otherlv_7= '{' ( ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}' )? ( ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}' )? ( ( ( ruleFQN ) ) otherlv_19= ':' otherlv_20= '{' ( (lv_scriptRef_21_0= ruleScriptRef ) )* otherlv_22= '}' )? otherlv_23= '}' ( (otherlv_24= RULE_ID ) ) otherlv_25= ':' otherlv_26= '{' ( (lv_businessLayerRef_27_0= ruleBusinessLayerRef ) )* otherlv_28= '}' ( (otherlv_29= RULE_ID ) ) otherlv_30= ':' otherlv_31= '{' ( (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef ) )* otherlv_33= '}' ( (otherlv_34= RULE_ID ) ) otherlv_35= ':' otherlv_36= '{' ( (lv_commonLayerRef_37_0= ruleCommonLayerRef ) )* otherlv_38= '}' otherlv_39= '}' )
            // InternalCompras.g:2091:3: otherlv_0= 'Module' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' otherlv_7= '{' ( ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}' )? ( ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}' )? ( ( ( ruleFQN ) ) otherlv_19= ':' otherlv_20= '{' ( (lv_scriptRef_21_0= ruleScriptRef ) )* otherlv_22= '}' )? otherlv_23= '}' ( (otherlv_24= RULE_ID ) ) otherlv_25= ':' otherlv_26= '{' ( (lv_businessLayerRef_27_0= ruleBusinessLayerRef ) )* otherlv_28= '}' ( (otherlv_29= RULE_ID ) ) otherlv_30= ':' otherlv_31= '{' ( (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef ) )* otherlv_33= '}' ( (otherlv_34= RULE_ID ) ) otherlv_35= ':' otherlv_36= '{' ( (lv_commonLayerRef_37_0= ruleCommonLayerRef ) )* otherlv_38= '}' otherlv_39= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleTechAccess().getModuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModuleTechAccess().getColonKeyword_1());
            		
            // InternalCompras.g:2099:3: ( (otherlv_2= RULE_ID ) )
            // InternalCompras.g:2100:4: (otherlv_2= RULE_ID )
            {
            // InternalCompras.g:2100:4: (otherlv_2= RULE_ID )
            // InternalCompras.g:2101:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleTechRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_2, grammarAccess.getModuleTechAccess().getNameModuleCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getModuleTechAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalCompras.g:2120:3: ( (otherlv_5= RULE_ID ) )
            // InternalCompras.g:2121:4: (otherlv_5= RULE_ID )
            {
            // InternalCompras.g:2121:4: (otherlv_5= RULE_ID )
            // InternalCompras.g:2122:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleTechRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_5, grammarAccess.getModuleTechAccess().getPresentationLayerPresentationLayerCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getModuleTechAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalCompras.g:2141:3: ( ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}' )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalCompras.g:2142:4: ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}'
                    {
                    // InternalCompras.g:2142:4: ( ( ruleFQN ) )
                    // InternalCompras.g:2143:5: ( ruleFQN )
                    {
                    // InternalCompras.g:2143:5: ( ruleFQN )
                    // InternalCompras.g:2144:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModuleTechRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModuleTechAccess().getControllerSegmentLayerControllerSegmentLayerCrossReference_8_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getModuleTechAccess().getColonKeyword_8_1());
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_45); 

                    				newLeafNode(otherlv_10, grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_8_2());
                    			
                    // InternalCompras.g:2166:4: ( (lv_controllersRef_11_0= ruleControllersRef ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==47) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalCompras.g:2167:5: (lv_controllersRef_11_0= ruleControllersRef )
                    	    {
                    	    // InternalCompras.g:2167:5: (lv_controllersRef_11_0= ruleControllersRef )
                    	    // InternalCompras.g:2168:6: lv_controllersRef_11_0= ruleControllersRef
                    	    {

                    	    						newCompositeNode(grammarAccess.getModuleTechAccess().getControllersRefControllersRefParserRuleCall_8_3_0());
                    	    					
                    	    pushFollow(FOLLOW_45);
                    	    lv_controllersRef_11_0=ruleControllersRef();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModuleTechRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"controllersRef",
                    	    							lv_controllersRef_11_0,
                    	    							"org.xtext.example.compras.Compras.ControllersRef");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCompras.g:2190:3: ( ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}' )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalCompras.g:2191:4: ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}'
                    {
                    // InternalCompras.g:2191:4: ( ( ruleFQN ) )
                    // InternalCompras.g:2192:5: ( ruleFQN )
                    {
                    // InternalCompras.g:2192:5: ( ruleFQN )
                    // InternalCompras.g:2193:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModuleTechRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModuleTechAccess().getViewSegmentLayerViewSegmentLayerCrossReference_9_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getModuleTechAccess().getColonKeyword_9_1());
                    			
                    otherlv_15=(Token)match(input,13,FOLLOW_46); 

                    				newLeafNode(otherlv_15, grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_9_2());
                    			
                    // InternalCompras.g:2215:4: ( (lv_viewsRef_16_0= ruleViewsRef ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==48) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalCompras.g:2216:5: (lv_viewsRef_16_0= ruleViewsRef )
                    	    {
                    	    // InternalCompras.g:2216:5: (lv_viewsRef_16_0= ruleViewsRef )
                    	    // InternalCompras.g:2217:6: lv_viewsRef_16_0= ruleViewsRef
                    	    {

                    	    						newCompositeNode(grammarAccess.getModuleTechAccess().getViewsRefViewsRefParserRuleCall_9_3_0());
                    	    					
                    	    pushFollow(FOLLOW_46);
                    	    lv_viewsRef_16_0=ruleViewsRef();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModuleTechRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"viewsRef",
                    	    							lv_viewsRef_16_0,
                    	    							"org.xtext.example.compras.Compras.ViewsRef");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalCompras.g:2239:3: ( ( ( ruleFQN ) ) otherlv_19= ':' otherlv_20= '{' ( (lv_scriptRef_21_0= ruleScriptRef ) )* otherlv_22= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCompras.g:2240:4: ( ( ruleFQN ) ) otherlv_19= ':' otherlv_20= '{' ( (lv_scriptRef_21_0= ruleScriptRef ) )* otherlv_22= '}'
                    {
                    // InternalCompras.g:2240:4: ( ( ruleFQN ) )
                    // InternalCompras.g:2241:5: ( ruleFQN )
                    {
                    // InternalCompras.g:2241:5: ( ruleFQN )
                    // InternalCompras.g:2242:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModuleTechRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModuleTechAccess().getScriptSegmentLayerScriptSegmentLayerCrossReference_10_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_19, grammarAccess.getModuleTechAccess().getColonKeyword_10_1());
                    			
                    otherlv_20=(Token)match(input,13,FOLLOW_47); 

                    				newLeafNode(otherlv_20, grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_10_2());
                    			
                    // InternalCompras.g:2264:4: ( (lv_scriptRef_21_0= ruleScriptRef ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==49) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalCompras.g:2265:5: (lv_scriptRef_21_0= ruleScriptRef )
                    	    {
                    	    // InternalCompras.g:2265:5: (lv_scriptRef_21_0= ruleScriptRef )
                    	    // InternalCompras.g:2266:6: lv_scriptRef_21_0= ruleScriptRef
                    	    {

                    	    						newCompositeNode(grammarAccess.getModuleTechAccess().getScriptRefScriptRefParserRuleCall_10_3_0());
                    	    					
                    	    pushFollow(FOLLOW_47);
                    	    lv_scriptRef_21_0=ruleScriptRef();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModuleTechRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"scriptRef",
                    	    							lv_scriptRef_21_0,
                    	    							"org.xtext.example.compras.Compras.ScriptRef");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_22, grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_23, grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalCompras.g:2292:3: ( (otherlv_24= RULE_ID ) )
            // InternalCompras.g:2293:4: (otherlv_24= RULE_ID )
            {
            // InternalCompras.g:2293:4: (otherlv_24= RULE_ID )
            // InternalCompras.g:2294:5: otherlv_24= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleTechRule());
            					}
            				
            otherlv_24=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_24, grammarAccess.getModuleTechAccess().getBusinessLayerBusinessLayerCrossReference_12_0());
            				

            }


            }

            otherlv_25=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_25, grammarAccess.getModuleTechAccess().getColonKeyword_13());
            		
            otherlv_26=(Token)match(input,13,FOLLOW_48); 

            			newLeafNode(otherlv_26, grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalCompras.g:2313:3: ( (lv_businessLayerRef_27_0= ruleBusinessLayerRef ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==50) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCompras.g:2314:4: (lv_businessLayerRef_27_0= ruleBusinessLayerRef )
            	    {
            	    // InternalCompras.g:2314:4: (lv_businessLayerRef_27_0= ruleBusinessLayerRef )
            	    // InternalCompras.g:2315:5: lv_businessLayerRef_27_0= ruleBusinessLayerRef
            	    {

            	    					newCompositeNode(grammarAccess.getModuleTechAccess().getBusinessLayerRefBusinessLayerRefParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_48);
            	    lv_businessLayerRef_27_0=ruleBusinessLayerRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleTechRule());
            	    					}
            	    					add(
            	    						current,
            	    						"businessLayerRef",
            	    						lv_businessLayerRef_27_0,
            	    						"org.xtext.example.compras.Compras.BusinessLayerRef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_28=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_28, grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_16());
            		
            // InternalCompras.g:2336:3: ( (otherlv_29= RULE_ID ) )
            // InternalCompras.g:2337:4: (otherlv_29= RULE_ID )
            {
            // InternalCompras.g:2337:4: (otherlv_29= RULE_ID )
            // InternalCompras.g:2338:5: otherlv_29= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleTechRule());
            					}
            				
            otherlv_29=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_29, grammarAccess.getModuleTechAccess().getDataAccessLayerDataAccessLayerCrossReference_17_0());
            				

            }


            }

            otherlv_30=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_30, grammarAccess.getModuleTechAccess().getColonKeyword_18());
            		
            otherlv_31=(Token)match(input,13,FOLLOW_49); 

            			newLeafNode(otherlv_31, grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_19());
            		
            // InternalCompras.g:2357:3: ( (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==51) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCompras.g:2358:4: (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef )
            	    {
            	    // InternalCompras.g:2358:4: (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef )
            	    // InternalCompras.g:2359:5: lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef
            	    {

            	    					newCompositeNode(grammarAccess.getModuleTechAccess().getDataAccessLayerRefDataAccessLayerRefParserRuleCall_20_0());
            	    				
            	    pushFollow(FOLLOW_49);
            	    lv_dataAccessLayerRef_32_0=ruleDataAccessLayerRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleTechRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataAccessLayerRef",
            	    						lv_dataAccessLayerRef_32_0,
            	    						"org.xtext.example.compras.Compras.DataAccessLayerRef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_33=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_33, grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_21());
            		
            // InternalCompras.g:2380:3: ( (otherlv_34= RULE_ID ) )
            // InternalCompras.g:2381:4: (otherlv_34= RULE_ID )
            {
            // InternalCompras.g:2381:4: (otherlv_34= RULE_ID )
            // InternalCompras.g:2382:5: otherlv_34= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleTechRule());
            					}
            				
            otherlv_34=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_34, grammarAccess.getModuleTechAccess().getCommonLayerCommonLayerCrossReference_22_0());
            				

            }


            }

            otherlv_35=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_35, grammarAccess.getModuleTechAccess().getColonKeyword_23());
            		
            otherlv_36=(Token)match(input,13,FOLLOW_50); 

            			newLeafNode(otherlv_36, grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_24());
            		
            // InternalCompras.g:2401:3: ( (lv_commonLayerRef_37_0= ruleCommonLayerRef ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==52) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCompras.g:2402:4: (lv_commonLayerRef_37_0= ruleCommonLayerRef )
            	    {
            	    // InternalCompras.g:2402:4: (lv_commonLayerRef_37_0= ruleCommonLayerRef )
            	    // InternalCompras.g:2403:5: lv_commonLayerRef_37_0= ruleCommonLayerRef
            	    {

            	    					newCompositeNode(grammarAccess.getModuleTechAccess().getCommonLayerRefCommonLayerRefParserRuleCall_25_0());
            	    				
            	    pushFollow(FOLLOW_50);
            	    lv_commonLayerRef_37_0=ruleCommonLayerRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleTechRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commonLayerRef",
            	    						lv_commonLayerRef_37_0,
            	    						"org.xtext.example.compras.Compras.CommonLayerRef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_38=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_38, grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_26());
            		
            otherlv_39=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_39, grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_27());
            		

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
    // $ANTLR end "ruleModuleTech"


    // $ANTLR start "entryRuleControllersRef"
    // InternalCompras.g:2432:1: entryRuleControllersRef returns [EObject current=null] : iv_ruleControllersRef= ruleControllersRef EOF ;
    public final EObject entryRuleControllersRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControllersRef = null;


        try {
            // InternalCompras.g:2432:55: (iv_ruleControllersRef= ruleControllersRef EOF )
            // InternalCompras.g:2433:2: iv_ruleControllersRef= ruleControllersRef EOF
            {
             newCompositeNode(grammarAccess.getControllersRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControllersRef=ruleControllersRef();

            state._fsp--;

             current =iv_ruleControllersRef; 
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
    // $ANTLR end "entryRuleControllersRef"


    // $ANTLR start "ruleControllersRef"
    // InternalCompras.g:2439:1: ruleControllersRef returns [EObject current=null] : (otherlv_0= 'Controller' otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleControllersRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCompras.g:2445:2: ( (otherlv_0= 'Controller' otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalCompras.g:2446:2: (otherlv_0= 'Controller' otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalCompras.g:2446:2: (otherlv_0= 'Controller' otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalCompras.g:2447:3: otherlv_0= 'Controller' otherlv_1= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControllersRefAccess().getControllerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getControllersRefAccess().getColonKeyword_1());
            		
            // InternalCompras.g:2455:3: ( ( ruleFQN ) )
            // InternalCompras.g:2456:4: ( ruleFQN )
            {
            // InternalCompras.g:2456:4: ( ruleFQN )
            // InternalCompras.g:2457:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllersRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getControllersRefAccess().getFunctionalityFunctionalityCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleControllersRef"


    // $ANTLR start "entryRuleViewsRef"
    // InternalCompras.g:2475:1: entryRuleViewsRef returns [EObject current=null] : iv_ruleViewsRef= ruleViewsRef EOF ;
    public final EObject entryRuleViewsRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewsRef = null;


        try {
            // InternalCompras.g:2475:49: (iv_ruleViewsRef= ruleViewsRef EOF )
            // InternalCompras.g:2476:2: iv_ruleViewsRef= ruleViewsRef EOF
            {
             newCompositeNode(grammarAccess.getViewsRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewsRef=ruleViewsRef();

            state._fsp--;

             current =iv_ruleViewsRef; 
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
    // $ANTLR end "entryRuleViewsRef"


    // $ANTLR start "ruleViewsRef"
    // InternalCompras.g:2482:1: ruleViewsRef returns [EObject current=null] : (otherlv_0= 'View' otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleViewsRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCompras.g:2488:2: ( (otherlv_0= 'View' otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalCompras.g:2489:2: (otherlv_0= 'View' otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalCompras.g:2489:2: (otherlv_0= 'View' otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalCompras.g:2490:3: otherlv_0= 'View' otherlv_1= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getViewsRefAccess().getViewKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getViewsRefAccess().getColonKeyword_1());
            		
            // InternalCompras.g:2498:3: ( ( ruleFQN ) )
            // InternalCompras.g:2499:4: ( ruleFQN )
            {
            // InternalCompras.g:2499:4: ( ruleFQN )
            // InternalCompras.g:2500:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViewsRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getViewsRefAccess().getFunctionalityFunctionalityCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleViewsRef"


    // $ANTLR start "entryRuleScriptRef"
    // InternalCompras.g:2518:1: entryRuleScriptRef returns [EObject current=null] : iv_ruleScriptRef= ruleScriptRef EOF ;
    public final EObject entryRuleScriptRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptRef = null;


        try {
            // InternalCompras.g:2518:50: (iv_ruleScriptRef= ruleScriptRef EOF )
            // InternalCompras.g:2519:2: iv_ruleScriptRef= ruleScriptRef EOF
            {
             newCompositeNode(grammarAccess.getScriptRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScriptRef=ruleScriptRef();

            state._fsp--;

             current =iv_ruleScriptRef; 
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
    // $ANTLR end "entryRuleScriptRef"


    // $ANTLR start "ruleScriptRef"
    // InternalCompras.g:2525:1: ruleScriptRef returns [EObject current=null] : (otherlv_0= 'Script' otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleScriptRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCompras.g:2531:2: ( (otherlv_0= 'Script' otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalCompras.g:2532:2: (otherlv_0= 'Script' otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalCompras.g:2532:2: (otherlv_0= 'Script' otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalCompras.g:2533:3: otherlv_0= 'Script' otherlv_1= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScriptRefAccess().getScriptKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScriptRefAccess().getColonKeyword_1());
            		
            // InternalCompras.g:2541:3: ( ( ruleFQN ) )
            // InternalCompras.g:2542:4: ( ruleFQN )
            {
            // InternalCompras.g:2542:4: ( ruleFQN )
            // InternalCompras.g:2543:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScriptRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getScriptRefAccess().getFunctionalityFunctionalityCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleScriptRef"


    // $ANTLR start "entryRuleBusinessLayerRef"
    // InternalCompras.g:2561:1: entryRuleBusinessLayerRef returns [EObject current=null] : iv_ruleBusinessLayerRef= ruleBusinessLayerRef EOF ;
    public final EObject entryRuleBusinessLayerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessLayerRef = null;


        try {
            // InternalCompras.g:2561:57: (iv_ruleBusinessLayerRef= ruleBusinessLayerRef EOF )
            // InternalCompras.g:2562:2: iv_ruleBusinessLayerRef= ruleBusinessLayerRef EOF
            {
             newCompositeNode(grammarAccess.getBusinessLayerRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessLayerRef=ruleBusinessLayerRef();

            state._fsp--;

             current =iv_ruleBusinessLayerRef; 
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
    // $ANTLR end "entryRuleBusinessLayerRef"


    // $ANTLR start "ruleBusinessLayerRef"
    // InternalCompras.g:2568:1: ruleBusinessLayerRef returns [EObject current=null] : (otherlv_0= 'BLogic' otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleBusinessLayerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCompras.g:2574:2: ( (otherlv_0= 'BLogic' otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalCompras.g:2575:2: (otherlv_0= 'BLogic' otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalCompras.g:2575:2: (otherlv_0= 'BLogic' otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalCompras.g:2576:3: otherlv_0= 'BLogic' otherlv_1= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessLayerRefAccess().getBLogicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBusinessLayerRefAccess().getColonKeyword_1());
            		
            // InternalCompras.g:2584:3: ( ( ruleFQN ) )
            // InternalCompras.g:2585:4: ( ruleFQN )
            {
            // InternalCompras.g:2585:4: ( ruleFQN )
            // InternalCompras.g:2586:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessLayerRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBusinessLayerRefAccess().getFunctionalityFunctionalityCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleBusinessLayerRef"


    // $ANTLR start "entryRuleDataAccessLayerRef"
    // InternalCompras.g:2604:1: entryRuleDataAccessLayerRef returns [EObject current=null] : iv_ruleDataAccessLayerRef= ruleDataAccessLayerRef EOF ;
    public final EObject entryRuleDataAccessLayerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAccessLayerRef = null;


        try {
            // InternalCompras.g:2604:59: (iv_ruleDataAccessLayerRef= ruleDataAccessLayerRef EOF )
            // InternalCompras.g:2605:2: iv_ruleDataAccessLayerRef= ruleDataAccessLayerRef EOF
            {
             newCompositeNode(grammarAccess.getDataAccessLayerRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataAccessLayerRef=ruleDataAccessLayerRef();

            state._fsp--;

             current =iv_ruleDataAccessLayerRef; 
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
    // $ANTLR end "entryRuleDataAccessLayerRef"


    // $ANTLR start "ruleDataAccessLayerRef"
    // InternalCompras.g:2611:1: ruleDataAccessLayerRef returns [EObject current=null] : (otherlv_0= 'DataAccess' otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleDataAccessLayerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCompras.g:2617:2: ( (otherlv_0= 'DataAccess' otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalCompras.g:2618:2: (otherlv_0= 'DataAccess' otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalCompras.g:2618:2: (otherlv_0= 'DataAccess' otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalCompras.g:2619:3: otherlv_0= 'DataAccess' otherlv_1= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataAccessLayerRefAccess().getDataAccessKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccessLayerRefAccess().getColonKeyword_1());
            		
            // InternalCompras.g:2627:3: ( ( ruleFQN ) )
            // InternalCompras.g:2628:4: ( ruleFQN )
            {
            // InternalCompras.g:2628:4: ( ruleFQN )
            // InternalCompras.g:2629:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataAccessLayerRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataAccessLayerRefAccess().getFunctionalityFunctionalityCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleDataAccessLayerRef"


    // $ANTLR start "entryRuleCommonLayerRef"
    // InternalCompras.g:2647:1: entryRuleCommonLayerRef returns [EObject current=null] : iv_ruleCommonLayerRef= ruleCommonLayerRef EOF ;
    public final EObject entryRuleCommonLayerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLayerRef = null;


        try {
            // InternalCompras.g:2647:55: (iv_ruleCommonLayerRef= ruleCommonLayerRef EOF )
            // InternalCompras.g:2648:2: iv_ruleCommonLayerRef= ruleCommonLayerRef EOF
            {
             newCompositeNode(grammarAccess.getCommonLayerRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommonLayerRef=ruleCommonLayerRef();

            state._fsp--;

             current =iv_ruleCommonLayerRef; 
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
    // $ANTLR end "entryRuleCommonLayerRef"


    // $ANTLR start "ruleCommonLayerRef"
    // InternalCompras.g:2654:1: ruleCommonLayerRef returns [EObject current=null] : (otherlv_0= 'DtoModel' otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleCommonLayerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCompras.g:2660:2: ( (otherlv_0= 'DtoModel' otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalCompras.g:2661:2: (otherlv_0= 'DtoModel' otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalCompras.g:2661:2: (otherlv_0= 'DtoModel' otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalCompras.g:2662:3: otherlv_0= 'DtoModel' otherlv_1= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommonLayerRefAccess().getDtoModelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCommonLayerRefAccess().getColonKeyword_1());
            		
            // InternalCompras.g:2670:3: ( ( ruleFQN ) )
            // InternalCompras.g:2671:4: ( ruleFQN )
            {
            // InternalCompras.g:2671:4: ( ruleFQN )
            // InternalCompras.g:2672:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommonLayerRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCommonLayerRefAccess().getEntityEntityCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleCommonLayerRef"


    // $ANTLR start "entryRuleConnectionString"
    // InternalCompras.g:2690:1: entryRuleConnectionString returns [String current=null] : iv_ruleConnectionString= ruleConnectionString EOF ;
    public final String entryRuleConnectionString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConnectionString = null;


        try {
            // InternalCompras.g:2690:56: (iv_ruleConnectionString= ruleConnectionString EOF )
            // InternalCompras.g:2691:2: iv_ruleConnectionString= ruleConnectionString EOF
            {
             newCompositeNode(grammarAccess.getConnectionStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectionString=ruleConnectionString();

            state._fsp--;

             current =iv_ruleConnectionString.getText(); 
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
    // $ANTLR end "entryRuleConnectionString"


    // $ANTLR start "ruleConnectionString"
    // InternalCompras.g:2697:1: ruleConnectionString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleConnectionString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalCompras.g:2703:2: (this_STRING_0= RULE_STRING )
            // InternalCompras.g:2704:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getConnectionStringAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleConnectionString"


    // $ANTLR start "entryRuleDataFileSeed"
    // InternalCompras.g:2714:1: entryRuleDataFileSeed returns [String current=null] : iv_ruleDataFileSeed= ruleDataFileSeed EOF ;
    public final String entryRuleDataFileSeed() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataFileSeed = null;


        try {
            // InternalCompras.g:2714:52: (iv_ruleDataFileSeed= ruleDataFileSeed EOF )
            // InternalCompras.g:2715:2: iv_ruleDataFileSeed= ruleDataFileSeed EOF
            {
             newCompositeNode(grammarAccess.getDataFileSeedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataFileSeed=ruleDataFileSeed();

            state._fsp--;

             current =iv_ruleDataFileSeed.getText(); 
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
    // $ANTLR end "entryRuleDataFileSeed"


    // $ANTLR start "ruleDataFileSeed"
    // InternalCompras.g:2721:1: ruleDataFileSeed returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleDataFileSeed() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalCompras.g:2727:2: (this_STRING_0= RULE_STRING )
            // InternalCompras.g:2728:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getDataFileSeedAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleDataFileSeed"


    // $ANTLR start "ruleCommonFieldType"
    // InternalCompras.g:2738:1: ruleCommonFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'datetime' ) ) ;
    public final Enumerator ruleCommonFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalCompras.g:2744:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'datetime' ) ) )
            // InternalCompras.g:2745:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'datetime' ) )
            {
            // InternalCompras.g:2745:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'datetime' ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt31=1;
                }
                break;
            case 54:
                {
                alt31=2;
                }
                break;
            case 55:
                {
                alt31=3;
                }
                break;
            case 56:
                {
                alt31=4;
                }
                break;
            case 57:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalCompras.g:2746:3: (enumLiteral_0= 'string' )
                    {
                    // InternalCompras.g:2746:3: (enumLiteral_0= 'string' )
                    // InternalCompras.g:2747:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getCommonFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCommonFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:2754:3: (enumLiteral_1= 'int' )
                    {
                    // InternalCompras.g:2754:3: (enumLiteral_1= 'int' )
                    // InternalCompras.g:2755:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getCommonFieldTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCommonFieldTypeAccess().getINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:2762:3: (enumLiteral_2= 'bool' )
                    {
                    // InternalCompras.g:2762:3: (enumLiteral_2= 'bool' )
                    // InternalCompras.g:2763:4: enumLiteral_2= 'bool'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getCommonFieldTypeAccess().getBOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCommonFieldTypeAccess().getBOOLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCompras.g:2770:3: (enumLiteral_3= 'float' )
                    {
                    // InternalCompras.g:2770:3: (enumLiteral_3= 'float' )
                    // InternalCompras.g:2771:4: enumLiteral_3= 'float'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getCommonFieldTypeAccess().getFLOATEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCommonFieldTypeAccess().getFLOATEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCompras.g:2778:3: (enumLiteral_4= 'datetime' )
                    {
                    // InternalCompras.g:2778:3: (enumLiteral_4= 'datetime' )
                    // InternalCompras.g:2779:4: enumLiteral_4= 'datetime'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getCommonFieldTypeAccess().getDATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCommonFieldTypeAccess().getDATEEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleCommonFieldType"


    // $ANTLR start "ruleRelationsType"
    // InternalCompras.g:2789:1: ruleRelationsType returns [Enumerator current=null] : (enumLiteral_0= 'AllowedToUse' ) ;
    public final Enumerator ruleRelationsType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalCompras.g:2795:2: ( (enumLiteral_0= 'AllowedToUse' ) )
            // InternalCompras.g:2796:2: (enumLiteral_0= 'AllowedToUse' )
            {
            // InternalCompras.g:2796:2: (enumLiteral_0= 'AllowedToUse' )
            // InternalCompras.g:2797:3: enumLiteral_0= 'AllowedToUse'
            {
            enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

            			current = grammarAccess.getRelationsTypeAccess().getALLOWED_TO_USEEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getRelationsTypeAccess().getALLOWED_TO_USEEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleRelationsType"


    // $ANTLR start "ruleDatabaseRDBMSType"
    // InternalCompras.g:2806:1: ruleDatabaseRDBMSType returns [Enumerator current=null] : ( (enumLiteral_0= 'SQLSERVER' ) | (enumLiteral_1= 'ORACLE (future...)' ) | (enumLiteral_2= 'POSTGRES (future...)' ) ) ;
    public final Enumerator ruleDatabaseRDBMSType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCompras.g:2812:2: ( ( (enumLiteral_0= 'SQLSERVER' ) | (enumLiteral_1= 'ORACLE (future...)' ) | (enumLiteral_2= 'POSTGRES (future...)' ) ) )
            // InternalCompras.g:2813:2: ( (enumLiteral_0= 'SQLSERVER' ) | (enumLiteral_1= 'ORACLE (future...)' ) | (enumLiteral_2= 'POSTGRES (future...)' ) )
            {
            // InternalCompras.g:2813:2: ( (enumLiteral_0= 'SQLSERVER' ) | (enumLiteral_1= 'ORACLE (future...)' ) | (enumLiteral_2= 'POSTGRES (future...)' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt32=1;
                }
                break;
            case 60:
                {
                alt32=2;
                }
                break;
            case 61:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalCompras.g:2814:3: (enumLiteral_0= 'SQLSERVER' )
                    {
                    // InternalCompras.g:2814:3: (enumLiteral_0= 'SQLSERVER' )
                    // InternalCompras.g:2815:4: enumLiteral_0= 'SQLSERVER'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseRDBMSTypeAccess().getSQLSERVEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatabaseRDBMSTypeAccess().getSQLSERVEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:2822:3: (enumLiteral_1= 'ORACLE (future...)' )
                    {
                    // InternalCompras.g:2822:3: (enumLiteral_1= 'ORACLE (future...)' )
                    // InternalCompras.g:2823:4: enumLiteral_1= 'ORACLE (future...)'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseRDBMSTypeAccess().getORACLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatabaseRDBMSTypeAccess().getORACLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:2830:3: (enumLiteral_2= 'POSTGRES (future...)' )
                    {
                    // InternalCompras.g:2830:3: (enumLiteral_2= 'POSTGRES (future...)' )
                    // InternalCompras.g:2831:4: enumLiteral_2= 'POSTGRES (future...)'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseRDBMSTypeAccess().getPOSTGRESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDatabaseRDBMSTypeAccess().getPOSTGRESEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleDatabaseRDBMSType"

    // Delegated rules


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\4\1\14\1\uffff\1\4\1\15\1\14\1\21\2\uffff";
    static final String dfa_3s = "\1\21\1\22\1\uffff\1\4\1\15\1\22\1\61\2\uffff";
    static final String dfa_4s = "\2\uffff\1\2\4\uffff\2\1";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\14\uffff\1\2",
            "\1\4\5\uffff\1\3",
            "",
            "\1\5",
            "\1\6",
            "\1\4\5\uffff\1\3",
            "\1\10\35\uffff\1\7\2\2",
            "",
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
            return "2141:3: ( ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}' )?";
        }
    }
    static final String[] dfa_7s = {
            "\1\1\14\uffff\1\2",
            "\1\4\5\uffff\1\3",
            "",
            "\1\5",
            "\1\6",
            "\1\4\5\uffff\1\3",
            "\1\10\36\uffff\1\7\1\2",
            "",
            ""
    };
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2190:3: ( ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}' )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x03E0000000420010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x03E0000000400010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000F8020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0000020000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000020010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000300000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000020000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000020000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000020000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000020000L});

}