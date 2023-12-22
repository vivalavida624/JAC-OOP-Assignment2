package Assignment02.Part1.Assignment02_2;

import Assignment02.Part1.Assignment02_2.pack01.WheeledTransportation;
import Assignment02.Part1.Assignment02_2.pack02.Train;
import Assignment02.Part1.Assignment02_2.pack02.Tram;
import Assignment02.Part1.Assignment02_2.pack03.Metro;
import Assignment02.Part1.Assignment02_2.pack04.Monowheel;
import Assignment02.Part1.Assignment02_2.pack05.Aircraft;
import Assignment02.Part1.Assignment02_2.pack05.WW2_Airplane;
import Assignment02.Part1.Assignment02_2.pack06.Ferry;

public class Demo {

    public static void main(String[] args) {

        WheeledTransportation wt = new WheeledTransportation(4,120);
        System.out.println(wt);
        WheeledTransportation wt1 = new WheeledTransportation(wt);
        System.out.println(wt1);

        Train train = new Train(4, 200, 20, "Montreal", "Toronto");
        System.out.println(train);
        Train train1 = new Train(train);
        System.out.println(train1);

        Metro metro = new Metro(4,200,20,"Montreal", "Toronto", 18);
        System.out.println(metro);
        Metro metro1 = new Metro(metro);
        System.out.println(metro1);

        Tram tram = new Tram(4,200,20,"Montreal", "Toronto", 18, 2019);
        System.out.println(tram);
        Tram tram1 = new Tram(tram);
        System.out.println(tram1);

        Monowheel monowheel = new Monowheel(3,150, 2000);
        System.out.println(monowheel);
        Monowheel monowheel1 = new Monowheel(monowheel);
        System.out.println(monowheel1);

        Ferry ferry = new Ferry(200, 300);
        System.out.println(ferry);
        Ferry ferry1 = new Ferry(ferry);
        System.out.println(ferry1);

        Aircraft aircraft = new Aircraft(20000, 18);
        System.out.println(aircraft);
        Aircraft aircraft1 = new Aircraft(aircraft);
        System.out.println(aircraft1);

        WW2_Airplane ww2_airplane = new WW2_Airplane(20000, 20, true);
        System.out.println(ww2_airplane);
        WW2_Airplane ww2_airplane1 = new WW2_Airplane(ww2_airplane);
        System.out.println(ww2_airplane1);

        Object[] array1 = {wt,wt1,train,train1,metro,metro1,tram,tram1,monowheel, monowheel1, ferry, ferry1, aircraft, aircraft1, ww2_airplane, ww2_airplane1};

        Object[] array2 = {wt,wt1,train,train1,metro,metro1,tram,tram1,monowheel, monowheel1, ferry, ferry1, ww2_airplane, ww2_airplane1};

        Object[] newArray1 = copyTheObjects(array1);
        Object[] newArray2 = copyTheObjects(array2);


    }

    public static Object[] copyTheObjects(Object[] originalArray){
        if(originalArray == null){
            return null;
        }

        Object[] newArray = new Object[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            if(originalArray[i] != null){
                newArray[i] = new Object();
            }
        }
        return newArray;
        }
}



