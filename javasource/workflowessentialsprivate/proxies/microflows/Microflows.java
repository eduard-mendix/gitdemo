// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowessentialsprivate.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the WorkflowEssentialsPrivate module
	public static void aCT_Attachment_Create(IContext context, system.proxies.WorkflowInstance _workflow)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Workflow", _workflow == null ? null : _workflow.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.ACT_Attachment_Create").withParams(params).execute(context);
	}
	public static void aCT_Attachment_Delete(IContext context, workflowessentialspublic.proxies.WorkflowAttachment _workflowAttachment)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowAttachment", _workflowAttachment == null ? null : _workflowAttachment.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.ACT_Attachment_Delete").withParams(params).execute(context);
	}
	public static void aCT_Attachment_Download(IContext context, system.proxies.FileDocument _fileDoc)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("FileDoc", _fileDoc == null ? null : _fileDoc.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.ACT_Attachment_Download").withParams(params).execute(context);
	}
	public static void aCT_Attachment_Save(IContext context, workflowessentialspublic.proxies.WorkflowAttachment _workflowAttachment)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowAttachment", _workflowAttachment == null ? null : _workflowAttachment.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.ACT_Attachment_Save").withParams(params).execute(context);
	}
	public static void aCT_Note_ActivateEditMode(IContext context, workflowessentialspublic.proxies.WorkflowNote _workflowNote, workflowessentialspublic.proxies.WorkflowNoteHelper _workflowNoteHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowNote", _workflowNote == null ? null : _workflowNote.getMendixObject());
		params.put("WorkflowNoteHelper", _workflowNoteHelper == null ? null : _workflowNoteHelper.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.ACT_Note_ActivateEditMode").withParams(params).execute(context);
	}
	public static void aCT_Note_Delete(IContext context, workflowessentialspublic.proxies.WorkflowNote _workflowNote)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowNote", _workflowNote == null ? null : _workflowNote.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.ACT_Note_Delete").withParams(params).execute(context);
	}
	public static void aCT_Note_Revert(IContext context, workflowessentialspublic.proxies.WorkflowNoteHelper _workflowNoteHelper, workflowessentialspublic.proxies.WorkflowNote _workflowNote)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowNoteHelper", _workflowNoteHelper == null ? null : _workflowNoteHelper.getMendixObject());
		params.put("WorkflowNote", _workflowNote == null ? null : _workflowNote.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.ACT_Note_Revert").withParams(params).execute(context);
	}
	public static void aCT_UserTask_AssignToMe_UpdateTaskCount(IContext context, system.proxies.WorkflowUserTask _userTask, workflowessentialspublic.proxies.TaskCount _taskCount)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("UserTask", _userTask == null ? null : _userTask.getMendixObject());
		params.put("TaskCount", _taskCount == null ? null : _taskCount.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.ACT_UserTask_AssignToMe_UpdateTaskCount").withParams(params).execute(context);
	}
	public static void aCT_WorkflowContext_Revert(IContext context, system.proxies.WorkflowContext _workflowContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowContext", _workflowContext == null ? null : _workflowContext.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.ACT_WorkflowContext_Revert").withParams(params).execute(context);
	}
	public static void aCT_WorkflowContext_Save(IContext context, system.proxies.WorkflowContext _workflowContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowContext", _workflowContext == null ? null : _workflowContext.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.ACT_WorkflowContext_Save").withParams(params).execute(context);
	}
	public static void aCT_WorkflowNoteHeper_SaveEdit(IContext context, workflowessentialspublic.proxies.WorkflowNoteHelper _workflowNoteHelper, workflowessentialspublic.proxies.WorkflowNote _workflowNote)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowNoteHelper", _workflowNoteHelper == null ? null : _workflowNoteHelper.getMendixObject());
		params.put("WorkflowNote", _workflowNote == null ? null : _workflowNote.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.ACT_WorkflowNoteHeper_SaveEdit").withParams(params).execute(context);
	}
	public static void aCT_WorkflowNoteHeper_SaveNew(IContext context, workflowessentialspublic.proxies.WorkflowNoteHelper _workflowNoteHelper, system.proxies.WorkflowInstance _workflow)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowNoteHelper", _workflowNoteHelper == null ? null : _workflowNoteHelper.getMendixObject());
		params.put("Workflow", _workflow == null ? null : _workflow.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.ACT_WorkflowNoteHeper_SaveNew").withParams(params).execute(context);
	}
	public static java.util.List<system.proxies.WorkflowUserTask> dS_Task(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("WorkflowEssentialsPrivate.DS_Task").withParams(params).execute(context);
		java.util.List<system.proxies.WorkflowUserTask> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(system.proxies.WorkflowUserTask.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<system.proxies.WorkflowUserTask> dS_Task_AssignedToUser(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("WorkflowEssentialsPrivate.DS_Task_AssignedToUser").withParams(params).execute(context);
		java.util.List<system.proxies.WorkflowUserTask> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(system.proxies.WorkflowUserTask.initialize(context, obj));
		}
		return result;
	}
	public static workflowessentialspublic.proxies.TaskCount dS_TaskCount(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("WorkflowEssentialsPrivate.DS_TaskCount").withParams(params).execute(context);
		return result == null ? null : workflowessentialspublic.proxies.TaskCount.initialize(context, result);
	}
	public static workflowessentialsprivate.proxies.DashboardContext dS_TaskDashboard(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("WorkflowEssentialsPrivate.DS_TaskDashboard").withParams(params).execute(context);
		return result == null ? null : workflowessentialsprivate.proxies.DashboardContext.initialize(context, result);
	}
	public static java.util.List<system.proxies.WorkflowTaskDefinition> dS_TaskDefinition_Selectable(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("WorkflowEssentialsPrivate.DS_TaskDefinition_Selectable").withParams(params).execute(context);
		java.util.List<system.proxies.WorkflowTaskDefinition> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(system.proxies.WorkflowTaskDefinition.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<workflowessentialsprivate.proxies.TaskSeries> dS_TaskSeries(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("WorkflowEssentialsPrivate.DS_TaskSeries").withParams(params).execute(context);
		java.util.List<workflowessentialsprivate.proxies.TaskSeries> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(workflowessentialsprivate.proxies.TaskSeries.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<workflowessentialsprivate.proxies.UserTaskTimeLine> dS_UserTaskTimeline(IContext context, system.proxies.WorkflowInstance _workflow)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Workflow", _workflow == null ? null : _workflow.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("WorkflowEssentialsPrivate.DS_UserTaskTimeline").withParams(params).execute(context);
		java.util.List<workflowessentialsprivate.proxies.UserTaskTimeLine> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(workflowessentialsprivate.proxies.UserTaskTimeLine.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<system.proxies.WorkflowInstance> dS_Workflow(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("WorkflowEssentialsPrivate.DS_Workflow").withParams(params).execute(context);
		java.util.List<system.proxies.WorkflowInstance> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(system.proxies.WorkflowInstance.initialize(context, obj));
		}
		return result;
	}
	public static workflowessentialsprivate.proxies.DashboardContext dS_WorkflowDashboard(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("WorkflowEssentialsPrivate.DS_WorkflowDashboard").withParams(params).execute(context);
		return result == null ? null : workflowessentialsprivate.proxies.DashboardContext.initialize(context, result);
	}
	public static java.util.List<system.proxies.WorkflowDefinition> dS_WorkflowDefinition_Selectable(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("WorkflowEssentialsPrivate.DS_WorkflowDefinition_Selectable").withParams(params).execute(context);
		java.util.List<system.proxies.WorkflowDefinition> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(system.proxies.WorkflowDefinition.initialize(context, obj));
		}
		return result;
	}
	public static workflowessentialspublic.proxies.WorkflowNoteHelper dS_WorkflowNoteHelper_InitializeEdit(IContext context, workflowessentialspublic.proxies.WorkflowNote _workflowNote)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowNote", _workflowNote == null ? null : _workflowNote.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("WorkflowEssentialsPrivate.DS_WorkflowNoteHelper_InitializeEdit").withParams(params).execute(context);
		return result == null ? null : workflowessentialspublic.proxies.WorkflowNoteHelper.initialize(context, result);
	}
	public static workflowessentialspublic.proxies.WorkflowNoteHelper dS_WorkflowNoteHelper_InitializeNew(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("WorkflowEssentialsPrivate.DS_WorkflowNoteHelper_InitializeNew").withParams(params).execute(context);
		return result == null ? null : workflowessentialspublic.proxies.WorkflowNoteHelper.initialize(context, result);
	}
	public static java.util.List<workflowessentialsprivate.proxies.WorkflowSeries> dS_WorkflowSeries(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("WorkflowEssentialsPrivate.DS_WorkflowSeries").withParams(params).execute(context);
		java.util.List<workflowessentialsprivate.proxies.WorkflowSeries> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(workflowessentialsprivate.proxies.WorkflowSeries.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<workflowessentialsprivate.proxies.WorkflowTaskDetail> dS_WorkflowTaskDetail(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("WorkflowEssentialsPrivate.DS_WorkflowTaskDetail").withParams(params).execute(context);
		java.util.List<workflowessentialsprivate.proxies.WorkflowTaskDetail> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(workflowessentialsprivate.proxies.WorkflowTaskDetail.initialize(context, obj));
		}
		return result;
	}
	public static void oCh_DashboardContext_UpdateTaskDashboard_2(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.OCh_DashboardContext_UpdateTaskDashboard_2").withParams(params).execute(context);
	}
	public static void oCh_DashboardContext_UpdateWorkflowDashboard(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.OCh_DashboardContext_UpdateWorkflowDashboard").withParams(params).execute(context);
	}
	public static workflowessentialsprivate.proxies.DashboardContext sUB_DashboardContext_RetrieveOrCreate(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("WorkflowEssentialsPrivate.SUB_DashboardContext_RetrieveOrCreate").withParams(params).execute(context);
		return result == null ? null : workflowessentialsprivate.proxies.DashboardContext.initialize(context, result);
	}
	public static void sUB_DashboardContext_UpdateSettings(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.SUB_DashboardContext_UpdateSettings").withParams(params).execute(context);
	}
	public static void sUB_TaskCount_Update(IContext context, workflowessentialspublic.proxies.TaskCount _newTaskCount)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NewTaskCount", _newTaskCount == null ? null : _newTaskCount.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.SUB_TaskCount_Update").withParams(params).execute(context);
	}
	public static void sUB_TaskDashboard_Update(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.SUB_TaskDashboard_Update").withParams(params).execute(context);
	}
	public static void sUB_TaskSeries_CreateOrUpdate(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext, system.proxies.WorkflowDefinition _workflowDefinition_Selected, system.proxies.User _user, system.proxies.WorkflowTaskDefinition _taskDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		params.put("User", _user == null ? null : _user.getMendixObject());
		params.put("TaskDefinition_Selected", _taskDefinition_Selected == null ? null : _taskDefinition_Selected.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.SUB_TaskSeries_CreateOrUpdate").withParams(params).execute(context);
	}
	public static void sUB_TaskSeriesList_Delete(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.SUB_TaskSeriesList_Delete").withParams(params).execute(context);
	}
	public static void sUB_TaskSummary_CreateOrUpdate(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext, system.proxies.WorkflowDefinition _workflowDefinition_Selected, boolean _admin, system.proxies.WorkflowTaskDefinition _taskDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		params.put("Admin", _admin);
		params.put("TaskDefinition_Selected", _taskDefinition_Selected == null ? null : _taskDefinition_Selected.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.SUB_TaskSummary_CreateOrUpdate").withParams(params).execute(context);
	}
	public static workflowessentialsprivate.proxies.TaskSummary sUB_TaskSummary_RetrieveOrCreate(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("WorkflowEssentialsPrivate.SUB_TaskSummary_RetrieveOrCreate").withParams(params).execute(context);
		return result == null ? null : workflowessentialsprivate.proxies.TaskSummary.initialize(context, result);
	}
	public static void sUB_UserTask_Assign(IContext context, system.proxies.User _user, system.proxies.WorkflowUserTask _userTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("User", _user == null ? null : _user.getMendixObject());
		params.put("UserTask", _userTask == null ? null : _userTask.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.SUB_UserTask_Assign").withParams(params).execute(context);
	}
	public static java.util.List<system.proxies.WorkflowUserTask> sUB_UserTask_AssignedToUser(IContext context, java.util.Date _completedOrStartedAfter, java.util.Date _completedOrStartedBefore, system.proxies.WorkflowDefinition _workflowDefinition_Selected, system.proxies.User _user, system.proxies.WorkflowTaskDefinition _taskDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CompletedOrStartedAfter", _completedOrStartedAfter);
		params.put("CompletedOrStartedBefore", _completedOrStartedBefore);
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		params.put("User", _user == null ? null : _user.getMendixObject());
		params.put("TaskDefinition_Selected", _taskDefinition_Selected == null ? null : _taskDefinition_Selected.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("WorkflowEssentialsPrivate.SUB_UserTask_AssignedToUser").withParams(params).execute(context);
		java.util.List<system.proxies.WorkflowUserTask> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(system.proxies.WorkflowUserTask.initialize(context, obj));
		}
		return result;
	}
	public static java.math.BigDecimal sUB_UserTask_AverageHandlingTime(IContext context, java.util.Date _completedAfter, java.util.Date _completedBefore, system.proxies.WorkflowTaskDefinition _taskDefinition_Selected, system.proxies.User _user, system.proxies.WorkflowDefinition _workflowDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CompletedAfter", _completedAfter);
		params.put("CompletedBefore", _completedBefore);
		params.put("TaskDefinition_Selected", _taskDefinition_Selected == null ? null : _taskDefinition_Selected.getMendixObject());
		params.put("User", _user == null ? null : _user.getMendixObject());
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		return (java.math.BigDecimal) Core.microflowCall("WorkflowEssentialsPrivate.SUB_UserTask_AverageHandlingTime").withParams(params).execute(context);
	}
	public static java.lang.Long sUB_UserTask_CountCompleted(IContext context, java.util.Date _completedAfter, java.util.Date _completedBefore, system.proxies.WorkflowTaskDefinition _taskDefinition_Selected, system.proxies.WorkflowDefinition _workflowDefinition_Selected, system.proxies.User _user)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CompletedAfter", _completedAfter);
		params.put("CompletedBefore", _completedBefore);
		params.put("TaskDefinition_Selected", _taskDefinition_Selected == null ? null : _taskDefinition_Selected.getMendixObject());
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		params.put("User", _user == null ? null : _user.getMendixObject());
		return (java.lang.Long) Core.microflowCall("WorkflowEssentialsPrivate.SUB_UserTask_CountCompleted").withParams(params).execute(context);
	}
	public static java.lang.Long sUB_UserTask_CountCompletedOnTime(IContext context, java.util.Date _completedAfter, java.util.Date _completedBefore, system.proxies.WorkflowDefinition _workflowDefinition_Selected, system.proxies.User _user, system.proxies.WorkflowTaskDefinition _taskDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CompletedAfter", _completedAfter);
		params.put("CompletedBefore", _completedBefore);
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		params.put("User", _user == null ? null : _user.getMendixObject());
		params.put("TaskDefinition_Selected", _taskDefinition_Selected == null ? null : _taskDefinition_Selected.getMendixObject());
		return (java.lang.Long) Core.microflowCall("WorkflowEssentialsPrivate.SUB_UserTask_CountCompletedOnTime").withParams(params).execute(context);
	}
	public static java.lang.Long sUB_UserTask_CountCompletedOverdue(IContext context, java.util.Date _completedAfter, java.util.Date _completedBefore, system.proxies.WorkflowDefinition _workflowDefinition_Selected, system.proxies.User _user, system.proxies.WorkflowTaskDefinition _taskDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CompletedAfter", _completedAfter);
		params.put("CompletedBefore", _completedBefore);
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		params.put("User", _user == null ? null : _user.getMendixObject());
		params.put("TaskDefinition_Selected", _taskDefinition_Selected == null ? null : _taskDefinition_Selected.getMendixObject());
		return (java.lang.Long) Core.microflowCall("WorkflowEssentialsPrivate.SUB_UserTask_CountCompletedOverdue").withParams(params).execute(context);
	}
	public static java.lang.Long sUB_UserTask_CountFailed(IContext context, java.util.Date _completedAfter, java.util.Date _completedBefore, system.proxies.User _user, system.proxies.WorkflowDefinition _workflowDefinition_Selected, system.proxies.WorkflowTaskDefinition _taskDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CompletedAfter", _completedAfter);
		params.put("CompletedBefore", _completedBefore);
		params.put("User", _user == null ? null : _user.getMendixObject());
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		params.put("TaskDefinition_Selected", _taskDefinition_Selected == null ? null : _taskDefinition_Selected.getMendixObject());
		return (java.lang.Long) Core.microflowCall("WorkflowEssentialsPrivate.SUB_UserTask_CountFailed").withParams(params).execute(context);
	}
	public static java.lang.Long sUB_UserTask_CountInProgress(IContext context, java.util.Date _startedAfter, java.util.Date _startedBefore, system.proxies.WorkflowTaskDefinition _taskDefinition_Selected, system.proxies.User _user, system.proxies.WorkflowDefinition _workflowDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("StartedAfter", _startedAfter);
		params.put("StartedBefore", _startedBefore);
		params.put("TaskDefinition_Selected", _taskDefinition_Selected == null ? null : _taskDefinition_Selected.getMendixObject());
		params.put("User", _user == null ? null : _user.getMendixObject());
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		return (java.lang.Long) Core.microflowCall("WorkflowEssentialsPrivate.SUB_UserTask_CountInProgress").withParams(params).execute(context);
	}
	public static java.lang.Long sUB_UserTask_CountOverdue(IContext context, java.util.Date _completedAfter, java.util.Date _completedBefore, system.proxies.WorkflowDefinition _workflowDefinition_Selected, system.proxies.User _user, system.proxies.WorkflowTaskDefinition _taskDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CompletedAfter", _completedAfter);
		params.put("CompletedBefore", _completedBefore);
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		params.put("User", _user == null ? null : _user.getMendixObject());
		params.put("TaskDefinition_Selected", _taskDefinition_Selected == null ? null : _taskDefinition_Selected.getMendixObject());
		return (java.lang.Long) Core.microflowCall("WorkflowEssentialsPrivate.SUB_UserTask_CountOverdue").withParams(params).execute(context);
	}
	public static java.math.BigDecimal sUB_UserTask_HandledOnTime(IContext context, java.util.Date _completedAfter, java.util.Date _completedBefore, system.proxies.User _user, java.lang.Long _userTask_CountCompleted, system.proxies.WorkflowDefinition _workflowDefinition_Selected, system.proxies.WorkflowTaskDefinition _taskDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CompletedAfter", _completedAfter);
		params.put("CompletedBefore", _completedBefore);
		params.put("User", _user == null ? null : _user.getMendixObject());
		params.put("UserTask_CountCompleted", _userTask_CountCompleted);
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		params.put("TaskDefinition_Selected", _taskDefinition_Selected == null ? null : _taskDefinition_Selected.getMendixObject());
		return (java.math.BigDecimal) Core.microflowCall("WorkflowEssentialsPrivate.SUB_UserTask_HandledOnTime").withParams(params).execute(context);
	}
	public static java.math.BigDecimal sUB_Workflow_AverageHandlingTime(IContext context, java.lang.Long _workflow_CountCompleted, java.util.Date _completedAfter, java.util.Date _completedBefore, system.proxies.WorkflowDefinition _workflowDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Workflow_CountCompleted", _workflow_CountCompleted);
		params.put("CompletedAfter", _completedAfter);
		params.put("CompletedBefore", _completedBefore);
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		return (java.math.BigDecimal) Core.microflowCall("WorkflowEssentialsPrivate.SUB_Workflow_AverageHandlingTime").withParams(params).execute(context);
	}
	public static void sUB_WorkflowDashboard_Update(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.SUB_WorkflowDashboard_Update").withParams(params).execute(context);
	}
	public static void sUB_WorkflowSeries_CreateOrUpdate(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext, system.proxies.WorkflowDefinition _workflowDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.SUB_WorkflowSeries_CreateOrUpdate").withParams(params).execute(context);
	}
	public static void sUB_WorkflowSeriesList_Delete(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.SUB_WorkflowSeriesList_Delete").withParams(params).execute(context);
	}
	public static void sUB_WorkflowSummary_CreateOrUpdate(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext, system.proxies.WorkflowDefinition _workflowDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.SUB_WorkflowSummary_CreateOrUpdate").withParams(params).execute(context);
	}
	public static workflowessentialsprivate.proxies.WorkflowSummary sUB_WorkflowSummary_RetrieveOrCreate(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("WorkflowEssentialsPrivate.SUB_WorkflowSummary_RetrieveOrCreate").withParams(params).execute(context);
		return result == null ? null : workflowessentialsprivate.proxies.WorkflowSummary.initialize(context, result);
	}
	public static java.math.BigDecimal sUB_WorkflowTask_AverageHandlingTime(IContext context, java.util.Date _completedAfter, java.util.Date _completedBefore, system.proxies.WorkflowTaskDefinition _taskDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CompletedAfter", _completedAfter);
		params.put("CompletedBefore", _completedBefore);
		params.put("TaskDefinition_Selected", _taskDefinition_Selected == null ? null : _taskDefinition_Selected.getMendixObject());
		return (java.math.BigDecimal) Core.microflowCall("WorkflowEssentialsPrivate.SUB_WorkflowTask_AverageHandlingTime").withParams(params).execute(context);
	}
	public static void sUB_WorkflowTaskDetail_CreateOrUpdate(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext, system.proxies.WorkflowDefinition _workflowDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.SUB_WorkflowTaskDetail_CreateOrUpdate").withParams(params).execute(context);
	}
	public static void sUB_WorkflowTaskDetail_Delete(IContext context, workflowessentialsprivate.proxies.DashboardContext _dashboardContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DashboardContext", _dashboardContext == null ? null : _dashboardContext.getMendixObject());
		Core.microflowCall("WorkflowEssentialsPrivate.SUB_WorkflowTaskDetail_Delete").withParams(params).execute(context);
	}
	public static java.lang.Long sUB_Worklow_CountAborted(IContext context, java.util.Date _completedAfter, java.util.Date _completedBefore, system.proxies.WorkflowDefinition _workflowDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CompletedAfter", _completedAfter);
		params.put("CompletedBefore", _completedBefore);
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		return (java.lang.Long) Core.microflowCall("WorkflowEssentialsPrivate.SUB_Worklow_CountAborted").withParams(params).execute(context);
	}
	public static java.lang.Long sUB_Worklow_CountCompleted(IContext context, java.util.Date _completedAfter, java.util.Date _completedBefore, system.proxies.WorkflowDefinition _workflowDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CompletedAfter", _completedAfter);
		params.put("CompletedBefore", _completedBefore);
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		return (java.lang.Long) Core.microflowCall("WorkflowEssentialsPrivate.SUB_Worklow_CountCompleted").withParams(params).execute(context);
	}
	public static java.lang.Long sUB_Worklow_CountCompletedOnTime(IContext context, java.util.Date _completedAfter, java.util.Date _completedBefore, system.proxies.WorkflowDefinition _workflowDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CompletedAfter", _completedAfter);
		params.put("CompletedBefore", _completedBefore);
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		return (java.lang.Long) Core.microflowCall("WorkflowEssentialsPrivate.SUB_Worklow_CountCompletedOnTime").withParams(params).execute(context);
	}
	public static java.lang.Long sUB_Worklow_CountCompletedOverdue(IContext context, java.util.Date _completedAfter, java.util.Date _completedBefore, system.proxies.WorkflowDefinition _workflowDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CompletedAfter", _completedAfter);
		params.put("CompletedBefore", _completedBefore);
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		return (java.lang.Long) Core.microflowCall("WorkflowEssentialsPrivate.SUB_Worklow_CountCompletedOverdue").withParams(params).execute(context);
	}
	public static java.lang.Long sUB_Worklow_CountInProgress(IContext context, java.util.Date _startedAfter, java.util.Date _startedBefore, system.proxies.WorkflowDefinition _workflowDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("StartedAfter", _startedAfter);
		params.put("StartedBefore", _startedBefore);
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		return (java.lang.Long) Core.microflowCall("WorkflowEssentialsPrivate.SUB_Worklow_CountInProgress").withParams(params).execute(context);
	}
	public static java.lang.Long sUB_Worklow_CountOverdue(IContext context, java.util.Date _completedAfter, java.util.Date _completedBefore, system.proxies.WorkflowDefinition _workflowDefinition_Selected)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CompletedAfter", _completedAfter);
		params.put("CompletedBefore", _completedBefore);
		params.put("WorkflowDefinition_Selected", _workflowDefinition_Selected == null ? null : _workflowDefinition_Selected.getMendixObject());
		return (java.lang.Long) Core.microflowCall("WorkflowEssentialsPrivate.SUB_Worklow_CountOverdue").withParams(params).execute(context);
	}
}