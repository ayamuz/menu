
package org.launchcode.java.MenuFood;

public class MenuItem {
// Class variables
    public class MenuItems {
        //class variables
        private String name;
        private Double price;
        private String description;
        private String category;
        private Boolean isNew;


        //constructor
        public void MenuItem(String name, Double price, String description){
            this.name = name;
            this.price = price;
            this.description = description;

            this.category = "Not Categorized";
            this.isNew = false;
        }

        public void MenuItem(String name, Double price, String description, String category, Boolean isNew){
            this.name = name;
            this.price = price;
            this.description = description;
            this.category = category;
            this.isNew = isNew;
        }

        //getters and setters (METHODS)
        public String getName(){
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice(){
            return this.price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
        public String getDescription(){
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
        public String getCategory(){
            return this.category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
        public boolean getIsNew(){
            return this.isNew;
        }

        public void setNewItem(Boolean isNew) {
            this.isNew = isNew;
        }
    }

}