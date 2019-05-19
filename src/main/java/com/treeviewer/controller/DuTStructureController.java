/**
 * 
 */
package com.treeviewer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treeviewer.response.DuTTreeWrapper;

/**
 * @author Bhabadyuti Bal
 *
 */
@RestController
public class DuTStructureController {
	
	@GetMapping("/getdutstructure")
	public ResponseEntity<DuTTreeWrapper> getDuTStructure(){
		
		
		
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
