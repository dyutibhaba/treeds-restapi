/**
 * 
 */
package com.treeviewer.service;

import com.treeviewer.request.DuTRelationRequest;
import com.treeviewer.response.DuTTreeWrapper;

/**
 * @author Bhabadyuti Bal
 *
 */

public interface DuTStructureService {
	
	//interface methods are by default public and abstract

	boolean createRelation(final DuTRelationRequest duTRelationRequest);
	
	
	DuTTreeWrapper getDutStructure(final String dutId);
	
	
	boolean removeRelation(final DuTRelationRequest duTRelationRequest);
	
	

}
