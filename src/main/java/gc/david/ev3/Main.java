package gc.david.ev3;

import lejos.hardware.BrickFinder;
import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.lcd.Font;
import lejos.hardware.lcd.GraphicsLCD;
import lejos.utility.Delay;

import static gc.david.ev3.LEDPatterns.*;

public class Main {

    public static void main(String[] args) {
        GraphicsLCD graphicsLCD = BrickFinder.getDefault().getGraphicsLCD();
        final int SW = graphicsLCD.getWidth();
        final int SH = graphicsLCD.getHeight();

        Button.LEDPattern(NORMAL_BLINKING_LIGHT_GREEN);
        Sound.beepSequenceUp();
        graphicsLCD.setFont(Font.getDefaultFont());
        graphicsLCD.drawString("Hello World Lejos EV3", SW / 2, SH / 2, GraphicsLCD.BASELINE | GraphicsLCD.HCENTER);

        Button.LEDPattern(STATIC_LIGHT_YELLOW);
        Delay.msDelay(4000);

        Button.LEDPattern(NORMAL_BLINKING_LIGHT_RED);
        graphicsLCD.clear();
        graphicsLCD.refresh();
        Sound.beepSequence();
        Delay.msDelay(500);

        Button.LEDPattern(OFF_BUTTON_LIGHTS);
    }
}
