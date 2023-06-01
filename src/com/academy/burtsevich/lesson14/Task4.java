package com.academy.burtsevich.lesson14;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        String s = File.separator;
        String rootPath = System.getProperty("user.dir")
                + s + "src" + s + "com" + s + "academy" + s + "burtsevich" + s + "lesson14";
        Scanner scanner = new Scanner(System.in);
        System.out.print(rootPath + '>');
        String path = rootPath;
        String[] command = scanner.nextLine().split(" ");
        File file = new File(path);

        while (!Objects.equals(command[0], "end".toLowerCase())) {
            String messageContent = "Содержимое папки " + path + '>';

            if (Objects.equals(command[0], "dir")) {
                int dirsNumber = 0;
                int filesNumber = 0;
                int filesSize = 0;
                if (file.isDirectory()) {
                    String filesType = "";
                    File[] listFiles = file.listFiles();
                    System.out.println("\n" + messageContent);
                    for (File file1 : listFiles) {
                        if (file1.isDirectory()) {
                            dirsNumber++;
                            filesType = "<DIR>";
                        } else {
                            filesNumber++;
                            filesSize += file1.length();
                        }
                        System.out.printf("%10tD%8s%8s%25s\n", file1.lastModified(), filesType, file1.length(), file1.getName());
                    }
                }
                System.out.printf("файлов: %s%s -> %s байт\nпапок: %s%s -> %s байт свободно\n", "", filesNumber, filesSize, "", dirsNumber, file.getFreeSpace());
            }

            if (command.length > 1 & Objects.equals(command[0], "cd") || Objects.equals(command[0], "cd..")) {
                if (Objects.equals(command[0], "cd..")) {
                    path = file.getParent();
                    file = new File(path);
                } else if (command[1] != null) {
                    if (Objects.equals(command[1], "..")) {
                        path = file.getParent();
                        file = new File(path);
                    } else {
                        File[] listFiles = file.listFiles();
                        boolean b = false;
                        for (File file1 : listFiles) {
                            if (Objects.equals(file1.getName(), command[1])) {
                                b = true;
                                break;
                            }
                        }
                        if (!b) {
                            System.out.println("Не удается найти указанный путь.");
                        } else {
                            path = path + File.separator + command[1];
                            file = new File(path);
                        }
                    }
                }
            }
            System.out.print(path + '>');
            command = scanner.nextLine().split(" ");
        }
    }
}

/*
я перешел в папку где есть и файлы и директории и мне показало <DIR> даже на файлах. да и формат выводв так себе
так же нету времени изменения и размер должен выводится только для файлов
в общем не хватает сходства с командами в cmd

  05/13/23   <DIR>    40966 Наследование и полиморфизм
  05/13/23   <DIR>    4096   7 Наследование часть 2
  05/15/23   <DIR>    4096     8 Работа со строками
  05/15/23   <DIR>    4096              9 Обобщения
  04/13/23   <DIR>104072269Bryus_Ekkel_-_Filosofia_Java_4-e_polnoe_izdanie.pdf
  04/09/23   <DIR>13283084Ihar_Blinou.Java.from.EPAM.2020.pdf
  04/05/23   <DIR>   19401image_2023-03-30_12-36-17.png
 */
