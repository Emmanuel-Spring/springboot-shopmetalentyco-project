package com.talentyco.springboot.frontend.setting;

import org.springframework.data.repository.CrudRepository;

import com.talentyco.springboot.models.entity.Currency;

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {

}
