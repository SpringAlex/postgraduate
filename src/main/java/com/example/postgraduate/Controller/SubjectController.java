package com.example.postgraduate.Controller;

import com.example.postgraduate.POJO.Subject;
import com.example.postgraduate.Server.SubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@ResponseBody
@Controller
@CrossOrigin
@RequestMapping(value = "/subject")
@Api(tags = "学科类的api文档")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @PostMapping(value = "/addsubject")
    @ApiOperation(value = "用于添加学科")
    boolean addSubject(@RequestBody String subject_name){
        return subjectService.addSubject(subject_name);
    }

    @PostMapping(value = "/deletesubject")
    @ApiOperation(value = "用于删除学科")
    boolean deleteSubject(Integer subject_id){
        return subjectService.deleteSubject(subject_id);
    }

    @PostMapping(value = "/getallsubject")
    @ApiOperation(value = "用于获得所有学科")
    List<Subject> getAllSubjcet(){
        return subjectService.getAllSubject();
    }
}
