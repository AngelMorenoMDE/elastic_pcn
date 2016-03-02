/**
 */
package pcn.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pcn.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pcn.PcnPackage
 * @generated
 */
public class PcnAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PcnPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcnAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PcnPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PcnSwitch<Adapter> modelSwitch =
		new PcnSwitch<Adapter>() {
			@Override
			public Adapter casePCNDiagram(PCNDiagram object) {
				return createPCNDiagramAdapter();
			}
			@Override
			public Adapter casePCNProcessEntity(PCNProcessEntity object) {
				return createPCNProcessEntityAdapter();
			}
			@Override
			public Adapter casePCNProcessStep(PCNProcessStep object) {
				return createPCNProcessStepAdapter();
			}
			@Override
			public Adapter casePCNProcessStepWithTags(PCNProcessStepWithTags object) {
				return createPCNProcessStepWithTagsAdapter();
			}
			@Override
			public Adapter casePCNDependency(PCNDependency object) {
				return createPCNDependencyAdapter();
			}
			@Override
			public Adapter casePCNProcessStepDecisionDependency(PCNProcessStepDecisionDependency object) {
				return createPCNProcessStepDecisionDependencyAdapter();
			}
			@Override
			public Adapter casePCNProcessStepDependency(PCNProcessStepDependency object) {
				return createPCNProcessStepDependencyAdapter();
			}
			@Override
			public Adapter casePCNReference(PCNReference object) {
				return createPCNReferenceAdapter();
			}
			@Override
			public Adapter casePCNRequiredDependency(PCNRequiredDependency object) {
				return createPCNRequiredDependencyAdapter();
			}
			@Override
			public Adapter casePCNOptionalDependency(PCNOptionalDependency object) {
				return createPCNOptionalDependencyAdapter();
			}
			@Override
			public Adapter casePCNStandardDependency(PCNStandardDependency object) {
				return createPCNStandardDependencyAdapter();
			}
			@Override
			public Adapter casePCNStartProcessStep(PCNStartProcessStep object) {
				return createPCNStartProcessStepAdapter();
			}
			@Override
			public Adapter casePCNEndProcessStep(PCNEndProcessStep object) {
				return createPCNEndProcessStepAdapter();
			}
			@Override
			public Adapter casePCNStandardProcessStep(PCNStandardProcessStep object) {
				return createPCNStandardProcessStepAdapter();
			}
			@Override
			public Adapter casePCNLongProcessStep(PCNLongProcessStep object) {
				return createPCNLongProcessStepAdapter();
			}
			@Override
			public Adapter casePCNWaitProcessStep(PCNWaitProcessStep object) {
				return createPCNWaitProcessStepAdapter();
			}
			@Override
			public Adapter casePCNDecisionProcessStep(PCNDecisionProcessStep object) {
				return createPCNDecisionProcessStepAdapter();
			}
			@Override
			public Adapter casePCNPositiveDecision(PCNPositiveDecision object) {
				return createPCNPositiveDecisionAdapter();
			}
			@Override
			public Adapter casePCNNegativeDecision(PCNNegativeDecision object) {
				return createPCNNegativeDecisionAdapter();
			}
			@Override
			public Adapter casePCNTag(PCNTag object) {
				return createPCNTagAdapter();
			}
			@Override
			public Adapter casePCNMonetaryTag(PCNMonetaryTag object) {
				return createPCNMonetaryTagAdapter();
			}
			@Override
			public Adapter casePCNMonetaryBenefit(PCNMonetaryBenefit object) {
				return createPCNMonetaryBenefitAdapter();
			}
			@Override
			public Adapter casePCNMonetaryCost(PCNMonetaryCost object) {
				return createPCNMonetaryCostAdapter();
			}
			@Override
			public Adapter casePCNNonMonetaryTag(PCNNonMonetaryTag object) {
				return createPCNNonMonetaryTagAdapter();
			}
			@Override
			public Adapter casePCNNonMonetaryBenefit(PCNNonMonetaryBenefit object) {
				return createPCNNonMonetaryBenefitAdapter();
			}
			@Override
			public Adapter casePCNNonMonetaryCost(PCNNonMonetaryCost object) {
				return createPCNNonMonetaryCostAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNDiagram <em>PCN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNDiagram
	 * @generated
	 */
	public Adapter createPCNDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNProcessEntity <em>PCN Process Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNProcessEntity
	 * @generated
	 */
	public Adapter createPCNProcessEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNProcessStep <em>PCN Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNProcessStep
	 * @generated
	 */
	public Adapter createPCNProcessStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNProcessStepWithTags <em>PCN Process Step With Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNProcessStepWithTags
	 * @generated
	 */
	public Adapter createPCNProcessStepWithTagsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNDependency <em>PCN Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNDependency
	 * @generated
	 */
	public Adapter createPCNDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNProcessStepDecisionDependency <em>PCN Process Step Decision Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNProcessStepDecisionDependency
	 * @generated
	 */
	public Adapter createPCNProcessStepDecisionDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNProcessStepDependency <em>PCN Process Step Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNProcessStepDependency
	 * @generated
	 */
	public Adapter createPCNProcessStepDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNReference <em>PCN Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNReference
	 * @generated
	 */
	public Adapter createPCNReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNRequiredDependency <em>PCN Required Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNRequiredDependency
	 * @generated
	 */
	public Adapter createPCNRequiredDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNOptionalDependency <em>PCN Optional Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNOptionalDependency
	 * @generated
	 */
	public Adapter createPCNOptionalDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNStandardDependency <em>PCN Standard Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNStandardDependency
	 * @generated
	 */
	public Adapter createPCNStandardDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNStartProcessStep <em>PCN Start Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNStartProcessStep
	 * @generated
	 */
	public Adapter createPCNStartProcessStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNEndProcessStep <em>PCN End Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNEndProcessStep
	 * @generated
	 */
	public Adapter createPCNEndProcessStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNStandardProcessStep <em>PCN Standard Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNStandardProcessStep
	 * @generated
	 */
	public Adapter createPCNStandardProcessStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNLongProcessStep <em>PCN Long Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNLongProcessStep
	 * @generated
	 */
	public Adapter createPCNLongProcessStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNWaitProcessStep <em>PCN Wait Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNWaitProcessStep
	 * @generated
	 */
	public Adapter createPCNWaitProcessStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNDecisionProcessStep <em>PCN Decision Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNDecisionProcessStep
	 * @generated
	 */
	public Adapter createPCNDecisionProcessStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNPositiveDecision <em>PCN Positive Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNPositiveDecision
	 * @generated
	 */
	public Adapter createPCNPositiveDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNNegativeDecision <em>PCN Negative Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNNegativeDecision
	 * @generated
	 */
	public Adapter createPCNNegativeDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNTag <em>PCN Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNTag
	 * @generated
	 */
	public Adapter createPCNTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNMonetaryTag <em>PCN Monetary Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNMonetaryTag
	 * @generated
	 */
	public Adapter createPCNMonetaryTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNMonetaryBenefit <em>PCN Monetary Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNMonetaryBenefit
	 * @generated
	 */
	public Adapter createPCNMonetaryBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNMonetaryCost <em>PCN Monetary Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNMonetaryCost
	 * @generated
	 */
	public Adapter createPCNMonetaryCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNNonMonetaryTag <em>PCN Non Monetary Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNNonMonetaryTag
	 * @generated
	 */
	public Adapter createPCNNonMonetaryTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNNonMonetaryBenefit <em>PCN Non Monetary Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNNonMonetaryBenefit
	 * @generated
	 */
	public Adapter createPCNNonMonetaryBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNNonMonetaryCost <em>PCN Non Monetary Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNNonMonetaryCost
	 * @generated
	 */
	public Adapter createPCNNonMonetaryCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PcnAdapterFactory
