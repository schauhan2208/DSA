class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        String sSort = new String(sChar);
        String tSort = new String(tChar);

        if(sSort.equals(tSort)){
            return true;
        }
        return false;
    }   
}
