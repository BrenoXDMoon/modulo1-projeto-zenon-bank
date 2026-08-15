package br.com.zenon.entities;

import br.com.zenon.entities.enums.TransactionType;
import java.math.BigDecimal;

public record Transaction(Integer step,
                          TransactionType type,
                          BigDecimal amount,
                          CustomerAccount customerOrigin,
                          CustomerAccount customerDestination,
                          Boolean isFraud,
                          Boolean isFlaggedFraud) {
}
