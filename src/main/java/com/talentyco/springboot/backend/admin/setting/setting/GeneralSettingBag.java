package com.talentyco.springboot.backend.admin.setting.setting;

import java.util.List;

import com.talentyco.springboot.models.entity.setting.Setting;
import com.talentyco.springboot.models.entity.setting.SettingBag;


public class GeneralSettingBag extends SettingBag {

	public GeneralSettingBag(List<Setting> listSettings) {
		super(listSettings);
	}

	public void updateCurrencySymbol(String value) {
		super.update("CURRENCY_SYMBOL", value);
	}
	
	public void updateSiteLogo(String value) {
		super.update("SITE_LOGO", value);
	}
}
