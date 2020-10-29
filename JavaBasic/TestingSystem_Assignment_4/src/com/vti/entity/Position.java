package com.vti.entity;

public class Position {
	private int positionId;
	private String PositionName;
	public Position(int positionId, String positionName) {
		super();
		this.positionId = positionId;
		PositionName = positionName;
	}
	public int getPositionId() {
		return positionId;
	}
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}
	public String getPositionName() {
		return PositionName;
	}
	public void setPositionName(String positionName) {
		PositionName = positionName;
	}
	
	
}
