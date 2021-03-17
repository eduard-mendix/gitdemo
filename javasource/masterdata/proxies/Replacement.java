// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package masterdata.proxies;

public class Replacement
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject replacementMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MasterData.Replacement";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Image("Image"),
		Replacement_Incident("MasterData.Replacement_Incident");

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

	public Replacement(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MasterData.Replacement"));
	}

	protected Replacement(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject replacementMendixObject)
	{
		if (replacementMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MasterData.Replacement", replacementMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MasterData.Replacement");

		this.replacementMendixObject = replacementMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Replacement.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static masterdata.proxies.Replacement initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return masterdata.proxies.Replacement.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static masterdata.proxies.Replacement initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new masterdata.proxies.Replacement(context, mendixObject);
	}

	public static masterdata.proxies.Replacement load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return masterdata.proxies.Replacement.initialize(context, mendixObject);
	}

	public static java.util.List<masterdata.proxies.Replacement> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<masterdata.proxies.Replacement> result = new java.util.ArrayList<masterdata.proxies.Replacement>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MasterData.Replacement" + xpathConstraint))
			result.add(masterdata.proxies.Replacement.initialize(context, obj));
		return result;
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
	 * @return value of Image
	 */
	public final java.lang.String getImage()
	{
		return getImage(getContext());
	}

	/**
	 * @param context
	 * @return value of Image
	 */
	public final java.lang.String getImage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Image.toString());
	}

	/**
	 * Set value of Image
	 * @param image
	 */
	public final void setImage(java.lang.String image)
	{
		setImage(getContext(), image);
	}

	/**
	 * Set value of Image
	 * @param context
	 * @param image
	 */
	public final void setImage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String image)
	{
		getMendixObject().setValue(context, MemberNames.Image.toString(), image);
	}

	/**
	 * @return value of Replacement_Incident
	 */
	public final masterdata.proxies.Incident getReplacement_Incident() throws com.mendix.core.CoreException
	{
		return getReplacement_Incident(getContext());
	}

	/**
	 * @param context
	 * @return value of Replacement_Incident
	 */
	public final masterdata.proxies.Incident getReplacement_Incident(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		masterdata.proxies.Incident result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Replacement_Incident.toString());
		if (identifier != null)
			result = masterdata.proxies.Incident.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Replacement_Incident
	 * @param replacement_incident
	 */
	public final void setReplacement_Incident(masterdata.proxies.Incident replacement_incident)
	{
		setReplacement_Incident(getContext(), replacement_incident);
	}

	/**
	 * Set value of Replacement_Incident
	 * @param context
	 * @param replacement_incident
	 */
	public final void setReplacement_Incident(com.mendix.systemwideinterfaces.core.IContext context, masterdata.proxies.Incident replacement_incident)
	{
		if (replacement_incident == null)
			getMendixObject().setValue(context, MemberNames.Replacement_Incident.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Replacement_Incident.toString(), replacement_incident.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return replacementMendixObject;
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
			final masterdata.proxies.Replacement that = (masterdata.proxies.Replacement) obj;
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
		return "MasterData.Replacement";
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
