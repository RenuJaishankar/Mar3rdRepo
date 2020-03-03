package Lab;

public class Practice {
    //this method will return a specific value that we can test for using asserEquals
    public int doesStuff(int x,int y){
        return (x+y) *x;
    }
    //this method will throw an Exception and we can test for this using aseertThrows
    //our test will
    public void throwStuff() throws Exception{
            int x = 3;
            throw new Exception();

        }

    public String checkstring(String a){
        return a;
    }

    public void throwNewException() throws Exception{
        int y=2;
        throw new Exception();

    }

    }

