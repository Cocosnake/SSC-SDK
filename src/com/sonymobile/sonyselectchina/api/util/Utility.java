package com.sonymobile.sonyselectchina.api.util;

import java.util.List;


public class Utility {

	/**
     * Which version of the SDK this is.
     */
    private static final String SDK_VERSION = "${project.version}";
    
    /**
     * This is a hack to enable development in eclipse while
     * still getting version strings that the server will not
     * refuse.
     */
    public static String getSDKVer() {
        if (!SDK_VERSION.contains("${")) {
            return SDK_VERSION;
        } else {
            return "999.999.999";
        }
    }
    
    /**
     * Get the information of install Sony Select Client(s) 
     */
    public List<ClientInfo> getClientInfo(){
    	return null;
    }
    
    /**
     * Get the Url for downloading Sony Select Client
     */
    public String getClientDownloadUrl(){
    	return "http://";
    }
}
