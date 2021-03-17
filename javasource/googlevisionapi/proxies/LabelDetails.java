// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package googlevisionapi.proxies;

public class LabelDetails
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject labelDetailsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GoogleVisionAPI.LabelDetails";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Description("Description"),
		Score("Score"),
		Labels("GoogleVisionAPI.Labels");

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

	public LabelDetails(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "GoogleVisionAPI.LabelDetails"));
	}

	protected LabelDetails(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject labelDetailsMendixObject)
	{
		if (labelDetailsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("GoogleVisionAPI.LabelDetails", labelDetailsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a GoogleVisionAPI.LabelDetails");

		this.labelDetailsMendixObject = labelDetailsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'LabelDetails.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static googlevisionapi.proxies.LabelDetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return googlevisionapi.proxies.LabelDetails.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static googlevisionapi.proxies.LabelDetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new googlevisionapi.proxies.LabelDetails(context, mendixObject);
	}

	public static googlevisionapi.proxies.LabelDetails load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return googlevisionapi.proxies.LabelDetails.initialize(context, mendixObject);
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
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of Score
	 */
	public final java.math.BigDecimal getScore()
	{
		return getScore(getContext());
	}

	/**
	 * @param context
	 * @return value of Score
	 */
	public final java.math.BigDecimal getScore(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Score.toString());
	}

	/**
	 * Set value of Score
	 * @param score
	 */
	public final void setScore(java.math.BigDecimal score)
	{
		setScore(getContext(), score);
	}

	/**
	 * Set value of Score
	 * @param context
	 * @param score
	 */
	public final void setScore(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal score)
	{
		getMendixObject().setValue(context, MemberNames.Score.toString(), score);
	}

	/**
	 * @return value of Labels
	 */
	public final googlevisionapi.proxies.LabelAnnotations getLabels() throws com.mendix.core.CoreException
	{
		return getLabels(getContext());
	}

	/**
	 * @param context
	 * @return value of Labels
	 */
	public final googlevisionapi.proxies.LabelAnnotations getLabels(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		googlevisionapi.proxies.LabelAnnotations result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Labels.toString());
		if (identifier != null)
			result = googlevisionapi.proxies.LabelAnnotations.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Labels
	 * @param labels
	 */
	public final void setLabels(googlevisionapi.proxies.LabelAnnotations labels)
	{
		setLabels(getContext(), labels);
	}

	/**
	 * Set value of Labels
	 * @param context
	 * @param labels
	 */
	public final void setLabels(com.mendix.systemwideinterfaces.core.IContext context, googlevisionapi.proxies.LabelAnnotations labels)
	{
		if (labels == null)
			getMendixObject().setValue(context, MemberNames.Labels.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Labels.toString(), labels.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return labelDetailsMendixObject;
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
			final googlevisionapi.proxies.LabelDetails that = (googlevisionapi.proxies.LabelDetails) obj;
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
		return "GoogleVisionAPI.LabelDetails";
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