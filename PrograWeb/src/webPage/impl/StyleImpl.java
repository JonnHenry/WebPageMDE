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

import webPage.Footer;
import webPage.Header;
import webPage.Map;
import webPage.Paragraph;
import webPage.Style;
import webPage.Subtitle;
import webPage.WebPagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webPage.impl.StyleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getFont <em>Font</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getFont_size <em>Font size</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getBackground_color <em>Background color</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getMargin <em>Margin</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getText_align <em>Text align</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getBorder_radius <em>Border radius</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getMap <em>Map</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link webPage.impl.StyleImpl#getDisplay <em>Display</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleImpl extends MinimalEObjectImpl.Container implements Style {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected String font = FONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFont_size() <em>Font size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_size()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFont_size() <em>Font size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_size()
	 * @generated
	 * @ordered
	 */
	protected String font_size = FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackground_color() <em>Background color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground_color()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackground_color() <em>Background color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground_color()
	 * @generated
	 * @ordered
	 */
	protected String background_color = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected String border = BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected String position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected String margin = MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected String padding = PADDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getText_align() <em>Text align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText_align()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText_align() <em>Text align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText_align()
	 * @generated
	 * @ordered
	 */
	protected String text_align = TEXT_ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorder_radius() <em>Border radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder_radius()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorder_radius() <em>Border radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder_radius()
	 * @generated
	 * @ordered
	 */
	protected String border_radius = BORDER_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected static final String LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected String left = LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected String background = BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected static final String BOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected String bottom = BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected String display = DISPLAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPagePackage.Literals.STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(String newFont) {
		String oldFont = font;
		font = newFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__FONT, oldFont, font));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFont_size() {
		return font_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont_size(String newFont_size) {
		String oldFont_size = font_size;
		font_size = newFont_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__FONT_SIZE, oldFont_size, font_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackground_color() {
		return background_color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground_color(String newBackground_color) {
		String oldBackground_color = background_color;
		background_color = newBackground_color;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__BACKGROUND_COLOR, oldBackground_color, background_color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(String newBorder) {
		String oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(String newPosition) {
		String oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargin(String newMargin) {
		String oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__MARGIN, oldMargin, margin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPadding() {
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadding(String newPadding) {
		String oldPadding = padding;
		padding = newPadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__PADDING, oldPadding, padding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText_align() {
		return text_align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText_align(String newText_align) {
		String oldText_align = text_align;
		text_align = newText_align;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__TEXT_ALIGN, oldText_align, text_align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorder_radius() {
		return border_radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder_radius(String newBorder_radius) {
		String oldBorder_radius = border_radius;
		border_radius = newBorder_radius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__BORDER_RADIUS, oldBorder_radius, border_radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(String newLeft) {
		String oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Footer getFooter() {
		if (eContainerFeatureID() != WebPagePackage.STYLE__FOOTER) return null;
		return (Footer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooter(Footer newFooter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFooter, WebPagePackage.STYLE__FOOTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(Footer newFooter) {
		if (newFooter != eInternalContainer() || (eContainerFeatureID() != WebPagePackage.STYLE__FOOTER && newFooter != null)) {
			if (EcoreUtil.isAncestor(this, newFooter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFooter != null)
				msgs = ((InternalEObject)newFooter).eInverseAdd(this, WebPagePackage.FOOTER__STYLE, Footer.class, msgs);
			msgs = basicSetFooter(newFooter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__FOOTER, newFooter, newFooter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getMap() {
		if (eContainerFeatureID() != WebPagePackage.STYLE__MAP) return null;
		return (Map)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMap(Map newMap, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMap, WebPagePackage.STYLE__MAP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(Map newMap) {
		if (newMap != eInternalContainer() || (eContainerFeatureID() != WebPagePackage.STYLE__MAP && newMap != null)) {
			if (EcoreUtil.isAncestor(this, newMap))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMap != null)
				msgs = ((InternalEObject)newMap).eInverseAdd(this, WebPagePackage.MAP__STYLE, Map.class, msgs);
			msgs = basicSetMap(newMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__MAP, newMap, newMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph getParagraph() {
		if (eContainerFeatureID() != WebPagePackage.STYLE__PARAGRAPH) return null;
		return (Paragraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParagraph(Paragraph newParagraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParagraph, WebPagePackage.STYLE__PARAGRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraph(Paragraph newParagraph) {
		if (newParagraph != eInternalContainer() || (eContainerFeatureID() != WebPagePackage.STYLE__PARAGRAPH && newParagraph != null)) {
			if (EcoreUtil.isAncestor(this, newParagraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParagraph != null)
				msgs = ((InternalEObject)newParagraph).eInverseAdd(this, WebPagePackage.PARAGRAPH__STYLE, Paragraph.class, msgs);
			msgs = basicSetParagraph(newParagraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__PARAGRAPH, newParagraph, newParagraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header getHeader() {
		if (eContainerFeatureID() != WebPagePackage.STYLE__HEADER) return null;
		return (Header)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(Header newHeader, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHeader, WebPagePackage.STYLE__HEADER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(Header newHeader) {
		if (newHeader != eInternalContainer() || (eContainerFeatureID() != WebPagePackage.STYLE__HEADER && newHeader != null)) {
			if (EcoreUtil.isAncestor(this, newHeader))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, WebPagePackage.HEADER__STYLE, Header.class, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(String newBackground) {
		String oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBottom() {
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottom(String newBottom) {
		String oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__BOTTOM, oldBottom, bottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(String newDisplay) {
		String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__DISPLAY, oldDisplay, display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtitle getSubtitle() {
		if (eContainerFeatureID() != WebPagePackage.STYLE__SUBTITLE) return null;
		return (Subtitle)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(Subtitle newSubtitle, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSubtitle, WebPagePackage.STYLE__SUBTITLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtitle(Subtitle newSubtitle) {
		if (newSubtitle != eInternalContainer() || (eContainerFeatureID() != WebPagePackage.STYLE__SUBTITLE && newSubtitle != null)) {
			if (EcoreUtil.isAncestor(this, newSubtitle))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSubtitle != null)
				msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, WebPagePackage.SUBTITLE__STYLE, Subtitle.class, msgs);
			msgs = basicSetSubtitle(newSubtitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPagePackage.STYLE__SUBTITLE, newSubtitle, newSubtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebPagePackage.STYLE__FOOTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFooter((Footer)otherEnd, msgs);
			case WebPagePackage.STYLE__MAP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMap((Map)otherEnd, msgs);
			case WebPagePackage.STYLE__PARAGRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParagraph((Paragraph)otherEnd, msgs);
			case WebPagePackage.STYLE__SUBTITLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSubtitle((Subtitle)otherEnd, msgs);
			case WebPagePackage.STYLE__HEADER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHeader((Header)otherEnd, msgs);
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
			case WebPagePackage.STYLE__FOOTER:
				return basicSetFooter(null, msgs);
			case WebPagePackage.STYLE__MAP:
				return basicSetMap(null, msgs);
			case WebPagePackage.STYLE__PARAGRAPH:
				return basicSetParagraph(null, msgs);
			case WebPagePackage.STYLE__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case WebPagePackage.STYLE__HEADER:
				return basicSetHeader(null, msgs);
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
			case WebPagePackage.STYLE__FOOTER:
				return eInternalContainer().eInverseRemove(this, WebPagePackage.FOOTER__STYLE, Footer.class, msgs);
			case WebPagePackage.STYLE__MAP:
				return eInternalContainer().eInverseRemove(this, WebPagePackage.MAP__STYLE, Map.class, msgs);
			case WebPagePackage.STYLE__PARAGRAPH:
				return eInternalContainer().eInverseRemove(this, WebPagePackage.PARAGRAPH__STYLE, Paragraph.class, msgs);
			case WebPagePackage.STYLE__SUBTITLE:
				return eInternalContainer().eInverseRemove(this, WebPagePackage.SUBTITLE__STYLE, Subtitle.class, msgs);
			case WebPagePackage.STYLE__HEADER:
				return eInternalContainer().eInverseRemove(this, WebPagePackage.HEADER__STYLE, Header.class, msgs);
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
			case WebPagePackage.STYLE__COLOR:
				return getColor();
			case WebPagePackage.STYLE__FONT:
				return getFont();
			case WebPagePackage.STYLE__FONT_SIZE:
				return getFont_size();
			case WebPagePackage.STYLE__BACKGROUND_COLOR:
				return getBackground_color();
			case WebPagePackage.STYLE__BORDER:
				return getBorder();
			case WebPagePackage.STYLE__POSITION:
				return getPosition();
			case WebPagePackage.STYLE__MARGIN:
				return getMargin();
			case WebPagePackage.STYLE__PADDING:
				return getPadding();
			case WebPagePackage.STYLE__TEXT_ALIGN:
				return getText_align();
			case WebPagePackage.STYLE__BORDER_RADIUS:
				return getBorder_radius();
			case WebPagePackage.STYLE__HEIGHT:
				return getHeight();
			case WebPagePackage.STYLE__LEFT:
				return getLeft();
			case WebPagePackage.STYLE__FOOTER:
				return getFooter();
			case WebPagePackage.STYLE__MAP:
				return getMap();
			case WebPagePackage.STYLE__PARAGRAPH:
				return getParagraph();
			case WebPagePackage.STYLE__SUBTITLE:
				return getSubtitle();
			case WebPagePackage.STYLE__HEADER:
				return getHeader();
			case WebPagePackage.STYLE__BACKGROUND:
				return getBackground();
			case WebPagePackage.STYLE__BOTTOM:
				return getBottom();
			case WebPagePackage.STYLE__WIDTH:
				return getWidth();
			case WebPagePackage.STYLE__DISPLAY:
				return getDisplay();
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
			case WebPagePackage.STYLE__COLOR:
				setColor((String)newValue);
				return;
			case WebPagePackage.STYLE__FONT:
				setFont((String)newValue);
				return;
			case WebPagePackage.STYLE__FONT_SIZE:
				setFont_size((String)newValue);
				return;
			case WebPagePackage.STYLE__BACKGROUND_COLOR:
				setBackground_color((String)newValue);
				return;
			case WebPagePackage.STYLE__BORDER:
				setBorder((String)newValue);
				return;
			case WebPagePackage.STYLE__POSITION:
				setPosition((String)newValue);
				return;
			case WebPagePackage.STYLE__MARGIN:
				setMargin((String)newValue);
				return;
			case WebPagePackage.STYLE__PADDING:
				setPadding((String)newValue);
				return;
			case WebPagePackage.STYLE__TEXT_ALIGN:
				setText_align((String)newValue);
				return;
			case WebPagePackage.STYLE__BORDER_RADIUS:
				setBorder_radius((String)newValue);
				return;
			case WebPagePackage.STYLE__HEIGHT:
				setHeight((String)newValue);
				return;
			case WebPagePackage.STYLE__LEFT:
				setLeft((String)newValue);
				return;
			case WebPagePackage.STYLE__FOOTER:
				setFooter((Footer)newValue);
				return;
			case WebPagePackage.STYLE__MAP:
				setMap((Map)newValue);
				return;
			case WebPagePackage.STYLE__PARAGRAPH:
				setParagraph((Paragraph)newValue);
				return;
			case WebPagePackage.STYLE__SUBTITLE:
				setSubtitle((Subtitle)newValue);
				return;
			case WebPagePackage.STYLE__HEADER:
				setHeader((Header)newValue);
				return;
			case WebPagePackage.STYLE__BACKGROUND:
				setBackground((String)newValue);
				return;
			case WebPagePackage.STYLE__BOTTOM:
				setBottom((String)newValue);
				return;
			case WebPagePackage.STYLE__WIDTH:
				setWidth((String)newValue);
				return;
			case WebPagePackage.STYLE__DISPLAY:
				setDisplay((String)newValue);
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
			case WebPagePackage.STYLE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case WebPagePackage.STYLE__FONT:
				setFont(FONT_EDEFAULT);
				return;
			case WebPagePackage.STYLE__FONT_SIZE:
				setFont_size(FONT_SIZE_EDEFAULT);
				return;
			case WebPagePackage.STYLE__BACKGROUND_COLOR:
				setBackground_color(BACKGROUND_COLOR_EDEFAULT);
				return;
			case WebPagePackage.STYLE__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case WebPagePackage.STYLE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case WebPagePackage.STYLE__MARGIN:
				setMargin(MARGIN_EDEFAULT);
				return;
			case WebPagePackage.STYLE__PADDING:
				setPadding(PADDING_EDEFAULT);
				return;
			case WebPagePackage.STYLE__TEXT_ALIGN:
				setText_align(TEXT_ALIGN_EDEFAULT);
				return;
			case WebPagePackage.STYLE__BORDER_RADIUS:
				setBorder_radius(BORDER_RADIUS_EDEFAULT);
				return;
			case WebPagePackage.STYLE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case WebPagePackage.STYLE__LEFT:
				setLeft(LEFT_EDEFAULT);
				return;
			case WebPagePackage.STYLE__FOOTER:
				setFooter((Footer)null);
				return;
			case WebPagePackage.STYLE__MAP:
				setMap((Map)null);
				return;
			case WebPagePackage.STYLE__PARAGRAPH:
				setParagraph((Paragraph)null);
				return;
			case WebPagePackage.STYLE__SUBTITLE:
				setSubtitle((Subtitle)null);
				return;
			case WebPagePackage.STYLE__HEADER:
				setHeader((Header)null);
				return;
			case WebPagePackage.STYLE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case WebPagePackage.STYLE__BOTTOM:
				setBottom(BOTTOM_EDEFAULT);
				return;
			case WebPagePackage.STYLE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case WebPagePackage.STYLE__DISPLAY:
				setDisplay(DISPLAY_EDEFAULT);
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
			case WebPagePackage.STYLE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case WebPagePackage.STYLE__FONT:
				return FONT_EDEFAULT == null ? font != null : !FONT_EDEFAULT.equals(font);
			case WebPagePackage.STYLE__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? font_size != null : !FONT_SIZE_EDEFAULT.equals(font_size);
			case WebPagePackage.STYLE__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? background_color != null : !BACKGROUND_COLOR_EDEFAULT.equals(background_color);
			case WebPagePackage.STYLE__BORDER:
				return BORDER_EDEFAULT == null ? border != null : !BORDER_EDEFAULT.equals(border);
			case WebPagePackage.STYLE__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case WebPagePackage.STYLE__MARGIN:
				return MARGIN_EDEFAULT == null ? margin != null : !MARGIN_EDEFAULT.equals(margin);
			case WebPagePackage.STYLE__PADDING:
				return PADDING_EDEFAULT == null ? padding != null : !PADDING_EDEFAULT.equals(padding);
			case WebPagePackage.STYLE__TEXT_ALIGN:
				return TEXT_ALIGN_EDEFAULT == null ? text_align != null : !TEXT_ALIGN_EDEFAULT.equals(text_align);
			case WebPagePackage.STYLE__BORDER_RADIUS:
				return BORDER_RADIUS_EDEFAULT == null ? border_radius != null : !BORDER_RADIUS_EDEFAULT.equals(border_radius);
			case WebPagePackage.STYLE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case WebPagePackage.STYLE__LEFT:
				return LEFT_EDEFAULT == null ? left != null : !LEFT_EDEFAULT.equals(left);
			case WebPagePackage.STYLE__FOOTER:
				return getFooter() != null;
			case WebPagePackage.STYLE__MAP:
				return getMap() != null;
			case WebPagePackage.STYLE__PARAGRAPH:
				return getParagraph() != null;
			case WebPagePackage.STYLE__SUBTITLE:
				return getSubtitle() != null;
			case WebPagePackage.STYLE__HEADER:
				return getHeader() != null;
			case WebPagePackage.STYLE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case WebPagePackage.STYLE__BOTTOM:
				return BOTTOM_EDEFAULT == null ? bottom != null : !BOTTOM_EDEFAULT.equals(bottom);
			case WebPagePackage.STYLE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case WebPagePackage.STYLE__DISPLAY:
				return DISPLAY_EDEFAULT == null ? display != null : !DISPLAY_EDEFAULT.equals(display);
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
		result.append(" (color: ");
		result.append(color);
		result.append(", font: ");
		result.append(font);
		result.append(", font_size: ");
		result.append(font_size);
		result.append(", background_color: ");
		result.append(background_color);
		result.append(", border: ");
		result.append(border);
		result.append(", position: ");
		result.append(position);
		result.append(", margin: ");
		result.append(margin);
		result.append(", padding: ");
		result.append(padding);
		result.append(", text_align: ");
		result.append(text_align);
		result.append(", border_radius: ");
		result.append(border_radius);
		result.append(", height: ");
		result.append(height);
		result.append(", left: ");
		result.append(left);
		result.append(", background: ");
		result.append(background);
		result.append(", bottom: ");
		result.append(bottom);
		result.append(", width: ");
		result.append(width);
		result.append(", display: ");
		result.append(display);
		result.append(')');
		return result.toString();
	}

} //StyleImpl
