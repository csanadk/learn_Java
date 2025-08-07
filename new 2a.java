package javax.lang.model;

import java.lang.annotiation.*;
import java.util.List;
import java.lang.model.element.*;
import javax.lang.model.type.*;

/**
 *Represents a construct that can be annotated.
 * A construc is either an {@linkplain
 * javax.lang.model.element.Element element} or a {@linkplain
 * javax.lang.model.type.TypeMirror type}. Annotations on an element
 * are on a <em>declaration</em>, whereas annotations on a type are on
 * a specific <em>use</em>of a type name.
 *
 * The terms <em>directly present</em>, <em>present</em>,
 * <em>indirectly present </em>, and <em>associated </em> are used
 * through this interface to describe precisely which annotations
 * are returned by the methods defined herein.
 *
 * <p>In the definitions below, an annotation <i>A</i> has an 
 * annotation type <i>AT</i> is a repeateble annotation
 * type, the type of the containing annotation is <i>ATC</i>.
 *
 * <p>Annotation <i>A</i> is <em>directly present</em> on a construct
 * <i>C</i> if either:
 *
 *<ul>
 *
 * <li><i>A</i> is explicitly or implicitly declared as applying to
 * the source code representation of <i>C</i>.
 * <p>Typically, if exactly one annotation of type <i>AT</i> appears in
 * the source code of representation of <i>C</i>, then <i>A</i> is
 * explicitly declared as applying to <i>C</i>.
 *
 * If there are multiple annotations of type <i>A</i>present on
 * <i>C</i>, tehn if <i>AT</i> is repeatable annotation type, an
 * annotation of type <i>ATC</i> is {@linkplain javax.lang.model.util.Elements#getOrigin(AnnotatedConstruct, AnnotationMirror) implicitly declared} on <i>C</i>.
 *
 * <li> A representation of <i>A</i> appears in the executable output
 * for <i>C</i>, such as teh {@code RuntimeVisibleAnnotations} or
 * {@code RuntimeVisibleParameterAnnotations} attribute of a class
 * file.
 *
 * </ul>
 *
 * <p>An annotation <i>A</i> is <em>present</em> on a
 * construct <i>C</i> if either:
 * <ul>
 *
 * <li><i>A</i> is directly present on <i>C</i>.
 *
 * <li><i>A</i> is directly present on <i>C</i>.
 *
 * <li>No annotation of type <i>AT</i> is directly present on
 * <i>C</i>, and <i>C</i> is a class and <i>AT</i> is inheritable
 * and <i>A</i> is present on the superclass of <i>C</i>
 * 
 * </ul>
 *
 * An annotation <i>A</i> is <em>indirectly present</em> on a construct*
 * <i>C</i>, if both:
 *
 * <ul>
 *
 * <li><i>AT</i> is a repeateable annotatin type with a containing
 * annotation type <i>ATC</i>.
 *
 * <li><i>AT</i> is a repeatable annotation type witha containing 
 * annotation type <i>ATC</i>.
 *
 * <li>An annotation of type <i>ATC</i> is directly present on
 * <i>C</i> and <i>A</i> is an annotation included in teh result of
 * calling the {@code value} method of the directly present annotation
 * of type <i>ATC</i>.
 *
 * </ul>
 * 
 * An annotation <i>A</i> is <em>associated</em> with a construct
 * <i>C</i> if either:
 *
 *<ul>
 *
 * <li> <i>A</i> is directly or indirectly present on <i>C</i>.
 *
 * <li> No annotation of type <i>AT</i> is directly or indirectly
 * present on <i>C</i>, and <i></i> is a class, and <i>AT</i> is
 * inheritable, and <i>A</i> is associated with the superclass of
 * <i>C</i>.
 *
 * </ul>
 *
 * @since 1.8
 * @jls 9.6 Annotation Types
 * @jls 9.6.4.3 {@code @Inherited}
 */
 public interface AnnotatedConstruct {
	 /**
	  * Returns the annotatin s taht are <em>directly present</em> on
	  * this construct.
	  */
	List<? extends AnnotationMirror> getAnnotationMirrors();
	
	<A extends Annotation> A getAnnotation(Class<A> AnnotationType);
	<A extends Annotation> A getAnnotationsByType(Class<A> annotationType);
}