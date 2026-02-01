package com.lambdaExceptions.smarthomelightingautomation;

public class SmartHome {
                       
	public static void main(String[] args) {

        SmartLightController controller = new SmartLightController();
        LightAction motionDetected = () ->
                System.out.println("Motion detected → Lights ON at 100% brightness");
        LightAction nightMode = () ->
                System.out.println("Night time → Lights ON at 30% warm light");
        LightAction voiceCommand = () ->
                System.out.println("Voice command → Lights set to BLUE mood lighting");
        controller.executeAction(motionDetected);
        controller.executeAction(nightMode);
        controller.executeAction(voiceCommand);
  }
}