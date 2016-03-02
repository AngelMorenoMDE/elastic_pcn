/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNStartProcessStep;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Start Process Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNStartProcessStepTest extends PCNProcessStepWithTagsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNStartProcessStepTest.class);
	}

	/**
	 * Constructs a new PCN Start Process Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNStartProcessStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Start Process Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNStartProcessStep getFixture() {
		return (PCNStartProcessStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNStartProcessStep());
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

} //PCNStartProcessStepTest
