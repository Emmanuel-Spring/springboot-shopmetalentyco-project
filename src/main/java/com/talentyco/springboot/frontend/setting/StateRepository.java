package com.talentyco.springboot.frontend.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.talentyco.springboot.models.entity.Country;
import com.talentyco.springboot.models.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {
	
	public List<State> findByCountryOrderByNameAsc(Country country);
}
