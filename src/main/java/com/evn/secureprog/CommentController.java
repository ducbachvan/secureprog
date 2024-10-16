package com.evn.secureprog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CommentController {

    private List<String> comments = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("comments", comments);
        return "index";
    }

    @PostMapping("/add-comment")
    public String addComment(@RequestParam("comment") String comment, Model model) {
        comments.add(comment);  // Lưu bình luận
        model.addAttribute("comments", comments);
        return "index";
    }
}


