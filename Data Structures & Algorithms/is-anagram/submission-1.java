class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        

        for(char c : s.toCharArray()){
            if(map1.containsKey(c))
            map1.put(c,map1.get(c)+1);
            else
            map1.put(c,1);
        }

        for(char c : t.toCharArray()){
            if(map1.containsKey(c))
            map1.put(c,map1.get(c)-1);
            else
            map1.put(c,1);
        }

        boolean ans = true;

        List<Integer> list = new ArrayList<>(map1.values());

        for(Integer i : list){
            if(i!=0){
                ans = false;
            }
        }
        return ans;
    }
}
