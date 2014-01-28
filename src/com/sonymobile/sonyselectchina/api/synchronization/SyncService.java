package com.sonymobile.sonyselectchina.api.synchronization;


import android.app.IntentService;
import android.content.Intent;

/**
 * While this class needs to be added to the AndroidManifest.xml, it should not
 * be used directly. Instead, access to the sync functionality should go through
 * the {@link SyncManager} class.
 * <p />
 * The entry in the AndroidManifest.xml should be:
 * 
 * <pre>
 * {@code
 * <service
 *     android:name="com.sonymobile.sonyselectchina.api.synchronization.SyncService"
 *     android:enabled="true"
 *     android:exported="false" >
 *     <intent-filter>
 *         <action android:name="com.sonymobile.sonyselectchina.action.SYNC_REQUEST" />
 *         <category android:name="android.intent.category.DEFAULT" />
 *     </intent-filter>
 * </service>
 * }
 * </pre>
 * 
 * An intent service that spawns a new worker thread on which it will perform
 * network access and fetch any new content. Upon successfully fetched items, a
 * file system access is performed and the content is written to a database.
 *  
 */
public class SyncService extends IntentService {
	
	 /**
     * Action string sent to the service when a synchronization is requested.
     */
    static final String ACTION_SYNC_REQUEST = "com.sonymobile.sonyselectchina.sdk.action.SYNC_REQUEST";

    /**
     * Action string sent by the service when it has finished synchronizing.
     */
    static final String ACTION_SYNC_FINISHED = "com.sonymobile.sonyselectchina.sdk.action.SYNC_FINISH";

    /**
     * Extra key sent by the service with the
     * {@link com.sonymobile.sonyselectchina.api.synchronization.SyncService#ACTION_SYNC_FINISHED}
     * action, describing the result of a synchronization.
     */
    static final String EXTRA_SYNC_STATUS = "com.sonymobile.sonyselectchina.sdk.extra.SYNC_STATUS";
    
    /**
     * Extra key sent to the service, holding the {@link SyncRequest} object.
     * <em>(this key is <strong>mandatory</strong>)</em>.
     */
    static final String EXTRA_SYNC_REQUEST = "com.sonymobile.sonyselectchina.sdk.extra.SYNC_REQUEST";
    
    
    /**
     * Result of successful synchronization.
     */
    static final int SYNC_SUCCESS = 1;
    
    /**
     * Result of failed synchronization.
     */
    static final int SYNC_FAILURE = 2;

    /**
     * Result of a synchronization request when there was nothing to
     * synchronize.
     */
    static final int SYNC_NOTNECESSARY = 3;

    /**
     * Error result sent by the server.
     */
    static final int SYNC_ERROR = 4;  

    /**
     * Unknown result of synchronization request.
     */
    static final int SYNC_UNKNOWN = -1;
    
    public static final String EXTRA_SYNC_ERROR = "com.sonymobile.sonyselect.sdk.extra.SYNC_ERROR";

	
	public SyncService() {
		super( "SyncService");
    }
		
	@Override
	protected void onHandleIntent(Intent intent) {
		// TODO Auto-generated method stub

	}

}
