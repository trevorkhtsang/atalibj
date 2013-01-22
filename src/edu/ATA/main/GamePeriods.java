/*
 * Team 4334 - Alberta Tech Alliance - FRC Robot Code
 * 2012-2013 Season
 *
 * This code is intended for use for Team 4334, and should not be distributed to
 * other FRC teams without full consent from the proper team authorities. To learn
 * more about the programming team, rules, conventions or any other information about
 * our code, please contact Joel (joelgallant236@gmail.com).
 *
 * This code is hosted on github on https://github.com/Team4334/robot-code
 *
 * Before making changes, adding files or doing anything on git, please ensure that
 * you are authorized to do so, and know what you are doing.
 *
 * If you would like to use a piece of code in this project, please ask us first,
 * through chief delphi (joelg236) or email (joelgallant236@gmail.com).
 *
 * "It should be noted that no ethically-trained software engineer would ever
 * consent to write a DestroyBaghdad procedure. Basic professional ethics would
 * instead require him to write a DestroyCity procedure, to which Baghdad could
 * be given as a parameter." - Nathaniel Borenstein
 *
 * Please write code properly, and have fun doing so!
 *
 * The license for the code is available in /license.txt
 */

/*----------------------------------------------------------------------------*/
/* Copyright for WPI libraries:                                               */
/*                                                                            */
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package edu.ATA.main;

import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * This class is the 'main' class of the robot code. This is where everything is
 * started by the DriverStation and WPIlibj code.
 *
 * <p> <b> The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory. (<i>/resources/META-INF/MANIFEST.MF</i> under "MIDlet-1")</b>
 */
public final class GamePeriods extends IterativeRobot {

    private static Robot robot = new Robot();

    public static void setRobot(Robot robot) {
        GamePeriods.robot = robot;
    }

    public void robotInit() {
        robot.robotInit();
    }

    public void disabledInit() {
        robot.disabledInit();
    }

    public void disabledPeriodic() {
        robot.disabledPeriodic();
    }

    public void autonomousInit() {
        robot.autonomousInit();
    }

    public void autonomousPeriodic() {
        robot.autonomousPeriodic();
    }

    public void teleopInit() {
        robot.teleopInit();
    }

    public void teleopPeriodic() {
        robot.teleopPeriodic();
    }

    public void testInit() {
        robot.testInit();
    }

    public void testPeriodic() {
        robot.testPeriodic();
    }
}
