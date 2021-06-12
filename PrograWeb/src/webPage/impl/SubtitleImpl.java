/**
 */
package webPage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import webPage.Paragraph;
import webPage.Style;
import webPage.Subtitle;
import webPage.WebPage;
import webPage.WebPagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtitle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webPage.impl.SubtitleImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link webPage.impl.SubtitleImpl#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link webPage.impl.SubtitleImpl#getWebpage <em>Webpage</em>}</li>
 *   <li>{@link webPage.impl.SubtitleImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubtitleImpl extends MinimalEObjectImpl.Container implements Subtitle {
	/**
	 * The default value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected String subtitle = SUBTITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParagraph() <em>Paragraph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraph()
	 * @generated
	 * @ordered
	 */
	protected Paragraph paragraph;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected Style style;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtitleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPagePackage.Literals.SUBTITLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtitle(String newSubtitle) {
		String oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.SUBTITLE__SUBTITLE, oldSubtitle, subtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph getParagraph() {
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParagraph(Paragraph newParagraph, NotificationChain msgs) {
		Paragraph oldParagraph = paragraph;
		paragraph = newParagraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebPagePackage.SUBTITLE__PARAGRAPH, oldParagraph, newParagraph);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraph(Paragraph newParagraph) {
		if (newParagraph != paragraph) {
			NotificationChain msgs = null;
			if (paragraph != null)
				msgs = ((InternalEObject)paragraph).eInverseRemove(this, WebPagePackage.PARAGRAPH__TOPIC, Paragraph.class, msgs);
			if (newParagraph != null)
				msgs = ((InternalEObject)newParagraph).eInverseAdd(this, WebPagePackage.PARAGRAPH__TOPIC, Paragraph.class, msgs);
			msgs = basicSetParagraph(newParagraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.SUBTITLE__PARAGRAPH, newParagraph, newParagraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebPage getWebpage() {
		if (eContainerFeatureID() != WebPagePackage.SUBTITLE__WEBPAGE) return null;
		return (WebPage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebpage(WebPage newWebpage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWebpage, WebPagePackage.SUBTITLE__WEBPAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebpage(WebPage newWebpage) {
		if (newWebpage != eInternalContainer() || (eContainerFeatureID() != WebPagePackage.SUBTITLE__WEBPAGE && newWebpage != null)) {
			if (EcoreUtil.isAncestor(this, newWebpage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWebpage != null)
				msgs = ((InternalEObject)newWebpage).eInverseAdd(this, WebPagePackage.WEB_PAGE__SUBTITLE, WebPage.class, msgs);
			msgs = basicSetWebpage(newWebpage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.SUBTITLE__WEBPAGE, newWebpage, newWebpage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Style getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(Style newStyle, NotificationChain msgs) {
		Style oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebPagePackage.SUBTITLE__STYLE, oldStyle, newStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(Style newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject)style).eInverseRemove(this, WebPagePackage.STYLE__SUBTITLE, Style.class, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject)newStyle).eInverseAdd(this, WebPagePackage.STYLE__SUBTITLE, Style.class, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.SUBTITLE__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebPagePackage.SUBTITLE__PARAGRAPH:
				if (paragraph != null)
					msgs = ((InternalEObject)paragraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebPagePackage.SUBTITLE__PARAGRAPH, null, msgs);
				return basicSetParagraph((Paragraph)otherEnd, msgs);
			case WebPagePackage.SUBTITLE__WEBPAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWebpage((WebPage)otherEnd, msgs);
			case WebPagePackage.SUBTITLE__STYLE:
				if (style != null)
					msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebPagePackage.SUBTITLE__STYLE, null, msgs);
				return basicSetStyle((Style)otherEnd, msgs);
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
			case WebPagePackage.SUBTITLE__PARAGRAPH:
				return basicSetParagraph(null, msgs);
			case WebPagePackage.SUBTITLE__WEBPAGE:
				return basicSetWebpage(null, msgs);
			case WebPagePackage.SUBTITLE__STYLE:
				return basicSetStyle(null, msgs);
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
			case WebPagePackage.SUBTITLE__WEBPAGE:
				return eInternalContainer().eInverseRemove(this, WebPagePackage.WEB_PAGE__SUBTITLE, WebPage.class, msgs);
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
			case WebPagePackage.SUBTITLE__SUBTITLE:
				return getSubtitle();
			case WebPagePackage.SUBTITLE__PARAGRAPH:
				return getParagraph();
			case WebPagePackage.SUBTITLE__WEBPAGE:
				return getWebpage();
			case WebPagePackage.SUBTITLE__STYLE:
				return getStyle();
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
			case WebPagePackage.SUBTITLE__SUBTITLE:
				setSubtitle((String)newValue);
				return;
			case WebPagePackage.SUBTITLE__PARAGRAPH:
				setParagraph((Paragraph)newValue);
				return;
			case WebPagePackage.SUBTITLE__WEBPAGE:
				setWebpage((WebPage)newValue);
				return;
			case WebPagePackage.SUBTITLE__STYLE:
				setStyle((Style)newValue);
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
			case WebPagePackage.SUBTITLE__SUBTITLE:
				setSubtitle(SUBTITLE_EDEFAULT);
				return;
			case WebPagePackage.SUBTITLE__PARAGRAPH:
				setParagraph((Paragraph)null);
				return;
			case WebPagePackage.SUBTITLE__WEBPAGE:
				setWebpage((WebPage)null);
				return;
			case WebPagePackage.SUBTITLE__STYLE:
				setStyle((Style)null);
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
			case WebPagePackage.SUBTITLE__SUBTITLE:
				return SUBTITLE_EDEFAULT == null ? subtitle != null : !SUBTITLE_EDEFAULT.equals(subtitle);
			case WebPagePackage.SUBTITLE__PARAGRAPH:
				return paragraph != null;
			case WebPagePackage.SUBTITLE__WEBPAGE:
				return getWebpage() != null;
			case WebPagePackage.SUBTITLE__STYLE:
				return style != null;
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
		result.append(" (subtitle: ");
		result.append(subtitle);
		result.append(')');
		return result.toString();
	}

} //SubtitleImpl
