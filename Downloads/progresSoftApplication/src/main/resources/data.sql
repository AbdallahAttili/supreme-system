USE fx_deals;

INSERT INTO currency_exchange_rate(from_currency, to_currency, exchange_rate)
                                  VALUES
                                      ('USD', 'EUR', 0.88),
                                      ('EUR', 'USD', 1.14),
                                      ('USD', 'JPY', 113.50),
                                      ('EUR', 'JPY', 126.33),
                                      ('GBP', 'USD', 1.36),
                                      ('USD', 'GBP', 0.73),
                                      ('AUD', 'USD', 0.71),
                                      ('USD', 'AUD', 1.41),
                                      ('USD', 'CAD', 1.25),
                                      ('CAD', 'USD', 0.80),
                                      ('EUR', 'GBP', 0.83),
                                      ('GBP', 'EUR', 1.20);