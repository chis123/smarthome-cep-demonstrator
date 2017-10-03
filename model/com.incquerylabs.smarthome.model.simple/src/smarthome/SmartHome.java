/**
 */
package smarthome;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smarthome.SmartHome#getName <em>Name</em>}</li>
 *   <li>{@link smarthome.SmartHome#getItems <em>Items</em>}</li>
 *   <li>{@link smarthome.SmartHome#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @see smarthome.SmarthomePackage#getSmartHome()
 * @model
 * @generated
 */
public interface SmartHome extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see smarthome.SmarthomePackage#getSmartHome_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link smarthome.SmartHome#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Items</b></em>' containment reference list.
     * The list contents are of type {@link smarthome.Item}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Items</em>' containment reference list.
     * @see smarthome.SmarthomePackage#getSmartHome_Items()
     * @model containment="true"
     * @generated
     */
    EList<Item> getItems();

    /**
     * Returns the value of the '<em><b>Control</b></em>' containment reference list.
     * The list contents are of type {@link smarthome.ItemBinding}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control</em>' containment reference list.
     * @see smarthome.SmarthomePackage#getSmartHome_Control()
     * @model containment="true"
     * @generated
     */
    EList<ItemBinding> getControl();

} // SmartHome
