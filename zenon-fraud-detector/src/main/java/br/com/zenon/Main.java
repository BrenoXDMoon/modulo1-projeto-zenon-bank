package br.com.zenon;


import static br.com.zenon.entities.enums.TransactionType.CASH_OUT;
import static br.com.zenon.entities.enums.TransactionType.PAYMENT;

import br.com.zenon.entities.CustomerAccount;
import br.com.zenon.entities.Transaction;
import java.math.BigDecimal;

public class Main {
    static void main() {
        var customerOriginFirstTransaction = new CustomerAccount("C1231006815", BigDecimal.valueOf(170136.0), BigDecimal.valueOf(160296.36));
        var customerDestinationFirstTransaction = new CustomerAccount("M1979787155", BigDecimal.valueOf(0.00), BigDecimal.valueOf(3000.00));
        var firstTransaction = new Transaction(
                1,
                PAYMENT,
                new BigDecimal("9839.64"),
                customerOriginFirstTransaction,
                customerDestinationFirstTransaction,
                false,
                false
        );

        System.out.println(firstTransaction);

        var customerOriginSecondTransaction = new CustomerAccount(
                "Bob",
                BigDecimal.valueOf(3000.00),
                BigDecimal.valueOf(1000.00)
        );
        var customerAccountSecondTransaction = new CustomerAccount(
                "Charlie",
                BigDecimal.valueOf(1500.00),
                BigDecimal.valueOf(3500.00)
        );

        var secondTransaction = new Transaction(
                2,
                CASH_OUT,
                new BigDecimal("2000.00"),
                customerOriginSecondTransaction,
                customerAccountSecondTransaction,
                false,
                false
        );

        System.out.println(secondTransaction);
    }
}
