/**
 */
package pcn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcn.PCNDecisionProcessStep;
import pcn.PCNProcessStep;
import pcn.PCNProcessStepDecisionDependency;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCN Process Step Decision Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcn.impl.PCNProcessStepDecisionDependencyImpl#getSourceProcessStepDecision <em>Source Process Step Decision</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepDecisionDependencyImpl#getTargetProcessStep <em>Target Process Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PCNProcessStepDecisionDependencyImpl extends PCNDependencyImpl implements PCNProcessStepDecisionDependency {
	/**
	 * The cached value of the '{@link #getSourceProcessStepDecision() <em>Source Process Step Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProcessStepDecision()
	 * @generated
	 * @ordered
	 */
	protected PCNDecisionProcessStep sourceProcessStepDecision;

	/**
	 * The cached value of the '{@link #getTargetProcessStep() <em>Target Process Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProcessStep()
	 * @generated
	 * @ordered
	 */
	protected PCNProcessStep targetProcessStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCNProcessStepDecisionDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcnPackage.Literals.PCN_PROCESS_STEP_DECISION_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNDecisionProcessStep getSourceProcessStepDecision() {
		if (sourceProcessStepDecision != null && sourceProcessStepDecision.eIsProxy()) {
			InternalEObject oldSourceProcessStepDecision = (InternalEObject)sourceProcessStepDecision;
			sourceProcessStepDecision = (PCNDecisionProcessStep)eResolveProxy(oldSourceProcessStepDecision);
			if (sourceProcessStepDecision != oldSourceProcessStepDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcnPackage.PCN_PROCESS_STEP_DECISION_DEPENDENCY__SOURCE_PROCESS_STEP_DECISION, oldSourceProcessStepDecision, sourceProcessStepDecision));
			}
		}
		return sourceProcessStepDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNDecisionProcessStep basicGetSourceProcessStepDecision() {
		return sourceProcessStepDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceProcessStepDecision(PCNDecisionProcessStep newSourceProcessStepDecision) {
		PCNDecisionProcessStep oldSourceProcessStepDecision = sourceProcessStepDecision;
		sourceProcessStepDecision = newSourceProcessStepDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_STEP_DECISION_DEPENDENCY__SOURCE_PROCESS_STEP_DECISION, oldSourceProcessStepDecision, sourceProcessStepDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProcessStep getTargetProcessStep() {
		if (targetProcessStep != null && targetProcessStep.eIsProxy()) {
			InternalEObject oldTargetProcessStep = (InternalEObject)targetProcessStep;
			targetProcessStep = (PCNProcessStep)eResolveProxy(oldTargetProcessStep);
			if (targetProcessStep != oldTargetProcessStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcnPackage.PCN_PROCESS_STEP_DECISION_DEPENDENCY__TARGET_PROCESS_STEP, oldTargetProcessStep, targetProcessStep));
			}
		}
		return targetProcessStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProcessStep basicGetTargetProcessStep() {
		return targetProcessStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetProcessStep(PCNProcessStep newTargetProcessStep) {
		PCNProcessStep oldTargetProcessStep = targetProcessStep;
		targetProcessStep = newTargetProcessStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_STEP_DECISION_DEPENDENCY__TARGET_PROCESS_STEP, oldTargetProcessStep, targetProcessStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_STEP_DECISION_DEPENDENCY__SOURCE_PROCESS_STEP_DECISION:
				if (resolve) return getSourceProcessStepDecision();
				return basicGetSourceProcessStepDecision();
			case PcnPackage.PCN_PROCESS_STEP_DECISION_DEPENDENCY__TARGET_PROCESS_STEP:
				if (resolve) return getTargetProcessStep();
				return basicGetTargetProcessStep();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_STEP_DECISION_DEPENDENCY__SOURCE_PROCESS_STEP_DECISION:
				setSourceProcessStepDecision((PCNDecisionProcessStep)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_DECISION_DEPENDENCY__TARGET_PROCESS_STEP:
				setTargetProcessStep((PCNProcessStep)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_STEP_DECISION_DEPENDENCY__SOURCE_PROCESS_STEP_DECISION:
				setSourceProcessStepDecision((PCNDecisionProcessStep)null);
				return;
			case PcnPackage.PCN_PROCESS_STEP_DECISION_DEPENDENCY__TARGET_PROCESS_STEP:
				setTargetProcessStep((PCNProcessStep)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_STEP_DECISION_DEPENDENCY__SOURCE_PROCESS_STEP_DECISION:
				return sourceProcessStepDecision != null;
			case PcnPackage.PCN_PROCESS_STEP_DECISION_DEPENDENCY__TARGET_PROCESS_STEP:
				return targetProcessStep != null;
		}
		return super.eIsSet(featureID);
	}

} //PCNProcessStepDecisionDependencyImpl
