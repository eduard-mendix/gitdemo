// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package masterdata.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the MasterData module

	public static java.lang.String getDefaultPassword()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("MasterData.DefaultPassword");
	}

	public static java.lang.String getGoogleAPIKey()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("MasterData.GoogleAPIKey");
	}

	public static java.lang.String getLocationIQID()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("MasterData.LocationIQID");
	}
}