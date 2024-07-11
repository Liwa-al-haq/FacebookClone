package com.backend.model;

import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post { 

    private String id;

    private String post;
    private String name;
    private String email;
    private String image;
    private String file;
    private String profilePic;
    private String timestamp;
    private String imageName;

}
