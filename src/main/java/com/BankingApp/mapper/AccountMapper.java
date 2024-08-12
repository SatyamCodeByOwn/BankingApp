package com.BankingApp.mapper;

import java.util.ArrayList;
import java.util.List;

import com.BankingApp.dto.AccountDto;
import com.BankingApp.entity.Account;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto){
        Account account =new Account(
            accountDto.getId(),
            accountDto.getAccountHolderName(),
            accountDto.getBalance()
        );
        return account;
    }
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto=new AccountDto(
            account.getId(),
            account.getAccountHolderName(),
            account.getBalance()
        );
        return accountDto;
    }
    public static List<AccountDto> mapToAccountDtoList(List<Account> accounts) {
        List<AccountDto> accountDtos = new ArrayList<>();
        for (Account account : accounts) {
            accountDtos.add(mapToAccountDto(account));
            }
            return accountDtos;
            
    }
}
