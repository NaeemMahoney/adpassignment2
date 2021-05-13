package za.ac.cput;

public class ShoppingList {
    private String itemName;
    private int itemNum;

    public ShoppingList(int itemNum, String itemName) {
        this.itemNum = itemNum;
        this.itemName = itemName;
    }

    //Getter And Setter of itemName
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    //Getter and Setter for itemNum
    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }


    @Override
    public String toString() {
        return "ShoppingList{" +
                "itemName='" + itemName + '\'' +
                ", itemNum=" + itemNum +
                '}';
    }
}
