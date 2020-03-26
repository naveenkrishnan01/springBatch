package com.samples.DataStruct;

import java.util.*;
import java.io.*;

public class LinkedList {

    Node node;  // head of the list

    static class Node {

        int data;
        Node next;


        // constructor

        Node(int d) {
            data = d;
            next = null;

        }

    }
}