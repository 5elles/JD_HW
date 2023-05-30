package com.academy.burtsevich.lesson14;

import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        String s = File.separator;
        String dirPath = System.getProperty("user.dir") + s + "src" + s + "com" + s + "academy" + s + "burtsevich" + s + "lesson14";
        String file1 = s + dirPath + s + "in1.txt";
        String file2 = s + dirPath + s + "in2.txt";
        String out = s + dirPath + s + "out.txt";
        List<Integer> integerList = new ArrayList<>();


        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file1)))) {
            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                dataOutputStream.writeInt(random.nextInt(1, 100_000));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file2)))) {
            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                dataOutputStream.writeInt(random.nextInt(1, 100_000));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file1)))) {

            while (dis.available() > 0) {
                integerList.add(dis.readInt());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file2)))) {

            while (dis.available() > 0) {
                integerList.add(dis.readInt());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(integerList);

        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(out)))) {
            for (Integer integer : integerList) {
                dos.writeBytes(integer.toString() + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
