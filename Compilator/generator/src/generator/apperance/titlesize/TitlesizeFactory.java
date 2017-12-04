/**
 */
package generator.apperance.titlesize;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.apperance.titlesize.TitlesizePackage
 * @generated
 */
public interface TitlesizeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TitlesizeFactory eINSTANCE = generator.apperance.titlesize.impl.TitlesizeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Title Height</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Title Height</em>'.
	 * @generated
	 */
	TitleHeight createTitleHeight();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TitlesizePackage getTitlesizePackage();

} //TitlesizeFactory
