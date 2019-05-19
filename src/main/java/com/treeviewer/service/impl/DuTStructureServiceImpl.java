/**
 * 
 */
package com.treeviewer.service.impl;

import org.springframework.stereotype.Service;

import com.treeviewer.request.DuTRelationRequest;
import com.treeviewer.response.DuTTreeWrapper;
import com.treeviewer.service.DuTStructureService;

/**
 * @author Bhabadyuti Bal
 *
 */
@Service
//@Qualifier("structureService")
public class DuTStructureServiceImpl implements DuTStructureService {

	@Override
	public boolean createRelation(DuTRelationRequest duTRelationRequest) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DuTTreeWrapper getDutStructure(String dutId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeRelation(DuTRelationRequest duTRelationRequest) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
