/**
 */
package pcn.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pcn.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pcn.PcnPackage
 * @generated
 */
public class PcnSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PcnPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcnSwitch() {
		if (modelPackage == null) {
			modelPackage = PcnPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PcnPackage.PCN_DIAGRAM: {
				PCNDiagram pcnDiagram = (PCNDiagram)theEObject;
				T result = casePCNDiagram(pcnDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_PROCESS_ENTITY: {
				PCNProcessEntity pcnProcessEntity = (PCNProcessEntity)theEObject;
				T result = casePCNProcessEntity(pcnProcessEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_PROCESS_STEP: {
				PCNProcessStep pcnProcessStep = (PCNProcessStep)theEObject;
				T result = casePCNProcessStep(pcnProcessStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS: {
				PCNProcessStepWithTags pcnProcessStepWithTags = (PCNProcessStepWithTags)theEObject;
				T result = casePCNProcessStepWithTags(pcnProcessStepWithTags);
				if (result == null) result = casePCNProcessStep(pcnProcessStepWithTags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_DEPENDENCY: {
				PCNDependency pcnDependency = (PCNDependency)theEObject;
				T result = casePCNDependency(pcnDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_PROCESS_STEP_DECISION_DEPENDENCY: {
				PCNProcessStepDecisionDependency pcnProcessStepDecisionDependency = (PCNProcessStepDecisionDependency)theEObject;
				T result = casePCNProcessStepDecisionDependency(pcnProcessStepDecisionDependency);
				if (result == null) result = casePCNDependency(pcnProcessStepDecisionDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_PROCESS_STEP_DEPENDENCY: {
				PCNProcessStepDependency pcnProcessStepDependency = (PCNProcessStepDependency)theEObject;
				T result = casePCNProcessStepDependency(pcnProcessStepDependency);
				if (result == null) result = casePCNDependency(pcnProcessStepDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_REFERENCE: {
				PCNReference pcnReference = (PCNReference)theEObject;
				T result = casePCNReference(pcnReference);
				if (result == null) result = casePCNProcessStep(pcnReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_REQUIRED_DEPENDENCY: {
				PCNRequiredDependency pcnRequiredDependency = (PCNRequiredDependency)theEObject;
				T result = casePCNRequiredDependency(pcnRequiredDependency);
				if (result == null) result = casePCNProcessStepDependency(pcnRequiredDependency);
				if (result == null) result = casePCNDependency(pcnRequiredDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_OPTIONAL_DEPENDENCY: {
				PCNOptionalDependency pcnOptionalDependency = (PCNOptionalDependency)theEObject;
				T result = casePCNOptionalDependency(pcnOptionalDependency);
				if (result == null) result = casePCNProcessStepDependency(pcnOptionalDependency);
				if (result == null) result = casePCNDependency(pcnOptionalDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_STANDARD_DEPENDENCY: {
				PCNStandardDependency pcnStandardDependency = (PCNStandardDependency)theEObject;
				T result = casePCNStandardDependency(pcnStandardDependency);
				if (result == null) result = casePCNProcessStepDependency(pcnStandardDependency);
				if (result == null) result = casePCNDependency(pcnStandardDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_START_PROCESS_STEP: {
				PCNStartProcessStep pcnStartProcessStep = (PCNStartProcessStep)theEObject;
				T result = casePCNStartProcessStep(pcnStartProcessStep);
				if (result == null) result = casePCNProcessStepWithTags(pcnStartProcessStep);
				if (result == null) result = casePCNProcessStep(pcnStartProcessStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_END_PROCESS_STEP: {
				PCNEndProcessStep pcnEndProcessStep = (PCNEndProcessStep)theEObject;
				T result = casePCNEndProcessStep(pcnEndProcessStep);
				if (result == null) result = casePCNProcessStepWithTags(pcnEndProcessStep);
				if (result == null) result = casePCNProcessStep(pcnEndProcessStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_STANDARD_PROCESS_STEP: {
				PCNStandardProcessStep pcnStandardProcessStep = (PCNStandardProcessStep)theEObject;
				T result = casePCNStandardProcessStep(pcnStandardProcessStep);
				if (result == null) result = casePCNProcessStepWithTags(pcnStandardProcessStep);
				if (result == null) result = casePCNProcessStep(pcnStandardProcessStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_LONG_PROCESS_STEP: {
				PCNLongProcessStep pcnLongProcessStep = (PCNLongProcessStep)theEObject;
				T result = casePCNLongProcessStep(pcnLongProcessStep);
				if (result == null) result = casePCNProcessStepWithTags(pcnLongProcessStep);
				if (result == null) result = casePCNProcessStep(pcnLongProcessStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_WAIT_PROCESS_STEP: {
				PCNWaitProcessStep pcnWaitProcessStep = (PCNWaitProcessStep)theEObject;
				T result = casePCNWaitProcessStep(pcnWaitProcessStep);
				if (result == null) result = casePCNProcessStepWithTags(pcnWaitProcessStep);
				if (result == null) result = casePCNProcessStep(pcnWaitProcessStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_DECISION_PROCESS_STEP: {
				PCNDecisionProcessStep pcnDecisionProcessStep = (PCNDecisionProcessStep)theEObject;
				T result = casePCNDecisionProcessStep(pcnDecisionProcessStep);
				if (result == null) result = casePCNProcessStepWithTags(pcnDecisionProcessStep);
				if (result == null) result = casePCNProcessStep(pcnDecisionProcessStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_POSITIVE_DECISION: {
				PCNPositiveDecision pcnPositiveDecision = (PCNPositiveDecision)theEObject;
				T result = casePCNPositiveDecision(pcnPositiveDecision);
				if (result == null) result = casePCNProcessStepDecisionDependency(pcnPositiveDecision);
				if (result == null) result = casePCNDependency(pcnPositiveDecision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_NEGATIVE_DECISION: {
				PCNNegativeDecision pcnNegativeDecision = (PCNNegativeDecision)theEObject;
				T result = casePCNNegativeDecision(pcnNegativeDecision);
				if (result == null) result = casePCNProcessStepDecisionDependency(pcnNegativeDecision);
				if (result == null) result = casePCNDependency(pcnNegativeDecision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_TAG: {
				PCNTag pcnTag = (PCNTag)theEObject;
				T result = casePCNTag(pcnTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_MONETARY_TAG: {
				PCNMonetaryTag pcnMonetaryTag = (PCNMonetaryTag)theEObject;
				T result = casePCNMonetaryTag(pcnMonetaryTag);
				if (result == null) result = casePCNTag(pcnMonetaryTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_MONETARY_BENEFIT: {
				PCNMonetaryBenefit pcnMonetaryBenefit = (PCNMonetaryBenefit)theEObject;
				T result = casePCNMonetaryBenefit(pcnMonetaryBenefit);
				if (result == null) result = casePCNMonetaryTag(pcnMonetaryBenefit);
				if (result == null) result = casePCNTag(pcnMonetaryBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_MONETARY_COST: {
				PCNMonetaryCost pcnMonetaryCost = (PCNMonetaryCost)theEObject;
				T result = casePCNMonetaryCost(pcnMonetaryCost);
				if (result == null) result = casePCNMonetaryTag(pcnMonetaryCost);
				if (result == null) result = casePCNTag(pcnMonetaryCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_NON_MONETARY_TAG: {
				PCNNonMonetaryTag pcnNonMonetaryTag = (PCNNonMonetaryTag)theEObject;
				T result = casePCNNonMonetaryTag(pcnNonMonetaryTag);
				if (result == null) result = casePCNTag(pcnNonMonetaryTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_NON_MONETARY_BENEFIT: {
				PCNNonMonetaryBenefit pcnNonMonetaryBenefit = (PCNNonMonetaryBenefit)theEObject;
				T result = casePCNNonMonetaryBenefit(pcnNonMonetaryBenefit);
				if (result == null) result = casePCNNonMonetaryTag(pcnNonMonetaryBenefit);
				if (result == null) result = casePCNTag(pcnNonMonetaryBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_NON_MONETARY_COST: {
				PCNNonMonetaryCost pcnNonMonetaryCost = (PCNNonMonetaryCost)theEObject;
				T result = casePCNNonMonetaryCost(pcnNonMonetaryCost);
				if (result == null) result = casePCNNonMonetaryTag(pcnNonMonetaryCost);
				if (result == null) result = casePCNTag(pcnNonMonetaryCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNDiagram(PCNDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Process Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Process Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNProcessEntity(PCNProcessEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Process Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNProcessStep(PCNProcessStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Process Step With Tags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Process Step With Tags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNProcessStepWithTags(PCNProcessStepWithTags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNDependency(PCNDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Process Step Decision Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Process Step Decision Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNProcessStepDecisionDependency(PCNProcessStepDecisionDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Process Step Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Process Step Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNProcessStepDependency(PCNProcessStepDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNReference(PCNReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Required Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Required Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNRequiredDependency(PCNRequiredDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Optional Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Optional Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNOptionalDependency(PCNOptionalDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Standard Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Standard Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNStandardDependency(PCNStandardDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Start Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Start Process Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNStartProcessStep(PCNStartProcessStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN End Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN End Process Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNEndProcessStep(PCNEndProcessStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Standard Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Standard Process Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNStandardProcessStep(PCNStandardProcessStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Long Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Long Process Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNLongProcessStep(PCNLongProcessStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Wait Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Wait Process Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNWaitProcessStep(PCNWaitProcessStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Decision Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Decision Process Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNDecisionProcessStep(PCNDecisionProcessStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Positive Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Positive Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNPositiveDecision(PCNPositiveDecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Negative Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Negative Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNNegativeDecision(PCNNegativeDecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNTag(PCNTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Monetary Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Monetary Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNMonetaryTag(PCNMonetaryTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Monetary Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Monetary Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNMonetaryBenefit(PCNMonetaryBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Monetary Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Monetary Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNMonetaryCost(PCNMonetaryCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Non Monetary Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Non Monetary Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNNonMonetaryTag(PCNNonMonetaryTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Non Monetary Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Non Monetary Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNNonMonetaryBenefit(PCNNonMonetaryBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Non Monetary Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Non Monetary Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNNonMonetaryCost(PCNNonMonetaryCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PcnSwitch
