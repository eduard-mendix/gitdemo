// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package iot.proxies;

public class AccessorySceneSelect
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject accessorySceneSelectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "IoT.AccessorySceneSelect";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Selected("Selected"),
		Active("Active"),
		Brightness("Brightness"),
		Accessory("Accessory"),
		ColorMode("ColorMode"),
		Colour("Colour"),
		ColourTemperature("ColourTemperature"),
		Alert("Alert"),
		AccessorySelect("IoT.AccessorySelect"),
		SceneSelect("IoT.SceneSelect");

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

	public AccessorySceneSelect(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "IoT.AccessorySceneSelect"));
	}

	protected AccessorySceneSelect(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject accessorySceneSelectMendixObject)
	{
		if (accessorySceneSelectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("IoT.AccessorySceneSelect", accessorySceneSelectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a IoT.AccessorySceneSelect");

		this.accessorySceneSelectMendixObject = accessorySceneSelectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AccessorySceneSelect.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static iot.proxies.AccessorySceneSelect initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return iot.proxies.AccessorySceneSelect.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static iot.proxies.AccessorySceneSelect initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new iot.proxies.AccessorySceneSelect(context, mendixObject);
	}

	public static iot.proxies.AccessorySceneSelect load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return iot.proxies.AccessorySceneSelect.initialize(context, mendixObject);
	}

	public static java.util.List<iot.proxies.AccessorySceneSelect> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<iot.proxies.AccessorySceneSelect> result = new java.util.ArrayList<iot.proxies.AccessorySceneSelect>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//IoT.AccessorySceneSelect" + xpathConstraint))
			result.add(iot.proxies.AccessorySceneSelect.initialize(context, obj));
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
	 * @return value of Selected
	 */
	public final java.lang.Boolean getSelected()
	{
		return getSelected(getContext());
	}

	/**
	 * @param context
	 * @return value of Selected
	 */
	public final java.lang.Boolean getSelected(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Selected.toString());
	}

	/**
	 * Set value of Selected
	 * @param selected
	 */
	public final void setSelected(java.lang.Boolean selected)
	{
		setSelected(getContext(), selected);
	}

	/**
	 * Set value of Selected
	 * @param context
	 * @param selected
	 */
	public final void setSelected(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean selected)
	{
		getMendixObject().setValue(context, MemberNames.Selected.toString(), selected);
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
	 * Set value of Colour
	 * @param colour
	 */
	public final homeautomationconnector.proxies.Color getColour()
	{
		return getColour(getContext());
	}

	/**
	 * @param context
	 * @return value of Colour
	 */
	public final homeautomationconnector.proxies.Color getColour(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Colour.toString());
		if (obj == null)
			return null;

		return homeautomationconnector.proxies.Color.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Colour
	 * @param colour
	 */
	public final void setColour(homeautomationconnector.proxies.Color colour)
	{
		setColour(getContext(), colour);
	}

	/**
	 * Set value of Colour
	 * @param context
	 * @param colour
	 */
	public final void setColour(com.mendix.systemwideinterfaces.core.IContext context, homeautomationconnector.proxies.Color colour)
	{
		if (colour != null)
			getMendixObject().setValue(context, MemberNames.Colour.toString(), colour.toString());
		else
			getMendixObject().setValue(context, MemberNames.Colour.toString(), null);
	}

	/**
	 * Set value of ColourTemperature
	 * @param colourtemperature
	 */
	public final homeautomationconnector.proxies.ColorTemperature getColourTemperature()
	{
		return getColourTemperature(getContext());
	}

	/**
	 * @param context
	 * @return value of ColourTemperature
	 */
	public final homeautomationconnector.proxies.ColorTemperature getColourTemperature(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ColourTemperature.toString());
		if (obj == null)
			return null;

		return homeautomationconnector.proxies.ColorTemperature.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ColourTemperature
	 * @param colourtemperature
	 */
	public final void setColourTemperature(homeautomationconnector.proxies.ColorTemperature colourtemperature)
	{
		setColourTemperature(getContext(), colourtemperature);
	}

	/**
	 * Set value of ColourTemperature
	 * @param context
	 * @param colourtemperature
	 */
	public final void setColourTemperature(com.mendix.systemwideinterfaces.core.IContext context, homeautomationconnector.proxies.ColorTemperature colourtemperature)
	{
		if (colourtemperature != null)
			getMendixObject().setValue(context, MemberNames.ColourTemperature.toString(), colourtemperature.toString());
		else
			getMendixObject().setValue(context, MemberNames.ColourTemperature.toString(), null);
	}

	/**
	 * Set value of Alert
	 * @param alert
	 */
	public final homeautomationconnector.proxies.alert getAlert()
	{
		return getAlert(getContext());
	}

	/**
	 * @param context
	 * @return value of Alert
	 */
	public final homeautomationconnector.proxies.alert getAlert(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Alert.toString());
		if (obj == null)
			return null;

		return homeautomationconnector.proxies.alert.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Alert
	 * @param alert
	 */
	public final void setAlert(homeautomationconnector.proxies.alert alert)
	{
		setAlert(getContext(), alert);
	}

	/**
	 * Set value of Alert
	 * @param context
	 * @param alert
	 */
	public final void setAlert(com.mendix.systemwideinterfaces.core.IContext context, homeautomationconnector.proxies.alert alert)
	{
		if (alert != null)
			getMendixObject().setValue(context, MemberNames.Alert.toString(), alert.toString());
		else
			getMendixObject().setValue(context, MemberNames.Alert.toString(), null);
	}

	/**
	 * @return value of AccessorySelect
	 */
	public final iot.proxies.Accessory getAccessorySelect() throws com.mendix.core.CoreException
	{
		return getAccessorySelect(getContext());
	}

	/**
	 * @param context
	 * @return value of AccessorySelect
	 */
	public final iot.proxies.Accessory getAccessorySelect(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		iot.proxies.Accessory result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AccessorySelect.toString());
		if (identifier != null)
			result = iot.proxies.Accessory.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AccessorySelect
	 * @param accessoryselect
	 */
	public final void setAccessorySelect(iot.proxies.Accessory accessoryselect)
	{
		setAccessorySelect(getContext(), accessoryselect);
	}

	/**
	 * Set value of AccessorySelect
	 * @param context
	 * @param accessoryselect
	 */
	public final void setAccessorySelect(com.mendix.systemwideinterfaces.core.IContext context, iot.proxies.Accessory accessoryselect)
	{
		if (accessoryselect == null)
			getMendixObject().setValue(context, MemberNames.AccessorySelect.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AccessorySelect.toString(), accessoryselect.getMendixObject().getId());
	}

	/**
	 * @return value of SceneSelect
	 */
	public final iot.proxies.Scene getSceneSelect() throws com.mendix.core.CoreException
	{
		return getSceneSelect(getContext());
	}

	/**
	 * @param context
	 * @return value of SceneSelect
	 */
	public final iot.proxies.Scene getSceneSelect(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		iot.proxies.Scene result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SceneSelect.toString());
		if (identifier != null)
			result = iot.proxies.Scene.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SceneSelect
	 * @param sceneselect
	 */
	public final void setSceneSelect(iot.proxies.Scene sceneselect)
	{
		setSceneSelect(getContext(), sceneselect);
	}

	/**
	 * Set value of SceneSelect
	 * @param context
	 * @param sceneselect
	 */
	public final void setSceneSelect(com.mendix.systemwideinterfaces.core.IContext context, iot.proxies.Scene sceneselect)
	{
		if (sceneselect == null)
			getMendixObject().setValue(context, MemberNames.SceneSelect.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SceneSelect.toString(), sceneselect.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return accessorySceneSelectMendixObject;
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
			final iot.proxies.AccessorySceneSelect that = (iot.proxies.AccessorySceneSelect) obj;
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
		return "IoT.AccessorySceneSelect";
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
