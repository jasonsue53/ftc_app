package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="MallahMarkerRun", group="MonsieurMallah")
public class MallahMarkerRun extends TeamMarkerRun {
    public MallahMarkerRun() {
        super(ChassisConfig.forMonsieurMallah());
    }
}