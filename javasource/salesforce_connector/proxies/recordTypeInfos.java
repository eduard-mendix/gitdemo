// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesforce_connector.proxies;

public class recordTypeInfos
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject recordTypeInfosMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Salesforce_Connector.recordTypeInfos";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Active("Active"),
		Available("Available"),
		DefaultRecordTypeMapping("DefaultRecordTypeMapping"),
		DeveloperName("DeveloperName"),
		Master("Master"),
		Name("Name"),
		RecordTypeId("RecordTypeId"),
		recordTypeInfos_SObject("Salesforce_Connector.recordTypeInfos_SObject"),
		Urls_recordTypeInfos("Salesforce_Connector.Urls_recordTypeInfos");

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

	public recordTypeInfos(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Salesforce_Connector.recordTypeInfos"));
	}

	protected recordTypeInfos(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject recordTypeInfosMendixObject)
	{
		if (recordTypeInfosMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Salesforce_Connector.recordTypeInfos", recordTypeInfosMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Salesforce_Connector.recordTypeInfos");

		this.recordTypeInfosMendixObject = recordTypeInfosMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'recordTypeInfos.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static salesforce_connector.proxies.recordTypeInfos initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return salesforce_connector.proxies.recordTypeInfos.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static salesforce_connector.proxies.recordTypeInfos initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new salesforce_connector.proxies.recordTypeInfos(context, mendixObject);
	}

	public static salesforce_connector.proxies.recordTypeInfos load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return salesforce_connector.proxies.recordTypeInfos.initialize(context, mendixObject);
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
	 * @return value of Active
	 */
	public final java.lang.Boolean getActive()
	{
		return getActive(getContext());
	}

	/**
	 * @param context
	 * @return value of Active
	 */
	public final java.lang.Boolean getActive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Active.toString());
	}

	/**
	 * Set value of Active
	 * @param active
	 */
	public final void setActive(java.lang.Boolean active)
	{
		setActive(getContext(), active);
	}

	/**
	 * Set value of Active
	 * @param context
	 * @param active
	 */
	public final void setActive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean active)
	{
		getMendixObject().setValue(context, MemberNames.Active.toString(), active);
	}

	/**
	 * @return value of Available
	 */
	public final java.lang.Boolean getAvailable()
	{
		return getAvailable(getContext());
	}

	/**
	 * @param context
	 * @return value of Available
	 */
	public final java.lang.Boolean getAvailable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Available.toString());
	}

	/**
	 * Set value of Available
	 * @param available
	 */
	public final void setAvailable(java.lang.Boolean available)
	{
		setAvailable(getContext(), available);
	}

	/**
	 * Set value of Available
	 * @param context
	 * @param available
	 */
	public final void setAvailable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean available)
	{
		getMendixObject().setValue(context, MemberNames.Available.toString(), available);
	}

	/**
	 * @return value of DefaultRecordTypeMapping
	 */
	public final java.lang.Boolean getDefaultRecordTypeMapping()
	{
		return getDefaultRecordTypeMapping(getContext());
	}

	/**
	 * @param context
	 * @return value of DefaultRecordTypeMapping
	 */
	public final java.lang.Boolean getDefaultRecordTypeMapping(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DefaultRecordTypeMapping.toString());
	}

	/**
	 * Set value of DefaultRecordTypeMapping
	 * @param defaultrecordtypemapping
	 */
	public final void setDefaultRecordTypeMapping(java.lang.Boolean defaultrecordtypemapping)
	{
		setDefaultRecordTypeMapping(getContext(), defaultrecordtypemapping);
	}

	/**
	 * Set value of DefaultRecordTypeMapping
	 * @param context
	 * @param defaultrecordtypemapping
	 */
	public final void setDefaultRecordTypeMapping(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean defaultrecordtypemapping)
	{
		getMendixObject().setValue(context, MemberNames.DefaultRecordTypeMapping.toString(), defaultrecordtypemapping);
	}

	/**
	 * @return value of DeveloperName
	 */
	public final java.lang.String getDeveloperName()
	{
		return getDeveloperName(getContext());
	}

	/**
	 * @param context
	 * @return value of DeveloperName
	 */
	public final java.lang.String getDeveloperName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DeveloperName.toString());
	}

	/**
	 * Set value of DeveloperName
	 * @param developername
	 */
	public final void setDeveloperName(java.lang.String developername)
	{
		setDeveloperName(getContext(), developername);
	}

	/**
	 * Set value of DeveloperName
	 * @param context
	 * @param developername
	 */
	public final void setDeveloperName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String developername)
	{
		getMendixObject().setValue(context, MemberNames.DeveloperName.toString(), developername);
	}

	/**
	 * @return value of Master
	 */
	public final java.lang.Boolean getMaster()
	{
		return getMaster(getContext());
	}

	/**
	 * @param context
	 * @return value of Master
	 */
	public final java.lang.Boolean getMaster(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Master.toString());
	}

	/**
	 * Set value of Master
	 * @param master
	 */
	public final void setMaster(java.lang.Boolean master)
	{
		setMaster(getContext(), master);
	}

	/**
	 * Set value of Master
	 * @param context
	 * @param master
	 */
	public final void setMaster(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean master)
	{
		getMendixObject().setValue(context, MemberNames.Master.toString(), master);
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
	 * @return value of RecordTypeId
	 */
	public final java.lang.String getRecordTypeId()
	{
		return getRecordTypeId(getContext());
	}

	/**
	 * @param context
	 * @return value of RecordTypeId
	 */
	public final java.lang.String getRecordTypeId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.RecordTypeId.toString());
	}

	/**
	 * Set value of RecordTypeId
	 * @param recordtypeid
	 */
	public final void setRecordTypeId(java.lang.String recordtypeid)
	{
		setRecordTypeId(getContext(), recordtypeid);
	}

	/**
	 * Set value of RecordTypeId
	 * @param context
	 * @param recordtypeid
	 */
	public final void setRecordTypeId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String recordtypeid)
	{
		getMendixObject().setValue(context, MemberNames.RecordTypeId.toString(), recordtypeid);
	}

	/**
	 * @return value of recordTypeInfos_SObject
	 */
	public final salesforce_connector.proxies.SObject getrecordTypeInfos_SObject() throws com.mendix.core.CoreException
	{
		return getrecordTypeInfos_SObject(getContext());
	}

	/**
	 * @param context
	 * @return value of recordTypeInfos_SObject
	 */
	public final salesforce_connector.proxies.SObject getrecordTypeInfos_SObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.SObject result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.recordTypeInfos_SObject.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.SObject.load(context, identifier);
		return result;
	}

	/**
	 * Set value of recordTypeInfos_SObject
	 * @param recordtypeinfos_sobject
	 */
	public final void setrecordTypeInfos_SObject(salesforce_connector.proxies.SObject recordtypeinfos_sobject)
	{
		setrecordTypeInfos_SObject(getContext(), recordtypeinfos_sobject);
	}

	/**
	 * Set value of recordTypeInfos_SObject
	 * @param context
	 * @param recordtypeinfos_sobject
	 */
	public final void setrecordTypeInfos_SObject(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.SObject recordtypeinfos_sobject)
	{
		if (recordtypeinfos_sobject == null)
			getMendixObject().setValue(context, MemberNames.recordTypeInfos_SObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.recordTypeInfos_SObject.toString(), recordtypeinfos_sobject.getMendixObject().getId());
	}

	/**
	 * @return value of Urls_recordTypeInfos
	 */
	public final salesforce_connector.proxies.Urls getUrls_recordTypeInfos() throws com.mendix.core.CoreException
	{
		return getUrls_recordTypeInfos(getContext());
	}

	/**
	 * @param context
	 * @return value of Urls_recordTypeInfos
	 */
	public final salesforce_connector.proxies.Urls getUrls_recordTypeInfos(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.Urls result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Urls_recordTypeInfos.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.Urls.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Urls_recordTypeInfos
	 * @param urls_recordtypeinfos
	 */
	public final void setUrls_recordTypeInfos(salesforce_connector.proxies.Urls urls_recordtypeinfos)
	{
		setUrls_recordTypeInfos(getContext(), urls_recordtypeinfos);
	}

	/**
	 * Set value of Urls_recordTypeInfos
	 * @param context
	 * @param urls_recordtypeinfos
	 */
	public final void setUrls_recordTypeInfos(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.Urls urls_recordtypeinfos)
	{
		if (urls_recordtypeinfos == null)
			getMendixObject().setValue(context, MemberNames.Urls_recordTypeInfos.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Urls_recordTypeInfos.toString(), urls_recordtypeinfos.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return recordTypeInfosMendixObject;
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
			final salesforce_connector.proxies.recordTypeInfos that = (salesforce_connector.proxies.recordTypeInfos) obj;
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
		return "Salesforce_Connector.recordTypeInfos";
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
