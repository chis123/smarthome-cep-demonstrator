/**
 */
package smarthome;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smarthome.ItemBinding#getItemstate <em>Itemstate</em>}</li>
 *   <li>{@link smarthome.ItemBinding#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see smarthome.SmarthomePackage#getItemBinding()
 * @model
 * @generated
 */
public interface ItemBinding extends EObject {
    /**
     * Returns the value of the '<em><b>Itemstate</b></em>' containment reference list.
     * The list contents are of type {@link smarthome.ItemState}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Itemstate</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Itemstate</em>' containment reference list.
     * @see smarthome.SmarthomePackage#getItemBinding_Itemstate()
     * @model containment="true" required="true"
     * @generated
     */
    EList<ItemState> getItemstate();

    /**
     * Returns the value of the '<em><b>Command</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Command</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Command</em>' containment reference.
     * @see #setCommand(Command)
     * @see smarthome.SmarthomePackage#getItemBinding_Command()
     * @model containment="true" required="true"
     * @generated
     */
    Command getCommand();

    /**
     * Sets the value of the '{@link smarthome.ItemBinding#getCommand <em>Command</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Command</em>' containment reference.
     * @see #getCommand()
     * @generated
     */
    void setCommand(Command value);

} // ItemBinding
