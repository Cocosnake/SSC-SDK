package com.sonymobile.sonyselectchina.api.synchronization;


import android.app.Activity;
import android.content.Context;


/**
 * Facade class for starting synchronization sessions and getting the result
 * from them.
 */
public class SyncManager {
	
	private Context context;

	/**
	 * SyncRequest represents a request to sync the content from the server. 
	 * It is normally created in {@link SyncManager#createSyncRequest()} 
	 */
	public static final class SyncRequest{
		
		private int id;
		
		SyncRequest(){
		}
		
		SyncRequest(String channel, String type){}
		
		SyncRequest(String channel, String type, int start, int offset){}
		
		/**
		 * Return the unique ID of request 
		 */
		public int getRequestId(){
			return this.id;
		}
		
	}
	/**
	 * Constructor of SyncManager
	 */
	public SyncManager(Context context){
		this.context = context;
	}
	
	/**
	 * Create new SyncRequest with Channal and type. This request will fetch all 
	 * data belong to channel/type
	 */
	public SyncRequest createSyncRequest(String channel, String type){
		return new SyncRequest(channel, type);
	}
	
	/**
	 * Create new SyncRequest in channel/type. This request will fetch sub-collection
	 * of data according to start and offest
	 * */
	public SyncRequest createSyncRequest(String channel, String type, int start, int offset){
		return new SyncRequest(channel, type, start, offset);
	}
	
	/**
	 * Start to handle request 
	 */
	public void start( SyncRequest request){
		
	}
	
	/**
	 *  Cancel all process of request handling
	 */
	public void release(){
		
	}
	
	/**
	 * Clean the local database with channel &type defined in request.
	 * 
	 * If request is NULL, will clean all datea in local database
	 */
	public void cleanCache(SyncRequest request){
		
	}
	
	/**
	 * Get latest data from server according to channel & type defined in 
	 * request and refresh local database.
	 * 
	 *  If request is NULL, will refresh all data in local database
	 */
	public void refreshCache(SyncRequest request){
		
	}
	
    /**
     * Registers a {@link SyncListener} to get notified of the result of
     * synchronization sessions. Note that there is no direct correspondence
     * between calls to {@link #perform(SyncRequest)} and callbacks to the
     * listner. One call to {@link #perform(SyncRequest)} could possibly
     * generate several calls to the {@link SyncListener}.<br />
     * All registered listeners needs to be unregistered before the application
     * ends. Typically, life cycle methods like {@link Activity#onStart} and
     * {@link Activity#onStop} are used to handle this.
     * 
     * @param listener
     *            the listener to register.
     * @see #unregisterSyncListener(SyncListener)
     */
	public void registerSyncListener(SyncListener listener){
		
	}
	
	 /**
     * Unregisters a previously registered {@link SyncListener}.
     * 
     * @param listener
     *            the listener to unregister.
     * @see #registerSyncListener(SyncListener)
     */
    public void unregisterSyncListener(SyncListener listener) {
     
    }

	
}
