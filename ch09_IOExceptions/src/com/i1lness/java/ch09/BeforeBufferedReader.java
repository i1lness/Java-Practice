package com.i1lness.java.ch09;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BeforeBufferedReader {
  private static final int EOF = -1;
  private static final String TARGET_TEXT_FILE = "sample-2mb-text-file.txt";

  public static void main(String[] args) throws IOException {
    // 1. FileReader 생성
    FileReader fr = new FileReader(TARGET_TEXT_FILE, StandardCharsets.UTF_8);

    // 2. 한 글자씩 읽기
    long sTime = System.currentTimeMillis();
    while (EOF != fr.read()) {
      // do nothing
    }

    long readTime = System.currentTimeMillis() - sTime;
    System.out.println(TARGET_TEXT_FILE + "을 읽는 시간: " + readTime + "ms");

    fr.close();
  }
}
