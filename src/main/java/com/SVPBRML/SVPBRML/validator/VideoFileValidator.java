package com.SVPBRML.SVPBRML.validator;

import java.util.Arrays;
import java.util.List;

public class VideoFileValidator {
  private final static List<String> allowedFileTypes = Arrays.asList("mp4", "avi", "mkv", "mov", "flv", "mpeg", "wmv");
  private static final long maxFileSize = 10485760;

  public static boolean isValidFileType(String fileName) {

    if (fileName.lastIndexOf(".") == -1) {
      return false;
    }
    String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
    return allowedFileTypes.contains(fileExtension);
  }

  public static boolean isValidFileSize(long fileSize) {
    return fileSize <= maxFileSize;
  }

  public static List<String> getAllowedFileTypes() {
    return allowedFileTypes;
  }
}
