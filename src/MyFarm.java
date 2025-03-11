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

        totalPlants();
        split();

        printPlantNames();
        split();

        printRowInfo();
        split();

        tomatoLocations();
        split();

        totalCarrots();
        split();

        averageNumberOfPlants();
        split();

        numberOfCarrotPlots();
        split();

        numberOfEmptyPlots();
        split();

        everyOtherNeedsWater();

        plantWithMaxNumber();
        split();

        plantWithMinNumber();
        split();

        greaterThan10();
        split();

        plantWithMaxNumberNeedsWater();
        split();

        greatestDifferenceNumberBetweenAdjacentPlots();
        split();

        numberOfCarrotPlotsNextToLettuce();
        split();

        greatestDifferenceOfPlantNumbers();

        /***
         * for each method you code, call it here
         */



    }

    public void totalPlants() {
        int plantCounter =0;
        for(Plot p: row){
            plantCounter+=p.numberOfPlants;
        }
        System.out.println("There are "+plantCounter+" plants in the row.");
        // how many total plants are there in the row?

    }

    public void printPlantNames() {
        for(int x = 0;x<row.length;x++){
            System.out.println("Index "+x+": "+row[x].plantName);
        }
        // print the name of each plant in the row and its index

    }

    public void printRowInfo() {
        for(Plot p: row){
            p.printPlotInfo();
        }
        // use the printPlotInfo() method in Plot.java to print all information for each plot in the row

    }



    public void tomatoLocations() {
        for(int x = 0;x<row.length;x++){
            if(row[x].plantName.equals("tomato")){
                System.out.println("There are tomatoes at index "+x);
            }
        }

        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes


        // Note: this one needs a for loop, NOT a for each loop
    }

    public void totalCarrots() {
        int carrotCounter = 0;
        for(Plot p:row){
            if(p.plantName.equals("carrot")){
                carrotCounter+=p.numberOfPlants;
            }
        }
        System.out.println("There are "+carrotCounter+" carrot plants.");
        // how many total carrot plants are there?

    }

    public void averageNumberOfPlants() {
        int plantCounter =0;
        for(Plot p: row){
            plantCounter+=p.numberOfPlants;
        }
        System.out.println("On average, there are "+plantCounter/row.length+" plants in each plot.");
        // what is the average number of plants per plot?

    }

    public void numberOfCarrotPlots() {
        int carrotPlotCounter = 0;
        for(Plot p:row){
            if(p.plantName.equals("carrot")){
                carrotPlotCounter++;
            }
        }
        System.out.println("There are "+carrotPlotCounter+" plots of carrots.");
        // how many plots have carrots on them

    }

    public void numberOfEmptyPlots() {
        int emptyPlotCounter = 0;
        for(Plot p:row){
            if(p.plantName.equals("carrot")){
                emptyPlotCounter++;
            }
        }
        System.out.println("There are "+emptyPlotCounter+" empty plots.");
        // how many plots are empty

    }

    public void everyOtherNeedsWater(){
        for(int x=0;x<row.length;x++){
            if(x%2==0){
                row[x].needsWater = true;
            } else{
                row[x].needsWater = false;
            }
        }
        // change the value of needsWater to be true for even numbered indexes and false for odd numbered indexes
    }

    public void plantWithMaxNumber() {
        int carrotCount = countOfPlant("carrot");
        int tulipCount = countOfPlant("tulip");
        int lettuceCount = countOfPlant("lettuce");
        int tomatoCount = countOfPlant("tomato");
        int max = Math.max(Math.max(carrotCount,tulipCount),Math.max(lettuceCount,tomatoCount));
        if(max==carrotCount){
            System.out.println("There are more carrots than any other plant.");
        }
        if(max==tulipCount){
            System.out.println("There are more tulips than any other plant.");
        }
        if (max==lettuceCount){
            System.out.println("There are more lettuces than any other plant.");
        }
        if(max==tomatoCount){
            System.out.println("There are more tomatoes than any other plant.");
        }
        // which plant type has the most total plants?
    }

    public void plantWithMinNumber() {
        int carrotCount = countOfPlant("carrot");
        int tulipCount = countOfPlant("tulip");
        int lettuceCount = countOfPlant("lettuce");
        int tomatoCount = countOfPlant("tomato");
        int min = Math.min(Math.min(carrotCount,tulipCount),Math.min(lettuceCount,tomatoCount));
        if(min==carrotCount){
            System.out.println("There are fewer carrots than any other plant.");
        }
        if(min==tulipCount){
            System.out.println("There are fewer tulips than any other plant.");
        }
        if (min==lettuceCount){
            System.out.println("There are fewer lettuces than any other plant.");
        }
        if(min==tomatoCount){
            System.out.println("There are fewer tomatoes than any other plant.");
        }
        // which plant type has the least total plants (not counting empty plots)?
    }

    public void greaterThan10() {
        int counter = 0;
        for(Plot p:row){
            if(p.numberOfPlants>10){
                counter++;
            }
        }
        System.out.println("There are "+ counter+" plots with more than ten plants.");
        // how many plots have more than 10 plants in the plot?
    }

    public void plantWithMaxNumberNeedsWater(){
        int carrotCount = countOfPlantNeedingWater("carrot");
        int tulipCount = countOfPlantNeedingWater("tulip");
        int lettuceCount = countOfPlantNeedingWater("lettuce");
        int tomatoCount = countOfPlantNeedingWater("tomato");
        int max = Math.max(Math.max(carrotCount,tulipCount),Math.max(lettuceCount,tomatoCount));
        if(max==carrotCount){
            System.out.println("There are more carrots needing water than any other plant.");
        }
        if(max==tulipCount){
            System.out.println("There are more tulips needing water than any other plant.");
        }
        if (max==lettuceCount){
            System.out.println("There are more lettuces needing water than any other plant.");
        }
        if(max==tomatoCount){
            System.out.println("There are more tomatoes needing water than any other plant.");
        }

        // which plant type has the most total plants (not counting empty plots) that needs water?

    }

    /***
     * more challenging
     */
    public void greatestDifferenceNumberBetweenAdjacentPlots() {
        int[] differences = new int[row.length-1];
        for(int x =0;x<differences.length;x++){
            differences[x] = Math.abs(row[x+1].numberOfPlants-row[x].numberOfPlants);
        }
        int maxDifference = 0;
        for(int i: differences){
            if (i>maxDifference){
                maxDifference = i;
            }
        }
        for(int x=0; x<differences.length; x++){
            if (differences[x]==maxDifference){
                System.out.println("The greatest difference in plant count between two adjacent plots is between plot "+x+" and plot "+(x+1));
                System.out.println("Their difference is "+maxDifference);
                break;
            }
        }
        // of every pair of adjacent plots, which two have the greatest difference in plant numbers?
        // what is that difference?
    }

    public void numberOfCarrotPlotsNextToLettuce() {
        int counter = 0;
        for(int x =0;x<row.length;x++){
            if(row[x].plantName.equals("carrot")){
                if(x!=0&&x!=row.length-1) {
                    if (row[x + 1].plantName.equals("lettuce")||row[x-1].plantName.equals("lettuce")){
                        counter++;;
                    }
                } else if (x==0){
                    if(row[1].plantName.equals("lettuce")){
                        counter ++;
                    }
                } else {
                    if(row[x-1].plantName.equals("lettuce")){
                        counter ++;
                    }
                }
            }
        }
        System.out.println("There are "+counter+" carrot plot(s) that share a border with a lettuce plot.");
        // how many carrot plots share a border with a lettuce plot?
    }

    /***
     * most challenging
     */
    public void greatestDifferenceOfPlantNumbers() {
        ArrayList<Plot> carrots = new ArrayList<>();
        ArrayList<Plot> tulips = new ArrayList<>();
        ArrayList<Plot> lettuce = new ArrayList<>();
        ArrayList<Plot> tomatoes = new ArrayList<>();

        for(Plot p: row){
            if(p.plantName.equals("carrot")){
                carrots.add(p);
            } else if(p.plantName.equals("tulip")){
                tulips.add(p);
            } else if(p.plantName.equals("lettuce")){
                lettuce.add(p);
            } else if(p.plantName.equals("tomato")){
                tomatoes.add(p);
            }
        }
        int[] differences = new int[4];
        differences[0] = greatestDifference(carrots);
        differences[1] = greatestDifference(tulips);
        differences[2] = greatestDifference(lettuce);
        differences[3] = greatestDifference(tomatoes);
        System.out.println("The largest difference in plant numbers between two plants of the same type is "+max(differences));


        // what is the largest difference in plant numbers between two plants of the same type?
    }

    void split(){
        System.out.println();
        System.out.println();
    }

    int countOfPlant(String type){
        int counter = 0;
        for(Plot p:row){
            if(p.plantName.equals(type)){
                counter+=p.numberOfPlants;
            }
        }
        return counter;
    }
    int countOfPlantNeedingWater(String type){
        int counter = 0;
        for(Plot p:row){
            if(p.plantName.equals(type)&&p.needsWater){
                counter+=p.numberOfPlants;
            }
        }
        return counter;
    }
    int greatestDifference(ArrayList<Plot> input){
        int min = input.get(0).numberOfPlants;
        int max = 0;
        for(Plot p:input){
            if(p.numberOfPlants<min){
                min = p.numberOfPlants;
            }
            if(p.numberOfPlants>max){
                max=p.numberOfPlants;
            }
        }
        return max-min;
    }
    int max(int[] array){
        int max = 0;
        for(int i:array){
            if(i>max){
                max=i;
            }
        }
        return max;
    }

}
