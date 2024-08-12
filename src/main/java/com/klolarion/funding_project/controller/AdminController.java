package com.klolarion.funding_project.controller;

import com.klolarion.funding_project.service.AdminService;
import com.klolarion.funding_project.service.AdminServiceImpl;
import com.klolarion.funding_project.service.MemberService;
import com.klolarion.funding_project.service.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;
    private final AdminServiceImpl adminServiceImpl;
    private MemberServiceImpl memberServiceImpl;

    @GetMapping
    public String admin(){

        return "admin";
    }

    @PostMapping("/memberSearch")
    public String foundMember(@RequestParam String keyword, Model model){
//        model.addAttribute("foundMember", );
        return "redirect:/admin";
    }
}
