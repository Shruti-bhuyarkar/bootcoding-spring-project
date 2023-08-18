package employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {
    @Autowired
    private EmployeeHelper employeeHelper = null;

    private String getNewEmployee() {
        return employeeHelper.newemployee();
    }

    public List<String> getNewEmployee(int quantity) {
        List<String> coupons = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            String newCoupon = employeeHelper.newemployee();
            coupons.add(newCoupon);
        }
        return coupons;
    }
}