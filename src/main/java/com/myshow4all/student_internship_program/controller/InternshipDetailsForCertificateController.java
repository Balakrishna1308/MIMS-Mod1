package com.myshow4all.student_internship_program.controller;





import com.myshow4all.student_internship_program.entity.InternshipDetails;
import com.myshow4all.student_internship_program.service.InternshipDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/trainee-details")
@CrossOrigin(origins = "http://localhost:3000")
public class InternshipDetailsForCertificateController {
    private InternshipDetailsService internshipDetailsService;

    @Autowired
    public InternshipDetailsForCertificateController(InternshipDetailsService internshipDetailsService) {
        this.internshipDetailsService = internshipDetailsService;
    }

    @PostMapping("/submit")
    public String submitTraineeDetails(@RequestBody InternshipDetails internshipDetails) {
        // Perform any additional processing if needed
        internshipDetailsService.saveInternshipDetails(internshipDetails);
        return "Trainee details submitted successfully!";
    }
}
