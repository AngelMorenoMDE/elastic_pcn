/**
 */
package pcn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCN Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcn.PCNDiagram#getDiagramEntities <em>Diagram Entities</em>}</li>
 *   <li>{@link pcn.PCNDiagram#getDiagramDependencies <em>Diagram Dependencies</em>}</li>
 * </ul>
 *
 * @see pcn.PcnPackage#getPCNDiagram()
 * @model
 * @generated
 */
public interface PCNDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagram Entities</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNProcessEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Entities</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNDiagram_DiagramEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNProcessEntity> getDiagramEntities();

	/**
	 * Returns the value of the '<em><b>Diagram Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNDependency}.
	 * It is bidirectional and its opposite is '{@link pcn.PCNDependency#getInDiagram <em>In Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Dependencies</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNDiagram_DiagramDependencies()
	 * @see pcn.PCNDependency#getInDiagram
	 * @model opposite="inDiagram" containment="true"
	 * @generated
	 */
	EList<PCNDependency> getDiagramDependencies();

} // PCNDiagram
