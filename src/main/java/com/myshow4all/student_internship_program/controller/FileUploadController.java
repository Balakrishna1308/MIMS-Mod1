package com.myshow4all.student_internship_program.controller;//package com.myshow4all.student_internship_program.controller;// FileUploadController.java
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//
//@RestController
//@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:3000")
//public class FileUploadController {
//
//    @PostMapping("/upload")
//    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
//        // Implement logic to save the file, e.g., to a specific folder or database.
//        // Example: FileStorageService.storeFile(file);
//
//        try {
//            // Simulating file storage logic
//            byte[] bytes = file.getBytes();
//            // Save the bytes to the desired location or process it as needed.
//
//            return new ResponseEntity<>("File uploaded successfully", HttpStatus.OK);
//        } catch (IOException e) {
//            return new ResponseEntity<>("Failed to upload file", HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//}


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
//@RequestMapping("/api")
@RequestMapping("/api/v1")
@Tag
        (
            name = "CRUD REST APIs for FileEntity Resource"
        )

public class FileUploadController {

    @PostMapping("/upload")
    @Operation
            (
                    summary = "File Upload REST API",
                    description = "File Upload REST API is used to upload the file into the database"
            )
    @ApiResponses
            (
                     value = @ApiResponse
                                     (responseCode = "200",
                                             description = "HTTP Status 200, OK - File uploaded successfully"
                                     )

            )
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        try {
            // Get the file bytes
            byte[] bytes = file.getBytes();

            // Specify the file path where you want to store it
            Path path = Paths.get("C:\\All\\Misc\\" + file.getOriginalFilename());

            // Save the file to the specified path
            Files.write(path, bytes);

            return new ResponseEntity<>("File uploaded successfully", HttpStatus.OK);

        } catch (IOException e) {
            return new ResponseEntity<>("Failed to upload file", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
