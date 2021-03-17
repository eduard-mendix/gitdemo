// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class WorkflowContext
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workflowContextMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.WorkflowContext";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		WorkflowInstance_WorkflowContext("System.WorkflowInstance_WorkflowContext");

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

	public WorkflowContext(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "System.WorkflowContext"));
	}

	protected WorkflowContext(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workflowContextMendixObject)
	{
		if (workflowContextMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("System.WorkflowContext", workflowContextMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a System.WorkflowContext");

		this.workflowContextMendixObject = workflowContextMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'WorkflowContext.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static system.proxies.WorkflowContext initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return system.proxies.WorkflowContext.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static system.proxies.WorkflowContext initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("MasterData.Incident", mendixObject.getType()))
			return masterdata.proxies.Incident.initialize(context, mendixObject);

		return new system.proxies.WorkflowContext(context, mendixObject);
	}

	public static system.proxies.WorkflowContext load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.WorkflowContext.initialize(context, mendixObject);
	}

	public static java.util.List<? extends system.proxies.WorkflowContext> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<system.proxies.WorkflowContext> result = new java.util.ArrayList<system.proxies.WorkflowContext>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//System.WorkflowContext" + xpathConstraint))
			result.add(system.proxies.WorkflowContext.initialize(context, obj));
		return result;
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
	 * @return value of WorkflowInstance_WorkflowContext
	 */
	public final system.proxies.WorkflowInstance getWorkflowInstance_WorkflowContext() throws com.mendix.core.CoreException
	{
		return getWorkflowInstance_WorkflowContext(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowInstance_WorkflowContext
	 */
	public final system.proxies.WorkflowInstance getWorkflowInstance_WorkflowContext(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.WorkflowInstance result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowInstance_WorkflowContext.toString());
		if (identifier != null)
			result = system.proxies.WorkflowInstance.load(context, identifier);
		return result;
	}

	/**
	 * Set value of WorkflowInstance_WorkflowContext
	 * @param workflowinstance_workflowcontext
	 */
	public final void setWorkflowInstance_WorkflowContext(system.proxies.WorkflowInstance workflowinstance_workflowcontext)
	{
		setWorkflowInstance_WorkflowContext(getContext(), workflowinstance_workflowcontext);
	}

	/**
	 * Set value of WorkflowInstance_WorkflowContext
	 * @param context
	 * @param workflowinstance_workflowcontext
	 */
	public final void setWorkflowInstance_WorkflowContext(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowInstance workflowinstance_workflowcontext)
	{
		if (workflowinstance_workflowcontext == null)
			getMendixObject().setValue(context, MemberNames.WorkflowInstance_WorkflowContext.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.WorkflowInstance_WorkflowContext.toString(), workflowinstance_workflowcontext.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workflowContextMendixObject;
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
			final system.proxies.WorkflowContext that = (system.proxies.WorkflowContext) obj;
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
		return "System.WorkflowContext";
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
