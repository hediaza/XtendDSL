/**
 * generated by Xtext 2.17.0
 */
package org.xtext.example.compras.compras;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compras.compras.EntityField#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.EntityField#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.compras.compras.ComprasPackage#getEntityField()
 * @model
 * @generated
 */
public interface EntityField extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Type</em>' containment reference.
   * @see #setEntityType(EntityType)
   * @see org.xtext.example.compras.compras.ComprasPackage#getEntityField_EntityType()
   * @model containment="true"
   * @generated
   */
  EntityType getEntityType();

  /**
   * Sets the value of the '{@link org.xtext.example.compras.compras.EntityField#getEntityType <em>Entity Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Type</em>' containment reference.
   * @see #getEntityType()
   * @generated
   */
  void setEntityType(EntityType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.compras.compras.ComprasPackage#getEntityField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.compras.compras.EntityField#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // EntityField
