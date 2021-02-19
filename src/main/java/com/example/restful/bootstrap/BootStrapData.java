package com.example.restful.bootstrap;

import com.example.restful.domain.Customer;
import com.example.restful.repositories.CustomerRepository;
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

        System.out.println("Loading Customer Data");

        Customer c1= new Customer();
        c1.setFirstname("Konrad");
        c1.setLastname("Wxxx");
        customerRepository.save(c1);

        Customer c2= new Customer();
        c2.setFirstname("Kamil");
        c2.setLastname("Nowak");
        customerRepository.save(c2);

        Customer c3= new Customer();
        c3.setFirstname("Jan");
        c3.setLastname("Kowalski");
        customerRepository.save(c3);

        System.out.println("Customers Saved:"+customerRepository.count());

    }
}
