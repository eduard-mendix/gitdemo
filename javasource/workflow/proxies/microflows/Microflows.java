// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflow.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Workflow module
	public static masterdata.proxies.ServiceEngineer dSO_GetServiceEngineer(IContext context, masterdata.proxies.Incident _incident)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Incident", _incident == null ? null : _incident.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Workflow.DSO_GetServiceEngineer").withParams(params).execute(context);
		return result == null ? null : masterdata.proxies.ServiceEngineer.initialize(context, result);
	}
	public static void sUB_ChangeToRejected(IContext context, masterdata.proxies.Incident _incident)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Incident", _incident == null ? null : _incident.getMendixObject());
		Core.microflowCall("Workflow.SUB_ChangeToRejected").withParams(params).execute(context);
	}
	public static void sUB_EscalateIssue(IContext context, masterdata.proxies.Incident _incident)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Incident", _incident == null ? null : _incident.getMendixObject());
		Core.microflowCall("Workflow.SUB_EscalateIssue").withParams(params).execute(context);
	}
	public static boolean sUB_ProcessIncidentWithVision(IContext context, masterdata.proxies.Incident _incident)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Incident", _incident == null ? null : _incident.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("Workflow.SUB_ProcessIncidentWithVision").withParams(params).execute(context);
	}
	public static void sUB_SendInvoice(IContext context, masterdata.proxies.Incident _incident)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Incident", _incident == null ? null : _incident.getMendixObject());
		Core.microflowCall("Workflow.SUB_SendInvoice").withParams(params).execute(context);
	}
	public static void sUB_UnableToComplete(IContext context, masterdata.proxies.Incident _incident)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Incident", _incident == null ? null : _incident.getMendixObject());
		Core.microflowCall("Workflow.SUB_UnableToComplete").withParams(params).execute(context);
	}
}