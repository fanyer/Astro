package com.example.demo.controller;

import com.example.demo.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

@RestController
public class UploadController {


    @PostMapping("/upload")
    public HashMap handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {

        System.out.println("user.dir : "+System.getProperty("user.dir"));

        String path = System.getProperty("user.dir") + "/file/";

        if(!new File(path).exists())   {
            new File(path).mkdirs();
        }

        File newFile=new File(path+"aa");
//        File newFile=new File(path+file.getOriginalFilename());
//        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
        file.transferTo(newFile);
//        long  endTime=System.currentTimeMillis();
//        System.out.println("方法二的运行时间："+String.valueOf(endTime-startTime)+"ms");

        HashMap map = new HashMap();
        map.put("key1", "value1");

        return map;
    }


}
