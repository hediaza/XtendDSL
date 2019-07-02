/**
 * generated by Xtext 2.18.0
 */
package org.xtext.example.compras.compras;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compras.compras.PresentationLayer#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.PresentationLayer#getControllerSegmentLayer <em>Controller Segment Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.PresentationLayer#getViewSegmentLayer <em>View Segment Layer</em>}</li>
 *   <li>{@link org.xtext.example.compras.compras.PresentationLayer#getScriptegmentLayer <em>Scriptegment Layer</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.compras.compras.ComprasPackage#getPresentationLayer()
 * @model
 * @generated
 */
public interface PresentationLayer extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.compras.compras.ComprasPackage#getPresentationLayer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.compras.compras.PresentationLayer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Controller Segment Layer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controller Segment Layer</em>' containment reference.
   * @see #setControllerSegmentLayer(ControllerSegmentLayer)
   * @see org.xtext.example.compras.compras.ComprasPackage#getPresentationLayer_ControllerSegmentLayer()
   * @model containment="true"
   * @generated
   */
  ControllerSegmentLayer getControllerSegmentLayer();

  /**
   * Sets the value of the '{@link org.xtext.example.compras.compras.PresentationLayer#getControllerSegmentLayer <em>Controller Segment Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Controller Segment Layer</em>' containment reference.
   * @see #getControllerSegmentLayer()
   * @generated
   */
  void setControllerSegmentLayer(ControllerSegmentLayer value);

  /**
   * Returns the value of the '<em><b>View Segment Layer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Segment Layer</em>' containment reference.
   * @see #setViewSegmentLayer(ViewSegmentLayer)
   * @see org.xtext.example.compras.compras.ComprasPackage#getPresentationLayer_ViewSegmentLayer()
   * @model containment="true"
   * @generated
   */
  ViewSegmentLayer getViewSegmentLayer();

  /**
   * Sets the value of the '{@link org.xtext.example.compras.compras.PresentationLayer#getViewSegmentLayer <em>View Segment Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View Segment Layer</em>' containment reference.
   * @see #getViewSegmentLayer()
   * @generated
   */
  void setViewSegmentLayer(ViewSegmentLayer value);

  /**
   * Returns the value of the '<em><b>Scriptegment Layer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scriptegment Layer</em>' containment reference.
   * @see #setScriptegmentLayer(ScriptSegmentLayer)
   * @see org.xtext.example.compras.compras.ComprasPackage#getPresentationLayer_ScriptegmentLayer()
   * @model containment="true"
   * @generated
   */
  ScriptSegmentLayer getScriptegmentLayer();

  /**
   * Sets the value of the '{@link org.xtext.example.compras.compras.PresentationLayer#getScriptegmentLayer <em>Scriptegment Layer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scriptegment Layer</em>' containment reference.
   * @see #getScriptegmentLayer()
   * @generated
   */
  void setScriptegmentLayer(ScriptSegmentLayer value);

} // PresentationLayer
