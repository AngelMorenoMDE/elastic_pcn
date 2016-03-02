/**
 */
package pcn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCN Process Step With Tags</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcn.PCNProcessStepWithTags#getNonMonetaryBenefits <em>Non Monetary Benefits</em>}</li>
 *   <li>{@link pcn.PCNProcessStepWithTags#getNonMonetaryCosts <em>Non Monetary Costs</em>}</li>
 *   <li>{@link pcn.PCNProcessStepWithTags#getMonetaryBenefits <em>Monetary Benefits</em>}</li>
 *   <li>{@link pcn.PCNProcessStepWithTags#getMonetaryCosts <em>Monetary Costs</em>}</li>
 * </ul>
 *
 * @see pcn.PcnPackage#getPCNProcessStepWithTags()
 * @model abstract="true"
 * @generated
 */
public interface PCNProcessStepWithTags extends PCNProcessStep {
	/**
	 * Returns the value of the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNNonMonetaryBenefit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Monetary Benefits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Monetary Benefits</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessStepWithTags_NonMonetaryBenefits()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNNonMonetaryBenefit> getNonMonetaryBenefits();

	/**
	 * Returns the value of the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNNonMonetaryCost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Monetary Costs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Monetary Costs</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessStepWithTags_NonMonetaryCosts()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNNonMonetaryCost> getNonMonetaryCosts();

	/**
	 * Returns the value of the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNMonetaryBenefit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monetary Benefits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monetary Benefits</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessStepWithTags_MonetaryBenefits()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNMonetaryBenefit> getMonetaryBenefits();

	/**
	 * Returns the value of the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNMonetaryCost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monetary Costs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monetary Costs</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessStepWithTags_MonetaryCosts()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNMonetaryCost> getMonetaryCosts();

} // PCNProcessStepWithTags
