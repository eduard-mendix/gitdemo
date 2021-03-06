// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package iot.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the IoT module
	public static void aCT_DeleteCharacteristic(IContext context, iot.proxies.Characteristic _characteristic)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Characteristic", _characteristic == null ? null : _characteristic.getMendixObject());
		Core.microflowCall("IoT.ACT_DeleteCharacteristic").withParams(params).execute(context);
	}
	public static void aCT_DeleteProfile(IContext context, iot.proxies.Profile _profile)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Profile", _profile == null ? null : _profile.getMendixObject());
		Core.microflowCall("IoT.ACT_DeleteProfile").withParams(params).execute(context);
	}
	public static void aCT_DeleteService(IContext context, iot.proxies.Service _service)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Service", _service == null ? null : _service.getMendixObject());
		Core.microflowCall("IoT.ACT_DeleteService").withParams(params).execute(context);
	}
	public static void aCT_ExportProfile(IContext context, iot.proxies.Profile _profile)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Profile", _profile == null ? null : _profile.getMendixObject());
		Core.microflowCall("IoT.ACT_ExportProfile").withParams(params).execute(context);
	}
	public static void aCT_ExportSounds(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("IoT.ACT_ExportSounds").withParams(params).execute(context);
	}
	public static void aCT_ImportProfile(IContext context, iot.proxies.Json _profileJson)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ProfileJson", _profileJson == null ? null : _profileJson.getMendixObject());
		Core.microflowCall("IoT.ACT_ImportProfile").withParams(params).execute(context);
	}
	public static void aCT_ImportSounds(IContext context, iot.proxies.Json _json)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Json", _json == null ? null : _json.getMendixObject());
		Core.microflowCall("IoT.ACT_ImportSounds").withParams(params).execute(context);
	}
	public static void aCT_NewCharacteristic(IContext context, iot.proxies.Service _service)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Service", _service == null ? null : _service.getMendixObject());
		Core.microflowCall("IoT.ACT_NewCharacteristic").withParams(params).execute(context);
	}
	public static void aCT_NewProfile(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("IoT.ACT_NewProfile").withParams(params).execute(context);
	}
	public static void aCT_NewService(IContext context, iot.proxies.Profile _profile)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Profile", _profile == null ? null : _profile.getMendixObject());
		Core.microflowCall("IoT.ACT_NewService").withParams(params).execute(context);
	}
	public static void changeColor(IContext context, iot.proxies.Accessory _accessory)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		Core.microflowCall("IoT.ChangeColor").withParams(params).execute(context);
	}
	public static void changeColorTemp(IContext context, iot.proxies.Accessory _accessory)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		Core.microflowCall("IoT.ChangeColorTemp").withParams(params).execute(context);
	}
	public static void changeColorToBlue(IContext context, iot.proxies.Accessory _accessory)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		Core.microflowCall("IoT.ChangeColorToBlue").withParams(params).execute(context);
	}
	public static void changeColorToRed(IContext context, iot.proxies.Accessory _accessory)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		Core.microflowCall("IoT.ChangeColorToRed").withParams(params).execute(context);
	}
	public static boolean createAPIAddress(IContext context, iot.proxies.Connector _connector)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Connector", _connector == null ? null : _connector.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("IoT.CreateAPIAddress").withParams(params).execute(context);
	}
	public static void createRooms(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("IoT.CreateRooms").withParams(params).execute(context);
	}
	public static void createTestAddress(IContext context, iot.proxies.Connector _connector)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Connector", _connector == null ? null : _connector.getMendixObject());
		Core.microflowCall("IoT.CreateTestAddress").withParams(params).execute(context);
	}
	public static java.util.List<iot.proxies.AccessorySceneSelect> dS_AccessoriesToSelect(IContext context, iot.proxies.Scene _scene)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Scene", _scene == null ? null : _scene.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("IoT.DS_AccessoriesToSelect").withParams(params).execute(context);
		java.util.List<iot.proxies.AccessorySceneSelect> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(iot.proxies.AccessorySceneSelect.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<iot.proxies.Accessory> dS_NotRoomAccessories(IContext context, iot.proxies.Room _room)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Room", _room == null ? null : _room.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("IoT.DS_NotRoomAccessories").withParams(params).execute(context);
		java.util.List<iot.proxies.Accessory> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(iot.proxies.Accessory.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<iot.proxies.Sensor> dS_NotRoomSensor(IContext context, iot.proxies.Room _room)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Room", _room == null ? null : _room.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("IoT.DS_NotRoomSensor").withParams(params).execute(context);
		java.util.List<iot.proxies.Sensor> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(iot.proxies.Sensor.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<iot.proxies.Accessory> dS_RoomAccessories(IContext context, iot.proxies.Room _room)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Room", _room == null ? null : _room.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("IoT.DS_RoomAccessories").withParams(params).execute(context);
		java.util.List<iot.proxies.Accessory> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(iot.proxies.Accessory.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<iot.proxies.Sensor> dS_RoomSensors(IContext context, iot.proxies.Room _room)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Room", _room == null ? null : _room.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("IoT.DS_RoomSensors").withParams(params).execute(context);
		java.util.List<iot.proxies.Sensor> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(iot.proxies.Sensor.initialize(context, obj));
		}
		return result;
	}
	public static iot.proxies.AccessorySceneSelect dS_Selection(IContext context, iot.proxies.Accessory _accessory, iot.proxies.Scene _scene)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		params.put("Scene", _scene == null ? null : _scene.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("IoT.DS_Selection").withParams(params).execute(context);
		return result == null ? null : iot.proxies.AccessorySceneSelect.initialize(context, result);
	}
	public static void iNV_CreateColorCharacteristic(IContext context, iot.proxies.Measurement _measurement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Measurement", _measurement == null ? null : _measurement.getMendixObject());
		Core.microflowCall("IoT.INV_CreateColorCharacteristic").withParams(params).execute(context);
	}
	public static void iNV_CreateGasCharacteristic(IContext context, iot.proxies.Measurement _measurement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Measurement", _measurement == null ? null : _measurement.getMendixObject());
		Core.microflowCall("IoT.INV_CreateGasCharacteristic").withParams(params).execute(context);
	}
	public static void iNV_CreateHumidityCharacteristic(IContext context, iot.proxies.Measurement _measurement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Measurement", _measurement == null ? null : _measurement.getMendixObject());
		Core.microflowCall("IoT.INV_CreateHumidityCharacteristic").withParams(params).execute(context);
	}
	public static void iNV_CreatePressureCharacteristic(IContext context, iot.proxies.Measurement _measurement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Measurement", _measurement == null ? null : _measurement.getMendixObject());
		Core.microflowCall("IoT.INV_CreatePressureCharacteristic").withParams(params).execute(context);
	}
	public static void iNV_CreateTemperatureCharacteristic(IContext context, iot.proxies.Measurement _measurement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Measurement", _measurement == null ? null : _measurement.getMendixObject());
		Core.microflowCall("IoT.INV_CreateTemperatureCharacteristic").withParams(params).execute(context);
	}
	public static void iNV_DeleteOldCharacteristicValues(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("IoT.INV_DeleteOldCharacteristicValues").withParams(params).execute(context);
	}
	public static iot.proxies.Measurement iNV_GetBatteryValue(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("IoT.INV_GetBatteryValue").withParams(params).execute(context);
		return result == null ? null : iot.proxies.Measurement.initialize(context, result);
	}
	public static iot.proxies.Measurement iNV_GetButtonState(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("IoT.INV_GetButtonState").withParams(params).execute(context);
		return result == null ? null : iot.proxies.Measurement.initialize(context, result);
	}
	public static java.util.List<iot.proxies.ColorCharacteristic> iNV_GetColorValues(IContext context, iot.proxies.GraphContext _graphContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("GraphContext", _graphContext == null ? null : _graphContext.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("IoT.INV_GetColorValues").withParams(params).execute(context);
		java.util.List<iot.proxies.ColorCharacteristic> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(iot.proxies.ColorCharacteristic.initialize(context, obj));
		}
		return result;
	}
	public static iot.proxies.Measurement iNV_GetFirmwareValue(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("IoT.INV_GetFirmwareValue").withParams(params).execute(context);
		return result == null ? null : iot.proxies.Measurement.initialize(context, result);
	}
	public static java.util.List<iot.proxies.GasCharacteristic> iNV_GetGasValues(IContext context, iot.proxies.GraphContext _graphContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("GraphContext", _graphContext == null ? null : _graphContext.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("IoT.INV_GetGasValues").withParams(params).execute(context);
		java.util.List<iot.proxies.GasCharacteristic> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(iot.proxies.GasCharacteristic.initialize(context, obj));
		}
		return result;
	}
	public static iot.proxies.GraphContext iNV_GetGraphContext(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("IoT.INV_GetGraphContext").withParams(params).execute(context);
		return result == null ? null : iot.proxies.GraphContext.initialize(context, result);
	}
	public static iot.proxies.Measurement iNV_GetHumidityValue(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("IoT.INV_GetHumidityValue").withParams(params).execute(context);
		return result == null ? null : iot.proxies.Measurement.initialize(context, result);
	}
	public static java.util.List<iot.proxies.HumidityCharacteristic> iNV_GetHumidityValues(IContext context, iot.proxies.GraphContext _graphContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("GraphContext", _graphContext == null ? null : _graphContext.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("IoT.INV_GetHumidityValues").withParams(params).execute(context);
		java.util.List<iot.proxies.HumidityCharacteristic> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(iot.proxies.HumidityCharacteristic.initialize(context, obj));
		}
		return result;
	}
	public static iot.proxies.Measurement iNV_GetMotionValue(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("IoT.INV_GetMotionValue").withParams(params).execute(context);
		return result == null ? null : iot.proxies.Measurement.initialize(context, result);
	}
	public static iot.proxies.Measurement iNV_GetNameValue(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("IoT.INV_GetNameValue").withParams(params).execute(context);
		return result == null ? null : iot.proxies.Measurement.initialize(context, result);
	}
	public static iot.proxies.Measurement iNV_GetPressureValue(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("IoT.INV_GetPressureValue").withParams(params).execute(context);
		return result == null ? null : iot.proxies.Measurement.initialize(context, result);
	}
	public static java.util.List<iot.proxies.PressureCharacteristic> iNV_GetPressureValues(IContext context, iot.proxies.GraphContext _graphContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("GraphContext", _graphContext == null ? null : _graphContext.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("IoT.INV_GetPressureValues").withParams(params).execute(context);
		java.util.List<iot.proxies.PressureCharacteristic> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(iot.proxies.PressureCharacteristic.initialize(context, obj));
		}
		return result;
	}
	public static iot.proxies.Measurement iNV_GetTemperatureValue(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("IoT.INV_GetTemperatureValue").withParams(params).execute(context);
		return result == null ? null : iot.proxies.Measurement.initialize(context, result);
	}
	public static java.util.List<iot.proxies.TemperatureCharacteristic> iNV_GetTemperatureValues(IContext context, iot.proxies.GraphContext _graphContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("GraphContext", _graphContext == null ? null : _graphContext.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("IoT.INV_GetTemperatureValues").withParams(params).execute(context);
		java.util.List<iot.proxies.TemperatureCharacteristic> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(iot.proxies.TemperatureCharacteristic.initialize(context, obj));
		}
		return result;
	}
	public static void iNV_HandleTemperature(IContext context, java.math.BigDecimal _temperature)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Temperature", _temperature);
		Core.microflowCall("IoT.INV_HandleTemperature").withParams(params).execute(context);
	}
	public static iot.proxies.Json iNV_UploadContext(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("IoT.INV_UploadContext").withParams(params).execute(context);
		return result == null ? null : iot.proxies.Json.initialize(context, result);
	}
	public static void longBlink(IContext context, iot.proxies.Accessory _accessory)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		Core.microflowCall("IoT.LongBlink").withParams(params).execute(context);
	}
	public static void maxTemperature(IContext context, iot.proxies.Accessory _accessory)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		Core.microflowCall("IoT.MaxTemperature").withParams(params).execute(context);
	}
	public static void minTemperature(IContext context, iot.proxies.Accessory _accessory)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		Core.microflowCall("IoT.MinTemperature").withParams(params).execute(context);
	}
	public static void oUP_Measurement(IContext context, iot.proxies.Measurement _measurement)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Measurement", _measurement == null ? null : _measurement.getMendixObject());
		Core.microflowCall("IoT.OUP_Measurement").withParams(params).execute(context);
	}
	public static void setBrightness(IContext context, iot.proxies.Accessory _accessory)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		Core.microflowCall("IoT.SetBrightness").withParams(params).execute(context);
	}
	public static void setBrightness100(IContext context, iot.proxies.Accessory _accessory)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		Core.microflowCall("IoT.SetBrightness100").withParams(params).execute(context);
	}
	public static void setBrightness50(IContext context, iot.proxies.Accessory _accessory)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		Core.microflowCall("IoT.SetBrightness50").withParams(params).execute(context);
	}
	public static void shortBlink(IContext context, iot.proxies.Accessory _accessory)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		Core.microflowCall("IoT.ShortBlink").withParams(params).execute(context);
	}
	public static void sUB_AccessorySelect(IContext context, iot.proxies.Accessory _accessory, iot.proxies.Scene _scene, java.util.List<iot.proxies.AccessorySceneSelect> _accessorySceneSelectList)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		params.put("Scene", _scene == null ? null : _scene.getMendixObject());
		java.util.ArrayList<IMendixObject> listparam_accessorySceneSelectList = null;
		if (_accessorySceneSelectList != null)
		{
			listparam_accessorySceneSelectList = new java.util.ArrayList<>();
			for (iot.proxies.AccessorySceneSelect obj : _accessorySceneSelectList)
				listparam_accessorySceneSelectList.add(obj.getMendixObject());
		}
		params.put("AccessorySceneSelectList", listparam_accessorySceneSelectList);

		Core.microflowCall("IoT.SUB_AccessorySelect").withParams(params).execute(context);
	}
	public static void sUB_ProcessSensorImport(IContext context, iot.proxies.Profile _profile)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Profile", _profile == null ? null : _profile.getMendixObject());
		Core.microflowCall("IoT.SUB_ProcessSensorImport").withParams(params).execute(context);
	}
	public static void sUB_ProcessSoundImport(IContext context, iot.proxies.SoundRoot _soundRoot)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SoundRoot", _soundRoot == null ? null : _soundRoot.getMendixObject());
		Core.microflowCall("IoT.SUB_ProcessSoundImport").withParams(params).execute(context);
	}
	public static void turnLightOff(IContext context, iot.proxies.Accessory _accessory)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		Core.microflowCall("IoT.TurnLightOff").withParams(params).execute(context);
	}
	public static void turnLightOn(IContext context, iot.proxies.Accessory _accessory)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Accessory", _accessory == null ? null : _accessory.getMendixObject());
		Core.microflowCall("IoT.TurnLightOn").withParams(params).execute(context);
	}
	public static void turnSceneOff(IContext context, iot.proxies.Scene _scene)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Scene", _scene == null ? null : _scene.getMendixObject());
		Core.microflowCall("IoT.TurnSceneOff").withParams(params).execute(context);
	}
	public static void turnSceneOn(IContext context, iot.proxies.Scene _scene)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Scene", _scene == null ? null : _scene.getMendixObject());
		Core.microflowCall("IoT.TurnSceneOn").withParams(params).execute(context);
	}
}