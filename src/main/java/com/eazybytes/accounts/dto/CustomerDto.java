package com.eazybytes.accounts.dto;

import lombok.Data;

@Data
public class CustomerDto {
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
    private String name;
    private String email;
    private String mobileNumber;
}
