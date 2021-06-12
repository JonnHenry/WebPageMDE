/**
 */
package webPage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see webPage.WebPageFactory
 * @model kind="package"
 * @generated
 */
public interface WebPagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webPage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pWebAvanzada/webPage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pWebAvanzada.webPage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebPagePackage eINSTANCE = webPage.impl.WebPagePackageImpl.init();

	/**
	 * The meta object id for the '{@link webPage.impl.WebPageImpl <em>Web Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webPage.impl.WebPageImpl
	 * @see webPage.impl.WebPagePackageImpl#getWebPage()
	 * @generated
	 */
	int WEB_PAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__FOOTER = 1;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__MAP = 2;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__HEADER = 3;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__SUBTITLE = 4;

	/**
	 * The number of structural features of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webPage.impl.FooterImpl <em>Footer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webPage.impl.FooterImpl
	 * @see webPage.impl.WebPagePackageImpl#getFooter()
	 * @generated
	 */
	int FOOTER = 1;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER__INFO = 0;

	/**
	 * The feature id for the '<em><b>Webpage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER__WEBPAGE = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER__STYLE = 2;

	/**
	 * The feature id for the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER__LOGO = 3;

	/**
	 * The number of structural features of the '<em>Footer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Footer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webPage.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webPage.impl.MapImpl
	 * @see webPage.impl.WebPagePackageImpl#getMap()
	 * @generated
	 */
	int MAP = 2;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__LAT = 0;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__LONG = 1;

	/**
	 * The feature id for the '<em><b>Webpage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__WEBPAGE = 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__STYLE = 3;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webPage.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webPage.impl.ParagraphImpl
	 * @see webPage.impl.WebPagePackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__STYLE = 1;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TOPIC = 2;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webPage.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webPage.impl.HeaderImpl
	 * @see webPage.impl.WebPagePackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__LOGO = 1;

	/**
	 * The feature id for the '<em><b>Webpage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__WEBPAGE = 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__STYLE = 3;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link webPage.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webPage.impl.StyleImpl
	 * @see webPage.impl.WebPagePackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 5;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__FONT = 1;

	/**
	 * The feature id for the '<em><b>Font size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__FONT_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Background color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__BACKGROUND_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__BORDER = 4;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__POSITION = 5;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__MARGIN = 6;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__PADDING = 7;

	/**
	 * The feature id for the '<em><b>Text align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__TEXT_ALIGN = 8;

	/**
	 * The feature id for the '<em><b>Border radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__BORDER_RADIUS = 9;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__HEIGHT = 10;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__LEFT = 11;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__FOOTER = 12;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__MAP = 13;

	/**
	 * The feature id for the '<em><b>Paragraph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__PARAGRAPH = 14;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__SUBTITLE = 15;

	/**
	 * The feature id for the '<em><b>Header</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__HEADER = 16;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__BACKGROUND = 17;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__BOTTOM = 18;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__WIDTH = 19;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__DISPLAY = 20;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webPage.impl.SubtitleImpl <em>Subtitle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webPage.impl.SubtitleImpl
	 * @see webPage.impl.WebPagePackageImpl#getSubtitle()
	 * @generated
	 */
	int SUBTITLE = 6;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE__SUBTITLE = 0;

	/**
	 * The feature id for the '<em><b>Paragraph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE__PARAGRAPH = 1;

	/**
	 * The feature id for the '<em><b>Webpage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE__WEBPAGE = 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE__STYLE = 3;

	/**
	 * The number of structural features of the '<em>Subtitle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Subtitle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link webPage.WebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Page</em>'.
	 * @see webPage.WebPage
	 * @generated
	 */
	EClass getWebPage();

	/**
	 * Returns the meta object for the attribute '{@link webPage.WebPage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webPage.WebPage#getName()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link webPage.WebPage#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer</em>'.
	 * @see webPage.WebPage#getFooter()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_Footer();

	/**
	 * Returns the meta object for the containment reference list '{@link webPage.WebPage#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see webPage.WebPage#getMap()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_Map();

	/**
	 * Returns the meta object for the containment reference '{@link webPage.WebPage#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see webPage.WebPage#getHeader()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link webPage.WebPage#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtitle</em>'.
	 * @see webPage.WebPage#getSubtitle()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_Subtitle();

	/**
	 * Returns the meta object for class '{@link webPage.Footer <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footer</em>'.
	 * @see webPage.Footer
	 * @generated
	 */
	EClass getFooter();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Footer#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info</em>'.
	 * @see webPage.Footer#getInfo()
	 * @see #getFooter()
	 * @generated
	 */
	EAttribute getFooter_Info();

	/**
	 * Returns the meta object for the container reference '{@link webPage.Footer#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Webpage</em>'.
	 * @see webPage.Footer#getWebpage()
	 * @see #getFooter()
	 * @generated
	 */
	EReference getFooter_Webpage();

	/**
	 * Returns the meta object for the containment reference '{@link webPage.Footer#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see webPage.Footer#getStyle()
	 * @see #getFooter()
	 * @generated
	 */
	EReference getFooter_Style();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Footer#getLogo <em>Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo</em>'.
	 * @see webPage.Footer#getLogo()
	 * @see #getFooter()
	 * @generated
	 */
	EAttribute getFooter_Logo();

	/**
	 * Returns the meta object for class '{@link webPage.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see webPage.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Map#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see webPage.Map#getLat()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Lat();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Map#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see webPage.Map#getLong()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Long();

	/**
	 * Returns the meta object for the container reference '{@link webPage.Map#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Webpage</em>'.
	 * @see webPage.Map#getWebpage()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Webpage();

	/**
	 * Returns the meta object for the containment reference '{@link webPage.Map#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see webPage.Map#getStyle()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Style();

	/**
	 * Returns the meta object for class '{@link webPage.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see webPage.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Paragraph#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see webPage.Paragraph#getText()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Text();

	/**
	 * Returns the meta object for the containment reference '{@link webPage.Paragraph#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see webPage.Paragraph#getStyle()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_Style();

	/**
	 * Returns the meta object for the container reference '{@link webPage.Paragraph#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Topic</em>'.
	 * @see webPage.Paragraph#getTopic()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_Topic();

	/**
	 * Returns the meta object for class '{@link webPage.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see webPage.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Header#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see webPage.Header#getTitle()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Title();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Header#getLogo <em>Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo</em>'.
	 * @see webPage.Header#getLogo()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Logo();

	/**
	 * Returns the meta object for the container reference '{@link webPage.Header#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Webpage</em>'.
	 * @see webPage.Header#getWebpage()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Webpage();

	/**
	 * Returns the meta object for the containment reference '{@link webPage.Header#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see webPage.Header#getStyle()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Style();

	/**
	 * Returns the meta object for class '{@link webPage.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see webPage.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see webPage.Style#getColor()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see webPage.Style#getFont()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Font();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getFont_size <em>Font size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font size</em>'.
	 * @see webPage.Style#getFont_size()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Font_size();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getBackground_color <em>Background color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background color</em>'.
	 * @see webPage.Style#getBackground_color()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Background_color();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see webPage.Style#getBorder()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Border();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see webPage.Style#getPosition()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Position();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin</em>'.
	 * @see webPage.Style#getMargin()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Margin();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding</em>'.
	 * @see webPage.Style#getPadding()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Padding();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getText_align <em>Text align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text align</em>'.
	 * @see webPage.Style#getText_align()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Text_align();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getBorder_radius <em>Border radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border radius</em>'.
	 * @see webPage.Style#getBorder_radius()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Border_radius();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see webPage.Style#getHeight()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Height();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see webPage.Style#getLeft()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Left();

	/**
	 * Returns the meta object for the container reference '{@link webPage.Style#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Footer</em>'.
	 * @see webPage.Style#getFooter()
	 * @see #getStyle()
	 * @generated
	 */
	EReference getStyle_Footer();

	/**
	 * Returns the meta object for the container reference '{@link webPage.Style#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Map</em>'.
	 * @see webPage.Style#getMap()
	 * @see #getStyle()
	 * @generated
	 */
	EReference getStyle_Map();

	/**
	 * Returns the meta object for the container reference '{@link webPage.Style#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Paragraph</em>'.
	 * @see webPage.Style#getParagraph()
	 * @see #getStyle()
	 * @generated
	 */
	EReference getStyle_Paragraph();

	/**
	 * Returns the meta object for the container reference '{@link webPage.Style#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Header</em>'.
	 * @see webPage.Style#getHeader()
	 * @see #getStyle()
	 * @generated
	 */
	EReference getStyle_Header();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see webPage.Style#getBackground()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Background();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see webPage.Style#getBottom()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Bottom();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see webPage.Style#getWidth()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Width();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Style#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see webPage.Style#getDisplay()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Display();

	/**
	 * Returns the meta object for the container reference '{@link webPage.Style#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Subtitle</em>'.
	 * @see webPage.Style#getSubtitle()
	 * @see #getStyle()
	 * @generated
	 */
	EReference getStyle_Subtitle();

	/**
	 * Returns the meta object for class '{@link webPage.Subtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtitle</em>'.
	 * @see webPage.Subtitle
	 * @generated
	 */
	EClass getSubtitle();

	/**
	 * Returns the meta object for the attribute '{@link webPage.Subtitle#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtitle</em>'.
	 * @see webPage.Subtitle#getSubtitle()
	 * @see #getSubtitle()
	 * @generated
	 */
	EAttribute getSubtitle_Subtitle();

	/**
	 * Returns the meta object for the containment reference '{@link webPage.Subtitle#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Paragraph</em>'.
	 * @see webPage.Subtitle#getParagraph()
	 * @see #getSubtitle()
	 * @generated
	 */
	EReference getSubtitle_Paragraph();

	/**
	 * Returns the meta object for the container reference '{@link webPage.Subtitle#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Webpage</em>'.
	 * @see webPage.Subtitle#getWebpage()
	 * @see #getSubtitle()
	 * @generated
	 */
	EReference getSubtitle_Webpage();

	/**
	 * Returns the meta object for the containment reference '{@link webPage.Subtitle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see webPage.Subtitle#getStyle()
	 * @see #getSubtitle()
	 * @generated
	 */
	EReference getSubtitle_Style();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebPageFactory getWebPageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link webPage.impl.WebPageImpl <em>Web Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webPage.impl.WebPageImpl
		 * @see webPage.impl.WebPagePackageImpl#getWebPage()
		 * @generated
		 */
		EClass WEB_PAGE = eINSTANCE.getWebPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__NAME = eINSTANCE.getWebPage_Name();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__FOOTER = eINSTANCE.getWebPage_Footer();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__MAP = eINSTANCE.getWebPage_Map();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__HEADER = eINSTANCE.getWebPage_Header();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__SUBTITLE = eINSTANCE.getWebPage_Subtitle();

		/**
		 * The meta object literal for the '{@link webPage.impl.FooterImpl <em>Footer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webPage.impl.FooterImpl
		 * @see webPage.impl.WebPagePackageImpl#getFooter()
		 * @generated
		 */
		EClass FOOTER = eINSTANCE.getFooter();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOTER__INFO = eINSTANCE.getFooter_Info();

		/**
		 * The meta object literal for the '<em><b>Webpage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOOTER__WEBPAGE = eINSTANCE.getFooter_Webpage();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOOTER__STYLE = eINSTANCE.getFooter_Style();

		/**
		 * The meta object literal for the '<em><b>Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOTER__LOGO = eINSTANCE.getFooter_Logo();

		/**
		 * The meta object literal for the '{@link webPage.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webPage.impl.MapImpl
		 * @see webPage.impl.WebPagePackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__LAT = eINSTANCE.getMap_Lat();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__LONG = eINSTANCE.getMap_Long();

		/**
		 * The meta object literal for the '<em><b>Webpage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__WEBPAGE = eINSTANCE.getMap_Webpage();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__STYLE = eINSTANCE.getMap_Style();

		/**
		 * The meta object literal for the '{@link webPage.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webPage.impl.ParagraphImpl
		 * @see webPage.impl.WebPagePackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__TEXT = eINSTANCE.getParagraph_Text();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__STYLE = eINSTANCE.getParagraph_Style();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__TOPIC = eINSTANCE.getParagraph_Topic();

		/**
		 * The meta object literal for the '{@link webPage.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webPage.impl.HeaderImpl
		 * @see webPage.impl.WebPagePackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__TITLE = eINSTANCE.getHeader_Title();

		/**
		 * The meta object literal for the '<em><b>Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__LOGO = eINSTANCE.getHeader_Logo();

		/**
		 * The meta object literal for the '<em><b>Webpage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__WEBPAGE = eINSTANCE.getHeader_Webpage();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__STYLE = eINSTANCE.getHeader_Style();

		/**
		 * The meta object literal for the '{@link webPage.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webPage.impl.StyleImpl
		 * @see webPage.impl.WebPagePackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__COLOR = eINSTANCE.getStyle_Color();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__FONT = eINSTANCE.getStyle_Font();

		/**
		 * The meta object literal for the '<em><b>Font size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__FONT_SIZE = eINSTANCE.getStyle_Font_size();

		/**
		 * The meta object literal for the '<em><b>Background color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__BACKGROUND_COLOR = eINSTANCE.getStyle_Background_color();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__BORDER = eINSTANCE.getStyle_Border();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__POSITION = eINSTANCE.getStyle_Position();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__MARGIN = eINSTANCE.getStyle_Margin();

		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__PADDING = eINSTANCE.getStyle_Padding();

		/**
		 * The meta object literal for the '<em><b>Text align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__TEXT_ALIGN = eINSTANCE.getStyle_Text_align();

		/**
		 * The meta object literal for the '<em><b>Border radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__BORDER_RADIUS = eINSTANCE.getStyle_Border_radius();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__HEIGHT = eINSTANCE.getStyle_Height();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__LEFT = eINSTANCE.getStyle_Left();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE__FOOTER = eINSTANCE.getStyle_Footer();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE__MAP = eINSTANCE.getStyle_Map();

		/**
		 * The meta object literal for the '<em><b>Paragraph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE__PARAGRAPH = eINSTANCE.getStyle_Paragraph();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE__HEADER = eINSTANCE.getStyle_Header();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__BACKGROUND = eINSTANCE.getStyle_Background();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__BOTTOM = eINSTANCE.getStyle_Bottom();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__WIDTH = eINSTANCE.getStyle_Width();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__DISPLAY = eINSTANCE.getStyle_Display();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE__SUBTITLE = eINSTANCE.getStyle_Subtitle();

		/**
		 * The meta object literal for the '{@link webPage.impl.SubtitleImpl <em>Subtitle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webPage.impl.SubtitleImpl
		 * @see webPage.impl.WebPagePackageImpl#getSubtitle()
		 * @generated
		 */
		EClass SUBTITLE = eINSTANCE.getSubtitle();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTITLE__SUBTITLE = eINSTANCE.getSubtitle_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Paragraph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTITLE__PARAGRAPH = eINSTANCE.getSubtitle_Paragraph();

		/**
		 * The meta object literal for the '<em><b>Webpage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTITLE__WEBPAGE = eINSTANCE.getSubtitle_Webpage();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTITLE__STYLE = eINSTANCE.getSubtitle_Style();

	}

} //WebPagePackage
