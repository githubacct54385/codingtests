//http://www.geeksforgeeks.org/stock-buy-sell/

// The cost of a stock on each day is given in an array,
// find the max profit that you can make by buying and selling
// in those days. For example, if the given array is 
// {100, 180, 260, 310, 40, 535, 695}, 
// the maximum profit can earned by buying on day 0, 
// selling on day 3. Again buy on day 4 and sell on day 6. 
// If the given array of prices is sorted in decreasing order, 
// then profit cannot be earned at all.

function FindMaxProfit(stockPrices, n) {
    if(n == 1) {
        print("Must contain at least 2 elements.");
    }
    var i = 0;
    var count = 0;
    while(i < n - 1) {
        // Find local min
        var localMin = -1;
        var localMax = -1;
        while((i < n - 1) && stockPrices[i + 1] <= stockPrices[i]) {
            i++;
        }
        
        // we have traversed the whole array, no further solution available
        if(i == n - 1) {
            break;
        }
        // find the local max
        localMin = i++;
        
        while((i < n) && stockPrices[i] >= stockPrices[i - 1]) {
            i++;
        }
        localMax = i - 1;
        
        // if the local values have been populated, print them
        if(localMin >= 0 && localMax >= 0) {
            count++;
            print("Buy: " + localMin + " Sell: " + localMax);
        }
    }
    // if count is zero, no day is a good day to buy stock.
    if(count == 0) {
        print("There is no day when buying stock will yeild a profit.");
    }
}

var stockPrices = [100, 180, 260, 310, 40, 535, 695];
var n = stockPrices.length;

FindMaxProfit(stockPrices, n);
