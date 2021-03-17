// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sap_integration.proxies;

public class BusinessPartner extends sapodataconnector.proxies.OdataObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAP_Integration.BusinessPartner";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		BusinessPartnerID("BusinessPartnerID"),
		CompanyName("CompanyName"),
		WebAddress("WebAddress"),
		EmailAddress("EmailAddress"),
		PhoneNumber("PhoneNumber"),
		FaxNumber("FaxNumber"),
		LegalForm("LegalForm"),
		CurrencyCode("CurrencyCode"),
		BusinessPartnerRole("BusinessPartnerRole"),
		CreatedAt("CreatedAt"),
		ChangedAt("ChangedAt"),
		ToSalesOrdersDeferred("ToSalesOrdersDeferred"),
		ToContactsDeferred("ToContactsDeferred"),
		ToProductsDeferred("ToProductsDeferred"),
		meta_objectURI("meta_objectURI"),
		meta_etag("meta_etag"),
		AddressComplex_BusinessPartner_CT_Address("SAP_Integration.AddressComplex_BusinessPartner_CT_Address"),
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

	public BusinessPartner(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAP_Integration.BusinessPartner"));
	}

	protected BusinessPartner(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject businessPartnerMendixObject)
	{
		super(context, businessPartnerMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SAP_Integration.BusinessPartner", businessPartnerMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAP_Integration.BusinessPartner");
	}

	/**
	 * @deprecated Use 'BusinessPartner.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sap_integration.proxies.BusinessPartner initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sap_integration.proxies.BusinessPartner.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sap_integration.proxies.BusinessPartner initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sap_integration.proxies.BusinessPartner(context, mendixObject);
	}

	public static sap_integration.proxies.BusinessPartner load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sap_integration.proxies.BusinessPartner.initialize(context, mendixObject);
	}

	/**
	 * @return value of BusinessPartnerID
	 */
	public final java.lang.String getBusinessPartnerID()
	{
		return getBusinessPartnerID(getContext());
	}

	/**
	 * @param context
	 * @return value of BusinessPartnerID
	 */
	public final java.lang.String getBusinessPartnerID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.BusinessPartnerID.toString());
	}

	/**
	 * Set value of BusinessPartnerID
	 * @param businesspartnerid
	 */
	public final void setBusinessPartnerID(java.lang.String businesspartnerid)
	{
		setBusinessPartnerID(getContext(), businesspartnerid);
	}

	/**
	 * Set value of BusinessPartnerID
	 * @param context
	 * @param businesspartnerid
	 */
	public final void setBusinessPartnerID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String businesspartnerid)
	{
		getMendixObject().setValue(context, MemberNames.BusinessPartnerID.toString(), businesspartnerid);
	}

	/**
	 * @return value of CompanyName
	 */
	public final java.lang.String getCompanyName()
	{
		return getCompanyName(getContext());
	}

	/**
	 * @param context
	 * @return value of CompanyName
	 */
	public final java.lang.String getCompanyName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CompanyName.toString());
	}

	/**
	 * Set value of CompanyName
	 * @param companyname
	 */
	public final void setCompanyName(java.lang.String companyname)
	{
		setCompanyName(getContext(), companyname);
	}

	/**
	 * Set value of CompanyName
	 * @param context
	 * @param companyname
	 */
	public final void setCompanyName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String companyname)
	{
		getMendixObject().setValue(context, MemberNames.CompanyName.toString(), companyname);
	}

	/**
	 * @return value of WebAddress
	 */
	public final java.lang.String getWebAddress()
	{
		return getWebAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of WebAddress
	 */
	public final java.lang.String getWebAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.WebAddress.toString());
	}

	/**
	 * Set value of WebAddress
	 * @param webaddress
	 */
	public final void setWebAddress(java.lang.String webaddress)
	{
		setWebAddress(getContext(), webaddress);
	}

	/**
	 * Set value of WebAddress
	 * @param context
	 * @param webaddress
	 */
	public final void setWebAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String webaddress)
	{
		getMendixObject().setValue(context, MemberNames.WebAddress.toString(), webaddress);
	}

	/**
	 * @return value of EmailAddress
	 */
	public final java.lang.String getEmailAddress()
	{
		return getEmailAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of EmailAddress
	 */
	public final java.lang.String getEmailAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EmailAddress.toString());
	}

	/**
	 * Set value of EmailAddress
	 * @param emailaddress
	 */
	public final void setEmailAddress(java.lang.String emailaddress)
	{
		setEmailAddress(getContext(), emailaddress);
	}

	/**
	 * Set value of EmailAddress
	 * @param context
	 * @param emailaddress
	 */
	public final void setEmailAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emailaddress)
	{
		getMendixObject().setValue(context, MemberNames.EmailAddress.toString(), emailaddress);
	}

	/**
	 * @return value of PhoneNumber
	 */
	public final java.lang.String getPhoneNumber()
	{
		return getPhoneNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of PhoneNumber
	 */
	public final java.lang.String getPhoneNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PhoneNumber.toString());
	}

	/**
	 * Set value of PhoneNumber
	 * @param phonenumber
	 */
	public final void setPhoneNumber(java.lang.String phonenumber)
	{
		setPhoneNumber(getContext(), phonenumber);
	}

	/**
	 * Set value of PhoneNumber
	 * @param context
	 * @param phonenumber
	 */
	public final void setPhoneNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String phonenumber)
	{
		getMendixObject().setValue(context, MemberNames.PhoneNumber.toString(), phonenumber);
	}

	/**
	 * @return value of FaxNumber
	 */
	public final java.lang.String getFaxNumber()
	{
		return getFaxNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of FaxNumber
	 */
	public final java.lang.String getFaxNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FaxNumber.toString());
	}

	/**
	 * Set value of FaxNumber
	 * @param faxnumber
	 */
	public final void setFaxNumber(java.lang.String faxnumber)
	{
		setFaxNumber(getContext(), faxnumber);
	}

	/**
	 * Set value of FaxNumber
	 * @param context
	 * @param faxnumber
	 */
	public final void setFaxNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String faxnumber)
	{
		getMendixObject().setValue(context, MemberNames.FaxNumber.toString(), faxnumber);
	}

	/**
	 * @return value of LegalForm
	 */
	public final java.lang.String getLegalForm()
	{
		return getLegalForm(getContext());
	}

	/**
	 * @param context
	 * @return value of LegalForm
	 */
	public final java.lang.String getLegalForm(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LegalForm.toString());
	}

	/**
	 * Set value of LegalForm
	 * @param legalform
	 */
	public final void setLegalForm(java.lang.String legalform)
	{
		setLegalForm(getContext(), legalform);
	}

	/**
	 * Set value of LegalForm
	 * @param context
	 * @param legalform
	 */
	public final void setLegalForm(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String legalform)
	{
		getMendixObject().setValue(context, MemberNames.LegalForm.toString(), legalform);
	}

	/**
	 * @return value of CurrencyCode
	 */
	public final java.lang.String getCurrencyCode()
	{
		return getCurrencyCode(getContext());
	}

	/**
	 * @param context
	 * @return value of CurrencyCode
	 */
	public final java.lang.String getCurrencyCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CurrencyCode.toString());
	}

	/**
	 * Set value of CurrencyCode
	 * @param currencycode
	 */
	public final void setCurrencyCode(java.lang.String currencycode)
	{
		setCurrencyCode(getContext(), currencycode);
	}

	/**
	 * Set value of CurrencyCode
	 * @param context
	 * @param currencycode
	 */
	public final void setCurrencyCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String currencycode)
	{
		getMendixObject().setValue(context, MemberNames.CurrencyCode.toString(), currencycode);
	}

	/**
	 * @return value of BusinessPartnerRole
	 */
	public final java.lang.String getBusinessPartnerRole()
	{
		return getBusinessPartnerRole(getContext());
	}

	/**
	 * @param context
	 * @return value of BusinessPartnerRole
	 */
	public final java.lang.String getBusinessPartnerRole(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.BusinessPartnerRole.toString());
	}

	/**
	 * Set value of BusinessPartnerRole
	 * @param businesspartnerrole
	 */
	public final void setBusinessPartnerRole(java.lang.String businesspartnerrole)
	{
		setBusinessPartnerRole(getContext(), businesspartnerrole);
	}

	/**
	 * Set value of BusinessPartnerRole
	 * @param context
	 * @param businesspartnerrole
	 */
	public final void setBusinessPartnerRole(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String businesspartnerrole)
	{
		getMendixObject().setValue(context, MemberNames.BusinessPartnerRole.toString(), businesspartnerrole);
	}

	/**
	 * @return value of CreatedAt
	 */
	public final java.util.Date getCreatedAt()
	{
		return getCreatedAt(getContext());
	}

	/**
	 * @param context
	 * @return value of CreatedAt
	 */
	public final java.util.Date getCreatedAt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.CreatedAt.toString());
	}

	/**
	 * Set value of CreatedAt
	 * @param createdat
	 */
	public final void setCreatedAt(java.util.Date createdat)
	{
		setCreatedAt(getContext(), createdat);
	}

	/**
	 * Set value of CreatedAt
	 * @param context
	 * @param createdat
	 */
	public final void setCreatedAt(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date createdat)
	{
		getMendixObject().setValue(context, MemberNames.CreatedAt.toString(), createdat);
	}

	/**
	 * @return value of ChangedAt
	 */
	public final java.util.Date getChangedAt()
	{
		return getChangedAt(getContext());
	}

	/**
	 * @param context
	 * @return value of ChangedAt
	 */
	public final java.util.Date getChangedAt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ChangedAt.toString());
	}

	/**
	 * Set value of ChangedAt
	 * @param changedat
	 */
	public final void setChangedAt(java.util.Date changedat)
	{
		setChangedAt(getContext(), changedat);
	}

	/**
	 * Set value of ChangedAt
	 * @param context
	 * @param changedat
	 */
	public final void setChangedAt(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date changedat)
	{
		getMendixObject().setValue(context, MemberNames.ChangedAt.toString(), changedat);
	}

	/**
	 * @return value of ToSalesOrdersDeferred
	 */
	public final java.lang.String getToSalesOrdersDeferred()
	{
		return getToSalesOrdersDeferred(getContext());
	}

	/**
	 * @param context
	 * @return value of ToSalesOrdersDeferred
	 */
	public final java.lang.String getToSalesOrdersDeferred(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ToSalesOrdersDeferred.toString());
	}

	/**
	 * Set value of ToSalesOrdersDeferred
	 * @param tosalesordersdeferred
	 */
	public final void setToSalesOrdersDeferred(java.lang.String tosalesordersdeferred)
	{
		setToSalesOrdersDeferred(getContext(), tosalesordersdeferred);
	}

	/**
	 * Set value of ToSalesOrdersDeferred
	 * @param context
	 * @param tosalesordersdeferred
	 */
	public final void setToSalesOrdersDeferred(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tosalesordersdeferred)
	{
		getMendixObject().setValue(context, MemberNames.ToSalesOrdersDeferred.toString(), tosalesordersdeferred);
	}

	/**
	 * @return value of ToContactsDeferred
	 */
	public final java.lang.String getToContactsDeferred()
	{
		return getToContactsDeferred(getContext());
	}

	/**
	 * @param context
	 * @return value of ToContactsDeferred
	 */
	public final java.lang.String getToContactsDeferred(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ToContactsDeferred.toString());
	}

	/**
	 * Set value of ToContactsDeferred
	 * @param tocontactsdeferred
	 */
	public final void setToContactsDeferred(java.lang.String tocontactsdeferred)
	{
		setToContactsDeferred(getContext(), tocontactsdeferred);
	}

	/**
	 * Set value of ToContactsDeferred
	 * @param context
	 * @param tocontactsdeferred
	 */
	public final void setToContactsDeferred(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tocontactsdeferred)
	{
		getMendixObject().setValue(context, MemberNames.ToContactsDeferred.toString(), tocontactsdeferred);
	}

	/**
	 * @return value of ToProductsDeferred
	 */
	public final java.lang.String getToProductsDeferred()
	{
		return getToProductsDeferred(getContext());
	}

	/**
	 * @param context
	 * @return value of ToProductsDeferred
	 */
	public final java.lang.String getToProductsDeferred(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ToProductsDeferred.toString());
	}

	/**
	 * Set value of ToProductsDeferred
	 * @param toproductsdeferred
	 */
	public final void setToProductsDeferred(java.lang.String toproductsdeferred)
	{
		setToProductsDeferred(getContext(), toproductsdeferred);
	}

	/**
	 * Set value of ToProductsDeferred
	 * @param context
	 * @param toproductsdeferred
	 */
	public final void setToProductsDeferred(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String toproductsdeferred)
	{
		getMendixObject().setValue(context, MemberNames.ToProductsDeferred.toString(), toproductsdeferred);
	}

	/**
	 * @return value of AddressComplex_BusinessPartner_CT_Address
	 */
	public final sap_integration.proxies.CT_Address getAddressComplex_BusinessPartner_CT_Address() throws com.mendix.core.CoreException
	{
		return getAddressComplex_BusinessPartner_CT_Address(getContext());
	}

	/**
	 * @param context
	 * @return value of AddressComplex_BusinessPartner_CT_Address
	 */
	public final sap_integration.proxies.CT_Address getAddressComplex_BusinessPartner_CT_Address(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sap_integration.proxies.CT_Address result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AddressComplex_BusinessPartner_CT_Address.toString());
		if (identifier != null)
			result = sap_integration.proxies.CT_Address.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AddressComplex_BusinessPartner_CT_Address
	 * @param addresscomplex_businesspartner_ct_address
	 */
	public final void setAddressComplex_BusinessPartner_CT_Address(sap_integration.proxies.CT_Address addresscomplex_businesspartner_ct_address)
	{
		setAddressComplex_BusinessPartner_CT_Address(getContext(), addresscomplex_businesspartner_ct_address);
	}

	/**
	 * Set value of AddressComplex_BusinessPartner_CT_Address
	 * @param context
	 * @param addresscomplex_businesspartner_ct_address
	 */
	public final void setAddressComplex_BusinessPartner_CT_Address(com.mendix.systemwideinterfaces.core.IContext context, sap_integration.proxies.CT_Address addresscomplex_businesspartner_ct_address)
	{
		if (addresscomplex_businesspartner_ct_address == null)
			getMendixObject().setValue(context, MemberNames.AddressComplex_BusinessPartner_CT_Address.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AddressComplex_BusinessPartner_CT_Address.toString(), addresscomplex_businesspartner_ct_address.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sap_integration.proxies.BusinessPartner that = (sap_integration.proxies.BusinessPartner) obj;
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
		return "SAP_Integration.BusinessPartner";
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
