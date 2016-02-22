package dcll.lleq;

/**
 * Created by 21003765 on 17/02/2016.
 */
public class Item {
    public String s;

    public Item(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "dcll.lleq.Item{" +
                "s='" + s + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (s != null ? !s.equals(item.s) : item.s != null) return false;

        return true;
    }

    /**
     * modification du hashcode
     * pour l'issue 2
     *
     * @return
     */
    @Override
    public int hashCode() {
        return s != null ? s.hashCode() : 0;
    }
}
