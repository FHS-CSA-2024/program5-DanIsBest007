//import stuff here?

//Your code here
class Program5
{
    static double calculateMPG(int miles, int gallons) // calculates MPG from miles and gallons
    {
        return Math.round(((double)miles / gallons) * 10.0) / 10.0; // rounds to the nearest 10th
    }
    
    public static void main(String[] args)
    {
        int royaleMiles = 286;
        int royaleGallons = 9;
        int koopaMiles = 412;
        int koopaGallons = 40;
        int pipeMiles = 361;
        int pipeGallons = 18;
        int badwagonMiles = 161;
        int badwagonGallons = 11;
        
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println("Royale averaged " + calculateMPG(royaleMiles, royaleGallons) + " m/g");
        System.out.println("Koopa King averaged " + calculateMPG(koopaMiles, koopaGallons) + " m/g");
        System.out.println("Pipe Frame averaged " + calculateMPG(pipeMiles, pipeGallons) + " m/g");
        System.out.println("Badwagon averaged " + calculateMPG(badwagonMiles, badwagonGallons) + " m/g");
    }
}


//Paste console output below:
/*
    Mushroom Cup Prix Racer Average Miles/Per Gallon:
    Royale averaged 31.8 m/g
    Koopa King averaged 10.3 m/g
    Pipe Frame averaged 20.1 m/g
    Badwagon averaged 14.6 m/g

*/
