package com.george.kotlin.function.unit1;

import kotlin.io.FilesKt;
import kotlin.text.Charsets;

import java.io.File;

/**
 * @program: KotlinLearn
 * @description:
 * @author: George
 * @create: 2020-11-01 16:19
 */
public class JavaExtendFunction {
    public static void main(String[] args) {
        /**
         * 在java中使用扩展函数
         */
        File file = new File("KotlinLearn.iml");
        String content = FilesKt.readText(file, Charsets.UTF_8);
        System.out.println(content);
    }
}