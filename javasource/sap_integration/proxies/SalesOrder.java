// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sap_integration.proxies;

public class SalesOrder extends sapodataconnector.proxies.OdataObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAP_Integration.SalesOrder";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SalesOrderID("SalesOrderID"),
		Note("Note"),
		NoteLanguage("NoteLanguage"),
		CustomerID("CustomerID"),
		CustomerName("CustomerName"),
		CurrencyCode("CurrencyCode"),
		GrossAmount("GrossAmount"),
		NetAmount("NetAmount"),
		TaxAmount("TaxAmount"),
		LifecycleStatus("LifecycleStatus"),
		LifecycleStatusDescription("LifecycleStatusDescription"),
		BillingStatus("BillingStatus"),
		BillingStatusDescription("BillingStatusDescription"),
		DeliveryStatus("DeliveryStatus"),
		DeliveryStatusDescription("DeliveryStatusDescription"),
		CreatedAt("CreatedAt"),
		ChangedAt("ChangedAt"),
		ToBusinessPartnerDeferred("ToBusinessPartnerDeferred"),
		ToLineItemsDeferred("ToLineItemsDeferred"),
		meta_objectURI("meta_objectURI"),
		meta_etag("meta_etag"),
		ToSalesOrders_BusinessPartner_SalesOrder("SAP_Integration.ToSalesOrders_BusinessPartner_SalesOrder"),
		ToBusinessPartner_SalesOrder_BusinessPartner("SAP_Integration.ToBusinessPartner_SalesOrder_BusinessPartner"),
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

	public SalesOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAP_Integration.SalesOrder"));
	}

	protected SalesOrder(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject salesOrderMendixObject)
	{
		super(context, salesOrderMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SAP_Integration.SalesOrder", salesOrderMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAP_Integration.SalesOrder");
	}

	/**
	 * @deprecated Use 'SalesOrder.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sap_integration.proxies.SalesOrder initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sap_integration.proxies.SalesOrder.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sap_integration.proxies.SalesOrder initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sap_integration.proxies.SalesOrder(context, mendixObject);
	}

	public static sap_integration.proxies.SalesOrder load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sap_integration.proxies.SalesOrder.initialize(context, mendixObject);
	}

	/**
	 * @return value of SalesOrderID
	 */
	public final java.lang.String getSalesOrderID()
	{
		return getSalesOrderID(getContext());
	}

	/**
	 * @param context
	 * @return value of SalesOrderID
	 */
	public final java.lang.String getSalesOrderID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SalesOrderID.toString());
	}

	/**
	 * Set value of SalesOrderID
	 * @param salesorderid
	 */
	public final void setSalesOrderID(java.lang.String salesorderid)
	{
		setSalesOrderID(getContext(), salesorderid);
	}

	/**
	 * Set value of SalesOrderID
	 * @param context
	 * @param salesorderid
	 */
	public final void setSalesOrderID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String salesorderid)
	{
		getMendixObject().setValue(context, MemberNames.SalesOrderID.toString(), salesorderid);
	}

	/**
	 * @return value of Note
	 */
	public final java.lang.String getNote()
	{
		return getNote(getContext());
	}

	/**
	 * @param context
	 * @return value of Note
	 */
	public final java.lang.String getNote(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Note.toString());
	}

	/**
	 * Set value of Note
	 * @param note
	 */
	public final void setNote(java.lang.String note)
	{
		setNote(getContext(), note);
	}

	/**
	 * Set value of Note
	 * @param context
	 * @param note
	 */
	public final void setNote(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String note)
	{
		getMendixObject().setValue(context, MemberNames.Note.toString(), note);
	}

	/**
	 * @return value of NoteLanguage
	 */
	public final java.lang.String getNoteLanguage()
	{
		return getNoteLanguage(getContext());
	}

	/**
	 * @param context
	 * @return value of NoteLanguage
	 */
	public final java.lang.String getNoteLanguage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NoteLanguage.toString());
	}

	/**
	 * Set value of NoteLanguage
	 * @param notelanguage
	 */
	public final void setNoteLanguage(java.lang.String notelanguage)
	{
		setNoteLanguage(getContext(), notelanguage);
	}

	/**
	 * Set value of NoteLanguage
	 * @param context
	 * @param notelanguage
	 */
	public final void setNoteLanguage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String notelanguage)
	{
		getMendixObject().setValue(context, MemberNames.NoteLanguage.toString(), notelanguage);
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
	 * @return value of CustomerName
	 */
	public final java.lang.String getCustomerName()
	{
		return getCustomerName(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerName
	 */
	public final java.lang.String getCustomerName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CustomerName.toString());
	}

	/**
	 * Set value of CustomerName
	 * @param customername
	 */
	public final void setCustomerName(java.lang.String customername)
	{
		setCustomerName(getContext(), customername);
	}

	/**
	 * Set value of CustomerName
	 * @param context
	 * @param customername
	 */
	public final void setCustomerName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String customername)
	{
		getMendixObject().setValue(context, MemberNames.CustomerName.toString(), customername);
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
	 * @return value of GrossAmount
	 */
	public final java.math.BigDecimal getGrossAmount()
	{
		return getGrossAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of GrossAmount
	 */
	public final java.math.BigDecimal getGrossAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.GrossAmount.toString());
	}

	/**
	 * Set value of GrossAmount
	 * @param grossamount
	 */
	public final void setGrossAmount(java.math.BigDecimal grossamount)
	{
		setGrossAmount(getContext(), grossamount);
	}

	/**
	 * Set value of GrossAmount
	 * @param context
	 * @param grossamount
	 */
	public final void setGrossAmount(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal grossamount)
	{
		getMendixObject().setValue(context, MemberNames.GrossAmount.toString(), grossamount);
	}

	/**
	 * @return value of NetAmount
	 */
	public final java.math.BigDecimal getNetAmount()
	{
		return getNetAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of NetAmount
	 */
	public final java.math.BigDecimal getNetAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.NetAmount.toString());
	}

	/**
	 * Set value of NetAmount
	 * @param netamount
	 */
	public final void setNetAmount(java.math.BigDecimal netamount)
	{
		setNetAmount(getContext(), netamount);
	}

	/**
	 * Set value of NetAmount
	 * @param context
	 * @param netamount
	 */
	public final void setNetAmount(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal netamount)
	{
		getMendixObject().setValue(context, MemberNames.NetAmount.toString(), netamount);
	}

	/**
	 * @return value of TaxAmount
	 */
	public final java.math.BigDecimal getTaxAmount()
	{
		return getTaxAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of TaxAmount
	 */
	public final java.math.BigDecimal getTaxAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.TaxAmount.toString());
	}

	/**
	 * Set value of TaxAmount
	 * @param taxamount
	 */
	public final void setTaxAmount(java.math.BigDecimal taxamount)
	{
		setTaxAmount(getContext(), taxamount);
	}

	/**
	 * Set value of TaxAmount
	 * @param context
	 * @param taxamount
	 */
	public final void setTaxAmount(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal taxamount)
	{
		getMendixObject().setValue(context, MemberNames.TaxAmount.toString(), taxamount);
	}

	/**
	 * @return value of LifecycleStatus
	 */
	public final java.lang.String getLifecycleStatus()
	{
		return getLifecycleStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of LifecycleStatus
	 */
	public final java.lang.String getLifecycleStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LifecycleStatus.toString());
	}

	/**
	 * Set value of LifecycleStatus
	 * @param lifecyclestatus
	 */
	public final void setLifecycleStatus(java.lang.String lifecyclestatus)
	{
		setLifecycleStatus(getContext(), lifecyclestatus);
	}

	/**
	 * Set value of LifecycleStatus
	 * @param context
	 * @param lifecyclestatus
	 */
	public final void setLifecycleStatus(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lifecyclestatus)
	{
		getMendixObject().setValue(context, MemberNames.LifecycleStatus.toString(), lifecyclestatus);
	}

	/**
	 * @return value of LifecycleStatusDescription
	 */
	public final java.lang.String getLifecycleStatusDescription()
	{
		return getLifecycleStatusDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of LifecycleStatusDescription
	 */
	public final java.lang.String getLifecycleStatusDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LifecycleStatusDescription.toString());
	}

	/**
	 * Set value of LifecycleStatusDescription
	 * @param lifecyclestatusdescription
	 */
	public final void setLifecycleStatusDescription(java.lang.String lifecyclestatusdescription)
	{
		setLifecycleStatusDescription(getContext(), lifecyclestatusdescription);
	}

	/**
	 * Set value of LifecycleStatusDescription
	 * @param context
	 * @param lifecyclestatusdescription
	 */
	public final void setLifecycleStatusDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lifecyclestatusdescription)
	{
		getMendixObject().setValue(context, MemberNames.LifecycleStatusDescription.toString(), lifecyclestatusdescription);
	}

	/**
	 * @return value of BillingStatus
	 */
	public final java.lang.String getBillingStatus()
	{
		return getBillingStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of BillingStatus
	 */
	public final java.lang.String getBillingStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.BillingStatus.toString());
	}

	/**
	 * Set value of BillingStatus
	 * @param billingstatus
	 */
	public final void setBillingStatus(java.lang.String billingstatus)
	{
		setBillingStatus(getContext(), billingstatus);
	}

	/**
	 * Set value of BillingStatus
	 * @param context
	 * @param billingstatus
	 */
	public final void setBillingStatus(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String billingstatus)
	{
		getMendixObject().setValue(context, MemberNames.BillingStatus.toString(), billingstatus);
	}

	/**
	 * @return value of BillingStatusDescription
	 */
	public final java.lang.String getBillingStatusDescription()
	{
		return getBillingStatusDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of BillingStatusDescription
	 */
	public final java.lang.String getBillingStatusDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.BillingStatusDescription.toString());
	}

	/**
	 * Set value of BillingStatusDescription
	 * @param billingstatusdescription
	 */
	public final void setBillingStatusDescription(java.lang.String billingstatusdescription)
	{
		setBillingStatusDescription(getContext(), billingstatusdescription);
	}

	/**
	 * Set value of BillingStatusDescription
	 * @param context
	 * @param billingstatusdescription
	 */
	public final void setBillingStatusDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String billingstatusdescription)
	{
		getMendixObject().setValue(context, MemberNames.BillingStatusDescription.toString(), billingstatusdescription);
	}

	/**
	 * @return value of DeliveryStatus
	 */
	public final java.lang.String getDeliveryStatus()
	{
		return getDeliveryStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of DeliveryStatus
	 */
	public final java.lang.String getDeliveryStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DeliveryStatus.toString());
	}

	/**
	 * Set value of DeliveryStatus
	 * @param deliverystatus
	 */
	public final void setDeliveryStatus(java.lang.String deliverystatus)
	{
		setDeliveryStatus(getContext(), deliverystatus);
	}

	/**
	 * Set value of DeliveryStatus
	 * @param context
	 * @param deliverystatus
	 */
	public final void setDeliveryStatus(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String deliverystatus)
	{
		getMendixObject().setValue(context, MemberNames.DeliveryStatus.toString(), deliverystatus);
	}

	/**
	 * @return value of DeliveryStatusDescription
	 */
	public final java.lang.String getDeliveryStatusDescription()
	{
		return getDeliveryStatusDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of DeliveryStatusDescription
	 */
	public final java.lang.String getDeliveryStatusDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DeliveryStatusDescription.toString());
	}

	/**
	 * Set value of DeliveryStatusDescription
	 * @param deliverystatusdescription
	 */
	public final void setDeliveryStatusDescription(java.lang.String deliverystatusdescription)
	{
		setDeliveryStatusDescription(getContext(), deliverystatusdescription);
	}

	/**
	 * Set value of DeliveryStatusDescription
	 * @param context
	 * @param deliverystatusdescription
	 */
	public final void setDeliveryStatusDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String deliverystatusdescription)
	{
		getMendixObject().setValue(context, MemberNames.DeliveryStatusDescription.toString(), deliverystatusdescription);
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
	 * @return value of ToBusinessPartnerDeferred
	 */
	public final java.lang.String getToBusinessPartnerDeferred()
	{
		return getToBusinessPartnerDeferred(getContext());
	}

	/**
	 * @param context
	 * @return value of ToBusinessPartnerDeferred
	 */
	public final java.lang.String getToBusinessPartnerDeferred(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ToBusinessPartnerDeferred.toString());
	}

	/**
	 * Set value of ToBusinessPartnerDeferred
	 * @param tobusinesspartnerdeferred
	 */
	public final void setToBusinessPartnerDeferred(java.lang.String tobusinesspartnerdeferred)
	{
		setToBusinessPartnerDeferred(getContext(), tobusinesspartnerdeferred);
	}

	/**
	 * Set value of ToBusinessPartnerDeferred
	 * @param context
	 * @param tobusinesspartnerdeferred
	 */
	public final void setToBusinessPartnerDeferred(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tobusinesspartnerdeferred)
	{
		getMendixObject().setValue(context, MemberNames.ToBusinessPartnerDeferred.toString(), tobusinesspartnerdeferred);
	}

	/**
	 * @return value of ToLineItemsDeferred
	 */
	public final java.lang.String getToLineItemsDeferred()
	{
		return getToLineItemsDeferred(getContext());
	}

	/**
	 * @param context
	 * @return value of ToLineItemsDeferred
	 */
	public final java.lang.String getToLineItemsDeferred(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ToLineItemsDeferred.toString());
	}

	/**
	 * Set value of ToLineItemsDeferred
	 * @param tolineitemsdeferred
	 */
	public final void setToLineItemsDeferred(java.lang.String tolineitemsdeferred)
	{
		setToLineItemsDeferred(getContext(), tolineitemsdeferred);
	}

	/**
	 * Set value of ToLineItemsDeferred
	 * @param context
	 * @param tolineitemsdeferred
	 */
	public final void setToLineItemsDeferred(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tolineitemsdeferred)
	{
		getMendixObject().setValue(context, MemberNames.ToLineItemsDeferred.toString(), tolineitemsdeferred);
	}

	/**
	 * @return value of ToSalesOrders_BusinessPartner_SalesOrder
	 */
	public final sap_integration.proxies.BusinessPartner getToSalesOrders_BusinessPartner_SalesOrder() throws com.mendix.core.CoreException
	{
		return getToSalesOrders_BusinessPartner_SalesOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of ToSalesOrders_BusinessPartner_SalesOrder
	 */
	public final sap_integration.proxies.BusinessPartner getToSalesOrders_BusinessPartner_SalesOrder(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sap_integration.proxies.BusinessPartner result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ToSalesOrders_BusinessPartner_SalesOrder.toString());
		if (identifier != null)
			result = sap_integration.proxies.BusinessPartner.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ToSalesOrders_BusinessPartner_SalesOrder
	 * @param tosalesorders_businesspartner_salesorder
	 */
	public final void setToSalesOrders_BusinessPartner_SalesOrder(sap_integration.proxies.BusinessPartner tosalesorders_businesspartner_salesorder)
	{
		setToSalesOrders_BusinessPartner_SalesOrder(getContext(), tosalesorders_businesspartner_salesorder);
	}

	/**
	 * Set value of ToSalesOrders_BusinessPartner_SalesOrder
	 * @param context
	 * @param tosalesorders_businesspartner_salesorder
	 */
	public final void setToSalesOrders_BusinessPartner_SalesOrder(com.mendix.systemwideinterfaces.core.IContext context, sap_integration.proxies.BusinessPartner tosalesorders_businesspartner_salesorder)
	{
		if (tosalesorders_businesspartner_salesorder == null)
			getMendixObject().setValue(context, MemberNames.ToSalesOrders_BusinessPartner_SalesOrder.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ToSalesOrders_BusinessPartner_SalesOrder.toString(), tosalesorders_businesspartner_salesorder.getMendixObject().getId());
	}

	/**
	 * @return value of ToBusinessPartner_SalesOrder_BusinessPartner
	 */
	public final sap_integration.proxies.BusinessPartner getToBusinessPartner_SalesOrder_BusinessPartner() throws com.mendix.core.CoreException
	{
		return getToBusinessPartner_SalesOrder_BusinessPartner(getContext());
	}

	/**
	 * @param context
	 * @return value of ToBusinessPartner_SalesOrder_BusinessPartner
	 */
	public final sap_integration.proxies.BusinessPartner getToBusinessPartner_SalesOrder_BusinessPartner(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sap_integration.proxies.BusinessPartner result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ToBusinessPartner_SalesOrder_BusinessPartner.toString());
		if (identifier != null)
			result = sap_integration.proxies.BusinessPartner.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ToBusinessPartner_SalesOrder_BusinessPartner
	 * @param tobusinesspartner_salesorder_businesspartner
	 */
	public final void setToBusinessPartner_SalesOrder_BusinessPartner(sap_integration.proxies.BusinessPartner tobusinesspartner_salesorder_businesspartner)
	{
		setToBusinessPartner_SalesOrder_BusinessPartner(getContext(), tobusinesspartner_salesorder_businesspartner);
	}

	/**
	 * Set value of ToBusinessPartner_SalesOrder_BusinessPartner
	 * @param context
	 * @param tobusinesspartner_salesorder_businesspartner
	 */
	public final void setToBusinessPartner_SalesOrder_BusinessPartner(com.mendix.systemwideinterfaces.core.IContext context, sap_integration.proxies.BusinessPartner tobusinesspartner_salesorder_businesspartner)
	{
		if (tobusinesspartner_salesorder_businesspartner == null)
			getMendixObject().setValue(context, MemberNames.ToBusinessPartner_SalesOrder_BusinessPartner.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ToBusinessPartner_SalesOrder_BusinessPartner.toString(), tobusinesspartner_salesorder_businesspartner.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sap_integration.proxies.SalesOrder that = (sap_integration.proxies.SalesOrder) obj;
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
		return "SAP_Integration.SalesOrder";
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