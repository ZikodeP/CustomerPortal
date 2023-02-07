package com.example.restapidemo.bootstrap;

import com.example.restapidemo.domain.Customer;
import com.example.restapidemo.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Customer Data ...");

        Customer c1 =new Customer();
        c1.setFirstname("Thabane");
        c1.setLastname("Lunga");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("David");
        c2.setLastname("Parker");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstname("Hishaam");
        c3.setLastname("Kamish");
        customerRepository.save(c3);

        System.out.println("Customers Saved: " + customerRepository.count());
    }
}
