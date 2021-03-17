// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package sapodataconnector.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import system.proxies.HttpResponse;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * This action, provides the functionality to retrieve the Http_response of your last Odata request.
 * You could also retrieve all the headers that has been received during the last Odata request using the association between Http_response and Headers.
 */
public class GetLatestHttpResponse extends CustomJavaAction<IMendixObject>
{
	public GetLatestHttpResponse(IContext context)
	{
		super(context);
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		 HttpResponse httpResponse =(HttpResponse) context().getData().get(sapodataconnector.utils.ODataResponseHandler.HTTP_RESPONSE);
		 return httpResponse.getMendixObject();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GetLatestHttpResponse";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
