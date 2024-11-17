package com.Tathagata.yummyrest.service;

import com.Tathagata.yummyrest.dto.CustomerRequest;
import com.Tathagata.yummyrest.entity.Customer;
import com.Tathagata.yummyrest.mapper.CustomerMapper;
import com.Tathagata.yummyrest.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepo repo;
    private final CustomerMapper mapper;
    public String createCustomer(CustomerRequest request) {
        Customer customer = mapper.toEntity(request);
        repo.save(customer);
        return "Created";
    }
}
