package com.talentyco.springboot.frontend.setting;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.talentyco.springboot.models.entity.Country;
import com.talentyco.springboot.models.entity.State;
import com.talentyco.springboot.models.entity.StateDTO;



@RestController
public class StateRestController {

	@Autowired private StateRepository repo;
	
	@GetMapping("/settings/list_states_by_country/{id}")
	public List<StateDTO> listByCountry(@PathVariable("id") Integer countryId) {
		List<State> listStates = repo.findByCountryOrderByNameAsc(new Country(countryId));
		List<StateDTO> result = new ArrayList<>();
		
		for (State state : listStates) {
			result.add(new StateDTO(state.getId(), state.getName()));
		}
		
		return result;
	}

}
