package com.studyexample.designpattern.creational_patterns._04_builder._02_after;

import com.studyexample.designpattern.creational_patterns._04_builder._01_before.DetailPlan;
import com.studyexample.designpattern.creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;
import java.util.List;

public class DefaultTourBuilder implements TourPlanBuilder{

  private final TourPlan tourPlan;

  public DefaultTourBuilder() {
    this.tourPlan = new TourPlan();
  }

  @Override
  public TourPlanBuilder nightsAndDays(int nights, int days) {
    tourPlan.setNights(nights);
    tourPlan.setDays(days);
    return this;
  }

  @Override
  public TourPlanBuilder title(String title) {
    tourPlan.setTitle(title);
    return this;
  }

  @Override
  public TourPlanBuilder startDate(LocalDate startDate) {
    tourPlan.setStartDate(startDate);
    return this;
  }

  @Override
  public TourPlanBuilder whereToStay(String whereToStay) {
    tourPlan.setWhereToStay(whereToStay);
    return this;
  }

  @Override
  public TourPlanBuilder addPlan(int days, String plans) {
    if (plans == null) {
      tourPlan.setPlans(List.of());
    }

    tourPlan.setPlans(List.of(new DetailPlan(days, plans)));
    return this;
  }

  @Override
  public TourPlan getPlan() {
    return tourPlan;
  }

}
