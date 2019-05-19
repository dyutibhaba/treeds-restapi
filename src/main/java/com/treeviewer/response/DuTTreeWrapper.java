/**
 * 
 */
package com.treeviewer.response;

import java.util.List;

import com.treeviewer.model.DuTRelation;

/**
 * @author Bhabadyuti Bal
 *
 */
public class DuTTreeWrapper {
	
	private DuTRelation duTRelation;
	private List<DuTRelation> dutRelations;
	
	public DuTTreeWrapper() {
	}
	
	public DuTTreeWrapper(DuTRelation duTRelation){
		this.duTRelation = duTRelation;
	}
	
	public DuTTreeWrapper(DuTRelation duTRelation, List<DuTRelation> dutRelations){
		this.duTRelation = duTRelation;
		this.dutRelations = dutRelations;
	}
	
	public DuTRelation getDuTRelation() {
		return duTRelation;
	}
	public void setDuTRelation(DuTRelation duTRelation) {
		this.duTRelation = duTRelation;
	}
	public List<DuTRelation> getDutRelations() {
		return dutRelations;
	}
	public void setDutRelations(List<DuTRelation> dutRelations) {
		this.dutRelations = dutRelations;
	}
	
	

}
