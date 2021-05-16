/*
 * The MIT License
 *
 * Copyright 2021 Chilka Castro .
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package vanierschoolsystem;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Chilka Castro
 */
public abstract class User implements Serializable {
    protected String userId;
    protected String fname;
    protected String lname;
    protected String password;

    /**
     * A constructor with two data members
     * @param fname the first name of the user
     * @param lname the last name of the user
     */
    public User(String fname, String lname) {
        this.userId = "";
        this.fname = toCamelCase(fname);
        this.lname = toCamelCase(lname);
        this.password = "1234";
    }

    /**
     * A copy constructor
     * @param user the user to copy
     */
    public User(User user) {
        this.userId = user.userId;
        this.fname = user.fname;
        this.lname = user.lname;
        this.password = user.password;
    }

    /**
     * To convert a String to camel case
     * @param str the String to be converted
     * @return a converted String
     */
    protected final String toCamelCase(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
    }

    /**
     * Creates a hash code for a user
     * @return a hash code value
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.userId);
        return hash;
    }

    /**
     * Checks if two object are the same or not
     * @param obj the object to be compared with
     * @return True if both are the same and False if not
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.userId, other.userId)) {
            return false;
        }
        return true;
    }

    /**
     * Creates a String that represents a user
     * @return the string that represents a users
     */
    @Override
    public String toString() {
        String str = "";

        str += String.format("%-20s : %s\n", "UserID", userId);
        str += String.format("%-20s : %s %s\n", "Name", toCamelCase(fname), toCamelCase(lname));

        return str;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = toCamelCase(fname);
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = toCamelCase(lname);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
