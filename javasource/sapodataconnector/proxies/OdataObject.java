// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sapodataconnector.proxies;

public class OdataObject
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject odataObjectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAPODataConnector.OdataObject";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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

	public OdataObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAPODataConnector.OdataObject"));
	}

	protected OdataObject(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject odataObjectMendixObject)
	{
		if (odataObjectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SAPODataConnector.OdataObject", odataObjectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAPODataConnector.OdataObject");

		this.odataObjectMendixObject = odataObjectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'OdataObject.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sapodataconnector.proxies.OdataObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sapodataconnector.proxies.OdataObject.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sapodataconnector.proxies.OdataObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.BusinessPartner", mendixObject.getType()))
			return sap_integration.proxies.BusinessPartner.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.Contact", mendixObject.getType()))
			return sap_integration.proxies.Contact.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.Product", mendixObject.getType()))
			return sap_integration.proxies.Product.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.SalesOrder", mendixObject.getType()))
			return sap_integration.proxies.SalesOrder.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.SalesOrderLineItem", mendixObject.getType()))
			return sap_integration.proxies.SalesOrderLineItem.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_AddressType", mendixObject.getType()))
			return sap_integration.proxies.VH_AddressType.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_BPRole", mendixObject.getType()))
			return sap_integration.proxies.VH_BPRole.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_Category", mendixObject.getType()))
			return sap_integration.proxies.VH_Category.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_Country", mendixObject.getType()))
			return sap_integration.proxies.VH_Country.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_Currency", mendixObject.getType()))
			return sap_integration.proxies.VH_Currency.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_Language", mendixObject.getType()))
			return sap_integration.proxies.VH_Language.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_ProductTypeCode", mendixObject.getType()))
			return sap_integration.proxies.VH_ProductTypeCode.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_Sex", mendixObject.getType()))
			return sap_integration.proxies.VH_Sex.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_UnitLength", mendixObject.getType()))
			return sap_integration.proxies.VH_UnitLength.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_UnitQuantity", mendixObject.getType()))
			return sap_integration.proxies.VH_UnitQuantity.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_UnitWeight", mendixObject.getType()))
			return sap_integration.proxies.VH_UnitWeight.initialize(context, mendixObject);

		return new sapodataconnector.proxies.OdataObject(context, mendixObject);
	}

	public static sapodataconnector.proxies.OdataObject load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sapodataconnector.proxies.OdataObject.initialize(context, mendixObject);
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
	 * @return value of meta_objectURI
	 */
	public final java.lang.String getmeta_objectURI()
	{
		return getmeta_objectURI(getContext());
	}

	/**
	 * @param context
	 * @return value of meta_objectURI
	 */
	public final java.lang.String getmeta_objectURI(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.meta_objectURI.toString());
	}

	/**
	 * Set value of meta_objectURI
	 * @param meta_objecturi
	 */
	public final void setmeta_objectURI(java.lang.String meta_objecturi)
	{
		setmeta_objectURI(getContext(), meta_objecturi);
	}

	/**
	 * Set value of meta_objectURI
	 * @param context
	 * @param meta_objecturi
	 */
	public final void setmeta_objectURI(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String meta_objecturi)
	{
		getMendixObject().setValue(context, MemberNames.meta_objectURI.toString(), meta_objecturi);
	}

	/**
	 * @return value of meta_etag
	 */
	public final java.lang.String getmeta_etag()
	{
		return getmeta_etag(getContext());
	}

	/**
	 * @param context
	 * @return value of meta_etag
	 */
	public final java.lang.String getmeta_etag(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.meta_etag.toString());
	}

	/**
	 * Set value of meta_etag
	 * @param meta_etag
	 */
	public final void setmeta_etag(java.lang.String meta_etag)
	{
		setmeta_etag(getContext(), meta_etag);
	}

	/**
	 * Set value of meta_etag
	 * @param context
	 * @param meta_etag
	 */
	public final void setmeta_etag(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String meta_etag)
	{
		getMendixObject().setValue(context, MemberNames.meta_etag.toString(), meta_etag);
	}

	/**
	 * @return value of OdataObject_ResultInfo
	 */
	public final sapodataconnector.proxies.ResultInfo getOdataObject_ResultInfo() throws com.mendix.core.CoreException
	{
		return getOdataObject_ResultInfo(getContext());
	}

	/**
	 * @param context
	 * @return value of OdataObject_ResultInfo
	 */
	public final sapodataconnector.proxies.ResultInfo getOdataObject_ResultInfo(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sapodataconnector.proxies.ResultInfo result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OdataObject_ResultInfo.toString());
		if (identifier != null)
			result = sapodataconnector.proxies.ResultInfo.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OdataObject_ResultInfo
	 * @param odataobject_resultinfo
	 */
	public final void setOdataObject_ResultInfo(sapodataconnector.proxies.ResultInfo odataobject_resultinfo)
	{
		setOdataObject_ResultInfo(getContext(), odataobject_resultinfo);
	}

	/**
	 * Set value of OdataObject_ResultInfo
	 * @param context
	 * @param odataobject_resultinfo
	 */
	public final void setOdataObject_ResultInfo(com.mendix.systemwideinterfaces.core.IContext context, sapodataconnector.proxies.ResultInfo odataobject_resultinfo)
	{
		if (odataobject_resultinfo == null)
			getMendixObject().setValue(context, MemberNames.OdataObject_ResultInfo.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OdataObject_ResultInfo.toString(), odataobject_resultinfo.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return odataObjectMendixObject;
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
			final sapodataconnector.proxies.OdataObject that = (sapodataconnector.proxies.OdataObject) obj;
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
		return "SAPODataConnector.OdataObject";
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
