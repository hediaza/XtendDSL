/*
 * generated by Xtext 2.17.0
 */
package org.xtext.example.compras.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.compras.parser.antlr.internal.InternalComprasParser;
import org.xtext.example.compras.services.ComprasGrammarAccess;

public class ComprasParser extends AbstractAntlrParser {

	@Inject
	private ComprasGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalComprasParser createParser(XtextTokenStream stream) {
		return new InternalComprasParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Solution";
	}

	public ComprasGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ComprasGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}