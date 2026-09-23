class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(map.containsKey(sorted)){
                map.get(sorted).add(str);
            }
            else{
                List<String> list = new ArrayList();
                list.add(str);
                map.put(sorted,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
