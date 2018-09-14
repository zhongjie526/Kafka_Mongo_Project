import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.frank.repository.CustomerRepository;
import com.frank.repository.HibernateCustomerRepositoryImpl;
import com.frank.service.CustomerService;
import com.frank.service.CustomerServiceImpl;

//@Configuration
@ComponentScan({"com.frank"})
public class AppConfig {
	
//	@Bean(name="customerService")
//	public CustomerService getCustomerService() {
//		//CustomerServiceImpl custService = new CustomerServiceImpl(getCustomerRepository());
//		CustomerServiceImpl custService = new CustomerServiceImpl();
//		//custService.setCustomerRepository(getCustomerRepository());
//		
//		return custService;
//	}
	
//	@Bean(name="customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}

}
