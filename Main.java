package com.company;
import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
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
        Point2D l2 = new Point2D(2, 2), r2 = new Point2D(5, 5);
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


        System.out.println("\n\n\nStock Prices");
        int stocksPrices[] = {4, 13, 0, 12, 6, 5};
        System.out.println(GetMaxProfit(stocksPrices));

        System.out.println("\nLinked List Testing");
        MyLinkedList myList = new MyLinkedList();
        myList.PushBack(0);
        myList.PushBack(1);
        myList.PushBack(2);
        myList.Remove(2);
        myList.Remove(1);
        myList.Remove(0);
        myList.Print();

        System.out.println("\nBrackets");
        String brackets1 = "()[][]";
        if(Brackets(brackets1) == 1) System.out.println("The String: " + brackets1 + " is nested");
        else System.out.println("The String: " + brackets1 + " is not nested");

        String brackets2 = "([])";
        if(Brackets(brackets2) == 1) System.out.println("The String: " + brackets2 + " is nested");
        else System.out.println("The String: " + brackets2 + " is not nested");

        String brackets3 = ")(";
        if(Brackets(brackets3) == 1) System.out.println("The String: " + brackets3 + " is nested");
        else System.out.println("The String: " + brackets3 + " is not nested");

        System.out.println("\nNesting");
        String nesting1 = "(()(())())";
        String nesting2 = "())";
        if(Nesting(nesting1) == 1)
            System.out.println("The String: " + nesting1 + " is nested.");
        else
            System.out.println("The String: " + nesting1 + " is not nested.");

        if(Nesting(nesting2) == 1)
            System.out.println("The String: " + nesting2 + " is nested.");
        else
            System.out.println("The String: " + nesting2 + " is not nested.");






        //LogisticsProblem();

        //=============================================
        // Additional In Progress Coding Example Tests
        //=============================================

