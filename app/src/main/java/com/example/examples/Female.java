package com.example.examples;

public class Female extends Human {


        private int hands;

        public Female(int hands){
            super("Sally");
            this.hands = hands;
        }

    public Integer gather() {
        Integer itemsGathered;

        itemsGathered = 3;

        return itemsGathered;
    }

    
        
        
        public int gethands(){return hands;}

}
