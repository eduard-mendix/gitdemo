// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sapodataconnector.proxies;

public class Destination
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject destinationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAPODataConnector.Destination";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Description("Description"),
		ProtocolType("ProtocolType"),
		Url("Url"),
		ProxyType("ProxyType"),
		Authentication("Authentication"),
		Audience("Audience"),
		ClientKey("ClientKey"),
		TokenServiceUrl("TokenServiceUrl"),
		TokenServiceUser("TokenServiceUser"),
		TokenServicePassword("TokenServicePassword"),
		SystemUser("SystemUser"),
		SamlBearer("SamlBearer"),
		User("User"),
		Password("Password"),
		ProxyHost("ProxyHost"),
		ProxyPort("ProxyPort"),
		SapConnectivityAuthentication("SapConnectivityAuthentication"),
		SapConnectivityProxyCredentials("SapConnectivityProxyCredentials"),
		SapConnectivitySccLocationId("SapConnectivitySccLocationId");

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

	public Destination(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAPODataConnector.Destination"));
	}

	protected Destination(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject destinationMendixObject)
	{
		if (destinationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SAPODataConnector.Destination", destinationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAPODataConnector.Destination");

		this.destinationMendixObject = destinationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Destination.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sapodataconnector.proxies.Destination initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sapodataconnector.proxies.Destination.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sapodataconnector.proxies.Destination initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sapodataconnector.proxies.Destination(context, mendixObject);
	}

	public static sapodataconnector.proxies.Destination load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sapodataconnector.proxies.Destination.initialize(context, mendixObject);
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
	 * Set value of ProtocolType
	 * @param protocoltype
	 */
	public final sapodataconnector.proxies.ProtocolType getProtocolType()
	{
		return getProtocolType(getContext());
	}

	/**
	 * @param context
	 * @return value of ProtocolType
	 */
	public final sapodataconnector.proxies.ProtocolType getProtocolType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ProtocolType.toString());
		if (obj == null)
			return null;

		return sapodataconnector.proxies.ProtocolType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ProtocolType
	 * @param protocoltype
	 */
	public final void setProtocolType(sapodataconnector.proxies.ProtocolType protocoltype)
	{
		setProtocolType(getContext(), protocoltype);
	}

	/**
	 * Set value of ProtocolType
	 * @param context
	 * @param protocoltype
	 */
	public final void setProtocolType(com.mendix.systemwideinterfaces.core.IContext context, sapodataconnector.proxies.ProtocolType protocoltype)
	{
		if (protocoltype != null)
			getMendixObject().setValue(context, MemberNames.ProtocolType.toString(), protocoltype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ProtocolType.toString(), null);
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
	 * Set value of ProxyType
	 * @param proxytype
	 */
	public final sapodataconnector.proxies.ProxyType getProxyType()
	{
		return getProxyType(getContext());
	}

	/**
	 * @param context
	 * @return value of ProxyType
	 */
	public final sapodataconnector.proxies.ProxyType getProxyType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ProxyType.toString());
		if (obj == null)
			return null;

		return sapodataconnector.proxies.ProxyType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ProxyType
	 * @param proxytype
	 */
	public final void setProxyType(sapodataconnector.proxies.ProxyType proxytype)
	{
		setProxyType(getContext(), proxytype);
	}

	/**
	 * Set value of ProxyType
	 * @param context
	 * @param proxytype
	 */
	public final void setProxyType(com.mendix.systemwideinterfaces.core.IContext context, sapodataconnector.proxies.ProxyType proxytype)
	{
		if (proxytype != null)
			getMendixObject().setValue(context, MemberNames.ProxyType.toString(), proxytype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ProxyType.toString(), null);
	}

	/**
	 * Set value of Authentication
	 * @param authentication
	 */
	public final sapodataconnector.proxies.Authentication getAuthentication()
	{
		return getAuthentication(getContext());
	}

	/**
	 * @param context
	 * @return value of Authentication
	 */
	public final sapodataconnector.proxies.Authentication getAuthentication(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Authentication.toString());
		if (obj == null)
			return null;

		return sapodataconnector.proxies.Authentication.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Authentication
	 * @param authentication
	 */
	public final void setAuthentication(sapodataconnector.proxies.Authentication authentication)
	{
		setAuthentication(getContext(), authentication);
	}

	/**
	 * Set value of Authentication
	 * @param context
	 * @param authentication
	 */
	public final void setAuthentication(com.mendix.systemwideinterfaces.core.IContext context, sapodataconnector.proxies.Authentication authentication)
	{
		if (authentication != null)
			getMendixObject().setValue(context, MemberNames.Authentication.toString(), authentication.toString());
		else
			getMendixObject().setValue(context, MemberNames.Authentication.toString(), null);
	}

	/**
	 * @return value of Audience
	 */
	public final java.lang.String getAudience()
	{
		return getAudience(getContext());
	}

	/**
	 * @param context
	 * @return value of Audience
	 */
	public final java.lang.String getAudience(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Audience.toString());
	}

	/**
	 * Set value of Audience
	 * @param audience
	 */
	public final void setAudience(java.lang.String audience)
	{
		setAudience(getContext(), audience);
	}

	/**
	 * Set value of Audience
	 * @param context
	 * @param audience
	 */
	public final void setAudience(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String audience)
	{
		getMendixObject().setValue(context, MemberNames.Audience.toString(), audience);
	}

	/**
	 * @return value of ClientKey
	 */
	public final java.lang.String getClientKey()
	{
		return getClientKey(getContext());
	}

	/**
	 * @param context
	 * @return value of ClientKey
	 */
	public final java.lang.String getClientKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ClientKey.toString());
	}

	/**
	 * Set value of ClientKey
	 * @param clientkey
	 */
	public final void setClientKey(java.lang.String clientkey)
	{
		setClientKey(getContext(), clientkey);
	}

	/**
	 * Set value of ClientKey
	 * @param context
	 * @param clientkey
	 */
	public final void setClientKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String clientkey)
	{
		getMendixObject().setValue(context, MemberNames.ClientKey.toString(), clientkey);
	}

	/**
	 * @return value of TokenServiceUrl
	 */
	public final java.lang.String getTokenServiceUrl()
	{
		return getTokenServiceUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of TokenServiceUrl
	 */
	public final java.lang.String getTokenServiceUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TokenServiceUrl.toString());
	}

	/**
	 * Set value of TokenServiceUrl
	 * @param tokenserviceurl
	 */
	public final void setTokenServiceUrl(java.lang.String tokenserviceurl)
	{
		setTokenServiceUrl(getContext(), tokenserviceurl);
	}

	/**
	 * Set value of TokenServiceUrl
	 * @param context
	 * @param tokenserviceurl
	 */
	public final void setTokenServiceUrl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tokenserviceurl)
	{
		getMendixObject().setValue(context, MemberNames.TokenServiceUrl.toString(), tokenserviceurl);
	}

	/**
	 * @return value of TokenServiceUser
	 */
	public final java.lang.String getTokenServiceUser()
	{
		return getTokenServiceUser(getContext());
	}

	/**
	 * @param context
	 * @return value of TokenServiceUser
	 */
	public final java.lang.String getTokenServiceUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TokenServiceUser.toString());
	}

	/**
	 * Set value of TokenServiceUser
	 * @param tokenserviceuser
	 */
	public final void setTokenServiceUser(java.lang.String tokenserviceuser)
	{
		setTokenServiceUser(getContext(), tokenserviceuser);
	}

	/**
	 * Set value of TokenServiceUser
	 * @param context
	 * @param tokenserviceuser
	 */
	public final void setTokenServiceUser(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tokenserviceuser)
	{
		getMendixObject().setValue(context, MemberNames.TokenServiceUser.toString(), tokenserviceuser);
	}

	/**
	 * @return value of TokenServicePassword
	 */
	public final java.lang.String getTokenServicePassword()
	{
		return getTokenServicePassword(getContext());
	}

	/**
	 * @param context
	 * @return value of TokenServicePassword
	 */
	public final java.lang.String getTokenServicePassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TokenServicePassword.toString());
	}

	/**
	 * Set value of TokenServicePassword
	 * @param tokenservicepassword
	 */
	public final void setTokenServicePassword(java.lang.String tokenservicepassword)
	{
		setTokenServicePassword(getContext(), tokenservicepassword);
	}

	/**
	 * Set value of TokenServicePassword
	 * @param context
	 * @param tokenservicepassword
	 */
	public final void setTokenServicePassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tokenservicepassword)
	{
		getMendixObject().setValue(context, MemberNames.TokenServicePassword.toString(), tokenservicepassword);
	}

	/**
	 * @return value of SystemUser
	 */
	public final java.lang.String getSystemUser()
	{
		return getSystemUser(getContext());
	}

	/**
	 * @param context
	 * @return value of SystemUser
	 */
	public final java.lang.String getSystemUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SystemUser.toString());
	}

	/**
	 * Set value of SystemUser
	 * @param systemuser
	 */
	public final void setSystemUser(java.lang.String systemuser)
	{
		setSystemUser(getContext(), systemuser);
	}

	/**
	 * Set value of SystemUser
	 * @param context
	 * @param systemuser
	 */
	public final void setSystemUser(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String systemuser)
	{
		getMendixObject().setValue(context, MemberNames.SystemUser.toString(), systemuser);
	}

	/**
	 * @return value of SamlBearer
	 */
	public final java.lang.String getSamlBearer()
	{
		return getSamlBearer(getContext());
	}

	/**
	 * @param context
	 * @return value of SamlBearer
	 */
	public final java.lang.String getSamlBearer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SamlBearer.toString());
	}

	/**
	 * Set value of SamlBearer
	 * @param samlbearer
	 */
	public final void setSamlBearer(java.lang.String samlbearer)
	{
		setSamlBearer(getContext(), samlbearer);
	}

	/**
	 * Set value of SamlBearer
	 * @param context
	 * @param samlbearer
	 */
	public final void setSamlBearer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String samlbearer)
	{
		getMendixObject().setValue(context, MemberNames.SamlBearer.toString(), samlbearer);
	}

	/**
	 * @return value of User
	 */
	public final java.lang.String getUser()
	{
		return getUser(getContext());
	}

	/**
	 * @param context
	 * @return value of User
	 */
	public final java.lang.String getUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.User.toString());
	}

	/**
	 * Set value of User
	 * @param user
	 */
	public final void setUser(java.lang.String user)
	{
		setUser(getContext(), user);
	}

	/**
	 * Set value of User
	 * @param context
	 * @param user
	 */
	public final void setUser(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String user)
	{
		getMendixObject().setValue(context, MemberNames.User.toString(), user);
	}

	/**
	 * @return value of Password
	 */
	public final java.lang.String getPassword()
	{
		return getPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of Password
	 */
	public final java.lang.String getPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Password.toString());
	}

	/**
	 * Set value of Password
	 * @param password
	 */
	public final void setPassword(java.lang.String password)
	{
		setPassword(getContext(), password);
	}

	/**
	 * Set value of Password
	 * @param context
	 * @param password
	 */
	public final void setPassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String password)
	{
		getMendixObject().setValue(context, MemberNames.Password.toString(), password);
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
	 * @return value of SapConnectivitySccLocationId
	 */
	public final java.lang.String getSapConnectivitySccLocationId()
	{
		return getSapConnectivitySccLocationId(getContext());
	}

	/**
	 * @param context
	 * @return value of SapConnectivitySccLocationId
	 */
	public final java.lang.String getSapConnectivitySccLocationId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SapConnectivitySccLocationId.toString());
	}

	/**
	 * Set value of SapConnectivitySccLocationId
	 * @param sapconnectivityscclocationid
	 */
	public final void setSapConnectivitySccLocationId(java.lang.String sapconnectivityscclocationid)
	{
		setSapConnectivitySccLocationId(getContext(), sapconnectivityscclocationid);
	}

	/**
	 * Set value of SapConnectivitySccLocationId
	 * @param context
	 * @param sapconnectivityscclocationid
	 */
	public final void setSapConnectivitySccLocationId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sapconnectivityscclocationid)
	{
		getMendixObject().setValue(context, MemberNames.SapConnectivitySccLocationId.toString(), sapconnectivityscclocationid);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return destinationMendixObject;
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
			final sapodataconnector.proxies.Destination that = (sapodataconnector.proxies.Destination) obj;
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
		return "SAPODataConnector.Destination";
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
