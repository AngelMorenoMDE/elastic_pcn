/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNLongProcessStep;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Long Process Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNLongProcessStepTest extends PCNProcessStepWithTagsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNLongProcessStepTest.class);
	}

	/**
	 * Constructs a new PCN Long Process Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNLongProcessStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Long Process Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNLongProcessStep getFixture() {
		return (PCNLongProcessStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNLongProcessStep());
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

} //PCNLongProcessStepTest
