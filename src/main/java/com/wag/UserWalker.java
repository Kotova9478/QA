package com.wag;

public class UserWalker {

        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String address;
        private String apt;
        private String phoneNumber;
        private String incorrectEmail;


        public UserWalker(){
            firstName = "Bob";
            lastName = "Blacker";
            email = "walker@gmail.com";
            password = "L333";
            address = "123 s";
            apt = "1";
            phoneNumber = "3334567890";
            incorrectEmail = "323344354";
        }

        public String getFirstName() {
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }

        public String getEmail() {
            return email;
        }

        public String getAddress() {
            return address;
        }

        public String getApt() {return apt;}

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getPassword(){return password;}

        public String getIncorrectEmail() {
            return incorrectEmail;
        }
    }


