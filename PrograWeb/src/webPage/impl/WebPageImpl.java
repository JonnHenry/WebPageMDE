/**
 */
package webPage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webPage.Footer;
import webPage.Header;
import webPage.Map;
import webPage.Subtitle;
import webPage.WebPage;
import webPage.WebPagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webPage.impl.WebPageImpl#getName <em>Name</em>}</li>
 *   <li>{@link webPage.impl.WebPageImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link webPage.impl.WebPageImpl#getMap <em>Map</em>}</li>
 *   <li>{@link webPage.impl.WebPageImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link webPage.impl.WebPageImpl#getSubtitle <em>Subtitle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebPageImpl extends MinimalEObjectImpl.Container implements WebPage {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFooter() <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected Footer footer;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected EList<Map> map;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected Header header;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected EList<Subtitle> subtitle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPagePackage.Literals.WEB_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.WEB_PAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Footer getFooter() {
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooter(Footer newFooter, NotificationChain msgs) {
		Footer oldFooter = footer;
		footer = newFooter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebPagePackage.WEB_PAGE__FOOTER, oldFooter, newFooter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(Footer newFooter) {
		if (newFooter != footer) {
			NotificationChain msgs = null;
			if (footer != null)
				msgs = ((InternalEObject)footer).eInverseRemove(this, WebPagePackage.FOOTER__WEBPAGE, Footer.class, msgs);
			if (newFooter != null)
				msgs = ((InternalEObject)newFooter).eInverseAdd(this, WebPagePackage.FOOTER__WEBPAGE, Footer.class, msgs);
			msgs = basicSetFooter(newFooter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.WEB_PAGE__FOOTER, newFooter, newFooter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Map> getMap() {
		if (map == null) {
			map = new EObjectContainmentWithInverseEList<Map>(Map.class, this, WebPagePackage.WEB_PAGE__MAP, WebPagePackage.MAP__WEBPAGE);
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(Header newHeader, NotificationChain msgs) {
		Header oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebPagePackage.WEB_PAGE__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(Header newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, WebPagePackage.HEADER__WEBPAGE, Header.class, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, WebPagePackage.HEADER__WEBPAGE, Header.class, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.WEB_PAGE__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subtitle> getSubtitle() {
		if (subtitle == null) {
			subtitle = new EObjectContainmentWithInverseEList<Subtitle>(Subtitle.class, this, WebPagePackage.WEB_PAGE__SUBTITLE, WebPagePackage.SUBTITLE__WEBPAGE);
		}
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebPagePackage.WEB_PAGE__FOOTER:
				if (footer != null)
					msgs = ((InternalEObject)footer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebPagePackage.WEB_PAGE__FOOTER, null, msgs);
				return basicSetFooter((Footer)otherEnd, msgs);
			case WebPagePackage.WEB_PAGE__MAP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMap()).basicAdd(otherEnd, msgs);
			case WebPagePackage.WEB_PAGE__HEADER:
				if (header != null)
					msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebPagePackage.WEB_PAGE__HEADER, null, msgs);
				return basicSetHeader((Header)otherEnd, msgs);
			case WebPagePackage.WEB_PAGE__SUBTITLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubtitle()).basicAdd(otherEnd, msgs);
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
			case WebPagePackage.WEB_PAGE__FOOTER:
				return basicSetFooter(null, msgs);
			case WebPagePackage.WEB_PAGE__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case WebPagePackage.WEB_PAGE__HEADER:
				return basicSetHeader(null, msgs);
			case WebPagePackage.WEB_PAGE__SUBTITLE:
				return ((InternalEList<?>)getSubtitle()).basicRemove(otherEnd, msgs);
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
			case WebPagePackage.WEB_PAGE__NAME:
				return getName();
			case WebPagePackage.WEB_PAGE__FOOTER:
				return getFooter();
			case WebPagePackage.WEB_PAGE__MAP:
				return getMap();
			case WebPagePackage.WEB_PAGE__HEADER:
				return getHeader();
			case WebPagePackage.WEB_PAGE__SUBTITLE:
				return getSubtitle();
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
			case WebPagePackage.WEB_PAGE__NAME:
				setName((String)newValue);
				return;
			case WebPagePackage.WEB_PAGE__FOOTER:
				setFooter((Footer)newValue);
				return;
			case WebPagePackage.WEB_PAGE__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends Map>)newValue);
				return;
			case WebPagePackage.WEB_PAGE__HEADER:
				setHeader((Header)newValue);
				return;
			case WebPagePackage.WEB_PAGE__SUBTITLE:
				getSubtitle().clear();
				getSubtitle().addAll((Collection<? extends Subtitle>)newValue);
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
			case WebPagePackage.WEB_PAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WebPagePackage.WEB_PAGE__FOOTER:
				setFooter((Footer)null);
				return;
			case WebPagePackage.WEB_PAGE__MAP:
				getMap().clear();
				return;
			case WebPagePackage.WEB_PAGE__HEADER:
				setHeader((Header)null);
				return;
			case WebPagePackage.WEB_PAGE__SUBTITLE:
				getSubtitle().clear();
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
			case WebPagePackage.WEB_PAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WebPagePackage.WEB_PAGE__FOOTER:
				return footer != null;
			case WebPagePackage.WEB_PAGE__MAP:
				return map != null && !map.isEmpty();
			case WebPagePackage.WEB_PAGE__HEADER:
				return header != null;
			case WebPagePackage.WEB_PAGE__SUBTITLE:
				return subtitle != null && !subtitle.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WebPageImpl
