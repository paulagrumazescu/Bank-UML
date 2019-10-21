package com.learning.bankuml.account;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class Account {
    private int id;
    private int customerId;
}
