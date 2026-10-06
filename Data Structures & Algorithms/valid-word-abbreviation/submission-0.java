class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i=0,
        j=0;
        while(i<word.length() && j<abbr.length()){
            char a_w = word.charAt(i),
                b_ab = abbr.charAt(j);

                 if(Character.isDigit(b_ab)){
                    if(b_ab =='0'){
                        return false;
                    }
                    int current =0;
                    while(j<abbr.length() && Character.isDigit(abbr.charAt(j))){
                            current=current*10+(abbr.charAt(j)-'0');
                            j++;
                    }
                    i=i+current;
                }else{
                        if(a_w != b_ab){
                            return false;
                                     }
                        else{
                              i=i+1;
                              j=j+1;
                        }
                }
        }
        return i==word.length() && j==abbr.length();
    }
    }
