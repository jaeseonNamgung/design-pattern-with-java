package com.studyexample.designpattern.structural_patterns._08_composit;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent{

  private final String name;
  private final List<FileComponent> children = new ArrayList<>();


  public void add(FileComponent component) {
    children.add(component);
  }

  public void remove(FileComponent component) {
    children.remove(component);
  }

  public Directory(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public long getSize() {
    return children.stream().mapToLong(FileComponent::getSize).sum();
  }

  @Override
  public void print(String indent) {
    System.out.println(indent + "📁 " + name + " (" + getSize() + "B)");
    children.forEach(child -> child.print(indent + "  "));
  }
}
