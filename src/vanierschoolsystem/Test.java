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

/**
 * A Test Class
 * @author Chilka Castro
// */
public class Test implements Serializable {
    public static void main(String[] args) {
        VanierSchoolSystem.initData();
        System.out.println("\t\tUSERS");
        System.out.println(VanierSchoolSystem.users);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\tSTUDENTS");
        System.out.println(VanierSchoolSystem.students);
        System.out.println("");
        System.out.println("");
        System.out.println("\t\tCOURSES");
        System.out.println(VanierSchoolSystem.courses);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\tTEACHERS");
        System.out.println(VanierSchoolSystem.teachers);
    }   
}
