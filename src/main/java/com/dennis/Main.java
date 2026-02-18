//Hejsan//

package com.dennis;

import com.dennis.access.Film;
import com.dennis.exception.DuKanInteDelaMedNoll;
import com.dennis.exception.Math;

public class Main {
    void main() throws DuKanInteDelaMedNoll {

        Math.divide(6,3);

        try {
            IO.print("Skriv ett tal: ");
            int tal_1 = Integer.parseInt(IO.readln());
            IO.print("Skriv in ett nytt tal: ");
            int tal_2 = Integer.parseInt(IO.readln());
            IO.println("tal_1 + tal_2 = " + Math.divide(tal_1,tal_2));

        }

            catch (ArithmeticException e) {
                IO.println("Du kan inte dela med 0");
        }

            catch (NumberFormatException e){
                IO.println("Bara heltal!");
        }

            catch (DuKanInteDelaMedNoll e){
                IO.println(e.getMessage());
            }

//            catch(Exception e){
//            IO.println("Nåt gick åt skogen");
//        }
    }
}
