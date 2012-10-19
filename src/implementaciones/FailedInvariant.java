/**
 * Tomado de las clases realizadas por el autor del libro "Java Structures",
 * Duane A. Bailey, utilizado en el curso de Algoritmos y Estructura de Datos.
 * Estas clases se encuentran disponibles en:
 * http://dept.cs.williams.edu/JavaStructures/Software.html
 */

package implementaciones;
/**
 * This error is thrown by the Assert class in the event of a failed
 * invariant test. Errors are thrown rather than exceptions because
 * failed invariants are assumed to be an indication of such
 * an egregious program failure that recovery is impossible.
 *
 *
 * @version $Id: FailedInvariant.java 22 2006-08-21 19:27:26Z bailey $
 * @author, 2001 duane a. bailey
 * @see Assert#fail
 */
class FailedInvariant extends FailedAssertion
{
    final static long serialVersionUID = 0L;
    /**
     * Constructs an error indicating failure to meet an invariant
     *
     * @post Constructs a new failed invariant error
     * @param reason String describing failed condition.
     */
    public FailedInvariant(String reason)
    {
        super("\nInvariant that failed: " + reason);
    }
}
