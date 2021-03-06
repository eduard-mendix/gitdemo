// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package iot.proxies;

public enum Devices
{
	AC(new java.lang.String[][] { new java.lang.String[] { "en_US", "AC" } }),
	Bell(new java.lang.String[][] { new java.lang.String[] { "en_US", "Bell" } }),
	Blind(new java.lang.String[][] { new java.lang.String[] { "en_US", "Blind" } }),
	Bridge(new java.lang.String[][] { new java.lang.String[] { "en_US", "Bridge" } }),
	Camera(new java.lang.String[][] { new java.lang.String[] { "en_US", "Camera" } }),
	Fan(new java.lang.String[][] { new java.lang.String[] { "en_US", "Fan" } }),
	Faucets(new java.lang.String[][] { new java.lang.String[] { "en_US", "Faucets" } }),
	Garage(new java.lang.String[][] { new java.lang.String[] { "en_US", "Garage" } }),
	Heating(new java.lang.String[][] { new java.lang.String[] { "en_US", "Heating" } }),
	Humidifier(new java.lang.String[][] { new java.lang.String[] { "en_US", "Humidifier" } }),
	Light(new java.lang.String[][] { new java.lang.String[] { "en_US", "Light" } }),
	Lock(new java.lang.String[][] { new java.lang.String[] { "en_US", "Lock" } }),
	Plug(new java.lang.String[][] { new java.lang.String[] { "en_US", "Plug" } }),
	Purifier(new java.lang.String[][] { new java.lang.String[] { "en_US", "Purifier" } }),
	Router(new java.lang.String[][] { new java.lang.String[] { "en_US", "Router" } }),
	Security(new java.lang.String[][] { new java.lang.String[] { "en_US", "Security" } }),
	Sensor(new java.lang.String[][] { new java.lang.String[] { "en_US", "Sensor" } }),
	Speaker(new java.lang.String[][] { new java.lang.String[] { "en_US", "Speaker" } }),
	Sprinkler(new java.lang.String[][] { new java.lang.String[] { "en_US", "Sprinkler" } }),
	_Switch(new java.lang.String[][] { new java.lang.String[] { "en_US", "Switch" } }),
	TV(new java.lang.String[][] { new java.lang.String[] { "en_US", "TV" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Devices(java.lang.String[][] captionStrings)
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
