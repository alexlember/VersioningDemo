package org.ea;

import entities.User;

/**
 * Versioning demo created by Daniel Persson
 */
public class VersioningDemo {
    public static void main(String args[]) {
        User user = new User();
        user.setName("Alexey");
        System.out.println("Hello explorers.");
        System.out.println("user: " + user);
        System.out.println();
        System.out.println("This program is running version "+
                VersioningDemo.class.getPackage().getImplementationVersion());
    }
}
