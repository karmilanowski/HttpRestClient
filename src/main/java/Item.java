import com.google.gson.annotations.SerializedName;


public class Item {

    @SerializedName("data")
    private Data mData;
    @SerializedName("type")
    private String mType;

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "mData=" + mData +
                ", mType='" + mType + '\'' +
                '}';
    }
}
