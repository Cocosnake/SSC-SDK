package com.sonymobile.sonyselectchina.api.content;

/**
 * Item class contains all detail informations of apk file on server. 
 * And it provides "Get" methods for UI presentation.
 * 
 * By the way, there is no url for downloading provided in Item. DetailUrl is 
 * used for launch Sony Select Client and open detail page of apk
 */
public class Item {

	/**
	 * Unique ID of application on server side
	 */
	private int id;
	
	/**
	 * Name of applicatoin
	 */
	private String name;
	
	/**
	 * Name of provider or manufacturer
	 */
	private String provider;
	
	/**
	 * The package name of application
	 */
	private String packagename;
	
	/**
	 * Size of apk file
	 */
	private float size;
	
	/**
	 * Description of application
	 */
	private String description;
	
	/**
	 * Url for downloading icon of application
	 */
	private String iconUrl;
	
	/**
	 * Version name of application
	 */
	private String versionName;
	
	/**
	 * Version code of applicatoin
	 */
	private String versionCode;
	
	/**
	 * Latest update time of application
	 */
	private String updateTime;
	
	/**
	 * Rating of application
	 */
	private String rating;
	
	/**
	 * Url use for opening detail info of application in Sony Select client
	 */
	private String detailUrl;

	/**
	 * Get unique ID of application on server side 
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Get name of application
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get provider or manufacturer of application
	 */
	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	/**
	 * Get Package Name of application
	 */
	public String getPackagename() {
		return packagename;
	}

	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}

	/**
	 * Get size of apk file
	 */
	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	/**
	 * Get description of application
	 */
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get url for downloading icon of application
	 */
	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	/**
	 * Get version name of application
	 */
	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	/**
	 * Get version code of application
	 */
	public String getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	/**
	 * Get latest update time of application
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * Get rating of application
	 */
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * Get url for opening detail information in Sony Select Client
	 */
	public String getDetailUrl() {
		return detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}
	
	
}
