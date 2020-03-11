package com.samples;

public class defangIpaddress {

        public void defangIPaddr(String address) {

            System.out.println(address.replace(".", "[.]"));
        }
        public static void main(String[] args){
            defangIpaddress t = new defangIpaddress();
            t.defangIPaddr("1.1.1.1");
        }
    }

