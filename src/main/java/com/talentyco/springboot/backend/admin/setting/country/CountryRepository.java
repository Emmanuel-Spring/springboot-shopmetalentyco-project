package com.talentyco.springboot.backend.admin.setting.country;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.talentyco.springboot.models.entity.Country;



public interface CountryRepository extends CrudRepository<Country, Integer> {
	public List<Country> findAllByOrderByNameAsc();
}
