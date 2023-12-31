package com.tb.domain.e10.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeManagerRequest {

    private String employeeId;
    private String employeeCode;
    private String employeeName;

    @Override
    public String toString() {
        return "EmployeeManagerRequest{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
