public class Main{

     public static void main(String []args){
         String str1 = "Xa-vi";
         String str2 = "Da-ni";
         int qtyOfDashesFirst = 0;
         int qtyOfDashesSecond = 0;
         int verifier = 1;
         
         int firstWordSize = str1.length();
         int secondWordSize = str2.length();
         for(int i =0; i < firstWordSize; i++){
            if (str1.charAt(i) =='-'){
                qtyOfDashesFirst++;
                }
            }
            
        for(int i =0; i< secondWordSize; i++){
            if (str2.charAt(i) == '-' ){
                qtyOfDashesSecond++;
                }
            }
        if (qtyOfDashesFirst != qtyOfDashesSecond){   
            verifier += 100;
                
            }
            
            if (firstWordSize >= secondWordSize){
                for (int i = 0; i <str2.length();i++)
                {
                    if (str1.charAt(i) != str2.charAt(i) && str2.charAt(i)=='-'){
                        verifier += 100;
                        }
                }
            
                }
                else {
                for (int i = 0; i< str1.length(); i++){
                    if (str1.charAt(i) != str2.charAt(i) && str1.charAt(i)=='-'){
                        verifier += 100;
                    }
                
                }
            }
            
            
         
         
        System.out.println(verifier);
     }
}
