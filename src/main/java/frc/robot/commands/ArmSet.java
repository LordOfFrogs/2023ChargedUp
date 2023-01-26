package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmToSetpoint;

/** An example command that uses an example subsystem. */
public class ArmSet extends CommandBase 
{
    private final ArmToSetpoint m_ArmToSetpoint;

    public ArmSet(ArmToSetpoint subsystem)
    {
        m_ArmToSetpoint = subsystem;
        addRequirements(subsystem);
    }


    @Override
    public void initialize() 
    {
   
    }


    @Override
    public void execute() 
    {
        m_ArmToSetpoint.CheckArm();
    }


    @Override
    public void end(boolean interrupted) 
    {
   
    }

    
    @Override
    public boolean isFinished() {
    return false;
    }   
}

