/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNDecisionProcessStep;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Decision Process Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNDecisionProcessStepTest extends PCNProcessStepWithTagsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNDecisionProcessStepTest.class);
	}

	/**
	 * Constructs a new PCN Decision Process Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNDecisionProcessStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Decision Process Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNDecisionProcessStep getFixture() {
		return (PCNDecisionProcessStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNDecisionProcessStep());
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

} //PCNDecisionProcessStepTest
