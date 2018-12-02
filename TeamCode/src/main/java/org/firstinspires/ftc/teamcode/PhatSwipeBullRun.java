package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="PhatSwipeBullRun", group="PhatSwipe")
public class PhatSwipeBullRun extends BullRun {
    public PhatSwipeBullRun() {
        super(ChassisConfig.forPhatSwipe());
    }
}