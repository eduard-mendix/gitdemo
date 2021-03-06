// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sap_integration.proxies;

public class SalesOrderLineItem extends sapodataconnector.proxies.OdataObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAP_Integration.SalesOrderLineItem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SalesOrderID("SalesOrderID"),
		ItemPosition("ItemPosition"),
		ProductID("ProductID"),
		Note("Note"),
		NoteLanguage("NoteLanguage"),
		CurrencyCode("CurrencyCode"),
		GrossAmount("GrossAmount"),
		NetAmount("NetAmount"),
		TaxAmount("TaxAmount"),
		DeliveryDate("DeliveryDate"),
		Quantity("Quantity"),
		QuantityUnit("QuantityUnit"),
		ToHeaderDeferred("ToHeaderDeferred"),
		ToProductDeferred("ToProductDeferred"),
		meta_objectURI("meta_objectURI"),
		meta_etag("meta_etag"),
		ToSalesOrderLineItems_Product_SalesOrderLineItem("SAP_Integration.ToSalesOrderLineItems_Product_SalesOrderLineItem"),
		ToLineItems_SalesOrder_SalesOrderLineItem("SAP_Integration.ToLineItems_SalesOrder_SalesOrderLineItem"),
		ToHeader_SalesOrderLineItem_SalesOrder("SAP_Integration.ToHeader_SalesOrderLineItem_SalesOrder"),
		ToProduct_SalesOrderLineItem_Product("SAP_Integration.ToProduct_SalesOrderLineItem_Product"),
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

	public SalesOrderLineItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAP_Integration.SalesOrderLineItem"));
	}

	protected SalesOrderLineItem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject salesOrderLineItemMendixObject)
	{
		super(context, salesOrderLineItemMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SAP_Integration.SalesOrderLineItem", salesOrderLineItemMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAP_Integration.SalesOrderLineItem");
	}

	/**
	 * @deprecated Use 'SalesOrderLineItem.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sap_integration.proxies.SalesOrderLineItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sap_integration.proxies.SalesOrderLineItem.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sap_integration.proxies.SalesOrderLineItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sap_integration.proxies.SalesOrderLineItem(context, mendixObject);
	}

	public static sap_integration.proxies.SalesOrderLineItem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sap_integration.proxies.SalesOrderLineItem.initialize(context, mendixObject);
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
	 * @return value of ItemPosition
	 */
	public final java.lang.String getItemPosition()
	{
		return getItemPosition(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemPosition
	 */
	public final java.lang.String getItemPosition(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ItemPosition.toString());
	}

	/**
	 * Set value of ItemPosition
	 * @param itemposition
	 */
	public final void setItemPosition(java.lang.String itemposition)
	{
		setItemPosition(getContext(), itemposition);
	}

	/**
	 * Set value of ItemPosition
	 * @param context
	 * @param itemposition
	 */
	public final void setItemPosition(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String itemposition)
	{
		getMendixObject().setValue(context, MemberNames.ItemPosition.toString(), itemposition);
	}

	/**
	 * @return value of ProductID
	 */
	public final java.lang.String getProductID()
	{
		return getProductID(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductID
	 */
	public final java.lang.String getProductID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ProductID.toString());
	}

	/**
	 * Set value of ProductID
	 * @param productid
	 */
	public final void setProductID(java.lang.String productid)
	{
		setProductID(getContext(), productid);
	}

	/**
	 * Set value of ProductID
	 * @param context
	 * @param productid
	 */
	public final void setProductID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String productid)
	{
		getMendixObject().setValue(context, MemberNames.ProductID.toString(), productid);
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
	 * @return value of DeliveryDate
	 */
	public final java.util.Date getDeliveryDate()
	{
		return getDeliveryDate(getContext());
	}

	/**
	 * @param context
	 * @return value of DeliveryDate
	 */
	public final java.util.Date getDeliveryDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DeliveryDate.toString());
	}

	/**
	 * Set value of DeliveryDate
	 * @param deliverydate
	 */
	public final void setDeliveryDate(java.util.Date deliverydate)
	{
		setDeliveryDate(getContext(), deliverydate);
	}

	/**
	 * Set value of DeliveryDate
	 * @param context
	 * @param deliverydate
	 */
	public final void setDeliveryDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date deliverydate)
	{
		getMendixObject().setValue(context, MemberNames.DeliveryDate.toString(), deliverydate);
	}

	/**
	 * @return value of Quantity
	 */
	public final java.math.BigDecimal getQuantity()
	{
		return getQuantity(getContext());
	}

	/**
	 * @param context
	 * @return value of Quantity
	 */
	public final java.math.BigDecimal getQuantity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Quantity.toString());
	}

	/**
	 * Set value of Quantity
	 * @param quantity
	 */
	public final void setQuantity(java.math.BigDecimal quantity)
	{
		setQuantity(getContext(), quantity);
	}

	/**
	 * Set value of Quantity
	 * @param context
	 * @param quantity
	 */
	public final void setQuantity(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal quantity)
	{
		getMendixObject().setValue(context, MemberNames.Quantity.toString(), quantity);
	}

	/**
	 * @return value of QuantityUnit
	 */
	public final java.lang.String getQuantityUnit()
	{
		return getQuantityUnit(getContext());
	}

	/**
	 * @param context
	 * @return value of QuantityUnit
	 */
	public final java.lang.String getQuantityUnit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.QuantityUnit.toString());
	}

	/**
	 * Set value of QuantityUnit
	 * @param quantityunit
	 */
	public final void setQuantityUnit(java.lang.String quantityunit)
	{
		setQuantityUnit(getContext(), quantityunit);
	}

	/**
	 * Set value of QuantityUnit
	 * @param context
	 * @param quantityunit
	 */
	public final void setQuantityUnit(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String quantityunit)
	{
		getMendixObject().setValue(context, MemberNames.QuantityUnit.toString(), quantityunit);
	}

	/**
	 * @return value of ToHeaderDeferred
	 */
	public final java.lang.String getToHeaderDeferred()
	{
		return getToHeaderDeferred(getContext());
	}

	/**
	 * @param context
	 * @return value of ToHeaderDeferred
	 */
	public final java.lang.String getToHeaderDeferred(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ToHeaderDeferred.toString());
	}

	/**
	 * Set value of ToHeaderDeferred
	 * @param toheaderdeferred
	 */
	public final void setToHeaderDeferred(java.lang.String toheaderdeferred)
	{
		setToHeaderDeferred(getContext(), toheaderdeferred);
	}

	/**
	 * Set value of ToHeaderDeferred
	 * @param context
	 * @param toheaderdeferred
	 */
	public final void setToHeaderDeferred(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String toheaderdeferred)
	{
		getMendixObject().setValue(context, MemberNames.ToHeaderDeferred.toString(), toheaderdeferred);
	}

	/**
	 * @return value of ToProductDeferred
	 */
	public final java.lang.String getToProductDeferred()
	{
		return getToProductDeferred(getContext());
	}

	/**
	 * @param context
	 * @return value of ToProductDeferred
	 */
	public final java.lang.String getToProductDeferred(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ToProductDeferred.toString());
	}

	/**
	 * Set value of ToProductDeferred
	 * @param toproductdeferred
	 */
	public final void setToProductDeferred(java.lang.String toproductdeferred)
	{
		setToProductDeferred(getContext(), toproductdeferred);
	}

	/**
	 * Set value of ToProductDeferred
	 * @param context
	 * @param toproductdeferred
	 */
	public final void setToProductDeferred(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String toproductdeferred)
	{
		getMendixObject().setValue(context, MemberNames.ToProductDeferred.toString(), toproductdeferred);
	}

	/**
	 * @return value of ToSalesOrderLineItems_Product_SalesOrderLineItem
	 */
	public final sap_integration.proxies.Product getToSalesOrderLineItems_Product_SalesOrderLineItem() throws com.mendix.core.CoreException
	{
		return getToSalesOrderLineItems_Product_SalesOrderLineItem(getContext());
	}

	/**
	 * @param context
	 * @return value of ToSalesOrderLineItems_Product_SalesOrderLineItem
	 */
	public final sap_integration.proxies.Product getToSalesOrderLineItems_Product_SalesOrderLineItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sap_integration.proxies.Product result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ToSalesOrderLineItems_Product_SalesOrderLineItem.toString());
		if (identifier != null)
			result = sap_integration.proxies.Product.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ToSalesOrderLineItems_Product_SalesOrderLineItem
	 * @param tosalesorderlineitems_product_salesorderlineitem
	 */
	public final void setToSalesOrderLineItems_Product_SalesOrderLineItem(sap_integration.proxies.Product tosalesorderlineitems_product_salesorderlineitem)
	{
		setToSalesOrderLineItems_Product_SalesOrderLineItem(getContext(), tosalesorderlineitems_product_salesorderlineitem);
	}

	/**
	 * Set value of ToSalesOrderLineItems_Product_SalesOrderLineItem
	 * @param context
	 * @param tosalesorderlineitems_product_salesorderlineitem
	 */
	public final void setToSalesOrderLineItems_Product_SalesOrderLineItem(com.mendix.systemwideinterfaces.core.IContext context, sap_integration.proxies.Product tosalesorderlineitems_product_salesorderlineitem)
	{
		if (tosalesorderlineitems_product_salesorderlineitem == null)
			getMendixObject().setValue(context, MemberNames.ToSalesOrderLineItems_Product_SalesOrderLineItem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ToSalesOrderLineItems_Product_SalesOrderLineItem.toString(), tosalesorderlineitems_product_salesorderlineitem.getMendixObject().getId());
	}

	/**
	 * @return value of ToLineItems_SalesOrder_SalesOrderLineItem
	 */
	public final sap_integration.proxies.SalesOrder getToLineItems_SalesOrder_SalesOrderLineItem() throws com.mendix.core.CoreException
	{
		return getToLineItems_SalesOrder_SalesOrderLineItem(getContext());
	}

	/**
	 * @param context
	 * @return value of ToLineItems_SalesOrder_SalesOrderLineItem
	 */
	public final sap_integration.proxies.SalesOrder getToLineItems_SalesOrder_SalesOrderLineItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sap_integration.proxies.SalesOrder result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ToLineItems_SalesOrder_SalesOrderLineItem.toString());
		if (identifier != null)
			result = sap_integration.proxies.SalesOrder.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ToLineItems_SalesOrder_SalesOrderLineItem
	 * @param tolineitems_salesorder_salesorderlineitem
	 */
	public final void setToLineItems_SalesOrder_SalesOrderLineItem(sap_integration.proxies.SalesOrder tolineitems_salesorder_salesorderlineitem)
	{
		setToLineItems_SalesOrder_SalesOrderLineItem(getContext(), tolineitems_salesorder_salesorderlineitem);
	}

	/**
	 * Set value of ToLineItems_SalesOrder_SalesOrderLineItem
	 * @param context
	 * @param tolineitems_salesorder_salesorderlineitem
	 */
	public final void setToLineItems_SalesOrder_SalesOrderLineItem(com.mendix.systemwideinterfaces.core.IContext context, sap_integration.proxies.SalesOrder tolineitems_salesorder_salesorderlineitem)
	{
		if (tolineitems_salesorder_salesorderlineitem == null)
			getMendixObject().setValue(context, MemberNames.ToLineItems_SalesOrder_SalesOrderLineItem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ToLineItems_SalesOrder_SalesOrderLineItem.toString(), tolineitems_salesorder_salesorderlineitem.getMendixObject().getId());
	}

	/**
	 * @return value of ToHeader_SalesOrderLineItem_SalesOrder
	 */
	public final sap_integration.proxies.SalesOrder getToHeader_SalesOrderLineItem_SalesOrder() throws com.mendix.core.CoreException
	{
		return getToHeader_SalesOrderLineItem_SalesOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of ToHeader_SalesOrderLineItem_SalesOrder
	 */
	public final sap_integration.proxies.SalesOrder getToHeader_SalesOrderLineItem_SalesOrder(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sap_integration.proxies.SalesOrder result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ToHeader_SalesOrderLineItem_SalesOrder.toString());
		if (identifier != null)
			result = sap_integration.proxies.SalesOrder.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ToHeader_SalesOrderLineItem_SalesOrder
	 * @param toheader_salesorderlineitem_salesorder
	 */
	public final void setToHeader_SalesOrderLineItem_SalesOrder(sap_integration.proxies.SalesOrder toheader_salesorderlineitem_salesorder)
	{
		setToHeader_SalesOrderLineItem_SalesOrder(getContext(), toheader_salesorderlineitem_salesorder);
	}

	/**
	 * Set value of ToHeader_SalesOrderLineItem_SalesOrder
	 * @param context
	 * @param toheader_salesorderlineitem_salesorder
	 */
	public final void setToHeader_SalesOrderLineItem_SalesOrder(com.mendix.systemwideinterfaces.core.IContext context, sap_integration.proxies.SalesOrder toheader_salesorderlineitem_salesorder)
	{
		if (toheader_salesorderlineitem_salesorder == null)
			getMendixObject().setValue(context, MemberNames.ToHeader_SalesOrderLineItem_SalesOrder.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ToHeader_SalesOrderLineItem_SalesOrder.toString(), toheader_salesorderlineitem_salesorder.getMendixObject().getId());
	}

	/**
	 * @return value of ToProduct_SalesOrderLineItem_Product
	 */
	public final sap_integration.proxies.Product getToProduct_SalesOrderLineItem_Product() throws com.mendix.core.CoreException
	{
		return getToProduct_SalesOrderLineItem_Product(getContext());
	}

	/**
	 * @param context
	 * @return value of ToProduct_SalesOrderLineItem_Product
	 */
	public final sap_integration.proxies.Product getToProduct_SalesOrderLineItem_Product(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sap_integration.proxies.Product result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ToProduct_SalesOrderLineItem_Product.toString());
		if (identifier != null)
			result = sap_integration.proxies.Product.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ToProduct_SalesOrderLineItem_Product
	 * @param toproduct_salesorderlineitem_product
	 */
	public final void setToProduct_SalesOrderLineItem_Product(sap_integration.proxies.Product toproduct_salesorderlineitem_product)
	{
		setToProduct_SalesOrderLineItem_Product(getContext(), toproduct_salesorderlineitem_product);
	}

	/**
	 * Set value of ToProduct_SalesOrderLineItem_Product
	 * @param context
	 * @param toproduct_salesorderlineitem_product
	 */
	public final void setToProduct_SalesOrderLineItem_Product(com.mendix.systemwideinterfaces.core.IContext context, sap_integration.proxies.Product toproduct_salesorderlineitem_product)
	{
		if (toproduct_salesorderlineitem_product == null)
			getMendixObject().setValue(context, MemberNames.ToProduct_SalesOrderLineItem_Product.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ToProduct_SalesOrderLineItem_Product.toString(), toproduct_salesorderlineitem_product.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sap_integration.proxies.SalesOrderLineItem that = (sap_integration.proxies.SalesOrderLineItem) obj;
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
		return "SAP_Integration.SalesOrderLineItem";
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
