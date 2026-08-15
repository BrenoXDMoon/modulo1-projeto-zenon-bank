package br.com.zenon.entities;

import java.math.BigDecimal;

public record CustomerAccount(String name,
                              BigDecimal oldBalance,
                              BigDecimal newBalance) {
}
