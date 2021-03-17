// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesforce_connector.proxies;

public class Attributes
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject attributesMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Salesforce_Connector.Attributes";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_type("_type"),
		Url("Url"),
		Attributes_recentItems("Salesforce_Connector.Attributes_recentItems"),
		Attributes_SObject("Salesforce_Connector.Attributes_SObject");

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

	public Attributes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Salesforce_Connector.Attributes"));
	}

	protected Attributes(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject attributesMendixObject)
	{
		if (attributesMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Salesforce_Connector.Attributes", attributesMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Salesforce_Connector.Attributes");

		this.attributesMendixObject = attributesMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Attributes.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static salesforce_connector.proxies.Attributes initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return salesforce_connector.proxies.Attributes.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static salesforce_connector.proxies.Attributes initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new salesforce_connector.proxies.Attributes(context, mendixObject);
	}

	public static salesforce_connector.proxies.Attributes load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return salesforce_connector.proxies.Attributes.initialize(context, mendixObject);
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
	 * @return value of _type
	 */
	public final java.lang.String get_type()
	{
		return get_type(getContext());
	}

	/**
	 * @param context
	 * @return value of _type
	 */
	public final java.lang.String get_type(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._type.toString());
	}

	/**
	 * Set value of _type
	 * @param _type
	 */
	public final void set_type(java.lang.String _type)
	{
		set_type(getContext(), _type);
	}

	/**
	 * Set value of _type
	 * @param context
	 * @param _type
	 */
	public final void set_type(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _type)
	{
		getMendixObject().setValue(context, MemberNames._type.toString(), _type);
	}

	/**
	 * @return value of Url
	 */
	public final java.lang.String getUrl()
	{
		return getUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of Url
	 */
	public final java.lang.String getUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Url.toString());
	}

	/**
	 * Set value of Url
	 * @param url
	 */
	public final void setUrl(java.lang.String url)
	{
		setUrl(getContext(), url);
	}

	/**
	 * Set value of Url
	 * @param context
	 * @param url
	 */
	public final void setUrl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String url)
	{
		getMendixObject().setValue(context, MemberNames.Url.toString(), url);
	}

	/**
	 * @return value of Attributes_recentItems
	 */
	public final salesforce_connector.proxies.recentItems getAttributes_recentItems() throws com.mendix.core.CoreException
	{
		return getAttributes_recentItems(getContext());
	}

	/**
	 * @param context
	 * @return value of Attributes_recentItems
	 */
	public final salesforce_connector.proxies.recentItems getAttributes_recentItems(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.recentItems result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Attributes_recentItems.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.recentItems.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Attributes_recentItems
	 * @param attributes_recentitems
	 */
	public final void setAttributes_recentItems(salesforce_connector.proxies.recentItems attributes_recentitems)
	{
		setAttributes_recentItems(getContext(), attributes_recentitems);
	}

	/**
	 * Set value of Attributes_recentItems
	 * @param context
	 * @param attributes_recentitems
	 */
	public final void setAttributes_recentItems(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.recentItems attributes_recentitems)
	{
		if (attributes_recentitems == null)
			getMendixObject().setValue(context, MemberNames.Attributes_recentItems.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Attributes_recentItems.toString(), attributes_recentitems.getMendixObject().getId());
	}

	/**
	 * @return value of Attributes_SObject
	 */
	public final salesforce_connector.proxies.SObject getAttributes_SObject() throws com.mendix.core.CoreException
	{
		return getAttributes_SObject(getContext());
	}

	/**
	 * @param context
	 * @return value of Attributes_SObject
	 */
	public final salesforce_connector.proxies.SObject getAttributes_SObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.SObject result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Attributes_SObject.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.SObject.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Attributes_SObject
	 * @param attributes_sobject
	 */
	public final void setAttributes_SObject(salesforce_connector.proxies.SObject attributes_sobject)
	{
		setAttributes_SObject(getContext(), attributes_sobject);
	}

	/**
	 * Set value of Attributes_SObject
	 * @param context
	 * @param attributes_sobject
	 */
	public final void setAttributes_SObject(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.SObject attributes_sobject)
	{
		if (attributes_sobject == null)
			getMendixObject().setValue(context, MemberNames.Attributes_SObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Attributes_SObject.toString(), attributes_sobject.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return attributesMendixObject;
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
			final salesforce_connector.proxies.Attributes that = (salesforce_connector.proxies.Attributes) obj;
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
		return "Salesforce_Connector.Attributes";
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
