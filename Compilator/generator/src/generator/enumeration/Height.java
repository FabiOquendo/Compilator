/**
 */
package generator.enumeration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Height</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see generator.enumeration.EnumerationPackage#getHeight()
 * @model
 * @generated
 */
public enum Height implements Enumerator {
	/**
	 * The '<em><b>HEIGHT BUTTON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEIGHT_BUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	HEIGHT_BUTTON(25, "HEIGHT_BUTTON", "HEIGHT_BUTTON"),

	/**
	 * The '<em><b>HEIGHT COMBO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEIGHT_COMBO_VALUE
	 * @generated
	 * @ordered
	 */
	HEIGHT_COMBO(25, "HEIGHT_COMBO", "HEIGHT_COMBO"),

	/**
	 * The '<em><b>HEIGHT LABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEIGHT_LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	HEIGHT_LABEL(25, "HEIGHT_LABEL", "HEIGHT_LABEL"),

	/**
	 * The '<em><b>HEIGHT TABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEIGHT_TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	HEIGHT_TABLE(150, "HEIGHT_TABLE", "HEIGHT_TABLE"),

	/**
	 * The '<em><b>HEIGHT TEXTFIELD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEIGHT_TEXTFIELD_VALUE
	 * @generated
	 * @ordered
	 */
	HEIGHT_TEXTFIELD(25, "HEIGHT_TEXTFIELD", "HEIGHT_TEXTFIELD");

	/**
	 * The '<em><b>HEIGHT BUTTON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEIGHT BUTTON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEIGHT_BUTTON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEIGHT_BUTTON_VALUE = 25;

	/**
	 * The '<em><b>HEIGHT COMBO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEIGHT COMBO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEIGHT_COMBO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEIGHT_COMBO_VALUE = 25;

	/**
	 * The '<em><b>HEIGHT LABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEIGHT LABEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEIGHT_LABEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEIGHT_LABEL_VALUE = 25;

	/**
	 * The '<em><b>HEIGHT TABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEIGHT TABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEIGHT_TABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEIGHT_TABLE_VALUE = 150;

	/**
	 * The '<em><b>HEIGHT TEXTFIELD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEIGHT TEXTFIELD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEIGHT_TEXTFIELD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEIGHT_TEXTFIELD_VALUE = 25;

	/**
	 * An array of all the '<em><b>Height</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Height[] VALUES_ARRAY =
		new Height[] {
			HEIGHT_BUTTON,
			HEIGHT_COMBO,
			HEIGHT_LABEL,
			HEIGHT_TABLE,
			HEIGHT_TEXTFIELD,
		};

	/**
	 * A public read-only list of all the '<em><b>Height</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Height> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Height</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Height get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Height result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Height</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Height getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Height result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Height</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Height get(int value) {
		switch (value) {
			case HEIGHT_BUTTON_VALUE: return HEIGHT_BUTTON;
			case HEIGHT_TABLE_VALUE: return HEIGHT_TABLE;
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
	private Height(int value, String name, String literal) {
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
	
} //Height
