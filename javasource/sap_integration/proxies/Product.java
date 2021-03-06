// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sap_integration.proxies;

public class Product extends sapodataconnector.proxies.OdataObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAP_Integration.Product";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ProductID("ProductID"),
		TypeCode("TypeCode"),
		Category("Category"),
		Name("Name"),
		NameLanguage("NameLanguage"),
		Description("Description"),
		DescriptionLanguage("DescriptionLanguage"),
		SupplierID("SupplierID"),
		SupplierName("SupplierName"),
		TaxTarifCode("TaxTarifCode"),
		MeasureUnit("MeasureUnit"),
		WeightMeasure("WeightMeasure"),
		WeightUnit("WeightUnit"),
		CurrencyCode("CurrencyCode"),
		Price("Price"),
		Width("Width"),
		Depth("Depth"),
		Height("Height"),
		DimUnit("DimUnit"),
		CreatedAt("CreatedAt"),
		ChangedAt("ChangedAt"),
		ToSalesOrderLineItemsDeferred("ToSalesOrderLineItemsDeferred"),
		ToSupplierDeferred("ToSupplierDeferred"),
		_ImageURL("_ImageURL"),
		_ShowStandardImage("_ShowStandardImage"),
		meta_objectURI("meta_objectURI"),
		meta_etag("meta_etag"),
		ToProducts_BusinessPartner_Product("SAP_Integration.ToProducts_BusinessPartner_Product"),
		ToSupplier_Product_BusinessPartner("SAP_Integration.ToSupplier_Product_BusinessPartner"),
		Product_ProductRoot("SAP_Integration.Product_ProductRoot"),
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

	public Product(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAP_Integration.Product"));
	}

	protected Product(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productMendixObject)
	{
		super(context, productMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SAP_Integration.Product", productMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAP_Integration.Product");
	}

	/**
	 * @deprecated Use 'Product.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sap_integration.proxies.Product initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sap_integration.proxies.Product.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sap_integration.proxies.Product initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sap_integration.proxies.Product(context, mendixObject);
	}

	public static sap_integration.proxies.Product load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sap_integration.proxies.Product.initialize(context, mendixObject);
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
	 * @return value of TypeCode
	 */
	public final java.lang.String getTypeCode()
	{
		return getTypeCode(getContext());
	}

	/**
	 * @param context
	 * @return value of TypeCode
	 */
	public final java.lang.String getTypeCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TypeCode.toString());
	}

	/**
	 * Set value of TypeCode
	 * @param typecode
	 */
	public final void setTypeCode(java.lang.String typecode)
	{
		setTypeCode(getContext(), typecode);
	}

	/**
	 * Set value of TypeCode
	 * @param context
	 * @param typecode
	 */
	public final void setTypeCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String typecode)
	{
		getMendixObject().setValue(context, MemberNames.TypeCode.toString(), typecode);
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

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of NameLanguage
	 */
	public final java.lang.String getNameLanguage()
	{
		return getNameLanguage(getContext());
	}

	/**
	 * @param context
	 * @return value of NameLanguage
	 */
	public final java.lang.String getNameLanguage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NameLanguage.toString());
	}

	/**
	 * Set value of NameLanguage
	 * @param namelanguage
	 */
	public final void setNameLanguage(java.lang.String namelanguage)
	{
		setNameLanguage(getContext(), namelanguage);
	}

	/**
	 * Set value of NameLanguage
	 * @param context
	 * @param namelanguage
	 */
	public final void setNameLanguage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String namelanguage)
	{
		getMendixObject().setValue(context, MemberNames.NameLanguage.toString(), namelanguage);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of DescriptionLanguage
	 */
	public final java.lang.String getDescriptionLanguage()
	{
		return getDescriptionLanguage(getContext());
	}

	/**
	 * @param context
	 * @return value of DescriptionLanguage
	 */
	public final java.lang.String getDescriptionLanguage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DescriptionLanguage.toString());
	}

	/**
	 * Set value of DescriptionLanguage
	 * @param descriptionlanguage
	 */
	public final void setDescriptionLanguage(java.lang.String descriptionlanguage)
	{
		setDescriptionLanguage(getContext(), descriptionlanguage);
	}

	/**
	 * Set value of DescriptionLanguage
	 * @param context
	 * @param descriptionlanguage
	 */
	public final void setDescriptionLanguage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String descriptionlanguage)
	{
		getMendixObject().setValue(context, MemberNames.DescriptionLanguage.toString(), descriptionlanguage);
	}

	/**
	 * @return value of SupplierID
	 */
	public final java.lang.String getSupplierID()
	{
		return getSupplierID(getContext());
	}

	/**
	 * @param context
	 * @return value of SupplierID
	 */
	public final java.lang.String getSupplierID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SupplierID.toString());
	}

	/**
	 * Set value of SupplierID
	 * @param supplierid
	 */
	public final void setSupplierID(java.lang.String supplierid)
	{
		setSupplierID(getContext(), supplierid);
	}

	/**
	 * Set value of SupplierID
	 * @param context
	 * @param supplierid
	 */
	public final void setSupplierID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String supplierid)
	{
		getMendixObject().setValue(context, MemberNames.SupplierID.toString(), supplierid);
	}

	/**
	 * @return value of SupplierName
	 */
	public final java.lang.String getSupplierName()
	{
		return getSupplierName(getContext());
	}

	/**
	 * @param context
	 * @return value of SupplierName
	 */
	public final java.lang.String getSupplierName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SupplierName.toString());
	}

	/**
	 * Set value of SupplierName
	 * @param suppliername
	 */
	public final void setSupplierName(java.lang.String suppliername)
	{
		setSupplierName(getContext(), suppliername);
	}

	/**
	 * Set value of SupplierName
	 * @param context
	 * @param suppliername
	 */
	public final void setSupplierName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String suppliername)
	{
		getMendixObject().setValue(context, MemberNames.SupplierName.toString(), suppliername);
	}

	/**
	 * @return value of TaxTarifCode
	 */
	public final java.lang.Integer getTaxTarifCode()
	{
		return getTaxTarifCode(getContext());
	}

	/**
	 * @param context
	 * @return value of TaxTarifCode
	 */
	public final java.lang.Integer getTaxTarifCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TaxTarifCode.toString());
	}

	/**
	 * Set value of TaxTarifCode
	 * @param taxtarifcode
	 */
	public final void setTaxTarifCode(java.lang.Integer taxtarifcode)
	{
		setTaxTarifCode(getContext(), taxtarifcode);
	}

	/**
	 * Set value of TaxTarifCode
	 * @param context
	 * @param taxtarifcode
	 */
	public final void setTaxTarifCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer taxtarifcode)
	{
		getMendixObject().setValue(context, MemberNames.TaxTarifCode.toString(), taxtarifcode);
	}

	/**
	 * @return value of MeasureUnit
	 */
	public final java.lang.String getMeasureUnit()
	{
		return getMeasureUnit(getContext());
	}

	/**
	 * @param context
	 * @return value of MeasureUnit
	 */
	public final java.lang.String getMeasureUnit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MeasureUnit.toString());
	}

	/**
	 * Set value of MeasureUnit
	 * @param measureunit
	 */
	public final void setMeasureUnit(java.lang.String measureunit)
	{
		setMeasureUnit(getContext(), measureunit);
	}

	/**
	 * Set value of MeasureUnit
	 * @param context
	 * @param measureunit
	 */
	public final void setMeasureUnit(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String measureunit)
	{
		getMendixObject().setValue(context, MemberNames.MeasureUnit.toString(), measureunit);
	}

	/**
	 * @return value of WeightMeasure
	 */
	public final java.math.BigDecimal getWeightMeasure()
	{
		return getWeightMeasure(getContext());
	}

	/**
	 * @param context
	 * @return value of WeightMeasure
	 */
	public final java.math.BigDecimal getWeightMeasure(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.WeightMeasure.toString());
	}

	/**
	 * Set value of WeightMeasure
	 * @param weightmeasure
	 */
	public final void setWeightMeasure(java.math.BigDecimal weightmeasure)
	{
		setWeightMeasure(getContext(), weightmeasure);
	}

	/**
	 * Set value of WeightMeasure
	 * @param context
	 * @param weightmeasure
	 */
	public final void setWeightMeasure(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal weightmeasure)
	{
		getMendixObject().setValue(context, MemberNames.WeightMeasure.toString(), weightmeasure);
	}

	/**
	 * @return value of WeightUnit
	 */
	public final java.lang.String getWeightUnit()
	{
		return getWeightUnit(getContext());
	}

	/**
	 * @param context
	 * @return value of WeightUnit
	 */
	public final java.lang.String getWeightUnit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.WeightUnit.toString());
	}

	/**
	 * Set value of WeightUnit
	 * @param weightunit
	 */
	public final void setWeightUnit(java.lang.String weightunit)
	{
		setWeightUnit(getContext(), weightunit);
	}

	/**
	 * Set value of WeightUnit
	 * @param context
	 * @param weightunit
	 */
	public final void setWeightUnit(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String weightunit)
	{
		getMendixObject().setValue(context, MemberNames.WeightUnit.toString(), weightunit);
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
	 * @return value of Price
	 */
	public final java.math.BigDecimal getPrice()
	{
		return getPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of Price
	 */
	public final java.math.BigDecimal getPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Price.toString());
	}

	/**
	 * Set value of Price
	 * @param price
	 */
	public final void setPrice(java.math.BigDecimal price)
	{
		setPrice(getContext(), price);
	}

	/**
	 * Set value of Price
	 * @param context
	 * @param price
	 */
	public final void setPrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal price)
	{
		getMendixObject().setValue(context, MemberNames.Price.toString(), price);
	}

	/**
	 * @return value of Width
	 */
	public final java.math.BigDecimal getWidth()
	{
		return getWidth(getContext());
	}

	/**
	 * @param context
	 * @return value of Width
	 */
	public final java.math.BigDecimal getWidth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Width.toString());
	}

	/**
	 * Set value of Width
	 * @param width
	 */
	public final void setWidth(java.math.BigDecimal width)
	{
		setWidth(getContext(), width);
	}

	/**
	 * Set value of Width
	 * @param context
	 * @param width
	 */
	public final void setWidth(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal width)
	{
		getMendixObject().setValue(context, MemberNames.Width.toString(), width);
	}

	/**
	 * @return value of Depth
	 */
	public final java.math.BigDecimal getDepth()
	{
		return getDepth(getContext());
	}

	/**
	 * @param context
	 * @return value of Depth
	 */
	public final java.math.BigDecimal getDepth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Depth.toString());
	}

	/**
	 * Set value of Depth
	 * @param depth
	 */
	public final void setDepth(java.math.BigDecimal depth)
	{
		setDepth(getContext(), depth);
	}

	/**
	 * Set value of Depth
	 * @param context
	 * @param depth
	 */
	public final void setDepth(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal depth)
	{
		getMendixObject().setValue(context, MemberNames.Depth.toString(), depth);
	}

	/**
	 * @return value of Height
	 */
	public final java.math.BigDecimal getHeight()
	{
		return getHeight(getContext());
	}

	/**
	 * @param context
	 * @return value of Height
	 */
	public final java.math.BigDecimal getHeight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Height.toString());
	}

	/**
	 * Set value of Height
	 * @param height
	 */
	public final void setHeight(java.math.BigDecimal height)
	{
		setHeight(getContext(), height);
	}

	/**
	 * Set value of Height
	 * @param context
	 * @param height
	 */
	public final void setHeight(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal height)
	{
		getMendixObject().setValue(context, MemberNames.Height.toString(), height);
	}

	/**
	 * @return value of DimUnit
	 */
	public final java.lang.String getDimUnit()
	{
		return getDimUnit(getContext());
	}

	/**
	 * @param context
	 * @return value of DimUnit
	 */
	public final java.lang.String getDimUnit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DimUnit.toString());
	}

	/**
	 * Set value of DimUnit
	 * @param dimunit
	 */
	public final void setDimUnit(java.lang.String dimunit)
	{
		setDimUnit(getContext(), dimunit);
	}

	/**
	 * Set value of DimUnit
	 * @param context
	 * @param dimunit
	 */
	public final void setDimUnit(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String dimunit)
	{
		getMendixObject().setValue(context, MemberNames.DimUnit.toString(), dimunit);
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
	 * @return value of ToSalesOrderLineItemsDeferred
	 */
	public final java.lang.String getToSalesOrderLineItemsDeferred()
	{
		return getToSalesOrderLineItemsDeferred(getContext());
	}

	/**
	 * @param context
	 * @return value of ToSalesOrderLineItemsDeferred
	 */
	public final java.lang.String getToSalesOrderLineItemsDeferred(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ToSalesOrderLineItemsDeferred.toString());
	}

	/**
	 * Set value of ToSalesOrderLineItemsDeferred
	 * @param tosalesorderlineitemsdeferred
	 */
	public final void setToSalesOrderLineItemsDeferred(java.lang.String tosalesorderlineitemsdeferred)
	{
		setToSalesOrderLineItemsDeferred(getContext(), tosalesorderlineitemsdeferred);
	}

	/**
	 * Set value of ToSalesOrderLineItemsDeferred
	 * @param context
	 * @param tosalesorderlineitemsdeferred
	 */
	public final void setToSalesOrderLineItemsDeferred(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tosalesorderlineitemsdeferred)
	{
		getMendixObject().setValue(context, MemberNames.ToSalesOrderLineItemsDeferred.toString(), tosalesorderlineitemsdeferred);
	}

	/**
	 * @return value of ToSupplierDeferred
	 */
	public final java.lang.String getToSupplierDeferred()
	{
		return getToSupplierDeferred(getContext());
	}

	/**
	 * @param context
	 * @return value of ToSupplierDeferred
	 */
	public final java.lang.String getToSupplierDeferred(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ToSupplierDeferred.toString());
	}

	/**
	 * Set value of ToSupplierDeferred
	 * @param tosupplierdeferred
	 */
	public final void setToSupplierDeferred(java.lang.String tosupplierdeferred)
	{
		setToSupplierDeferred(getContext(), tosupplierdeferred);
	}

	/**
	 * Set value of ToSupplierDeferred
	 * @param context
	 * @param tosupplierdeferred
	 */
	public final void setToSupplierDeferred(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tosupplierdeferred)
	{
		getMendixObject().setValue(context, MemberNames.ToSupplierDeferred.toString(), tosupplierdeferred);
	}

	/**
	 * @return value of _ImageURL
	 */
	public final java.lang.String get_ImageURL()
	{
		return get_ImageURL(getContext());
	}

	/**
	 * @param context
	 * @return value of _ImageURL
	 */
	public final java.lang.String get_ImageURL(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._ImageURL.toString());
	}

	/**
	 * Set value of _ImageURL
	 * @param _imageurl
	 */
	public final void set_ImageURL(java.lang.String _imageurl)
	{
		set_ImageURL(getContext(), _imageurl);
	}

	/**
	 * Set value of _ImageURL
	 * @param context
	 * @param _imageurl
	 */
	public final void set_ImageURL(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _imageurl)
	{
		getMendixObject().setValue(context, MemberNames._ImageURL.toString(), _imageurl);
	}

	/**
	 * @return value of _ShowStandardImage
	 */
	public final java.lang.Boolean get_ShowStandardImage()
	{
		return get_ShowStandardImage(getContext());
	}

	/**
	 * @param context
	 * @return value of _ShowStandardImage
	 */
	public final java.lang.Boolean get_ShowStandardImage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames._ShowStandardImage.toString());
	}

	/**
	 * Set value of _ShowStandardImage
	 * @param _showstandardimage
	 */
	public final void set_ShowStandardImage(java.lang.Boolean _showstandardimage)
	{
		set_ShowStandardImage(getContext(), _showstandardimage);
	}

	/**
	 * Set value of _ShowStandardImage
	 * @param context
	 * @param _showstandardimage
	 */
	public final void set_ShowStandardImage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean _showstandardimage)
	{
		getMendixObject().setValue(context, MemberNames._ShowStandardImage.toString(), _showstandardimage);
	}

	/**
	 * @return value of ToProducts_BusinessPartner_Product
	 */
	public final sap_integration.proxies.BusinessPartner getToProducts_BusinessPartner_Product() throws com.mendix.core.CoreException
	{
		return getToProducts_BusinessPartner_Product(getContext());
	}

	/**
	 * @param context
	 * @return value of ToProducts_BusinessPartner_Product
	 */
	public final sap_integration.proxies.BusinessPartner getToProducts_BusinessPartner_Product(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sap_integration.proxies.BusinessPartner result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ToProducts_BusinessPartner_Product.toString());
		if (identifier != null)
			result = sap_integration.proxies.BusinessPartner.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ToProducts_BusinessPartner_Product
	 * @param toproducts_businesspartner_product
	 */
	public final void setToProducts_BusinessPartner_Product(sap_integration.proxies.BusinessPartner toproducts_businesspartner_product)
	{
		setToProducts_BusinessPartner_Product(getContext(), toproducts_businesspartner_product);
	}

	/**
	 * Set value of ToProducts_BusinessPartner_Product
	 * @param context
	 * @param toproducts_businesspartner_product
	 */
	public final void setToProducts_BusinessPartner_Product(com.mendix.systemwideinterfaces.core.IContext context, sap_integration.proxies.BusinessPartner toproducts_businesspartner_product)
	{
		if (toproducts_businesspartner_product == null)
			getMendixObject().setValue(context, MemberNames.ToProducts_BusinessPartner_Product.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ToProducts_BusinessPartner_Product.toString(), toproducts_businesspartner_product.getMendixObject().getId());
	}

	/**
	 * @return value of ToSupplier_Product_BusinessPartner
	 */
	public final sap_integration.proxies.BusinessPartner getToSupplier_Product_BusinessPartner() throws com.mendix.core.CoreException
	{
		return getToSupplier_Product_BusinessPartner(getContext());
	}

	/**
	 * @param context
	 * @return value of ToSupplier_Product_BusinessPartner
	 */
	public final sap_integration.proxies.BusinessPartner getToSupplier_Product_BusinessPartner(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sap_integration.proxies.BusinessPartner result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ToSupplier_Product_BusinessPartner.toString());
		if (identifier != null)
			result = sap_integration.proxies.BusinessPartner.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ToSupplier_Product_BusinessPartner
	 * @param tosupplier_product_businesspartner
	 */
	public final void setToSupplier_Product_BusinessPartner(sap_integration.proxies.BusinessPartner tosupplier_product_businesspartner)
	{
		setToSupplier_Product_BusinessPartner(getContext(), tosupplier_product_businesspartner);
	}

	/**
	 * Set value of ToSupplier_Product_BusinessPartner
	 * @param context
	 * @param tosupplier_product_businesspartner
	 */
	public final void setToSupplier_Product_BusinessPartner(com.mendix.systemwideinterfaces.core.IContext context, sap_integration.proxies.BusinessPartner tosupplier_product_businesspartner)
	{
		if (tosupplier_product_businesspartner == null)
			getMendixObject().setValue(context, MemberNames.ToSupplier_Product_BusinessPartner.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ToSupplier_Product_BusinessPartner.toString(), tosupplier_product_businesspartner.getMendixObject().getId());
	}

	/**
	 * @return value of Product_ProductRoot
	 */
	public final sap_integration.proxies.ProductRoot getProduct_ProductRoot() throws com.mendix.core.CoreException
	{
		return getProduct_ProductRoot(getContext());
	}

	/**
	 * @param context
	 * @return value of Product_ProductRoot
	 */
	public final sap_integration.proxies.ProductRoot getProduct_ProductRoot(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sap_integration.proxies.ProductRoot result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Product_ProductRoot.toString());
		if (identifier != null)
			result = sap_integration.proxies.ProductRoot.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Product_ProductRoot
	 * @param product_productroot
	 */
	public final void setProduct_ProductRoot(sap_integration.proxies.ProductRoot product_productroot)
	{
		setProduct_ProductRoot(getContext(), product_productroot);
	}

	/**
	 * Set value of Product_ProductRoot
	 * @param context
	 * @param product_productroot
	 */
	public final void setProduct_ProductRoot(com.mendix.systemwideinterfaces.core.IContext context, sap_integration.proxies.ProductRoot product_productroot)
	{
		if (product_productroot == null)
			getMendixObject().setValue(context, MemberNames.Product_ProductRoot.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Product_ProductRoot.toString(), product_productroot.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sap_integration.proxies.Product that = (sap_integration.proxies.Product) obj;
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
		return "SAP_Integration.Product";
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
