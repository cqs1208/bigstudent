package com.bigstudent.controller;

import com.bigstudent.common.CommonCode;
import com.bigstudent.common.CommonResponse;
import com.bigstudent.common.enums.ResourceSecTypeEnum;
import com.bigstudent.common.enums.ResourceTypeEnum;
import com.bigstudent.domain.BsResourceDo;
import com.bigstudent.service.BsResourceService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.Calendar;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2018/11/23
 */
@RestController
@RequestMapping("/file")
public class FileController {

    @Resource
    private BsResourceService bsResourceService;

    /**
     * 单文件上传
     * @param file
     * @param request
     * @return
     */
    @PostMapping("/upload")
    public CommonResponse upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        if (!file.isEmpty()) {
            String path =   request.getParameter("path");
            String saveFileName = file.getOriginalFilename();
            Calendar calendar = Calendar.getInstance();
            // 年
            int year = calendar.get(Calendar.YEAR);
            // 月
            int month = calendar.get(Calendar.MONTH)+1;

            String basePath = "/usr/local/images";

            BsResourceDo bsResourceDo = bsResourceService.getResourceInfo(ResourceTypeEnum.HOST.getCode(), ResourceSecTypeEnum.HOST_INFO.getCode());

            File saveFile = new File(basePath + "/" + path + "/"+ year + "/" + month + "/" + saveFileName);
            String returnPath = bsResourceDo.getValue() + "/" + path + "/"+ year + "/" + month + "/" + saveFileName;
            saveFile.setReadable(true, false);
            saveFile.setExecutable(true, false);
            saveFile.setWritable(true, false);
            if (!saveFile.getParentFile().exists()) {
                saveFile.getParentFile().mkdirs();
            }
            try {
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(saveFile));
                InputStream input = file.getInputStream();
                byte[] b = new byte[1024];
                while (input.read(b) != -1) {
                    out.write(b);
                    b = new byte[1024];
                }
                out.flush();
                out.close();
                return CommonResponse.getSuccessInfo(returnPath);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return CommonResponse.getNewInstance(CommonCode.UPLOAD_FAILED);
            } catch (IOException e) {
                e.printStackTrace();
                return CommonResponse.getNewInstance(CommonCode.UPLOAD_FAILED);
            }
        } else {
            return CommonResponse.getNewInstance(CommonCode.UPLOAD_FAILED);
        }
    }
}
