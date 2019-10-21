package com.learning.bankuml.bank;

import com.learning.bankuml.administration.Teller;
import com.learning.bankuml.customer.Customer;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Bank {
    private int bankId;
    private String name;
    private String location;
    private List<Customer> customers;
    private List<Teller> tellers;
}
