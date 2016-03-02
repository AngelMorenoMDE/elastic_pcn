/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNStandardProcessStep;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Standard Process Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNStandardProcessStepTest extends PCNProcessStepWithTagsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNStandardProcessStepTest.class);
	}

	/**
	 * Constructs a new PCN Standard Process Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNStandardProcessStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Standard Process Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNStandardProcessStep getFixture() {
		return (PCNStandardProcessStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNStandardProcessStep());
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

} //PCNStandardProcessStepTest
