/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNOptionalDependency;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Optional Dependency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNOptionalDependencyTest extends PCNProcessStepDependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNOptionalDependencyTest.class);
	}

	/**
	 * Constructs a new PCN Optional Dependency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNOptionalDependencyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Optional Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNOptionalDependency getFixture() {
		return (PCNOptionalDependency)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNOptionalDependency());
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

} //PCNOptionalDependencyTest
