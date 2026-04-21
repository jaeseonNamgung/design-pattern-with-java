package com.studyexample.designpattern.structural_patterns._08_composit.example;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component{

  private List<Component> children = new ArrayList<>();

  public void add(Component component) {
    children.add(component);
  }

  @Override
  public void operation() {
    System.out.println("폴더 실행");
    for (Component child : children) {
      child.operation();
    }
  }
}
