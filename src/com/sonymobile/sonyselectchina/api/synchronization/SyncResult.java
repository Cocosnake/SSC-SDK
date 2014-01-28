package com.sonymobile.sonyselectchina.api.synchronization;

import java.util.ArrayList;
import java.util.List;

import com.sonymobile.sonyselectchina.api.content.Item;

/**
 * A synchronization result representation passed on the listening clients.
 */
public class SyncResult {

	enum Status {
		SUCCESS, FAILURE, NOT_NECESSARY, ERROR;
	}

	SyncResult(){}
	
	SyncResult(int id){
		
	}
	
	/**
	 * Unique ID of result, which is the same number refer to request.
	 */
	private int id;
	
	private Status status;
	
	private List<Item> resultSet = new ArrayList<Item>();
	
	static Status fromServiceStatus(int status) {
		switch (status) {
		case SyncService.SYNC_SUCCESS:
			return Status.SUCCESS;
		case SyncService.SYNC_FAILURE:
			return Status.FAILURE;
		case SyncService.SYNC_NOTNECESSARY:
			return Status.NOT_NECESSARY;
		case SyncService.SYNC_ERROR:
			return Status.ERROR;
		default:
			return Status.FAILURE;
		}
	}
	
	public int getResultID(){
		return this.id;
	}
	
	public Status getStatus(){
		return this.status;
	}
	
	void setStatus(Status s){
		this.status = s;
	}
	
	public List<Item> getResultSet(){
		return this.resultSet;
	}
	
	void setResult(List<Item> res){
		this.resultSet = res;
	}
	
	public int getTotalCount(){
		return this.resultSet.size();
	}

}
