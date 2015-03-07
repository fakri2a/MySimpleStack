package dcll.fele.MySimpleStackk;

/**
 * Created by Fakri on 07/03/2015.
 */
public class Item {
    private Object value;

    Item(Object value)
    {
        setValue(value);
    }

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object value)
    {
        this.value=value;
    }
}
