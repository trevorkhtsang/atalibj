package edu.ata.commands;

import edu.first.commands.CommandGroup;
import edu.first.module.driving.RobotDriveModule;
import edu.first.module.sensor.GyroModule;
import edu.first.module.target.PIDModule;

/**
 * Command to move the robot to a position.
 *
 * @author Joel Gallant <joelgallant236@gmail.com>
 */
public class MoveCommand extends CommandGroup {

    /**
     * Constructs the command using the various required variables.
     *
     * @param pidm PID to move the drivetrain
     * @param gyro gyro to get angle from
     * @param drivetrain drivetrain to move with
     * @param x how far right to move
     * @param y how far behind to move
     * @param turnSide speed of turning side
     * @param nonTurnSide speed of non-turning side
     */
    public MoveCommand(PIDModule pidm, GyroModule gyro, RobotDriveModule drivetrain,
            double x, double y, double turnSide, double nonTurnSide) {
        addSequential(new MoveToSetpoint(pidm, y / 2.0, false));
        addSequential(new TurnToAngle(turnSide, nonTurnSide, x > 0 ? -90 : 90, gyro, drivetrain, false));
        addSequential(new MoveToSetpoint(pidm, x, false));
        addSequential(new TurnToAngle(nonTurnSide, turnSide, x > 0 ? 90 : -90, gyro, drivetrain, false));
        addSequential(new MoveToSetpoint(pidm, y / 2.0, false));
    }
}