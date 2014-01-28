package com.sonymobile.sonyselectchina.api.synchronization;

import java.io.Serializable;

public class SyncError implements Serializable {

    private static final long serialVersionUID = 1L;

    private String systemShutdown;

    private String errorMessage;

    private String endUserMessage;

    private String endUserTitle;
    
    /**
     * @return the systemShutdown
     */
    public String getSystemShutdown() {
        return systemShutdown;
    }

    /**
     * @param systemShutdown
     *            the systemShutdown to set
     */
    public void setSystemShutdown(String systemShutdown) {
        this.systemShutdown = systemShutdown;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage
     *            the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * @return the endUserMessage
     */
    public String getEndUserMessage() {
        return endUserMessage;
    }

    /**
     * @param endUserMessage
     *            the endUserMessage to set
     */
    public void setEndUserMessage(String endUserMessage) {
        this.endUserMessage = endUserMessage;
    }

    /**
     * @return the endUserTitle
     */
    public String getEndUserTitle() {
        return endUserTitle;
    }

    /**
     * @param endUserTitle
     *            the endUserTitle to set
     */
    public void setEndUserTitle(String endUserTitle) {
        this.endUserTitle = endUserTitle;
    }

}
