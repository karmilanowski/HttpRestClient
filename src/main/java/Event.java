import com.google.gson.annotations.SerializedName;



public class Event {

    @SerializedName("action")
    private Action mAction;
    @SerializedName("trigger")
    private Trigger mTrigger;

    public Action getAction() {
        return mAction;
    }

    public void setAction(Action action) {
        mAction = action;
    }

    public Trigger getTrigger() {
        return mTrigger;
    }

    public void setTrigger(Trigger trigger) {
        mTrigger = trigger;
    }

    @Override
    public String toString() {
        return "Event{" +
                "mAction=" + mAction +
                ", mTrigger=" + mTrigger +
                '}';
    }
}
