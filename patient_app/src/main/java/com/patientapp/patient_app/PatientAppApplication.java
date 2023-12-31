package com.patientapp.patient_app;

import com.patientapp.patient_app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientAppApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(PatientAppApplication.class, args);
	}
	@Autowired
	private PatientService patientService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

	}

//	@Override
//	public void run(ApplicationArguments args) throws  Exception{
//		String s = patientService.getNewPatient();
//		System.out.println("New Patient = "+ s);
//	}


}
