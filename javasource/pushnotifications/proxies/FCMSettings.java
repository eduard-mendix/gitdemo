// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package pushnotifications.proxies;

public class FCMSettings extends pushnotifications.proxies.MessagingServiceSettings
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PushNotifications.FCMSettings";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ProjectId("ProjectId"),
		EncryptedPrivateKey("EncryptedPrivateKey"),
		Enabled("Enabled"),
		Name("Name"),
		DTAPMode("DTAPMode"),
		MessagingServiceType("MessagingServiceType"),
		FCMSettings_FCMPrivateKey("PushNotifications.FCMSettings_FCMPrivateKey"),
		AndroidMessagingService("PushNotifications.AndroidMessagingService"),
		iOSMessagingService("PushNotifications.iOSMessagingService");

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

	public FCMSettings(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "PushNotifications.FCMSettings"));
	}

	protected FCMSettings(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject fCMSettingsMendixObject)
	{
		super(context, fCMSettingsMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("PushNotifications.FCMSettings", fCMSettingsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a PushNotifications.FCMSettings");
	}

	/**
	 * @deprecated Use 'FCMSettings.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static pushnotifications.proxies.FCMSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return pushnotifications.proxies.FCMSettings.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static pushnotifications.proxies.FCMSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new pushnotifications.proxies.FCMSettings(context, mendixObject);
	}

	public static pushnotifications.proxies.FCMSettings load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return pushnotifications.proxies.FCMSettings.initialize(context, mendixObject);
	}

	public static java.util.List<pushnotifications.proxies.FCMSettings> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<pushnotifications.proxies.FCMSettings> result = new java.util.ArrayList<pushnotifications.proxies.FCMSettings>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//PushNotifications.FCMSettings" + xpathConstraint))
			result.add(pushnotifications.proxies.FCMSettings.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ProjectId
	 */
	public final java.lang.String getProjectId()
	{
		return getProjectId(getContext());
	}

	/**
	 * @param context
	 * @return value of ProjectId
	 */
	public final java.lang.String getProjectId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ProjectId.toString());
	}

	/**
	 * Set value of ProjectId
	 * @param projectid
	 */
	public final void setProjectId(java.lang.String projectid)
	{
		setProjectId(getContext(), projectid);
	}

	/**
	 * Set value of ProjectId
	 * @param context
	 * @param projectid
	 */
	public final void setProjectId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String projectid)
	{
		getMendixObject().setValue(context, MemberNames.ProjectId.toString(), projectid);
	}

	/**
	 * @return value of EncryptedPrivateKey
	 */
	public final java.lang.String getEncryptedPrivateKey()
	{
		return getEncryptedPrivateKey(getContext());
	}

	/**
	 * @param context
	 * @return value of EncryptedPrivateKey
	 */
	public final java.lang.String getEncryptedPrivateKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EncryptedPrivateKey.toString());
	}

	/**
	 * Set value of EncryptedPrivateKey
	 * @param encryptedprivatekey
	 */
	public final void setEncryptedPrivateKey(java.lang.String encryptedprivatekey)
	{
		setEncryptedPrivateKey(getContext(), encryptedprivatekey);
	}

	/**
	 * Set value of EncryptedPrivateKey
	 * @param context
	 * @param encryptedprivatekey
	 */
	public final void setEncryptedPrivateKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String encryptedprivatekey)
	{
		getMendixObject().setValue(context, MemberNames.EncryptedPrivateKey.toString(), encryptedprivatekey);
	}

	/**
	 * @return value of FCMSettings_FCMPrivateKey
	 */
	public final pushnotifications.proxies.FCMPrivateKey getFCMSettings_FCMPrivateKey() throws com.mendix.core.CoreException
	{
		return getFCMSettings_FCMPrivateKey(getContext());
	}

	/**
	 * @param context
	 * @return value of FCMSettings_FCMPrivateKey
	 */
	public final pushnotifications.proxies.FCMPrivateKey getFCMSettings_FCMPrivateKey(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		pushnotifications.proxies.FCMPrivateKey result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FCMSettings_FCMPrivateKey.toString());
		if (identifier != null)
			result = pushnotifications.proxies.FCMPrivateKey.load(context, identifier);
		return result;
	}

	/**
	 * Set value of FCMSettings_FCMPrivateKey
	 * @param fcmsettings_fcmprivatekey
	 */
	public final void setFCMSettings_FCMPrivateKey(pushnotifications.proxies.FCMPrivateKey fcmsettings_fcmprivatekey)
	{
		setFCMSettings_FCMPrivateKey(getContext(), fcmsettings_fcmprivatekey);
	}

	/**
	 * Set value of FCMSettings_FCMPrivateKey
	 * @param context
	 * @param fcmsettings_fcmprivatekey
	 */
	public final void setFCMSettings_FCMPrivateKey(com.mendix.systemwideinterfaces.core.IContext context, pushnotifications.proxies.FCMPrivateKey fcmsettings_fcmprivatekey)
	{
		if (fcmsettings_fcmprivatekey == null)
			getMendixObject().setValue(context, MemberNames.FCMSettings_FCMPrivateKey.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.FCMSettings_FCMPrivateKey.toString(), fcmsettings_fcmprivatekey.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final pushnotifications.proxies.FCMSettings that = (pushnotifications.proxies.FCMSettings) obj;
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
		return "PushNotifications.FCMSettings";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
