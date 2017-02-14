package logs;


import mail.MailSender;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

public class CustomMailAppender extends AppenderSkeleton{


    @Override
    protected void append(LoggingEvent loggingEvent) {
        MailSender.send("Сообщение " + loggingEvent.getLevel().toString());
        System.out.println("Сообщение " + loggingEvent.getLevel().toString());
    }

    @Override
    public void close() {

    }

    @Override
    public boolean requiresLayout() {
        return false;
    }
}
