/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNWaitProcessStep;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Wait Process Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNWaitProcessStepTest extends PCNProcessStepWithTagsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNWaitProcessStepTest.class);
	}

	/**
	 * Constructs a new PCN Wait Process Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNWaitProcessStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Wait Process Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNWaitProcessStep getFixture() {
		return (PCNWaitProcessStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNWaitProcessStep());
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

} //PCNWaitProcessStepTest
