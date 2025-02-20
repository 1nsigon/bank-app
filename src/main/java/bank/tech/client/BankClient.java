package bank.tech.client;

import bank.tech.dto.AccountsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "account-service")
public interface BankClient
{
    @GetMapping("/accounts/{accountId}")
    AccountsDTO getAccountNum(@PathVariable Long accountId);

    @PostMapping("/accounts/mine")
    AccountsDTO createTheAccount(@RequestBody AccountsDTO accountsDTO);
}
