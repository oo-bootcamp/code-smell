package org.oobootcamp.code_smell.$02_duplicated_code.execution_logic;

public class Account {
    private String email;
    private String password;

    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    public String getPassword() {
        return password;
    }
}
