package com.treeviewer.model;

/**
 * 
 * @author Bhabadyuti Bal
 *
 */
public class DuTRelation {
	
	private DeviceUnderTest parent;
	private DeviceUnderTest child;
	
	public DuTRelation() {
	}
	
	DuTRelation(DeviceUnderTest parent, DeviceUnderTest child) {
		this.parent = parent;
		this.child = child;
	}

	public DeviceUnderTest getParent() {
		return parent;
	}

	public void setParent(DeviceUnderTest parent) {
		this.parent = parent;
	}

	public DeviceUnderTest getChild() {
		return child;
	}

	public void setChild(DeviceUnderTest child) {
		this.child = child;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((child == null) ? 0 : child.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
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
		DuTRelation other = (DuTRelation) obj;
		if (child == null) {
			if (other.child != null)
				return false;
		} else if (!child.equals(other.child))
			return false;
		if (parent == null) {
			if (other.parent != null)
				return false;
		} else if (!parent.equals(other.parent))
			return false;
		return true;
	}

	
	
}
