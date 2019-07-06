package org.xtext.example.compras.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComprasLexer extends Lexer {
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

    public InternalComprasLexer() {;} 
    public InternalComprasLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalComprasLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCompras.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:11:7: ( 'SolutionName' )
            // InternalCompras.g:11:9: 'SolutionName'
            {
            match("SolutionName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:12:7: ( ':' )
            // InternalCompras.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:13:7: ( '{' )
            // InternalCompras.g:13:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:14:7: ( 'Domain' )
            // InternalCompras.g:14:9: 'Domain'
            {
            match("Domain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:15:7: ( 'Architecture' )
            // InternalCompras.g:15:9: 'Architecture'
            {
            match("Architecture"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:16:7: ( 'Technology' )
            // InternalCompras.g:16:9: 'Technology'
            {
            match("Technology"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:17:7: ( '}' )
            // InternalCompras.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:18:7: ( '.' )
            // InternalCompras.g:18:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:19:7: ( 'Module' )
            // InternalCompras.g:19:9: 'Module'
            {
            match("Module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:20:7: ( 'Entities' )
            // InternalCompras.g:20:9: 'Entities'
            {
            match("Entities"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:21:7: ( 'Functionalities' )
            // InternalCompras.g:21:9: 'Functionalities'
            {
            match("Functionalities"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:22:7: ( '[' )
            // InternalCompras.g:22:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:23:7: ( 'label' )
            // InternalCompras.g:23:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:24:7: ( ']' )
            // InternalCompras.g:24:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:25:7: ( 'required' )
            // InternalCompras.g:25:9: 'required'
            {
            match("required"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:26:7: ( 'RelEntity' )
            // InternalCompras.g:26:9: 'RelEntity'
            {
            match("RelEntity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:27:7: ( 'CREATE' )
            // InternalCompras.g:27:9: 'CREATE'
            {
            match("CREATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:28:7: ( 'VIEW_GRID' )
            // InternalCompras.g:28:9: 'VIEW_GRID'
            {
            match("VIEW_GRID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:29:7: ( 'VIEW_DROPDOWN' )
            // InternalCompras.g:29:9: 'VIEW_DROPDOWN'
            {
            match("VIEW_DROPDOWN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:30:7: ( 'EDIT' )
            // InternalCompras.g:30:9: 'EDIT'
            {
            match("EDIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:31:7: ( 'DELETE' )
            // InternalCompras.g:31:9: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:32:7: ( 'Layers' )
            // InternalCompras.g:32:9: 'Layers'
            {
            match("Layers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:33:7: ( 'PresentationLayer' )
            // InternalCompras.g:33:9: 'PresentationLayer'
            {
            match("PresentationLayer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:34:7: ( 'BusinessLayer' )
            // InternalCompras.g:34:9: 'BusinessLayer'
            {
            match("BusinessLayer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:35:7: ( 'DataAccessLayer' )
            // InternalCompras.g:35:9: 'DataAccessLayer'
            {
            match("DataAccessLayer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:36:7: ( 'CommonLayer' )
            // InternalCompras.g:36:9: 'CommonLayer'
            {
            match("CommonLayer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:37:7: ( 'Relations' )
            // InternalCompras.g:37:9: 'Relations'
            {
            match("Relations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:38:7: ( 'ControllerSegmentLayer' )
            // InternalCompras.g:38:9: 'ControllerSegmentLayer'
            {
            match("ControllerSegmentLayer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:39:7: ( 'ViewSegmentLayer' )
            // InternalCompras.g:39:9: 'ViewSegmentLayer'
            {
            match("ViewSegmentLayer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:40:7: ( 'ScriptSegmentLayer' )
            // InternalCompras.g:40:9: 'ScriptSegmentLayer'
            {
            match("ScriptSegmentLayer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:41:7: ( 'DbConnectorSegmentLayer' )
            // InternalCompras.g:41:9: 'DbConnectorSegmentLayer'
            {
            match("DbConnectorSegmentLayer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:42:7: ( 'AspNet' )
            // InternalCompras.g:42:9: 'AspNet'
            {
            match("AspNet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:43:7: ( 'Database' )
            // InternalCompras.g:43:9: 'Database'
            {
            match("Database"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:44:7: ( 'DatabaseRDBMSType' )
            // InternalCompras.g:44:9: 'DatabaseRDBMSType'
            {
            match("DatabaseRDBMSType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:45:7: ( 'ConnectionString' )
            // InternalCompras.g:45:9: 'ConnectionString'
            {
            match("ConnectionString"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:46:7: ( 'DataFileSeed' )
            // InternalCompras.g:46:9: 'DataFileSeed'
            {
            match("DataFileSeed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:47:7: ( 'Controller' )
            // InternalCompras.g:47:9: 'Controller'
            {
            match("Controller"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:48:7: ( 'View' )
            // InternalCompras.g:48:9: 'View'
            {
            match("View"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:49:7: ( 'Script' )
            // InternalCompras.g:49:9: 'Script'
            {
            match("Script"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:50:7: ( 'BLogic' )
            // InternalCompras.g:50:9: 'BLogic'
            {
            match("BLogic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:51:7: ( 'DataAccess' )
            // InternalCompras.g:51:9: 'DataAccess'
            {
            match("DataAccess"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:52:7: ( 'DtoModel' )
            // InternalCompras.g:52:9: 'DtoModel'
            {
            match("DtoModel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:53:7: ( 'string' )
            // InternalCompras.g:53:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:54:7: ( 'int' )
            // InternalCompras.g:54:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:55:7: ( 'bool' )
            // InternalCompras.g:55:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:56:7: ( 'float' )
            // InternalCompras.g:56:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:57:7: ( 'datetime' )
            // InternalCompras.g:57:9: 'datetime'
            {
            match("datetime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:58:7: ( 'AllowedToUse' )
            // InternalCompras.g:58:9: 'AllowedToUse'
            {
            match("AllowedToUse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:59:7: ( 'SQLSERVER' )
            // InternalCompras.g:59:9: 'SQLSERVER'
            {
            match("SQLSERVER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:60:7: ( 'ORACLE (future...)' )
            // InternalCompras.g:60:9: 'ORACLE (future...)'
            {
            match("ORACLE (future...)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:61:7: ( 'POSTGRES (future...)' )
            // InternalCompras.g:61:9: 'POSTGRES (future...)'
            {
            match("POSTGRES (future...)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:2840:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCompras.g:2840:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCompras.g:2840:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCompras.g:2840:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCompras.g:2840:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCompras.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:2842:10: ( ( '0' .. '9' )+ )
            // InternalCompras.g:2842:12: ( '0' .. '9' )+
            {
            // InternalCompras.g:2842:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCompras.g:2842:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:2844:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCompras.g:2844:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCompras.g:2844:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCompras.g:2844:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCompras.g:2844:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCompras.g:2844:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCompras.g:2844:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCompras.g:2844:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCompras.g:2844:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCompras.g:2844:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCompras.g:2844:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:2846:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCompras.g:2846:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCompras.g:2846:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCompras.g:2846:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:2848:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCompras.g:2848:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCompras.g:2848:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCompras.g:2848:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalCompras.g:2848:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCompras.g:2848:41: ( '\\r' )? '\\n'
                    {
                    // InternalCompras.g:2848:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCompras.g:2848:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:2850:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCompras.g:2850:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCompras.g:2850:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCompras.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCompras.g:2852:16: ( . )
            // InternalCompras.g:2852:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCompras.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=58;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalCompras.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalCompras.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalCompras.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalCompras.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalCompras.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalCompras.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalCompras.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalCompras.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalCompras.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalCompras.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalCompras.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalCompras.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalCompras.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalCompras.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalCompras.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalCompras.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalCompras.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalCompras.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalCompras.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalCompras.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalCompras.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalCompras.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalCompras.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalCompras.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalCompras.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalCompras.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalCompras.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalCompras.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalCompras.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalCompras.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalCompras.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalCompras.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalCompras.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalCompras.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalCompras.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalCompras.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalCompras.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalCompras.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalCompras.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalCompras.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalCompras.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalCompras.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalCompras.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalCompras.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalCompras.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalCompras.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalCompras.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalCompras.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalCompras.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalCompras.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalCompras.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalCompras.g:1:316: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 53 :
                // InternalCompras.g:1:324: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 54 :
                // InternalCompras.g:1:333: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 55 :
                // InternalCompras.g:1:345: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 56 :
                // InternalCompras.g:1:361: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 57 :
                // InternalCompras.g:1:377: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 58 :
                // InternalCompras.g:1:385: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\47\2\uffff\3\47\2\uffff\3\47\1\uffff\1\47\1\uffff\15\47\1\43\2\uffff\3\43\2\uffff\3\47\3\uffff\11\47\2\uffff\4\47\1\uffff\1\47\1\uffff\21\47\5\uffff\36\47\1\u0095\22\47\1\u00aa\12\47\1\u00b6\6\47\1\uffff\1\u00bd\23\47\1\uffff\1\47\1\u00d2\11\47\1\uffff\6\47\1\uffff\1\u00e3\3\47\1\u00e8\1\47\1\u00ea\1\u00eb\6\47\1\u00f2\2\47\1\u00f5\2\47\1\uffff\3\47\1\u00fb\6\47\1\u0102\3\47\1\u0106\1\u0107\1\uffff\4\47\1\uffff\1\47\2\uffff\6\47\1\uffff\2\47\1\uffff\5\47\1\uffff\6\47\1\uffff\3\47\2\uffff\1\47\1\uffff\4\47\1\u0129\2\47\1\u012c\3\47\1\u0130\1\47\1\u0132\13\47\1\u013e\2\47\1\u0141\2\47\1\uffff\2\47\1\uffff\3\47\1\uffff\1\47\1\uffff\1\u014a\1\u014b\3\47\1\u014f\3\47\1\uffff\1\47\1\uffff\2\47\1\uffff\1\u0157\5\47\1\u015d\1\47\2\uffff\1\47\1\u0161\1\47\1\uffff\7\47\1\uffff\5\47\1\uffff\1\47\1\u0170\1\47\1\uffff\5\47\1\u0177\3\47\1\u017b\1\47\1\u017d\1\u017e\1\47\1\uffff\6\47\1\uffff\3\47\1\uffff\1\47\2\uffff\3\47\1\u018d\2\47\1\u0190\7\47\1\uffff\2\47\1\uffff\1\47\1\u019b\2\47\1\u019e\5\47\1\uffff\2\47\1\uffff\1\47\1\u01a7\1\u01a8\2\47\1\u01ab\2\47\2\uffff\1\u01ae\1\u01af\1\uffff\2\47\2\uffff\7\47\1\u01b9\1\u01ba\2\uffff";
    static final String DFA12_eofS =
        "\u01bb\uffff";
    static final String DFA12_minS =
        "\1\0\1\121\2\uffff\1\105\1\154\1\145\2\uffff\1\157\1\104\1\165\1\uffff\1\141\1\uffff\2\145\1\122\1\111\1\141\1\117\1\114\1\164\1\156\1\157\1\154\1\141\1\122\1\101\2\uffff\2\0\1\52\2\uffff\1\154\1\162\1\114\3\uffff\1\155\1\114\1\164\1\103\1\157\1\143\1\160\1\154\1\143\2\uffff\1\144\1\164\1\111\1\156\1\uffff\1\142\1\uffff\1\161\1\154\1\105\1\155\1\105\1\145\1\171\1\145\1\123\1\163\1\157\1\162\1\164\2\157\1\164\1\101\5\uffff\1\165\1\151\1\123\1\141\1\105\1\141\1\157\1\115\1\150\1\116\1\157\1\150\1\165\1\151\1\124\1\143\1\145\1\165\1\105\1\101\1\155\1\156\1\127\1\167\1\145\1\163\1\124\1\151\1\147\1\151\1\60\1\154\1\141\1\145\1\103\1\164\1\160\1\105\1\151\1\124\1\101\1\156\1\157\1\151\1\145\1\167\1\156\1\154\1\164\1\60\1\164\1\154\1\151\1\156\1\164\1\124\1\157\1\162\1\145\1\137\1\60\1\162\1\145\1\107\1\156\1\151\1\156\1\uffff\1\60\2\164\1\114\1\151\1\164\1\122\1\156\1\105\1\143\1\141\1\151\1\156\1\144\2\164\1\145\1\157\1\145\1\151\1\uffff\1\151\1\60\1\162\1\164\1\151\1\105\1\156\1\157\1\143\1\104\1\145\1\uffff\1\163\1\156\1\122\1\145\1\143\1\147\1\uffff\1\60\1\151\1\105\1\157\1\60\1\126\2\60\1\143\1\163\1\154\3\145\1\60\1\144\1\154\1\60\1\145\1\157\1\uffff\1\145\1\151\1\157\1\60\1\114\1\154\1\164\2\122\1\147\1\60\1\164\1\105\1\163\2\60\1\uffff\1\155\1\40\1\156\1\145\1\uffff\1\105\2\uffff\3\145\1\143\1\154\1\143\1\uffff\1\124\1\157\1\uffff\1\163\1\156\1\144\1\164\1\156\1\uffff\1\141\1\154\1\151\1\111\1\117\1\155\1\uffff\1\141\1\123\1\163\2\uffff\1\145\1\uffff\1\116\1\147\1\122\1\163\1\60\1\123\1\164\1\60\1\164\1\157\1\147\1\60\1\141\1\60\1\171\1\163\1\171\1\145\1\157\1\104\1\120\1\145\1\164\1\40\1\114\1\60\1\141\1\155\1\60\1\163\1\104\1\uffff\1\145\1\157\1\uffff\1\165\1\125\1\171\1\uffff\1\154\1\uffff\2\60\1\145\1\162\1\156\1\60\1\104\1\156\1\151\1\uffff\1\141\1\uffff\1\155\1\145\1\uffff\1\60\1\102\1\145\2\162\1\163\1\60\1\151\2\uffff\1\162\1\60\1\123\1\uffff\1\117\1\164\1\157\1\171\1\145\1\156\1\141\1\uffff\1\115\1\144\1\123\2\145\1\uffff\1\164\1\60\1\145\1\uffff\1\164\1\127\1\114\1\156\1\145\1\60\1\164\1\171\1\123\1\60\1\145\2\60\1\151\1\uffff\1\147\1\162\1\116\1\141\1\114\1\162\1\uffff\1\114\1\145\1\124\1\uffff\1\147\2\uffff\1\145\1\155\1\151\1\60\1\171\1\141\1\60\1\141\1\162\1\171\1\155\1\163\1\145\1\156\1\uffff\1\145\1\171\1\uffff\1\171\1\60\1\160\1\145\1\60\1\156\1\147\1\162\2\145\1\uffff\1\145\1\156\1\uffff\1\164\2\60\2\162\1\60\1\164\1\114\2\uffff\2\60\1\uffff\1\114\1\141\2\uffff\1\141\2\171\2\145\2\162\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\2\uffff\1\164\1\163\1\145\2\uffff\1\157\1\156\1\165\1\uffff\1\141\1\uffff\2\145\1\157\1\151\1\141\1\162\1\165\1\164\1\156\1\157\1\154\1\141\1\122\1\172\2\uffff\2\uffff\1\57\2\uffff\1\154\1\162\1\114\3\uffff\1\155\1\114\1\164\1\103\1\157\1\143\1\160\1\154\1\143\2\uffff\1\144\1\164\1\111\1\156\1\uffff\1\142\1\uffff\1\161\1\154\1\105\1\156\1\105\1\145\1\171\1\145\1\123\1\163\1\157\1\162\1\164\2\157\1\164\1\101\5\uffff\1\165\1\151\1\123\1\141\1\105\1\141\1\157\1\115\1\150\1\116\1\157\1\150\1\165\1\151\1\124\1\143\1\145\1\165\1\141\1\101\1\155\1\164\1\127\1\167\1\145\1\163\1\124\1\151\1\147\1\151\1\172\1\154\1\141\1\145\1\103\1\164\1\160\1\105\1\151\1\124\1\142\1\156\1\157\1\151\1\145\1\167\1\156\1\154\1\164\1\172\1\164\1\154\1\151\1\156\1\164\1\124\1\157\1\162\1\145\1\137\1\172\1\162\1\145\1\107\1\156\1\151\1\156\1\uffff\1\172\2\164\1\114\1\151\1\164\1\122\1\156\1\105\1\143\1\141\1\151\1\156\1\144\2\164\1\145\1\157\1\145\1\151\1\uffff\1\151\1\172\1\162\1\164\1\151\1\105\1\156\1\157\1\143\1\107\1\145\1\uffff\1\163\1\156\1\122\1\145\1\143\1\147\1\uffff\1\172\1\151\1\105\1\157\1\172\1\126\2\172\1\143\1\163\1\154\3\145\1\172\1\144\1\154\1\172\1\145\1\157\1\uffff\1\145\1\151\1\157\1\172\1\114\1\154\1\164\2\122\1\147\1\172\1\164\1\105\1\163\2\172\1\uffff\1\155\1\40\1\156\1\145\1\uffff\1\105\2\uffff\3\145\1\143\1\154\1\143\1\uffff\1\124\1\157\1\uffff\1\163\1\156\1\144\1\164\1\156\1\uffff\1\141\1\154\1\151\1\111\1\117\1\155\1\uffff\1\141\1\123\1\163\2\uffff\1\145\1\uffff\1\116\1\147\1\122\1\163\1\172\1\123\1\164\1\172\1\164\1\157\1\147\1\172\1\141\1\172\1\171\1\163\1\171\1\145\1\157\1\104\1\120\1\145\1\164\1\40\1\114\1\172\1\141\1\155\1\172\1\163\1\104\1\uffff\1\145\1\157\1\uffff\1\165\1\125\1\171\1\uffff\1\154\1\uffff\2\172\1\145\1\162\1\156\1\172\1\104\1\156\1\151\1\uffff\1\141\1\uffff\1\155\1\145\1\uffff\1\172\1\102\1\145\2\162\1\163\1\172\1\151\2\uffff\1\162\1\172\1\123\1\uffff\1\117\1\164\1\157\1\171\1\145\1\156\1\141\1\uffff\1\115\1\144\1\123\2\145\1\uffff\1\164\1\172\1\145\1\uffff\1\164\1\127\1\114\1\156\1\145\1\172\1\164\1\171\1\123\1\172\1\145\2\172\1\151\1\uffff\1\147\1\162\1\116\1\141\1\114\1\162\1\uffff\1\114\1\145\1\124\1\uffff\1\147\2\uffff\1\145\1\155\1\151\1\172\1\171\1\141\1\172\1\141\1\162\1\171\1\155\1\163\1\145\1\156\1\uffff\1\145\1\171\1\uffff\1\171\1\172\1\160\1\145\1\172\1\156\1\147\1\162\2\145\1\uffff\1\145\1\156\1\uffff\1\164\2\172\2\162\1\172\1\164\1\114\2\uffff\2\172\1\uffff\1\114\1\141\2\uffff\1\141\2\171\2\145\2\162\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\3\uffff\1\7\1\10\3\uffff\1\14\1\uffff\1\16\16\uffff\1\64\1\65\3\uffff\1\71\1\72\3\uffff\1\64\1\2\1\3\11\uffff\1\7\1\10\4\uffff\1\14\1\uffff\1\16\21\uffff\1\65\1\66\1\67\1\70\1\71\103\uffff\1\54\24\uffff\1\24\13\uffff\1\46\6\uffff\1\55\24\uffff\1\15\20\uffff\1\56\4\uffff\1\47\1\uffff\1\4\1\25\6\uffff\1\40\2\uffff\1\11\5\uffff\1\21\6\uffff\1\26\3\uffff\1\50\1\53\1\uffff\1\62\37\uffff\1\41\2\uffff\1\52\3\uffff\1\12\1\uffff\1\17\11\uffff\1\63\1\uffff\1\57\2\uffff\1\61\10\uffff\1\20\1\33\3\uffff\1\22\7\uffff\1\51\5\uffff\1\6\3\uffff\1\45\16\uffff\1\32\6\uffff\1\1\3\uffff\1\44\1\uffff\1\5\1\60\16\uffff\1\23\2\uffff\1\30\12\uffff\1\31\2\uffff\1\13\10\uffff\1\43\1\35\2\uffff\1\42\2\uffff\1\27\1\36\11\uffff\1\34\1\37";
    static final String DFA12_specialS =
        "\1\2\36\uffff\1\0\1\1\u019a\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\37\4\43\1\40\6\43\1\10\1\41\12\36\1\2\6\43\1\5\1\25\1\21\1\4\1\12\1\13\5\35\1\23\1\11\1\35\1\33\1\24\1\35\1\20\1\1\1\6\1\35\1\22\4\35\1\14\1\43\1\16\1\34\1\35\1\43\1\35\1\30\1\35\1\32\1\35\1\31\2\35\1\27\2\35\1\15\5\35\1\17\1\26\7\35\1\3\1\43\1\7\uff82\43",
            "\1\46\21\uffff\1\45\13\uffff\1\44",
            "",
            "",
            "\1\53\33\uffff\1\54\1\55\14\uffff\1\52\4\uffff\1\56",
            "\1\61\5\uffff\1\57\1\60",
            "\1\62",
            "",
            "",
            "\1\65",
            "\1\67\51\uffff\1\66",
            "\1\70",
            "",
            "\1\72",
            "",
            "\1\74",
            "\1\75",
            "\1\76\34\uffff\1\77",
            "\1\100\37\uffff\1\101",
            "\1\102",
            "\1\104\42\uffff\1\103",
            "\1\106\50\uffff\1\105",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\0\116",
            "\0\116",
            "\1\117\4\uffff\1\120",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "",
            "",
            "",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087\33\uffff\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008c\5\uffff\1\u008b",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f\4\uffff\1\u00a1\33\uffff\1\u00a0",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\47\7\uffff\22\47\1\u00b5\7\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00db\2\uffff\1\u00da",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\47\7\uffff\22\47\1\u00e7\7\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00e9",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00f3",
            "\1\u00f4",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "",
            "\1\u010c",
            "",
            "",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "",
            "",
            "\1\u0123",
            "",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\12\47\7\uffff\21\47\1\u0128\10\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u012a",
            "\1\u012b",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0131",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u013f",
            "\1\u0140",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "\1\u0149",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "\1\u0153",
            "",
            "\1\u0154",
            "\1\u0155",
            "",
            "\12\47\7\uffff\13\47\1\u0156\16\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u015e",
            "",
            "",
            "\1\u015f",
            "\12\47\7\uffff\22\47\1\u0160\7\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0162",
            "",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "",
            "\1\u016f",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0171",
            "",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u017c",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u017f",
            "",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
            "\1\u0189",
            "",
            "",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u018e",
            "\1\u018f",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "",
            "\1\u0198",
            "\1\u0199",
            "",
            "\1\u019a",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u019c",
            "\1\u019d",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "",
            "\1\u01a4",
            "\1\u01a5",
            "",
            "\1\u01a6",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01a9",
            "\1\u01aa",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01ac",
            "\1\u01ad",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u01b0",
            "\1\u01b1",
            "",
            "",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 78;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_32 = input.LA(1);

                        s = -1;
                        if ( ((LA12_32>='\u0000' && LA12_32<='\uFFFF')) ) {s = 78;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='S') ) {s = 1;}

                        else if ( (LA12_0==':') ) {s = 2;}

                        else if ( (LA12_0=='{') ) {s = 3;}

                        else if ( (LA12_0=='D') ) {s = 4;}

                        else if ( (LA12_0=='A') ) {s = 5;}

                        else if ( (LA12_0=='T') ) {s = 6;}

                        else if ( (LA12_0=='}') ) {s = 7;}

                        else if ( (LA12_0=='.') ) {s = 8;}

                        else if ( (LA12_0=='M') ) {s = 9;}

                        else if ( (LA12_0=='E') ) {s = 10;}

                        else if ( (LA12_0=='F') ) {s = 11;}

                        else if ( (LA12_0=='[') ) {s = 12;}

                        else if ( (LA12_0=='l') ) {s = 13;}

                        else if ( (LA12_0==']') ) {s = 14;}

                        else if ( (LA12_0=='r') ) {s = 15;}

                        else if ( (LA12_0=='R') ) {s = 16;}

                        else if ( (LA12_0=='C') ) {s = 17;}

                        else if ( (LA12_0=='V') ) {s = 18;}

                        else if ( (LA12_0=='L') ) {s = 19;}

                        else if ( (LA12_0=='P') ) {s = 20;}

                        else if ( (LA12_0=='B') ) {s = 21;}

                        else if ( (LA12_0=='s') ) {s = 22;}

                        else if ( (LA12_0=='i') ) {s = 23;}

                        else if ( (LA12_0=='b') ) {s = 24;}

                        else if ( (LA12_0=='f') ) {s = 25;}

                        else if ( (LA12_0=='d') ) {s = 26;}

                        else if ( (LA12_0=='O') ) {s = 27;}

                        else if ( (LA12_0=='^') ) {s = 28;}

                        else if ( ((LA12_0>='G' && LA12_0<='K')||LA12_0=='N'||LA12_0=='Q'||LA12_0=='U'||(LA12_0>='W' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||LA12_0=='c'||LA12_0=='e'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='m' && LA12_0<='q')||(LA12_0>='t' && LA12_0<='z')) ) {s = 29;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 30;}

                        else if ( (LA12_0=='\"') ) {s = 31;}

                        else if ( (LA12_0=='\'') ) {s = 32;}

                        else if ( (LA12_0=='/') ) {s = 33;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 34;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='-')||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}