/*      //int arr[] = {0, 10, 2, -10, -20};
        int arr[] = {1, 2, 3, 3, 5, 4, 2, 6, -12, -14, -34, 0, 33, 55 };
        int arr_size = arr.length;
        int missing = findMissing(arr, arr_size);
        System.out.println("The smallest positive missing number is "+
                missing);*/

        //int A[] = {1, 50, 50, 50, 1};
        //System.out.println(solution2(A));

    }

    // https://codility.com/programmers/lessons/7-stacks_and_queues/nesting/
    private static int Nesting(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
            }
            else if(s.charAt(i) == ')') {
                count --;
            }
            if(count < 0) return 0;
        }
        if(count == 0) return 1;
        else return 0;
    }


    /*
    * Read from Left to Right
    * As you see an opening brace, add to Stack
    * As you find closing brace, check the top of the stack
    * If the top of the stack has a corresponding opening brace, pop from the stack
    * Keep going until you reach the end.
    * If the Stack is not empty by the end of the traversal, you return 0
    * Otherwise, return 1
    */
    private static int Brackets(String s) {
        if(s.length() == 0) return 1;
        Stack<Character> stack = new Stack();
        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i) == ')' && stack.empty())  ||
                    (s.charAt(i) == ']' && stack.empty()) ||
                    (s.charAt(i) == '}' && stack.empty())) {
                return 0;
            }
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else if(s.charAt(i) == ')' && stack.peek() ==  '(') {
                stack.pop();
            } else if(s.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
            } else if(s.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
            }
        }
        if(stack.size() == 0) return 1;
        else return 0;
    }

    /*private static int Nesting(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')
                count++;
            else if(s.charAt(i) == ')')
                count--;
            else {
                System.out.println("String s contains characters other than ( or )");
                return -1;
            }
        }
        if(count == rightParenCount) return 1;
        else return 0;
    }*/

    private static void LogisticsProblem() {
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

            // Rules:
            // Width: Items must be aligned side by side.  Up to 1100mm of space allowed per module.
            // Weight: Items must be less than or equal to 1000 kg per module.
            // First fill A, then B, then C

            // This function sorts the items into the order I want before I process their widths and weights later
            Collections.sort(itemsList, new Comparator<Item>() {
                @Override
                public int compare(Item o1, Item o2) {
                    int comp1 = Integer.compare(o1.GetWidth(), o2.GetWidth());
                    if (comp1 == 1) {
                        return -1;
                    } else if (comp1 == -1) {
                        return 1;
                    } else {
                        int weightComp = Integer.compare(o1.GetWeight(), o2.GetWeight());
                        if (weightComp == 1)
                            return -1;
                        else if (weightComp == -1)
                            return 1;
                        return weightComp;
                    }
                }
            });

            // now try to place them into modules starting with A, then B, then C
            ArrayList<Item> aGroup = new ArrayList<>();
            ArrayList<Item> bGroup = new ArrayList<>();
            ArrayList<Item> cGroup = new ArrayList<>();

            // Items are grouped into A here using this function
            // They are then removed from itemsList as they have already been processed
            Stack<Item> groupedItems = GroupedItemsUnderLimit(itemsList);
            aGroup.addAll(groupedItems);
            for (int i = 0; i < aGroup.size(); i++) {
                for (int j = 0; j < itemsList.size(); j++) {
                    if (aGroup.get(i).GetRunningId() == itemsList.get(j).GetRunningId()) {
                        itemsList.remove(j);
                        break;
                    }
                }
            }

            // now handle the B group the same as before but with a smaller itemsList
            groupedItems = GroupedItemsUnderLimit(itemsList);
            if (groupedItems.size() > 0) {
                bGroup.addAll(groupedItems);
                for (int i = 0; i < bGroup.size(); i++) {
                    for (int j = 0; j < itemsList.size(); j++) {
                        if (bGroup.get(i).GetRunningId() == itemsList.get(j).GetRunningId()) {
                            itemsList.remove(j);
                            break;
                        }
                    }
                }
            }

            // now handle c group same as A and B
            groupedItems = GroupedItemsUnderLimit(itemsList);
            if (groupedItems.size() > 0) {
                cGroup.addAll(groupedItems);
                for (int i = 0; i < cGroup.size(); i++) {
                    for (int j = 0; j < itemsList.size(); j++) {
                        if (cGroup.get(i).GetRunningId() == itemsList.get(j).GetRunningId()) {
                            itemsList.remove(j);
                            break;
                        }
                    }
                }
            }

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
    }

    // This function returns a Stack object with Items placed into a module as best as I vcan
    // I'll admit, this function is O(N)^2, it's not very efficient and may fail with large
    // inputs.  I wish I would have made a better function here to look at all the items in
    // itemsList and find the best combination that is below the width and weight thresholds.
    private static Stack<Item> GroupedItemsUnderLimit(ArrayList<Item> itemsList) {
        final int MAX_WIDTH = 1100;
        final int MAX_WEIGHT = 1000;
        if (itemsList.size() == 0)
            return new Stack<>();
        int maxWidthSum = 0;
        int maxWeightSum = 0;
        int potentialWidthSum;
        int potentialWeightSum;
        int lastWidthAddition = 0;
        int lastWeightAddition = 0;
        Stack<Item> includedRunningIds = new Stack<>(); // this is the return value
        Stack<Item> tempRunningIds = new Stack<>(); // temp list of Items I want to collect together
        for (int i = 0; i < itemsList.size(); i++) {
            potentialWidthSum = itemsList.get(i).GetWidth();
            potentialWeightSum = itemsList.get(i).GetWeight();
            tempRunningIds.add(itemsList.get(i));
            for (int j = 0; j < itemsList.size(); j++) {
                if (i != j) {
                    // As long as we are below the threshold, add them to the width and weight sum values
                    // and store the Items we have looked as so far
                    if (potentialWidthSum + itemsList.get(j).GetWidth() < MAX_WIDTH &&
                            potentialWeightSum + itemsList.get(j).GetWeight() < MAX_WEIGHT) {
                        potentialWidthSum += itemsList.get(j).GetWidth();
                        potentialWeightSum += itemsList.get(j).GetWeight();
                        lastWidthAddition = itemsList.get(j).GetWidth();
                        lastWeightAddition = itemsList.get(j).GetWeight();
                        tempRunningIds.add(itemsList.get(j));
                    }
                    // If we have met the width or weight thresholds, not need to record the
                    // variables lastWidthAddition or lastWeightAddition
                    else if (potentialWidthSum + itemsList.get(j).GetWidth() == MAX_WIDTH ||
                            potentialWeightSum + itemsList.get(j).GetWeight() == MAX_WEIGHT) {
                        potentialWidthSum += itemsList.get(j).GetWidth();
                        potentialWeightSum += itemsList.get(j).GetWeight();
                        tempRunningIds.add(itemsList.get(j));
                    }
                    // Check the j value, if we are at the end of the array, no need to deduct the width
                    // and weight sums
                    else {
                        if ((j < itemsList.size() - 1) && (lastWidthAddition != 0 || lastWeightAddition != 0)) {
                            potentialWidthSum -= lastWidthAddition;
                            potentialWeightSum -= lastWeightAddition;
                            tempRunningIds.pop();
                        }
                    }
                }
            }
            // Do we have a new width sum?  If so, let's record these values.
            if (potentialWidthSum > maxWidthSum) {
                includedRunningIds = new Stack<>();
                for (int k = 0; k < tempRunningIds.size(); k++) {
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

    // This is the class for Item
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
            if (splitStr.length != 3) {
                throw new Exception("Item input is in wrong format.  Please enter in the format RunningId Width Weight");
            }
            this.runningId = Integer.parseInt(splitStr[0]);
            this.width = Integer.parseInt(splitStr[1]);
            this.weight = Integer.parseInt(splitStr[2]);
        }
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
        if (node == null)
            return true;
        // child nodes are both null, therefore a full tree
        if (node.left == null && node.right == null)
            return true;
        // if both child nodes are not null, recursively check them
        if (node.left != null && node.right != null)
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
        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        // Function to add an edge into the graph
        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        // prints BFS traversal from a given source s
        void BFS(int s) {
            // Mark all the vertices as not visited(By default
            // set as false)
            boolean visited[] = new boolean[V];

            // Create a queue for BFS
            LinkedList<Integer> queue = new LinkedList<Integer>();

            // Mark the current node as visited and enqueue it
            visited[s] = true;
            queue.add(s);

            while (queue.size() != 0) {
                // Dequeue a vertex from queue and print it
                s = queue.poll();
                System.out.print(s + " ");

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
            System.out.println(i + " tt " + dist[i]);
    }

    private static int MinDistance(int dist[], Boolean sptSet[]) {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (!sptSet[v] && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    // Funtion that implements Dijkstra's single source shortest path
    // algorithm for a graph represented using adjacency matrix
    // representation
    static void dijkstra(int graph[][], int src) {
        int dist[] = new int[V]; // The output array. dist[i] will hold
        // the shortest distance from src to i

        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];

        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
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
                if (!sptSet[v] && graph[u][v] != 0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u] + graph[u][v] < dist[v])
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
        for (int i = 0; i < H.length; i++) {
            while (!activeWallHeights.empty()
                    && activeWallHeights.peek() > H[i]) // The next wall height is lower than the top of the stack, pop the stack until all higher blocks are gone
                activeWallHeights.pop();
            if (activeWallHeights.empty()) { // if empty stack, push new wall height and increment count of blocks
                activeWallHeights.push(H[i]);
                numBlocks++;
            } else if (!activeWallHeights.empty()
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
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) Swap(A, j, j + 1);
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

        for (int i = 0; i < A.length; i++) {
            total -= A[i];
        }
        return (int) total;
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


    // Implementing a Linked List

    // Node Class
    static class MyLLNode {
        private int data;
        private MyLLNode link;

        // Default Constructor
        public MyLLNode() {
            data = 0;
            link = null;
        }

        public MyLLNode(int data, MyLLNode link) {
            this.data = data;
            this.link = link;
        }

        public void SetLink(MyLLNode link) {
            this.link = link;
        }

        public int GetData() {
            return this.data;
        }

        public void SetData(int data) {
            this.data = data;
        }

        public MyLLNode GetLink() {
            return this.link;
        }
    }

    static class MyLinkedList {
        private MyLLNode start;
        //private int size;

        public int Size() {
            //if(start == null) return 0;
            // TODO Fix this later
            return 1;
            //return size;
        }

        public MyLinkedList() {
            this.start = null;
            //this.size = 0;
        }

        public boolean IsEmpty() {
            return start == null;
        }

        public void Print() {
            if (start == null) {
                System.out.println("Singly Linked List is empty");
                return;
            }
            System.out.print("\nSingly Linked List = ");
            if (start.GetLink() == null) {
                System.out.println(start.GetData());
                return;
            }
            MyLLNode ptr;
            System.out.print(start.GetData() + "->");
            ptr = start.GetLink();
            while (ptr.GetLink() != null) {
                System.out.print(ptr.GetData() + "->");
                ptr = ptr.GetLink();
            }
            System.out.print(ptr.GetData() + "\n");
        }

        void PushFront(int val) {
            MyLLNode newNode = new MyLLNode(val, null);
            if (start == null)
                start = newNode;
            else {
                newNode.SetLink(start);
                start = newNode;
            }
        }

        void PushBack(int val) {
            MyLLNode newNode = new MyLLNode(val, null);
            if (start == null)
                start = newNode; // the start is the new node
            else if (start.GetLink() == null) {
                start.SetLink(newNode); // attach newNode to the end of start
            } else {
                MyLLNode ptr = start.GetLink(); // iterate through all the nodes until the end and set the link
                while (ptr.GetLink() != null)
                    ptr = ptr.GetLink();
                ptr.SetLink(newNode);
            }
        }

        // Note: This array is zero-indexed.
        void Insert(int val, int pos) {
            if (pos == 0) {
                PushFront(val);
            } else {
                try {
                    MyLLNode newNode = new MyLLNode(val, null);
                    MyLLNode ptr = start;
                    int i = 1;
                    while(i <= pos) {
                        if(i == pos) {
                            MyLLNode tmp = ptr.GetLink();
                            ptr.SetLink(newNode);
                            newNode.SetLink(tmp);
                            break;
                        }
                        i++;
                        ptr = ptr.GetLink();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        // Note: This array is zero-indexed.
        void Remove(int pos) {
            try {
                if(pos == 0)
                    start = start.GetLink();
                else {
                    MyLLNode ptr = start;
                    int i = 1;
                    while(i <= pos) {
                        if(i == pos) {
                            MyLLNode tmp = ptr.GetLink();
                            tmp = tmp.GetLink();
                            ptr.SetLink(tmp);
                            break;
                        }
                        i++;
                        ptr = ptr.GetLink();
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
