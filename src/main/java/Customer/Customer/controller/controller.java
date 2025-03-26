package Customer.Customer.controller;

import Customer.Customer.dto.customerdto;
import Customer.Customer.services.customerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor

@RestController
@RequestMapping("/api/customer")
public class controller {
    private customerService customerService;

    public ResponseEntity<customerdto> CreateEmployee( @RequestBody customerdto customerdto)
    {
        customerdto  newcustomerdto=customerService.createCustomer(customerdto);
        return new ResponseEntity<>(newcustomerdto, HttpStatusCode.Ok);
    }

    public ResponseEntity<List<customerdto>> getAllCustomer(){

        List<customerdto> customers=customerService.getAllCustomer();
        return new ResponseEntity<>(customers, HttpStatusCode.Ok)
    }

    public ResponseEntity<customerdto> updateEmployee(Long Id, customerdto customerdto)
    {

    }


}
