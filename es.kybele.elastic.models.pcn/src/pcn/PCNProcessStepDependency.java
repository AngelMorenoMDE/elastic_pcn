/**
 */
package pcn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCN Process Step Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcn.PCNProcessStepDependency#getSourceProcessStep <em>Source Process Step</em>}</li>
 *   <li>{@link pcn.PCNProcessStepDependency#getTargetProcessStep <em>Target Process Step</em>}</li>
 * </ul>
 *
 * @see pcn.PcnPackage#getPCNProcessStepDependency()
 * @model abstract="true"
 * @generated
 */
public interface PCNProcessStepDependency extends PCNDependency {
	/**
	 * Returns the value of the '<em><b>Source Process Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Process Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Process Step</em>' reference.
	 * @see #setSourceProcessStep(PCNProcessStep)
	 * @see pcn.PcnPackage#getPCNProcessStepDependency_SourceProcessStep()
	 * @model
	 * @generated
	 */
	PCNProcessStep getSourceProcessStep();

	/**
	 * Sets the value of the '{@link pcn.PCNProcessStepDependency#getSourceProcessStep <em>Source Process Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Process Step</em>' reference.
	 * @see #getSourceProcessStep()
	 * @generated
	 */
	void setSourceProcessStep(PCNProcessStep value);

	/**
	 * Returns the value of the '<em><b>Target Process Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Process Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Process Step</em>' reference.
	 * @see #setTargetProcessStep(PCNProcessStep)
	 * @see pcn.PcnPackage#getPCNProcessStepDependency_TargetProcessStep()
	 * @model
	 * @generated
	 */
	PCNProcessStep getTargetProcessStep();

	/**
	 * Sets the value of the '{@link pcn.PCNProcessStepDependency#getTargetProcessStep <em>Target Process Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Process Step</em>' reference.
	 * @see #getTargetProcessStep()
	 * @generated
	 */
	void setTargetProcessStep(PCNProcessStep value);

} // PCNProcessStepDependency
