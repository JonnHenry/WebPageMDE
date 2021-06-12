/**
 */
package webPage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Footer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webPage.Footer#getInfo <em>Info</em>}</li>
 *   <li>{@link webPage.Footer#getWebpage <em>Webpage</em>}</li>
 *   <li>{@link webPage.Footer#getStyle <em>Style</em>}</li>
 *   <li>{@link webPage.Footer#getLogo <em>Logo</em>}</li>
 * </ul>
 *
 * @see webPage.WebPagePackage#getFooter()
 * @model
 * @generated
 */
public interface Footer extends EObject {
	/**
	 * Returns the value of the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' attribute.
	 * @see #setInfo(String)
	 * @see webPage.WebPagePackage#getFooter_Info()
	 * @model
	 * @generated
	 */
	String getInfo();

	/**
	 * Sets the value of the '{@link webPage.Footer#getInfo <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' attribute.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(String value);

	/**
	 * Returns the value of the '<em><b>Webpage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link webPage.WebPage#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webpage</em>' container reference.
	 * @see #setWebpage(WebPage)
	 * @see webPage.WebPagePackage#getFooter_Webpage()
	 * @see webPage.WebPage#getFooter
	 * @model opposite="footer" required="true" transient="false"
	 * @generated
	 */
	WebPage getWebpage();

	/**
	 * Sets the value of the '{@link webPage.Footer#getWebpage <em>Webpage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webpage</em>' container reference.
	 * @see #getWebpage()
	 * @generated
	 */
	void setWebpage(WebPage value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link webPage.Style#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(Style)
	 * @see webPage.WebPagePackage#getFooter_Style()
	 * @see webPage.Style#getFooter
	 * @model opposite="footer" containment="true" required="true"
	 * @generated
	 */
	Style getStyle();

	/**
	 * Sets the value of the '{@link webPage.Footer#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(Style value);

	/**
	 * Returns the value of the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo</em>' attribute.
	 * @see #setLogo(String)
	 * @see webPage.WebPagePackage#getFooter_Logo()
	 * @model
	 * @generated
	 */
	String getLogo();

	/**
	 * Sets the value of the '{@link webPage.Footer#getLogo <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo</em>' attribute.
	 * @see #getLogo()
	 * @generated
	 */
	void setLogo(String value);

} // Footer
