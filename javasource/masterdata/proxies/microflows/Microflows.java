// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package masterdata.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MasterData module
	public static void aASU_WorkflowProcess(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MasterData.AASU_WorkflowProcess").withParams(params).execute(context);
	}
	public static void aC_GenerateIncidentCase(IContext context, masterdata.proxies.Incident _incident)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Incident", _incident == null ? null : _incident.getMendixObject());
		Core.microflowCall("MasterData.AC_GenerateIncidentCase").withParams(params).execute(context);
	}
	public static void aCT_ExportBills(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MasterData.ACT_ExportBills").withParams(params).execute(context);
	}
	public static void aCT_ExportPhoto(IContext context, masterdata.proxies.IncidentReportPhoto _incidentReportPhoto)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("IncidentReportPhoto", _incidentReportPhoto == null ? null : _incidentReportPhoto.getMendixObject());
		Core.microflowCall("MasterData.ACT_ExportPhoto").withParams(params).execute(context);
	}
	public static void aCT_NewExampleIncident(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MasterData.ACT_NewExampleIncident").withParams(params).execute(context);
	}
	public static boolean afterStartup(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MasterData.AfterStartup").withParams(params).execute(context);
	}
	public static void aSU_Customer(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MasterData.ASU_Customer").withParams(params).execute(context);
	}
	public static void aSU_GenerateExampleCase(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MasterData.ASU_GenerateExampleCase").withParams(params).execute(context);
	}
	public static void aSU_ServiceEngineers(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MasterData.ASU_ServiceEngineers").withParams(params).execute(context);
	}
	public static void aSu_SetFullNameDemoAccounts(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MasterData.ASu_SetFullNameDemoAccounts").withParams(params).execute(context);
	}
	public static void aSU_SetupBills(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MasterData.ASU_SetupBills").withParams(params).execute(context);
	}
	public static void aSU_SetupDemoUsers(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MasterData.ASU_SetupDemoUsers").withParams(params).execute(context);
	}
	public static void aSU_SetupSAP(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MasterData.ASU_SetupSAP").withParams(params).execute(context);
	}
	public static void aSU_SetupSQLData(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MasterData.ASU_SetupSQLData").withParams(params).execute(context);
	}
	public static void aSU_SetupThingySensor(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MasterData.ASU_SetupThingySensor").withParams(params).execute(context);
	}
	public static sapodataconnector.proxies.RequestParams buildRequestParams(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MasterData.BuildRequestParams").withParams(params).execute(context);
		return result == null ? null : sapodataconnector.proxies.RequestParams.initialize(context, result);
	}
	public static java.lang.String cAL_Address(IContext context, masterdata.proxies.Customer _customer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Customer", _customer == null ? null : _customer.getMendixObject());
		return (java.lang.String) Core.microflowCall("MasterData.CAL_Address").withParams(params).execute(context);
	}
	public static void iVK_Category_SyncAll(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MasterData.IVK_Category_SyncAll").withParams(params).execute(context);
	}
	public static void sUB_ApproveHardware(IContext context, system.proxies.WorkflowUserTask _workflowTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowTask", _workflowTask == null ? null : _workflowTask.getMendixObject());
		Core.microflowCall("MasterData.SUB_ApproveHardware").withParams(params).execute(context);
	}
	public static void sUB_AssignEngineer(IContext context, system.proxies.WorkflowUserTask _workflowTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowTask", _workflowTask == null ? null : _workflowTask.getMendixObject());
		Core.microflowCall("MasterData.SUB_AssignEngineer").withParams(params).execute(context);
	}
	public static void sUB_AssignToUser(IContext context, system.proxies.User _user, system.proxies.WorkflowTaskInstance _workflowTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("User", _user == null ? null : _user.getMendixObject());
		params.put("WorkflowTask", _workflowTask == null ? null : _workflowTask.getMendixObject());
		Core.microflowCall("MasterData.SUB_AssignToUser").withParams(params).execute(context);
	}
	public static void sUB_CallCustomer(IContext context, system.proxies.WorkflowUserTask _workflowTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowTask", _workflowTask == null ? null : _workflowTask.getMendixObject());
		Core.microflowCall("MasterData.SUB_CallCustomer").withParams(params).execute(context);
	}
	public static void sUB_CheckAndSetSystemTasks(IContext context, system.proxies.WorkflowInstance _workflow, masterdata.proxies.DataGenerator _dataGenerator)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Workflow", _workflow == null ? null : _workflow.getMendixObject());
		params.put("DataGenerator", _dataGenerator == null ? null : _dataGenerator.getMendixObject());
		Core.microflowCall("MasterData.SUB_CheckAndSetSystemTasks").withParams(params).execute(context);
	}
	public static void sUB_CompleteAssessment(IContext context, system.proxies.WorkflowUserTask _workflowTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowTask", _workflowTask == null ? null : _workflowTask.getMendixObject());
		Core.microflowCall("MasterData.SUB_CompleteAssessment").withParams(params).execute(context);
	}
	public static void sUB_CompleteIncidentReview(IContext context, system.proxies.WorkflowUserTask _workflowTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowTask", _workflowTask == null ? null : _workflowTask.getMendixObject());
		Core.microflowCall("MasterData.SUB_CompleteIncidentReview").withParams(params).execute(context);
	}
	public static void sUB_CompleteWorkflowTask(IContext context, system.proxies.WorkflowUserTask _workflowTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowTask", _workflowTask == null ? null : _workflowTask.getMendixObject());
		Core.microflowCall("MasterData.SUB_CompleteWorkflowTask").withParams(params).execute(context);
	}
	public static void sUB_CompleteXTasks(IContext context, masterdata.proxies.DataGenerator _dataGenerator)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DataGenerator", _dataGenerator == null ? null : _dataGenerator.getMendixObject());
		Core.microflowCall("MasterData.SUB_CompleteXTasks").withParams(params).execute(context);
	}
	public static masterdata.proxies.Configuration sUB_Configuration_Get(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MasterData.SUB_Configuration_Get").withParams(params).execute(context);
		return result == null ? null : masterdata.proxies.Configuration.initialize(context, result);
	}
	public static administration.proxies.Account sUB_GetCurrentAccount(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MasterData.SUB_GetCurrentAccount").withParams(params).execute(context);
		return result == null ? null : administration.proxies.Account.initialize(context, result);
	}
	public static void sUB_OnsiteReplacement(IContext context, system.proxies.WorkflowUserTask _workflowTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowTask", _workflowTask == null ? null : _workflowTask.getMendixObject());
		Core.microflowCall("MasterData.SUB_OnsiteReplacement").withParams(params).execute(context);
	}
	public static void sUB_OrderNewHardware(IContext context, system.proxies.WorkflowUserTask _workflowTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowTask", _workflowTask == null ? null : _workflowTask.getMendixObject());
		Core.microflowCall("MasterData.SUB_OrderNewHardware").withParams(params).execute(context);
	}
	public static boolean sUB_Random_Decision(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MasterData.SUB_Random_Decision").withParams(params).execute(context);
	}
	public static void sUB_ResetBills(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MasterData.SUB_ResetBills").withParams(params).execute(context);
	}
	public static void sUB_Troubleshoot(IContext context, system.proxies.WorkflowUserTask _workflowTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowTask", _workflowTask == null ? null : _workflowTask.getMendixObject());
		Core.microflowCall("MasterData.SUB_Troubleshoot").withParams(params).execute(context);
	}
}