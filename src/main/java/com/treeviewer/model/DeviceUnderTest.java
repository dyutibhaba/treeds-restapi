/**
 * 
 */
package com.treeviewer.model;

/**
 * @author Bhabadyuti Bal
 *
 */
public class DeviceUnderTest {

	private String dutId;
	private String dutType;
	
	public DeviceUnderTest() {
	}
	
	public DeviceUnderTest(String dutId, String dutType) {
		this.dutId = dutId;
		this.dutType = dutType;
	}

	public String getDutId() {
		return dutId;
	}

	public void setDutId(String dutId) {
		this.dutId = dutId;
	}

	public String getDutType() {
		return dutType;
	}

	public void setDutType(String dutType) {
		this.dutType = dutType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dutId == null) ? 0 : dutId.hashCode());
		result = prime * result + ((dutType == null) ? 0 : dutType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeviceUnderTest other = (DeviceUnderTest) obj;
		if (dutId == null) {
			if (other.dutId != null)
				return false;
		} else if (!dutId.equals(other.dutId))
			return false;
		if (dutType == null) {
			if (other.dutType != null)
				return false;
		} else if (!dutType.equals(other.dutType))
			return false;
		return true;
	}
	
	
	

}
