class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n = outer.size();
            for(int i = 0;i<n;i++){
                ArrayList<Integer> temp = new ArrayList<>(outer.get(i));
                temp.add(num);
                outer.add(temp);
            }
        }return outer;
    }
}