package com.treeviewer.request;

import java.io.Serializable;

/**
 * 
 * @author Bhabadyuti Bal
 *
 */
public class DuTRelationRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private String parentDutId;
	private String parentDutType;
	private String childDutId;
	private String childDutType;
	
	public DuTRelationRequest() {
	}
	
	public DuTRelationRequest(String parentDutId, String parentDutType, String childDutId, String childDutType) {
		super();
		this.parentDutId = parentDutId;
		this.parentDutType = parentDutType;
		this.childDutId = childDutId;
		this.childDutType = childDutType;
	}
	
	public String getParentDutId() {
		return parentDutId;
	}
	public void setParentDutId(String parentDutId) {
		this.parentDutId = parentDutId;
	}
	public String getParentDutType() {
		return parentDutType;
	}
	public void setParentDutType(String parentDutType) {
		this.parentDutType = parentDutType;
	}
	public String getChildDutId() {
		return childDutId;
	}
	public void setChildDutId(String childDutId) {
		this.childDutId = childDutId;
	}
	public String getChildDutType() {
		return childDutType;
	}
	public void setChildDutType(String childDutType) {
		this.childDutType = childDutType;
	}
	
	
	
	
}
