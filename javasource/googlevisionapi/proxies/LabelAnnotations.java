// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package googlevisionapi.proxies;

public class LabelAnnotations
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject labelAnnotationsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GoogleVisionAPI.LabelAnnotations";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Labels_Responses("GoogleVisionAPI.Labels_Responses");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public LabelAnnotations(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "GoogleVisionAPI.LabelAnnotations"));
	}

	protected LabelAnnotations(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject labelAnnotationsMendixObject)
	{
		if (labelAnnotationsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("GoogleVisionAPI.LabelAnnotations", labelAnnotationsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a GoogleVisionAPI.LabelAnnotations");

		this.labelAnnotationsMendixObject = labelAnnotationsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'LabelAnnotations.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static googlevisionapi.proxies.LabelAnnotations initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return googlevisionapi.proxies.LabelAnnotations.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static googlevisionapi.proxies.LabelAnnotations initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new googlevisionapi.proxies.LabelAnnotations(context, mendixObject);
	}

	public static googlevisionapi.proxies.LabelAnnotations load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return googlevisionapi.proxies.LabelAnnotations.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Labels_Responses
	 */
	public final googlevisionapi.proxies.Responses getLabels_Responses() throws com.mendix.core.CoreException
	{
		return getLabels_Responses(getContext());
	}

	/**
	 * @param context
	 * @return value of Labels_Responses
	 */
	public final googlevisionapi.proxies.Responses getLabels_Responses(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		googlevisionapi.proxies.Responses result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Labels_Responses.toString());
		if (identifier != null)
			result = googlevisionapi.proxies.Responses.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Labels_Responses
	 * @param labels_responses
	 */
	public final void setLabels_Responses(googlevisionapi.proxies.Responses labels_responses)
	{
		setLabels_Responses(getContext(), labels_responses);
	}

	/**
	 * Set value of Labels_Responses
	 * @param context
	 * @param labels_responses
	 */
	public final void setLabels_Responses(com.mendix.systemwideinterfaces.core.IContext context, googlevisionapi.proxies.Responses labels_responses)
	{
		if (labels_responses == null)
			getMendixObject().setValue(context, MemberNames.Labels_Responses.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Labels_Responses.toString(), labels_responses.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return labelAnnotationsMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final googlevisionapi.proxies.LabelAnnotations that = (googlevisionapi.proxies.LabelAnnotations) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "GoogleVisionAPI.LabelAnnotations";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
