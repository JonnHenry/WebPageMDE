/**
 */
package webPage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webPage.WebPage#getName <em>Name</em>}</li>
 *   <li>{@link webPage.WebPage#getFooter <em>Footer</em>}</li>
 *   <li>{@link webPage.WebPage#getMap <em>Map</em>}</li>
 *   <li>{@link webPage.WebPage#getHeader <em>Header</em>}</li>
 *   <li>{@link webPage.WebPage#getSubtitle <em>Subtitle</em>}</li>
 * </ul>
 *
 * @see webPage.WebPagePackage#getWebPage()
 * @model
 * @generated
 */
public interface WebPage extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see webPage.WebPagePackage#getWebPage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link webPage.WebPage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link webPage.Footer#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference.
	 * @see #setFooter(Footer)
	 * @see webPage.WebPagePackage#getWebPage_Footer()
	 * @see webPage.Footer#getWebpage
	 * @model opposite="webpage" containment="true"
	 * @generated
	 */
	Footer getFooter();

	/**
	 * Sets the value of the '{@link webPage.WebPage#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(Footer value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference list.
	 * The list contents are of type {@link webPage.Map}.
	 * It is bidirectional and its opposite is '{@link webPage.Map#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference list.
	 * @see webPage.WebPagePackage#getWebPage_Map()
	 * @see webPage.Map#getWebpage
	 * @model opposite="webpage" containment="true"
	 * @generated
	 */
	EList<Map> getMap();

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link webPage.Header#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(Header)
	 * @see webPage.WebPagePackage#getWebPage_Header()
	 * @see webPage.Header#getWebpage
	 * @model opposite="webpage" containment="true"
	 * @generated
	 */
	Header getHeader();

	/**
	 * Sets the value of the '{@link webPage.WebPage#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference list.
	 * The list contents are of type {@link webPage.Subtitle}.
	 * It is bidirectional and its opposite is '{@link webPage.Subtitle#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference list.
	 * @see webPage.WebPagePackage#getWebPage_Subtitle()
	 * @see webPage.Subtitle#getWebpage
	 * @model opposite="webpage" containment="true" required="true"
	 * @generated
	 */
	EList<Subtitle> getSubtitle();

} // WebPage
