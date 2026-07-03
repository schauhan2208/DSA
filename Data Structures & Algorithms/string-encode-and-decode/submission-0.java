class Solution {

    public String encode(List<String> strs) {
        StringBuilder decodedString  = new StringBuilder();
        for(String str:  strs){
            decodedString.append(str.length()).append("#").append(str);
        }
        return decodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int index = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, index));
            i = index + 1;
            String s  = str.substring(i,i+length);
            decodedList.add(s);
            i += length;
        }
        return decodedList;

    }
}
