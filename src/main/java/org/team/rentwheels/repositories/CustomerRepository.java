package org.team.rentwheels.repositories;

import org.team.rentwheels.models.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerRepository {
    void addCustomer(String firstName,
                     String lastName,
                     String email,
                     String phone,
                     String address
                     ) throws SQLException;
    void deleteCustomer(int id) throws SQLException;
    void updateCustomer(int id, Customer updatedCustomer) throws SQLException;
    Customer getCustomerById(int id) throws SQLException;
    List<Customer> getAllCustomers() throws SQLException;
}
