package bank.tech.controller;

import bank.tech.dto.AccountsDTO;
import bank.tech.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ba")
public class BankController
{


    @Autowired
    private BankService bankService;

    @GetMapping("/{accountId}")
    public AccountsDTO getAccByNum(@PathVariable Long accountId)
    {
        return bankService.getAccNum(accountId);
    }

    @PostMapping("/entry")
    public AccountsDTO addAcc(@RequestBody AccountsDTO accountsDTO)
    {
        return bankService.addAcc(accountsDTO);
    }
}
