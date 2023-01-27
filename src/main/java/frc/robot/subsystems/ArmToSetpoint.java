// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
public class ArmToSetpoint extends SubsystemBase {

   TalonFX testy = new TalonFX(6, "Bobby");

    /* Creates a new Pneumatics subsystem */
    public ArmToSetpoint () 
    {

    }

    public void CheckArm()
    {
      SmartDashboard.putNumber("Encoder", testy.getSelectedSensorPosition());
    }
//

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
 
  
}
