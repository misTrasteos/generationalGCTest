//JAVA_OPTIONS -XX:+UseSerialGC -Xlog:gc*
//JAVA_OPTIONS -XX:-UseAdaptiveSizePolicy
//JAVA_OPTIONS -Xms32m -Xmx32m 
//JAVA_OPTIONS -XX:NewSize=10m -XX:SurvivorRatio=3

public class GenerationalGCTest {
    public static void main(String... args) throws Exception {

        java.util.List<String> references = new java.util.ArrayList<String>();

        int size = (int)(1024 * 1024 * 0.9);
        java.util.Random random = new java.util.Random();

        while( true ){
            Thread.sleep( 1_000 );

            byte[] randomBytes = new byte[size];

            random.nextBytes( randomBytes );

            if( random.nextInt() % 4 == 0)
                references.add( new String(randomBytes) );

        }//while

    }//main

}//class
