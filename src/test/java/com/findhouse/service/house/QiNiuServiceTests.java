package com.findhouse.service.house;


import com.findhouse.ApplicationTests;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;

import java.io.File;
@TestPropertySource(locations={"classpath:application.properties"})
public class QiNiuServiceTests extends ApplicationTests {
    @Autowired
    private IQiNiuService qiNiuService;
    @Test
    public void testUploadFile(){
        String fileName = "D:\\IDEA\\ideaworkspace\\findhouse\\temp\\分层.png";
        File file = new File(fileName);
        Assert.assertTrue(file.exists());
        try {
            Response response = qiNiuService.uploadFile(file);
            Assert.assertTrue(response.isOK());
        } catch (QiniuException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testDelete(){
        String key = "FmkXe0YcG1HQIL_vT_BntZyPxB-o";
        try {
            Response response = qiNiuService.delete(key);
            Assert.assertTrue(response.isOK());
        } catch (QiniuException e) {
            e.printStackTrace();
        }
    }
}
