package me.javaroad.blog.core.controller.api;

import static me.javaroad.blog.core.controller.ApiConstants.API_VERSION;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heyx
 */
@RestController
@RequestMapping(API_VERSION + "/users/{username}/articles/{articleId}/comments")
public class CommentController {

}
