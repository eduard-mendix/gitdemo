// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package iot.proxies;

public class ColorCharacteristic extends iot.proxies.CharacteristicValue
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "IoT.ColorCharacteristic";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Red("Red"),
		Green("Green"),
		Blue("Blue"),
		Clear("Clear"),
		DateTimeCreated("DateTimeCreated");

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

	public ColorCharacteristic(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "IoT.ColorCharacteristic"));
	}

	protected ColorCharacteristic(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject colorCharacteristicMendixObject)
	{
		super(context, colorCharacteristicMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("IoT.ColorCharacteristic", colorCharacteristicMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a IoT.ColorCharacteristic");
	}

	/**
	 * @deprecated Use 'ColorCharacteristic.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static iot.proxies.ColorCharacteristic initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return iot.proxies.ColorCharacteristic.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static iot.proxies.ColorCharacteristic initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new iot.proxies.ColorCharacteristic(context, mendixObject);
	}

	public static iot.proxies.ColorCharacteristic load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return iot.proxies.ColorCharacteristic.initialize(context, mendixObject);
	}

	public static java.util.List<iot.proxies.ColorCharacteristic> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<iot.proxies.ColorCharacteristic> result = new java.util.ArrayList<iot.proxies.ColorCharacteristic>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//IoT.ColorCharacteristic" + xpathConstraint))
			result.add(iot.proxies.ColorCharacteristic.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Red
	 */
	public final java.lang.Integer getRed()
	{
		return getRed(getContext());
	}

	/**
	 * @param context
	 * @return value of Red
	 */
	public final java.lang.Integer getRed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Red.toString());
	}

	/**
	 * Set value of Red
	 * @param red
	 */
	public final void setRed(java.lang.Integer red)
	{
		setRed(getContext(), red);
	}

	/**
	 * Set value of Red
	 * @param context
	 * @param red
	 */
	public final void setRed(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer red)
	{
		getMendixObject().setValue(context, MemberNames.Red.toString(), red);
	}

	/**
	 * @return value of Green
	 */
	public final java.lang.Integer getGreen()
	{
		return getGreen(getContext());
	}

	/**
	 * @param context
	 * @return value of Green
	 */
	public final java.lang.Integer getGreen(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Green.toString());
	}

	/**
	 * Set value of Green
	 * @param green
	 */
	public final void setGreen(java.lang.Integer green)
	{
		setGreen(getContext(), green);
	}

	/**
	 * Set value of Green
	 * @param context
	 * @param green
	 */
	public final void setGreen(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer green)
	{
		getMendixObject().setValue(context, MemberNames.Green.toString(), green);
	}

	/**
	 * @return value of Blue
	 */
	public final java.lang.Integer getBlue()
	{
		return getBlue(getContext());
	}

	/**
	 * @param context
	 * @return value of Blue
	 */
	public final java.lang.Integer getBlue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Blue.toString());
	}

	/**
	 * Set value of Blue
	 * @param blue
	 */
	public final void setBlue(java.lang.Integer blue)
	{
		setBlue(getContext(), blue);
	}

	/**
	 * Set value of Blue
	 * @param context
	 * @param blue
	 */
	public final void setBlue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer blue)
	{
		getMendixObject().setValue(context, MemberNames.Blue.toString(), blue);
	}

	/**
	 * @return value of Clear
	 */
	public final java.lang.Integer getClear()
	{
		return getClear(getContext());
	}

	/**
	 * @param context
	 * @return value of Clear
	 */
	public final java.lang.Integer getClear(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Clear.toString());
	}

	/**
	 * Set value of Clear
	 * @param clear
	 */
	public final void setClear(java.lang.Integer clear)
	{
		setClear(getContext(), clear);
	}

	/**
	 * Set value of Clear
	 * @param context
	 * @param clear
	 */
	public final void setClear(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer clear)
	{
		getMendixObject().setValue(context, MemberNames.Clear.toString(), clear);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final iot.proxies.ColorCharacteristic that = (iot.proxies.ColorCharacteristic) obj;
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
		return "IoT.ColorCharacteristic";
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
