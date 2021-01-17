class Number18{    
    public static void main(String[] args) {    
        String sentence = "Cherries are so sweet!"; 
        int count = Vowels(sentence);   
         System.out.println(count); 
        }    
          
    public static int Vowels(String sentence){
      int count = 0;    
         
        for(int c = 0; c < sentence.length(); c++) {    
            if(sentence.charAt(c) == 'a' || sentence.charAt(c) == 'e' || sentence.charAt(c) == 'i' || sentence.charAt(c) == 'o' || sentence.charAt(c) == 'u') 
              count++;   
              }    
          return count;
    } 
}     