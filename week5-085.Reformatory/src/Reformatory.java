public class Reformatory {
    private int totalWeightsMeasured = 0;
    
    public int weight(Person person) {
        // return the weight of the person
        this.totalWeightsMeasured++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        // adds 1 to the weight of the person
        person.setWeight(person.getWeight() + 1); 
    } 
    
    public int totalWeightsMeasured() {
        return this.totalWeightsMeasured;
    }
}
