// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesforce_connector.proxies;

public class Contact extends salesforce_connector.proxies.SObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Salesforce_Connector.Contact";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		IsDeleted("IsDeleted"),
		Email("Email"),
		Salutation("Salutation"),
		MailingStreet("MailingStreet"),
		MailingCity("MailingCity"),
		MailingState("MailingState"),
		MailingPostalCode("MailingPostalCode"),
		MailingCountry("MailingCountry"),
		MobilePhone("MobilePhone"),
		Birthdate("Birthdate"),
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
		Contact_Records("Salesforce_Connector.Contact_Records"),
		Contact_Account("Salesforce_Connector.Contact_Account"),
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

	public Contact(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Salesforce_Connector.Contact"));
	}

	protected Contact(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject contactMendixObject)
	{
		super(context, contactMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Salesforce_Connector.Contact", contactMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Salesforce_Connector.Contact");
	}

	/**
	 * @deprecated Use 'Contact.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static salesforce_connector.proxies.Contact initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return salesforce_connector.proxies.Contact.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static salesforce_connector.proxies.Contact initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new salesforce_connector.proxies.Contact(context, mendixObject);
	}

	public static salesforce_connector.proxies.Contact load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return salesforce_connector.proxies.Contact.initialize(context, mendixObject);
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
	 * @return value of Email
	 */
	public final java.lang.String getEmail()
	{
		return getEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of Email
	 */
	public final java.lang.String getEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Email.toString());
	}

	/**
	 * Set value of Email
	 * @param email
	 */
	public final void setEmail(java.lang.String email)
	{
		setEmail(getContext(), email);
	}

	/**
	 * Set value of Email
	 * @param context
	 * @param email
	 */
	public final void setEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.Email.toString(), email);
	}

	/**
	 * @return value of Salutation
	 */
	public final java.lang.String getSalutation()
	{
		return getSalutation(getContext());
	}

	/**
	 * @param context
	 * @return value of Salutation
	 */
	public final java.lang.String getSalutation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Salutation.toString());
	}

	/**
	 * Set value of Salutation
	 * @param salutation
	 */
	public final void setSalutation(java.lang.String salutation)
	{
		setSalutation(getContext(), salutation);
	}

	/**
	 * Set value of Salutation
	 * @param context
	 * @param salutation
	 */
	public final void setSalutation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String salutation)
	{
		getMendixObject().setValue(context, MemberNames.Salutation.toString(), salutation);
	}

	/**
	 * @return value of MailingStreet
	 */
	public final java.lang.String getMailingStreet()
	{
		return getMailingStreet(getContext());
	}

	/**
	 * @param context
	 * @return value of MailingStreet
	 */
	public final java.lang.String getMailingStreet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MailingStreet.toString());
	}

	/**
	 * Set value of MailingStreet
	 * @param mailingstreet
	 */
	public final void setMailingStreet(java.lang.String mailingstreet)
	{
		setMailingStreet(getContext(), mailingstreet);
	}

	/**
	 * Set value of MailingStreet
	 * @param context
	 * @param mailingstreet
	 */
	public final void setMailingStreet(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mailingstreet)
	{
		getMendixObject().setValue(context, MemberNames.MailingStreet.toString(), mailingstreet);
	}

	/**
	 * @return value of MailingCity
	 */
	public final java.lang.String getMailingCity()
	{
		return getMailingCity(getContext());
	}

	/**
	 * @param context
	 * @return value of MailingCity
	 */
	public final java.lang.String getMailingCity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MailingCity.toString());
	}

	/**
	 * Set value of MailingCity
	 * @param mailingcity
	 */
	public final void setMailingCity(java.lang.String mailingcity)
	{
		setMailingCity(getContext(), mailingcity);
	}

	/**
	 * Set value of MailingCity
	 * @param context
	 * @param mailingcity
	 */
	public final void setMailingCity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mailingcity)
	{
		getMendixObject().setValue(context, MemberNames.MailingCity.toString(), mailingcity);
	}

	/**
	 * @return value of MailingState
	 */
	public final java.lang.String getMailingState()
	{
		return getMailingState(getContext());
	}

	/**
	 * @param context
	 * @return value of MailingState
	 */
	public final java.lang.String getMailingState(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MailingState.toString());
	}

	/**
	 * Set value of MailingState
	 * @param mailingstate
	 */
	public final void setMailingState(java.lang.String mailingstate)
	{
		setMailingState(getContext(), mailingstate);
	}

	/**
	 * Set value of MailingState
	 * @param context
	 * @param mailingstate
	 */
	public final void setMailingState(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mailingstate)
	{
		getMendixObject().setValue(context, MemberNames.MailingState.toString(), mailingstate);
	}

	/**
	 * @return value of MailingPostalCode
	 */
	public final java.lang.String getMailingPostalCode()
	{
		return getMailingPostalCode(getContext());
	}

	/**
	 * @param context
	 * @return value of MailingPostalCode
	 */
	public final java.lang.String getMailingPostalCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MailingPostalCode.toString());
	}

	/**
	 * Set value of MailingPostalCode
	 * @param mailingpostalcode
	 */
	public final void setMailingPostalCode(java.lang.String mailingpostalcode)
	{
		setMailingPostalCode(getContext(), mailingpostalcode);
	}

	/**
	 * Set value of MailingPostalCode
	 * @param context
	 * @param mailingpostalcode
	 */
	public final void setMailingPostalCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mailingpostalcode)
	{
		getMendixObject().setValue(context, MemberNames.MailingPostalCode.toString(), mailingpostalcode);
	}

	/**
	 * @return value of MailingCountry
	 */
	public final java.lang.String getMailingCountry()
	{
		return getMailingCountry(getContext());
	}

	/**
	 * @param context
	 * @return value of MailingCountry
	 */
	public final java.lang.String getMailingCountry(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MailingCountry.toString());
	}

	/**
	 * Set value of MailingCountry
	 * @param mailingcountry
	 */
	public final void setMailingCountry(java.lang.String mailingcountry)
	{
		setMailingCountry(getContext(), mailingcountry);
	}

	/**
	 * Set value of MailingCountry
	 * @param context
	 * @param mailingcountry
	 */
	public final void setMailingCountry(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mailingcountry)
	{
		getMendixObject().setValue(context, MemberNames.MailingCountry.toString(), mailingcountry);
	}

	/**
	 * @return value of MobilePhone
	 */
	public final java.lang.String getMobilePhone()
	{
		return getMobilePhone(getContext());
	}

	/**
	 * @param context
	 * @return value of MobilePhone
	 */
	public final java.lang.String getMobilePhone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MobilePhone.toString());
	}

	/**
	 * Set value of MobilePhone
	 * @param mobilephone
	 */
	public final void setMobilePhone(java.lang.String mobilephone)
	{
		setMobilePhone(getContext(), mobilephone);
	}

	/**
	 * Set value of MobilePhone
	 * @param context
	 * @param mobilephone
	 */
	public final void setMobilePhone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mobilephone)
	{
		getMendixObject().setValue(context, MemberNames.MobilePhone.toString(), mobilephone);
	}

	/**
	 * @return value of Birthdate
	 */
	public final java.lang.String getBirthdate()
	{
		return getBirthdate(getContext());
	}

	/**
	 * @param context
	 * @return value of Birthdate
	 */
	public final java.lang.String getBirthdate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Birthdate.toString());
	}

	/**
	 * Set value of Birthdate
	 * @param birthdate
	 */
	public final void setBirthdate(java.lang.String birthdate)
	{
		setBirthdate(getContext(), birthdate);
	}

	/**
	 * Set value of Birthdate
	 * @param context
	 * @param birthdate
	 */
	public final void setBirthdate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String birthdate)
	{
		getMendixObject().setValue(context, MemberNames.Birthdate.toString(), birthdate);
	}

	/**
	 * @return value of Contact_Records
	 */
	public final salesforce_connector.proxies.Records getContact_Records() throws com.mendix.core.CoreException
	{
		return getContact_Records(getContext());
	}

	/**
	 * @param context
	 * @return value of Contact_Records
	 */
	public final salesforce_connector.proxies.Records getContact_Records(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.Records result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Contact_Records.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.Records.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Contact_Records
	 * @param contact_records
	 */
	public final void setContact_Records(salesforce_connector.proxies.Records contact_records)
	{
		setContact_Records(getContext(), contact_records);
	}

	/**
	 * Set value of Contact_Records
	 * @param context
	 * @param contact_records
	 */
	public final void setContact_Records(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.Records contact_records)
	{
		if (contact_records == null)
			getMendixObject().setValue(context, MemberNames.Contact_Records.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Contact_Records.toString(), contact_records.getMendixObject().getId());
	}

	/**
	 * @return value of Contact_Account
	 */
	public final salesforce_connector.proxies.Account getContact_Account() throws com.mendix.core.CoreException
	{
		return getContact_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of Contact_Account
	 */
	public final salesforce_connector.proxies.Account getContact_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Contact_Account.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Contact_Account
	 * @param contact_account
	 */
	public final void setContact_Account(salesforce_connector.proxies.Account contact_account)
	{
		setContact_Account(getContext(), contact_account);
	}

	/**
	 * Set value of Contact_Account
	 * @param context
	 * @param contact_account
	 */
	public final void setContact_Account(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.Account contact_account)
	{
		if (contact_account == null)
			getMendixObject().setValue(context, MemberNames.Contact_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Contact_Account.toString(), contact_account.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final salesforce_connector.proxies.Contact that = (salesforce_connector.proxies.Contact) obj;
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
		return "Salesforce_Connector.Contact";
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