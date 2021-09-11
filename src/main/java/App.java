import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

public class App {

    private static Date date = new Date();
    private static LocalDateTime localDateTimeLastPlayerCommons;
    private static LocalDateTime localDateTimeNow = LocalDateTime.now();

    public static void main(String[] args) {

        Screen[] screensList = HttpAPIClient.jsonToPojoConvert(
                HttpAPIClient.sendRequest("https://central.stacks.pl/rest-api/v1/screens","login","pass"),Screen[].class);

        int count =0;
        for (Screen screen : screensList) {
            if(screen.getData().getRebootTime()!=null && screen.getData().getSerialNumber().contains("SXP"))
                count++;
        }
        System.out.println(count);
//        int count = 0;
//        for (Screen screen : screensList) {
//            if (screen.getData().getLastLoaderCommsMillis() != null) {
//                Long playerTime = Long.valueOf(screen.getData().getLastLoaderCommsMillis());
//                localDateTimeLastPlayerCommons = LocalDateTime.ofInstant(Instant.ofEpochMilli(playerTime), ZoneId.systemDefault());
//                long minutes = localDateTimeLastPlayerCommons.until( localDateTimeNow, ChronoUnit.MINUTES );
//                if (minutes < 15) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);



    }
}
