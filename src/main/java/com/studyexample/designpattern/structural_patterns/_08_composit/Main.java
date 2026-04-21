package com.studyexample.designpattern.structural_patterns._08_composit;

public class Main {
  public static void main(String[] args) {
    Directory root=  new Directory("root");

    Directory src = new Directory("src");
    src.add(new File("Main.java", 1024));
    src.add(new File("Service.java", 2048));

    Directory resources = new Directory("resources");
    resources.add(new File("application.yml", 512));

    root.add(src);
    root.add(resources);
    root.add(new File("README.md", 256));

    root.print("");
    System.out.println("총 크기: " + root.getSize() + "B");
  }
}
