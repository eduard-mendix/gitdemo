// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package pushnotifications.proxies;

public class MessageData
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject messageDataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PushNotifications.MessageData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Title("Title"),
		Body("Body"),
		TimeToLive("TimeToLive"),
		Badge("Badge"),
		ActionName("ActionName"),
		ContextObjectGuid("ContextObjectGuid"),
		NextTry("NextTry"),
		PlaySound("PlaySound");

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

	public MessageData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "PushNotifications.MessageData"));
	}

	protected MessageData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject messageDataMendixObject)
	{
		if (messageDataMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("PushNotifications.MessageData", messageDataMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a PushNotifications.MessageData");

		this.messageDataMendixObject = messageDataMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MessageData.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static pushnotifications.proxies.MessageData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return pushnotifications.proxies.MessageData.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static pushnotifications.proxies.MessageData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new pushnotifications.proxies.MessageData(context, mendixObject);
	}

	public static pushnotifications.proxies.MessageData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return pushnotifications.proxies.MessageData.initialize(context, mendixObject);
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
	 * @return value of Title
	 */
	public final java.lang.String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final java.lang.String getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(java.lang.String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of Body
	 */
	public final java.lang.String getBody()
	{
		return getBody(getContext());
	}

	/**
	 * @param context
	 * @return value of Body
	 */
	public final java.lang.String getBody(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Body.toString());
	}

	/**
	 * Set value of Body
	 * @param body
	 */
	public final void setBody(java.lang.String body)
	{
		setBody(getContext(), body);
	}

	/**
	 * Set value of Body
	 * @param context
	 * @param body
	 */
	public final void setBody(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String body)
	{
		getMendixObject().setValue(context, MemberNames.Body.toString(), body);
	}

	/**
	 * @return value of TimeToLive
	 */
	public final java.lang.Long getTimeToLive()
	{
		return getTimeToLive(getContext());
	}

	/**
	 * @param context
	 * @return value of TimeToLive
	 */
	public final java.lang.Long getTimeToLive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.TimeToLive.toString());
	}

	/**
	 * Set value of TimeToLive
	 * @param timetolive
	 */
	public final void setTimeToLive(java.lang.Long timetolive)
	{
		setTimeToLive(getContext(), timetolive);
	}

	/**
	 * Set value of TimeToLive
	 * @param context
	 * @param timetolive
	 */
	public final void setTimeToLive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long timetolive)
	{
		getMendixObject().setValue(context, MemberNames.TimeToLive.toString(), timetolive);
	}

	/**
	 * @return value of Badge
	 */
	public final java.lang.Integer getBadge()
	{
		return getBadge(getContext());
	}

	/**
	 * @param context
	 * @return value of Badge
	 */
	public final java.lang.Integer getBadge(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Badge.toString());
	}

	/**
	 * Set value of Badge
	 * @param badge
	 */
	public final void setBadge(java.lang.Integer badge)
	{
		setBadge(getContext(), badge);
	}

	/**
	 * Set value of Badge
	 * @param context
	 * @param badge
	 */
	public final void setBadge(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer badge)
	{
		getMendixObject().setValue(context, MemberNames.Badge.toString(), badge);
	}

	/**
	 * @return value of ActionName
	 */
	public final java.lang.String getActionName()
	{
		return getActionName(getContext());
	}

	/**
	 * @param context
	 * @return value of ActionName
	 */
	public final java.lang.String getActionName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ActionName.toString());
	}

	/**
	 * Set value of ActionName
	 * @param actionname
	 */
	public final void setActionName(java.lang.String actionname)
	{
		setActionName(getContext(), actionname);
	}

	/**
	 * Set value of ActionName
	 * @param context
	 * @param actionname
	 */
	public final void setActionName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String actionname)
	{
		getMendixObject().setValue(context, MemberNames.ActionName.toString(), actionname);
	}

	/**
	 * @return value of ContextObjectGuid
	 */
	public final java.lang.Long getContextObjectGuid()
	{
		return getContextObjectGuid(getContext());
	}

	/**
	 * @param context
	 * @return value of ContextObjectGuid
	 */
	public final java.lang.Long getContextObjectGuid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.ContextObjectGuid.toString());
	}

	/**
	 * Set value of ContextObjectGuid
	 * @param contextobjectguid
	 */
	public final void setContextObjectGuid(java.lang.Long contextobjectguid)
	{
		setContextObjectGuid(getContext(), contextobjectguid);
	}

	/**
	 * Set value of ContextObjectGuid
	 * @param context
	 * @param contextobjectguid
	 */
	public final void setContextObjectGuid(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long contextobjectguid)
	{
		getMendixObject().setValue(context, MemberNames.ContextObjectGuid.toString(), contextobjectguid);
	}

	/**
	 * @return value of NextTry
	 */
	public final java.util.Date getNextTry()
	{
		return getNextTry(getContext());
	}

	/**
	 * @param context
	 * @return value of NextTry
	 */
	public final java.util.Date getNextTry(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.NextTry.toString());
	}

	/**
	 * Set value of NextTry
	 * @param nexttry
	 */
	public final void setNextTry(java.util.Date nexttry)
	{
		setNextTry(getContext(), nexttry);
	}

	/**
	 * Set value of NextTry
	 * @param context
	 * @param nexttry
	 */
	public final void setNextTry(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date nexttry)
	{
		getMendixObject().setValue(context, MemberNames.NextTry.toString(), nexttry);
	}

	/**
	 * @return value of PlaySound
	 */
	public final java.lang.Boolean getPlaySound()
	{
		return getPlaySound(getContext());
	}

	/**
	 * @param context
	 * @return value of PlaySound
	 */
	public final java.lang.Boolean getPlaySound(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.PlaySound.toString());
	}

	/**
	 * Set value of PlaySound
	 * @param playsound
	 */
	public final void setPlaySound(java.lang.Boolean playsound)
	{
		setPlaySound(getContext(), playsound);
	}

	/**
	 * Set value of PlaySound
	 * @param context
	 * @param playsound
	 */
	public final void setPlaySound(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean playsound)
	{
		getMendixObject().setValue(context, MemberNames.PlaySound.toString(), playsound);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return messageDataMendixObject;
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
			final pushnotifications.proxies.MessageData that = (pushnotifications.proxies.MessageData) obj;
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
		return "PushNotifications.MessageData";
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
