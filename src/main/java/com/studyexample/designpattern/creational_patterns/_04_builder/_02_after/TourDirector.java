package com.studyexample.designpattern.creational_patterns._04_builder._02_after;

import com.studyexample.designpattern.creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {


  public TourDirector() {
  }

  public TourPlan cancunTrip() {

    return new DefaultTourBuilder().title("칸쿤 여행")
        .nightsAndDays(2, 3)
        .startDate(LocalDate.of(2020, 12, 9))
        .whereToStay("리조트")
        .addPlan(0, "체크인하고 짐 풀기")
        .addPlan(0, "저녁 식사")
        .getPlan();
  }

  public TourPlan longBeachTrip() {
    return new DefaultTourBuilder().title("롱비치")
        .startDate(LocalDate.of(2021, 7, 15))
        .getPlan();
  }
}
