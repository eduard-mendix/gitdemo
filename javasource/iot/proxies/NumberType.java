// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package iot.proxies;

public enum NumberType
{
	Uint8(new java.lang.String[][] { new java.lang.String[] { "en_US", "Uint8" } }),
	Uint16(new java.lang.String[][] { new java.lang.String[] { "en_US", "Uint16" } }),
	Uint32(new java.lang.String[][] { new java.lang.String[] { "en_US", "Uint32" } }),
	Int8(new java.lang.String[][] { new java.lang.String[] { "en_US", "Int8" } }),
	Int16(new java.lang.String[][] { new java.lang.String[] { "en_US", "Int16" } }),
	Int32(new java.lang.String[][] { new java.lang.String[] { "en_US", "Int32" } }),
	Float32(new java.lang.String[][] { new java.lang.String[] { "en_US", "Float32" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private NumberType(java.lang.String[][] captionStrings)
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
