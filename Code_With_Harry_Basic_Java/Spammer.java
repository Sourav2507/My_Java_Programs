package Code_With_Harry_Basic_Java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Spammer {

    public static void main(String[] args) throws AWTException, InterruptedException {
        int x = 1;

        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text:");
        String Text = scanner.nextLine();

        System.out.println("Enter how many Messages you want to spam : ");
        int n = scanner.nextInt();

        StringSelection stringSelection = new StringSelection(Text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        System.out.println("The spamming will start in 5 seconds");
        Thread.sleep(5000);

        while(x <= n) {

            Thread.sleep(1000);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            x++;

        }

    }

}

