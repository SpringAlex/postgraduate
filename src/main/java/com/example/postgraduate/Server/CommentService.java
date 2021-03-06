package com.example.postgraduate.Server;

import com.example.postgraduate.POJO.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    boolean addComment(Comment comment);

    boolean changeStatus(Integer comment_id, Integer status);

    boolean addLike(Integer comment_id);

    List<Comment> getInvitationComment(Integer invitation_id);

    boolean deleteComment(Integer comment_id);

    List<Comment> getAllComment();

    List<Comment> getCommentByUser(Integer comment_user);

    List<Comment> getCommentById(Integer comment_id);

    String getUsername(Integer comment_user);
}
