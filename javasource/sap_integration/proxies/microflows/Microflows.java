// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sap_integration.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the SAP_Integration module
	public static boolean bCO_Product(IContext context, sap_integration.proxies.Product _product)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Product", _product == null ? null : _product.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("SAP_Integration.BCO_Product").withParams(params).execute(context);
	}
}