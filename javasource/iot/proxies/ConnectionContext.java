// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package iot.proxies;

public class ConnectionContext
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject connectionContextMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "IoT.ConnectionContext";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ConnectionStatus("ConnectionStatus"),
		ConnectionContext_Sensor("IoT.ConnectionContext_Sensor");

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

	public ConnectionContext(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "IoT.ConnectionContext"));
	}

	protected ConnectionContext(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject connectionContextMendixObject)
	{
		if (connectionContextMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("IoT.ConnectionContext", connectionContextMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a IoT.ConnectionContext");

		this.connectionContextMendixObject = connectionContextMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ConnectionContext.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static iot.proxies.ConnectionContext initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return iot.proxies.ConnectionContext.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static iot.proxies.ConnectionContext initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new iot.proxies.ConnectionContext(context, mendixObject);
	}

	public static iot.proxies.ConnectionContext load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return iot.proxies.ConnectionContext.initialize(context, mendixObject);
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
	 * Set value of ConnectionStatus
	 * @param connectionstatus
	 */
	public final iot.proxies.ConnectionStatus getConnectionStatus()
	{
		return getConnectionStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of ConnectionStatus
	 */
	public final iot.proxies.ConnectionStatus getConnectionStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ConnectionStatus.toString());
		if (obj == null)
			return null;

		return iot.proxies.ConnectionStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ConnectionStatus
	 * @param connectionstatus
	 */
	public final void setConnectionStatus(iot.proxies.ConnectionStatus connectionstatus)
	{
		setConnectionStatus(getContext(), connectionstatus);
	}

	/**
	 * Set value of ConnectionStatus
	 * @param context
	 * @param connectionstatus
	 */
	public final void setConnectionStatus(com.mendix.systemwideinterfaces.core.IContext context, iot.proxies.ConnectionStatus connectionstatus)
	{
		if (connectionstatus != null)
			getMendixObject().setValue(context, MemberNames.ConnectionStatus.toString(), connectionstatus.toString());
		else
			getMendixObject().setValue(context, MemberNames.ConnectionStatus.toString(), null);
	}

	/**
	 * @return value of ConnectionContext_Sensor
	 */
	public final iot.proxies.Sensor getConnectionContext_Sensor() throws com.mendix.core.CoreException
	{
		return getConnectionContext_Sensor(getContext());
	}

	/**
	 * @param context
	 * @return value of ConnectionContext_Sensor
	 */
	public final iot.proxies.Sensor getConnectionContext_Sensor(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		iot.proxies.Sensor result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ConnectionContext_Sensor.toString());
		if (identifier != null)
			result = iot.proxies.Sensor.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ConnectionContext_Sensor
	 * @param connectioncontext_sensor
	 */
	public final void setConnectionContext_Sensor(iot.proxies.Sensor connectioncontext_sensor)
	{
		setConnectionContext_Sensor(getContext(), connectioncontext_sensor);
	}

	/**
	 * Set value of ConnectionContext_Sensor
	 * @param context
	 * @param connectioncontext_sensor
	 */
	public final void setConnectionContext_Sensor(com.mendix.systemwideinterfaces.core.IContext context, iot.proxies.Sensor connectioncontext_sensor)
	{
		if (connectioncontext_sensor == null)
			getMendixObject().setValue(context, MemberNames.ConnectionContext_Sensor.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ConnectionContext_Sensor.toString(), connectioncontext_sensor.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return connectionContextMendixObject;
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
			final iot.proxies.ConnectionContext that = (iot.proxies.ConnectionContext) obj;
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
		return "IoT.ConnectionContext";
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