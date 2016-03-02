/**
 */
package pcn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcn.PCNMonetaryBenefit;
import pcn.PCNMonetaryCost;
import pcn.PCNNonMonetaryBenefit;
import pcn.PCNNonMonetaryCost;
import pcn.PCNProcessStepWithTags;
import pcn.PCNTag;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCN Process Step With Tags</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getAction <em>Action</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getNonMonetaryBenefits <em>Non Monetary Benefits</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getNonMonetaryCosts <em>Non Monetary Costs</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getMonetaryBenefits <em>Monetary Benefits</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getMonetaryCosts <em>Monetary Costs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PCNProcessStepWithTagsImpl extends MinimalEObjectImpl.Container implements PCNProcessStepWithTags {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNTag> tags;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected String predicate = PREDICATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNonMonetaryBenefits() <em>Non Monetary Benefits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMonetaryBenefits()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNNonMonetaryBenefit> nonMonetaryBenefits;

	/**
	 * The cached value of the '{@link #getNonMonetaryCosts() <em>Non Monetary Costs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMonetaryCosts()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNNonMonetaryCost> nonMonetaryCosts;

	/**
	 * The cached value of the '{@link #getMonetaryBenefits() <em>Monetary Benefits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonetaryBenefits()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNMonetaryBenefit> monetaryBenefits;

	/**
	 * The cached value of the '{@link #getMonetaryCosts() <em>Monetary Costs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonetaryCosts()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNMonetaryCost> monetaryCosts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCNProcessStepWithTagsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNTag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<PCNTag>(PCNTag.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(String newPredicate) {
		String oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PREDICATE, oldPredicate, predicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNNonMonetaryBenefit> getNonMonetaryBenefits() {
		if (nonMonetaryBenefits == null) {
			nonMonetaryBenefits = new EObjectContainmentEList<PCNNonMonetaryBenefit>(PCNNonMonetaryBenefit.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS);
		}
		return nonMonetaryBenefits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNNonMonetaryCost> getNonMonetaryCosts() {
		if (nonMonetaryCosts == null) {
			nonMonetaryCosts = new EObjectContainmentEList<PCNNonMonetaryCost>(PCNNonMonetaryCost.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS);
		}
		return nonMonetaryCosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNMonetaryBenefit> getMonetaryBenefits() {
		if (monetaryBenefits == null) {
			monetaryBenefits = new EObjectContainmentEList<PCNMonetaryBenefit>(PCNMonetaryBenefit.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS);
		}
		return monetaryBenefits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNMonetaryCost> getMonetaryCosts() {
		if (monetaryCosts == null) {
			monetaryCosts = new EObjectContainmentEList<PCNMonetaryCost>(PCNMonetaryCost.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS);
		}
		return monetaryCosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS:
				return ((InternalEList<?>)getNonMonetaryBenefits()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS:
				return ((InternalEList<?>)getNonMonetaryCosts()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS:
				return ((InternalEList<?>)getMonetaryBenefits()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS:
				return ((InternalEList<?>)getMonetaryCosts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TAGS:
				return getTags();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__ACTION:
				return getAction();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PREDICATE:
				return getPredicate();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS:
				return getNonMonetaryBenefits();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS:
				return getNonMonetaryCosts();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS:
				return getMonetaryBenefits();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS:
				return getMonetaryCosts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends PCNTag>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__ACTION:
				setAction((String)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PREDICATE:
				setPredicate((String)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS:
				getNonMonetaryBenefits().clear();
				getNonMonetaryBenefits().addAll((Collection<? extends PCNNonMonetaryBenefit>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS:
				getNonMonetaryCosts().clear();
				getNonMonetaryCosts().addAll((Collection<? extends PCNNonMonetaryCost>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS:
				getMonetaryBenefits().clear();
				getMonetaryBenefits().addAll((Collection<? extends PCNMonetaryBenefit>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS:
				getMonetaryCosts().clear();
				getMonetaryCosts().addAll((Collection<? extends PCNMonetaryCost>)newValue);
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
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TAGS:
				getTags().clear();
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PREDICATE:
				setPredicate(PREDICATE_EDEFAULT);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS:
				getNonMonetaryBenefits().clear();
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS:
				getNonMonetaryCosts().clear();
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS:
				getMonetaryBenefits().clear();
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS:
				getMonetaryCosts().clear();
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
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TAGS:
				return tags != null && !tags.isEmpty();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PREDICATE:
				return PREDICATE_EDEFAULT == null ? predicate != null : !PREDICATE_EDEFAULT.equals(predicate);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS:
				return nonMonetaryBenefits != null && !nonMonetaryBenefits.isEmpty();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS:
				return nonMonetaryCosts != null && !nonMonetaryCosts.isEmpty();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS:
				return monetaryBenefits != null && !monetaryBenefits.isEmpty();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS:
				return monetaryCosts != null && !monetaryCosts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (action: ");
		result.append(action);
		result.append(", predicate: ");
		result.append(predicate);
		result.append(')');
		return result.toString();
	}

} //PCNProcessStepWithTagsImpl
