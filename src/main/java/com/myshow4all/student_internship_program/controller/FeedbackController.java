package com.myshow4all.student_internship_program.controller;// FeedbackController.java

import com.myshow4all.student_internship_program.entity.Feedback;
import com.myshow4all.student_internship_program.repository.FeedbackRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//@RestController
//@RequestMapping("/api/feedback")
//@CrossOrigin(origins = "http://localhost:3000") // Replace with the actual URL of your ReactJS app
//public class FeedbackController {
//
//    @Autowired
//    private FeedbackRepository feedbackRepository;
//
//    @PostMapping
//    public ResponseEntity<String> submitFeedback(@RequestBody String feedbackContent) {
//        try {
//            Feedback feedback = new Feedback();
//            feedback.setContent(feedbackContent);
//            feedbackRepository.save(feedback);
//
//            return ResponseEntity.ok("Feedback submitted successfully!");
//        } catch (Exception e) {
//            return ResponseEntity.status(500).body("Error submitting feedback: " + e.getMessage());
//        }
//    }
//}









import com.myshow4all.student_internship_program.entity.Feedback;
import com.myshow4all.student_internship_program.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.table.TableCellEditor;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

//@RestController
//@RequestMapping("/api/feedback")
//@CrossOrigin(origins = "http://localhost:3000") // Replace with the actual URL of your ReactJS app
//public class FeedbackController {
//
//    @Autowired
//    private FeedbackService feedbackService;
//
//    @PostMapping
//    public ResponseEntity<String> submitFeedback(@RequestBody String feedbackContent) {
//        try {
//            Feedback feedback = new Feedback();
//            feedback.setContent(feedbackContent);
//            feedbackService.saveFeedback(feedback);
//
//            return ResponseEntity.ok("Feedback submitted successfully!");
//        } catch (Exception e) {
//            return ResponseEntity.status(500).body("Error submitting feedback: " + e.getMessage());
//        }
//    }
//
//    @GetMapping("/getAll")
//    public ResponseEntity<List<Feedback>> getAllFeedback() {
//        List<Feedback> allFeedback = feedbackService.getAllFeedback();
//        return ResponseEntity.ok(allFeedback);
//    }
//}

//
//
//@RestController
//@RequestMapping("/api/feedback")
//@CrossOrigin(origins = "http://localhost:3000") // Replace with the actual URL of your ReactJS app
//public class FeedbackController {
//
//    @Autowired
//    private FeedbackService feedbackService;
//
//    @PostMapping
//    public ResponseEntity<String> submitFeedback(@RequestBody String feedbackContent) {
//        try {
//            System.out.println("Received feedback: " + feedbackContent);
//
//            // Create a Feedback object and set the content
//            Feedback feedback = new Feedback();
//            feedback.setContent(feedbackContent);
//
//            // Save the feedback to the database using your FeedbackService
//            feedbackService.saveFeedback(feedback);
//
//            return ResponseEntity.ok("Feedback submitted successfully!");
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.status(500).body("Error submitting feedback: " + e.getMessage());
//        }
//    }
//
//    @GetMapping("/getAll")
//    public ResponseEntity<List<Feedback>> getAllFeedback() {
//        List<Feedback> allFeedback = feedbackService.getAllFeedback();
//        return ResponseEntity.ok(allFeedback);
//    }
//}






//@RestController
////@RequestMapping("/api/feedback")
//@RequestMapping("/api/v1/feedback")
//
////@CrossOrigin(origins = "http://localhost:3000") // Replace with the actual URL of your ReactJS
//@Tag(name = "CRUD REST APIs for Feedback Resource")
//@CrossOrigin(origins = "http://localhost:3000") // Replace with the actual URL of your ReactJS app
//
//
//
//
//
////@Tag(name = "Feedback", description = "APIs for handling feedback")
//
//
//
//
//
//
//public class FeedbackController {
//
//    @Autowired
//    private FeedbackService feedbackService;

//    @PostMapping
////    public ResponseEntity<String> submitFeedback(@RequestBody Map<String, String> feedbackMap) {
////        try {
////            String feedbackContent = feedbackMap.get("feedback");
////            System.out.println("Received feedback: " + feedbackContent);
////
////            // Create a Feedback object and set the content
////            Feedback feedback = new Feedback();
////            feedback.setContent(feedbackContent);
////
////            // Save the feedback to the database using your FeedbackService
////            feedbackService.saveFeedback(feedback);
////
////            return ResponseEntity.ok("Feedback submitted successfully!");
////        } catch (Exception e) {
////            e.printStackTrace();
////            return ResponseEntity.status(500).body("Error submitting feedback: " + e.getMessage());
////        }
////    }
////
////
//
//
//
//

