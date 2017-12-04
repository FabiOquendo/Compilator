/**
 */
package generator.apperance.linesvisible;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.apperance.linesvisible.LinesvisiblePackage
 * @generated
 */
public interface LinesvisibleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinesvisibleFactory eINSTANCE = generator.apperance.linesvisible.impl.LinesvisibleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Lines Visible</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lines Visible</em>'.
	 * @generated
	 */
	LinesVisible createLinesVisible();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LinesvisiblePackage getLinesvisiblePackage();

} //LinesvisibleFactory
