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

import pcn.PCNReference;
import pcn.PCNTag;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCN Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcn.impl.PCNReferenceImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link pcn.impl.PCNReferenceImpl#getAction <em>Action</em>}</li>
 *   <li>{@link pcn.impl.PCNReferenceImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link pcn.impl.PCNReferenceImpl#getLetter <em>Letter</em>}</li>
 *   <li>{@link pcn.impl.PCNReferenceImpl#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCNReferenceImpl extends MinimalEObjectImpl.Container implements PCNReference {
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
	 * The default value of the '{@link #getLetter() <em>Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetter()
	 * @generated
	 * @ordered
	 */
	protected static final char LETTER_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getLetter() <em>Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetter()
	 * @generated
	 * @ordered
	 */
	protected char letter = LETTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final char NUMBER_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected char number = NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCNReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcnPackage.Literals.PCN_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNTag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<PCNTag>(PCNTag.class, this, PcnPackage.PCN_REFERENCE__TAGS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_REFERENCE__ACTION, oldAction, action));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_REFERENCE__PREDICATE, oldPredicate, predicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getLetter() {
		return letter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetter(char newLetter) {
		char oldLetter = letter;
		letter = newLetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_REFERENCE__LETTER, oldLetter, letter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(char newNumber) {
		char oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_REFERENCE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcnPackage.PCN_REFERENCE__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
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
			case PcnPackage.PCN_REFERENCE__TAGS:
				return getTags();
			case PcnPackage.PCN_REFERENCE__ACTION:
				return getAction();
			case PcnPackage.PCN_REFERENCE__PREDICATE:
				return getPredicate();
			case PcnPackage.PCN_REFERENCE__LETTER:
				return getLetter();
			case PcnPackage.PCN_REFERENCE__NUMBER:
				return getNumber();
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
			case PcnPackage.PCN_REFERENCE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends PCNTag>)newValue);
				return;
			case PcnPackage.PCN_REFERENCE__ACTION:
				setAction((String)newValue);
				return;
			case PcnPackage.PCN_REFERENCE__PREDICATE:
				setPredicate((String)newValue);
				return;
			case PcnPackage.PCN_REFERENCE__LETTER:
				setLetter((Character)newValue);
				return;
			case PcnPackage.PCN_REFERENCE__NUMBER:
				setNumber((Character)newValue);
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
			case PcnPackage.PCN_REFERENCE__TAGS:
				getTags().clear();
				return;
			case PcnPackage.PCN_REFERENCE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case PcnPackage.PCN_REFERENCE__PREDICATE:
				setPredicate(PREDICATE_EDEFAULT);
				return;
			case PcnPackage.PCN_REFERENCE__LETTER:
				setLetter(LETTER_EDEFAULT);
				return;
			case PcnPackage.PCN_REFERENCE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
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
			case PcnPackage.PCN_REFERENCE__TAGS:
				return tags != null && !tags.isEmpty();
			case PcnPackage.PCN_REFERENCE__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case PcnPackage.PCN_REFERENCE__PREDICATE:
				return PREDICATE_EDEFAULT == null ? predicate != null : !PREDICATE_EDEFAULT.equals(predicate);
			case PcnPackage.PCN_REFERENCE__LETTER:
				return letter != LETTER_EDEFAULT;
			case PcnPackage.PCN_REFERENCE__NUMBER:
				return number != NUMBER_EDEFAULT;
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
		result.append(", letter: ");
		result.append(letter);
		result.append(", number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //PCNReferenceImpl
