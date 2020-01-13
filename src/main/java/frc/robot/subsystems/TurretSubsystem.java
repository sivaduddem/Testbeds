package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.motor.TitanSRX;
import frc.robot.sensors.Encoder;

public class TurretSubsystem extends SubsystemBase {

// Any variables/fields used in the constructor must appear before the "INSTANCE" variable
// so that they are initialized before the constructor is called.

    /**
     * The Singleton instance of this TurretSubsystem. External classes should
     * use the {@link #getInstance()} method to get the instance.
     */
//    private final static TurretSubsystem INSTANCE = new TurretSubsystem(shooter, zMotor);

    /**
     * Creates a new instance of this TurretSubsystem.
     * This constructor is private since this class is a Singleton. External classes
     * should use the {@link #getInstance()} method to get the instance.
     */
    private TitanSRX shooter, zMotor, hood, belt;
    public TurretSubsystem(TitanSRX shooter, TitanSRX zMotor, TitanSRX hood, TitanSRX belt) {
        // TODO: Set the default command, if any, for this subsystem by calling setDefaultCommand(command)
        //       in the constructor or in the robot coordination class, such as RobotContainer.
        //       Also, you can call addChild(name, sendableChild) to associate sendables with the subsystem
        //       such as SpeedControllers, Encoders, DigitalInputs, etc.
        this.shooter = shooter;
        this.zMotor = zMotor;
        this.hood = hood;
        this.belt = belt;
    }

    public void setShooter(double speed){
        if (speed > 1){
            shooter.set(ControlMode.PercentOutput, 1);
        } else if (speed < -1){
            shooter.set(ControlMode.PercentOutput, -1);
        } else {
            shooter.set(ControlMode.PercentOutput, speed);
        }
    }

    public void setZMotor(double speed){
        if (speed > 1){
            zMotor.set(ControlMode.PercentOutput, 1);
        } else if (speed < -1){
            zMotor.set(ControlMode.PercentOutput, -1);
        } else {
            zMotor.set(ControlMode.PercentOutput, speed);
        }
    }

    public void setHood(double speed){
        if (speed > 1){
            hood.set(ControlMode.PercentOutput, 1);
        } else if (speed < -1){
            hood.set(ControlMode.PercentOutput, -1);
        } else {
            hood.set(ControlMode.PercentOutput, speed);
        }
    }

    public void setBelt(double speed){
        if (speed > 1){
            belt.set(ControlMode.PercentOutput, 1);
        } else if (speed < -1){
            belt.set(ControlMode.PercentOutput, -1);
        } else {
            belt.set(ControlMode.PercentOutput, speed);
        }
    }

    public Encoder getZMotorEncoder(){
        return zMotor.getEncoder();
    }
    public Encoder getHoodEncoder(){
        return hood.getEncoder();
    }

    /**
     * Returns the Singleton instance of this TurretSubsystem. This static method
     * should be used -- {@code TurretSubsystem.getInstance();} -- by external
     * classes, rather than the constructor to get the instance of this class.
     */
//    public static TurretSubsystem getInstance() {
//        return INSTANCE;
//    }

}
