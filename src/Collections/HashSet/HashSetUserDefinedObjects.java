package Collections.HashSet;

import java.util.HashSet;

public class HashSetUserDefinedObjects {

    public static void main(String a[]){

        HashSet<gifts> lhm = new HashSet<>();
        lhm.add(new gifts("Dhrumil", 4));
        lhm.add(new gifts("Prit", 6));
        lhm.add(new gifts("Prashil", 6));
        lhm.add(new gifts("Priya", 5));
        lhm.add(new gifts("Hiral", 5));
        lhm.add(new gifts("Dharmil", 5));
        lhm.add(new gifts("Sidharth", 4));
        lhm.add(new gifts("Smruti", 10));
        lhm.add(new gifts("Kevin", 5));
        lhm.add(new gifts("Viken", 5));
        lhm.add(new gifts("Shweta", 5));
        lhm.add(new gifts("Dhaval", 4));
        lhm.add(new gifts("Soham", 5));

        for(gifts pr:lhm){
            System.out.println(pr);
        }
    }

}

class gifts {
    private String giftPersonName;
    private int relationProximity;

    //relationProximity should be in range of 1 to 5

    public gifts(String giftName, int relation){
        this.giftPersonName = giftName;
        this.relationProximity = relation;
    }

    public int hashCode(){
//        System.out.println("In hashcode");
        int hashcode = relationProximity*3;
        hashcode += giftPersonName.hashCode();
        return hashcode;
    }

    public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof gifts) {
            gifts pp = (gifts) obj;
            return (pp.giftPersonName.equals(this.giftPersonName) && pp.relationProximity == this.relationProximity);
        } else {
            return false;
        }
    }

    public String computeCost(int relationProximity) {
        if(relationProximity> 5){
            return "any amount";
        }
       return Integer.toString(relationProximity * 3) + "$s";
    }

    public String getGiftPersonName() {
        return giftPersonName;
    }
    public void setGiftPersonName(String giftPersonName) {
        this.giftPersonName = giftPersonName;
    }
    public int getRelationProximity() {
        return relationProximity;
    }
    public void setRelationProximity(int relationProximity) {
        this.relationProximity = relationProximity;
    }

    public String toString(){
        return "Gift for: "+ giftPersonName  + " can be of " + computeCost(this.relationProximity);
    }
}