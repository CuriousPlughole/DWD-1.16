package com.prismmods.dwdimensions.client.util;

import java.util.ArrayList;
import java.util.List;

import com.prismmods.dwdimensions.client.render.model.dalek.BigDalekModel;
import com.prismmods.dwdimensions.client.render.model.dalek.MediumDalekModel;
import com.prismmods.dwdimensions.client.render.model.dalek.SmallDalekModel;
import com.prismmods.dwdimensions.common.entities.DalekEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;

public class DalekModelGetter {
	
	private static final EntityModel<DalekEntity> BIGMODEL = new BigDalekModel();
	private static final EntityModel<DalekEntity> MEDIUMMODEL = new MediumDalekModel();
	private static final EntityModel<DalekEntity> SMALLMODEL = new SmallDalekModel();
	
	public static List<String> big_model_types = new ArrayList<String>();
	public static List<String> small_model_types = new ArrayList<String>();
	//public static String[] medium_model_types = new String[] {"assault","axis_strike_a","axis_strike_b","buzz_saw","time_war","emperor_guard","emperor_guard_2"};
	//public static String[] small_model_types = new String[] {"chase_1965", "emperor_1967"};
	
	public static void setupLists() {

		big_model_types.add("strategist");
		big_model_types.add("drone");
		
		small_model_types.add("chase_1965");
		small_model_types.add("emperor_1967");
		
	}
	
	public static EntityModel<DalekEntity> getModelForType(String dalekType) {
		
		if(big_model_types.contains(dalekType)) {
			return BIGMODEL;
		} else if(small_model_types.contains(dalekType)) {
			return SMALLMODEL;
		} else {
			return MEDIUMMODEL;
		}
	}

}
