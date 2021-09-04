class Class {
    public static void main(String[] args) {
        Person tanaka = new Person("Tanaka");
        // tanaka.SetName("Tanaka");
        tanaka.SetAge(26);

        Person suzuki = new Person("Suzuki");
        // suzuki.SetName("Suzuki");
        suzuki.SetAge(32);

        System.out.println(tanaka.GetName());
        System.out.println(tanaka.GetAge());
        System.out.println(suzuki.GetName());
        System.out.println(suzuki.GetAge());

        Member sato = new Member("Sato", 46);
        sato.SetNumber(4);

        System.out.println(sato.GetName());
        System.out.println(sato.GetAge());
        System.out.println(sato.GetNumber());

        if (sato instanceof Member) {
            System.out.println("sato is instance of Member.");
        }

        if (sato instanceof Person) {
            System.out.println("sato is instance of Person.");
        }
    }
}

class Member extends Person {
    int myNumbers;

    Member(String name, int age) {
        super(name);
        super.SetAge(age);
    }

    public void SetNumber(int number) {
        myNumbers = number;
    }

    public int GetNumber() {
        return myNumbers;
    }
}

class Person {
    String myName;
    int myAge;

    Person(String name) {
        myName = name;
    }

    public void SetName(String name) {
        myName = name;
    }

    public String GetName() {
        return myName;
    }

    public void SetAge(int age) {
        myAge = age;
    }

    public int GetAge() {
        return myAge;
    }
}