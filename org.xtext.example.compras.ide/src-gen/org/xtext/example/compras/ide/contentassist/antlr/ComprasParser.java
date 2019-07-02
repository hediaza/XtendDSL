/*
 * generated by Xtext 2.18.0
 */
package org.xtext.example.compras.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.compras.ide.contentassist.antlr.internal.InternalComprasParser;
import org.xtext.example.compras.services.ComprasGrammarAccess;

public class ComprasParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ComprasGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ComprasGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEntityTypeAccess().getAlternatives(), "rule__EntityType__Alternatives");
			builder.put(grammarAccess.getFunctionalityActionTypeAccess().getAlternatives(), "rule__FunctionalityActionType__Alternatives");
			builder.put(grammarAccess.getCommonFieldTypeAccess().getAlternatives(), "rule__CommonFieldType__Alternatives");
			builder.put(grammarAccess.getDatabaseRDBMSTypeAccess().getAlternatives(), "rule__DatabaseRDBMSType__Alternatives");
			builder.put(grammarAccess.getSolutionAccess().getGroup(), "rule__Solution__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getDomainAccess().getGroup(), "rule__Domain__Group__0");
			builder.put(grammarAccess.getModuleAccess().getGroup(), "rule__Module__Group__0");
			builder.put(grammarAccess.getModuleAccess().getGroup_10(), "rule__Module__Group_10__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getEntityFieldAccess().getGroup(), "rule__EntityField__Group__0");
			builder.put(grammarAccess.getEntityFieldLabelAccess().getGroup(), "rule__EntityFieldLabel__Group__0");
			builder.put(grammarAccess.getEntityFieldRequiredAccess().getGroup(), "rule__EntityFieldRequired__Group__0");
			builder.put(grammarAccess.getFunctionalityAccess().getGroup(), "rule__Functionality__Group__0");
			builder.put(grammarAccess.getArchitectureAccess().getGroup(), "rule__Architecture__Group__0");
			builder.put(grammarAccess.getPresentationLayerAccess().getGroup(), "rule__PresentationLayer__Group__0");
			builder.put(grammarAccess.getDataAccessLayerAccess().getGroup(), "rule__DataAccessLayer__Group__0");
			builder.put(grammarAccess.getRelationsAccess().getGroup(), "rule__Relations__Group__0");
			builder.put(grammarAccess.getTechnologyAccess().getGroup(), "rule__Technology__Group__0");
			builder.put(grammarAccess.getTechnologyAccess().getGroup_1(), "rule__Technology__Group_1__0");
			builder.put(grammarAccess.getTechnologyAccess().getGroup_2(), "rule__Technology__Group_2__0");
			builder.put(grammarAccess.getTechnologyAccess().getGroup_2_3(), "rule__Technology__Group_2_3__0");
			builder.put(grammarAccess.getTechnologyAccess().getGroup_2_3_3(), "rule__Technology__Group_2_3_3__0");
			builder.put(grammarAccess.getTechnologyAccess().getGroup_2_3_4(), "rule__Technology__Group_2_3_4__0");
			builder.put(grammarAccess.getModuleTechAccess().getGroup(), "rule__ModuleTech__Group__0");
			builder.put(grammarAccess.getModuleTechAccess().getGroup_8(), "rule__ModuleTech__Group_8__0");
			builder.put(grammarAccess.getModuleTechAccess().getGroup_9(), "rule__ModuleTech__Group_9__0");
			builder.put(grammarAccess.getModuleTechAccess().getGroup_10(), "rule__ModuleTech__Group_10__0");
			builder.put(grammarAccess.getControllersRefAccess().getGroup(), "rule__ControllersRef__Group__0");
			builder.put(grammarAccess.getViewsRefAccess().getGroup(), "rule__ViewsRef__Group__0");
			builder.put(grammarAccess.getScriptRefAccess().getGroup(), "rule__ScriptRef__Group__0");
			builder.put(grammarAccess.getBusinessLayerRefAccess().getGroup(), "rule__BusinessLayerRef__Group__0");
			builder.put(grammarAccess.getDataAccessLayerRefAccess().getGroup(), "rule__DataAccessLayerRef__Group__0");
			builder.put(grammarAccess.getCommonLayerRefAccess().getGroup(), "rule__CommonLayerRef__Group__0");
			builder.put(grammarAccess.getSolutionAccess().getNameAssignment_2(), "rule__Solution__NameAssignment_2");
			builder.put(grammarAccess.getSolutionAccess().getDomainAssignment_6(), "rule__Solution__DomainAssignment_6");
			builder.put(grammarAccess.getSolutionAccess().getArchitectureAssignment_9(), "rule__Solution__ArchitectureAssignment_9");
			builder.put(grammarAccess.getSolutionAccess().getTechnologyAssignment_12(), "rule__Solution__TechnologyAssignment_12");
			builder.put(grammarAccess.getDomainAccess().getModuleAssignment_1(), "rule__Domain__ModuleAssignment_1");
			builder.put(grammarAccess.getModuleAccess().getNameAssignment_2(), "rule__Module__NameAssignment_2");
			builder.put(grammarAccess.getModuleAccess().getEntityAssignment_8(), "rule__Module__EntityAssignment_8");
			builder.put(grammarAccess.getModuleAccess().getFunctionalityAssignment_10_3(), "rule__Module__FunctionalityAssignment_10_3");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_0(), "rule__Entity__NameAssignment_0");
			builder.put(grammarAccess.getEntityAccess().getEntityFieldAssignment_3(), "rule__Entity__EntityFieldAssignment_3");
			builder.put(grammarAccess.getEntityFieldAccess().getEntityFieldRequiredAssignment_0(), "rule__EntityField__EntityFieldRequiredAssignment_0");
			builder.put(grammarAccess.getEntityFieldAccess().getEntityFieldLabelAssignment_1(), "rule__EntityField__EntityFieldLabelAssignment_1");
			builder.put(grammarAccess.getEntityFieldAccess().getEntityTypeAssignment_2(), "rule__EntityField__EntityTypeAssignment_2");
			builder.put(grammarAccess.getEntityFieldAccess().getNameAssignment_3(), "rule__EntityField__NameAssignment_3");
			builder.put(grammarAccess.getEntityFieldLabelAccess().getNameAssignment_3(), "rule__EntityFieldLabel__NameAssignment_3");
			builder.put(grammarAccess.getEntityFieldRequiredAccess().getNameAssignment_1(), "rule__EntityFieldRequired__NameAssignment_1");
			builder.put(grammarAccess.getEntityTypeAccess().getEntityAssignment_0(), "rule__EntityType__EntityAssignment_0");
			builder.put(grammarAccess.getEntityTypeAccess().getCommonFieldTypeAssignment_1(), "rule__EntityType__CommonFieldTypeAssignment_1");
			builder.put(grammarAccess.getFunctionalityAccess().getNameAssignment_0(), "rule__Functionality__NameAssignment_0");
			builder.put(grammarAccess.getFunctionalityAccess().getEntityAssignment_2(), "rule__Functionality__EntityAssignment_2");
			builder.put(grammarAccess.getFunctionalityAccess().getFunctionalityActionTypeAssignment_5(), "rule__Functionality__FunctionalityActionTypeAssignment_5");
			builder.put(grammarAccess.getFuncCreateActionAccess().getNameAssignment(), "rule__FuncCreateAction__NameAssignment");
			builder.put(grammarAccess.getFuncViewGridActionAccess().getNameAssignment(), "rule__FuncViewGridAction__NameAssignment");
			builder.put(grammarAccess.getFuncViewDropDownActionAccess().getNameAssignment(), "rule__FuncViewDropDownAction__NameAssignment");
			builder.put(grammarAccess.getFuncEditActionAccess().getNameAssignment(), "rule__FuncEditAction__NameAssignment");
			builder.put(grammarAccess.getFuncDeleteActionAccess().getNameAssignment(), "rule__FuncDeleteAction__NameAssignment");
			builder.put(grammarAccess.getArchitectureAccess().getPresentationLayerAssignment_6(), "rule__Architecture__PresentationLayerAssignment_6");
			builder.put(grammarAccess.getArchitectureAccess().getBusinessLayerAssignment_9(), "rule__Architecture__BusinessLayerAssignment_9");
			builder.put(grammarAccess.getArchitectureAccess().getDataAccessLayerAssignment_12(), "rule__Architecture__DataAccessLayerAssignment_12");
			builder.put(grammarAccess.getArchitectureAccess().getCommonLayerAssignment_15(), "rule__Architecture__CommonLayerAssignment_15");
			builder.put(grammarAccess.getArchitectureAccess().getRelationsAssignment_19(), "rule__Architecture__RelationsAssignment_19");
			builder.put(grammarAccess.getPresentationLayerAccess().getNameAssignment_0(), "rule__PresentationLayer__NameAssignment_0");
			builder.put(grammarAccess.getPresentationLayerAccess().getControllerSegmentLayerAssignment_5(), "rule__PresentationLayer__ControllerSegmentLayerAssignment_5");
			builder.put(grammarAccess.getPresentationLayerAccess().getViewSegmentLayerAssignment_8(), "rule__PresentationLayer__ViewSegmentLayerAssignment_8");
			builder.put(grammarAccess.getPresentationLayerAccess().getScriptegmentLayerAssignment_11(), "rule__PresentationLayer__ScriptegmentLayerAssignment_11");
			builder.put(grammarAccess.getControllerSegmentLayerAccess().getNameAssignment(), "rule__ControllerSegmentLayer__NameAssignment");
			builder.put(grammarAccess.getViewSegmentLayerAccess().getNameAssignment(), "rule__ViewSegmentLayer__NameAssignment");
			builder.put(grammarAccess.getScriptSegmentLayerAccess().getNameAssignment(), "rule__ScriptSegmentLayer__NameAssignment");
			builder.put(grammarAccess.getBusinessLayerAccess().getNameAssignment(), "rule__BusinessLayer__NameAssignment");
			builder.put(grammarAccess.getDataAccessLayerAccess().getNameAssignment_0(), "rule__DataAccessLayer__NameAssignment_0");
			builder.put(grammarAccess.getDataAccessLayerAccess().getDbConnectorSegmentLayerAssignment_5(), "rule__DataAccessLayer__DbConnectorSegmentLayerAssignment_5");
			builder.put(grammarAccess.getDbConnectorSegmentLayerAccess().getNameAssignment(), "rule__DbConnectorSegmentLayer__NameAssignment");
			builder.put(grammarAccess.getCommonLayerAccess().getNameAssignment(), "rule__CommonLayer__NameAssignment");
			builder.put(grammarAccess.getRelationsAccess().getSourceLayer1Assignment_1(), "rule__Relations__SourceLayer1Assignment_1");
			builder.put(grammarAccess.getRelationsAccess().getRelationsType1Assignment_2(), "rule__Relations__RelationsType1Assignment_2");
			builder.put(grammarAccess.getRelationsAccess().getTargetLayer1Assignment_3(), "rule__Relations__TargetLayer1Assignment_3");
			builder.put(grammarAccess.getRelationsAccess().getSourceLayer2Assignment_4(), "rule__Relations__SourceLayer2Assignment_4");
			builder.put(grammarAccess.getRelationsAccess().getRelationsType2Assignment_5(), "rule__Relations__RelationsType2Assignment_5");
			builder.put(grammarAccess.getRelationsAccess().getTargetLayer2Assignment_6(), "rule__Relations__TargetLayer2Assignment_6");
			builder.put(grammarAccess.getRelationsAccess().getSourceLayer3Assignment_7(), "rule__Relations__SourceLayer3Assignment_7");
			builder.put(grammarAccess.getRelationsAccess().getRelationsType3Assignment_8(), "rule__Relations__RelationsType3Assignment_8");
			builder.put(grammarAccess.getRelationsAccess().getTargetLayer3Assignment_9(), "rule__Relations__TargetLayer3Assignment_9");
			builder.put(grammarAccess.getRelationsAccess().getSourceLayer4Assignment_10(), "rule__Relations__SourceLayer4Assignment_10");
			builder.put(grammarAccess.getRelationsAccess().getRelationsType4Assignment_11(), "rule__Relations__RelationsType4Assignment_11");
			builder.put(grammarAccess.getRelationsAccess().getTargetLayer4Assignment_12(), "rule__Relations__TargetLayer4Assignment_12");
			builder.put(grammarAccess.getRelationsAccess().getSourceLayer5Assignment_13(), "rule__Relations__SourceLayer5Assignment_13");
			builder.put(grammarAccess.getRelationsAccess().getRelationsType5Assignment_14(), "rule__Relations__RelationsType5Assignment_14");
			builder.put(grammarAccess.getRelationsAccess().getTargetLayer5Assignment_15(), "rule__Relations__TargetLayer5Assignment_15");
			builder.put(grammarAccess.getTechnologyAccess().getModuleTechAssignment_1_3(), "rule__Technology__ModuleTechAssignment_1_3");
			builder.put(grammarAccess.getTechnologyAccess().getDbConnectorSegmentLayerAssignment_2_3_0(), "rule__Technology__DbConnectorSegmentLayerAssignment_2_3_0");
			builder.put(grammarAccess.getTechnologyAccess().getDatabaseRDBMSTypeAssignment_2_3_3_2(), "rule__Technology__DatabaseRDBMSTypeAssignment_2_3_3_2");
			builder.put(grammarAccess.getTechnologyAccess().getConnectionStringAssignment_2_3_4_2(), "rule__Technology__ConnectionStringAssignment_2_3_4_2");
			builder.put(grammarAccess.getModuleTechAccess().getNameAssignment_2(), "rule__ModuleTech__NameAssignment_2");
			builder.put(grammarAccess.getModuleTechAccess().getPresentationLayerAssignment_5(), "rule__ModuleTech__PresentationLayerAssignment_5");
			builder.put(grammarAccess.getModuleTechAccess().getControllerSegmentLayerAssignment_8_0(), "rule__ModuleTech__ControllerSegmentLayerAssignment_8_0");
			builder.put(grammarAccess.getModuleTechAccess().getControllersRefAssignment_8_3(), "rule__ModuleTech__ControllersRefAssignment_8_3");
			builder.put(grammarAccess.getModuleTechAccess().getViewSegmentLayerAssignment_9_0(), "rule__ModuleTech__ViewSegmentLayerAssignment_9_0");
			builder.put(grammarAccess.getModuleTechAccess().getViewsRefAssignment_9_3(), "rule__ModuleTech__ViewsRefAssignment_9_3");
			builder.put(grammarAccess.getModuleTechAccess().getScriptSegmentLayerAssignment_10_0(), "rule__ModuleTech__ScriptSegmentLayerAssignment_10_0");
			builder.put(grammarAccess.getModuleTechAccess().getScriptRefAssignment_10_3(), "rule__ModuleTech__ScriptRefAssignment_10_3");
			builder.put(grammarAccess.getModuleTechAccess().getBusinessLayerAssignment_12(), "rule__ModuleTech__BusinessLayerAssignment_12");
			builder.put(grammarAccess.getModuleTechAccess().getBusinessLayerRefAssignment_15(), "rule__ModuleTech__BusinessLayerRefAssignment_15");
			builder.put(grammarAccess.getModuleTechAccess().getDataAccessLayerAssignment_17(), "rule__ModuleTech__DataAccessLayerAssignment_17");
			builder.put(grammarAccess.getModuleTechAccess().getDataAccessLayerRefAssignment_20(), "rule__ModuleTech__DataAccessLayerRefAssignment_20");
			builder.put(grammarAccess.getModuleTechAccess().getCommonLayerAssignment_22(), "rule__ModuleTech__CommonLayerAssignment_22");
			builder.put(grammarAccess.getModuleTechAccess().getCommonLayerRefAssignment_25(), "rule__ModuleTech__CommonLayerRefAssignment_25");
			builder.put(grammarAccess.getControllersRefAccess().getFunctionalityAssignment_2(), "rule__ControllersRef__FunctionalityAssignment_2");
			builder.put(grammarAccess.getViewsRefAccess().getFunctionalityAssignment_2(), "rule__ViewsRef__FunctionalityAssignment_2");
			builder.put(grammarAccess.getScriptRefAccess().getFunctionalityAssignment_2(), "rule__ScriptRef__FunctionalityAssignment_2");
			builder.put(grammarAccess.getBusinessLayerRefAccess().getFunctionalityAssignment_2(), "rule__BusinessLayerRef__FunctionalityAssignment_2");
			builder.put(grammarAccess.getDataAccessLayerRefAccess().getFunctionalityAssignment_2(), "rule__DataAccessLayerRef__FunctionalityAssignment_2");
			builder.put(grammarAccess.getCommonLayerRefAccess().getEntityAssignment_2(), "rule__CommonLayerRef__EntityAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ComprasGrammarAccess grammarAccess;

	@Override
	protected InternalComprasParser createParser() {
		InternalComprasParser result = new InternalComprasParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ComprasGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ComprasGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
