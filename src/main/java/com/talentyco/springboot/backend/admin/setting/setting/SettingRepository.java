package com.talentyco.springboot.backend.admin.setting.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.talentyco.springboot.models.entity.setting.Setting;
import com.talentyco.springboot.models.entity.setting.SettingCategory;



public interface SettingRepository extends CrudRepository<Setting, String> {
	public List<Setting> findByCategory(SettingCategory category);
}
