
public class Pair<T, V> {

    T n1;
    V n2;

    public Pair(T n1, V n2){
        this.n1 = n1;
        this.n2 = n2;

    }



    void getFirst(){
        System.out.println("First element: "+ n1);
    }
    void getSecond(){
        System.out.println("Second element: "+ n2);
    }
    void setFirst(T first){
        n1=first;
        System.out.println("New First element: "+ n1);
    }
    void setSecond(V second){
        n2=second;
        System.out.println("New Second element: "+ n2);
    }
    
}