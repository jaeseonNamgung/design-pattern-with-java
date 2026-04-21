package com.studyexample.designpattern.structural_patterns._08_composit;

public interface FileComponent {
  String getName();
  long getSize();
  void print(String indent);
}
