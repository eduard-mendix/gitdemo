// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sapodataconnector.proxies;

public class ConnectivityInfo
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject connectivityInfoMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAPODataConnector.ConnectivityInfo";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ProxyHost("ProxyHost"),
		ProxyPort("ProxyPort"),
		SapConnectivityAuthentication("SapConnectivityAuthentication"),
		SapConnectivityProxyCredentials("SapConnectivityProxyCredentials");

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

	public ConnectivityInfo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAPODataConnector.ConnectivityInfo"));
	}

	protected ConnectivityInfo(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject connectivityInfoMendixObject)
	{
		if (connectivityInfoMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SAPODataConnector.ConnectivityInfo", connectivityInfoMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAPODataConnector.ConnectivityInfo");

		this.connectivityInfoMendixObject = connectivityInfoMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ConnectivityInfo.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sapodataconnector.proxies.ConnectivityInfo initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sapodataconnector.proxies.ConnectivityInfo.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sapodataconnector.proxies.ConnectivityInfo initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sapodataconnector.proxies.ConnectivityInfo(context, mendixObject);
	}

	public static sapodataconnector.proxies.ConnectivityInfo load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sapodataconnector.proxies.ConnectivityInfo.initialize(context, mendixObject);
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
	 * @return value of ProxyHost
	 */
	public final java.lang.String getProxyHost()
	{
		return getProxyHost(getContext());
	}

	/**
	 * @param context
	 * @return value of ProxyHost
	 */
	public final java.lang.String getProxyHost(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ProxyHost.toString());
	}

	/**
	 * Set value of ProxyHost
	 * @param proxyhost
	 */
	public final void setProxyHost(java.lang.String proxyhost)
	{
		setProxyHost(getContext(), proxyhost);
	}

	/**
	 * Set value of ProxyHost
	 * @param context
	 * @param proxyhost
	 */
	public final void setProxyHost(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String proxyhost)
	{
		getMendixObject().setValue(context, MemberNames.ProxyHost.toString(), proxyhost);
	}

	/**
	 * @return value of ProxyPort
	 */
	public final java.lang.Integer getProxyPort()
	{
		return getProxyPort(getContext());
	}

	/**
	 * @param context
	 * @return value of ProxyPort
	 */
	public final java.lang.Integer getProxyPort(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ProxyPort.toString());
	}

	/**
	 * Set value of ProxyPort
	 * @param proxyport
	 */
	public final void setProxyPort(java.lang.Integer proxyport)
	{
		setProxyPort(getContext(), proxyport);
	}

	/**
	 * Set value of ProxyPort
	 * @param context
	 * @param proxyport
	 */
	public final void setProxyPort(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer proxyport)
	{
		getMendixObject().setValue(context, MemberNames.ProxyPort.toString(), proxyport);
	}

	/**
	 * @return value of SapConnectivityAuthentication
	 */
	public final java.lang.String getSapConnectivityAuthentication()
	{
		return getSapConnectivityAuthentication(getContext());
	}

	/**
	 * @param context
	 * @return value of SapConnectivityAuthentication
	 */
	public final java.lang.String getSapConnectivityAuthentication(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SapConnectivityAuthentication.toString());
	}

	/**
	 * Set value of SapConnectivityAuthentication
	 * @param sapconnectivityauthentication
	 */
	public final void setSapConnectivityAuthentication(java.lang.String sapconnectivityauthentication)
	{
		setSapConnectivityAuthentication(getContext(), sapconnectivityauthentication);
	}

	/**
	 * Set value of SapConnectivityAuthentication
	 * @param context
	 * @param sapconnectivityauthentication
	 */
	public final void setSapConnectivityAuthentication(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sapconnectivityauthentication)
	{
		getMendixObject().setValue(context, MemberNames.SapConnectivityAuthentication.toString(), sapconnectivityauthentication);
	}

	/**
	 * @return value of SapConnectivityProxyCredentials
	 */
	public final java.lang.String getSapConnectivityProxyCredentials()
	{
		return getSapConnectivityProxyCredentials(getContext());
	}

	/**
	 * @param context
	 * @return value of SapConnectivityProxyCredentials
	 */
	public final java.lang.String getSapConnectivityProxyCredentials(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SapConnectivityProxyCredentials.toString());
	}

	/**
	 * Set value of SapConnectivityProxyCredentials
	 * @param sapconnectivityproxycredentials
	 */
	public final void setSapConnectivityProxyCredentials(java.lang.String sapconnectivityproxycredentials)
	{
		setSapConnectivityProxyCredentials(getContext(), sapconnectivityproxycredentials);
	}

	/**
	 * Set value of SapConnectivityProxyCredentials
	 * @param context
	 * @param sapconnectivityproxycredentials
	 */
	public final void setSapConnectivityProxyCredentials(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sapconnectivityproxycredentials)
	{
		getMendixObject().setValue(context, MemberNames.SapConnectivityProxyCredentials.toString(), sapconnectivityproxycredentials);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return connectivityInfoMendixObject;
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
			final sapodataconnector.proxies.ConnectivityInfo that = (sapodataconnector.proxies.ConnectivityInfo) obj;
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
		return "SAPODataConnector.ConnectivityInfo";
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