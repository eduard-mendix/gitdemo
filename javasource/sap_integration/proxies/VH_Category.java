// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sap_integration.proxies;

public class VH_Category extends sapodataconnector.proxies.OdataObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAP_Integration.VH_Category";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Category("Category"),
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

	public VH_Category(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAP_Integration.VH_Category"));
	}

	protected VH_Category(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vH_CategoryMendixObject)
	{
		super(context, vH_CategoryMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SAP_Integration.VH_Category", vH_CategoryMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAP_Integration.VH_Category");
	}

	/**
	 * @deprecated Use 'VH_Category.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sap_integration.proxies.VH_Category initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sap_integration.proxies.VH_Category.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sap_integration.proxies.VH_Category initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sap_integration.proxies.VH_Category(context, mendixObject);
	}

	public static sap_integration.proxies.VH_Category load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sap_integration.proxies.VH_Category.initialize(context, mendixObject);
	}

	/**
	 * @return value of Category
	 */
	public final java.lang.String getCategory()
	{
		return getCategory(getContext());
	}

	/**
	 * @param context
	 * @return value of Category
	 */
	public final java.lang.String getCategory(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Category.toString());
	}

	/**
	 * Set value of Category
	 * @param category
	 */
	public final void setCategory(java.lang.String category)
	{
		setCategory(getContext(), category);
	}

	/**
	 * Set value of Category
	 * @param context
	 * @param category
	 */
	public final void setCategory(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String category)
	{
		getMendixObject().setValue(context, MemberNames.Category.toString(), category);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sap_integration.proxies.VH_Category that = (sap_integration.proxies.VH_Category) obj;
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
		return "SAP_Integration.VH_Category";
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
