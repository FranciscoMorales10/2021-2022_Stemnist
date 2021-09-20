package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Mort (Blocks to Java)", group = "")
public class Mort extends LinearOpMode {

  private DcMotor frontright;
  private DcMotor frontleft;
  private DcMotor backright;
  private DcMotor backleft;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    double targetPower2;

    frontright = hardwareMap.dcMotor.get("front right");
    frontleft = hardwareMap.dcMotor.get("front left");
    backright = hardwareMap.dcMotor.get("back right");
    backleft = hardwareMap.dcMotor.get("back left");

    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        // forward and backwards
        targetPower2 = -gamepad1.left_stick_y;
        frontright.setPower(targetPower2);
        targetPower2 = gamepad1.left_stick_y;
        frontleft.setPower(targetPower2);
        targetPower2 = -gamepad1.left_stick_y;
        backright.setPower(targetPower2);
        targetPower2 = gamepad1.left_stick_y;
        backleft.setPower(targetPower2);
        telemetry.update();
        // left and right
        targetPower2 = -gamepad1.left_stick_x;
        frontright.setPower(targetPower2);
        targetPower2 = -gamepad1.left_stick_x;
        frontleft.setPower(targetPower2);
        targetPower2 = -gamepad1.left_stick_x;
        backright.setPower(targetPower2);
        targetPower2 = -gamepad1.left_stick_x;
        backleft.setPower(targetPower2);
        telemetry.update();
        // turning
        targetPower2 = -gamepad1.right_stick_x;
        frontright.setPower(targetPower2);
        targetPower2 = -gamepad1.right_stick_x;
        frontleft.setPower(targetPower2);
        targetPower2 = gamepad1.right_stick_x;
        backright.setPower(targetPower2);
        targetPower2 = gamepad1.right_stick_x;
        backleft.setPower(targetPower2);
        // Put initialization blocks here.
      }
    }
  }
}
