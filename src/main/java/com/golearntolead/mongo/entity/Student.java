package com.golearntolead.mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "STUDENT")
public class Student {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    //@Indexed(unique = true)
    private String email;
    private Gender gender;
    private Address address;
    private List<String> favoriteSubjects;
    private BigDecimal timeSpentInBooks;
    private LocalDateTime created;

    public static void main(String[] args) {
        Student st = new Student();
        st.setCreated(LocalDateTime.now());
    }
}
