/**
 */
package pcn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import pcn.PCNDependency;
import pcn.PCNDiagram;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCN Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcn.impl.PCNDependencyImpl#getInDiagram <em>In Diagram</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PCNDependencyImpl extends MinimalEObjectImpl.Container implements PCNDependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCNDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcnPackage.Literals.PCN_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNDiagram getInDiagram() {
		if (eContainerFeatureID() != PcnPackage.PCN_DEPENDENCY__IN_DIAGRAM) return null;
		return (PCNDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInDiagram(PCNDiagram newInDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInDiagram, PcnPackage.PCN_DEPENDENCY__IN_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInDiagram(PCNDiagram newInDiagram) {
		if (newInDiagram != eInternalContainer() || (eContainerFeatureID() != PcnPackage.PCN_DEPENDENCY__IN_DIAGRAM && newInDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newInDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInDiagram != null)
				msgs = ((InternalEObject)newInDiagram).eInverseAdd(this, PcnPackage.PCN_DIAGRAM__DIAGRAM_DEPENDENCIES, PCNDiagram.class, msgs);
			msgs = basicSetInDiagram(newInDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_DEPENDENCY__IN_DIAGRAM, newInDiagram, newInDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcnPackage.PCN_DEPENDENCY__IN_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInDiagram((PCNDiagram)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcnPackage.PCN_DEPENDENCY__IN_DIAGRAM:
				return basicSetInDiagram(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PcnPackage.PCN_DEPENDENCY__IN_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, PcnPackage.PCN_DIAGRAM__DIAGRAM_DEPENDENCIES, PCNDiagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcnPackage.PCN_DEPENDENCY__IN_DIAGRAM:
				return getInDiagram();
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
			case PcnPackage.PCN_DEPENDENCY__IN_DIAGRAM:
				setInDiagram((PCNDiagram)newValue);
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
			case PcnPackage.PCN_DEPENDENCY__IN_DIAGRAM:
				setInDiagram((PCNDiagram)null);
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
			case PcnPackage.PCN_DEPENDENCY__IN_DIAGRAM:
				return getInDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCNDependencyImpl
