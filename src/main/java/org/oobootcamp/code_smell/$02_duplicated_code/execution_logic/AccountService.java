package org.oobootcamp.code_smell.$02_duplicated_code.execution_logic;

public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account login(String email, String password) {
        if (!AccountValidation.isValidEmail(email)) {
            // Throw EmailInvalidException
        }

        Account account = accountRepository.getByEmail(email);

        if (account == null) {
            // Throw AccountNotExistedException
        }

        if (!account.verifyPassword(password)) {
            // Throw PasswordInvalidException
        }
        return account;
    }
}

