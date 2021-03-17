// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesforce_connector.proxies;

public class Result
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject resultMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Salesforce_Connector.Result";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_id("_id"),
		success("success"),
		Result_Authorization("Salesforce_Connector.Result_Authorization"),
		Result_Query("Salesforce_Connector.Result_Query");

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

	public Result(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Salesforce_Connector.Result"));
	}

	protected Result(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject resultMendixObject)
	{
		if (resultMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Salesforce_Connector.Result", resultMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Salesforce_Connector.Result");

		this.resultMendixObject = resultMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Result.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static salesforce_connector.proxies.Result initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return salesforce_connector.proxies.Result.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static salesforce_connector.proxies.Result initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new salesforce_connector.proxies.Result(context, mendixObject);
	}

	public static salesforce_connector.proxies.Result load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return salesforce_connector.proxies.Result.initialize(context, mendixObject);
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
	 * @return value of _id
	 */
	public final java.lang.String get_id()
	{
		return get_id(getContext());
	}

	/**
	 * @param context
	 * @return value of _id
	 */
	public final java.lang.String get_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._id.toString());
	}

	/**
	 * Set value of _id
	 * @param _id
	 */
	public final void set_id(java.lang.String _id)
	{
		set_id(getContext(), _id);
	}

	/**
	 * Set value of _id
	 * @param context
	 * @param _id
	 */
	public final void set_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _id)
	{
		getMendixObject().setValue(context, MemberNames._id.toString(), _id);
	}

	/**
	 * @return value of success
	 */
	public final java.lang.Boolean getsuccess()
	{
		return getsuccess(getContext());
	}

	/**
	 * @param context
	 * @return value of success
	 */
	public final java.lang.Boolean getsuccess(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.success.toString());
	}

	/**
	 * Set value of success
	 * @param success
	 */
	public final void setsuccess(java.lang.Boolean success)
	{
		setsuccess(getContext(), success);
	}

	/**
	 * Set value of success
	 * @param context
	 * @param success
	 */
	public final void setsuccess(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean success)
	{
		getMendixObject().setValue(context, MemberNames.success.toString(), success);
	}

	/**
	 * @return value of Result_Authorization
	 */
	public final salesforce_connector.proxies.Authorization getResult_Authorization() throws com.mendix.core.CoreException
	{
		return getResult_Authorization(getContext());
	}

	/**
	 * @param context
	 * @return value of Result_Authorization
	 */
	public final salesforce_connector.proxies.Authorization getResult_Authorization(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.Authorization result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Result_Authorization.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.Authorization.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Result_Authorization
	 * @param result_authorization
	 */
	public final void setResult_Authorization(salesforce_connector.proxies.Authorization result_authorization)
	{
		setResult_Authorization(getContext(), result_authorization);
	}

	/**
	 * Set value of Result_Authorization
	 * @param context
	 * @param result_authorization
	 */
	public final void setResult_Authorization(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.Authorization result_authorization)
	{
		if (result_authorization == null)
			getMendixObject().setValue(context, MemberNames.Result_Authorization.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Result_Authorization.toString(), result_authorization.getMendixObject().getId());
	}

	/**
	 * @return value of Result_Query
	 */
	public final salesforce_connector.proxies.Query getResult_Query() throws com.mendix.core.CoreException
	{
		return getResult_Query(getContext());
	}

	/**
	 * @param context
	 * @return value of Result_Query
	 */
	public final salesforce_connector.proxies.Query getResult_Query(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.Query result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Result_Query.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.Query.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Result_Query
	 * @param result_query
	 */
	public final void setResult_Query(salesforce_connector.proxies.Query result_query)
	{
		setResult_Query(getContext(), result_query);
	}

	/**
	 * Set value of Result_Query
	 * @param context
	 * @param result_query
	 */
	public final void setResult_Query(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.Query result_query)
	{
		if (result_query == null)
			getMendixObject().setValue(context, MemberNames.Result_Query.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Result_Query.toString(), result_query.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return resultMendixObject;
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
			final salesforce_connector.proxies.Result that = (salesforce_connector.proxies.Result) obj;
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
		return "Salesforce_Connector.Result";
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
