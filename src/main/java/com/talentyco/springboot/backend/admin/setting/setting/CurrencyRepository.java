package com.talentyco.springboot.backend.admin.setting.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.talentyco.springboot.models.entity.Currency;

@Repository
public interface CurrencyRepository extends CrudRepository<Currency, Integer> {
	
	public List<Currency> findAllByOrderByNameAsc();
}
