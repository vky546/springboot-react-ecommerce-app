package com.vikkey.ecommerce.selleraccountservice.service;


import com.vikkey.ecommerce.selleraccountservice.entity.nosql.SellerBulkInfo;
import com.vikkey.ecommerce.selleraccountservice.entity.sql.SellerInfo;

public interface SellerAccountDataService {

    public SellerInfo findSellerById(Integer sellerId);

    public void save();

    public void saveInMongo();

    public SellerBulkInfo findMongoAddressById();
}

