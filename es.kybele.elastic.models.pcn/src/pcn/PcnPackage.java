/**
 */
package pcn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pcn.PcnFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface PcnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pcn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kybele.es/elastic/models/pcn/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcnPackage eINSTANCE = pcn.impl.PcnPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcn.impl.PCNDiagramImpl <em>PCN Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNDiagramImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNDiagram()
	 * @generated
	 */
	int PCN_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Diagram Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DIAGRAM__DIAGRAM_ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Diagram Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DIAGRAM__DIAGRAM_DEPENDENCIES = 1;

	/**
	 * The number of structural features of the '<em>PCN Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PCN Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNProcessEntityImpl <em>PCN Process Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNProcessEntityImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNProcessEntity()
	 * @generated
	 */
	int PCN_PROCESS_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__ORDER = 1;

	/**
	 * The feature id for the '<em><b>Back Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__BACK_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Next Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__NEXT_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Left Direct Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS = 4;

	/**
	 * The feature id for the '<em><b>Left Surrogate Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS = 5;

	/**
	 * The feature id for the '<em><b>Center Independent Interactions Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES = 6;

	/**
	 * The feature id for the '<em><b>Right Surrogate Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS = 7;

	/**
	 * The feature id for the '<em><b>Right Direct Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS = 8;

	/**
	 * The number of structural features of the '<em>PCN Process Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Get Direct Interactions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY___GET_DIRECT_INTERACTIONS = 0;

	/**
	 * The operation id for the '<em>Get Surrogate Interactions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY___GET_SURROGATE_INTERACTIONS = 1;

	/**
	 * The operation id for the '<em>Get Independent Interactios</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY___GET_INDEPENDENT_INTERACTIOS = 2;

	/**
	 * The number of operations of the '<em>PCN Process Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link pcn.PCNProcessStep <em>PCN Process Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.PCNProcessStep
	 * @see pcn.impl.PcnPackageImpl#getPCNProcessStep()
	 * @generated
	 */
	int PCN_PROCESS_STEP = 2;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP__TAGS = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP__PREDICATE = 2;

	/**
	 * The number of structural features of the '<em>PCN Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>PCN Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNProcessStepWithTagsImpl <em>PCN Process Step With Tags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNProcessStepWithTagsImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNProcessStepWithTags()
	 * @generated
	 */
	int PCN_PROCESS_STEP_WITH_TAGS = 3;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__TAGS = PCN_PROCESS_STEP__TAGS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__ACTION = PCN_PROCESS_STEP__ACTION;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__PREDICATE = PCN_PROCESS_STEP__PREDICATE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS = PCN_PROCESS_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS = PCN_PROCESS_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS = PCN_PROCESS_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS = PCN_PROCESS_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>PCN Process Step With Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS_FEATURE_COUNT = PCN_PROCESS_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>PCN Process Step With Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS_OPERATION_COUNT = PCN_PROCESS_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNDependencyImpl <em>PCN Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNDependencyImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNDependency()
	 * @generated
	 */
	int PCN_DEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>In Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DEPENDENCY__IN_DIAGRAM = 0;

	/**
	 * The number of structural features of the '<em>PCN Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DEPENDENCY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PCN Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNProcessStepDecisionDependencyImpl <em>PCN Process Step Decision Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNProcessStepDecisionDependencyImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNProcessStepDecisionDependency()
	 * @generated
	 */
	int PCN_PROCESS_STEP_DECISION_DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>In Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_DECISION_DEPENDENCY__IN_DIAGRAM = PCN_DEPENDENCY__IN_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Process Step Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_DECISION_DEPENDENCY__SOURCE_PROCESS_STEP_DECISION = PCN_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Process Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_DECISION_DEPENDENCY__TARGET_PROCESS_STEP = PCN_DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCN Process Step Decision Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_DECISION_DEPENDENCY_FEATURE_COUNT = PCN_DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PCN Process Step Decision Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_DECISION_DEPENDENCY_OPERATION_COUNT = PCN_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNProcessStepDependencyImpl <em>PCN Process Step Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNProcessStepDependencyImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNProcessStepDependency()
	 * @generated
	 */
	int PCN_PROCESS_STEP_DEPENDENCY = 6;

	/**
	 * The feature id for the '<em><b>In Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_DEPENDENCY__IN_DIAGRAM = PCN_DEPENDENCY__IN_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Process Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_DEPENDENCY__SOURCE_PROCESS_STEP = PCN_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Process Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_DEPENDENCY__TARGET_PROCESS_STEP = PCN_DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCN Process Step Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_DEPENDENCY_FEATURE_COUNT = PCN_DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PCN Process Step Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_DEPENDENCY_OPERATION_COUNT = PCN_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNReferenceImpl <em>PCN Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNReferenceImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNReference()
	 * @generated
	 */
	int PCN_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE__TAGS = PCN_PROCESS_STEP__TAGS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE__ACTION = PCN_PROCESS_STEP__ACTION;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE__PREDICATE = PCN_PROCESS_STEP__PREDICATE;

	/**
	 * The feature id for the '<em><b>Letter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE__LETTER = PCN_PROCESS_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE__NUMBER = PCN_PROCESS_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCN Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE_FEATURE_COUNT = PCN_PROCESS_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PCN Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE_OPERATION_COUNT = PCN_PROCESS_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNRequiredDependencyImpl <em>PCN Required Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNRequiredDependencyImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNRequiredDependency()
	 * @generated
	 */
	int PCN_REQUIRED_DEPENDENCY = 8;

	/**
	 * The feature id for the '<em><b>In Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REQUIRED_DEPENDENCY__IN_DIAGRAM = PCN_PROCESS_STEP_DEPENDENCY__IN_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Process Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REQUIRED_DEPENDENCY__SOURCE_PROCESS_STEP = PCN_PROCESS_STEP_DEPENDENCY__SOURCE_PROCESS_STEP;

	/**
	 * The feature id for the '<em><b>Target Process Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REQUIRED_DEPENDENCY__TARGET_PROCESS_STEP = PCN_PROCESS_STEP_DEPENDENCY__TARGET_PROCESS_STEP;

	/**
	 * The number of structural features of the '<em>PCN Required Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REQUIRED_DEPENDENCY_FEATURE_COUNT = PCN_PROCESS_STEP_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Required Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REQUIRED_DEPENDENCY_OPERATION_COUNT = PCN_PROCESS_STEP_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNOptionalDependencyImpl <em>PCN Optional Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNOptionalDependencyImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNOptionalDependency()
	 * @generated
	 */
	int PCN_OPTIONAL_DEPENDENCY = 9;

	/**
	 * The feature id for the '<em><b>In Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OPTIONAL_DEPENDENCY__IN_DIAGRAM = PCN_PROCESS_STEP_DEPENDENCY__IN_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Process Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OPTIONAL_DEPENDENCY__SOURCE_PROCESS_STEP = PCN_PROCESS_STEP_DEPENDENCY__SOURCE_PROCESS_STEP;

	/**
	 * The feature id for the '<em><b>Target Process Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OPTIONAL_DEPENDENCY__TARGET_PROCESS_STEP = PCN_PROCESS_STEP_DEPENDENCY__TARGET_PROCESS_STEP;

	/**
	 * The number of structural features of the '<em>PCN Optional Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OPTIONAL_DEPENDENCY_FEATURE_COUNT = PCN_PROCESS_STEP_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Optional Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OPTIONAL_DEPENDENCY_OPERATION_COUNT = PCN_PROCESS_STEP_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNStandardDependencyImpl <em>PCN Standard Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNStandardDependencyImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNStandardDependency()
	 * @generated
	 */
	int PCN_STANDARD_DEPENDENCY = 10;

	/**
	 * The feature id for the '<em><b>In Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_DEPENDENCY__IN_DIAGRAM = PCN_PROCESS_STEP_DEPENDENCY__IN_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Process Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_DEPENDENCY__SOURCE_PROCESS_STEP = PCN_PROCESS_STEP_DEPENDENCY__SOURCE_PROCESS_STEP;

	/**
	 * The feature id for the '<em><b>Target Process Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_DEPENDENCY__TARGET_PROCESS_STEP = PCN_PROCESS_STEP_DEPENDENCY__TARGET_PROCESS_STEP;

	/**
	 * The number of structural features of the '<em>PCN Standard Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_DEPENDENCY_FEATURE_COUNT = PCN_PROCESS_STEP_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Standard Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_DEPENDENCY_OPERATION_COUNT = PCN_PROCESS_STEP_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNStartProcessStepImpl <em>PCN Start Process Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNStartProcessStepImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNStartProcessStep()
	 * @generated
	 */
	int PCN_START_PROCESS_STEP = 11;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_START_PROCESS_STEP__TAGS = PCN_PROCESS_STEP_WITH_TAGS__TAGS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_START_PROCESS_STEP__ACTION = PCN_PROCESS_STEP_WITH_TAGS__ACTION;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_START_PROCESS_STEP__PREDICATE = PCN_PROCESS_STEP_WITH_TAGS__PREDICATE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_START_PROCESS_STEP__NON_MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_START_PROCESS_STEP__NON_MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_START_PROCESS_STEP__MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_START_PROCESS_STEP__MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS;

	/**
	 * The number of structural features of the '<em>PCN Start Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_START_PROCESS_STEP_FEATURE_COUNT = PCN_PROCESS_STEP_WITH_TAGS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Start Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_START_PROCESS_STEP_OPERATION_COUNT = PCN_PROCESS_STEP_WITH_TAGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNEndProcessStepImpl <em>PCN End Process Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNEndProcessStepImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNEndProcessStep()
	 * @generated
	 */
	int PCN_END_PROCESS_STEP = 12;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_END_PROCESS_STEP__TAGS = PCN_PROCESS_STEP_WITH_TAGS__TAGS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_END_PROCESS_STEP__ACTION = PCN_PROCESS_STEP_WITH_TAGS__ACTION;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_END_PROCESS_STEP__PREDICATE = PCN_PROCESS_STEP_WITH_TAGS__PREDICATE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_END_PROCESS_STEP__NON_MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_END_PROCESS_STEP__NON_MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_END_PROCESS_STEP__MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_END_PROCESS_STEP__MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS;

	/**
	 * The number of structural features of the '<em>PCN End Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_END_PROCESS_STEP_FEATURE_COUNT = PCN_PROCESS_STEP_WITH_TAGS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN End Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_END_PROCESS_STEP_OPERATION_COUNT = PCN_PROCESS_STEP_WITH_TAGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNStandardProcessStepImpl <em>PCN Standard Process Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNStandardProcessStepImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNStandardProcessStep()
	 * @generated
	 */
	int PCN_STANDARD_PROCESS_STEP = 13;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_PROCESS_STEP__TAGS = PCN_PROCESS_STEP_WITH_TAGS__TAGS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_PROCESS_STEP__ACTION = PCN_PROCESS_STEP_WITH_TAGS__ACTION;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_PROCESS_STEP__PREDICATE = PCN_PROCESS_STEP_WITH_TAGS__PREDICATE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_PROCESS_STEP__NON_MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_PROCESS_STEP__NON_MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_PROCESS_STEP__MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_PROCESS_STEP__MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS;

	/**
	 * The number of structural features of the '<em>PCN Standard Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_PROCESS_STEP_FEATURE_COUNT = PCN_PROCESS_STEP_WITH_TAGS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Standard Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_PROCESS_STEP_OPERATION_COUNT = PCN_PROCESS_STEP_WITH_TAGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNLongProcessStepImpl <em>PCN Long Process Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNLongProcessStepImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNLongProcessStep()
	 * @generated
	 */
	int PCN_LONG_PROCESS_STEP = 14;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_LONG_PROCESS_STEP__TAGS = PCN_PROCESS_STEP_WITH_TAGS__TAGS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_LONG_PROCESS_STEP__ACTION = PCN_PROCESS_STEP_WITH_TAGS__ACTION;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_LONG_PROCESS_STEP__PREDICATE = PCN_PROCESS_STEP_WITH_TAGS__PREDICATE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_LONG_PROCESS_STEP__NON_MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_LONG_PROCESS_STEP__NON_MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_LONG_PROCESS_STEP__MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_LONG_PROCESS_STEP__MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS;

	/**
	 * The number of structural features of the '<em>PCN Long Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_LONG_PROCESS_STEP_FEATURE_COUNT = PCN_PROCESS_STEP_WITH_TAGS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Long Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_LONG_PROCESS_STEP_OPERATION_COUNT = PCN_PROCESS_STEP_WITH_TAGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNWaitProcessStepImpl <em>PCN Wait Process Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNWaitProcessStepImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNWaitProcessStep()
	 * @generated
	 */
	int PCN_WAIT_PROCESS_STEP = 15;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_PROCESS_STEP__TAGS = PCN_PROCESS_STEP_WITH_TAGS__TAGS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_PROCESS_STEP__ACTION = PCN_PROCESS_STEP_WITH_TAGS__ACTION;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_PROCESS_STEP__PREDICATE = PCN_PROCESS_STEP_WITH_TAGS__PREDICATE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_PROCESS_STEP__NON_MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_PROCESS_STEP__NON_MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_PROCESS_STEP__MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_PROCESS_STEP__MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS;

	/**
	 * The number of structural features of the '<em>PCN Wait Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_PROCESS_STEP_FEATURE_COUNT = PCN_PROCESS_STEP_WITH_TAGS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Wait Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_PROCESS_STEP_OPERATION_COUNT = PCN_PROCESS_STEP_WITH_TAGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNDecisionProcessStepImpl <em>PCN Decision Process Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNDecisionProcessStepImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNDecisionProcessStep()
	 * @generated
	 */
	int PCN_DECISION_PROCESS_STEP = 16;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_PROCESS_STEP__TAGS = PCN_PROCESS_STEP_WITH_TAGS__TAGS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_PROCESS_STEP__ACTION = PCN_PROCESS_STEP_WITH_TAGS__ACTION;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_PROCESS_STEP__PREDICATE = PCN_PROCESS_STEP_WITH_TAGS__PREDICATE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_PROCESS_STEP__NON_MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_PROCESS_STEP__NON_MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_PROCESS_STEP__MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_PROCESS_STEP__MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS;

	/**
	 * The number of structural features of the '<em>PCN Decision Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_PROCESS_STEP_FEATURE_COUNT = PCN_PROCESS_STEP_WITH_TAGS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Decision Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_PROCESS_STEP_OPERATION_COUNT = PCN_PROCESS_STEP_WITH_TAGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNPositiveDecisionImpl <em>PCN Positive Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNPositiveDecisionImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNPositiveDecision()
	 * @generated
	 */
	int PCN_POSITIVE_DECISION = 17;

	/**
	 * The feature id for the '<em><b>In Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_POSITIVE_DECISION__IN_DIAGRAM = PCN_PROCESS_STEP_DECISION_DEPENDENCY__IN_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Process Step Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_POSITIVE_DECISION__SOURCE_PROCESS_STEP_DECISION = PCN_PROCESS_STEP_DECISION_DEPENDENCY__SOURCE_PROCESS_STEP_DECISION;

	/**
	 * The feature id for the '<em><b>Target Process Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_POSITIVE_DECISION__TARGET_PROCESS_STEP = PCN_PROCESS_STEP_DECISION_DEPENDENCY__TARGET_PROCESS_STEP;

	/**
	 * The number of structural features of the '<em>PCN Positive Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_POSITIVE_DECISION_FEATURE_COUNT = PCN_PROCESS_STEP_DECISION_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Positive Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_POSITIVE_DECISION_OPERATION_COUNT = PCN_PROCESS_STEP_DECISION_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNNegativeDecisionImpl <em>PCN Negative Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNNegativeDecisionImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNNegativeDecision()
	 * @generated
	 */
	int PCN_NEGATIVE_DECISION = 18;

	/**
	 * The feature id for the '<em><b>In Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NEGATIVE_DECISION__IN_DIAGRAM = PCN_PROCESS_STEP_DECISION_DEPENDENCY__IN_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Process Step Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NEGATIVE_DECISION__SOURCE_PROCESS_STEP_DECISION = PCN_PROCESS_STEP_DECISION_DEPENDENCY__SOURCE_PROCESS_STEP_DECISION;

	/**
	 * The feature id for the '<em><b>Target Process Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NEGATIVE_DECISION__TARGET_PROCESS_STEP = PCN_PROCESS_STEP_DECISION_DEPENDENCY__TARGET_PROCESS_STEP;

	/**
	 * The number of structural features of the '<em>PCN Negative Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NEGATIVE_DECISION_FEATURE_COUNT = PCN_PROCESS_STEP_DECISION_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Negative Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NEGATIVE_DECISION_OPERATION_COUNT = PCN_PROCESS_STEP_DECISION_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNTagImpl <em>PCN Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNTagImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNTag()
	 * @generated
	 */
	int PCN_TAG = 19;

	/**
	 * The number of structural features of the '<em>PCN Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_TAG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>PCN Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNMonetaryTagImpl <em>PCN Monetary Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNMonetaryTagImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNMonetaryTag()
	 * @generated
	 */
	int PCN_MONETARY_TAG = 20;

	/**
	 * The number of structural features of the '<em>PCN Monetary Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_MONETARY_TAG_FEATURE_COUNT = PCN_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Monetary Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_MONETARY_TAG_OPERATION_COUNT = PCN_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNMonetaryBenefitImpl <em>PCN Monetary Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNMonetaryBenefitImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNMonetaryBenefit()
	 * @generated
	 */
	int PCN_MONETARY_BENEFIT = 21;

	/**
	 * The number of structural features of the '<em>PCN Monetary Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_MONETARY_BENEFIT_FEATURE_COUNT = PCN_MONETARY_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Monetary Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_MONETARY_BENEFIT_OPERATION_COUNT = PCN_MONETARY_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNMonetaryCostImpl <em>PCN Monetary Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNMonetaryCostImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNMonetaryCost()
	 * @generated
	 */
	int PCN_MONETARY_COST = 22;

	/**
	 * The number of structural features of the '<em>PCN Monetary Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_MONETARY_COST_FEATURE_COUNT = PCN_MONETARY_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Monetary Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_MONETARY_COST_OPERATION_COUNT = PCN_MONETARY_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNNonMonetaryTagImpl <em>PCN Non Monetary Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNNonMonetaryTagImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNNonMonetaryTag()
	 * @generated
	 */
	int PCN_NON_MONETARY_TAG = 23;

	/**
	 * The number of structural features of the '<em>PCN Non Monetary Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NON_MONETARY_TAG_FEATURE_COUNT = PCN_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Non Monetary Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NON_MONETARY_TAG_OPERATION_COUNT = PCN_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNNonMonetaryBenefitImpl <em>PCN Non Monetary Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNNonMonetaryBenefitImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNNonMonetaryBenefit()
	 * @generated
	 */
	int PCN_NON_MONETARY_BENEFIT = 24;

	/**
	 * The number of structural features of the '<em>PCN Non Monetary Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NON_MONETARY_BENEFIT_FEATURE_COUNT = PCN_NON_MONETARY_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Non Monetary Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NON_MONETARY_BENEFIT_OPERATION_COUNT = PCN_NON_MONETARY_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNNonMonetaryCostImpl <em>PCN Non Monetary Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNNonMonetaryCostImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNNonMonetaryCost()
	 * @generated
	 */
	int PCN_NON_MONETARY_COST = 25;

	/**
	 * The number of structural features of the '<em>PCN Non Monetary Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NON_MONETARY_COST_FEATURE_COUNT = PCN_NON_MONETARY_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Non Monetary Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NON_MONETARY_COST_OPERATION_COUNT = PCN_NON_MONETARY_TAG_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pcn.PCNDiagram <em>PCN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Diagram</em>'.
	 * @see pcn.PCNDiagram
	 * @generated
	 */
	EClass getPCNDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNDiagram#getDiagramEntities <em>Diagram Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Entities</em>'.
	 * @see pcn.PCNDiagram#getDiagramEntities()
	 * @see #getPCNDiagram()
	 * @generated
	 */
	EReference getPCNDiagram_DiagramEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNDiagram#getDiagramDependencies <em>Diagram Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Dependencies</em>'.
	 * @see pcn.PCNDiagram#getDiagramDependencies()
	 * @see #getPCNDiagram()
	 * @generated
	 */
	EReference getPCNDiagram_DiagramDependencies();

	/**
	 * Returns the meta object for class '{@link pcn.PCNProcessEntity <em>PCN Process Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Process Entity</em>'.
	 * @see pcn.PCNProcessEntity
	 * @generated
	 */
	EClass getPCNProcessEntity();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNProcessEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pcn.PCNProcessEntity#getName()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EAttribute getPCNProcessEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNProcessEntity#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see pcn.PCNProcessEntity#getOrder()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EAttribute getPCNProcessEntity_Order();

	/**
	 * Returns the meta object for the container reference '{@link pcn.PCNProcessEntity#getBackEntity <em>Back Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Back Entity</em>'.
	 * @see pcn.PCNProcessEntity#getBackEntity()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EReference getPCNProcessEntity_BackEntity();

	/**
	 * Returns the meta object for the containment reference '{@link pcn.PCNProcessEntity#getNextEntity <em>Next Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Entity</em>'.
	 * @see pcn.PCNProcessEntity#getNextEntity()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EReference getPCNProcessEntity_NextEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessEntity#getLeftDirectInteractions <em>Left Direct Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left Direct Interactions</em>'.
	 * @see pcn.PCNProcessEntity#getLeftDirectInteractions()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EReference getPCNProcessEntity_LeftDirectInteractions();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessEntity#getLeftSurrogateInteractions <em>Left Surrogate Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left Surrogate Interactions</em>'.
	 * @see pcn.PCNProcessEntity#getLeftSurrogateInteractions()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EReference getPCNProcessEntity_LeftSurrogateInteractions();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessEntity#getCenterIndependentInteractionsActivities <em>Center Independent Interactions Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Center Independent Interactions Activities</em>'.
	 * @see pcn.PCNProcessEntity#getCenterIndependentInteractionsActivities()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EReference getPCNProcessEntity_CenterIndependentInteractionsActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessEntity#getRightSurrogateInteractions <em>Right Surrogate Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right Surrogate Interactions</em>'.
	 * @see pcn.PCNProcessEntity#getRightSurrogateInteractions()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EReference getPCNProcessEntity_RightSurrogateInteractions();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessEntity#getRightDirectInteractions <em>Right Direct Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right Direct Interactions</em>'.
	 * @see pcn.PCNProcessEntity#getRightDirectInteractions()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EReference getPCNProcessEntity_RightDirectInteractions();

	/**
	 * Returns the meta object for the '{@link pcn.PCNProcessEntity#getDirectInteractions() <em>Get Direct Interactions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Direct Interactions</em>' operation.
	 * @see pcn.PCNProcessEntity#getDirectInteractions()
	 * @generated
	 */
	EOperation getPCNProcessEntity__GetDirectInteractions();

	/**
	 * Returns the meta object for the '{@link pcn.PCNProcessEntity#getSurrogateInteractions() <em>Get Surrogate Interactions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Surrogate Interactions</em>' operation.
	 * @see pcn.PCNProcessEntity#getSurrogateInteractions()
	 * @generated
	 */
	EOperation getPCNProcessEntity__GetSurrogateInteractions();

	/**
	 * Returns the meta object for the '{@link pcn.PCNProcessEntity#getIndependentInteractios() <em>Get Independent Interactios</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Independent Interactios</em>' operation.
	 * @see pcn.PCNProcessEntity#getIndependentInteractios()
	 * @generated
	 */
	EOperation getPCNProcessEntity__GetIndependentInteractios();

	/**
	 * Returns the meta object for class '{@link pcn.PCNProcessStep <em>PCN Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Process Step</em>'.
	 * @see pcn.PCNProcessStep
	 * @generated
	 */
	EClass getPCNProcessStep();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessStep#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see pcn.PCNProcessStep#getTags()
	 * @see #getPCNProcessStep()
	 * @generated
	 */
	EReference getPCNProcessStep_Tags();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNProcessStep#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see pcn.PCNProcessStep#getAction()
	 * @see #getPCNProcessStep()
	 * @generated
	 */
	EAttribute getPCNProcessStep_Action();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNProcessStep#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see pcn.PCNProcessStep#getPredicate()
	 * @see #getPCNProcessStep()
	 * @generated
	 */
	EAttribute getPCNProcessStep_Predicate();

	/**
	 * Returns the meta object for class '{@link pcn.PCNProcessStepWithTags <em>PCN Process Step With Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Process Step With Tags</em>'.
	 * @see pcn.PCNProcessStepWithTags
	 * @generated
	 */
	EClass getPCNProcessStepWithTags();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessStepWithTags#getNonMonetaryBenefits <em>Non Monetary Benefits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Non Monetary Benefits</em>'.
	 * @see pcn.PCNProcessStepWithTags#getNonMonetaryBenefits()
	 * @see #getPCNProcessStepWithTags()
	 * @generated
	 */
	EReference getPCNProcessStepWithTags_NonMonetaryBenefits();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessStepWithTags#getNonMonetaryCosts <em>Non Monetary Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Non Monetary Costs</em>'.
	 * @see pcn.PCNProcessStepWithTags#getNonMonetaryCosts()
	 * @see #getPCNProcessStepWithTags()
	 * @generated
	 */
	EReference getPCNProcessStepWithTags_NonMonetaryCosts();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessStepWithTags#getMonetaryBenefits <em>Monetary Benefits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Monetary Benefits</em>'.
	 * @see pcn.PCNProcessStepWithTags#getMonetaryBenefits()
	 * @see #getPCNProcessStepWithTags()
	 * @generated
	 */
	EReference getPCNProcessStepWithTags_MonetaryBenefits();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessStepWithTags#getMonetaryCosts <em>Monetary Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Monetary Costs</em>'.
	 * @see pcn.PCNProcessStepWithTags#getMonetaryCosts()
	 * @see #getPCNProcessStepWithTags()
	 * @generated
	 */
	EReference getPCNProcessStepWithTags_MonetaryCosts();

	/**
	 * Returns the meta object for class '{@link pcn.PCNDependency <em>PCN Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Dependency</em>'.
	 * @see pcn.PCNDependency
	 * @generated
	 */
	EClass getPCNDependency();

	/**
	 * Returns the meta object for the container reference '{@link pcn.PCNDependency#getInDiagram <em>In Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Diagram</em>'.
	 * @see pcn.PCNDependency#getInDiagram()
	 * @see #getPCNDependency()
	 * @generated
	 */
	EReference getPCNDependency_InDiagram();

	/**
	 * Returns the meta object for class '{@link pcn.PCNProcessStepDecisionDependency <em>PCN Process Step Decision Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Process Step Decision Dependency</em>'.
	 * @see pcn.PCNProcessStepDecisionDependency
	 * @generated
	 */
	EClass getPCNProcessStepDecisionDependency();

	/**
	 * Returns the meta object for the reference '{@link pcn.PCNProcessStepDecisionDependency#getSourceProcessStepDecision <em>Source Process Step Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Process Step Decision</em>'.
	 * @see pcn.PCNProcessStepDecisionDependency#getSourceProcessStepDecision()
	 * @see #getPCNProcessStepDecisionDependency()
	 * @generated
	 */
	EReference getPCNProcessStepDecisionDependency_SourceProcessStepDecision();

	/**
	 * Returns the meta object for the reference '{@link pcn.PCNProcessStepDecisionDependency#getTargetProcessStep <em>Target Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Process Step</em>'.
	 * @see pcn.PCNProcessStepDecisionDependency#getTargetProcessStep()
	 * @see #getPCNProcessStepDecisionDependency()
	 * @generated
	 */
	EReference getPCNProcessStepDecisionDependency_TargetProcessStep();

	/**
	 * Returns the meta object for class '{@link pcn.PCNProcessStepDependency <em>PCN Process Step Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Process Step Dependency</em>'.
	 * @see pcn.PCNProcessStepDependency
	 * @generated
	 */
	EClass getPCNProcessStepDependency();

	/**
	 * Returns the meta object for the reference '{@link pcn.PCNProcessStepDependency#getSourceProcessStep <em>Source Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Process Step</em>'.
	 * @see pcn.PCNProcessStepDependency#getSourceProcessStep()
	 * @see #getPCNProcessStepDependency()
	 * @generated
	 */
	EReference getPCNProcessStepDependency_SourceProcessStep();

	/**
	 * Returns the meta object for the reference '{@link pcn.PCNProcessStepDependency#getTargetProcessStep <em>Target Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Process Step</em>'.
	 * @see pcn.PCNProcessStepDependency#getTargetProcessStep()
	 * @see #getPCNProcessStepDependency()
	 * @generated
	 */
	EReference getPCNProcessStepDependency_TargetProcessStep();

	/**
	 * Returns the meta object for class '{@link pcn.PCNReference <em>PCN Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Reference</em>'.
	 * @see pcn.PCNReference
	 * @generated
	 */
	EClass getPCNReference();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNReference#getLetter <em>Letter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Letter</em>'.
	 * @see pcn.PCNReference#getLetter()
	 * @see #getPCNReference()
	 * @generated
	 */
	EAttribute getPCNReference_Letter();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNReference#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see pcn.PCNReference#getNumber()
	 * @see #getPCNReference()
	 * @generated
	 */
	EAttribute getPCNReference_Number();

	/**
	 * Returns the meta object for class '{@link pcn.PCNRequiredDependency <em>PCN Required Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Required Dependency</em>'.
	 * @see pcn.PCNRequiredDependency
	 * @generated
	 */
	EClass getPCNRequiredDependency();

	/**
	 * Returns the meta object for class '{@link pcn.PCNOptionalDependency <em>PCN Optional Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Optional Dependency</em>'.
	 * @see pcn.PCNOptionalDependency
	 * @generated
	 */
	EClass getPCNOptionalDependency();

	/**
	 * Returns the meta object for class '{@link pcn.PCNStandardDependency <em>PCN Standard Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Standard Dependency</em>'.
	 * @see pcn.PCNStandardDependency
	 * @generated
	 */
	EClass getPCNStandardDependency();

	/**
	 * Returns the meta object for class '{@link pcn.PCNStartProcessStep <em>PCN Start Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Start Process Step</em>'.
	 * @see pcn.PCNStartProcessStep
	 * @generated
	 */
	EClass getPCNStartProcessStep();

	/**
	 * Returns the meta object for class '{@link pcn.PCNEndProcessStep <em>PCN End Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN End Process Step</em>'.
	 * @see pcn.PCNEndProcessStep
	 * @generated
	 */
	EClass getPCNEndProcessStep();

	/**
	 * Returns the meta object for class '{@link pcn.PCNStandardProcessStep <em>PCN Standard Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Standard Process Step</em>'.
	 * @see pcn.PCNStandardProcessStep
	 * @generated
	 */
	EClass getPCNStandardProcessStep();

	/**
	 * Returns the meta object for class '{@link pcn.PCNLongProcessStep <em>PCN Long Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Long Process Step</em>'.
	 * @see pcn.PCNLongProcessStep
	 * @generated
	 */
	EClass getPCNLongProcessStep();

	/**
	 * Returns the meta object for class '{@link pcn.PCNWaitProcessStep <em>PCN Wait Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Wait Process Step</em>'.
	 * @see pcn.PCNWaitProcessStep
	 * @generated
	 */
	EClass getPCNWaitProcessStep();

	/**
	 * Returns the meta object for class '{@link pcn.PCNDecisionProcessStep <em>PCN Decision Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Decision Process Step</em>'.
	 * @see pcn.PCNDecisionProcessStep
	 * @generated
	 */
	EClass getPCNDecisionProcessStep();

	/**
	 * Returns the meta object for class '{@link pcn.PCNPositiveDecision <em>PCN Positive Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Positive Decision</em>'.
	 * @see pcn.PCNPositiveDecision
	 * @generated
	 */
	EClass getPCNPositiveDecision();

	/**
	 * Returns the meta object for class '{@link pcn.PCNNegativeDecision <em>PCN Negative Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Negative Decision</em>'.
	 * @see pcn.PCNNegativeDecision
	 * @generated
	 */
	EClass getPCNNegativeDecision();

	/**
	 * Returns the meta object for class '{@link pcn.PCNTag <em>PCN Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Tag</em>'.
	 * @see pcn.PCNTag
	 * @generated
	 */
	EClass getPCNTag();

	/**
	 * Returns the meta object for class '{@link pcn.PCNMonetaryTag <em>PCN Monetary Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Monetary Tag</em>'.
	 * @see pcn.PCNMonetaryTag
	 * @generated
	 */
	EClass getPCNMonetaryTag();

	/**
	 * Returns the meta object for class '{@link pcn.PCNMonetaryBenefit <em>PCN Monetary Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Monetary Benefit</em>'.
	 * @see pcn.PCNMonetaryBenefit
	 * @generated
	 */
	EClass getPCNMonetaryBenefit();

	/**
	 * Returns the meta object for class '{@link pcn.PCNMonetaryCost <em>PCN Monetary Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Monetary Cost</em>'.
	 * @see pcn.PCNMonetaryCost
	 * @generated
	 */
	EClass getPCNMonetaryCost();

	/**
	 * Returns the meta object for class '{@link pcn.PCNNonMonetaryTag <em>PCN Non Monetary Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Non Monetary Tag</em>'.
	 * @see pcn.PCNNonMonetaryTag
	 * @generated
	 */
	EClass getPCNNonMonetaryTag();

	/**
	 * Returns the meta object for class '{@link pcn.PCNNonMonetaryBenefit <em>PCN Non Monetary Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Non Monetary Benefit</em>'.
	 * @see pcn.PCNNonMonetaryBenefit
	 * @generated
	 */
	EClass getPCNNonMonetaryBenefit();

	/**
	 * Returns the meta object for class '{@link pcn.PCNNonMonetaryCost <em>PCN Non Monetary Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Non Monetary Cost</em>'.
	 * @see pcn.PCNNonMonetaryCost
	 * @generated
	 */
	EClass getPCNNonMonetaryCost();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PcnFactory getPcnFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pcn.impl.PCNDiagramImpl <em>PCN Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNDiagramImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNDiagram()
		 * @generated
		 */
		EClass PCN_DIAGRAM = eINSTANCE.getPCNDiagram();

		/**
		 * The meta object literal for the '<em><b>Diagram Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_DIAGRAM__DIAGRAM_ENTITIES = eINSTANCE.getPCNDiagram_DiagramEntities();

		/**
		 * The meta object literal for the '<em><b>Diagram Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_DIAGRAM__DIAGRAM_DEPENDENCIES = eINSTANCE.getPCNDiagram_DiagramDependencies();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNProcessEntityImpl <em>PCN Process Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNProcessEntityImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNProcessEntity()
		 * @generated
		 */
		EClass PCN_PROCESS_ENTITY = eINSTANCE.getPCNProcessEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_PROCESS_ENTITY__NAME = eINSTANCE.getPCNProcessEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_PROCESS_ENTITY__ORDER = eINSTANCE.getPCNProcessEntity_Order();

		/**
		 * The meta object literal for the '<em><b>Back Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_ENTITY__BACK_ENTITY = eINSTANCE.getPCNProcessEntity_BackEntity();

		/**
		 * The meta object literal for the '<em><b>Next Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_ENTITY__NEXT_ENTITY = eINSTANCE.getPCNProcessEntity_NextEntity();

		/**
		 * The meta object literal for the '<em><b>Left Direct Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS = eINSTANCE.getPCNProcessEntity_LeftDirectInteractions();

		/**
		 * The meta object literal for the '<em><b>Left Surrogate Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS = eINSTANCE.getPCNProcessEntity_LeftSurrogateInteractions();

		/**
		 * The meta object literal for the '<em><b>Center Independent Interactions Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES = eINSTANCE.getPCNProcessEntity_CenterIndependentInteractionsActivities();

		/**
		 * The meta object literal for the '<em><b>Right Surrogate Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS = eINSTANCE.getPCNProcessEntity_RightSurrogateInteractions();

		/**
		 * The meta object literal for the '<em><b>Right Direct Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS = eINSTANCE.getPCNProcessEntity_RightDirectInteractions();

		/**
		 * The meta object literal for the '<em><b>Get Direct Interactions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCN_PROCESS_ENTITY___GET_DIRECT_INTERACTIONS = eINSTANCE.getPCNProcessEntity__GetDirectInteractions();

		/**
		 * The meta object literal for the '<em><b>Get Surrogate Interactions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCN_PROCESS_ENTITY___GET_SURROGATE_INTERACTIONS = eINSTANCE.getPCNProcessEntity__GetSurrogateInteractions();

		/**
		 * The meta object literal for the '<em><b>Get Independent Interactios</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCN_PROCESS_ENTITY___GET_INDEPENDENT_INTERACTIOS = eINSTANCE.getPCNProcessEntity__GetIndependentInteractios();

		/**
		 * The meta object literal for the '{@link pcn.PCNProcessStep <em>PCN Process Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.PCNProcessStep
		 * @see pcn.impl.PcnPackageImpl#getPCNProcessStep()
		 * @generated
		 */
		EClass PCN_PROCESS_STEP = eINSTANCE.getPCNProcessStep();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP__TAGS = eINSTANCE.getPCNProcessStep_Tags();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_PROCESS_STEP__ACTION = eINSTANCE.getPCNProcessStep_Action();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_PROCESS_STEP__PREDICATE = eINSTANCE.getPCNProcessStep_Predicate();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNProcessStepWithTagsImpl <em>PCN Process Step With Tags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNProcessStepWithTagsImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNProcessStepWithTags()
		 * @generated
		 */
		EClass PCN_PROCESS_STEP_WITH_TAGS = eINSTANCE.getPCNProcessStepWithTags();

		/**
		 * The meta object literal for the '<em><b>Non Monetary Benefits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS = eINSTANCE.getPCNProcessStepWithTags_NonMonetaryBenefits();

		/**
		 * The meta object literal for the '<em><b>Non Monetary Costs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS = eINSTANCE.getPCNProcessStepWithTags_NonMonetaryCosts();

		/**
		 * The meta object literal for the '<em><b>Monetary Benefits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS = eINSTANCE.getPCNProcessStepWithTags_MonetaryBenefits();

		/**
		 * The meta object literal for the '<em><b>Monetary Costs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS = eINSTANCE.getPCNProcessStepWithTags_MonetaryCosts();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNDependencyImpl <em>PCN Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNDependencyImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNDependency()
		 * @generated
		 */
		EClass PCN_DEPENDENCY = eINSTANCE.getPCNDependency();

		/**
		 * The meta object literal for the '<em><b>In Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_DEPENDENCY__IN_DIAGRAM = eINSTANCE.getPCNDependency_InDiagram();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNProcessStepDecisionDependencyImpl <em>PCN Process Step Decision Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNProcessStepDecisionDependencyImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNProcessStepDecisionDependency()
		 * @generated
		 */
		EClass PCN_PROCESS_STEP_DECISION_DEPENDENCY = eINSTANCE.getPCNProcessStepDecisionDependency();

		/**
		 * The meta object literal for the '<em><b>Source Process Step Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_DECISION_DEPENDENCY__SOURCE_PROCESS_STEP_DECISION = eINSTANCE.getPCNProcessStepDecisionDependency_SourceProcessStepDecision();

		/**
		 * The meta object literal for the '<em><b>Target Process Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_DECISION_DEPENDENCY__TARGET_PROCESS_STEP = eINSTANCE.getPCNProcessStepDecisionDependency_TargetProcessStep();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNProcessStepDependencyImpl <em>PCN Process Step Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNProcessStepDependencyImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNProcessStepDependency()
		 * @generated
		 */
		EClass PCN_PROCESS_STEP_DEPENDENCY = eINSTANCE.getPCNProcessStepDependency();

		/**
		 * The meta object literal for the '<em><b>Source Process Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_DEPENDENCY__SOURCE_PROCESS_STEP = eINSTANCE.getPCNProcessStepDependency_SourceProcessStep();

		/**
		 * The meta object literal for the '<em><b>Target Process Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_DEPENDENCY__TARGET_PROCESS_STEP = eINSTANCE.getPCNProcessStepDependency_TargetProcessStep();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNReferenceImpl <em>PCN Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNReferenceImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNReference()
		 * @generated
		 */
		EClass PCN_REFERENCE = eINSTANCE.getPCNReference();

		/**
		 * The meta object literal for the '<em><b>Letter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_REFERENCE__LETTER = eINSTANCE.getPCNReference_Letter();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_REFERENCE__NUMBER = eINSTANCE.getPCNReference_Number();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNRequiredDependencyImpl <em>PCN Required Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNRequiredDependencyImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNRequiredDependency()
		 * @generated
		 */
		EClass PCN_REQUIRED_DEPENDENCY = eINSTANCE.getPCNRequiredDependency();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNOptionalDependencyImpl <em>PCN Optional Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNOptionalDependencyImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNOptionalDependency()
		 * @generated
		 */
		EClass PCN_OPTIONAL_DEPENDENCY = eINSTANCE.getPCNOptionalDependency();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNStandardDependencyImpl <em>PCN Standard Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNStandardDependencyImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNStandardDependency()
		 * @generated
		 */
		EClass PCN_STANDARD_DEPENDENCY = eINSTANCE.getPCNStandardDependency();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNStartProcessStepImpl <em>PCN Start Process Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNStartProcessStepImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNStartProcessStep()
		 * @generated
		 */
		EClass PCN_START_PROCESS_STEP = eINSTANCE.getPCNStartProcessStep();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNEndProcessStepImpl <em>PCN End Process Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNEndProcessStepImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNEndProcessStep()
		 * @generated
		 */
		EClass PCN_END_PROCESS_STEP = eINSTANCE.getPCNEndProcessStep();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNStandardProcessStepImpl <em>PCN Standard Process Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNStandardProcessStepImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNStandardProcessStep()
		 * @generated
		 */
		EClass PCN_STANDARD_PROCESS_STEP = eINSTANCE.getPCNStandardProcessStep();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNLongProcessStepImpl <em>PCN Long Process Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNLongProcessStepImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNLongProcessStep()
		 * @generated
		 */
		EClass PCN_LONG_PROCESS_STEP = eINSTANCE.getPCNLongProcessStep();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNWaitProcessStepImpl <em>PCN Wait Process Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNWaitProcessStepImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNWaitProcessStep()
		 * @generated
		 */
		EClass PCN_WAIT_PROCESS_STEP = eINSTANCE.getPCNWaitProcessStep();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNDecisionProcessStepImpl <em>PCN Decision Process Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNDecisionProcessStepImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNDecisionProcessStep()
		 * @generated
		 */
		EClass PCN_DECISION_PROCESS_STEP = eINSTANCE.getPCNDecisionProcessStep();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNPositiveDecisionImpl <em>PCN Positive Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNPositiveDecisionImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNPositiveDecision()
		 * @generated
		 */
		EClass PCN_POSITIVE_DECISION = eINSTANCE.getPCNPositiveDecision();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNNegativeDecisionImpl <em>PCN Negative Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNNegativeDecisionImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNNegativeDecision()
		 * @generated
		 */
		EClass PCN_NEGATIVE_DECISION = eINSTANCE.getPCNNegativeDecision();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNTagImpl <em>PCN Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNTagImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNTag()
		 * @generated
		 */
		EClass PCN_TAG = eINSTANCE.getPCNTag();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNMonetaryTagImpl <em>PCN Monetary Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNMonetaryTagImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNMonetaryTag()
		 * @generated
		 */
		EClass PCN_MONETARY_TAG = eINSTANCE.getPCNMonetaryTag();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNMonetaryBenefitImpl <em>PCN Monetary Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNMonetaryBenefitImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNMonetaryBenefit()
		 * @generated
		 */
		EClass PCN_MONETARY_BENEFIT = eINSTANCE.getPCNMonetaryBenefit();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNMonetaryCostImpl <em>PCN Monetary Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNMonetaryCostImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNMonetaryCost()
		 * @generated
		 */
		EClass PCN_MONETARY_COST = eINSTANCE.getPCNMonetaryCost();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNNonMonetaryTagImpl <em>PCN Non Monetary Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNNonMonetaryTagImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNNonMonetaryTag()
		 * @generated
		 */
		EClass PCN_NON_MONETARY_TAG = eINSTANCE.getPCNNonMonetaryTag();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNNonMonetaryBenefitImpl <em>PCN Non Monetary Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNNonMonetaryBenefitImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNNonMonetaryBenefit()
		 * @generated
		 */
		EClass PCN_NON_MONETARY_BENEFIT = eINSTANCE.getPCNNonMonetaryBenefit();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNNonMonetaryCostImpl <em>PCN Non Monetary Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNNonMonetaryCostImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNNonMonetaryCost()
		 * @generated
		 */
		EClass PCN_NON_MONETARY_COST = eINSTANCE.getPCNNonMonetaryCost();

	}

} //PcnPackage
