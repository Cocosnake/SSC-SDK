package com.sonymobile.sonyselectchina.api.util;

public class Logger {

	private static boolean isDebug = false;

	/**
	 * Enable logging of SDK
	 */
	public void debugEnable() {
		this.isDebug = true;
	}

	/**
	 * Disable logging of SDK
	 */
	public void debugDisable() {
		this.isDebug = false;
	}

	public static int d(String tag, String message) {
		return isDebug ? android.util.Log.d(tag, message) : -1;
	}

	public static int d(String tag, String message, Throwable t) {
		return isDebug ? android.util.Log.d(tag, message, t) : -1;
	}

	public static int e(String tag, String message) {
		return isDebug ? android.util.Log.e(tag, message) : -1;
	}

	public static int e(String tag, String message, Throwable t) {
		return isDebug ? android.util.Log.e(tag, message, t) : -1;
	}

	public static int i(String tag, String message) {
		return isDebug ? android.util.Log.i(tag, message) : -1;
	}

	public static int i(String tag, String message, Throwable t) {
		return isDebug ? android.util.Log.i(tag, message, t) : -1;
	}
}
