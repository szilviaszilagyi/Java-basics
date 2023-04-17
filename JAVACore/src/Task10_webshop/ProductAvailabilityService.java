package Task10_webshop;

import java.util.Random;

/** Adja vissza, hogy az adott termék van-e raktáron.*/
public class ProductAvailabilityService {
     public boolean getAvaible(){
          Random random = new Random();
          int result = random.nextInt(4);
          if(result==0){
               return false;
          }else{
               return true;
          }
     }

     }
