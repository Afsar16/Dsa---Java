package Z_OOC;
// Encapsulation is the mechanism of wrapping the data (variables) and code acting on the data (methods) together as a
// single unit. In encapsulation, the variables of a class are hidden from other classes and can only be accessed through
// the methods of their current class.

class Person {
        // Private variables
        private String name;
        private int age;

        // Getter method for name
        public String getName() {
            return name;
        }

        // Setter method for name
        public void setName(String newName) {
            name = newName;
        }

        // Getter method for age
        public int getAge() {
            return age;
        }

        // Setter method for age
        public void setAge(int newAge) {
            age = newAge;
        }
    }

    public class _2Encapsulation {
        public static void main(String[] args) {
            Person person = new Person();
            person.setName("Alice");
//            person.name = "alice"; // not possible bcoz its encapsulated (it will run only when we remove private feild
            person.setAge(30);

            System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        }
    }


