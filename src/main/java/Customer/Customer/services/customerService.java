package Customer.Customer.services;

import Customer.Customer.dto.customerdto;
import Customer.Customer.entity.customer;
import Customer.Customer.mapper.mapper;
import Customer.Customer.repository.repository;
import jakarta.persistence.Id;

import java.util.List;

public class customerService implements customerInterface {
    public repository repository;
    @Override
    public List<customerdto> getAllCustomer() {
        List<customer> customer= repository.findAll();
        return customer.stream().map(customer)=>mapper.customerdtomapper(customer);

    }

    @Override
    public customerdto getCustomerById(Long employeeId) {
        customer customer= repository.findById(employeeId).orElseThrow();
        return mapper.customerdtomapper(customer);
    }

    @Override
    public customerdto updateCustomer(Long employeeId, customerdto customerdto) {

        customer customer= repository.findById(employeeId).orElseThrow();
        customer.setEmail(customerdto.getEmail());
        customer.setFirstName(customerdto.getFirstName());
        customer.setLastName(customer.getLastName());
        return mapper.customerdtomapper(customer);
    }

    @Override
    public void deleteCustomer(Long employeeId) {
        customer customer= repository.findById(employeeId).orElseThrow();
        repository.deleteById(employeeId);

    }
    @Override
    public customerdto createCustomer(customerdto customerdto) {
        customer customer= mapper.customerMapper(customerdto);
        customer newCustomer=repository.save(customer);
      return mapper.customerdtomapper(newCustomer);

    }
}
