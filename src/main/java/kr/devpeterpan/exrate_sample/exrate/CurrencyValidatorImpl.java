package kr.devpeterpan.exrate_sample.exrate;

public class CurrencyValidatorImpl implements CurrencyValidator {

    private final CurrencyDao currencyDao;

    public CurrencyValidatorImpl(CurrencyDao currencyDao) {
        this.currencyDao = currencyDao;
    }

    @Override
    public boolean isValid(String currencyCode) {
        return currencyDao.existsByCurrencyCode(currencyCode);
    }

}
