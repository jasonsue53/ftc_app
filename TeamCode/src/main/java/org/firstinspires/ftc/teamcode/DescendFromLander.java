package org.firstinspires.ftc.teamcode;

/**
 *  This is from the position closest to the team depot.
 */
public abstract class DescendFromLander extends StandardChassis {

    private boolean madeTheRun = false;

    protected DescendFromLander(ChassisConfig config) {
        super(config);
    }

    /**
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        initMotors();
        initArm();
        initGyroscope();
        initTimeouts();
    }

    /**
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop () {
    }

    /**
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start () {
        // Reset the game timer.
        runtime.reset();
    }

    /**
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop () {
    }

    /**
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop () {

        if (madeTheRun == false) {

            descendFromLander();

           /* encoderDrive(42, 42);

            dropFlag();
            sleep(3000);
            angleHand = 0.75;
            flagHolder.setPosition(angleHand);

            turnRight(118);
            encoderDrive(90, 90);*/

            madeTheRun = true;
        }

        // Show the elapsed game time and wheel power.
        telemetry.addData("Status", "time: " + runtime.toString());
        telemetry.addData("Status", "madeTheRun=%b", madeTheRun);
    }
}