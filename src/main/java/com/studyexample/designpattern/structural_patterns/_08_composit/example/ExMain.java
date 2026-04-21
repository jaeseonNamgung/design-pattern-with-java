package com.studyexample.designpattern.structural_patterns._08_composit.example;

public class ExMain {
  public static void main(String[] args) {
    File file1 = new File("a.txt");
    File file2 = new File("b.txt");

    Folder folder = new Folder();

    folder.add(file1);
    folder.add(file2);

    Folder root = new Folder();
    root.add(folder);

    root.operation();


  }
}
