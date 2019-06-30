/**
 * generated by Xtext 2.17.0
 */
package org.xtext.example.compras.compras.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.compras.compras.BusinessLayerRef;
import org.xtext.example.compras.compras.ComprasPackage;
import org.xtext.example.compras.compras.Functionality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Layer Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compras.compras.impl.BusinessLayerRefImpl#getFunctionality <em>Functionality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessLayerRefImpl extends MinimalEObjectImpl.Container implements BusinessLayerRef
{
  /**
   * The cached value of the '{@link #getFunctionality() <em>Functionality</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionality()
   * @generated
   * @ordered
   */
  protected Functionality functionality;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessLayerRefImpl()
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
    return ComprasPackage.Literals.BUSINESS_LAYER_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Functionality getFunctionality()
  {
    if (functionality != null && functionality.eIsProxy())
    {
      InternalEObject oldFunctionality = (InternalEObject)functionality;
      functionality = (Functionality)eResolveProxy(oldFunctionality);
      if (functionality != oldFunctionality)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComprasPackage.BUSINESS_LAYER_REF__FUNCTIONALITY, oldFunctionality, functionality));
      }
    }
    return functionality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Functionality basicGetFunctionality()
  {
    return functionality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFunctionality(Functionality newFunctionality)
  {
    Functionality oldFunctionality = functionality;
    functionality = newFunctionality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.BUSINESS_LAYER_REF__FUNCTIONALITY, oldFunctionality, functionality));
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
      case ComprasPackage.BUSINESS_LAYER_REF__FUNCTIONALITY:
        if (resolve) return getFunctionality();
        return basicGetFunctionality();
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
      case ComprasPackage.BUSINESS_LAYER_REF__FUNCTIONALITY:
        setFunctionality((Functionality)newValue);
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
      case ComprasPackage.BUSINESS_LAYER_REF__FUNCTIONALITY:
        setFunctionality((Functionality)null);
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
      case ComprasPackage.BUSINESS_LAYER_REF__FUNCTIONALITY:
        return functionality != null;
    }
    return super.eIsSet(featureID);
  }

} //BusinessLayerRefImpl