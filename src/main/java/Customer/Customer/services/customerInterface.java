package Customer.Customer.services;

import Customer.Customer.dto.customerdto;
import Customer.Customer.entity.customer;

import java.util.List;

public interface customerInterface {
    public List<customerdto> getAllCustomer();
    customerdto getCustomerById(Long Id);
    customerdto updateCustomer(Long id, customerdto customerdto);
    void deleteCustomer(Long id);
}
