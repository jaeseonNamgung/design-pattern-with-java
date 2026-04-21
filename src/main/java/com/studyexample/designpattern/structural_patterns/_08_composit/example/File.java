package com.studyexample.designpattern.structural_patterns._08_composit.example;

public class File implements Component{

  private String name;

  public File(String name) {
    this.name = name;
  }

  @Override
  public void operation() {
    System.out.println("파일: " + name);
  }
}
