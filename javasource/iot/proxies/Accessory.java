// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package iot.proxies;

public class Accessory
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject accessoryMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "IoT.Accessory";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AccessoryName("AccessoryName"),
		Active("Active"),
		SensorData("SensorData"),
		Manufacturer("Manufacturer"),
		SerialNumber("SerialNumber"),
		Model("Model"),
		Accessory("Accessory"),
		Brightness("Brightness"),
		ColorTemperature("ColorTemperature"),
		Color("Color"),
		ColorMode("ColorMode"),
		LampID("LampID"),
		Accessory_Room("IoT.Accessory_Room"),
		Accessory_Scene("IoT.Accessory_Scene");

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

	public Accessory(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "IoT.Accessory"));
	}

	protected Accessory(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject accessoryMendixObject)
	{
		if (accessoryMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("IoT.Accessory", accessoryMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a IoT.Accessory");

		this.accessoryMendixObject = accessoryMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Accessory.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static iot.proxies.Accessory initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return iot.proxies.Accessory.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static iot.proxies.Accessory initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new iot.proxies.Accessory(context, mendixObject);
	}

	public static iot.proxies.Accessory load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return iot.proxies.Accessory.initialize(context, mendixObject);
	}

	public static java.util.List<iot.proxies.Accessory> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<iot.proxies.Accessory> result = new java.util.ArrayList<iot.proxies.Accessory>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//IoT.Accessory" + xpathConstraint))
			result.add(iot.proxies.Accessory.initialize(context, obj));
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
	 * @return value of AccessoryName
	 */
	public final java.lang.String getAccessoryName()
	{
		return getAccessoryName(getContext());
	}

	/**
	 * @param context
	 * @return value of AccessoryName
	 */
	public final java.lang.String getAccessoryName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AccessoryName.toString());
	}

	/**
	 * Set value of AccessoryName
	 * @param accessoryname
	 */
	public final void setAccessoryName(java.lang.String accessoryname)
	{
		setAccessoryName(getContext(), accessoryname);
	}

	/**
	 * Set value of AccessoryName
	 * @param context
	 * @param accessoryname
	 */
	public final void setAccessoryName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String accessoryname)
	{
		getMendixObject().setValue(context, MemberNames.AccessoryName.toString(), accessoryname);
	}

	/**
	 * @return value of Active
	 */
	public final java.lang.Boolean getActive()
	{
		return getActive(getContext());
	}

	/**
	 * @param context
	 * @return value of Active
	 */
	public final java.lang.Boolean getActive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Active.toString());
	}

	/**
	 * Set value of Active
	 * @param active
	 */
	public final void setActive(java.lang.Boolean active)
	{
		setActive(getContext(), active);
	}

	/**
	 * Set value of Active
	 * @param context
	 * @param active
	 */
	public final void setActive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean active)
	{
		getMendixObject().setValue(context, MemberNames.Active.toString(), active);
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
	 * @return value of Brightness
	 */
	public final java.lang.Integer getBrightness()
	{
		return getBrightness(getContext());
	}

	/**
	 * @param context
	 * @return value of Brightness
	 */
	public final java.lang.Integer getBrightness(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Brightness.toString());
	}

	/**
	 * Set value of Brightness
	 * @param brightness
	 */
	public final void setBrightness(java.lang.Integer brightness)
	{
		setBrightness(getContext(), brightness);
	}

	/**
	 * Set value of Brightness
	 * @param context
	 * @param brightness
	 */
	public final void setBrightness(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer brightness)
	{
		getMendixObject().setValue(context, MemberNames.Brightness.toString(), brightness);
	}

	/**
	 * Set value of ColorTemperature
	 * @param colortemperature
	 */
	public final homeautomationconnector.proxies.ColorTemperature getColorTemperature()
	{
		return getColorTemperature(getContext());
	}

	/**
	 * @param context
	 * @return value of ColorTemperature
	 */
	public final homeautomationconnector.proxies.ColorTemperature getColorTemperature(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ColorTemperature.toString());
		if (obj == null)
			return null;

		return homeautomationconnector.proxies.ColorTemperature.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ColorTemperature
	 * @param colortemperature
	 */
	public final void setColorTemperature(homeautomationconnector.proxies.ColorTemperature colortemperature)
	{
		setColorTemperature(getContext(), colortemperature);
	}

	/**
	 * Set value of ColorTemperature
	 * @param context
	 * @param colortemperature
	 */
	public final void setColorTemperature(com.mendix.systemwideinterfaces.core.IContext context, homeautomationconnector.proxies.ColorTemperature colortemperature)
	{
		if (colortemperature != null)
			getMendixObject().setValue(context, MemberNames.ColorTemperature.toString(), colortemperature.toString());
		else
			getMendixObject().setValue(context, MemberNames.ColorTemperature.toString(), null);
	}

	/**
	 * Set value of Color
	 * @param color
	 */
	public final homeautomationconnector.proxies.Color getColor()
	{
		return getColor(getContext());
	}

	/**
	 * @param context
	 * @return value of Color
	 */
	public final homeautomationconnector.proxies.Color getColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Color.toString());
		if (obj == null)
			return null;

		return homeautomationconnector.proxies.Color.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Color
	 * @param color
	 */
	public final void setColor(homeautomationconnector.proxies.Color color)
	{
		setColor(getContext(), color);
	}

	/**
	 * Set value of Color
	 * @param context
	 * @param color
	 */
	public final void setColor(com.mendix.systemwideinterfaces.core.IContext context, homeautomationconnector.proxies.Color color)
	{
		if (color != null)
			getMendixObject().setValue(context, MemberNames.Color.toString(), color.toString());
		else
			getMendixObject().setValue(context, MemberNames.Color.toString(), null);
	}

	/**
	 * Set value of ColorMode
	 * @param colormode
	 */
	public final iot.proxies.ColorMode getColorMode()
	{
		return getColorMode(getContext());
	}

	/**
	 * @param context
	 * @return value of ColorMode
	 */
	public final iot.proxies.ColorMode getColorMode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ColorMode.toString());
		if (obj == null)
			return null;

		return iot.proxies.ColorMode.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ColorMode
	 * @param colormode
	 */
	public final void setColorMode(iot.proxies.ColorMode colormode)
	{
		setColorMode(getContext(), colormode);
	}

	/**
	 * Set value of ColorMode
	 * @param context
	 * @param colormode
	 */
	public final void setColorMode(com.mendix.systemwideinterfaces.core.IContext context, iot.proxies.ColorMode colormode)
	{
		if (colormode != null)
			getMendixObject().setValue(context, MemberNames.ColorMode.toString(), colormode.toString());
		else
			getMendixObject().setValue(context, MemberNames.ColorMode.toString(), null);
	}

	/**
	 * @return value of LampID
	 */
	public final java.lang.String getLampID()
	{
		return getLampID(getContext());
	}

	/**
	 * @param context
	 * @return value of LampID
	 */
	public final java.lang.String getLampID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LampID.toString());
	}

	/**
	 * Set value of LampID
	 * @param lampid
	 */
	public final void setLampID(java.lang.String lampid)
	{
		setLampID(getContext(), lampid);
	}

	/**
	 * Set value of LampID
	 * @param context
	 * @param lampid
	 */
	public final void setLampID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lampid)
	{
		getMendixObject().setValue(context, MemberNames.LampID.toString(), lampid);
	}

	/**
	 * @return value of Accessory_Room
	 */
	public final iot.proxies.Room getAccessory_Room() throws com.mendix.core.CoreException
	{
		return getAccessory_Room(getContext());
	}

	/**
	 * @param context
	 * @return value of Accessory_Room
	 */
	public final iot.proxies.Room getAccessory_Room(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		iot.proxies.Room result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Accessory_Room.toString());
		if (identifier != null)
			result = iot.proxies.Room.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Accessory_Room
	 * @param accessory_room
	 */
	public final void setAccessory_Room(iot.proxies.Room accessory_room)
	{
		setAccessory_Room(getContext(), accessory_room);
	}

	/**
	 * Set value of Accessory_Room
	 * @param context
	 * @param accessory_room
	 */
	public final void setAccessory_Room(com.mendix.systemwideinterfaces.core.IContext context, iot.proxies.Room accessory_room)
	{
		if (accessory_room == null)
			getMendixObject().setValue(context, MemberNames.Accessory_Room.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Accessory_Room.toString(), accessory_room.getMendixObject().getId());
	}

	/**
	 * @return value of Accessory_Scene
	 */
	public final java.util.List<iot.proxies.Scene> getAccessory_Scene() throws com.mendix.core.CoreException
	{
		return getAccessory_Scene(getContext());
	}

	/**
	 * @param context
	 * @return value of Accessory_Scene
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<iot.proxies.Scene> getAccessory_Scene(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<iot.proxies.Scene> result = new java.util.ArrayList<iot.proxies.Scene>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Accessory_Scene.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(iot.proxies.Scene.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Accessory_Scene
	 * @param accessory_scene
	 */
	public final void setAccessory_Scene(java.util.List<iot.proxies.Scene> accessory_scene)
	{
		setAccessory_Scene(getContext(), accessory_scene);
	}

	/**
	 * Set value of Accessory_Scene
	 * @param context
	 * @param accessory_scene
	 */
	public final void setAccessory_Scene(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<iot.proxies.Scene> accessory_scene)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (iot.proxies.Scene proxyObject : accessory_scene)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Accessory_Scene.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return accessoryMendixObject;
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
			final iot.proxies.Accessory that = (iot.proxies.Accessory) obj;
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
		return "IoT.Accessory";
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
