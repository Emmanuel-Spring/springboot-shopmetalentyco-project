package com.talentyco.springboot.frontend.setting;

import java.util.List;

import com.talentyco.springboot.models.entity.setting.Setting;
import com.talentyco.springboot.models.entity.setting.SettingBag;

public class CurrencySettingBag extends SettingBag {

	public CurrencySettingBag(List<Setting> listSettings) {
		super(listSettings);
	}

	public String getSymbol() {
		return super.getValue("CURRENCY_SYMBOL");
	}
	
	public String getSymbolPosition() {
		return super.getValue("CURRENCY_SYMBOL_POSITION");
	}
	
	public String getDecimalPointType() {
		return super.getValue("DECIMAL_POINT_TYPE");
	}

	public String getThousandPointType() {
		return super.getValue("THOUSANDS_POINT_TYPE");
	}	
	
	public int getDecimalDigits() {
		return Integer.parseInt(super.getValue("DECIMAL_DIGITS"));
	}
}