//    @Operation(summary = "Submit feedback", description = "Submit feedback content")



//    @Operation(summary = "Submit feedback", description = "Submit feedback congtent")



//    @PostMapping
//    @Operation(summary = "Submit Feedback REST API", description = "Submit Feedback REST API is used to save the feedback into a trainee")
//    @ApiResponses
//    (
//               @ApiResponse
//                       (
//                               responseCode = "200",
//                               description = "HTTP status 200 OK"
//
//                       )
//
//    )
//
//    public ResponseEntity<String> submitFeedback(@RequestBody String feedbackContent) {
//        try {
//            System.out.println("Received feedback: " + feedbackContent);
//
//            Feedback feedback = new Feedback();
//            feedback.setContent(feedbackContent);
//            feedbackService.saveFeedback(feedback);
//
//            System.out.println("Feedback saved successfully!");
//
//            return ResponseEntity.ok("Feedback submitted successfully!");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.status(500).body("Error submitting feedback: " + e.getMessage());
//        }
//    }
//
//
//    @Operation(summary = "Fetch all the Feedback REST APIs", description = "Fetch all the Feedback REST APIs is used to" +
//                        " fetch all the feedbacks given by the trainee")
//    @ApiResponses
//            (
//                    @ApiResponse
//                    (
//                       responseCode = "200",
//                       description = "HTTP status code 200, OK - Fetched all the feedbacks"
//
//                    )
//
//            )
//    @GetMapping("/getAll")
//    public ResponseEntity<List<Feedback>> getAllFeedback() {
//        List<Feedback> allFeedback = feedbackService.getAllFeedback();
//        return ResponseEntity.ok(allFeedback);
//    }
//
//
//
//
//
////    @GetMapping("/swagger-ui/index.html")
////    public String swaggerUi() {
////        return "redirect:/swagger-ui/index.html";
////    }
//
//
//
//
//
//}





//@RestController
//@RequestMapping("api/feedbacks")
//public class FeedbackController
@RestController
@RequestMapping("api/feedbacks")
public class FeedbackController
{
//    @Autowired
//    private FeedbackService feedbackService;

    @Autowired
    private FeedbackService feedbackService;

//    private FeedbackRepository feedbackRepository;


    @PostMapping("/save")
    public ResponseEntity<String> saveFeedback(@RequestBody Feedback feedback)
    {
        ResponseEntity<Feedback> saveFeedback = feedbackService.saveFeedback(feedback);
        return ResponseEntity.ok("Feedback saved successfully");
    }


    @GetMapping("/all")
    public ResponseEntity<List<Feedback>> getAllFeedback()
    {
        return feedbackService.getAllFeedbacks();
    }


    @GetMapping("/filtered")
    public ResponseEntity<List<Feedback>> getFilteredFeedback(@RequestParam(value = "comment") String comment)
    {
        ResponseEntity<List<Feedback>> listOfFilteredFeedbacks =


                feedbackService.getFilteredFeedbacks(

                            feedback -> feedback.getContent() != null && feedback.getContent().contains(comment)
                                                    );


        return listOfFilteredFeedbacks;
    }










    @GetMapping("/comment-length")
    public ResponseEntity<Integer> getFeedbackCommentLength(@RequestParam Long feedbackId)
    {
        Feedback feedback = feedbackService.getAllFeedbacks().getBody()
                .stream()
                .filter(fb -> fb.getId().equals(feedbackId))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Feedback not found"));

                return ResponseEntity.ok(FeedbackService.feedbackCommentLength.apply(feedback));
    }


    @GetMapping("/search")
    public CompletableFuture<ResponseEntity<List<Feedback>>> searchFeedbacks(@RequestParam String keyword)
    {
        CompletableFuture<ResponseEntity<List<Feedback>>> responseEntityCompletableFuture = feedbackService.searchFeedbackByComment(keyword).
                thenApply(
                        feedbacks -> {
                            if (feedbacks.isEmpty()) {
                                return ResponseEntity.noContent().build();
                            }

                            return ResponseEntity.ok(feedbacks);
                        }
                );
        return responseEntityCompletableFuture;

    }
}











