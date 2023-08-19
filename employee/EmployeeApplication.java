package employee;

import com.coupon.application.service.CouponService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class EmployeeApplication  implements ApplicationRunner {
    public String newEmployee(){
        return UUID.randomUUID().toString();
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("hello worrld");
        String newEmployee = employee.getNewCoupon();
        System.out.println(newEmployee);
        CouponService emp;
        List<String> couponsList = emp.getNewCoupon(100);
        for(String coupon: couponsList){
            System.out.println(coupon);
    }
}
