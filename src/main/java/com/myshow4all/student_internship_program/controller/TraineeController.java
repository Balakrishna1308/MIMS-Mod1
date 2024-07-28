package com.myshow4all.student_internship_program.controller;//package com.myshow4all.student_internship_program.controller;
//
//import com.myshow4all.student_internship_program.entity.InternshipDetails;
//import com.myshow4all.student_internship_program.entity.Trainee;
//import com.myshow4all.student_internship_program.service.TraineeService;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDate;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Controller
//@RequestMapping("/trainees")
//@Tag
//(
//        name = "CRUD REST APIs for Trainee Resource"
//)
//public class TraineeController {
//
//    @Autowired
//    private TraineeService traineeService;
//
//    @PostMapping("/save")
//    @Operation
//       (
//          summary = "Save Trainee REST API",
//          description = "Save Trainee REST API is used to save the trainee details into database" +
//                        "and let the enrolment get done"
//       )
//    @ApiResponses
//       (
//          @ApiResponse
//            (
//                responseCode = "201",
//                description = "Trainee saved successfully"
//            )
//       )
//
////    public String saveStudent(@ModelAttribute("trainee") Trainee trainee) {
////        traineeService.saveTrainee(trainee);
////        // Redirect to the success page
//////        return "redirect:/trainees/success";
////        return "redirect:/trainees/enrolment-form-success";
////    }
//
//    public ResponseEntity<String> saveStudent(@ModelAttribute("trainee") Trainee trainee) {
//        try {
//            traineeService.saveTrainee(trainee);
//            // Return success message in response body
////            return ResponseEntity.ok("Trainee saved successfully!");
//            return new ResponseEntity<>("Enrolment done", HttpStatus.CREATED);
//        } catch (Exception e) {
//            // Return error message in response body
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                    .body("Error saving trainee: " + e.getMessage());
//        }
//    }
//
//
//
//
//
////    @GetMapping("/trainee-list")
////    public String listTrainees(Model model) {
////        List<Trainee> trainees = traineeService.getAllTrainees();
////        model.addAttribute("trainees", trainees);
////        return "trainee-list";
////    }
//
//
//
//
//
//
//
//
//
////    @GetMapping("/form")
//    @GetMapping("/enrolment-form")
//    public String showForm(Model model) {
//        model.addAttribute("trainee", new Trainee());
////        return "trainee-form";
//        return "enrolment-form";
//    }
//
//
//
//    @PostMapping("/delete")
//    @ResponseBody
//    @Operation
//            (
//                    summary = "Delete Trainee REST API",
//                    description = "Delete Trainee REST API is used to delete trainee details of a specific ID" +
//                            "from the database"
//            )
//    @ApiResponse
//            (
//                    responseCode = "200",
//                    description = "HTTP Status 200, OK - Trainee deleted successfully"
//            )
//    public ResponseEntity<String> deleteTrainees(@RequestParam("traineeIds") List<Long> traineeIds) {
//        try {
//            traineeService.deleteSelectedTrainees(traineeIds);
//            return ResponseEntity.ok("Selected trainees deleted successfully.");
////            return new ResponseEntity<>("Selected trainee deleted", HttpStatus.NO_CONTENT);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting trainees: " + e.getMessage());
//        }
//    }
//
//    @GetMapping("/enrolment-form-success")
////    @GetMapping("success")
//    public String showSuccessPage() {
////        return "success";
//        return "enrolment-form-success";
//    }
//
//
//
//
//
//
//
////    @GetMapping("/trainee-list/domain/{domain}")
//////    public ResponseEntity<List<Trainee>> listTraineesByDomain(@PathVariable String domain) {
////    public ResponseEntity<?> listTraineesByDomain(@PathVariable String domain) {
////        List<Trainee> trainees = traineeService.getAllTrainees()
////                .stream()
////                .filter(trainee -> domain.equals(trainee.getInternshipDomain()))
////                .collect(Collectors.toList());
////        if (trainees.isEmpty()) {
//////            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
////            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Trainee not found");
////        }
////
////         else {
////            return ResponseEntity.ok(trainees);
////        }
////    }
//
//
//
//
////        @GetMapping("trainee-list/domain/{domain}")
////        public ResponseEntity<?> getTraineesByDomain(@PathVariable String domain)
////        {
////            List<Trainee> listOfTrainees = traineeService.getAllTrainees();
////            List<Trainee> listOfTraineesByDomain = listOfTrainees
////                                                   .stream()
////                                                   .filter(trainee -> domain.equals(trainee.getInternshipDomain()))
////                                                   .collect(Collectors.toList());
////
////            if(listOfTraineesByDomain.isEmpty())
////                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Trainee not found - Wrong domain");
////            else
////                return ResponseEntity.ok(listOfTraineesByDomain);
////        }
//
//}

import com.myshow4all.student_internship_program.entity.Trainee;
import com.myshow4all.student_internship_program.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/trainees")
public class TraineeController
{
    @Autowired
    private TraineeService traineeService;


    @PostMapping("/save")
    public CompletableFuture<ResponseEntity<String>> saveStudent(@RequestBody
                            Trainee trainee)
    {
       return traineeService.saveTrainee(trainee)
               .thenApply(aVoid->ResponseEntity
               .ok("Trainee saved successfully"))
               .exceptionally(ex->ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                       .body("Error saving trainee: "+ex.getMessage()));

    }


    @GetMapping("/trainee-list/domain/{domain}")
    public CompletableFuture<ResponseEntity<List<Trainee>>>
    traineeListByDomain(@PathVariable String domain)
    {
       return traineeService.getTraineesByDomain(domain)
                      .thenApply(trainees ->
                              {
                                if(trainees.isEmpty())
                                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                        .body(null);
                                else
                                return ResponseEntity.ok(trainees);
                              }
                             );

    }
}

