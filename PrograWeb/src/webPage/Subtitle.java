/**
 */
package webPage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtitle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webPage.Subtitle#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link webPage.Subtitle#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link webPage.Subtitle#getWebpage <em>Webpage</em>}</li>
 *   <li>{@link webPage.Subtitle#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see webPage.WebPagePackage#getSubtitle()
 * @model
 * @generated
 */
public interface Subtitle extends EObject {
	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' attribute.
	 * @see #setSubtitle(String)
	 * @see webPage.WebPagePackage#getSubtitle_Subtitle()
	 * @model
	 * @generated
	 */
	String getSubtitle();

	/**
	 * Sets the value of the '{@link webPage.Subtitle#getSubtitle <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' attribute.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(String value);

	/**
	 * Returns the value of the '<em><b>Paragraph</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link webPage.Paragraph#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph</em>' containment reference.
	 * @see #setParagraph(Paragraph)
	 * @see webPage.WebPagePackage#getSubtitle_Paragraph()
	 * @see webPage.Paragraph#getTopic
	 * @model opposite="topic" containment="true"
	 * @generated
	 */
	Paragraph getParagraph();

	/**
	 * Sets the value of the '{@link webPage.Subtitle#getParagraph <em>Paragraph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph</em>' containment reference.
	 * @see #getParagraph()
	 * @generated
	 */
	void setParagraph(Paragraph value);

	/**
	 * Returns the value of the '<em><b>Webpage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link webPage.WebPage#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webpage</em>' container reference.
	 * @see #setWebpage(WebPage)
	 * @see webPage.WebPagePackage#getSubtitle_Webpage()
	 * @see webPage.WebPage#getSubtitle
	 * @model opposite="subtitle" required="true" transient="false"
	 * @generated
	 */
	WebPage getWebpage();

	/**
	 * Sets the value of the '{@link webPage.Subtitle#getWebpage <em>Webpage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webpage</em>' container reference.
	 * @see #getWebpage()
	 * @generated
	 */
	void setWebpage(WebPage value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link webPage.Style#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(Style)
	 * @see webPage.WebPagePackage#getSubtitle_Style()
	 * @see webPage.Style#getSubtitle
	 * @model opposite="subtitle" containment="true" required="true"
	 * @generated
	 */
	Style getStyle();

	/**
	 * Sets the value of the '{@link webPage.Subtitle#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(Style value);

} // Subtitle
