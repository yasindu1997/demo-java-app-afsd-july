package lk.acpt.demofx.service.impl;

import lk.acpt.demofx.db.Database;
import lk.acpt.demofx.dto.EmployeeDto;
import lk.acpt.demofx.entity.Employee;
import lk.acpt.demofx.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public boolean saveEmployee(EmployeeDto employeeDto) {
        Database.employees.add(new Employee(employeeDto.getIdNo(), employeeDto.getName(),
                employeeDto.getAddress(), employeeDto.getPosition()));
        System.out.println("hi...");
        return true;
    }

}
