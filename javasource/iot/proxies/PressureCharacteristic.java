// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package iot.proxies;

public class PressureCharacteristic extends iot.proxies.CharacteristicValue
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "IoT.PressureCharacteristic";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Pressure("Pressure"),
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

	public PressureCharacteristic(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "IoT.PressureCharacteristic"));
	}

	protected PressureCharacteristic(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject pressureCharacteristicMendixObject)
	{
		super(context, pressureCharacteristicMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("IoT.PressureCharacteristic", pressureCharacteristicMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a IoT.PressureCharacteristic");
	}

	/**
	 * @deprecated Use 'PressureCharacteristic.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static iot.proxies.PressureCharacteristic initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return iot.proxies.PressureCharacteristic.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static iot.proxies.PressureCharacteristic initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new iot.proxies.PressureCharacteristic(context, mendixObject);
	}

	public static iot.proxies.PressureCharacteristic load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return iot.proxies.PressureCharacteristic.initialize(context, mendixObject);
	}

	public static java.util.List<iot.proxies.PressureCharacteristic> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<iot.proxies.PressureCharacteristic> result = new java.util.ArrayList<iot.proxies.PressureCharacteristic>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//IoT.PressureCharacteristic" + xpathConstraint))
			result.add(iot.proxies.PressureCharacteristic.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Pressure
	 */
	public final java.math.BigDecimal getPressure()
	{
		return getPressure(getContext());
	}

	/**
	 * @param context
	 * @return value of Pressure
	 */
	public final java.math.BigDecimal getPressure(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Pressure.toString());
	}

	/**
	 * Set value of Pressure
	 * @param pressure
	 */
	public final void setPressure(java.math.BigDecimal pressure)
	{
		setPressure(getContext(), pressure);
	}

	/**
	 * Set value of Pressure
	 * @param context
	 * @param pressure
	 */
	public final void setPressure(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal pressure)
	{
		getMendixObject().setValue(context, MemberNames.Pressure.toString(), pressure);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final iot.proxies.PressureCharacteristic that = (iot.proxies.PressureCharacteristic) obj;
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
		return "IoT.PressureCharacteristic";
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
