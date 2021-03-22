// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package masterdata.proxies;

public class Customer extends administration.proxies.Account
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MasterData.Customer";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CustomerID("CustomerID"),
		FirstName("FirstName"),
		LastName("LastName"),
		Street("Street"),
		HouseNumber("HouseNumber"),
		PhoneNumber("PhoneNumber"),
		EmailAddress("EmailAddress"),
		DateOfBirth("DateOfBirth"),
		BankAccountNumber("BankAccountNumber"),
		Address("Address"),
		FullName("FullName"),
		Email("Email"),
		IsLocalUser("IsLocalUser"),
		Name("Name"),
		Password("Password"),
		LastLogin("LastLogin"),
		Blocked("Blocked"),
		Active("Active"),
		FailedLogins("FailedLogins"),
		WebServiceUser("WebServiceUser"),
		IsAnonymous("IsAnonymous"),
		UserRoles("System.UserRoles"),
		User_Language("System.User_Language"),
		User_TimeZone("System.User_TimeZone");

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

	public Customer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MasterData.Customer"));
	}

	protected Customer(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject customerMendixObject)
	{
		super(context, customerMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("MasterData.Customer", customerMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MasterData.Customer");
	}

	/**
	 * @deprecated Use 'Customer.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static masterdata.proxies.Customer initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return masterdata.proxies.Customer.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static masterdata.proxies.Customer initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new masterdata.proxies.Customer(context, mendixObject);
	}

	public static masterdata.proxies.Customer load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return masterdata.proxies.Customer.initialize(context, mendixObject);
	}

	public static java.util.List<masterdata.proxies.Customer> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<masterdata.proxies.Customer> result = new java.util.ArrayList<masterdata.proxies.Customer>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MasterData.Customer" + xpathConstraint))
			result.add(masterdata.proxies.Customer.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of CustomerID
	 */
	public final java.lang.String getCustomerID()
	{
		return getCustomerID(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerID
	 */
	public final java.lang.String getCustomerID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CustomerID.toString());
	}

	/**
	 * Set value of CustomerID
	 * @param customerid
	 */
	public final void setCustomerID(java.lang.String customerid)
	{
		setCustomerID(getContext(), customerid);
	}

	/**
	 * Set value of CustomerID
	 * @param context
	 * @param customerid
	 */
	public final void setCustomerID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String customerid)
	{
		getMendixObject().setValue(context, MemberNames.CustomerID.toString(), customerid);
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
	 * @return value of Street
	 */
	public final java.lang.String getStreet()
	{
		return getStreet(getContext());
	}

	/**
	 * @param context
	 * @return value of Street
	 */
	public final java.lang.String getStreet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Street.toString());
	}

	/**
	 * Set value of Street
	 * @param street
	 */
	public final void setStreet(java.lang.String street)
	{
		setStreet(getContext(), street);
	}

	/**
	 * Set value of Street
	 * @param context
	 * @param street
	 */
	public final void setStreet(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String street)
	{
		getMendixObject().setValue(context, MemberNames.Street.toString(), street);
	}

	/**
	 * @return value of HouseNumber
	 */
	public final java.lang.String getHouseNumber()
	{
		return getHouseNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of HouseNumber
	 */
	public final java.lang.String getHouseNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HouseNumber.toString());
	}

	/**
	 * Set value of HouseNumber
	 * @param housenumber
	 */
	public final void setHouseNumber(java.lang.String housenumber)
	{
		setHouseNumber(getContext(), housenumber);
	}

	/**
	 * Set value of HouseNumber
	 * @param context
	 * @param housenumber
	 */
	public final void setHouseNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String housenumber)
	{
		getMendixObject().setValue(context, MemberNames.HouseNumber.toString(), housenumber);
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
	 * @return value of DateOfBirth
	 */
	public final java.util.Date getDateOfBirth()
	{
		return getDateOfBirth(getContext());
	}

	/**
	 * @param context
	 * @return value of DateOfBirth
	 */
	public final java.util.Date getDateOfBirth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateOfBirth.toString());
	}

	/**
	 * Set value of DateOfBirth
	 * @param dateofbirth
	 */
	public final void setDateOfBirth(java.util.Date dateofbirth)
	{
		setDateOfBirth(getContext(), dateofbirth);
	}

	/**
	 * Set value of DateOfBirth
	 * @param context
	 * @param dateofbirth
	 */
	public final void setDateOfBirth(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date dateofbirth)
	{
		getMendixObject().setValue(context, MemberNames.DateOfBirth.toString(), dateofbirth);
	}

	/**
	 * @return value of BankAccountNumber
	 */
	public final java.lang.String getBankAccountNumber()
	{
		return getBankAccountNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of BankAccountNumber
	 */
	public final java.lang.String getBankAccountNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.BankAccountNumber.toString());
	}

	/**
	 * Set value of BankAccountNumber
	 * @param bankaccountnumber
	 */
	public final void setBankAccountNumber(java.lang.String bankaccountnumber)
	{
		setBankAccountNumber(getContext(), bankaccountnumber);
	}

	/**
	 * Set value of BankAccountNumber
	 * @param context
	 * @param bankaccountnumber
	 */
	public final void setBankAccountNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String bankaccountnumber)
	{
		getMendixObject().setValue(context, MemberNames.BankAccountNumber.toString(), bankaccountnumber);
	}

	/**
	 * @return value of Address
	 */
	public final java.lang.String getAddress()
	{
		return getAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of Address
	 */
	public final java.lang.String getAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Address.toString());
	}

	/**
	 * Set value of Address
	 * @param address
	 */
	public final void setAddress(java.lang.String address)
	{
		setAddress(getContext(), address);
	}

	/**
	 * Set value of Address
	 * @param context
	 * @param address
	 */
	public final void setAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String address)
	{
		getMendixObject().setValue(context, MemberNames.Address.toString(), address);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final masterdata.proxies.Customer that = (masterdata.proxies.Customer) obj;
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
		return "MasterData.Customer";
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