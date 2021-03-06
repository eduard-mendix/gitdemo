// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package googlevisionapi.proxies;

public class ObjectDetails
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject objectDetailsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GoogleVisionAPI.ObjectDetails";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Score("Score"),
		Best_Gues("GoogleVisionAPI.Best_Gues");

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

	public ObjectDetails(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "GoogleVisionAPI.ObjectDetails"));
	}

	protected ObjectDetails(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject objectDetailsMendixObject)
	{
		if (objectDetailsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("GoogleVisionAPI.ObjectDetails", objectDetailsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a GoogleVisionAPI.ObjectDetails");

		this.objectDetailsMendixObject = objectDetailsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ObjectDetails.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static googlevisionapi.proxies.ObjectDetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return googlevisionapi.proxies.ObjectDetails.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static googlevisionapi.proxies.ObjectDetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new googlevisionapi.proxies.ObjectDetails(context, mendixObject);
	}

	public static googlevisionapi.proxies.ObjectDetails load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return googlevisionapi.proxies.ObjectDetails.initialize(context, mendixObject);
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
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
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
	 * @return value of Best_Gues
	 */
	public final googlevisionapi.proxies.FoundObject getBest_Gues() throws com.mendix.core.CoreException
	{
		return getBest_Gues(getContext());
	}

	/**
	 * @param context
	 * @return value of Best_Gues
	 */
	public final googlevisionapi.proxies.FoundObject getBest_Gues(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		googlevisionapi.proxies.FoundObject result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Best_Gues.toString());
		if (identifier != null)
			result = googlevisionapi.proxies.FoundObject.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Best_Gues
	 * @param best_gues
	 */
	public final void setBest_Gues(googlevisionapi.proxies.FoundObject best_gues)
	{
		setBest_Gues(getContext(), best_gues);
	}

	/**
	 * Set value of Best_Gues
	 * @param context
	 * @param best_gues
	 */
	public final void setBest_Gues(com.mendix.systemwideinterfaces.core.IContext context, googlevisionapi.proxies.FoundObject best_gues)
	{
		if (best_gues == null)
			getMendixObject().setValue(context, MemberNames.Best_Gues.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Best_Gues.toString(), best_gues.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return objectDetailsMendixObject;
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
			final googlevisionapi.proxies.ObjectDetails that = (googlevisionapi.proxies.ObjectDetails) obj;
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
		return "GoogleVisionAPI.ObjectDetails";
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
