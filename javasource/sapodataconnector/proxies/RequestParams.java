// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sapodataconnector.proxies;

public class RequestParams
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject requestParamsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAPODataConnector.RequestParams";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		expectedHttpResult("expectedHttpResult"),
		connectTimeout("connectTimeout"),
		readTimeout("readTimeout"),
		Proxy("Proxy"),
		manualProxy("manualProxy");

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

	public RequestParams(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAPODataConnector.RequestParams"));
	}

	protected RequestParams(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject requestParamsMendixObject)
	{
		if (requestParamsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SAPODataConnector.RequestParams", requestParamsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAPODataConnector.RequestParams");

		this.requestParamsMendixObject = requestParamsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'RequestParams.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sapodataconnector.proxies.RequestParams initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sapodataconnector.proxies.RequestParams.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sapodataconnector.proxies.RequestParams initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sapodataconnector.proxies.RequestParams(context, mendixObject);
	}

	public static sapodataconnector.proxies.RequestParams load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sapodataconnector.proxies.RequestParams.initialize(context, mendixObject);
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
	 * @return value of expectedHttpResult
	 */
	public final java.lang.Integer getexpectedHttpResult()
	{
		return getexpectedHttpResult(getContext());
	}

	/**
	 * @param context
	 * @return value of expectedHttpResult
	 */
	public final java.lang.Integer getexpectedHttpResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.expectedHttpResult.toString());
	}

	/**
	 * Set value of expectedHttpResult
	 * @param expectedhttpresult
	 */
	public final void setexpectedHttpResult(java.lang.Integer expectedhttpresult)
	{
		setexpectedHttpResult(getContext(), expectedhttpresult);
	}

	/**
	 * Set value of expectedHttpResult
	 * @param context
	 * @param expectedhttpresult
	 */
	public final void setexpectedHttpResult(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer expectedhttpresult)
	{
		getMendixObject().setValue(context, MemberNames.expectedHttpResult.toString(), expectedhttpresult);
	}

	/**
	 * @return value of connectTimeout
	 */
	public final java.lang.Integer getconnectTimeout()
	{
		return getconnectTimeout(getContext());
	}

	/**
	 * @param context
	 * @return value of connectTimeout
	 */
	public final java.lang.Integer getconnectTimeout(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.connectTimeout.toString());
	}

	/**
	 * Set value of connectTimeout
	 * @param connecttimeout
	 */
	public final void setconnectTimeout(java.lang.Integer connecttimeout)
	{
		setconnectTimeout(getContext(), connecttimeout);
	}

	/**
	 * Set value of connectTimeout
	 * @param context
	 * @param connecttimeout
	 */
	public final void setconnectTimeout(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer connecttimeout)
	{
		getMendixObject().setValue(context, MemberNames.connectTimeout.toString(), connecttimeout);
	}

	/**
	 * @return value of readTimeout
	 */
	public final java.lang.Integer getreadTimeout()
	{
		return getreadTimeout(getContext());
	}

	/**
	 * @param context
	 * @return value of readTimeout
	 */
	public final java.lang.Integer getreadTimeout(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.readTimeout.toString());
	}

	/**
	 * Set value of readTimeout
	 * @param readtimeout
	 */
	public final void setreadTimeout(java.lang.Integer readtimeout)
	{
		setreadTimeout(getContext(), readtimeout);
	}

	/**
	 * Set value of readTimeout
	 * @param context
	 * @param readtimeout
	 */
	public final void setreadTimeout(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer readtimeout)
	{
		getMendixObject().setValue(context, MemberNames.readTimeout.toString(), readtimeout);
	}

	/**
	 * Set value of Proxy
	 * @param proxy
	 */
	public final sapodataconnector.proxies.ProxyConfig getProxy()
	{
		return getProxy(getContext());
	}

	/**
	 * @param context
	 * @return value of Proxy
	 */
	public final sapodataconnector.proxies.ProxyConfig getProxy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Proxy.toString());
		if (obj == null)
			return null;

		return sapodataconnector.proxies.ProxyConfig.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Proxy
	 * @param proxy
	 */
	public final void setProxy(sapodataconnector.proxies.ProxyConfig proxy)
	{
		setProxy(getContext(), proxy);
	}

	/**
	 * Set value of Proxy
	 * @param context
	 * @param proxy
	 */
	public final void setProxy(com.mendix.systemwideinterfaces.core.IContext context, sapodataconnector.proxies.ProxyConfig proxy)
	{
		if (proxy != null)
			getMendixObject().setValue(context, MemberNames.Proxy.toString(), proxy.toString());
		else
			getMendixObject().setValue(context, MemberNames.Proxy.toString(), null);
	}

	/**
	 * @return value of manualProxy
	 */
	public final java.lang.String getmanualProxy()
	{
		return getmanualProxy(getContext());
	}

	/**
	 * @param context
	 * @return value of manualProxy
	 */
	public final java.lang.String getmanualProxy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.manualProxy.toString());
	}

	/**
	 * Set value of manualProxy
	 * @param manualproxy
	 */
	public final void setmanualProxy(java.lang.String manualproxy)
	{
		setmanualProxy(getContext(), manualproxy);
	}

	/**
	 * Set value of manualProxy
	 * @param context
	 * @param manualproxy
	 */
	public final void setmanualProxy(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String manualproxy)
	{
		getMendixObject().setValue(context, MemberNames.manualProxy.toString(), manualproxy);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return requestParamsMendixObject;
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
			final sapodataconnector.proxies.RequestParams that = (sapodataconnector.proxies.RequestParams) obj;
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
		return "SAPODataConnector.RequestParams";
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
