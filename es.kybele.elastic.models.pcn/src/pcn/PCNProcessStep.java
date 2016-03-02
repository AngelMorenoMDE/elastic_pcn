/**
 */
package pcn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCN Process Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcn.PCNProcessStep#getTags <em>Tags</em>}</li>
 *   <li>{@link pcn.PCNProcessStep#getAction <em>Action</em>}</li>
 *   <li>{@link pcn.PCNProcessStep#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see pcn.PcnPackage#getPCNProcessStep()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PCNProcessStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessStep_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNTag> getTags();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see pcn.PcnPackage#getPCNProcessStep_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link pcn.PCNProcessStep#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' attribute.
	 * @see #setPredicate(String)
	 * @see pcn.PcnPackage#getPCNProcessStep_Predicate()
	 * @model
	 * @generated
	 */
	String getPredicate();

	/**
	 * Sets the value of the '{@link pcn.PCNProcessStep#getPredicate <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' attribute.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(String value);

} // PCNProcessStep
