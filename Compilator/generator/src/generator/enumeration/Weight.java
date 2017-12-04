/**
 */
package generator.enumeration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Weight</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.enumeration.EnumerationPackage#getWeight()
 * @model
 * @generated
 */
public enum Weight implements Enumerator {
	/**
	 * The '<em><b>WEIGHT BUTTON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_BUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHT_BUTTON(125, "WEIGHT_BUTTON", "WEIGHT_BUTTON"),

	/**
	 * The '<em><b>WEIGHT COLUMN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_COLUMN_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHT_COLUMN(100, "WEIGHT_COLUMN", "WEIGHT_COLUMN"),

	/**
	 * The '<em><b>WEIGHT COMBO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_COMBO_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHT_COMBO(125, "WEIGHT_COMBO", "WEIGHT_COMBO"),

	/**
	 * The '<em><b>WEIGHT LABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHT_LABEL(125, "WEIGHT_LABEL", "WEIGHT_LABEL"),

	/**
	 * The '<em><b>WEIGHT TEXTFIELD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_TEXTFIELD_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHT_TEXTFIELD(125, "WEIGHT_TEXTFIELD", "WEIGHT_TEXTFIELD");

	/**
	 * The '<em><b>WEIGHT BUTTON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEIGHT BUTTON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_BUTTON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHT_BUTTON_VALUE = 125;

	/**
	 * The '<em><b>WEIGHT COLUMN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEIGHT COLUMN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_COLUMN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHT_COLUMN_VALUE = 100;

	/**
	 * The '<em><b>WEIGHT COMBO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEIGHT COMBO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_COMBO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHT_COMBO_VALUE = 125;

	/**
	 * The '<em><b>WEIGHT LABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEIGHT LABEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_LABEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHT_LABEL_VALUE = 125;

	/**
	 * The '<em><b>WEIGHT TEXTFIELD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEIGHT TEXTFIELD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_TEXTFIELD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHT_TEXTFIELD_VALUE = 125;

	/**
	 * An array of all the '<em><b>Weight</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Weight[] VALUES_ARRAY =
		new Weight[] {
			WEIGHT_BUTTON,
			WEIGHT_COLUMN,
			WEIGHT_COMBO,
			WEIGHT_LABEL,
			WEIGHT_TEXTFIELD,
		};

	/**
	 * A public read-only list of all the '<em><b>Weight</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Weight> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Weight</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Weight get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Weight result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weight</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Weight getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Weight result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weight</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Weight get(int value) {
		switch (value) {
			case WEIGHT_BUTTON_VALUE: return WEIGHT_BUTTON;
			case WEIGHT_COLUMN_VALUE: return WEIGHT_COLUMN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Weight(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Weight
