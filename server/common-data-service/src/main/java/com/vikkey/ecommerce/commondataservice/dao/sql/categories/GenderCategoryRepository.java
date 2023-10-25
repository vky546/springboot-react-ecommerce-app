package com.vikkey.ecommerce.commondataservice.dao.sql.categories;

import com.vikkey.ecommerce.commondataservice.entity.sql.categories.GenderCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GenderCategoryRepository extends JpaRepository<GenderCategory, Integer> {

    @Query(value = "SELECT g FROM GenderCategory g")
    List<GenderCategory> getAllData();

    GenderCategory findByType(String gender);
}
