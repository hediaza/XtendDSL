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

import org.xtext.example.compras.compras.ComprasPackage;
import org.xtext.example.compras.compras.DatabaseRDBMSType;
import org.xtext.example.compras.compras.DbConnectorSegmentLayer;
import org.xtext.example.compras.compras.ModuleTech;
import org.xtext.example.compras.compras.Technology;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compras.compras.impl.TechnologyImpl#getModuleTech <em>Module Tech</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.TechnologyImpl#getDbConnectorSegmentLayer <em>Db Connector Segment Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.TechnologyImpl#getDatabaseRDBMSType <em>Database RDBMS Type</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.impl.TechnologyImpl#getConnectionString <em>Connection String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechnologyImpl extends MinimalEObjectImpl.Container implements Technology
{
  /**
   * The cached value of the '{@link #getModuleTech() <em>Module Tech</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModuleTech()
   * @generated
   * @ordered
   */
  protected EList<ModuleTech> moduleTech;

  /**
   * The cached value of the '{@link #getDbConnectorSegmentLayer() <em>Db Connector Segment Layer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbConnectorSegmentLayer()
   * @generated
   * @ordered
   */
  protected DbConnectorSegmentLayer dbConnectorSegmentLayer;

  /**
   * The default value of the '{@link #getDatabaseRDBMSType() <em>Database RDBMS Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabaseRDBMSType()
   * @generated
   * @ordered
   */
  protected static final DatabaseRDBMSType DATABASE_RDBMS_TYPE_EDEFAULT = DatabaseRDBMSType.SQLSERVER;

  /**
   * The cached value of the '{@link #getDatabaseRDBMSType() <em>Database RDBMS Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabaseRDBMSType()
   * @generated
   * @ordered
   */
  protected DatabaseRDBMSType databaseRDBMSType = DATABASE_RDBMS_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getConnectionString() <em>Connection String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectionString()
   * @generated
   * @ordered
   */
  protected static final String CONNECTION_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConnectionString() <em>Connection String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectionString()
   * @generated
   * @ordered
   */
  protected String connectionString = CONNECTION_STRING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TechnologyImpl()
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
    return ComprasPackage.Literals.TECHNOLOGY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ModuleTech> getModuleTech()
  {
    if (moduleTech == null)
    {
      moduleTech = new EObjectContainmentEList<ModuleTech>(ModuleTech.class, this, ComprasPackage.TECHNOLOGY__MODULE_TECH);
    }
    return moduleTech;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DbConnectorSegmentLayer getDbConnectorSegmentLayer()
  {
    if (dbConnectorSegmentLayer != null && dbConnectorSegmentLayer.eIsProxy())
    {
      InternalEObject oldDbConnectorSegmentLayer = (InternalEObject)dbConnectorSegmentLayer;
      dbConnectorSegmentLayer = (DbConnectorSegmentLayer)eResolveProxy(oldDbConnectorSegmentLayer);
      if (dbConnectorSegmentLayer != oldDbConnectorSegmentLayer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComprasPackage.TECHNOLOGY__DB_CONNECTOR_SEGMENT_LAYER, oldDbConnectorSegmentLayer, dbConnectorSegmentLayer));
      }
    }
    return dbConnectorSegmentLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbConnectorSegmentLayer basicGetDbConnectorSegmentLayer()
  {
    return dbConnectorSegmentLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDbConnectorSegmentLayer(DbConnectorSegmentLayer newDbConnectorSegmentLayer)
  {
    DbConnectorSegmentLayer oldDbConnectorSegmentLayer = dbConnectorSegmentLayer;
    dbConnectorSegmentLayer = newDbConnectorSegmentLayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.TECHNOLOGY__DB_CONNECTOR_SEGMENT_LAYER, oldDbConnectorSegmentLayer, dbConnectorSegmentLayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DatabaseRDBMSType getDatabaseRDBMSType()
  {
    return databaseRDBMSType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDatabaseRDBMSType(DatabaseRDBMSType newDatabaseRDBMSType)
  {
    DatabaseRDBMSType oldDatabaseRDBMSType = databaseRDBMSType;
    databaseRDBMSType = newDatabaseRDBMSType == null ? DATABASE_RDBMS_TYPE_EDEFAULT : newDatabaseRDBMSType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.TECHNOLOGY__DATABASE_RDBMS_TYPE, oldDatabaseRDBMSType, databaseRDBMSType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getConnectionString()
  {
    return connectionString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConnectionString(String newConnectionString)
  {
    String oldConnectionString = connectionString;
    connectionString = newConnectionString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComprasPackage.TECHNOLOGY__CONNECTION_STRING, oldConnectionString, connectionString));
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
      case ComprasPackage.TECHNOLOGY__MODULE_TECH:
        return ((InternalEList<?>)getModuleTech()).basicRemove(otherEnd, msgs);
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
      case ComprasPackage.TECHNOLOGY__MODULE_TECH:
        return getModuleTech();
      case ComprasPackage.TECHNOLOGY__DB_CONNECTOR_SEGMENT_LAYER:
        if (resolve) return getDbConnectorSegmentLayer();
        return basicGetDbConnectorSegmentLayer();
      case ComprasPackage.TECHNOLOGY__DATABASE_RDBMS_TYPE:
        return getDatabaseRDBMSType();
      case ComprasPackage.TECHNOLOGY__CONNECTION_STRING:
        return getConnectionString();
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
      case ComprasPackage.TECHNOLOGY__MODULE_TECH:
        getModuleTech().clear();
        getModuleTech().addAll((Collection<? extends ModuleTech>)newValue);
        return;
      case ComprasPackage.TECHNOLOGY__DB_CONNECTOR_SEGMENT_LAYER:
        setDbConnectorSegmentLayer((DbConnectorSegmentLayer)newValue);
        return;
      case ComprasPackage.TECHNOLOGY__DATABASE_RDBMS_TYPE:
        setDatabaseRDBMSType((DatabaseRDBMSType)newValue);
        return;
      case ComprasPackage.TECHNOLOGY__CONNECTION_STRING:
        setConnectionString((String)newValue);
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
      case ComprasPackage.TECHNOLOGY__MODULE_TECH:
        getModuleTech().clear();
        return;
      case ComprasPackage.TECHNOLOGY__DB_CONNECTOR_SEGMENT_LAYER:
        setDbConnectorSegmentLayer((DbConnectorSegmentLayer)null);
        return;
      case ComprasPackage.TECHNOLOGY__DATABASE_RDBMS_TYPE:
        setDatabaseRDBMSType(DATABASE_RDBMS_TYPE_EDEFAULT);
        return;
      case ComprasPackage.TECHNOLOGY__CONNECTION_STRING:
        setConnectionString(CONNECTION_STRING_EDEFAULT);
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
      case ComprasPackage.TECHNOLOGY__MODULE_TECH:
        return moduleTech != null && !moduleTech.isEmpty();
      case ComprasPackage.TECHNOLOGY__DB_CONNECTOR_SEGMENT_LAYER:
        return dbConnectorSegmentLayer != null;
      case ComprasPackage.TECHNOLOGY__DATABASE_RDBMS_TYPE:
        return databaseRDBMSType != DATABASE_RDBMS_TYPE_EDEFAULT;
      case ComprasPackage.TECHNOLOGY__CONNECTION_STRING:
        return CONNECTION_STRING_EDEFAULT == null ? connectionString != null : !CONNECTION_STRING_EDEFAULT.equals(connectionString);
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
    result.append(" (databaseRDBMSType: ");
    result.append(databaseRDBMSType);
    result.append(", connectionString: ");
    result.append(connectionString);
    result.append(')');
    return result.toString();
  }

} //TechnologyImpl
