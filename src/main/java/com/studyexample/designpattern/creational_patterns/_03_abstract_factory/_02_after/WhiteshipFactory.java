package com.studyexample.designpattern.creational_patterns._03_abstract_factory._02_after;

import com.studyexample.designpattern.creational_patterns._02_factory_method._02_after.DefaultShipFactory;
import com.studyexample.designpattern.creational_patterns._02_factory_method._02_after.Ship;
import com.studyexample.designpattern.creational_patterns._02_factory_method._02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

  private final WhiteshipPartsFactory shipPartsFactory;

  public WhiteshipFactory(WhiteshipPartsFactory shipPartsFactory) {
    this.shipPartsFactory = shipPartsFactory;
  }

  @Override
  public Ship createShip() {
    Ship ship = new Whiteship();
    ship.setAnchor(shipPartsFactory.createAnchor());
    ship.setWheel(shipPartsFactory.createWheel());
    return ship;
  }
}
