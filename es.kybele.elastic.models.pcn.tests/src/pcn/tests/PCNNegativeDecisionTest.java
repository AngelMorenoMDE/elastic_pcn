/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNNegativeDecision;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Negative Decision</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNNegativeDecisionTest extends PCNProcessStepDecisionDependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNNegativeDecisionTest.class);
	}

	/**
	 * Constructs a new PCN Negative Decision test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNNegativeDecisionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Negative Decision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNNegativeDecision getFixture() {
		return (PCNNegativeDecision)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNNegativeDecision());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PCNNegativeDecisionTest
