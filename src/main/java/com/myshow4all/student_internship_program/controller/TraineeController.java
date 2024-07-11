package com.myshow4all.student_internship_program.controller;

import com.myshow4all.student_internship_program.entity.InternshipDetails;
import com.myshow4all.student_internship_program.entity.Trainee;
import com.myshow4all.student_internship_program.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/trainees")

public class TraineeController {

    @Autowired
    private TraineeService traineeService;

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("trainee") Trainee trainee) {
        traineeService.saveTrainee(trainee);
        // Redirect to the success page
//        return "redirect:/trainees/success";
        return "redirect:/trainees/enrolment-form-success";
    }

    @GetMapping("/trainee-list")
    public String listTrainees(Model model) {
        List<Trainee> trainees = traineeService.getAllTrainees();
        model.addAttribute("trainees", trainees);
        return "trainee-list";
    }

//    @GetMapping("/form")
    @GetMapping("/enrolment-form")
    public String showForm(Model model) {
        model.addAttribute("trainee", new Trainee());
//        return "trainee-form";
        return "enrolment-form";
    }

    @PostMapping("/delete")
    @ResponseBody
    public ResponseEntity<String> deleteTrainees(@RequestParam("traineeIds") List<Long> traineeIds) {
        try {
            traineeService.deleteSelectedTrainees(traineeIds);
            return ResponseEntity.ok("Selected trainees deleted successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting trainees: " + e.getMessage());
        }
    }

    @GetMapping("/enrolment-form-success")
//    @GetMapping("success")
    public String showSuccessPage() {
//        return "success";
        return "enrolment-form-success";
    }
}
