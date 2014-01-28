package com.sonymobile.sonyselectchina.api.util;


/**
 * Represent the collection of information about Sony Select Client
 */
public class ClientInfo {

	private String packageName;
	
	private String versionCode;
	
	private String type;
	
	static final String CLIENT_TYPE_PHONE="client_type_phone";
	
	static final String CLIENT_TYPE_TABLET="client_type_tablet";
	
	public ClientInfo(){}
	
	public void setPkgName(String packageName) {
		this.packageName = packageName;
	}

	public String getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPkgName(){
		return this.packageName;
	}
	
	public String versionCode(){
		return this.versionCode;
	}
	
	public String getType(){
		return this.type;
	}
}
