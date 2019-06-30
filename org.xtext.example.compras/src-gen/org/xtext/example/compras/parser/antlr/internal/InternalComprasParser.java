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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SolutionName'", "':'", "'{'", "'Domain'", "'Architecture'", "'Technology'", "'}'", "'.'", "'Module'", "'Entities'", "'Functionalities'", "'RelEntity'", "'Layers'", "'PresentationLayer'", "'BusinessLayer'", "'DataAccessLayer'", "'CommonLayer'", "'Relations'", "'ControllerSegmentLayer'", "'ViewSegmentLayer'", "'ScriptSegmentLayer'", "'DbConnectorSegmentLayer'", "'AspNet'", "'Database'", "'DatabaseRDBMSType'", "'ConnectionString'", "'Controller'", "'View'", "'Script'", "'BLogic'", "'DataAccess'", "'DtoModel'", "'string'", "'int'", "'bool'", "'float'", "'CREATE'", "'VIEW_GRID'", "'VIEW_DROPDOWN'", "'EDIT'", "'DELETE'", "'AllowedToUse'", "'SQLSERVER'", "'ORACLE (future...)'", "'POSTGRES (future...)'"
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
    // InternalCompras.g:292:1: ruleModule returns [EObject current=null] : (otherlv_0= 'Module' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' otherlv_5= 'Entities' otherlv_6= ':' otherlv_7= '{' ( (lv_entity_8_0= ruleEntity ) )* otherlv_9= '}' otherlv_10= 'Functionalities' otherlv_11= ':' otherlv_12= '{' ( (lv_functionality_13_0= ruleFunctionality ) )* otherlv_14= '}' otherlv_15= '}' ) ;
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
            // InternalCompras.g:298:2: ( (otherlv_0= 'Module' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' otherlv_5= 'Entities' otherlv_6= ':' otherlv_7= '{' ( (lv_entity_8_0= ruleEntity ) )* otherlv_9= '}' otherlv_10= 'Functionalities' otherlv_11= ':' otherlv_12= '{' ( (lv_functionality_13_0= ruleFunctionality ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // InternalCompras.g:299:2: (otherlv_0= 'Module' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' otherlv_5= 'Entities' otherlv_6= ':' otherlv_7= '{' ( (lv_entity_8_0= ruleEntity ) )* otherlv_9= '}' otherlv_10= 'Functionalities' otherlv_11= ':' otherlv_12= '{' ( (lv_functionality_13_0= ruleFunctionality ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalCompras.g:299:2: (otherlv_0= 'Module' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' otherlv_5= 'Entities' otherlv_6= ':' otherlv_7= '{' ( (lv_entity_8_0= ruleEntity ) )* otherlv_9= '}' otherlv_10= 'Functionalities' otherlv_11= ':' otherlv_12= '{' ( (lv_functionality_13_0= ruleFunctionality ) )* otherlv_14= '}' otherlv_15= '}' )
            // InternalCompras.g:300:3: otherlv_0= 'Module' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' otherlv_5= 'Entities' otherlv_6= ':' otherlv_7= '{' ( (lv_entity_8_0= ruleEntity ) )* otherlv_9= '}' otherlv_10= 'Functionalities' otherlv_11= ':' otherlv_12= '{' ( (lv_functionality_13_0= ruleFunctionality ) )* otherlv_14= '}' otherlv_15= '}'
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
            		
            otherlv_10=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getModuleAccess().getFunctionalitiesKeyword_10());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getModuleAccess().getColonKeyword_11());
            		
            otherlv_12=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalCompras.g:381:3: ( (lv_functionality_13_0= ruleFunctionality ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCompras.g:382:4: (lv_functionality_13_0= ruleFunctionality )
            	    {
            	    // InternalCompras.g:382:4: (lv_functionality_13_0= ruleFunctionality )
            	    // InternalCompras.g:383:5: lv_functionality_13_0= ruleFunctionality
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getFunctionalityFunctionalityParserRuleCall_13_0());
            	    				
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

            			newLeafNode(otherlv_14, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalCompras.g:412:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalCompras.g:412:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalCompras.g:413:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalCompras.g:419:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_entityField_3_0= ruleEntityField ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entityField_3_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:425:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_entityField_3_0= ruleEntityField ) )* otherlv_4= '}' ) )
            // InternalCompras.g:426:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_entityField_3_0= ruleEntityField ) )* otherlv_4= '}' )
            {
            // InternalCompras.g:426:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_entityField_3_0= ruleEntityField ) )* otherlv_4= '}' )
            // InternalCompras.g:427:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_entityField_3_0= ruleEntityField ) )* otherlv_4= '}'
            {
            // InternalCompras.g:427:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:428:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:428:4: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:429:5: lv_name_0_0= RULE_ID
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
            		
            // InternalCompras.g:453:3: ( (lv_entityField_3_0= ruleEntityField ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=43 && LA8_0<=46)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCompras.g:454:4: (lv_entityField_3_0= ruleEntityField )
            	    {
            	    // InternalCompras.g:454:4: (lv_entityField_3_0= ruleEntityField )
            	    // InternalCompras.g:455:5: lv_entityField_3_0= ruleEntityField
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
            	    break loop8;
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
    // InternalCompras.g:480:1: entryRuleEntityField returns [EObject current=null] : iv_ruleEntityField= ruleEntityField EOF ;
    public final EObject entryRuleEntityField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityField = null;


        try {
            // InternalCompras.g:480:52: (iv_ruleEntityField= ruleEntityField EOF )
            // InternalCompras.g:481:2: iv_ruleEntityField= ruleEntityField EOF
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
    // InternalCompras.g:487:1: ruleEntityField returns [EObject current=null] : ( ( (lv_entityType_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEntityField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_entityType_0_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:493:2: ( ( ( (lv_entityType_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCompras.g:494:2: ( ( (lv_entityType_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCompras.g:494:2: ( ( (lv_entityType_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCompras.g:495:3: ( (lv_entityType_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalCompras.g:495:3: ( (lv_entityType_0_0= ruleEntityType ) )
            // InternalCompras.g:496:4: (lv_entityType_0_0= ruleEntityType )
            {
            // InternalCompras.g:496:4: (lv_entityType_0_0= ruleEntityType )
            // InternalCompras.g:497:5: lv_entityType_0_0= ruleEntityType
            {

            					newCompositeNode(grammarAccess.getEntityFieldAccess().getEntityTypeEntityTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_entityType_0_0=ruleEntityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityFieldRule());
            					}
            					set(
            						current,
            						"entityType",
            						lv_entityType_0_0,
            						"org.xtext.example.compras.Compras.EntityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCompras.g:514:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCompras.g:515:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCompras.g:515:4: (lv_name_1_0= RULE_ID )
            // InternalCompras.g:516:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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


    // $ANTLR start "entryRuleEntityType"
    // InternalCompras.g:536:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalCompras.g:536:51: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalCompras.g:537:2: iv_ruleEntityType= ruleEntityType EOF
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
    // InternalCompras.g:543:1: ruleEntityType returns [EObject current=null] : ( ( ( ruleFQN ) ) | ( (lv_commonFieldType_1_0= ruleCommonFieldType ) ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_commonFieldType_1_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:549:2: ( ( ( ( ruleFQN ) ) | ( (lv_commonFieldType_1_0= ruleCommonFieldType ) ) ) )
            // InternalCompras.g:550:2: ( ( ( ruleFQN ) ) | ( (lv_commonFieldType_1_0= ruleCommonFieldType ) ) )
            {
            // InternalCompras.g:550:2: ( ( ( ruleFQN ) ) | ( (lv_commonFieldType_1_0= ruleCommonFieldType ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=43 && LA9_0<=46)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCompras.g:551:3: ( ( ruleFQN ) )
                    {
                    // InternalCompras.g:551:3: ( ( ruleFQN ) )
                    // InternalCompras.g:552:4: ( ruleFQN )
                    {
                    // InternalCompras.g:552:4: ( ruleFQN )
                    // InternalCompras.g:553:5: ruleFQN
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
                    // InternalCompras.g:568:3: ( (lv_commonFieldType_1_0= ruleCommonFieldType ) )
                    {
                    // InternalCompras.g:568:3: ( (lv_commonFieldType_1_0= ruleCommonFieldType ) )
                    // InternalCompras.g:569:4: (lv_commonFieldType_1_0= ruleCommonFieldType )
                    {
                    // InternalCompras.g:569:4: (lv_commonFieldType_1_0= ruleCommonFieldType )
                    // InternalCompras.g:570:5: lv_commonFieldType_1_0= ruleCommonFieldType
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
    // InternalCompras.g:591:1: entryRuleFunctionality returns [EObject current=null] : iv_ruleFunctionality= ruleFunctionality EOF ;
    public final EObject entryRuleFunctionality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionality = null;


        try {
            // InternalCompras.g:591:54: (iv_ruleFunctionality= ruleFunctionality EOF )
            // InternalCompras.g:592:2: iv_ruleFunctionality= ruleFunctionality EOF
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
    // InternalCompras.g:598:1: ruleFunctionality returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'RelEntity' ( ( ruleFQN ) ) otherlv_3= ':' otherlv_4= '{' ( (lv_functionalityFieldType_5_0= ruleFunctionalityFieldType ) )* otherlv_6= '}' ) ;
    public final EObject ruleFunctionality() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_functionalityFieldType_5_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:604:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'RelEntity' ( ( ruleFQN ) ) otherlv_3= ':' otherlv_4= '{' ( (lv_functionalityFieldType_5_0= ruleFunctionalityFieldType ) )* otherlv_6= '}' ) )
            // InternalCompras.g:605:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'RelEntity' ( ( ruleFQN ) ) otherlv_3= ':' otherlv_4= '{' ( (lv_functionalityFieldType_5_0= ruleFunctionalityFieldType ) )* otherlv_6= '}' )
            {
            // InternalCompras.g:605:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'RelEntity' ( ( ruleFQN ) ) otherlv_3= ':' otherlv_4= '{' ( (lv_functionalityFieldType_5_0= ruleFunctionalityFieldType ) )* otherlv_6= '}' )
            // InternalCompras.g:606:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'RelEntity' ( ( ruleFQN ) ) otherlv_3= ':' otherlv_4= '{' ( (lv_functionalityFieldType_5_0= ruleFunctionalityFieldType ) )* otherlv_6= '}'
            {
            // InternalCompras.g:606:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:607:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:607:4: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:608:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionalityAccess().getRelEntityKeyword_1());
            		
            // InternalCompras.g:628:3: ( ( ruleFQN ) )
            // InternalCompras.g:629:4: ( ruleFQN )
            {
            // InternalCompras.g:629:4: ( ruleFQN )
            // InternalCompras.g:630:5: ruleFQN
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
            		
            otherlv_4=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalCompras.g:652:3: ( (lv_functionalityFieldType_5_0= ruleFunctionalityFieldType ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=47 && LA10_0<=51)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCompras.g:653:4: (lv_functionalityFieldType_5_0= ruleFunctionalityFieldType )
            	    {
            	    // InternalCompras.g:653:4: (lv_functionalityFieldType_5_0= ruleFunctionalityFieldType )
            	    // InternalCompras.g:654:5: lv_functionalityFieldType_5_0= ruleFunctionalityFieldType
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionalityAccess().getFunctionalityFieldTypeFunctionalityFieldTypeEnumRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_functionalityFieldType_5_0=ruleFunctionalityFieldType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionalityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functionalityFieldType",
            	    						lv_functionalityFieldType_5_0,
            	    						"org.xtext.example.compras.Compras.FunctionalityFieldType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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


    // $ANTLR start "entryRuleArchitecture"
    // InternalCompras.g:679:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // InternalCompras.g:679:53: (iv_ruleArchitecture= ruleArchitecture EOF )
            // InternalCompras.g:680:2: iv_ruleArchitecture= ruleArchitecture EOF
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
    // InternalCompras.g:686:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'Layers' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'PresentationLayer' otherlv_5= ':' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) otherlv_7= 'BusinessLayer' otherlv_8= ':' ( (lv_businessLayer_9_0= ruleBusinessLayer ) ) otherlv_10= 'DataAccessLayer' otherlv_11= ':' ( (lv_dataAccessLayer_12_0= ruleDataAccessLayer ) ) otherlv_13= 'CommonLayer' otherlv_14= ':' ( (lv_commonLayer_15_0= ruleCommonLayer ) ) otherlv_16= '}' otherlv_17= 'Relations' otherlv_18= ':' ( (lv_relations_19_0= ruleRelations ) ) otherlv_20= '}' ) ;
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
            // InternalCompras.g:692:2: ( (otherlv_0= '{' otherlv_1= 'Layers' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'PresentationLayer' otherlv_5= ':' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) otherlv_7= 'BusinessLayer' otherlv_8= ':' ( (lv_businessLayer_9_0= ruleBusinessLayer ) ) otherlv_10= 'DataAccessLayer' otherlv_11= ':' ( (lv_dataAccessLayer_12_0= ruleDataAccessLayer ) ) otherlv_13= 'CommonLayer' otherlv_14= ':' ( (lv_commonLayer_15_0= ruleCommonLayer ) ) otherlv_16= '}' otherlv_17= 'Relations' otherlv_18= ':' ( (lv_relations_19_0= ruleRelations ) ) otherlv_20= '}' ) )
            // InternalCompras.g:693:2: (otherlv_0= '{' otherlv_1= 'Layers' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'PresentationLayer' otherlv_5= ':' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) otherlv_7= 'BusinessLayer' otherlv_8= ':' ( (lv_businessLayer_9_0= ruleBusinessLayer ) ) otherlv_10= 'DataAccessLayer' otherlv_11= ':' ( (lv_dataAccessLayer_12_0= ruleDataAccessLayer ) ) otherlv_13= 'CommonLayer' otherlv_14= ':' ( (lv_commonLayer_15_0= ruleCommonLayer ) ) otherlv_16= '}' otherlv_17= 'Relations' otherlv_18= ':' ( (lv_relations_19_0= ruleRelations ) ) otherlv_20= '}' )
            {
            // InternalCompras.g:693:2: (otherlv_0= '{' otherlv_1= 'Layers' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'PresentationLayer' otherlv_5= ':' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) otherlv_7= 'BusinessLayer' otherlv_8= ':' ( (lv_businessLayer_9_0= ruleBusinessLayer ) ) otherlv_10= 'DataAccessLayer' otherlv_11= ':' ( (lv_dataAccessLayer_12_0= ruleDataAccessLayer ) ) otherlv_13= 'CommonLayer' otherlv_14= ':' ( (lv_commonLayer_15_0= ruleCommonLayer ) ) otherlv_16= '}' otherlv_17= 'Relations' otherlv_18= ':' ( (lv_relations_19_0= ruleRelations ) ) otherlv_20= '}' )
            // InternalCompras.g:694:3: otherlv_0= '{' otherlv_1= 'Layers' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'PresentationLayer' otherlv_5= ':' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) otherlv_7= 'BusinessLayer' otherlv_8= ':' ( (lv_businessLayer_9_0= ruleBusinessLayer ) ) otherlv_10= 'DataAccessLayer' otherlv_11= ':' ( (lv_dataAccessLayer_12_0= ruleDataAccessLayer ) ) otherlv_13= 'CommonLayer' otherlv_14= ':' ( (lv_commonLayer_15_0= ruleCommonLayer ) ) otherlv_16= '}' otherlv_17= 'Relations' otherlv_18= ':' ( (lv_relations_19_0= ruleRelations ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getArchitectureAccess().getLayersKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getArchitectureAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getArchitectureAccess().getPresentationLayerKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getArchitectureAccess().getColonKeyword_5());
            		
            // InternalCompras.g:718:3: ( (lv_presentationLayer_6_0= rulePresentationLayer ) )
            // InternalCompras.g:719:4: (lv_presentationLayer_6_0= rulePresentationLayer )
            {
            // InternalCompras.g:719:4: (lv_presentationLayer_6_0= rulePresentationLayer )
            // InternalCompras.g:720:5: lv_presentationLayer_6_0= rulePresentationLayer
            {

            					newCompositeNode(grammarAccess.getArchitectureAccess().getPresentationLayerPresentationLayerParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_7=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getArchitectureAccess().getBusinessLayerKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getArchitectureAccess().getColonKeyword_8());
            		
            // InternalCompras.g:745:3: ( (lv_businessLayer_9_0= ruleBusinessLayer ) )
            // InternalCompras.g:746:4: (lv_businessLayer_9_0= ruleBusinessLayer )
            {
            // InternalCompras.g:746:4: (lv_businessLayer_9_0= ruleBusinessLayer )
            // InternalCompras.g:747:5: lv_businessLayer_9_0= ruleBusinessLayer
            {

            					newCompositeNode(grammarAccess.getArchitectureAccess().getBusinessLayerBusinessLayerParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_10=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getArchitectureAccess().getDataAccessLayerKeyword_10());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getArchitectureAccess().getColonKeyword_11());
            		
            // InternalCompras.g:772:3: ( (lv_dataAccessLayer_12_0= ruleDataAccessLayer ) )
            // InternalCompras.g:773:4: (lv_dataAccessLayer_12_0= ruleDataAccessLayer )
            {
            // InternalCompras.g:773:4: (lv_dataAccessLayer_12_0= ruleDataAccessLayer )
            // InternalCompras.g:774:5: lv_dataAccessLayer_12_0= ruleDataAccessLayer
            {

            					newCompositeNode(grammarAccess.getArchitectureAccess().getDataAccessLayerDataAccessLayerParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_13=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getArchitectureAccess().getCommonLayerKeyword_13());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getArchitectureAccess().getColonKeyword_14());
            		
            // InternalCompras.g:799:3: ( (lv_commonLayer_15_0= ruleCommonLayer ) )
            // InternalCompras.g:800:4: (lv_commonLayer_15_0= ruleCommonLayer )
            {
            // InternalCompras.g:800:4: (lv_commonLayer_15_0= ruleCommonLayer )
            // InternalCompras.g:801:5: lv_commonLayer_15_0= ruleCommonLayer
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

            otherlv_16=(Token)match(input,17,FOLLOW_27); 

            			newLeafNode(otherlv_16, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_17=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getArchitectureAccess().getRelationsKeyword_17());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_18, grammarAccess.getArchitectureAccess().getColonKeyword_18());
            		
            // InternalCompras.g:830:3: ( (lv_relations_19_0= ruleRelations ) )
            // InternalCompras.g:831:4: (lv_relations_19_0= ruleRelations )
            {
            // InternalCompras.g:831:4: (lv_relations_19_0= ruleRelations )
            // InternalCompras.g:832:5: lv_relations_19_0= ruleRelations
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
    // InternalCompras.g:857:1: entryRulePresentationLayer returns [EObject current=null] : iv_rulePresentationLayer= rulePresentationLayer EOF ;
    public final EObject entryRulePresentationLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationLayer = null;


        try {
            // InternalCompras.g:857:58: (iv_rulePresentationLayer= rulePresentationLayer EOF )
            // InternalCompras.g:858:2: iv_rulePresentationLayer= rulePresentationLayer EOF
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
    // InternalCompras.g:864:1: rulePresentationLayer returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'ControllerSegmentLayer' otherlv_4= ':' ( (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer ) ) otherlv_6= 'ViewSegmentLayer' otherlv_7= ':' ( (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer ) ) otherlv_9= 'ScriptSegmentLayer' otherlv_10= ':' ( (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer ) ) otherlv_12= '}' ) ;
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
            // InternalCompras.g:870:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'ControllerSegmentLayer' otherlv_4= ':' ( (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer ) ) otherlv_6= 'ViewSegmentLayer' otherlv_7= ':' ( (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer ) ) otherlv_9= 'ScriptSegmentLayer' otherlv_10= ':' ( (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer ) ) otherlv_12= '}' ) )
            // InternalCompras.g:871:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'ControllerSegmentLayer' otherlv_4= ':' ( (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer ) ) otherlv_6= 'ViewSegmentLayer' otherlv_7= ':' ( (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer ) ) otherlv_9= 'ScriptSegmentLayer' otherlv_10= ':' ( (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer ) ) otherlv_12= '}' )
            {
            // InternalCompras.g:871:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'ControllerSegmentLayer' otherlv_4= ':' ( (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer ) ) otherlv_6= 'ViewSegmentLayer' otherlv_7= ':' ( (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer ) ) otherlv_9= 'ScriptSegmentLayer' otherlv_10= ':' ( (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer ) ) otherlv_12= '}' )
            // InternalCompras.g:872:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'ControllerSegmentLayer' otherlv_4= ':' ( (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer ) ) otherlv_6= 'ViewSegmentLayer' otherlv_7= ':' ( (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer ) ) otherlv_9= 'ScriptSegmentLayer' otherlv_10= ':' ( (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer ) ) otherlv_12= '}'
            {
            // InternalCompras.g:872:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:873:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:873:4: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:874:5: lv_name_0_0= RULE_ID
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
            		
            otherlv_2=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getPresentationLayerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getPresentationLayerAccess().getColonKeyword_4());
            		
            // InternalCompras.g:906:3: ( (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer ) )
            // InternalCompras.g:907:4: (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer )
            {
            // InternalCompras.g:907:4: (lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer )
            // InternalCompras.g:908:5: lv_controllerSegmentLayer_5_0= ruleControllerSegmentLayer
            {

            					newCompositeNode(grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerControllerSegmentLayerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
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

            otherlv_6=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getPresentationLayerAccess().getViewSegmentLayerKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getPresentationLayerAccess().getColonKeyword_7());
            		
            // InternalCompras.g:933:3: ( (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer ) )
            // InternalCompras.g:934:4: (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer )
            {
            // InternalCompras.g:934:4: (lv_viewSegmentLayer_8_0= ruleViewSegmentLayer )
            // InternalCompras.g:935:5: lv_viewSegmentLayer_8_0= ruleViewSegmentLayer
            {

            					newCompositeNode(grammarAccess.getPresentationLayerAccess().getViewSegmentLayerViewSegmentLayerParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_9=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getPresentationLayerAccess().getScriptSegmentLayerKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getPresentationLayerAccess().getColonKeyword_10());
            		
            // InternalCompras.g:960:3: ( (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer ) )
            // InternalCompras.g:961:4: (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer )
            {
            // InternalCompras.g:961:4: (lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer )
            // InternalCompras.g:962:5: lv_scriptegmentLayer_11_0= ruleScriptSegmentLayer
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
    // InternalCompras.g:987:1: entryRuleControllerSegmentLayer returns [EObject current=null] : iv_ruleControllerSegmentLayer= ruleControllerSegmentLayer EOF ;
    public final EObject entryRuleControllerSegmentLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControllerSegmentLayer = null;


        try {
            // InternalCompras.g:987:63: (iv_ruleControllerSegmentLayer= ruleControllerSegmentLayer EOF )
            // InternalCompras.g:988:2: iv_ruleControllerSegmentLayer= ruleControllerSegmentLayer EOF
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
    // InternalCompras.g:994:1: ruleControllerSegmentLayer returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleControllerSegmentLayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:1000:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCompras.g:1001:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCompras.g:1001:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1002:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1002:3: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1003:4: lv_name_0_0= RULE_ID
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
    // InternalCompras.g:1022:1: entryRuleViewSegmentLayer returns [EObject current=null] : iv_ruleViewSegmentLayer= ruleViewSegmentLayer EOF ;
    public final EObject entryRuleViewSegmentLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewSegmentLayer = null;


        try {
            // InternalCompras.g:1022:57: (iv_ruleViewSegmentLayer= ruleViewSegmentLayer EOF )
            // InternalCompras.g:1023:2: iv_ruleViewSegmentLayer= ruleViewSegmentLayer EOF
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
    // InternalCompras.g:1029:1: ruleViewSegmentLayer returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleViewSegmentLayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:1035:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCompras.g:1036:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCompras.g:1036:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1037:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1037:3: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1038:4: lv_name_0_0= RULE_ID
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
    // InternalCompras.g:1057:1: entryRuleScriptSegmentLayer returns [EObject current=null] : iv_ruleScriptSegmentLayer= ruleScriptSegmentLayer EOF ;
    public final EObject entryRuleScriptSegmentLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptSegmentLayer = null;


        try {
            // InternalCompras.g:1057:59: (iv_ruleScriptSegmentLayer= ruleScriptSegmentLayer EOF )
            // InternalCompras.g:1058:2: iv_ruleScriptSegmentLayer= ruleScriptSegmentLayer EOF
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
    // InternalCompras.g:1064:1: ruleScriptSegmentLayer returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleScriptSegmentLayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:1070:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCompras.g:1071:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCompras.g:1071:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1072:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1072:3: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1073:4: lv_name_0_0= RULE_ID
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
    // InternalCompras.g:1092:1: entryRuleBusinessLayer returns [EObject current=null] : iv_ruleBusinessLayer= ruleBusinessLayer EOF ;
    public final EObject entryRuleBusinessLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessLayer = null;


        try {
            // InternalCompras.g:1092:54: (iv_ruleBusinessLayer= ruleBusinessLayer EOF )
            // InternalCompras.g:1093:2: iv_ruleBusinessLayer= ruleBusinessLayer EOF
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
    // InternalCompras.g:1099:1: ruleBusinessLayer returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBusinessLayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:1105:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCompras.g:1106:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCompras.g:1106:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1107:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1107:3: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1108:4: lv_name_0_0= RULE_ID
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
    // InternalCompras.g:1127:1: entryRuleDataAccessLayer returns [EObject current=null] : iv_ruleDataAccessLayer= ruleDataAccessLayer EOF ;
    public final EObject entryRuleDataAccessLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAccessLayer = null;


        try {
            // InternalCompras.g:1127:56: (iv_ruleDataAccessLayer= ruleDataAccessLayer EOF )
            // InternalCompras.g:1128:2: iv_ruleDataAccessLayer= ruleDataAccessLayer EOF
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
    // InternalCompras.g:1134:1: ruleDataAccessLayer returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'DbConnectorSegmentLayer' otherlv_4= ':' ( (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer ) ) otherlv_6= '}' ) ;
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
            // InternalCompras.g:1140:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'DbConnectorSegmentLayer' otherlv_4= ':' ( (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer ) ) otherlv_6= '}' ) )
            // InternalCompras.g:1141:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'DbConnectorSegmentLayer' otherlv_4= ':' ( (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer ) ) otherlv_6= '}' )
            {
            // InternalCompras.g:1141:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'DbConnectorSegmentLayer' otherlv_4= ':' ( (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer ) ) otherlv_6= '}' )
            // InternalCompras.g:1142:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'DbConnectorSegmentLayer' otherlv_4= ':' ( (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer ) ) otherlv_6= '}'
            {
            // InternalCompras.g:1142:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1143:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1143:4: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1144:5: lv_name_0_0= RULE_ID
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
            		
            otherlv_2=(Token)match(input,13,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getDataAccessLayerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDataAccessLayerAccess().getColonKeyword_4());
            		
            // InternalCompras.g:1176:3: ( (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer ) )
            // InternalCompras.g:1177:4: (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer )
            {
            // InternalCompras.g:1177:4: (lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer )
            // InternalCompras.g:1178:5: lv_dbConnectorSegmentLayer_5_0= ruleDbConnectorSegmentLayer
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
    // InternalCompras.g:1203:1: entryRuleDbConnectorSegmentLayer returns [EObject current=null] : iv_ruleDbConnectorSegmentLayer= ruleDbConnectorSegmentLayer EOF ;
    public final EObject entryRuleDbConnectorSegmentLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDbConnectorSegmentLayer = null;


        try {
            // InternalCompras.g:1203:64: (iv_ruleDbConnectorSegmentLayer= ruleDbConnectorSegmentLayer EOF )
            // InternalCompras.g:1204:2: iv_ruleDbConnectorSegmentLayer= ruleDbConnectorSegmentLayer EOF
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
    // InternalCompras.g:1210:1: ruleDbConnectorSegmentLayer returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDbConnectorSegmentLayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:1216:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCompras.g:1217:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCompras.g:1217:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1218:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1218:3: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1219:4: lv_name_0_0= RULE_ID
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
    // InternalCompras.g:1238:1: entryRuleCommonLayer returns [EObject current=null] : iv_ruleCommonLayer= ruleCommonLayer EOF ;
    public final EObject entryRuleCommonLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLayer = null;


        try {
            // InternalCompras.g:1238:52: (iv_ruleCommonLayer= ruleCommonLayer EOF )
            // InternalCompras.g:1239:2: iv_ruleCommonLayer= ruleCommonLayer EOF
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
    // InternalCompras.g:1245:1: ruleCommonLayer returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCommonLayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCompras.g:1251:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCompras.g:1252:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCompras.g:1252:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCompras.g:1253:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCompras.g:1253:3: (lv_name_0_0= RULE_ID )
            // InternalCompras.g:1254:4: lv_name_0_0= RULE_ID
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
    // InternalCompras.g:1273:1: entryRuleRelations returns [EObject current=null] : iv_ruleRelations= ruleRelations EOF ;
    public final EObject entryRuleRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelations = null;


        try {
            // InternalCompras.g:1273:50: (iv_ruleRelations= ruleRelations EOF )
            // InternalCompras.g:1274:2: iv_ruleRelations= ruleRelations EOF
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
    // InternalCompras.g:1280:1: ruleRelations returns [EObject current=null] : (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_relationsType1_2_0= ruleRelationsType ) ) ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_relationsType2_5_0= ruleRelationsType ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_relationsType3_8_0= ruleRelationsType ) ) ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (lv_relationsType4_11_0= ruleRelationsType ) ) ( (otherlv_12= RULE_ID ) ) ( (otherlv_13= RULE_ID ) ) ( (lv_relationsType5_14_0= ruleRelationsType ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' ) ;
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
            // InternalCompras.g:1286:2: ( (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_relationsType1_2_0= ruleRelationsType ) ) ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_relationsType2_5_0= ruleRelationsType ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_relationsType3_8_0= ruleRelationsType ) ) ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (lv_relationsType4_11_0= ruleRelationsType ) ) ( (otherlv_12= RULE_ID ) ) ( (otherlv_13= RULE_ID ) ) ( (lv_relationsType5_14_0= ruleRelationsType ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' ) )
            // InternalCompras.g:1287:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_relationsType1_2_0= ruleRelationsType ) ) ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_relationsType2_5_0= ruleRelationsType ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_relationsType3_8_0= ruleRelationsType ) ) ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (lv_relationsType4_11_0= ruleRelationsType ) ) ( (otherlv_12= RULE_ID ) ) ( (otherlv_13= RULE_ID ) ) ( (lv_relationsType5_14_0= ruleRelationsType ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' )
            {
            // InternalCompras.g:1287:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_relationsType1_2_0= ruleRelationsType ) ) ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_relationsType2_5_0= ruleRelationsType ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_relationsType3_8_0= ruleRelationsType ) ) ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (lv_relationsType4_11_0= ruleRelationsType ) ) ( (otherlv_12= RULE_ID ) ) ( (otherlv_13= RULE_ID ) ) ( (lv_relationsType5_14_0= ruleRelationsType ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' )
            // InternalCompras.g:1288:3: otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) ( (lv_relationsType1_2_0= ruleRelationsType ) ) ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_relationsType2_5_0= ruleRelationsType ) ) ( (otherlv_6= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_relationsType3_8_0= ruleRelationsType ) ) ( (otherlv_9= RULE_ID ) ) ( (otherlv_10= RULE_ID ) ) ( (lv_relationsType4_11_0= ruleRelationsType ) ) ( (otherlv_12= RULE_ID ) ) ( (otherlv_13= RULE_ID ) ) ( (lv_relationsType5_14_0= ruleRelationsType ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationsAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalCompras.g:1292:3: ( (otherlv_1= RULE_ID ) )
            // InternalCompras.g:1293:4: (otherlv_1= RULE_ID )
            {
            // InternalCompras.g:1293:4: (otherlv_1= RULE_ID )
            // InternalCompras.g:1294:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_1, grammarAccess.getRelationsAccess().getSourceLayer1PresentationLayerCrossReference_1_0());
            				

            }


            }

            // InternalCompras.g:1305:3: ( (lv_relationsType1_2_0= ruleRelationsType ) )
            // InternalCompras.g:1306:4: (lv_relationsType1_2_0= ruleRelationsType )
            {
            // InternalCompras.g:1306:4: (lv_relationsType1_2_0= ruleRelationsType )
            // InternalCompras.g:1307:5: lv_relationsType1_2_0= ruleRelationsType
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

            // InternalCompras.g:1324:3: ( (otherlv_3= RULE_ID ) )
            // InternalCompras.g:1325:4: (otherlv_3= RULE_ID )
            {
            // InternalCompras.g:1325:4: (otherlv_3= RULE_ID )
            // InternalCompras.g:1326:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_3, grammarAccess.getRelationsAccess().getTargetLayer1BusinessLayerCrossReference_3_0());
            				

            }


            }

            // InternalCompras.g:1337:3: ( (otherlv_4= RULE_ID ) )
            // InternalCompras.g:1338:4: (otherlv_4= RULE_ID )
            {
            // InternalCompras.g:1338:4: (otherlv_4= RULE_ID )
            // InternalCompras.g:1339:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_4, grammarAccess.getRelationsAccess().getSourceLayer2BusinessLayerCrossReference_4_0());
            				

            }


            }

            // InternalCompras.g:1350:3: ( (lv_relationsType2_5_0= ruleRelationsType ) )
            // InternalCompras.g:1351:4: (lv_relationsType2_5_0= ruleRelationsType )
            {
            // InternalCompras.g:1351:4: (lv_relationsType2_5_0= ruleRelationsType )
            // InternalCompras.g:1352:5: lv_relationsType2_5_0= ruleRelationsType
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

            // InternalCompras.g:1369:3: ( (otherlv_6= RULE_ID ) )
            // InternalCompras.g:1370:4: (otherlv_6= RULE_ID )
            {
            // InternalCompras.g:1370:4: (otherlv_6= RULE_ID )
            // InternalCompras.g:1371:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_6, grammarAccess.getRelationsAccess().getTargetLayer2DataAccessLayerCrossReference_6_0());
            				

            }


            }

            // InternalCompras.g:1382:3: ( (otherlv_7= RULE_ID ) )
            // InternalCompras.g:1383:4: (otherlv_7= RULE_ID )
            {
            // InternalCompras.g:1383:4: (otherlv_7= RULE_ID )
            // InternalCompras.g:1384:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_7, grammarAccess.getRelationsAccess().getSourceLayer3DataAccessLayerCrossReference_7_0());
            				

            }


            }

            // InternalCompras.g:1395:3: ( (lv_relationsType3_8_0= ruleRelationsType ) )
            // InternalCompras.g:1396:4: (lv_relationsType3_8_0= ruleRelationsType )
            {
            // InternalCompras.g:1396:4: (lv_relationsType3_8_0= ruleRelationsType )
            // InternalCompras.g:1397:5: lv_relationsType3_8_0= ruleRelationsType
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

            // InternalCompras.g:1414:3: ( (otherlv_9= RULE_ID ) )
            // InternalCompras.g:1415:4: (otherlv_9= RULE_ID )
            {
            // InternalCompras.g:1415:4: (otherlv_9= RULE_ID )
            // InternalCompras.g:1416:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_9, grammarAccess.getRelationsAccess().getTargetLayer3CommonLayerCrossReference_9_0());
            				

            }


            }

            // InternalCompras.g:1427:3: ( (otherlv_10= RULE_ID ) )
            // InternalCompras.g:1428:4: (otherlv_10= RULE_ID )
            {
            // InternalCompras.g:1428:4: (otherlv_10= RULE_ID )
            // InternalCompras.g:1429:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_10, grammarAccess.getRelationsAccess().getSourceLayer4PresentationLayerCrossReference_10_0());
            				

            }


            }

            // InternalCompras.g:1440:3: ( (lv_relationsType4_11_0= ruleRelationsType ) )
            // InternalCompras.g:1441:4: (lv_relationsType4_11_0= ruleRelationsType )
            {
            // InternalCompras.g:1441:4: (lv_relationsType4_11_0= ruleRelationsType )
            // InternalCompras.g:1442:5: lv_relationsType4_11_0= ruleRelationsType
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

            // InternalCompras.g:1459:3: ( (otherlv_12= RULE_ID ) )
            // InternalCompras.g:1460:4: (otherlv_12= RULE_ID )
            {
            // InternalCompras.g:1460:4: (otherlv_12= RULE_ID )
            // InternalCompras.g:1461:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_12, grammarAccess.getRelationsAccess().getTargetLayer4CommonLayerCrossReference_12_0());
            				

            }


            }

            // InternalCompras.g:1472:3: ( (otherlv_13= RULE_ID ) )
            // InternalCompras.g:1473:4: (otherlv_13= RULE_ID )
            {
            // InternalCompras.g:1473:4: (otherlv_13= RULE_ID )
            // InternalCompras.g:1474:5: otherlv_13= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationsRule());
            					}
            				
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_13, grammarAccess.getRelationsAccess().getSourceLayer5BusinessLayerCrossReference_13_0());
            				

            }


            }

            // InternalCompras.g:1485:3: ( (lv_relationsType5_14_0= ruleRelationsType ) )
            // InternalCompras.g:1486:4: (lv_relationsType5_14_0= ruleRelationsType )
            {
            // InternalCompras.g:1486:4: (lv_relationsType5_14_0= ruleRelationsType )
            // InternalCompras.g:1487:5: lv_relationsType5_14_0= ruleRelationsType
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

            // InternalCompras.g:1504:3: ( (otherlv_15= RULE_ID ) )
            // InternalCompras.g:1505:4: (otherlv_15= RULE_ID )
            {
            // InternalCompras.g:1505:4: (otherlv_15= RULE_ID )
            // InternalCompras.g:1506:5: otherlv_15= RULE_ID
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
    // InternalCompras.g:1525:1: entryRuleTechnology returns [EObject current=null] : iv_ruleTechnology= ruleTechnology EOF ;
    public final EObject entryRuleTechnology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnology = null;


        try {
            // InternalCompras.g:1525:51: (iv_ruleTechnology= ruleTechnology EOF )
            // InternalCompras.g:1526:2: iv_ruleTechnology= ruleTechnology EOF
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
    // InternalCompras.g:1532:1: ruleTechnology returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'AspNet' otherlv_2= ':' otherlv_3= '{' ( (lv_moduleTech_4_0= ruleModuleTech ) )* otherlv_5= '}' )? (otherlv_6= 'Database' otherlv_7= ':' otherlv_8= '{' ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )? otherlv_19= '}' )? otherlv_20= '}' ) ;
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
        EObject lv_moduleTech_4_0 = null;

        Enumerator lv_databaseRDBMSType_14_0 = null;

        AntlrDatatypeRuleToken lv_connectionString_17_0 = null;



        	enterRule();

        try {
            // InternalCompras.g:1538:2: ( (otherlv_0= '{' (otherlv_1= 'AspNet' otherlv_2= ':' otherlv_3= '{' ( (lv_moduleTech_4_0= ruleModuleTech ) )* otherlv_5= '}' )? (otherlv_6= 'Database' otherlv_7= ':' otherlv_8= '{' ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )? otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalCompras.g:1539:2: (otherlv_0= '{' (otherlv_1= 'AspNet' otherlv_2= ':' otherlv_3= '{' ( (lv_moduleTech_4_0= ruleModuleTech ) )* otherlv_5= '}' )? (otherlv_6= 'Database' otherlv_7= ':' otherlv_8= '{' ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )? otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalCompras.g:1539:2: (otherlv_0= '{' (otherlv_1= 'AspNet' otherlv_2= ':' otherlv_3= '{' ( (lv_moduleTech_4_0= ruleModuleTech ) )* otherlv_5= '}' )? (otherlv_6= 'Database' otherlv_7= ':' otherlv_8= '{' ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )? otherlv_19= '}' )? otherlv_20= '}' )
            // InternalCompras.g:1540:3: otherlv_0= '{' (otherlv_1= 'AspNet' otherlv_2= ':' otherlv_3= '{' ( (lv_moduleTech_4_0= ruleModuleTech ) )* otherlv_5= '}' )? (otherlv_6= 'Database' otherlv_7= ':' otherlv_8= '{' ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )? otherlv_19= '}' )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalCompras.g:1544:3: (otherlv_1= 'AspNet' otherlv_2= ':' otherlv_3= '{' ( (lv_moduleTech_4_0= ruleModuleTech ) )* otherlv_5= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCompras.g:1545:4: otherlv_1= 'AspNet' otherlv_2= ':' otherlv_3= '{' ( (lv_moduleTech_4_0= ruleModuleTech ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getTechnologyAccess().getAspNetKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getTechnologyAccess().getColonKeyword_1_1());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_1_2());
                    			
                    // InternalCompras.g:1557:4: ( (lv_moduleTech_4_0= ruleModuleTech ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalCompras.g:1558:5: (lv_moduleTech_4_0= ruleModuleTech )
                    	    {
                    	    // InternalCompras.g:1558:5: (lv_moduleTech_4_0= ruleModuleTech )
                    	    // InternalCompras.g:1559:6: lv_moduleTech_4_0= ruleModuleTech
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
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_34); 

                    				newLeafNode(otherlv_5, grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalCompras.g:1581:3: (otherlv_6= 'Database' otherlv_7= ':' otherlv_8= '{' ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )? otherlv_19= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCompras.g:1582:4: otherlv_6= 'Database' otherlv_7= ':' otherlv_8= '{' ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )? otherlv_19= '}'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTechnologyAccess().getDatabaseKeyword_2_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getTechnologyAccess().getColonKeyword_2_1());
                    			
                    otherlv_8=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_2_2());
                    			
                    // InternalCompras.g:1594:4: ( ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalCompras.g:1595:5: ( ( ruleFQN ) ) otherlv_10= ':' otherlv_11= '{' (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )? (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )? otherlv_18= '}'
                            {
                            // InternalCompras.g:1595:5: ( ( ruleFQN ) )
                            // InternalCompras.g:1596:6: ( ruleFQN )
                            {
                            // InternalCompras.g:1596:6: ( ruleFQN )
                            // InternalCompras.g:1597:7: ruleFQN
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
                            				
                            otherlv_11=(Token)match(input,13,FOLLOW_35); 

                            					newLeafNode(otherlv_11, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_2_3_2());
                            				
                            // InternalCompras.g:1619:5: (otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) ) )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==35) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalCompras.g:1620:6: otherlv_12= 'DatabaseRDBMSType' otherlv_13= ':' ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) )
                                    {
                                    otherlv_12=(Token)match(input,35,FOLLOW_3); 

                                    						newLeafNode(otherlv_12, grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeKeyword_2_3_3_0());
                                    					
                                    otherlv_13=(Token)match(input,12,FOLLOW_36); 

                                    						newLeafNode(otherlv_13, grammarAccess.getTechnologyAccess().getColonKeyword_2_3_3_1());
                                    					
                                    // InternalCompras.g:1628:6: ( (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType ) )
                                    // InternalCompras.g:1629:7: (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType )
                                    {
                                    // InternalCompras.g:1629:7: (lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType )
                                    // InternalCompras.g:1630:8: lv_databaseRDBMSType_14_0= ruleDatabaseRDBMSType
                                    {

                                    								newCompositeNode(grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeDatabaseRDBMSTypeEnumRuleCall_2_3_3_2_0());
                                    							
                                    pushFollow(FOLLOW_37);
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

                            // InternalCompras.g:1648:5: (otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) ) )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==36) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // InternalCompras.g:1649:6: otherlv_15= 'ConnectionString' otherlv_16= ':' ( (lv_connectionString_17_0= ruleConnectionString ) )
                                    {
                                    otherlv_15=(Token)match(input,36,FOLLOW_3); 

                                    						newLeafNode(otherlv_15, grammarAccess.getTechnologyAccess().getConnectionStringKeyword_2_3_4_0());
                                    					
                                    otherlv_16=(Token)match(input,12,FOLLOW_38); 

                                    						newLeafNode(otherlv_16, grammarAccess.getTechnologyAccess().getColonKeyword_2_3_4_1());
                                    					
                                    // InternalCompras.g:1657:6: ( (lv_connectionString_17_0= ruleConnectionString ) )
                                    // InternalCompras.g:1658:7: (lv_connectionString_17_0= ruleConnectionString )
                                    {
                                    // InternalCompras.g:1658:7: (lv_connectionString_17_0= ruleConnectionString )
                                    // InternalCompras.g:1659:8: lv_connectionString_17_0= ruleConnectionString
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

                            otherlv_18=(Token)match(input,17,FOLLOW_12); 

                            					newLeafNode(otherlv_18, grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_2_3_5());
                            				

                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_19, grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalCompras.g:1695:1: entryRuleModuleTech returns [EObject current=null] : iv_ruleModuleTech= ruleModuleTech EOF ;
    public final EObject entryRuleModuleTech() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleTech = null;


        try {
            // InternalCompras.g:1695:51: (iv_ruleModuleTech= ruleModuleTech EOF )
            // InternalCompras.g:1696:2: iv_ruleModuleTech= ruleModuleTech EOF
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
    // InternalCompras.g:1702:1: ruleModuleTech returns [EObject current=null] : (otherlv_0= 'Module' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' otherlv_7= '{' ( ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}' )? ( ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}' )? ( ( ( ruleFQN ) ) otherlv_19= ':' otherlv_20= '{' ( (lv_scriptRef_21_0= ruleScriptRef ) )* otherlv_22= '}' )? otherlv_23= '}' ( (otherlv_24= RULE_ID ) ) otherlv_25= ':' otherlv_26= '{' ( (lv_businessLayerRef_27_0= ruleBusinessLayerRef ) )* otherlv_28= '}' ( (otherlv_29= RULE_ID ) ) otherlv_30= ':' otherlv_31= '{' ( (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef ) )* otherlv_33= '}' ( (otherlv_34= RULE_ID ) ) otherlv_35= ':' otherlv_36= '{' ( (lv_commonLayerRef_37_0= ruleCommonLayerRef ) )* otherlv_38= '}' otherlv_39= '}' ) ;
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
            // InternalCompras.g:1708:2: ( (otherlv_0= 'Module' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' otherlv_7= '{' ( ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}' )? ( ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}' )? ( ( ( ruleFQN ) ) otherlv_19= ':' otherlv_20= '{' ( (lv_scriptRef_21_0= ruleScriptRef ) )* otherlv_22= '}' )? otherlv_23= '}' ( (otherlv_24= RULE_ID ) ) otherlv_25= ':' otherlv_26= '{' ( (lv_businessLayerRef_27_0= ruleBusinessLayerRef ) )* otherlv_28= '}' ( (otherlv_29= RULE_ID ) ) otherlv_30= ':' otherlv_31= '{' ( (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef ) )* otherlv_33= '}' ( (otherlv_34= RULE_ID ) ) otherlv_35= ':' otherlv_36= '{' ( (lv_commonLayerRef_37_0= ruleCommonLayerRef ) )* otherlv_38= '}' otherlv_39= '}' ) )
            // InternalCompras.g:1709:2: (otherlv_0= 'Module' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' otherlv_7= '{' ( ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}' )? ( ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}' )? ( ( ( ruleFQN ) ) otherlv_19= ':' otherlv_20= '{' ( (lv_scriptRef_21_0= ruleScriptRef ) )* otherlv_22= '}' )? otherlv_23= '}' ( (otherlv_24= RULE_ID ) ) otherlv_25= ':' otherlv_26= '{' ( (lv_businessLayerRef_27_0= ruleBusinessLayerRef ) )* otherlv_28= '}' ( (otherlv_29= RULE_ID ) ) otherlv_30= ':' otherlv_31= '{' ( (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef ) )* otherlv_33= '}' ( (otherlv_34= RULE_ID ) ) otherlv_35= ':' otherlv_36= '{' ( (lv_commonLayerRef_37_0= ruleCommonLayerRef ) )* otherlv_38= '}' otherlv_39= '}' )
            {
            // InternalCompras.g:1709:2: (otherlv_0= 'Module' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' otherlv_7= '{' ( ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}' )? ( ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}' )? ( ( ( ruleFQN ) ) otherlv_19= ':' otherlv_20= '{' ( (lv_scriptRef_21_0= ruleScriptRef ) )* otherlv_22= '}' )? otherlv_23= '}' ( (otherlv_24= RULE_ID ) ) otherlv_25= ':' otherlv_26= '{' ( (lv_businessLayerRef_27_0= ruleBusinessLayerRef ) )* otherlv_28= '}' ( (otherlv_29= RULE_ID ) ) otherlv_30= ':' otherlv_31= '{' ( (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef ) )* otherlv_33= '}' ( (otherlv_34= RULE_ID ) ) otherlv_35= ':' otherlv_36= '{' ( (lv_commonLayerRef_37_0= ruleCommonLayerRef ) )* otherlv_38= '}' otherlv_39= '}' )
            // InternalCompras.g:1710:3: otherlv_0= 'Module' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' otherlv_7= '{' ( ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}' )? ( ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}' )? ( ( ( ruleFQN ) ) otherlv_19= ':' otherlv_20= '{' ( (lv_scriptRef_21_0= ruleScriptRef ) )* otherlv_22= '}' )? otherlv_23= '}' ( (otherlv_24= RULE_ID ) ) otherlv_25= ':' otherlv_26= '{' ( (lv_businessLayerRef_27_0= ruleBusinessLayerRef ) )* otherlv_28= '}' ( (otherlv_29= RULE_ID ) ) otherlv_30= ':' otherlv_31= '{' ( (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef ) )* otherlv_33= '}' ( (otherlv_34= RULE_ID ) ) otherlv_35= ':' otherlv_36= '{' ( (lv_commonLayerRef_37_0= ruleCommonLayerRef ) )* otherlv_38= '}' otherlv_39= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleTechAccess().getModuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModuleTechAccess().getColonKeyword_1());
            		
            // InternalCompras.g:1718:3: ( (otherlv_2= RULE_ID ) )
            // InternalCompras.g:1719:4: (otherlv_2= RULE_ID )
            {
            // InternalCompras.g:1719:4: (otherlv_2= RULE_ID )
            // InternalCompras.g:1720:5: otherlv_2= RULE_ID
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
            		
            // InternalCompras.g:1739:3: ( (otherlv_5= RULE_ID ) )
            // InternalCompras.g:1740:4: (otherlv_5= RULE_ID )
            {
            // InternalCompras.g:1740:4: (otherlv_5= RULE_ID )
            // InternalCompras.g:1741:5: otherlv_5= RULE_ID
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
            		
            // InternalCompras.g:1760:3: ( ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}' )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalCompras.g:1761:4: ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}'
                    {
                    // InternalCompras.g:1761:4: ( ( ruleFQN ) )
                    // InternalCompras.g:1762:5: ( ruleFQN )
                    {
                    // InternalCompras.g:1762:5: ( ruleFQN )
                    // InternalCompras.g:1763:6: ruleFQN
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
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_39); 

                    				newLeafNode(otherlv_10, grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_8_2());
                    			
                    // InternalCompras.g:1785:4: ( (lv_controllersRef_11_0= ruleControllersRef ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==37) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalCompras.g:1786:5: (lv_controllersRef_11_0= ruleControllersRef )
                    	    {
                    	    // InternalCompras.g:1786:5: (lv_controllersRef_11_0= ruleControllersRef )
                    	    // InternalCompras.g:1787:6: lv_controllersRef_11_0= ruleControllersRef
                    	    {

                    	    						newCompositeNode(grammarAccess.getModuleTechAccess().getControllersRefControllersRefParserRuleCall_8_3_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
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
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCompras.g:1809:3: ( ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}' )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalCompras.g:1810:4: ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}'
                    {
                    // InternalCompras.g:1810:4: ( ( ruleFQN ) )
                    // InternalCompras.g:1811:5: ( ruleFQN )
                    {
                    // InternalCompras.g:1811:5: ( ruleFQN )
                    // InternalCompras.g:1812:6: ruleFQN
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
                    			
                    otherlv_15=(Token)match(input,13,FOLLOW_40); 

                    				newLeafNode(otherlv_15, grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_9_2());
                    			
                    // InternalCompras.g:1834:4: ( (lv_viewsRef_16_0= ruleViewsRef ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==38) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalCompras.g:1835:5: (lv_viewsRef_16_0= ruleViewsRef )
                    	    {
                    	    // InternalCompras.g:1835:5: (lv_viewsRef_16_0= ruleViewsRef )
                    	    // InternalCompras.g:1836:6: lv_viewsRef_16_0= ruleViewsRef
                    	    {

                    	    						newCompositeNode(grammarAccess.getModuleTechAccess().getViewsRefViewsRefParserRuleCall_9_3_0());
                    	    					
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalCompras.g:1858:3: ( ( ( ruleFQN ) ) otherlv_19= ':' otherlv_20= '{' ( (lv_scriptRef_21_0= ruleScriptRef ) )* otherlv_22= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCompras.g:1859:4: ( ( ruleFQN ) ) otherlv_19= ':' otherlv_20= '{' ( (lv_scriptRef_21_0= ruleScriptRef ) )* otherlv_22= '}'
                    {
                    // InternalCompras.g:1859:4: ( ( ruleFQN ) )
                    // InternalCompras.g:1860:5: ( ruleFQN )
                    {
                    // InternalCompras.g:1860:5: ( ruleFQN )
                    // InternalCompras.g:1861:6: ruleFQN
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
                    			
                    otherlv_20=(Token)match(input,13,FOLLOW_41); 

                    				newLeafNode(otherlv_20, grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_10_2());
                    			
                    // InternalCompras.g:1883:4: ( (lv_scriptRef_21_0= ruleScriptRef ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==39) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalCompras.g:1884:5: (lv_scriptRef_21_0= ruleScriptRef )
                    	    {
                    	    // InternalCompras.g:1884:5: (lv_scriptRef_21_0= ruleScriptRef )
                    	    // InternalCompras.g:1885:6: lv_scriptRef_21_0= ruleScriptRef
                    	    {

                    	    						newCompositeNode(grammarAccess.getModuleTechAccess().getScriptRefScriptRefParserRuleCall_10_3_0());
                    	    					
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_22, grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_23, grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalCompras.g:1911:3: ( (otherlv_24= RULE_ID ) )
            // InternalCompras.g:1912:4: (otherlv_24= RULE_ID )
            {
            // InternalCompras.g:1912:4: (otherlv_24= RULE_ID )
            // InternalCompras.g:1913:5: otherlv_24= RULE_ID
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
            		
            otherlv_26=(Token)match(input,13,FOLLOW_42); 

            			newLeafNode(otherlv_26, grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalCompras.g:1932:3: ( (lv_businessLayerRef_27_0= ruleBusinessLayerRef ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCompras.g:1933:4: (lv_businessLayerRef_27_0= ruleBusinessLayerRef )
            	    {
            	    // InternalCompras.g:1933:4: (lv_businessLayerRef_27_0= ruleBusinessLayerRef )
            	    // InternalCompras.g:1934:5: lv_businessLayerRef_27_0= ruleBusinessLayerRef
            	    {

            	    					newCompositeNode(grammarAccess.getModuleTechAccess().getBusinessLayerRefBusinessLayerRefParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_42);
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
            	    break loop23;
                }
            } while (true);

            otherlv_28=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_28, grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_16());
            		
            // InternalCompras.g:1955:3: ( (otherlv_29= RULE_ID ) )
            // InternalCompras.g:1956:4: (otherlv_29= RULE_ID )
            {
            // InternalCompras.g:1956:4: (otherlv_29= RULE_ID )
            // InternalCompras.g:1957:5: otherlv_29= RULE_ID
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
            		
            otherlv_31=(Token)match(input,13,FOLLOW_43); 

            			newLeafNode(otherlv_31, grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_19());
            		
            // InternalCompras.g:1976:3: ( (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==41) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCompras.g:1977:4: (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef )
            	    {
            	    // InternalCompras.g:1977:4: (lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef )
            	    // InternalCompras.g:1978:5: lv_dataAccessLayerRef_32_0= ruleDataAccessLayerRef
            	    {

            	    					newCompositeNode(grammarAccess.getModuleTechAccess().getDataAccessLayerRefDataAccessLayerRefParserRuleCall_20_0());
            	    				
            	    pushFollow(FOLLOW_43);
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
            	    break loop24;
                }
            } while (true);

            otherlv_33=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_33, grammarAccess.getModuleTechAccess().getRightCurlyBracketKeyword_21());
            		
            // InternalCompras.g:1999:3: ( (otherlv_34= RULE_ID ) )
            // InternalCompras.g:2000:4: (otherlv_34= RULE_ID )
            {
            // InternalCompras.g:2000:4: (otherlv_34= RULE_ID )
            // InternalCompras.g:2001:5: otherlv_34= RULE_ID
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
            		
            otherlv_36=(Token)match(input,13,FOLLOW_44); 

            			newLeafNode(otherlv_36, grammarAccess.getModuleTechAccess().getLeftCurlyBracketKeyword_24());
            		
            // InternalCompras.g:2020:3: ( (lv_commonLayerRef_37_0= ruleCommonLayerRef ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCompras.g:2021:4: (lv_commonLayerRef_37_0= ruleCommonLayerRef )
            	    {
            	    // InternalCompras.g:2021:4: (lv_commonLayerRef_37_0= ruleCommonLayerRef )
            	    // InternalCompras.g:2022:5: lv_commonLayerRef_37_0= ruleCommonLayerRef
            	    {

            	    					newCompositeNode(grammarAccess.getModuleTechAccess().getCommonLayerRefCommonLayerRefParserRuleCall_25_0());
            	    				
            	    pushFollow(FOLLOW_44);
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
            	    break loop25;
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
    // InternalCompras.g:2051:1: entryRuleControllersRef returns [EObject current=null] : iv_ruleControllersRef= ruleControllersRef EOF ;
    public final EObject entryRuleControllersRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControllersRef = null;


        try {
            // InternalCompras.g:2051:55: (iv_ruleControllersRef= ruleControllersRef EOF )
            // InternalCompras.g:2052:2: iv_ruleControllersRef= ruleControllersRef EOF
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
    // InternalCompras.g:2058:1: ruleControllersRef returns [EObject current=null] : (otherlv_0= 'Controller' otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleControllersRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCompras.g:2064:2: ( (otherlv_0= 'Controller' otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalCompras.g:2065:2: (otherlv_0= 'Controller' otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalCompras.g:2065:2: (otherlv_0= 'Controller' otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalCompras.g:2066:3: otherlv_0= 'Controller' otherlv_1= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControllersRefAccess().getControllerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getControllersRefAccess().getColonKeyword_1());
            		
            // InternalCompras.g:2074:3: ( ( ruleFQN ) )
            // InternalCompras.g:2075:4: ( ruleFQN )
            {
            // InternalCompras.g:2075:4: ( ruleFQN )
            // InternalCompras.g:2076:5: ruleFQN
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
    // InternalCompras.g:2094:1: entryRuleViewsRef returns [EObject current=null] : iv_ruleViewsRef= ruleViewsRef EOF ;
    public final EObject entryRuleViewsRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewsRef = null;


        try {
            // InternalCompras.g:2094:49: (iv_ruleViewsRef= ruleViewsRef EOF )
            // InternalCompras.g:2095:2: iv_ruleViewsRef= ruleViewsRef EOF
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
    // InternalCompras.g:2101:1: ruleViewsRef returns [EObject current=null] : (otherlv_0= 'View' otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleViewsRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCompras.g:2107:2: ( (otherlv_0= 'View' otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalCompras.g:2108:2: (otherlv_0= 'View' otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalCompras.g:2108:2: (otherlv_0= 'View' otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalCompras.g:2109:3: otherlv_0= 'View' otherlv_1= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getViewsRefAccess().getViewKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getViewsRefAccess().getColonKeyword_1());
            		
            // InternalCompras.g:2117:3: ( ( ruleFQN ) )
            // InternalCompras.g:2118:4: ( ruleFQN )
            {
            // InternalCompras.g:2118:4: ( ruleFQN )
            // InternalCompras.g:2119:5: ruleFQN
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
    // InternalCompras.g:2137:1: entryRuleScriptRef returns [EObject current=null] : iv_ruleScriptRef= ruleScriptRef EOF ;
    public final EObject entryRuleScriptRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptRef = null;


        try {
            // InternalCompras.g:2137:50: (iv_ruleScriptRef= ruleScriptRef EOF )
            // InternalCompras.g:2138:2: iv_ruleScriptRef= ruleScriptRef EOF
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
    // InternalCompras.g:2144:1: ruleScriptRef returns [EObject current=null] : (otherlv_0= 'Script' otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleScriptRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCompras.g:2150:2: ( (otherlv_0= 'Script' otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalCompras.g:2151:2: (otherlv_0= 'Script' otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalCompras.g:2151:2: (otherlv_0= 'Script' otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalCompras.g:2152:3: otherlv_0= 'Script' otherlv_1= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScriptRefAccess().getScriptKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScriptRefAccess().getColonKeyword_1());
            		
            // InternalCompras.g:2160:3: ( ( ruleFQN ) )
            // InternalCompras.g:2161:4: ( ruleFQN )
            {
            // InternalCompras.g:2161:4: ( ruleFQN )
            // InternalCompras.g:2162:5: ruleFQN
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
    // InternalCompras.g:2180:1: entryRuleBusinessLayerRef returns [EObject current=null] : iv_ruleBusinessLayerRef= ruleBusinessLayerRef EOF ;
    public final EObject entryRuleBusinessLayerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessLayerRef = null;


        try {
            // InternalCompras.g:2180:57: (iv_ruleBusinessLayerRef= ruleBusinessLayerRef EOF )
            // InternalCompras.g:2181:2: iv_ruleBusinessLayerRef= ruleBusinessLayerRef EOF
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
    // InternalCompras.g:2187:1: ruleBusinessLayerRef returns [EObject current=null] : (otherlv_0= 'BLogic' otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleBusinessLayerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCompras.g:2193:2: ( (otherlv_0= 'BLogic' otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalCompras.g:2194:2: (otherlv_0= 'BLogic' otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalCompras.g:2194:2: (otherlv_0= 'BLogic' otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalCompras.g:2195:3: otherlv_0= 'BLogic' otherlv_1= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessLayerRefAccess().getBLogicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBusinessLayerRefAccess().getColonKeyword_1());
            		
            // InternalCompras.g:2203:3: ( ( ruleFQN ) )
            // InternalCompras.g:2204:4: ( ruleFQN )
            {
            // InternalCompras.g:2204:4: ( ruleFQN )
            // InternalCompras.g:2205:5: ruleFQN
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
    // InternalCompras.g:2223:1: entryRuleDataAccessLayerRef returns [EObject current=null] : iv_ruleDataAccessLayerRef= ruleDataAccessLayerRef EOF ;
    public final EObject entryRuleDataAccessLayerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAccessLayerRef = null;


        try {
            // InternalCompras.g:2223:59: (iv_ruleDataAccessLayerRef= ruleDataAccessLayerRef EOF )
            // InternalCompras.g:2224:2: iv_ruleDataAccessLayerRef= ruleDataAccessLayerRef EOF
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
    // InternalCompras.g:2230:1: ruleDataAccessLayerRef returns [EObject current=null] : (otherlv_0= 'DataAccess' otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleDataAccessLayerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCompras.g:2236:2: ( (otherlv_0= 'DataAccess' otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalCompras.g:2237:2: (otherlv_0= 'DataAccess' otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalCompras.g:2237:2: (otherlv_0= 'DataAccess' otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalCompras.g:2238:3: otherlv_0= 'DataAccess' otherlv_1= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataAccessLayerRefAccess().getDataAccessKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccessLayerRefAccess().getColonKeyword_1());
            		
            // InternalCompras.g:2246:3: ( ( ruleFQN ) )
            // InternalCompras.g:2247:4: ( ruleFQN )
            {
            // InternalCompras.g:2247:4: ( ruleFQN )
            // InternalCompras.g:2248:5: ruleFQN
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
    // InternalCompras.g:2266:1: entryRuleCommonLayerRef returns [EObject current=null] : iv_ruleCommonLayerRef= ruleCommonLayerRef EOF ;
    public final EObject entryRuleCommonLayerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLayerRef = null;


        try {
            // InternalCompras.g:2266:55: (iv_ruleCommonLayerRef= ruleCommonLayerRef EOF )
            // InternalCompras.g:2267:2: iv_ruleCommonLayerRef= ruleCommonLayerRef EOF
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
    // InternalCompras.g:2273:1: ruleCommonLayerRef returns [EObject current=null] : (otherlv_0= 'DtoModel' otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleCommonLayerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCompras.g:2279:2: ( (otherlv_0= 'DtoModel' otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalCompras.g:2280:2: (otherlv_0= 'DtoModel' otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalCompras.g:2280:2: (otherlv_0= 'DtoModel' otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalCompras.g:2281:3: otherlv_0= 'DtoModel' otherlv_1= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommonLayerRefAccess().getDtoModelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCommonLayerRefAccess().getColonKeyword_1());
            		
            // InternalCompras.g:2289:3: ( ( ruleFQN ) )
            // InternalCompras.g:2290:4: ( ruleFQN )
            {
            // InternalCompras.g:2290:4: ( ruleFQN )
            // InternalCompras.g:2291:5: ruleFQN
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
    // InternalCompras.g:2309:1: entryRuleConnectionString returns [String current=null] : iv_ruleConnectionString= ruleConnectionString EOF ;
    public final String entryRuleConnectionString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConnectionString = null;


        try {
            // InternalCompras.g:2309:56: (iv_ruleConnectionString= ruleConnectionString EOF )
            // InternalCompras.g:2310:2: iv_ruleConnectionString= ruleConnectionString EOF
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
    // InternalCompras.g:2316:1: ruleConnectionString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleConnectionString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalCompras.g:2322:2: (this_STRING_0= RULE_STRING )
            // InternalCompras.g:2323:2: this_STRING_0= RULE_STRING
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


    // $ANTLR start "ruleCommonFieldType"
    // InternalCompras.g:2333:1: ruleCommonFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'float' ) ) ;
    public final Enumerator ruleCommonFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCompras.g:2339:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'float' ) ) )
            // InternalCompras.g:2340:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'float' ) )
            {
            // InternalCompras.g:2340:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'bool' ) | (enumLiteral_3= 'float' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt26=1;
                }
                break;
            case 44:
                {
                alt26=2;
                }
                break;
            case 45:
                {
                alt26=3;
                }
                break;
            case 46:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalCompras.g:2341:3: (enumLiteral_0= 'string' )
                    {
                    // InternalCompras.g:2341:3: (enumLiteral_0= 'string' )
                    // InternalCompras.g:2342:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getCommonFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCommonFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:2349:3: (enumLiteral_1= 'int' )
                    {
                    // InternalCompras.g:2349:3: (enumLiteral_1= 'int' )
                    // InternalCompras.g:2350:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getCommonFieldTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCommonFieldTypeAccess().getINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:2357:3: (enumLiteral_2= 'bool' )
                    {
                    // InternalCompras.g:2357:3: (enumLiteral_2= 'bool' )
                    // InternalCompras.g:2358:4: enumLiteral_2= 'bool'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getCommonFieldTypeAccess().getBOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCommonFieldTypeAccess().getBOOLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCompras.g:2365:3: (enumLiteral_3= 'float' )
                    {
                    // InternalCompras.g:2365:3: (enumLiteral_3= 'float' )
                    // InternalCompras.g:2366:4: enumLiteral_3= 'float'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getCommonFieldTypeAccess().getFLOATEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCommonFieldTypeAccess().getFLOATEnumLiteralDeclaration_3());
                    			

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


    // $ANTLR start "ruleFunctionalityFieldType"
    // InternalCompras.g:2376:1: ruleFunctionalityFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'CREATE' ) | (enumLiteral_1= 'VIEW_GRID' ) | (enumLiteral_2= 'VIEW_DROPDOWN' ) | (enumLiteral_3= 'EDIT' ) | (enumLiteral_4= 'DELETE' ) ) ;
    public final Enumerator ruleFunctionalityFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalCompras.g:2382:2: ( ( (enumLiteral_0= 'CREATE' ) | (enumLiteral_1= 'VIEW_GRID' ) | (enumLiteral_2= 'VIEW_DROPDOWN' ) | (enumLiteral_3= 'EDIT' ) | (enumLiteral_4= 'DELETE' ) ) )
            // InternalCompras.g:2383:2: ( (enumLiteral_0= 'CREATE' ) | (enumLiteral_1= 'VIEW_GRID' ) | (enumLiteral_2= 'VIEW_DROPDOWN' ) | (enumLiteral_3= 'EDIT' ) | (enumLiteral_4= 'DELETE' ) )
            {
            // InternalCompras.g:2383:2: ( (enumLiteral_0= 'CREATE' ) | (enumLiteral_1= 'VIEW_GRID' ) | (enumLiteral_2= 'VIEW_DROPDOWN' ) | (enumLiteral_3= 'EDIT' ) | (enumLiteral_4= 'DELETE' ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt27=1;
                }
                break;
            case 48:
                {
                alt27=2;
                }
                break;
            case 49:
                {
                alt27=3;
                }
                break;
            case 50:
                {
                alt27=4;
                }
                break;
            case 51:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalCompras.g:2384:3: (enumLiteral_0= 'CREATE' )
                    {
                    // InternalCompras.g:2384:3: (enumLiteral_0= 'CREATE' )
                    // InternalCompras.g:2385:4: enumLiteral_0= 'CREATE'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getFunctionalityFieldTypeAccess().getCREATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFunctionalityFieldTypeAccess().getCREATEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:2392:3: (enumLiteral_1= 'VIEW_GRID' )
                    {
                    // InternalCompras.g:2392:3: (enumLiteral_1= 'VIEW_GRID' )
                    // InternalCompras.g:2393:4: enumLiteral_1= 'VIEW_GRID'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getFunctionalityFieldTypeAccess().getVIEW_GRIDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFunctionalityFieldTypeAccess().getVIEW_GRIDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:2400:3: (enumLiteral_2= 'VIEW_DROPDOWN' )
                    {
                    // InternalCompras.g:2400:3: (enumLiteral_2= 'VIEW_DROPDOWN' )
                    // InternalCompras.g:2401:4: enumLiteral_2= 'VIEW_DROPDOWN'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getFunctionalityFieldTypeAccess().getVIEW_DROPDOWNEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFunctionalityFieldTypeAccess().getVIEW_DROPDOWNEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCompras.g:2408:3: (enumLiteral_3= 'EDIT' )
                    {
                    // InternalCompras.g:2408:3: (enumLiteral_3= 'EDIT' )
                    // InternalCompras.g:2409:4: enumLiteral_3= 'EDIT'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getFunctionalityFieldTypeAccess().getEDITEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFunctionalityFieldTypeAccess().getEDITEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCompras.g:2416:3: (enumLiteral_4= 'DELETE' )
                    {
                    // InternalCompras.g:2416:3: (enumLiteral_4= 'DELETE' )
                    // InternalCompras.g:2417:4: enumLiteral_4= 'DELETE'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getFunctionalityFieldTypeAccess().getDELETEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFunctionalityFieldTypeAccess().getDELETEEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleFunctionalityFieldType"


    // $ANTLR start "ruleRelationsType"
    // InternalCompras.g:2427:1: ruleRelationsType returns [Enumerator current=null] : (enumLiteral_0= 'AllowedToUse' ) ;
    public final Enumerator ruleRelationsType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalCompras.g:2433:2: ( (enumLiteral_0= 'AllowedToUse' ) )
            // InternalCompras.g:2434:2: (enumLiteral_0= 'AllowedToUse' )
            {
            // InternalCompras.g:2434:2: (enumLiteral_0= 'AllowedToUse' )
            // InternalCompras.g:2435:3: enumLiteral_0= 'AllowedToUse'
            {
            enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

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
    // InternalCompras.g:2444:1: ruleDatabaseRDBMSType returns [Enumerator current=null] : ( (enumLiteral_0= 'SQLSERVER' ) | (enumLiteral_1= 'ORACLE (future...)' ) | (enumLiteral_2= 'POSTGRES (future...)' ) ) ;
    public final Enumerator ruleDatabaseRDBMSType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCompras.g:2450:2: ( ( (enumLiteral_0= 'SQLSERVER' ) | (enumLiteral_1= 'ORACLE (future...)' ) | (enumLiteral_2= 'POSTGRES (future...)' ) ) )
            // InternalCompras.g:2451:2: ( (enumLiteral_0= 'SQLSERVER' ) | (enumLiteral_1= 'ORACLE (future...)' ) | (enumLiteral_2= 'POSTGRES (future...)' ) )
            {
            // InternalCompras.g:2451:2: ( (enumLiteral_0= 'SQLSERVER' ) | (enumLiteral_1= 'ORACLE (future...)' ) | (enumLiteral_2= 'POSTGRES (future...)' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt28=1;
                }
                break;
            case 54:
                {
                alt28=2;
                }
                break;
            case 55:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalCompras.g:2452:3: (enumLiteral_0= 'SQLSERVER' )
                    {
                    // InternalCompras.g:2452:3: (enumLiteral_0= 'SQLSERVER' )
                    // InternalCompras.g:2453:4: enumLiteral_0= 'SQLSERVER'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseRDBMSTypeAccess().getSQLSERVEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatabaseRDBMSTypeAccess().getSQLSERVEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCompras.g:2460:3: (enumLiteral_1= 'ORACLE (future...)' )
                    {
                    // InternalCompras.g:2460:3: (enumLiteral_1= 'ORACLE (future...)' )
                    // InternalCompras.g:2461:4: enumLiteral_1= 'ORACLE (future...)'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseRDBMSTypeAccess().getORACLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatabaseRDBMSTypeAccess().getORACLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCompras.g:2468:3: (enumLiteral_2= 'POSTGRES (future...)' )
                    {
                    // InternalCompras.g:2468:3: (enumLiteral_2= 'POSTGRES (future...)' )
                    // InternalCompras.g:2469:4: enumLiteral_2= 'POSTGRES (future...)'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

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


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\4\1\14\1\uffff\1\4\1\15\1\14\1\21\1\uffff";
    static final String dfa_3s = "\1\21\1\22\1\uffff\1\4\1\15\1\22\1\47\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\4\uffff\1\1";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\14\uffff\1\2",
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

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1760:3: ( ( ( ruleFQN ) ) otherlv_9= ':' otherlv_10= '{' ( (lv_controllersRef_11_0= ruleControllersRef ) )* otherlv_12= '}' )?";
        }
    }
    static final String[] dfa_7s = {
            "\1\1\14\uffff\1\2",
            "\1\4\5\uffff\1\3",
            "",
            "\1\5",
            "\1\6",
            "\1\4\5\uffff\1\3",
            "\1\7\24\uffff\1\7\1\2",
            ""
    };
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

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
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1809:3: ( ( ( ruleFQN ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_viewsRef_16_0= ruleViewsRef ) )* otherlv_17= '}' )?";
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
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000780000020010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000F800000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000600020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001800020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000020000L});

}