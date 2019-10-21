package com.learning.bankuml.customer;


import com.learning.bankuml.account.Account;
import com.learning.bankuml.account.Loan;
import com.learning.bankuml.administration.Teller;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Customer {
    private int id;
    private String name;
    private String address;
    private int phoneNo;
    private int acctNo;
    private List<Account> accounts;
    private List<Teller> tellers;
    private List<Loan> loans;

    public void generalInquiry(){
        System.out.println("Generating general inquiry.");
    }

    public void depositMoney()  {
        System.out.println("Depositing money.");
    }
}
