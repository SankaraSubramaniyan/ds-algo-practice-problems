class LetterComination {
    public List<String> letterCombinations(String digits) {
        
        if (digits.length() == 0)
            return new ArrayList<>();
        
        List<String> result = new ArrayList<>();
        String[] map = new String[]{
            "","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        
        dfs(digits, result, map, new StringBuilder(), 0);
        
        return result;
    }
    
    public void dfs(String digits, List<String> result, String[] map, StringBuilder sb, int index){
        if(index == digits.length()){
            result.add(sb.toString());
            return;
        }
        
        int digit = Character.getNumericValue(digits.charAt(index));
        String letters = map[digit];
        
        for(int l = 0; l<letters.length(); l++){
            sb.append(letters.charAt(l));
            dfs(digits, result, map, sb, index+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
