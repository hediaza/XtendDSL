/**
 * generated by Xtext 2.17.0
 */
package org.xtext.example.compras.compras.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.compras.compras.Architecture;
import org.xtext.example.compras.compras.BusinessLayer;
import org.xtext.example.compras.compras.CommonLayer;
import org.xtext.example.compras.compras.ComprasPackage;
import org.xtext.example.compras.compras.DataAccessLayer;
import org.xtext.example.compras.compras.PresentationLayer;
import org.xtext.example.compras.compras.Relations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compras.compras.impl.ArchitectureImpl#getPresentationLayer <em>Presentation Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ArchitectureImpl#getBusinessLayer <em>Business Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ArchitectureImpl#getDataAccessLayer <em>Data Access Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ArchitectureImpl#getCommonLayer <em>Common Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.ArchitectureImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureImpl extends MinimalEObjectImpl.Container implements Architecture
{
  /**
   * The cached value of the '{@link #getPresentationLayer() <em>Presentation Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresentationLayer()
   * @generated
   * @ordered
   */
  protected PresentationLayer presentationLayer;

  /**
   * The cached value of the '{@link #getBusinessLayer() <em>Business Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusinessLayer()
   * @generated
   * @ordered
   */
  protected BusinessLayer businessLayer;

  /**
   * The cached value of the '{@link #getDataAccessLayer() <em>Data Access Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataAccessLayer()
   * @generated
   * @ordered
   */
  protected DataAccessLayer dataAccessLayer;

  /**
   * The cached value of the '{@link #getCommonLayer() <em>Common Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommonLayer()
   * @generated
   * @ordered
   */
  protected CommonLayer commonLayer;

  /**
   * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelations()
   * @generated
   * @ordered
   */
  protected Relations relations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArchitectureImpl()
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
    return ComprasPackage.Literals.ARCHITECTURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PresentationLayer getPresentationLayer()
  {
    return presentationLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPresentationLayer(PresentationLayer newPresentationLayer, NotificationChain msgs)
  {
    PresentationLayer oldPresentationLayer = presentationLayer;
    presentationLayer = newPresentationLayer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComprasPackage.ARCHITECTURE__PRESENTATION_LAYER, oldPresentationLayer, newPresentationLayer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPresentationLayer(PresentationLayer newPresentationLayer)
  {
    if (newPresentationLayer != presentationLayer)
    {
      NotificationChain msgs = null;
      if (presentationLayer != null)
        msgs = ((InternalEObject)presentationLayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ARCHITECTURE__PRESENTATION_LAYER, null, msgs);
      if (newPresentationLayer != null)
        msgs = ((InternalEObject)newPresentationLayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ARCHITECTURE__PRESENTATION_LAYER, null, msgs);
      msgs = basicSetPresentationLayer(newPresentationLayer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.ARCHITECTURE__PRESENTATION_LAYER, newPresentationLayer, newPresentationLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BusinessLayer getBusinessLayer()
  {
    return businessLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBusinessLayer(BusinessLayer newBusinessLayer, NotificationChain msgs)
  {
    BusinessLayer oldBusinessLayer = businessLayer;
    businessLayer = newBusinessLayer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComprasPackage.ARCHITECTURE__BUSINESS_LAYER, oldBusinessLayer, newBusinessLayer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBusinessLayer(BusinessLayer newBusinessLayer)
  {
    if (newBusinessLayer != businessLayer)
    {
      NotificationChain msgs = null;
      if (businessLayer != null)
        msgs = ((InternalEObject)businessLayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ARCHITECTURE__BUSINESS_LAYER, null, msgs);
      if (newBusinessLayer != null)
        msgs = ((InternalEObject)newBusinessLayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ARCHITECTURE__BUSINESS_LAYER, null, msgs);
      msgs = basicSetBusinessLayer(newBusinessLayer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.ARCHITECTURE__BUSINESS_LAYER, newBusinessLayer, newBusinessLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataAccessLayer getDataAccessLayer()
  {
    return dataAccessLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataAccessLayer(DataAccessLayer newDataAccessLayer, NotificationChain msgs)
  {
    DataAccessLayer oldDataAccessLayer = dataAccessLayer;
    dataAccessLayer = newDataAccessLayer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComprasPackage.ARCHITECTURE__DATA_ACCESS_LAYER, oldDataAccessLayer, newDataAccessLayer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDataAccessLayer(DataAccessLayer newDataAccessLayer)
  {
    if (newDataAccessLayer != dataAccessLayer)
    {
      NotificationChain msgs = null;
      if (dataAccessLayer != null)
        msgs = ((InternalEObject)dataAccessLayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ARCHITECTURE__DATA_ACCESS_LAYER, null, msgs);
      if (newDataAccessLayer != null)
        msgs = ((InternalEObject)newDataAccessLayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ARCHITECTURE__DATA_ACCESS_LAYER, null, msgs);
      msgs = basicSetDataAccessLayer(newDataAccessLayer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.ARCHITECTURE__DATA_ACCESS_LAYER, newDataAccessLayer, newDataAccessLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CommonLayer getCommonLayer()
  {
    return commonLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommonLayer(CommonLayer newCommonLayer, NotificationChain msgs)
  {
    CommonLayer oldCommonLayer = commonLayer;
    commonLayer = newCommonLayer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComprasPackage.ARCHITECTURE__COMMON_LAYER, oldCommonLayer, newCommonLayer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCommonLayer(CommonLayer newCommonLayer)
  {
    if (newCommonLayer != commonLayer)
    {
      NotificationChain msgs = null;
      if (commonLayer != null)
        msgs = ((InternalEObject)commonLayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ARCHITECTURE__COMMON_LAYER, null, msgs);
      if (newCommonLayer != null)
        msgs = ((InternalEObject)newCommonLayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ARCHITECTURE__COMMON_LAYER, null, msgs);
      msgs = basicSetCommonLayer(newCommonLayer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.ARCHITECTURE__COMMON_LAYER, newCommonLayer, newCommonLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Relations getRelations()
  {
    return relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelations(Relations newRelations, NotificationChain msgs)
  {
    Relations oldRelations = relations;
    relations = newRelations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComprasPackage.ARCHITECTURE__RELATIONS, oldRelations, newRelations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRelations(Relations newRelations)
  {
    if (newRelations != relations)
    {
      NotificationChain msgs = null;
      if (relations != null)
        msgs = ((InternalEObject)relations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ARCHITECTURE__RELATIONS, null, msgs);
      if (newRelations != null)
        msgs = ((InternalEObject)newRelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ARCHITECTURE__RELATIONS, null, msgs);
      msgs = basicSetRelations(newRelations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.ARCHITECTURE__RELATIONS, newRelations, newRelations));
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
      case ComprasPackage.ARCHITECTURE__PRESENTATION_LAYER:
        return basicSetPresentationLayer(null, msgs);
      case ComprasPackage.ARCHITECTURE__BUSINESS_LAYER:
        return basicSetBusinessLayer(null, msgs);
      case ComprasPackage.ARCHITECTURE__DATA_ACCESS_LAYER:
        return basicSetDataAccessLayer(null, msgs);
      case ComprasPackage.ARCHITECTURE__COMMON_LAYER:
        return basicSetCommonLayer(null, msgs);
      case ComprasPackage.ARCHITECTURE__RELATIONS:
        return basicSetRelations(null, msgs);
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
      case ComprasPackage.ARCHITECTURE__PRESENTATION_LAYER:
        return getPresentationLayer();
      case ComprasPackage.ARCHITECTURE__BUSINESS_LAYER:
        return getBusinessLayer();
      case ComprasPackage.ARCHITECTURE__DATA_ACCESS_LAYER:
        return getDataAccessLayer();
      case ComprasPackage.ARCHITECTURE__COMMON_LAYER:
        return getCommonLayer();
      case ComprasPackage.ARCHITECTURE__RELATIONS:
        return getRelations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ComprasPackage.ARCHITECTURE__PRESENTATION_LAYER:
        setPresentationLayer((PresentationLayer)newValue);
        return;
      case ComprasPackage.ARCHITECTURE__BUSINESS_LAYER:
        setBusinessLayer((BusinessLayer)newValue);
        return;
      case ComprasPackage.ARCHITECTURE__DATA_ACCESS_LAYER:
        setDataAccessLayer((DataAccessLayer)newValue);
        return;
      case ComprasPackage.ARCHITECTURE__COMMON_LAYER:
        setCommonLayer((CommonLayer)newValue);
        return;
      case ComprasPackage.ARCHITECTURE__RELATIONS:
        setRelations((Relations)newValue);
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
      case ComprasPackage.ARCHITECTURE__PRESENTATION_LAYER:
        setPresentationLayer((PresentationLayer)null);
        return;
      case ComprasPackage.ARCHITECTURE__BUSINESS_LAYER:
        setBusinessLayer((BusinessLayer)null);
        return;
      case ComprasPackage.ARCHITECTURE__DATA_ACCESS_LAYER:
        setDataAccessLayer((DataAccessLayer)null);
        return;
      case ComprasPackage.ARCHITECTURE__COMMON_LAYER:
        setCommonLayer((CommonLayer)null);
        return;
      case ComprasPackage.ARCHITECTURE__RELATIONS:
        setRelations((Relations)null);
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
      case ComprasPackage.ARCHITECTURE__PRESENTATION_LAYER:
        return presentationLayer != null;
      case ComprasPackage.ARCHITECTURE__BUSINESS_LAYER:
        return businessLayer != null;
      case ComprasPackage.ARCHITECTURE__DATA_ACCESS_LAYER:
        return dataAccessLayer != null;
      case ComprasPackage.ARCHITECTURE__COMMON_LAYER:
        return commonLayer != null;
      case ComprasPackage.ARCHITECTURE__RELATIONS:
        return relations != null;
    }
    return super.eIsSet(featureID);
  }

} //ArchitectureImpl
