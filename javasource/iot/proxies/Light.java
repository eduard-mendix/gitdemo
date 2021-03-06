// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package iot.proxies;

public class Light
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject lightMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "IoT.Light";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Hascolor("Hascolor"),
		Manufacturername("Manufacturername"),
		Modelid("Modelid"),
		Name("Name"),
		_id("_id"),
		Uniqueid("Uniqueid"),
		Ct("Ct"),
		Alert("Alert"),
		Bri("Bri"),
		Colormode("Colormode"),
		Reachable("Reachable"),
		On("On"),
		Light_Root("IoT.Light_Root");

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

	public Light(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "IoT.Light"));
	}

	protected Light(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject lightMendixObject)
	{
		if (lightMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("IoT.Light", lightMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a IoT.Light");

		this.lightMendixObject = lightMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Light.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static iot.proxies.Light initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return iot.proxies.Light.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static iot.proxies.Light initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new iot.proxies.Light(context, mendixObject);
	}

	public static iot.proxies.Light load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return iot.proxies.Light.initialize(context, mendixObject);
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
	 * @return value of Hascolor
	 */
	public final java.lang.Boolean getHascolor()
	{
		return getHascolor(getContext());
	}

	/**
	 * @param context
	 * @return value of Hascolor
	 */
	public final java.lang.Boolean getHascolor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Hascolor.toString());
	}

	/**
	 * Set value of Hascolor
	 * @param hascolor
	 */
	public final void setHascolor(java.lang.Boolean hascolor)
	{
		setHascolor(getContext(), hascolor);
	}

	/**
	 * Set value of Hascolor
	 * @param context
	 * @param hascolor
	 */
	public final void setHascolor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hascolor)
	{
		getMendixObject().setValue(context, MemberNames.Hascolor.toString(), hascolor);
	}

	/**
	 * @return value of Manufacturername
	 */
	public final java.lang.String getManufacturername()
	{
		return getManufacturername(getContext());
	}

	/**
	 * @param context
	 * @return value of Manufacturername
	 */
	public final java.lang.String getManufacturername(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Manufacturername.toString());
	}

	/**
	 * Set value of Manufacturername
	 * @param manufacturername
	 */
	public final void setManufacturername(java.lang.String manufacturername)
	{
		setManufacturername(getContext(), manufacturername);
	}

	/**
	 * Set value of Manufacturername
	 * @param context
	 * @param manufacturername
	 */
	public final void setManufacturername(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String manufacturername)
	{
		getMendixObject().setValue(context, MemberNames.Manufacturername.toString(), manufacturername);
	}

	/**
	 * @return value of Modelid
	 */
	public final java.lang.String getModelid()
	{
		return getModelid(getContext());
	}

	/**
	 * @param context
	 * @return value of Modelid
	 */
	public final java.lang.String getModelid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Modelid.toString());
	}

	/**
	 * Set value of Modelid
	 * @param modelid
	 */
	public final void setModelid(java.lang.String modelid)
	{
		setModelid(getContext(), modelid);
	}

	/**
	 * Set value of Modelid
	 * @param context
	 * @param modelid
	 */
	public final void setModelid(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String modelid)
	{
		getMendixObject().setValue(context, MemberNames.Modelid.toString(), modelid);
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
	 * @return value of _id
	 */
	public final java.lang.String get_id()
	{
		return get_id(getContext());
	}

	/**
	 * @param context
	 * @return value of _id
	 */
	public final java.lang.String get_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._id.toString());
	}

	/**
	 * Set value of _id
	 * @param _id
	 */
	public final void set_id(java.lang.String _id)
	{
		set_id(getContext(), _id);
	}

	/**
	 * Set value of _id
	 * @param context
	 * @param _id
	 */
	public final void set_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _id)
	{
		getMendixObject().setValue(context, MemberNames._id.toString(), _id);
	}

	/**
	 * @return value of Uniqueid
	 */
	public final java.lang.String getUniqueid()
	{
		return getUniqueid(getContext());
	}

	/**
	 * @param context
	 * @return value of Uniqueid
	 */
	public final java.lang.String getUniqueid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Uniqueid.toString());
	}

	/**
	 * Set value of Uniqueid
	 * @param uniqueid
	 */
	public final void setUniqueid(java.lang.String uniqueid)
	{
		setUniqueid(getContext(), uniqueid);
	}

	/**
	 * Set value of Uniqueid
	 * @param context
	 * @param uniqueid
	 */
	public final void setUniqueid(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String uniqueid)
	{
		getMendixObject().setValue(context, MemberNames.Uniqueid.toString(), uniqueid);
	}

	/**
	 * @return value of Ct
	 */
	public final java.lang.Integer getCt()
	{
		return getCt(getContext());
	}

	/**
	 * @param context
	 * @return value of Ct
	 */
	public final java.lang.Integer getCt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Ct.toString());
	}

	/**
	 * Set value of Ct
	 * @param ct
	 */
	public final void setCt(java.lang.Integer ct)
	{
		setCt(getContext(), ct);
	}

	/**
	 * Set value of Ct
	 * @param context
	 * @param ct
	 */
	public final void setCt(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer ct)
	{
		getMendixObject().setValue(context, MemberNames.Ct.toString(), ct);
	}

	/**
	 * @return value of Alert
	 */
	public final java.lang.String getAlert()
	{
		return getAlert(getContext());
	}

	/**
	 * @param context
	 * @return value of Alert
	 */
	public final java.lang.String getAlert(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Alert.toString());
	}

	/**
	 * Set value of Alert
	 * @param alert
	 */
	public final void setAlert(java.lang.String alert)
	{
		setAlert(getContext(), alert);
	}

	/**
	 * Set value of Alert
	 * @param context
	 * @param alert
	 */
	public final void setAlert(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String alert)
	{
		getMendixObject().setValue(context, MemberNames.Alert.toString(), alert);
	}

	/**
	 * @return value of Bri
	 */
	public final java.lang.Integer getBri()
	{
		return getBri(getContext());
	}

	/**
	 * @param context
	 * @return value of Bri
	 */
	public final java.lang.Integer getBri(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Bri.toString());
	}

	/**
	 * Set value of Bri
	 * @param bri
	 */
	public final void setBri(java.lang.Integer bri)
	{
		setBri(getContext(), bri);
	}

	/**
	 * Set value of Bri
	 * @param context
	 * @param bri
	 */
	public final void setBri(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer bri)
	{
		getMendixObject().setValue(context, MemberNames.Bri.toString(), bri);
	}

	/**
	 * @return value of Colormode
	 */
	public final java.lang.String getColormode()
	{
		return getColormode(getContext());
	}

	/**
	 * @param context
	 * @return value of Colormode
	 */
	public final java.lang.String getColormode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Colormode.toString());
	}

	/**
	 * Set value of Colormode
	 * @param colormode
	 */
	public final void setColormode(java.lang.String colormode)
	{
		setColormode(getContext(), colormode);
	}

	/**
	 * Set value of Colormode
	 * @param context
	 * @param colormode
	 */
	public final void setColormode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String colormode)
	{
		getMendixObject().setValue(context, MemberNames.Colormode.toString(), colormode);
	}

	/**
	 * @return value of Reachable
	 */
	public final java.lang.Boolean getReachable()
	{
		return getReachable(getContext());
	}

	/**
	 * @param context
	 * @return value of Reachable
	 */
	public final java.lang.Boolean getReachable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Reachable.toString());
	}

	/**
	 * Set value of Reachable
	 * @param reachable
	 */
	public final void setReachable(java.lang.Boolean reachable)
	{
		setReachable(getContext(), reachable);
	}

	/**
	 * Set value of Reachable
	 * @param context
	 * @param reachable
	 */
	public final void setReachable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean reachable)
	{
		getMendixObject().setValue(context, MemberNames.Reachable.toString(), reachable);
	}

	/**
	 * @return value of On
	 */
	public final java.lang.Boolean getOn()
	{
		return getOn(getContext());
	}

	/**
	 * @param context
	 * @return value of On
	 */
	public final java.lang.Boolean getOn(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.On.toString());
	}

	/**
	 * Set value of On
	 * @param on
	 */
	public final void setOn(java.lang.Boolean on)
	{
		setOn(getContext(), on);
	}

	/**
	 * Set value of On
	 * @param context
	 * @param on
	 */
	public final void setOn(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean on)
	{
		getMendixObject().setValue(context, MemberNames.On.toString(), on);
	}

	/**
	 * @return value of Light_Root
	 */
	public final iot.proxies.Root getLight_Root() throws com.mendix.core.CoreException
	{
		return getLight_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Light_Root
	 */
	public final iot.proxies.Root getLight_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		iot.proxies.Root result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Light_Root.toString());
		if (identifier != null)
			result = iot.proxies.Root.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Light_Root
	 * @param light_root
	 */
	public final void setLight_Root(iot.proxies.Root light_root)
	{
		setLight_Root(getContext(), light_root);
	}

	/**
	 * Set value of Light_Root
	 * @param context
	 * @param light_root
	 */
	public final void setLight_Root(com.mendix.systemwideinterfaces.core.IContext context, iot.proxies.Root light_root)
	{
		if (light_root == null)
			getMendixObject().setValue(context, MemberNames.Light_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Light_Root.toString(), light_root.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return lightMendixObject;
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
			final iot.proxies.Light that = (iot.proxies.Light) obj;
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
		return "IoT.Light";
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
