package org.oobootcamp.code_smell.$02_duplicated_code.execution_logic;

public class AccountRepository {
    public Account getByEmail(String email) {
        if (!AccountValidation.isValidEmail(email)) {
            // Throw EmailInvalidException
        }
        // Query db to get user by email
        return null;
    }
}