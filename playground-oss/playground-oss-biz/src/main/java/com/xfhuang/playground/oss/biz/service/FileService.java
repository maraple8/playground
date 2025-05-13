package com.xfhuang.playground.oss.biz.service;

import com.xfhuang.framework.common.response.Response;
import org.springframework.web.multipart.MultipartFile;


public interface FileService {


    Response<?> uploadFile(MultipartFile file);
}
