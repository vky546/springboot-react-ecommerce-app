package com.vikkey.ecommerce.commondataservice.service.interfaces;

import com.vikkey.ecommerce.commondataservice.dto.ProductInfoDTO;
import com.vikkey.ecommerce.commondataservice.entity.sql.info.ProductInfo;
import com.vikkey.ecommerce.commondataservice.model.FilterAttributesResponse;
import com.vikkey.ecommerce.commondataservice.model.HomeTabsDataResponse;
import com.vikkey.ecommerce.commondataservice.model.MainScreenResponse;
import com.vikkey.ecommerce.commondataservice.model.SearchSuggestionResponse;

import java.util.HashMap;

public interface CommonDataService {

    MainScreenResponse getHomeScreenData(String apiName);

    FilterAttributesResponse getFilterAttributesByProducts(String queryParams);

    ProductInfoDTO getProductsByCategories(String queryParams);

    HashMap<Integer, ProductInfo> getProductsById(String queryParams);

    HomeTabsDataResponse getBrandsAndApparelsByGender(String apiName);

    SearchSuggestionResponse getSearchSuggestionList();
}

