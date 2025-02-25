import java.util.ArrayList;

public class MyFarm {

    Plot[] row;

    public static void main(String[] args) {
        MyFarm garden = new MyFarm();
    }

    public MyFarm() {

        /***
         * array version
         */
        row = new Plot[10];
        for (int z = 0; z < 10; z++) {
            row[z] = new Plot();
        }



        /***
         * for each method you code, call it here
         */



    }

    public void totalPlants() {
        // how many total plants are there in the row?

    }

    public void printPlantNames() {
        // print the name of each plant in the row and its index

    }

    public void printRowInfo() {
        // use the printPlotInfo() method in Plot.java to print all information for each plot in the row

    }



    public void tomatoLocations() {
        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes


        // Note: this one needs a for loop, NOT a for each loop
    }

    public void totalCarrots() {
        // how many total carrot plants are there?

    }

    public void averageNumberOfPlants() {
        // what is the average number of plants per plot?

    }

    public void numberOfCarrotPlots() {
        // how many plots have carrots on them

    }

    public void numberOfEmptyPlots() {
        // how many plots are empty

    }

    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for even numbered indexes and false for odd numbered indexes
    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
    }

    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?
    }

    public void greaterThan10() {
        // how many plots have more than 10 plants in the plot?
    }

    public void plantWithMaxNumberNeedsWater(){
        // which plant type has the most total plants (not counting empty plots) that needs water?

    }

    /***
     * more challenging
     */
    public void greatestDifferenceNumberBetweenAnyPlants() {
        // of every pair of adjacent plots, which two have the greatest difference in plant numbers?
        // what is that difference?
    }

    public void numberOfCarrotPlotsNextToLettuce() {
        // how many carrot plots share a border with a lettuce plot?
    }

    /***
     * most challenging
     */
    public void greatestDifferenceOfPlantNumbers() {
        // what is the largest difference in plant numbers between two plants of the same type?
    }

}
