package edu.ATA.commands;

import edu.ATA.bindings.CommandBind;
import edu.ATA.command.Command;
import edu.ATA.module.target.BangBangModule;

/**
 * This is the command class for the {@link BangBangModule} to set the setpoint
 *
 *
 * @author Joel Gallant <joelgallant236@gmail.com>
 */
public class BangBangCommand implements Command, CommandBind {

    private final BangBangModule bangBangModule;
    private final double setpoint;

    /**
     * This command sets the setpoint for the bangBangModule in it's parameters.
     *
     * @param bangBangModule The bang bang module used
     * @param setpoint the setpoint for the bang bang module
     */
    public BangBangCommand(BangBangModule bangBangModule, double setpoint) {
        this.bangBangModule = bangBangModule;
        this.setpoint = setpoint;
    }

    public void run() {
        bangBangModule.setSetpoint(setpoint);
    }
}