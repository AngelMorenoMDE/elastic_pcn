/**
 */
package pcn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcn.PCNProcessStep;
import pcn.PCNProcessStepDependency;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCN Process Step Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcn.impl.PCNProcessStepDependencyImpl#getSourceProcessStep <em>Source Process Step</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepDependencyImpl#getTargetProcessStep <em>Target Process Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PCNProcessStepDependencyImpl extends PCNDependencyImpl implements PCNProcessStepDependency {
	/**
	 * The cached value of the '{@link #getSourceProcessStep() <em>Source Process Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProcessStep()
	 * @generated
	 * @ordered
	 */
	protected PCNProcessStep sourceProcessStep;

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
	protected PCNProcessStepDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcnPackage.Literals.PCN_PROCESS_STEP_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProcessStep getSourceProcessStep() {
		if (sourceProcessStep != null && sourceProcessStep.eIsProxy()) {
			InternalEObject oldSourceProcessStep = (InternalEObject)sourceProcessStep;
			sourceProcessStep = (PCNProcessStep)eResolveProxy(oldSourceProcessStep);
			if (sourceProcessStep != oldSourceProcessStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcnPackage.PCN_PROCESS_STEP_DEPENDENCY__SOURCE_PROCESS_STEP, oldSourceProcessStep, sourceProcessStep));
			}
		}
		return sourceProcessStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProcessStep basicGetSourceProcessStep() {
		return sourceProcessStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceProcessStep(PCNProcessStep newSourceProcessStep) {
		PCNProcessStep oldSourceProcessStep = sourceProcessStep;
		sourceProcessStep = newSourceProcessStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_STEP_DEPENDENCY__SOURCE_PROCESS_STEP, oldSourceProcessStep, sourceProcessStep));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcnPackage.PCN_PROCESS_STEP_DEPENDENCY__TARGET_PROCESS_STEP, oldTargetProcessStep, targetProcessStep));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_STEP_DEPENDENCY__TARGET_PROCESS_STEP, oldTargetProcessStep, targetProcessStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_STEP_DEPENDENCY__SOURCE_PROCESS_STEP:
				if (resolve) return getSourceProcessStep();
				return basicGetSourceProcessStep();
			case PcnPackage.PCN_PROCESS_STEP_DEPENDENCY__TARGET_PROCESS_STEP:
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
			case PcnPackage.PCN_PROCESS_STEP_DEPENDENCY__SOURCE_PROCESS_STEP:
				setSourceProcessStep((PCNProcessStep)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_DEPENDENCY__TARGET_PROCESS_STEP:
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
			case PcnPackage.PCN_PROCESS_STEP_DEPENDENCY__SOURCE_PROCESS_STEP:
				setSourceProcessStep((PCNProcessStep)null);
				return;
			case PcnPackage.PCN_PROCESS_STEP_DEPENDENCY__TARGET_PROCESS_STEP:
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
			case PcnPackage.PCN_PROCESS_STEP_DEPENDENCY__SOURCE_PROCESS_STEP:
				return sourceProcessStep != null;
			case PcnPackage.PCN_PROCESS_STEP_DEPENDENCY__TARGET_PROCESS_STEP:
				return targetProcessStep != null;
		}
		return super.eIsSet(featureID);
	}

} //PCNProcessStepDependencyImpl
