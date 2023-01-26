// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ArmToSetpoint extends SubsystemBase {

   Encoder TestEncoder = new Encoder(8,9);

    /* Creates a new Pneumatics subsystem */
    public ArmToSetpoint () 
    {

    }

    public void CheckArm()
    {
      SmartDashboard.putNumber("Encoder", TestEncoder.get());
    }


  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
 
  
}
