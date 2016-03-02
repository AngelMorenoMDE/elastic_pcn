/**
 */
package pcn.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pcn.PCNDecisionProcessStep;
import pcn.PCNDependency;
import pcn.PCNDiagram;
import pcn.PCNEndProcessStep;
import pcn.PCNLongProcessStep;
import pcn.PCNMonetaryBenefit;
import pcn.PCNMonetaryCost;
import pcn.PCNMonetaryTag;
import pcn.PCNNegativeDecision;
import pcn.PCNNonMonetaryBenefit;
import pcn.PCNNonMonetaryCost;
import pcn.PCNNonMonetaryTag;
import pcn.PCNOptionalDependency;
import pcn.PCNPositiveDecision;
import pcn.PCNProcessEntity;
import pcn.PCNProcessStep;
import pcn.PCNProcessStepDecisionDependency;
import pcn.PCNProcessStepDependency;
import pcn.PCNProcessStepWithTags;
import pcn.PCNReference;
import pcn.PCNRequiredDependency;
import pcn.PCNStandardDependency;
import pcn.PCNStandardProcessStep;
import pcn.PCNStartProcessStep;
import pcn.PCNTag;
import pcn.PCNWaitProcessStep;
import pcn.PcnFactory;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcnPackageImpl extends EPackageImpl implements PcnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnProcessEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnProcessStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnProcessStepWithTagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnProcessStepDecisionDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnProcessStepDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnRequiredDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnOptionalDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnStandardDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnStartProcessStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnEndProcessStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnStandardProcessStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnLongProcessStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnWaitProcessStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnDecisionProcessStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnPositiveDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnNegativeDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnMonetaryTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnMonetaryBenefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnMonetaryCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnNonMonetaryTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnNonMonetaryBenefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnNonMonetaryCostEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pcn.PcnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PcnPackageImpl() {
		super(eNS_URI, PcnFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PcnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PcnPackage init() {
		if (isInited) return (PcnPackage)EPackage.Registry.INSTANCE.getEPackage(PcnPackage.eNS_URI);

		// Obtain or create and register package
		PcnPackageImpl thePcnPackage = (PcnPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PcnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PcnPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePcnPackage.createPackageContents();

		// Initialize created meta-data
		thePcnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePcnPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PcnPackage.eNS_URI, thePcnPackage);
		return thePcnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNDiagram() {
		return pcnDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNDiagram_DiagramEntities() {
		return (EReference)pcnDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNDiagram_DiagramDependencies() {
		return (EReference)pcnDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNProcessEntity() {
		return pcnProcessEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNProcessEntity_Name() {
		return (EAttribute)pcnProcessEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNProcessEntity_Order() {
		return (EAttribute)pcnProcessEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessEntity_BackEntity() {
		return (EReference)pcnProcessEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessEntity_NextEntity() {
		return (EReference)pcnProcessEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessEntity_LeftDirectInteractions() {
		return (EReference)pcnProcessEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessEntity_LeftSurrogateInteractions() {
		return (EReference)pcnProcessEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessEntity_CenterIndependentInteractionsActivities() {
		return (EReference)pcnProcessEntityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessEntity_RightSurrogateInteractions() {
		return (EReference)pcnProcessEntityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessEntity_RightDirectInteractions() {
		return (EReference)pcnProcessEntityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPCNProcessEntity__GetDirectInteractions() {
		return pcnProcessEntityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPCNProcessEntity__GetSurrogateInteractions() {
		return pcnProcessEntityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPCNProcessEntity__GetIndependentInteractios() {
		return pcnProcessEntityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNProcessStep() {
		return pcnProcessStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStep_Tags() {
		return (EReference)pcnProcessStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNProcessStep_Action() {
		return (EAttribute)pcnProcessStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNProcessStep_Predicate() {
		return (EAttribute)pcnProcessStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNProcessStepWithTags() {
		return pcnProcessStepWithTagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepWithTags_NonMonetaryBenefits() {
		return (EReference)pcnProcessStepWithTagsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepWithTags_NonMonetaryCosts() {
		return (EReference)pcnProcessStepWithTagsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepWithTags_MonetaryBenefits() {
		return (EReference)pcnProcessStepWithTagsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepWithTags_MonetaryCosts() {
		return (EReference)pcnProcessStepWithTagsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNDependency() {
		return pcnDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNDependency_InDiagram() {
		return (EReference)pcnDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNProcessStepDecisionDependency() {
		return pcnProcessStepDecisionDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepDecisionDependency_SourceProcessStepDecision() {
		return (EReference)pcnProcessStepDecisionDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepDecisionDependency_TargetProcessStep() {
		return (EReference)pcnProcessStepDecisionDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNProcessStepDependency() {
		return pcnProcessStepDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepDependency_SourceProcessStep() {
		return (EReference)pcnProcessStepDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepDependency_TargetProcessStep() {
		return (EReference)pcnProcessStepDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNReference() {
		return pcnReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNReference_Letter() {
		return (EAttribute)pcnReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNReference_Number() {
		return (EAttribute)pcnReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNRequiredDependency() {
		return pcnRequiredDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNOptionalDependency() {
		return pcnOptionalDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNStandardDependency() {
		return pcnStandardDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNStartProcessStep() {
		return pcnStartProcessStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNEndProcessStep() {
		return pcnEndProcessStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNStandardProcessStep() {
		return pcnStandardProcessStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNLongProcessStep() {
		return pcnLongProcessStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNWaitProcessStep() {
		return pcnWaitProcessStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNDecisionProcessStep() {
		return pcnDecisionProcessStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNPositiveDecision() {
		return pcnPositiveDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNNegativeDecision() {
		return pcnNegativeDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNTag() {
		return pcnTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNMonetaryTag() {
		return pcnMonetaryTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNMonetaryBenefit() {
		return pcnMonetaryBenefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNMonetaryCost() {
		return pcnMonetaryCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNNonMonetaryTag() {
		return pcnNonMonetaryTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNNonMonetaryBenefit() {
		return pcnNonMonetaryBenefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNNonMonetaryCost() {
		return pcnNonMonetaryCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcnFactory getPcnFactory() {
		return (PcnFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pcnDiagramEClass = createEClass(PCN_DIAGRAM);
		createEReference(pcnDiagramEClass, PCN_DIAGRAM__DIAGRAM_ENTITIES);
		createEReference(pcnDiagramEClass, PCN_DIAGRAM__DIAGRAM_DEPENDENCIES);

		pcnProcessEntityEClass = createEClass(PCN_PROCESS_ENTITY);
		createEAttribute(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__NAME);
		createEAttribute(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__ORDER);
		createEReference(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__BACK_ENTITY);
		createEReference(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__NEXT_ENTITY);
		createEReference(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS);
		createEReference(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS);
		createEReference(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES);
		createEReference(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS);
		createEReference(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS);
		createEOperation(pcnProcessEntityEClass, PCN_PROCESS_ENTITY___GET_DIRECT_INTERACTIONS);
		createEOperation(pcnProcessEntityEClass, PCN_PROCESS_ENTITY___GET_SURROGATE_INTERACTIONS);
		createEOperation(pcnProcessEntityEClass, PCN_PROCESS_ENTITY___GET_INDEPENDENT_INTERACTIOS);

		pcnProcessStepEClass = createEClass(PCN_PROCESS_STEP);
		createEReference(pcnProcessStepEClass, PCN_PROCESS_STEP__TAGS);
		createEAttribute(pcnProcessStepEClass, PCN_PROCESS_STEP__ACTION);
		createEAttribute(pcnProcessStepEClass, PCN_PROCESS_STEP__PREDICATE);

		pcnProcessStepWithTagsEClass = createEClass(PCN_PROCESS_STEP_WITH_TAGS);
		createEReference(pcnProcessStepWithTagsEClass, PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS);
		createEReference(pcnProcessStepWithTagsEClass, PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS);
		createEReference(pcnProcessStepWithTagsEClass, PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS);
		createEReference(pcnProcessStepWithTagsEClass, PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS);

		pcnDependencyEClass = createEClass(PCN_DEPENDENCY);
		createEReference(pcnDependencyEClass, PCN_DEPENDENCY__IN_DIAGRAM);

		pcnProcessStepDecisionDependencyEClass = createEClass(PCN_PROCESS_STEP_DECISION_DEPENDENCY);
		createEReference(pcnProcessStepDecisionDependencyEClass, PCN_PROCESS_STEP_DECISION_DEPENDENCY__SOURCE_PROCESS_STEP_DECISION);
		createEReference(pcnProcessStepDecisionDependencyEClass, PCN_PROCESS_STEP_DECISION_DEPENDENCY__TARGET_PROCESS_STEP);

		pcnProcessStepDependencyEClass = createEClass(PCN_PROCESS_STEP_DEPENDENCY);
		createEReference(pcnProcessStepDependencyEClass, PCN_PROCESS_STEP_DEPENDENCY__SOURCE_PROCESS_STEP);
		createEReference(pcnProcessStepDependencyEClass, PCN_PROCESS_STEP_DEPENDENCY__TARGET_PROCESS_STEP);

		pcnReferenceEClass = createEClass(PCN_REFERENCE);
		createEAttribute(pcnReferenceEClass, PCN_REFERENCE__LETTER);
		createEAttribute(pcnReferenceEClass, PCN_REFERENCE__NUMBER);

		pcnRequiredDependencyEClass = createEClass(PCN_REQUIRED_DEPENDENCY);

		pcnOptionalDependencyEClass = createEClass(PCN_OPTIONAL_DEPENDENCY);

		pcnStandardDependencyEClass = createEClass(PCN_STANDARD_DEPENDENCY);

		pcnStartProcessStepEClass = createEClass(PCN_START_PROCESS_STEP);

		pcnEndProcessStepEClass = createEClass(PCN_END_PROCESS_STEP);

		pcnStandardProcessStepEClass = createEClass(PCN_STANDARD_PROCESS_STEP);

		pcnLongProcessStepEClass = createEClass(PCN_LONG_PROCESS_STEP);

		pcnWaitProcessStepEClass = createEClass(PCN_WAIT_PROCESS_STEP);

		pcnDecisionProcessStepEClass = createEClass(PCN_DECISION_PROCESS_STEP);

		pcnPositiveDecisionEClass = createEClass(PCN_POSITIVE_DECISION);

		pcnNegativeDecisionEClass = createEClass(PCN_NEGATIVE_DECISION);

		pcnTagEClass = createEClass(PCN_TAG);

		pcnMonetaryTagEClass = createEClass(PCN_MONETARY_TAG);

		pcnMonetaryBenefitEClass = createEClass(PCN_MONETARY_BENEFIT);

		pcnMonetaryCostEClass = createEClass(PCN_MONETARY_COST);

		pcnNonMonetaryTagEClass = createEClass(PCN_NON_MONETARY_TAG);

		pcnNonMonetaryBenefitEClass = createEClass(PCN_NON_MONETARY_BENEFIT);

		pcnNonMonetaryCostEClass = createEClass(PCN_NON_MONETARY_COST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pcnProcessStepWithTagsEClass.getESuperTypes().add(this.getPCNProcessStep());
		pcnProcessStepDecisionDependencyEClass.getESuperTypes().add(this.getPCNDependency());
		pcnProcessStepDependencyEClass.getESuperTypes().add(this.getPCNDependency());
		pcnReferenceEClass.getESuperTypes().add(this.getPCNProcessStep());
		pcnRequiredDependencyEClass.getESuperTypes().add(this.getPCNProcessStepDependency());
		pcnOptionalDependencyEClass.getESuperTypes().add(this.getPCNProcessStepDependency());
		pcnStandardDependencyEClass.getESuperTypes().add(this.getPCNProcessStepDependency());
		pcnStartProcessStepEClass.getESuperTypes().add(this.getPCNProcessStepWithTags());
		pcnEndProcessStepEClass.getESuperTypes().add(this.getPCNProcessStepWithTags());
		pcnStandardProcessStepEClass.getESuperTypes().add(this.getPCNProcessStepWithTags());
		pcnLongProcessStepEClass.getESuperTypes().add(this.getPCNProcessStepWithTags());
		pcnWaitProcessStepEClass.getESuperTypes().add(this.getPCNProcessStepWithTags());
		pcnDecisionProcessStepEClass.getESuperTypes().add(this.getPCNProcessStepWithTags());
		pcnPositiveDecisionEClass.getESuperTypes().add(this.getPCNProcessStepDecisionDependency());
		pcnNegativeDecisionEClass.getESuperTypes().add(this.getPCNProcessStepDecisionDependency());
		pcnMonetaryTagEClass.getESuperTypes().add(this.getPCNTag());
		pcnMonetaryBenefitEClass.getESuperTypes().add(this.getPCNMonetaryTag());
		pcnMonetaryCostEClass.getESuperTypes().add(this.getPCNMonetaryTag());
		pcnNonMonetaryTagEClass.getESuperTypes().add(this.getPCNTag());
		pcnNonMonetaryBenefitEClass.getESuperTypes().add(this.getPCNNonMonetaryTag());
		pcnNonMonetaryCostEClass.getESuperTypes().add(this.getPCNNonMonetaryTag());

		// Initialize classes, features, and operations; add parameters
		initEClass(pcnDiagramEClass, PCNDiagram.class, "PCNDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCNDiagram_DiagramEntities(), this.getPCNProcessEntity(), null, "diagramEntities", null, 0, -1, PCNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNDiagram_DiagramDependencies(), this.getPCNDependency(), this.getPCNDependency_InDiagram(), "diagramDependencies", null, 0, -1, PCNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnProcessEntityEClass, PCNProcessEntity.class, "PCNProcessEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCNProcessEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCNProcessEntity_Order(), ecorePackage.getEInt(), "order", null, 0, 1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessEntity_BackEntity(), this.getPCNProcessEntity(), this.getPCNProcessEntity_NextEntity(), "backEntity", null, 0, 1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessEntity_NextEntity(), this.getPCNProcessEntity(), this.getPCNProcessEntity_BackEntity(), "nextEntity", null, 0, 1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessEntity_LeftDirectInteractions(), this.getPCNProcessStep(), null, "leftDirectInteractions", null, 0, -1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessEntity_LeftSurrogateInteractions(), this.getPCNProcessStep(), null, "leftSurrogateInteractions", null, 0, -1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessEntity_CenterIndependentInteractionsActivities(), this.getPCNProcessStep(), null, "centerIndependentInteractionsActivities", null, 0, -1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessEntity_RightSurrogateInteractions(), this.getPCNProcessStep(), null, "rightSurrogateInteractions", null, 0, -1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessEntity_RightDirectInteractions(), this.getPCNProcessStep(), null, "rightDirectInteractions", null, 0, -1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPCNProcessEntity__GetDirectInteractions(), null, "getDirectInteractions", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getPCNProcessEntity__GetSurrogateInteractions(), null, "getSurrogateInteractions", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getPCNProcessEntity__GetIndependentInteractios(), null, "getIndependentInteractios", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(pcnProcessStepEClass, PCNProcessStep.class, "PCNProcessStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCNProcessStep_Tags(), this.getPCNTag(), null, "tags", null, 0, -1, PCNProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCNProcessStep_Action(), ecorePackage.getEString(), "action", null, 0, 1, PCNProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCNProcessStep_Predicate(), ecorePackage.getEString(), "predicate", null, 0, 1, PCNProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnProcessStepWithTagsEClass, PCNProcessStepWithTags.class, "PCNProcessStepWithTags", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCNProcessStepWithTags_NonMonetaryBenefits(), this.getPCNNonMonetaryBenefit(), null, "nonMonetaryBenefits", null, 0, -1, PCNProcessStepWithTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStepWithTags_NonMonetaryCosts(), this.getPCNNonMonetaryCost(), null, "nonMonetaryCosts", null, 0, -1, PCNProcessStepWithTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStepWithTags_MonetaryBenefits(), this.getPCNMonetaryBenefit(), null, "monetaryBenefits", null, 0, -1, PCNProcessStepWithTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStepWithTags_MonetaryCosts(), this.getPCNMonetaryCost(), null, "monetaryCosts", null, 0, -1, PCNProcessStepWithTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnDependencyEClass, PCNDependency.class, "PCNDependency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCNDependency_InDiagram(), this.getPCNDiagram(), this.getPCNDiagram_DiagramDependencies(), "inDiagram", null, 0, 1, PCNDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnProcessStepDecisionDependencyEClass, PCNProcessStepDecisionDependency.class, "PCNProcessStepDecisionDependency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCNProcessStepDecisionDependency_SourceProcessStepDecision(), this.getPCNDecisionProcessStep(), null, "sourceProcessStepDecision", null, 0, 1, PCNProcessStepDecisionDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStepDecisionDependency_TargetProcessStep(), this.getPCNProcessStep(), null, "targetProcessStep", null, 0, 1, PCNProcessStepDecisionDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnProcessStepDependencyEClass, PCNProcessStepDependency.class, "PCNProcessStepDependency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCNProcessStepDependency_SourceProcessStep(), this.getPCNProcessStep(), null, "sourceProcessStep", null, 0, 1, PCNProcessStepDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStepDependency_TargetProcessStep(), this.getPCNProcessStep(), null, "targetProcessStep", null, 0, 1, PCNProcessStepDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnReferenceEClass, PCNReference.class, "PCNReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCNReference_Letter(), ecorePackage.getEChar(), "letter", null, 0, 1, PCNReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCNReference_Number(), ecorePackage.getEChar(), "number", null, 0, 1, PCNReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnRequiredDependencyEClass, PCNRequiredDependency.class, "PCNRequiredDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnOptionalDependencyEClass, PCNOptionalDependency.class, "PCNOptionalDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnStandardDependencyEClass, PCNStandardDependency.class, "PCNStandardDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnStartProcessStepEClass, PCNStartProcessStep.class, "PCNStartProcessStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnEndProcessStepEClass, PCNEndProcessStep.class, "PCNEndProcessStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnStandardProcessStepEClass, PCNStandardProcessStep.class, "PCNStandardProcessStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnLongProcessStepEClass, PCNLongProcessStep.class, "PCNLongProcessStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnWaitProcessStepEClass, PCNWaitProcessStep.class, "PCNWaitProcessStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnDecisionProcessStepEClass, PCNDecisionProcessStep.class, "PCNDecisionProcessStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnPositiveDecisionEClass, PCNPositiveDecision.class, "PCNPositiveDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnNegativeDecisionEClass, PCNNegativeDecision.class, "PCNNegativeDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnTagEClass, PCNTag.class, "PCNTag", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnMonetaryTagEClass, PCNMonetaryTag.class, "PCNMonetaryTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnMonetaryBenefitEClass, PCNMonetaryBenefit.class, "PCNMonetaryBenefit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnMonetaryCostEClass, PCNMonetaryCost.class, "PCNMonetaryCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnNonMonetaryTagEClass, PCNNonMonetaryTag.class, "PCNNonMonetaryTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnNonMonetaryBenefitEClass, PCNNonMonetaryBenefit.class, "PCNNonMonetaryBenefit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnNonMonetaryCostEClass, PCNNonMonetaryCost.class, "PCNNonMonetaryCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (getPCNProcessEntity__GetDirectInteractions(), 
		   source, 
		   new String[] {
			 "body", "leftDirectInteractionsActivities->includesAll(rightDirectInteractionsActivities)"
		   });	
		addAnnotation
		  (getPCNProcessEntity__GetSurrogateInteractions(), 
		   source, 
		   new String[] {
			 "body", "leftSurrogateInteractionsActivities->includesAll(rightSurrogateInteractionsActivities)"
		   });	
		addAnnotation
		  (getPCNProcessEntity__GetIndependentInteractios(), 
		   source, 
		   new String[] {
			 "body", "independentInteractionsActivities"
		   });
	}

} //PcnPackageImpl
