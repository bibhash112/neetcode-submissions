class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> imap = new HashMap<>();
        for(int num : nums){
            imap.put(num,imap.getOrDefault(num,0)+1);
        }
        class Pair{
            int num;
            int frequency;

            Pair(int num, int frequency){
                this.num=num;
                this.frequency=frequency;
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.frequency-a.frequency);


        for(Map.Entry<Integer,Integer> entry : imap.entrySet()){
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            pq.add(pair);
        }
        int[] ans = new int[k];
        for(int i = 0; i<k; i++){
            ans[i]=(pq.poll().num);
        }
        return ans;
    }
}
