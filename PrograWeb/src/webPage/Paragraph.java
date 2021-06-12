/**
 */
package webPage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webPage.Paragraph#getText <em>Text</em>}</li>
 *   <li>{@link webPage.Paragraph#getStyle <em>Style</em>}</li>
 *   <li>{@link webPage.Paragraph#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see webPage.WebPagePackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see webPage.WebPagePackage#getParagraph_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link webPage.Paragraph#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link webPage.Style#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(Style)
	 * @see webPage.WebPagePackage#getParagraph_Style()
	 * @see webPage.Style#getParagraph
	 * @model opposite="paragraph" containment="true" required="true"
	 * @generated
	 */
	Style getStyle();

	/**
	 * Sets the value of the '{@link webPage.Paragraph#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(Style value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link webPage.Subtitle#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' container reference.
	 * @see #setTopic(Subtitle)
	 * @see webPage.WebPagePackage#getParagraph_Topic()
	 * @see webPage.Subtitle#getParagraph
	 * @model opposite="paragraph" transient="false"
	 * @generated
	 */
	Subtitle getTopic();

	/**
	 * Sets the value of the '{@link webPage.Paragraph#getTopic <em>Topic</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' container reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(Subtitle value);

} // Paragraph
