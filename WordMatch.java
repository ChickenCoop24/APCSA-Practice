public class WordMatch {
    private String secret;

    public WordMatch(String word){
        secret = word;
    }

    public int scoreGuess(String g){
        int count = 0;
        int index = secret.indexOf(g);
        String secret1 = secret;
        while(index > -1){ // +1
            count++; // +1
            secret1= secret1.substring(index); // +1 +1
            index = secret1.indexOf(g);
        }
        return count*g.length()*g.length(); //+1
    }

    public String findBetterGuess(String str1, String str2){
        if(scoreGuess(str1) > scoreGuess(str2)){ //+1 +1
            return str1;
        }else if(scoreGuess(str1) == scoreGuess(str2)){
            if(str1.compareTo(str2)>0){ // +1
                return str2;
            }else{
                return str1;
            }
        }
        return str2; //+1
    }
}
