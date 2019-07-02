/**
 * generated by Xtext 2.18.0
 */
package org.xtext.example.compras.compras.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.compras.compras.ComprasPackage;
import org.xtext.example.compras.compras.EntityField;
import org.xtext.example.compras.compras.EntityFieldLabel;
import org.xtext.example.compras.compras.EntityFieldRequired;
import org.xtext.example.compras.compras.EntityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compras.compras.impl.EntityFieldImpl#getEntityFieldRequired <em>Entity Field Required</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.EntityFieldImpl#getEntityFieldLabel <em>Entity Field Label</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.EntityFieldImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.EntityFieldImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityFieldImpl extends MinimalEObjectImpl.Container implements EntityField
{
  /**
   * The cached value of the '{@link #getEntityFieldRequired() <em>Entity Field Required</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityFieldRequired()
   * @generated
   * @ordered
   */
  protected EntityFieldRequired entityFieldRequired;

  /**
   * The cached value of the '{@link #getEntityFieldLabel() <em>Entity Field Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityFieldLabel()
   * @generated
   * @ordered
   */
  protected EntityFieldLabel entityFieldLabel;

  /**
   * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityType()
   * @generated
   * @ordered
   */
  protected EntityType entityType;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityFieldImpl()
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
    return ComprasPackage.Literals.ENTITY_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityFieldRequired getEntityFieldRequired()
  {
    return entityFieldRequired;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntityFieldRequired(EntityFieldRequired newEntityFieldRequired, NotificationChain msgs)
  {
    EntityFieldRequired oldEntityFieldRequired = entityFieldRequired;
    entityFieldRequired = newEntityFieldRequired;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_REQUIRED, oldEntityFieldRequired, newEntityFieldRequired);
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
  public void setEntityFieldRequired(EntityFieldRequired newEntityFieldRequired)
  {
    if (newEntityFieldRequired != entityFieldRequired)
    {
      NotificationChain msgs = null;
      if (entityFieldRequired != null)
        msgs = ((InternalEObject)entityFieldRequired).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_REQUIRED, null, msgs);
      if (newEntityFieldRequired != null)
        msgs = ((InternalEObject)newEntityFieldRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_REQUIRED, null, msgs);
      msgs = basicSetEntityFieldRequired(newEntityFieldRequired, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_REQUIRED, newEntityFieldRequired, newEntityFieldRequired));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityFieldLabel getEntityFieldLabel()
  {
    return entityFieldLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntityFieldLabel(EntityFieldLabel newEntityFieldLabel, NotificationChain msgs)
  {
    EntityFieldLabel oldEntityFieldLabel = entityFieldLabel;
    entityFieldLabel = newEntityFieldLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_LABEL, oldEntityFieldLabel, newEntityFieldLabel);
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
  public void setEntityFieldLabel(EntityFieldLabel newEntityFieldLabel)
  {
    if (newEntityFieldLabel != entityFieldLabel)
    {
      NotificationChain msgs = null;
      if (entityFieldLabel != null)
        msgs = ((InternalEObject)entityFieldLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_LABEL, null, msgs);
      if (newEntityFieldLabel != null)
        msgs = ((InternalEObject)newEntityFieldLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_LABEL, null, msgs);
      msgs = basicSetEntityFieldLabel(newEntityFieldLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_LABEL, newEntityFieldLabel, newEntityFieldLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityType getEntityType()
  {
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntityType(EntityType newEntityType, NotificationChain msgs)
  {
    EntityType oldEntityType = entityType;
    entityType = newEntityType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComprasPackage.ENTITY_FIELD__ENTITY_TYPE, oldEntityType, newEntityType);
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
  public void setEntityType(EntityType newEntityType)
  {
    if (newEntityType != entityType)
    {
      NotificationChain msgs = null;
      if (entityType != null)
        msgs = ((InternalEObject)entityType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ENTITY_FIELD__ENTITY_TYPE, null, msgs);
      if (newEntityType != null)
        msgs = ((InternalEObject)newEntityType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComprasPackage.ENTITY_FIELD__ENTITY_TYPE, null, msgs);
      msgs = basicSetEntityType(newEntityType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.ENTITY_FIELD__ENTITY_TYPE, newEntityType, newEntityType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.ENTITY_FIELD__NAME, oldName, name));
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
      case ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_REQUIRED:
        return basicSetEntityFieldRequired(null, msgs);
      case ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_LABEL:
        return basicSetEntityFieldLabel(null, msgs);
      case ComprasPackage.ENTITY_FIELD__ENTITY_TYPE:
        return basicSetEntityType(null, msgs);
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
      case ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_REQUIRED:
        return getEntityFieldRequired();
      case ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_LABEL:
        return getEntityFieldLabel();
      case ComprasPackage.ENTITY_FIELD__ENTITY_TYPE:
        return getEntityType();
      case ComprasPackage.ENTITY_FIELD__NAME:
        return getName();
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
      case ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_REQUIRED:
        setEntityFieldRequired((EntityFieldRequired)newValue);
        return;
      case ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_LABEL:
        setEntityFieldLabel((EntityFieldLabel)newValue);
        return;
      case ComprasPackage.ENTITY_FIELD__ENTITY_TYPE:
        setEntityType((EntityType)newValue);
        return;
      case ComprasPackage.ENTITY_FIELD__NAME:
        setName((String)newValue);
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
      case ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_REQUIRED:
        setEntityFieldRequired((EntityFieldRequired)null);
        return;
      case ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_LABEL:
        setEntityFieldLabel((EntityFieldLabel)null);
        return;
      case ComprasPackage.ENTITY_FIELD__ENTITY_TYPE:
        setEntityType((EntityType)null);
        return;
      case ComprasPackage.ENTITY_FIELD__NAME:
        setName(NAME_EDEFAULT);
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
      case ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_REQUIRED:
        return entityFieldRequired != null;
      case ComprasPackage.ENTITY_FIELD__ENTITY_FIELD_LABEL:
        return entityFieldLabel != null;
      case ComprasPackage.ENTITY_FIELD__ENTITY_TYPE:
        return entityType != null;
      case ComprasPackage.ENTITY_FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EntityFieldImpl
