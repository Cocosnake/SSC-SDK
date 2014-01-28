package com.sonymobile.sonyselectchina.api.synchronization;


/**
 * Listener interface to get a callback whenever a sync is finished.
 * 
 * @see SyncManager
 * 
 */
public interface SyncListener {

    /**
     * called on registered listeners after each synch.
     * 
     * @param result
     *            the result of the just finished sync.
     */
    void onSyncFinished(SyncResult result);

    /**
     * called on registered listeners after each synch if something goes wrong.
     * 
     * @param error
     *            the error of the just finished sync.
     */
    void onSyncError(SyncError error);

}