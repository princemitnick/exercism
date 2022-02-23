class AnnalynsInfiltration {

    public static void main(String... args) throws UnsupportedOperationException{
        //boolean knightIsAwake = true;
        //System.out.println(AnnalynsInfiltration.canFastAttack(knightIsAwake));
        //System.out.println();

        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        System.out.println(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
        System.out.println();


        /*
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        System.out.println(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake,prisonerIsAwake));
        */

        /*
        boolean knightISAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDoIsPresent = true;

        System.out.println(AnnalynsInfiltration.canFreePrisoner(knightISAwake,archerIsAwake,prisonerIsAwake, petDoIsPresent));

         */
    }

    public static boolean canFastAttack(boolean knightIsAwake) {
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
        if(knightIsAwake){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
        if ( knightIsAwake || archerIsAwake || prisonerIsAwake){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
        if ( !archerIsAwake && prisonerIsAwake){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
        if (((knightIsAwake || prisonerIsAwake) || !(knightIsAwake || prisonerIsAwake) ) && (!archerIsAwake && petDogIsPresent) ){
            return true;
        }
        if ((!petDogIsPresent && prisonerIsAwake) && (!knightIsAwake && !archerIsAwake)){
            return true;
        }
        else{
            return false;
        }
    }
}
