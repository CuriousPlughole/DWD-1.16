package com.prismmods.dwdimensions.data;

import com.prismmods.dwdimensions.DWDimensions;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class EngLangGen extends LanguageProvider{

	public EngLangGen(DataGenerator gen) {
		super(gen, DWDimensions.MOD_ID, "en_us");
	}

	@Override
	protected void addTranslations() {
		add("item.dwdimensions.zeiton_7", "Zeiton 7");
		
		add("block.dwdimensions.akatite", "Akatite");
		
	}
	
	

}
