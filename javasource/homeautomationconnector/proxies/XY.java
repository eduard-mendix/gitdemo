// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package homeautomationconnector.proxies;

public class XY
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject xYMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "HomeAutomationConnector.XY";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		XY_StateRequestColorModeXY("HomeAutomationConnector.XY_StateRequestColorModeXY"),
		XY_StateRequestAll_XY("HomeAutomationConnector.XY_StateRequestAll_XY");

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

	public XY(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "HomeAutomationConnector.XY"));
	}

	protected XY(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject xYMendixObject)
	{
		if (xYMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("HomeAutomationConnector.XY", xYMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a HomeAutomationConnector.XY");

		this.xYMendixObject = xYMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'XY.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static homeautomationconnector.proxies.XY initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return homeautomationconnector.proxies.XY.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static homeautomationconnector.proxies.XY initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new homeautomationconnector.proxies.XY(context, mendixObject);
	}

	public static homeautomationconnector.proxies.XY load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return homeautomationconnector.proxies.XY.initialize(context, mendixObject);
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
	 * @return value of XY_StateRequestColorModeXY
	 */
	public final homeautomationconnector.proxies.StateRequestColorModeXY getXY_StateRequestColorModeXY() throws com.mendix.core.CoreException
	{
		return getXY_StateRequestColorModeXY(getContext());
	}

	/**
	 * @param context
	 * @return value of XY_StateRequestColorModeXY
	 */
	public final homeautomationconnector.proxies.StateRequestColorModeXY getXY_StateRequestColorModeXY(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		homeautomationconnector.proxies.StateRequestColorModeXY result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.XY_StateRequestColorModeXY.toString());
		if (identifier != null)
			result = homeautomationconnector.proxies.StateRequestColorModeXY.load(context, identifier);
		return result;
	}

	/**
	 * Set value of XY_StateRequestColorModeXY
	 * @param xy_staterequestcolormodexy
	 */
	public final void setXY_StateRequestColorModeXY(homeautomationconnector.proxies.StateRequestColorModeXY xy_staterequestcolormodexy)
	{
		setXY_StateRequestColorModeXY(getContext(), xy_staterequestcolormodexy);
	}

	/**
	 * Set value of XY_StateRequestColorModeXY
	 * @param context
	 * @param xy_staterequestcolormodexy
	 */
	public final void setXY_StateRequestColorModeXY(com.mendix.systemwideinterfaces.core.IContext context, homeautomationconnector.proxies.StateRequestColorModeXY xy_staterequestcolormodexy)
	{
		if (xy_staterequestcolormodexy == null)
			getMendixObject().setValue(context, MemberNames.XY_StateRequestColorModeXY.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.XY_StateRequestColorModeXY.toString(), xy_staterequestcolormodexy.getMendixObject().getId());
	}

	/**
	 * @return value of XY_StateRequestAll_XY
	 */
	public final homeautomationconnector.proxies.StateRequestAll_XY getXY_StateRequestAll_XY() throws com.mendix.core.CoreException
	{
		return getXY_StateRequestAll_XY(getContext());
	}

	/**
	 * @param context
	 * @return value of XY_StateRequestAll_XY
	 */
	public final homeautomationconnector.proxies.StateRequestAll_XY getXY_StateRequestAll_XY(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		homeautomationconnector.proxies.StateRequestAll_XY result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.XY_StateRequestAll_XY.toString());
		if (identifier != null)
			result = homeautomationconnector.proxies.StateRequestAll_XY.load(context, identifier);
		return result;
	}

	/**
	 * Set value of XY_StateRequestAll_XY
	 * @param xy_staterequestall_xy
	 */
	public final void setXY_StateRequestAll_XY(homeautomationconnector.proxies.StateRequestAll_XY xy_staterequestall_xy)
	{
		setXY_StateRequestAll_XY(getContext(), xy_staterequestall_xy);
	}

	/**
	 * Set value of XY_StateRequestAll_XY
	 * @param context
	 * @param xy_staterequestall_xy
	 */
	public final void setXY_StateRequestAll_XY(com.mendix.systemwideinterfaces.core.IContext context, homeautomationconnector.proxies.StateRequestAll_XY xy_staterequestall_xy)
	{
		if (xy_staterequestall_xy == null)
			getMendixObject().setValue(context, MemberNames.XY_StateRequestAll_XY.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.XY_StateRequestAll_XY.toString(), xy_staterequestall_xy.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return xYMendixObject;
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
			final homeautomationconnector.proxies.XY that = (homeautomationconnector.proxies.XY) obj;
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
		return "HomeAutomationConnector.XY";
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
