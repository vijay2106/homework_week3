package homework_week3_kamlesh;



public class Person_Pro14 {

        String firstName;
        String lastName;
        int age;

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            if (age < 0 && age > 100) {
                this.age = 0;
            } else {
                this.age = age;
            }
        }

        public boolean isTeen() {
            if (age > 12 && age < 20) {
                return true;
            } else {
                return false;
            }
        }

        public String getFullName() {
            if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
                return "";
            }

            if (this.firstName.isEmpty()) {
                return this.lastName;
            }

            if (this.lastName.isEmpty()) {
                return this.firstName;
            }

            return this.firstName + this.lastName;
        }

        public static void main(String[] args) {
            Person_Pro14 person = new Person_Pro14();
            person.setFirstName(""); // firstName is set to empty string
            person.setLastName(""); // lastName is set to empty string
            person.setAge(10);
            System.out.println("fullName= " + person.getFullName());
            System.out.println("teen= " + person.isTeen());
            person.setFirstName("John"); // firstName is set to John
            person.setAge(18);
            System.out.println("fullName= " + person.getFullName());
            System.out.println("teen= " + person.isTeen());
            person.setLastName("Smith"); // lastName is set to Smith
            System.out.println("fullName= " + person.getFullName());
        }
    }

