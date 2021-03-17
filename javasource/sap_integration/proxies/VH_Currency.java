// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sap_integration.proxies;

public class VH_Currency extends sapodataconnector.proxies.OdataObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAP_Integration.VH_Currency";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Waers("Waers"),
		Ltext("Ltext"),
		meta_objectURI("meta_objectURI"),
		meta_etag("meta_etag"),
		OdataObject_ResultInfo("SAPODataConnector.OdataObject_ResultInfo");

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

	public VH_Currency(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAP_Integration.VH_Currency"));
	}

	protected VH_Currency(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vH_CurrencyMendixObject)
	{
		super(context, vH_CurrencyMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_Currency", vH_CurrencyMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAP_Integration.VH_Currency");
	}

	/**
	 * @deprecated Use 'VH_Currency.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sap_integration.proxies.VH_Currency initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sap_integration.proxies.VH_Currency.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sap_integration.proxies.VH_Currency initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sap_integration.proxies.VH_Currency(context, mendixObject);
	}

	public static sap_integration.proxies.VH_Currency load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sap_integration.proxies.VH_Currency.initialize(context, mendixObject);
	}

	/**
	 * @return value of Waers
	 */
	public final java.lang.String getWaers()
	{
		return getWaers(getContext());
	}

	/**
	 * @param context
	 * @return value of Waers
	 */
	public final java.lang.String getWaers(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Waers.toString());
	}

	/**
	 * Set value of Waers
	 * @param waers
	 */
	public final void setWaers(java.lang.String waers)
	{
		setWaers(getContext(), waers);
	}

	/**
	 * Set value of Waers
	 * @param context
	 * @param waers
	 */
	public final void setWaers(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String waers)
	{
		getMendixObject().setValue(context, MemberNames.Waers.toString(), waers);
	}

	/**
	 * @return value of Ltext
	 */
	public final java.lang.String getLtext()
	{
		return getLtext(getContext());
	}

	/**
	 * @param context
	 * @return value of Ltext
	 */
	public final java.lang.String getLtext(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Ltext.toString());
	}

	/**
	 * Set value of Ltext
	 * @param ltext
	 */
	public final void setLtext(java.lang.String ltext)
	{
		setLtext(getContext(), ltext);
	}

	/**
	 * Set value of Ltext
	 * @param context
	 * @param ltext
	 */
	public final void setLtext(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ltext)
	{
		getMendixObject().setValue(context, MemberNames.Ltext.toString(), ltext);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sap_integration.proxies.VH_Currency that = (sap_integration.proxies.VH_Currency) obj;
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
		return "SAP_Integration.VH_Currency";
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