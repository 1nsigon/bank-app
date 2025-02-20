package bank.tech.service;

import bank.tech.client.BankClient;
import bank.tech.config.BankConfig;
import bank.tech.dto.AccountsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Component
public class BankService
{
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private BankClient bankClient;

    //feign
    public AccountsDTO getAccNum(Long accountId)
    {
        return bankClient.getAccountNum(accountId);
    }

    public AccountsDTO addAcc(AccountsDTO accountsDTO)
    {
        return bankClient.createTheAccount(accountsDTO);
    }
    //rest
    //public AccountsDTO getAccountNum(Long accountId)
    //{
    //    return restTemplate.getForObject("http://account-service/accounts" + accountId, AccountsDTO.class);
    //}

    //public AccountsDTO createTheAccount(AccountsDTO accountsDTO)
    //{
    //    return restTemplate.postForObject("http://account-service/accounts/mine", accountsDTO, AccountsDTO.class);
    //}




}
