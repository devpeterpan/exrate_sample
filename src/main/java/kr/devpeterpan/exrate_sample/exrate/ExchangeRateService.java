package kr.devpeterpan.exrate_sample.exrate;

public class ExchangeRateService {

    private final CurrencyValidator currencyValidator;

    public ExchangeRateService(CurrencyValidator currencyValidator) {
        this.currencyValidator = currencyValidator;
    }

    public boolean validateCurrency(ExchangeRate exchangeRate) {
        return exchangeRate.isValidCurrency(currencyValidator);
    }

}
