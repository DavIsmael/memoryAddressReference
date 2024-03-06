public class Person {
    private String name;
    private String age;
    private String cpf;
    private Address address;
    public Person(String name, String age, Address address, String cpf, String[] personInfo){
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.address = address;
        personInfo[5] = this.name;
        personInfo[4] = this.age;
        personInfo[3] = this.cpf;
    }
}