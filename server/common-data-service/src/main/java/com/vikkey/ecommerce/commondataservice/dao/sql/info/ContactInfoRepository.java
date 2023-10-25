package com.vikkey.ecommerce.commondataservice.dao.sql.info;

import com.vikkey.ecommerce.commondataservice.entity.sql.info.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactInfoRepository extends JpaRepository<ContactInfo, Integer> {
}
