// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package appmain.proxies;

public enum Scenes
{
	Good_Morning(new java.lang.String[][] { new java.lang.String[] { "en_US", "Good Morning" } }),
	Cinema(new java.lang.String[][] { new java.lang.String[] { "en_US", "Cinema" } }),
	Arrive_Home(new java.lang.String[][] { new java.lang.String[] { "en_US", "Arrive Home" } }),
	Breakfast(new java.lang.String[][] { new java.lang.String[] { "en_US", "Breakfast" } }),
	Coffee(new java.lang.String[][] { new java.lang.String[] { "en_US", "Coffee" } }),
	Leave_Home(new java.lang.String[][] { new java.lang.String[] { "en_US", "Leave Home" } }),
	Party(new java.lang.String[][] { new java.lang.String[] { "en_US", "Party" } }),
	Good_Night(new java.lang.String[][] { new java.lang.String[] { "en_US", "Good Night" } }),
	Meal_Time(new java.lang.String[][] { new java.lang.String[] { "en_US", "Meal Time" } }),
	Lounge(new java.lang.String[][] { new java.lang.String[] { "en_US", "Lounge" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Scenes(java.lang.String[][] captionStrings)
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