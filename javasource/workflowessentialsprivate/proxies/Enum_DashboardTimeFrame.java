// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowessentialsprivate.proxies;

public enum Enum_DashboardTimeFrame
{
	Last_7_days(new java.lang.String[][] { new java.lang.String[] { "en_US", "Last 7 days" } }),
	Last_4_weeks(new java.lang.String[][] { new java.lang.String[] { "en_US", "Last 4 weeks" } }),
	Last_6_months(new java.lang.String[][] { new java.lang.String[] { "en_US", "Last 6 months" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Enum_DashboardTimeFrame(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
