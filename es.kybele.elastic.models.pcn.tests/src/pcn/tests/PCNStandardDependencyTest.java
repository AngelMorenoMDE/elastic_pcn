/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNStandardDependency;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Standard Dependency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNStandardDependencyTest extends PCNProcessStepDependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNStandardDependencyTest.class);
	}

	/**
	 * Constructs a new PCN Standard Dependency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNStandardDependencyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Standard Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNStandardDependency getFixture() {
		return (PCNStandardDependency)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNStandardDependency());
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

} //PCNStandardDependencyTest
