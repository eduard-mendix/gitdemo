// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesforce_connector.proxies;

public class Error
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject errorMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Salesforce_Connector.Error";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Message("Message"),
		StatusCode("StatusCode"),
		Error_Result("Salesforce_Connector.Error_Result");

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

	public Error(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Salesforce_Connector.Error"));
	}

	protected Error(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject errorMendixObject)
	{
		if (errorMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Salesforce_Connector.Error", errorMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Salesforce_Connector.Error");

		this.errorMendixObject = errorMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Error.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static salesforce_connector.proxies.Error initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return salesforce_connector.proxies.Error.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static salesforce_connector.proxies.Error initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new salesforce_connector.proxies.Error(context, mendixObject);
	}

	public static salesforce_connector.proxies.Error load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return salesforce_connector.proxies.Error.initialize(context, mendixObject);
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
	 * @return value of Message
	 */
	public final java.lang.String getMessage()
	{
		return getMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of Message
	 */
	public final java.lang.String getMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Message.toString());
	}

	/**
	 * Set value of Message
	 * @param message
	 */
	public final void setMessage(java.lang.String message)
	{
		setMessage(getContext(), message);
	}

	/**
	 * Set value of Message
	 * @param context
	 * @param message
	 */
	public final void setMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String message)
	{
		getMendixObject().setValue(context, MemberNames.Message.toString(), message);
	}

	/**
	 * @return value of StatusCode
	 */
	public final java.lang.String getStatusCode()
	{
		return getStatusCode(getContext());
	}

	/**
	 * @param context
	 * @return value of StatusCode
	 */
	public final java.lang.String getStatusCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.StatusCode.toString());
	}

	/**
	 * Set value of StatusCode
	 * @param statuscode
	 */
	public final void setStatusCode(java.lang.String statuscode)
	{
		setStatusCode(getContext(), statuscode);
	}

	/**
	 * Set value of StatusCode
	 * @param context
	 * @param statuscode
	 */
	public final void setStatusCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String statuscode)
	{
		getMendixObject().setValue(context, MemberNames.StatusCode.toString(), statuscode);
	}

	/**
	 * @return value of Error_Result
	 */
	public final salesforce_connector.proxies.Result getError_Result() throws com.mendix.core.CoreException
	{
		return getError_Result(getContext());
	}

	/**
	 * @param context
	 * @return value of Error_Result
	 */
	public final salesforce_connector.proxies.Result getError_Result(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.Result result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Error_Result.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.Result.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Error_Result
	 * @param error_result
	 */
	public final void setError_Result(salesforce_connector.proxies.Result error_result)
	{
		setError_Result(getContext(), error_result);
	}

	/**
	 * Set value of Error_Result
	 * @param context
	 * @param error_result
	 */
	public final void setError_Result(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.Result error_result)
	{
		if (error_result == null)
			getMendixObject().setValue(context, MemberNames.Error_Result.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Error_Result.toString(), error_result.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return errorMendixObject;
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
			final salesforce_connector.proxies.Error that = (salesforce_connector.proxies.Error) obj;
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
		return "Salesforce_Connector.Error";
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
