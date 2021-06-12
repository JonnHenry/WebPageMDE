/**
 */
package webPage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import webPage.Subtitle;
import webPage.WebPageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subtitle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubtitleTest extends TestCase {

	/**
	 * The fixture for this Subtitle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Subtitle fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubtitleTest.class);
	}

	/**
	 * Constructs a new Subtitle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtitleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Subtitle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Subtitle fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Subtitle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Subtitle getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebPageFactory.eINSTANCE.createSubtitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SubtitleTest
