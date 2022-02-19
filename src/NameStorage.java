import java.util.ArrayList;

public class NameStorage {
    private ArrayList<String> namesArray = new ArrayList<String>();
    private String nameValue;

    public void addToList(String nameValue) {// change reference to value
        this.nameValue = nameValue;
        namesArray.add(this.nameValue);
    }

    public void displayArray() {
        System.out.println(namesArray);
    }

    public String nameValue() {
        return nameValue;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }

    public ArrayList<String> getNamesArray() {
        ArrayList<String> copyArray = new ArrayList<>(this.namesArray);
        return copyArray;
    }

    public void setNamesArray(ArrayList<String> namesArray) {
        this.namesArray = new ArrayList<>(namesArray);
    }
}
