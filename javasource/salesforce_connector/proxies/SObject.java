// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesforce_connector.proxies;

public class SObject
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject sObjectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Salesforce_Connector.SObject";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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

	public SObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Salesforce_Connector.SObject"));
	}

	protected SObject(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sObjectMendixObject)
	{
		if (sObjectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Salesforce_Connector.SObject", sObjectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Salesforce_Connector.SObject");

		this.sObjectMendixObject = sObjectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SObject.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static salesforce_connector.proxies.SObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return salesforce_connector.proxies.SObject.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static salesforce_connector.proxies.SObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("Salesforce_Connector.Account", mendixObject.getType()))
			return salesforce_connector.proxies.Account.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Salesforce_Connector.ActivityHistory", mendixObject.getType()))
			return salesforce_connector.proxies.ActivityHistory.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Salesforce_Connector.Attachment", mendixObject.getType()))
			return salesforce_connector.proxies.Attachment.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Salesforce_Connector.Campaign", mendixObject.getType()))
			return salesforce_connector.proxies.Campaign.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Salesforce_Connector.CampaignMember", mendixObject.getType()))
			return salesforce_connector.proxies.CampaignMember.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Salesforce_Connector.Contact", mendixObject.getType()))
			return salesforce_connector.proxies.Contact.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Salesforce_Connector.Lead", mendixObject.getType()))
			return salesforce_connector.proxies.Lead.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Salesforce_Connector.Opportunity", mendixObject.getType()))
			return salesforce_connector.proxies.Opportunity.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Salesforce_Connector.User", mendixObject.getType()))
			return salesforce_connector.proxies.User.initialize(context, mendixObject);

		return new salesforce_connector.proxies.SObject(context, mendixObject);
	}

	public static salesforce_connector.proxies.SObject load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return salesforce_connector.proxies.SObject.initialize(context, mendixObject);
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
	 * @return value of Activateable
	 */
	public final java.lang.Boolean getActivateable()
	{
		return getActivateable(getContext());
	}

	/**
	 * @param context
	 * @return value of Activateable
	 */
	public final java.lang.Boolean getActivateable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Activateable.toString());
	}

	/**
	 * Set value of Activateable
	 * @param activateable
	 */
	public final void setActivateable(java.lang.Boolean activateable)
	{
		setActivateable(getContext(), activateable);
	}

	/**
	 * Set value of Activateable
	 * @param context
	 * @param activateable
	 */
	public final void setActivateable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean activateable)
	{
		getMendixObject().setValue(context, MemberNames.Activateable.toString(), activateable);
	}

	/**
	 * @return value of Createable
	 */
	public final java.lang.Boolean getCreateable()
	{
		return getCreateable(getContext());
	}

	/**
	 * @param context
	 * @return value of Createable
	 */
	public final java.lang.Boolean getCreateable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Createable.toString());
	}

	/**
	 * Set value of Createable
	 * @param createable
	 */
	public final void setCreateable(java.lang.Boolean createable)
	{
		setCreateable(getContext(), createable);
	}

	/**
	 * Set value of Createable
	 * @param context
	 * @param createable
	 */
	public final void setCreateable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean createable)
	{
		getMendixObject().setValue(context, MemberNames.Createable.toString(), createable);
	}

	/**
	 * @return value of Custom
	 */
	public final java.lang.Boolean getCustom()
	{
		return getCustom(getContext());
	}

	/**
	 * @param context
	 * @return value of Custom
	 */
	public final java.lang.Boolean getCustom(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Custom.toString());
	}

	/**
	 * Set value of Custom
	 * @param custom
	 */
	public final void setCustom(java.lang.Boolean custom)
	{
		setCustom(getContext(), custom);
	}

	/**
	 * Set value of Custom
	 * @param context
	 * @param custom
	 */
	public final void setCustom(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean custom)
	{
		getMendixObject().setValue(context, MemberNames.Custom.toString(), custom);
	}

	/**
	 * @return value of CustomSetting
	 */
	public final java.lang.Boolean getCustomSetting()
	{
		return getCustomSetting(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomSetting
	 */
	public final java.lang.Boolean getCustomSetting(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CustomSetting.toString());
	}

	/**
	 * Set value of CustomSetting
	 * @param customsetting
	 */
	public final void setCustomSetting(java.lang.Boolean customsetting)
	{
		setCustomSetting(getContext(), customsetting);
	}

	/**
	 * Set value of CustomSetting
	 * @param context
	 * @param customsetting
	 */
	public final void setCustomSetting(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean customsetting)
	{
		getMendixObject().setValue(context, MemberNames.CustomSetting.toString(), customsetting);
	}

	/**
	 * @return value of Deletable
	 */
	public final java.lang.Boolean getDeletable()
	{
		return getDeletable(getContext());
	}

	/**
	 * @param context
	 * @return value of Deletable
	 */
	public final java.lang.Boolean getDeletable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Deletable.toString());
	}

	/**
	 * Set value of Deletable
	 * @param deletable
	 */
	public final void setDeletable(java.lang.Boolean deletable)
	{
		setDeletable(getContext(), deletable);
	}

	/**
	 * Set value of Deletable
	 * @param context
	 * @param deletable
	 */
	public final void setDeletable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean deletable)
	{
		getMendixObject().setValue(context, MemberNames.Deletable.toString(), deletable);
	}

	/**
	 * @return value of DeprecatedAndHidden
	 */
	public final java.lang.Boolean getDeprecatedAndHidden()
	{
		return getDeprecatedAndHidden(getContext());
	}

	/**
	 * @param context
	 * @return value of DeprecatedAndHidden
	 */
	public final java.lang.Boolean getDeprecatedAndHidden(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DeprecatedAndHidden.toString());
	}

	/**
	 * Set value of DeprecatedAndHidden
	 * @param deprecatedandhidden
	 */
	public final void setDeprecatedAndHidden(java.lang.Boolean deprecatedandhidden)
	{
		setDeprecatedAndHidden(getContext(), deprecatedandhidden);
	}

	/**
	 * Set value of DeprecatedAndHidden
	 * @param context
	 * @param deprecatedandhidden
	 */
	public final void setDeprecatedAndHidden(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean deprecatedandhidden)
	{
		getMendixObject().setValue(context, MemberNames.DeprecatedAndHidden.toString(), deprecatedandhidden);
	}

	/**
	 * @return value of FeedEnabled
	 */
	public final java.lang.Boolean getFeedEnabled()
	{
		return getFeedEnabled(getContext());
	}

	/**
	 * @param context
	 * @return value of FeedEnabled
	 */
	public final java.lang.Boolean getFeedEnabled(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.FeedEnabled.toString());
	}

	/**
	 * Set value of FeedEnabled
	 * @param feedenabled
	 */
	public final void setFeedEnabled(java.lang.Boolean feedenabled)
	{
		setFeedEnabled(getContext(), feedenabled);
	}

	/**
	 * Set value of FeedEnabled
	 * @param context
	 * @param feedenabled
	 */
	public final void setFeedEnabled(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean feedenabled)
	{
		getMendixObject().setValue(context, MemberNames.FeedEnabled.toString(), feedenabled);
	}

	/**
	 * @return value of HasSubtypes
	 */
	public final java.lang.Boolean getHasSubtypes()
	{
		return getHasSubtypes(getContext());
	}

	/**
	 * @param context
	 * @return value of HasSubtypes
	 */
	public final java.lang.Boolean getHasSubtypes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HasSubtypes.toString());
	}

	/**
	 * Set value of HasSubtypes
	 * @param hassubtypes
	 */
	public final void setHasSubtypes(java.lang.Boolean hassubtypes)
	{
		setHasSubtypes(getContext(), hassubtypes);
	}

	/**
	 * Set value of HasSubtypes
	 * @param context
	 * @param hassubtypes
	 */
	public final void setHasSubtypes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hassubtypes)
	{
		getMendixObject().setValue(context, MemberNames.HasSubtypes.toString(), hassubtypes);
	}

	/**
	 * @return value of IsSubtype
	 */
	public final java.lang.Boolean getIsSubtype()
	{
		return getIsSubtype(getContext());
	}

	/**
	 * @param context
	 * @return value of IsSubtype
	 */
	public final java.lang.Boolean getIsSubtype(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsSubtype.toString());
	}

	/**
	 * Set value of IsSubtype
	 * @param issubtype
	 */
	public final void setIsSubtype(java.lang.Boolean issubtype)
	{
		setIsSubtype(getContext(), issubtype);
	}

	/**
	 * Set value of IsSubtype
	 * @param context
	 * @param issubtype
	 */
	public final void setIsSubtype(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean issubtype)
	{
		getMendixObject().setValue(context, MemberNames.IsSubtype.toString(), issubtype);
	}

	/**
	 * @return value of Label
	 */
	public final java.lang.String getLabel()
	{
		return getLabel(getContext());
	}

	/**
	 * @param context
	 * @return value of Label
	 */
	public final java.lang.String getLabel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Label.toString());
	}

	/**
	 * Set value of Label
	 * @param label
	 */
	public final void setLabel(java.lang.String label)
	{
		setLabel(getContext(), label);
	}

	/**
	 * Set value of Label
	 * @param context
	 * @param label
	 */
	public final void setLabel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String label)
	{
		getMendixObject().setValue(context, MemberNames.Label.toString(), label);
	}

	/**
	 * @return value of LabelPlural
	 */
	public final java.lang.String getLabelPlural()
	{
		return getLabelPlural(getContext());
	}

	/**
	 * @param context
	 * @return value of LabelPlural
	 */
	public final java.lang.String getLabelPlural(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LabelPlural.toString());
	}

	/**
	 * Set value of LabelPlural
	 * @param labelplural
	 */
	public final void setLabelPlural(java.lang.String labelplural)
	{
		setLabelPlural(getContext(), labelplural);
	}

	/**
	 * Set value of LabelPlural
	 * @param context
	 * @param labelplural
	 */
	public final void setLabelPlural(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String labelplural)
	{
		getMendixObject().setValue(context, MemberNames.LabelPlural.toString(), labelplural);
	}

	/**
	 * @return value of Layoutable
	 */
	public final java.lang.Boolean getLayoutable()
	{
		return getLayoutable(getContext());
	}

	/**
	 * @param context
	 * @return value of Layoutable
	 */
	public final java.lang.Boolean getLayoutable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Layoutable.toString());
	}

	/**
	 * Set value of Layoutable
	 * @param layoutable
	 */
	public final void setLayoutable(java.lang.Boolean layoutable)
	{
		setLayoutable(getContext(), layoutable);
	}

	/**
	 * Set value of Layoutable
	 * @param context
	 * @param layoutable
	 */
	public final void setLayoutable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean layoutable)
	{
		getMendixObject().setValue(context, MemberNames.Layoutable.toString(), layoutable);
	}

	/**
	 * @return value of Mergeable
	 */
	public final java.lang.Boolean getMergeable()
	{
		return getMergeable(getContext());
	}

	/**
	 * @param context
	 * @return value of Mergeable
	 */
	public final java.lang.Boolean getMergeable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Mergeable.toString());
	}

	/**
	 * Set value of Mergeable
	 * @param mergeable
	 */
	public final void setMergeable(java.lang.Boolean mergeable)
	{
		setMergeable(getContext(), mergeable);
	}

	/**
	 * Set value of Mergeable
	 * @param context
	 * @param mergeable
	 */
	public final void setMergeable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean mergeable)
	{
		getMendixObject().setValue(context, MemberNames.Mergeable.toString(), mergeable);
	}

	/**
	 * @return value of MruEnabled
	 */
	public final java.lang.Boolean getMruEnabled()
	{
		return getMruEnabled(getContext());
	}

	/**
	 * @param context
	 * @return value of MruEnabled
	 */
	public final java.lang.Boolean getMruEnabled(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.MruEnabled.toString());
	}

	/**
	 * Set value of MruEnabled
	 * @param mruenabled
	 */
	public final void setMruEnabled(java.lang.Boolean mruenabled)
	{
		setMruEnabled(getContext(), mruenabled);
	}

	/**
	 * Set value of MruEnabled
	 * @param context
	 * @param mruenabled
	 */
	public final void setMruEnabled(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean mruenabled)
	{
		getMendixObject().setValue(context, MemberNames.MruEnabled.toString(), mruenabled);
	}

	/**
	 * @return value of SObjectName
	 */
	public final java.lang.String getSObjectName()
	{
		return getSObjectName(getContext());
	}

	/**
	 * @param context
	 * @return value of SObjectName
	 */
	public final java.lang.String getSObjectName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SObjectName.toString());
	}

	/**
	 * Set value of SObjectName
	 * @param sobjectname
	 */
	public final void setSObjectName(java.lang.String sobjectname)
	{
		setSObjectName(getContext(), sobjectname);
	}

	/**
	 * Set value of SObjectName
	 * @param context
	 * @param sobjectname
	 */
	public final void setSObjectName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sobjectname)
	{
		getMendixObject().setValue(context, MemberNames.SObjectName.toString(), sobjectname);
	}

	/**
	 * @return value of Queryable
	 */
	public final java.lang.Boolean getQueryable()
	{
		return getQueryable(getContext());
	}

	/**
	 * @param context
	 * @return value of Queryable
	 */
	public final java.lang.Boolean getQueryable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Queryable.toString());
	}

	/**
	 * Set value of Queryable
	 * @param queryable
	 */
	public final void setQueryable(java.lang.Boolean queryable)
	{
		setQueryable(getContext(), queryable);
	}

	/**
	 * Set value of Queryable
	 * @param context
	 * @param queryable
	 */
	public final void setQueryable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean queryable)
	{
		getMendixObject().setValue(context, MemberNames.Queryable.toString(), queryable);
	}

	/**
	 * @return value of Replicateable
	 */
	public final java.lang.Boolean getReplicateable()
	{
		return getReplicateable(getContext());
	}

	/**
	 * @param context
	 * @return value of Replicateable
	 */
	public final java.lang.Boolean getReplicateable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Replicateable.toString());
	}

	/**
	 * Set value of Replicateable
	 * @param replicateable
	 */
	public final void setReplicateable(java.lang.Boolean replicateable)
	{
		setReplicateable(getContext(), replicateable);
	}

	/**
	 * Set value of Replicateable
	 * @param context
	 * @param replicateable
	 */
	public final void setReplicateable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean replicateable)
	{
		getMendixObject().setValue(context, MemberNames.Replicateable.toString(), replicateable);
	}

	/**
	 * @return value of Retrieveable
	 */
	public final java.lang.Boolean getRetrieveable()
	{
		return getRetrieveable(getContext());
	}

	/**
	 * @param context
	 * @return value of Retrieveable
	 */
	public final java.lang.Boolean getRetrieveable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Retrieveable.toString());
	}

	/**
	 * Set value of Retrieveable
	 * @param retrieveable
	 */
	public final void setRetrieveable(java.lang.Boolean retrieveable)
	{
		setRetrieveable(getContext(), retrieveable);
	}

	/**
	 * Set value of Retrieveable
	 * @param context
	 * @param retrieveable
	 */
	public final void setRetrieveable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean retrieveable)
	{
		getMendixObject().setValue(context, MemberNames.Retrieveable.toString(), retrieveable);
	}

	/**
	 * @return value of Searchable
	 */
	public final java.lang.Boolean getSearchable()
	{
		return getSearchable(getContext());
	}

	/**
	 * @param context
	 * @return value of Searchable
	 */
	public final java.lang.Boolean getSearchable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Searchable.toString());
	}

	/**
	 * Set value of Searchable
	 * @param searchable
	 */
	public final void setSearchable(java.lang.Boolean searchable)
	{
		setSearchable(getContext(), searchable);
	}

	/**
	 * Set value of Searchable
	 * @param context
	 * @param searchable
	 */
	public final void setSearchable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean searchable)
	{
		getMendixObject().setValue(context, MemberNames.Searchable.toString(), searchable);
	}

	/**
	 * @return value of Triggerable
	 */
	public final java.lang.Boolean getTriggerable()
	{
		return getTriggerable(getContext());
	}

	/**
	 * @param context
	 * @return value of Triggerable
	 */
	public final java.lang.Boolean getTriggerable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Triggerable.toString());
	}

	/**
	 * Set value of Triggerable
	 * @param triggerable
	 */
	public final void setTriggerable(java.lang.Boolean triggerable)
	{
		setTriggerable(getContext(), triggerable);
	}

	/**
	 * Set value of Triggerable
	 * @param context
	 * @param triggerable
	 */
	public final void setTriggerable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean triggerable)
	{
		getMendixObject().setValue(context, MemberNames.Triggerable.toString(), triggerable);
	}

	/**
	 * @return value of Undeletable
	 */
	public final java.lang.Boolean getUndeletable()
	{
		return getUndeletable(getContext());
	}

	/**
	 * @param context
	 * @return value of Undeletable
	 */
	public final java.lang.Boolean getUndeletable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Undeletable.toString());
	}

	/**
	 * Set value of Undeletable
	 * @param undeletable
	 */
	public final void setUndeletable(java.lang.Boolean undeletable)
	{
		setUndeletable(getContext(), undeletable);
	}

	/**
	 * Set value of Undeletable
	 * @param context
	 * @param undeletable
	 */
	public final void setUndeletable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean undeletable)
	{
		getMendixObject().setValue(context, MemberNames.Undeletable.toString(), undeletable);
	}

	/**
	 * @return value of Updateable
	 */
	public final java.lang.Boolean getUpdateable()
	{
		return getUpdateable(getContext());
	}

	/**
	 * @param context
	 * @return value of Updateable
	 */
	public final java.lang.Boolean getUpdateable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Updateable.toString());
	}

	/**
	 * Set value of Updateable
	 * @param updateable
	 */
	public final void setUpdateable(java.lang.Boolean updateable)
	{
		setUpdateable(getContext(), updateable);
	}

	/**
	 * Set value of Updateable
	 * @param context
	 * @param updateable
	 */
	public final void setUpdateable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean updateable)
	{
		getMendixObject().setValue(context, MemberNames.Updateable.toString(), updateable);
	}

	/**
	 * @return value of KeyPrefix
	 */
	public final java.lang.String getKeyPrefix()
	{
		return getKeyPrefix(getContext());
	}

	/**
	 * @param context
	 * @return value of KeyPrefix
	 */
	public final java.lang.String getKeyPrefix(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.KeyPrefix.toString());
	}

	/**
	 * Set value of KeyPrefix
	 * @param keyprefix
	 */
	public final void setKeyPrefix(java.lang.String keyprefix)
	{
		setKeyPrefix(getContext(), keyprefix);
	}

	/**
	 * Set value of KeyPrefix
	 * @param context
	 * @param keyprefix
	 */
	public final void setKeyPrefix(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String keyprefix)
	{
		getMendixObject().setValue(context, MemberNames.KeyPrefix.toString(), keyprefix);
	}

	/**
	 * @return value of _Id
	 */
	public final java.lang.String get_Id()
	{
		return get_Id(getContext());
	}

	/**
	 * @param context
	 * @return value of _Id
	 */
	public final java.lang.String get_Id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._Id.toString());
	}

	/**
	 * Set value of _Id
	 * @param _id
	 */
	public final void set_Id(java.lang.String _id)
	{
		set_Id(getContext(), _id);
	}

	/**
	 * Set value of _Id
	 * @param context
	 * @param _id
	 */
	public final void set_Id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _id)
	{
		getMendixObject().setValue(context, MemberNames._Id.toString(), _id);
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
	 * @return value of LastModifiedDate
	 */
	public final java.util.Date getLastModifiedDate()
	{
		return getLastModifiedDate(getContext());
	}

	/**
	 * @param context
	 * @return value of LastModifiedDate
	 */
	public final java.util.Date getLastModifiedDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.LastModifiedDate.toString());
	}

	/**
	 * Set value of LastModifiedDate
	 * @param lastmodifieddate
	 */
	public final void setLastModifiedDate(java.util.Date lastmodifieddate)
	{
		setLastModifiedDate(getContext(), lastmodifieddate);
	}

	/**
	 * Set value of LastModifiedDate
	 * @param context
	 * @param lastmodifieddate
	 */
	public final void setLastModifiedDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date lastmodifieddate)
	{
		getMendixObject().setValue(context, MemberNames.LastModifiedDate.toString(), lastmodifieddate);
	}

	/**
	 * @return value of LastModifiedById
	 */
	public final java.lang.String getLastModifiedById()
	{
		return getLastModifiedById(getContext());
	}

	/**
	 * @param context
	 * @return value of LastModifiedById
	 */
	public final java.lang.String getLastModifiedById(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastModifiedById.toString());
	}

	/**
	 * Set value of LastModifiedById
	 * @param lastmodifiedbyid
	 */
	public final void setLastModifiedById(java.lang.String lastmodifiedbyid)
	{
		setLastModifiedById(getContext(), lastmodifiedbyid);
	}

	/**
	 * Set value of LastModifiedById
	 * @param context
	 * @param lastmodifiedbyid
	 */
	public final void setLastModifiedById(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastmodifiedbyid)
	{
		getMendixObject().setValue(context, MemberNames.LastModifiedById.toString(), lastmodifiedbyid);
	}

	/**
	 * @return value of _CreatedDate
	 */
	public final java.util.Date get_CreatedDate()
	{
		return get_CreatedDate(getContext());
	}

	/**
	 * @param context
	 * @return value of _CreatedDate
	 */
	public final java.util.Date get_CreatedDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames._CreatedDate.toString());
	}

	/**
	 * Set value of _CreatedDate
	 * @param _createddate
	 */
	public final void set_CreatedDate(java.util.Date _createddate)
	{
		set_CreatedDate(getContext(), _createddate);
	}

	/**
	 * Set value of _CreatedDate
	 * @param context
	 * @param _createddate
	 */
	public final void set_CreatedDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date _createddate)
	{
		getMendixObject().setValue(context, MemberNames._CreatedDate.toString(), _createddate);
	}

	/**
	 * @return value of CreatedById
	 */
	public final java.lang.String getCreatedById()
	{
		return getCreatedById(getContext());
	}

	/**
	 * @param context
	 * @return value of CreatedById
	 */
	public final java.lang.String getCreatedById(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CreatedById.toString());
	}

	/**
	 * Set value of CreatedById
	 * @param createdbyid
	 */
	public final void setCreatedById(java.lang.String createdbyid)
	{
		setCreatedById(getContext(), createdbyid);
	}

	/**
	 * Set value of CreatedById
	 * @param context
	 * @param createdbyid
	 */
	public final void setCreatedById(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String createdbyid)
	{
		getMendixObject().setValue(context, MemberNames.CreatedById.toString(), createdbyid);
	}

	/**
	 * @return value of Urls_SObject
	 */
	public final salesforce_connector.proxies.Urls getUrls_SObject() throws com.mendix.core.CoreException
	{
		return getUrls_SObject(getContext());
	}

	/**
	 * @param context
	 * @return value of Urls_SObject
	 */
	public final salesforce_connector.proxies.Urls getUrls_SObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.Urls result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Urls_SObject.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.Urls.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Urls_SObject
	 * @param urls_sobject
	 */
	public final void setUrls_SObject(salesforce_connector.proxies.Urls urls_sobject)
	{
		setUrls_SObject(getContext(), urls_sobject);
	}

	/**
	 * Set value of Urls_SObject
	 * @param context
	 * @param urls_sobject
	 */
	public final void setUrls_SObject(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.Urls urls_sobject)
	{
		if (urls_sobject == null)
			getMendixObject().setValue(context, MemberNames.Urls_SObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Urls_SObject.toString(), urls_sobject.getMendixObject().getId());
	}

	/**
	 * @return value of SObject_Query
	 */
	public final salesforce_connector.proxies.Query getSObject_Query() throws com.mendix.core.CoreException
	{
		return getSObject_Query(getContext());
	}

	/**
	 * @param context
	 * @return value of SObject_Query
	 */
	public final salesforce_connector.proxies.Query getSObject_Query(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.Query result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SObject_Query.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.Query.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SObject_Query
	 * @param sobject_query
	 */
	public final void setSObject_Query(salesforce_connector.proxies.Query sobject_query)
	{
		setSObject_Query(getContext(), sobject_query);
	}

	/**
	 * Set value of SObject_Query
	 * @param context
	 * @param sobject_query
	 */
	public final void setSObject_Query(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.Query sobject_query)
	{
		if (sobject_query == null)
			getMendixObject().setValue(context, MemberNames.SObject_Query.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SObject_Query.toString(), sobject_query.getMendixObject().getId());
	}

	/**
	 * @return value of Attributes_SObject
	 */
	public final salesforce_connector.proxies.Attributes getAttributes_SObject() throws com.mendix.core.CoreException
	{
		return getAttributes_SObject(getContext());
	}

	/**
	 * @param context
	 * @return value of Attributes_SObject
	 */
	public final salesforce_connector.proxies.Attributes getAttributes_SObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.Attributes result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Attributes_SObject.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.Attributes.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Attributes_SObject
	 * @param attributes_sobject
	 */
	public final void setAttributes_SObject(salesforce_connector.proxies.Attributes attributes_sobject)
	{
		setAttributes_SObject(getContext(), attributes_sobject);
	}

	/**
	 * Set value of Attributes_SObject
	 * @param context
	 * @param attributes_sobject
	 */
	public final void setAttributes_SObject(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.Attributes attributes_sobject)
	{
		if (attributes_sobject == null)
			getMendixObject().setValue(context, MemberNames.Attributes_SObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Attributes_SObject.toString(), attributes_sobject.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return sObjectMendixObject;
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
			final salesforce_connector.proxies.SObject that = (salesforce_connector.proxies.SObject) obj;
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
		return "Salesforce_Connector.SObject";
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
