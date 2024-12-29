package com.vj.Accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "Account number can't be a null or empty")
    @Pattern(regexp = "^$|[0-9]{10}", message = "AccountsNumber must be 10 digit")
    private Long accountNumber;

    @NotEmpty(message = "Account type can't be a null or empty")
    private String accountType;

    @NotEmpty(message = "BranchAddress can't be a null or empty")
    private String branchAddress;
}
