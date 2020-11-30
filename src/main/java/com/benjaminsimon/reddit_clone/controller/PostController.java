package com.benjaminsimon.reddit_clone.controller;

import com.benjaminsimon.reddit_clone.dto.PostRequest;
import com.benjaminsimon.reddit_clone.model.Post;
import com.benjaminsimon.reddit_clone.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
@AllArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody PostRequest postRequest) {
        return null;
    }
}
