//package com.myshow4all.student_internship_program.controller;
//
//// Import statements
//
//import com.myshow4all.student_internship_program.entity.Trainee;
//import com.myshow4all.student_internship_program.service.TraineeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/certificate")
//@CrossOrigin(origins = "http://localhost:3000")
//public class CertificateController {
//
//    @Autowired
//    private TraineeService traineeService; // Assuming you have a service class
//
//    @GetMapping("/details")
//    public ResponseEntity<Map<String, String>> getCertificateDetails() {
//        // Fetch the certificate details from the database
//        Trainee trainee = traineeService.getTraineeDetails(); // Implement this method in your service
//
//        if (trainee != null) {
//            // Map the details to send to the client
//            Map<String, String> certificateDetails = new HashMap<>();
//            certificateDetails.put("traineeFirstName", trainee.getTraineeFirstName());
//            certificateDetails.put("traineeLastName", trainee.getTraineeLastName());
//            certificateDetails.put("courseName", trainee.getCourseName());
//            certificateDetails.put("internshipDomain", trainee.getInternshipDomain());
//            certificateDetails.put("fromDate", trainee.getFromDate().toString()); // Assuming fromDate is a LocalDate field
//            certificateDetails.put("toDate", trainee.getToDate().toString()); // Assuming toDate is a LocalDate field
//
//            return ResponseEntity.ok(certificateDetails);
//        } else {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//        }
//    }
//}
