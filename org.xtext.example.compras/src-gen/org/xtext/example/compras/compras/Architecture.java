/**
 * generated by Xtext 2.17.0
 */
package org.xtext.example.compras.compras;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compras.compras.Architecture#getPresentationLayer <em>Presentation Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.Architecture#getBusinessLayer <em>Business Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.Architecture#getDataAccessLayer <em>Data Access Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.Architecture#getCommonLayer <em>Common Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.Architecture#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.compras.compras.ComprasPackage#getArchitecture()
 * @model
 * @generated
 */
public interface Architecture extends EObject
{
  /**
   * Returns the value of the '<em><b>Presentation Layer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Presentation Layer</em>' containment reference.
   * @see #setPresentationLayer(PresentationLayer)
   * @see org.xtext.example.compras.compras.ComprasPackage#getArchitecture_PresentationLayer()
   * @model containment="true"
   * @generated
   */
  PresentationLayer getPresentationLayer();

  /**
   * Sets the value of the '{@link org.xtext.example.compras.compras.Architecture#getPresentationLayer <em>Presentation Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Presentation Layer</em>' containment reference.
   * @see #getPresentationLayer()
   * @generated
   */
  void setPresentationLayer(PresentationLayer value);

  /**
   * Returns the value of the '<em><b>Business Layer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business Layer</em>' containment reference.
   * @see #setBusinessLayer(BusinessLayer)
   * @see org.xtext.example.compras.compras.ComprasPackage#getArchitecture_BusinessLayer()
   * @model containment="true"
   * @generated
   */
  BusinessLayer getBusinessLayer();

  /**
   * Sets the value of the '{@link org.xtext.example.compras.compras.Architecture#getBusinessLayer <em>Business Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Business Layer</em>' containment reference.
   * @see #getBusinessLayer()
   * @generated
   */
  void setBusinessLayer(BusinessLayer value);

  /**
   * Returns the value of the '<em><b>Data Access Layer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Access Layer</em>' containment reference.
   * @see #setDataAccessLayer(DataAccessLayer)
   * @see org.xtext.example.compras.compras.ComprasPackage#getArchitecture_DataAccessLayer()
   * @model containment="true"
   * @generated
   */
  DataAccessLayer getDataAccessLayer();

  /**
   * Sets the value of the '{@link org.xtext.example.compras.compras.Architecture#getDataAccessLayer <em>Data Access Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Access Layer</em>' containment reference.
   * @see #getDataAccessLayer()
   * @generated
   */
  void setDataAccessLayer(DataAccessLayer value);

  /**
   * Returns the value of the '<em><b>Common Layer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Common Layer</em>' containment reference.
   * @see #setCommonLayer(CommonLayer)
   * @see org.xtext.example.compras.compras.ComprasPackage#getArchitecture_CommonLayer()
   * @model containment="true"
   * @generated
   */
  CommonLayer getCommonLayer();

  /**
   * Sets the value of the '{@link org.xtext.example.compras.compras.Architecture#getCommonLayer <em>Common Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Common Layer</em>' containment reference.
   * @see #getCommonLayer()
   * @generated
   */
  void setCommonLayer(CommonLayer value);

  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference.
   * @see #setRelations(Relations)
   * @see org.xtext.example.compras.compras.ComprasPackage#getArchitecture_Relations()
   * @model containment="true"
   * @generated
   */
  Relations getRelations();

  /**
   * Sets the value of the '{@link org.xtext.example.compras.compras.Architecture#getRelations <em>Relations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relations</em>' containment reference.
   * @see #getRelations()
   * @generated
   */
  void setRelations(Relations value);

} // Architecture