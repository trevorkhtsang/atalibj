package edu.ATA.module.subsystems;

import edu.ATA.commands.GearShift;
import edu.ATA.commands.MoveToSetpoint;
import edu.ATA.module.Module;
import edu.ATA.module.driving.RobotDriveModule;
import edu.ATA.module.actuator.SolenoidModule;
import edu.ATA.module.subsystem.Subsystem;
import edu.ATA.module.target.PIDModule;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSource;

/**
 *
 * @author Team 4334
 */
public class ShiftingDrivetrain extends Subsystem {

    private final RobotDriveModule driveModule;
    private final SolenoidModule firstGear, secondGear;
    private final PIDModule pid;

    /**
     *
     * @param driveModule
     * @param firstGear
     * @param secondGear
     * @param encoders
     * @param p
     * @param i
     * @param d
     */
    public ShiftingDrivetrain(RobotDriveModule driveModule, SolenoidModule firstGear, 
            SolenoidModule secondGear, PIDSource encoders, double p, double i, double d) {
        this(driveModule, firstGear, secondGear, new PIDModule(new PIDController(p, i, d, encoders, driveModule)));
    }
    
    private ShiftingDrivetrain(RobotDriveModule driveModule, SolenoidModule firstGear, 
            SolenoidModule secondGear, PIDModule pid) {
        super(new Module[] {driveModule, firstGear, secondGear, pid});
        this.driveModule = driveModule;
        this.firstGear = firstGear;
        this.secondGear = secondGear;
        this.pid = pid;
    }

    /**
     *
     * @param speed
     * @param turn
     */
    public void arcadeDrive(double speed, double turn) {
        driveModule.arcadeDrive(speed, turn);
    }

    /**
     *
     * @param left
     * @param right
     */
    public void tankDrive(double left, double right) {
        driveModule.tankDrive(left, right);
    }

    /**
     *
     */
    public void stop() {
        driveModule.stopMotors();
    }

    /**
     *
     */
    public void shiftGears() {
        new GearShift(firstGear, secondGear).run();
    }

    /**
     *
     * @param setpoint
     * @param percentageTolerance
     */
    public void driveTo(double setpoint, double percentageTolerance) {
        new MoveToSetpoint(pid, setpoint, percentageTolerance).run();
    }
}