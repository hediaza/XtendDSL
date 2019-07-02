/**
 * generated by Xtext 2.18.0
 */
package org.xtext.example.compras.compras.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.compras.compras.Architecture;
import org.xtext.example.compras.compras.BusinessLayer;
import org.xtext.example.compras.compras.BusinessLayerRef;
import org.xtext.example.compras.compras.CommonFieldType;
import org.xtext.example.compras.compras.CommonLayer;
import org.xtext.example.compras.compras.CommonLayerRef;
import org.xtext.example.compras.compras.ComprasFactory;
import org.xtext.example.compras.compras.ComprasPackage;
import org.xtext.example.compras.compras.ControllerSegmentLayer;
import org.xtext.example.compras.compras.ControllersRef;
import org.xtext.example.compras.compras.DataAccessLayer;
import org.xtext.example.compras.compras.DataAccessLayerRef;
import org.xtext.example.compras.compras.DatabaseRDBMSType;
import org.xtext.example.compras.compras.DbConnectorSegmentLayer;
import org.xtext.example.compras.compras.Domain;
import org.xtext.example.compras.compras.Entity;
import org.xtext.example.compras.compras.EntityField;
import org.xtext.example.compras.compras.EntityFieldLabel;
import org.xtext.example.compras.compras.EntityFieldRequired;
import org.xtext.example.compras.compras.EntityType;
import org.xtext.example.compras.compras.FuncCreateAction;
import org.xtext.example.compras.compras.FuncDeleteAction;
import org.xtext.example.compras.compras.FuncEditAction;
import org.xtext.example.compras.compras.FuncViewDropDownAction;
import org.xtext.example.compras.compras.FuncViewGridAction;
import org.xtext.example.compras.compras.Functionality;
import org.xtext.example.compras.compras.FunctionalityActionType;
import org.xtext.example.compras.compras.ModuleTech;
import org.xtext.example.compras.compras.PresentationLayer;
import org.xtext.example.compras.compras.Relations;
import org.xtext.example.compras.compras.RelationsType;
import org.xtext.example.compras.compras.ScriptRef;
import org.xtext.example.compras.compras.ScriptSegmentLayer;
import org.xtext.example.compras.compras.Solution;
import org.xtext.example.compras.compras.Technology;
import org.xtext.example.compras.compras.ViewSegmentLayer;
import org.xtext.example.compras.compras.ViewsRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComprasFactoryImpl extends EFactoryImpl implements ComprasFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ComprasFactory init()
  {
    try
    {
      ComprasFactory theComprasFactory = (ComprasFactory)EPackage.Registry.INSTANCE.getEFactory(ComprasPackage.eNS_URI);
      if (theComprasFactory != null)
      {
        return theComprasFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ComprasFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComprasFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ComprasPackage.SOLUTION: return createSolution();
      case ComprasPackage.DOMAIN: return createDomain();
      case ComprasPackage.MODULE: return createModule();
      case ComprasPackage.ENTITY: return createEntity();
      case ComprasPackage.ENTITY_FIELD: return createEntityField();
      case ComprasPackage.ENTITY_FIELD_LABEL: return createEntityFieldLabel();
      case ComprasPackage.ENTITY_FIELD_REQUIRED: return createEntityFieldRequired();
      case ComprasPackage.ENTITY_TYPE: return createEntityType();
      case ComprasPackage.FUNCTIONALITY: return createFunctionality();
      case ComprasPackage.FUNCTIONALITY_ACTION_TYPE: return createFunctionalityActionType();
      case ComprasPackage.FUNC_CREATE_ACTION: return createFuncCreateAction();
      case ComprasPackage.FUNC_VIEW_GRID_ACTION: return createFuncViewGridAction();
      case ComprasPackage.FUNC_VIEW_DROP_DOWN_ACTION: return createFuncViewDropDownAction();
      case ComprasPackage.FUNC_EDIT_ACTION: return createFuncEditAction();
      case ComprasPackage.FUNC_DELETE_ACTION: return createFuncDeleteAction();
      case ComprasPackage.ARCHITECTURE: return createArchitecture();
      case ComprasPackage.PRESENTATION_LAYER: return createPresentationLayer();
      case ComprasPackage.CONTROLLER_SEGMENT_LAYER: return createControllerSegmentLayer();
      case ComprasPackage.VIEW_SEGMENT_LAYER: return createViewSegmentLayer();
      case ComprasPackage.SCRIPT_SEGMENT_LAYER: return createScriptSegmentLayer();
      case ComprasPackage.BUSINESS_LAYER: return createBusinessLayer();
      case ComprasPackage.DATA_ACCESS_LAYER: return createDataAccessLayer();
      case ComprasPackage.DB_CONNECTOR_SEGMENT_LAYER: return createDbConnectorSegmentLayer();
      case ComprasPackage.COMMON_LAYER: return createCommonLayer();
      case ComprasPackage.RELATIONS: return createRelations();
      case ComprasPackage.TECHNOLOGY: return createTechnology();
      case ComprasPackage.MODULE_TECH: return createModuleTech();
      case ComprasPackage.CONTROLLERS_REF: return createControllersRef();
      case ComprasPackage.VIEWS_REF: return createViewsRef();
      case ComprasPackage.SCRIPT_REF: return createScriptRef();
      case ComprasPackage.BUSINESS_LAYER_REF: return createBusinessLayerRef();
      case ComprasPackage.DATA_ACCESS_LAYER_REF: return createDataAccessLayerRef();
      case ComprasPackage.COMMON_LAYER_REF: return createCommonLayerRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ComprasPackage.COMMON_FIELD_TYPE:
        return createCommonFieldTypeFromString(eDataType, initialValue);
      case ComprasPackage.RELATIONS_TYPE:
        return createRelationsTypeFromString(eDataType, initialValue);
      case ComprasPackage.DATABASE_RDBMS_TYPE:
        return createDatabaseRDBMSTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ComprasPackage.COMMON_FIELD_TYPE:
        return convertCommonFieldTypeToString(eDataType, instanceValue);
      case ComprasPackage.RELATIONS_TYPE:
        return convertRelationsTypeToString(eDataType, instanceValue);
      case ComprasPackage.DATABASE_RDBMS_TYPE:
        return convertDatabaseRDBMSTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Solution createSolution()
  {
    SolutionImpl solution = new SolutionImpl();
    return solution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Domain createDomain()
  {
    DomainImpl domain = new DomainImpl();
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.xtext.example.compras.compras.Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityField createEntityField()
  {
    EntityFieldImpl entityField = new EntityFieldImpl();
    return entityField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityFieldLabel createEntityFieldLabel()
  {
    EntityFieldLabelImpl entityFieldLabel = new EntityFieldLabelImpl();
    return entityFieldLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityFieldRequired createEntityFieldRequired()
  {
    EntityFieldRequiredImpl entityFieldRequired = new EntityFieldRequiredImpl();
    return entityFieldRequired;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityType createEntityType()
  {
    EntityTypeImpl entityType = new EntityTypeImpl();
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Functionality createFunctionality()
  {
    FunctionalityImpl functionality = new FunctionalityImpl();
    return functionality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionalityActionType createFunctionalityActionType()
  {
    FunctionalityActionTypeImpl functionalityActionType = new FunctionalityActionTypeImpl();
    return functionalityActionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FuncCreateAction createFuncCreateAction()
  {
    FuncCreateActionImpl funcCreateAction = new FuncCreateActionImpl();
    return funcCreateAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FuncViewGridAction createFuncViewGridAction()
  {
    FuncViewGridActionImpl funcViewGridAction = new FuncViewGridActionImpl();
    return funcViewGridAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FuncViewDropDownAction createFuncViewDropDownAction()
  {
    FuncViewDropDownActionImpl funcViewDropDownAction = new FuncViewDropDownActionImpl();
    return funcViewDropDownAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FuncEditAction createFuncEditAction()
  {
    FuncEditActionImpl funcEditAction = new FuncEditActionImpl();
    return funcEditAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FuncDeleteAction createFuncDeleteAction()
  {
    FuncDeleteActionImpl funcDeleteAction = new FuncDeleteActionImpl();
    return funcDeleteAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Architecture createArchitecture()
  {
    ArchitectureImpl architecture = new ArchitectureImpl();
    return architecture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PresentationLayer createPresentationLayer()
  {
    PresentationLayerImpl presentationLayer = new PresentationLayerImpl();
    return presentationLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControllerSegmentLayer createControllerSegmentLayer()
  {
    ControllerSegmentLayerImpl controllerSegmentLayer = new ControllerSegmentLayerImpl();
    return controllerSegmentLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ViewSegmentLayer createViewSegmentLayer()
  {
    ViewSegmentLayerImpl viewSegmentLayer = new ViewSegmentLayerImpl();
    return viewSegmentLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScriptSegmentLayer createScriptSegmentLayer()
  {
    ScriptSegmentLayerImpl scriptSegmentLayer = new ScriptSegmentLayerImpl();
    return scriptSegmentLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BusinessLayer createBusinessLayer()
  {
    BusinessLayerImpl businessLayer = new BusinessLayerImpl();
    return businessLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataAccessLayer createDataAccessLayer()
  {
    DataAccessLayerImpl dataAccessLayer = new DataAccessLayerImpl();
    return dataAccessLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DbConnectorSegmentLayer createDbConnectorSegmentLayer()
  {
    DbConnectorSegmentLayerImpl dbConnectorSegmentLayer = new DbConnectorSegmentLayerImpl();
    return dbConnectorSegmentLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CommonLayer createCommonLayer()
  {
    CommonLayerImpl commonLayer = new CommonLayerImpl();
    return commonLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Relations createRelations()
  {
    RelationsImpl relations = new RelationsImpl();
    return relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Technology createTechnology()
  {
    TechnologyImpl technology = new TechnologyImpl();
    return technology;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModuleTech createModuleTech()
  {
    ModuleTechImpl moduleTech = new ModuleTechImpl();
    return moduleTech;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControllersRef createControllersRef()
  {
    ControllersRefImpl controllersRef = new ControllersRefImpl();
    return controllersRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ViewsRef createViewsRef()
  {
    ViewsRefImpl viewsRef = new ViewsRefImpl();
    return viewsRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScriptRef createScriptRef()
  {
    ScriptRefImpl scriptRef = new ScriptRefImpl();
    return scriptRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BusinessLayerRef createBusinessLayerRef()
  {
    BusinessLayerRefImpl businessLayerRef = new BusinessLayerRefImpl();
    return businessLayerRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataAccessLayerRef createDataAccessLayerRef()
  {
    DataAccessLayerRefImpl dataAccessLayerRef = new DataAccessLayerRefImpl();
    return dataAccessLayerRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CommonLayerRef createCommonLayerRef()
  {
    CommonLayerRefImpl commonLayerRef = new CommonLayerRefImpl();
    return commonLayerRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonFieldType createCommonFieldTypeFromString(EDataType eDataType, String initialValue)
  {
    CommonFieldType result = CommonFieldType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCommonFieldTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationsType createRelationsTypeFromString(EDataType eDataType, String initialValue)
  {
    RelationsType result = RelationsType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRelationsTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseRDBMSType createDatabaseRDBMSTypeFromString(EDataType eDataType, String initialValue)
  {
    DatabaseRDBMSType result = DatabaseRDBMSType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDatabaseRDBMSTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComprasPackage getComprasPackage()
  {
    return (ComprasPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ComprasPackage getPackage()
  {
    return ComprasPackage.eINSTANCE;
  }

} //ComprasFactoryImpl
