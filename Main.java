package com.company;
import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        System.out.println("CodilityExamQ1: ");
        System.out.println(CodilityExamQ1("09:42", "11:39"));

        System.out.println("Binary Gap: ");
        System.out.println(BinaryGap(1041));

        System.out.println("Odd Occurrences in Array");
        int[] oddOccurrencesArr = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(OddOccurencesInArray(oddOccurrencesArr));

        System.out.println("Cyclic Rotation: ");
        int CyclicRotationArr[] = {3, 8, 9, 7, 6};
        PrintArray(CyclicRotation(CyclicRotationArr, 3));

        System.out.println("PermMissingElem");
        int permMissingElemArr[] = {2, 3, 4, 5, 6};
        System.out.println(PermMissingElem(permMissingElemArr));

        System.out.println("FrogJmp:");
        int x, d, y;
        x = 10;
        d = 30;
        y = 85;
        System.out.println(FrogJmp(x, y, d));

        System.out.println("PermCheck:");
        int permCheckArr[] = {4, 1, 3, 2};
        System.out.println(PermCheck(permCheckArr));

        System.out.println("FrogRiverOne:");
        int frogRiverOneArr[] = {1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(FrogRiverOne(5, frogRiverOneArr, frogRiverOneArr.length));

        System.out.println("MissingInteger:");
        int missingIntegerArr[] = {1, 3, 6, 4, 1, 2};
        System.out.println(MissingInteger(missingIntegerArr));

        System.out.println("Max Counters: ");
        int maxCountersArr[] = {3, 4, 4, 6, 1, 4, 4};
        PrintArray(MaxCounters(5, maxCountersArr));

        System.out.println("CountDiv:");
        System.out.println(CountDiv(6, 11, 2));

        System.out.println("Passing Cars:");
        int passingCarsArr[] = {0, 1, 0, 1, 1};
        System.out.println(PassingCars(passingCarsArr, passingCarsArr.length));

        System.out.println("MinAvgTwoSlice: ");
        int MinAvgTwoSliceArr[] = {4, 2, 2, 5, 1, 5, 8};
        System.out.println(MinAvgTwoSlice(MinAvgTwoSliceArr));

        System.out.println("Distinct: ");
        int distinctArr[] = {2, 1, 1, 2, 3, 1};
        System.out.println(Distinct(distinctArr));

        System.out.println("Triangle: ");
        int TriangleArr[] = {10, 2, 5, 1, 8, 20};
        //int TriangleArr[] = {10,50,5,1};
        System.out.println(Triangle(TriangleArr, TriangleArr.length));

        System.out.println("MaxProductOfThree:");
        int maxProductOfThreeArr[] = {-3, 1, 2, -2, 5, 6};
        //int MaxProductOfThreeArr[] = {-5, -5, 4, 5};
        System.out.println(MaxProductOfThree(maxProductOfThreeArr, maxProductOfThreeArr.length));

        System.out.println("Stone Wall");
        int stoneWallArr[] = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        System.out.println(StoneWall(stoneWallArr, stoneWallArr.length));

        System.out.println("Dijkstra Example");
        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        dijkstra(graph, 0);

        System.out.println("\n\nBreadth First Traversal");
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        g.BFS(2);


        System.out.println("\nBubble Sort");
        int bubbleSortArr[] = {5, 4, 3, 2, 1};
        BubbleSort(bubbleSortArr);
        PrintArray(bubbleSortArr);


        System.out.println("\nRectangular Overlapping Plots");
        Point2D l1 = new Point2D(1, 1), r1 = new Point2D(3, 3);
        Point2D l2 = new Point2D(4, 4), r2 = new Point2D(5, 5);
        System.out.println("Rectangle A: (" + (int) l1.getX() + ", " + (int) l1.getY() + "), (" + (int) r1.getX() + ", " + (int) r1.getY() + ")");
        System.out.println("Rectangle B: (" + (int) l2.getX() + ", " + (int) l2.getY() + "), (" + (int) r2.getX() + ", " + (int) r2.getY() + ")");

        Rectangle2D rectA = new Rectangle2D(l1.getX(), l1.getY(), r1.getX() - l1.getY(), r1.getY() - l1.getY());
        Rectangle2D rectB = new Rectangle2D(l2.getX(), l2.getY(), r2.getX() - l2.getX(), r2.getY() - l2.getY());

        // 1st solution using Java Rectangle2D objects.
        // https://docs.oracle.com/javase/8/docs/api/java/awt/Rectangle.html
        // Does all the math for you.  Very clean.
        if (rectA.contains(rectB) || rectA.intersects(rectB)) {
            System.out.println("\nRectangles Overlap");
        } else {
            System.out.println("\nRectangles Don't Overlap");
        }

        // 2nd solution using the cartesian coordinates.
        if (NoOverlap(l1, r1, l2, r2))
            System.out.println("\nRectangles Don't Overlap");
        else
            System.out.println("\nRectangles Overlap");


        System.out.println("\nIs Full Binary Tree?");
        BTNode treeRoot = new BTNode();
        treeRoot.left = new BTNode();
        treeRoot.right = new BTNode();
        treeRoot.left.right = new BTNode();
        treeRoot.left.left = new BTNode();
        treeRoot.right.left = new BTNode();
        treeRoot.left.left.left = new BTNode();
        treeRoot.right.right = new BTNode();
        treeRoot.left.left.right = new BTNode();
        treeRoot.left.right.left = new BTNode();
        treeRoot.left.right.right = new BTNode();
        treeRoot.right.left.left = new BTNode();
        treeRoot.right.left.right = new BTNode();
        treeRoot.right.right.left = new BTNode();
        treeRoot.right.right.right = new BTNode();

        if (IsFullBinaryTree(treeRoot))
            System.out.print("The binary tree is full");
        else
            System.out.print("The binary tree is not full\n\n\n");



        /*int val[] = {10, 40, 30, 50};
        int wt[] = {5, 4, 6, 3};
        int W = 10;
        System.out.println("\n\n\n" + KnapSackDynamic(val, wt, W));*/




        try {
            System.out.println("\n\nPlease enter the Running Id, Width, and Weight separated by spaces.  Then press Enter.  If you are done, press Enter without inputting any thing.");
            ArrayList<Item> itemsList = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            while (scan.hasNextLine()) {
                // read input from stdin
                String string = scan.nextLine();
                if (string.isEmpty())
                    break;
                Item i = new Item(string);
                itemsList.add(i);
                System.out.println("Received...  Please input another entry or press Enter to finish.");
            }
            System.out.println("Input finished.");

            // solve code

            // Rules:
            // Width: Items must be aligned side by side.  Up to 1100mm of space allowed per module.
            // Weight: Items must be less than or equal to 1000 kg per module.
            // First fill A, then B, then C

            // new idea: sort by width, then height
            //Collections.sort(itemsList, new ItemComparator());

            Collections.sort(itemsList, new Comparator<Item>() {
                @Override
                public int compare(Item o1, Item o2) {
                    int comp1 = Integer.compare(o1.GetWidth(), o2.GetWidth());
                    if(comp1 == 1) {
                        return -1;
                    } else if(comp1 == -1) {
                        return 1;
                    }
                    else {
                        int weightComp = Integer.compare(o1.GetWeight(), o2.GetWeight());
                        if(weightComp == 1)
                            return -1;
                        else if(weightComp == -1)
                            return 1;
                        return weightComp;
                    }
                }
            });

            for (int i = 0; i < itemsList.size(); i++) {
                System.out.println("Running Id: " + itemsList.get(i).runningId
                        + " ,Width: " + itemsList.get(i).width + " , Weight: " + itemsList.get(i).weight);
            }


            // sort by width, height, and running Id
            //Collections.sort(itemsList, new ItemComparator());
            // now try to place them into modules starting with A, then B, then C
            //int index = 0;
            ArrayList<Item> aGroup = new ArrayList<>();
            ArrayList<Item> bGroup = new ArrayList<>();
            ArrayList<Item> cGroup = new ArrayList<>();

            int widthSum = 0;
            int weightSum = 0;
            boolean aGroupFinish = false;
            boolean bGroupFinish = false;
            boolean cGroupFinish = false;

            // Try something new: Use a greedy approach.
            // Objective: Get as many items onto a module and under the width and weight requirements

            //Knapsack(1000, 1100, itemsList, itemsList.size());

            /*int numItemsGrouped = 0;
            int widthSum2 = 0;
            int weightSum2 = 0;
            for(int i = 0; i < itemsList.size(); i++) {
                if(i == 0 && itemsList.get(0).GetWidth() < 1100 && itemsList.get(0).GetWeight() < 1000) {
                    widthSum2 += itemsList.get(0).GetWidth();
                    weightSum2 += itemsList.get(0).GetWeight();
                    numItemsGrouped++;
                } else {
                    if(widthSum2 + itemsList.get(i).GetWidth() > 1100 || weightSum2 + itemsList.get(i).GetWeight() > 1000)
                    {
                        System.out.println("Width: " + widthSum2 + " Weight: " + weightSum2 + " Num Items: " + numItemsGrouped);
                        widthSum2 = 0;
                        weightSum2 = 0;
                        numItemsGrouped = 0;
                        i--;
                    }
                    else {
                        widthSum2 += itemsList.get(i).GetWidth();
                        weightSum2 += itemsList.get(i).GetWeight();
                        numItemsGrouped++;
                    }
                }
            }*/


            // try a O(N)^2 method to find the maximum sum of width and weight...

            //System.out.println("\n\n Max Sub Array: " + maxSubArraySum(itemsList));
            //System.out.println("\n\n\n\n Max under limit" + MaxUnderLimit(itemsList, itemsList.size()));
            //System.out.println("\n\n Max Sum2 " + maximumSum(itemsList, 1100));

            /*int maxSum = 0;
            int potentialSum;
            int lastAddition = 0;
            Stack<Item> includedRunningIds = new Stack<>();
            Stack<Item> tempRunningIds = new Stack<>();
            for(int i = 0; i < itemsList.size(); i++) {
                potentialSum = itemsList.get(i).GetWidth();
                tempRunningIds.add(itemsList.get(i));
                for(int j = 0; j < itemsList.size(); j++) {
                    if(i != j) {
                        if(potentialSum + itemsList.get(j).GetWidth() <= 1100) {
                            potentialSum += itemsList.get(j).GetWidth();
                            lastAddition = itemsList.get(j).GetWidth();
                            tempRunningIds.add(itemsList.get(j));
                        } else {
                            if(lastAddition != 0) {
                                potentialSum -= lastAddition;
                                tempRunningIds.pop();
                            }
                        }
                    }
                }
                if(potentialSum > maxSum) {
                    includedRunningIds = tempRunningIds;
                    tempRunningIds.clear();
                    maxSum = potentialSum;
                }
                lastAddition = 0;
            }*/


            Stack<Item> groupedItems = GroupedItemsUnderLimit(itemsList);
            aGroup.addAll(groupedItems);
            for(int i = 0; i < aGroup.size(); i++) {
                for(int j = 0; j < itemsList.size(); j++) {
                    if(aGroup.get(i).GetRunningId() == itemsList.get(j).GetRunningId()) {
                        itemsList.remove(j);
                        break;
                    }
                }
            }

            // now handle the B group
            groupedItems = GroupedItemsUnderLimit(itemsList);
            if(groupedItems.size() > 0) {
                bGroup.addAll(groupedItems);
                for(int i = 0; i < bGroup.size(); i++) {
                    for(int j = 0; j < itemsList.size(); j++) {
                        if(bGroup.get(i).GetRunningId() == itemsList.get(j).GetRunningId()) {
                            itemsList.remove(j);
                            break;
                        }
                    }
                }
            }

            // now handle c group
            groupedItems = GroupedItemsUnderLimit(itemsList);
            if(groupedItems.size() > 0) {
                cGroup.addAll(groupedItems);
                for(int i = 0; i < cGroup.size(); i++) {
                    for(int j = 0; j < itemsList.size(); j++) {
                        if(cGroup.get(i).GetRunningId() == itemsList.get(j).GetRunningId()) {
                            itemsList.remove(j);
                            break;
                        }
                    }
                }
            }

            //int index = itemsList.size() - 1;
            /*int index = 0;
            //while(index >= 0) {
            while (index < itemsList.size()) {
                if ((widthSum + itemsList.get(index).GetWidth() <= 1100) && (weightSum + itemsList.get(index).GetWeight() <= 1000)) {
                    if (!aGroupFinish)
                        aGroup.add(itemsList.get(index));
                    else if (!bGroupFinish)
                        bGroup.add(itemsList.get(index));
                    else
                        cGroup.add(itemsList.get(index));
                    widthSum += itemsList.get(index).GetWidth();
                    weightSum += itemsList.get(index).GetWeight();
                    index++;
                } else {
                    if (!aGroupFinish) {
                        widthSum = 0;
                        weightSum = 0;
                        aGroupFinish = true;
                    } else if (!bGroupFinish) {
                        widthSum = 0;
                        weightSum = 0;
                        bGroupFinish = true;
                    } else if (!cGroupFinish) {
                        widthSum = 0;
                        weightSum = 0;
                        cGroupFinish = true;
                    }

                }
            }*/

            /*for (int i = 0; i < itemsList.size(); i++) {
                System.out.println("Running Id: " + itemsList.get(i).runningId
                        + " ,Width: " + itemsList.get(i).width + " , Weight: " + itemsList.get(i).weight);
            }*/


            // print A Group, B Group, C Group
            String aGroupStr = "A:";
            if (aGroup.size() > 0) {
                for (int i = 0; i < aGroup.size(); i++) {
                    if (i < aGroup.size() - 1) {
                        aGroupStr += aGroup.get(i).GetRunningId() + ", ";
                    } else {
                        aGroupStr += aGroup.get(i).GetRunningId();
                    }
                }
            }

            String bGroupStr = "B:";
            if (bGroup.size() > 0) {
                for (int i = 0; i < bGroup.size(); i++) {
                    if (i < bGroup.size() - 1) {
                        bGroupStr += bGroup.get(i).GetRunningId() + ", ";
                    } else {
                        bGroupStr += bGroup.get(i).GetRunningId();
                    }
                }
            }

            String cGroupStr = "C:";
            if (cGroup.size() > 0) {
                for (int i = 0; i < cGroup.size(); i++) {
                    if (i < cGroup.size() - 1) {
                        cGroupStr += cGroup.get(i).GetRunningId() + ", ";
                    } else {
                        cGroupStr += cGroup.get(i).GetRunningId();
                    }
                }
            }

            System.out.println(aGroupStr);
            System.out.println(bGroupStr);
            System.out.println(cGroupStr);

        } catch (Exception e) {
            e.printStackTrace();
        }


        //=============================================
        // Additional In Progress Coding Example Tests
        //=============================================

        //int B[] = {1,3,2,5,4,7,8,9,13,12,11,10};
        //Arrays.sort(B);
        //PrintArray(B);
        //System.out.println(BinarySearch(B, 4));

        //int stocksPrices[] = {10, 9, 8, 7, 6, 5};
        //System.out.println(GetMaxProfit(stocksPrices));

/*        //int arr[] = {0, 10, 2, -10, -20};
        int arr[] = {1, 2, 3, 3, 5, 4, 2, 6, -12, -14, -34, 0, 33, 55 };
        int arr_size = arr.length;
        int missing = findMissing(arr, arr_size);
        System.out.println("The smallest positive missing number is "+
                missing);*/

        //int A[] = {1, 50, 50, 50, 1};
        //System.out.println(solution2(A));

    }

    private static Stack<Item> GroupedItemsUnderLimit(ArrayList<Item> itemsList) {
        if(itemsList.size() == 0)
            return new Stack<>();
        int maxWidthSum = 0;
        int maxWeightSum = 0;
        int potentialWidthSum;
        int potentialWeightSum;
        int lastWidthAddition = 0;
        int lastWeightAddition = 0;
        Stack<Item> includedRunningIds = new Stack<>();
        Stack<Item> tempRunningIds = new Stack<>();
        for(int i = 0; i < itemsList.size(); i++) {
            potentialWidthSum = itemsList.get(i).GetWidth();
            potentialWeightSum = itemsList.get(i).GetWeight();
            tempRunningIds.add(itemsList.get(i));
            for(int j = 0; j < itemsList.size(); j++) {
                if(i != j) {
                    if(potentialWidthSum + itemsList.get(j).GetWidth() < 1100 &&
                            potentialWeightSum + itemsList.get(j).GetWeight() < 1000) {
                        potentialWidthSum += itemsList.get(j).GetWidth();
                        potentialWeightSum += itemsList.get(j).GetWeight();
                        lastWidthAddition = itemsList.get(j).GetWidth();
                        lastWeightAddition = itemsList.get(j).GetWeight();
                        tempRunningIds.add(itemsList.get(j));
                    } else if(potentialWidthSum + itemsList.get(j).GetWidth() == 1100 ||
                            potentialWeightSum + itemsList.get(j).GetWidth() == 1100) {
                        // done, no need to add anything
                        potentialWidthSum += itemsList.get(j).GetWidth();
                        potentialWeightSum += itemsList.get(j).GetWeight();
                        tempRunningIds.add(itemsList.get(j));
                    } else {
                        if(lastWidthAddition != 0 || lastWeightAddition != 0) {
                            potentialWidthSum -= lastWidthAddition;
                            potentialWeightSum -= lastWeightAddition;
                            tempRunningIds.pop();
                        }
                    }
                }
            }
            if(potentialWidthSum > maxWidthSum) {
                includedRunningIds = new Stack<>();
                for(int k = 0; k < tempRunningIds.size(); k++) {
                    includedRunningIds.push(tempRunningIds.get(k));
                }
                tempRunningIds.clear();
                maxWidthSum = potentialWidthSum;
                maxWeightSum = potentialWeightSum;
            }
            lastWidthAddition = 0;
            lastWeightAddition = 0;
        }
        return includedRunningIds;
    }


    private static int maxSubArraySum(ArrayList<Item> items)
    {
        int size = items.size();
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + items.get(i).GetWidth();
            if (max_so_far < max_ending_here && max_ending_here < 1100)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    // https://stackoverflow.com/questions/19628775/maximum-array-sum-with-limit
    private static int MaxUnderLimit (ArrayList<Item> items, int n) {
        int sum=0,ans=0,p1=0,p2=0;
        while (p2<n) {
            sum+=items.get(p2).GetWidth();
            p2++;
            while (sum>=1100 && p1<p2) {
                sum-=items.get(p1).GetWidth();
                p1++;
            }
            ans = Math.max(ans, sum);
        }
        while (p1<n) {
            sum-=items.get(p1).GetWidth();
            p1++;
            if (sum<=1100) ans=Math.max(ans,sum);
        }
        return ans;
    }


    public static int maximumSum(ArrayList<Item> array, int t){
        int maxSum = 0;
        int curSum = 0;
        int start = 0;
        int end = 0;
        while(start < array.size()){

            if(curSum > maxSum && curSum <= t){
                maxSum = curSum;
            }
            if(curSum <= t && end < array.size()){
                curSum += array.get(end).GetWidth();
                end += 1;

            }
            else{
                curSum -= array.get(start).GetWidth();
                start+= 1;
            }
        }
        return maxSum;
    }


    public static int KnapSackDynamic(int val[], int wt[], int W) {
        int N = wt.length; // Get the total number of items. Could be wt.length or val.length. Doesn't matter
        int[][] V = new int[N + 1][W + 1]; //Create a matrix. Items are in rows and weight at in columns +1 on each side
        //What if the knapsack's capacity is 0 - Set all columns at row 0 to be 0
        for (int col = 0; col <= W; col++) {
            V[0][col] = 0;
        }
        //What if there are no items at home.  Fill the first row with 0
        for (int row = 0; row <= N; row++) {
            V[row][0] = 0;
        }
        for (int item=1;item<=N;item++){
            //Let's fill the values row by row
            for (int weight=1;weight<=W;weight++){
                //Is the current items weight less than or equal to running weight
                if (wt[item-1]<=weight){
                    //Given a weight, check if the value of the current item + value of the item that we could afford with the remaining weight
                    //is greater than the value without the current item itself
                    V[item][weight]=Math.max (val[item-1]+V[item-1][weight-wt[item-1]], V[item-1][weight]);
                }
                else {
                    //If the current item's weight is more than the running weight, just carry forward the value without the current item
                    V[item][weight]=V[item-1][weight];
                }
            }
        }
        //Printing the matrix
        for (int[] rows : V) {
            for (int col : rows) {
                System.out.format("%5d", col);
            }
            System.out.println();
        }
        return V[N][W];
    }



    private static int Knapsack(int mWeight, int mWidth, ArrayList<Item> arr, int n) {
        // base case
        if(n == 0 || mWeight == 0)
            return 0;
        if(arr.get(n - 1).GetWeight() > mWeight ||
                arr.get(n - 1).GetWidth() > mWidth)
            return Knapsack(mWeight, mWidth, arr, n - 1);
        else
        {
            int lWeight = arr.get(n - 1).GetWeight();
            int maxWeight = Math.max(lWeight + Knapsack(mWeight - arr.get(n-1).GetWeight(), mWidth, arr, n -1),
                    Knapsack(mWeight, mWidth, arr, n-1));

            System.out.println("Max Weight for n= " + n + " items is: " + maxWeight);
            return maxWeight;
        }
    }

    private static int SumModuleWidth(ArrayList<Item> items) {
        int sum = 0;
        for(int i = 0; i < items.size(); i++) {
            sum += items.get(i).GetWidth();
        }
        return sum;
    }

    private static int SumModuleWeight(ArrayList<Item> items) {
        int sum = 0;
        for(int i = 0; i < items.size(); i++) {
            sum += items.get(i).GetWeight();
        }
        return sum;
    }

    private static class Item {
        private final int runningId;
        private final int width;
        private final int weight;

        public int GetWidth() {
            return width;
        }

        public int GetWeight() {
            return weight;
        }

        public int GetRunningId() {
            return runningId;
        }

        private Item(String str) throws Exception {
            String[] splitStr = str.split(" ");
            if(splitStr.length != 3) {
                throw new Exception("Item input is in wrong format.  Please enter in the format RunningId Width Weight");
            }
            this.runningId = Integer.parseInt(splitStr[0]);
            this.width = Integer.parseInt(splitStr[1]);
            this.weight = Integer.parseInt(splitStr[2]);
        }
    }

    private static class ItemComparator implements Comparator<Item> {

        @Override
        public int compare(Item o1, Item o2) {


            if(o1.GetWidth() > o2.GetWidth())
                return -1;
            else if(o1.GetWidth() < o2.GetWidth())
                return 1;
            else { // widths are equal, compare weights
                if(o1.GetWeight() > o2.GetWeight())
                    return -1;
                else if(o1.GetWeight() < o2.GetWeight())
                    return 1;
                else { // widths and weights are the same, return lowest Running Id
                    if(o1.GetRunningId() > o2.GetRunningId())
                        return -1;
                    else
                        return 1;
                }
            }

            /*if (o1.GetWidth() != o2.GetWidth())
                return Math.min(o1.GetWidth(), o2.GetWidth());
            else if (o1.GetWeight() != o2.GetWeight())
                return Math.min(o1.GetWeight(), o2.GetWeight());
            else {
                return Math.min(o1.GetRunningId(), o2.GetRunningId());
            }*/
        }







            /*
            // First compare the widths, return highest width
            if(o1.GetWidth() > o2.GetWidth())
                return o1.GetWidth();
            else if(o1.GetWidth() < o2.GetWidth())
                return o2.GetWidth();
            else { // if widths are equal, compare weight
                // Compare weights, return highest weight
                if(o1.GetWeight() > o2.GetWeight())
                    return o1.GetWeight();
                else if(o1.GetWeight() < o2.GetWeight())
                    return o2.GetWeight();
                else { // if width and weight are the same, sort by running Id
                    if(o1.GetRunningId() < o2.GetRunningId())
                        return o1.GetRunningId();
                    else
                        return o2.GetRunningId();
                }
            }
        }*/
    }

    // http://www.geeksforgeeks.org/check-whether-binary-tree-full-binary-tree-not/
    static class BTNode {
        //int data;
        BTNode left, right;
        public BTNode() {
            left = right = null;
        }
    }

    // http://www.geeksforgeeks.org/check-whether-binary-tree-full-binary-tree-not/
    private static boolean IsFullBinaryTree(com.company.Main.BTNode node) {
        // empty tree
        if(node == null)
            return true;
        // child nodes are both null, therefore a full tree
        if(node.left == null && node.right == null)
            return true;
        // if both child nodes are not null, recursively check them
        if(node.left != null && node.right != null)
            return (IsFullBinaryTree(node.left) && IsFullBinaryTree(node.right));
        // if none work, you don't have a full tree
        return false;
    }

    // Returns true if two rectangles (l1, r1) and (l2, r2)  do not overlap
    // If rectangles are touching but not overlapping, that is not considered an overlap
    // https://stackoverflow.com/questions/23302698/java-check-if-two-rectangles-overlap-at-any-point
    private static boolean NoOverlap(Point2D l1, Point2D r1, Point2D l2, Point2D r2) {
        return ((l2.getX() >= r1.getX()) ||
                (l2.getY() >= r1.getY()) ||
                (l1.getX() >= r2.getX()) ||
                (l1.getY() >= r2.getX()));
    }

    static class Graph {
        private int V;   // No. of vertices
        private LinkedList[] adj; //Adjacency Lists

        // Constructor
        Graph(int v)
        {
            V = v;
            adj = new LinkedList[v];
            for (int i=0; i<v; ++i)
                adj[i] = new LinkedList();
        }

        // Function to add an edge into the graph
        void addEdge(int v,int w)
        {
            adj[v].add(w);
        }

        // prints BFS traversal from a given source s
        void BFS(int s)
        {
            // Mark all the vertices as not visited(By default
            // set as false)
            boolean visited[] = new boolean[V];

            // Create a queue for BFS
            LinkedList<Integer> queue = new LinkedList<Integer>();

            // Mark the current node as visited and enqueue it
            visited[s]=true;
            queue.add(s);

            while (queue.size() != 0)
            {
                // Dequeue a vertex from queue and print it
                s = queue.poll();
                System.out.print(s+" ");

                // Get all adjacent vertices of the dequeued vertex s
                // If a adjacent has not been visited, then mark it
                // visited and enqueue it
                for (Integer n : (Iterable<Integer>) adj[s]) {
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }


    // Dijkstra Solution from
    // http://www.geeksforgeeks.org/greedy-algorithms-set-6-dijkstras-shortest-path-algorithm/
    private static final int V = 9;
    private static void PrintDijkstraSolution(int dist[], int n) {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i+" tt "+dist[i]);
    }

    private static int MinDistance(int dist[], Boolean sptSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;

        for (int v = 0; v < V; v++)
            if (!sptSet[v] && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    // Funtion that implements Dijkstra's single source shortest path
    // algorithm for a graph represented using adjacency matrix
    // representation
    static void dijkstra(int graph[][], int src)
    {
        int dist[] = new int[V]; // The output array. dist[i] will hold
        // the shortest distance from src to i

        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];

        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < V-1; count++)
        {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = MinDistance(dist, sptSet);

            // Mark the picked vertex as processed
            sptSet[u] = true;

            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < V; v++)

                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (!sptSet[v] && graph[u][v]!=0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u]+graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }

        // print the constructed distance array
        PrintDijkstraSolution(dist, V);
    }





    private static int OddOccurencesInArray(int[] A) {
        int result = 0;
        for (int aA : A) {
            result ^= aA;
        }
        return result;
    }

    private static int StoneWall(int H[], int N) {
        Stack<Integer> activeWallHeights = new Stack<>();
        int numBlocks = 0;
        for(int i = 0; i < H.length; i++) {
            while(!activeWallHeights.empty()
                    && activeWallHeights.peek() > H[i]) // The next wall height is lower than the top of the stack, pop the stack until all higher blocks are gone
                activeWallHeights.pop();
            if(activeWallHeights.empty()) { // if empty stack, push new wall height and increment count of blocks
                activeWallHeights.push(H[i]);
                numBlocks++;
            } else if(!activeWallHeights.empty()
                    && activeWallHeights.peek() != H[i]) { // if not empty and new height, push and increment
                activeWallHeights.push(H[i]);
                numBlocks++;
            }
        }
        return numBlocks;
    }

    private static int GetMaxProfit(int[] stocksPrices) {
        int maxDiff = 0;
        for (int i = 0; i < stocksPrices.length - 1; i++) {
            int j = i + 1;
            while (j < stocksPrices.length) {
                if (stocksPrices[j] - stocksPrices[i] > 0) {
                    if (stocksPrices[j] - stocksPrices[i] > maxDiff)
                        maxDiff = stocksPrices[j] - stocksPrices[i];
                }
                j++;
            }
        }
        return maxDiff;
    }

    private static void PrintArray(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    // https://stackoverflow.com/questions/25661519/find-the-number-of-divisors-for-a-number-in-range
    private static int CountDiv(int A, int B, int K) {
        int b = B / K;
        int a = (A > 0 ? (A - 1) / K : 0);
        if (A == 0) {
            b++;
        }
        return b - a;
    }

    private static int Distinct(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        return set.size();
    }


    private static int MaxProductOfThree(int[] A, int N) throws Exception {
        //if(N < 3)
        //    return 0;
        Arrays.sort(A);

        if (A[0] * A[1] < 0)
            return Math.max(A[0] * A[1] * A[N - 1], A[N - 3] * A[N - 2] * A[N - 1]);
        else
            return Math.max(A[0] * A[1] * A[N - 1], A[N - 1] * A[N - 2] * A[N - 3]);
    }

    private static int PassingCars(int A[], int N) {
        int count = 0; // the return value
        int increment = 0; // the count of zeros
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) // hold onto zeros.
                increment++;
            else if (A[i] == 1) // Whenever you encounter a one, it will cross all previous zeros.
                count += increment;
            if (count > 1000000000) return -1; // handle condition if count is too big.
        }
        return count;
    }

    private static int MinAvgTwoSlice(int A[]) {
        double minAvg = Double.MAX_VALUE;
        int returnIndex = 0;
        for (int i = 0; i < A.length - 1; i++) {
            double avg = (A[i] + A[i + 1]) / 2.0;

            if (i < A.length - 2) {
                double threeAvg = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
                avg = Math.min(avg, threeAvg);
            }
            if (avg < minAvg) {
                minAvg = avg;
                returnIndex = i;
            }
        }
        return returnIndex;
    }

    private static int BinarySearch(int A[], int target) throws Exception {
        return BinarySearch(A, target, 0, A.length - 1);
    }

    private static int BinarySearch(int A[], int target, int lower, int upper) throws Exception {
        int center, range;
        range = upper - lower;
        if (range < 0)
            throw new Exception("Limits Reversed!");
        range = upper - lower;
        if (range == 0 && A[lower] != target)
            throw new Exception("Element not in array");
        if (A[lower] > A[upper])
            throw new Exception("Array not sorted");
        center = ((range) / 2) + lower;
        if (target == A[center])
            return center;
        else if (target < A[center])
            return BinarySearch(A, target, lower, center - 1);
        else
            return BinarySearch(A, target, center + 1, upper);
    }

    private static void BubbleSort(int A[]) {
        for(int i = 0; i < A.length - 1; i++) {
            for(int j = 0; j < A.length - i - 1; j++) {
                if(A[j] > A[j + 1]) Swap(A, j, j+1);
            }
        }
    }

    private static void Swap(int A[], int i, int j) {
        int temp = A[j];
        A[j] = A[i];
        A[i] = temp;
    }

    private static int Triangle(int[] A, int N) {

        if (A.length < 3) return 0;
        Arrays.sort(A);
        for (int i = 2; i < A.length; i++) {
            if ((long) A[i - 2] + (long) A[i - 1] > (long) A[i]) return 1;
        }
        return 0;
    }

    private static int[] MaxCounters(int N, int[] A) {
        int countersArray[] = new int[N];
        int maxCounter = 0;
        int lastUpdate = 0;
        for (int m = 0; m < A.length; m++) {
            if (A[m] == N + 1) {
                lastUpdate = maxCounter;
            } else if (A[m] >= 1 && A[m] <= A.length) {
                int val = A[m];
                if (countersArray[val - 1] < lastUpdate)
                    countersArray[val - 1] = lastUpdate + 1;
                else
                    countersArray[val - 1]++;

                if (countersArray[val - 1] > maxCounter)
                    maxCounter = countersArray[val - 1];
            }
        }

        for (int iii = 0; iii < N; iii++)
            if (countersArray[iii] < lastUpdate)
                countersArray[iii] = lastUpdate;

        return countersArray;
    }

    private static int FrogRiverOne(int x, int[] a, int n) {

        // add all required numbers to set
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= x; i++) {
            set.add(i);
        }

        for (int i = 0; i < a.length; i++) {
            // if set contains number, remove it
            if (set.contains(a[i])) set.remove(a[i]);
            // set is now empty, you have all the leaves in position and may cross the river
            if (set.size() == 0) return i;
        }
        return -1;
    }

    private static int PermCheck(int[] a) {
        HashSet<Integer> distincts = new HashSet<Integer>();
        int max = Integer.MIN_VALUE;

        for (int anA : a) {
            if (distincts.contains(anA)) return 0;
            distincts.add(anA);
            if (anA > max) max = anA;
        }
        return distincts.size() == max ? 1 : 0;
    }

    private static int FrogJmp(int x, int y, int d) {
        return Double.valueOf(Math.ceil((y - x) / (double) d)).intValue();
    }

    // Incomplete ---
    /*private static int TapeEqilibrium(int[] a) {
        int prefixSum = 0;
        int suffixSum = 0;
        int i = 0;
        for(int j = 1; i < a.length; i++) {
            if(j < i) prefixSum += a[j];
            else if(j > i) suffixSum += a[j];
            j++;
        }
        return 1;

    }*/

    // https://codereview.stackexchange.com/questions/47471/perm-missing-elem-100-functional-score-but-only-60-performance
    // https://en.wikipedia.org/wiki/1_%2B_2_%2B_3_%2B_4_%2B_%E2%8B%AF
    static int PermMissingElem(int[] A) {
        long N = A.length + 1;
        long total = N * (N + 1) / 2;

        for (int i : A) {

            total -= i;
        }
        return (int) total;
    }

    // Note: I did not get a perfect score on this
    static int CodilityExamQ1(String E, String L) {
        // Get Hours and Mins of Enter Time using SubString
        String enterHrs = E.substring(0, E.indexOf(':'));
        String enterMins = E.substring(E.indexOf(":") + 1);

        // Get Hours and Mins of Exit Time using SubString
        String exitHrs = L.substring(0, E.indexOf(':'));
        String exitMins = L.substring(E.indexOf(":") + 1);

        // Get Difference of Hours and Mins
        int hrsDiff = Integer.parseInt(exitHrs) - Integer.parseInt(enterHrs);
        int minsDiff = Integer.parseInt(exitMins) - Integer.parseInt(enterMins);

        // Entrance cost is 2
        int cost = 2;

        // if stayed for at least one hour, add cost of 3.
        if (hrsDiff >= 1 || minsDiff >= 0) {
            cost += 3;
            hrsDiff -= 1; // remove one hour from hrsDiff for the upcoming while loop
        }

        while (hrsDiff > 0) { // add cost 4 for each remaining hour, remove one hour each iteration
            cost += 4;
            hrsDiff--;
        }
        if (minsDiff > 0) cost += 4; // for remaining positive minutes, add cost of 4

        return cost; // final cost
    }

    static int[] CyclicRotation(int A[], int k) {
        if (A.length == 0) return A;
        if (k == 0) return A;
        for (int i = 0; i < k; i++) {
            A = RotateOnce(A);
        }
        return A;
    }

    private static int[] RotateOnce(int[] A) {
        if (A.length == 1) return A;
        int store = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            Replace(A, i);
        }
        A[0] = store;
        return A;
    }

    private static void Replace(int A[], int i) {
        A[i + 1] = A[i];
    }

    static int BinaryGap(int N) {
        String binString = Integer.toBinaryString(N);
        if (!binString.contains("0")) return 0;
        int maxCount = 0;
        int currCount = 0;
        for (int i = 0; i < binString.length(); i++) {
            if (binString.charAt(i) == '0') {
                currCount++;
            } else {
                if (currCount > maxCount) maxCount = currCount;
                currCount = 0;
            }
        }
        return maxCount;
    }

    /*static int BinaryGap(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (!HasPairNeighbor(i, A, A.length)) return A[i];
        }
        return -1;

    }*/

    /*static boolean HasPairNeighbor(int indexPos, int[] A, int arrLen) {
        if (arrLen == 1) return false;
        if (arrLen == 2) return A[0] == A[1];
        if (arrLen >= 3) {
            if (indexPos == 0) {
                return A[indexPos] == A[indexPos + 1];
            } else if (indexPos == (arrLen - 1)) {
                return A[indexPos] == A[indexPos - 1];
            } else {
                return A[indexPos] == A[indexPos - 1] || A[indexPos] == A[indexPos + 1];
            }
        } else {
            return false;
        }
    }*/

    static int MissingInteger(int[] A) {
        // write your code in Java SE 8
        int missingInt = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        while (set.contains(missingInt)) {
            missingInt++;
        }
        return missingInt;
    }

    /* Utility function that puts all non-positive
       (0 and negative) numbers on left side of
       arr[] and return count of such numbers */
    static int segregate(int arr[], int size) {
        int j = 0, i;
        for (i = 0; i < size; i++) {
            if (arr[i] <= 0) {
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // increment count of non-positive
                // integers
                j++;
            }
        }

        return j;
    }

    /* Find the smallest positive missing
       number in an array that contains
       all positive integers */
    static int findMissingPositive(int arr[], int size) {
        int i;

        // Mark arr[i] as visited by making
        // arr[arr[i] - 1] negative. Note that
        // 1 is subtracted because index start
        // from 0 and positive numbers start from 1
        for (i = 0; i < size; i++) {
            if (Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
        }

        // Return the first index value at which
        // is positive
        for (i = 0; i < size; i++)
            if (arr[i] > 0)
                return i + 1;  // 1 is added becuase indexes
        // start from 0

        return size + 1;
    }

    /* Find the smallest positive missing
       number in an array that contains
       both positive and negative integers */
    static int findMissing(int arr[], int size) {
        // First separate positive and
        // negative numbers
        int shift = segregate(arr, size);
        int arr2[] = new int[size - shift];
        int j = 0;
        for (int i = shift; i < size; i++) {
            arr2[j] = arr[i];
            j++;
        }
        // Shift the array and call
        // findMissingPositive for
        // positive part
        return findMissingPositive(arr2, j);
    }

    static int solution2(int A[]) {
        Arrays.sort(A);
        int candidate = A[0];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (candidate == A[i]) {
                count++;
            }
        }
        if (2 * count > A.length) {
            return candidate;
        } else {
            return -1;
        }
    }

    static int solution(int A[], int N) {
        // return 3 for [3,2,-5,1]
        long sum_prefix = 0;
        long sum_suffix = 0;
        int i, j;
        for (i = 0; i < N; i++) {
            // Check if is is the equilibrium point
            sum_prefix = 0;
            for (j = 0; j < i; j++) {
                sum_prefix += A[j];
            }
            sum_suffix = 0;
            for (j = i + 1; j < N; j++) {
                sum_suffix += A[j];
                // Compute suffix sum
            }
            if (sum_prefix == sum_suffix)
                return i;
        }
        return -1;
    }

    /*  Class LLNode  */
    static class LLNode {
        protected int data;
        protected LLNode link;

        /*  Constructor  */
        public LLNode() {
            link = null;
            data = 0;
        }

        /*  Constructor  */
        public LLNode(int d, LLNode n) {
            data = d;
            link = n;
        }

        /*  Function to set link to next LLNode  */
        public void setLink(LLNode n) {
            link = n;
        }

        /*  Function to set data to current LLNode  */
        public void setData(int d) {
            data = d;
        }

        /*  Function to get link to next node  */
        public LLNode getLink() {
            return link;
        }

        /*  Function to get data from current LLNode  */
        public int getData() {
            return data;
        }
    }

    /* Class linkedList */
    static class linkedList {
        protected LLNode start;
        protected LLNode end;
        public int size;

        /*  Constructor  */
        public linkedList() {
            start = null;
            end = null;
            size = 0;
        }

        /*  Function to check if list is empty  */
        public boolean isEmpty() {
            return start == null;
        }

        /*  Function to get size of list  */
        public int getSize() {
            return size;
        }

        /*  Function to insert an element at begining  */
        public void insertAtStart(int val) {
            LLNode nptr = new LLNode(val, null);
            size++;
            if (start == null) {
                start = nptr;
                end = start;
            } else {
                nptr.setLink(start);
                start = nptr;
            }
        }

        /*  Function to insert an element at end  */
        public void insertAtEnd(int val) {
            LLNode nptr = new LLNode(val, null);
            size++;
            if (start == null) {
                start = nptr;
                end = start;
            } else {
                end.setLink(nptr);
                end = nptr;
            }
        }

        /*  Function to insert an element at position  */
        public void insertAtPos(int val, int pos) {
            LLNode nptr = new LLNode(val, null);
            LLNode ptr = start;
            pos = pos - 1;
            for (int i = 1; i < size; i++) {
                if (i == pos) {
                    LLNode tmp = ptr.getLink();
                    ptr.setLink(nptr);
                    nptr.setLink(tmp);
                    break;
                }
                ptr = ptr.getLink();
            }
            size++;
        }

        /*  Function to delete an element at position  */
        public void deleteAtPos(int pos) {
            if (pos == 1) {
                start = start.getLink();
                size--;
                return;
            }
            if (pos == size) {
                LLNode s = start;
                LLNode t = start;
                while (s != end) {
                    t = s;
                    s = s.getLink();
                }
                end = t;
                end.setLink(null);
                size--;
                return;
            }
            LLNode ptr = start;
            pos = pos - 1;
            for (int i = 1; i < size - 1; i++) {
                if (i == pos) {
                    LLNode tmp = ptr.getLink();
                    tmp = tmp.getLink();
                    ptr.setLink(tmp);
                    break;
                }
                ptr = ptr.getLink();
            }
            size--;
        }

        /*  Function to display elements  */
        public void display() {
            System.out.print("\nSingly Linked List = ");
            if (size == 0) {
                System.out.print("empty\n");
                return;
            }
            if (start.getLink() == null) {
                System.out.println(start.getData());
                return;
            }
            LLNode ptr = start;
            System.out.print(start.getData() + "->");
            ptr = start.getLink();
            while (ptr.getLink() != null) {
                System.out.print(ptr.getData() + "->");
                ptr = ptr.getLink();
            }
            System.out.print(ptr.getData() + "\n");
        }
    }
}
