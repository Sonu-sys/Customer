package Customer.Customer.mapper;

import Customer.Customer.entity.customer;
import Customer.Customer.dto.customerdto;

public class mapper {

    public static customerdto customerMapper(customer customer)
    {
        return new customerdto(
                customer.getId(),
                customer.getEmail(),
                customer.getFirstName(),
                customer.getEmail()

        );

    }
    public static customer customerdtomapper(customer customerdto)
    {
        return new customer(
                customerdto.getId(),
                customerdto.getFirstName(),
                customerdto.getLastName(),
                customerdto.getEmail()
        );
    }
}
