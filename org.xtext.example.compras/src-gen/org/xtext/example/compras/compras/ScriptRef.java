/**
 * generated by Xtext 2.18.0
 */
package org.xtext.example.compras.compras;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compras.compras.ScriptRef#getFunctionality <em>Functionality</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.compras.compras.ComprasPackage#getScriptRef()
 * @model
 * @generated
 */
public interface ScriptRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Functionality</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functionality</em>' reference.
   * @see #setFunctionality(Functionality)
   * @see org.xtext.example.compras.compras.ComprasPackage#getScriptRef_Functionality()
   * @model
   * @generated
   */
  Functionality getFunctionality();

  /**
   * Sets the value of the '{@link org.xtext.example.compras.compras.ScriptRef#getFunctionality <em>Functionality</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functionality</em>' reference.
   * @see #getFunctionality()
   * @generated
   */
  void setFunctionality(Functionality value);

} // ScriptRef
