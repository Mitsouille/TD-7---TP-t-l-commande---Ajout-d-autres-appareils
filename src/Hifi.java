public class Hifi {
    int son = 0;

    public void allumer(){
        this.son += 10;

        //Son max
        if(this.son>100)
            this.son = 100;
    }

    public void eteindre(){
        this.son = 0;
    }

    public String toString(){
        String r = "";
        r += "Hifi : " + son;
        return r;
    }
}
