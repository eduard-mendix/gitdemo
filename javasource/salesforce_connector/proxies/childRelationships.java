// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesforce_connector.proxies;

public class childRelationships
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject childRelationshipsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Salesforce_Connector.childRelationships";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CascadeDelete("CascadeDelete"),
		ChildSObject("ChildSObject"),
		DeprecatedAndHidden("DeprecatedAndHidden"),
		Field("Field"),
		RelationshipName("RelationshipName"),
		RestrictedDelete("RestrictedDelete"),
		childRelationships_SObject("Salesforce_Connector.childRelationships_SObject"),
		JunctionIdListNames_childRelationships("Salesforce_Connector.JunctionIdListNames_childRelationships"),
		JunctionReferenceTo_childRelationships("Salesforce_Connector.JunctionReferenceTo_childRelationships");

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

	public childRelationships(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Salesforce_Connector.childRelationships"));
	}

	protected childRelationships(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject childRelationshipsMendixObject)
	{
		if (childRelationshipsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Salesforce_Connector.childRelationships", childRelationshipsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Salesforce_Connector.childRelationships");

		this.childRelationshipsMendixObject = childRelationshipsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'childRelationships.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static salesforce_connector.proxies.childRelationships initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return salesforce_connector.proxies.childRelationships.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static salesforce_connector.proxies.childRelationships initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new salesforce_connector.proxies.childRelationships(context, mendixObject);
	}

	public static salesforce_connector.proxies.childRelationships load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return salesforce_connector.proxies.childRelationships.initialize(context, mendixObject);
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
	 * @return value of CascadeDelete
	 */
	public final java.lang.Boolean getCascadeDelete()
	{
		return getCascadeDelete(getContext());
	}

	/**
	 * @param context
	 * @return value of CascadeDelete
	 */
	public final java.lang.Boolean getCascadeDelete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CascadeDelete.toString());
	}

	/**
	 * Set value of CascadeDelete
	 * @param cascadedelete
	 */
	public final void setCascadeDelete(java.lang.Boolean cascadedelete)
	{
		setCascadeDelete(getContext(), cascadedelete);
	}

	/**
	 * Set value of CascadeDelete
	 * @param context
	 * @param cascadedelete
	 */
	public final void setCascadeDelete(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean cascadedelete)
	{
		getMendixObject().setValue(context, MemberNames.CascadeDelete.toString(), cascadedelete);
	}

	/**
	 * @return value of ChildSObject
	 */
	public final java.lang.String getChildSObject()
	{
		return getChildSObject(getContext());
	}

	/**
	 * @param context
	 * @return value of ChildSObject
	 */
	public final java.lang.String getChildSObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ChildSObject.toString());
	}

	/**
	 * Set value of ChildSObject
	 * @param childsobject
	 */
	public final void setChildSObject(java.lang.String childsobject)
	{
		setChildSObject(getContext(), childsobject);
	}

	/**
	 * Set value of ChildSObject
	 * @param context
	 * @param childsobject
	 */
	public final void setChildSObject(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String childsobject)
	{
		getMendixObject().setValue(context, MemberNames.ChildSObject.toString(), childsobject);
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
	 * @return value of Field
	 */
	public final java.lang.String getField()
	{
		return getField(getContext());
	}

	/**
	 * @param context
	 * @return value of Field
	 */
	public final java.lang.String getField(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Field.toString());
	}

	/**
	 * Set value of Field
	 * @param field
	 */
	public final void setField(java.lang.String field)
	{
		setField(getContext(), field);
	}

	/**
	 * Set value of Field
	 * @param context
	 * @param field
	 */
	public final void setField(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String field)
	{
		getMendixObject().setValue(context, MemberNames.Field.toString(), field);
	}

	/**
	 * @return value of RelationshipName
	 */
	public final java.lang.String getRelationshipName()
	{
		return getRelationshipName(getContext());
	}

	/**
	 * @param context
	 * @return value of RelationshipName
	 */
	public final java.lang.String getRelationshipName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.RelationshipName.toString());
	}

	/**
	 * Set value of RelationshipName
	 * @param relationshipname
	 */
	public final void setRelationshipName(java.lang.String relationshipname)
	{
		setRelationshipName(getContext(), relationshipname);
	}

	/**
	 * Set value of RelationshipName
	 * @param context
	 * @param relationshipname
	 */
	public final void setRelationshipName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String relationshipname)
	{
		getMendixObject().setValue(context, MemberNames.RelationshipName.toString(), relationshipname);
	}

	/**
	 * @return value of RestrictedDelete
	 */
	public final java.lang.Boolean getRestrictedDelete()
	{
		return getRestrictedDelete(getContext());
	}

	/**
	 * @param context
	 * @return value of RestrictedDelete
	 */
	public final java.lang.Boolean getRestrictedDelete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.RestrictedDelete.toString());
	}

	/**
	 * Set value of RestrictedDelete
	 * @param restricteddelete
	 */
	public final void setRestrictedDelete(java.lang.Boolean restricteddelete)
	{
		setRestrictedDelete(getContext(), restricteddelete);
	}

	/**
	 * Set value of RestrictedDelete
	 * @param context
	 * @param restricteddelete
	 */
	public final void setRestrictedDelete(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean restricteddelete)
	{
		getMendixObject().setValue(context, MemberNames.RestrictedDelete.toString(), restricteddelete);
	}

	/**
	 * @return value of childRelationships_SObject
	 */
	public final salesforce_connector.proxies.SObject getchildRelationships_SObject() throws com.mendix.core.CoreException
	{
		return getchildRelationships_SObject(getContext());
	}

	/**
	 * @param context
	 * @return value of childRelationships_SObject
	 */
	public final salesforce_connector.proxies.SObject getchildRelationships_SObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.SObject result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.childRelationships_SObject.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.SObject.load(context, identifier);
		return result;
	}

	/**
	 * Set value of childRelationships_SObject
	 * @param childrelationships_sobject
	 */
	public final void setchildRelationships_SObject(salesforce_connector.proxies.SObject childrelationships_sobject)
	{
		setchildRelationships_SObject(getContext(), childrelationships_sobject);
	}

	/**
	 * Set value of childRelationships_SObject
	 * @param context
	 * @param childrelationships_sobject
	 */
	public final void setchildRelationships_SObject(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.SObject childrelationships_sobject)
	{
		if (childrelationships_sobject == null)
			getMendixObject().setValue(context, MemberNames.childRelationships_SObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.childRelationships_SObject.toString(), childrelationships_sobject.getMendixObject().getId());
	}

	/**
	 * @return value of JunctionIdListNames_childRelationships
	 */
	public final salesforce_connector.proxies.JunctionIdListNames getJunctionIdListNames_childRelationships() throws com.mendix.core.CoreException
	{
		return getJunctionIdListNames_childRelationships(getContext());
	}

	/**
	 * @param context
	 * @return value of JunctionIdListNames_childRelationships
	 */
	public final salesforce_connector.proxies.JunctionIdListNames getJunctionIdListNames_childRelationships(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.JunctionIdListNames result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.JunctionIdListNames_childRelationships.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.JunctionIdListNames.load(context, identifier);
		return result;
	}

	/**
	 * Set value of JunctionIdListNames_childRelationships
	 * @param junctionidlistnames_childrelationships
	 */
	public final void setJunctionIdListNames_childRelationships(salesforce_connector.proxies.JunctionIdListNames junctionidlistnames_childrelationships)
	{
		setJunctionIdListNames_childRelationships(getContext(), junctionidlistnames_childrelationships);
	}

	/**
	 * Set value of JunctionIdListNames_childRelationships
	 * @param context
	 * @param junctionidlistnames_childrelationships
	 */
	public final void setJunctionIdListNames_childRelationships(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.JunctionIdListNames junctionidlistnames_childrelationships)
	{
		if (junctionidlistnames_childrelationships == null)
			getMendixObject().setValue(context, MemberNames.JunctionIdListNames_childRelationships.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.JunctionIdListNames_childRelationships.toString(), junctionidlistnames_childrelationships.getMendixObject().getId());
	}

	/**
	 * @return value of JunctionReferenceTo_childRelationships
	 */
	public final salesforce_connector.proxies.JunctionReferenceTo getJunctionReferenceTo_childRelationships() throws com.mendix.core.CoreException
	{
		return getJunctionReferenceTo_childRelationships(getContext());
	}

	/**
	 * @param context
	 * @return value of JunctionReferenceTo_childRelationships
	 */
	public final salesforce_connector.proxies.JunctionReferenceTo getJunctionReferenceTo_childRelationships(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		salesforce_connector.proxies.JunctionReferenceTo result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.JunctionReferenceTo_childRelationships.toString());
		if (identifier != null)
			result = salesforce_connector.proxies.JunctionReferenceTo.load(context, identifier);
		return result;
	}

	/**
	 * Set value of JunctionReferenceTo_childRelationships
	 * @param junctionreferenceto_childrelationships
	 */
	public final void setJunctionReferenceTo_childRelationships(salesforce_connector.proxies.JunctionReferenceTo junctionreferenceto_childrelationships)
	{
		setJunctionReferenceTo_childRelationships(getContext(), junctionreferenceto_childrelationships);
	}

	/**
	 * Set value of JunctionReferenceTo_childRelationships
	 * @param context
	 * @param junctionreferenceto_childrelationships
	 */
	public final void setJunctionReferenceTo_childRelationships(com.mendix.systemwideinterfaces.core.IContext context, salesforce_connector.proxies.JunctionReferenceTo junctionreferenceto_childrelationships)
	{
		if (junctionreferenceto_childrelationships == null)
			getMendixObject().setValue(context, MemberNames.JunctionReferenceTo_childRelationships.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.JunctionReferenceTo_childRelationships.toString(), junctionreferenceto_childrelationships.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return childRelationshipsMendixObject;
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
			final salesforce_connector.proxies.childRelationships that = (salesforce_connector.proxies.childRelationships) obj;
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
		return "Salesforce_Connector.childRelationships";
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
