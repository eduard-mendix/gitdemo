// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package iot.proxies;

public class Sensor
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject sensorMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "IoT.Sensor";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SensorName("SensorName"),
		Connected("Connected"),
		SensorData("SensorData"),
		Manufacturer("Manufacturer"),
		SerialNumber("SerialNumber"),
		Model("Model"),
		Accessory("Accessory"),
		SensorID("SensorID"),
		Sensor_Room("IoT.Sensor_Room");

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

	public Sensor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "IoT.Sensor"));
	}

	protected Sensor(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sensorMendixObject)
	{
		if (sensorMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("IoT.Sensor", sensorMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a IoT.Sensor");

		this.sensorMendixObject = sensorMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Sensor.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static iot.proxies.Sensor initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return iot.proxies.Sensor.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static iot.proxies.Sensor initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new iot.proxies.Sensor(context, mendixObject);
	}

	public static iot.proxies.Sensor load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return iot.proxies.Sensor.initialize(context, mendixObject);
	}

	public static java.util.List<iot.proxies.Sensor> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<iot.proxies.Sensor> result = new java.util.ArrayList<iot.proxies.Sensor>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//IoT.Sensor" + xpathConstraint))
			result.add(iot.proxies.Sensor.initialize(context, obj));
		return result;
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
	 * @return value of SensorName
	 */
	public final java.lang.String getSensorName()
	{
		return getSensorName(getContext());
	}

	/**
	 * @param context
	 * @return value of SensorName
	 */
	public final java.lang.String getSensorName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SensorName.toString());
	}

	/**
	 * Set value of SensorName
	 * @param sensorname
	 */
	public final void setSensorName(java.lang.String sensorname)
	{
		setSensorName(getContext(), sensorname);
	}

	/**
	 * Set value of SensorName
	 * @param context
	 * @param sensorname
	 */
	public final void setSensorName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sensorname)
	{
		getMendixObject().setValue(context, MemberNames.SensorName.toString(), sensorname);
	}

	/**
	 * @return value of Connected
	 */
	public final java.lang.Boolean getConnected()
	{
		return getConnected(getContext());
	}

	/**
	 * @param context
	 * @return value of Connected
	 */
	public final java.lang.Boolean getConnected(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Connected.toString());
	}

	/**
	 * Set value of Connected
	 * @param connected
	 */
	public final void setConnected(java.lang.Boolean connected)
	{
		setConnected(getContext(), connected);
	}

	/**
	 * Set value of Connected
	 * @param context
	 * @param connected
	 */
	public final void setConnected(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean connected)
	{
		getMendixObject().setValue(context, MemberNames.Connected.toString(), connected);
	}

	/**
	 * @return value of SensorData
	 */
	public final java.lang.String getSensorData()
	{
		return getSensorData(getContext());
	}

	/**
	 * @param context
	 * @return value of SensorData
	 */
	public final java.lang.String getSensorData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SensorData.toString());
	}

	/**
	 * Set value of SensorData
	 * @param sensordata
	 */
	public final void setSensorData(java.lang.String sensordata)
	{
		setSensorData(getContext(), sensordata);
	}

	/**
	 * Set value of SensorData
	 * @param context
	 * @param sensordata
	 */
	public final void setSensorData(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sensordata)
	{
		getMendixObject().setValue(context, MemberNames.SensorData.toString(), sensordata);
	}

	/**
	 * @return value of Manufacturer
	 */
	public final java.lang.String getManufacturer()
	{
		return getManufacturer(getContext());
	}

	/**
	 * @param context
	 * @return value of Manufacturer
	 */
	public final java.lang.String getManufacturer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Manufacturer.toString());
	}

	/**
	 * Set value of Manufacturer
	 * @param manufacturer
	 */
	public final void setManufacturer(java.lang.String manufacturer)
	{
		setManufacturer(getContext(), manufacturer);
	}

	/**
	 * Set value of Manufacturer
	 * @param context
	 * @param manufacturer
	 */
	public final void setManufacturer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String manufacturer)
	{
		getMendixObject().setValue(context, MemberNames.Manufacturer.toString(), manufacturer);
	}

	/**
	 * @return value of SerialNumber
	 */
	public final java.lang.String getSerialNumber()
	{
		return getSerialNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of SerialNumber
	 */
	public final java.lang.String getSerialNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SerialNumber.toString());
	}

	/**
	 * Set value of SerialNumber
	 * @param serialnumber
	 */
	public final void setSerialNumber(java.lang.String serialnumber)
	{
		setSerialNumber(getContext(), serialnumber);
	}

	/**
	 * Set value of SerialNumber
	 * @param context
	 * @param serialnumber
	 */
	public final void setSerialNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String serialnumber)
	{
		getMendixObject().setValue(context, MemberNames.SerialNumber.toString(), serialnumber);
	}

	/**
	 * @return value of Model
	 */
	public final java.lang.String getModel()
	{
		return getModel(getContext());
	}

	/**
	 * @param context
	 * @return value of Model
	 */
	public final java.lang.String getModel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Model.toString());
	}

	/**
	 * Set value of Model
	 * @param model
	 */
	public final void setModel(java.lang.String model)
	{
		setModel(getContext(), model);
	}

	/**
	 * Set value of Model
	 * @param context
	 * @param model
	 */
	public final void setModel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String model)
	{
		getMendixObject().setValue(context, MemberNames.Model.toString(), model);
	}

	/**
	 * Set value of Accessory
	 * @param accessory
	 */
	public final iot.proxies.Devices getAccessory()
	{
		return getAccessory(getContext());
	}

	/**
	 * @param context
	 * @return value of Accessory
	 */
	public final iot.proxies.Devices getAccessory(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Accessory.toString());
		if (obj == null)
			return null;

		return iot.proxies.Devices.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Accessory
	 * @param accessory
	 */
	public final void setAccessory(iot.proxies.Devices accessory)
	{
		setAccessory(getContext(), accessory);
	}

	/**
	 * Set value of Accessory
	 * @param context
	 * @param accessory
	 */
	public final void setAccessory(com.mendix.systemwideinterfaces.core.IContext context, iot.proxies.Devices accessory)
	{
		if (accessory != null)
			getMendixObject().setValue(context, MemberNames.Accessory.toString(), accessory.toString());
		else
			getMendixObject().setValue(context, MemberNames.Accessory.toString(), null);
	}

	/**
	 * @return value of SensorID
	 */
	public final java.lang.String getSensorID()
	{
		return getSensorID(getContext());
	}

	/**
	 * @param context
	 * @return value of SensorID
	 */
	public final java.lang.String getSensorID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SensorID.toString());
	}

	/**
	 * Set value of SensorID
	 * @param sensorid
	 */
	public final void setSensorID(java.lang.String sensorid)
	{
		setSensorID(getContext(), sensorid);
	}

	/**
	 * Set value of SensorID
	 * @param context
	 * @param sensorid
	 */
	public final void setSensorID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sensorid)
	{
		getMendixObject().setValue(context, MemberNames.SensorID.toString(), sensorid);
	}

	/**
	 * @return value of Sensor_Room
	 */
	public final iot.proxies.Room getSensor_Room() throws com.mendix.core.CoreException
	{
		return getSensor_Room(getContext());
	}

	/**
	 * @param context
	 * @return value of Sensor_Room
	 */
	public final iot.proxies.Room getSensor_Room(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		iot.proxies.Room result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Sensor_Room.toString());
		if (identifier != null)
			result = iot.proxies.Room.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Sensor_Room
	 * @param sensor_room
	 */
	public final void setSensor_Room(iot.proxies.Room sensor_room)
	{
		setSensor_Room(getContext(), sensor_room);
	}

	/**
	 * Set value of Sensor_Room
	 * @param context
	 * @param sensor_room
	 */
	public final void setSensor_Room(com.mendix.systemwideinterfaces.core.IContext context, iot.proxies.Room sensor_room)
	{
		if (sensor_room == null)
			getMendixObject().setValue(context, MemberNames.Sensor_Room.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Sensor_Room.toString(), sensor_room.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return sensorMendixObject;
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
			final iot.proxies.Sensor that = (iot.proxies.Sensor) obj;
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
		return "IoT.Sensor";
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
