package logs;




import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.LoggingEvent;

public class CustomLogLayout extends PatternLayout {

    @Override
    public String format(LoggingEvent event) {

        return event.getMessage().toString();
    }
}
