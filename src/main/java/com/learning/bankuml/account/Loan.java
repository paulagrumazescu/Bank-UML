package com.learning.bankuml.account;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Loan {
    private int id;
    private String type;
    private int accountId;
    private int customerId;
}
