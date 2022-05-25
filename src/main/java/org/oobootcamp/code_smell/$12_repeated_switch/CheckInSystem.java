package org.oobootcamp.code_smell.$12_repeated_switch;

import java.util.HashMap;
import java.util.Map;

public class CheckInSystem {
    private Map<String, String> checkInRecords = new HashMap<>();

    public boolean checkIn(String fingerprint) {
        Employee employee = EmployeeRepository.query(fingerprint);
        int type = employee.getType();
        String record = "";
        if (type == Employee.ENGINEER) {
            record = "I am an Engineer, My Name is" + employee.getName();
        } else if (type == Employee.SALESMAN) {
            record = "I am a Salesman, My Name is" + employee.getName();
        } else if (type == Employee.MANAGER) {
            record = "I am a Manager, My Name is" + employee.getName();
        }
        if (checkInRecords.isEmpty()) {
            return false;
        }
        checkInRecords.put(fingerprint, record);
        return true;
    }
}
