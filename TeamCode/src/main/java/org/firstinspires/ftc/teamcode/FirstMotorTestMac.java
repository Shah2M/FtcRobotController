package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "FirstMotorTestMac (Blocks to Java)")
public class FirstMotorTestMac extends LinearOpMode {

    private DcMotor motor1;

    /**
     * This sample contains the bare minimum Blocks for any regular OpMode. The 3 blue
     * Comment Blocks show where to place Initialization code (runs once, after touching the
     * DS INIT button, and before touching the DS Start arrow), Run code (runs once, after
     * touching Start), and Loop code (runs repeatedly while the OpMode is active, namely not
     * Stopped).
     */
    @Override
    public void runOpMode() {
        motor1 = hardwareMap.get(DcMotor.class, "motor1");

        waitForStart();
        motor1.setPower(0.7);
        sleep(2000);
        motor1.setPower(0);
    }
}