/**
 * generated by Xtext 2.17.0
 */
package org.xtext.example.compras.compras;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Access Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compras.compras.DataAccessLayer#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.DataAccessLayer#getDbConnectorSegmentLayer <em>Db Connector Segment Layer</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.compras.compras.ComprasPackage#getDataAccessLayer()
 * @model
 * @generated
 */
public interface DataAccessLayer extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.compras.compras.ComprasPackage#getDataAccessLayer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.compras.compras.DataAccessLayer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Db Connector Segment Layer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Connector Segment Layer</em>' containment reference.
   * @see #setDbConnectorSegmentLayer(DbConnectorSegmentLayer)
   * @see org.xtext.example.compras.compras.ComprasPackage#getDataAccessLayer_DbConnectorSegmentLayer()
   * @model containment="true"
   * @generated
   */
  DbConnectorSegmentLayer getDbConnectorSegmentLayer();

  /**
   * Sets the value of the '{@link org.xtext.example.compras.compras.DataAccessLayer#getDbConnectorSegmentLayer <em>Db Connector Segment Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Connector Segment Layer</em>' containment reference.
   * @see #getDbConnectorSegmentLayer()
   * @generated
   */
  void setDbConnectorSegmentLayer(DbConnectorSegmentLayer value);

} // DataAccessLayer