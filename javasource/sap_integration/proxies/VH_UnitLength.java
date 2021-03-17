// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sap_integration.proxies;

public class VH_UnitLength extends sapodataconnector.proxies.OdataObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAP_Integration.VH_UnitLength";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Msehi("Msehi"),
		Msehl("Msehl"),
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

	public VH_UnitLength(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAP_Integration.VH_UnitLength"));
	}

	protected VH_UnitLength(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vH_UnitLengthMendixObject)
	{
		super(context, vH_UnitLengthMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_UnitLength", vH_UnitLengthMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAP_Integration.VH_UnitLength");
	}

	/**
	 * @deprecated Use 'VH_UnitLength.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sap_integration.proxies.VH_UnitLength initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sap_integration.proxies.VH_UnitLength.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sap_integration.proxies.VH_UnitLength initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sap_integration.proxies.VH_UnitLength(context, mendixObject);
	}

	public static sap_integration.proxies.VH_UnitLength load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sap_integration.proxies.VH_UnitLength.initialize(context, mendixObject);
	}

	/**
	 * @return value of Msehi
	 */
	public final java.lang.String getMsehi()
	{
		return getMsehi(getContext());
	}

	/**
	 * @param context
	 * @return value of Msehi
	 */
	public final java.lang.String getMsehi(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Msehi.toString());
	}

	/**
	 * Set value of Msehi
	 * @param msehi
	 */
	public final void setMsehi(java.lang.String msehi)
	{
		setMsehi(getContext(), msehi);
	}

	/**
	 * Set value of Msehi
	 * @param context
	 * @param msehi
	 */
	public final void setMsehi(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String msehi)
	{
		getMendixObject().setValue(context, MemberNames.Msehi.toString(), msehi);
	}

	/**
	 * @return value of Msehl
	 */
	public final java.lang.String getMsehl()
	{
		return getMsehl(getContext());
	}

	/**
	 * @param context
	 * @return value of Msehl
	 */
	public final java.lang.String getMsehl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Msehl.toString());
	}

	/**
	 * Set value of Msehl
	 * @param msehl
	 */
	public final void setMsehl(java.lang.String msehl)
	{
		setMsehl(getContext(), msehl);
	}

	/**
	 * Set value of Msehl
	 * @param context
	 * @param msehl
	 */
	public final void setMsehl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String msehl)
	{
		getMendixObject().setValue(context, MemberNames.Msehl.toString(), msehl);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sap_integration.proxies.VH_UnitLength that = (sap_integration.proxies.VH_UnitLength) obj;
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
		return "SAP_Integration.VH_UnitLength";
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
