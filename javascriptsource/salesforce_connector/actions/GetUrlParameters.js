// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
import { Big } from "big.js";

// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * @param {string} url
 * @param {MxObject} oAuthResponse
 * @returns {Promise.<boolean>}
 */
export async function GetUrlParameters(url, oAuthResponse) {
	// BEGIN USER CODE
		var url_string = new URL(url);
		var code = url_string.searchParams.get("code");
		var state = url_string.searchParams.get("state");
		var nonce = url_string.searchParams.get("nonce");
		var access_token = url_string.searchParams.get("access_token");
		var refresh_token = url_string.searchParams.get("refresh_token");
		var token_type = url_string.searchParams.get("token_type");
		var instance_url = url_string.searchParams.get("instance_url");
		var issued_at = url_string.searchParams.get("issued_at");
		var signature = url_string.searchParams.get("signature");
		var scope = url_string.searchParams.get("scope");
		return new Promise(function(resolve, reject){
				try{
					oAuthResponse.set("Nonce", nonce);
					oAuthResponse.set("Code", code);
					oAuthResponse.set("State", state);
					oAuthResponse.set("Access_token", access_token);
					oAuthResponse.set("Refresh_token", refresh_token);
					oAuthResponse.set("Token_type", token_type);
					oAuthResponse.set("Instance_url", instance_url);
					oAuthResponse.set("Issued_at", issued_at);
					oAuthResponse.set("Signature", signature);
					oAuthResponse.set("Scope", scope);
					resolve(true);
				}catch(error){
					console.error(error);
					reject(false);
				}
			});
	// END USER CODE
}
