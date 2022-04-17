package innerClass02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.Timer;

public class TalkingClock
{
    private int interval;
    private boolean beep;

    //构造一个 talking clock
    public TalkingClock(int interval, boolean beep)
    {
        this.interval = interval;
        this.beep = beep;
    }

    //开始计时
    public void start()
    {
        TimePrinter listener = new TimePrinter();
        //Timer timer = new Timer(interval, listener);
        //timer.start();
    }

    public class TimePrinter implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("现在时刻：" + Instant.ofEpochMilli(event.getWhen()));
            if (beep)
                Toolkit.getDefaultToolkit().beep();
        }
    }
}
