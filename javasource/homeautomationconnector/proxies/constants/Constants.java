// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package homeautomationconnector.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the HomeAutomationConnector module

	public static java.lang.String getclientID()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("HomeAutomationConnector.clientID");
	}

	public static java.lang.String getipaddress()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("HomeAutomationConnector.ipaddress");
	}
}