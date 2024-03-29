/**
 * generated by Xtext 2.17.0
 */
package org.xtext.example.compras.compras.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.compras.compras.BusinessLayer;
import org.xtext.example.compras.compras.BusinessLayerRef;
import org.xtext.example.compras.compras.CommonLayer;
import org.xtext.example.compras.compras.CommonLayerRef;
import org.xtext.example.compras.compras.ComprasPackage;
import org.xtext.example.compras.compras.ControllerSegmentLayer;
import org.xtext.example.compras.compras.ControllersRef;
import org.xtext.example.compras.compras.DataAccessLayer;
import org.xtext.example.compras.compras.DataAccessLayerRef;
import org.xtext.example.compras.compras.ModuleTech;
import org.xtext.example.compras.compras.PresentationLayer;
import org.xtext.example.compras.compras.ScriptRef;
import org.xtext.example.compras.compras.ScriptSegmentLayer;
import org.xtext.example.compras.compras.ViewSegmentLayer;
import org.xtext.example.compras.compras.ViewsRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Tech</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compras.compras.impl.ModuleTechImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ModuleTechImpl#getPresentationLayer <em>Presentation Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ModuleTechImpl#getControllerSegmentLayer <em>Controller Segment Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ModuleTechImpl#getControllersRef <em>Controllers Ref</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ModuleTechImpl#getViewSegmentLayer <em>View Segment Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ModuleTechImpl#getViewsRef <em>Views Ref</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ModuleTechImpl#getScriptSegmentLayer <em>Script Segment Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ModuleTechImpl#getScriptRef <em>Script Ref</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ModuleTechImpl#getBusinessLayer <em>Business Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ModuleTechImpl#getBusinessLayerRef <em>Business Layer Ref</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ModuleTechImpl#getDataAccessLayer <em>Data Access Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ModuleTechImpl#getDataAccessLayerRef <em>Data Access Layer Ref</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ModuleTechImpl#getCommonLayer <em>Common Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ModuleTechImpl#getCommonLayerRef <em>Common Layer Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleTechImpl extends MinimalEObjectImpl.Container implements ModuleTech
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected org.xtext.example.compras.compras.Module name;

  /**
   * The cached value of the '{@link #getPresentationLayer() <em>Presentation Layer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresentationLayer()
   * @generated
   * @ordered
   */
  protected PresentationLayer presentationLayer;

  /**
   * The cached value of the '{@link #getControllerSegmentLayer() <em>Controller Segment Layer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControllerSegmentLayer()
   * @generated
   * @ordered
   */
  protected ControllerSegmentLayer controllerSegmentLayer;

  /**
   * The cached value of the '{@link #getControllersRef() <em>Controllers Ref</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControllersRef()
   * @generated
   * @ordered
   */
  protected EList<ControllersRef> controllersRef;

  /**
   * The cached value of the '{@link #getViewSegmentLayer() <em>View Segment Layer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewSegmentLayer()
   * @generated
   * @ordered
   */
  protected ViewSegmentLayer viewSegmentLayer;

  /**
   * The cached value of the '{@link #getViewsRef() <em>Views Ref</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewsRef()
   * @generated
   * @ordered
   */
  protected EList<ViewsRef> viewsRef;

  /**
   * The cached value of the '{@link #getScriptSegmentLayer() <em>Script Segment Layer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScriptSegmentLayer()
   * @generated
   * @ordered
   */
  protected ScriptSegmentLayer scriptSegmentLayer;

  /**
   * The cached value of the '{@link #getScriptRef() <em>Script Ref</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScriptRef()
   * @generated
   * @ordered
   */
  protected EList<ScriptRef> scriptRef;

  /**
   * The cached value of the '{@link #getBusinessLayer() <em>Business Layer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusinessLayer()
   * @generated
   * @ordered
   */
  protected BusinessLayer businessLayer;

  /**
   * The cached value of the '{@link #getBusinessLayerRef() <em>Business Layer Ref</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusinessLayerRef()
   * @generated
   * @ordered
   */
  protected EList<BusinessLayerRef> businessLayerRef;

  /**
   * The cached value of the '{@link #getDataAccessLayer() <em>Data Access Layer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataAccessLayer()
   * @generated
   * @ordered
   */
  protected DataAccessLayer dataAccessLayer;

  /**
   * The cached value of the '{@link #getDataAccessLayerRef() <em>Data Access Layer Ref</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataAccessLayerRef()
   * @generated
   * @ordered
   */
  protected EList<DataAccessLayerRef> dataAccessLayerRef;

  /**
   * The cached value of the '{@link #getCommonLayer() <em>Common Layer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommonLayer()
   * @generated
   * @ordered
   */
  protected CommonLayer commonLayer;

  /**
   * The cached value of the '{@link #getCommonLayerRef() <em>Common Layer Ref</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommonLayerRef()
   * @generated
   * @ordered
   */
  protected EList<CommonLayerRef> commonLayerRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleTechImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ComprasPackage.Literals.MODULE_TECH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.xtext.example.compras.compras.Module getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (org.xtext.example.compras.compras.Module)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComprasPackage.MODULE_TECH__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.compras.compras.Module basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(org.xtext.example.compras.compras.Module newName)
  {
    org.xtext.example.compras.compras.Module oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.MODULE_TECH__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PresentationLayer getPresentationLayer()
  {
    if (presentationLayer != null && presentationLayer.eIsProxy())
    {
      InternalEObject oldPresentationLayer = (InternalEObject)presentationLayer;
      presentationLayer = (PresentationLayer)eResolveProxy(oldPresentationLayer);
      if (presentationLayer != oldPresentationLayer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComprasPackage.MODULE_TECH__PRESENTATION_LAYER, oldPresentationLayer, presentationLayer));
      }
    }
    return presentationLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PresentationLayer basicGetPresentationLayer()
  {
    return presentationLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPresentationLayer(PresentationLayer newPresentationLayer)
  {
    PresentationLayer oldPresentationLayer = presentationLayer;
    presentationLayer = newPresentationLayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.MODULE_TECH__PRESENTATION_LAYER, oldPresentationLayer, presentationLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControllerSegmentLayer getControllerSegmentLayer()
  {
    if (controllerSegmentLayer != null && controllerSegmentLayer.eIsProxy())
    {
      InternalEObject oldControllerSegmentLayer = (InternalEObject)controllerSegmentLayer;
      controllerSegmentLayer = (ControllerSegmentLayer)eResolveProxy(oldControllerSegmentLayer);
      if (controllerSegmentLayer != oldControllerSegmentLayer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComprasPackage.MODULE_TECH__CONTROLLER_SEGMENT_LAYER, oldControllerSegmentLayer, controllerSegmentLayer));
      }
    }
    return controllerSegmentLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControllerSegmentLayer basicGetControllerSegmentLayer()
  {
    return controllerSegmentLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setControllerSegmentLayer(ControllerSegmentLayer newControllerSegmentLayer)
  {
    ControllerSegmentLayer oldControllerSegmentLayer = controllerSegmentLayer;
    controllerSegmentLayer = newControllerSegmentLayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.MODULE_TECH__CONTROLLER_SEGMENT_LAYER, oldControllerSegmentLayer, controllerSegmentLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ControllersRef> getControllersRef()
  {
    if (controllersRef == null)
    {
      controllersRef = new EObjectContainmentEList<ControllersRef>(ControllersRef.class, this, ComprasPackage.MODULE_TECH__CONTROLLERS_REF);
    }
    return controllersRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ViewSegmentLayer getViewSegmentLayer()
  {
    if (viewSegmentLayer != null && viewSegmentLayer.eIsProxy())
    {
      InternalEObject oldViewSegmentLayer = (InternalEObject)viewSegmentLayer;
      viewSegmentLayer = (ViewSegmentLayer)eResolveProxy(oldViewSegmentLayer);
      if (viewSegmentLayer != oldViewSegmentLayer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComprasPackage.MODULE_TECH__VIEW_SEGMENT_LAYER, oldViewSegmentLayer, viewSegmentLayer));
      }
    }
    return viewSegmentLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewSegmentLayer basicGetViewSegmentLayer()
  {
    return viewSegmentLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setViewSegmentLayer(ViewSegmentLayer newViewSegmentLayer)
  {
    ViewSegmentLayer oldViewSegmentLayer = viewSegmentLayer;
    viewSegmentLayer = newViewSegmentLayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.MODULE_TECH__VIEW_SEGMENT_LAYER, oldViewSegmentLayer, viewSegmentLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ViewsRef> getViewsRef()
  {
    if (viewsRef == null)
    {
      viewsRef = new EObjectContainmentEList<ViewsRef>(ViewsRef.class, this, ComprasPackage.MODULE_TECH__VIEWS_REF);
    }
    return viewsRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScriptSegmentLayer getScriptSegmentLayer()
  {
    if (scriptSegmentLayer != null && scriptSegmentLayer.eIsProxy())
    {
      InternalEObject oldScriptSegmentLayer = (InternalEObject)scriptSegmentLayer;
      scriptSegmentLayer = (ScriptSegmentLayer)eResolveProxy(oldScriptSegmentLayer);
      if (scriptSegmentLayer != oldScriptSegmentLayer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComprasPackage.MODULE_TECH__SCRIPT_SEGMENT_LAYER, oldScriptSegmentLayer, scriptSegmentLayer));
      }
    }
    return scriptSegmentLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptSegmentLayer basicGetScriptSegmentLayer()
  {
    return scriptSegmentLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScriptSegmentLayer(ScriptSegmentLayer newScriptSegmentLayer)
  {
    ScriptSegmentLayer oldScriptSegmentLayer = scriptSegmentLayer;
    scriptSegmentLayer = newScriptSegmentLayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.MODULE_TECH__SCRIPT_SEGMENT_LAYER, oldScriptSegmentLayer, scriptSegmentLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ScriptRef> getScriptRef()
  {
    if (scriptRef == null)
    {
      scriptRef = new EObjectContainmentEList<ScriptRef>(ScriptRef.class, this, ComprasPackage.MODULE_TECH__SCRIPT_REF);
    }
    return scriptRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BusinessLayer getBusinessLayer()
  {
    if (businessLayer != null && businessLayer.eIsProxy())
    {
      InternalEObject oldBusinessLayer = (InternalEObject)businessLayer;
      businessLayer = (BusinessLayer)eResolveProxy(oldBusinessLayer);
      if (businessLayer != oldBusinessLayer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComprasPackage.MODULE_TECH__BUSINESS_LAYER, oldBusinessLayer, businessLayer));
      }
    }
    return businessLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessLayer basicGetBusinessLayer()
  {
    return businessLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBusinessLayer(BusinessLayer newBusinessLayer)
  {
    BusinessLayer oldBusinessLayer = businessLayer;
    businessLayer = newBusinessLayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.MODULE_TECH__BUSINESS_LAYER, oldBusinessLayer, businessLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<BusinessLayerRef> getBusinessLayerRef()
  {
    if (businessLayerRef == null)
    {
      businessLayerRef = new EObjectContainmentEList<BusinessLayerRef>(BusinessLayerRef.class, this, ComprasPackage.MODULE_TECH__BUSINESS_LAYER_REF);
    }
    return businessLayerRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataAccessLayer getDataAccessLayer()
  {
    if (dataAccessLayer != null && dataAccessLayer.eIsProxy())
    {
      InternalEObject oldDataAccessLayer = (InternalEObject)dataAccessLayer;
      dataAccessLayer = (DataAccessLayer)eResolveProxy(oldDataAccessLayer);
      if (dataAccessLayer != oldDataAccessLayer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComprasPackage.MODULE_TECH__DATA_ACCESS_LAYER, oldDataAccessLayer, dataAccessLayer));
      }
    }
    return dataAccessLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAccessLayer basicGetDataAccessLayer()
  {
    return dataAccessLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDataAccessLayer(DataAccessLayer newDataAccessLayer)
  {
    DataAccessLayer oldDataAccessLayer = dataAccessLayer;
    dataAccessLayer = newDataAccessLayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.MODULE_TECH__DATA_ACCESS_LAYER, oldDataAccessLayer, dataAccessLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DataAccessLayerRef> getDataAccessLayerRef()
  {
    if (dataAccessLayerRef == null)
    {
      dataAccessLayerRef = new EObjectContainmentEList<DataAccessLayerRef>(DataAccessLayerRef.class, this, ComprasPackage.MODULE_TECH__DATA_ACCESS_LAYER_REF);
    }
    return dataAccessLayerRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CommonLayer getCommonLayer()
  {
    if (commonLayer != null && commonLayer.eIsProxy())
    {
      InternalEObject oldCommonLayer = (InternalEObject)commonLayer;
      commonLayer = (CommonLayer)eResolveProxy(oldCommonLayer);
      if (commonLayer != oldCommonLayer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComprasPackage.MODULE_TECH__COMMON_LAYER, oldCommonLayer, commonLayer));
      }
    }
    return commonLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonLayer basicGetCommonLayer()
  {
    return commonLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCommonLayer(CommonLayer newCommonLayer)
  {
    CommonLayer oldCommonLayer = commonLayer;
    commonLayer = newCommonLayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.MODULE_TECH__COMMON_LAYER, oldCommonLayer, commonLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CommonLayerRef> getCommonLayerRef()
  {
    if (commonLayerRef == null)
    {
      commonLayerRef = new EObjectContainmentEList<CommonLayerRef>(CommonLayerRef.class, this, ComprasPackage.MODULE_TECH__COMMON_LAYER_REF);
    }
    return commonLayerRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ComprasPackage.MODULE_TECH__CONTROLLERS_REF:
        return ((InternalEList<?>)getControllersRef()).basicRemove(otherEnd, msgs);
      case ComprasPackage.MODULE_TECH__VIEWS_REF:
        return ((InternalEList<?>)getViewsRef()).basicRemove(otherEnd, msgs);
      case ComprasPackage.MODULE_TECH__SCRIPT_REF:
        return ((InternalEList<?>)getScriptRef()).basicRemove(otherEnd, msgs);
      case ComprasPackage.MODULE_TECH__BUSINESS_LAYER_REF:
        return ((InternalEList<?>)getBusinessLayerRef()).basicRemove(otherEnd, msgs);
      case ComprasPackage.MODULE_TECH__DATA_ACCESS_LAYER_REF:
        return ((InternalEList<?>)getDataAccessLayerRef()).basicRemove(otherEnd, msgs);
      case ComprasPackage.MODULE_TECH__COMMON_LAYER_REF:
        return ((InternalEList<?>)getCommonLayerRef()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ComprasPackage.MODULE_TECH__NAME:
        if (resolve) return getName();
        return basicGetName();
      case ComprasPackage.MODULE_TECH__PRESENTATION_LAYER:
        if (resolve) return getPresentationLayer();
        return basicGetPresentationLayer();
      case ComprasPackage.MODULE_TECH__CONTROLLER_SEGMENT_LAYER:
        if (resolve) return getControllerSegmentLayer();
        return basicGetControllerSegmentLayer();
      case ComprasPackage.MODULE_TECH__CONTROLLERS_REF:
        return getControllersRef();
      case ComprasPackage.MODULE_TECH__VIEW_SEGMENT_LAYER:
        if (resolve) return getViewSegmentLayer();
        return basicGetViewSegmentLayer();
      case ComprasPackage.MODULE_TECH__VIEWS_REF:
        return getViewsRef();
      case ComprasPackage.MODULE_TECH__SCRIPT_SEGMENT_LAYER:
        if (resolve) return getScriptSegmentLayer();
        return basicGetScriptSegmentLayer();
      case ComprasPackage.MODULE_TECH__SCRIPT_REF:
        return getScriptRef();
      case ComprasPackage.MODULE_TECH__BUSINESS_LAYER:
        if (resolve) return getBusinessLayer();
        return basicGetBusinessLayer();
      case ComprasPackage.MODULE_TECH__BUSINESS_LAYER_REF:
        return getBusinessLayerRef();
      case ComprasPackage.MODULE_TECH__DATA_ACCESS_LAYER:
        if (resolve) return getDataAccessLayer();
        return basicGetDataAccessLayer();
      case ComprasPackage.MODULE_TECH__DATA_ACCESS_LAYER_REF:
        return getDataAccessLayerRef();
      case ComprasPackage.MODULE_TECH__COMMON_LAYER:
        if (resolve) return getCommonLayer();
        return basicGetCommonLayer();
      case ComprasPackage.MODULE_TECH__COMMON_LAYER_REF:
        return getCommonLayerRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ComprasPackage.MODULE_TECH__NAME:
        setName((org.xtext.example.compras.compras.Module)newValue);
        return;
      case ComprasPackage.MODULE_TECH__PRESENTATION_LAYER:
        setPresentationLayer((PresentationLayer)newValue);
        return;
      case ComprasPackage.MODULE_TECH__CONTROLLER_SEGMENT_LAYER:
        setControllerSegmentLayer((ControllerSegmentLayer)newValue);
        return;
      case ComprasPackage.MODULE_TECH__CONTROLLERS_REF:
        getControllersRef().clear();
        getControllersRef().addAll((Collection<? extends ControllersRef>)newValue);
        return;
      case ComprasPackage.MODULE_TECH__VIEW_SEGMENT_LAYER:
        setViewSegmentLayer((ViewSegmentLayer)newValue);
        return;
      case ComprasPackage.MODULE_TECH__VIEWS_REF:
        getViewsRef().clear();
        getViewsRef().addAll((Collection<? extends ViewsRef>)newValue);
        return;
      case ComprasPackage.MODULE_TECH__SCRIPT_SEGMENT_LAYER:
        setScriptSegmentLayer((ScriptSegmentLayer)newValue);
        return;
      case ComprasPackage.MODULE_TECH__SCRIPT_REF:
        getScriptRef().clear();
        getScriptRef().addAll((Collection<? extends ScriptRef>)newValue);
        return;
      case ComprasPackage.MODULE_TECH__BUSINESS_LAYER:
        setBusinessLayer((BusinessLayer)newValue);
        return;
      case ComprasPackage.MODULE_TECH__BUSINESS_LAYER_REF:
        getBusinessLayerRef().clear();
        getBusinessLayerRef().addAll((Collection<? extends BusinessLayerRef>)newValue);
        return;
      case ComprasPackage.MODULE_TECH__DATA_ACCESS_LAYER:
        setDataAccessLayer((DataAccessLayer)newValue);
        return;
      case ComprasPackage.MODULE_TECH__DATA_ACCESS_LAYER_REF:
        getDataAccessLayerRef().clear();
        getDataAccessLayerRef().addAll((Collection<? extends DataAccessLayerRef>)newValue);
        return;
      case ComprasPackage.MODULE_TECH__COMMON_LAYER:
        setCommonLayer((CommonLayer)newValue);
        return;
      case ComprasPackage.MODULE_TECH__COMMON_LAYER_REF:
        getCommonLayerRef().clear();
        getCommonLayerRef().addAll((Collection<? extends CommonLayerRef>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ComprasPackage.MODULE_TECH__NAME:
        setName((org.xtext.example.compras.compras.Module)null);
        return;
      case ComprasPackage.MODULE_TECH__PRESENTATION_LAYER:
        setPresentationLayer((PresentationLayer)null);
        return;
      case ComprasPackage.MODULE_TECH__CONTROLLER_SEGMENT_LAYER:
        setControllerSegmentLayer((ControllerSegmentLayer)null);
        return;
      case ComprasPackage.MODULE_TECH__CONTROLLERS_REF:
        getControllersRef().clear();
        return;
      case ComprasPackage.MODULE_TECH__VIEW_SEGMENT_LAYER:
        setViewSegmentLayer((ViewSegmentLayer)null);
        return;
      case ComprasPackage.MODULE_TECH__VIEWS_REF:
        getViewsRef().clear();
        return;
      case ComprasPackage.MODULE_TECH__SCRIPT_SEGMENT_LAYER:
        setScriptSegmentLayer((ScriptSegmentLayer)null);
        return;
      case ComprasPackage.MODULE_TECH__SCRIPT_REF:
        getScriptRef().clear();
        return;
      case ComprasPackage.MODULE_TECH__BUSINESS_LAYER:
        setBusinessLayer((BusinessLayer)null);
        return;
      case ComprasPackage.MODULE_TECH__BUSINESS_LAYER_REF:
        getBusinessLayerRef().clear();
        return;
      case ComprasPackage.MODULE_TECH__DATA_ACCESS_LAYER:
        setDataAccessLayer((DataAccessLayer)null);
        return;
      case ComprasPackage.MODULE_TECH__DATA_ACCESS_LAYER_REF:
        getDataAccessLayerRef().clear();
        return;
      case ComprasPackage.MODULE_TECH__COMMON_LAYER:
        setCommonLayer((CommonLayer)null);
        return;
      case ComprasPackage.MODULE_TECH__COMMON_LAYER_REF:
        getCommonLayerRef().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ComprasPackage.MODULE_TECH__NAME:
        return name != null;
      case ComprasPackage.MODULE_TECH__PRESENTATION_LAYER:
        return presentationLayer != null;
      case ComprasPackage.MODULE_TECH__CONTROLLER_SEGMENT_LAYER:
        return controllerSegmentLayer != null;
      case ComprasPackage.MODULE_TECH__CONTROLLERS_REF:
        return controllersRef != null && !controllersRef.isEmpty();
      case ComprasPackage.MODULE_TECH__VIEW_SEGMENT_LAYER:
        return viewSegmentLayer != null;
      case ComprasPackage.MODULE_TECH__VIEWS_REF:
        return viewsRef != null && !viewsRef.isEmpty();
      case ComprasPackage.MODULE_TECH__SCRIPT_SEGMENT_LAYER:
        return scriptSegmentLayer != null;
      case ComprasPackage.MODULE_TECH__SCRIPT_REF:
        return scriptRef != null && !scriptRef.isEmpty();
      case ComprasPackage.MODULE_TECH__BUSINESS_LAYER:
        return businessLayer != null;
      case ComprasPackage.MODULE_TECH__BUSINESS_LAYER_REF:
        return businessLayerRef != null && !businessLayerRef.isEmpty();
      case ComprasPackage.MODULE_TECH__DATA_ACCESS_LAYER:
        return dataAccessLayer != null;
      case ComprasPackage.MODULE_TECH__DATA_ACCESS_LAYER_REF:
        return dataAccessLayerRef != null && !dataAccessLayerRef.isEmpty();
      case ComprasPackage.MODULE_TECH__COMMON_LAYER:
        return commonLayer != null;
      case ComprasPackage.MODULE_TECH__COMMON_LAYER_REF:
        return commonLayerRef != null && !commonLayerRef.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModuleTechImpl
