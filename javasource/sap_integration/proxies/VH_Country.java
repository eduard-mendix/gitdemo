// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sap_integration.proxies;

public class VH_Country extends sapodataconnector.proxies.OdataObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAP_Integration.VH_Country";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Land1("Land1"),
		Landx("Landx"),
		Natio("Natio"),
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

	public VH_Country(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAP_Integration.VH_Country"));
	}

	protected VH_Country(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vH_CountryMendixObject)
	{
		super(context, vH_CountryMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_Country", vH_CountryMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAP_Integration.VH_Country");
	}

	/**
	 * @deprecated Use 'VH_Country.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sap_integration.proxies.VH_Country initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sap_integration.proxies.VH_Country.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sap_integration.proxies.VH_Country initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sap_integration.proxies.VH_Country(context, mendixObject);
	}

	public static sap_integration.proxies.VH_Country load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sap_integration.proxies.VH_Country.initialize(context, mendixObject);
	}

	/**
	 * @return value of Land1
	 */
	public final java.lang.String getLand1()
	{
		return getLand1(getContext());
	}

	/**
	 * @param context
	 * @return value of Land1
	 */
	public final java.lang.String getLand1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Land1.toString());
	}

	/**
	 * Set value of Land1
	 * @param land1
	 */
	public final void setLand1(java.lang.String land1)
	{
		setLand1(getContext(), land1);
	}

	/**
	 * Set value of Land1
	 * @param context
	 * @param land1
	 */
	public final void setLand1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String land1)
	{
		getMendixObject().setValue(context, MemberNames.Land1.toString(), land1);
	}

	/**
	 * @return value of Landx
	 */
	public final java.lang.String getLandx()
	{
		return getLandx(getContext());
	}

	/**
	 * @param context
	 * @return value of Landx
	 */
	public final java.lang.String getLandx(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Landx.toString());
	}

	/**
	 * Set value of Landx
	 * @param landx
	 */
	public final void setLandx(java.lang.String landx)
	{
		setLandx(getContext(), landx);
	}

	/**
	 * Set value of Landx
	 * @param context
	 * @param landx
	 */
	public final void setLandx(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String landx)
	{
		getMendixObject().setValue(context, MemberNames.Landx.toString(), landx);
	}

	/**
	 * @return value of Natio
	 */
	public final java.lang.String getNatio()
	{
		return getNatio(getContext());
	}

	/**
	 * @param context
	 * @return value of Natio
	 */
	public final java.lang.String getNatio(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Natio.toString());
	}

	/**
	 * Set value of Natio
	 * @param natio
	 */
	public final void setNatio(java.lang.String natio)
	{
		setNatio(getContext(), natio);
	}

	/**
	 * Set value of Natio
	 * @param context
	 * @param natio
	 */
	public final void setNatio(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String natio)
	{
		getMendixObject().setValue(context, MemberNames.Natio.toString(), natio);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sap_integration.proxies.VH_Country that = (sap_integration.proxies.VH_Country) obj;
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
		return "SAP_Integration.VH_Country";
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
