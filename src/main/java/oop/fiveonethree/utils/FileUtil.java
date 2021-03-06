package oop.fiveonethree.utils;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhouYing.
 * www.zhouying.xyz
 */
public class FileUtil {
//    private static String[] audioPostfix = (String[]) PropertiesUtil.readAudioPostfixs().toArray();
//    private static String[] videoPostfix = (String[]) PropertiesUtil.readVideoPostfixs().toArray();
//
//    public static boolean isAudio(String fileName) {
//        String type = getFilePostfix(fileName);
//        for (String one : audioPostfix)
//            if (one.equals(type)) return true;
//
//        return false;
//    }
//
//    public static boolean isVideo(String fileName) {
//        String type = getFilePostfix(fileName);
//        for (String one : videoPostfix)
//            if (one.equals(type)) return true;
//
//        return false;
//    }

    public static List<Path> convertFileToPath(List<File> files) {
        List<Path> paths = new ArrayList<>();
        for (File one : files) paths.add(one.toPath());
        return paths;
    }

    private static String getFilePostfix(String fileName) {
        if (fileName == null || fileName.length() == 0) return null;
        else return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}
