public class Main{
    public static void main(String[] args) throws InterruptedException{
        String[] personInfo = new String[6];
        Address address = new Address("yourCity", "yourZipCode", "yourStreet", personInfo);
        Person person = new Person("yourName", "yourAge", address, "yourCpf", personInfo);
        for(int i = 5; i >= 0; --i){
            System.out.println(personInfo[i]);
            Thread.sleep(2500);
        }
    }
}