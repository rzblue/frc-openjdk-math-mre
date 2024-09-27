// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all. Unless you know what
 * you are doing, do not modify this file except to change the parameter class to the startRobot
 * call.
 */
public final class Main {
  private Main() {}

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   */
  public static void main(String... args) {
    System.out.println(System.getProperty("java.runtime.name"));
    System.out.println(System.getProperty("java.runtime.version"));
    // Minimum reproducable example
    System.out.println("sin(Math.PI / 2): should be 1.0, is " + Math.sin(Math.PI / 2));

    // Uncomment below to start full robot
    // RobotBase.startRobot(Robot::new);
  }
}
