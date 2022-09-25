package com.i1lness.java.ch09;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class StreamBasic {
  public static void main(String[] args) throws IOException {
    // 0. 데이터 준비
    byte[] data = { 0, 1, 2 };

    // 1. 데이터 읽기
    InputStream is = new ByteArrayInputStream(data);
    System.out.println("읽은 데이터: " + is.read());
    System.out.println("읽은 데이터: " + is.read());
    System.out.println("읽은 데이터: " + is.read());

    is.close();

    // 2. 데이터 쓰기
    ByteArrayOutputStream os = new ByteArrayOutputStream();
    os.write(1);
    os.write(2);
    os.write(3);

    byte[] outputs = os.toByteArray();
    System.out.println("쓴 데이터" + Arrays.toString(outputs));

    os.close(); // 반드시 사용 후 닫아주어야 함
  }
}
