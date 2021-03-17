// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowessentialsprivate.proxies;

public class DashboardContext
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dashboardContextMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowEssentialsPrivate.DashboardContext";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TimeFrame("TimeFrame"),
		TimeFrameStart("TimeFrameStart"),
		TimeFrameEnd("TimeFrameEnd"),
		LastUpdate("LastUpdate"),
		TimeFrameStepUnit("TimeFrameStepUnit"),
		DashboardContext_TaskSummary("WorkflowEssentialsPrivate.DashboardContext_TaskSummary"),
		DashboardContext_WorkflowSummary("WorkflowEssentialsPrivate.DashboardContext_WorkflowSummary"),
		DashboardContext_Session("WorkflowEssentialsPrivate.DashboardContext_Session"),
		DashboardContext_WorkflowDefinition("WorkflowEssentialsPrivate.DashboardContext_WorkflowDefinition"),
		DashboardContext_WorkflowTaskDefinition("WorkflowEssentialsPrivate.DashboardContext_WorkflowTaskDefinition");

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

	public DashboardContext(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowEssentialsPrivate.DashboardContext"));
	}

	protected DashboardContext(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dashboardContextMendixObject)
	{
		if (dashboardContextMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("WorkflowEssentialsPrivate.DashboardContext", dashboardContextMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowEssentialsPrivate.DashboardContext");

		this.dashboardContextMendixObject = dashboardContextMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DashboardContext.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static workflowessentialsprivate.proxies.DashboardContext initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowessentialsprivate.proxies.DashboardContext.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowessentialsprivate.proxies.DashboardContext initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowessentialsprivate.proxies.DashboardContext(context, mendixObject);
	}

	public static workflowessentialsprivate.proxies.DashboardContext load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowessentialsprivate.proxies.DashboardContext.initialize(context, mendixObject);
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
	 * Set value of TimeFrame
	 * @param timeframe
	 */
	public final workflowessentialsprivate.proxies.Enum_DashboardTimeFrame getTimeFrame()
	{
		return getTimeFrame(getContext());
	}

	/**
	 * @param context
	 * @return value of TimeFrame
	 */
	public final workflowessentialsprivate.proxies.Enum_DashboardTimeFrame getTimeFrame(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TimeFrame.toString());
		if (obj == null)
			return null;

		return workflowessentialsprivate.proxies.Enum_DashboardTimeFrame.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TimeFrame
	 * @param timeframe
	 */
	public final void setTimeFrame(workflowessentialsprivate.proxies.Enum_DashboardTimeFrame timeframe)
	{
		setTimeFrame(getContext(), timeframe);
	}

	/**
	 * Set value of TimeFrame
	 * @param context
	 * @param timeframe
	 */
	public final void setTimeFrame(com.mendix.systemwideinterfaces.core.IContext context, workflowessentialsprivate.proxies.Enum_DashboardTimeFrame timeframe)
	{
		if (timeframe != null)
			getMendixObject().setValue(context, MemberNames.TimeFrame.toString(), timeframe.toString());
		else
			getMendixObject().setValue(context, MemberNames.TimeFrame.toString(), null);
	}

	/**
	 * @return value of TimeFrameStart
	 */
	public final java.util.Date getTimeFrameStart()
	{
		return getTimeFrameStart(getContext());
	}

	/**
	 * @param context
	 * @return value of TimeFrameStart
	 */
	public final java.util.Date getTimeFrameStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.TimeFrameStart.toString());
	}

	/**
	 * Set value of TimeFrameStart
	 * @param timeframestart
	 */
	public final void setTimeFrameStart(java.util.Date timeframestart)
	{
		setTimeFrameStart(getContext(), timeframestart);
	}

	/**
	 * Set value of TimeFrameStart
	 * @param context
	 * @param timeframestart
	 */
	public final void setTimeFrameStart(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date timeframestart)
	{
		getMendixObject().setValue(context, MemberNames.TimeFrameStart.toString(), timeframestart);
	}

	/**
	 * @return value of TimeFrameEnd
	 */
	public final java.util.Date getTimeFrameEnd()
	{
		return getTimeFrameEnd(getContext());
	}

	/**
	 * @param context
	 * @return value of TimeFrameEnd
	 */
	public final java.util.Date getTimeFrameEnd(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.TimeFrameEnd.toString());
	}

	/**
	 * Set value of TimeFrameEnd
	 * @param timeframeend
	 */
	public final void setTimeFrameEnd(java.util.Date timeframeend)
	{
		setTimeFrameEnd(getContext(), timeframeend);
	}

	/**
	 * Set value of TimeFrameEnd
	 * @param context
	 * @param timeframeend
	 */
	public final void setTimeFrameEnd(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date timeframeend)
	{
		getMendixObject().setValue(context, MemberNames.TimeFrameEnd.toString(), timeframeend);
	}

	/**
	 * @return value of LastUpdate
	 */
	public final java.util.Date getLastUpdate()
	{
		return getLastUpdate(getContext());
	}

	/**
	 * @param context
	 * @return value of LastUpdate
	 */
	public final java.util.Date getLastUpdate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.LastUpdate.toString());
	}

	/**
	 * Set value of LastUpdate
	 * @param lastupdate
	 */
	public final void setLastUpdate(java.util.Date lastupdate)
	{
		setLastUpdate(getContext(), lastupdate);
	}

	/**
	 * Set value of LastUpdate
	 * @param context
	 * @param lastupdate
	 */
	public final void setLastUpdate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date lastupdate)
	{
		getMendixObject().setValue(context, MemberNames.LastUpdate.toString(), lastupdate);
	}

	/**
	 * Set value of TimeFrameStepUnit
	 * @param timeframestepunit
	 */
	public final workflowessentialsprivate.proxies.Enum_TimeFrameStepUnit getTimeFrameStepUnit()
	{
		return getTimeFrameStepUnit(getContext());
	}

	/**
	 * @param context
	 * @return value of TimeFrameStepUnit
	 */
	public final workflowessentialsprivate.proxies.Enum_TimeFrameStepUnit getTimeFrameStepUnit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TimeFrameStepUnit.toString());
		if (obj == null)
			return null;

		return workflowessentialsprivate.proxies.Enum_TimeFrameStepUnit.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TimeFrameStepUnit
	 * @param timeframestepunit
	 */
	public final void setTimeFrameStepUnit(workflowessentialsprivate.proxies.Enum_TimeFrameStepUnit timeframestepunit)
	{
		setTimeFrameStepUnit(getContext(), timeframestepunit);
	}

	/**
	 * Set value of TimeFrameStepUnit
	 * @param context
	 * @param timeframestepunit
	 */
	public final void setTimeFrameStepUnit(com.mendix.systemwideinterfaces.core.IContext context, workflowessentialsprivate.proxies.Enum_TimeFrameStepUnit timeframestepunit)
	{
		if (timeframestepunit != null)
			getMendixObject().setValue(context, MemberNames.TimeFrameStepUnit.toString(), timeframestepunit.toString());
		else
			getMendixObject().setValue(context, MemberNames.TimeFrameStepUnit.toString(), null);
	}

	/**
	 * @return value of DashboardContext_TaskSummary
	 */
	public final workflowessentialsprivate.proxies.TaskSummary getDashboardContext_TaskSummary() throws com.mendix.core.CoreException
	{
		return getDashboardContext_TaskSummary(getContext());
	}

	/**
	 * @param context
	 * @return value of DashboardContext_TaskSummary
	 */
	public final workflowessentialsprivate.proxies.TaskSummary getDashboardContext_TaskSummary(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowessentialsprivate.proxies.TaskSummary result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DashboardContext_TaskSummary.toString());
		if (identifier != null)
			result = workflowessentialsprivate.proxies.TaskSummary.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DashboardContext_TaskSummary
	 * @param dashboardcontext_tasksummary
	 */
	public final void setDashboardContext_TaskSummary(workflowessentialsprivate.proxies.TaskSummary dashboardcontext_tasksummary)
	{
		setDashboardContext_TaskSummary(getContext(), dashboardcontext_tasksummary);
	}

	/**
	 * Set value of DashboardContext_TaskSummary
	 * @param context
	 * @param dashboardcontext_tasksummary
	 */
	public final void setDashboardContext_TaskSummary(com.mendix.systemwideinterfaces.core.IContext context, workflowessentialsprivate.proxies.TaskSummary dashboardcontext_tasksummary)
	{
		if (dashboardcontext_tasksummary == null)
			getMendixObject().setValue(context, MemberNames.DashboardContext_TaskSummary.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DashboardContext_TaskSummary.toString(), dashboardcontext_tasksummary.getMendixObject().getId());
	}

	/**
	 * @return value of DashboardContext_WorkflowSummary
	 */
	public final workflowessentialsprivate.proxies.WorkflowSummary getDashboardContext_WorkflowSummary() throws com.mendix.core.CoreException
	{
		return getDashboardContext_WorkflowSummary(getContext());
	}

	/**
	 * @param context
	 * @return value of DashboardContext_WorkflowSummary
	 */
	public final workflowessentialsprivate.proxies.WorkflowSummary getDashboardContext_WorkflowSummary(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowessentialsprivate.proxies.WorkflowSummary result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DashboardContext_WorkflowSummary.toString());
		if (identifier != null)
			result = workflowessentialsprivate.proxies.WorkflowSummary.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DashboardContext_WorkflowSummary
	 * @param dashboardcontext_workflowsummary
	 */
	public final void setDashboardContext_WorkflowSummary(workflowessentialsprivate.proxies.WorkflowSummary dashboardcontext_workflowsummary)
	{
		setDashboardContext_WorkflowSummary(getContext(), dashboardcontext_workflowsummary);
	}

	/**
	 * Set value of DashboardContext_WorkflowSummary
	 * @param context
	 * @param dashboardcontext_workflowsummary
	 */
	public final void setDashboardContext_WorkflowSummary(com.mendix.systemwideinterfaces.core.IContext context, workflowessentialsprivate.proxies.WorkflowSummary dashboardcontext_workflowsummary)
	{
		if (dashboardcontext_workflowsummary == null)
			getMendixObject().setValue(context, MemberNames.DashboardContext_WorkflowSummary.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DashboardContext_WorkflowSummary.toString(), dashboardcontext_workflowsummary.getMendixObject().getId());
	}

	/**
	 * @return value of DashboardContext_Session
	 */
	public final system.proxies.Session getDashboardContext_Session() throws com.mendix.core.CoreException
	{
		return getDashboardContext_Session(getContext());
	}

	/**
	 * @param context
	 * @return value of DashboardContext_Session
	 */
	public final system.proxies.Session getDashboardContext_Session(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.Session result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DashboardContext_Session.toString());
		if (identifier != null)
			result = system.proxies.Session.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DashboardContext_Session
	 * @param dashboardcontext_session
	 */
	public final void setDashboardContext_Session(system.proxies.Session dashboardcontext_session)
	{
		setDashboardContext_Session(getContext(), dashboardcontext_session);
	}

	/**
	 * Set value of DashboardContext_Session
	 * @param context
	 * @param dashboardcontext_session
	 */
	public final void setDashboardContext_Session(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.Session dashboardcontext_session)
	{
		if (dashboardcontext_session == null)
			getMendixObject().setValue(context, MemberNames.DashboardContext_Session.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DashboardContext_Session.toString(), dashboardcontext_session.getMendixObject().getId());
	}

	/**
	 * @return value of DashboardContext_WorkflowDefinition
	 */
	public final system.proxies.WorkflowDefinition getDashboardContext_WorkflowDefinition() throws com.mendix.core.CoreException
	{
		return getDashboardContext_WorkflowDefinition(getContext());
	}

	/**
	 * @param context
	 * @return value of DashboardContext_WorkflowDefinition
	 */
	public final system.proxies.WorkflowDefinition getDashboardContext_WorkflowDefinition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.WorkflowDefinition result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DashboardContext_WorkflowDefinition.toString());
		if (identifier != null)
			result = system.proxies.WorkflowDefinition.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DashboardContext_WorkflowDefinition
	 * @param dashboardcontext_workflowdefinition
	 */
	public final void setDashboardContext_WorkflowDefinition(system.proxies.WorkflowDefinition dashboardcontext_workflowdefinition)
	{
		setDashboardContext_WorkflowDefinition(getContext(), dashboardcontext_workflowdefinition);
	}

	/**
	 * Set value of DashboardContext_WorkflowDefinition
	 * @param context
	 * @param dashboardcontext_workflowdefinition
	 */
	public final void setDashboardContext_WorkflowDefinition(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowDefinition dashboardcontext_workflowdefinition)
	{
		if (dashboardcontext_workflowdefinition == null)
			getMendixObject().setValue(context, MemberNames.DashboardContext_WorkflowDefinition.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DashboardContext_WorkflowDefinition.toString(), dashboardcontext_workflowdefinition.getMendixObject().getId());
	}

	/**
	 * @return value of DashboardContext_WorkflowTaskDefinition
	 */
	public final system.proxies.WorkflowTaskDefinition getDashboardContext_WorkflowTaskDefinition() throws com.mendix.core.CoreException
	{
		return getDashboardContext_WorkflowTaskDefinition(getContext());
	}

	/**
	 * @param context
	 * @return value of DashboardContext_WorkflowTaskDefinition
	 */
	public final system.proxies.WorkflowTaskDefinition getDashboardContext_WorkflowTaskDefinition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.WorkflowTaskDefinition result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DashboardContext_WorkflowTaskDefinition.toString());
		if (identifier != null)
			result = system.proxies.WorkflowTaskDefinition.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DashboardContext_WorkflowTaskDefinition
	 * @param dashboardcontext_workflowtaskdefinition
	 */
	public final void setDashboardContext_WorkflowTaskDefinition(system.proxies.WorkflowTaskDefinition dashboardcontext_workflowtaskdefinition)
	{
		setDashboardContext_WorkflowTaskDefinition(getContext(), dashboardcontext_workflowtaskdefinition);
	}

	/**
	 * Set value of DashboardContext_WorkflowTaskDefinition
	 * @param context
	 * @param dashboardcontext_workflowtaskdefinition
	 */
	public final void setDashboardContext_WorkflowTaskDefinition(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowTaskDefinition dashboardcontext_workflowtaskdefinition)
	{
		if (dashboardcontext_workflowtaskdefinition == null)
			getMendixObject().setValue(context, MemberNames.DashboardContext_WorkflowTaskDefinition.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DashboardContext_WorkflowTaskDefinition.toString(), dashboardcontext_workflowtaskdefinition.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dashboardContextMendixObject;
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
			final workflowessentialsprivate.proxies.DashboardContext that = (workflowessentialsprivate.proxies.DashboardContext) obj;
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
		return "WorkflowEssentialsPrivate.DashboardContext";
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
