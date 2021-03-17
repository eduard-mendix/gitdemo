// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesforce_connector.proxies;

public class recentItems
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject recentItemsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Salesforce_Connector.recentItems";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_Id("_Id"),
		Name("Name"),
		recentItems_SObject("Salesforce_Connector.recentItems_SObject"),
		Attributes_recentItems("Salesforce_Connector.Attributes_recentItems");

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

	public recentItems(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Salesforce_Connector.recentItems"));
	}

	protected recentItems(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject recentItemsMendixObject)
	{
		if (recentItemsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Salesforce_Connector.recentItems", recentItemsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Salesforce_Connector.recentItems");

		this.recentItemsMendixObject = recentItemsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'recentItems.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static salesforce_connector.proxies.recentItems initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return salesforce_connector.proxies.recentItems.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static salesforce_connector.proxies.recentItems initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new salesforce_connector.proxies.recentItems(context, mendixObject);
	}

	public static salesforce_connector.proxies.recentItems load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return salesforce_connector.proxies.recentItems.initialize(context, mendixObject);
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
	 * @return value of _Id
	 */
	public final java.lang.String get_Id()
	{
		return get_Id(getContext());
	}

	/**
	 * @param context
	 * @return value of _Id
	 */
	public final java.lang.String get_Id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._Id.toString());
	}

	/**
	 * Set value of _Id
	 * @param _id
	 */
	public final void set_Id(java.lang.String _id)
	{
		set_Id(getContext(), _id);
	}

	/**
	 * Set value of _Id
	 * @param context
	 * @param _id
	 */
	public final void set_Id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _id)
	{
		getMendixObject().setValue(context, MemberNames._Id.toString(), _id);
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
	 * @return value of recentItems_SObject
	 */
	public final salesforce_connector.proxies.SObject getrecentItems_SObject() throws com.mendix.core.CoreException
	{
		return getrecentItems_SObject(getContext());
	}

	/**
	 * @param context
	 * @return value of recentItems_SObject
	 */
	public final salesforce_connector.proxies.SObject getrecentItems_SObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.SObject result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.recentItems_SObject.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.SObject.load(context, identifier);
		return result;
	}

	/**
	 * Set value of recentItems_SObject
	 * @param recentitems_sobject
	 */
	public final void setrecentItems_SObject(salesforce_connector.proxies.SObject recentitems_sobject)
	{
		setrecentItems_SObject(getContext(), recentitems_sobject);
	}

	/**
	 * Set value of recentItems_SObject
	 * @param context
	 * @param recentitems_sobject
	 */
	public final void setrecentItems_SObject(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.SObject recentitems_sobject)
	{
		if (recentitems_sobject == null)
			getMendixObject().setValue(context, MemberNames.recentItems_SObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.recentItems_SObject.toString(), recentitems_sobject.getMendixObject().getId());
	}

	/**
	 * @return value of Attributes_recentItems
	 */
	public final salesforce_connector.proxies.Attributes getAttributes_recentItems() throws com.mendix.core.CoreException
	{
		return getAttributes_recentItems(getContext());
	}

	/**
	 * @param context
	 * @return value of Attributes_recentItems
	 */
	public final salesforce_connector.proxies.Attributes getAttributes_recentItems(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.Attributes result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Attributes_recentItems.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.Attributes.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Attributes_recentItems
	 * @param attributes_recentitems
	 */
	public final void setAttributes_recentItems(salesforce_connector.proxies.Attributes attributes_recentitems)
	{
		setAttributes_recentItems(getContext(), attributes_recentitems);
	}

	/**
	 * Set value of Attributes_recentItems
	 * @param context
	 * @param attributes_recentitems
	 */
	public final void setAttributes_recentItems(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.Attributes attributes_recentitems)
	{
		if (attributes_recentitems == null)
			getMendixObject().setValue(context, MemberNames.Attributes_recentItems.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Attributes_recentItems.toString(), attributes_recentitems.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return recentItemsMendixObject;
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
			final salesforce_connector.proxies.recentItems that = (salesforce_connector.proxies.recentItems) obj;
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
		return "Salesforce_Connector.recentItems";
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
