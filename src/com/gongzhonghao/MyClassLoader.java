package com.gongzhonghao;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author: yuanbing
 * @created time: 2020/4/9 22:45
 * @description:
 */

public class MyClassLoader extends ClassLoader {
    private String path;

    public MyClassLoader(String path) {
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Path path;
        String newPath = this.path + name + ".class";
        System.out.println(newPath);
        try {
            path = Paths.get(new URI(newPath));
            byte[] bytes = Files.readAllBytes(path);
            return defineClass(name, bytes, 0, bytes.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
