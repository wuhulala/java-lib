package com.wuhulala.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

/**
 * 0_0 o^o
 *
 * @author wuhulala<br>
 * @date 2018/11/6<br>
 * @description o_o<br>
 * @since v1.0<br>
 */
public class FileUtils {

    private static final Logger logger = LoggerFactory.getLogger(FileUtils.class);

    public static String getFileContent(String path){
        try {
            return org.apache.commons.io.FileUtils.readFileToString(new File(path), "UTF-8");
        } catch (IOException e) {
            logger.error("读取文件[{}]内容失败!", path, e);
            return "";
        }
    }

}
