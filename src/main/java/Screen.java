import java.util.List;
import com.google.gson.annotations.SerializedName;


public class Screen {

    @SerializedName("data")
    private Data mData;
    @SerializedName("defaultLoaderCommsPeriod")
    private Long mDefaultLoaderCommsPeriod;
    @SerializedName("defaultPlayerCommsPeriod")
    private Long mDefaultPlayerCommsPeriod;
    @SerializedName("events")
    private List<Event> mEvents;
    @SerializedName("id")
    private String mId;
    @SerializedName("sequenceId")
    private String mSequenceId;
    @SerializedName("timeLoaded")
    private Long mTimeLoaded;
    @SerializedName("type")
    private String mType;

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
    }

    public Long getDefaultLoaderCommsPeriod() {
        return mDefaultLoaderCommsPeriod;
    }

    public void setDefaultLoaderCommsPeriod(Long defaultLoaderCommsPeriod) {
        mDefaultLoaderCommsPeriod = defaultLoaderCommsPeriod;
    }

    public Long getDefaultPlayerCommsPeriod() {
        return mDefaultPlayerCommsPeriod;
    }

    public void setDefaultPlayerCommsPeriod(Long defaultPlayerCommsPeriod) {
        mDefaultPlayerCommsPeriod = defaultPlayerCommsPeriod;
    }

    public List<Event> getEvents() {
        return mEvents;
    }

    public void setEvents(List<Event> events) {
        mEvents = events;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getSequenceId() {
        return mSequenceId;
    }

    public void setSequenceId(String sequenceId) {
        mSequenceId = sequenceId;
    }

    public Long getTimeLoaded() {
        return mTimeLoaded;
    }

    public void setTimeLoaded(Long timeLoaded) {
        mTimeLoaded = timeLoaded;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "mData=" + mData +
                ", mDefaultLoaderCommsPeriod=" + mDefaultLoaderCommsPeriod +
                ", mDefaultPlayerCommsPeriod=" + mDefaultPlayerCommsPeriod +
                ", mEvents=" + mEvents +
                ", mId='" + mId + '\'' +
                ", mSequenceId='" + mSequenceId + '\'' +
                ", mTimeLoaded=" + mTimeLoaded +
                ", mType='" + mType + '\'' +
                '}';
    }
}
