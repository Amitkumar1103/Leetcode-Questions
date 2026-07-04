class Solution {
    
    public int buyChoco(int[] prices, int money) {
        int first = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;

        for(int price:prices){
            if(price<first){
                sec=first;
                first = price;
            }else if (price<sec){
                sec = price;
            }
        }
        int cost = first + sec;
        if(cost<=money){
            return money-cost;
        }
        return money;

    }
}