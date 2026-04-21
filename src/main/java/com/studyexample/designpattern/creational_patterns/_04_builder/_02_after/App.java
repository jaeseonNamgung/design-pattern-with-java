package com.studyexample.designpattern.creational_patterns._04_builder._02_after;

import com.studyexample.designpattern.creational_patterns._04_builder._01_before.TourPlan;

public class App {
  public static void main(String[] args) {
    TourDirector tourDirector = new TourDirector();
    TourPlan tourPlan = tourDirector.cancunTrip();
    TourPlan tourPlan1 = tourDirector.longBeachTrip();

    System.out.println(tourPlan);
    System.out.println(tourPlan1);
  }
}
