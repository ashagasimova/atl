package Family;

public class Pet{
    private String name;
    private int age;
    private String gender;
    private String color;

    public Pet(){
    }

    public Pet(String name, int age, String gender, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void eat(){
        System.out.println("eating");
    }
}

