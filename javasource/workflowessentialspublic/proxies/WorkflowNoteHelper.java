// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowessentialspublic.proxies;

public class WorkflowNoteHelper
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workflowNoteHelperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowEssentialsPublic.WorkflowNoteHelper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Content("Content"),
		EditMode("EditMode"),
		WorkflowNoteHelper_WorkflowNote("WorkflowEssentialsPublic.WorkflowNoteHelper_WorkflowNote");

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

	public WorkflowNoteHelper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowEssentialsPublic.WorkflowNoteHelper"));
	}

	protected WorkflowNoteHelper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workflowNoteHelperMendixObject)
	{
		if (workflowNoteHelperMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("WorkflowEssentialsPublic.WorkflowNoteHelper", workflowNoteHelperMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowEssentialsPublic.WorkflowNoteHelper");

		this.workflowNoteHelperMendixObject = workflowNoteHelperMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'WorkflowNoteHelper.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static workflowessentialspublic.proxies.WorkflowNoteHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowessentialspublic.proxies.WorkflowNoteHelper.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowessentialspublic.proxies.WorkflowNoteHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowessentialspublic.proxies.WorkflowNoteHelper(context, mendixObject);
	}

	public static workflowessentialspublic.proxies.WorkflowNoteHelper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowessentialspublic.proxies.WorkflowNoteHelper.initialize(context, mendixObject);
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
	 * @return value of Content
	 */
	public final java.lang.String getContent()
	{
		return getContent(getContext());
	}

	/**
	 * @param context
	 * @return value of Content
	 */
	public final java.lang.String getContent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Content.toString());
	}

	/**
	 * Set value of Content
	 * @param content
	 */
	public final void setContent(java.lang.String content)
	{
		setContent(getContext(), content);
	}

	/**
	 * Set value of Content
	 * @param context
	 * @param content
	 */
	public final void setContent(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String content)
	{
		getMendixObject().setValue(context, MemberNames.Content.toString(), content);
	}

	/**
	 * @return value of EditMode
	 */
	public final java.lang.Boolean getEditMode()
	{
		return getEditMode(getContext());
	}

	/**
	 * @param context
	 * @return value of EditMode
	 */
	public final java.lang.Boolean getEditMode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.EditMode.toString());
	}

	/**
	 * Set value of EditMode
	 * @param editmode
	 */
	public final void setEditMode(java.lang.Boolean editmode)
	{
		setEditMode(getContext(), editmode);
	}

	/**
	 * Set value of EditMode
	 * @param context
	 * @param editmode
	 */
	public final void setEditMode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean editmode)
	{
		getMendixObject().setValue(context, MemberNames.EditMode.toString(), editmode);
	}

	/**
	 * @return value of WorkflowNoteHelper_WorkflowNote
	 */
	public final workflowessentialspublic.proxies.WorkflowNote getWorkflowNoteHelper_WorkflowNote() throws com.mendix.core.CoreException
	{
		return getWorkflowNoteHelper_WorkflowNote(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowNoteHelper_WorkflowNote
	 */
	public final workflowessentialspublic.proxies.WorkflowNote getWorkflowNoteHelper_WorkflowNote(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowessentialspublic.proxies.WorkflowNote result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowNoteHelper_WorkflowNote.toString());
		if (identifier != null)
			result = workflowessentialspublic.proxies.WorkflowNote.load(context, identifier);
		return result;
	}

	/**
	 * Set value of WorkflowNoteHelper_WorkflowNote
	 * @param workflownotehelper_workflownote
	 */
	public final void setWorkflowNoteHelper_WorkflowNote(workflowessentialspublic.proxies.WorkflowNote workflownotehelper_workflownote)
	{
		setWorkflowNoteHelper_WorkflowNote(getContext(), workflownotehelper_workflownote);
	}

	/**
	 * Set value of WorkflowNoteHelper_WorkflowNote
	 * @param context
	 * @param workflownotehelper_workflownote
	 */
	public final void setWorkflowNoteHelper_WorkflowNote(com.mendix.systemwideinterfaces.core.IContext context, workflowessentialspublic.proxies.WorkflowNote workflownotehelper_workflownote)
	{
		if (workflownotehelper_workflownote == null)
			getMendixObject().setValue(context, MemberNames.WorkflowNoteHelper_WorkflowNote.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.WorkflowNoteHelper_WorkflowNote.toString(), workflownotehelper_workflownote.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workflowNoteHelperMendixObject;
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
			final workflowessentialspublic.proxies.WorkflowNoteHelper that = (workflowessentialspublic.proxies.WorkflowNoteHelper) obj;
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
		return "WorkflowEssentialsPublic.WorkflowNoteHelper";
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
