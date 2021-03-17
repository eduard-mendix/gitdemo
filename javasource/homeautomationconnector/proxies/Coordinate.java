// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package homeautomationconnector.proxies;

public class Coordinate
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject coordinateMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "HomeAutomationConnector.Coordinate";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Value("Value"),
		Coordinate_XY("HomeAutomationConnector.Coordinate_XY");

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

	public Coordinate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "HomeAutomationConnector.Coordinate"));
	}

	protected Coordinate(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject coordinateMendixObject)
	{
		if (coordinateMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("HomeAutomationConnector.Coordinate", coordinateMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a HomeAutomationConnector.Coordinate");

		this.coordinateMendixObject = coordinateMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Coordinate.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static homeautomationconnector.proxies.Coordinate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return homeautomationconnector.proxies.Coordinate.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static homeautomationconnector.proxies.Coordinate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new homeautomationconnector.proxies.Coordinate(context, mendixObject);
	}

	public static homeautomationconnector.proxies.Coordinate load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return homeautomationconnector.proxies.Coordinate.initialize(context, mendixObject);
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
	 * @return value of Value
	 */
	public final java.math.BigDecimal getValue()
	{
		return getValue(getContext());
	}

	/**
	 * @param context
	 * @return value of Value
	 */
	public final java.math.BigDecimal getValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Value.toString());
	}

	/**
	 * Set value of Value
	 * @param value
	 */
	public final void setValue(java.math.BigDecimal value)
	{
		setValue(getContext(), value);
	}

	/**
	 * Set value of Value
	 * @param context
	 * @param value
	 */
	public final void setValue(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal value)
	{
		getMendixObject().setValue(context, MemberNames.Value.toString(), value);
	}

	/**
	 * @return value of Coordinate_XY
	 */
	public final homeautomationconnector.proxies.XY getCoordinate_XY() throws com.mendix.core.CoreException
	{
		return getCoordinate_XY(getContext());
	}

	/**
	 * @param context
	 * @return value of Coordinate_XY
	 */
	public final homeautomationconnector.proxies.XY getCoordinate_XY(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		homeautomationconnector.proxies.XY result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Coordinate_XY.toString());
		if (identifier != null)
			result = homeautomationconnector.proxies.XY.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Coordinate_XY
	 * @param coordinate_xy
	 */
	public final void setCoordinate_XY(homeautomationconnector.proxies.XY coordinate_xy)
	{
		setCoordinate_XY(getContext(), coordinate_xy);
	}

	/**
	 * Set value of Coordinate_XY
	 * @param context
	 * @param coordinate_xy
	 */
	public final void setCoordinate_XY(com.mendix.systemwideinterfaces.core.IContext context, homeautomationconnector.proxies.XY coordinate_xy)
	{
		if (coordinate_xy == null)
			getMendixObject().setValue(context, MemberNames.Coordinate_XY.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Coordinate_XY.toString(), coordinate_xy.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return coordinateMendixObject;
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
			final homeautomationconnector.proxies.Coordinate that = (homeautomationconnector.proxies.Coordinate) obj;
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
		return "HomeAutomationConnector.Coordinate";
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
