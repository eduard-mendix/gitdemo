// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesforce_connector.proxies;

public class Lead extends salesforce_connector.proxies.SObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Salesforce_Connector.Lead";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		IsDeleted("IsDeleted"),
		FirstName("FirstName"),
		LastName("LastName"),
		Title("Title"),
		Company("Company"),
		Activateable("Activateable"),
		Createable("Createable"),
		Custom("Custom"),
		CustomSetting("CustomSetting"),
		Deletable("Deletable"),
		DeprecatedAndHidden("DeprecatedAndHidden"),
		FeedEnabled("FeedEnabled"),
		HasSubtypes("HasSubtypes"),
		IsSubtype("IsSubtype"),
		Label("Label"),
		LabelPlural("LabelPlural"),
		Layoutable("Layoutable"),
		Mergeable("Mergeable"),
		MruEnabled("MruEnabled"),
		SObjectName("SObjectName"),
		Queryable("Queryable"),
		Replicateable("Replicateable"),
		Retrieveable("Retrieveable"),
		Searchable("Searchable"),
		Triggerable("Triggerable"),
		Undeletable("Undeletable"),
		Updateable("Updateable"),
		KeyPrefix("KeyPrefix"),
		_Id("_Id"),
		Name("Name"),
		LastModifiedDate("LastModifiedDate"),
		LastModifiedById("LastModifiedById"),
		_CreatedDate("_CreatedDate"),
		CreatedById("CreatedById"),
		Lead_Records("Salesforce_Connector.Lead_Records"),
		Urls_SObject("Salesforce_Connector.Urls_SObject"),
		SObject_Query("Salesforce_Connector.SObject_Query"),
		Attributes_SObject("Salesforce_Connector.Attributes_SObject");

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

	public Lead(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Salesforce_Connector.Lead"));
	}

	protected Lead(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject leadMendixObject)
	{
		super(context, leadMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Salesforce_Connector.Lead", leadMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Salesforce_Connector.Lead");
	}

	/**
	 * @deprecated Use 'Lead.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static salesforce_connector.proxies.Lead initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return salesforce_connector.proxies.Lead.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static salesforce_connector.proxies.Lead initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new salesforce_connector.proxies.Lead(context, mendixObject);
	}

	public static salesforce_connector.proxies.Lead load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return salesforce_connector.proxies.Lead.initialize(context, mendixObject);
	}

	/**
	 * @return value of IsDeleted
	 */
	public final java.lang.Boolean getIsDeleted()
	{
		return getIsDeleted(getContext());
	}

	/**
	 * @param context
	 * @return value of IsDeleted
	 */
	public final java.lang.Boolean getIsDeleted(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsDeleted.toString());
	}

	/**
	 * Set value of IsDeleted
	 * @param isdeleted
	 */
	public final void setIsDeleted(java.lang.Boolean isdeleted)
	{
		setIsDeleted(getContext(), isdeleted);
	}

	/**
	 * Set value of IsDeleted
	 * @param context
	 * @param isdeleted
	 */
	public final void setIsDeleted(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isdeleted)
	{
		getMendixObject().setValue(context, MemberNames.IsDeleted.toString(), isdeleted);
	}

	/**
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName()
	{
		return getFirstName(getContext());
	}

	/**
	 * @param context
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FirstName.toString());
	}

	/**
	 * Set value of FirstName
	 * @param firstname
	 */
	public final void setFirstName(java.lang.String firstname)
	{
		setFirstName(getContext(), firstname);
	}

	/**
	 * Set value of FirstName
	 * @param context
	 * @param firstname
	 */
	public final void setFirstName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String firstname)
	{
		getMendixObject().setValue(context, MemberNames.FirstName.toString(), firstname);
	}

	/**
	 * @return value of LastName
	 */
	public final java.lang.String getLastName()
	{
		return getLastName(getContext());
	}

	/**
	 * @param context
	 * @return value of LastName
	 */
	public final java.lang.String getLastName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastName.toString());
	}

	/**
	 * Set value of LastName
	 * @param lastname
	 */
	public final void setLastName(java.lang.String lastname)
	{
		setLastName(getContext(), lastname);
	}

	/**
	 * Set value of LastName
	 * @param context
	 * @param lastname
	 */
	public final void setLastName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastname)
	{
		getMendixObject().setValue(context, MemberNames.LastName.toString(), lastname);
	}

	/**
	 * @return value of Title
	 */
	public final java.lang.String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final java.lang.String getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(java.lang.String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of Company
	 */
	public final java.lang.String getCompany()
	{
		return getCompany(getContext());
	}

	/**
	 * @param context
	 * @return value of Company
	 */
	public final java.lang.String getCompany(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Company.toString());
	}

	/**
	 * Set value of Company
	 * @param company
	 */
	public final void setCompany(java.lang.String company)
	{
		setCompany(getContext(), company);
	}

	/**
	 * Set value of Company
	 * @param context
	 * @param company
	 */
	public final void setCompany(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String company)
	{
		getMendixObject().setValue(context, MemberNames.Company.toString(), company);
	}

	/**
	 * @return value of Lead_Records
	 */
	public final salesforce_connector.proxies.Records getLead_Records() throws com.mendix.core.CoreException
	{
		return getLead_Records(getContext());
	}

	/**
	 * @param context
	 * @return value of Lead_Records
	 */
	public final salesforce_connector.proxies.Records getLead_Records(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.Records result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Lead_Records.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.Records.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Lead_Records
	 * @param lead_records
	 */
	public final void setLead_Records(salesforce_connector.proxies.Records lead_records)
	{
		setLead_Records(getContext(), lead_records);
	}

	/**
	 * Set value of Lead_Records
	 * @param context
	 * @param lead_records
	 */
	public final void setLead_Records(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.Records lead_records)
	{
		if (lead_records == null)
			getMendixObject().setValue(context, MemberNames.Lead_Records.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Lead_Records.toString(), lead_records.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final salesforce_connector.proxies.Lead that = (salesforce_connector.proxies.Lead) obj;
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
		return "Salesforce_Connector.Lead";
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
