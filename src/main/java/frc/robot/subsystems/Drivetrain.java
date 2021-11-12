package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase{
    WPI_TalonSRX leftB = new WPI_TalonSRX(1);
    WPI_TalonSRX leftF = new WPI_TalonSRX(2);
    WPI_TalonSRX rightB = new WPI_TalonSRX(3);
    WPI_TalonSRX rightF = new WPI_TalonSRX(4);

    SpeedControllerGroup left = new SpeedControllerGroup(leftB, leftF);
    SpeedControllerGroup right = new SpeedControllerGroup(rightB, rightF);

    DifferentialDrive drivetrain = new DifferentialDrive(left,right);
    public Drivetrain() {

    }
    public void driveGirl(double speed, double rotation) {
        drivetrain.arcadeDrive(speed, rotation);
    }
}