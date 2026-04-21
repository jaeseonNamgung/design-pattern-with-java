package com.studyexample.designpattern.creational_patterns._03_abstract_factory._02_after;

import com.studyexample.designpattern.creational_patterns._02_factory_method._02_after.Ship;

public class ShipInventory {


  public static void main(String[] args) {

    WhiteshipFactory whiteshipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());

    Ship ship = whiteshipFactory.createShip();

    System.out.println(ship.getAnchor().getClass());
    System.out.println(ship.getWheel().getClass());

  }
}
