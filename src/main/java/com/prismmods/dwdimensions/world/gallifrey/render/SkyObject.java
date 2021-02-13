package com.prismmods.dwdimensions.world.gallifrey.render;

public class SkyObject {
	
	public float minHU, maxHU, minHV, maxHV;
	
	public float minVU, maxVU, minVV, maxVV;

	public SkyObject() {}
	
	public void setHorizontalUVs(float minU, float minV, float maxU, float maxV) {
		this.minHU = minU;
		this.minHV = minV;
		this.maxHU = maxU;
		this.maxHV = maxV;
	}
	
	public void setVerticalUVs(float minU, float minV, float maxU, float maxV) {
		this.minVU = minU;
		this.minVV = minV;
		this.maxVU = maxU;
		this.maxVV = maxV;
	}
	
}
