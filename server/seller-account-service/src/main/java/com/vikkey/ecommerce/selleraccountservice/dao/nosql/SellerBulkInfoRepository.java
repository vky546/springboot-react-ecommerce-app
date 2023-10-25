package com.vikkey.ecommerce.selleraccountservice.dao.nosql;

import com.vikkey.ecommerce.selleraccountservice.entity.nosql.SellerBulkInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SellerBulkInfoRepository extends MongoRepository<SellerBulkInfo, Integer> {
}
