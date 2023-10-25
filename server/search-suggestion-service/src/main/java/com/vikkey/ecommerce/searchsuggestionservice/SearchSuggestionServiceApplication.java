package com.vikkey.ecommerce.searchsuggestionservice;

import com.vikkey.ecommerce.searchsuggestionservice.controller.SearchSuggestionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SearchSuggestionServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SearchSuggestionServiceApplication.class, args);
		context.getBean(SearchSuggestionController.class).loadSearchSuggestions();
	}

}
