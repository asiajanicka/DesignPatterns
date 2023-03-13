package org.example.builder;

public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    private Customer(){
    }

    public static Builder builder(){
        return new Customer().new Builder();
    }

    public class Builder{

        public Builder setFirstName(String name){
            Customer.this.firstName = name;
            return this;
        }

        public Builder setLastName(String name){
            Customer.this.lastName = name;
            return this;
        }

        public Builder setAge (int age){
            Customer.this.age = age;
            return this;
        }

        public Builder setCity (String city){
            Customer.this.city = city;
            return this;
        }

        public Customer build(){
            return Customer.this;
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
