/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNRequiredDependency;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Required Dependency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNRequiredDependencyTest extends PCNProcessStepDependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNRequiredDependencyTest.class);
	}

	/**
	 * Constructs a new PCN Required Dependency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNRequiredDependencyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Required Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNRequiredDependency getFixture() {
		return (PCNRequiredDependency)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNRequiredDependency());
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

} //PCNRequiredDependencyTest
