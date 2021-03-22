// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package masterdata.proxies;

public enum IncidentReportStatus
{
	To_be_assigned(new java.lang.String[][] { new java.lang.String[] { "en_US", "To be assigned" } }),
	Assigned_waiting_for_manager_approval(new java.lang.String[][] { new java.lang.String[] { "en_US", "Assigned waiting for manager approval" } }),
	Assigned_confirmed(new java.lang.String[][] { new java.lang.String[] { "en_US", "Assigned confirmed" } }),
	Manager_rejected(new java.lang.String[][] { new java.lang.String[] { "en_US", "Manager rejected" } }),
	Closed(new java.lang.String[][] { new java.lang.String[] { "en_US", "Closed" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private IncidentReportStatus(java.lang.String[][] captionStrings)
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