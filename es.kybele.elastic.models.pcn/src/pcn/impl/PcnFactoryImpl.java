/**
 */
package pcn.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcn.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcnFactoryImpl extends EFactoryImpl implements PcnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcnFactory init() {
		try {
			PcnFactory thePcnFactory = (PcnFactory)EPackage.Registry.INSTANCE.getEFactory(PcnPackage.eNS_URI);
			if (thePcnFactory != null) {
				return thePcnFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PcnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcnFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PcnPackage.PCN_DIAGRAM: return createPCNDiagram();
			case PcnPackage.PCN_PROCESS_ENTITY: return createPCNProcessEntity();
			case PcnPackage.PCN_REFERENCE: return createPCNReference();
			case PcnPackage.PCN_REQUIRED_DEPENDENCY: return createPCNRequiredDependency();
			case PcnPackage.PCN_OPTIONAL_DEPENDENCY: return createPCNOptionalDependency();
			case PcnPackage.PCN_STANDARD_DEPENDENCY: return createPCNStandardDependency();
			case PcnPackage.PCN_START_PROCESS_STEP: return createPCNStartProcessStep();
			case PcnPackage.PCN_END_PROCESS_STEP: return createPCNEndProcessStep();
			case PcnPackage.PCN_STANDARD_PROCESS_STEP: return createPCNStandardProcessStep();
			case PcnPackage.PCN_LONG_PROCESS_STEP: return createPCNLongProcessStep();
			case PcnPackage.PCN_WAIT_PROCESS_STEP: return createPCNWaitProcessStep();
			case PcnPackage.PCN_DECISION_PROCESS_STEP: return createPCNDecisionProcessStep();
			case PcnPackage.PCN_POSITIVE_DECISION: return createPCNPositiveDecision();
			case PcnPackage.PCN_NEGATIVE_DECISION: return createPCNNegativeDecision();
			case PcnPackage.PCN_MONETARY_TAG: return createPCNMonetaryTag();
			case PcnPackage.PCN_MONETARY_BENEFIT: return createPCNMonetaryBenefit();
			case PcnPackage.PCN_MONETARY_COST: return createPCNMonetaryCost();
			case PcnPackage.PCN_NON_MONETARY_TAG: return createPCNNonMonetaryTag();
			case PcnPackage.PCN_NON_MONETARY_BENEFIT: return createPCNNonMonetaryBenefit();
			case PcnPackage.PCN_NON_MONETARY_COST: return createPCNNonMonetaryCost();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNDiagram createPCNDiagram() {
		PCNDiagramImpl pcnDiagram = new PCNDiagramImpl();
		return pcnDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProcessEntity createPCNProcessEntity() {
		PCNProcessEntityImpl pcnProcessEntity = new PCNProcessEntityImpl();
		return pcnProcessEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNReference createPCNReference() {
		PCNReferenceImpl pcnReference = new PCNReferenceImpl();
		return pcnReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNRequiredDependency createPCNRequiredDependency() {
		PCNRequiredDependencyImpl pcnRequiredDependency = new PCNRequiredDependencyImpl();
		return pcnRequiredDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNOptionalDependency createPCNOptionalDependency() {
		PCNOptionalDependencyImpl pcnOptionalDependency = new PCNOptionalDependencyImpl();
		return pcnOptionalDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNStandardDependency createPCNStandardDependency() {
		PCNStandardDependencyImpl pcnStandardDependency = new PCNStandardDependencyImpl();
		return pcnStandardDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNStartProcessStep createPCNStartProcessStep() {
		PCNStartProcessStepImpl pcnStartProcessStep = new PCNStartProcessStepImpl();
		return pcnStartProcessStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNEndProcessStep createPCNEndProcessStep() {
		PCNEndProcessStepImpl pcnEndProcessStep = new PCNEndProcessStepImpl();
		return pcnEndProcessStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNStandardProcessStep createPCNStandardProcessStep() {
		PCNStandardProcessStepImpl pcnStandardProcessStep = new PCNStandardProcessStepImpl();
		return pcnStandardProcessStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNLongProcessStep createPCNLongProcessStep() {
		PCNLongProcessStepImpl pcnLongProcessStep = new PCNLongProcessStepImpl();
		return pcnLongProcessStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNWaitProcessStep createPCNWaitProcessStep() {
		PCNWaitProcessStepImpl pcnWaitProcessStep = new PCNWaitProcessStepImpl();
		return pcnWaitProcessStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNDecisionProcessStep createPCNDecisionProcessStep() {
		PCNDecisionProcessStepImpl pcnDecisionProcessStep = new PCNDecisionProcessStepImpl();
		return pcnDecisionProcessStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNPositiveDecision createPCNPositiveDecision() {
		PCNPositiveDecisionImpl pcnPositiveDecision = new PCNPositiveDecisionImpl();
		return pcnPositiveDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNNegativeDecision createPCNNegativeDecision() {
		PCNNegativeDecisionImpl pcnNegativeDecision = new PCNNegativeDecisionImpl();
		return pcnNegativeDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNMonetaryTag createPCNMonetaryTag() {
		PCNMonetaryTagImpl pcnMonetaryTag = new PCNMonetaryTagImpl();
		return pcnMonetaryTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNMonetaryBenefit createPCNMonetaryBenefit() {
		PCNMonetaryBenefitImpl pcnMonetaryBenefit = new PCNMonetaryBenefitImpl();
		return pcnMonetaryBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNMonetaryCost createPCNMonetaryCost() {
		PCNMonetaryCostImpl pcnMonetaryCost = new PCNMonetaryCostImpl();
		return pcnMonetaryCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNNonMonetaryTag createPCNNonMonetaryTag() {
		PCNNonMonetaryTagImpl pcnNonMonetaryTag = new PCNNonMonetaryTagImpl();
		return pcnNonMonetaryTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNNonMonetaryBenefit createPCNNonMonetaryBenefit() {
		PCNNonMonetaryBenefitImpl pcnNonMonetaryBenefit = new PCNNonMonetaryBenefitImpl();
		return pcnNonMonetaryBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNNonMonetaryCost createPCNNonMonetaryCost() {
		PCNNonMonetaryCostImpl pcnNonMonetaryCost = new PCNNonMonetaryCostImpl();
		return pcnNonMonetaryCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcnPackage getPcnPackage() {
		return (PcnPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PcnPackage getPackage() {
		return PcnPackage.eINSTANCE;
	}

} //PcnFactoryImpl
