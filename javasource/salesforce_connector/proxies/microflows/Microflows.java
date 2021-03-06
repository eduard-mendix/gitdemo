// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesforce_connector.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Salesforce_Connector module
	public static salesforce_connector.proxies.Query aCT_Account_Query(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ACT_Account_Query").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Query.initialize(context, result);
	}
	public static salesforce_connector.proxies.Query aCT_Attachment_Query(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ACT_Attachment_Query").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Query.initialize(context, result);
	}
	public static void aCT_AttachmentContent_Query(IContext context, salesforce_connector.proxies.Attachment _attachment, salesforce_connector.proxies.Authorization _authorization, java.lang.String _request)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Attachment", _attachment == null ? null : _attachment.getMendixObject());
		params.put("Authorization", _authorization == null ? null : _authorization.getMendixObject());
		params.put("Request", _request);
		Core.microflowCall("Salesforce_Connector.ACT_AttachmentContent_Query").withParams(params).execute(context);
	}
	public static void aCT_Authentication_Delete(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		Core.microflowCall("Salesforce_Connector.ACT_Authentication_Delete").withParams(params).execute(context);
	}
	public static salesforce_connector.proxies.Authentication aCT_Authentication_GetActive(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ACT_Authentication_GetActive").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Authentication.initialize(context, result);
	}
	public static salesforce_connector.proxies.Authentication aCT_Authentication_GetOrCreate(IContext context, salesforce_connector.proxies.AuthenticationFlow _authenticationFlow)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AuthenticationFlow", _authenticationFlow == null ? null : _authenticationFlow.name());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ACT_Authentication_GetOrCreate").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Authentication.initialize(context, result);
	}
	public static void aCT_Authentication_ToggleActive(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		Core.microflowCall("Salesforce_Connector.ACT_Authentication_ToggleActive").withParams(params).execute(context);
	}
	public static salesforce_connector.proxies.Authorization aCT_Authorization_GetActive(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ACT_Authorization_GetActive").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Authorization.initialize(context, result);
	}
	public static salesforce_connector.proxies.Authorization aCT_Authorization_GetOrCreate(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ACT_Authorization_GetOrCreate").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Authorization.initialize(context, result);
	}
	public static salesforce_connector.proxies.Query aCT_Campaign_Query(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ACT_Campaign_Query").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Query.initialize(context, result);
	}
	public static salesforce_connector.proxies.Query aCT_Contact_Query(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ACT_Contact_Query").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Query.initialize(context, result);
	}
	public static salesforce_connector.proxies.Resources aCT_GetResources(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ACT_GetResources").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Resources.initialize(context, result);
	}
	public static salesforce_connector.proxies.Query aCT_Lead_Query(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ACT_Lead_Query").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Query.initialize(context, result);
	}
	public static salesforce_connector.proxies.Query aCT_Opportunity_Query(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ACT_Opportunity_Query").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Query.initialize(context, result);
	}
	public static void aCT_Record_Create(IContext context, salesforce_connector.proxies.SObject _sObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SObject", _sObject == null ? null : _sObject.getMendixObject());
		Core.microflowCall("Salesforce_Connector.ACT_Record_Create").withParams(params).execute(context);
	}
	public static void aCT_Record_Update(IContext context, salesforce_connector.proxies.SObject _sObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SObject", _sObject == null ? null : _sObject.getMendixObject());
		Core.microflowCall("Salesforce_Connector.ACT_Record_Update").withParams(params).execute(context);
	}
	public static boolean aCT_RefreshToken_Get(IContext context, salesforce_connector.proxies.Authorization _authorization, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authorization", _authorization == null ? null : _authorization.getMendixObject());
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("Salesforce_Connector.ACT_RefreshToken_Get").withParams(params).execute(context);
	}
	public static void aCT_UpdateLead(IContext context, salesforce_connector.proxies.Lead _lead)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Lead", _lead == null ? null : _lead.getMendixObject());
		Core.microflowCall("Salesforce_Connector.ACT_UpdateLead").withParams(params).execute(context);
	}
	public static salesforce_connector.proxies.Query aCT_User_Query(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ACT_User_Query").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Query.initialize(context, result);
	}
	public static boolean bCo_Authentication(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("Salesforce_Connector.BCo_Authentication").withParams(params).execute(context);
	}
	public static void closeSetup(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		Core.microflowCall("Salesforce_Connector.CloseSetup").withParams(params).execute(context);
	}
	public static java.util.Date convertDateString(IContext context, java.lang.String _dateString)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DateString", _dateString);
		return (java.util.Date) Core.microflowCall("Salesforce_Connector.ConvertDateString").withParams(params).execute(context);
	}
	public static java.util.Date convertDateTimeString(IContext context, java.lang.String _dateTimeString)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DateTimeString", _dateTimeString);
		return (java.util.Date) Core.microflowCall("Salesforce_Connector.ConvertDateTimeString").withParams(params).execute(context);
	}
	public static salesforce_connector.proxies.Query createQuery(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.CreateQuery").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Query.initialize(context, result);
	}
	public static salesforce_connector.proxies.Result createResult(IContext context, system.proxies.HttpResponse _httpResponse, boolean _success, salesforce_connector.proxies.Authorization _authorization)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("HttpResponse", _httpResponse == null ? null : _httpResponse.getMendixObject());
		params.put("success", _success);
		params.put("Authorization", _authorization == null ? null : _authorization.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.CreateResult").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Result.initialize(context, result);
	}
	public static java.lang.String createSObjectQueryString(IContext context, salesforce_connector.proxies.SObject _sObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SObject", _sObject == null ? null : _sObject.getMendixObject());
		return (java.lang.String) Core.microflowCall("Salesforce_Connector.CreateSObjectQueryString").withParams(params).execute(context);
	}
	public static system.proxies.HttpResponse dELETE(IContext context, salesforce_connector.proxies.Authorization _authorization, java.lang.String _request, java.lang.String _location)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authorization", _authorization == null ? null : _authorization.getMendixObject());
		params.put("Request", _request);
		params.put("Location", _location);
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.DELETE").withParams(params).execute(context);
		return result == null ? null : system.proxies.HttpResponse.initialize(context, result);
	}
	public static salesforce_connector.proxies.Query describeGlobal(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.DescribeGlobal").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Query.initialize(context, result);
	}
	public static salesforce_connector.proxies.ModuleSetup dS_CheckModuleSetup(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.DS_CheckModuleSetup").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.ModuleSetup.initialize(context, result);
	}
	public static java.lang.String encodeQuery(IContext context, java.lang.String _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query);
		return (java.lang.String) Core.microflowCall("Salesforce_Connector.EncodeQuery").withParams(params).execute(context);
	}
	public static void executeQuery(IContext context, salesforce_connector.proxies.Query _newQuery)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NewQuery", _newQuery == null ? null : _newQuery.getMendixObject());
		Core.microflowCall("Salesforce_Connector.ExecuteQuery").withParams(params).execute(context);
	}
	public static java.lang.String finalizeQuery(IContext context, java.lang.String _sELECT, java.lang.String _lIMIT, java.lang.String _oRDERBY, java.lang.String _wHERE, java.lang.String _sObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SELECT", _sELECT);
		params.put("LIMIT", _lIMIT);
		params.put("ORDERBY", _oRDERBY);
		params.put("WHERE", _wHERE);
		params.put("SObject", _sObject);
		return (java.lang.String) Core.microflowCall("Salesforce_Connector.FinalizeQuery").withParams(params).execute(context);
	}
	public static system.proxies.HttpResponse gET(IContext context, java.lang.String _request, salesforce_connector.proxies.Authorization _authorization)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Request", _request);
		params.put("Authorization", _authorization == null ? null : _authorization.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.GET").withParams(params).execute(context);
		return result == null ? null : system.proxies.HttpResponse.initialize(context, result);
	}
	public static system.proxies.HttpHeader getAuthorizationLocation(IContext context, system.proxies.HttpResponse _httpResponse)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("HttpResponse", _httpResponse == null ? null : _httpResponse.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.GetAuthorizationLocation").withParams(params).execute(context);
		return result == null ? null : system.proxies.HttpHeader.initialize(context, result);
	}
	public static void getDeleted(IContext context, salesforce_connector.proxies.SObject _sObject, salesforce_connector.proxies.Query _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SObject", _sObject == null ? null : _sObject.getMendixObject());
		params.put("Query", _query == null ? null : _query.getMendixObject());
		Core.microflowCall("Salesforce_Connector.GetDeleted").withParams(params).execute(context);
	}
	public static salesforce_connector.proxies.ModuleSetup getOrCreateModuleSetup(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.GetOrCreateModuleSetup").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.ModuleSetup.initialize(context, result);
	}
	public static salesforce_connector.proxies.Result getResult(IContext context, salesforce_connector.proxies.Authorization _authorization)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authorization", _authorization == null ? null : _authorization.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.GetResult").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Result.initialize(context, result);
	}
	public static void getUpdated(IContext context, salesforce_connector.proxies.SObject _sObject, salesforce_connector.proxies.Query _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SObject", _sObject == null ? null : _sObject.getMendixObject());
		params.put("Query", _query == null ? null : _query.getMendixObject());
		Core.microflowCall("Salesforce_Connector.GetUpdated").withParams(params).execute(context);
	}
	public static salesforce_connector.proxies.Query inputQuery(IContext context, salesforce_connector.proxies.Query _mappingParameter)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MappingParameter", _mappingParameter == null ? null : _mappingParameter.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.InputQuery").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Query.initialize(context, result);
	}
	public static salesforce_connector.proxies.SObject inputSObject(IContext context, salesforce_connector.proxies.SObject _mappingParameter)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MappingParameter", _mappingParameter == null ? null : _mappingParameter.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.InputSObject").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.SObject.initialize(context, result);
	}
	public static salesforce_connector.proxies.Authorization iVK_OAuth_UsernamePassword(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.IVK_OAuth_UsernamePassword").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Authorization.initialize(context, result);
	}
	public static void iVK_WebServerAuthorization(IContext context, salesforce_connector.proxies.Authorization _authorization, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authorization", _authorization == null ? null : _authorization.getMendixObject());
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		Core.microflowCall("Salesforce_Connector.IVK_WebServerAuthorization").withParams(params).execute(context);
	}
	public static salesforce_connector.proxies.Authorization oAuth_UsernamePassword(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.OAuth_UsernamePassword").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Authorization.initialize(context, result);
	}
	public static java.lang.String oAuth_WebServer(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		return (java.lang.String) Core.microflowCall("Salesforce_Connector.OAuth_WebServer").withParams(params).execute(context);
	}
	public static void open_Setup(IContext context, salesforce_connector.proxies.Authentication _authenticationCredentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AuthenticationCredentials", _authenticationCredentials == null ? null : _authenticationCredentials.getMendixObject());
		Core.microflowCall("Salesforce_Connector.Open_Setup").withParams(params).execute(context);
	}
	public static void openStep1_Setup(IContext context, salesforce_connector.proxies.Authentication _authenticationCredentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AuthenticationCredentials", _authenticationCredentials == null ? null : _authenticationCredentials.getMendixObject());
		Core.microflowCall("Salesforce_Connector.OpenStep1_Setup").withParams(params).execute(context);
	}
	public static void openStep2_Setup(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		Core.microflowCall("Salesforce_Connector.OpenStep2_Setup").withParams(params).execute(context);
	}
	public static system.proxies.HttpResponse pATCH(IContext context, salesforce_connector.proxies.Authorization _authorization, java.lang.String _request, java.lang.String _location)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authorization", _authorization == null ? null : _authorization.getMendixObject());
		params.put("Request", _request);
		params.put("Location", _location);
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.PATCH").withParams(params).execute(context);
		return result == null ? null : system.proxies.HttpResponse.initialize(context, result);
	}
	public static system.proxies.HttpResponse pOST(IContext context, java.lang.String _location, java.lang.String _request)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Location", _location);
		params.put("Request", _request);
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.POST").withParams(params).execute(context);
		return result == null ? null : system.proxies.HttpResponse.initialize(context, result);
	}
	public static system.proxies.HttpResponse pOST_Authorized(IContext context, java.lang.String _location, java.lang.String _request, salesforce_connector.proxies.Authorization _authorization)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Location", _location);
		params.put("Request", _request);
		params.put("Authorization", _authorization == null ? null : _authorization.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.POST_Authorized").withParams(params).execute(context);
		return result == null ? null : system.proxies.HttpResponse.initialize(context, result);
	}
	public static java.util.List<salesforce_connector.proxies.QuickAction> quickActions(IContext context, salesforce_connector.proxies.Resources _resources)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Resources", _resources == null ? null : _resources.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("Salesforce_Connector.QuickActions").withParams(params).execute(context);
		java.util.List<salesforce_connector.proxies.QuickAction> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(salesforce_connector.proxies.QuickAction.initialize(context, obj));
		}
		return result;
	}
	public static boolean reAuthorize(IContext context, salesforce_connector.proxies.Authentication _authentication, salesforce_connector.proxies.Authorization _authorization)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		params.put("Authorization", _authorization == null ? null : _authorization.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("Salesforce_Connector.ReAuthorize").withParams(params).execute(context);
	}
	public static java.util.List<salesforce_connector.proxies.recentItems> recentItems(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("Salesforce_Connector.RecentItems").withParams(params).execute(context);
		java.util.List<salesforce_connector.proxies.recentItems> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(salesforce_connector.proxies.recentItems.initialize(context, obj));
		}
		return result;
	}
	public static salesforce_connector.proxies.Records recordCount(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.RecordCount").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Records.initialize(context, result);
	}
	public static void saveSetup(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		Core.microflowCall("Salesforce_Connector.SaveSetup").withParams(params).execute(context);
	}
	public static java.util.List<salesforce_connector.proxies.SObject> showObjects(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("Salesforce_Connector.ShowObjects").withParams(params).execute(context);
		java.util.List<salesforce_connector.proxies.SObject> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(salesforce_connector.proxies.SObject.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<salesforce_connector.proxies.QuickAction> showQuickActions(IContext context, salesforce_connector.proxies.Resources _resources)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Resources", _resources == null ? null : _resources.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("Salesforce_Connector.ShowQuickActions").withParams(params).execute(context);
		java.util.List<salesforce_connector.proxies.QuickAction> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(salesforce_connector.proxies.QuickAction.initialize(context, obj));
		}
		return result;
	}
	public static salesforce_connector.proxies.Resources showResources(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ShowResources").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Resources.initialize(context, result);
	}
	public static salesforce_connector.proxies.SObject showSObjectBasicInformation(IContext context, salesforce_connector.proxies.SObject _sObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SObject", _sObject == null ? null : _sObject.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ShowSObjectBasicInformation").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.SObject.initialize(context, result);
	}
	public static salesforce_connector.proxies.SObject showSObjectDescribe(IContext context, salesforce_connector.proxies.SObject _sObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SObject", _sObject == null ? null : _sObject.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.ShowSObjectDescribe").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.SObject.initialize(context, result);
	}
	public static salesforce_connector.proxies.SObject sObjectBasicInformation(IContext context, salesforce_connector.proxies.SObject _sObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SObject", _sObject == null ? null : _sObject.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.SObjectBasicInformation").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.SObject.initialize(context, result);
	}
	public static salesforce_connector.proxies.SObject sObjectDescribe(IContext context, salesforce_connector.proxies.SObject _sObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SObject", _sObject == null ? null : _sObject.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.SObjectDescribe").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.SObject.initialize(context, result);
	}
	public static system.proxies.HttpResponse sObjectQuery(IContext context, salesforce_connector.proxies.SObject _sObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SObject", _sObject == null ? null : _sObject.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.SObjectQuery").withParams(params).execute(context);
		return result == null ? null : system.proxies.HttpResponse.initialize(context, result);
	}
	public static void startSetup(IContext context, salesforce_connector.proxies.ModuleSetup _moduleSetup)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ModuleSetup", _moduleSetup == null ? null : _moduleSetup.getMendixObject());
		Core.microflowCall("Salesforce_Connector.StartSetup").withParams(params).execute(context);
	}
	public static boolean val_Authentication(IContext context, salesforce_connector.proxies.Authentication _authentication)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Authentication", _authentication == null ? null : _authentication.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("Salesforce_Connector.Val_Authentication").withParams(params).execute(context);
	}
	public static salesforce_connector.proxies.Query writeSObjectQuery(IContext context, salesforce_connector.proxies.SObject _sObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SObject", _sObject == null ? null : _sObject.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Salesforce_Connector.WriteSObjectQuery").withParams(params).execute(context);
		return result == null ? null : salesforce_connector.proxies.Query.initialize(context, result);
	}
}