////package com.myshow4all.student_internship_program.entity;
////import jakarta.persistence.*;
////import lombok.Data;
////
////import java.time.LocalDate;
////
////
////@Entity
////@Data
////public class Trainee {
////
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    private Long id;
////
////
//////    @Column(nullable = false)
////    private String traineeName;
////
//////    @Column(nullable = false)
////    private String courseName;
////
//////    @Column(nullable = false)
////    private String internshipDomain;
////
//////    @Column(nullable = false)
////    private String collegeName;
////
//////    @Column(nullable = false)
////    private long contactNumber;
////
//////    @Column(nullable = false)
////    private String email;
////
//////    @Column(nullable = false)
//////    private String mentorName;
////
////
//////    @Temporal(TemporalType.DATE)
//////    @Column(name = "from_date")
//////    private LocalDate fromDate;
////
////
//////    @Temporal(TemporalType.DATE)
//////    @Column(name = "to_date")
//////    private LocalDate toDate;
////
////
//////    @Temporal(TemporalType.DATE)
//////    @Column(name = "submitted_on")
//////    private LocalDate submittedOn;
////
////
////
////
////    @Column(unique = true)
////    private String traineeId;
////
////    @PostPersist
////    private void setInitialStudentId() {
////        // Check if there are any students in the database
////        if (id != null && id == 1) {
////            // This is the first student, set the initial ID
////            traineeId = "M00171";
////        } else {
////            // This is not the first student, generate an auto-incremented ID
////            // You can format it as needed, e.g., M00172, M00173, etc.
////            traineeId = String.format("M%05d", id + 171);
////        }
////    }
////}
////
////
////
//
//
//
//package com.myshow4all.student_internship_program.entity;
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.time.LocalDate;
//
//
//@Entity
//@Data
//public class Trainee {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//
//    //    @Column(nullable = false)
////    private String traineeName;
//
//
//
//
//
//
//
//    @Column(nullable = false)
//    private String traineeFirstName;
//
//    @Column(nullable = false)
//    private String traineeLastName;
//
//
//
//
//
//
//
//    //    @Column(nullable = false)
//    private String courseName;
//
//    //    @Column(nullable = false)
//    private String internshipDomain;
//
//    //    @Column(nullable = false)
//    private String collegeName;
//
//    //    @Column(nullable = false)
//    private long contactNumber;
//
//    //    @Column(nullable = false)
//    private String email;
//
////    @Column(nullable = false)
////    private String mentorName;
//
//
////    @Temporal(TemporalType.DATE)
////    @Column(name = "from_date")
////    private LocalDate fromDate;
//
//
////    @Temporal(TemporalType.DATE)
////    @Column(name = "to_date")
////    private LocalDate toDate;
//
//
////    @Temporal(TemporalType.DATE)
////    @Column(name = "submitted_on")
////    private LocalDate submittedOn;
//
//
//
//
//    @Column(unique = true)
//    private String traineeId;
//
//    @PostPersist
//    private void setInitialStudentId() {
//        // Check if there are any students in the database
//        if (id != null && id == 1) {
//            // This is the first student, set the initial ID
//            traineeId = "M00171";
//        } else {
//            // This is not the first student, generate an auto-incremented ID
//            // You can format it as needed, e.g., M00172, M00173, etc.
//            traineeId = String.format("M%05d", id + 171);
//        }
//    }
//
//}
//
//
//
//



//package com.myshow4all.student_internship_program.entity;
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.time.LocalDate;
//
//
//@Entity
//@Data
//public class Trainee {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//
////    @Column(nullable = false)
//    private String traineeName;
//
////    @Column(nullable = false)
//    private String courseName;
//
////    @Column(nullable = false)
//    private String internshipDomain;
//
////    @Column(nullable = false)
//    private String collegeName;
//
////    @Column(nullable = false)
//    private long contactNumber;
//
////    @Column(nullable = false)
//    private String email;
//
////    @Column(nullable = false)
////    private String mentorName;
//
//
////    @Temporal(TemporalType.DATE)
////    @Column(name = "from_date")
////    private LocalDate fromDate;
//
//
////    @Temporal(TemporalType.DATE)
////    @Column(name = "to_date")
////    private LocalDate toDate;
//
//
////    @Temporal(TemporalType.DATE)
////    @Column(name = "submitted_on")
////    private LocalDate submittedOn;
//
//
//
//
//    @Column(unique = true)
//    private String traineeId;
//
//    @PostPersist
//    private void setInitialStudentId() {
//        // Check if there are any students in the database
//        if (id != null && id == 1) {
//            // This is the first student, set the initial ID
//            traineeId = "M00171";
//        } else {
//            // This is not the first student, generate an auto-incremented ID
//            // You can format it as needed, e.g., M00172, M00173, etc.
//            traineeId = String.format("M%05d", id + 171);
//        }
//    }
//}
//
//
//











package com.myshow4all.student_internship_program.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Data
public class Trainee
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    //    @Column(nullable = false)
////    private String traineeName;
//
//
//
//
//
//
//
    @Column(nullable = false)
    private String traineeFirstName;

    @Column(nullable = false)
    private String traineeLastName;
//
//
//
//
//
//
//
////    @Column(unique = true) // Ensure unique constraint for traineeID
////    private String traineeID;
//
//    private String password;
//
//
//
//
    //    @Column(nullable = false)
    private String courseName;

    //    @Column(nullable = false)
    private String internshipDomain;

    //    @Column(nullable = false)
    private String collegeName;

    //    @Column(nullable = false)
    private long contactNumber;

    //    @Column(nullable = false)
    private String email;
//
////    @Column(nullable = false)
////    private String mentorName;
//
//
////    @Temporal(TemporalType.DATE)
////    @Column(name = "from_date")
////    private LocalDate fromDate;
//
//
////    @Temporal(TemporalType.DATE)
////    @Column(name = "to_date")
////    private LocalDate toDate;
//
//
////    @Temporal(TemporalType.DATE)
////    @Column(name = "submitted_on")
////    private LocalDate submittedOn;
//
//
//
//
//    @Column(unique = true, name = "traineeID")
    @Column(unique = true)
    private String traineeId;
//
    @PostPersist
    private void setInitialStudentId() {
        // Check if there are any students in the database
        if (id != null && id == 1) {
            // This is the first student, set the initial ID
            traineeId = "M00171";
        } else {
            // This is not the first student, generate an auto-incremented ID
            // You can format it as needed, e.g., M00172, M00173, etc.
            traineeId = String.format("M%05d", id + 171);
        }
    }

}




