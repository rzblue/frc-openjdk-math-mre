// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DataLogManager;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    DataLogManager.start();
    SmartDashboard.putString("java.version", System.getProperty("java.version"));
    SmartDashboard.putString("java.runtime.version", System.getProperty("java.runtime.version"));
  }

  @Override
  public void robotPeriodic() {
    
    // works
    SmartDashboard.putNumber("abs(-100)", Math.abs(-100));
    // does not work
    double oneHundred = 100;
    SmartDashboard.putNumber("abs(-oneHundred)", Math.abs(-oneHundred));


    double timer = Timer.getFPGATimestamp();
    SmartDashboard.putNumber("timer", timer);
    SmartDashboard.putNumber("sin(timer)", Math.sin(timer));

    SmartDashboard.putNumber("sin(100)", Math.sin(100));
    SmartDashboard.putNumber("sin(0.5)", Math.sin(0.5));
    for (int i = 0; i < 10; i++) {
      double value = i;
      SmartDashboard.putNumber("sin/" + value, Math.sin(value));
    }
    SmartDashboard.putNumber("cos(PI*0.5)", Math.cos(Math.PI * 0.5));
    SmartDashboard.putNumber("sin(PI*0.5)", Math.sin(Math.PI * 0.5));
    SmartDashboard.putNumber("cos(0)", Math.cos(0));
    SmartDashboard.putNumber("sin(0)", Math.sin(0));
    SmartDashboard.putNumber("cos(PI)", Math.cos(Math.PI));
    SmartDashboard.putNumber("sin(PI)", Math.sin(Math.PI));

  }
}
