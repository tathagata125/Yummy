package com.Tathagata.yummyrest.repo;

import com.Tathagata.yummyrest.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
