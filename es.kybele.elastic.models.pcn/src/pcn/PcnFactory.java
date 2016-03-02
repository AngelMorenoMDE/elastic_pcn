/**
 */
package pcn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pcn.PcnPackage
 * @generated
 */
public interface PcnFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcnFactory eINSTANCE = pcn.impl.PcnFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PCN Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Diagram</em>'.
	 * @generated
	 */
	PCNDiagram createPCNDiagram();

	/**
	 * Returns a new object of class '<em>PCN Process Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Process Entity</em>'.
	 * @generated
	 */
	PCNProcessEntity createPCNProcessEntity();

	/**
	 * Returns a new object of class '<em>PCN Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Reference</em>'.
	 * @generated
	 */
	PCNReference createPCNReference();

	/**
	 * Returns a new object of class '<em>PCN Required Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Required Dependency</em>'.
	 * @generated
	 */
	PCNRequiredDependency createPCNRequiredDependency();

	/**
	 * Returns a new object of class '<em>PCN Optional Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Optional Dependency</em>'.
	 * @generated
	 */
	PCNOptionalDependency createPCNOptionalDependency();

	/**
	 * Returns a new object of class '<em>PCN Standard Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Standard Dependency</em>'.
	 * @generated
	 */
	PCNStandardDependency createPCNStandardDependency();

	/**
	 * Returns a new object of class '<em>PCN Start Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Start Process Step</em>'.
	 * @generated
	 */
	PCNStartProcessStep createPCNStartProcessStep();

	/**
	 * Returns a new object of class '<em>PCN End Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN End Process Step</em>'.
	 * @generated
	 */
	PCNEndProcessStep createPCNEndProcessStep();

	/**
	 * Returns a new object of class '<em>PCN Standard Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Standard Process Step</em>'.
	 * @generated
	 */
	PCNStandardProcessStep createPCNStandardProcessStep();

	/**
	 * Returns a new object of class '<em>PCN Long Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Long Process Step</em>'.
	 * @generated
	 */
	PCNLongProcessStep createPCNLongProcessStep();

	/**
	 * Returns a new object of class '<em>PCN Wait Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Wait Process Step</em>'.
	 * @generated
	 */
	PCNWaitProcessStep createPCNWaitProcessStep();

	/**
	 * Returns a new object of class '<em>PCN Decision Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Decision Process Step</em>'.
	 * @generated
	 */
	PCNDecisionProcessStep createPCNDecisionProcessStep();

	/**
	 * Returns a new object of class '<em>PCN Positive Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Positive Decision</em>'.
	 * @generated
	 */
	PCNPositiveDecision createPCNPositiveDecision();

	/**
	 * Returns a new object of class '<em>PCN Negative Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Negative Decision</em>'.
	 * @generated
	 */
	PCNNegativeDecision createPCNNegativeDecision();

	/**
	 * Returns a new object of class '<em>PCN Monetary Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Monetary Tag</em>'.
	 * @generated
	 */
	PCNMonetaryTag createPCNMonetaryTag();

	/**
	 * Returns a new object of class '<em>PCN Monetary Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Monetary Benefit</em>'.
	 * @generated
	 */
	PCNMonetaryBenefit createPCNMonetaryBenefit();

	/**
	 * Returns a new object of class '<em>PCN Monetary Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Monetary Cost</em>'.
	 * @generated
	 */
	PCNMonetaryCost createPCNMonetaryCost();

	/**
	 * Returns a new object of class '<em>PCN Non Monetary Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Non Monetary Tag</em>'.
	 * @generated
	 */
	PCNNonMonetaryTag createPCNNonMonetaryTag();

	/**
	 * Returns a new object of class '<em>PCN Non Monetary Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Non Monetary Benefit</em>'.
	 * @generated
	 */
	PCNNonMonetaryBenefit createPCNNonMonetaryBenefit();

	/**
	 * Returns a new object of class '<em>PCN Non Monetary Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Non Monetary Cost</em>'.
	 * @generated
	 */
	PCNNonMonetaryCost createPCNNonMonetaryCost();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PcnPackage getPcnPackage();

} //PcnFactory
