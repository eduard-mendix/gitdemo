// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package homeautomationconnector.proxies;

public class StateRequestColorModeXY
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject stateRequestColorModeXYMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "HomeAutomationConnector.StateRequestColorModeXY";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		On("On"),
		XY_StateRequestColorModeXY("HomeAutomationConnector.XY_StateRequestColorModeXY");

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

	public StateRequestColorModeXY(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "HomeAutomationConnector.StateRequestColorModeXY"));
	}

	protected StateRequestColorModeXY(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject stateRequestColorModeXYMendixObject)
	{
		if (stateRequestColorModeXYMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("HomeAutomationConnector.StateRequestColorModeXY", stateRequestColorModeXYMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a HomeAutomationConnector.StateRequestColorModeXY");

		this.stateRequestColorModeXYMendixObject = stateRequestColorModeXYMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'StateRequestColorModeXY.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static homeautomationconnector.proxies.StateRequestColorModeXY initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return homeautomationconnector.proxies.StateRequestColorModeXY.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static homeautomationconnector.proxies.StateRequestColorModeXY initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new homeautomationconnector.proxies.StateRequestColorModeXY(context, mendixObject);
	}

	public static homeautomationconnector.proxies.StateRequestColorModeXY load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return homeautomationconnector.proxies.StateRequestColorModeXY.initialize(context, mendixObject);
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
	 * @return value of XY_StateRequestColorModeXY
	 */
	public final homeautomationconnector.proxies.XY getXY_StateRequestColorModeXY() throws com.mendix.core.CoreException
	{
		return getXY_StateRequestColorModeXY(getContext());
	}

	/**
	 * @param context
	 * @return value of XY_StateRequestColorModeXY
	 */
	public final homeautomationconnector.proxies.XY getXY_StateRequestColorModeXY(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		homeautomationconnector.proxies.XY result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.XY_StateRequestColorModeXY.toString());
		if (identifier != null)
			result = homeautomationconnector.proxies.XY.load(context, identifier);
		return result;
	}

	/**
	 * Set value of XY_StateRequestColorModeXY
	 * @param xy_staterequestcolormodexy
	 */
	public final void setXY_StateRequestColorModeXY(homeautomationconnector.proxies.XY xy_staterequestcolormodexy)
	{
		setXY_StateRequestColorModeXY(getContext(), xy_staterequestcolormodexy);
	}

	/**
	 * Set value of XY_StateRequestColorModeXY
	 * @param context
	 * @param xy_staterequestcolormodexy
	 */
	public final void setXY_StateRequestColorModeXY(com.mendix.systemwideinterfaces.core.IContext context, homeautomationconnector.proxies.XY xy_staterequestcolormodexy)
	{
		if (xy_staterequestcolormodexy == null)
			getMendixObject().setValue(context, MemberNames.XY_StateRequestColorModeXY.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.XY_StateRequestColorModeXY.toString(), xy_staterequestcolormodexy.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return stateRequestColorModeXYMendixObject;
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
			final homeautomationconnector.proxies.StateRequestColorModeXY that = (homeautomationconnector.proxies.StateRequestColorModeXY) obj;
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
		return "HomeAutomationConnector.StateRequestColorModeXY";
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
