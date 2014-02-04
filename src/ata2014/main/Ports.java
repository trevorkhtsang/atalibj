package ata2014.main;

/**
 *
 * @author Joel Gallant <joelgallant236@gmail.com>
 */
public interface Ports {

//
// *****     DEFAULTS     *****
//
//     Speed Controllers:
    //   Front Left Drive - 1
    //   Front Right Drive - 2
    //   Back Left Drive - 3
    //   Back Right Drive - 4
    //   Left Loader - 5
    //   Right Loader - 6
    //   Winch Motor - 7
//     Solenoids:
    //   Left Loader (in) - 1
    //   Left Loader (out) - 2
    //   Right Loader (in) - 3
    //   Right Loader (out) - 4
    //   Shifter (in) - 5
    //   Shifter (out) - 6
    //   Winch Release - 7
//     Digital Input:
    //   Left Encoder: 1, 2
    //   Right Encoder: 3, 4
    //   Left Loader Switch: 5
    //   Right Loader Switch: 6
//     Analog Input:
    //   Shooter Potentiometer: 1
//
//
//
    // Drivetrain
    int FRONT_LEFT_DRIVE = Preferences.getInstance().getInt("FRONT_LEFT_DRIVE", 1),
            FRONT_RIGHT_DRIVE = Preferences.getInstance().getInt("FRONT_RIGHT_DRIVE", 2),
            BACK_LEFT_DRIVE = Preferences.getInstance().getInt("BACK_LEFT_DRIVE", 3),
            BACK_RIGHT_DRIVE = Preferences.getInstance().getInt("BACK_RIGHT_DRIVE", 4);
    int SHIFTER_IN = Preferences.getInstance().getInt("SHIFTER_IN", 5),
            SHIFTER_OUT = Preferences.getInstance().getInt("SHIFTER_OUT", 6);
    int LEFT_ENCODER_A = Preferences.getInstance().getInt("LEFT_ENCODER_A", 1),
            LEFT_ENCODER_B = Preferences.getInstance().getInt("LEFT_ENCODER_B", 2),
            RIGHT_ENCODER_A = Preferences.getInstance().getInt("RIGHT_ENCODER_A", 3),
            RIGHT_ENCODER_B = Preferences.getInstance().getInt("RIGHT_ENCODER_B", 4);

    // Loader
    int LEFT_LOADER_SENSOR = Preferences.getInstance().getInt("LEFT_LOADER_SENSOR", 5),
            RIGHT_LOADER_SENSOR = Preferences.getInstance().getInt("RIGHT_LOADER_SENSOR", 6);
    int LEFT_LOADER_MOTOR = Preferences.getInstance().getInt("LEFT_LOADER_MOTOR", 5),
            RIGHT_LOADER_MOTOR = Preferences.getInstance().getInt("RIGHT_LOADER_MOTOR", 6);
    int LEFT_LOADER_PISTON_IN = Preferences.getInstance().getInt("LEFT_LOADER_PISTON_IN", 1),
            LEFT_LOADER_PISTON_OUT = Preferences.getInstance().getInt("LEFT_LOADER_PISTON_OUT", 2),
            RIGHT_LOADER_PISTON_IN = Preferences.getInstance().getInt("RIGHT_LOADER_PISTON_IN", 3),
            RIGHT_LOADER_PISTON_OUT = Preferences.getInstance().getInt("RIGHT_LOADER_PISTON_OUT", 4);

    // Winch
    int SHOOTER_POSITION = Preferences.getInstance().getInt("SHOOTER_POSITION", 1);
    int WINCH_MOTOR = Preferences.getInstance().getInt("WINCH_MOTOR", 7);
    int WINCH_RELEASE = Preferences.getInstance().getInt("WINCH_RELEASE", 7);
}
