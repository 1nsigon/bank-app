package bank.tech.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountsDTO
{

    private Long accountId;
    private double balance;
    private String currency;
    private String status;

}