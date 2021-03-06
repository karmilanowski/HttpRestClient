import com.google.gson.annotations.SerializedName;


public class Action {

    @SerializedName("data")
    private Data mData;
    @SerializedName("item")
    private Item mItem;
    @SerializedName("type")
    private String mType;

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
    }

    public Item getItem() {
        return mItem;
    }

    public void setItem(Item item) {
        mItem = item;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    @Override
    public String toString() {
        return "Action{" +
                "mData=" + mData +
                ", mItem=" + mItem +
                ", mType='" + mType + '\'' +
                '}';
    }
}
