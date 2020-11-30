package com.benjaminsimon.reddit_clone.mapper;

import com.benjaminsimon.reddit_clone.dto.PostRequest;
import com.benjaminsimon.reddit_clone.dto.PostResponse;
import com.benjaminsimon.reddit_clone.model.Post;
import com.benjaminsimon.reddit_clone.model.Subreddit;
import com.benjaminsimon.reddit_clone.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PostMapper {

    @Mapping(target = "createdDate", expression = "java(java.time.Instant.now())")
    @Mapping(target = "description", source = "java(postRequest.getDescription())")
    Post map(PostRequest postRequest, Subreddit subreddit, User user);

    @Mapping(target = "id", source = "postId")
    @Mapping(target = "subredditName", source = "subreddit.name")
    @Mapping(target = "userName", source = "user.username")
    PostResponse mapToDto(Post post);
}
