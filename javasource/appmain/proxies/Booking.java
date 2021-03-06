// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package appmain.proxies;

public class Booking
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject bookingMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AppMain.Booking";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		from_date("from_date"),
		to_date("to_date");

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

	public Booking(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AppMain.Booking"));
	}

	protected Booking(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject bookingMendixObject)
	{
		if (bookingMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AppMain.Booking", bookingMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AppMain.Booking");

		this.bookingMendixObject = bookingMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Booking.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static appmain.proxies.Booking initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return appmain.proxies.Booking.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static appmain.proxies.Booking initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new appmain.proxies.Booking(context, mendixObject);
	}

	public static appmain.proxies.Booking load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return appmain.proxies.Booking.initialize(context, mendixObject);
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
	 * @return value of from_date
	 */
	public final java.util.Date getfrom_date()
	{
		return getfrom_date(getContext());
	}

	/**
	 * @param context
	 * @return value of from_date
	 */
	public final java.util.Date getfrom_date(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.from_date.toString());
	}

	/**
	 * Set value of from_date
	 * @param from_date
	 */
	public final void setfrom_date(java.util.Date from_date)
	{
		setfrom_date(getContext(), from_date);
	}

	/**
	 * Set value of from_date
	 * @param context
	 * @param from_date
	 */
	public final void setfrom_date(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date from_date)
	{
		getMendixObject().setValue(context, MemberNames.from_date.toString(), from_date);
	}

	/**
	 * @return value of to_date
	 */
	public final java.util.Date getto_date()
	{
		return getto_date(getContext());
	}

	/**
	 * @param context
	 * @return value of to_date
	 */
	public final java.util.Date getto_date(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.to_date.toString());
	}

	/**
	 * Set value of to_date
	 * @param to_date
	 */
	public final void setto_date(java.util.Date to_date)
	{
		setto_date(getContext(), to_date);
	}

	/**
	 * Set value of to_date
	 * @param context
	 * @param to_date
	 */
	public final void setto_date(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date to_date)
	{
		getMendixObject().setValue(context, MemberNames.to_date.toString(), to_date);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return bookingMendixObject;
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
			final appmain.proxies.Booking that = (appmain.proxies.Booking) obj;
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
		return "AppMain.Booking";
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
