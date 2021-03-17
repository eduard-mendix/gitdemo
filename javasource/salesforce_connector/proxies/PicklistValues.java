// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesforce_connector.proxies;

public class PicklistValues
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject picklistValuesMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Salesforce_Connector.PicklistValues";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PicklistValues_fields("Salesforce_Connector.PicklistValues_fields");

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

	public PicklistValues(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Salesforce_Connector.PicklistValues"));
	}

	protected PicklistValues(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject picklistValuesMendixObject)
	{
		if (picklistValuesMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Salesforce_Connector.PicklistValues", picklistValuesMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Salesforce_Connector.PicklistValues");

		this.picklistValuesMendixObject = picklistValuesMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'PicklistValues.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static salesforce_connector.proxies.PicklistValues initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return salesforce_connector.proxies.PicklistValues.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static salesforce_connector.proxies.PicklistValues initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new salesforce_connector.proxies.PicklistValues(context, mendixObject);
	}

	public static salesforce_connector.proxies.PicklistValues load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return salesforce_connector.proxies.PicklistValues.initialize(context, mendixObject);
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
	 * @return value of PicklistValues_fields
	 */
	public final salesforce_connector.proxies.fields getPicklistValues_fields() throws com.mendix.core.CoreException
	{
		return getPicklistValues_fields(getContext());
	}

	/**
	 * @param context
	 * @return value of PicklistValues_fields
	 */
	public final salesforce_connector.proxies.fields getPicklistValues_fields(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.fields result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PicklistValues_fields.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.fields.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PicklistValues_fields
	 * @param picklistvalues_fields
	 */
	public final void setPicklistValues_fields(salesforce_connector.proxies.fields picklistvalues_fields)
	{
		setPicklistValues_fields(getContext(), picklistvalues_fields);
	}

	/**
	 * Set value of PicklistValues_fields
	 * @param context
	 * @param picklistvalues_fields
	 */
	public final void setPicklistValues_fields(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.fields picklistvalues_fields)
	{
		if (picklistvalues_fields == null)
			getMendixObject().setValue(context, MemberNames.PicklistValues_fields.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PicklistValues_fields.toString(), picklistvalues_fields.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return picklistValuesMendixObject;
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
			final salesforce_connector.proxies.PicklistValues that = (salesforce_connector.proxies.PicklistValues) obj;
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
		return "Salesforce_Connector.PicklistValues";
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
