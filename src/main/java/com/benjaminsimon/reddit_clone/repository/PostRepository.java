package com.benjaminsimon.reddit_clone.repository;

import com.benjaminsimon.reddit_clone.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}