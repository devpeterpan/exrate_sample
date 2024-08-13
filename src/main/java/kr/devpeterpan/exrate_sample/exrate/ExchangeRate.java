package kr.devpeterpan.exrate_sample.exrate;

import java.math.BigDecimal;

public class ExchangeRate {

    private String currency;
    private BigDecimal rate;

    public ExchangeRate(String currency, BigDecimal rate) {
        this.currency = currency;
        this.rate = rate;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public boolean isValidCurrency(CurrencyValidator currencyValidator) {
        return currencyValidator.isValid(currency);
    }

}
