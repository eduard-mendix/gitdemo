// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package salesforce_connector.proxies;

public enum StatusCode
{
	_200(new java.lang.String[][] { new java.lang.String[] { "en_US", "200" } }),
	_201(new java.lang.String[][] { new java.lang.String[] { "en_US", "201" } }),
	_204(new java.lang.String[][] { new java.lang.String[] { "en_US", "204" } }),
	_300(new java.lang.String[][] { new java.lang.String[] { "en_US", "300" } }),
	_304(new java.lang.String[][] { new java.lang.String[] { "en_US", "304" } }),
	_400(new java.lang.String[][] { new java.lang.String[] { "en_US", "400" } }),
	_401(new java.lang.String[][] { new java.lang.String[] { "en_US", "401" } }),
	_403(new java.lang.String[][] { new java.lang.String[] { "en_US", "403" } }),
	_404(new java.lang.String[][] { new java.lang.String[] { "en_US", "404" } }),
	_405(new java.lang.String[][] { new java.lang.String[] { "en_US", "405" } }),
	_415(new java.lang.String[][] { new java.lang.String[] { "en_US", "415" } }),
	_500(new java.lang.String[][] { new java.lang.String[] { "en_US", "500" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private StatusCode(java.lang.String[][] captionStrings)
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